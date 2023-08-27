CREATE TABLE `member`
(
    `id`          int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
    `name`        varchar(255)     NULL,
    `create_time` datetime         NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
);

insert into `member` (`name`, `create_time`)
VALUES ('name1', '2023-04-26 11:21:26');
