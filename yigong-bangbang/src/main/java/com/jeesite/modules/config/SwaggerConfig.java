package com.jeesite.modules.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 成就客户、专业之上、持续创新、诚信敬业、合作共赢
 * 成为一家世界级的数字商业云服务厂商
 *
 * @Author: xingyan,
 * @Date: 2020/3/22
 * @DESC:
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("医药帮帮")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jeesite.modules.api"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("医药帮帮")
                .description("API文档")
//                .termsOfServiceUrl("http://localhost:8980/index")
                .version("1.0")
                .build();
    }
}

