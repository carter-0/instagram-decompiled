package X;

import android.view.View;

/* renamed from: X.6xo  reason: invalid class name and case insensitive filesystem */
public final class C323626xo extends C232922uf {
    public final /* synthetic */ C323606xm A00;

    public final void DmE(2cs r6) {
        int i = 0;
        0qQ.A0B(r6, 0);
        float f = (float) r6.A09.A00;
        C323606xm r2 = this.A00;
        View view = r2.A00;
        if (view != null) {
            view.setScaleX(f);
        }
        View view2 = r2.A00;
        if (view2 != null) {
            view2.setScaleY(f);
        }
        View view3 = r2.A00;
        if (view3 != null) {
            view3.setAlpha(f);
        }
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        View view4 = r2.A00;
        if (i2 > 0) {
            if (view4 == null) {
                return;
            }
        } else if (view4 != null) {
            i = 8;
        } else {
            return;
        }
        view4.setVisibility(i);
    }

    public C323626xo(C323606xm r1) {
        this.A00 = r1;
    }
}
