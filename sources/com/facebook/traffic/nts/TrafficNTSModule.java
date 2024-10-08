package com.facebook.traffic.nts;

public final class TrafficNTSModule {
    public static final TrafficNTSModule INSTANCE = new Object();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.traffic.nts.TrafficNTSModule.loadLibrary():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void loadLibrary() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.traffic.nts.TrafficNTSModule.loadLibrary():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.traffic.nts.TrafficNTSModule.loadLibrary():void");
    }
}
