//package com.elasticsearch;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//@EnableElasticsearchRepositories(basePackages = "com.elasticsearch")
//@Configuration
//public class ElasticsearchConfig extends ElasticsearchConfiguration {
//
//    @Value("${spring.data.elasticsearch.url}")
//    private String url;
//
//    @Override
//    public ClientConfiguration clientConfiguration() {
//        return ClientConfiguration.builder()
//                .connectedTo(url)
//                .build();
//    }
//}
