import org.junit.Test;

import java.util.Dictionary;

import static net.bytebuddy.matcher.ElementMatchers.is;

public class DictionaryTest {

    @Test
    public void testDictionaryName(){
        Dictionary dict = new Dictionary("Example");
        assertThat(dict.getName(), is (equals("Example")));

    }
}
