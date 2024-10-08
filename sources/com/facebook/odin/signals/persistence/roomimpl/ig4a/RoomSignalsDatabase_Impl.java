package com.facebook.odin.signals.persistence.roomimpl.ig4a;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W5;
import X.AnonymousClass40L;
import X.C261724Ar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class RoomSignalsDatabase_Impl extends RoomSignalsDatabase {
    public volatile AnonymousClass40L A00;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, new HashMap(0), new HashMap(0), new String[]{"signals"});
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W5 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `signals`");
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
        return r5.A02.AKv(1VU.A00(r5.A00, new 1VR(r5, new C261724Ar(this), "eead9bda19a66b723cc9e635c2c65732", "70557efde1a6c901c2fd2cf162953e0a"), r5.A04, false, false));
    }

    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(AnonymousClass40L.class, Collections.emptyList());
        return hashMap;
    }
}
