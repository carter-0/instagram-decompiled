package X;

/* renamed from: X.KHt  reason: case insensitive filesystem */
public final class C61685KHt extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;

    public C61685KHt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass3NG r1, Object obj, int i) {
        r1.A04 = new C61685KHt(obj, i);
        r1.A00();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0355, code lost:
        if (r0 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04a2, code lost:
        r7.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x050d, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0514, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x059d, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x05a3, code lost:
        return r0.Dqe(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = (X.C62320sa) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ce, code lost:
        r3 = ((X.C61051Jvp) r5.getValue()).A01;
        r2 = ((X.C61051Jvp) r5.getValue()).A01.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqe(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            r2 = r19
            switch(r0) {
                case 0: goto L_0x04ff;
                case 1: goto L_0x04ff;
                case 2: goto L_0x04ce;
                case 3: goto L_0x04bd;
                case 4: goto L_0x04a7;
                case 5: goto L_0x0495;
                case 6: goto L_0x042b;
                case 7: goto L_0x0423;
                case 8: goto L_0x041b;
                case 9: goto L_0x03a4;
                case 10: goto L_0x0379;
                case 11: goto L_0x0359;
                case 12: goto L_0x0341;
                case 13: goto L_0x0009;
                case 14: goto L_0x02f8;
                case 15: goto L_0x0254;
                case 16: goto L_0x0241;
                case 17: goto L_0x01ff;
                case 18: goto L_0x0573;
                case 19: goto L_0x01e9;
                case 20: goto L_0x01a9;
                case 21: goto L_0x018e;
                case 22: goto L_0x0009;
                case 23: goto L_0x0171;
                case 24: goto L_0x0156;
                case 25: goto L_0x05af;
                case 26: goto L_0x05a4;
                case 27: goto L_0x0145;
                case 28: goto L_0x0127;
                case 29: goto L_0x0114;
                case 30: goto L_0x00b1;
                case 31: goto L_0x0009;
                case 32: goto L_0x0012;
                case 33: goto L_0x0591;
                case 34: goto L_0x0584;
                case 35: goto L_0x0577;
                case 36: goto L_0x00a0;
                case 37: goto L_0x0098;
                case 38: goto L_0x053a;
                case 39: goto L_0x008d;
                case 40: goto L_0x0083;
                case 41: goto L_0x0058;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
        L_0x000b:
            X.0sa r0 = (X.C62320sa) r0
        L_0x000d:
            r0.invoke()
        L_0x0010:
            r3 = 1
        L_0x0011:
            return r3
        L_0x0012:
            java.lang.Object r8 = r1.A01
            X.K72 r8 = (X.K72) r8
            com.instagram.model.reels.Reel r5 = r8.A05
            r3 = 0
            if (r5 == 0) goto L_0x0011
            X.L53 r7 = r8.A0B
            if (r7 == 0) goto L_0x0011
            X.0eM r0 = r8.A0E
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r11 = r8.A0D
            java.lang.String r13 = r8.A0C
            r14 = 0
            com.instagram.music.common.model.MusicOverlayStickerModel r10 = r8.A09
            java.lang.String r12 = "view_mas_stories"
            X.C63978LGs.A01(r8, r9, r10, r11, r12, r13, r14)
            X.Lwc r6 = r8.A07
            if (r6 != 0) goto L_0x0039
            java.lang.String r1 = "trackCoverReelHolder"
            goto L_0x050d
        L_0x0039:
            X.3BQ r4 = X.AnonymousClass3BQ.BOTTOM_SHEET_MAS_MUSIC
            X.6ia r1 = r7.A00
            X.4DH r0 = r1.A06
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            if (r3 == 0) goto L_0x0010
            X.32A r2 = r1.A09
            java.lang.String r0 = r7.A01
            r2.A0C = r0
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r6.A01
            X.Upq r0 = new X.Upq
            r0.<init>((android.app.Activity) r3, (android.view.View) r1, (X.C230222pE) r14)
            r2.A05 = r0
            r2.A03(r5, r4, r6)
            goto L_0x0010
        L_0x0058:
            java.lang.Object r2 = r1.A01
            instagram.features.clips.audio.ui.SegmentsMusicPlayerView r2 = (instagram.features.clips.audio.ui.SegmentsMusicPlayerView) r2
            X.2xy r0 = r2.A02
            java.lang.String r1 = "musicPlayer"
            if (r0 == 0) goto L_0x050d
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L_0x0075
            X.2xy r0 = r2.A02
            if (r0 == 0) goto L_0x050d
            r0.pause()
            X.MWo r0 = r2.A03
            r0.DSv()
            goto L_0x0010
        L_0x0075:
            X.8ZH r0 = X.AnonymousClass8ZH.LOADING
            r2.setPreviewButtonState(r0)
            r2.A0D()
            X.MWo r0 = r2.A03
            r0.DSy()
            goto L_0x0010
        L_0x0083:
            java.lang.Object r0 = r1.A01
            X.Jip r0 = X.C64083LMb.A00(r0)
            r0.A03()
            goto L_0x0010
        L_0x008d:
            java.lang.Object r0 = r1.A01
            X.Jip r0 = X.C64083LMb.A00(r0)
            r0.A02()
            goto L_0x0010
        L_0x0098:
            java.lang.Object r0 = r1.A01
            X.9Iw r0 = (X.C376669Iw) r0
            java.lang.Object r0 = r0.A02
            goto L_0x000b
        L_0x00a0:
            java.lang.Object r0 = r1.A01
            X.L6u r0 = (X.C63788L6u) r0
            com.instagram.music.common.model.MusicSearchArtist r2 = r0.A01
            if (r2 == 0) goto L_0x05ce
            X.MSf r1 = r0.A02
            int r0 = r0.A00
            r1.Dhc(r2, r0)
            goto L_0x0010
        L_0x00b1:
            java.lang.Object r1 = r1.A01
            X.JpP r1 = (X.C60678JpP) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K6o r8 = r1.A0B
            java.lang.String r1 = r1.A00
            if (r1 != 0) goto L_0x00c4
            java.lang.String r3 = "episodeId"
        L_0x00bf:
            X.0qQ.A0F(r3)
            goto L_0x0510
        L_0x00c4:
            r13 = 0
            androidx.fragment.app.FragmentActivity r4 = r8.getActivity()
            if (r4 == 0) goto L_0x0010
            X.K1d r0 = r8.A00
            java.lang.String r3 = "series"
            if (r0 == 0) goto L_0x00bf
            java.util.Map r0 = r0.A0F
            java.lang.Object r7 = r0.get(r1)
            X.1Xj r7 = (X.1Xj) r7
            if (r7 == 0) goto L_0x05c7
            java.lang.String r11 = X.AnonymousClass7TG.A0j()
            X.0eM r2 = r8.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            X.K1d r0 = r8.A00
            if (r0 == 0) goto L_0x00bf
            java.util.List r0 = r0.A0A
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            X.I6Y.A03(r8, r1, r11, r0)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.SERIES
            X.K1d r0 = r8.A00
            if (r0 == 0) goto L_0x00bf
            java.lang.String r10 = r0.A03
            r9 = 0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.4h3 r5 = new X.4h3
            r5.<init>(r1, r0)
            r15 = 1
            r12 = r9
            r14 = r13
            r16 = r13
            r17 = r13
            X.I6Y.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0010
        L_0x0114:
            java.lang.Object r3 = r1.A01
            X.K6K r3 = (X.K6K) r3
            X.Jhs r0 = X.JTQ.A0L(r3)
            boolean r2 = r0.A00()
            r1 = 0
            r0 = 0
            X.K6K.A01(r1, r3, r0, r0, r2)
            goto L_0x0010
        L_0x0127:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r3 = r1.A01
            X.KHS r3 = (X.KHS) r3
            android.view.View$OnClickListener r1 = r3.A00
            if (r1 == 0) goto L_0x05ce
            java.lang.String r0 = "Dancification.selectAudioTrack"
            X.C349257zq.A02(r0)
            r1.onClick(r2)
            boolean r1 = r3.A01
            r0 = 1
            if (r1 == 0) goto L_0x0010
            r3.setSelected(r0)
            goto L_0x0010
        L_0x0145:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView r0 = (com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView) r0
            android.view.View$OnClickListener r0 = r0.A01
            if (r0 == 0) goto L_0x05ce
            r0.onClick(r2)
            goto L_0x0010
        L_0x0156:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x05ce
            r0 = 3
            r2.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.Lzf r0 = (X.C65787Lzf) r0
            X.Jj2 r0 = X.C65787Lzf.A00(r0)
            r0.A02()
            goto L_0x0010
        L_0x0171:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x05ce
            r0 = 3
            r2.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.Lzf r0 = (X.C65787Lzf) r0
            X.Jj2 r1 = X.C65787Lzf.A00(r0)
            X.KLU r0 = X.KLU.A00
            X.C60303Jj2.A01(r0, r1)
            goto L_0x0010
        L_0x018e:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x05ce
            r0 = 3
            r2.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.Jid r1 = X.JTR.A0l(r0)
            X.LmG r0 = X.C65037LmG.A00
            r1.A01(r0)
            goto L_0x0010
        L_0x01a9:
            java.lang.Object r3 = r1.A01
            X.Lh1 r3 = (X.C64724Lh1) r3
            java.util.List r1 = r3.A0O
            X.6Mr r0 = r3.A07
            int r0 = r1.indexOf(r0)
            int r0 = r0 + 1
            java.lang.Object r2 = X.JTT.A0m(r1, r0)
            X.6Mr r2 = (X.C306576Mr) r2
            r3.A07 = r2
            X.MVu r0 = r3.A06
            if (r0 == 0) goto L_0x01cf
            X.LED r1 = r0.BJn()
            if (r1 == 0) goto L_0x01cf
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r1.A03 = r2
        L_0x01cf:
            android.view.View r2 = r3.A01
            if (r2 != 0) goto L_0x01d7
            java.lang.String r1 = "emphasisButton"
            goto L_0x050d
        L_0x01d7:
            X.6Mr r1 = r3.A07
            X.6Mr r0 = X.C306576Mr.DISABLED
            boolean r0 = X.C51969G9p.A1a(r1, r0)
            r2.setActivated(r0)
            X.6Mr r0 = r3.A07
            X.C64724Lh1.A07(r3, r0)
            goto L_0x0010
        L_0x01e9:
            java.lang.Object r2 = r1.A01
            X.Lh1 r2 = (X.C64724Lh1) r2
            java.lang.Integer r1 = r2.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x01f5
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x01f5:
            r2.A08 = r0
            X.C64724Lh1.A04(r2)
            X.C64724Lh1.A03(r2)
            goto L_0x0010
        L_0x01ff:
            java.lang.Object r6 = r1.A01
            X.UAO r6 = (X.UAO) r6
            android.content.Context r5 = r6.A07
            X.8ab r4 = X.DbS.A0Y(r5)
            r0 = 2131972014(0x7f134fae, float:1.9581024E38)
            X.DbT.A19(r5, r4, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131971974(0x7f134f86, float:1.9580942E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 36
            X.LV3 r1 = X.LV3.A00(r6, r0)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r3 = 1
            r4.A0Y(r1, r0, r2, r3)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 37
            X.LV3 r1 = X.LV3.A00(r6, r0)
            X.8ae r0 = X.C358278ae.DEFAULT
            r4.A0X(r1, r0, r2, r3)
            X.AnonymousClass7TH.A0a(r4, r3)
            goto L_0x0010
        L_0x0241:
            java.lang.Object r0 = r1.A01
            X.L3s r0 = (X.C63708L3s) r0
            X.0eK r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.8Wi r0 = (X.C357068Wi) r0
            if (r0 == 0) goto L_0x0010
            r0.A07()
            goto L_0x0010
        L_0x0254:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x05ce
            r0 = 3
            r2.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.Ljc r0 = (X.C64876Ljc) r0
            X.JjN r4 = X.C64876Ljc.A00(r0)
            X.05G r5 = r4.A07
            java.lang.Object r0 = r5.getValue()
            X.Jvp r0 = (X.C61051Jvp) r0
            boolean r1 = r0.A09
            java.lang.Object r0 = r5.getValue()
            X.Jvp r0 = (X.C61051Jvp) r0
            if (r1 == 0) goto L_0x02ca
            android.text.Spannable r3 = r0.A01
            java.lang.Object r0 = r5.getValue()
            X.Jvp r0 = (X.C61051Jvp) r0
            android.text.Spannable r0 = r0.A01
            int r2 = r0.length()
            boolean r0 = X.C60319JjN.A05(r4)
            if (r0 == 0) goto L_0x02a5
            r0 = 64
            java.lang.String r1 = X.C60319JjN.A00(r3, r0, r2)
            if (r1 == 0) goto L_0x02a5
            java.util.HashMap r0 = r4.A04
            java.lang.Object r0 = r0.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x02a5
            X.C60319JjN.A01(r3, r4, r0, r2)
        L_0x02a5:
            java.lang.Object r2 = r5.getValue()
            r1 = r2
            X.Jvp r1 = (X.C61051Jvp) r1
            android.text.Spannable r0 = r1.A01
            java.lang.CharSequence r0 = X.00l.A0B(r0)
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r0)
            X.Jvp r0 = X.C61051Jvp.A01(r0, r1, (java.util.List) null, (java.util.List) null, (java.util.Set) null, 0, 16319, false, false, false, false)
            boolean r0 = r5.AIY(r2, r0)
            if (r0 == 0) goto L_0x02a5
            X.C61051Jvp.A03(r4, r5)
            X.KKj r0 = X.C61744KKj.A00
            X.C60319JjN.A02(r0, r4)
            goto L_0x0010
        L_0x02ca:
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r0 = r5.getValue()
            X.Jvp r0 = (X.C61051Jvp) r0
            android.text.Spannable r3 = r0.A01
            java.lang.Object r0 = r5.getValue()
            X.Jvp r0 = (X.C61051Jvp) r0
            android.text.Spannable r0 = r0.A01
            int r2 = r0.length()
            r0 = 35
            java.lang.String r1 = X.C60319JjN.A00(r3, r0, r2)
            if (r1 == 0) goto L_0x02a5
            int r0 = r1.length()
            if (r0 == 0) goto L_0x02a5
            com.instagram.model.hashtag.HashtagImpl r0 = X.C281965Ag.A00(r1)
            r4.A09(r3, r0, r2)
            goto L_0x02a5
        L_0x02f8:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x05ce
            r0 = 3
            r2.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.Ljc r0 = (X.C64876Ljc) r0
            X.JjN r6 = X.C64876Ljc.A00(r0)
            X.L9b r0 = r6.A02
            com.instagram.common.session.UserSession r0 = r0.A01
            X.27r r2 = X.27p.A01(r0)
            X.283 r0 = r2.A04
            X.JVj r1 = r0.A0C
            java.lang.String r0 = "CLEAR_QUICK_CAPTION"
            r2.A1Q(r1, r0)
            X.05G r5 = r6.A07
        L_0x0321:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.Jvp r3 = (X.C61051Jvp) r3
            java.lang.String r0 = ""
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r0)
            X.0sl r1 = X.0sl.A00
            r0 = 8127(0x1fbf, float:1.1388E-41)
            X.Jvp r0 = X.C61051Jvp.A01(r2, r3, (java.util.List) null, (java.util.List) null, r1, 0, r0, false, false, false, false)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0321
            X.C61051Jvp.A03(r6, r5)
            goto L_0x0010
        L_0x0341:
            r3 = 0
            X.0qQ.A0B(r2, r3)
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x0011
            r0 = 3
            r2.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            X.KHN r0 = (X.KHN) r0
            X.0sa r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            goto L_0x000d
        L_0x0359:
            r3 = 0
            X.0qQ.A0B(r2, r3)
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x0011
            r0 = 3
            r2.performHapticFeedback(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.capture.gallery.albumpicker.AlbumThumbnailView r0 = (com.instagram.creation.capture.gallery.albumpicker.AlbumThumbnailView) r0
            X.JwI r2 = r0.A00
            if (r2 == 0) goto L_0x0010
            X.8gM r1 = r0.A01
            if (r1 == 0) goto L_0x0010
            r0 = -1
            r1.Cuy(r2, r0)
            goto L_0x0010
        L_0x0379:
            r3 = 0
            X.0qQ.A0B(r2, r3)
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x0011
            r0 = 3
            r2.performHapticFeedback(r0)
            java.lang.Object r3 = r1.A01
            X.KKW r3 = (X.KKW) r3
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.KKS r0 = r3.A01
            if (r0 == 0) goto L_0x0010
            X.8gM r2 = r3.A05
            if (r2 == 0) goto L_0x0010
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = X.KKW.A00(r3, r0)
            r2.DiE(r1, r0)
            goto L_0x0010
        L_0x03a4:
            java.lang.Object r4 = r1.A01
            X.Ll7 r4 = (X.C64968Ll7) r4
            X.LG7 r0 = r4.A05
            if (r0 != 0) goto L_0x0416
            com.instagram.common.ui.base.IgTextView r1 = r4.A03
            if (r1 != 0) goto L_0x03b4
            java.lang.String r1 = "folderMenu"
            goto L_0x050d
        L_0x03b4:
            r0 = 2131238093(0x7f081ccd, float:1.8092455E38)
            r5 = 0
            r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r5, r0, r5)
            X.L3p r3 = new X.L3p
            r3.<init>(r5, r5)
            android.app.Activity r1 = r4.A0C
            com.instagram.common.session.UserSession r0 = r4.A0I
            X.LG7 r2 = new X.LG7
            r2.<init>(r1, r0, r3)
            r4.A05 = r2
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x0412
            X.LlD r0 = new X.LlD
            r0.<init>(r4, r5)
            r2.A01(r1, r0)
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x03e5
            X.0wj r2 = X.0wj.A01
            r1 = 245701013(0xea51995, float:4.0700275E-30)
            java.lang.String r0 = "CutoutStickerGalleryController: Gallery container is null"
            X.DbT.A1Q(r2, r0, r1)
        L_0x03e5:
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L_0x0010
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x0412
            X.5nL r1 = X.JTP.A0c(r0, r5)
            r1.A04 = r5
            X.2co r0 = X.C64968Ll7.A0R
            X.5nL r2 = r1.A0E(r0)
            int r0 = r3.getBottom()
            float r1 = (float) r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            if (r0 != 0) goto L_0x0406
            java.lang.String r1 = "recyclerView"
            goto L_0x050d
        L_0x0406:
            float r0 = r0.getTranslationY()
            r2.A0T(r1, r0)
            r2.A0H()
            goto L_0x0010
        L_0x0412:
            java.lang.String r1 = "overlayContainer"
            goto L_0x050d
        L_0x0416:
            X.C64968Ll7.A02(r4)
            goto L_0x0010
        L_0x041b:
            java.lang.Object r0 = r1.A01
            X.JyO r0 = (X.C61172JyO) r0
            X.0sa r0 = r0.A01
            goto L_0x000d
        L_0x0423:
            java.lang.Object r0 = r1.A01
            X.JyQ r0 = (X.C61174JyQ) r0
            X.0sa r0 = r0.A02
            goto L_0x000d
        L_0x042b:
            java.lang.Object r7 = r1.A01
            X.LWg r7 = (X.LWg) r7
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r7.A09
            r9 = 0
            r0.setEnabled(r9)
            com.instagram.arlink.ui.CameraMaskOverlay r0 = r7.A05
            r0.setEnabled(r9)
            X.KB6 r8 = r7.A0G
            android.view.TextureView r0 = r7.A01
            android.graphics.Bitmap r6 = r0.getBitmap()
            r6.getClass()
            int r0 = r7.A00
            r8.A02 = r0
            X.LOV r5 = r8.A0L
            r5.A00 = r6
            com.instagram.common.session.UserSession r0 = r5.A03
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            java.util.ArrayList r1 = r1.A05(r0)
            X.MAZ r0 = new X.MAZ
            r0.<init>((java.lang.Object) r5, (int) r9)
            java.util.Collections.sort(r1, r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x0465:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x047f
            X.3Q2 r3 = X.JTO.A0m(r4)
            X.3QD r1 = r3.A1f
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r1 == r0) goto L_0x0465
            X.1ua r2 = r5.A04
            java.lang.String r1 = r3.A35
            X.4DH r0 = r5.A02
            r2.A07(r0, r1, r9)
            goto L_0x0465
        L_0x047f:
            X.0nO r2 = X.0nY.A00()
            r1 = 1
            X.KIg r0 = new X.KIg
            r0.<init>(r6, r5)
            r2.ATE(r0)
            X.KB6.A03(r8)
            X.KB6.A05(r8)
            r8.A07 = r9
            goto L_0x04a2
        L_0x0495:
            java.lang.Object r7 = r1.A01
            X.LWg r7 = (X.LWg) r7
            X.KB6 r1 = r7.A0G
            X.KB6.A03(r1)
            r0 = 0
            r1.A07 = r0
            r1 = 1
        L_0x04a2:
            r7.A05(r1)
            goto L_0x0010
        L_0x04a7:
            java.lang.Object r0 = r1.A01
            X.KB1 r0 = (X.KB1) r0
            X.Lbn r1 = r0.A04
            if (r1 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.A01
            int r0 = r0.getHeight()
            X.2cs r2 = r1.A04
            double r0 = (double) r0
            r2.A06(r0)
            goto L_0x0010
        L_0x04bd:
            java.lang.Object r2 = r1.A01
            com.instagram.arlink.fragment.NametagController r2 = (com.instagram.arlink.fragment.NametagController) r2
            android.view.View r1 = r2.mTopBarScanQRButton
            r0 = 0
            r1.setEnabled(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            com.instagram.arlink.fragment.NametagController.A03(r2, r0)
            goto L_0x0010
        L_0x04ce:
            java.lang.Object r0 = r1.A01
            X.JeF r0 = (X.C60047JeF) r0
            X.Kze r0 = r0.A00
            com.instagram.archive.fragment.SelectHighlightsCoverFragment r2 = r0.A00
            android.content.Context r1 = r2.requireContext()
            com.instagram.common.session.UserSession r0 = r2.A04
            X.36U r4 = X.AnonymousClass36R.A00(r1, r0, r2)
            X.36W r3 = X.AnonymousClass36W.PROFILE_PHOTO
            X.JWU r2 = new X.JWU
            r2.<init>(r3)
            r0 = 0
            r2.A05 = r0
            r2.A0C = r0
            r2.A09 = r0
            r2.A0A = r0
            r0 = 1
            r2.A08 = r0
            com.instagram.model.creation.MediaCaptureConfig r1 = new com.instagram.model.creation.MediaCaptureConfig
            r1.<init>((X.JWU) r2)
            X.EXF r0 = X.EXF.A0J
            r4.Ewc(r0, r1, r3)
            goto L_0x0010
        L_0x04ff:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r1 = r1.A01
            X.K5E r1 = (X.K5E) r1
            android.view.View r0 = r1.A00
            if (r0 != 0) goto L_0x0515
            java.lang.String r1 = "backButton"
        L_0x050d:
            X.0qQ.A0F(r1)
        L_0x0510:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0515:
            if (r2 != r0) goto L_0x052a
            X.K5E.A00(r1)
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.M1h r2 = new X.M1h
            r2.<init>(r1)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            goto L_0x0010
        L_0x052a:
            android.view.View r0 = r1.A01
            if (r0 != 0) goto L_0x0531
            java.lang.String r1 = "clearButton"
            goto L_0x050d
        L_0x0531:
            if (r2 != r0) goto L_0x05ce
            java.lang.String r0 = ""
            X.K5E.A01(r1, r0)
            goto L_0x0010
        L_0x053a:
            java.lang.Object r1 = r1.A01
            X.Jos r1 = (X.C60645Jos) r1
            X.L2K r0 = r1.A03
            X.L3R r4 = r1.A00
            X.0nA.A0F(r2)
            X.Jku r2 = r0.A00
            java.util.List r0 = r2.A01
            int r1 = r0.indexOf(r4)
            int r0 = r2.A00
            if (r1 == r0) goto L_0x05ce
            r2.A00 = r1
            r2.notifyItemChanged(r0)
            int r0 = r2.A00
            r2.notifyItemChanged(r0)
            instagram.features.stories.fragment.ReelMoreOptionsFragment r3 = r2.A03
            java.lang.String r2 = r4.A01
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r1 = r3.A03
            X.8CB r0 = new X.8CB
            r0.<init>(r1)
            r0.A0A = r2
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A01()
            r3.A03 = r0
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0B(r3)
            goto L_0x0010
        L_0x0573:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            goto L_0x0010
        L_0x0577:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r1 = r1.A01
            X.KVN r1 = (X.KVN) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.3NL r0 = r1.A00
            goto L_0x059d
        L_0x0584:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r1 = r1.A01
            X.KVN r1 = (X.KVN) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.3NL r0 = r1.A01
            goto L_0x059d
        L_0x0591:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r1 = r1.A01
            X.KVL r1 = (X.KVL) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.3NL r0 = r1.A00
        L_0x059d:
            if (r0 == 0) goto L_0x05ce
            boolean r3 = r0.Dqe(r2)
            return r3
        L_0x05a4:
            java.lang.Object r0 = r1.A01
            X.JXp r0 = (X.C59772JXp) r0
            X.MUj r0 = r0.A07
            boolean r3 = r0.DuB()
            return r3
        L_0x05af:
            java.lang.Object r2 = r1.A01
            X.JXp r2 = (X.C59772JXp) r2
            boolean r0 = r2.A02
            r1 = 1
            if (r0 != 0) goto L_0x05c0
            int r0 = r2.A01
            if (r0 == r1) goto L_0x05c0
            int r0 = r2.A00
            if (r0 == 0) goto L_0x05ce
        L_0x05c0:
            X.MUj r0 = r2.A07
            boolean r3 = r0.D8E()
            return r3
        L_0x05c7:
            java.lang.String r0 = "media cannot be null to launch player"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x05ce:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61685KHt.Dqe(android.view.View):boolean");
    }
}
