package ru.Ivan;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Test {
    private final String TEST_NAME = "testName";
    private final String EXPECTED_RESULT = "expectedResult";
    private final String PARAMS = "params";
    private final String RESULT = "result";

    @JsonProperty(TEST_NAME)
    private String testName;

    @JsonProperty(EXPECTED_RESULT)
    private String expectedResult;

    @JsonProperty(PARAMS)
    private ArrayList<Integer> params;

    @JsonProperty(RESULT)
    private boolean result;

    @JsonCreator
    public Test(@JsonProperty(TEST_NAME) String testName, @JsonProperty(EXPECTED_RESULT) expectedResult,
            @JsonProperty(PARAMS) ArrayList<Integer> params, @JsonProperty(RESULT) boolean result) {
        
    }



}
