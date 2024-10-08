package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VhB  reason: case insensitive filesystem */
public final class C17858VhB {
    public final AnonymousClass0iw A00;
    public final 0xF A01;
    public final UserSession A02;
    public final C20949X6c A03;

    public final void A00(1Xj r10, int i, int i2) {
        0qQ.A0B(r10, 0);
        C20949X6c x6c = this.A03;
        int C3k = x6c.C3k();
        0xI A002 = VBN.A00(this.A00, this.A01, r10, (String) null, i, i2);
        A002.A09(C273654mx.A00(791), Boolean.valueOf(AnonymousClass7TF.A1Q(C3k)));
        A002.A04(C18217Vnh.A00(r10).A00());
        C16672Uz8 C3h = x6c.C3h();
        int C3k2 = x6c.C3k();
        A002.A0C("feed_type", C3h.toString());
        A002.A0B("tab_index", Long.valueOf((long) C3k2));
        DbU.A1R(A002, this.A02);
    }

    public C17858VhB(AnonymousClass0iw r1, 0xF r2, UserSession userSession, C20949X6c x6c) {
        AnonymousClass7TG.A1Q(userSession, x6c);
        this.A00 = r1;
        this.A02 = userSession;
        this.A03 = x6c;
        this.A01 = r2;
    }
}
