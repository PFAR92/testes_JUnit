package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<Objects>().get(0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException{

        List<Objects> list = new ArrayList<Objects>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        list.get(0);
    }

    @Test
    public void testExceptionMessage(){
        try {
            new ArrayList<Objects>().get(0);
            fail("Esperando que IndexOutOfBoundsException seja lançada");
        } catch (IndexOutOfBoundsException ex) {
            assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
        }
    }
}
