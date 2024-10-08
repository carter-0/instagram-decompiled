package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class I56 {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r12, AnonymousClass4DU r13, AnonymousClass3W1 r14, C249763kK r15, String str, String str2, int i, boolean z) {
        UserSession userSession2 = userSession;
        1Xj r6 = r12;
        AnonymousClass4DU r7 = r13;
        C51974G9v.A1M(r13, userSession, r12);
        AnonymousClass3W1 r8 = r14;
        0qQ.A0B(r14, 5);
        1Ng A00 = AnonymousClass1Nd.A00(userSession);
        String str3 = str2;
        int i2 = i;
        I6U.A04(userSession, r6, r7, str3, i2);
        HFY hfy = new HFY(A00, 1);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (A03(userSession) || A02(userSession)) {
            C55115HcO.A00().A06(fragmentActivity2, userSession2, r6, r7, r8, hfy, i2, z);
        } else {
            C55115HcO.A00().A01(fragmentActivity2, userSession2, r6, r7, r8, hfy, r15, str, str3, i2);
        }
        C57076INq.A00(A00, true);
    }

    public static final boolean A01(UserSession userSession) {
        if (!A02(userSession)) {
            Boolean BBu = DbV.A0k(userSession).BBu();
            0xa A0q = AnonymousClass7TE.A0q(userSession);
            String A00 = AnonymousClass000.A00(625);
            boolean z = A0q.getBoolean(A00, false);
            if (BBu != null) {
                if (!0qQ.A0K(Boolean.valueOf(z), BBu)) {
                    1Av A002 = 1Au.A00(userSession);
                    DbX.A1V(A002.A01, A00, BBu.booleanValue());
                }
                z = BBu.booleanValue();
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        Boolean BAo = DbV.A0k(userSession).BAo();
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        String A00 = AnonymousClass000.A00(623);
        boolean z = A0q.getBoolean(A00, false);
        if (BAo == null) {
            return z;
        }
        if (!0qQ.A0K(Boolean.valueOf(z), BAo)) {
            1Av A002 = 1Au.A00(userSession);
            DbX.A1V(A002.A01, A00, BAo.booleanValue());
        }
        return BAo.booleanValue();
    }

    public static final boolean A03(UserSession userSession) {
        boolean A01 = A01(userSession);
        int i = 3;
        if (A01) {
            i = 1;
        }
        if (AnonymousClass4k9.A00(userSession).A00.getInt("direct_collab_collection_feed_creation_nux_impression_count", 0) < i || A01) {
            return true;
        }
        return false;
    }
}
