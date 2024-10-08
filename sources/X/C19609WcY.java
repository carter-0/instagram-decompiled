package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.WcY  reason: case insensitive filesystem */
public final class C19609WcY implements C20988X8e {
    public C320156rr A00 = C320156rr.EMPTY;
    public final C19742Wej A01;
    public final Context A02;
    public final WishListFeedFragment A03;
    public final Map A04 = new HashMap();

    public final C3253572b Afm() {
        C3253572b r0 = (C3253572b) this.A04.get(this.A00);
        if (r0 == null) {
            return new C3253572b();
        }
        return r0;
    }

    public final C320156rr B0w() {
        return this.A00;
    }

    public final void Epa() {
        C3253572b r3 = new C3253572b();
        r3.A02 = R.drawable.empty_state_save;
        Context context = this.A02;
        r3.A0D = context.getResources().getString(2131971334);
        r3.A07 = context.getResources().getString(2131971333);
        C13991Tnr.A0s(context, r3);
        Map map = this.A04;
        map.put(C320156rr.EMPTY, r3);
        C3253572b r1 = new C3253572b();
        r1.A02 = R.drawable.loadmore_icon_refresh_compound;
        WBC.A01(r1, this, 56);
        map.put(C320156rr.ERROR, r1);
    }

    public final void FKG() {
        C320156rr r0;
        C320156rr r2 = this.A00;
        C19742Wej wej = this.A01;
        if (wej.isLoading()) {
            r0 = C320156rr.LOADING;
        } else if (wej.CT5()) {
            r0 = C320156rr.ERROR;
        } else {
            r0 = C320156rr.EMPTY;
        }
        this.A00 = r0;
        if (r0 != r2) {
            C15483UdY.A01(this.A03.A01);
        }
    }

    public C19609WcY(Context context, WishListFeedFragment wishListFeedFragment, C19742Wej wej) {
        this.A01 = wej;
        this.A02 = context;
        this.A03 = wishListFeedFragment;
    }
}
