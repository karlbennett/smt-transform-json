package shiver.me.timbers.transform.json;

import org.junit.Test;
import shiver.me.timbers.transform.language.test.ParserBuilderTestTemplate;

import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.buildParserTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.buildParserWithNullSourceStringTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.buildParserWithNullTransformationsTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.parseTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.parseWithNullParserTest;

public class JsonParserBuilderTest implements ParserBuilderTestTemplate {

    @Test
    @Override
    public void testBuildParser() {

        buildParserTest(new JsonParserBuilder());
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testBuildParserWithNullSourceString() {

        buildParserWithNullSourceStringTest(new JsonParserBuilder());
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testBuildParserWithNullTransformations() {

        buildParserWithNullTransformationsTest(new JsonParserBuilder());
    }

    @Test
    @Override
    public void testParse() {

        parseTest(new JsonParserBuilder());
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testParseWithNullParser() {

        parseWithNullParserTest(new JsonParserBuilder());
    }
}
