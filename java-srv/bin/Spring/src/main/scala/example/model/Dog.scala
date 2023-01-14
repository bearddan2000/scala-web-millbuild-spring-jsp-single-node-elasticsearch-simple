package example.model;

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "idx_dog", createIndex=false)
case class Dog (
    @Field
    var breed: String,

    @Field
    var color: String
) {
  @Id
  var id: String = _

  def this()
  {
    this("", "");
    id = "";
  }

  def this(a: String, b: String, c: String)
  {
    this(b, c);
    id = a;
  }

  override def toString() = f"""{"id":"$id%s", "breed":"$breed%s", "color":"$color%s"}"""
}
