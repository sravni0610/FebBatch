Feature: Validating the login functionality of the application


#  Scenario: User is able to login into the application successfully
#
#  Given User navigates to the application page
#  When  User provides login details
#  And   User clicks on login
#  Then  User is navigated to application Dashboard page


  Scenario Outline: Users is able to login into the application successfully

    Given User navigates to the application page
    When  User provides login details "<Userid>","<Pwd>"
    And   User clicks on login
    Then  User is navigated to application Dashboard page

    Examples:

    |Userid       |Pwd          |
    |   admin     |admind       |
    |   adminsds  |djfhjdf      |

