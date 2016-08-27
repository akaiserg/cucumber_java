Feature: Checking  form validation
  Scenario: Checking  that an  message should show up  when all the fields are empty
    Given : I'm on http://parsleyjs.org/doc/examples/simple.html
    When :  I press the button  Validate
    Then :  I see an error message  that say "This form seems to be invalid :("
    And :   I close the page

   Scenario:  Checking  that an message should  show up   when all the fields  were filled out  correctly
     Given : I'm on http://parsleyjs.org/doc/examples/simple.html
     When : I  fill out all the fields  correctly
         | Fields  |  Value                                              |
         | Name    |  Andrés  Kaiser                                     |
         | Email   |  akais002@qwwqw.com                                 |
         | Gender  |  M                                                  |
         | Hobbies |  Eating,Sleeping,Reading,Coding                     |
         | Heard   |  Internet                                           |
         | Message |  This is a message  to test   the field  Message    |
     And :  I press the button  Validate
     Then :  I see an ok message  that say "Everything seems to be ok :)"
     And :   I close the page