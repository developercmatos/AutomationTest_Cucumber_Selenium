
@Automobiles
Feature: Cadastro de Automobile
  
Background: 
Given Abrir o Web Browser

  Scenario: Realizar cadastro de Automobile - Vehicle Data
   
    Given Estando no menu de Automobile
    When Entrei com os dados do veiculo e segui para o proximo passo
    And Entrei com os dados do seguro e segui para o proximo passo
    And Entrei com os dados do produto e segui para o proximo passo
    And Selecionei a opcao de preco e segui para o proximo passo
   And Entrei com os dados de Quote
   Then Validei que o cadastro foi realizado com sucesso