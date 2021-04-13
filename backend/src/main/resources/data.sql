INSERT INTO tb_role(authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role(authority) VALUES ('ROLE_MEMBER');


INSERT INTO tb_user(name, email, password) VALUES ('Bob Green', 'bob@gmail.com', '$2y$12$pZyYNyvCDCjljP4U35Gj6OGL0rUYOo2IEFjMe9EpILRRqDiUZdogO');
INSERT INTO tb_user(name, email, password) VALUES ('Ana Pink', 'ana@gmail.com', '$2y$12$pZyYNyvCDCjljP4U35Gj6OGL0rUYOo2IEFjMe9EpILRRqDiUZdogO');

INSERT INTO tb_user_roles(user_id, roles_id) VALUES (1, 1);
INSERT INTO tb_user_roles(user_id, roles_id) VALUES (2, 2);

INSERT INTO tb_genre(name) VALUES ('Aventura');
INSERT INTO tb_genre(name) VALUES ('Ação');
INSERT INTO tb_genre(name) VALUES ('Terror');