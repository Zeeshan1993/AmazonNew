Feature: User should able to set the location

  Scenario: user able to set the current location
    Given Amazon URL
    Then Click on Deliver To
    Then Click on Change Link
    Then check if existed pincode is same as the current location pincode
    When existed pincode is not same as the current location pincode
    Then Enter Pincode as "500081"
    Then click on Apply button
    Then Click on Done
