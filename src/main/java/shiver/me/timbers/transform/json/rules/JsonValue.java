package shiver.me.timbers.transform.json.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class JsonValue extends CompositeTokenTransformation {
    public static final String NAME = "jsonValue";

    public JsonValue(TokenApplier applyer) {
        super(NAME, applyer);
    }
}
