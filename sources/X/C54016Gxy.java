package X;

import android.view.View;

/* renamed from: X.Gxy  reason: case insensitive filesystem */
public final class C54016Gxy extends C232922uf {
    public final /* synthetic */ View A00;
    public final /* synthetic */ 0sP A01;
    public final /* synthetic */ boolean A02;

    public C54016Gxy(View view, 0sP r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = view;
    }

    public final void DmC(2cs r2) {
        this.A01.invoke(r2);
    }

    public final void DmE(2cs r4) {
        float f;
        if (r4 != null) {
            f = (float) r4.A09.A00;
        } else {
            f = 0.0f;
        }
        boolean z = this.A02;
        View view = this.A00;
        if (z) {
            view.setTranslationX(f);
        } else {
            view.setTranslationY(f);
        }
    }
}
