package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;

public final class U9c extends AnonymousClass52S {
    public final /* synthetic */ FastScrollingGridLayoutManager A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U9c(Context context, FastScrollingGridLayoutManager fastScrollingGridLayoutManager) {
        super(context);
        this.A00 = fastScrollingGridLayoutManager;
    }

    public final float A07(DisplayMetrics displayMetrics) {
        return this.A00.A00 / ((float) displayMetrics.densityDpi);
    }
}
