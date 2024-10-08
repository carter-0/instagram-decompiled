package X;

import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.WBi  reason: case insensitive filesystem */
public final class C18891WBi implements View.OnLongClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C18891WBi(ProductFeedItem productFeedItem, C21003X9a x9a, String str, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = x9a;
        this.A04 = productFeedItem;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
    }

    public final boolean onLongClick(View view) {
        return ((C21003X9a) this.A03).DZe((ProductFeedItem) this.A04, this.A05, this.A02, this.A01, false);
    }
}
