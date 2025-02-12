<h1>🏨 Sistema de Reserva de Quartos</h1>

Este é um projeto simples em **Java** que gerencia a reserva de quartos para estudantes. O programa solicita o nome, e-mail e número do quarto escolhido e exibe a relação de quartos ocupados e disponíveis.

## 📌 Funcionalidades
- Cadastro de estudantes que alugam os quartos.
- Verificação para evitar que um mesmo quarto seja alugado duas vezes.
- Exibição de todos os quartos, informando quais estão ocupados e quais estão disponíveis.
- Uso do método `toString()` para exibir os dados de forma organizada.

## 🛠️ Tecnologias utilizadas
- **Java 8+**
- **Scanner** para entrada de dados no console.

##📌 Exemplo de saída no console:
less
Copiar
Editar
Quantos alunos irão alugar os quartos? 2

Cadastro #1
Digite o nome do aluno: João Silva
Digite o e-mail do aluno: joao@email.com
Digite o quarto (0 a 9): 3

Cadastro #2
Digite o nome do aluno: Maria Souza
Digite o e-mail do aluno: maria@email.com
Digite o quarto (0 a 9): 7

🔹 Relação de Quartos 🔹
Quarto 0: VAGO.
Quarto 1: VAGO.
Quarto 2: VAGO.
Quarto 3: João Silva (joao@email.com)
Quarto 4: VAGO.
Quarto 5: VAGO.
Quarto 6: VAGO.
Quarto 7: Maria Souza (maria@email.com)
Quarto 8: VAGO.
Quarto 9: VAGO.


## 📄 Estrutura do projeto
css
Copiar
Editar
<p>📂 projeto-reserva-quartos</p>
<p> ┣ 📂 src</p>
<p> ┃ ┣ 📂 application</p>
<p> ┃ ┃ ┗ 📜 Main.java</p>
<p> ┃ ┣ 📂 entities</p>
<p> ┃ ┃ ┗ 📜 Dados.java</p>
<p> ┣ 📜 README.md</p>
<p> ┗ 📜 .gitignore</p>

## 📝 Melhorias futuras
Implementar um menu interativo para facilitar o cadastro e consulta.
Adicionar persistência de dados (salvar as reservas em um arquivo ou banco de dados).
Criar uma interface gráfica para tornar o sistema mais amigável.

------------
📌 Autor
Projeto desenvolvido por Luana Mendes.
📧 Contato: luanamendes.pf@gmail.com
------------

<img src="https://github.com/lluanamendes/Sistema_de_Aluguel_de_Quartos/blob/main/Capturar.PNG?raw=true">
