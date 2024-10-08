package com.instagram.notifications.persistence.room;

import X.AnonymousClass5GU;
import X.AnonymousClass5GY;
import com.instagram.roomdb.IgDeviceScopedRoomDatabase;

public abstract class IgNotificationsDatabase extends IgDeviceScopedRoomDatabase {
    public static final AnonymousClass5GU A00 = new Object();

    public final AnonymousClass5GY A00() {
        AnonymousClass5GY r0;
        IgNotificationsDatabase_Impl igNotificationsDatabase_Impl = (IgNotificationsDatabase_Impl) this;
        if (igNotificationsDatabase_Impl.A00 != null) {
            return igNotificationsDatabase_Impl.A00;
        }
        synchronized (igNotificationsDatabase_Impl) {
            if (igNotificationsDatabase_Impl.A00 == null) {
                igNotificationsDatabase_Impl.A00 = new AnonymousClass5GY(igNotificationsDatabase_Impl);
            }
            r0 = igNotificationsDatabase_Impl.A00;
        }
        return r0;
    }
}
