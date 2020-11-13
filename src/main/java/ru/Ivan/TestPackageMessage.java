package ru.Ivan;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestPackageMessage {
    private final String PACKAGE_ID = "packageId";
    private final String JS_SCRIPT = "packageId";
    private final String FUNCTION_NAME = "packageId";
    private final String TEST = "test";

    @JsonProperty(PACKAGE_ID)
    private Integer packageId;


    private String jsScript;
    private String functionName;
    private Test test;
}
