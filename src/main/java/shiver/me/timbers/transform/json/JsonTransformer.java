package shiver.me.timbers.transform.json;

import shiver.me.timbers.antlr4.json.JsonParser;
import shiver.me.timbers.transform.antlr4.Antlr4StringTransformer;

import javax.activation.MimeType;

/**
 * A StringTransformer for XML, it will apply any Transformations that have names matching the different token and rule
 * names. These names can be found in the {@link JsonParser#tokenNames} and {@link JsonParser#ruleNames} arrays.
 */
public class JsonTransformer extends Antlr4StringTransformer<JsonParser> {

    public static final MimeType APPLICATION_JSON = quietMimeType("application", "json");

    public JsonTransformer() {
        super(APPLICATION_JSON, new JsonParserBuilder());
    }
}
