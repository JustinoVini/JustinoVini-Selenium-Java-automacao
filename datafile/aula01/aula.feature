Feature: Testa
    isso é um teste.

    Scenario Outline: Minha primeira aula.
        Given que eu logo no sistema 
        And digito meu login "<login>"
        And digito a senha "<senha>"
        And finalizo meu login

        Examples: 
            | login    | senha  |
            | Vinicius | 123456 |
            | Cristian | cea159 |
            | Emilly   | cea123 |
            