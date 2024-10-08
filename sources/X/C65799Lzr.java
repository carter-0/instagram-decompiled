package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lzr  reason: case insensitive filesystem */
public final class C65799Lzr implements MUP {
    public final /* synthetic */ C65229LpZ A00;

    public final void Cha(String str) {
        0qQ.A0B(str, 0);
        C65229LpZ lpZ = this.A00;
        UserSession userSession = lpZ.A0J;
        C22031Xty.A09(lpZ.A0I, userSession, (Long) null, lpZ.A0P, "composer", str);
        C59847JaN.A00(userSession).A04("SHARE_TO_OPTION_TOGGLE_TAPPED");
    }

    public final void Civ(String str) {
        0qQ.A0B(str, 0);
        C65229LpZ lpZ = this.A00;
        C22031Xty.A0E(lpZ.A0I, lpZ.A0J, lpZ.A0P, "composer", str);
    }

    public C65799Lzr(C65229LpZ lpZ) {
        this.A00 = lpZ;
    }
}
