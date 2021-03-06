校园二手图书交易系统
---
# 技术栈
## 前端:
- Vue.js
- Vue.js框架:iView
- 包管理:npm

## 后端
- 数据库连接池:Druid
- Springboot框架
- Mycat(可选)
- 健康检查:Spring-actuator
- 权限管理:Apache Shiro
- 脚本:python

## 运维
- 持续集成:Jenkins + shell
- 容器:Docker

## 容器
- Web服务器:Tomcat8
- 负载均衡及静态文件服务器:Nginx
- 关系数据库:Mysql
- Nosql数据库:Redis、MongoDB
- 消息队列：RabbitMQ

## 大数据（服务于推荐系统：暂不考虑）
- flume收集用户行为
- spark进行数据清洗
- kafka：日志收集

# 项目介绍
该项目用于校园的二手图书交易，主要是解决平时书籍回收利用的效率低下问题, 尤其是毕业季特别明显:)。
## 项目功能模块
项目分为前台和后台。
### 前台（买家 & 卖家）
- 用户模块 用户的个人中心，包括个人信息、订单管理等等
- 会员模块
- 内容模块 展示新闻热点
- 推荐模块 根据当前用户的购买行为进行推荐
- 图书模块 发布待出售的二手图书，购买图书，限时秒杀
- 订单模块
- IM模块  即时通讯
### 后台(管理员)
- 用户管理
- 会员管理
- 内容管理
- 订单管理
- 售后管理
