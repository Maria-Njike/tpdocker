FROM postgres:17.2-alpine

ENV POSTGRES_DB=db
ENV POSTGRES_USER=usr 
ENV POSTGRES_PASSWORD=pwd

COPY initdb/ /docker-entrypoint-initdb.d/