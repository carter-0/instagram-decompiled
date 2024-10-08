package X;

import com.facebook.rsys.audio.gen.AudioApi;

/* renamed from: X.PY2  reason: case insensitive filesystem */
public final class C73167PY2 implements Runnable {
    public final /* synthetic */ NCR A00;
    public final /* synthetic */ boolean A01;

    public C73167PY2(NCR ncr, boolean z) {
        this.A00 = ncr;
        this.A01 = z;
    }

    public final void run() {
        AudioApi audioApi = this.A00.A00;
        if (audioApi != null) {
            int i = 0;
            if (this.A01) {
                i = 2;
            }
            audioApi.setAudioActivationState(i);
        }
    }
}
