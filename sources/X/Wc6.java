package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;
import java.util.List;

public class Wc6 implements C20981X7w {
    public final void DTp(String str) {
    }

    public final void DwB(List list) {
        if (this instanceof C16225Uqo) {
            17k.A0E(AnonymousClass7TE.A1b(list));
            ShoppingCartFragment shoppingCartFragment = ((C16225Uqo) this).A00;
            C18695Vwt.A02(((C20927X4s) list.get(0)).BRw(shoppingCartFragment.requireContext(), shoppingCartFragment.A02), 0, "shopping_cart_product_add_to_cart_failure");
        }
    }

    public final void onSuccess(Object obj) {
        W0O w0o;
        C18785W1l w1l;
        String str;
        String obj2;
        String str2;
        String str3;
        User user;
        String str4;
        if (this instanceof C16226Uqp) {
            C16226Uqp uqp = (C16226Uqp) this;
            C323426xT.A00(uqp.A00.getSession()).A07.A0H(uqp.A01, uqp.A02);
            return;
        }
        if (this instanceof C16225Uqo) {
            C16225Uqo uqo = (C16225Uqo) this;
            w0o = (W0O) obj;
            ShoppingCartFragment shoppingCartFragment = uqo.A00;
            shoppingCartFragment.A04.getClass();
            MultiProductComponent multiProductComponent = shoppingCartFragment.A04;
            Product product = uqo.A01;
            multiProductComponent.A03(product.A0H);
            User user2 = uqo.A02.A0B;
            String A00 = AnonymousClass3ZA.A00(user2);
            C323426xT.A00(shoppingCartFragment.A02).A07.A0H(product, A00);
            if (shoppingCartFragment.isVisible()) {
                ShoppingCartFragment.A01(shoppingCartFragment);
                C18622VvF A05 = C323426xT.A00(shoppingCartFragment.A02).A05(A00);
                if (A05 == null || A05.A08) {
                    str4 = null;
                } else {
                    str4 = w0o.A04();
                }
                ShoppingCartFragment.A02(shoppingCartFragment, user2, str4, "index_view", false);
            }
            w1l = shoppingCartFragment.A08;
            str = null;
            MultiProductComponent multiProductComponent2 = shoppingCartFragment.A04;
            multiProductComponent2.getClass();
            obj2 = multiProductComponent2.A04.toString();
            str2 = shoppingCartFragment.A0E;
            str3 = C323426xT.A00(shoppingCartFragment.A02).A07.A09(A00);
        } else if (this instanceof C16224Uqn) {
            w0o = (W0O) obj;
            MerchantShoppingCartFragment merchantShoppingCartFragment = ((C16224Uqn) this).A00.A00;
            w1l = merchantShoppingCartFragment.A09;
            str = merchantShoppingCartFragment.A0N;
            MultiProductComponent multiProductComponent3 = merchantShoppingCartFragment.A06;
            multiProductComponent3.getClass();
            obj2 = multiProductComponent3.A04.toString();
            str2 = merchantShoppingCartFragment.A0Q;
            str3 = merchantShoppingCartFragment.A0T;
        } else {
            return;
        }
        AnonymousClass7TF.A1B(obj2, 1, w0o);
        Product A03 = w0o.A03();
        String str5 = null;
        if (A03 != null) {
            user = A03.A0B;
        } else {
            UnavailableProductImpl unavailableProductImpl = w0o.A02.A02;
            if (unavailableProductImpl != null) {
                user = unavailableProductImpl.A00;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (user != null) {
            str5 = AnonymousClass3ZA.A00(user);
        }
        0Aj A0e = AnonymousClass7TE.A0e(w1l.A03, "instagram_shopping_bag_add_item_success");
        String A04 = w0o.A04();
        0qQ.A07(A04);
        C13991Tnr.A17(A0e, A04);
        C13988Tno.A1A(A0e, str5);
        W0O.A01(A0e, w0o);
        A0e.A7p("is_initial_add", Boolean.valueOf(C13988Tno.A1W(w0o.A02(), 1)));
        String str6 = w1l.A07;
        String str7 = "";
        if (str6 == null) {
            str6 = str7;
        }
        C13988Tno.A1C(A0e, str6);
        if (str == null) {
            str = str7;
        }
        A0e.AAJ("checkout_session_id", str);
        String str8 = w1l.A08;
        if (str8 != null) {
            str7 = str8;
        }
        C13988Tno.A1D(A0e, str7);
        A0e.AAJ("global_bag_entry_point", w1l.A00);
        A0e.AAJ("global_bag_prior_module", w1l.A04);
        A0e.AAJ("merchant_bag_entry_point", w1l.A05);
        A0e.AAJ("merchant_bag_prior_module", w1l.A06);
        A0e.AAJ("from", obj2);
        if (str2 != null) {
            A0e.A9F("global_bag_id", AnonymousClass7TE.A10(str2));
        }
        C13991Tnr.A16(A0e, str3);
        A0e.Cgf();
    }
}
