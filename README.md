# Who Is Next?
A JavaFX application that determines who is next to finish a certain task out of a team or members of an organization
# How to use the program
1) Create a csv file that is formatted as such:
      MonthName,PersonName
      MonthName,PersonName      
      MonthName,PersonName
      $,PersonName
               :
               :
               :
Note: The MonthName represents the last time the PersonName did a task in your organization or group project.
Note #2: If there are individuals who have never done a task before then they will not have a month/date of a time they did a task. Thus, instead of MonthName you      will write $ instead.
2) Download JavaFX from the internet and this code as well
3) Store the JavaFX folder and my downloaded code in onw folder on your computer
4) Go to that folder using the command prompt or terminal
5) Use this command to compile the code: javac --module-path javafx-sdk-11.0.2/lib --add-modules=javafx.controls Runner.java
6) Use this command to run the code: java --module-path javafx-sdk-11.0.2/lib --add-modules=javafx.controls Runner
# Common Errors
1) When prompted for the file name in the JavaFX application, include the extension of the file. Ex) Text.csv NOT Text
2) When prompted for the amount of individuals needed to finish the task, make sure the number is less than or equal to the number of individuals that are on the file that you wrote. Otherwise a RunTime error will occur.
