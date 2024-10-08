package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PZM  reason: case insensitive filesystem */
public final /* synthetic */ class C73242PZM implements Runnable {
    public final /* synthetic */ AnonymousClass48S A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C73242PZM(AnonymousClass48S r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass48S r3 = this.A00;
        String str = this.A01;
        synchronized (r3) {
            Long l = 2Eq.A00;
            AnonymousClass3U9 r8 = r3.A0I;
            if (!l.equals(r8.C6I())) {
                C370748x0.A00();
                UserSession userSession = r3.A0H;
                0qQ.A0B(userSession, 0);
                C66840MdY A012 = C66843Mdb.A01(userSession);
                long currentTimeMillis = System.currentTimeMillis();
                long A0P = AnonymousClass7TE.A0P(C2611348j.A01(str));
                C66847Mdg.A00(new C58745Iws(r8, A0P, 1, currentTimeMillis), A012.A00);
                C370748x0.A00();
                C67353MmU mmU = C66833MdR.A00(userSession).A01;
                long longValue = r8.C6I().longValue();
                C67354MmV mmV = (C67354MmV) mmU.A02.A02();
                C251983oI r9 = mmV.A00;
                r9.assertNotSuspendingTransaction();
                1Vg r82 = mmV.A02;
                AnonymousClass1WV acquire = r82.acquire();
                acquire.ADa(1, (long) ((int) JTR.A0L()));
                acquire.ADa(2, longValue);
                acquire.ADh(3, str);
                try {
                    r9.beginTransaction();
                    acquire.ATQ();
                    r9.setTransactionSuccessful();
                    r9.endTransaction();
                    r82.release(acquire);
                } catch (Throwable th) {
                    r82.release(acquire);
                    throw th;
                }
            }
        }
    }
}
