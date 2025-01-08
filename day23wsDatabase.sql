DROP DATABASE IF EXISTS day23wsDatabase;

CREATE DATABASE day23wsDatabase;

USE day23wsDatabase;

CREATE TABLE purchase_orders (
    po_id char(8) not null,
    name varchar(64) not null,
    address varchar(64) not null,
    delivery_date date not null,

    constraint pk_po_id primary key(po_id)
);

CREATE TABLE line_items (
    id int auto_increment,
    name varchar(64) not null,
    quantity int default 1,
    unit_price float default 0.1,
    po_id char(8) not null,

    constraint pk_id primary key(id),
    constraint fk_po_id foreign key(po_id)
        references purchase_orders(po_id)
);

GRANT ALL PRIVILEGES ON day23wsDatabase.* TO 'fred'@'%';
FLUSH PRIVILEGES;