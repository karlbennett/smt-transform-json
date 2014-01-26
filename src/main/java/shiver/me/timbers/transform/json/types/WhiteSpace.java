package shiver.me.timbers.transform.json.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class WhiteSpace extends CompositeTokenTransformation {
    public static final String NAME = "WS";

    public WhiteSpace(TokenApplier applyer) {
        super(NAME, applyer);
    }
}
