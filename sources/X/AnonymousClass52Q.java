package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.52Q  reason: invalid class name */
public final class AnonymousClass52Q implements Runnable {
    public final /* synthetic */ C238133Ar A00;
    public final /* synthetic */ int[] A01;

    public AnonymousClass52Q(C238133Ar r1, int[] iArr) {
        this.A00 = r1;
        this.A01 = iArr;
    }

    public final void run() {
        int i;
        C238133Ar r4 = this.A00;
        int i2 = this.A01[0];
        View AnE = r4.AnE(i2);
        int i3 = Resources.getSystem().getDisplayMetrics().heightPixels;
        if (AnE != null) {
            i = AnE.getHeight();
        } else {
            i = 0;
        }
        r4.Evr(i2, (i3 - i) / 2);
    }
}
