package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7mx  reason: invalid class name and case insensitive filesystem */
public final class C341477mx {
    public volatile C341617nF A00;
    public volatile C344037rD A01;

    public final void A00(Y1G y1g, int i, int i2, int i3, long j, long j2) {
        C341617nF r5 = this.A00;
        if (r5 != null) {
            int i4 = (int) j;
            C341577nB r0 = r5.A00;
            r0.A01 = j2;
            C341577nB.A00(r0);
            Handler handler = r0.A0D;
            if (handler != null) {
                C41241Aqd aqd = new C41241Aqd(y1g, r5, i, i2, i3, i4);
                if (Looper.myLooper() == handler.getLooper()) {
                    aqd.run();
                } else {
                    handler.post(aqd);
                }
            }
        }
    }

    public final void A01(byte[] bArr, int i, int i2, int i3, long j, long j2) {
        C341617nF r4 = this.A00;
        if (r4 != null) {
            int i4 = (int) j;
            C341577nB r0 = r4.A00;
            r0.A01 = j2;
            C341577nB.A00(r0);
            Handler handler = r0.A0D;
            if (handler != null) {
                C41242Aqe aqe = new C41242Aqe(r4, bArr, i, i2, i3, i4);
                if (Looper.myLooper() == handler.getLooper()) {
                    aqe.run();
                } else {
                    handler.post(aqe);
                }
            }
        }
    }
}
