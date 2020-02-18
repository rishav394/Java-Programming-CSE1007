# Java Programming CSE1007

This repository is going to have all the solutions to cycle sheet from CSE1007-Java Programming at VIT University, Vellore.

## Assignments - 13329 - DEEPIKAA S

Since I have this course under her I will also upload the assignments she gives apart from the cycle sheet

*  [Prime Number]()
*  [Pyramid pattern]()
*  [Right angle triangle pattern]()
*  [Simple and Comound interest]()

## Assignments - 10247 - JAISANKAR N

* [Current And Saving Accounts]()


## Cycle Sheet (List of Challenging Experiments (Indicative))

Each assignment number from List of Challenging Experiments is named as `q[number]` under the Cycle Sheet folder. It can be a direct `.java` file or a folder, if the solution contains more than one files or deals with custom packages. Or you can just navigate to that file by clicking these links below.

1. Write a program to demonstrate the knowledge of students in basic Java concepts. [Solution](Cycle%20Sheet/q1.java)

    >Eg., Write a program to read the First name and Last name of a person, his weight and height using command line arguments. Calculate the BMI Index which is defined as the individual's body mass divided by the square of their height.
    >
    >| Category | BMI Range-Kg/m2 |
    >|------------------------------- |----------------------- |
    >| Underweight | <18.5 |
    >| Normal (healthy weight) | 18.5 to 25 |
    >| Overweight | 25 to 30 |
    >| Obese Class | Over 30 |
    >
    >Display the name and display his category based on the BMI value thus calculated.

  
2. Write a program to demonstrate the knowledge of students in multidimensional arrays and looping constructs. [Solution](Cycle%20Sheet/q2.java)

    > Eg., If there are 4 batches in BTech(IT) learning ‘ITE2005’ course, read the count of the slow learners (who have scored <25) in each batch. Tutors should be assigned in the ratio of 1:4 (For every 4 slow learners, there should be one tutor). Determine the number of tutors for each batch. Create a 2-D jagged array with 4 rows to store the count of slow learners in the 4 batches. The number of columns in each row should be equal to the number of groups formed for that particular batch ( Eg., If there are 23 slow learners in a batch, then there should be 6 tutors and in the jagged array, the corresponding row should store 4, 4, 4, 4, 4,3). Use for-each loop to traverse the array and print the details. Also print the number of batches in which all tutors have exactly 4 students.

3. Write a program to demonstrate the knowledge of students in String handling. [Solution](Cycle%20Sheet/q3.java)

    > Eg., Write a program to read a chemical equation and find out the
    > count of the reactants and the products. Also display the count of the
    > number of molecules of each reactant and product.
    > 
    > Eg., For the equation, 2NaOH + H2SO4 -> Na2SO4+ 2H2O,  the O/P  should
    > be as follows.
    > 
    > Reactants are 2 moles of NaOH,  1 mole of H2SO4.
    > 
    > Products are 1 mole of Na2SO4 and 2 moles of H2O

4. Write a program to demonstrate the knowledge of students in advanced concepts of Java string handling. [Solution](Cycle%20Sheet/q4.java)

    > Eg., (_Bioinformatics: finding genes_) Biologists use a sequence of
    > letters **A**, **C**, **T**, and **G** to model a genome. A gene is a
    > substring of a genome that starts after a triplet **ATG** and ends
    > before a triplet **TAG**, **TAA**, or **TGA**. Furthermore, the length
    > of a gene string is a multiple of 3 and the gene does not contain any
    > of the triplets **ATG**, **TAG**, **TAA**, and **TGA**. Write a
    > program that prompts the user to enter a genome and displays all genes
    > in the genome. If no gene is found in the input sequence, displays no
    > gene. Here are the sample runs:
    > 
    > Enter a genome string: TTATGTTTTAAGGATGGGGCGTTAGTT
    > 
    > O/P:  TTT
    > 
    > GGGCGT

