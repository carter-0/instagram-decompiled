package X;

import android.view.View;

/* renamed from: X.Gxw  reason: case insensitive filesystem */
public final class C54014Gxw extends C232922uf {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public C54014Gxw(View view, boolean z) {
        this.A01 = z;
        this.A00 = view;
    }

    public final void DmE(2cs r4) {
        float f;
        if (r4 != null) {
            f = (float) r4.A09.A00;
        } else {
            f = 0.0f;
        }
        boolean z = this.A01;
        View view = this.A00;
        if (z) {
            view.setScaleX(f);
        } else {
            view.setScaleY(f);
        }
    }
}
