package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.shopping.adapter.cart.merchant.PinnedLinearLayoutManager;

/* renamed from: X.Muk  reason: case insensitive filesystem */
public final class C67780Muk extends AnonymousClass52S {
    public final /* synthetic */ PinnedLinearLayoutManager A00;

    public final float A07(DisplayMetrics displayMetrics) {
        0qQ.A0B(displayMetrics, 0);
        return this.A00.A04 / ((float) displayMetrics.densityDpi);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67780Muk(Context context, PinnedLinearLayoutManager pinnedLinearLayoutManager) {
        super(context);
        this.A00 = pinnedLinearLayoutManager;
    }
}
