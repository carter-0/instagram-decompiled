package com.facebook.profilo.provider.stacktrace;

import java.util.concurrent.atomic.AtomicReference;

public class ArtCompatibility {
    public static final AtomicReference sIsCompatible = null;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static boolean isCompatible(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }

    public static native boolean nativeCheck(int i);
}
