import TDD.model.Dictionary;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Enumeration;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {

    public Dictionary dict;

    @Before
    public void initialize(){
        dict = new Dictionary("Example");
    }

    @After
    public void initialize2 (){
        dict = null;
    }

    @Test
    public void testDictionaryName() {

        assertThat(dict.getName(), equalTo("Example"));
    }

    @Test
    public void testDictionaryisEmpty() {

        assertThat(dict.isEmpty(), equalTo("Empty"));
    }

    @Test
    public void testOneTranslation(){
        dict.addTranslation("rouge","red");
        assertThat(dict.getTranslation("rouge"), equalTo("red"));
    }
}
