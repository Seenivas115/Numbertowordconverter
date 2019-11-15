package com.virtusa.numbertostring;


import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.TestCase;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class NumberToWordConverterTest extends TestCase
    
{
   // @Mock
    //private NumberToWordConverter converter;
    
    @Test
    public void convertToWords() {
        assertEquals("Asserting the value", NumberToWordConverter.convertToWords(800), "eight hundred ");

    }
}
