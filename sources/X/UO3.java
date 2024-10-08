package X;

import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

public final class UO3 extends AnonymousClass0T0 implements C232262tL {
    public Long A00;
    public final FiltersLoggingInfo A01;
    public final ProductFeedItem A02;
    public final ULC A03;
    public final String A04;
    public final String A05;

    public UO3(ProductFeedItem productFeedItem, ULC ulc) {
        String str;
        this.A02 = productFeedItem;
        this.A03 = ulc;
        this.A00 = null;
        String str2 = ulc.A04;
        if (str2 == null || (str = 002.A0R(str2, productFeedItem.getId())) == null) {
            str = productFeedItem.getId();
            0qQ.A07(str);
        }
        this.A04 = str;
        this.A05 = str2;
        this.A01 = ulc.A01;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UO3) {
                UO3 uo3 = (UO3) obj;
                if (!0qQ.A0K(this.A02, uo3.A02) || !0qQ.A0K(this.A03, uo3.A03) || !0qQ.A0K(this.A00, uo3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A02)) + C54732HQn.A00()) * 31) + AnonymousClass7TG.A0C(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UO3(ProductFeedItem productFeedItem, String str) {
        this(productFeedItem, new ULC((C376699Iz) null, (FiltersLoggingInfo) null, str, (String) null, (String) null));
        AnonymousClass7TG.A1O(productFeedItem, str);
    }
}
