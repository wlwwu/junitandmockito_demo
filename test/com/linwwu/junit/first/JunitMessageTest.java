package com.linwwu.junit.first;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JunitMessageTest {
    
	public String message = "linwwu";
	
	JunitMessage junitmessage = new JunitMessage(message);
	@Test(expected = ArithmeticException.class)
    public void testJunitMessage(){
		System.out.println("Junit Message is printing");
		junitmessage.printMessage();
	}
   
    @Test
    public void testJunitHiMessage(){
    	message="Hi!" + message;
    	System.out.println("Junit Message is printing ");
    	assertEquals(message, junitmessage.printHiMessage());
    }

    
}

