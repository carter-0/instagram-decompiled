package X;

import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;
import java.util.Set;

/* renamed from: X.Woz  reason: case insensitive filesystem */
public final class C20310Woz implements Runnable {
    public final /* synthetic */ C19560Wbk A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ Product A02;

    public C20310Woz(C19560Wbk wbk, Product product, Product product2) {
        this.A00 = wbk;
        this.A01 = product;
        this.A02 = product2;
    }

    public final void run() {
        C19560Wbk wbk = this.A00;
        Product product = this.A01;
        Product product2 = this.A02;
        MerchantShoppingCartFragment merchantShoppingCartFragment = wbk.A00;
        merchantShoppingCartFragment.A06.getClass();
        C323486xZ A0V = C13990Tnq.A0V(merchantShoppingCartFragment);
        A0V.A0C(new C16224Uqn(wbk), product2, merchantShoppingCartFragment.A0U);
        A0V.A0H(product, merchantShoppingCartFragment.A0U);
        MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
        String str = product.A0H;
        multiProductComponent.A03(str);
        C17456VWj vWj = merchantShoppingCartFragment.A0D;
        if (vWj != null) {
            0qQ.A0B(str, 0);
            vWj.A00.put(str, new C17379VTg(false, false));
        }
        W1F w1f = merchantShoppingCartFragment.A07;
        C16508Uw5 uw5 = merchantShoppingCartFragment.A0A;
        C18622VvF vvF = merchantShoppingCartFragment.A0E;
        C17456VWj vWj2 = merchantShoppingCartFragment.A0D;
        MultiProductComponent multiProductComponent2 = merchantShoppingCartFragment.A06;
        String str2 = merchantShoppingCartFragment.A0W;
        IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
        Set set = merchantShoppingCartFragment.A0a;
        0qQ.A0B(uw5, 0);
        w1f.A05 = vvF;
        w1f.A04 = vWj2;
        w1f.A03 = multiProductComponent2;
        w1f.A06 = str2;
        w1f.A02 = igFundedIncentive;
        w1f.A01 = null;
        w1f.A07 = set;
        W1F.A02(w1f);
    }
}
