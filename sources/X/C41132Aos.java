package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.Aos  reason: case insensitive filesystem */
public final /* synthetic */ class C41132Aos implements Runnable {
    public final /* synthetic */ CameraAREffect A00;
    public final /* synthetic */ AnonymousClass8K4 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C41132Aos(CameraAREffect cameraAREffect, AnonymousClass8K4 r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = cameraAREffect;
    }

    public final void run() {
        AnonymousClass8K4 r5 = this.A01;
        String str = this.A02;
        CameraAREffect cameraAREffect = this.A00;
        C364838m6 r2 = r5.A0N.A02;
        if (r2 != null) {
            C3503284f r0 = r2.A05;
            if (r0 != null) {
                C367398qg r02 = r2.A08;
                r02.getClass();
                ((C3503584i) r0.A00.A00()).ENQ(r02);
            }
            if (str != null) {
                r2.A00();
            }
        }
        r5.A0R.A01(AnonymousClass84B.DEFAULT, cameraAREffect);
    }
}
