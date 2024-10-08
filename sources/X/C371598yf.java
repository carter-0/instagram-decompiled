package X;

import android.hardware.camera2.CameraAccessException;

/* renamed from: X.8yf  reason: invalid class name and case insensitive filesystem */
public final class C371598yf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8GD A01;
    public final /* synthetic */ C340777lo A02;

    public C371598yf(AnonymousClass8GD r1, C340777lo r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void run() {
        try {
            this.A01.A02(Boolean.valueOf(this.A02.A09(this.A00)));
        } catch (CameraAccessException e) {
            this.A01.A01(e);
        }
    }
}
