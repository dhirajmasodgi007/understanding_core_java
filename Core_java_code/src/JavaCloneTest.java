public class JavaCloneTest {
  //  private static final Logger logger = LoggerFactory.getLogger(JavaCloneTest.class);
    
   /* private JavaCloneTest ()
    {
    	
    }*/
  
    public static void main(String args[]) {

        Rectangle rec = new Rectangle(30, 60);
        System.out.println(rec);
      
        Rectangle copy = null;
        copy = rec;  // used for shallow copy
     //   copy = new Rectangle(rec.getWidth(), rec.getHeight());
       /* try {
        	System.out.println("Creating Copy of this object using Clone method");
           copy = rec.clone();   // used for deep copy
            System.out.println("Copy " + copy);
          
        } catch (CloneNotSupportedException ex) {
        	System.out.println("Cloning is not supported for this object");
        }*/
      
        //testing properties of object returned by clone method in Java
        System.out.println("copy != rec : " + (copy != rec));
        System.out.println("copy.getClass() == rec.getClass() : " + (copy.getClass() == rec.getClass()));
        System.out.println("copy.equals(rec) : " + copy.equals(rec));
      
        //Updating fields in original object
        rec.setHeight(100);
        rec.setWidth(45);
      
        System.out.println("Original object :" + rec);
        System.out.println("Clonned object  :" + copy);
    }
 
}


