package com.instagram.direct.securityalert.data.room;

import X.1VI;
import X.1VK;
import X.1VY;
import X.1W6;
import X.AnonymousClass7TE;
import X.C21053XCe;
import X.C21055XCg;
import X.C21056XCh;
import X.C65279LqY;
import X.C66558MWm;
import X.OFP;
import X.XH2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SecurityAlertDatabase_Impl extends SecurityAlertDatabase {
    public volatile OFP A00;
    public volatile C66558MWm A01;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, C21053XCe.A0h(0), C21053XCe.A0h(0), new String[]{"security_alert", "participant_device_change"});
    }

    public final 1VY createOpenHelper(1VI r4) {
        return C21055XCg.A06(r4, new XH2(this, 2, 42), "8a33cd745df9f5bcd6b94548c17b2894", "661210226e621143d7d122ae46330c34");
    }

    public final OFP A00() {
        OFP ofp;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new OFP(this);
            }
            ofp = this.A00;
        }
        return ofp;
    }

    public final C66558MWm A01() {
        C66558MWm mWm;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C65279LqY(this);
            }
            mWm = this.A01;
        }
        return mWm;
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W6 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `security_alert`");
            CGp.AT6("DELETE FROM `participant_device_change`");
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
        C21053XCe.A1P(C66558MWm.class, A1E);
        C21053XCe.A1P(OFP.class, A1E);
        return A1E;
    }
}
