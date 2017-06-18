package de.kosmalla.sandra.sonarqube.test.report.with.maven;

import static org.junit.Assert.assertTrue;
import org.junit.Test;



/**
 * Unit test for a cool class
 */
public class ACoolClassTest {
    
    @Test
    public void greetzUnitTest(){
        ACoolClass coolClass = new ACoolClass();
        String greetz = coolClass.show();
        
        assertTrue(greetz.contains("success"));
    }


    @Test
    public void greetzUnitTest1(){
        ACoolClass coolClass1 = new ACoolClass();
        String greetz1 = coolClass1.show1();
        
        assertTrue(greetz1.contains("success"));
    }

  
}
