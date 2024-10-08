package X;

public final class JK0 extends 0Yg implements 0sJ {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JK0(Object obj, int i) {
        super(4);
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Throwable th) {
        String message = th.getMessage();
        if (message != null && message.length() != 0) {
            String message2 = th.getMessage();
            0qQ.A0A(message2);
            0wb.A03("PromoteErrorNativeUri", message2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v98, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v101, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v32, types: [java.lang.Integer] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03ab, code lost:
        r1.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x07b7, code lost:
        if ("native".equals(X.DbT.A09(r8).getHost()) != false) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x09a2, code lost:
        r5.AEf(r3.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0a71, code lost:
        if (((X.C53567Gqi) r8).A00 != 0) goto L_0x0a73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0ab4, code lost:
        if (((X.C53567Gqi) r8).A00 != 1) goto L_0x0ab6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30, java.lang.Object r31) {
        /*
            r27 = this;
            r4 = r27
            r3 = r31
            r1 = r30
            r2 = r29
            r0 = r28
            int r5 = r4.A00
            switch(r5) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0067;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00e4;
                case 5: goto L_0x0142;
                case 6: goto L_0x015c;
                case 7: goto L_0x01c1;
                case 8: goto L_0x01d0;
                case 9: goto L_0x01e3;
                case 10: goto L_0x0227;
                case 11: goto L_0x0247;
                case 12: goto L_0x02d4;
                case 13: goto L_0x030f;
                case 14: goto L_0x0367;
                case 15: goto L_0x03b0;
                case 16: goto L_0x03c8;
                case 17: goto L_0x03e2;
                case 18: goto L_0x0418;
                case 19: goto L_0x0475;
                case 20: goto L_0x04b7;
                case 21: goto L_0x09ab;
                case 22: goto L_0x03fe;
                case 23: goto L_0x0ac5;
                case 24: goto L_0x09d2;
                case 25: goto L_0x09eb;
                case 26: goto L_0x0a10;
                default: goto L_0x000f;
            }
        L_0x000f:
            X.3OA r0 = (X.AnonymousClass3OA) r0
            X.4jb r2 = (X.C271794jb) r2
            X.HpF r1 = (X.C55894HpF) r1
            X.C51965G9l.A1U(r3)
            X.AnonymousClass7TG.A1T(r0, r2, r1)
            java.lang.Object r3 = r4.A01
            X.GCb r3 = (X.C52029GCb) r3
            X.GCd r3 = r3.A0H
            r3.A0L(r2, r0, r1)
        L_0x0024:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0027:
            X.C51965G9l.A1U(r2)
            X.5Wy r1 = (X.C286575Wy) r1
            int r5 = X.AnonymousClass7TE.A0M(r3)
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0039
            int r2 = X.G9t.A0O(r1, r0)
            r5 = r5 | r2
        L_0x0039:
            r3 = r5 & 131(0x83, float:1.84E-43)
            r2 = 130(0x82, float:1.82E-43)
            if (r3 != r2) goto L_0x0045
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x03ab
        L_0x0045:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0053
            r3 = 1701631206(0x656cd4e6, float:6.990036E22)
            java.lang.String r2 = "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)"
            X.0fL.A01(r3, r2)
        L_0x0053:
            java.lang.Object r3 = r4.A01
            X.0sK r3 = (X.0sK) r3
            r2 = r5 & 14
            X.C51967G9n.A1M(r0, r1, r3, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0024
            r0 = 923511708(0x370bab9c, float:8.3250015E-6)
            goto L_0x0a8a
        L_0x0067:
            X.C51965G9l.A1U(r2)
            X.5Wy r1 = (X.C286575Wy) r1
            int r5 = X.AnonymousClass7TE.A0M(r3)
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0079
            int r2 = X.G9t.A0O(r1, r0)
            r5 = r5 | r2
        L_0x0079:
            r3 = r5 & 131(0x83, float:1.84E-43)
            r2 = 130(0x82, float:1.82E-43)
            if (r3 != r2) goto L_0x0085
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x03ab
        L_0x0085:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0093
            r3 = 912085837(0x365d534d, float:3.2980054E-6)
            java.lang.String r2 = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:47)"
            X.0fL.A01(r3, r2)
        L_0x0093:
            java.lang.Object r3 = r4.A01
            X.0sK r3 = (X.0sK) r3
            r2 = r5 & 14
            X.C51967G9n.A1M(r0, r1, r3, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0024
            r0 = 1524896422(0x5ae412a6, float:3.20983994E16)
            goto L_0x0a8a
        L_0x00a7:
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            X.DbZ.A0t(r5, r0, r1, r3)
            java.lang.Object r4 = r4.A01
            X.QQ0 r4 = (X.QQ0) r4
            X.SUF r5 = r4.A01
            if (r5 == 0) goto L_0x0024
            java.lang.String r6 = r4.A02
            java.lang.String r9 = "NATIVE"
            java.lang.String r10 = ""
            r7 = r0
            r8 = r1
            r11 = r3
            r12 = r2
            r5.A0F(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0024
        L_0x00ca:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = (java.lang.String) r2
            long r5 = X.AnonymousClass7TE.A0R(r1)
            X.XRm r3 = (X.C21267XRm) r3
            X.C51974G9v.A1K(r0, r2, r3)
            java.lang.Object r4 = r4.A01
            X.QhQ r4 = (X.C8132QhQ) r4
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            X.C8132QhQ.A04(r3, r4, r1, r0, r2)
            goto L_0x0024
        L_0x00e4:
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = (java.lang.String) r3
            X.C51974G9v.A1O(r0, r2, r1, r3)
            java.lang.Object r6 = r4.A01
            X.K8G r6 = (X.K8G) r6
            X.0eM r4 = r6.A09
            java.lang.Object r4 = r4.getValue()
            X.JjC r4 = (X.C60311JjC) r4
            X.LRN r7 = r4.A02
            java.lang.Long r12 = r4.A03()
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            java.lang.Integer r11 = X.AnonymousClass05K.A1F
            r8 = 0
            r9 = r8
            r13 = r3
            r14 = r1
            r15 = r8
            X.Jr6 r5 = X.LRN.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.LRO r4 = r7.A01
            X.QP5 r3 = r7.A00
            java.lang.String r3 = r3.A03
            r4.A02(r5, r3)
            X.0eM r3 = r6.A08
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            X.328 r3 = new X.328
            r3.<init>(r6)
            X.32A r5 = new X.32A
            r5.<init>(r6, r4, r3)
            java.lang.String r3 = r6.A00
            r5.A0C = r3
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            X.LwQ r3 = new X.LwQ
            r3.<init>(r6, r1)
            X.Upq r1 = new X.Upq
            r1.<init>((android.app.Activity) r4, (android.view.View) r2, (X.C230222pE) r3)
            r5.A05 = r1
            X.3BQ r1 = X.AnonymousClass3BQ.APPRECIATION_GIFT_FEED
            r5.A08(r0, r1, r2)
            goto L_0x0024
        L_0x0142:
            int r6 = X.AnonymousClass7TE.A0M(r0)
            X.AnonymousClass7TG.A1P(r2, r3)
            java.lang.Object r5 = r4.A01
            if (r30 != 0) goto L_0x0154
            X.JEY r4 = X.JEY.A00
        L_0x014f:
            r4.invoke(r2, r3)
            goto L_0x0024
        L_0x0154:
            r0 = 15
            X.JGL r4 = new X.JGL
            r4.<init>((int) r6, (int) r0, (java.lang.Object) r5, (java.lang.Object) r1)
            goto L_0x014f
        L_0x015c:
            int r5 = X.AnonymousClass7TE.A0M(r2)
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.AnonymousClass7TE.A0M(r3)
            r2 = r3 & 6
            if (r2 != 0) goto L_0x01bf
            int r2 = X.G9t.A0O(r1, r0)
            r2 = r2 | r3
        L_0x016f:
            r0 = r3 & 48
            if (r0 != 0) goto L_0x0178
            int r0 = X.G9t.A06(r1, r5)
            r2 = r2 | r0
        L_0x0178:
            r2 = r2 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r2 != r0) goto L_0x0184
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x03ab
        L_0x0184:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0190
            r0 = -116467151(0xfffffffff90eda31, float:-4.6358225E34)
            X.C51965G9l.A17(r0)
        L_0x0190:
            java.lang.Object r0 = r4.A01
            java.lang.Object r2 = X.C51966G9m.A19(r0, r5)
            X.0eP r2 = (X.0eP) r2
            r0 = -427251470(0xffffffffe688a8f2, float:-3.2267917E23)
            r1.ExS(r0)
            int r5 = X.C51970G9q.A0B(r2)
            int r0 = X.C51969G9p.A0A(r2)
            r4 = 0
            java.lang.String r3 = X.C304346Dc.A00(r1, r0)
            r2 = 1
            X.Gpe r0 = new X.Gpe
            r0.<init>(r3, r2)
            X.C56649I6e.A05(r1, r0, r5)
            boolean r0 = X.C51970G9q.A1a(r1, r4)
            if (r0 == 0) goto L_0x0024
            r0 = -234771124(0xfffffffff201ad4c, float:-2.5685164E30)
            goto L_0x0a8a
        L_0x01bf:
            r2 = r3
            goto L_0x016f
        L_0x01c1:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r4.A01
            X.IPS r2 = (X.IPS) r2
            X.0sK r2 = r2.A07
            r2.invoke(r1, r0, r3)
            goto L_0x0024
        L_0x01d0:
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = X.C51975G9x.A1X(r3, r0)
            java.lang.Object r2 = r4.A01
            X.Gwq r2 = (X.C53946Gwq) r2
            X.GgO r2 = r2.A02
            r2.A0W(r0, r1, r3)
            goto L_0x0024
        L_0x01e3:
            X.C51965G9l.A1U(r2)
            X.5Wy r1 = (X.C286575Wy) r1
            int r5 = X.AnonymousClass7TE.A0M(r3)
            r2 = 0
            X.0qQ.A0B(r0, r2)
            r2 = r5 & 6
            if (r2 != 0) goto L_0x01f9
            int r2 = X.G9t.A0O(r1, r0)
            r5 = r5 | r2
        L_0x01f9:
            r3 = r5 & 131(0x83, float:1.84E-43)
            r2 = 130(0x82, float:1.82E-43)
            if (r3 != r2) goto L_0x0205
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x03ab
        L_0x0205:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0213
            r3 = -770617598(0xffffffffd2114f02, float:-1.56023947E11)
            java.lang.String r2 = "com.instagram.compose.core.ui.lazylist.IgLazyListScopeImpl.item.<anonymous> (IgLazyListScopeImpl.kt:53)"
            X.0fL.A01(r3, r2)
        L_0x0213:
            java.lang.Object r3 = r4.A01
            X.0sK r3 = (X.0sK) r3
            r2 = r5 & 14
            X.C51967G9n.A1M(r0, r1, r3, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0024
            r0 = -1646780524(0xffffffff9dd81f94, float:-5.7207375E-21)
            goto L_0x0a8a
        L_0x0227:
            X.8IJ r2 = (X.AnonymousClass8IJ) r2
            java.io.File r1 = (java.io.File) r1
            boolean r5 = X.AnonymousClass7TE.A1a(r3)
            java.lang.Object r0 = r4.A01
            X.KLp r0 = (X.C61776KLp) r0
            X.L1z r0 = r0.A07
            X.8a4 r3 = r0.A00
            com.instagram.music.common.model.TrackSnippet r0 = r3.A0Q
            if (r0 == 0) goto L_0x0024
            r3.A0J(r2, r1, r5)
            X.AJ9 r0 = r3.A0Z
            if (r0 == 0) goto L_0x0024
            X.AJ9.A05(r0)
            goto L_0x0024
        L_0x0247:
            java.lang.String r0 = (java.lang.String) r0
            X.8IJ r2 = (X.AnonymousClass8IJ) r2
            java.lang.Object r7 = r4.A01
            X.Jfl r7 = (X.C60105Jfl) r7
            com.instagram.common.session.UserSession r1 = r7.A03
            X.27r r6 = X.27p.A01(r1)
            X.4yP r1 = r6.A0J()
            if (r1 == 0) goto L_0x0269
            X.283 r1 = r6.A04
            X.JVj r5 = r1.A0C
            r4 = 1
            X.80P r3 = X.27r.A00(r2)
            java.lang.String r1 = "AUDIO_FILTERS_SELECT_TAP"
            X.27r.A04(r5, r3, r6, r1, r4)
        L_0x0269:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r7.A08
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r7.A0K
            com.instagram.music.common.model.AudioOverlayTrack r11 = r1.A03(r0)
            if (r11 != 0) goto L_0x0287
            X.2Fk r0 = r1.A06
            java.lang.Object r1 = r0.A02()
            boolean r0 = r1 instanceof X.AnonymousClass8Y4
            if (r0 == 0) goto L_0x0024
            X.8fx r1 = (X.C361278fx) r1
            if (r1 == 0) goto L_0x0024
            java.lang.Object r11 = r1.A00()
            com.instagram.music.common.model.AudioOverlayTrack r11 = (com.instagram.music.common.model.AudioOverlayTrack) r11
        L_0x0287:
            int r0 = r11.A03
            r16 = r0
            int r15 = r11.A02
            int r14 = r11.A04
            int r13 = r11.A01
            java.lang.String r12 = r11.A0B
            java.lang.String r10 = r11.A0A
            java.lang.String r9 = r11.A0E
            com.instagram.music.common.model.MusicBrowseCategory r8 = r11.A09
            com.instagram.music.common.model.MusicAssetModel r6 = r11.A08
            com.instagram.music.common.model.DownloadedTrack r5 = r11.A06
            float r4 = r11.A00
            java.lang.String r1 = r11.A0C
            com.instagram.music.common.model.InstagramAudioApplySource r0 = r11.A07
            com.instagram.music.common.model.AudioOverlayTrack r3 = new com.instagram.music.common.model.AudioOverlayTrack
            r20 = r9
            r21 = r1
            r22 = r4
            r23 = r16
            r24 = r15
            r25 = r14
            r26 = r13
            r19 = r10
            r18 = r12
            r17 = r8
            r16 = r6
            r15 = r0
            r14 = r5
            r13 = r2
            r12 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r0 = r11.A0D
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r3.A0D = r0
            X.8Y4 r0 = new X.8Y4
            r0.<init>(r3)
            r7.A0Z(r0, r11, r1)
            goto L_0x0024
        L_0x02d4:
            X.C51965G9l.A1U(r0)
            X.I12 r2 = (X.I12) r2
            X.5Wy r1 = (X.C286575Wy) r1
            int r5 = X.AnonymousClass7TE.A0M(r3)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x02f1
            r3 = 983348416(0x3a9cb4c0, float:0.0011955723)
            java.lang.String r0 = "com.instagram.creation.genai.magicmod.tools.backdrop.ui.BackdropNonLinearSection.<anonymous>.<anonymous>.<anonymous> (BackdropNonLinearSection.kt:70)"
            X.0fL.A01(r3, r0)
        L_0x02f1:
            java.lang.Object r3 = r4.A01
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r3 = (com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform) r3
            r6 = 0
            int r0 = r5 >> 3
            r11 = r0 & 14
            r12 = 28
            r9 = r6
            r10 = r6
            r5 = r1
            r7 = r2
            r8 = r3
            X.C56276Hvk.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0024
            r0 = -179489702(0xfffffffff54d345a, float:-2.601276E32)
            goto L_0x0a8a
        L_0x030f:
            int r6 = X.AnonymousClass7TE.A0M(r2)
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.AnonymousClass7TE.A0M(r3)
            r2 = r3 & 6
            if (r2 != 0) goto L_0x0365
            int r5 = X.G9t.A0O(r1, r0)
            r5 = r5 | r3
        L_0x0322:
            r0 = r3 & 48
            if (r0 != 0) goto L_0x032b
            int r0 = X.G9t.A06(r1, r6)
            r5 = r5 | r0
        L_0x032b:
            r2 = r5 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r2 != r0) goto L_0x0337
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x03ab
        L_0x0337:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0343
            r0 = -588488195(0xffffffffdcec61fd, float:-5.3228667E17)
            X.C51965G9l.A17(r0)
        L_0x0343:
            java.lang.Object r0 = r4.A01
            java.lang.Object r3 = X.C51966G9m.A19(r0, r6)
            r2 = r5 & 14
            X.N49 r3 = (X.N49) r3
            r0 = 696046235(0x297cd29b, float:5.613791E-14)
            r1.ExS(r0)
            int r0 = r2 >> 3
            r0 = r0 & 14
            X.HZ9.A00(r1, r3, r0)
            boolean r0 = X.C51970G9q.A1Z(r1)
            if (r0 == 0) goto L_0x0024
            r0 = -1813577710(0xffffffff93e70012, float:-5.8312667E-27)
            goto L_0x0a8a
        L_0x0365:
            r5 = r3
            goto L_0x0322
        L_0x0367:
            X.C51965G9l.A1U(r2)
            X.5Wy r1 = (X.C286575Wy) r1
            int r0 = X.AnonymousClass7TE.A0M(r3)
            r2 = r0 & 129(0x81, float:1.81E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r2 != r0) goto L_0x037c
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x03ab
        L_0x037c:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x038a
            r2 = -293753822(0xffffffffee7dac22, float:-1.9626951E28)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.threadmedia.SharedLinksScreen.<anonymous>.<anonymous>.<anonymous> (DirectThreadSharedLinksFragment.kt:78)"
            X.0fL.A01(r2, r0)
        L_0x038a:
            r5 = 0
            java.lang.Object r0 = r4.A01
            X.GSY r0 = (X.GSY) r0
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A03
            java.lang.Object r0 = r0.A00
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r9 = 0
            r10 = 1
            r4 = r1
            r6 = r0
            r7 = r3
            r8 = r2
            X.C56292Hw5.A01(r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0024
            r0 = -333944160(0xffffffffec186aa0, float:-7.37041E26)
            goto L_0x0a8a
        L_0x03ab:
            r1.Evl()
            goto L_0x0024
        L_0x03b0:
            X.1Xj r0 = (X.1Xj) r0
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            X.GQ0 r1 = (X.GQ0) r1
            int r5 = X.AnonymousClass7TE.A0M(r3)
            X.AnonymousClass7TG.A1T(r0, r2, r1)
            java.lang.Object r3 = r4.A01
            X.Hou r3 = (X.C55873Hou) r3
            X.JOA r3 = r3.A01
            r3.DA5(r0, r1, r2, r5)
            goto L_0x0024
        L_0x03c8:
            X.1Xj r0 = (X.1Xj) r0
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            int r5 = X.AnonymousClass7TE.A0M(r1)
            boolean r3 = X.AnonymousClass7TE.A1a(r3)
            X.AnonymousClass7TG.A1N(r0, r2)
            java.lang.Object r1 = r4.A01
            X.Hou r1 = (X.C55873Hou) r1
            X.3vK r1 = r1.A02
            r1.D4g(r0, r2, r5, r3)
            goto L_0x0024
        L_0x03e2:
            X.1Xj r0 = (X.1Xj) r0
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.String r1 = (java.lang.String) r1
            int r7 = X.AnonymousClass7TE.A0M(r3)
            r8 = 0
            X.C51973G9u.A1E(r0, r2, r1)
            java.lang.Object r3 = r4.A01
            X.Hou r3 = (X.C55873Hou) r3
            X.3Wa r3 = r3.A06
            r4 = r0
            r5 = r2
            r6 = r1
            r3.D3K(r4, r5, r6, r7, r8)
            goto L_0x0024
        L_0x03fe:
            int r3 = X.AnonymousClass7TE.A0M(r0)
            X.C51965G9l.A1U(r2)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.6k9 r0 = X.C315586kA.A00(r3)
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "controller"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0418:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = (java.lang.String) r1
            X.HLE r3 = (X.HLE) r3
            r6 = 0
            X.DbZ.A0t(r6, r0, r1, r3)
            java.lang.Object r5 = r4.A01
            X.Hkq r5 = (X.C55631Hkq) r5
            r4 = 1
            int r3 = r3.ordinal()
            if (r3 == r6) goto L_0x0440
            if (r3 != r4) goto L_0x0b04
            android.content.Context r4 = r5.A00
            com.instagram.common.session.UserSession r3 = r5.A01
            java.lang.String r7 = "FEED_POST"
            r5 = r3
            r6 = r0
            r8 = r2
            r9 = r1
            X.LTV.A04(r4, r5, r6, r7, r8, r9)
            goto L_0x0024
        L_0x0440:
            android.content.Context r6 = r5.A00
            com.instagram.common.session.UserSession r7 = r5.A01
            java.lang.String r4 = "FEED_POST"
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.lang.String r3 = "fundraiser_id"
            r9.put(r3, r0)
            java.lang.String r0 = "source_name"
            r9.put(r0, r4)
            if (r2 == 0) goto L_0x045f
            r0 = 1834(0x72a, float:2.57E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.put(r0, r2)
        L_0x045f:
            r0 = 1832(0x728, float:2.567E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.put(r0, r1)
            r0 = 257(0x101, float:3.6E-43)
            java.lang.String r8 = X.C273654mx.A00(r0)
            r10 = 60
            X.C55175HdR.A00(r6, r7, r8, r9, r10)
            goto L_0x0024
        L_0x0475:
            com.instagram.newsfeed.ui.InlineLinkUrn r0 = (com.instagram.newsfeed.ui.InlineLinkUrn) r0
            X.5Gi r2 = (X.C283155Gi) r2
            int r5 = X.AnonymousClass7TE.A0M(r1)
            X.0sa r3 = (X.C62320sa) r3
            X.C51974G9v.A1K(r0, r2, r3)
            java.lang.Object r1 = r4.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A07
            java.lang.Object r4 = r1.getValue()
            X.F22 r4 = (X.F22) r4
            java.lang.Object r1 = r3.invoke()
            X.JV7 r1 = (X.JV7) r1
            boolean r1 = r4.A00(r1, r2, r0, r5)
            if (r1 != 0) goto L_0x0024
            X.0wj r5 = X.0wj.A01
            r4 = 817901067(0x30c02e0b, float:1.3982925E-9)
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Unhandled InlineLinkUrn: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = "; newsfeed story id: "
            r3.append(r0)
            java.lang.String r0 = r2.A09
            r3.append(r0)
            goto L_0x09a2
        L_0x04b7:
            X.GRC r0 = (X.GRC) r0
            X.EVf r2 = (X.C48087EVf) r2
            X.0sa r3 = (X.C62320sa) r3
            r5 = 0
            X.0qQ.A0B(r0, r5)
            r6 = 1
            r8 = 3
            X.0qQ.A0B(r2, r6)
            X.0qQ.A0B(r3, r8)
            boolean r7 = r0 instanceof X.C52388GQn
            if (r7 == 0) goto L_0x0513
            X.GQn r0 = (X.C52388GQn) r0
            X.GQo r5 = r0.A01
            X.5Gi r6 = r5.A01
            X.EVf r5 = X.C48087EVf.PRIMARY_BUTTON
            if (r2 != r5) goto L_0x04f6
            boolean r1 = r1 instanceof X.C52398GQx
            if (r1 == 0) goto L_0x04f6
            com.instagram.user.model.User r5 = r6.A04()
            if (r5 == 0) goto L_0x0024
            java.lang.Object r1 = r4.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r2 = X.DbV.A0Z(r1)
            int r1 = r0.A00
            java.lang.Object r0 = r3.invoke()
            X.JV7 r0 = (X.JV7) r0
            r2.A0G(r0, r5, r1)
            goto L_0x0024
        L_0x04f6:
            java.lang.Object r1 = r4.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A0C
            java.lang.Object r7 = r1.getValue()
            X.JS9 r7 = (X.JS9) r7
            int r0 = r0.A00
            java.lang.Object r9 = r3.invoke()
            X.JV7 r9 = (X.JV7) r9
            r8 = 0
            r12 = r0
            r11 = r6
            r10 = r2
            r7.D29(r8, r9, r10, r11, r12)
            goto L_0x0024
        L_0x0513:
            boolean r7 = r0 instanceof X.GS0
            r14 = 0
            if (r7 == 0) goto L_0x058f
            X.GS0 r0 = (X.GS0) r0
            X.GRz r6 = r0.A01
            X.3UM r6 = r6.A01
            X.EVf r7 = X.C48087EVf.PRIMARY_BUTTON
            if (r2 != r7) goto L_0x054a
            boolean r7 = r1 instanceof X.C52398GQx
            if (r7 == 0) goto L_0x054a
            java.lang.Object r5 = r4.A01
            X.Dcv r5 = (X.C46352Dcv) r5
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r4 = X.DbV.A0Z(r5)
            com.instagram.user.model.User r2 = r6.CCd()
            int r1 = r0.A00
            java.lang.Object r0 = r3.invoke()
            X.JV7 r0 = (X.JV7) r0
            r4.A0G(r0, r2, r1)
            X.0eM r0 = r5.A0F
            java.lang.Object r0 = r0.getValue()
            X.DdO r0 = (X.DdO) r0
            r0.DGN(r6, r14, r1)
            goto L_0x0024
        L_0x054a:
            X.EVf r3 = X.C48087EVf.END_ICON
            if (r2 != r3) goto L_0x057c
            boolean r1 = r1 instanceof X.HCL
            if (r1 == 0) goto L_0x057c
            java.lang.Object r7 = r4.A01
            X.Dcv r7 = (X.C46352Dcv) r7
            X.0eM r1 = r7.A0L
            X.2YL r4 = X.DbS.A0H(r1)
            X.0qQ.A0B(r6, r5)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 43
            X.MH3 r1 = new X.MH3
            r1.<init>(r4, r6, r14, r2)
            X.AnonymousClass7TE.A1Z(r1, r3)
            X.0eM r1 = r7.A0F
            java.lang.Object r1 = r1.getValue()
            X.DdO r1 = (X.DdO) r1
            int r0 = r0.A00
            r1.D9T(r6, r14, r0)
            goto L_0x0024
        L_0x057c:
            java.lang.Object r1 = r4.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A0F
            java.lang.Object r1 = r1.getValue()
            X.DdO r1 = (X.DdO) r1
            int r0 = r0.A00
            r1.Dw1(r6, r14, r0)
            goto L_0x0024
        L_0x058f:
            boolean r1 = r0 instanceof X.GSF
            if (r1 == 0) goto L_0x05ca
            boolean r0 = X.FC6.A02()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r4 = r4.A01
            X.Dcv r4 = (X.C46352Dcv) r4
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.getSession()
            X.6Yo r3 = X.DbS.A0M(r1, r0)
            X.1pQ r0 = X.FC6.A00()
            X.Ebd r2 = r0.A00()
            r0 = 2131960850(0x7f132412, float:1.955838E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 1615(0x64f, float:2.263E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.E3O r0 = r2.A01(r0, r1)
            r3.A0B(r14, r0)
            r3.A04()
            goto L_0x0024
        L_0x05ca:
            boolean r1 = r0 instanceof X.HCI
            if (r1 == 0) goto L_0x0661
            int r1 = r2.ordinal()
            java.lang.Object r0 = r4.A01
            X.Dcv r0 = (X.C46352Dcv) r0
            X.0eM r0 = r0.A09
            java.lang.Object r2 = r0.getValue()
            X.Dev r2 = (X.C46433Dev) r2
            if (r1 != r8) goto L_0x061c
            r2.A00()
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r2.A03
            java.lang.String r11 = "activity_feed_reminder"
            java.lang.String r12 = "activity_feed"
            java.lang.String r13 = "cancel_activity_feed_reminder"
            X.Xtl r10 = new X.Xtl
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.Ckp(r10)
            X.4DH r4 = r2.A02
            com.instagram.common.session.UserSession r0 = r2.A05
            X.1NY r3 = X.DbU.A0N(r0)
            java.lang.String r0 = "business_conversion/update_activity_feed_reminder_data/"
            r3.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r3.A0R(r1, r0)
            X.1OC r1 = X.DbT.A0U(r3, r6)
            r0 = 14
            X.H50.A00(r1, r2, r0)
            r4.schedule(r1)
            goto L_0x0024
        L_0x061c:
            com.instagram.common.session.UserSession r0 = r2.A05
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            boolean r0 = r0.CPm()
            r2.A00 = r0
            X.C322576w3.A00()
            X.4DH r4 = r2.A02
            android.content.Context r1 = r4.requireContext()
            java.lang.Class<com.instagram.business.activity.BusinessConversionActivity> r0 = com.instagram.business.activity.BusinessConversionActivity.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r1, r0)
            android.os.Bundle r2 = r4.requireArguments()
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "activity_feed"
            r2.putString(r1, r0)
            r0 = 312(0x138, float:4.37E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putInt(r0, r5)
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            r0 = 532(0x214, float:7.45E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putInt(r0, r5)
            r3.putExtras(r2)
            r0 = 11
            X.0kR.A0I(r3, r4, r0)
            goto L_0x0024
        L_0x0661:
            boolean r1 = r0 instanceof X.GST
            if (r1 == 0) goto L_0x0699
            java.lang.Object r1 = r4.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A09
            java.lang.Object r1 = r1.getValue()
            X.Dev r1 = (X.C46433Dev) r1
            X.GWH r4 = X.GWH.A01
            X.GST r0 = (X.GST) r0
            X.GRr r3 = r0.A00
        L_0x0677:
            X.JQI r3 = (X.JQI) r3
            r2 = 0
            X.GWH r0 = X.GWH.A01
            if (r4 != r0) goto L_0x080f
            X.2aD r4 = X.2aD.A0C
            java.lang.String r0 = "for ads manager sticky notification, this should not be null"
            X.17k.A07(r3, r0)
            r0 = r3
            X.GRr r0 = (X.C52414GRr) r0
            X.JwB r9 = r0.A02
            if (r9 == 0) goto L_0x07f6
            java.lang.String r8 = r9.A03
            java.util.Set r0 = X.C55347HgF.A00
            if (r8 == 0) goto L_0x0759
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0759
            goto L_0x06b0
        L_0x0699:
            boolean r1 = r0 instanceof X.GSO
            if (r1 == 0) goto L_0x087f
            java.lang.Object r1 = r4.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A09
            java.lang.Object r1 = r1.getValue()
            X.Dev r1 = (X.C46433Dev) r1
            X.GWH r4 = X.GWH.A02
            X.GSO r0 = (X.GSO) r0
            X.GSP r3 = r0.A00
            goto L_0x0677
        L_0x06b0:
            android.net.Uri r10 = X.DbT.A09(r8)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            java.lang.String r7 = r10.getScheme()     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            java.lang.String r0 = "ig"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r0 != 0) goto L_0x06ca
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r0 != 0) goto L_0x06ca
            goto L_0x075b
        L_0x06ca:
            java.lang.String r7 = "native"
            java.lang.String r0 = r10.getHost()     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            boolean r0 = r7.equals(r0)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r0 != 0) goto L_0x06d9
            r13 = 0
            goto L_0x075c
        L_0x06d9:
            java.lang.String r0 = "screen"
            java.lang.String r7 = r10.getQueryParameter(r0)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r7 == 0) goto L_0x0747
            int r0 = r7.length()     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r0 == 0) goto L_0x0747
            java.util.Set r0 = X.C55347HgF.A00     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            boolean r0 = r0.contains(r7)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r0 == 0) goto L_0x0747
            java.lang.String r0 = "params"
            java.lang.String r7 = r10.getQueryParameter(r0)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r7 == 0) goto L_0x0745
            int r0 = r7.length()     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r0 == 0) goto L_0x0745
            java.lang.String r0 = "utf-8"
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r0)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r7 == 0) goto L_0x072e
            int r0 = r7.length()     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r0 == 0) goto L_0x072e
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            r12.<init>(r7)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            java.util.Iterator r11 = r12.keys()     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
        L_0x0718:
            boolean r0 = r11.hasNext()     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r0 == 0) goto L_0x072f
            java.lang.String r7 = X.AnonymousClass7TE.A18(r11)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            java.lang.Object r0 = r12.get(r7)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            java.lang.String r0 = r0.toString()     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            r10.put(r7, r0)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            goto L_0x0718
        L_0x072e:
            r10 = r14
        L_0x072f:
            java.lang.String r7 = "type"
            if (r10 == 0) goto L_0x0757
            boolean r0 = r10.containsKey(r7)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            if (r0 != r6) goto L_0x0757
            java.lang.Object r0 = r10.get(r7)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            java.lang.Integer r2 = X.C55068Hbd.A00(r0)     // Catch:{ SecurityException -> 0x074e, JSONException -> 0x0753, UnsupportedEncodingException -> 0x0749 }
            r13 = 1
            goto L_0x075c
        L_0x0745:
            r13 = 0
            goto L_0x075c
        L_0x0747:
            r13 = 0
            goto L_0x075c
        L_0x0749:
            r0 = move-exception
            A00(r0)
            goto L_0x0757
        L_0x074e:
            r0 = move-exception
            A00(r0)
            goto L_0x0757
        L_0x0753:
            r0 = move-exception
            A00(r0)
        L_0x0757:
            r13 = 0
            goto L_0x075c
        L_0x0759:
            r13 = 0
            goto L_0x075c
        L_0x075b:
            r13 = 0
        L_0x075c:
            com.instagram.common.session.UserSession r6 = r1.A05
            X.VwK r7 = X.VA1.A00(r6)
            if (r13 == 0) goto L_0x07a4
            r0 = r2
        L_0x0765:
            java.lang.String r11 = X.VF9.A00(r0)
            java.lang.String r12 = "sticky_activity_feed_notification"
            X.0wc r7 = r7.A00
            java.lang.String r0 = "payments_tap_component"
            X.0Aj r10 = X.AnonymousClass7TE.A0e(r7, r0)
            java.lang.String r0 = "component"
            r10.AAJ(r0, r12)
            r0 = 13
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r10.AAJ(r0, r11)
            X.GkE r7 = new X.GkE
            r7.<init>()
            java.lang.String r0 = "landing_url"
            r7.A06(r0, r8)
            java.lang.String r0 = "configurations"
            r10.AAK(r7, r0)
            r10.Cgf()
            if (r13 != 0) goto L_0x07bd
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x07b9
            if (r8 == 0) goto L_0x083a
            int r0 = r8.length()
            if (r0 == 0) goto L_0x083a
            goto L_0x07a9
        L_0x07a4:
            java.lang.Object r0 = r9.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0765
        L_0x07a9:
            android.net.Uri r0 = X.DbT.A09(r8)     // Catch:{ SecurityException -> 0x0836 }
            java.lang.String r2 = "native"
            java.lang.String r0 = r0.getHost()     // Catch:{ SecurityException -> 0x0836 }
            boolean r0 = r2.equals(r0)     // Catch:{ SecurityException -> 0x0836 }
            if (r0 == 0) goto L_0x083a
        L_0x07b9:
            java.lang.Object r2 = r9.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x07bd:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 == r0) goto L_0x07ee
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r2 == r0) goto L_0x07ee
            X.1Wy r0 = X.C322576w3.A00()
            X.Vl8 r7 = r0.A01()
            java.lang.String r2 = X.VF9.A00(r2)
            java.util.Map r0 = com.instagram.api.schemas.ErrorIdentifier.A01
            java.lang.Object r0 = r0.get(r2)
            com.instagram.api.schemas.ErrorIdentifier r0 = (com.instagram.api.schemas.ErrorIdentifier) r0
            if (r0 != 0) goto L_0x07dd
            com.instagram.api.schemas.ErrorIdentifier r0 = com.instagram.api.schemas.ErrorIdentifier.UNRECOGNIZED
        L_0x07dd:
            X.UZS r2 = r7.A08(r0, r6)
            androidx.fragment.app.FragmentActivity r0 = r1.A01
            X.6Yo r0 = X.DbS.A0M(r0, r6)
            r0.A0E(r2)
            r0.A04()
            goto L_0x084b
        L_0x07ee:
            androidx.fragment.app.FragmentActivity r1 = r1.A01
            java.lang.String r0 = "instagram_sticky_notif"
            X.HWE.A00(r1, r6, r0)
            goto L_0x084b
        L_0x07f6:
            X.GnY r0 = r3.Arn()
            if (r0 == 0) goto L_0x07fe
            java.lang.String r2 = r0.A03
        L_0x07fe:
            X.1Yi r7 = X.C48732EjH.A00()
            androidx.fragment.app.FragmentActivity r8 = r1.A01
            com.instagram.common.session.UserSession r6 = r1.A05
            java.lang.String r10 = "activity_feed"
            r11 = r2
            r12 = r5
            r9 = r6
            r7.A02(r8, r9, r10, r11, r12)
            goto L_0x084b
        L_0x080f:
            X.GWH r0 = X.GWH.A02
            if (r4 != r0) goto L_0x0024
            X.2aD r4 = X.2aD.A0C
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r6 = r1.A05
            X.AnonymousClass0Dg.A00(r2, r6)
            androidx.fragment.app.FragmentActivity r0 = r1.A01
            X.6Yo r1 = X.DbS.A0M(r0, r6)
            X.C49892FBu.A02()
            X.H1y r0 = new X.H1y
            r0.<init>()
            r0.setArguments(r2)
            r1.A0E(r0)
            r1.A04()
            goto L_0x084b
        L_0x0836:
            r0 = move-exception
            A00(r0)
        L_0x083a:
            X.14B r2 = X.AnonymousClass14B.A00()
            androidx.fragment.app.FragmentActivity r1 = r1.A01
            android.net.Uri r0 = X.0cp.A03(r8)
            android.content.Intent r0 = r2.A04(r1, r0)
            X.0kR.A0B(r1, r0)
        L_0x084b:
            if (r3 == 0) goto L_0x087d
            int r8 = r3.BbP()
        L_0x0851:
            X.2aO r0 = X.2aN.A00(r6)
            X.2aT r2 = r0.A00()
            X.2aX r1 = new X.2aX
            r1.<init>(r4, r8)
            X.2g1 r0 = X.AnonymousClass2g1.ACTIVITY_FEED
            X.2fx r7 = X.C226252fx.LIST_ITEM
            r2.A01(r7, r0, r1)
            X.2aV r3 = X.DbV.A0a(r6)
            X.2aX r2 = new X.2aX
            r2.<init>(r4, r8)
            X.2g1 r1 = X.AnonymousClass2g1.PINNED_ROWS
            X.0qQ.A0B(r1, r5)
            X.3Jd r0 = new X.3Jd
            r0.<init>(r7, r1, r14, r14)
            r3.A03(r0, r2, r5)
            goto L_0x0024
        L_0x087d:
            r8 = 0
            goto L_0x0851
        L_0x087f:
            boolean r1 = r0 instanceof X.GSV
            if (r1 == 0) goto L_0x08c3
            X.GSV r0 = (X.GSV) r0
            X.GSY r2 = r0.A01
            java.lang.Object r13 = r4.A01
            X.Dcv r13 = (X.C46352Dcv) r13
            com.instagram.common.session.UserSession r1 = r13.getSession()
            com.instagram.model.reels.Reel r11 = r2.A03(r1)
            com.instagram.common.session.UserSession r1 = r13.getSession()
            java.util.ArrayList r12 = r2.A04(r1)
            X.5Oz r2 = r13.A03
            java.lang.Object r1 = r2.getValue()
            if (r1 != 0) goto L_0x0024
            int r0 = r0.A00
            X.C51967G9n.A15(r2, r0)
            X.0xx r0 = X.DbV.A0J(r13)
            r15 = 34
            X.MGh r10 = new X.MGh
            r10.<init>(r11, r12, r13, r14, r15)
            X.1Er r2 = X.C51966G9m.A1L(r10, r0)
            r1 = 11
            X.G4U r0 = new X.G4U
            r0.<init>(r13, r1)
            r2.CO3(r0)
            goto L_0x0024
        L_0x08c3:
            boolean r1 = r0 instanceof X.C52403GRd
            if (r1 == 0) goto L_0x0909
            java.lang.Object r1 = r4.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r2 = X.DbV.A0Z(r1)
            android.content.Context r13 = r1.requireContext()
            X.GRd r0 = (X.C52403GRd) r0
            com.instagram.user.model.User r4 = r0.A00
            com.instagram.common.session.UserSession r1 = r2.A04
            X.0BQ r12 = X.AnonymousClass0BO.A00(r1)
            boolean r0 = r12.AG1(r13, r1, r4)
            if (r0 == 0) goto L_0x08f1
            r0 = 4745(0x1289, float:6.649E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r0)
            r16 = r4
            r15 = r1
            r12.E2S(r13, r14, r15, r16, r17)
            goto L_0x0024
        L_0x08f1:
            X.0wb r3 = X.0wb.A01
            java.lang.String r2 = X.C51968G9o.A16(r2)
            X.0qQ.A07(r2)
            java.lang.String r1 = "Can't perform account switch for user: "
            java.lang.String r0 = r4.getId()
            java.lang.String r0 = X.002.A0R(r1, r0)
            r3.Ew0(r2, r0)
            goto L_0x0024
        L_0x0909:
            boolean r1 = r0 instanceof X.GS2
            if (r1 == 0) goto L_0x098a
            java.lang.Object r3 = r4.A01
            X.Dcv r3 = (X.C46352Dcv) r3
            X.0eM r1 = r3.A0B
            java.lang.Object r1 = r1.getValue()
            X.Dd4 r1 = (X.Dd4) r1
            X.GS2 r0 = (X.GS2) r0
            int r8 = r0.A01
            java.lang.String r7 = r0.A03
            java.lang.Integer r6 = r0.A02
            int r4 = r0.A00
            com.instagram.common.session.UserSession r0 = r1.A0A
            X.Dd0 r2 = X.C46354Dcy.A01(r0)
            X.0iw r1 = r1.A08
            r0 = 2
            int r5 = X.C51970G9q.A08(r0, r6, r1)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r0)
            java.lang.String r0 = "newsfeed_show_more_click"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x096a
            java.lang.Long r1 = X.DbS.A0j(r8)
            java.lang.String r0 = "position"
            r2.A9F(r0, r1)
            X.Dd1 r1 = X.Dd0.A01(r7)
            java.lang.String r0 = "section"
            r2.A8M(r1, r0)
            java.lang.String r1 = X.Dd0.A08(r6)
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.Long r1 = X.DbV.A0p(r2, r0, r1, r4)
            java.lang.String r0 = "num_hidden_stories_with_show_more"
            r2.A9F(r0, r1)
            r2.Cgf()
        L_0x096a:
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r0 = X.DbV.A0Z(r3)
            X.05G r4 = r0.A0D
        L_0x0970:
            java.lang.Object r3 = r4.getValue()
            r1 = r3
            X.MfE r1 = (X.C66920MfE) r1
            boolean r0 = r1.A02
            r2 = r0 ^ 1
            int r1 = r1.A01
            X.MfE r0 = new X.MfE
            r0.<init>((int) r1, (boolean) r2, (int) r5)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x0970
            goto L_0x0024
        L_0x098a:
            X.0wj r5 = X.0wj.A01
            r4 = 817901067(0x30c02e0b, float:1.3982925E-9)
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Unhandled row click: ActivityFeedItem type ["
            r3.append(r1)
            java.lang.String r0 = r0.A00
            r3.append(r0)
            r0 = 93
            r3.append(r0)
        L_0x09a2:
            java.lang.String r0 = r3.toString()
            r5.AEf(r0, r4)
            goto L_0x0024
        L_0x09ab:
            X.5Gi r0 = (X.C283155Gi) r0
            X.EVf r2 = (X.C48087EVf) r2
            int r9 = X.AnonymousClass7TE.A0M(r1)
            X.0sa r3 = (X.C62320sa) r3
            X.C51974G9v.A1K(r0, r2, r3)
            java.lang.Object r1 = r4.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A0C
            java.lang.Object r4 = r1.getValue()
            X.JS9 r4 = (X.JS9) r4
            java.lang.Object r6 = r3.invoke()
            X.JV7 r6 = (X.JV7) r6
            r5 = 0
            r7 = r2
            r8 = r0
            r4.DOz(r5, r6, r7, r8, r9)
            goto L_0x0024
        L_0x09d2:
            int r5 = X.AnonymousClass7TE.A0M(r1)
            int r1 = X.AnonymousClass7TE.A0M(r3)
            X.AnonymousClass7TG.A1N(r0, r2)
            java.lang.Object r0 = r4.A01
            X.K6W r0 = (X.K6W) r0
            X.LB2 r0 = r0.overlayBurnInView
            if (r0 == 0) goto L_0x0024
            r0.A03 = r5
            r0.A02 = r1
            goto L_0x0024
        L_0x09eb:
            X.HqB r0 = (X.C55947HqB) r0
            X.Hse r2 = (X.C56091Hse) r2
            int r6 = X.AnonymousClass7TE.A0M(r1)
            X.0sa r3 = (X.C62320sa) r3
            X.C51974G9v.A1K(r0, r2, r3)
            boolean r1 = r0 instanceof X.C54519HHf
            r5 = 0
            if (r1 == 0) goto L_0x0a03
            X.HHf r0 = (X.C54519HHf) r0
            if (r0 == 0) goto L_0x0a03
            X.I1k r5 = r0.A01
        L_0x0a03:
            java.lang.Object r1 = r4.A01
            X.GwI r1 = (X.C53912GwI) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.C53912GwI.A00(r5, r1, r2, r0, r3)
            goto L_0x0024
        L_0x0a10:
            X.JMc r2 = (X.C59504JMc) r2
            X.5Wy r5 = X.C51966G9m.A0R(r1, r3)
            r9 = 1
            X.0qQ.A0B(r2, r9)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a28
            r1 = 2045815838(0x79f0ac1e, float:1.5620527E35)
            java.lang.String r0 = "instagram.features.clips.bottomsheet.blend.ui.BlendContextBottomSheetComponent.<anonymous> (BlendContextBottomSheetComposables.kt:81)"
            X.0fL.A01(r1, r0)
        L_0x0a28:
            androidx.compose.ui.Modifier r1 = X.C51969G9p.A0U()
            r0 = 1120403456(0x42c80000, float:100.0)
            androidx.compose.ui.Modifier r7 = X.C287205Zk.A05(r1, r0)
            java.lang.Object r6 = r4.A01
            X.Hmp r6 = (X.C55754Hmp) r6
            X.5Zx r1 = X.C287275Zs.A07
            X.5Zr r0 = X.C287215Zl.A02
            r4 = 0
            X.5RD r1 = X.C291495hO.A02(r1, r5, r0, r4)
            int r8 = X.C287425a7.A00(r5)
            r3 = r5
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r5, r7)
            X.C51973G9u.A0y(r5, r3)
            X.C51971G9r.A12(r5, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0a60
            boolean r0 = X.C51972G9s.A1Q(r5, r8)
            if (r0 != 0) goto L_0x0a63
        L_0x0a60:
            X.C51971G9r.A13(r5, r1, r8)
        L_0x0a63:
            X.C51965G9l.A18(r5, r7)
            r8 = r2
            boolean r7 = r2 instanceof X.C53567Gqi
            if (r7 == 0) goto L_0x0a73
            r0 = r8
            X.Gqi r0 = (X.C53567Gqi) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 == r4) goto L_0x0a74
        L_0x0a73:
            r0 = 0
        L_0x0a74:
            if (r0 == 0) goto L_0x0a8f
            r0 = 1087645465(0x40d42719, float:6.6297727)
            r5.ExS(r0)
            X.Gqi r2 = (X.C53567Gqi) r2
            X.I70.A01(r5, r2, r6, r4)
        L_0x0a81:
            boolean r0 = X.C51971G9r.A1S(r5, r3, r4)
            if (r0 == 0) goto L_0x0024
            r0 = 1257092849(0x4aedb6f1, float:7789432.5)
        L_0x0a8a:
            X.0fL.A00(r0)
            goto L_0x0024
        L_0x0a8f:
            boolean r0 = r2 instanceof X.C57606IdX
            if (r0 == 0) goto L_0x0a9d
            r0 = 1087648332(0x40d4324c, float:6.6311398)
            r5.ExS(r0)
            X.I70.A03(r5, r6, r4)
            goto L_0x0a81
        L_0x0a9d:
            boolean r0 = r2 instanceof X.C53566Gqh
            if (r0 == 0) goto L_0x0aad
            r0 = 1087650975(0x40d43c9f, float:6.6324)
            r5.ExS(r0)
            X.Gqh r2 = (X.C53566Gqh) r2
            X.I70.A06(r5, r6, r2, r4)
            goto L_0x0a81
        L_0x0aad:
            if (r7 == 0) goto L_0x0ab6
            X.Gqi r8 = (X.C53567Gqi) r8
            int r1 = r8.A00
            r0 = 1
            if (r1 == r9) goto L_0x0ab7
        L_0x0ab6:
            r0 = 0
        L_0x0ab7:
            if (r0 == 0) goto L_0x0b09
            r0 = 1087655207(0x40d44d27, float:6.634418)
            r5.ExS(r0)
            X.Gqi r2 = (X.C53567Gqi) r2
            X.I70.A02(r5, r2, r6, r4)
            goto L_0x0a81
        L_0x0ac5:
            java.lang.Number r1 = (java.lang.Number) r1
            r1.floatValue()
            java.lang.Number r3 = (java.lang.Number) r3
            r3.floatValue()
            java.lang.Object r0 = r4.A01
            X.VYp r0 = (X.C17511VYp) r0
            X.0eM r0 = r0.A02
            java.lang.Object r3 = r0.getValue()
            X.U91 r3 = (X.U91) r3
            X.0Ud r0 = r3.A0G
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof X.UOL
            if (r0 == 0) goto L_0x0aff
            X.UOL r2 = (X.UOL) r2
            r1 = 1
            if (r2 == 0) goto L_0x0aff
            boolean r0 = r2.A02
            if (r0 != r1) goto L_0x0aff
            X.L5D r0 = r3.A07
            X.0Ud r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.JTb r0 = (X.C59671JTb) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0aff
            X.U91.A02(r3)
        L_0x0aff:
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            return r0
        L_0x0b04:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b09:
            r0 = 1087644059(0x40d4219b, float:6.629102)
            X.Wub r0 = X.C51972G9s.A0v(r5, r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JK0.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
