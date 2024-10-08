package X;

import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.EqD  reason: case insensitive filesystem */
public abstract class C49146EqD {
    public static void A00(AnonymousClass4DH r8, UserSession userSession, String str) {
        C229382nI A02 = C229382nI.A02(r8, DbS.A0O("IGCartPrefetch"), userSession, (2el) null);
        INE ine = new INE(5);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        new BitSet(0);
        FBO.A00(ine, "com.bloks.www.bloks.commerce.cart.globalstatepublish.async", A1E, A1E2).A01(r8.requireContext(), A02);
        if (str != null) {
            HashMap A1E3 = AnonymousClass7TE.A1E();
            HashMap A0v = DbX.A0v();
            A1E3.put("merchant_id", str);
            FBO.A00(ine, "com.bloks.www.bloks.commerce.cart.globalstatepublish.secondary.async", A1E3, A0v).A01(r8.requireContext(), A02);
            HashMap A1E4 = AnonymousClass7TE.A1E();
            HashMap A0v2 = DbX.A0v();
            A1E4.put("merchant_id", str);
            A1E4.put("is_empty_cart", false);
            A1E4.put("is_one_page_cart", AnonymousClass7TE.A0v());
            FBO.A00(ine, "com.bloks.www.bloks.commerce.cart.promotion.async", A1E4, A0v2).A01(r8.requireContext(), A02);
        }
    }
}
