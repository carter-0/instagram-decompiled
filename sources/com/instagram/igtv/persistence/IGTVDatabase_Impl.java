package com.instagram.igtv.persistence;

import X.1VI;
import X.1VK;
import X.1VY;
import X.1W6;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.C21053XCe;
import X.C21055XCg;
import X.C21056XCh;
import X.JXF;
import X.XH2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IGTVDatabase_Impl extends IGTVDatabase {
    public volatile JXF A00;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, C21053XCe.A0h(0), C21053XCe.A0h(0), new String[]{"drafts"});
    }

    public final 1VY createOpenHelper(1VI r4) {
        return C21055XCg.A06(r4, new XH2(this), "fa0f0287d6550153fc6cd9d504c3a72d", "70e1ec6da29a4f47f581d0bd19f2361c");
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W6 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6(AnonymousClass000.A00(2191));
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            C21056XCh.A0E(CGp);
        }
    }

    public final List getAutoMigrations(Map map) {
        return AnonymousClass7TE.A1C();
    }

    public final Set getRequiredAutoMigrationSpecs() {
        return AnonymousClass7TE.A1F();
    }

    public final Map getRequiredTypeConverters() {
        HashMap A1E = AnonymousClass7TE.A1E();
        C21053XCe.A1P(JXF.class, A1E);
        return A1E;
    }
}
