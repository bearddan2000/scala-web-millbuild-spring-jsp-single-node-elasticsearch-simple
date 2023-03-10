package example;

import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(Array("example.repository"))
@ComponentScan(Array("example"))
class ElasticsearchClientConfiguration
{
    @Bean
    def client (): RestHighLevelClient =
    {
        val clientConfiguration: ClientConfiguration =
                ClientConfiguration.builder().connectedTo("db:9200").build();

        return RestClients.create(clientConfiguration).rest();
    }

    @Bean
    def elasticsearchTemplate(): ElasticsearchOperations = new ElasticsearchRestTemplate(client());
}
