# Projeto-Java-POO

--------------------------------------------

Autor: Alefe Filipe Biondes Magalhaes
Curso: Bacharelado em Egenharia de Software

--------------------------------------------

Sobre o Projeto:
O Projeto consiste em aplicar os fundamentos de POO (Programação Orientada a Objetos) que são: Encapsulamento, Herança e Polimorfismo, num projeto básico desenvolvido na linguagem Java com suporte para vscode e netbeans. espero que goste (+-+).

Intruções:
1-Abrir a pasta do projeto em sua IDE.
2-Caso esteja no Vscode abrir o arquivo App.java, caso esteja no netbeans abrir o arquivo ProjetoSalaDeAula.
3-Um modelo de código já está pronto, basta rodar a aplicação!
4-Para istanciar objetos utilizamos: NomeDaClasse nomeDoObjeto = new NomeDaClasse();
como o objeto já está instaciado, basta apenas criar os novos objetos.
5-Criando um Aluno: a[posição no array] = new Aluno("Nome do aluno", "Sexo do aluno", Idade do aluno);
6-Criando um Professor: prof[posição no array] = new Professor("Nome do professor", "Sexo do professor", Idade do professor);
7-Criando uma Aula: au[posição no array] = new Aula("Nome da disciplina", "Data da disciplina", duração da aula em minutos, numero da aula);
8-Marcando uma aula: Para faciltar apenas troque as posições do array para o aluno, prof e aula desejados.
SalaDeAula sala = new SalaDeAula(a[numero do aluno desejado], prof[numero do professor desejado], au[numero da aula desejada]);
sala.marcarAula(12, a[numero do aluno desejado], prof[numero do professor desejado], au[numero da aula desejada]);