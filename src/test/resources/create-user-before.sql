delete from user_role;
delete from usr;

insert into usr (id, active, password, username) values
(1,true,'$2a$08$vgOaSx1/PtS5kiDGEfdTnOPLWVZn4wUn6CtjMQMojNDBHmEw06cv6','qwert'),
(2,true,'$2a$08$vgOaSx1/PtS5kiDGEfdTnOPLWVZn4wUn6CtjMQMojNDBHmEw06cv6','john');

insert into user_role(user_id, roles) values
(1,'USER'), (1, 'ADMIN'),
(2,'USER');

