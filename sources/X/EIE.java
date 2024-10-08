package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public final class EIE extends 0ng {
    public final /* synthetic */ C229382nI A00;
    public final /* synthetic */ C49520Ewz A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIE(C229382nI r4, C49520Ewz ewz, String str) {
        super(58704531, 3, false, false);
        this.A01 = ewz;
        this.A02 = str;
        this.A00 = r4;
    }

    public final void run() {
        C49520Ewz ewz = this.A01;
        String str = this.A02;
        Context A04 = DbT.A04();
        if (str.length() != 0) {
            C249713kF r0 = C249713kF.A00;
            UserSession userSession = ewz.A00;
            r0.A0g(A04, userSession, str);
            C249713kF.A00.A0f(A04, userSession, str);
        }
        C229382nI r5 = this.A00;
        Context A042 = DbT.A04();
        INE ine = new INE(4);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        new BitSet(0);
        FBO.A00(ine, "com.bloks.www.bloks.commerce.cart.globalstatepublish.async", A1E, A1E2).A01(A042, r5);
        HashMap A1E3 = AnonymousClass7TE.A1E();
        HashMap A0v = DbX.A0v();
        A1E3.put("merchant_id", str);
        FBO.A00(ine, "com.bloks.www.bloks.commerce.cart.globalstatepublish.secondary.async", A1E3, A0v).A01(A042, r5);
        HashMap A1E4 = AnonymousClass7TE.A1E();
        HashMap A0v2 = DbX.A0v();
        A1E4.put("merchant_id", str);
        A1E4.put("is_empty_cart", false);
        A1E4.put("is_one_page_cart", AnonymousClass7TE.A0v());
        FBO.A00(ine, "com.bloks.www.bloks.commerce.cart.promotion.async", A1E4, A0v2).A01(A042, r5);
    }
}
