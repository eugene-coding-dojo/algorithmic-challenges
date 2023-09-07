package ru.nergal.puzzles;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SortedArraysMergerTest {

    static Stream<TestData> testSourceData() {
        return Stream.of(
                // implemented test cases should be uncommented and moved to the top
/*
                // new test cases will appear here, in the commented out section
*/
                // this is the first case, just to start with something
                new TestData("The first array has some elements, the second one is empty", arrayWith(-1, 0, 1), emptyArray(), arrayWith(-1, 0, 1))
        );
    }


    @ParameterizedTest(name = "{0}")
    @MethodSource("testSourceData")
    void testArrayMerge(TestData testData) {
        assertThat(merge(testData.array1(), testData.array2()))
                .containsExactly(testData.expected());
    }

    private static int[] merge(int[] array1, int[] array2) {
        final SortedArraysMerger target = SortedArraysMerger.createFrom(array1, array2);
        return target.merge();
    }

    private static int[] emptyArray() {
        return arrayWith();
    }

    private static int[] arrayWith(int... elements) {
        return elements;
    }

    record TestData(String name, int[] array1, int[] array2, int[] expected) {
        @Override
        public String toString() {
            return this.name;
        }
    }
}