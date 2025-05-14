public class Samosa {
 

    private static Samosa samosa;   // we have to use this variable inside a static method so we have to make it static 
                                    //(1) because we are using this variable inside a static method so it should be static
                                    //(2) so that we cannot use this variable outside and cannot be changed by outside                                
                                    
    private Samosa(){
        //constructor
    }
    
    
    public static Samosa getSamosa(){
        // This method is made static so that it'll not require any object to call it. Becasue we don't have a object right now.
        // by making it static, now it'll require class name to call this method i.e., Samosa.getSamosa()
        if(samosa==null)
        {
            samosa= new Samosa();  // this line we have to execure only once so that only one object is created
        }
        
        return samosa;
    }
}


//Cons:
//1. Object will be created when we call getSamosa() method only
//2. Not Thread safe
//3. To make it thread safe, we have to use synchronized keyword & we have to use synchronize block to block object creations
//      public static Samosa getSamosa(){
//      if(samosa==null)
//      {
//          synchronized(Samosa.class)
//              {
//                  if(samosa==null)
//                  {   
//                      samosa=new Samosa();
//                  }
//              }
//      }
//      return samosa;
//  }