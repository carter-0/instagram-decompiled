package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LAz  reason: case insensitive filesystem */
public final class C63896LAz {
    public int A00;
    public boolean A01;
    public final UserSession A02;
    public final LR7 A03;
    public final C62165KbN A04;
    public final C62165KbN A05;
    public final C62165KbN A06;
    public final C62165KbN A07;
    public final String A08;

    public C63896LAz(UserSession userSession, LRD lrd, String str) {
        this.A02 = userSession;
        this.A08 = str;
        LR7 lr7 = new LR7(userSession.A06);
        this.A03 = lr7;
        this.A07 = new C62165KbN(this, str, 3);
        this.A04 = new C62165KbN(this, str, 0);
        this.A06 = new C62165KbN(this, str, 2);
        this.A05 = new C62165KbN(this, str, 1);
        lr7.A00 = lrd;
    }
}
