package com.ryan.kata.parser;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InputParserTest {

    @Test
    public void parses_first_line_for_word_to_search() {
        InputParser inputParser = new InputParser();
        List<String> wordsToSearch = inputParser.parseHeader("../resources/firstLine.txt");

        Assert.assertEquals(1, wordsToSearch.size());
    }
}
