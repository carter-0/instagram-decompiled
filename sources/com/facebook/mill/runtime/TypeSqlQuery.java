package com.facebook.mill.runtime;

import java.io.Closeable;

public interface TypeSqlQuery extends Closeable {
    void setColumnTypes(byte[] bArr);
}
