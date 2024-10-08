package X;

import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.Wxg  reason: case insensitive filesystem */
public final class C20709Wxg extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20709Wxg(ProductFeedItem productFeedItem, C21003X9a x9a, String str, String str2, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A03 = x9a;
        this.A04 = productFeedItem;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = str;
        this.A05 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            0qQ.A0B(obj, 0);
            ((C21003X9a) this.A03).DZi(new ULV((0xF) null, this.A06, this.A05, 2040), ((ProductFeedItem) this.A04).A02, this.A02, this.A01);
        } else {
            View A0O = C51969G9p.A0O(obj);
            int i = this.A02;
            int i2 = this.A01;
            ((C21003X9a) this.A03).DZa(A0O, new ULV((0xF) null, this.A06, this.A05, 2040), (ProductFeedItem) this.A04, i, i2);
        }
        return C60340gF.A00;
    }
}
