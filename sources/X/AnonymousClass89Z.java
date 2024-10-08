package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.util.List;

/* renamed from: X.89Z  reason: invalid class name */
public final class AnonymousClass89Z extends 2YL {
    public Integer A00 = AnonymousClass05K.A00;
    public String A01;
    public final UserSession A02;
    public final C3507185x A03;
    public final ClipsCreationViewModel A04;
    public final ClipsAudioStore A05;
    public final AnonymousClass83I A06;
    public final C3501583m A07;
    public final AnonymousClass861 A08;

    public AnonymousClass89Z(UserSession userSession, C3500482z r3, C3507185x r4, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass861 r6) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(clipsCreationViewModel, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(r4, 4);
        0qQ.A0B(r3, 5);
        this.A02 = userSession;
        this.A04 = clipsCreationViewModel;
        this.A08 = r6;
        this.A03 = r4;
        String str = clipsCreationViewModel.A0S;
        this.A01 = str;
        this.A05 = r3.A00(str).A01;
        this.A06 = r3.A00(this.A01).A03;
        this.A07 = clipsCreationViewModel.A0Q;
    }

    public final void A03(C370158vv r5) {
        0qQ.A0B(r5, 0);
        C3507185x r2 = this.A03;
        r2.A01.A06(r5.A03);
        r2.A0F(r5.A00);
        r2.A0I(r5.A04);
        r2.A0G(r5.A01);
        r2.A0H(r5.A02);
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        List list = r5.A05;
        0qQ.A0B(list, 0);
        ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
        List list2 = clipsAudioStore.A0C;
        list2.clear();
        list2.addAll(list);
        clipsAudioStore.A0S.Epw(C59798JYr.A00(list2, ClipsAudioStore.A00(clipsAudioStore)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r1 != 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (X.AnonymousClass8IK.A04(r6.A02) != false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.Integer r7) {
        /*
            r6 = this;
            r5 = 0
            java.lang.Integer r0 = r6.A00
            int r0 = r0.intValue()
            r4 = 4
            if (r0 != r4) goto L_0x007e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A04
            X.2Fk r0 = r0.A0C
            java.lang.Object r2 = r0.A02()
            X.8fx r2 = (X.C361278fx) r2
            if (r2 == 0) goto L_0x0055
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x0055
            java.lang.Object r0 = r2.A00()
            X.7zv r0 = (X.C349307zv) r0
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = r0.A0V
            if (r3 == 0) goto L_0x0055
            java.lang.Object r2 = r2.A00()
            X.7zv r2 = (X.C349307zv) r2
            X.85x r0 = r6.A03
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A01
            X.0Ud r0 = r0.A0W
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 0
            int r1 = java.lang.Float.compare(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0044
            r0 = 1
        L_0x0044:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.A9I r0 = new X.A9I
            r0.<init>(r3)
            r0.A0J = r1
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A00()
            r2.A0V = r0
        L_0x0055:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r6.A01()
            if (r0 == 0) goto L_0x007e
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r3 = r6.A05
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = r0.A0D
            X.85x r0 = r6.A03
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A01
            X.0Ud r0 = r0.A0W
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.put(r1, r0)
            r3.A0B(r2)
        L_0x007e:
            int r1 = r7.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x009b
            if (r1 == r4) goto L_0x00a3
            r0 = 1
            if (r1 == r0) goto L_0x0092
            r0 = 7
            if (r1 == r0) goto L_0x00a3
            if (r1 == r5) goto L_0x00a3
        L_0x008f:
            r6.A00 = r7
            return
        L_0x0092:
            X.861 r0 = r6.A08
            r0.A01()
            r0.A06(r5)
            goto L_0x008f
        L_0x009b:
            com.instagram.common.session.UserSession r0 = r6.A02
            boolean r0 = X.AnonymousClass8IK.A04(r0)
            if (r0 == 0) goto L_0x008f
        L_0x00a3:
            X.861 r0 = r6.A08
            r0.A03()
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass89Z.A06(java.lang.Integer):void");
    }

    public static final void A00(AnonymousClass89Z r3, boolean z) {
        int i;
        ClipsAudioStore clipsAudioStore;
        List list = (List) r3.A04.A0K.A0V.getValue();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        float f = 1.0f;
        if (z) {
            C3507185x r1 = r3.A03;
            if (r1.A0E() == 1.0f) {
                f = 0.0f;
                clipsAudioStore = r1.A01;
            } else {
                return;
            }
        } else if (i == 1) {
            clipsAudioStore = r3.A03.A01;
        } else {
            return;
        }
        clipsAudioStore.A06(f);
    }

    public final AudioOverlayTrack A01() {
        C361278fx r2 = (C361278fx) this.A04.A0K.A06.A02();
        if (r2 == null || r2.A00 != 3) {
            return null;
        }
        return (AudioOverlayTrack) r2.A00();
    }

    public final AnonymousClass3QS A02() {
        DownloadedTrack downloadedTrack;
        C361278fx r1 = (C361278fx) this.A06.A06.getValue();
        if (r1 instanceof AnonymousClass8Y4) {
            AnonymousClass3QS r0 = (AnonymousClass3QS) r1.A00();
            float f = r0.A00;
            List list = r0.A03;
            return new AnonymousClass3QS(r0.A01, r0.A02, list, f, true);
        }
        0kD.A07("ClipsAudioMixViewModel", "Missing MediaAudioOverlayInfo from stitched video store.", (Throwable) null);
        C3507185x r3 = this.A03;
        AnonymousClass3QS r15 = new AnonymousClass3QS(r3.A0E(), 30);
        boolean z = false;
        AudioOverlayTrack A012 = A01();
        if (!(A012 == null || (downloadedTrack = A012.A06) == null)) {
            AnonymousClass51I r32 = new AnonymousClass51I((MediaEffect) null, AnonymousClass51J.AUDIO_TRACK, (Float) null, downloadedTrack.A02, (String) null, (String) null, ((Number) r3.A01.A0W.getValue()).floatValue(), 1.0f, 0, downloadedTrack.A00(A012.A03), -1);
            0qQ.A0B(r32, 0);
            r15.A03.add(r32);
            z = true;
        }
        r15.A04 = !z;
        return r15;
    }

    public final void A04(AudioOverlayTrack audioOverlayTrack) {
        int i;
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        List list = (List) clipsCreationViewModel.A0K.A0V.getValue();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        29I r2 = 27p.A01(this.A02).A02;
        if (i > 1) {
            r2.A02();
        } else {
            AnonymousClass29D r1 = r2.A00;
            String.valueOf(r1.A00.A0J());
            String.valueOf(r1.A00());
            29I.A00(r2, "user_post_capture_music_remove");
        }
        this.A07.A01(C359548d5.AUDIO_REMOVE);
        A00(this, false);
        clipsCreationViewModel.A0e(audioOverlayTrack, false);
    }

    public final void A05(AudioOverlayTrack audioOverlayTrack, String str, boolean z) {
        27p.A01(this.A02).A02.A06(str, z);
        A00(this, false);
        this.A04.A0e(audioOverlayTrack, false);
    }
}
