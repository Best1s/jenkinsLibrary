package org.devops

//格式化输出,需要安装 ansiColor 插件
def PrintMes(value,color){
    colors = ['red'   : "\033[40;31m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m",
              'blue'  : "\033[47;34m ${value} \033[0m",
              'green' : "\033[40;32m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m" ]
    ansiColor('xterm') {
        println(colors[color])
    }
}
//发送消息到钉钉群
def tool = new org.devops.tools()
def SedMsgJava(text){
    url = "https://oapi.dingtalk.com/robot/send?access_token=xxxx"
}

//钉钉插件指定 @ 用户
//使用:
// @Library('jenkinsLibrary') _  
// user = tool.get_user(user_name)   
def get_user(user=1){
    def users = ["张三":"1501xxxxxx","zhangsan":"1501xxxxxx",
                 
                 ]
    if (users.get(user)){
        return users.get(user)
    }
    else{
        return "xxxxx" // 找不到人时 @
    }

}