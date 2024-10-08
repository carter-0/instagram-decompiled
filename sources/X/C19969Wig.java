package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: X.Wig  reason: case insensitive filesystem */
public final class C19969Wig implements Runnable {
    public final /* synthetic */ W1m A00;

    public C19969Wig(W1m w1m) {
        this.A00 = w1m;
    }

    public final void run() {
        Context context;
        W1m w1m = this.A00;
        U4W u4w = w1m.A09;
        if (u4w != null && (context = w1m.A06) != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            int[] iArr = new int[2];
            u4w.getLocationOnScreen(iArr);
            int height = (i - (iArr[1] + u4w.getHeight())) + ((int) u4w.getTranslationY());
            if (height < w1m.A00) {
                ViewGroup.LayoutParams layoutParams = u4w.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w("BaseTransientBottomBar", "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += w1m.A00 - height;
                u4w.requestLayout();
            }
        }
    }
}
