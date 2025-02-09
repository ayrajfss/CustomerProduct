package com.example.CustomerProduct.config;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {

    @Bean
    public Config hazelcastConfig() {
        return new Config()
                .setInstanceName("hazelcast-instance")
                .addMapConfig(new MapConfig()
                        .setName("customersCache")
                        .setTimeToLiveSeconds(300) // Cache expires in 5 minutes
                )
                .addMapConfig(new MapConfig()
                        .setName("productsCache")
                        .setTimeToLiveSeconds(300)
                );
    }
}
