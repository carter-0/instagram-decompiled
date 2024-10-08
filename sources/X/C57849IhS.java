package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.IhS  reason: case insensitive filesystem */
public final class C57849IhS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C234422xq A01;

    public C57849IhS(C234422xq r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C234422xq r4;
        try {
            r4 = this.A01;
            AudioManager audioManager = r4.A03;
            int i = -1;
            if (this.A00 == 24) {
                i = 1;
            }
            audioManager.adjustStreamVolume(3, i, 1);
        } catch (Exception unused) {
            r4 = this.A01;
            0f9 AEf = r4.A04.AEf(AnonymousClass000.A00(4351), 817905066);
            AEf.ABQ("onKey", "Error adjusting stream volume in background thread");
            AEf.report();
        }
        AudioManager audioManager2 = r4.A03;
        0qQ.A0B(audioManager2, 0);
        ((Handler) r4.A0B.getValue()).post(new C57913IiU(r4, this.A00, audioManager2.getStreamVolume(3)));
    }
}
