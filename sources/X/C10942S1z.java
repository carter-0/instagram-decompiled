package X;

import java.util.Arrays;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.S1z  reason: case insensitive filesystem */
public final class C10942S1z {
    public int A00;
    public C268204cx[] A01;
    public int A02;

    public final void A00(C268204cx r6) {
        C268204cx[] r0;
        int i = this.A00;
        int i2 = this.A02;
        if (i < i2) {
            C268204cx[] r1 = this.A01;
            this.A00 = i + 1;
            r1[i] = r6;
            return;
        }
        C268204cx[] r3 = this.A01;
        if (r3 == null) {
            this.A02 = 10;
            r0 = new C268204cx[10];
        } else {
            int min = i2 + Math.min(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, Math.max(20, i2 >> 1));
            this.A02 = min;
            r0 = (C268204cx[]) Arrays.copyOf(r3, min);
        }
        this.A01 = r0;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        r0[i3] = r6;
    }
}
