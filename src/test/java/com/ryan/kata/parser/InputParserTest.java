package com.ryan.kata.parser;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class InputParserTest {

    @Test
    public void parses_first_line_and_returns_correct_count() throws IOException {
        InputParser inputParser = new InputParser();
        List<String> wordsToSearch = inputParser.parseHeader("src/test/resources/firstLine.txt");

        Assert.assertEquals(1, wordsToSearch.size());
    }

    @Test
    public void parses_first_line_and_returns_correct_word() throws IOException {
        InputParser inputParser = new InputParser();
        List<String> wordsToSearch = inputParser.parseHeader("src/test/resources/firstLine.txt");

        Assert.assertEquals("RYAN", wordsToSearch.get(0));
    }
}
