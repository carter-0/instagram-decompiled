package com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W5;
import X.AnonymousClass000;
import X.C332397Uw;
import X.C332407Ux;
import X.C332417Uy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SafetyInterventionsDatabase_Impl extends SafetyInterventionsDatabase {
    public volatile C332417Uy A00;
    public volatile C332407Ux A01;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, new HashMap(0), new HashMap(0), new String[]{"global_impression_tracker", "user_impression_tracker"});
    }

    public final void clearAllTables() {
        String A002 = AnonymousClass000.A00(2400);
        super.assertNotMainThread();
        1W5 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `global_impression_tracker`");
            CGp.AT6("DELETE FROM `user_impression_tracker`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            CGp.E5k(A002).close();
            if (!CGp.A00.inTransaction()) {
                CGp.AT6("VACUUM");
            }
        }
    }

    public final 1VY createOpenHelper(1VI r5) {
        return r5.A02.AKv(1VU.A00(r5.A00, new 1VR(r5, new C332397Uw(this), "6c1551e9233e780b87a9e97472ec020e", "bc05b5e40cdd903050566d822051f47a"), r5.A04, false, false));
    }

    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C332407Ux.class, Collections.emptyList());
        hashMap.put(C332417Uy.class, Collections.emptyList());
        return hashMap;
    }
}
