package com.linwwu.junit.first;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static org.mockito.Mockito.*;

public class MyTest {
   @Test
   public void myTest() {
       List list = mock(List.class);
       when(list.get(0)).thenReturn("111");
       when(list.get(1)).thenReturn("222");
//       Assert.assertEquals("as", 1, 1);
       System.out.println(list.get(0));
       System.out.println(list.get(1));

       list.add("12");
       list.add("123");
       System.out.println(list.get(0));
       System.out.println(list.get(1));
       System.out.println(list.size());

       verify(list, times(2)).get(0);

       String ret = (String)list.get(0);
       Assert.assertEquals(ret, "111");
   }
}