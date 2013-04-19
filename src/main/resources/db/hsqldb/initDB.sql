DROP TABLE member IF EXISTS;

CREATE TABLE member (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR(30)
);