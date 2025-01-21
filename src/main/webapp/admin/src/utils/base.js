const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmf495f/",
            name: "ssmf495f",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmf495f/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校普法系统"
        } 
    }
}
export default base
