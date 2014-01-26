package shiver.me.timbers.transform.json.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class JsonObject extends CompositeTokenTransformation {
    public static final String NAME = "jsonObject";

    public JsonObject(TokenApplier applyer) {
        super(NAME, applyer);
    }
}
