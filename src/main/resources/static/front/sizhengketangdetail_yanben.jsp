<!DOCTYPE html>
<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1;charset=utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="renderer" content="webkit"/>
    <meta name="robots" content="index, follow"/>
    <link rel="stylesheet" type="text/css" href="qtimages/css/font-awesome.css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="qtimages/css/bootstrap.css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="qtimages/css/owl.carousel.css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="qtimages/css/magnific-popup.css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="qtimages/css/animate.css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="qtimages/css/settings.css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="qtimages/css/style-red.css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="qtimages/css/tk.css" media="screen"/>
    <script type="text/javascript" src="qtimages/js/jquery.min.js"></script>
    <script type="text/javascript" src="qtimages/js/jquery.migrate.js"></script>
    <script type="text/javascript" src="qtimages/js/bootstrap.js"></script>
    <script type="text/javascript" src="qtimages/js/owl.carousel.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#navigation #nav_0 .menu1").addClass("active");
        });
    </script>
    <link rel="stylesheet" href="./qtimages/sl_common_form.css">
    <title>多媒体</title>
</head>
<body>
<div id="wrapper">
    <div id="container">
        <script src="qttop.js"></script>
        <script src="bht.js"></script>
        <div id="content">

            <div class="section-content team-section2 no-padd" id="index-news">
                <div class="title-section title2">
                    <div class="container triggerAnimation animated" data-animate="bounceIn">
                        <h1>多媒体</h1>
                    </div>
                </div>
                <div class="team-box">
                    <div class="container">
                        <div class="row">
                            <div class="content-form">

                                <table width="100%" border="0" align="center" cellpadding="3" cellspacing="1"
                                       class="table table-striped table-bordered table-hover">
                                    <tr>
                                        <td width='11%'>课程编号：</td>
                                        <td width='39%'>{{sizhengketangInfo.kechengbianhao}}</td>
                                        <td width='11%'>课程名称：</td>
                                        <td width='39%'>{{sizhengketangInfo.kechengmingcheng}}</td>
                                    </tr>
                                    <tr>
                                        <td width='11%'>课程视频：</td>
                                        <td width='39%'>{{sizhengketangInfo.kechengshipin}}</td>
                                        <td width='11%'>课程简介：</td>
                                        <td width='39%'>{{sizhengketangInfo.kechengjianjie}}</td>
                                    </tr>
                                    <tr>
                                        <td colspan=4 align=center><input type=button name=Submit5 value=返回
                                                                          class='btn btn-primary'
                                                                          onClick="javascript:history.back()"/>
                                            <input type=button name=Submit52 value=打印 class='btn btn-primary'
                                                   onClick="javascript:window.print()"/> <!--jixaaxnnxiu-->
                                            <input type=button name=Submit52 value=收藏 class='btn btn-primary'
                                                   @click="collect()"/>
                                        </td>
                                    </tr>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <script src="sidebufen.js"></script>
        </div>
        <script src="qtdown.js"></script>
    </div>
    <script type="text/javascript" src="qtimages/js/jquery.magnific-popup.min.js"></script>
    <script type="text/javascript" src="qtimages/js/jquery.appear.js"></script>
    <script type="text/javascript" src="qtimages/js/jquery.imagesloaded.min.js"></script>
    <script type="text/javascript" src="qtimages/js/jquery.isotope.min.js"></script>
    <script type="text/javascript" src="qtimages/js/retina-1.1.0.min.js"></script>
    <script type="text/javascript" src="qtimages/js/plugins-scroll.js"></script>
    <script type="text/javascript" src="qtimages/js/waypoint.min.js"></script>
    <script type="text/javascript" src="qtimages/js/jquery.themepunch.tools.min.js"></script>
    <script type="text/javascript" src="qtimages/js/jquery.themepunch.revolution.min.js"></script>
    <script type="text/javascript" src="qtimages/js/script.js"></script>
    <link type="text/css" rel="stylesheet" href="qtimages/css/jquery.mmenu.all.css"/>
    <script type="text/javascript" src="qtimages/js/jquery.mmenu.all.min.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function ($) {
            var mmenu = $('nav#mmenu').mmenu({
                slidingSubmenus: true,
                classes: 'mm-white',
                //mm-fullscreen mm-light
                extensions: ["theme-white"],
                offCanvas: {
                    position: "right",
                    //left, top, right, bottom
                    zposition: "front" //back, front,next
                    //modal		: true
                },
                searchfield: false,
                counters: false,
                //navbars		: {
                //content : [ "prev", "title", "next" ]
                //},
                navbar: {
                    title: "网站导航"
                },
                header: {
                    add: true,
                    update: true,
                    title: "网站导航"
                }
            });
            $(".closemenu").click(function () {
                var mmenuAPI = $("#mmenu").data("mmenu");
                mmenuAPI.close();
            });
        });
    </script>
    <!--daipxingxlun-->
