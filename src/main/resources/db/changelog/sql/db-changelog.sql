create table if not exists users
(
    id serial PRIMARY KEY,
    name varchar(128),
    email varchar(255),
    password varchar(128),
    role varchar(64)
);

create table if not exists buckets
(
id serial primary key,
user_id int unique
);

alter table if exists buckets
add constraint bucket_fk_user foreign key (user_id) references users;


create table IF NOT EXISTS products
(
    id SERIAL PRIMARY KEY,
    price numeric(19,2),
    title varchar(100)
);

create table IF NOT EXISTS buckets_products
 (
     bucket_id int not null,
     product_id int not null
 );
alter table if exists buckets_products
 add constraint buckets_products_fk_product foreign key (product_id) references products;
alter table if exists backets_products
 add constraint buckets_products_fk_bucket foreign key (bucket_id) references buckets;


insert into products(title, price) values('The Lord of rings', 22.95);
insert into products(title, price) values('Hobbit', 18.75);
insert into products(title, price) values('Незнайка', 3.95);
insert into products(title, price) values('Мышонок пик', 2.5);
insert into products(title, price) values('Learn Java', 22.99);
insert into products(title, price) values('Harry Potter and the Philosophers stone', 15.89);
insert into products(title, price) values('Harry Potter and the Chamber of Secrets', 15.89);
insert into products(title, price) values('Harry Potter and the Prisoner of Azkaban', 15.89);
insert into products(title, price) values('Harry Potter and the Order of the Phoenix', 15.89);
insert into products(title, price) values( 'Harry Potter and the Deathly Hallows', 15.89);
insert into products(title, price) values('50 Shades of gray', 38.59);
insert into products(title, price) values('Romeo & Juliette', 10.95);
insert into products(title, price) values('Frida', 5.99);
insert into products(title, price) values('The Alchemist', 5.99);
insert into products(title, price) values('The witch of Portobello', 5.99);
insert into products(title, price) values('Ayvengo', 7.95);

insert into users(name, email, password, role) values('admin', 'test@gmail.com', 'pass', 'ADMIN');
update users set password='$2a$10$HwLwSWMlfUIUfWuetYPrWuu2nf1EZUH4Y5D1SQ/WsYOmUp/h/gPfq' where id=1;