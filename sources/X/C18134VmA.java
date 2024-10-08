package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VmA  reason: case insensitive filesystem */
public abstract class C18134VmA {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        int A0M = AnonymousClass7TE.A0M(r8.A02());
        int A0M2 = AnonymousClass7TE.A0M(r8.A00());
        UserSession A0B = C308206Td.A0B(r7);
        A01(C308206Td.A04(r7), C308206Td.A08(r7), A0B, C16666Uz2.REPORT_BUTTON, (String) r8.A01(), A0M, A0M2);
        return null;
    }

    public static void A01(FragmentActivity fragmentActivity, AnonymousClass0iw r8, UserSession userSession, C16666Uz2 uz2, String str, int i, int i2) {
        C14068TpH tpH;
        String valueOf = String.valueOf(i2);
        C14068TpH[] values = C14068TpH.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                tpH = null;
                break;
            }
            tpH = values[i3];
            if (0qQ.A0K(tpH.A00, valueOf)) {
                break;
            }
            i3++;
        }
        String valueOf2 = String.valueOf(i);
        C71093OcF A01 = ORV.A01(fragmentActivity, r8, userSession, tpH, C17125VIv.A00(valueOf2), str);
        A01.A02 = uz2;
        C16677UzD A00 = C17125VIv.A00(valueOf2);
        if (A00 == C16677UzD.COMMERCE_FB_REVIEW || A00 == C16677UzD.COMMERCE_IG_REVIEW || A00 == C16677UzD.COMMERCE_REVIEW_RESPONSE || A00 == C16677UzD.COMMERCE_FB_QUESTION || A00 == C16677UzD.COMMERCE_IG_QUESTION || A00 == C16677UzD.COMMERCE_PLATFORM_ANSWER || A00 == C16677UzD.COMMERCE_EXTERNAL_QUESTION || A00 == C16677UzD.COMMERCE_EXTERNAL_ANSWER) {
            A01.A0H = true;
        }
        C71093OcF.A00((C331157Pu) null, A01);
    }
}
