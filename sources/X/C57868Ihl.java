package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Ihl  reason: case insensitive filesystem */
public final class C57868Ihl implements Runnable {
    public final /* synthetic */ AudioOverlayTrack A00;
    public final /* synthetic */ C52974GgR A01;

    public C57868Ihl(AudioOverlayTrack audioOverlayTrack, C52974GgR ggR) {
        this.A01 = ggR;
        this.A00 = audioOverlayTrack;
    }

    public final void run() {
        C52974GgR.A02(this.A00, this.A01);
    }
}
