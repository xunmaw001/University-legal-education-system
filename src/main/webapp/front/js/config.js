
var projectName = '高校普法系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '法律知识',
	url: './pages/falvzhishi/list.html'
}, 
{
	name: '法律新闻',
	url: './pages/falvxinwen/list.html'
}, 
{
	name: '律师推荐',
	url: './pages/lvshituijian/list.html'
}, 

{
	name: '普法论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '法律与校园',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmf495f/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除","查看评论"],"menu":"律师","menuJump":"列表","tableName":"lvshi"}],"menu":"律师管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"类型","menuJump":"列表","tableName":"leixing"}],"menu":"类型管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除","查看评论"],"menu":"法律知识","menuJump":"列表","tableName":"falvzhishi"}],"menu":"法律知识管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"新闻类型","menuJump":"列表","tableName":"xinwenleixing"}],"menu":"新闻类型管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除","查看评论"],"menu":"法律新闻","menuJump":"列表","tableName":"falvxinwen"}],"menu":"法律新闻管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","咨询"],"menu":"律师推荐","menuJump":"列表","tableName":"lvshituijian"}],"menu":"律师推荐管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","修改","删除","回复"],"menu":"咨询问题","menuJump":"列表","tableName":"zixunwenti"}],"menu":"咨询问题管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改","删除"],"menu":"问题回复","menuJump":"列表","tableName":"wentihuifu"}],"menu":"问题回复管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["新增","查看","修改","删除"],"menu":"普法论坛","tableName":"forum"}],"menu":"普法论坛"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"法律与校园","tableName":"news"},{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","查看评论"],"menu":"法律知识列表","menuJump":"列表","tableName":"falvzhishi"}],"menu":"法律知识模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","查看评论"],"menu":"法律新闻列表","menuJump":"列表","tableName":"falvxinwen"}],"menu":"法律新闻模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","咨询"],"menu":"律师推荐列表","menuJump":"列表","tableName":"lvshituijian"}],"menu":"律师推荐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除"],"menu":"咨询问题","menuJump":"列表","tableName":"zixunwenti"}],"menu":"咨询问题管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"问题回复","menuJump":"列表","tableName":"wentihuifu"}],"menu":"问题回复管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","查看评论"],"menu":"法律知识列表","menuJump":"列表","tableName":"falvzhishi"}],"menu":"法律知识模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","查看评论"],"menu":"法律新闻列表","menuJump":"列表","tableName":"falvxinwen"}],"menu":"法律新闻模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","咨询"],"menu":"律师推荐列表","menuJump":"列表","tableName":"lvshituijian"}],"menu":"律师推荐模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除"],"menu":"律师推荐","menuJump":"列表","tableName":"lvshituijian"}],"menu":"律师推荐管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","回复"],"menu":"咨询问题","menuJump":"列表","tableName":"zixunwenti"}],"menu":"咨询问题管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","删除"],"menu":"问题回复","menuJump":"列表","tableName":"wentihuifu"}],"menu":"问题回复管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","查看评论"],"menu":"法律知识列表","menuJump":"列表","tableName":"falvzhishi"}],"menu":"法律知识模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","查看评论"],"menu":"法律新闻列表","menuJump":"列表","tableName":"falvxinwen"}],"menu":"法律新闻模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","咨询"],"menu":"律师推荐列表","menuJump":"列表","tableName":"lvshituijian"}],"menu":"律师推荐模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"律师","tableName":"lvshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
