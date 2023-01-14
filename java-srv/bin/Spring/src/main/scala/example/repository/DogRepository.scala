package example.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import example.model.Dog;

@Repository
trait DogRepository extends ElasticsearchRepository[Dog, String] {}
