# Password Generator

Password Generator challenge from [hyperskill.org](http://hyperskill.org).

Main goal was to create password generator tool with certain rules:

+ It contains at least A uppercase letters, at least B lowercase letters, at least C digits and consists of exactly N symbols
+ Password cannot contain two or more of the same characters in a row
+ Program outputs a password that matches these requirements
+ It is implied that A, B, C, and N are non-negative integers, and A + B + C <= N
+ Any parameter can be equal to zero. It means that it's ok if the password doesn't contain symbols of such type.

## How to run a program
1. Install [Java JDK](https://www.oracle.com/java/technologies/downloads/#java21) version 11 or later if you don't have one already
2. Clone project from GitHub `git clone https://github.com/ArMazur/PasswordGenerator`
3. Change directory to project folder `cd PasswordGenerator`
4. Change directory to src folder `cd src`
5. Compile Main class `javac Main.java`
6. Run program `java Main`
7. Follow instructions

**Example:**
```
$ java Main
Enter number of uppercase characters:
2
Enter number of lowercase characters:
2
Enter number of digits:
2
Enter password length:
10
UQeg08Gz14
```

## Links

Link to the project on Hyperskill - https://hyperskill.org/learn/step/3789

Link to my Hyperskill profile - https://hyperskill.org/profile/614203111
