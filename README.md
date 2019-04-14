# tests-bongo
Bongo Test


1. Write a function that detects if two strings are anagram e.g. ‘bleat’ and ‘table’ are anagrams but ‘eat’ and ‘tar’ are not.
    > The answer for this question can be found in the pappin.jobtests.bongo.AnagramDetectorTest class.
    
    
2. Explain the design pattern used in following:
    ```java
        interface Vehicle {
            int set_num_of_wheels()
            int set_num_of_passengers()
            boolean has_gas() 
        }
    ```
    a. Explain how can you use the pattern to create car and plane class?
    b. Use a different design pattern for this solution.
    
    > Question 2 shows an interface, not a specific pattern. The interface can be used in a design pattern however, such as the Factory Pattern, or Adapter Pattern, etc.
    > a) To create a "Car" or "Plane", you would simply implement the interface in a concrete class, and returnt he appropriate values for each function. For example:
    >   ```Java
    >     class Car implements Vehicle {
    >         int set_num_of_wheels(){return 4}
    >         int set_num_of_passengers() {return 5}
    >         boolean has_gas() {return true}
    >     }
    >     
    >     class Plane implements Vehicle {
    >         int set_num_of_wheels(){return 5}
    >         int set_num_of_passengers() {return 200}
    >         boolean has_gas() {return true}
    >     }
    >   ```  
    >   b) Need clarification on this one.
    >       Not sure how to answer this one considering that we have established that the interface is not a pattern itself. 
    >       If you were using an adapter pattern, the interface would simply define the contract for the adapter. 
    >       If a factory pattern, the factory would simply return an implementation of some sort that implemented that interface.


3. Write a video player application with ‘Play’, ‘Forward’ , ‘Rewind’ functionalities. Please write pseudocode for this program and explain the design pattern you will use to develop these three functionalities.
    > Need clarification on this one.
