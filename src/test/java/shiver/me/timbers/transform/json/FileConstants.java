package shiver.me.timbers.transform.json;

import static shiver.me.timbers.transform.language.test.FileUtils.readTestFileToString;

public final class FileConstants {

    private FileConstants() {
    }

    public static final String TEST_FILE_NAME = "Test.json";
    public static final String INVALID_TEST_FILE_NAME = "InvalidTest.json";
    public static final String TRANSFORMED_TEST_FILE_NAME = "Test.json.transformed";
    public static final String TRANSFORMED_KEYWORDS_TEST_FILE_NAME = "Test.json.keywords";
    public static final String TRANSFORMED_MEMBERS_TEST_FILE_NAME = "Test.json.members";
    public static final String TRANSFORMED_INVALID_TEST_FILE_NAME = "InvalidTest.json.transformed";
    public static final String TRANSFORMED_TYPES_TEST_FILE_NAME = "Test.json.types";
    public static final String TRANSFORMED_RULES_TEST_FILE_NAME = "Test.json.rules";

    public static final String TEST_FILE_SOURCE = readTestFileToString(FileConstants.class, TEST_FILE_NAME);
    public static final String INVALID_TEST_FILE_SOURCE = readTestFileToString(FileConstants.class,
            INVALID_TEST_FILE_NAME);


    public static final String TRANSFORMED_TEST_FILE_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_TEST_FILE_NAME);
    public static final String TRANSFORMED_KEYWORDS_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_KEYWORDS_TEST_FILE_NAME);
    public static final String TRANSFORMED_MEMBERS_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_MEMBERS_TEST_FILE_NAME);
    public static final String TRANSFORMED_INVALID_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_INVALID_TEST_FILE_NAME);
    public static final String TRANSFORMED_TYPES_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_TYPES_TEST_FILE_NAME);
    public static final String TRANSFORMED_RULES_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_RULES_TEST_FILE_NAME);
}
