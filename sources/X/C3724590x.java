package X;

import android.hardware.camera2.CaptureRequest;

/* renamed from: X.90x  reason: invalid class name and case insensitive filesystem */
public final class C3724590x implements C3724690y {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C340827lt A01;
    public final /* synthetic */ C343187po A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ float[] A04;

    public C3724590x(CaptureRequest.Builder builder, C340827lt r2, C343187po r3, float[] fArr, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = fArr;
        this.A00 = builder;
        this.A03 = z;
    }

    public final void DGC(boolean z) {
        Integer num;
        C340827lt r5 = this.A01;
        boolean z2 = r5.A09;
        C343187po r7 = this.A02;
        if (z2) {
            r5.A04(r7);
        } else {
            r7.A06 = null;
        }
        if (z) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A0Y;
        }
        r5.A05(num, this.A04);
        if (!r5.A0E) {
            CaptureRequest.Builder builder = this.A00;
            Number number = (Number) builder.get(CaptureRequest.CONTROL_AE_MODE);
            long j = 4000;
            if (number == null || number.intValue() != 1) {
                if (!this.A03) {
                    j = 2000;
                }
                r5.A02(builder, r7, j);
                return;
            }
            if (!this.A03) {
                j = 2000;
            }
            synchronized (r5) {
                C41344AsR asR = new C41344AsR(builder, r5, r7);
                r5.A00();
                r5.A08 = r5.A0B.A02("monitor_auto_exposure", asR, j);
            }
        }
    }
}
