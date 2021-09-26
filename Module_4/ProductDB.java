/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
public class ProductDB {
    /**
     * A public static method named getProducts with string argument named code and a return
        type of a product generic queue
     * @param code
     * @return
     */
    public static GenericQueue<Product> getProducts(String code)
    {
        GenericQueue<Product> queueClassObj= new GenericQueue<Product>();
        if(code.equals("b"))
        {
            Ball ball1=new Ball();
            ball1.setCode("001");
            ball1.setDiscpr(" five-pin bowling ball");
            ball1.setPrice(100.0);
            ball1.setBallColor("whilte");
            queueClassObj.enqueue(ball1);

            Ball ball2=new Ball();
            ball2.setCode("002");
            ball2.setDiscpr("candlepin bowling Ball");
            ball2.setPrice(200.0);
            ball2.setBallColor("orange");
            queueClassObj.enqueue(ball2);

            Ball ball3=new Ball();
            ball3.setCode("003");
            ball3.setDiscpr("duckpin bowling Ball");
            ball3.setPrice(300.0);
            ball3.setBallColor("black");
            queueClassObj.enqueue(ball3);

            Ball ball4=new Ball();
            ball4.setCode("004");
            ball4.setDiscpr("kegel bowling Ball");
            ball4.setPrice(400.0);
            ball4.setBallColor("green");
            queueClassObj.enqueue(ball4);

            Ball ball5=new Ball();
            ball5.setCode("005");
            ball5.setDiscpr("No hole bowling Ball");
            ball5.setPrice(500.0);
            ball5.setBallColor("gray");
            queueClassObj.enqueue(ball5);




        }
        else if(code.equals("a"))
        {
         Bag bag1=new Bag();
         bag1.setCode("001");
         bag1.setDiscpr("Small bag");
         bag1.setPrice(100.0);
         bag1.setBagCapasity("1");
         queueClassObj.enqueue(bag1);

         Bag bag2=new Bag();
         bag2.setCode("001");
         bag2.setDiscpr("Small bag");
         bag2.setPrice(200.0);
         bag2.setBagCapasity("3");
         queueClassObj.enqueue(bag2);

         Bag bag3=new Bag();
         bag3.setCode("001");
         bag3.setDiscpr("Small bag");
         bag3.setPrice(300.0);
         bag3.setBagCapasity("6");
         queueClassObj.enqueue(bag3);

           
        }
        else if(code.equals("s"))
        {
            Shoe shoe1=new Shoe();
            shoe1.setCode("001");
            shoe1.setDiscpr("Red Shoe");
            shoe1.setPrice(100.0);
            shoe1.setShoeSize(6.0);
            queueClassObj.enqueue(shoe1);

            Shoe shoe2=new Shoe();
            shoe2.setCode("002");
            shoe2.setDiscpr("orange Shoe");
            shoe2.setPrice(200.0);
            shoe2.setShoeSize(7.0);
            queueClassObj.enqueue(shoe2);
            
            Shoe shoe3=new Shoe();
            shoe3.setCode("003");
            shoe3.setDiscpr("black Shoe");
            shoe3.setPrice(300.0);
            shoe3.setShoeSize(8.0);;
            queueClassObj.enqueue(shoe3);

            Shoe shoe4=new Shoe();
            shoe4.setCode("004");
            shoe4.setDiscpr("green Shoe");
            shoe4.setPrice(400.0);
            shoe4.setShoeSize(9.0);
            queueClassObj.enqueue(shoe4);

            Shoe shoe5=new Shoe();
            shoe5.setCode("005");
            shoe5.setDiscpr("gray Shoe");
            shoe5.setPrice(500.0);
            shoe5.setShoeSize(10.0);;
            queueClassObj.enqueue(shoe5);
         
        }
        else{

        }
        
        return queueClassObj;
    }
    
}
