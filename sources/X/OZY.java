package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class OZY {
    public final UserSession A00;

    public final void A02(C69405Nkj nkj, DirectThreadKey directThreadKey, Integer num, String str, String str2, String str3) {
        Integer num2;
        String str4 = str;
        String str5 = str3;
        DbW.A1O(str4, 3, str5);
        C69405Nkj nkj2 = nkj;
        boolean A1W = AnonymousClass7TF.A1W(nkj2, C69405Nkj.SHH_MODE);
        boolean A1W2 = AnonymousClass7TF.A1W(nkj2, C69405Nkj.DISAPPEARING_MESSAGE);
        DirectThreadKey directThreadKey2 = directThreadKey;
        String str6 = directThreadKey2.A00;
        AnonymousClass6EC r0 = AnonymousClass6EB.A02;
        UserSession userSession = this.A00;
        String str7 = userSession.A06;
        String str8 = str2;
        r0.A00(userSession, str7, new C74195Pqb(this, str8, str4, "Removed", str6, A1W2, A1W));
        if (182.A06(0Tu.A05, userSession, 2342161901212998304L)) {
            Integer num3 = AnonymousClass05K.A01;
            C66886MeO meO = new C66886MeO(directThreadKey2, Boolean.valueOf(A1W), Boolean.valueOf(A1W2), num3, str4, str7, str5, str8);
            MeP meP = (MeP) MZr.A00.getValue();
            if (num == num3) {
                num2 = AnonymousClass05K.A0N;
            } else {
                num2 = AnonymousClass05K.A0C;
            }
            MeP.A02(userSession, meO, meP, num2);
        }
    }

    public final void A03(C254703su r10, 2Eq r11, OCY ocy) {
        String A0g;
        N1Z n1z;
        2Eq r6 = r11;
        0qQ.A0B(r11, 0);
        String C6C = r11.C6C();
        C254703su r5 = r10;
        if (r10.A1S()) {
            A0g = r10.A0f();
        } else {
            A0g = r10.A0g();
        }
        A00(r10, this, C6C, A0g, "Insert");
        if (A01(r10, this)) {
            if (ocy instanceof C69053Ndp) {
                n1z = ((C69053Ndp) ocy).A00;
            } else {
                n1z = null;
            }
            UserSession userSession = this.A00;
            MeP.A02(userSession, new C66886MeO(n1z, r5, r6, AnonymousClass05K.A01, userSession.A06), (MeP) MZr.A00.getValue(), AnonymousClass05K.A00);
        }
    }

    public static final void A00(C254703su r11, OZY ozy, String str, String str2, String str3) {
        boolean z = r11.A2P;
        boolean A1T = r11.A1T();
        String str4 = r11.A1h;
        AnonymousClass6EC r2 = AnonymousClass6EB.A02;
        UserSession userSession = ozy.A00;
        r2.A00(userSession, userSession.A06, new C74195Pqb(ozy, str4, str2, str3, str, A1T, z));
    }

    public static final boolean A01(C254703su r4, OZY ozy) {
        UserSession userSession = ozy.A00;
        AnonymousClass0eM r0 = MZr.A00;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320360873992544L) || ((r4.A2P && 182.A06(r2, userSession, 36320360873927007L)) || ((r4.A1T() && 182.A06(r2, userSession, 36320360874058081L)) || 182.A06(r2, userSession, 36320360874189155L)))) {
            return true;
        }
        return false;
    }

    public OZY(UserSession userSession) {
        this.A00 = userSession;
    }
}
