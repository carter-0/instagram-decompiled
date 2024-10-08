package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Rgi  reason: case insensitive filesystem */
public abstract class C9786Rgi {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        boolean equalsIgnoreCase;
        C309516Yo A0M;
        SRV A0E;
        String str;
        Fragment A00;
        String A0g = DbY.A0g(r9);
        String A0t = DbU.A0t(r9.A00, 1);
        0lg A0B = C308206Td.A0B(r8);
        FragmentActivity A04 = C308206Td.A04(r8);
        Bundle A0a = AnonymousClass7TE.A0a();
        C11249SHj sHj = new C11249SHj();
        sHj.A01(A0t);
        sHj.A01 = "fbpay_hub";
        Pxi.A0y(A0a, sHj);
        if (A0g == null) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = A0g.equalsIgnoreCase("PAYMENT_SETTINGS");
        }
        if (equalsIgnoreCase) {
            A0M = DbS.A0M(A04, A0B);
            A0E = AnonymousClass2E0.A0E();
            str = "settings";
        } else if (A0g != null && A0g.equalsIgnoreCase("SECURITY")) {
            A0a.putBoolean("should_log_view_load_success", true);
            A0M = DbS.A0M(A04, A0B);
            A00 = AnonymousClass2E0.A03().A04.A00(A0a, "PIN_BIO_SETTINGS");
            0qQ.A07(A00);
            A0M.A0B((Bundle) null, A00);
            A0M.A04();
            return null;
        } else if (A0g != null && A0g.equalsIgnoreCase("WELCOME_PAGE")) {
            A0a.putBoolean("show_branding_page", true);
            A0M = DbS.A0M(A04, A0B);
            A0E = AnonymousClass2E0.A0E();
            str = "home";
        } else if (A0g != null && A0g.equalsIgnoreCase("ORDER_HISTORY")) {
            A0a.putString("sessionId", A0t);
            A0M = DbS.A0M(A04, A0B);
            A0E = AnonymousClass2E0.A0E();
            str = "order_list";
        } else if (A0g != null && A0g.equalsIgnoreCase("TRANSACTION_HISTORY")) {
            A0M = DbS.A0M(A04, A0B);
            A0E = AnonymousClass2E0.A0E();
            str = "transactions_list";
        } else if (A0g != null && A0g.equalsIgnoreCase("PROMOTION_PAYMENTS")) {
            C309516Yo A0M2 = DbS.A0M(A04, A0B);
            A0M2.A0B((Bundle) null, AnonymousClass2E0.A0E().A03(A0a, "promotion_payment"));
            A0M2.A0A = "OrderAndPaymentsPromotionPayments.BACK_STACK_NAME";
            A0M2.A04();
            return null;
        } else if (A0g == null || !A0g.equalsIgnoreCase("DELIVERY_ADDRESS")) {
            if (A0g != null && A0g.equalsIgnoreCase("DELIVERY_CONTACT")) {
                A0M = DbS.A0M(A04, A0B);
                A0E = AnonymousClass2E0.A0E();
                str = "contact_info";
            }
            return null;
        } else {
            A0M = DbS.A0M(A04, A0B);
            A0E = AnonymousClass2E0.A0E();
            str = "address";
        }
        A00 = A0E.A03(A0a, str);
        0qQ.A07(A00);
        A0M.A0B((Bundle) null, A00);
        A0M.A04();
        return null;
    }
}
