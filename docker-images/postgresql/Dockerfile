#Using the official postgres docker image.See https://hub.docker.com/_/postgres/ for more information
FROM postgres:9.6
#Adding initialize script will be picked up automatically https://hub.docker.com/_/postgres/
ADD db_create_keycloak.sql /docker-entrypoint-initdb.d
# Add VOLUMEs to allow backup of config, logs and databases
VOLUME  ["/etc/postgresql", "/var/log/postgresql", "/var/lib/postgresql"]