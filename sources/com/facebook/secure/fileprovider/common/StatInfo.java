package com.facebook.secure.fileprovider.common;

public class StatInfo {
    public long device;
    public long inode;
    public int ownerGid;
    public int ownerUid;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.secure.fileprovider.common.StatInfo.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.secure.fileprovider.common.StatInfo.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.secure.fileprovider.common.StatInfo.toString():java.lang.String");
    }

    public static StatInfo newInstance(int i, int i2, long j, long j2) {
        return new StatInfo(i, i2, j, j2);
    }

    public StatInfo(int i, int i2, long j, long j2) {
        this.ownerUid = i;
        this.ownerGid = i2;
        this.inode = j;
        this.device = j2;
    }
}
