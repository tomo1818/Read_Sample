CREATE TABLE IF NOT EXISTS employee (
	id VARCHAR(50) PRIMARY KEY,
	name VARCHAR(50),
	age INT
);

CREATE TABLE IF NOT EXISTS comic (
	user_id VARCHAR(50) PRIMARY KEY,
	password VARCHAR(50),
	comic_name VARCHAR(50),
	publish_day DATE,
	author_name VARCHAR(50),
	detail VARCHAR(1000)
);
