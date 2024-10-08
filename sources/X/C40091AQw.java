package X;

import android.graphics.Bitmap;
import java.io.File;
import org.webrtc.CameraCapturer;

/* renamed from: X.AQw  reason: case insensitive filesystem */
public final class C40091AQw implements C41807B1m {
    public final /* synthetic */ A7O A00;
    public final /* synthetic */ C41807B1m A01;
    public final /* synthetic */ C345667tt A02;
    public final /* synthetic */ A3F A03;
    public final /* synthetic */ File A04;

    public C40091AQw(A7O a7o, C41807B1m b1m, C345667tt r3, A3F a3f, File file) {
        this.A02 = r3;
        this.A00 = a7o;
        this.A04 = file;
        this.A01 = b1m;
        this.A03 = a3f;
    }

    public final void A00(Bitmap bitmap, C39669A4j a4j) {
        C345667tt r3 = this.A02;
        r3.A06.BAM("Lite-Controller-Thread").post(new C41107AoT(bitmap, a4j, this));
        C344037rD r2 = r3.A04;
        if (r2 != null) {
            C363808kN.A01(r2, "PhotoCaptureControllerImpl", r3.hashCode());
        }
    }

    public final void D0v() {
        C345667tt r0 = this.A02;
        C344037rD r5 = r0.A04;
        if (r5 != null) {
            C363808kN.A00(new C391719tX((int) CameraCapturer.OPEN_CAMERA_TIMEOUT, "Photo capture cancelled"), r5, "PhotoCaptureControllerImpl", "low", r0.hashCode());
        }
    }

    public final void D0x(Exception exc) {
        C391719tX r6;
        C345667tt r1 = this.A02;
        C345667tt.A01(r1);
        ALI.A03(this.A01, exc);
        C344037rD r4 = r1.A04;
        if (r4 != null) {
            int hashCode = r1.hashCode();
            if (exc instanceof C391719tX) {
                r6 = (C391719tX) exc;
            } else {
                r6 = new C391719tX((int) CameraCapturer.OPEN_CAMERA_TIMEOUT, (Throwable) exc);
            }
            C363808kN.A00(r6, r4, "PhotoCaptureControllerImpl", "medium", hashCode);
        }
    }
}
