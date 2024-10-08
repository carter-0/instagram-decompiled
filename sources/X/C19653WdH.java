package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;

/* renamed from: X.WdH  reason: case insensitive filesystem */
public final class C19653WdH implements XC9 {
    public final UserSession A00;
    public final C17713Vci A01;
    public final C18661VwI A02;
    public final AnonymousClass0eM A03 = C20697WxT.A00(this, 18);
    public final C17931ViM A04;

    public final void A9t(ProductFeedItem productFeedItem, C268374dH r4, C17524VZd vZd) {
        0qQ.A0B(productFeedItem, 1);
        this.A04.A05.A02(productFeedItem, vZd, ((MultiProductComponent) r4).A00());
    }

    public final void APY(C268374dH r2, int i) {
        17k.A0E(r2 instanceof MultiProductComponent);
        Object obj = null;
        obj.getClass();
        throw AnonymousClass00P.createAndThrow();
    }

    public final XC8 Bg8() {
        return (C19640Wd3) this.A03.getValue();
    }

    public final void DZb(0xF r9, ProductFeedItem productFeedItem, C268374dH r11, String str, String str2, int i, int i2, int i3) {
        this.A04.A00(productFeedItem, r11, str, str2, i, i2, i3);
    }

    public final void DZh(C268374dH r9, X52 x52, Product product, int i, int i2) {
        C17931ViM viM = this.A04;
        C249713kF.A00.A0B(viM.A01).A00(viM.A00.getContext(), new C19630Wct(r9, viM, x52, i, i2), product);
    }

    public final void DZj(C268374dH r4, X53 x53, Product product, Integer num, String str, int i, int i2) {
        C18591Vui A022 = this.A04.A04.A02((1Xj) null, product, AnonymousClass3ZA.A00(product.A0B));
        MultiProductComponent multiProductComponent = (MultiProductComponent) r4;
        A022.A06 = multiProductComponent.A00();
        A022.A08 = multiProductComponent.A00();
        A022.A05 = x53;
        A022.A00();
    }

    public final void EBy(View view, ProductFeedItem productFeedItem, String str) {
        this.A04.A05.A00(view, productFeedItem, str);
    }

    public C19653WdH(UserSession userSession, C17931ViM viM, C17713Vci vci, C18661VwI vwI) {
        C51974G9v.A1P(userSession, vci, vwI, viM);
        this.A00 = userSession;
        this.A01 = vci;
        this.A02 = vwI;
        this.A04 = viM;
    }
}
