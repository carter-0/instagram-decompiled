package com.instagram.notifications.persistence.room;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W5;
import X.AnonymousClass5GW;
import X.AnonymousClass5GX;
import X.AnonymousClass5GY;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IgNotificationsDatabase_Impl extends IgNotificationsDatabase {
    public volatile AnonymousClass5GY A00;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, new HashMap(0), new HashMap(0), new String[]{"ignotifications", "newfeedstory"});
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W5 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `ignotifications`");
            CGp.AT6("DELETE FROM `newfeedstory`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            CGp.E5k("PRAGMA wal_checkpoint(FULL)").close();
            if (!CGp.A00.inTransaction()) {
                CGp.AT6("VACUUM");
            }
        }
    }

    public final 1VY createOpenHelper(1VI r5) {
        return r5.A02.AKv(1VU.A00(r5.A00, new 1VR(r5, new AnonymousClass5GW(this), "86dceb4730e308a832277a98aef7c261", "93f9b05e3eda7e6e38008e51a06dd432"), r5.A04, false, false));
    }

    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(AnonymousClass5GX.class, Collections.emptyList());
        hashMap.put(AnonymousClass5GY.class, Collections.emptyList());
        return hashMap;
    }
}
