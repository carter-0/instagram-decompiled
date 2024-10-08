package X;

import com.instagram.music.common.model.AudioOverlayTrack;

public final class IQT implements MSA {
    public final /* synthetic */ C63877LAg A00;

    public IQT(C63877LAg lAg) {
        this.A00 = lAg;
    }

    public final void DtB(AudioOverlayTrack audioOverlayTrack) {
        C63877LAg lAg = this.A00;
        lAg.A00 = audioOverlayTrack;
        lAg.A02.DtB(audioOverlayTrack);
    }
}
