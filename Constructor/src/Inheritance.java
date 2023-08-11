/*
public class Inheritance {

Code Re-usability -- One way is functions .But in Object-Oriented Code re-usability means the code or contents written for one class
is reused by  another class

There are 2 types of relationship->
1. IS A- for inheritance we have to make sure that the classes maintain IS A relationship
2. HAS A- For Aggregation and Composition

Suppose in BookStore we have a Book class and Author class
Now Book Has A Author
suppose
class Book{
book_id,book name...}
class Author{
Author ID,Author Name...}
now to reuse the code of Author in book we will create an object of Author in Book to reuse its oce
class Book
{
.....
.....
Author onj=new Author()
}
Now we can reuse Author's code inside Book This is known as HAS A relationship
Classes from same family will be capable of inheritance
Eg- In Book Store Author,Customer and Publisher are capable of inheritance because they are all humans
if we ask the question IS Author A human answer in yes;
if we ask the question IS Publisher  A human answer is yes;
if we ask the question IS book a human answer is no;
thus author and publisher are capable of inheritance;

if
 in HAS A relationship
 subclasses thst are necesarry for the survival of that class it is composition
 if subclasses are not necessary for the survival of that class it is called aggregation
}*/
