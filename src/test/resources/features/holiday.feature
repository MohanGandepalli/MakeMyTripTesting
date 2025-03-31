Feature: Book a Holiday Package on MakeMyTrip without Logging In

Scenario: Book a holiday package and proceed to payment
Given I am on the MakeMyTrip homepage
When I search for a holiday package from "Delhi" to "Goa"
And I select a package from the search results
And I customize the package with preferred options
And I proceed to book without logging in
Then I should reach the payment page