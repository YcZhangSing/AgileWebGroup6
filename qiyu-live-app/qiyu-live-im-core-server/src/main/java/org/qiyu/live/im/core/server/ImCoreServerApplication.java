package org.qiyu.live.im.core.server;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * netty启动类
 *
 * @Author xueyu
 * @Date: Created in 22:02 2023/7/5
 * @Description
 */
@SpringBootApplication
@EnableDubbo
public class ImCoreServerApplication {

    /**
     * 启动类
     * fixed 接口描述
     *   1. 该接口用于启动应用程序
     *   2. 该接口根据配置启动 Spring Boot 应用程序
     *   3. 该接口返回启动结果
     * @param args
     * @throws InterruptedException
     */ 
    // 启动类
    public static void main(String[] args) throws InterruptedException {
        SpringApplication springApplication = new SpringApplication(ImCoreServerApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }
}
