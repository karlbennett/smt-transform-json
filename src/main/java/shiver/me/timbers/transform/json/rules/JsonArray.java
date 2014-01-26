package shiver.me.timbers.transform.json.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class JsonArray extends CompositeTokenTransformation {
    public static final String NAME = "jsonArray";

    public JsonArray(TokenApplier applyer) {
        super(NAME, applyer);
    }
}
