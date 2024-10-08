package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MeW  reason: case insensitive filesystem */
public abstract class C66891MeW {
    public static final C66890MeV A00(UserSession userSession, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        MeX meX;
        if (!z || 2El.A0H(userSession)) {
            meX = new MeX(AnonymousClass05K.A01);
            meX.A07 = z3;
        } else {
            meX = new MeX(AnonymousClass05K.A0Y);
            meX.A07 = z3;
            int i2 = 2131975998;
            if (z2) {
                i2 = 2131973035;
            }
            meX.A00 = i2;
        }
        int i3 = 2131972857;
        if (z5) {
            i3 = 2131953205;
        }
        meX.A05 = z4;
        if (z4) {
            meX.A01 = i3;
        }
        meX.A06 = z6;
        meX.A08 = z7;
        meX.A02 = i;
        meX.A09 = z8;
        return new C66890MeV(meX);
    }
}
