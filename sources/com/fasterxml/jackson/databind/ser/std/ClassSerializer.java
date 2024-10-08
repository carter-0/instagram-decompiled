package com.fasterxml.jackson.databind.ser.std;

public class ClassSerializer extends StdScalarSerializer {
    public ClassSerializer() {
        super(Class.class);
    }
}
