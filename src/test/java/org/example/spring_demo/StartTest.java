package org.example.spring_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"SqlResolve", "SqlNoDataSourceInspection", "SqlDialectInspection"})
@SpringBootTest
class StartTest {
    @Autowired
    private DataSource dataSource;

    @Test
    void searchByMap1() throws SQLException {
        String searchByMap1 = """
                select *
                from `member`
                         inner join `info` on `member`.id = `info`.member_id
                where `member`.id = 1
                  and `member`.`create_time` = '2023-04-26 11:21:26'
                """;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(searchByMap1)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                assertThat(resultSet.next()).isTrue();
            }
        }
    }

    @Test
    void searchByMap() throws SQLException {
        String searchByMap = """
                select *
                from `member`
                         inner join `info` on `member`.id = `info`.member_id
                where `member`.id = ?
                  and `member`.`create_time` = ?
                """;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(searchByMap)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "2023-04-26 11:21:26");
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                assertThat(resultSet.next()).isTrue();
            }
        }
    }
}
