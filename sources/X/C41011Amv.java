package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.Amv  reason: case insensitive filesystem */
public final /* synthetic */ class C41011Amv implements Runnable {
    public final /* synthetic */ CameraAREffect A00;
    public final /* synthetic */ AnonymousClass8LU A01;

    public /* synthetic */ C41011Amv(CameraAREffect cameraAREffect, AnonymousClass8LU r2) {
        this.A01 = r2;
        this.A00 = cameraAREffect;
    }

    public final void run() {
        AnonymousClass8LU r3 = this.A01;
        CameraAREffect cameraAREffect = this.A00;
        r3.A0q.A01(AnonymousClass84B.DEFAULT, cameraAREffect);
        AnonymousClass3Q2 r0 = r3.A0D;
        if (r0 != null) {
            r0.A10 = cameraAREffect;
        }
        AnonymousClass8LU.A06(cameraAREffect, r3);
    }
}
