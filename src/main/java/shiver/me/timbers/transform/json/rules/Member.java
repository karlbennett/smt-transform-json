package shiver.me.timbers.transform.json.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Member extends CompositeTokenTransformation {
    public static final String NAME = "member";

    public Member(TokenApplier applyer) {
        super(NAME, applyer);
    }
}
