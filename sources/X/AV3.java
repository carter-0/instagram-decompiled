package X;

import android.os.Looper;
import java.io.File;
import org.webrtc.CameraCapturer;

public final class AV3 implements C364018kj {
    public final /* synthetic */ C41807B1m A00;
    public final /* synthetic */ C345667tt A01;
    public final /* synthetic */ A3F A02;
    public final /* synthetic */ C343047pa A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final /* synthetic */ void DaE(float f) {
    }

    public AV3(C41807B1m b1m, C345667tt r2, A3F a3f, C343047pa r4, File file, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A05 = z;
        this.A00 = b1m;
        this.A02 = a3f;
        this.A04 = file;
        this.A03 = r4;
        this.A06 = z2;
        this.A07 = z3;
    }

    public final void D16() {
        C344397rn r1 = this.A01.A03;
        if (r1 != null && this.A05) {
            r1.EgY(false);
        }
    }

    public final void DCn(Exception exc) {
        C391719tX r6;
        C345667tt r2 = this.A01;
        C345667tt.A01(r2);
        ALI.A03(this.A00, exc);
        C344397rn r1 = r2.A03;
        if (r1 != null && this.A05 && this.A07) {
            r1.EgY(true);
        }
        C344037rD r4 = r2.A04;
        if (r4 != null) {
            int hashCode = r2.hashCode();
            if (exc instanceof C391719tX) {
                r6 = (C391719tX) exc;
            } else {
                r6 = new C391719tX((int) CameraCapturer.OPEN_CAMERA_TIMEOUT, (Throwable) exc);
            }
            C363808kN.A00(r6, r4, "PhotoCaptureControllerImpl", "medium", hashCode);
        }
    }

    public final void DX5(C363858kS r15) {
        C39670A4k a4k;
        C41807B1m b1m = this.A00;
        boolean z = true;
        if (!(b1m instanceof Slp)) {
            z = false;
        }
        A3F a3f = this.A02;
        boolean z2 = a3f instanceof A3F;
        File file = this.A04;
        if (file != null) {
            C345667tt r7 = this.A01;
            C343047pa r9 = this.A03;
            boolean z3 = this.A06;
            a3f.getClass();
            a4k = new C39670A4k(r7, new C41250Aqm(r7, a3f, r9, file, (byte[]) r15.A04(C363858kS.A0X), z2, z3));
        } else {
            a4k = null;
        }
        if (z) {
            C345667tt r3 = this.A01;
            C345667tt.A01(r3);
            ALI.A02(b1m, AEA.A01(r15), a4k, (byte[]) r15.A04(C363858kS.A0X));
            C344397rn r1 = r3.A03;
            if (r1 != null && this.A05 && this.A07) {
                r1.EgY(true);
                return;
            }
            return;
        }
        C41106AoS aoS = new C41106AoS(this, a4k, r15);
        C343927r2 r2 = this.A01.A06;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            r2.BAM("Lite-Controller-Thread").post(aoS);
        } else {
            aoS.run();
        }
    }

    public final void DsK(C363858kS r4) {
        C345667tt r0 = this.A01;
        C344037rD r2 = r0.A04;
        if (r2 != null) {
            C363808kN.A01(r2, "PhotoCaptureControllerImpl", r0.hashCode());
        }
    }
}
