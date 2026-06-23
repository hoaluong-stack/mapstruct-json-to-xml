package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertFalse;

class OrderXmlConverterTest {

    @Test
    void convertsInputJsonToExpectedXml() throws Exception {
        String actual = new OrderXmlConverter().convertFile(Path.of("src/main/resources/input/order.json"));
        String expected = Files.readString(Path.of("src/test/resources/expected/order.xml"));

        Diff diff = DiffBuilder.compare(expected)
                .withTest(actual)
                .ignoreWhitespace()
                .checkForSimilar()
                .build();

        assertFalse(diff.hasDifferences(), diff.toString());
    }
}
