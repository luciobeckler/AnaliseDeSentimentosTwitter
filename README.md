# Análise de sentimentos Twitter

Este projeto foi fornecido pela professora Kênia Carolina como meio para obtenção de pontos para a matéria de Programação III e como forma de exercitar os conhecimentos sobre estruturas de dados.

Ele tem por objetivo responder as perguntas a baixo, dada as bases de dados de Tweets realizados em 15 idiomas diferentes.

## Perguntas a serem respondidas

1) Qual o volume de tweets para cada idioma?
2) Qual o volume total de tweets positivos? E qual o volume total de tweets negativos?
3) Qual o idioma com mais tweets negativos? Qual o idioma com mais tweets positivos? É
possível fazer um ranking dos idiomas?
4) Algum tweeter teve registro em mais de um idioma? Qual, quais e/ou quantos?

### Estrutura de dados 

Cada um dos tweets possuem os seguintes dados: 

- TweetID: Identificador único do tweet;
- HandLabel: Identificador da emoção predominante naquele tweet, discriminada entre "Positive", "Negative" ou "Neutral";
- AnnotatorID: Identificador único do usuário autor do tweet.

Para a realização deste projeto não foram utilizadas estruturas de dados prontas como List, ArrayList e etc. Ao invés disso foi construido uma lista simplismente encadeada que foi utilizada para alocar os dados.

A estrutura de dados foi pensada da seguinte forma:
- Como estrutura mais interna tempos um Tweet, que possui os atributos acima mencionados;
- Após isso temos uma estrutura "Linguagem" que armazena uma lista de tweets e o nome da linguagem em questão;
- E por fim temos uma lista de linguagens que armazena as 15 linguagens fornecidas como dados.


![image](https://github.com/user-attachments/assets/63e433de-5fb1-4f66-a369-a5bfebd3fde8)


## Resultados

### Pergunta 1:
![image](https://github.com/user-attachments/assets/dcebb977-ef17-491b-948a-5f7c25836c9e)

### Pergunta 2:
![Imagem do WhatsApp de 2024-08-04 à(s) 21 41 28_dc5129e3](https://github.com/user-attachments/assets/4b16aa51-6ed8-49f8-82b8-6dce370d3cf9)

### Pergunta 3:
![Imagem do WhatsApp de 2024-08-04 à(s) 16 21 11_33d3a0bb](https://github.com/user-attachments/assets/7a654636-1660-40aa-974f-3491accdc916)

### Pergunta 4:
![Imagem do WhatsApp de 2024-08-04 à(s) 20 21 04_e4cd763f](https://github.com/user-attachments/assets/09cfb22b-279e-4a7d-b828-523e23207815)


## Comentários sobre os Resultados

Esta atividade foi bastante desafiadora por conta do volume de dados e por conta das limitações técnicas impostas pela ideia do projeto. Por termos tido que desenvolver manualmente todas as estruturas de dados utilizadas isto acabou acarretando em problemas de desempenho para a aplicação. 

Além disso foi utilizado o tipo mais simples de lista, sua versão simplismente encadeada, o que significa que um item da lista apenas enxerga o seu próximo e apenas pode ir em direção a ele.

Por conta disto a estratégia inicial do grupo foi estruturar bem como iríamos armazenas os dados, iniciar o desenvolvimento das respostas para as perguntas e após isto foi necessário uma etapa de otimização do código devido ao grande volume de iterações realizadas.

Foi um projeto muito interessante de ser realizado e que contribuiu bastante para a noção de todos os integrantes do grupo a respeito de estruturas de dados.


