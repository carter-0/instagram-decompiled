package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Wc8  reason: case insensitive filesystem */
public final class C19583Wc8 implements C20981X7w {
    public final /* synthetic */ C18661VwI A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ String A02;

    public final void DwB(List list) {
        0qQ.A0B(list, 0);
        C18661VwI vwI = this.A00;
        Fragment fragment = vwI.A02;
        if (fragment.isVisible()) {
            if (AnonymousClass7TE.A1b(list)) {
                C18695Vwt.A02(((C20927X4s) list.get(0)).BRw(fragment.requireContext(), vwI.A03), 0, 002.A0R(this.A02, "_product_add_to_cart_failure"));
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A00(26));
            }
        }
        AnonymousClass4DU r0 = vwI.A04;
        UserSession userSession = vwI.A03;
        String str = this.A02;
        String str2 = vwI.A0E;
        Product product = this.A01;
        W2s.A05(r0, userSession, (1Xj) null, (ShoppingGuideLoggingInfo) null, product, str, str2, C13989Tnp.A0q(product), (String) null, vwI.A0I);
    }

    public C19583Wc8(C18661VwI vwI, Product product, String str) {
        this.A00 = vwI;
        this.A01 = product;
        this.A02 = str;
    }

    public final void DTp(String str) {
        C18661VwI vwI = this.A00;
        Fragment fragment = vwI.A02;
        if (fragment.isVisible()) {
            C18695Vwt.A01(fragment.requireContext());
        }
        Product product = this.A01;
        W2s.A05(vwI.A04, vwI.A03, (1Xj) null, (ShoppingGuideLoggingInfo) null, product, this.A02, vwI.A0E, C13989Tnp.A0q(product), (String) null, vwI.A0I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        W0O w0o = (W0O) obj;
        0qQ.A0B(w0o, 0);
        C18661VwI vwI = this.A00;
        UserSession userSession = vwI.A03;
        1Au.A00(userSession).A0Q();
        C323486xZ r1 = C323426xT.A00(userSession).A07;
        Product product = this.A01;
        User user = product.A0B;
        String str3 = null;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        } else {
            str = null;
        }
        0qQ.A0A(str);
        r1.A0H(product, str);
        Fragment fragment = vwI.A02;
        if (fragment.isVisible()) {
            Dc2 dc2 = vwI.A01;
            if (dc2 != null) {
                DbX.A1R(dc2);
                vwI.A01 = null;
            }
            vwI.A01 = C18695Vwt.A00(fragment.requireActivity(), new WYF(2, product, vwI), w0o);
        }
        C323486xZ r3 = C323426xT.A00(userSession).A07;
        0qQ.A07(r3);
        AnonymousClass4DU r9 = vwI.A04;
        String str4 = this.A02;
        String str5 = vwI.A0E;
        if (user != null) {
            str2 = AnonymousClass3ZA.A00(user);
        } else {
            str2 = null;
        }
        String str6 = vwI.A0I;
        String moduleName = r9.getModuleName();
        String str7 = r3.A01;
        if (str7 != null) {
            if (user != null) {
                str3 = AnonymousClass3ZA.A00(user);
            }
            0qQ.A0A(str3);
            String A09 = r3.A09(str3);
            if (A09 != null) {
                W2s.A04(r9, userSession, (1Xj) null, (ShoppingGuideLoggingInfo) null, w0o, str4, str5, str2, (String) null, str6, moduleName, str7, A09, (String) null, (String) null, product.A04());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
