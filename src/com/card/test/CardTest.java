package com.card.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.card.model.Card;



/**
 * Unit test for simple App.
 */
public class CardTest  extends TestCase
{

    @Test
    public void booleanSuccessConditionCheck() {
        Card tester = new Card(); // MyClass is tested

        // assert statements
       assertTrue([true,false] tester.boolean (true,false)); 
       assertFalse([true,false] tester.boolean (true,false)); 
    }
}