SELECT * FROM sistema.tarefa;

insert into sistema.tarefa (nome_tarefa, categoria, descricao, responsavel, email_responsavel, setor, data_abertura, data_limite, status_tarefa) values ("Prototipagem", "Alta", "Criar protótipo da página no figma", "Murilo", "11231100551@alunos.umc.br", "prototipagem", "2024-05-27", "2024-06-01" , "pendente")

DELETE FROM sistema.tarefa where id = 10;

update sistema.tarefa set status_tarefa = "concluido" where id = 14;