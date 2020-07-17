package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LoopTest {

    @InjectMocks
    private Loop loop;

    @Spy
    private TestClass testClass;

    @Test
    public void test() {
        AssertionsForInterfaceTypes.assertThat(loop.test(10)).isTrue();
        Mockito.verify(testClass, Mockito.times(10)).print(Mockito.anyInt());
    }
}