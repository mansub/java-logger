package lc.java.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {
    private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Logger Name: {0}", LOGGER.getName()+", "+ Level.INFO.intValue());

        LOGGER.log(Level.WARNING, "Can cause ArrayIndexOutOfBoundsException");

        //An array of size 3
        int []a = {1,2,3};
        int index = 2;
       System.out.println(""+ sayHello() +", "+ sayHello1() +", "+ sayHello2() +"");
        LOGGER.log(Level.CONFIG, "index is set to {0}", index);

        try{
            System.out.println(a[index]);
        }catch(ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.SEVERE, "Exception occur", ex);
        }
    }

    private static String sayHello()
    {
        return "Hello, ";
        //LOGGER.log(Level.INFO, "Hello");
    }
    private static String sayHello1()
    {
        return "Hello1, ";
        //LOGGER.log(Level.INFO, "Hello1");
    }
    private static String sayHello2()
    {
        return "Hello2, ";
       // LOGGER.log(Level.INFO, "Hello2");
    }
}
