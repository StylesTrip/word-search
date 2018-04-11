package com.ryan.kata.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InputParser {

    public List<String> parseHeader(String filePath) throws IOException {
        List<String> headerWords = new ArrayList<>();

        String header = Files.lines(Paths.get(filePath))
                .findFirst()
                .get();
        headerWords.add(header);

        return headerWords;
    }
}
