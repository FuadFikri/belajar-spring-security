# Belajar Spring Security



### Setup database
    docker run \
    --name my-postgres \
    -e POSTGRES_DB=spring-security \
    -e POSTGRES_USER=fikri \
    -e POSTGRES_PASSWORD=mypassword123 \
    -e PGDATA=/var/lib/postgresql/data/pgdata \
    -v "$PWD/auth-data:/var/lib/postgresql/data" \
    -p 5432:5432 \
    postgres:13
