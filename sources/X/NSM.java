package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase;

public final class NSM extends 0ng {
    public final /* synthetic */ 1hV A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ Long A02;

    public final void run() {
        long currentTimeMillis;
        Long l = this.A01;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        C370748x0.A00();
        UserSession userSession = this.A00.A00;
        0qQ.A0B(userSession, 0);
        C67351MmS A002 = C66833MdR.A00(userSession);
        long longValue = this.A02.longValue();
        ArmadilloExpressEncryptedBackupDatabase armadilloExpressEncryptedBackupDatabase = A002.A01.A02;
        NT9 nt9 = (NT9) armadilloExpressEncryptedBackupDatabase.A01();
        C251983oI r7 = nt9.A00;
        r7.assertNotSuspendingTransaction();
        1Vg r6 = nt9.A02;
        AnonymousClass1WV acquire = r6.acquire();
        acquire.ADa(1, longValue);
        try {
            r7.beginTransaction();
            acquire.ATQ();
            r7.setTransactionSuccessful();
            r7.endTransaction();
            r6.release(acquire);
            NT8 nt8 = (NT8) armadilloExpressEncryptedBackupDatabase.A00();
            r7 = nt8.A00;
            r7.assertNotSuspendingTransaction();
            r6 = nt8.A02;
            acquire = r6.acquire();
            acquire.ADa(1, longValue);
            r7.beginTransaction();
            acquire.ATQ();
            r7.setTransactionSuccessful();
            r7.endTransaction();
            r6.release(acquire);
            C67354MmV mmV = (C67354MmV) armadilloExpressEncryptedBackupDatabase.A02();
            r7 = mmV.A00;
            r7.assertNotSuspendingTransaction();
            r6 = mmV.A01;
            acquire = r6.acquire();
            acquire.ADa(1, longValue);
            r7.beginTransaction();
            acquire.ATQ();
            r7.setTransactionSuccessful();
            r7.endTransaction();
            r6.release(acquire);
            C370748x0.A00();
            C66843Mdb.A01(userSession).A0A(longValue, currentTimeMillis);
        } catch (Throwable th) {
            r6.release(acquire);
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSM(1hV r2, Long l, Long l2) {
        super(345018030);
        this.A00 = r2;
        this.A01 = l;
        this.A02 = l2;
    }
}
