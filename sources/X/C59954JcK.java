package X;

import android.view.ViewGroup;

/* renamed from: X.JcK  reason: case insensitive filesystem */
public final class C59954JcK implements Runnable {
    public final /* synthetic */ C59741JVz A00;
    public final /* synthetic */ C59894JbJ A01;
    public final /* synthetic */ float[] A02;

    public C59954JcK(C59741JVz jVz, C59894JbJ jbJ, float[] fArr) {
        this.A00 = jVz;
        this.A01 = jbJ;
        this.A02 = fArr;
    }

    public final void run() {
        this.A00.setImageRotateBitmapResetBase(this.A01, this.A02, (ViewGroup.LayoutParams) null);
    }
}
