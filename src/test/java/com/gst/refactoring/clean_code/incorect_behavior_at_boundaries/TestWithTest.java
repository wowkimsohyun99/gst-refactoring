package com.gst.refactoring.clean_code.incorect_behavior_at_boundaries;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestWithTest {
    private WithTest wt = new WithTest();

    @ParameterizedTest(name = "{index} : {2}")
    @MethodSource("testConvertNumberArgumentProvider")
    void testConvertNumber_ShouldReturnNumber(String stringValue, int expectedResult, String caseDescription) {
        int actualResult = wt.convertStringToIntNumber(stringValue);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    public static Stream<Arguments> testConvertNumberArgumentProvider() {
        return Stream.of(
                Arguments.of("123", 123, "Invalid number -> Should return that number"),
                Arguments.of("-2147483648", -2147483648, "Number at boundary --> Return that number"),
                Arguments.of("-2147483648111", 0, "Number out bound --> Return 0")
        );
    }
}