CREATE DATABASE IF NOT EXISTS dermtest;
GRANT ALL PRIVILEGES ON DATABASE "dermtest" to postgres;

CREATE TABLE IF NOT EXISTS doctor (
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    specialization TEXT
);