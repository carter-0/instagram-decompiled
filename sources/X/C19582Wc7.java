package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Wc7  reason: case insensitive filesystem */
public final class C19582Wc7 implements C20981X7w {
    public final /* synthetic */ C17713Vci A00;
    public final /* synthetic */ Product A01;

    public C19582Wc7(C17713Vci vci, Product product) {
        this.A00 = vci;
        this.A01 = product;
    }

    public final void DTp(String str) {
        C17713Vci vci = this.A00;
        Fragment fragment = vci.A02;
        if (fragment.isVisible()) {
            C18695Vwt.A01(fragment.requireContext());
        }
        Product product = this.A01;
        W2s.A05(vci.A04, vci.A03, (1Xj) null, (ShoppingGuideLoggingInfo) null, product, "wish_list_feed", vci.A0B, AnonymousClass3ZA.A00(product.A0B), (String) null, vci.A0C);
    }

    public final void DwB(List list) {
        C17713Vci vci = this.A00;
        Fragment fragment = vci.A02;
        if (fragment.isVisible()) {
            17k.A0E(AnonymousClass7TE.A1b(list));
            C18695Vwt.A02(((C20927X4s) list.get(0)).BRw(fragment.requireContext(), vci.A03), 0, "wish_list_feed_product_add_to_cart_failure");
        }
        AnonymousClass4DU r1 = vci.A04;
        UserSession userSession = vci.A03;
        String str = vci.A0B;
        Product product = this.A01;
        W2s.A05(r1, userSession, (1Xj) null, (ShoppingGuideLoggingInfo) null, product, "wish_list_feed", str, AnonymousClass3ZA.A00(product.A0B), (String) null, vci.A0C);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        W0O w0o = (W0O) obj;
        C17713Vci vci = this.A00;
        UserSession userSession = vci.A03;
        1Au.A00(userSession).A0Q();
        C323486xZ r1 = C323426xT.A00(userSession).A07;
        Product product = this.A01;
        User user = product.A0B;
        r1.A0H(product, AnonymousClass3ZA.A00(user));
        Fragment fragment = vci.A02;
        if (fragment.isVisible()) {
            Dc2 dc2 = vci.A00;
            if (dc2 != null) {
                DbX.A1R(dc2);
                vci.A00 = null;
            }
            vci.A00 = C18695Vwt.A00(fragment.requireActivity(), new WYF(1, this, w0o), w0o);
        }
        C323486xZ r2 = C323426xT.A00(userSession).A07;
        AnonymousClass4DU r6 = vci.A04;
        String str = vci.A0B;
        String A002 = AnonymousClass3ZA.A00(user);
        String str2 = vci.A0C;
        String moduleName = r6.getModuleName();
        String str3 = r2.A01;
        str3.getClass();
        String A09 = r2.A09(AnonymousClass3ZA.A00(user));
        A09.getClass();
        W2s.A04(r6, userSession, (1Xj) null, (ShoppingGuideLoggingInfo) null, w0o, "wish_list_feed", str, A002, (String) null, str2, moduleName, str3, A09, (String) null, (String) null, product.A04());
    }
}
