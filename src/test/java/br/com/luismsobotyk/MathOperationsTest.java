package br.com.luismsobotyk;


import br.com.luismsobotyk.math.SimpleMath;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {

    SimpleMath math = new SimpleMath();


    @Test
    public void sum(){
        assertEquals(2, math.sum(1.0,1.0));
    }

    @Test
    public void sub(){
        assertEquals(0, math.sub(1.0,1.0));
    }

    @Test
    public void mult(){
        assertEquals(20, math.mult(5.0,4.0));
    }

    @Test
    public void div(){
        assertEquals(2.5, math.div(5.0,2.0));
    }

    @Test
    public void pow(){
        assertEquals(25, math.pow(5.0));
    }

    @Test
    public void rest(){
        assertEquals(1, math.rest(5.0, 2.0));
    }



}
