package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;

/* renamed from: X.BIl  reason: case insensitive filesystem */
public final class C42132BIl extends AnonymousClass0T0 implements C46271DTa {
    public final ProductDetailsProductItemDict A00;

    public final C42132BIl FFk(1E9 r1) {
        return this;
    }

    public final C42132BIl FFl(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42132BIl) && 0qQ.A0K(this.A00, ((C42132BIl) obj).A00));
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bfu() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public C42132BIl(ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = productDetailsProductItemDict;
    }

    public final C46271DTa EAA(1E9 r1) {
        return this;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (Bfu() != null) {
            A0t.put("product", C41846B3n.A0Q(Bfu()));
        }
        return C41845B3m.A0T("XDTStoryProductShareTappableData", 0Yt.A0B(A0t));
    }
}
