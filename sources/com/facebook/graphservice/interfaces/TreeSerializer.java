package com.facebook.graphservice.interfaces;

import java.nio.ByteBuffer;

public interface TreeSerializer {
    Tree deserializeTreeFromByteBuffer(ByteBuffer byteBuffer, Class cls, int i);

    ByteBuffer serializeTreeToByteBuffer(Tree tree);
}
