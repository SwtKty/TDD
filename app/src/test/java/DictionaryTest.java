import TDD.model.Dictionary;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Enumeration;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
        dict.addTranslation("contre","against","versus");
        assertThat(dict.getMultipleTranslation("contre"),containsInAnyOrder("against","versus"));
    }

    public void testInversTranslation(){

        assertThat(dict.getInverseTranslation("against"), equalTo("contre"));
    }
}
