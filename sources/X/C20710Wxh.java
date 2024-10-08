package X;

import android.view.View;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;

/* renamed from: X.Wxh  reason: case insensitive filesystem */
public final class C20710Wxh extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20710Wxh(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A04 = obj;
        this.A07 = str;
        this.A03 = obj2;
        this.A06 = str2;
        this.A05 = obj3;
        this.A02 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        1Xj r0;
        if (this.A00 != 0) {
            0qQ.A0B(obj, 0);
            ((C21003X9a) this.A03).DZi(new ULV((0xF) this.A04, this.A07, this.A06, 2040), ((ProductFeedItem) this.A05).A02, this.A02, this.A01);
        } else {
            View A0O = C51969G9p.A0O(obj);
            ProductFeedItem productFeedItem = (ProductFeedItem) this.A04;
            String str2 = this.A07;
            FiltersLoggingInfo filtersLoggingInfo = (FiltersLoggingInfo) this.A03;
            ProductTile productTile = productFeedItem.A02;
            if (productTile == null || (r0 = productTile.A05) == null) {
                str = null;
            } else {
                str = r0.getId();
            }
            UO3 uo3 = new UO3(productFeedItem, new ULC((C376699Iz) null, filtersLoggingInfo, str2, str, this.A06));
            C20982X7x x7x = (C20982X7x) this.A05;
            x7x.AAl(uo3, new C17372VSz(this.A02, this.A01));
            x7x.ECF(A0O, uo3);
        }
        return C60340gF.A00;
    }
}
