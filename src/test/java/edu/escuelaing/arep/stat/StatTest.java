package edu.escuelaing.arep.stat;

import edu.escuelaing.arep.app.AppTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StatTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StatTest( String testName )
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
        assertTrue( true );
    }

}