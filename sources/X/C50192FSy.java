package X;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: X.FSy  reason: case insensitive filesystem */
public final class C50192FSy implements C324256yt, C324246ys {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50192FSy(View view, MaterialToolbar materialToolbar, int i) {
        this.A00 = i;
        this.A01 = materialToolbar;
        this.A02 = view;
    }

    public final void DUz(AppBarLayout appBarLayout, int i) {
        float abs;
        View view;
        float f;
        float f2 = (float) i;
        if (this.A00 != 0) {
            abs = Math.abs(f2 / ((float) appBarLayout.getTotalScrollRange()));
            view = (View) this.A01;
            f = 1.5f;
        } else {
            abs = Math.abs(f2 / ((float) appBarLayout.getTotalScrollRange()));
            view = (View) this.A01;
            f = 7.0f;
        }
        view.setAlpha(f * abs);
        int i2 = 0;
        int i3 = (abs > 0.0f ? 1 : (abs == 0.0f ? 0 : -1));
        View view2 = (View) this.A02;
        if (i3 == 0) {
            i2 = 4;
        }
        view2.setVisibility(i2);
    }
}
