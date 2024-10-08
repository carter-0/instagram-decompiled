package X;

import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.music.common.model.AudioOverlayTrack;

public final class AXT implements MTQ {
    public final /* synthetic */ ClipsAudioMixingDrawerController A00;
    public final /* synthetic */ AudioOverlayTrack A01;
    public final /* synthetic */ boolean A02;

    public final void DSo(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass89Z r3 = (AnonymousClass89Z) this.A00.A0L.getValue();
        r3.A04.A0e(this.A01, true);
        AnonymousClass8A1.A01(r3.A02).A0C(str);
    }

    public AXT(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController, AudioOverlayTrack audioOverlayTrack, boolean z) {
        this.A00 = clipsAudioMixingDrawerController;
        this.A01 = audioOverlayTrack;
        this.A02 = z;
    }

    public final void DSp() {
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A00;
        AnonymousClass89Z r5 = (AnonymousClass89Z) clipsAudioMixingDrawerController.A0L.getValue();
        AudioOverlayTrack audioOverlayTrack = this.A01;
        if (this.A02) {
            r5.A04.A0b(new AnonymousClass8Y4(audioOverlayTrack), false);
        } else {
            r5.A04.A0Z(new AnonymousClass8Y4(audioOverlayTrack), (AudioOverlayTrack) null, false);
        }
        AnonymousClass89Z.A00(r5, true);
        AnonymousClass8A1.A01(clipsAudioMixingDrawerController.A0F).A02();
    }
}
