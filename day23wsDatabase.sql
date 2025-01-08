drop database if exists day23wsDatabase;

create database day23wsDatabase;

use day23wsDatabase;

create table customers (
    customer_id int auto_increment,
    customer_name varchar(64) not null,
    address varchar(128) not null,
    delivery_date date not null,

    constraint pk_order_id primary key (customer_id)
);

create table orders (
    order_id int auto_increment,
    customer_id int not null,
    item_name varchar(128) not null,
    quantity int not null,
    unit_price decimal(10,2) not null,

    constraint pk_order_id primary key (order_id),
    constraint fk_customer_id foreign key (customer_id)
        references customers (customer_id)
);

grant all privileges on day23wsDatabase.* to 'fred'@'%';
flush privileges;