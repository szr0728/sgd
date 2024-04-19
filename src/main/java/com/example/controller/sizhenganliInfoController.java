package com.example.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.example.common.Result;
import com.example.common.ResultCode;
import com.example.entity.sizhenganliInfo;
import com.example.dao.sizhenganliInfoDao;
import com.example.service.sizhenganliInfoService;
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.EchartsData;
import com.example.vo.sizhenganliInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.example.service.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import cn.hutool.core.util.StrUtil;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/sizhenganliInfo")
public class sizhenganliInfoController {

    @Resource
    private sizhenganliInfoService sizhenganliInfoService;
    @Resource
    private sizhenganliInfoDao sizhenganliInfoDao;

    @PostMapping
    public Result<sizhenganliInfo> add(@RequestBody sizhenganliInfoVo sizhenganliInfo) {

        //mixmajixami
        sizhenganliInfoService.add(sizhenganliInfo);
        return Result.success(sizhenganliInfo);
    }

    //youtixing1
    //youtixing2

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        sizhenganliInfoService.delete(id);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody sizhenganliInfoVo sizhenganliInfo) {
        sizhenganliInfoService.update(sizhenganliInfo);
        return Result.success();
    }

    //@PutMapping("/update2")
//    public Result update2(@RequestBody sizhenganliInfoVo sizhenganliInfo) {
//        sizhenganliInfoService.update2(sizhenganliInfo);
//        return Result.success();
//    }
    @GetMapping("/{id}")
    public Result<sizhenganliInfo> detail(@PathVariable Long id) {
        sizhenganliInfo sizhenganliInfo = sizhenganliInfoService.findById(id);
        return Result.success(sizhenganliInfo);
    }

    @GetMapping("/changeStatus/{id}")
    public Result<sizhenganliInfo> changeStatus(@PathVariable Long id) {
        sizhenganliInfoService.changeStatus(id);
        return Result.success();
    }

    @GetMapping
    public Result<List<sizhenganliInfoVo>> all() {
        return Result.success(sizhenganliInfoService.findAll());
    }

    @GetMapping("/page/{name}")
    public Result<PageInfo<sizhenganliInfoVo>> page(@PathVariable String name,
                                                      @RequestParam(defaultValue = "1") Integer pageNum,
                                                      @RequestParam(defaultValue = "5") Integer pageSize,
                                                      HttpServletRequest request) {
        return Result.success(sizhenganliInfoService.findPage(name, pageNum, pageSize, request));
    }

    @GetMapping("/pageqt/{name}")
    public Result<PageInfo<sizhenganliInfoVo>> pageqt(@PathVariable String name, @RequestParam String leibie,
                                                        @RequestParam(defaultValue = "1") Integer pageNum,
                                                        @RequestParam(defaultValue = "10") Integer pageSize,
                                                        HttpServletRequest request) {
        return Result.success(sizhenganliInfoService.findPageqt(name, leibie, pageNum, pageSize, request));
    }


    // @PostMapping("/register")
