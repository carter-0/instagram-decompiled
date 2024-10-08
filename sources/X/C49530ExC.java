package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ExC  reason: case insensitive filesystem */
public final class C49530ExC {
    public final 0wc A00;
    public final 1Q9 A01;

    public C49530ExC(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        1Q9 A012 = 1Q9.A01("frx_reporting");
        this.A01 = A012;
        String str = A012.A02;
        0qQ.A07(str);
        this.A00 = DbW.A0J(userSession, str);
    }
}
