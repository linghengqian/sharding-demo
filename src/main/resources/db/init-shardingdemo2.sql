CREATE TABLE `info`
(
    `id`        int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
    `member_id` int(11) UNSIGNED NOT NULL,
    `tel`       varchar(255)     NULL,
    PRIMARY KEY (`id`)
);

insert into `info` (member_id, tel)
VALUES (1, 'telNo');