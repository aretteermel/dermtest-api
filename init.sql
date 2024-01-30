SELECT 'CREATE DATABASE dermtest' WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'dermtest');
GRANT ALL PRIVILEGES ON DATABASE "dermtest" to postgres;

CREATE TABLE IF NOT EXISTS doctor (
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    specialization TEXT
);