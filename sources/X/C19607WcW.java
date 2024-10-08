package X;

import com.instagram.android.R;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.WcW  reason: case insensitive filesystem */
public final class C19607WcW implements C20988X8e {
    public C320156rr A00 = C320156rr.EMPTY;
    public final C19742Wej A01;
    public final ProductCollectionFragment A02;
    public final Map A03 = new HashMap();

    public final C3253572b Afm() {
        C3253572b r0 = (C3253572b) this.A03.get(this.A00);
        if (r0 == null) {
            return new C3253572b();
        }
        return r0;
    }

    public final C320156rr B0w() {
        return this.A00;
    }

    public final void Epa() {
        C3253572b r2 = new C3253572b();
        r2.A02 = R.drawable.loadmore_icon_refresh_compound;
        WBC.A01(r2, this, 55);
        this.A03.put(C320156rr.ERROR, r2);
    }

    public final void FKG() {
        C320156rr r0;
        C320156rr r3 = this.A00;
        ProductCollectionFragment productCollectionFragment = this.A02;
        C19742Wej wej = this.A01;
        if (wej.isLoading()) {
            r0 = C320156rr.LOADING;
        } else if (wej.CT5()) {
            r0 = C320156rr.ERROR;
        } else {
            r0 = C320156rr.EMPTY;
        }
        this.A00 = r0;
        if (r0 != r3) {
            productCollectionFragment.A05.A00();
        }
    }

    public C19607WcW(ProductCollectionFragment productCollectionFragment, C19742Wej wej) {
        this.A01 = wej;
        this.A02 = productCollectionFragment;
    }
}
