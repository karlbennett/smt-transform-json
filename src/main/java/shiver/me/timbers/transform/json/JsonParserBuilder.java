package shiver.me.timbers.transform.json;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import shiver.me.timbers.antlr4.json.JsonLexer;
import shiver.me.timbers.antlr4.json.JsonParser;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.ParserBuilder;
import shiver.me.timbers.transform.antlr4.TokenTransformation;
import shiver.me.timbers.transform.antlr4.listeners.LoggingErrorListener;
import shiver.me.timbers.transform.antlr4.listeners.TransformationAwareErrorListener;

/**
 * A {@code ParserBuilder} for the ANTLR4 {@code JsonParser}.
 */
public class JsonParserBuilder implements ParserBuilder<JsonParser> {

    @Override
    public JsonParser buildParser(String source, Transformations<TokenTransformation> errorTransformations) {

        final CharStream charStream = new ANTLRInputStream(source);

        final JsonLexer lexer = new JsonLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LoggingErrorListener());

        final TokenStream tokenStream = new BufferedTokenStream(lexer);

        final JsonParser parser = new JsonParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new TransformationAwareErrorListener(new LoggingErrorListener(), errorTransformations));

        return parser;
    }

    @Override
    public ParseTree parse(JsonParser parser) {

        return parser.jsonText();
    }
}
