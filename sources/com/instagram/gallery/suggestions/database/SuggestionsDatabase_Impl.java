package com.instagram.gallery.suggestions.database;

import X.1VI;
import X.1VK;
import X.1VY;
import X.1W6;
import X.AnonymousClass7TE;
import X.C21053XCe;
import X.C21055XCg;
import X.C21056XCh;
import X.C273654mx;
import X.C64086LMe;
import X.L4Z;
import X.XH2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SuggestionsDatabase_Impl extends SuggestionsDatabase {
    public volatile L4Z A00;
    public volatile C64086LMe A01;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, C21053XCe.A0h(0), C21053XCe.A0h(0), new String[]{"suggestions", "suggestion_medium"});
    }

    public final C64086LMe A00() {
        C64086LMe lMe;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C64086LMe(this);
            }
            lMe = this.A01;
        }
        return lMe;
    }

    public final 1VY createOpenHelper(1VI r4) {
        return C21055XCg.A06(r4, new XH2(this), "1ff21b556f1ac0738d52f2ae83a7be4f", "52806978387d0f02a31efb4d8f6da22e");
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W6 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6(C273654mx.A00(491));
            CGp.AT6("DELETE FROM `suggestions`");
            CGp.AT6("DELETE FROM `suggestion_medium`");
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
        C21053XCe.A1P(C64086LMe.class, A1E);
        C21053XCe.A1P(L4Z.class, A1E);
        return A1E;
    }
}
