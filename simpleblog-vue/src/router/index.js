import { createRouter, createWebHistory } from 'vue-router'
import PageHome from '@/views/PageHome.vue'
import BoardList from '@/views/board/BoardList.vue'
import BoardDetail from '@/views/board/BoardDetail.vue'

const routes = [
    {
        path: '/',
        name: 'PageHome',
        component: PageHome
    },
    {
        path: '/about',
        name: 'PageAbout',
        component: () => import('../views/PageAbout.vue')
    },
    {
        path: '/boards/list',
        name: 'BoardList',
        component: BoardList
    },
    {
        path: '/boards/detail',
        name: 'BoardDetail',
        component: BoardDetail
    }
    
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router