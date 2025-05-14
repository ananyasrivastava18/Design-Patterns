public class Jalebi {

    //eager way of creating singleton object
    private static Jalebi jalebi= new Jalebi();
    //static methods are initialised firstly when class is loaded.  So, as soon as class is loaded, Jalebi() object
    //will be initialised i.e., Jalebi object will be created
    public static Jalebi getJalebi()
    {
        return jalebi;
    }

}

//Cons:
//1. Even if the client doesn't require the object- it'llwill create one as soon as class is loaded-in advance it creates the object- memory issue
//2. It is not thread-safe. If two threads are accessing the class at the same time
//   then two different objects will be created.
//3. It is not lazy. It will create the object as soon as class is loaded.
//4. It is not flexible. If we want to change the implementation of the class then w
//   e have to change the class itself.
//5. It is not extensible. If we want to extend the class then we have to extend the
//   class itself.
//5. It is not secure. If we want to add some security features then we have to add
//   them in the class itself.
//7. It is not testable. If we want to test the class then we have to test the class
//   itself.
