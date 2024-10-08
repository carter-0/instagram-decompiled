package X;

import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.UcH  reason: case insensitive filesystem */
public final class C15405UcH extends F3o {
    public final /* synthetic */ CheckoutLaunchParams A00;
    public final /* synthetic */ 1Y5 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C15405UcH(CheckoutLaunchParams checkoutLaunchParams, 1Y5 r2, String str, String str2) {
        this.A01 = r2;
        this.A00 = checkoutLaunchParams;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void A00() {
        HashMap hashMap = new HashMap();
        CheckoutLaunchParams checkoutLaunchParams = this.A00;
        hashMap.put("merchant_id", checkoutLaunchParams.A07);
        hashMap.put("receiver_id", checkoutLaunchParams.A06);
        String str = this.A03;
        hashMap.put("is_from_shopping_bag", new Boolean(str.equals("cart")).toString());
        hashMap.put("is_from_drops_onboarding", new Boolean(checkoutLaunchParams.A0B).toString());
        hashMap.put("products", this.A02);
        hashMap.put("is_bloks", "true");
        hashMap.put("source", str);
        C11190SEq sEq = this.A01.A00;
        0xI A002 = C11190SEq.A00(sEq, "cancel");
        A002.A0C("flow_step", "init_load");
        try {
            String A003 = AnonymousClass000.A00(3725);
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                String A13 = DbT.A13(A1J);
                String str2 = (String) A1J.getValue();
                A0K.A0q(A13);
                if (str2 == null) {
                    A0K.A0a();
                } else {
                    A0K.A0t(str2);
                }
            }
            String A0k = AnonymousClass7TG.A0k(A0K, stringWriter);
            0qQ.A07(A0k);
            A002.A0C(A003, A0k);
        } catch (IOException unused) {
        }
        DbU.A1R(A002, sEq.A00);
    }
}
