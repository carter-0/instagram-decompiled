package com.instagram.reels.persistence.room;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W5;
import X.C252133oc;
import X.C252143od;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class UserReelMediaDatabase_Impl extends UserReelMediaDatabase {
    public volatile C252143od A00;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, new HashMap(0), new HashMap(0), new String[]{"user_reel_medias"});
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W5 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `user_reel_medias`");
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
        return r5.A02.AKv(1VU.A00(r5.A00, new 1VR(r5, new C252133oc(this), "16bbe00e7a8a4894043a3e227f3a0164", "3afd7c2514d8841dee03ecd65bccf5ce"), r5.A04, false, false));
    }

    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C252143od.class, Collections.emptyList());
        return hashMap;
    }
}
