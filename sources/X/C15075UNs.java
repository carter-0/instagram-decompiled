package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.UNs  reason: case insensitive filesystem */
public final class C15075UNs extends AnonymousClass0T0 implements C232262tL {
    public final C15043UKw A00;
    public final C17472VWz A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15075UNs) {
                C15075UNs uNs = (C15075UNs) obj;
                if (!0qQ.A0K(this.A00, uNs.A00) || !0qQ.A0K(this.A01, uNs.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String id;
        ProductFeedItem productFeedItem = this.A00.A04;
        if (productFeedItem == null || (id = productFeedItem.getId()) == null) {
            return "";
        }
        return id;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C15043UKw uKw;
        C15075UNs uNs = (C15075UNs) obj;
        C15043UKw uKw2 = this.A00;
        if (uNs != null) {
            uKw = uNs.A00;
        } else {
            uKw = null;
        }
        return 0qQ.A0K(uKw2, uKw);
    }

    public C15075UNs(C15043UKw uKw, C17472VWz vWz) {
        this.A00 = uKw;
        this.A01 = vWz;
    }
}
