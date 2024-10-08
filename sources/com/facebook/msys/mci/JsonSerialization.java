package com.facebook.msys.mci;

import X.AnonymousClass1EI;
import X.C67541ts;

public class JsonSerialization {
    public static boolean sInitialized;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.msys.mci.JsonSerialization.initialize():boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static synchronized boolean initialize() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.msys.mci.JsonSerialization.initialize():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.JsonSerialization.initialize():boolean");
    }

    public static native void nativeInitialize();

    public static boolean isMCPEnabledForJsonSerialization() {
        synchronized (AnonymousClass1EI.class) {
        }
        return false;
    }

    static {
        C67541ts.A00();
    }
}
