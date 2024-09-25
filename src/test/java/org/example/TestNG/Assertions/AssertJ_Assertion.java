package org.example.TestNG.Assertions;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertJ_Assertion {

    @Test
    public void test_verify()
    {
        String name = "Pramod";
        assertThat(name).isEqualTo("Pramod").isNotEmpty().isNotNull();
    }


}
