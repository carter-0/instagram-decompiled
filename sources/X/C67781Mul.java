package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Mul  reason: case insensitive filesystem */
public final class C67781Mul extends AnonymousClass52S {
    public final /* synthetic */ C228432lf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67781Mul(Context context, C228432lf r2) {
        super(context);
        this.A00 = r2;
    }

    public final void A05(View view, AnonymousClass52U r5, AnonymousClass3AW r6) {
        C228432lf r1 = this.A00;
        RecyclerView recyclerView = r1.A00;
        if (recyclerView != null) {
            int[] A09 = r1.A09(view, recyclerView.A0D);
            C66583MXo.A10(this, r5, A09, 1, A09[0]);
        }
    }

    public final float A07(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }
}
