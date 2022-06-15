package at.technikum.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc = new Calculator();

    @BeforeEach
    void initialize(){
         calc = new Calculator();
    }

    @Test
    void sum() {
        //arrange

        int a=5;
        int b=10;

        //act
        int result = calc.sum(a,b);


        //assert
        assertEquals(15, result);
    }

    @Test
    void testmultiply(){
        //arrange
        int a=5;
        int b=10;

        //act
        int result = calc.multiply(a,b);


        //assert
        assertEquals(50, result);


    }

    @Test
    void testdivide(){
        //arrange
        int a=10;
        int b=5;

        //act
        int result = calc.divide(a,b);


        //assert
        assertEquals(2, result);


    }


}