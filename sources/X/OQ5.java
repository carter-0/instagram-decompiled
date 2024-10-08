package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public abstract class OQ5 {
    public static final void A00(C66957Mfq mfq, UserSession userSession, C69405Nkj nkj, String str, String str2) {
        C71068Oan oan;
        Set set;
        0qQ.A0B(userSession, 1);
        boolean z = true;
        boolean A1W = AnonymousClass7TF.A1W(nkj, C69405Nkj.SHH_MODE);
        boolean A1W2 = AnonymousClass7TF.A1W(nkj, C69405Nkj.DISAPPEARING_MESSAGE);
        if (!A1W && !A1W2) {
            z = false;
        }
        String str3 = userSession.A06;
        C71068Oan oan2 = mfq.A01;
        if (oan2 != null && 0qQ.A0K(oan2.A0D, str3) && (oan = mfq.A01) != null && oan.A05 != null) {
            if (z) {
                set = oan.A0H;
            } else {
                set = oan.A0G;
            }
            set.add(str2);
            if (str != null) {
                oan.A0I.add(str);
            }
            Runnable runnable = oan.A05;
            if (runnable != null) {
                C71068Oan.A01(oan, runnable, "SyncCompletion");
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A01(UserSession userSession, C69405Nkj nkj, C372178zu r6, String str, String str2) {
        String str3;
        C72939PPx pPx;
        Set set;
        0qQ.A0B(userSession, 1);
        boolean z = true;
        boolean A1W = AnonymousClass7TF.A1W(nkj, C69405Nkj.SHH_MODE);
        boolean A1W2 = AnonymousClass7TF.A1W(nkj, C69405Nkj.DISAPPEARING_MESSAGE);
        if (!A1W && !A1W2) {
            z = false;
        }
        String str4 = userSession.A06;
        C72939PPx pPx2 = r6.A02;
        if (pPx2 != null) {
            UserSession userSession2 = pPx2.A03;
            if (userSession2 != null) {
                str3 = userSession2.A06;
            } else {
                str3 = null;
            }
            if (0qQ.A0K(str3, str4) && (pPx = r6.A02) != null) {
                if (z) {
                    set = pPx.A08;
                } else {
                    set = pPx.A07;
                }
                set.add(str2);
                if (str != null) {
                    pPx.A09.add(str);
                }
                if (!pPx.A0A) {
                    0Jv r1 = pPx.A05;
                    if (r1 != null) {
                        C72939PPx.A03(pPx, r1, "SyncCompletion");
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
    }
}
