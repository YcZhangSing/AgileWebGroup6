package org.qiyu.live.bank.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author xueyu
 * @Date: Created in 21:48 2023/8/19
 * @Description
 */
@SpringBootApplication
public class BankApiApplication {

    /**
     * 启动类
     * fixed 接口描述
     *   1. 该接口用于启动应用程序
     *   2. 该接口根据配置启动 Spring Boot 应用程序
     *   3. 该接口返回启动结果
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BankApiApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.SERVLET);
        springApplication.run(args);
    }
}
