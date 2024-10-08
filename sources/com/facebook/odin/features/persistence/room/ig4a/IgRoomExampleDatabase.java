package com.facebook.odin.features.persistence.room.ig4a;

import X.AnonymousClass401;
import X.AnonymousClass402;
import com.instagram.roomdb.IgRoomDatabase;

public abstract class IgRoomExampleDatabase extends IgRoomDatabase {
    public static final AnonymousClass401 A00 = new Object();

    public final AnonymousClass402 A00() {
        AnonymousClass402 r0;
        IgRoomExampleDatabase_Impl igRoomExampleDatabase_Impl = (IgRoomExampleDatabase_Impl) this;
        if (igRoomExampleDatabase_Impl.A00 != null) {
            return igRoomExampleDatabase_Impl.A00;
        }
        synchronized (igRoomExampleDatabase_Impl) {
            if (igRoomExampleDatabase_Impl.A00 == null) {
                igRoomExampleDatabase_Impl.A00 = new AnonymousClass402(igRoomExampleDatabase_Impl);
            }
            r0 = igRoomExampleDatabase_Impl.A00;
        }
        return r0;
    }
}
