package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JiR  reason: case insensitive filesystem */
public final class C60270JiR extends 2YL {
    public final 2Fk A00;
    public final C64835Lix A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public static final boolean A00(C61069Jw7 jw7) {
        C62085KZp kZp;
        if (jw7.A00 != AnonymousClass05K.A00) {
            return false;
        }
        C62865Knf knf = (C62865Knf) jw7.A01;
        if (knf instanceof C62084KZo) {
            return true;
        }
        if (!(knf instanceof C62085KZp) || (kZp = (C62085KZp) knf) == null || kZp.A00 == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C60270JiR(UserSession userSession, String str, String str2, boolean z) {
        C64835Lix A002 = C63446KxB.A00(userSession, z);
        DbW.A1N(str, 2, A002);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A01 = A002;
        this.A00 = DbT.A0G(AnonymousClass11E.A01(10q.A01(new C66186MGx(this, (AnonymousClass4D7) null, 22), MCA.A00(this, A002.A0E(str2), 64))));
    }
}
