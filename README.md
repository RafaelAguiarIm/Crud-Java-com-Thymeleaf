
# CRUD Java com Thymeleaf
Este projeto conssite num CRUD de tarefas, na qual o usuário insere o nome da Task e informa a data e hora.


![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)
> 🚧  Projeto sendo aperfeiçoado...  🚧

## Desenvolvimento

- [x] CREATE
- [x] READ
- [x] DELETE
- [ ] UPDATE

### Tecnologias utilizadas

- Spring Framework
- Java 17
- Thymeleaf
- Lombok
- Apache Tomcat 9

## Ferramentas Usadas Para Implementação
* ### IntelliJ IDEA

## Padrão de Projeto Aplicado
* MVC(MODEL,VIEW,CONTROLLER) em um sistema desktop java;
    * O princípio básico do MVC é a divisão da aplicação em três camadas: a camada de interação do usuário (view), a camada de manipulação dos dados (model) e a camada de            controle (controller);
    * MODEL
        1. A responsabilidade dos models é representar o negócio. Também é responsável pelo acesso e manipulação dos dados na sua aplicação.
    * CONTROLER
        1. É a camada de controle, responsável por ligar o model e a view, fazendo com que os models possam ser repassados para as views e vice-versa.
    * VIEW
        1. A view é responsável pela interface que será apresentada, mostrando as informações do model para o usuário.


# Para executar o projeto, siga os seguintes passos:

1. Clone o repositório em sua máquina
2. Abra o projeto em sua IDE de preferência
5. Acesse a aplicação em seu navegador através do endereço `http://localhost:8080/create`

## Como utilizar a aplicação
Ao acessar a aplicação, você terá a opção de inserir uma Task com data e hora, 
ao enviar será redirecionado para a pagina de listagens, que permite excluir ou editar a tarefa.

## Contribuição
Este projeto foi desenvolvido por Rafael Aguiar. Se você deseja contribuir para o projeto, sinta-se à vontade para fazer um fork do repositório e submeter um pull request com suas alterações. Será um prazer receber contribuições da comunidade!
