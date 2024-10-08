package com.instagram.debug.devoptions.sandboxselector;

import X.1VI;
import X.1VK;
import X.1VY;
import X.1W6;
import X.1wT;
import X.AnonymousClass1VQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11152SCh;
import X.C21053XCe;
import X.C21055XCg;
import X.C21056XCh;
import X.C21382XZp;
import X.C21501Xd6;
import X.C66579MXk;
import X.RS9;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class DevServerDatabase_Impl extends DevServerDatabase {
    public volatile DevServerDao _devServerDao;

    public 1VK createInvalidationTracker() {
        return new 1VK(this, C21053XCe.A0h(0), C21053XCe.A0h(0), new String[]{C66579MXk.A00(342)});
    }

    public 1VY createOpenHelper(1VI r4) {
        return C21055XCg.A06(r4, new AnonymousClass1VQ(2) {
            public void onPostMigrate(1W6 r1) {
            }

            public C21382XZp onValidateSchema(1W6 r9) {
                HashMap A0h = C21053XCe.A0h(5);
                C21055XCg.A1T("url", "TEXT", A0h);
                boolean A0U = C21056XCh.A0U(DevServerEntity.COLUMN_HOST_TYPE, "TEXT", A0h);
                A0h.put(DevServerEntity.COLUMN_DESCRIPTION, C21055XCg.A05(DevServerEntity.COLUMN_DESCRIPTION, "TEXT", (String) null, A0U ? 1 : 0));
                String A00 = C66579MXk.A00(C11152SCh.MAX_FACTORIAL);
                A0h.put(A00, C21055XCg.A05(A00, "INTEGER", (String) null, A0U));
                String A002 = C66579MXk.A00(694);
                HashSet A0X = C21055XCg.A0X(A002, C21055XCg.A05(A002, "INTEGER", (String) null, A0U), A0h, A0U);
                HashSet hashSet = new HashSet(A0U);
                String A003 = C66579MXk.A00(342);
                C21501Xd6 xd6 = new C21501Xd6(A003, A0h, A0X, hashSet);
                C21501Xd6 A004 = RS9.A00(r9, A003);
                if (xd6.equals(A004)) {
                    return new C21382XZp(true, (String) null);
                }
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("internal_dev_servers(com.instagram.debug.devoptions.sandboxselector.DevServerEntity).\n Expected:\n");
                A1A.append(xd6);
                return new C21382XZp(A0U, AnonymousClass7TG.A0m(A004, "\n Found:\n", A1A));
            }

            public void createAllTables(1W6 r2) {
                C21053XCe.A0m(r2, "CREATE TABLE IF NOT EXISTS `internal_dev_servers` (`url` TEXT NOT NULL, `host_type` TEXT NOT NULL, `description` TEXT NOT NULL, `supports_vpnless` INTEGER NOT NULL, `cache_timestamp` INTEGER NOT NULL, PRIMARY KEY(`url`))");
                r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e6dc2489d6d7dd6a7bd1559f3d1eecd6')");
            }

            public void dropAllTables(1W6 r3) {
                r3.AT6("DROP TABLE IF EXISTS `internal_dev_servers`");
                List list = DevServerDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C21055XCg.A0b(r3, it);
                    }
                }
            }

            public void onCreate(1W6 r3) {
                List list = DevServerDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C21053XCe.A0n(r3, it);
                    }
                }
            }

            public void onOpen(1W6 r3) {
                DevServerDatabase_Impl.this.mDatabase = r3;
                DevServerDatabase_Impl.this.internalInitInvalidationTracker(r3);
                List list = DevServerDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C21053XCe.A0o(r3, it);
                    }
                }
            }

            public void onPreMigrate(1W6 r1) {
                1wT.A01(r1);
            }
        }, "e6dc2489d6d7dd6a7bd1559f3d1eecd6", "33101b4f13ce603fe64f216109f0c3b8");
    }

    public DevServerDao devServerDao() {
        DevServerDao devServerDao;
        if (this._devServerDao != null) {
            return this._devServerDao;
        }
        synchronized (this) {
            if (this._devServerDao == null) {
                this._devServerDao = new DevServerDao_Impl(this);
            }
            devServerDao = this._devServerDao;
        }
        return devServerDao;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        1W6 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `internal_dev_servers`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            C21056XCh.A0E(CGp);
        }
    }

    public List getAutoMigrations(Map map) {
        return AnonymousClass7TE.A1C();
    }

    public Set getRequiredAutoMigrationSpecs() {
        return AnonymousClass7TE.A1F();
    }

    public Map getRequiredTypeConverters() {
        HashMap A1E = AnonymousClass7TE.A1E();
        C21053XCe.A1P(DevServerDao.class, A1E);
        return A1E;
    }
}
