package X;

import android.os.SystemClock;

/* renamed from: X.AUi  reason: case insensitive filesystem */
public final /* synthetic */ class C40168AUi implements B17 {
    public final /* synthetic */ C21451Xb3 A00;
    public final /* synthetic */ C387389m8 A01;

    public /* synthetic */ C40168AUi(C21451Xb3 xb3, C387389m8 r2) {
        this.A01 = r2;
        this.A00 = xb3;
    }

    public final void DZ8(C363848kR r13) {
        long j;
        long j2;
        B17 b17;
        C387389m8 r5 = this.A01;
        C21451Xb3 xb3 = this.A00;
        synchronized (r5) {
            String str = xb3.A05;
            str.getClass();
            if (C387389m8.A02(r5, str)) {
                byte[] bArr = r13.A09;
                if (bArr == null) {
                    0kD.A03("BoomerangCaptureController", "handlePreviewFrame(): data is null");
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (r5.A0E == -1) {
                        j = 0;
                    } else {
                        j = (long) (((double) (elapsedRealtime - r5.A0E)) * 1000000.0d);
                    }
                    11Z.A03(new C41139Aoz(xb3, r5, j));
                    if (r5.A0E == -1) {
                        r5.A0E = elapsedRealtime;
                    } else {
                        int i = r5.A0C;
                        r5.A0C++;
                        r5.A0F = j;
                        0nY.A00().ATE(new XPT(xb3, r5, bArr, i));
                        if (r5.A0A) {
                            j2 = 1000000000;
                        } else {
                            j2 = 1800000000;
                        }
                        if (j > j2 || r5.A0H) {
                            r5.A0D = r5.A0C;
                            C340297l2 r0 = r5.A04;
                            r0.getClass();
                            if (r0.CVP() && (b17 = r5.A05) != null) {
                                r5.A04.EEJ(b17);
                                r5.A05 = null;
                            }
                            C387389m8.A00(r5);
                        }
                    }
                }
            }
        }
    }
}
