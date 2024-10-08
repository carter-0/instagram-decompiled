package X;

import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.Wxf  reason: case insensitive filesystem */
public final class C20708Wxf extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ 0xF A02;
    public final /* synthetic */ ProductFeedItem A03;
    public final /* synthetic */ C21003X9a A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20708Wxf(0xF r2, ProductFeedItem productFeedItem, C21003X9a x9a, String str, String str2, int i, int i2) {
        super(1);
        this.A04 = x9a;
        this.A03 = productFeedItem;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
        this.A06 = str;
        this.A05 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View A0O = C51969G9p.A0O(obj);
        this.A04.DZa(A0O, new ULV(this.A02, this.A06, this.A05, 2024), this.A03, this.A01, this.A00);
        return C60340gF.A00;
    }
}
