# Projeto FiapRide - Julia Lopes de Souza

## Informações do Aluno

- **Nome:** Julia Lopes de Souza
- **RM:** 566557
- **Turma:** 2CCPX
- **Curso:** Ciência da Computação
- **GitHub:** @souzazz-julia

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana).

---

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe 'Passageiro'? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

**Sua Resposta:**
A classe é um molde. Com 1 milhão de usuários, criar variável para cada um é impossível. A classe organiza e padroniza.

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?"

**Sua Resposta:**
O método impede valores negativos. Sem ele, qualquer programador pode zerar saldos ou colocar valores inválidos.

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar?"

**Sua Resposta:**
Get público dá uma cópia segura. Atributo público dá o original direto, permitindo que qualquer um altere sem controle.

---

### Aula 4 - Construtores

**Pergunta:** "Na nossa classe 'Veículo', nós tomamos duas decisões arquitetônicas muito importantes:

1. Nós **não** criamos o método 'setModelo()'.
2. O 'setPlaca()' foi criado como **privado**, e criamos um método público chamado 'atualizarPlaca()' para acessá-lo.

Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?"

*Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar um dado no banco" e "executar um processo real no Detran".*

**Sua Resposta:**
Modelo de carro não muda. Criar setModelo() permitiria transformar um Uno num Corolla, o que é fraude. SetPlaca privado força passar pelo processo do Detran.

---

### Aula 5 - Associação

**Pergunta:** "No construtor da 'Viagem', nós exigimos o objeto inteiro ('Passageiro solicitante'). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem ('String nomeDoPassageiro') em vez do objeto todo?"

*Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?*

**Sua Resposta:**
Com só o nome, não dá para descontar o saldo. Preciso do objeto inteiro para executar pagarViagem() no passageiro.

---

### Aula 6 - Herança

**Pergunta:** "No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?"

**Sua Resposta:**
Protege o encapsulamento. Se a filha pudesse mexer direto, qualquer classe herdada burlaria a validação que está na mãe.

---

### Aula 7 - Polimorfismo

**Pergunta:** "No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?"

**Sua Resposta:**
Não conseguiria. O compilador só enxerga o tipo Veiculo. Se o método não existe na mãe, dá erro. O contrato precisa estar lá.

---

### Aula 8 - Classes Abstratas

**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou 'um veículo' genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que 'Veículo' é 'abstract'? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar 'abstract', qual o risco que corremos? Alguém pode criar 'new Veículo()' e quebrar a lógica do nosso sistema?"

**Sua Resposta:**
Não faz sentido. Ninguém compra "um veículo" sem ser carro, moto etc. O Java não deduz sozinho. Sem abstract, alguém cria new Veiculo() e quebra a lógica.

---

### Aula 9 - Interfaces

**Pergunta:** "Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

Pense: Se 'CarroEletrico' pudesse herdar de 'Veículo' E de 'Bateria' ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado 'ligar()'?

Como as interfaces resolvem esse problema?"

**Sua Resposta:**
Classes mães têm código executável. Se duas tivessem ligar(), haveria conflito. Interfaces só têm assinaturas, sem código, então não há conflito. Você implementa uma vez e serve para as duas.

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**

Celulares.

**Quais classes você criou?**

Celular, Recarregavel.

**Qual foi o maior desafio técnico que você enfrentou?**

Implementar a interface Recarregavel na classe Celular. Precisei entender que a interface só define o contrato e a classe implementa a lógica.

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**

Aprendi que programar orientado a objetos não é só escrever código, é pensar em como o mundo real se traduz para o computador.

**Qual conceito foi mais difícil de entender?**

Interface. Entendi que ela é só um contrato sem código, diferente da classe abstrata.

**O que você melhoraria no seu projeto se pudesse refazer?**

Adicionaria mais validações e criaria um menu interativo no console.