package operations;

import jdk.nashorn.internal.codegen.OptimisticTypesPersistence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    // structure: rule of AAA
    // Arrange part (its a prep part with the predefined fields if needed)
    // Act part with the execution
    // Assert part

    @Test
    public void devideReturnsDivisionsOfTwoNumbers() {

        Operations operations = new Operations();

        int result = operations.divide(6, 3);
        Assertions.assertEquals(2, result); // parameters: expected result and the actual result

    }

    @Test
    public void devideThrowsExceptionDivideByZero() {

        final Operations operations = new Operations();

        Assertions.assertThrows(ArithmeticException.class, new Executable() {
            public void execute() throws Throwable {
                operations.divide(6, 0);
            }
        });

    }

    @Test
    void multiplyTwoNumbers() {
        final Operations operations = new Operations();
        int result = operations.multiply(2, 3);
        Assertions.assertEquals(6, result);
    }


    @Test
    void sumTwoNumbers() {

        Operations operations = new Operations();
        int result = operations.sum(3, 3);
        Assertions.assertEquals(6, result);
    }

    @Test
    void differenceTwoNumbers() {

        Operations operations = new Operations();
        int result = operations.difference(6, 3);
        Assertions.assertEquals(3, result);

    }
}