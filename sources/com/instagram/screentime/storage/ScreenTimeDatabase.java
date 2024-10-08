package com.instagram.screentime.storage;

import X.C278994xt;
import X.C279014xw;
import com.instagram.roomdb.IgRoomDatabase;

public abstract class ScreenTimeDatabase extends IgRoomDatabase {
    public static final C278994xt A00 = new Object();

    public final C279014xw A00() {
        C279014xw r0;
        ScreenTimeDatabase_Impl screenTimeDatabase_Impl = (ScreenTimeDatabase_Impl) this;
        if (screenTimeDatabase_Impl.A00 != null) {
            return screenTimeDatabase_Impl.A00;
        }
        synchronized (screenTimeDatabase_Impl) {
            if (screenTimeDatabase_Impl.A00 == null) {
                screenTimeDatabase_Impl.A00 = new C279014xw(screenTimeDatabase_Impl);
            }
            r0 = screenTimeDatabase_Impl.A00;
        }
        return r0;
    }
}
