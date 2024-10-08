package com.facebook.distribgw.client;

public class DGWPersonalizationProperty {
    public final int DEFAULT;
    public final int HIGH;
    public final int LOW;
    public final int MID;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.distribgw.client.DGWPersonalizationProperty.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.distribgw.client.DGWPersonalizationProperty.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.distribgw.client.DGWPersonalizationProperty.toString():java.lang.String");
    }

    public DGWPersonalizationProperty(int i, int i2, int i3, int i4) {
        this.HIGH = i;
        this.MID = i2;
        this.LOW = i3;
        this.DEFAULT = i4;
    }
}
