package androidx.work.impl;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W5;
import X.AnonymousClass1VF;
import X.AnonymousClass38r;
import X.AnonymousClass390;
import X.AnonymousClass391;
import X.AnonymousClass392;
import X.AnonymousClass393;
import X.AnonymousClass394;
import X.AnonymousClass395;
import X.AnonymousClass396;
import X.AnonymousClass3A6;
import X.AnonymousClass3C5;
import X.AnonymousClass3CV;
import X.C2376538p;
import X.C2376638q;
import X.C2376938u;
import X.C2377038v;
import X.C2377138w;
import X.C2377238x;
import X.C2377438z;
import X.C238313Bj;
import X.C273654mx;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile AnonymousClass390 A00;
    public volatile AnonymousClass396 A01;
    public volatile AnonymousClass393 A02;
    public volatile AnonymousClass391 A03;
    public volatile AnonymousClass395 A04;
    public volatile AnonymousClass392 A05;
    public volatile AnonymousClass394 A06;
    public volatile C2377438z A07;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, new HashMap(0), new HashMap(0), new String[]{"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"});
    }

    public final AnonymousClass395 A01() {
        AnonymousClass395 r0;
        if (this.A04 != null) {
            return this.A04;
        }
        synchronized (this) {
            if (this.A04 == null) {
                this.A04 = new AnonymousClass3CV(this);
            }
            r0 = this.A04;
        }
        return r0;
    }

    public final AnonymousClass392 A02() {
        AnonymousClass392 r0;
        if (this.A05 != null) {
            return this.A05;
        }
        synchronized (this) {
            if (this.A05 == null) {
                this.A05 = new AnonymousClass3A6(this);
            }
            r0 = this.A05;
        }
        return r0;
    }

    public final AnonymousClass394 A04() {
        AnonymousClass394 r0;
        if (this.A06 != null) {
            return this.A06;
        }
        synchronized (this) {
            if (this.A06 == null) {
                this.A06 = new AnonymousClass3C5(this);
            }
            r0 = this.A06;
        }
        return r0;
    }

    public final C2377438z A05() {
        C2377438z r0;
        if (this.A07 != null) {
            return this.A07;
        }
        synchronized (this) {
            if (this.A07 == null) {
                this.A07 = new C238313Bj(this);
            }
            r0 = this.A07;
        }
        return r0;
    }

    public final 1VY createOpenHelper(1VI r5) {
        return r5.A02.AKv(1VU.A00(r5.A00, new 1VR(r5, new C2376538p(this), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032"), r5.A04, false, false));
    }

    public final List getAutoMigrations(Map map) {
        return Arrays.asList(new AnonymousClass1VF[]{new C2376638q(), new AnonymousClass38r(), new C2376938u(), new C2377038v(), new C2377138w(), new C2377238x()});
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C2377438z.class, Collections.emptyList());
        hashMap.put(AnonymousClass390.class, Collections.emptyList());
        hashMap.put(AnonymousClass391.class, Collections.emptyList());
        hashMap.put(AnonymousClass392.class, Collections.emptyList());
        hashMap.put(AnonymousClass393.class, Collections.emptyList());
        hashMap.put(AnonymousClass394.class, Collections.emptyList());
        hashMap.put(AnonymousClass395.class, Collections.emptyList());
        hashMap.put(AnonymousClass396.class, Collections.emptyList());
        return hashMap;
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W5 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6(C273654mx.A00(491));
            CGp.AT6("DELETE FROM `Dependency`");
            CGp.AT6("DELETE FROM `WorkSpec`");
            CGp.AT6("DELETE FROM `WorkTag`");
            CGp.AT6("DELETE FROM `SystemIdInfo`");
            CGp.AT6("DELETE FROM `WorkName`");
            CGp.AT6("DELETE FROM `WorkProgress`");
            CGp.AT6("DELETE FROM `Preference`");
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