5. Write a program to demonstrate the knowledge of students in working with classes and objects. [Solution](Cycle%20Sheet/q5.java)

    > Eg.,Create a class Film with string objects which stores name,
    > language and lead_actor and category (action/drama/fiction/comedy).
    > Also include an integer data member that stores the duration of the
    > film. Include parameterized constructor, default constructor and
    > accessory functions to film class. Flim objects can be initialized
    > either using a constructor or accessor functions. Create a class
    > FilmMain that includes a main function. In the main function create a
    > vector object that stores the information about the film as objects.
    > Use the suitable methods of vector class to iterate the vector object
    > to display the following
    > 
    > a. The English film(s) that has Arnold
    > as its lead actor and that runs for shortest duration.
    > 
    > b. The Tamil film(s) with Rajini as
    > lead actor.
    > 
    > c. All the comedy movies.

6. Write a program to demonstrate the knowledge of students in creation of abstract classes and working with abstract methods. [Solution](Cycle%20Sheet/q6.java)

    > Eg., Define an abstract class ‘Themepark’ and inherit 2 classes
    > ‘Queensland’ and ‘Wonderla’ from the abstract class. In both the theme
    > parks, the entrance fee for adults is Rs. 500 and for children it is
    > Rs. 300. If a family buys ‘n’ adult tickets and ‘m’ children tickets,
    > define a method in the abstract class to calculate the total cost.
    > Also, declare an abstract method playGame() which must be redefined in
    > the subclasses.
    > 
    > In Queensland, there are a total of 30 games. Hence create a Boolean
    > array named ‘Games’ of size 30 which initially stores false values for
    > all the elements. If the player enters any game code that has already
    > been played, a warning message should be displayed and the user should
    > be asked for another choice.  In Wonderla, there are a total of 40
    > different games. Thus create an integer array with 40 elements. Here,
    > the games can be replayed, until the user wants to quit. Finally
    > display the total count of games that were repeated and count of the
    > games which were not played at all.

7. Write a program to demonstrate the knowledge of students in Java Exception handling. [Solution](Cycle%20Sheet/q7.java)

    > Eg., Read the Register Number and Mobile Number of a student. If the
    > Register Number does not contain exactly 9 characters or if the Mobile
    > Number does not contain exactly 10 characters, throw an
    > IllegalArgumentException.  If the Mobile Number contains any character
    > other than a digit, raise a NumberFormatException. If the Register
    > Number contains any character other than digits and alphabets, throw a
    > NoSuchElementException. If they are valid, print the message ‘valid’
    > else ‘invalid’


8. Write a program to demonstrate the knowledge of students in working with user-defined packages and sub-packages. [Solution](Cycle%20Sheet/q8)

    > Eg., Within the package named ‘primespackage’, define a class Primes
    > which includes a method checkForPrime() for checking if the given
    > number is prime or not. Define another class named TwinPrimes outside
    > of this package which will display all the pairs of prime numbers
    > whose difference is 2. (Eg, within the range 1 to 10, all possible
    > twin prime numbers are (3,5), (5,7)). The TwinPrimes class should make
    > use of the checkForPrime() method in the Primes class.


9. Write a program to demonstrate the knowledge of students in File handling. [Half solution](Cycle%20Sheet/q9.java)

    > Eg., Define a class ‘Donor’ to store the below mentioned details of  a
    > blood donor.
    > 
    > Name, age, Address, Contact number, blood group, date of last donation
    > 
    > Create ‘n’ objects of this class for all the regular donors at
    > Vellore. Write these objects to a file. Read these objects from the
    > file and display only those donors’ details whose blood group is
    > ‘A+ve’ and had not donated for the recent six months.


## Disclaimer
[I (rishav394)](https://github.com/rishav394/) take no responsibility for any code, be it working or not what so ever.

If you find some bug or a suggestion please open an issue or create a pull request or drop me an email at rishav394@gmail.com

## Contributions

* [rishav394](https://github.com/rishav394/) - original work

    > Feel free to add your name and respective contribution when submitting a pull request.