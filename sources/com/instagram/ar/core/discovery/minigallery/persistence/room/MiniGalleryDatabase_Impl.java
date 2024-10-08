package com.instagram.ar.core.discovery.minigallery.persistence.room;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W5;
import X.AnonymousClass000;
import X.AnonymousClass86N;
import X.AnonymousClass86O;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class MiniGalleryDatabase_Impl extends MiniGalleryDatabase {
    public volatile AnonymousClass86O A00;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, new HashMap(0), new HashMap(0), new String[]{"mini_gallery_categories"});
    }

    public final void clearAllTables() {
        String A002 = AnonymousClass000.A00(2400);
        super.assertNotMainThread();
        1W5 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `mini_gallery_categories`");
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
        return r5.A02.AKv(1VU.A00(r5.A00, new 1VR(r5, new AnonymousClass86N(this), "c8b02299555e0e46bf298e63f085303e", "abcc85944ad16268315a0f5f23ddd578"), r5.A04, false, false));
    }

    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(AnonymousClass86O.class, Collections.emptyList());
        return hashMap;
    }
}
