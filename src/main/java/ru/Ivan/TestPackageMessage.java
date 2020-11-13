package ru.Ivan;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestPackageMessage {
    private final String PACKAGE_ID = "packageId";
    private final String JS_SCRIPT = "jsScript";
    private final String FUNCTION_NAME = "functionName";
    private final String TESTS = "tests";

    @JsonProperty(PACKAGE_ID)
    private Integer packageId;

    @JsonProperty(JS_SCRIPT)
    private String jsScript;

    @JsonProperty(FUNCTION_NAME)
    private String functionName;

    @JsonProperty(TESTS)
    private Test test;

    @JsonCreator
    TestPackageMessage(@JsonProperty(PACKAGE_ID) Integer packageId, @JsonProperty(JS_SCRIPT) String jsScript,
                       @JsonProperty(FUNCTION_NAME) String functionName, @JsonProperty(TESTS) Test test) {
        
    }
}
