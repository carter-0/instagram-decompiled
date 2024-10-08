package com.facebook.msys.mci;

import X.AnonymousClass669;

public class SqlUtils {
    public static native void disableSqliteMemoryStatus();

    public static native void enableCustomAllocationTracker();

    public static native void enableSqliteMultiThreadAndroid();

    public static native void enableSqliteSmallMalloc();

    public static native boolean isMultiThreadEnabled();

    public static native void setSqliteLookasideAllocation(long j, long j2);

    public static native void setSqliteMMAPSize(long j);

    static {
        AnonymousClass669.A00();
    }
}
