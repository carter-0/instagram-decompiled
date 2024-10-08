package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HqG  reason: case insensitive filesystem */
public final class C55952HqG {
    public final String A00;
    public final String A01;
    public final 0wc A02;

    public C55952HqG(AnonymousClass0iw r2, UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A00(C54682HOn hOn, C62639Kk1 kk1) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "direct_group_change_name_image");
        if (A0e.isSampled()) {
            A0e.AAJ("open_thread_id", this.A01);
            C51965G9l.A19(hOn, A0e);
            DbS.A1N(A0e, this.A00);
            A0e.A8M(kk1, C66579MXk.A00(336));
            A0e.Cgf();
        }
    }
}
