package com.facebook.common.dextricks;

import X.AnonymousClass972;

public final class Prio {
    public final int cpuPriority;
    public final int ioPriority;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.common.dextricks.Prio.with():com.facebook.common.dextricks.Prio$With, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public com.facebook.common.dextricks.Prio.With with() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.common.dextricks.Prio.with():com.facebook.common.dextricks.Prio$With, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.Prio.with():com.facebook.common.dextricks.Prio$With");
    }

    public static Prio lowest() {
        return new Prio(24576, 19);
    }

    public static Prio unchanged() {
        return new Prio(AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK);
    }

    public Prio ioOnly() {
        return new Prio(this.ioPriority, AnonymousClass972.MUTABLE_FLAG_MASK);
    }

    public boolean isDefault() {
        if (this.ioPriority >= 0 || this.cpuPriority >= 0) {
            return false;
        }
        return true;
    }

    public Prio(int i, int i2) {
        this.ioPriority = i;
        this.cpuPriority = i2;
    }
}
