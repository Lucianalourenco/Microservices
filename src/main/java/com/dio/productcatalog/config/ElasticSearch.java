package com.dio.productcatalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnablelEsasticsearchRepositories basePacketes = ("com.dio.prodjctcatalog.repositories")

public class ElasticSearchConfig<ClientConfiguration> extends AbstractElasticsearchConfiguration {

    @Override
    public <RestHighLevelClient> RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTP("localhost:9200"."localhost:9300")
                .build();
        return RestClients.creat(clientConfiguration).rest();
    }
    @Bean
    @Override
    public EntityMapper entityMapper = new ElasticsearchEntityMapper(elasticsearchMappingContext(),
            new DefaultConversationService());
    return

    public EntityMapper getEntityMapper() {
        return entityMapper;
    }
}
