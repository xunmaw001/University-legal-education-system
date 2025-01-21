import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import leixing from '@/views/modules/leixing/list'
    import news from '@/views/modules/news/list'
    import wentihuifu from '@/views/modules/wentihuifu/list'
    import lvshi from '@/views/modules/lvshi/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import discussfalvzhishi from '@/views/modules/discussfalvzhishi/list'
    import discussfalvxinwen from '@/views/modules/discussfalvxinwen/list'
    import discusslvshi from '@/views/modules/discusslvshi/list'
    import users from '@/views/modules/users/list'
    import forum from '@/views/modules/forum/list'
    import falvzhishi from '@/views/modules/falvzhishi/list'
    import falvxinwen from '@/views/modules/falvxinwen/list'
    import zixunwenti from '@/views/modules/zixunwenti/list'
    import xinwenleixing from '@/views/modules/xinwenleixing/list'
    import config from '@/views/modules/config/list'
    import lvshituijian from '@/views/modules/lvshituijian/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/leixing',
        name: '类型',
        component: leixing
      }
      ,{
	path: '/news',
        name: '法律与校园',
        component: news
      }
      ,{
	path: '/wentihuifu',
        name: '问题回复',
        component: wentihuifu
      }
      ,{
	path: '/lvshi',
        name: '律师',
        component: lvshi
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/discussfalvzhishi',
        name: '法律知识评论',
        component: discussfalvzhishi
      }
      ,{
	path: '/discussfalvxinwen',
        name: '法律新闻评论',
        component: discussfalvxinwen
      }
      ,{
	path: '/discusslvshi',
        name: '律师评论',
        component: discusslvshi
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/forum',
        name: '普法论坛',
        component: forum
      }
      ,{
	path: '/falvzhishi',
        name: '法律知识',
        component: falvzhishi
      }
      ,{
	path: '/falvxinwen',
        name: '法律新闻',
        component: falvxinwen
      }
      ,{
	path: '/zixunwenti',
        name: '咨询问题',
        component: zixunwenti
      }
      ,{
	path: '/xinwenleixing',
        name: '新闻类型',
        component: xinwenleixing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/lvshituijian',
        name: '律师推荐',
        component: lvshituijian
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
