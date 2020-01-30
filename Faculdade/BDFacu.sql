create database facu;
use facu;

insert into cursos (curso, area, carga_hr) values ('BCT','Exatas',5000);
insert into cursos (curso, area, carga_hr) values ('BCH','Humanas',4500);
insert into cursos (curso, area, carga_hr) values ('Ciencias da Computação','Exatas',5000);
insert into cursos (curso, area, carga_hr) values ('Adiministração','Gestão',3000);

insert into tbl_alunos (nome, telefone, curso_id)
		values ('Pedro Del Rey','975708758',1);
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Fernanda Marsol','912345678',1);
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Mayara do Carmo','987654321',1);
        
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Adrian','900000000',2);
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Laura','912345458',2);
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Romulo','987668484',2);
        
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Thiaco Caligari','912348765',3);
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Ana','945671238',3);
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Italo','965873214',3);
        
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Isabelly Danni','904089632',4);
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Mauro Menezes','961738148',4);
insert into tbl_alunos (nome, telefone, curso_id)
		values ('Luciana Menezes','996131632',4);
        
select * from tbl_alunos;