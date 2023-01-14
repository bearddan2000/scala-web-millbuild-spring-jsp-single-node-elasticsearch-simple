# scala-web-millbuild-spring-jsp-single-node-elasticsearch-simple

## Description
A jsp springboot scala gradle build,
that connects to elasticsearch database single node cluster.

To create the `dog` collection we use a runner
to remotely issue `elasticsearch create_collection -c` to
node 1.

Zookeeper is used for replication across
the single node cluster.

## Tech stack
- springboot
  - jsp
- millbuild
  - elasticsearch drivers
  - lombok
  - PostConstruct annotation
- bootstrap
- jquery
- dataTable
- zookeeper

## Docker stack
- elasticsearch:8.2
- zookeeper:3.5
- nightscape/scala-mill

## To run
`sudo ./install.sh -u`
- [Available](http://localhost)
- [Node 1 elasticsearch webui](http://localhost:9200)

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- [Baeldung code](https://www.baeldung.com/spring-data-elasticsearch-tutorial)
- [Springboot Application Config](https://betterscalacode.com/programming/elasticsearch-spring-boot)
