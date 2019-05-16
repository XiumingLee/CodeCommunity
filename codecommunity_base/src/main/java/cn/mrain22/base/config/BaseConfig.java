package cn.mrain22.base.config;

import cn.mrain22.common.util.IdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/16 7:52
 * @Version 1.0
 * @Describe: codecommunity_base工程配置文件
 */
@Configuration
public class BaseConfig {
    /**
     * 将分布式ID生成器注入容器
     * @return
     */
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
