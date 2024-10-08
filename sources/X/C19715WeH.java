package X;

import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;

/* renamed from: X.WeH  reason: case insensitive filesystem */
public final class C19715WeH implements C13680Tep {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C19560Wbk A01;
    public final /* synthetic */ W0O A02;

    public C19715WeH(C19560Wbk wbk, W0O w0o, int i) {
        this.A01 = wbk;
        this.A02 = w0o;
        this.A00 = i;
    }

    public final void Dx0(int i) {
        W0O w0o;
        int i2;
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A01.A00;
        C323486xZ A0V = C13990Tnq.A0V(merchantShoppingCartFragment);
        String str = merchantShoppingCartFragment.A0U;
        String A04 = this.A02.A04();
        int i3 = i + 1;
        boolean A1U = AnonymousClass7TF.A1U(0, str, A04);
        C18071Vky A06 = A0V.A06(str);
        if (!(A06 == null || (w0o = (W0O) A06.A01.get(A04)) == null)) {
            int i4 = A0V.A00;
            if (i4 < 0) {
                throw DbT.A0m();
            } else if ((i4 - w0o.A01) + i3 > A0V.A02) {
                String BRw = ((C20927X4s) AnonymousClass7TE.A1I(new C19590WcF(A0V.A05)).get(0)).BRw(merchantShoppingCartFragment.requireContext(), merchantShoppingCartFragment.A02);
                if (merchantShoppingCartFragment.A08.A00.getVisibility() == 0) {
                    i2 = merchantShoppingCartFragment.A00;
                } else {
                    i2 = 0;
                }
                C18695Vwt.A02(BRw, i2, "merchant_shopping_cart_update_quantity_user_failure");
            } else {
                W0O A012 = A06.A01(A04, i3);
                if (A012 != null) {
                    A0V.A0A(str).add(new C17991VjT(C16513UwH.QUANTITY_SET, C16507Uw3.LOCAL_PENDING, A012, (Product) null));
                    A0V.A07.D1H(A06, str);
                    C66580MXl.A1T(str, A0V.A0C, A06.A00);
                    C323486xZ.A02(A0V);
                    C18785W1l w1l = merchantShoppingCartFragment.A09;
                    String str2 = merchantShoppingCartFragment.A0U;
                    String str3 = merchantShoppingCartFragment.A0N;
                    int i5 = this.A00;
                    String str4 = merchantShoppingCartFragment.A0Q;
                    String str5 = merchantShoppingCartFragment.A0T;
                    0qQ.A0B(str2, 0);
                    0qQ.A0B(str3, A1U ? 1 : 0);
                    0Aj A0e = AnonymousClass7TE.A0e(w1l.A02, "instagram_shopping_bag_update_quantity");
                    String A042 = A012.A04();
                    0qQ.A07(A042);
                    C13991Tnr.A17(A0e, A042);
                    W0O.A01(A0e, A012);
                    A0e.AAJ("old_quantity", String.valueOf(i5));
                    Product A03 = A012.A03();
                    boolean z = true;
                    if (A03 == null || A03.A0P != A1U) {
                        z = false;
                    }
                    C13991Tnr.A18(A0e, str2, z);
                    String str6 = w1l.A05;
                    if (str6 != null) {
                        A0e.AAJ("merchant_bag_entry_point", str6);
                        String str7 = w1l.A06;
                        if (str7 != null) {
                            C18785W1l.A02(A0e, w1l, C18785W1l.A01(A0e, w1l, "merchant_bag_prior_module", str7, str3), str4);
                            C13991Tnr.A16(A0e, str5);
                            A0e.Cgf();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw DbU.A0h();
                }
            }
        }
        merchantShoppingCartFragment.A0K = null;
    }
}
