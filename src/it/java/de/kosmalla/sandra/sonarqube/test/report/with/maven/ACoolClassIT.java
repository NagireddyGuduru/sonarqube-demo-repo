package de.kosmalla.sandra.sonarqube.test.report.with.maven;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author sandra.kosmalla
 */
public class ACoolClassIT {
    
    @Test
    public void greetzIntegrationTest(){
        ACoolClass coolClass = new ACoolClass();
        String greetz = coolClass.display();
        
        assertTrue(greetz.contains("success"));
        
    }

}
