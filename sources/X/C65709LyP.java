package X;

import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;

/* renamed from: X.LyP  reason: case insensitive filesystem */
public final class C65709LyP implements MUI {
    public final /* synthetic */ C65215LpL A00;

    public C65709LyP(C65215LpL lpL) {
        this.A00 = lpL;
    }

    public final void D22(MediaSuggestedProductTag mediaSuggestedProductTag, int i) {
        ShoppingCreationConfig shoppingCreationConfig;
        C65215LpL lpL = this.A00;
        C66576MXh mXh = lpL.A02;
        AnonymousClass4DH r1 = lpL.A01;
        K1L k1l = lpL.A05.A00;
        if (k1l != null) {
            shoppingCreationConfig = k1l.A01;
        } else {
            shoppingCreationConfig = null;
        }
        mXh.Dp7(r1, shoppingCreationConfig, mediaSuggestedProductTag, i);
    }

    public final void DkO(boolean z, int i) {
        this.A00.A02.Dp8(z, i);
    }
}
