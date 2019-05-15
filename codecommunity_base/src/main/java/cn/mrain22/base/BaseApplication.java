package cn.mrain22.base;

import cn.mrain22.common.util.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/15 18:40
 * @Version 1.0
 * @Describe:
 */
@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }

    /**
     * 将分布式ID生成器注入容器
     * @return
     */
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
