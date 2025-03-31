#Author: Mohan Krishna Gandepalli
#Email: mohankrishnagandepalli@gmail.com
#UserID: 24NAG1904_U26
#Description: To implement BDD using Cucumber to define and automate test Scenarios
#Test Scenarios: 
#Flight Search and Booking
#Hotel Search and Booking
#Holiday Package Booking
#User Account Management
#Booking Management

Feature: To implement BDD using Cucumber to define and automate test Scenarios

Scenario: Flight Search and Booking-One Way
Given Users is on MakeMyTrip Loginpage
When Userss clicks on pop for not logging in
And Users search for flight from "Visakhapatnam"
And Users search for flight to "Delhi"
And Users enters date "Wed Sep 18 2024"
And Userss selects flight and proceed to booking by clicking view prices
Then Users is redirected to flights page

Scenario: Flight Search and Booking-Round Trip
Given User is on MakeMyTrip Loginpage
When User clicks on pop for not logging in
And User clicks on round trip
And User search for flight from "Visakhapatnam"
And User search for flight to "Delhi"
And User enters startdate "Wed Sep 18 2024"
And User enters enddate "Wed Sep 25 2024"
And User selects flight and proceed to booking by clicking view prices
Then User is redirected to flights page

@hotel
Scenario: Hotel Search and Booking
Given Userr is on MakeMyTrip LoginPage
When Userr clicks on pop for not logging in
And Userr selects Hotel Tab
And Userr chooses city from DropDown "Dubai"
And Userr selects startdate "Wed Sep 18 2024"
And Userr selects enddate "Wed Sep 25 2024"
And Userr clicks on apply button
And Userr clicks on search button
And Userr is redirected to another window
And Userr clicks on book button
And Userr enters first name "Mohan"
And Userr enters last name "Krishna"
And Userr enters email "mohan1234@gmail.com"
And Userr enters number "1234567898"
And Userr clicks on paynow
Then Userr should navigate to card details page

#@Holiday
#Scenario: Holiday Package Searching and Booking
#Given Ussers in on MakeMyTrip LoginPage
#When Usserr clicks on pop for not logging in
#And Usser selects Holiday Package Tab
#And Usser Selects nearest city and clicks on update
#And Usser enters the to city "Dubai"
#And Usser selects the depature date "Wed Sep 18 2024"
#And Usser Selects number of guests
#And Usser clicks on search
#And Usser cancels popup
#And Usser cancels another popup need assistance
#And Usser selects package
#And Usser clicks with flights
#And Usser clicks on skip
#And usser cancels on popup
#And Usser clicks on proceed to payment
#And Usser clicks on Add Traveller1
#And Usser enters first name "Mohan"
#And Usser enters last name "Krishna"
#And Usser selects date of birth "23 Oct 2000"
#And Usser chooses gender from dropdown
#And Usser clicks on add traveller
#And Usser enters first name "Mohana"
#And Usser enters last name "Krishnaa"
#And Usser selects date of birth "23 Oct 2000"
#And Usser chooses gender from dropdown
#And Usser clicks on add travellers
#And Usser enter contact email "mohan123@gmail.com"
#And Usser enters mobile code "+91"
#And Usser enters mobile number "7892623721"
#And Usser Selects GST State from Dropdown
#And Usser clicks on proceed to payment
#And Usser clicks on no continue
#And Usser enters UPI Id and clicks on verify
#Then Usser needs to pay