</div>
<script src="js/swiper-5.4.5/swiper.min.js"></script>
<script src="js/vue2.6.11/axios.js"></script>
<script src="js/vue2.6.11/vue.min.js"></script>
<script src="js/my.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/nav.css">
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/element/index.css">
<link rel="stylesheet" href="css/hsg.css">
<script>
    new Vue({
        el: '#wrapper',
        data: {
            isCollect: false,
            sizhengketangid: 0,
            mainSrc: '',
            //tupxianzd

            sizhengketangInfo: {},
            comments: [],
            commentInfo: {
                sizhengketangid: 0,
                content: ''
            },
            //totalComment: 0,
            isShow: false,

            user: {},
            searchText: null,
        },

        created: function () {
            axios.get('/auth').then(res => {
                if (res.data.code === '0') {
                    this.user = res.data.data;
                }
            });
            //xuxyaxodenxglxu
            this.sizhengketangid = this.getQueryVariable('sizhengketangid');
            this.loadSizhengketangInfo();
            this.loadComments();
        },

        methods: {
            searchSizhengketang(text) {   // 根据关键字查询商品
                if (text) {
                    location.href = '/front/sizhengketanglisttp.html?text=' + text;
                } else {
                    location.href = '/front/sizhengketanglisttp.html';
                }
            },
            loadSizhengketangInfo() {
                axios.get("/sizhengketangInfo/" + this.sizhengketangid).then(res => {
                    if (res.data.code === '0') {
                        this.sizhengketangInfo = res.data.data;
                        this.mainSrc = '/front/img/goods/default.png';
                        //yodutdupidanjs
                    } else {
                        alert(res.data.msg);
                    }
                });
            },
            loadComments() {
                axios.get("/commentInfo/allqt/" + this.sizhengketangid + "/sizhengketang").then(res => {
                    if (res.data.code === '0') {
                        this.comments = res.data.data;
                        this.totalComment = this.comments.length;
                    } else {
                        alert(res.data.msg)
                    }
                })
            },
            getQueryVariable(variable) {
                let query = window.location.search.substring(1);
                let vars = query.split("&");
                for (let i = 0; i < vars.length; i++) {
                    let pair = vars[i].split("=");
                    if (pair[0] === variable) {
                        return pair[1];
                    }
                }
                return '';
            },
            mouseOver(id) {
                $('#main-img-id').attr('src', '/files/download/' + id);
            },
            changeCount(type) {
                let $count = $('#count-id');
                let $store = $('#store-id');
                let count = parseInt($count.text());
                let store = parseInt($store.text());
                if (type === '+') {
                    count = count === store ? store : count + 1;
                } else {
                    count = count === 1 ? 1 : count - 1;
                }
                $count.text(count)
            },
            addCart() {
                window.location.href = '/front/goumaijiluadd.html?sizhengketangid=' + this.sizhengketangid
            },
            openModel() {
                if (this.user.level + "" == 'undefined') {
                    alert("请先登录");
                    return;
                }
                this.commentInfo.sizhengketangid = this.sizhengketangid;
                this.commentInfo.content = '';
                $('#commentModal').modal('show');
            },
            submitComment() {
                let data = {
                    userId: this.user.id,
                    level: this.user.level,
                    content: this.commentInfo.content,
                    shujuid: this.commentInfo.sizhengketangid,
                    biao: 'sizhengketang'
                };
                debugger
                axios.post('/commentInfo', data).then(res => {
                    if (res.data.code === '0') {
                        $('#commentModal').modal('hide');
                        alert('评价成功');
                        this.loadSizhengketangInfo();
                        this.loadComments();
                    } else {
                        alert(res.data.msg);
                    }
                })
            },
            dianzan_d_click() {
                axios.put('/sizhengketangInfo', {id: this.sizhengketangid, dianzan_d: 1}).then(res => {
                    if (res.data.code === '0') {
                        alert('点赞+1');
                        this.loadSizhengketangInfo();
                    } else {
                        alert(res.data.msg)
                    }
                })
            },
            dianzan_c_click() {
                axios.put('/sizhengketangInfo', {id: this.sizhengketangid, dianzan_c: 1}).then(res => {
                    if (res.data.code === '0') {
                        alert('反对+1');
                        this.loadSizhengketangInfo();
                    } else {
                        alert(res.data.msg)
                    }
                })
            },
            collect() {
                console.log(this.sizhengketangInfo.shangpinmingcheng);
                if (this.user.level + "" == 'undefined') {
                    alert("请先登录");
                    return;
                }
                axios.post('/collectInfo', {
                    shoucangmingcheng: this.sizhengketangInfo.shxouxixan,
                    userId: this.user.id,
                    shujuid: this.sizhengketangid,
                    level: this.user.level,
                    biao: 'sizhengketang'
                }).then(res => {
                    if (res.data.code === '0') {
                        alert("收藏成功");
                    } else {
                        alert(res.data.msg)
                    }
                })


            },
            //adxdliaxnjie
            logout() {
                axios.get("/logout").then(res => {
                    if (res.data.code === '0') {
                        location.href = '/front/index.html';
                    } else {
                        msg('error', res.data.msg);
                    }
                })
            }
        }
    })
</script>
</body>
</html>

