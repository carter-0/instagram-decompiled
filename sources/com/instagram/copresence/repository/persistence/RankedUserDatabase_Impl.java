package com.instagram.copresence.repository.persistence;

import X.1VI;
import X.1VK;
import X.1VR;
import X.1VU;
import X.1VY;
import X.1W6;
import X.AnonymousClass7TE;
import X.C21053XCe;
import X.C21056XCh;
import X.C67511Mp6;
import X.C67514Mp9;
import X.XH2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class RankedUserDatabase_Impl extends RankedUserDatabase {
    public volatile C67514Mp9 A00;
    public volatile C67511Mp6 A01;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, C21053XCe.A0h(0), C21053XCe.A0h(0), new String[]{"bff_ranked_user_model", "call_recipients_ranked_user_model"});
    }

    public final 1VY createOpenHelper(1VI r6) {
        return r6.A02.AKv(1VU.A00(r6.A00, new 1VR(r6, new XH2(this, 0), "9fa95391669f185532ef5e2f5dc372b1", "d5a4bafc77d01750ab88f760a554e243"), r6.A04, false, false));
    }

    public final C67514Mp9 A00() {
        C67514Mp9 mp9;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new C67514Mp9(this);
            }
            mp9 = this.A00;
        }
        return mp9;
    }

    public final C67511Mp6 A01() {
        C67511Mp6 mp6;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C67511Mp6(this);
            }
            mp6 = this.A01;
        }
        return mp6;
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W6 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `bff_ranked_user_model`");
            CGp.AT6("DELETE FROM `call_recipients_ranked_user_model`");
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
        C21053XCe.A1P(C67514Mp9.class, A1E);
        C21053XCe.A1P(C67511Mp6.class, A1E);
        return A1E;
    }
}
