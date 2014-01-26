package shiver.me.timbers.transform.json.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class False extends CompositeTokenTransformation {
    public static final String NAME = "'false'";

    public False(TokenApplier applyer) {
        super(NAME, applyer);
    }
}
