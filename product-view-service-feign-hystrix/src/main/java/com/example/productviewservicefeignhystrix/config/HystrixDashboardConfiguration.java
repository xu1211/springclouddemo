package com.example.productviewservicefeignhystrix.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuyuc
 * @since 2020/6/26 12:57
 */

@Configuration
public class HystrixDashboardConfiguration {

    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        //servlet-mapping
        registrationBean.addUrlMappings("/hystrix.stream");
        //servlet-name
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}