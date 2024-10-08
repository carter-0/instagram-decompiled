package com.google.crypto.tink;

import java.io.InputStream;

public final class BinaryKeysetReader {
    public final InputStream A00;

    public BinaryKeysetReader(InputStream inputStream) {
        this.A00 = inputStream;
    }
}
