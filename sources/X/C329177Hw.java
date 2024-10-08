package X;

import android.os.Build;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.7Hw  reason: invalid class name and case insensitive filesystem */
public final class C329177Hw implements View.OnLayoutChangeListener {
    public final /* synthetic */ C329067Hl A00;

    public C329177Hw(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        C329067Hl r4 = this.A00;
        if (r4.A0P != null && i8 - i6 != (height = r4.A07.getHeight())) {
            C329067Hl.A0k(r4, r4.A1B);
            if (r4.A16 && !r4.A15) {
                C329067Hl.A0g(r4, r4.A1m.A00() - height);
            }
            C70797OLs oLs = r4.A0g;
            if (oLs != null && oLs.A00()) {
                int dimensionPixelSize = (-r4.A07.getHeight()) + r4.A1R.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                int i9 = Build.VERSION.SDK_INT;
                View A02 = C329067Hl.A02(r4);
                if (i9 < 30) {
                    dimensionPixelSize -= r4.A01;
                }
                A02.setTranslationY((float) dimensionPixelSize);
            }
            r4.A1B = false;
            C329877Ko r0 = r4.A0o;
            if (r0 != null) {
                r0.A01();
            }
        }
    }
}
