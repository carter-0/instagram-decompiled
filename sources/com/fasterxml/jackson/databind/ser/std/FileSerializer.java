package com.fasterxml.jackson.databind.ser.std;

import java.io.File;

public class FileSerializer extends StdScalarSerializer {
    public FileSerializer() {
        super(File.class);
    }
}
