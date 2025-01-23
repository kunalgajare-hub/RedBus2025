Feature: RedBus page fuctionality

  Scenario Outline: Validate the search fuctionality
    Given user should open in the "chrome" browser and the redbus site "https://www.redbus.in/"
    When user enter select "<from>" city name and "<to>" destination city name
    And after user selects the "<monthAndYear>" and "<date>" from the given calendar
    And user clicks on search button
    And after that terminate the session

    Examples: 
      | from   | to     | monthAndYear | date |
      | Pune   | Mumbai | Jan 2024     |   15 |
      
