package X;

import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;

/* renamed from: X.9aq  reason: invalid class name and case insensitive filesystem */
public final class C380989aq extends AudioRenderCallback {
    public final Y1G A00;
    public final /* synthetic */ C341577nB A01;

    public C380989aq(Y1G y1g, C341577nB r2) {
        this.A01 = r2;
        this.A00 = y1g;
    }

    public final void onSamplesReady(byte[] bArr, int i, int i2, int i3, int i4) {
        C341577nB r4 = this.A01;
        if (r4.A0D == null || Looper.myLooper() == r4.A0D.getLooper()) {
            C39897ADz aDz = r4.A0E;
            if (aDz != null) {
                aDz.A09 = true;
            }
            C341577nB.A01(r4);
            Y1G y1g = this.A00;
            C341747nS r2 = r4.A0H;
            int i5 = i4;
            if (r2 != null) {
                r2.A01(y1g, i5, r4.A00);
            }
            if (i4 > 0 && i > 0) {
                int i6 = i2;
                if (i2 > 0) {
                    int i7 = i3;
                    if (i3 > 0) {
                        r4.A00 += C39902AIk.A01(i6, i7, (long) i5, (long) i);
                    }
                }
            }
        }
    }
}
