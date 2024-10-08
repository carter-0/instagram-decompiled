package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;

/* renamed from: X.Wd5  reason: case insensitive filesystem */
public final class C19642Wd5 implements XC8 {
    public final /* synthetic */ C15344Uau A00;

    public static C18661VwI A00(C19642Wd5 wd5, Object obj) {
        0qQ.A0B(obj, 0);
        return (C18661VwI) wd5.A00.A0K.getValue();
    }

    public final void DZY(ULV ulv, Product product) {
    }

    public final /* synthetic */ void DZZ(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
    }

    public final void DZa(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        AnonymousClass7TG.A1N(productFeedItem, view);
        C15344Uau uau = this.A00;
        ((C18661VwI) uau.A0K.getValue()).A02(ulv, productFeedItem, (Long) null, DbS.A0t(uau.A0B), (String) null, i, i2);
    }

    public final /* synthetic */ void DZd(Product product, String str, String str2, int i, int i2) {
    }

    public final /* synthetic */ void DZf(String str, int i) {
    }

    public final void DZi(ULV ulv, ProductTile productTile, int i, int i2) {
        A00(this, productTile).A03(ulv, productTile, i, i2, true);
    }

    public final boolean DZk(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final void DZl(Product product) {
    }

    public final void DZm(Product product) {
    }

    public final /* synthetic */ void DZn(String str) {
    }

    public final /* synthetic */ void DZo(Product product) {
    }

    public final void DuP(UnavailableProduct unavailableProduct, int i, int i2) {
        C18661VwI A002 = A00(this, unavailableProduct);
        VH3.A00(A002.A02.requireActivity(), A002.A03, A002.A04, unavailableProduct, A002.A0I, A002.A0E);
    }

    public C19642Wd5(C15344Uau uau) {
        this.A00 = uau;
    }

    public final void D1a(String str, String str2, String str3, int i, int i2) {
        AnonymousClass7TG.A1T(str, str2, str3);
        ((C18661VwI) this.A00.A0K.getValue()).A08(str2, str3, i, i2);
    }

    public final boolean DZe(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return A00(this, productFeedItem).A09(productFeedItem);
    }

    public final void DZg(Product product, int i, int i2) {
        A00(this, product).A06(product, i, i2);
    }

    public final void DuQ(ProductFeedItem productFeedItem) {
        A00(this, productFeedItem).A04(productFeedItem);
    }
}
