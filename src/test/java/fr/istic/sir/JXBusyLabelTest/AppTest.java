package fr.istic.sir.JXBusyLabelTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
    	App a = new App();
    	a.foo();
    	assertTrue( true );
    }
    
    public void testApp1()
    {
    	
    	App a = new App();
    	a.maino();
    	assertTrue( true );
    }
}
