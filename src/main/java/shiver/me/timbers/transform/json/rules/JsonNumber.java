package shiver.me.timbers.transform.json.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class JsonNumber extends CompositeTokenTransformation {
    public static final String NAME = "jsonNumber";

    public JsonNumber(TokenApplier applyer) {
        super(NAME, applyer);
    }
}
