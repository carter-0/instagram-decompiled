package X;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;

/* renamed from: X.Wd4  reason: case insensitive filesystem */
public final class C19641Wd4 implements XC8 {
    public final C17852Vh5 A00;
    public final C307786Rm A01;
    public final C276544tV A02;
    public final UserSession A03;
    public final C18661VwI A04;

    public final void D1a(String str, String str2, String str3, int i, int i2) {
    }

    public final /* synthetic */ void DZZ(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
    }

    public final /* synthetic */ void DZd(Product product, String str, String str2, int i, int i2) {
    }

    public final /* synthetic */ void DZf(String str, int i) {
    }

    public final void DZg(Product product, int i, int i2) {
    }

    public final boolean DZk(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final void DZm(Product product) {
    }

    public final /* synthetic */ void DZn(String str) {
    }

    public final /* synthetic */ void DZo(Product product) {
    }

    public final void DuP(UnavailableProduct unavailableProduct, int i, int i2) {
    }

    public final void DuQ(ProductFeedItem productFeedItem) {
    }

    public final void DZY(ULV ulv, Product product) {
        C18661VwI vwI = this.A04;
        if (vwI != null) {
            vwI.A07(product, "mini_shop_saved_items");
            C276544tV r3 = this.A02;
            C307786Rm r2 = this.A01;
            C277014uI A0A = r3.A0A(69);
            if (A0A != null) {
                C308276Tl A0T = DbU.A0T(r3);
                A0T.A02(r2);
                DbT.A1R(r2, r3, A0T, A0A);
            }
        }
    }

    public final void DZa(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        C276544tV r4 = this.A02;
        C277014uI A08 = r4.A08();
        if (A08 != null) {
            C307786Rm r2 = this.A01;
            DbY.A1S(r2, productFeedItem);
            ((SparseArray) r2.A00(R.id.bloks_ig_object_store_deprecated)).put(R.id.product_feed_item, productFeedItem);
            C307886Rw.A03(r2, r4, AnonymousClass6Tm.A01, A08);
        }
    }

    public final boolean DZe(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        C18661VwI vwI = this.A04;
        if (vwI != null) {
            return vwI.A09(productFeedItem);
        }
        return false;
    }

    public final void DZi(ULV ulv, ProductTile productTile, int i, int i2) {
        C18661VwI vwI = this.A04;
        if (vwI != null) {
            this.A00.A00(!C18768W0o.A03(this.A03, productTile));
            0qQ.A0B(productTile, 0);
            vwI.A03(ulv, productTile, i, i2, true);
        }
    }

    public final void DZl(Product product) {
        C18661VwI vwI = this.A04;
        if (vwI != null) {
            0qQ.A0B(product, 0);
            C18661VwI.A00(vwI, product, "view_in_cart_cta");
        }
    }

    public C19641Wd4(C17852Vh5 vh5, C307786Rm r2, C276544tV r3, UserSession userSession, C18661VwI vwI) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = userSession;
        this.A04 = vwI;
        this.A00 = vh5;
    }
}