//    public Result<sizhenganliInfo> register(@RequestBody sizhenganliInfo sizhenganliInfo) {
//        if (StrUtil.isBlank(sizhenganliInfo.getName()) || StrUtil.isBlank(sizhenganliInfo.getPassword())) {
//            throw new CustomException(ResultCode.PARAM_ERROR);
//        }
//        return Result.success(sizhenganliInfoService.add(sizhenganliInfo));
//    }

    /**
     * 批量通过excel添加信息
     *
     * @param file excel文件
     * @throws IOException
     */
    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws IOException {

        List<sizhenganliInfo> infoList = ExcelUtil.getReader(file.getInputStream()).readAll(sizhenganliInfo.class);
        if (!CollectionUtil.isEmpty(infoList)) {
            // 处理一下空数据
            List<sizhenganliInfo> resultList = infoList.stream().filter(x -> ObjectUtil.isNotEmpty(x.getBiaoti())).collect(Collectors.toList());
            for (sizhenganliInfo info : resultList) {
                sizhenganliInfoService.add(info);
            }
        }
        return Result.success();
    }

    @GetMapping("/get/sizhenganli_tj_leibie")
    Result<List<EchartsData>> sizhenganli_tj_leibie() {
        List<EchartsData> list = new ArrayList<>();
        List<Map<String, Object>> sizhenganli_tj_leibieList = sizhenganliInfoDao.sizhenganli_tj_leibie();
        Map<String, Double> typeMap = new HashMap<>();
        for (Map<String, Object> map : sizhenganli_tj_leibieList) {

            typeMap.put((String) map.get("aa"), (Double.valueOf((String) map.get("bb").toString())));

        }
        getPieData("思政案例按类别统计", list, typeMap);
        getBarData("思政案例按类别统计", list, typeMap);
        return Result.success(list);
    }

    @GetMapping("/getExcelModel")
    public void getExcelModel(HttpServletResponse response) throws IOException {
        // 1. 生成excel
        Map<String, Object> row = new LinkedHashMap<>();
        row.put("biaoti", "A标题");
        row.put("leibie", "A类别");
        row.put("neirong", "A内容");
        row.put("shouyetupian", "A首页图片");
        row.put("zhaiyao", "A摘要");
        row.put("dianjilv", "A点击率");
        row.put("faburen", "A发布人");

        row.put("status", "是");
        row.put("level", "sizhenganli");

        List<Map<String, Object>> list = CollUtil.newArrayList(row);

        // 2. 写excel
        ExcelWriter writer = ExcelUtil.getWriter(true);
        writer.write(list, true);

        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=sizhenganliInfoModel.xlsx");

        ServletOutputStream out = response.getOutputStream();
        writer.flush(out, true);
        writer.close();
        IoUtil.close(System.out);
    }

    private void getPieData(String name, List<EchartsData> pieList, Map<String, Double> dataMap) {
        EchartsData pieData = new EchartsData();
        EchartsData.Series series = new EchartsData.Series();

        Map<String, String> titleMap = new HashMap<>(2);
        titleMap.put("text", name);
        pieData.setTitle(titleMap);

        series.setName(name + "比例");
        series.setType("pie");
        series.setRadius("55%");

        List<Object> objects = new ArrayList<>();
        List<Object> legendList = new ArrayList<>();
        for (String key : dataMap.keySet()) {
            Double value = dataMap.get(key);
            objects.add(new JSONObject().putOpt("name", key).putOpt("value", value));
            legendList.add(key);
        }
        series.setData(objects);

        pieData.setSeries(Collections.singletonList(series));
        Map<String, Boolean> map = new HashMap<>();
        map.put("show", true);
        pieData.setTooltip(map);

        Map<String, Object> legendMap = new HashMap<>(4);
        legendMap.put("orient", "vertical");
        legendMap.put("x", "left");
        legendMap.put("y", "center");
        legendMap.put("data", legendList);
        pieData.setLegend(legendMap);

        pieList.add(pieData);
    }

    private void getBarData(String name, List<EchartsData> barList, Map<String, Double> dataMap) {
        EchartsData barData = new EchartsData();
        EchartsData.Series series = new EchartsData.Series();

        List<Object> seriesObjs = new ArrayList<>();
        List<Object> xAxisObjs = new ArrayList<>();
        for (String key : dataMap.keySet()) {
            Double value = dataMap.get(key);
            xAxisObjs.add(key);
            seriesObjs.add(value);
        }

        series.setType("bar");
        series.setName(name);
        series.setData(seriesObjs);
        barData.setSeries(Collections.singletonList(series));

        Map<String, Object> xAxisMap = new HashMap<>(1);
        xAxisMap.put("data", xAxisObjs);
        barData.setxAxis(xAxisMap);

        barData.setyAxis(new HashMap<>());

        Map<String, Object> legendMap = new HashMap<>(1);
        legendMap.put("data", Collections.singletonList(name));
        barData.setLegend(legendMap);

        Map<String, Boolean> map = new HashMap<>(1);
        map.put("show", true);
        barData.setTooltip(map);

        Map<String, String> titleMap = new HashMap<>(1);
        titleMap.put("text", name);
        barData.setTitle(titleMap);

        barList.add(barData);
    }
}