package com.instagram.direct.msys.plugins.msystamstoragedirectoryplugin;

import X.C300285wr;

public abstract class Sessionless {
    public abstract String MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPath();

    private String MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPathJNI() {
        String A00 = C300285wr.A00();
        if (A00 == null) {
            return null;
        }
        return A00;
    }
}
