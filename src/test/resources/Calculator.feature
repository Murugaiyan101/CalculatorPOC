Feature: Borrowing Calculator

  Scenario: Verify borrowing estimate for a person with specific details
    Given Launch the Borrowing Calculator application
    When Click Application type as a single person
    And Select Dependants as "0"
    And Click Property you would like to buy as Home to live in
    And Enters $"80000" in annual income field
    And Enter $"10000" in other income field
    And Enter $"500" in other living expenses field
    And Enter $"0" in current home loan repayments field
    And Enter $"100" in other loan repayments field
    And Enter $"0" in other monthly commitments field
    And Enter $"10000" in total credit card limits field
    And Click on the calculate button
    Then Verify the borrowing estimate as $"426,000"
    Then Click the start over button then the borrowing estimate value as $"0"
