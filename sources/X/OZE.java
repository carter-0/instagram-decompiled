package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class OZE {
    public final UserSession A00;

    public static final void A00(1fi r7, OZE oze, C66515MUt mUt, C254783t2 r10, AnonymousClass3Q2 r11, String str) {
        String valueOf;
        String str2 = str;
        String str3 = r7.A05;
        if (str == null) {
            str2 = r7.A04.A03();
        }
        if (r7.A04.A0B) {
            valueOf = C66834MdS.A06(String.valueOf(r11.A2N));
        } else {
            valueOf = String.valueOf(r11.A2I);
        }
        if (valueOf == null) {
            mUt.DKR();
            return;
        }
        UserSession userSession = oze.A00;
        new C300915yA(userSession).A04(r10, str2, str3, String.valueOf(r11.A2I), r7.A04.A0B);
        O0W.A00(userSession).A00(mUt, str2);
    }

    public static final void A01(OZE oze, String str) {
        UserSession userSession = oze.A00;
        for (C47184Drz drz : C278384wn.A00(userSession).A00(str)) {
            C254783t2 r4 = (C254783t2) drz.A01;
            DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier((2FW) null, (String) null, drz.A02);
            String str2 = drz.A04;
            if (r4 != null) {
                2L2.A00(userSession).Ed4(directMessageIdentifier, r4, Integer.valueOf(drz.A00), str2);
            }
        }
    }

    public OZE(UserSession userSession) {
        this.A00 = userSession;
    }

    public final boolean A02(AnonymousClass3Q2 r9, String str, int i) {
        AnonymousClass7TG.A1N(str, r9);
        UserSession userSession = this.A00;
        int size = r9.A0L().size();
        1iA r7 = r9.A1G;
        0Tu A0J = DbS.A0J(r7, 4);
        if (((long) size) > 182.A01(A0J, userSession, 36607372064396864L) || ((r7 != 1iA.A0Q && r7 != 1iA.A09) || i != 1003 || !AnonymousClass7TE.A0q(userSession).C1t("odn_pre_send_inferencing_marked_threads").contains(str) || C66830MdO.A00(userSession, str) || !C66797Mcj.A00(userSession) || !182.A06(A0J, userSession, 36325897087563102L))) {
            return false;
        }
        return true;
    }
}
