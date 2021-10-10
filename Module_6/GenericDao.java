/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
import java.util.List;
/**
 * Design and interface named GenericDao to represent the
   operations in a data persistence layer. 
 */
public interface GenericDao {
    List<Composer> findAll();
    Composer findBy(Integer id);
    Boolean insert(Composer composer);
    
}
