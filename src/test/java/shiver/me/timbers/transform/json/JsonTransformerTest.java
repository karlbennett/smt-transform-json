package shiver.me.timbers.transform.json;

import org.junit.Test;
import shiver.me.timbers.transform.antlr4.IterableTokenTransformations;
import shiver.me.timbers.transform.language.test.TransformerTestTemplate;

import static org.junit.Assert.*;
import static shiver.me.timbers.transform.json.FileConstants.*;
import static shiver.me.timbers.transform.json.TransformationsConstants.*;

public class JsonTransformerTest implements TransformerTestTemplate {

    @Test
    @Override
    public void testCreate() {

        new JsonTransformer();
    }

    @Test
    @Override
    public void testTransform() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_TEST_FILE_SOURCE,
                new JsonTransformer().transform(TEST_FILE_SOURCE, ALL_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformKeywordsOnly() {

        assertEquals("only the keywords should be transformed.", TRANSFORMED_KEYWORDS_SOURCE,
                new JsonTransformer().transform(TEST_FILE_SOURCE, KEYWORD_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformCommentsOnly() {

        assertEquals("only the members should be transformed.", TRANSFORMED_MEMBERS_SOURCE,
                new JsonTransformer().transform(TEST_FILE_SOURCE, MEMBER_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithInvalidSource() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_INVALID_SOURCE,
                new JsonTransformer().transform(INVALID_TEST_FILE_SOURCE, ALL_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithTypesOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_TYPES_SOURCE,
                new JsonTransformer().transform(TEST_FILE_SOURCE, TYPES_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithRulesOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_RULES_SOURCE,
                new JsonTransformer().transform(TEST_FILE_SOURCE, RULES_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithNoTransformations() {

        assertEquals("the source should be Transformed correctly.", TEST_FILE_SOURCE,
                new JsonTransformer().transform(TEST_FILE_SOURCE, new IterableTokenTransformations())
        );
    }

    @Test
    @Override
    public void testTransformWithIrrelevantTransformations() {

        assertEquals("the source should be Transformed correctly.", TEST_FILE_SOURCE,
                new JsonTransformer().transform(TEST_FILE_SOURCE, UNUSED_TRANSFORMATIONS));
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testTransformWithNullTransformations() {

        new JsonTransformer().transform(TEST_FILE_SOURCE, null);
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testTransformWithNullInput() {

        new JsonTransformer().transform(null, ALL_TRANSFORMATIONS);
    }
}
