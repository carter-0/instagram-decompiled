package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.Muq  reason: case insensitive filesystem */
public final class C67786Muq extends AnonymousClass52S {
    public final /* synthetic */ C228422le A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67786Muq(Context context, C228422le r2) {
        super(context);
        this.A00 = r2;
    }

    public final void A05(View view, AnonymousClass52U r5, AnonymousClass3AW r6) {
        C228422le r1 = this.A00;
        int[] A09 = r1.A09(view, r1.A00.A0D);
        C66583MXo.A10(this, r5, A09, 1, A09[0]);
    }

    public final float A07(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public final int A0B(int i) {
        return Math.min(100, super.A0B(i));
    }
}
