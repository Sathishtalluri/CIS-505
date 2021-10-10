/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    /**
     * A private List<Composer> data field named composers. The default is a list of composer
        objects
     */
     List<Composer> comObj=new ArrayList<Composer>();
     /**
      * A no-argument constructor that creates a default list of five composer objects.
      */
     MemComposerDao()
     {
         Composer obj1=new Composer(1001,"Greg Maxwel","clasical"); 
         comObj.add(obj1);

         Composer obj2=new Composer(1002,"Games Bravo","clasical"); 
         comObj.add(obj2);

         Composer obj3=new Composer(1003,"Travis Cool","clasical"); 
         comObj.add(obj3);

         Composer obj4=new Composer(1004,"Mark Brandon","clasical"); 
         comObj.add(obj4);

         Composer obj5=new Composer(1005,"Pari Brick","clasical"); 
         comObj.add(obj5);

     }
     /**
      * An overridden findAll method that returns a list of composer objects.
      */
    @Override
    public List findAll() {
        return comObj;
    }
    /**
     * An overridden findBy method that returns a single composer object matching the
        arguments id.
     */
    @Override
    public Composer findBy(Integer id) {
        for (Composer composer : comObj) {
            if(composer.getId()==id)
            return composer;
            
        }
        return null;
    }
    /**
     *  An overridden insert method that adds a new composer object to the list of composers
     * @param composer
     * @return
     */
    @Override
    public Boolean insert(Composer composer) {
        return comObj.add(composer);
        
    }


;    
}
