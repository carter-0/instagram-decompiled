package X;

import android.view.View;

/* renamed from: X.AmI  reason: case insensitive filesystem */
public final class C40972AmI implements Runnable {
    public final /* synthetic */ C263624Ms A00;
    public final /* synthetic */ boolean A01;

    public C40972AmI(C263624Ms r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        View view = this.A00.A04;
        if (view != null) {
            view.setKeepScreenOn(this.A01);
        }
    }
}
