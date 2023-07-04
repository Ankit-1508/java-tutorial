import java.util.Scanner;

// class input1{  
//     public void main(String args[]){  
//      // it keeps public because jvm will enter from the main function, if here public is not written then programm wil not execute
//      //static- class members are deal with objecs,if we not main function static then we have make the object of main function ,mean with out making object we have to call the main function execute and call
//      //bina class banaye main method ko access kar sake
//      //void -no value is return 
//     // String is predefined class in java
//     // object of String 
//      System.out.println("Hello Java");  //system is predefined class ,out means output 
//     }  
// }  
//java is a class based high level programming language
//james  gosling in 1991
//write ones run every where
 // jdk 1.0 was released by sun micro system



//static - when we make the function as static then it would be called by  any where from the outside without using the referene of that particular class where it wil invoked
/*class input1{
  static void show()
    {
        System.out.println("show World");
    }
    public static void main(String[] args) {
         // input1 ref=new input1();
        input.show();// will easily called when the show function about use the static if not contain the static keyword then it make the reference using of teh class and then call the funtion by using reference.function name
        System.out.println("hello World");
    }
}*/

// class input1{  
//   public static void main(String[] args)
//   {
//    System.out.println(args[0]);
  
//   }
// }


//array in java
 // int [] marks=new int[3];//array of size 3

//by default the arrays value are initialized by 0 in java
  //used to sort the array marks
//Array.sort(marks);


//final keyword
//Math.min(5,6);
//Math.min(5,6);


// //how to take the input in the java

class input1{  
  public static void main(String[] args)
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("inter your name : ");
       String name=sc.nextLine();// we can take the string input as the whole line
       System.out.println(name);
  }
}

//for float vlues it would be 
 // float age=sc.nextFloat();

 // to take the input of the string 
 // String name=sc.next();  only

