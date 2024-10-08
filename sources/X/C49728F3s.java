package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F3s  reason: case insensitive filesystem */
public final class C49728F3s {
    public final 1QP A00;
    public final UserSession A01;

    public C49728F3s(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass1QO.A00(userSession);
    }

    public final void A04(EWT ewt, String str) {
        0qQ.A0B(str, 1);
        long j = ewt.A00;
        if (j != 0) {
            this.A00.flowEndFail(j, str, (String) null);
            ewt.A00 = 0;
        }
    }

    public final void A00(EWT ewt, Integer num) {
        long j = ewt.A00;
        if (j != 0) {
            this.A00.flowMarkPoint(j, C49062Eog.A00(num));
        }
    }

    public final void A01(EWT ewt, Integer num) {
        long j = ewt.A00;
        if (j != 0) {
            if (num != null) {
                this.A00.flowMarkPoint(j, C49062Eog.A00(num));
            }
            this.A00.flowEndSuccess(ewt.A00);
            ewt.A00 = 0;
        }
    }

    public final void A02(EWT ewt, Integer num) {
        1QP r3 = this.A00;
        long A002 = r3.A00(AnonymousClass05K.A00, ewt.A01, ewt.A02);
        ewt.A00 = A002;
        if (num != null) {
            r3.flowMarkPoint(A002, C49062Eog.A00(num));
        }
    }

    public final void A03(EWT ewt, String str) {
        long j = ewt.A00;
        if (j != 0) {
            this.A00.flowEndCancel(j, str);
            ewt.A00 = 0;
        }
    }

    public final void A05(EWT ewt, String str, String str2) {
        long j = ewt.A00;
        if (j != 0) {
            this.A00.flowAnnotate(j, str, str2);
        }
    }
}
