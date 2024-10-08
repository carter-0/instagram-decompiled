package com.instagram.ar.core.effectcollection.persistence.room;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W5;
import X.C311966db;
import X.C311976dc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class EffectCollectionDatabase_Impl extends EffectCollectionDatabase {
    public volatile C311976dc A00;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, new HashMap(0), new HashMap(0), new String[]{"effects", "effect_collections", "effect_collections_effects"});
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W5 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `effects`");
            CGp.AT6("DELETE FROM `effect_collections`");
            CGp.AT6("DELETE FROM `effect_collections_effects`");
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
        return r5.A02.AKv(1VU.A00(r5.A00, new 1VR(r5, new C311966db(this), "6f1c5b41dc69a2e390b2e7eb0b9232d4", "e51aa4bfb9dcbd1dcbf04ae32687c3e6"), r5.A04, false, false));
    }

    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C311976dc.class, Collections.emptyList());
        return hashMap;
    }
}
