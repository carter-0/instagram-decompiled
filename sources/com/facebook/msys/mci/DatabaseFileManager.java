package com.facebook.msys.mci;

import X.AnonymousClass669;

public class DatabaseFileManager {
    public static native void deleteDatabaseFilesForPathNative(String str);

    public static native void encryptAndDeleteDatabaseNative(long j, String str);

    static {
        AnonymousClass669.A00();
    }
}
