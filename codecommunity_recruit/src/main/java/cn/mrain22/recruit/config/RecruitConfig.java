package cn.mrain22.recruit.config;

import cn.mrain22.common.util.IdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/20 8:08
 * @Version 1.0
 * @Describe:
 */
@Configuration
public class RecruitConfig {
    /**
     * 将分布式ID生成器注入容器
     * @return
     */
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
