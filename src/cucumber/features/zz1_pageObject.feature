Feature: Login, create and check address



  Scenario Outline: Successful login and creating address parametrized
    Given Browser with open page at address https://mystore-testlab.coderslab.pl/index.php
    And Sing in icon clicked
    And Login using <email> and <password>
    When Addresses button clicked
    And Create new address button clicked
    And Create new address using data <alias>, <address>, <city>, <zip_code>, <country>, <phone>
    Then New address is created
    And Verify the new address <city>
    Then Delete the new address
    And Check address deletion

    Examples:
      |email                       |password     |alias  |address |city  |zip_code|country       |phone   |
      |gdhthtdxtzehqimdxa@bvhrk.com|Tajnehaslo123|Firmowy|Piwna 32|Gdynia|00-160  |United Kingdom|12984210|
