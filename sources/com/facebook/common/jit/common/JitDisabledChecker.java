package com.facebook.common.jit.common;

public final class JitDisabledChecker {
    public static final boolean sIsJitDisabled = false;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.common.jit.common.JitDisabledChecker.testCompileMethod(int):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static boolean testCompileMethod(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.common.jit.common.JitDisabledChecker.testCompileMethod(int):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.jit.common.JitDisabledChecker.testCompileMethod(int):boolean");
    }
}
