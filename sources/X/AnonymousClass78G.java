package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.78G  reason: invalid class name */
public final class AnonymousClass78G implements AnonymousClass7DU {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7DU A02;

    /* renamed from: A00 */
    public final boolean DA8(AnonymousClass752 r13, C3263876o r14) {
        0qQ.A0B(r13, 0);
        0qQ.A0B(r14, 1);
        if (r13.A01 != null) {
            UserSession userSession = this.A01;
            C67000MgY.A00(this.A00, userSession, (Long) null, C66579MXk.A00(1119), "double_tap", "direct_thread", (String) null, 0Yt.A02(new 0eP[]{new 0eP(C66579MXk.A00(1192), String.valueOf(r13.A00.CU2()))}));
        }
        this.A02.DA8(r13, r14);
        return true;
    }

    public AnonymousClass78G(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7DU r3) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
    }
}
