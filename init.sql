SELECT 'CREATE DATABASE dermtest' WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'dermtest');
GRANT ALL PRIVILEGES ON DATABASE "dermest" to postgres;