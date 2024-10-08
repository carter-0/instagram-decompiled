package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.8nb  reason: invalid class name and case insensitive filesystem */
public final class C365738nb {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public final 1Bk A06;
    public final UserSession A07;

    public static final Boolean A00(C365738nb r4) {
        Boolean bool = r4.A05;
        boolean z = false;
        if (bool == null) {
            bool = false;
            r4.A05 = bool;
        }
        if (bool.booleanValue()) {
            Boolean bool2 = r4.A03;
            if (bool2 == null) {
                bool2 = false;
                r4.A03 = bool2;
            }
            if (0qQ.A0K(Boolean.valueOf(bool2.booleanValue()), true)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final boolean A01(C365738nb r2) {
        Boolean CSL;
        User A012 = AnonymousClass0t1.A01.A01(r2.A07);
        if ((2Ek.A00(A012) || 2Ek.A01(A012)) && (CSL = A012.A03.CSL()) != null && CSL.booleanValue()) {
            return true;
        }
        return false;
    }

    public C365738nb(UserSession userSession) {
        this.A07 = userSession;
        1Bl r2 = 1Bk.A03;
        0qQ.A0B(userSession, 1);
        this.A06 = r2.A01(new AnonymousClass2z0(userSession, "smb_support_sticker_prefs"));
    }
}
