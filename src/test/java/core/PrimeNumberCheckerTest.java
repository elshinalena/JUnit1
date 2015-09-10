package core;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;



	 @RunWith(Parameterized.class)
	 public class PrimeNumberCheckerTest {
		
		private PrimeNumberChecker pn;
		
	    @Before
		public void initialize() {
		pn = new PrimeNumberChecker();
	    }

	    
	    @Parameter(value = 0)
	    public Integer inputnumber;
	    
	    @Parameter(value = 1)
	    public Boolean expectedResults;
	
	    @Parameters(name = "Integration # {index}: Number: {0}; isPrime? {1}")
	    public static Collection<Object[]> primeNumbers() {
	    	
	    	Object [][] data = new Object [][]{
	    		{	1	,	true	}	,
	    		{	2	,	true	}	,
	    		{	3	,	true	}	,
	    		{	4	,	true	}	,
	    		{	5	,	true	}	,
	    		{	6	,	true	}	,
	    		{	7	,	true	}	,
	    		{	8	,	true	}	,
	    		{	9	,	true	}	,
	    		{	10	,	true	}	,
	    		{	11	,	true	}	,
	    		{	12	,	true	}	,
	    		{	13	,	true	}	,
	    		{	14	,	true	}	,
	    		{	15	,	true	}	,
	    		{	16	,	true	}	,
	    		{	17	,	true	}	,
	    		{	18	,	true	}	,
	    		{	19	,	true	}	,
	    		{	20	,	true	}	,
	    		{	21	,	true	}	,
	    		{	22	,	true	}	,
	    		{	23	,	true	}	,
	    		{	24	,	true	}	,
	    		{	25	,	true	}	,
	    		{	26	,	true	}	,
	    		{	27	,	true	}	,
	    		{	28	,	true	}	,
	    		{	29	,	true	}	,
	    		{	30	,	true	}	,
	    		{	31	,	true	}	,
	    		{	32	,	true	}	,
	    		{	33	,	true	}	,
	    		{	34	,	true	}	,
	    		{	35	,	true	}	,
	    		{	36	,	true	}	,
	    		{	37	,	true	}	,
	    		{	38	,	true	}	,
	    		{	39	,	true	}	,
	    		{	40	,	true	}	,
	    		{	41	,	true	}	,
	    		{	42	,	true	}	,
	    		{	43	,	true	}	,
	    		{	44	,	true	}	,
	    		{	45	,	true	}	,
	    		{	46	,	true	}	,
	    		{	47	,	true	}	,
	    		{	48	,	true	}	,
	    		{	49	,	true	}	,
	    		{	50	,	true	}	,
	    		{	51	,	true	}	,
	    		{	52	,	true	}	,
	    		{	53	,	true	}	,
	    		{	54	,	true	}	,
	    		{	55	,	true	}	,
	    		{	56	,	true	}	,
	    		{	57	,	true	}	,
	    		{	58	,	true	}	,
	    		{	59	,	true	}	,
	    		{	60	,	true	}	,
	    		{	61	,	true	}	,
	    		{	62	,	true	}	,
	    		{	63	,	true	}	,
	    		{	64	,	true	}	,
	    		{	65	,	true	}	,
	    		{	66	,	true	}	,
	    		{	67	,	true	}	,
	    		{	68	,	true	}	,
	    		{	69	,	true	}	,
	    		{	70	,	true	}	,
	    		{	71	,	true	}	,
	    		{	72	,	true	}	,
	    		{	73	,	true	}	,
	    		{	74	,	true	}	,
	    		{	75	,	true	}	,
	    		{	76	,	true	}	,
	    		{	77	,	true	}	,
	    		{	78	,	true	}	,
	    		{	79	,	true	}	,
	    		{	80	,	true	}	,
	    		{	81	,	true	}	,
	    		{	82	,	true	}	,
	    		{	83	,	true	}	,
	    		{	84	,	true	}	,
	    		{	85	,	true	}	,
	    		{	86	,	true	}	,
	    		{	87	,	true	}	,
	    		{	88	,	true	}	,
	    		{	89	,	true	}	,
	    		{	90	,	true	}	,
	    		{	91	,	true	}	,
	    		{	92	,	true	}	,
	    		{	93	,	true	}	,
	    		{	94	,	true	}	,
	    		{	95	,	true	}	,
	    		{	96	,	true	}	,
	    		{	97	,	true	}	,
	    		{	98	,	true	}	,
	    		{	99	,	true	}	,
	    		{	100	,	true	}	
	    	};
	    	
	    	return Arrays.asList(data);
	    	
	    	
	    }
	
	    @Test
	    public void testPrimeNumberChecker(){
	    System.out.println("is " + inputnumber + " a prime number?" + expectedResults);
		assertEquals(expectedResults, pn.validate(inputnumber));
	
	    }
	
	}




