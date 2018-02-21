# peacepact demo
Simple project which demonstrates technologies of intrest.
## Technical features
* Infra-as-code
  * docker-compose
* Scalable
  * HA proxy(+docker-compose scale)
* Microservice
  * Spring boot
* Storage
  * Mongodb
* Dependency and build management(Choose one)
  * Maven support (maven branch)
  * Gradle support
* Security
  * keycloak server
## TODO

### Technical
* Infra as code
  * CD pipeline based on a Jenkinsfiles
* Docker
  * Use Docker data volumes
    * make all containers save state
    * External backup state of running containers
  * Security: Secrets,etc.
* Monitoring
* Logging
  * Kibana
* Storage
  * Switch to Neo4J
* Microservice
  * Service discovery
  * Transport data using protobuf
  * Versioning
  * Use limits on resources to fail fast before a service gets overloaded

### Functional
* Registration page
  * New peacekeepers can register
* Invite mechanism
  * Peacekeepers can recruit other peacekeepers with an refferal id to grow their peacekeeping army
* View Peacekeepers Family Tree(switch to graph database)
  * Every peacekeeper can view their own peacekeeping army

## Functional Story
The story is that every peacekeeper, that has registered and signed a peace pact, can invite other peacekeepers and they can invite more peace keepers and so on.

The peacepact consists of vowing to vote for leaders who fight for:
- The universal declaration of human rights (30 universal rights)
- Environmental Peace: Paris agreement
- peace over power
- to unite instead of devide (EU, UN)

Peacekeeping army:

![alt text](http://www.mlmblogpost.com/wp-content/uploads/Is-This-A-Pyramid.jpg "Army of peacekeepers")



