package front;

import lombok.Data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@MapperScan("")
@Data
public class ApplicationConfig {
    /*
    @Autowired
    DataSourceProperties properties;

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() throws SQLException {
        DataSourceBuilder factory = DataSourceBuilder
                .create(this.properties.getClassLoader())
                .url(this.properties.getUrl())
                .username(this.properties.getUsername())
                .password(this.properties.getPassword());
        DataSource dataSource = factory.build();
		return dataSource;
	}
		*/

    /*
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setConfigLocation(new ClassPathResource("/mybatis-config.xml"));
		sessionFactory.setFailFast(true);
        return sessionFactory.getObject();
	}
*/
}
