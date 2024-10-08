package com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb;

import X.1VI;
import X.1VK;
import X.1VY;
import X.1W6;
import X.AnonymousClass7TE;
import X.C21053XCe;
import X.C21055XCg;
import X.C21056XCh;
import X.C67354MmV;
import X.NT8;
import X.NT9;
import X.O4B;
import X.O4C;
import X.XH2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ArmadilloExpressEncryptedBackupDatabase_Impl extends ArmadilloExpressEncryptedBackupDatabase {
    public volatile MessageDeletesDao A00;
    public volatile O4B A01;
    public volatile O4C A02;

    public final 1VK createInvalidationTracker() {
        return new 1VK(this, C21053XCe.A0h(0), C21053XCe.A0h(0), new String[]{O4C.MESSAGES_TABLE_NAME, MessageDeletesDao.MESSAGE_DELETES_TABLE, O4B.MESSAGE_UPDATES_TABLE});
    }

    public final MessageDeletesDao A00() {
        MessageDeletesDao messageDeletesDao;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new NT8(this);
            }
            messageDeletesDao = this.A00;
        }
        return messageDeletesDao;
    }

    public final O4B A01() {
        O4B o4b;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new NT9(this);
            }
            o4b = this.A01;
        }
        return o4b;
    }

    public final O4C A02() {
        O4C o4c;
        if (this.A02 != null) {
            return this.A02;
        }
        synchronized (this) {
            if (this.A02 == null) {
                this.A02 = new C67354MmV(this);
            }
            o4c = this.A02;
        }
        return o4c;
    }

    public final 1VY createOpenHelper(1VI r4) {
        return C21055XCg.A06(r4, new XH2(this), "3c770570a042c4d5015e1ab84459d331", "1754e8552ba86a86a72e0026828d9e5f");
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        1W6 CGp = super.getOpenHelper().CGp();
        try {
            super.beginTransaction();
            CGp.AT6("DELETE FROM `messages_table`");
            CGp.AT6("DELETE FROM `message_deletes_table`");
            CGp.AT6("DELETE FROM `message_updates_table`");
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
        C21053XCe.A1P(O4C.class, A1E);
        C21053XCe.A1P(O4B.class, A1E);
        C21053XCe.A1P(MessageDeletesDao.class, A1E);
        return A1E;
    }
}
