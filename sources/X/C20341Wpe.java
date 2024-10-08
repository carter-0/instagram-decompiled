package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.Wpe  reason: case insensitive filesystem */
public final class C20341Wpe implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AudioManager A01;
    public final /* synthetic */ C313316gF A02;
    public final /* synthetic */ VQG A03;
    public final /* synthetic */ String A04;

    public C20341Wpe(AudioManager audioManager, C313316gF r2, VQG vqg, String str, int i) {
        this.A01 = audioManager;
        this.A00 = i;
        this.A02 = r2;
        this.A04 = str;
        this.A03 = vqg;
    }

    public final void run() {
        AudioManager audioManager = this.A01;
        int i = this.A00;
        audioManager.adjustStreamVolume(3, i, 0);
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        C313316gF r6 = this.A02;
        ((Handler) r6.A06.getValue()).post(new C20327WpO(r6, this.A03, streamVolume, streamMaxVolume));
        boolean A002 = C255613uQ.A00(r6.A03, Integer.valueOf(streamVolume), true, false);
        C313326gG r0 = r6.A04;
        C17509VYn vYn = (C17509VYn) r0.A02.get(this.A04);
        if (vYn != null) {
            vYn.A01.Eqq(C51971G9r.A00(A002 ? 1 : 0));
            C21044XAx xAx = vYn.A03;
            xAx.EP8(A002);
            if (i == 1) {
                xAx.CiS();
            } else {
                xAx.CiR();
            }
        }
    }
}
