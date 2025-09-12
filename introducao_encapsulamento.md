# Atividade — Introdução ao Encapsulamento (classe `Data`)

## Objetivo

Esta atividade tem por objetivo:

* Explicar em detalhes o conceito de **encapsulamento** em Orientação a Objetos;
* Apresentar **getters** e **setters** (convenções, tipos de retorno e boas práticas);
* Realizar uma atividade prática, **encapsulando os atributos** `dia`, `mes` e `ano` da classe `Data` e implementando getters e setters adequados;

---

## Pré-requisitos


* Sintaxe básica de Java (classes, métodos, construtores);
* O código original da classe [`Data`](https://github.com/marcoantoni/progii/blob/main/Data.java), que foram desenvolvidos como exemplos nas aulas anteriores.
---

## 1) O que é encapsulamento?

**Encapsulamento** é o mecanismo de esconder o estado interno dos membros (atributos e métodos) de um objeto e controlar o acesso desses membros por meio de métodos públicos. Em Java isso é feito **geralmente** da seguinte forma:

* Atributos declarados como `private` (não acessíveis diretamente de fora da classe) ou `protected` (esse modificador será abordado ao trabalhar com o conceito de Herança);
* Métodos públicos `get` e `set` para permitir leitura/escrita controlada;

**Por que encapsular?**

* Protege o objeto contra estados inválidos (por exemplo, dia = 35);
* Permite adicionar validação centralizada (num único ponto — o setter);
* Facilita manutenção e evolução do código;
* Melhora a legibilidade e a segurança do sistema.

---

## 2) Getters e setters — convenções e comportamento

**Método setter**:
É responsável por modificar o valor de um atributo. Dessa forma, todas as regras de negócio para validar o atributo ficam contidas dentro desse método. Por convenção, na linguagem Java, o método **set** sempre terá a seguinte nomemclatura: `public void setX(int x)`. Dessa forma, temos que: o nome `setX` indica que o método altera um atributo chamado "x" na classe - o nome do método sempre será **set + nome do atributo**, escrito com a primeira letra maiúscula. O parâmetro `(int x)` sempre será do mesmo tipo que o atributo a ser alterado. O método **sempre** possui o tipo  `void`. 
Vejamos alguns exemplos:
* ``public void setDia(int dia)`` - indica que a o método altera o valor do atributo dia, sendo ele do tipo inteiro;
* ``public void setNome(String n)`` - indica que a o método altera o valor do atributo nome, sendo ele do tipo String;
* ``public void setPeso(float p)`` - indica que a o método altera o valor do atributo peso, sendo ele do tipo float;

**Método getter**:
É responsável por retornar o valor de um atributo. Como o atributo está encapsulado, não será mais possível acessá-lo diratamente, ou seja, para saber o **nome** do Aluno ou a data de nascimento, é ncessário usar um método getter.  Por convenção, na linguagem Java, o método **get** sempre terá a seguinte nomemclatura: `public int getX(int x)`. Dessa forma, temos que: o nome `getX` indica que o método retorna o valor de um atributo chamado "x" na classe - o nome do método sempre será **get + nome do atributo**, escrito com a primeira letra maiúscula. O método get nunca possui parâmetros, sendo sempre `()`. O método **sempre** terá um retorno, de acordo com o tipo do atributo a ser retornado. Vejamos alguns exemplos:
* ``public int getDia()`` - indica que a o método retorna o valor do atributo dia, sendo ele do tipo inteiro;
* ``public String setNome()`` - indica que a o método retorna o valor do atributo nome, sendo ele do tipo String;
* ``public float getPeso(float p)`` - indica que a o método retorna o valor do atributo peso, sendo ele do tipo float;

**Regras importantes**:

* *O setter normalmente é `void`* — ele executa a operação de atribuição (possivelmente com validação) e não retorna valor;

* *Validação* deve ocorrer no setter (por exemplo: impedir `mes = 13`);


---

## 3) Como encapsular `dia`, `mes` e `ano` na classe `Data` — passos práticos

1. Torne os atributos `dia`, `mes` e `ano` **privados**:

```java
private int dia;
private int mes;
private int ano;
```

2. Crie getters e setters públicos para cada atributo:

```java
public int getDia() { 
    return dia; 
}
public void setDia(int dia) { 
    // validação fica aqui dentro - coloque a validação que está dentro do método construtor aqui dentro. 
}
```
3. Removendo repetições de código: no **construtor**, invoque os setters na ordem adequada para garantir que a validação do dia utilize o `mes` e `ano` já definidos:
```java
public Data(int dia, int mes, int ano) {
    setAno(ano);
    setMes(mes);
    setDia(dia);
}
```
É necessário manter essa ordem, pois caso o ano seja bissexto, influenciará no fato do mês de fevereiro ter 28 ou 29 dias, dessa forma, antes de validar o dia, é preciso validar o mês, para saber se ele terá 28, 29, 30 ou 31 dias.
Assim o `setDia` vai validar com base no `mes` e `ano` já armazenados.

## Para ir adiante
Vão haver casos em que os atributos são privados, mas não devem ter métodos getters e/ou setters. Procure exemplos relacionados e tente formular uma resposa que justifique um atributo não poder ser modicador e/ou alterado.

## Em caso de dúvidas entre em contato por email

