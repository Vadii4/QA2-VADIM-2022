Feature: Tickets reservation
  Scenario: Successful ticket reservation
    Given flight info:
      | destination | SVO        |
      | departure   | RIX        |
      | discount    | DDDDD      |
      | adults      | 2          |
      | kids        | 3          |
      | bags        | 2          |
      | flight_date | 14-05-2018 |
      | seat        | 27         |
    And passenger info is:
      | first_name  | random     |
      | last_name   | Testosteron |

    And home page opened

    When we are selecting airports
    Then selected airports appears on the next page

    When we are filling in passenger registration form
    And requesting price

    Then passenger name and and airports appears
    And price is 500 EUR

    When we are pressing Book button
    And selecting seat

    Then correct seat number appears

    When we are booking selected ticket
    Then succesful registration message appears

    When we are requesting reservations data
    Then current reservation is in the list
    And all reservation data is correct