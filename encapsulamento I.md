# Introdução ao encapsulamento
Esta atividade prática tem como objetivo introduzir o conceito de encapsulamento, um dos quatro pilares fundamentais da Programação Orientada a Objetos. 

Primeiro faça o download dos arquivos [Aluno.java](https://github.com/marcoantoni/progii/blob/main/Aluno.java) e [Data.java](https://github.com/marcoantoni/progii/blob/main/Data.java), que foram desenvolvidos como exemplos nas aulas anteriores (lembre-se de colocar todos os arquivos dentro da mesma pasta).

Agora vamos modificar a classe **Aluno.java**, alterando a data de nascimento de ``aluno1 ``, mas para fazer isso não colocaremos os novos valores no método construtor da classe **Data** e sim atualizaremos o existente. Para isso, insira o seguinte código entre as linhas 58 e 61: ``dt1.dia = 35;`` (após criar a instância da classe **Data** - objeto ``dt1`` na linha 58) e antes de passar o objeto ``dt1`` como parâmetro para criar o novo **Aluno**  (linha 61). 

1. Compile e execute o código. Responda a pergunta 1 (depois volte para cá).

Você deve ter percebido que a saída para o nascimento foi 35 de julho de 2008, algo que não existe. Imagine se isso fosse um sistema real (um cadastro da prefeitura, por exemplo). Ter pessoas nascidas em "35/07/2008" causaria problemas sérios para relatórios, estatísticas e validações. Quando programamos orientado a objetos, muitas vezes é necessário controlar quais dados podem ou não podem ser modificados, impedindo que sejam colocados valores inválidos, burlando as regras que já programamos, ou simplesmente, quando queremos impedir que dado seja acessado. Para fazer esse controle de acesso, existe o **_encapsulamento_**, que permite controlar a visibilidade tanto dos métodos quanto dos atributos de uma classe. O encapsulamento é realizado pelos **modificadores de acesso**, que são:
* **public**: permite que um atributo ou método seja acessado diretamente sem nenhum controle. Perceba que nos métodos que a gente desenvolve eles sempre começam com a palavra reservada ``public``.
* **private**: Modificador de acesso que impede que os métodos e atributos de uma classe sejam acessados externamente, ou seja, atributos ou métodos declarados com ``private`` **só podem ser acessados dentro da classe onde foram declarados**.
* **protected**: Modificador de acesso que permite o acesso a todas as subclasses. Esse modificador está atrelhado a Herença em Orientação a objetos e por isso não precisamos nos preocupar com ele agora, pois Herança é algo que será trabalhado no futuro.

Como primeiro teste, faça o seguinte: insira o modificador **public** na classe **Aluno** na hora de declarar os atributos, deixando nesse formato: ``public String nome;``. Remova também o ``public`` dos métodos nessa classe. Responda a pergunta 2 (depois volte para cá).

O modificador ``public`` é implicito na hora de criar os atributos ou métodos, ou seja, se não for especificado um modificador na hora de criar os atributos/métodos, automaticamente ele será ``public``. É por isso que criamos os atributos da classe e conseguimos modificá-los e também é por isso que podemos remover o **public** dos métodos que tudo funciona normalmente.

Apesar do modificador ``public`` ser implicito no código, **é uma boa prática deixarmos ele explicito no código**, por isso, coloque ele novamente em todos os métodos da classe. (Por garantia compile os códigos para garantir que tudo está funcionando corretamente).

Para impedir que o dia/mes/ano de nascimento seja alterado, permitindo valores inválidos, acrescente o modificador ``private`` em todos os atributos da classe **Data**. Recompile o código da classe Data. Responda a pergunta 3 (depois volte para cá).

E se for necessário alterar ou recuperar o valor de um atributo (exemplo: nascimento), é possível fazer isso? Sim, mas devemos criar novos métodos que permitem fazer isso.



## Perguntas relacionadas a prática
1. O que você percebeu de errado na saída do programa?
2. Você percebeu algo de diferente na hora de executar o programa?
3. O código compilou normalmente? Qual foi a mensagem de erro apresentada? 
4. Pesquise e formule os conceitos para métodos **_getter_** e **_setter_**.