package X;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.PhS  reason: case insensitive filesystem */
public final class C73653PhS extends 0Yg implements C62320sa {
    public final /* synthetic */ PMF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73653PhS(PMF pmf) {
        super(0);
        this.A00 = pmf;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            i = ((WindowManager) this.A00.A01.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds().width();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.A00.A01.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
        }
        return Integer.valueOf(i);
    }
}
