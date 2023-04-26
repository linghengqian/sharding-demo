Create database and data table sql
```
CREATE DATABASE shardingdemo1; 
CREATE TABLE `shardingdemo1`.`member`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NULL,
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);
insert into shardingdemo1.member (`name`,`create_time`) VALUES('name1','2023-04-26 11:21:26');
CREATE DATABASE shardingdemo2; 
CREATE TABLE `shardingdemo2`.`info`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `member_id` int(11) UNSIGNED NOT NULL,
  `tel` varchar(255) NULL,
  PRIMARY KEY (`id`)
);
insert into `shardingdemo2`.`info` (member_id,tel) VALUES(1,'telNo');

```

Run org.example.spring_demo.StartTest