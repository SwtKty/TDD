import TDD.model.Dictionary;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Enumeration;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {

    public Dictionary dict = new Dictionary("Example");

    @Test
    public void testDictionaryName() {

        assertThat(dict.getName(), equalTo("Example"));
    }

    @Test
    public void testDictionaryisEmpty() {

        assertThat(dict.isEmpty(), equalTo("notEmpty"));
    }

    @Test
    public void testOneTranslation(){
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
    }
}
