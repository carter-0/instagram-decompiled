package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.MaI  reason: case insensitive filesystem */
public final class C66649MaI {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = C73907Pli.A00(this, 37);
    public final C62320sa A03;

    public C66649MaI(Context context, UserSession userSession, C62320sa r4) {
        0qQ.A0B(r4, 3);
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = r4;
    }

    public final boolean A09(AnonymousClass2Ep r7) {
        UserSession userSession = this.A01;
        if (C66648MaH.A01(userSession, r7) && A06(r7)) {
            return true;
        }
        if (r7.BHS() != 0 || !A05(r7)) {
            return false;
        }
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36314932035193759L) && A08(r7)) {
            return false;
        }
        boolean CUG = r7.CUG();
        if (0oI.A0C(this.A00)) {
            return (182.A06(r3, userSession, 2342153680641327341L) || A0D(CUG)) && !r7.CVr() && !r7.Ca9() && !A00(r7.C6a());
        }
        return false;
    }

    public final boolean A0B(C331527Ri r5) {
        String CDs;
        if (r5.CKo() && (CDs = r5.CDs()) != null && ((1X9) this.A02.getValue()).A04(this.A01, CDs)) {
            return true;
        }
        return false;
    }

    public final boolean A0C(C331527Ri r8) {
        0qQ.A0B(r8, 0);
        UserSession userSession = this.A01;
        boolean z = true;
        if (r8.C6a() != 1014 || !182.A06(0Tu.A05, userSession, 36330204939174409L)) {
            z = false;
        }
        if (z && r8.CdJ(this.A00, userSession)) {
            return true;
        }
        if (C66648MaH.A03(userSession, r8) && r8.CdI(this.A00, userSession)) {
            return true;
        }
        if (!r8.CKo() || !r8.CVV()) {
            return false;
        }
        Context context = this.A00;
        if (!r8.CdH(context, userSession)) {
            return false;
        }
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36314932035193759L) && r8.CeM(context, userSession)) {
            return false;
        }
        boolean CUG = r8.CUG();
        if (!0oI.A0C(context)) {
            return false;
        }
        if ((182.A06(r3, userSession, 2342153680641327341L) || A0D(CUG)) && !r8.CVr() && !r8.Ca9() && !A00(r8.C6a())) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C66649MaI maI, String str, 0sn<User> r5) {
        if (str == null) {
            List<User> list = r5;
            if (r5 == null) {
                list = 0sn.A00;
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (User BIW : list) {
                    if (BIW.BIW() == 1) {
                        return false;
                    }
                }
            }
        }
        if (r5 == null) {
            r5 = 0sn.A00;
        }
        if ((r5 instanceof Collection) && r5.isEmpty()) {
            return true;
        }
        for (User isVerified : r5) {
            if (isVerified.isVerified()) {
                if (!182.A06(0Tu.A05, maI.A01, 36316147510939650L)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final boolean A0D(boolean z) {
        UserSession userSession = this.A01;
        boolean isVerified = AnonymousClass7TF.A0Q(userSession).isVerified();
        if (z || !isVerified || !182.A06(0Tu.A05, userSession, 36315481791007990L)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(int i) {
        if (!AnonymousClass48O.A02(i)) {
            Integer valueOf = Integer.valueOf(i);
            if (AnonymousClass48O.A06(valueOf) || AnonymousClass48O.A07(valueOf)) {
                return true;
            }
            return false;
        }
        return true;
    }

    private final boolean A02(C331527Ri r5) {
        String CDs = r5.CDs();
        if (!C51969G9p.A1a(r5.Azh(), C69277Nid.NO_E2EE)) {
            if (CDs == null || CDs.length() == 0 || ((1X9) this.A02.getValue()).A03(this.A01, CDs)) {
                return false;
            }
        } else if (r5.CJY() || r5.CJW()) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public final boolean A03(2Eq r4) {
        String CDs = r4.CDs();
        if (CDs == null || CDs.length() == 0 || ((1X9) this.A02.getValue()).A03(this.A01, CDs) || !((AnonymousClass3U9) r4).A01.A2J) {
            return false;
        }
        return true;
    }

    public final boolean A04(2Eq r4) {
        String CDs = r4.CDs();
        if (CDs == null || CDs.length() == 0 || ((1X9) this.A02.getValue()).A03(this.A01, CDs) || ((AnonymousClass3U9) r4).A01.A2J) {
            return false;
        }
        return true;
    }

    public final boolean A05(AnonymousClass2Ep r6) {
        if (r6.BXY() <= 1) {
            return false;
        }
        if (r6.C6C() == null || r6.BMT() != AnonymousClass05K.A0N) {
            if (!182.A06(0Tu.A05, this.A01, 36312105946710927L)) {
                return false;
            }
        }
        if (C66641MaA.A00(r6) || C377809Ni.A00(r6)) {
            return false;
        }
        UserSession userSession = this.A01;
        if (C377819Nj.A04(userSession, r6) || C377829Nk.A00(userSession, r6)) {
            return false;
        }
        boolean isPending = r6.isPending();
        boolean CUG = r6.CUG();
        if (C66640Ma9.A04(r6.BRZ(), r6.BSK(), isPending, CUG) || r6.CVr()) {
            return false;
        }
        return true;
    }

    public final boolean A06(AnonymousClass2Ep r3) {
        if (C66641MaA.A00(r3) || C377819Nj.A04(this.A01, r3) || C66640Ma9.A00(r3)) {
            return false;
        }
        return true;
    }

    public final boolean A07(AnonymousClass2Ep r3) {
        if (C66641MaA.A00(r3) || C377819Nj.A04(this.A01, r3) || C66640Ma9.A00(r3)) {
            return false;
        }
        return true;
    }

    public final boolean A08(AnonymousClass2Ep r4) {
        User user = (User) 00k.A0N(r4.BRZ());
        if (user == null || user.A0J() != 16V.A05 || !user.isVerified()) {
            return false;
        }
        return true;
    }

    public final boolean A0A(C331527Ri r2) {
        if (A02(r2) && !r2.CJW()) {
            return true;
        }
        if (!A02(r2) || !r2.CJW()) {
            return false;
        }
        return true;
    }
}
