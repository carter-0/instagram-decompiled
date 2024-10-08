package com.facebook.common.dextricks.stats;

import com.facebook.jni.HybridData;

public final class ClassLoadingStatsNative extends ClassLoadingStats {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native void decrementDexFileQueries();

    public native int getClassLoadsAttempted();

    public native int getClassLoadsFailed();

    public native int getDexFileQueries();

    public native int getIncorrectDfaGuesses();

    public native int getLocatorAssistedClassLoads();

    public native void incrementClassLoadsAttempted();

    public native void incrementClassLoadsFailed();

    public native void incrementDexFileQueries(int i);

    public native void incrementIncorrectDfaGuesses();

    public native void incrementLocatorAssistedClassLoads();
}
