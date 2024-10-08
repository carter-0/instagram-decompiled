package com.instagram.sponsored.asyncads.requestpathsignals.persistence.room;

import X.1VI;
import X.1VK;
import X.1VY;
import X.1W6;
import X.AnonymousClass7TE;
import X.C21053XCe;
import X.C21055XCg;
import X.C21056XCh;
import X.LS6;
import X.XH2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class QSRealtimeSignalDatabase_Impl extends QSRealtimeSignalDatabase {
    public volatile LS6 A00;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, C21053XCe.A0h(0), C21053XCe.A0h(0), new String[]{"qs_realtime_signals"});
    }

    public final 1VY createOpenHelper(1VI r4) {
        return C21055XCg.A06(r4, new XH2(this, 5), "6b331a521c9eacb44b168743dbfa0089", "866ba076d913963249696084e2574573");
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W6 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `qs_realtime_signals`");
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
        C21053XCe.A1P(LS6.class, A1E);
        return A1E;
    }
}
