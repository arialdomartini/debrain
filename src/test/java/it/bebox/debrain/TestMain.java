package it.bebox.debrain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestMain {

    @Test
    public void pass(){
        assertThat(new Main().main(null), is(0));
    }
}
