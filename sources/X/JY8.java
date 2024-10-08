package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;

public final class JY8 extends AnonymousClass52S {
    public final /* synthetic */ CustomScrollingLinearLayoutManager A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JY8(Context context, CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager) {
        super(context);
        this.A00 = customScrollingLinearLayoutManager;
    }

    public final float A07(DisplayMetrics displayMetrics) {
        return this.A00.A00 / ((float) displayMetrics.densityDpi);
    }

    public final int A0C(int i, int i2, int i3, int i4, int i5) {
        if (this.A00.A02) {
            return ((i3 + i4) / 2) - ((i + i2) / 2);
        }
        return super.A0C(i, i2, i3, i4, i5);
    }
}
