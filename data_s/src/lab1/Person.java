/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @ name: fahad khalid       id:438017878
 */

   
public class Person {
private String name;
private int age;
private double height;
/**
* Default constructor creates an empty instance of a Person
*/
public Person() {
this.name = "";
this.age = 0;
this.height=0.0;
}
/**
* Alternative Constructor which creates and initialises a
* Person using the supplied parameters
*
* @param nName used to set the Person name
* @param nAge used to set the Person age
*/
public Person(String nName, int nAge,double nHeight) {
name = nName;
age = nAge;
height=nHeight;
}
/**
* Retrieve the name o
f t
he Person
*
* @return the Person name
*/
public String getName() {
return name;
}
/**
* Retrieve the age of the Person
*
* @return the Person age
*/
public int getAge() {
return age;
}

public double getheight(){
    return height;


}
/**
* Update the
nam
e of the Person
*

MNour
UQU CIS
Page
2
of
3
* @param nName the new Person name
*/
public void setName(String nName) {
name = nName;
}
/**
* Update the age of the Person
*
* @param nAge the new Person age
*/
public void setAge(int nAge) {
age = nAge;
}

public void setheight(double nHeight){
 
height=nHeight;


}
/**
* Returns a string representation of the object. In general, the
* 'toString' method returns a string that "textually represents" this
* object. The result should be a concise but informative representation
* that is ea
sy
for a person to read. It is recommended that all Objects
* provide this method.
*
* @return String representation of an object
*/
public String toString() {
return "Person(name:"+ name + ", age:" + age + ",height:"+ height+")";

}



}
    


