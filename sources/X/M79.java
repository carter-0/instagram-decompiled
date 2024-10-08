package X;

import com.instagram.music.common.model.AudioOverlayTrack;

public final class M79 implements Runnable {
    public final /* synthetic */ C63877LAg A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public M79(C63877LAg lAg, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = lAg;
        this.A01 = audioOverlayTrack;
    }

    public final void run() {
        LFL lfl = (LFL) this.A00.A04.getValue();
        AudioOverlayTrack audioOverlayTrack = this.A01;
        lfl.A00 = audioOverlayTrack;
        lfl.A03.DtB(audioOverlayTrack);
    }
}
