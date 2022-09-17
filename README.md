科学上网注册地址：https://github.com/glados-network/GLaDOS
邀请码:18J3C-7TBKS-11VKY-KPBCE
通过邀请码注册后，签到即可延长会员有效期

# springcloudlab


## note
### use zookeeper
#### centos 关闭防火墙
systemctl stop firewalld.service
查看防火墙状态
firewall-cmd --state

* 启动命令：./bin/zkServer.sh start
* 停止命令：./bin/zkServer.sh stop　　
* 重启命令：./bin/zkServer.sh restart
* 状态查看命令：./bin/zkServer.sh status

####客户端查看 zookeeper状态
* ./bin/zkCli.sh -server 127.0.0.1:2181
* ls -R /


### USE CONSUL 
#### download 
https://www.consul.io/downloads
#### start consul
consul agent -dev
#### enter index
http;//localhost:8500

### bus配置中心刷新
curl -X POST "http://localhost:3344/actuator/bus-refresh"

### Nacos 相关命令
#### CP模式切换
curl -X PUT '$NACOS_SERVER:8848/nacos/v1/ns/operator/switches?entry=serverMode&value=CP'
