# MorseCodeApp
Task 1: We are developing a mobile app that translates English to Morse Code, and Morse Code to English. We have chosen to use an incremental development process model. Because new requirements may be added as development happens, it will be easier to accommodate and add them in as development occurs. The incremental model also allows us to produce working components or versions, test and validate them, and then continue to build on top of what we already have.


Task 2: During our requirements engineering process, we conducted a feasibility study and reported the following results:

Predicted cost of development: $0
Problems with existing systems (other apps that perform similar tasks as ours):
Lack of helpful features, i.e. inability to loop a morse code message, inability to replay a message after it has been translated, inability to adjust the speed of the message being transferred
Lack of storage for previous message
Software needed for project: Android Studio
Goals of the system:
Use international Morse Code
Provide a system that translates all characters correctly
Provide a simple user interface that is straightforward to users

From there we were able to specify requirements such as:

The system shall be written in Java, using Android Studio
The system shall provide a simple and straightforward user interface
The system shall be able to access onboard flashlight of devices to send messages visually
The system shall have access to storage so that a log of messages can be stored

While we have not rejected any requirements in the validation phase, we have set various priority levels for different requirements, so that our development will be focused on the most important aspects of the system first and we can build further with succeeding versions.



Task 3: Describe the stages of your software design and implementation including design inputs, design activities, and design outputs

During our design phase, we set up our user interface, and used rough flowcharts to diagram the flow of the system.

User Interface: The interface is simple. We have one text box on the screen for user input, where the user will input a message to be translated, a button to press to translate the message, and a text box to hold the output
Code: The code handles the translation of the messages. After the user presses the “translate” button, the program grabs the message in the input box, translates each English character to a Morse character, and compiles each character back into a message in Morse Code.


‍‍,___,
[O.o]
/)__)
-"--"-
(OWL)

Task 4: Our first version app has been implemented in Android Studio (IDE) and has been demonstrated in class.



Task 5: Describe your software validation and testing stages implemented

    For our software validation and testing stages we have set multiple test cases for the program to run.  The program will run as normal, yet we will use our Test Case input. Because we already know what the expected output should be it makes it easy to check to see if it worked. We have 3 Test Cases that can check if the enligsh can translate to Morse and back correctly.

Test Case 1:        
        Input:        Hello
        Expected:    .... . .-.. .-.. ---
        Input:        .... . .-.. .-.. ---
        Expected:    Hello
Test Case 2:
        Input:        Two words!
        Expected:    - .-- --- / .-- --- .-. -.. ... -.-.--
        
Input:        - .-- --- / .-- --- .-. -.. ... -.-.--
        Expected:    Two words!
Test Case 3
        Input:        @gmail&
        Expected:    .--.-. --. -- .- .. .-.. .-...

        Input:        .--.-. --. -- .- .. .-.. .-...
        Expected:    @gmail%
        
Each Test Case covers something different.
Test Case one to make sure the program works properly.
Test Case two to make sure the program can have two or more words in order to output spaces back to the user. Also can recognize punctuation.
Test Case 3 to make sure the program can recognize different symbols.



