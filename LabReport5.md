# Part 1
![Image]((4) CSE 15L – Ed Discussion - Google Chrome 6_4_2023 12_23_21 PM.png)
![Image]((4) CSE 15L – Ed Discussion - Google Chrome 6_4_2023 12_23_35 PM.png)
![Image]((4) CSE 15L – Ed Discussion - Google Chrome 6_4_2023 12_23_47 PM.png)
Indeed there is a bug in your program. As you have pointed out, your code is compiling and running with no error. After close examination, I have identified the bug. The bug is in your for loop, your indexing starts at 1. You should start indexing at 0. In your for loop, make the following changes:
```
//Previous code
for(int i =1; i < nums.length; i++)

//Changed int i = 1 to int i = 0
for(int i =0; i < nums.length; i++)
```
Go ahead and try it and see if that works. 


![Image](bug.java - Personal Coding Projects - Visual Studio Code 6_4_2023 12_43_10 PM.png)



***
# Part 2
To be honest, I did not learn much in this quarter. In terms of Java, nothing new. But, I did learn a little bit about working on scripts and practicing debugging. Both came from labs, which did focus on debugging and writing scripts. There were multiple labs where we focused on writing a grading script using bash. 
