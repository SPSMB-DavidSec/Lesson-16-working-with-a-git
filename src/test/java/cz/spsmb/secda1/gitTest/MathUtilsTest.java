package cz.spsmb.secda1.gitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MathUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,10})
    void secondPowerTest(int number) {
        double expected = Math.pow(number,2);
        double result = MathUtils.secondPower(number);
        Assertions.assertEquals(expected, result);
    }
}