package com.facebook.minscript.compiler.interfaces;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class MinsCompilerResult {
    public ByteBuffer byteBuffer;
    public HashMap lispyOffsetMap;

    public MinsCompilerResult(ByteBuffer byteBuffer2, HashMap hashMap) {
        this.byteBuffer = byteBuffer2;
        this.lispyOffsetMap = hashMap;
    }
}
