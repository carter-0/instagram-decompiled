package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.9Sj  reason: invalid class name and case insensitive filesystem */
public final class C379069Sj implements B2D {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAF(com.instagram.music.common.model.DownloadedTrack r13) {
        /*
            r12 = this;
            r5 = 0
            X.0qQ.A0B(r13, r5)
            X.8Hw r2 = r12.A00
            X.8A2 r6 = r2.A1h
            java.lang.String r0 = "track_download_complete"
            r6.A0D(r0)
            com.instagram.music.common.model.AudioOverlayTrack r3 = r12.A01
            r3.A06 = r13
            X.89Z r4 = r2.A1l
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A04
            X.8Y4 r0 = new X.8Y4
            r0.<init>(r3)
            r1.A0b(r0, r5)
            r5 = 1
            X.AnonymousClass89Z.A00(r4, r5)
            boolean r0 = r2.A0l
            if (r0 == 0) goto L_0x00ac
            X.8IJ r1 = r3.A05
            if (r1 == 0) goto L_0x0091
            X.8IJ r0 = X.AnonymousClass8IJ.A0C
            if (r1 == r0) goto L_0x0091
            X.80U r0 = r2.A1W
            X.80X r1 = r0.Ats()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 != r0) goto L_0x0091
            com.instagram.common.session.UserSession r6 = r2.A1D
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320382348763514(0x8109320001217a, double:3.032494275574332E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0091
            X.85M r0 = r2.A1d
            r0.A00()
            com.instagram.music.common.model.MusicAssetModel r4 = r3.A08
            if (r4 == 0) goto L_0x0091
            X.8II r6 = r2.A1b
            r6.A0B = r5
            r6.A0D = r5
            r0 = 30000(0x7530, double:1.4822E-319)
            r6.A02 = r0
            int r1 = r3.A03
            r0 = 0
            r6.A07 = r4
            r6.A01 = r1
            X.AnonymousClass8II.A01(r6, r0)
            r2.A0b = r5
            android.content.Context r7 = r2.A11
            X.8IJ r10 = r3.A05
            X.AbL r8 = new X.AbL
            r8.<init>(r2)
            X.AbM r9 = new X.AbM
            r9.<init>(r2)
            X.B09 r11 = new X.B09
            r11.<init>(r2, r3, r13)
            r6.A0G(r7, r8, r9, r10, r11)
        L_0x007b:
            com.instagram.music.common.model.DownloadedTrack r0 = r3.A06
            if (r0 == 0) goto L_0x0090
            X.82X r1 = r2.A1C
            int r0 = r0.A01
            X.82A r4 = r1.A07
            if (r4 == 0) goto L_0x0090
            double r2 = (double) r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            r4.A00 = r2
        L_0x0090:
            return
        L_0x0091:
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x0098
            r2.A0O = r3
            goto L_0x007b
        L_0x0098:
            X.85M r0 = r2.A1d
            r0.A00()
            X.8JE r1 = r2.A1X
            X.885 r0 = r2.A1m
            X.886 r0 = r0.A00()
            r1.A05(r0, r3)
            X.C353498Hw.A0X(r2)
            goto L_0x007b
        L_0x00ac:
            java.lang.String r0 = "ClipsCaptureContainer is hidden"
            r6.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C379069Sj.DAF(com.instagram.music.common.model.DownloadedTrack):void");
    }

    public C379069Sj(C353498Hw r1, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = r1;
        this.A01 = audioOverlayTrack;
    }

    public final void DAH() {
        C353498Hw r3 = this.A00;
        C353498Hw.A0b(r3);
        if (r3.A0l) {
            C59689JTv.A0F(r3.A11, "music_track_download_failed", 2131967892);
            if (r3.A0g) {
                r3.A1h.A03();
            }
            r3.A1h.A0C("track download failed");
            return;
        }
        r3.A1h.A0B("DownloadFailed but ClipsCaptureContainer is hidden");
    }
}
