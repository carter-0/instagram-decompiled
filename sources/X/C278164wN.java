package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4wN  reason: invalid class name and case insensitive filesystem */
public final class C278164wN {
    public 0xa A00;

    public static C278164wN A00(UserSession userSession) {
        return (C278164wN) userSession.A01(C278164wN.class, new C278174wO(userSession));
    }

    public final void A01(String str, boolean z) {
        0xY AR4 = this.A00.AR4();
        AR4.E5T(str, z);
        AR4.apply();
    }

    public final boolean A02(C270194gL r4) {
        0xa r2 = this.A00;
        String str = r4.A0X;
        str.getClass();
        return r2.getBoolean(str, false);
    }
}
