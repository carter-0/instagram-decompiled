package X;

import android.view.WindowManager;

/* renamed from: X.9Pq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C378399Pq implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C341037mE A01;

    public /* synthetic */ C378399Pq(C341037mE r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C341037mE r3 = this.A01;
        int i = this.A00;
        int i2 = r3.A00;
        if (i != -1) {
            i2 = ((((i + 45) + 360) / 90) % 4) * 90;
        }
        int i3 = 0;
        try {
            WindowManager windowManager = (WindowManager) r3.A08.A00.getContext().getSystemService("window");
            if (windowManager != null) {
                int rotation = windowManager.getDefaultDisplay().getRotation();
                if (rotation == 1) {
                    i3 = 90;
                } else if (rotation == 2) {
                    i3 = 180;
                } else if (rotation == 3) {
                    i3 = 270;
                }
            }
        } catch (RuntimeException unused) {
        }
        if (r3.A00 != i2 || r3.A02 != i3) {
            r3.A00 = i2;
            r3.A02 = i3;
            C341037mE.A00(r3);
        }
    }
}
