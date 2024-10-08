package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;

public final class BG0 extends AnonymousClass0T0 implements DTN {
    public final ProductDetailsProductItemDict A00;

    public final BG0 F7v(1E9 r1) {
        return this;
    }

    public final BG0 F7w(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BG0) && 0qQ.A0K(this.A00, ((BG0) obj).A00));
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BgJ() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public BG0(ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = productDetailsProductItemDict;
    }

    public final DTN E81(1E9 r1) {
        return this;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (BgJ() != null) {
            A0t.put("product_item", C41846B3n.A0Q(BgJ()));
        }
        return C41845B3m.A0T("XDTProductSuggestionDict", 0Yt.A0B(A0t));
    }
}
