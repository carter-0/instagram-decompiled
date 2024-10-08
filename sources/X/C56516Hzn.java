package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hzn  reason: case insensitive filesystem */
public final class C56516Hzn {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = C58712IwL.A00(this, 28);

    public C56516Hzn(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A02(userSession);
    }

    public static final Long A00(String str) {
        if (str == null) {
            return null;
        }
        int A04 = 00l.A04(str, '_', 0);
        if (A04 != -1) {
            str = C51967G9n.A0q(str, 0, A04);
        }
        try {
            return AnonymousClass7TE.A10(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
