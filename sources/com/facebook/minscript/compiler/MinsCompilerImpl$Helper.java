package com.facebook.minscript.compiler;

import X.0dV;
import com.facebook.minscript.compiler.interfaces.MinsCompilerResult;
import java.nio.ByteBuffer;

public class MinsCompilerImpl$Helper {
    public static native ByteBuffer doCompile(byte[] bArr, boolean z);

    public static native MinsCompilerResult doCompileWithLispyOffsets(byte[] bArr, boolean z, boolean z2);

    static {
        0dV.A0C("minscompiler-jni");
    }
}
