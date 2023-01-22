package med.voll.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig   {

    @Bean
    public DataSource dataSource(
            @Value("${SPRING_DATASOURCE_URL}") String url,
            @Value("${SPRING_DATASOURCE_USERNAME}") String username,
            @Value("${SPRING_DATASOURCE_PASSWORD}") String password) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}