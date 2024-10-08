package com.instagram.creation.persistence;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W5;
import X.2NO;
import X.2NP;
import X.2NU;
import X.AnonymousClass000;
import X.AnonymousClass2NQ;
import X.AnonymousClass2NR;
import X.AnonymousClass2NS;
import X.AnonymousClass2NT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class CreationDatabase_Impl extends CreationDatabase {
    public volatile AnonymousClass2NQ A00;
    public volatile AnonymousClass2NR A01;
    public volatile AnonymousClass2NT A02;
    public volatile AnonymousClass2NS A03;
    public volatile 2NP A04;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, new HashMap(0), new HashMap(0), new String[]{"drafts", "audio_amplitudes", "audio_tracks", "clips_remix_original_media", "story_drafts"});
    }

    public final 2NP A00() {
        2NP r0;
        if (this.A04 != null) {
            return this.A04;
        }
        synchronized (this) {
            if (this.A04 == null) {
                this.A04 = new 2NU(this);
            }
            r0 = this.A04;
        }
        return r0;
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W5 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6(AnonymousClass000.A00(2191));
            CGp.AT6("DELETE FROM `audio_amplitudes`");
            CGp.AT6("DELETE FROM `audio_tracks`");
            CGp.AT6("DELETE FROM `clips_remix_original_media`");
            CGp.AT6("DELETE FROM `story_drafts`");
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
        return r5.A02.AKv(1VU.A00(r5.A00, new 1VR(r5, new 2NO(this), "84dc2eaff08ae87ec0ecc1161d786465", "699b348b375f52d34fe3b8a66fd2ae52"), r5.A04, false, false));
    }

    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(2NP.class, Collections.emptyList());
        hashMap.put(AnonymousClass2NQ.class, Collections.emptyList());
        hashMap.put(AnonymousClass2NR.class, Collections.emptyList());
        hashMap.put(AnonymousClass2NS.class, Collections.emptyList());
        hashMap.put(AnonymousClass2NT.class, Collections.emptyList());
        return hashMap;
    }
}
