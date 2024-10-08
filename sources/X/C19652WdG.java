package X;

import android.view.View;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;

/* renamed from: X.WdG  reason: case insensitive filesystem */
public final class C19652WdG implements XC9 {
    public final C20965X6s A00;
    public final long A01;
    public final UserFlowLogger A02;
    public final C17931ViM A03;

    public final void APY(C268374dH r1, int i) {
    }

    public final void DZh(C268374dH r1, X52 x52, Product product, int i, int i2) {
    }

    public final void DZj(C268374dH r1, X53 x53, Product product, Integer num, String str, int i, int i2) {
    }

    public final void A9t(ProductFeedItem productFeedItem, C268374dH r5, C17524VZd vZd) {
        C17931ViM viM = this.A03;
        viM.A05.A03(r5, ((MultiProductComponent) r5).A00(), vZd.A01);
    }

    public final XC8 Bg8() {
        return new UlR(this);
    }

    public final void DZb(0xF r9, ProductFeedItem productFeedItem, C268374dH r11, String str, String str2, int i, int i2, int i3) {
        this.A02.flowMarkPoint(this.A01, "visit_pdp");
        this.A03.A00(productFeedItem, r11, "shopping_bag_product_collection", str2, i, i2, i3);
    }

    public final void EBy(View view, ProductFeedItem productFeedItem, String str) {
        this.A03.A05.A00(view, productFeedItem, str);
    }

    public C19652WdG(UserFlowLogger userFlowLogger, C20965X6s x6s, C17931ViM viM, long j) {
        AnonymousClass7TG.A1O(viM, userFlowLogger);
        this.A03 = viM;
        this.A02 = userFlowLogger;
        this.A01 = j;
        this.A00 = x6s;
    }
}
