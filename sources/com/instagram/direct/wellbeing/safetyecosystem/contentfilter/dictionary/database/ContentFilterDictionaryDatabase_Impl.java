package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W5;
import X.AnonymousClass92S;
import X.AnonymousClass92T;
import X.AnonymousClass92U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ContentFilterDictionaryDatabase_Impl extends ContentFilterDictionaryDatabase {
    public volatile AnonymousClass92U A00;
    public volatile AnonymousClass92T A01;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, new HashMap(0), new HashMap(0), new String[]{"content_filter_dictionary_metadata", "content_filter_dictionary_entries", "content_filter_dictionary_client_availability"});
    }

    public final 1VY createOpenHelper(1VI r5) {
        return r5.A02.AKv(1VU.A00(r5.A00, new 1VR(r5, new AnonymousClass92S(this), "9914a74bbddde2b9b1a1ca667c5e7298", "0e90a579cfcb054df3728e50be237697"), r5.A04, false, false));
    }

    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(AnonymousClass92T.class, Collections.emptyList());
        hashMap.put(AnonymousClass92U.class, Collections.emptyList());
        return hashMap;
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W5 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("PRAGMA defer_foreign_keys = TRUE");
            CGp.AT6("DELETE FROM `content_filter_dictionary_metadata`");
            CGp.AT6("DELETE FROM `content_filter_dictionary_entries`");
            CGp.AT6("DELETE FROM `content_filter_dictionary_client_availability`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            CGp.E5k("PRAGMA wal_checkpoint(FULL)").close();
            if (!CGp.A00.inTransaction()) {
                CGp.AT6("VACUUM");
            }
        }
    }
}
