Feature: To validate the account creation of facebook application

Scenario: To create new Account
Given To launch the browser and maximize the window
When To launch url for facebook application
And To click the create new account button

And To pass firstname in firstname text box
#key     value
|firstname1|Masha|
|firstname2|Bheem|
|firstname3|patlu|
|firstname4|motto|

And To pass Secondname in secondname textbox

And To pass mobileno or email in email text box
|password1|password2|password3|
|aaaaaaa|bbbbbbbb|ccccccc|
|ddddddd|eeeeeeee|fffffff|
|ggggggg|hhhhhhhh|iiiiiii|
|jjjjjjj|kkkkkkkk|lllllll|

And To create new password using new password text box
Then To close the chrome browser