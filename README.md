# springboot-mongodb-sample
The sample of springboot use mongodb datasource

### 1、macOS 安装 MongoDB 

``` c++
brew install mongodb
```
### 2、创建 MongoDB  数据仓库

``` c++
sudo mkdir -p /data/db
sudo chown -R $USER /data/db
```
### 3、导入 json 文件到 MongoDB

``` c++
mongoimport --db movie --collection douban --file /Users/anany/Downloads/douban.json
```

### 4、对 movie 数据库进行安全账户验证
 
终端进入 MongoDB ，创建用户
```c++ 

>mongod
>use movie
>db.createUser({
            user:'anany',
            pwd:'273082671',
            roles:[
                     {role:'readWrite',db:'movie'}
                  ]
}）
```

编辑位于 /usr/local/etc/mongod.conf，添加：
security:
  authorization: enabled


### 5、安全启动 MongoDB，这个时候访问 movie 库则需要账户密码了
>mongod --auth
