package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.7pw  reason: invalid class name and case insensitive filesystem */
public final class C343267pw implements Callable {
    public final /* synthetic */ C340837lu A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C343267pw(C340837lu r1, List list, boolean z, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = list;
        this.A04 = z3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340837lu r4 = this.A00;
        02V.A03(r4.A01, "CameraDevice should not be null for createCaptureSession!");
        02V.A03(r4.A0E, "mPreviewSetupDelegate should not be null for createCaptureSession!");
        C343277px r7 = new C343277px(r4.A0P.A02);
        boolean z = this.A03;
        if (z || this.A02) {
            CameraDevice cameraDevice = r4.A01;
            List list = this.A01;
            C340887lz r42 = r4.A0M;
            int i = 2;
            if (z) {
                i = 4;
            }
            C40176AUq.A01(cameraDevice, r42, list, r7, i);
            return r42;
        }
        CameraDevice cameraDevice2 = r4.A01;
        List list2 = this.A01;
        boolean z2 = this.A04;
        C341897nh r5 = r4.A0E;
        C340887lz r43 = r4.A0M;
        C343287py.A01(cameraDevice2, r43, r5, list2, r7, z2);
        return r43;
    }
}
