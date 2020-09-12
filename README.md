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