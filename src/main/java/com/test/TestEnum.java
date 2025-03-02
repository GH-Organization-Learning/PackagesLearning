package com.test;

public enum TestEnum {
    TEST_ENUM("Testing");
    private String description;

    TestEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

