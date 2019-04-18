### Interview Test


1. __Write a function that detects if two strings are anagram e.g. ‘bleat’ and ‘table’ are anagrams but ‘eat’ and ‘tar’ are not.__

    > The answer for this question can be found in the pappin.jobtests.bongo.AnagramDetectorTest class.
    >
    > See: [AnagramDetectorTest.kt](https://github.com/bpappin/tests-bongo/blob/master/app/src/test/java/pappin/jobtests/bongo/AnagramDetectorTest.kt) and
    > [AnagramDetector.kt](https://github.com/bpappin/tests-bongo/blob/master/app/src/main/java/pappin/jobtests/bongo/AnagramDetector.kt)
    
    
2.  __Explain the design pattern used in following:__
    ```java
        interface Vehicle {
            int set_num_of_wheels()
            int set_num_of_passengers()
            boolean has_gas() 
        }
    ```
    > Question 2 shows an interface, not a specific pattern. The interface can be used in a design pattern however, 
    > such as the Factory Pattern, Builder, or Adapter Pattern, etc.
    >
    
    2.a. __*Explain how can you use the pattern to create car and plane class?*__
     
    > To create a "Car" or "Plane", you would simply implement the interface in a concrete class, 
    > and return the appropriate values for each function. 
    > Lets try a Builder pattern for example:
    >   ```Java
    >     class VehicleBuilder {
    >            int num_of_wheels = 0;
    >           int num_of_passengers = 0;
    >           boolean has_gas = false;
    >
    >        public VehicleBuilder wheels(int wheels) {
    >            num_of_wheels = wheels
    >            return this;
    >        }
    >
    >        public VehicleBuilder passengers(int passengers) {
    >            num_of_passengers = passengers
    >            return this;
    >        }
    >
    >        public VehicleBuilder gas(boolean gas) {
    >            has_gas = gas
    >            return this;
    >        }
    >
    >       public Vehicle build() {
    >            return new VehicleImpl(num_of_wheels, num_of_passengers, has_gas);
    >           
    >       }
    >     }
    >
    >     class VehicleImpl(int wheels, int passengers,boolean gas) implements Vehicle {
    >         int set_num_of_wheels(){return wheels}
    >         int set_num_of_passengers() {return passengers}
    >         boolean has_gas() {return gas}
    >     }
    >   ```  
    > Build Pattern is avcutally not a great one for this case, since the instructions say we want two different classes, 
    > but this should at least illustrate the pattern side of the question.
    
    2.b. __*Use a different design pattern for this solution.*__
    
    > Not sure how to answer this one considering that we have established that the interface is not a pattern itself. 
    > If you were using an adapter pattern, the interface would simply define the contract for the adapter. 
    > If a factory pattern, the factory would simply return an implementation of some sort that implemented that interface.
    >   ```Java
    >     class VehicleFactory {
    >       public Vehicle create(int type) {
    >           if(type == 0){ 
    >                return new Car();
    >           }
    >           return new Plane();
    >       }
    >     }
    >
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


3. __Write a video player application with ‘Play’, ‘Forward’ , ‘Rewind’ functionalities. Please write pseudocode for this program and explain the design pattern you will use to develop these three functionalities.__

    > This one needs some clarification. 
    >
    > At this point I'm taking a best guess at what the question means. I have emailed as directed, but I have not heard back as of yet.
    > ```java
    >    class VideoView {
    >        void play(){...}
    >        void forward(){...}
    >        void rewind(){...}
    >        void stop(){...}
    >        boolean isPlaying(){...}
    >    }
    >
    >   class VideoPlayerApp {
    >       VideoView viewer = new VideoView();
    >
    >       Button playButton = new Button(new OnClick(){
    >            if(viewer.isPlaying()){
    >                viewer.stop();
    >            } else{
    >                viewer.play();
    >            }
    >        });
    >
    >       Button forwardButton = new Button(new OnClick(){
    >           if(viewer.isPlaying()){
    >               viewer.stop();
    >           }
    >           viewer.forward();
    >        });
    >
    >       Button rewindButton = new Button(new OnClick(){
    >           if(viewer.isPlaying()){
    >               viewer.stop();
    >           }
    >          viewer.rewind();
    >        });
    >
    >    }
    > ``` 
