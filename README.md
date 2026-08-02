# Sistema de Pagamento com Strategy Pattern

## Sobre o projeto

Projeto desenvolvido em **Java puro** com o objetivo de demonstrar a aplicação de um **Design Pattern GoF**.

O padrão utilizado foi o **Strategy**, que permite criar diferentes formas de pagamento de maneira flexível e organizada.

O sistema simula pagamentos utilizando diferentes estratégias:

* PIX
* Cartão
* Boleto

---

## Sobre o Strategy

O padrão Strategy permite separar comportamentos diferentes em classes independentes.

Neste projeto, cada método de pagamento possui sua própria implementação, enquanto o serviço principal trabalha com uma abstração, facilitando a adição de novas formas de pagamento sem alterar o código existente.

---

## Estrutura

O projeto foi dividido em:

* **Model:** representa os dados do pedido.
* **Strategy:** contém as estratégias de pagamento.
* **Service:** responsável pelo processamento.
* **App:** executa a aplicação.

---

## Conceitos aplicados

* Programação Orientada a Objetos
* Interfaces
* Polimorfismo
* Encapsulamento
* Design Pattern Strategy
* Princípio Open/Closed do SOLID

---

## Conclusão

O projeto demonstra como o padrão Strategy ajuda a criar sistemas mais flexíveis, organizados e fáceis de evoluir.
