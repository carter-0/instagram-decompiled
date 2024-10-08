package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;

/* renamed from: X.89o  reason: invalid class name and case insensitive filesystem */
public final class C3516189o implements C3516289p {
    public final /* synthetic */ C3515789k A00;

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9q(X.AnonymousClass8IJ r12, com.instagram.music.common.model.MusicAssetModel r13, com.instagram.music.common.model.TrackSnippet r14, X.C349337zz r15, java.lang.Integer r16) {
        /*
            r11 = this;
            r10 = 0
            r2 = 1
            X.89k r0 = r11.A00
            X.C3515789k.A06(r0)
            com.instagram.common.session.UserSession r3 = r0.A0D
            X.8A2 r4 = X.AnonymousClass8A1.A01(r3)
            X.27r r1 = X.27p.A01(r3)
            X.4yP r1 = r1.A0J()
            java.lang.String r7 = java.lang.String.valueOf(r1)
            X.27r r1 = X.27p.A01(r3)
            X.283 r1 = r1.A04
            java.lang.String r8 = r1.A0L
            X.80X r5 = r0.A06
            java.lang.String r6 = "music_selection_controller"
            r9 = 0
            r4.A08(r5, r6, r7, r8, r9, r10)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0K
            int r1 = r5.A0E()
            r4 = 0
            if (r1 > 0) goto L_0x004c
            android.content.Context r1 = r0.A0B
            java.lang.String r0 = "clips_music_editor_invalid_duration"
            X.C59689JTv.A0B(r1, r0)
            java.lang.String r1 = "when click done in music editor, clipsCreationViewModel.maxDurationInMs is: "
            int r0 = r5.A0E()
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.String r0 = "ClipsMusicSelectionController"
            X.0kD.A05(r0, r1, r9)
            r11.Cxc(r10)
        L_0x004b:
            return
        L_0x004c:
            com.instagram.music.common.model.AudioOverlayTrack r1 = X.C3515789k.A02(r0, r12, r13, r14)
            r0.A03 = r1
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r5.A0K
            int r1 = r1.A02(r2)
            java.lang.String r7 = "selectedTrack"
            r8 = r16
            if (r1 <= r2) goto L_0x00cf
            com.instagram.music.common.model.AudioOverlayTrack r6 = r0.A02
            X.89f r3 = r0.A0I
            com.instagram.music.common.model.AudioOverlayTrack r1 = r0.A03
            if (r6 == 0) goto L_0x00d3
            if (r1 == 0) goto L_0x00d9
            r3.Dt0(r6, r1)
        L_0x006b:
            java.lang.Integer r1 = r5.A05
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            if (r1 != r6) goto L_0x00cb
            if (r15 == 0) goto L_0x0074
            r4 = 1
        L_0x0074:
            r11.Cxc(r4)
        L_0x0077:
            if (r15 == 0) goto L_0x004b
            X.89e r1 = r0.A00
            if (r1 == 0) goto L_0x004b
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A03
            if (r0 == 0) goto L_0x00d9
            java.lang.String r5 = r0.A0D
            com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r4 = r1.A01
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A02(r4)
            if (r0 == 0) goto L_0x0098
            X.80U r1 = r4.quickCaptureState
            if (r1 == 0) goto L_0x004b
            X.8VF r0 = new X.8VF
            r0.<init>(r15, r5, r2)
        L_0x0094:
            r1.E3H(r0)
            return
        L_0x0098:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A0K
            java.lang.Integer r0 = r1.A05
            r3 = 1
            if (r0 != r6) goto L_0x00c1
            X.2Fj r0 = r1.A0H
            java.lang.Object r0 = r0.A02()
            X.88W r0 = (X.AnonymousClass88W) r0
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = r0.A01
            if (r1 == 0) goto L_0x00c1
            X.9no r0 = X.C388429no.A00
            boolean r0 = r1.equals(r0)
            if (r0 != r2) goto L_0x00c1
        L_0x00b5:
            X.80U r1 = r4.quickCaptureState
            if (r3 == 0) goto L_0x00c3
            if (r1 == 0) goto L_0x004b
            X.8VE r0 = new X.8VE
            r0.<init>(r15, r5, r2)
            goto L_0x0094
        L_0x00c1:
            r3 = 0
            goto L_0x00b5
        L_0x00c3:
            if (r1 == 0) goto L_0x004b
            X.8UR r0 = new X.8UR
            r0.<init>(r15, r5, r2)
            goto L_0x0094
        L_0x00cb:
            X.C3515789k.A04(r0)
            goto L_0x0077
        L_0x00cf:
            X.89f r3 = r0.A0I
            com.instagram.music.common.model.AudioOverlayTrack r1 = r0.A03
        L_0x00d3:
            if (r1 == 0) goto L_0x00d9
            r3.Dt6(r1, r8)
            goto L_0x006b
        L_0x00d9:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3516189o.D9q(X.8IJ, com.instagram.music.common.model.MusicAssetModel, com.instagram.music.common.model.TrackSnippet, X.7zz, java.lang.Integer):void");
    }

    public final void DFW(AnonymousClass8IJ r6, MusicAssetModel musicAssetModel, TrackSnippet trackSnippet, boolean z) {
        C3506485o r0;
        0qQ.A0B(musicAssetModel, 0);
        C3515789k r2 = this.A00;
        r2.A0I.Dsx(C3515789k.A02(r2, r6, musicAssetModel, trackSnippet));
        if (!AnonymousClass8IK.A0A(r2.A0D) && (r0 = r2.A0E) != null) {
            r0.A01 = true;
            C3506485o.A00(r0, false);
        }
    }

    public C3516189o(C3515789k r1) {
        this.A00 = r1;
    }

    public final void Cxc(boolean z) {
        C3515189e r0;
        if (!z && (r0 = this.A00.A00) != null) {
            r0.A00();
        }
        C3515789k r4 = this.A00;
        if (AnonymousClass8IK.A04(r4.A0D)) {
            r4.A0K.A0Y(C361268fw.A00);
        }
        if (r4.A08) {
            C3515789k.A05(r4);
            C3515789k.A04(r4);
            return;
        }
        C331157Pu r3 = r4.A01;
        if (r3 != null) {
            ClipsCreationViewModel clipsCreationViewModel = r4.A0K;
            Integer num = clipsCreationViewModel.A05;
            Integer num2 = AnonymousClass05K.A00;
            if (num == num2) {
                C3515789k.A05(r4);
            }
            clipsCreationViewModel.A05 = num2;
            if (!r4.A09 || r4.A06 == AnonymousClass80X.POST_CAPTURE) {
                r3.A08();
            } else {
                r3.A05();
                r4.A09 = r4.A0M;
                K6I A03 = C3515789k.A03(r4, (MusicOverlaySearchTab) null);
                r3.A0F(A03, C3515789k.A00(r4, A03));
            }
            r4.A0H.DT4();
        }
    }

    public final void D3y() {
        C3502083s r0 = this.A00.A0F;
        if (r0 != null) {
            r0.EvX();
        }
    }

    public final void D3z() {
        C3502083s r0 = this.A00.A0F;
        if (r0 != null) {
            r0.EuL();
        }
    }

    public final void D89() {
        C3515789k r3 = this.A00;
        r3.A04 = null;
        r3.A0I.Dsz((AudioOverlayTrack) null, true);
        C3515789k.A04(r3);
    }

    public final void DSs(boolean z) {
        C3515789k.A05(this.A00);
    }

    public final void DTB(C3506785t r2) {
        this.A00.A05 = r2;
    }
}
