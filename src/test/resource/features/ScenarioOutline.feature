Feature: Testing  the use of Scenario outline
  Scenario Outline:
    """
    Checking  that an message should  show up   when all the fields  were filled out
    correctly many times
    """
    Given : I'm on http://parsleyjs.org/doc/examples/simple.html  to test the form
    When : I  fill out all the fields  correctly with  this information "<Name>","<Email>","<Gender>","<Hobbies>","<Heard>","<Message>"
    And :  I press the button  Validate to get the message
    Then :  I see an ok message  that say "Everything seems to be ok :)" in each case
    And :   I close the page finally
    Examples:
      | Name       | Email           |Gender| Hobbies                | Heard   | Message                                         |
      | Name one   | mail1@mail.com | M    |Eating,Sleeping,Skiing|Internet|This is a message  to test   the field  Message1|
      | Name two   | mail1@mail.com | F    |Eating,Sleeping,Skiing|Press   |This is a message  to test   the field  Message2|
      | Name three | mail1@mail.com | F    |Eating,Sleeping,Skiing|Internet|This is a message  to test   the field  Message3|
      | Name four  | mail1@mail.com | M    |Eating,Sleeping,Skiing|Press   |This is a message  to test   the field  Message4|
      | Name five  | mail1@mail.com | M    |Eating,Sleeping,Skiing|Internet|This is a message  to test   the field  Message5|

