package X;

import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.Wxd  reason: case insensitive filesystem */
public final class C20706Wxd extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ProductFeedItem A02;
    public final /* synthetic */ C21003X9a A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20706Wxd(ProductFeedItem productFeedItem, C21003X9a x9a, String str, String str2, int i, int i2) {
        super(1);
        this.A03 = x9a;
        this.A02 = productFeedItem;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = str;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View A0O = C51969G9p.A0O(obj);
        C21003X9a x9a = this.A03;
        ProductFeedItem productFeedItem = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        0xF r3 = new 0xF();
        0xF.A00(r3, (Object) null, "product_collection_id");
        0xF.A00(r3, (Object) null, "product_collection_type");
        x9a.DZa(A0O, new ULV(r3, this.A05, this.A04, 2040), productFeedItem, i, i2);
        return C60340gF.A00;
    }
}
