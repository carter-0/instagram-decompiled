package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Ldk  reason: case insensitive filesystem */
public final class C64543Ldk implements MTQ {
    public final /* synthetic */ C61805KMt A00;
    public final /* synthetic */ AudioOverlayTrack A01;
    public final /* synthetic */ AudioOverlayTrack A02;
    public final /* synthetic */ 0sP A03;

    public C64543Ldk(C61805KMt kMt, AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2, 0sP r4) {
        this.A02 = audioOverlayTrack;
        this.A00 = kMt;
        this.A01 = audioOverlayTrack2;
        this.A03 = r4;
    }

    public final void DSo(String str) {
        C61805KMt kMt = this.A00;
        kMt.A0D.Epw((Object) null);
        KN3 kn3 = KN3.A00;
        1Eo.A05(JTO.A1F(), new MHN((Object) kn3, (Object) kMt, (AnonymousClass4D7) null, 8), C318116oQ.A00(kMt));
    }

    public final void DSp() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        C61805KMt kMt = this.A00;
        05G r5 = kMt.A0D;
        if (0qQ.A0K(audioOverlayTrack, r5.getValue())) {
            ClipsCreationViewModel clipsCreationViewModel = kMt.A04;
            clipsCreationViewModel.A0Z(new AnonymousClass8Y4(audioOverlayTrack), clipsCreationViewModel.A0K.A03(this.A01.A0D), false);
            r5.Epw((Object) null);
            this.A03.invoke(new AnonymousClass8Y4(audioOverlayTrack));
        }
    }
}
