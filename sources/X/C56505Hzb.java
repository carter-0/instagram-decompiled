package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hzb  reason: case insensitive filesystem */
public final class C56505Hzb {
    public final UserSession A00;
    public final AnonymousClass0r6 A01;

    public C56505Hzb(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C58028IkL(1, this, 10q.A04(new AnonymousClass0r6[]{new 0rr(true), new AnonymousClass64X(AnonymousClass1Nd.A00(userSession)).A00(AnonymousClass2Ny.class), new AnonymousClass64X(AnonymousClass1Nd.A00(userSession)).A00(C2370936h.class)}));
    }

    public static final String A00(C56505Hzb hzb, String str) {
        AnonymousClass3Q2 A03 = 28K.A00(hzb.A00).A03(str);
        if (A03 == null) {
            return null;
        }
        if (A03.A11()) {
            return A03.A35;
        }
        String str2 = A03.A3O;
        if (str2 != null) {
            return A00(hzb, str2);
        }
        return A03.A3Q;
    }
}
