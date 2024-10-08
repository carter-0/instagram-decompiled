package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;

/* renamed from: X.VjN  reason: case insensitive filesystem */
public final class C17985VjN {
    public ProductTile A00;
    public ProductDetailsProductItemDict A01;
    public UnavailableProductImpl A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17985VjN)) {
            return false;
        }
        C17985VjN vjN = (C17985VjN) obj;
        return 2PP.A00(this.A00, vjN.A00) && 2PP.A00(this.A02, vjN.A02);
    }

    public final int hashCode() {
        int i = 0;
        int A0E = C51971G9r.A0E(this.A00) * 31;
        UnavailableProductImpl unavailableProductImpl = this.A02;
        if (unavailableProductImpl != null) {
            i = unavailableProductImpl.hashCode();
        }
        return A0E + i;
    }
}
