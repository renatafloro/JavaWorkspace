insert into contato(nome, email) values ('Josefa', 'josefa@gmail.com');
insert into contato(nome, email) values ('Severino', 'severino@gmail.com');
insert into contato(nome, email) values ('Sônia', 'sonia@gmail.com');
insert into contato(nome, email) values ('Tarcísio', 'tarcisio@gmail.com');
insert into contato(nome, email) values ('Renata', 'renata@gmail.com');

insert into compromisso (data, hora, local, idcontato)values('2022-05-19','13:00:00','teste',1);
insert into compromisso (data, hora, local, idcontato)values('2022-05-22','08:00:00','consulta',2);
insert into compromisso (data, hora, local, idcontato)values('2022-05-28','05:00:00','praia',3);
insert into compromisso (data, hora, local, idcontato)values('2022-07-15','00:00:00','aniversário',4);
insert into compromisso (data, hora, local, idcontato)values('2022-07-04','08:00:00','trabalho',5);

insert into tb_cliente(nome, email)values('maria','maria@gmail.com');
insert into tb_cliente(nome, email)values('jose','jose@gmail.com');
insert into tb_cliente(nome, email)values('Antonia','antonia@gmail.com');

insert into tb_venda(dia_compra, cliente_id)values('2022-05-24',1);
insert into tb_venda(dia_compra, cliente_id)values('2022-04-24',1);
insert into tb_venda(dia_compra, cliente_id)values('2022-04-01',1); 

insert into tb_venda(dia_compra, cliente_id)values('2022-05-12',2);
insert into tb_venda(dia_compra, cliente_id)values('2022-03-24',2);
insert into tb_venda(dia_compra, cliente_id)values('2022-02-24',2);

insert into tb_venda(dia_compra, cliente_id)values('2022-03-24',3);
insert into tb_venda(dia_compra, cliente_id)values('2022-02-24',3);

insert into tb_cliente_vendas (vendas2_id, cliente2_id) values (2,1);