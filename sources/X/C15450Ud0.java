package X;

import android.view.View;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ud0  reason: case insensitive filesystem */
public final class C15450Ud0 extends C47567E8f {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15450Ud0(04x r1, Integer num, Object obj, String str, int i, int i2) {
        super(r1, num, str, i);
        this.A00 = i2;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                C19560Wbk wbk = (C19560Wbk) this.A01;
                MerchantShoppingCartFragment merchantShoppingCartFragment = wbk.A00;
                merchantShoppingCartFragment.A0E.A05.getClass();
                ArrayList arrayList = new ArrayList(merchantShoppingCartFragment.A0a);
                IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
                if (igFundedIncentive != null) {
                    merchantShoppingCartFragment.A09.A06(igFundedIncentive.A07, merchantShoppingCartFragment.A0U, merchantShoppingCartFragment.A0N, (List) null);
                    IgFundedIncentive igFundedIncentive2 = merchantShoppingCartFragment.A05;
                    List list = igFundedIncentive2.A0B;
                    list.getClass();
                    arrayList.add(0, new ProductDiscountInformationDictImpl((String) null, ((IgFundedIncentiveDetail) list.get(0)).getDescription(), igFundedIncentive2.A07, igFundedIncentive2.A0A, (String) null));
                }
                if (!AnonymousClass4KJ.A00(merchantShoppingCartFragment.A0a)) {
                    merchantShoppingCartFragment.A09.A07(merchantShoppingCartFragment.A0U, merchantShoppingCartFragment.A0N, merchantShoppingCartFragment.A0a, false);
                }
                C19560Wbk.A03(wbk, arrayList);
                return;
            case 1:
                ((C19560Wbk) this.A01).A04();
                return;
            case 2:
                ((WSI) this.A01).A01.A01.invoke();
                return;
            case 3:
                C17269VOw vOw = (C17269VOw) this.A01;
                if (vOw != null) {
                    ShoppingCartFragment shoppingCartFragment = vOw.A00.A0A;
                    shoppingCartFragment.A03.getClass();
                    shoppingCartFragment.A08.A06(shoppingCartFragment.A03.A07, (String) null, (String) null, shoppingCartFragment.A0J);
                    C249713kF.A00.A11(shoppingCartFragment.requireActivity(), shoppingCartFragment.A02, shoppingCartFragment.A03);
                    return;
                }
                return;
            default:
                super.onClick(view);
                return;
        }
    }
}
