--drop table if exists 'User';

CREATE TABLE IF NOT EXISTS User(
	id int primary key,
	name varchar(32) not null,
	age int not null,
	gender int not null
)