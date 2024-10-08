package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Df8  reason: case insensitive filesystem */
public final class C46446Df8 extends C249383je {
    public final UserSession A00;
    public final G6S A01;

    public C46446Df8(UserSession userSession, G6S g6s) {
        this.A00 = userSession;
        this.A01 = g6s;
    }

    public final void onScroll(C238133Ar r5, int i, int i2, int i3, int i4, int i5) {
        int A03 = AnonymousClass0fD.A03(1972115335);
        for (int i6 = i; i6 < i + i2; i6++) {
            this.A01.EG6(this.A00, i6);
        }
        AnonymousClass0fD.A0A(-1362326756, A03);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(147355321, AnonymousClass0fD.A03(1215019731));
    }
}
