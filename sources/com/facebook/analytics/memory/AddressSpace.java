package com.facebook.analytics.memory;

public final class AddressSpace {
    public static final AddressSpace INSTANCE = new Object();
    public static volatile boolean initialized;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.analytics.memory.AddressSpace.getLargestChunkKb():int, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final int getLargestChunkKb() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.analytics.memory.AddressSpace.getLargestChunkKb():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics.memory.AddressSpace.getLargestChunkKb():int");
    }

    public static final native int nativeGetLargestAddressSpaceChunkKb();
}
