package shiver.me.timbers.transform.json.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class JsonString extends CompositeTokenTransformation {
    public static final String NAME = "jsonString";

    public JsonString(TokenApplier applyer) {
        super(NAME, applyer);
    }
}
