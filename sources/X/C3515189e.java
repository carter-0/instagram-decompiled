package X;

import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.89e  reason: invalid class name and case insensitive filesystem */
public final class C3515189e implements C3515289f {
    public final String A00;
    public final /* synthetic */ ClipsAudioMixingDrawerController A01;

    public final /* synthetic */ void DT3(boolean z) {
    }

    public final void Dsx(AudioOverlayTrack audioOverlayTrack) {
        C361278fx r0;
        0qQ.A0B(audioOverlayTrack, 0);
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A01;
        ClipsCreationViewModel clipsCreationViewModel = clipsAudioMixingDrawerController.A0K;
        if (audioOverlayTrack.A01()) {
            r0 = new AnonymousClass8Y4(audioOverlayTrack);
        } else {
            r0 = new AnonymousClass8RJ(audioOverlayTrack);
        }
        clipsCreationViewModel.A0Y(r0);
        new C63924LDf(clipsAudioMixingDrawerController.A0E.requireContext(), new AXR(clipsAudioMixingDrawerController, audioOverlayTrack), clipsAudioMixingDrawerController.A0F, audioOverlayTrack).A00();
    }

    public final void Dt0(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
        C361278fx r0;
        0qQ.A0B(audioOverlayTrack, 0);
        0qQ.A0B(audioOverlayTrack2, 1);
        if (audioOverlayTrack.equals(audioOverlayTrack2)) {
            AnonymousClass8A1.A01(this.A01.A0F).A02();
            return;
        }
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A01;
        clipsAudioMixingDrawerController.A0L.getValue();
        boolean A012 = audioOverlayTrack2.A01();
        ClipsCreationViewModel clipsCreationViewModel = clipsAudioMixingDrawerController.A0K;
        if (A012) {
            r0 = new AnonymousClass8Y4(audioOverlayTrack2);
        } else {
            r0 = new AnonymousClass8RJ(audioOverlayTrack2);
        }
        clipsCreationViewModel.A0Z(r0, audioOverlayTrack, true);
        new C63924LDf(clipsAudioMixingDrawerController.A0E.requireContext(), new AXT(clipsAudioMixingDrawerController, audioOverlayTrack2, false), clipsAudioMixingDrawerController.A0F, audioOverlayTrack2).A00();
    }

    public final void Dt2(AudioOverlayTrack audioOverlayTrack) {
        0qQ.A0B(audioOverlayTrack, 0);
        Dt6(audioOverlayTrack, AnonymousClass05K.A0C);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r4.A0K.A0K.A02(false) == 0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dt6(com.instagram.music.common.model.AudioOverlayTrack r11, java.lang.Integer r12) {
        /*
            r10 = this;
            r2 = 0
            X.0qQ.A0B(r11, r2)
            r3 = 1
            X.0qQ.A0B(r12, r3)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            if (r12 != r5) goto L_0x0012
            com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r1 = r10.A01
            java.lang.String r0 = r11.A0D
            r1.A05 = r0
        L_0x0012:
            com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r4 = r10.A01
            X.89a r0 = r4.A0I
            X.89i r1 = r0.A00
            X.89i r0 = X.C3515589i.TIMELINE_TOOLBAR_AUDIO_OPTION
            r7 = 0
            if (r1 != r0) goto L_0x0028
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0K
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            int r0 = r0.A02(r2)
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            if (r12 == r5) goto L_0x007d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r12 == r0) goto L_0x0031
            if (r1 == 0) goto L_0x007d
        L_0x0031:
            r5 = 1
        L_0x0032:
            X.0eM r8 = r4.A0L
            java.lang.Object r9 = r8.getValue()
            X.89Z r9 = (X.AnonymousClass89Z) r9
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A01()
            r1 = 0
            if (r0 == 0) goto L_0x007b
            java.lang.String r6 = r0.A0A
        L_0x0043:
            java.lang.String r0 = r11.A0A
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x007f
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A01()
            if (r0 == 0) goto L_0x007f
            int r6 = r0.A03
            int r0 = r11.A03
            if (r6 != r0) goto L_0x007f
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A01()
            if (r0 == 0) goto L_0x007f
            int r6 = r0.A02
            int r0 = r11.A02
            if (r6 != r0) goto L_0x007f
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A01()
            if (r0 == 0) goto L_0x006b
            X.8IJ r1 = r0.A05
        L_0x006b:
            X.8IJ r0 = r11.A05
            if (r1 != r0) goto L_0x007f
            if (r5 == 0) goto L_0x007f
            com.instagram.common.session.UserSession r0 = r4.A0F
            X.8A2 r0 = X.AnonymousClass8A1.A01(r0)
            r0.A02()
            return
        L_0x007b:
            r6 = r7
            goto L_0x0043
        L_0x007d:
            r5 = 0
            goto L_0x0032
        L_0x007f:
            r8.getValue()
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x009c
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A0K
            X.8Y4 r0 = new X.8Y4
            if (r5 == 0) goto L_0x0095
            r0.<init>(r11)
            r1.A0b(r0, r2)
            return
        L_0x0095:
            r0.<init>(r11)
            r1.A0Z(r0, r7, r2)
            return
        L_0x009c:
            if (r5 == 0) goto L_0x00be
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A0K
            X.8RJ r0 = new X.8RJ
            r0.<init>(r11)
            r1.A0b(r0, r3)
        L_0x00a8:
            X.4DH r0 = r4.A0E
            android.content.Context r3 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = r4.A0F
            X.AXT r1 = new X.AXT
            r1.<init>(r4, r11, r5)
            X.LDf r0 = new X.LDf
            r0.<init>(r3, r1, r2, r11)
            r0.A00()
            return
        L_0x00be:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r4.A0K
            X.8RJ r1 = new X.8RJ
            r1.<init>(r11)
            r2.A0Z(r1, r7, r3)
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3515189e.Dt6(com.instagram.music.common.model.AudioOverlayTrack, java.lang.Integer):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.BUn();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3515189e(com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r2) {
        /*
            r1 = this;
            r1.A01 = r2
            r1.<init>()
            X.82t r0 = r2.musicBrowseSessionProvider
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.BUn()
            if (r0 != 0) goto L_0x0011
        L_0x000f:
            java.lang.String r0 = ""
        L_0x0011:
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3515189e.<init>(com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController):void");
    }

    public final void A00() {
        AnonymousClass80U r2;
        AnonymousClass8UQ r1;
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A01;
        if (ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController)) {
            r2 = clipsAudioMixingDrawerController.quickCaptureState;
            if (r2 != null) {
                r1 = new AnonymousClass8UQ(false);
            } else {
                return;
            }
        } else if (clipsAudioMixingDrawerController.A06 || clipsAudioMixingDrawerController.A0K.A05 == AnonymousClass05K.A0C) {
            AnonymousClass80U r22 = clipsAudioMixingDrawerController.quickCaptureState;
            if (r22 != null) {
                r22.E3H(new AnonymousClass8UQ(false));
            }
            clipsAudioMixingDrawerController.A06 = false;
            return;
        } else {
            r2 = clipsAudioMixingDrawerController.quickCaptureState;
            if (r2 != null) {
                r1 = new AnonymousClass8UQ(false);
            } else {
                return;
            }
        }
        r2.E3H(r1);
    }

    public final String BUn() {
        return this.A00;
    }

    public final void Dsz(AudioOverlayTrack audioOverlayTrack, boolean z) {
        ((AnonymousClass89Z) this.A01.A0L.getValue()).A05(audioOverlayTrack, "audio_mixing", z);
    }
}
