package X;

import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;

/* renamed from: X.WkX  reason: case insensitive filesystem */
public final class C20073WkX implements Runnable {
    public final /* synthetic */ WYF A00;

    public C20073WkX(WYF wyf) {
        this.A00 = wyf;
    }

    public final void run() {
        WYF wyf = this.A00;
        MerchantShoppingCartFragment merchantShoppingCartFragment = ((C19560Wbk) wyf.A01).A00;
        C323486xZ A0V = C13990Tnq.A0V(merchantShoppingCartFragment);
        String str = merchantShoppingCartFragment.A0U;
        W0O w0o = (W0O) wyf.A02;
        0qQ.A0B(str, 0);
        C18071Vky A06 = A0V.A06(str);
        if (A06 != null) {
            A06.A02(w0o);
            A0V.A0A(str).add(new C17991VjT(C16513UwH.ADD_ITEM, C16507Uw3.LOCAL_PENDING, w0o, (Product) null));
            A0V.A07.D1H(A06, str);
            C66580MXl.A1T(str, A0V.A0C, A06.A00);
            C323486xZ.A02(A0V);
        }
    }
}
