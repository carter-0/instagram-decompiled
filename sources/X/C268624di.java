package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4di  reason: invalid class name and case insensitive filesystem */
public final class C268624di implements AnonymousClass1Cy {
    public C268634dj A00;
    public boolean A01;
    public final AnonymousClass1Cy A02;
    public final 0lg A03;

    public final AnonymousClass1T9 startRequest(1QS r5, 1QU r6, 1Qe r7) {
        C268704dr r2;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r7, 2);
        AnonymousClass1Cy r3 = this.A02;
        C268634dj r1 = this.A00;
        if (r1 != null) {
            synchronized (r1) {
                r2 = r1.A00.latestSessionId;
            }
            if (r2 != null) {
                r5.A01("x-fb-session-id", r2.A00());
                if (this.A01) {
                    r5.A01("x-fb-session-private", r2.A03);
                }
            }
        }
        AnonymousClass1T9 startRequest = r3.startRequest(r5, r6, r7);
        0qQ.A07(startRequest);
        return startRequest;
    }

    public C268624di(0lg r4, AnonymousClass1Cy r5) {
        this.A02 = r5;
        this.A03 = r4;
        UserSession A012 = 0Gl.A01(r4);
        if (A012 != null) {
            this.A00 = (C268634dj) A012.A01(C268634dj.class, new MMK(A012, 19));
        }
        this.A01 = 0yU.A07(AnonymousClass0yP.A00(36315391596891300L));
    }
}
