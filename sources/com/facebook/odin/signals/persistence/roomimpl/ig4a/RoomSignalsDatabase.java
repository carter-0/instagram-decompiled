package com.facebook.odin.signals.persistence.roomimpl.ig4a;

import X.AnonymousClass40K;
import X.AnonymousClass40L;
import com.instagram.roomdb.IgRoomDatabase;

public abstract class RoomSignalsDatabase extends IgRoomDatabase {
    public static final AnonymousClass40K A00 = new Object();

    public final AnonymousClass40L A00() {
        AnonymousClass40L r0;
        RoomSignalsDatabase_Impl roomSignalsDatabase_Impl = (RoomSignalsDatabase_Impl) this;
        if (roomSignalsDatabase_Impl.A00 != null) {
            return roomSignalsDatabase_Impl.A00;
        }
        synchronized (roomSignalsDatabase_Impl) {
            if (roomSignalsDatabase_Impl.A00 == null) {
                roomSignalsDatabase_Impl.A00 = new AnonymousClass40L(roomSignalsDatabase_Impl);
            }
            r0 = roomSignalsDatabase_Impl.A00;
        }
        return r0;
    }
}
