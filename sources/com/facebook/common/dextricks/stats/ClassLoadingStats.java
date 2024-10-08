package com.facebook.common.dextricks.stats;

import java.util.concurrent.atomic.AtomicReference;

public abstract class ClassLoadingStats {
    public static final AtomicReference A00 = new AtomicReference();

    public abstract void decrementDexFileQueries();

    public abstract int getClassLoadsAttempted();

    public abstract int getClassLoadsFailed();

    public abstract int getDexFileQueries();

    public abstract int getIncorrectDfaGuesses();

    public abstract int getLocatorAssistedClassLoads();

    public abstract void incrementClassLoadsAttempted();

    public abstract void incrementClassLoadsFailed();

    public abstract void incrementDexFileQueries(int i);

    public abstract void incrementIncorrectDfaGuesses();

    public final class SnapshotStats {
        public final int A00;
        public final int A01;
        public final int A02;
        public final int A03;
        public final int A04;

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.common.dextricks.stats.ClassLoadingStats.SnapshotStats.toString():java.lang.String, dex: classes.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:292)
            	at jadx.core.ProcessClass.process(ProcessClass.java:36)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            Caused by: java.lang.ArrayIndexOutOfBoundsException
            */
        public final java.lang.String toString() {
            /*
            // Can't load method instructions: Load method exception: null in method: com.facebook.common.dextricks.stats.ClassLoadingStats.SnapshotStats.toString():java.lang.String, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.stats.ClassLoadingStats.SnapshotStats.toString():java.lang.String");
        }

        public SnapshotStats(int i, int i2, int i3, int i4, int i5) {
            this.A00 = i;
            this.A01 = i2;
            this.A02 = i3;
            this.A04 = i4;
            this.A03 = i5;
        }
    }
}
