package shiver.me.timbers.transform.json.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class JsonText extends CompositeTokenTransformation {
    public static final String NAME = "jsonText";

    public JsonText(TokenApplier applyer) {
        super(NAME, applyer);
    }
}
