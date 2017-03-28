package org.shop;

import org.shop.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.sql.DataSource;

/**
 * Created by Aliaksandr_Liahushau on 3/27/2017.
 */
@Configuration
@ComponentScan("org.shop")
public class AppConfig {

}
