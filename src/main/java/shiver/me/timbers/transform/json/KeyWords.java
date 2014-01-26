package shiver.me.timbers.transform.json;

import shiver.me.timbers.transform.antlr4.StaticNameListBuilder;
import shiver.me.timbers.transform.json.types.False;
import shiver.me.timbers.transform.json.types.Null;
import shiver.me.timbers.transform.json.types.True;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.unmodifiableList;

/**
 * This class contains constants to help with parsing Java keywords.
 */
public final class KeyWords {

    private KeyWords() {
    }

    /**
     * All the transformation types of the Java keyword types.
     */
    @SuppressWarnings("unchecked")
    public static final List<Class> KEYWORDS = unmodifiableList(Arrays.<Class>asList(True.class, False.class,
            Null.class));

    /**
     * All the names of the Java keyword types.
     */
    @SuppressWarnings("unchecked")
    public static final List<String> KEYWORD_NAMES = unmodifiableList(
            new StaticNameListBuilder((Iterable) KEYWORDS).build());
}
