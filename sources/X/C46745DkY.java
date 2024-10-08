package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DkY  reason: case insensitive filesystem */
public final class C46745DkY extends 2YL {
    public final 05G A00;
    public final AnonymousClass0Ud A01;
    public final UserSession A02;

    public C46745DkY(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        String string = 1Au.A00(userSession).A01.getString("translate_to_language", 00R.A03(DbT.A10(AnonymousClass1Q2.A02()), 2));
        02z A10 = DbS.A10(string == null ? "" : string);
        this.A00 = A10;
        this.A01 = 10b.A03(A10);
    }
}
