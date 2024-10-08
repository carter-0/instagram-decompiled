package X;

public final class IHI implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public IHI(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r9 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x04fe, code lost:
        if (X.182.A06(r20, r3, 36319433160924568L) == false) goto L_0x0500;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r25) {
        /*
            r24 = this;
            r2 = r24
            r8 = r25
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0575;
                case 1: goto L_0x0276;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.GVW r8 = (X.GVW) r8
            r7 = 0
            X.0qQ.A0B(r8, r7)
            X.46i r6 = r8.A03
            java.lang.Object r5 = r2.A03
            X.GVT r5 = (X.GVT) r5
            if (r6 == 0) goto L_0x026a
            com.instagram.music.common.model.AudioType r0 = r6.Adv()
        L_0x001b:
            r5.A0A = r0
            com.instagram.music.common.model.MusicAssetModel r0 = r8.A04
            r5.A0B = r0
            java.lang.String r11 = r5.A0P
            if (r11 != 0) goto L_0x002f
            java.lang.String r21 = "assetId"
        L_0x0027:
            X.0qQ.A0F(r21)
        L_0x002a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002f:
            if (r6 == 0) goto L_0x0158
            boolean r21 = r6.CQr()
        L_0x0035:
            java.lang.String r10 = r8.A05
            if (r6 == 0) goto L_0x0155
            com.instagram.user.model.User r15 = r6.AdS()
            java.lang.String r9 = r6.getArtistId()
            if (r9 != 0) goto L_0x0049
        L_0x0043:
            java.lang.Object r0 = r2.A01
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = (com.instagram.clips.model.metadata.AudioPageMetadata) r0
            java.lang.String r9 = r0.A07
        L_0x0049:
            if (r6 == 0) goto L_0x0051
            java.lang.String r4 = r6.BYx()
            if (r4 != 0) goto L_0x0057
        L_0x0051:
            java.lang.Object r0 = r2.A01
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = (com.instagram.clips.model.metadata.AudioPageMetadata) r0
            java.lang.String r4 = r0.A0D
        L_0x0057:
            java.lang.String r3 = r5.A0X
            X.1ro r1 = r8.A02
            X.GVX r0 = new X.GVX
            r12 = r0
            r13 = r1
            r14 = r6
            r16 = r11
            r17 = r10
            r18 = r9
            r19 = r4
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5.A0E = r0
            X.0eM r0 = r5.A0o
            r23 = r0
            X.0lg r4 = X.DbT.A0X(r23)
            X.0Tu r20 = X.0Tu.A05
            r0 = 36326691655923634(0x810eef000437b2, double:3.036484306827933E-306)
            r3 = r20
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 != 0) goto L_0x0089
            X.GVT.A00(r5)
        L_0x0089:
            com.instagram.music.common.model.MusicAssetModel r0 = r5.A0B
            if (r0 == 0) goto L_0x00cb
            if (r6 == 0) goto L_0x00cb
            java.lang.String r0 = r6.BYx()
            if (r0 != 0) goto L_0x00cb
            X.IO9 r10 = r5.A0H
            if (r10 == 0) goto L_0x0571
            X.3oV r0 = r10.A0E
            java.lang.String r9 = "shareAudioStub"
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x00cb
            com.instagram.common.session.UserSession r0 = r10.A0R
            X.HN0 r4 = X.HN0.SHARE_TO_NOTE_TOOLTIP
            boolean r0 = X.C55240HeV.A00(r0, r4)
            if (r0 == 0) goto L_0x00cb
            X.GVT r0 = r10.A0V
            android.view.View r3 = r0.mView
            if (r3 == 0) goto L_0x00cb
            X.I4J r1 = r10.A0I
            if (r1 != 0) goto L_0x00c0
            java.lang.String r9 = "audioPageNuxUtil"
        L_0x00bb:
            X.0qQ.A0F(r9)
            goto L_0x002a
        L_0x00c0:
            X.3oV r0 = r10.A0E
            if (r0 == 0) goto L_0x00bb
            android.view.View r0 = r0.getView()
            r1.A01(r0, r3, r4)
        L_0x00cb:
            boolean r3 = r8.A0A
            java.lang.String r21 = "clipsAudioPagePerfLogger"
            r4 = 1
            if (r3 != 0) goto L_0x0137
            if (r6 != 0) goto L_0x0137
            java.util.List r0 = r8.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0137
            X.H2l r0 = r5.A04
            if (r0 == 0) goto L_0x0027
            X.34p r1 = r0.A00
            java.lang.String r0 = "empty_page"
            r1.A07(r0)
            X.GVT.A01(r5, r7)
            java.lang.Object r10 = r2.A02
            X.2eb r10 = (X.C71662eb) r10
            android.view.View r1 = r10.A01()
            X.0qQ.A0A(r1)
            r1.setVisibility(r7)
            r0 = 2131439959(0x7f0b3157, float:1.8501888E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r1, r0)
            if (r1 == 0) goto L_0x010b
            r0 = 2131955507(0x7f130f33, float:1.9547543E38)
            java.lang.CharSequence r0 = r5.getText(r0)
            r1.setText(r0)
        L_0x010b:
            java.lang.Object r0 = r2.A01
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = (com.instagram.clips.model.metadata.AudioPageMetadata) r0
            com.instagram.music.common.config.MusicAttributionConfig r1 = r0.A04
        L_0x0111:
            boolean r9 = r8.A09
            if (r9 != 0) goto L_0x0135
            if (r1 == 0) goto L_0x011b
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0135
        L_0x011b:
            if (r6 == 0) goto L_0x0123
            boolean r0 = r6.Ce0()
            if (r0 == 0) goto L_0x0135
        L_0x0123:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r23)
            boolean r0 = X.AnonymousClass30D.A08(r0)
            if (r0 == 0) goto L_0x0135
        L_0x012d:
            X.IO8 r11 = r5.A0K
            if (r11 != 0) goto L_0x015c
            java.lang.String r21 = "useAudioController"
            goto L_0x0027
        L_0x0135:
            r4 = 0
            goto L_0x012d
        L_0x0137:
            X.GVT.A01(r5, r4)
            java.lang.Object r10 = r2.A02
            X.2eb r10 = (X.C71662eb) r10
            android.view.View r1 = r10.A01()
            X.0qQ.A07(r1)
            r0 = 8
            r1.setVisibility(r0)
            if (r6 == 0) goto L_0x010b
            android.content.Context r0 = r5.requireContext()
            com.instagram.music.common.config.MusicAttributionConfig r1 = r6.Col(r0)
            goto L_0x0111
        L_0x0155:
            r15 = 0
            goto L_0x0043
        L_0x0158:
            r21 = 0
            goto L_0x0035
        L_0x015c:
            if (r6 == 0) goto L_0x021a
            com.instagram.api.schemas.OriginalAudioSubtype r0 = r6.Ads()
        L_0x0162:
            X.GVY r13 = new X.GVY
            r13.<init>(r0, r1, r4)
            android.view.ViewGroup r4 = r11.A03
            java.lang.String r15 = "useInCameraButtonViewGroup"
            if (r4 == 0) goto L_0x017f
            boolean r0 = r13.A02
            r1 = 0
            if (r0 == 0) goto L_0x0216
            com.instagram.music.common.config.MusicAttributionConfig r0 = r13.A01
            if (r0 == 0) goto L_0x0216
        L_0x0176:
            r4.setVisibility(r1)
            android.widget.TextView r4 = r11.A05
            if (r4 != 0) goto L_0x0184
            java.lang.String r15 = "useInCameraLabel"
        L_0x017f:
            X.0qQ.A0F(r15)
            goto L_0x002a
        L_0x0184:
            com.instagram.api.schemas.OriginalAudioSubtype r12 = r13.A00
            com.instagram.api.schemas.OriginalAudioSubtype r1 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            r0 = 2131976201(0x7f136009, float:1.9589516E38)
            if (r12 != r1) goto L_0x0190
            r0 = 2131976215(0x7f136017, float:1.9589544E38)
        L_0x0190:
            r4.setText(r0)
            com.instagram.music.common.config.MusicAttributionConfig r0 = r13.A01
            if (r0 == 0) goto L_0x01ad
            android.view.ViewGroup r0 = r11.A03
            if (r0 == 0) goto L_0x017f
            X.3NG r4 = X.AnonymousClass7TE.A0m(r0)
            r1 = 2
            X.H7i r0 = new X.H7i
            r0.<init>(r1, r13, r11)
            r4.A04 = r0
            r0 = 1
            r4.A07 = r0
            r4.A00()
        L_0x01ad:
            r11.A09 = r12
            android.widget.TextView r0 = r11.A04
            java.lang.String r14 = "useInCameraButtonText"
            r19 = 0
            if (r0 == 0) goto L_0x0265
            X.2eS.A01(r0)
            android.view.ViewGroup r0 = r11.A03
            if (r0 == 0) goto L_0x017f
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            X.1QG r0 = X.1QE.A0E()
            int r0 = X.1QE.A05(r1, r0)
            int r13 = r1.getColor(r0)
            android.view.ViewGroup r0 = r11.A03
            if (r0 == 0) goto L_0x017f
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            X.1QG r0 = X.1QE.A0E()
            int r0 = X.1QE.A06(r1, r0)
            int r12 = r1.getColor(r0)
            android.view.View r4 = r11.A02
            java.lang.String r1 = "useInCameraButtonView"
            if (r4 == 0) goto L_0x0255
            r0 = 2131240265(0x7f082549, float:1.809686E38)
            r4.setBackgroundResource(r0)
            android.view.View r0 = r11.A02
            if (r0 == 0) goto L_0x0255
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            X.AnonymousClass7TE.A1R(r0, r13)
            android.widget.TextView r4 = r11.A04
            if (r4 == 0) goto L_0x0265
            android.view.ViewGroup r0 = r11.A03
            if (r0 == 0) goto L_0x017f
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            r0 = r19
            android.content.res.ColorStateList r0 = X.1QE.A0C(r1, r0)
            r4.setTextColor(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r11.A0B
            if (r1 != 0) goto L_0x021d
            java.lang.String r15 = "useInCameraButtonIcon"
            goto L_0x017f
        L_0x0216:
            r1 = 8
            goto L_0x0176
        L_0x021a:
            r0 = 0
            goto L_0x0162
        L_0x021d:
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r12)
            r1.setColorFilter(r0)
            X.2cs r0 = r11.A06
            if (r0 == 0) goto L_0x022c
            X.6ys r1 = r11.A07
            if (r1 != 0) goto L_0x024f
        L_0x022c:
            X.2cs r12 = X.AnonymousClass7TF.A0J()
            X.2co r0 = X.C315596kB.A02
            r12.A09(r0)
            r1 = 11
            X.K0E r0 = new X.K0E
            r0.<init>(r11, r1)
            r12.A0A(r0)
            r0 = 0
            r4 = 1
            r12.A08(r0, r4)
            r11.A06 = r12
            r0 = 5
            X.Jcc r1 = new X.Jcc
            r1.<init>(r11, r0)
            r11.A07 = r1
        L_0x024f:
            com.google.android.material.appbar.AppBarLayout r0 = r11.A08
            if (r0 != 0) goto L_0x025a
            java.lang.String r1 = "appbarLayout"
        L_0x0255:
            X.0qQ.A0F(r1)
            goto L_0x002a
        L_0x025a:
            r0.A02(r1)
            X.GiL r12 = r5.A0G
            if (r12 != 0) goto L_0x02ab
            java.lang.String r21 = "audioPageGridController"
            goto L_0x0027
        L_0x0265:
            X.0qQ.A0F(r14)
            goto L_0x002a
        L_0x026a:
            java.lang.Object r0 = r2.A01
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = (com.instagram.clips.model.metadata.AudioPageMetadata) r0
            com.instagram.music.common.model.AudioType r0 = r0.A05
            if (r0 != 0) goto L_0x001b
            com.instagram.music.common.model.AudioType r0 = com.instagram.music.common.model.AudioType.ORIGINAL_AUDIO
            goto L_0x001b
        L_0x0276:
            X.N3R r8 = (X.N3R) r8
            r3 = 0
            X.0qQ.A0B(r8, r3)
            java.lang.Boolean r1 = r8.A05
            boolean r0 = X.DbX.A1a(r1)
            if (r0 == 0) goto L_0x0296
            java.lang.Object r0 = r2.A03
            X.NV7 r0 = (X.NV7) r0
            X.NV7.A06(r0, r3)
            X.NV7.A05(r0)
        L_0x028e:
            java.lang.Object r0 = r2.A02
            X.2Fk r0 = (X.2Fk) r0
            r0.A08(r2)
            return
        L_0x0296:
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r3)
            if (r0 == 0) goto L_0x033d
            java.lang.Object r1 = r2.A03
            X.NV7 r1 = (X.NV7) r1
            X.NV7.A04(r1)
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            X.NV7.A03(r0, r1)
            goto L_0x028e
        L_0x02ab:
            java.util.List r0 = r8.A06
            r22 = r0
            if (r6 == 0) goto L_0x055b
            com.instagram.music.common.model.AudioType r18 = r6.Adv()
        L_0x02b5:
            if (r6 == 0) goto L_0x02bd
            java.lang.String r13 = r6.getArtistId()
            if (r13 != 0) goto L_0x02c3
        L_0x02bd:
            java.lang.Object r0 = r2.A01
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = (com.instagram.clips.model.metadata.AudioPageMetadata) r0
            java.lang.String r13 = r0.A00
        L_0x02c3:
            if (r6 == 0) goto L_0x02cb
            java.lang.String r1 = r6.BYx()
            if (r1 != 0) goto L_0x02d1
        L_0x02cb:
            java.lang.Object r0 = r2.A01
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = (com.instagram.clips.model.metadata.AudioPageMetadata) r0
            java.lang.String r1 = r0.A0G
        L_0x02d1:
            boolean r2 = r8.A08
            r11 = 1
            r0 = r22
            X.0qQ.A0B(r0, r11)
            if (r3 == 0) goto L_0x041d
            X.6sV r1 = r12.A04
            r1.A03()
            r0 = 9
            r1.A04(r0)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r12.A01
            if (r0 == 0) goto L_0x02ec
            r0.A06(r11)
        L_0x02ec:
            if (r9 == 0) goto L_0x033e
            X.GVT.A01(r5, r7)
            X.H2l r0 = r5.A04
            if (r0 == 0) goto L_0x0027
            X.34p r1 = r0.A00
            java.lang.String r0 = "restricted"
            r1.A07(r0)
            X.Jvb r3 = r8.A01
            if (r3 == 0) goto L_0x033d
            android.view.View r2 = r10.A01()
            X.0qQ.A07(r2)
            r2.setVisibility(r7)
            r0 = 2131439959(0x7f0b3157, float:1.8501888E38)
            android.widget.TextView r1 = X.DbU.A0G(r2, r0)
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            java.lang.String r1 = r3.A01
            java.lang.String r3 = r3.A00
            if (r1 == 0) goto L_0x033d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x033d
            if (r3 == 0) goto L_0x033d
            int r0 = r3.length()
            if (r0 == 0) goto L_0x033d
            r0 = 2131439960(0x7f0b3158, float:1.850189E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r2, r0)
            r2.setText(r1)
            r1 = 5
            X.IB2 r0 = new X.IB2
            r0.<init>(r3, r5, r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x033d:
            return
        L_0x033e:
            if (r6 == 0) goto L_0x0351
            java.util.List r1 = r6.Adk()
            X.GgX r0 = r5.A0L
            if (r0 != 0) goto L_0x034c
            java.lang.String r21 = "mixAttributionSheetViewModel"
            goto L_0x0027
        L_0x034c:
            X.2Fj r0 = r0.A01
            r0.A0B(r1)
        L_0x0351:
            android.view.View r2 = r5.A01
            if (r2 == 0) goto L_0x033d
            X.GVX r4 = r5.A0E
            if (r4 == 0) goto L_0x033d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r23)
            boolean r0 = X.AnonymousClass30D.A0A(r0)
            java.lang.String r21 = "audioPageNuxUtil"
            r7 = r21
            if (r0 == 0) goto L_0x037f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r23)
            X.HN0 r3 = X.HN0.MUSIC_ON_PROFILE_TOOLTIP
            boolean r0 = X.C55240HeV.A00(r0, r3)
            if (r0 == 0) goto L_0x037f
            X.I4J r1 = r5.A0M
            if (r1 == 0) goto L_0x0027
            android.view.View r0 = r5.requireView()
            r1.A01(r2, r0, r3)
            return
        L_0x037f:
            java.lang.String r3 = r4.A03
            if (r3 == 0) goto L_0x033d
            X.0eE r1 = X.AnonymousClass0t1.A01
            r0 = r23
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            java.lang.String r0 = r0.getId()
            boolean r6 = X.0qQ.A0K(r0, r3)
            java.lang.String r3 = r4.A05
            if (r3 == 0) goto L_0x03af
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x03af
            X.8ZN r1 = r5.A03
            X.8ZN r0 = X.AnonymousClass8ZN.RENAME_OA_NOTIF
            if (r1 != r0) goto L_0x03af
        L_0x03a1:
            X.I4J r3 = r5.A0M
            if (r3 == 0) goto L_0x0027
            android.view.View r0 = r5.requireView()
            X.HN0 r1 = X.HN0.RENAME_TOOLTIP
        L_0x03ab:
            r3.A01(r2, r0, r1)
            return
        L_0x03af:
            if (r6 == 0) goto L_0x03f5
            if (r3 == 0) goto L_0x03c4
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x03c4
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r23)
            X.HN0 r0 = X.HN0.RENAME_TOOLTIP
            boolean r0 = X.C55240HeV.A00(r1, r0)
            if (r0 == 0) goto L_0x03c4
            goto L_0x03a1
        L_0x03c4:
            X.1ro r0 = r4.A00
            if (r0 == 0) goto L_0x03f5
            X.1rn r0 = r0.A00
            if (r0 == 0) goto L_0x03f5
            boolean r0 = r0.getShouldAllowRestore()
            if (r0 != r11) goto L_0x03f5
            X.46i r0 = r4.A01
            if (r0 == 0) goto L_0x03f3
            com.instagram.api.schemas.OriginalAudioSubtype r1 = r0.Ads()
        L_0x03da:
            com.instagram.api.schemas.OriginalAudioSubtype r0 = com.instagram.api.schemas.OriginalAudioSubtype.A04
            if (r1 != r0) goto L_0x03f5
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r23)
            X.HN0 r1 = X.HN0.PARTIAL_ATTRIBUTION_RESTORE_TOOLTIP
            boolean r0 = X.C55240HeV.A00(r0, r1)
            if (r0 == 0) goto L_0x03f5
            X.I4J r3 = r5.A0M
            if (r3 == 0) goto L_0x0027
            android.view.View r0 = r5.requireView()
            goto L_0x03ab
        L_0x03f3:
            r1 = 0
            goto L_0x03da
        L_0x03f5:
            X.IO9 r4 = r5.A0H
            if (r4 == 0) goto L_0x0571
            X.3oV r0 = r4.A0B
            java.lang.String r21 = "audioFiltersStub"
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x033d
            com.instagram.common.session.UserSession r0 = r4.A0R
            X.HN0 r3 = X.HN0.TRY_AUDIO_FILTER_TOOLTIP
            boolean r0 = X.C55240HeV.A00(r0, r3)
            if (r0 == 0) goto L_0x033d
            X.GVT r0 = r4.A0V
            android.view.View r2 = r0.mView
            if (r2 == 0) goto L_0x033d
            X.I4J r1 = r4.A0I
            if (r1 != 0) goto L_0x0565
            r21 = r7
            goto L_0x0027
        L_0x041d:
            X.6sV r4 = r12.A04
            r4.A02()
            com.facebook.shimmer.ShimmerFrameLayout r0 = r12.A01
            if (r0 == 0) goto L_0x0429
            r0.A05()
        L_0x0429:
            if (r2 == 0) goto L_0x0442
            java.util.List r0 = X.C320516sV.A00(r4)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0442
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x043b
            r4.A06 = r7
        L_0x043b:
            r4.A07 = r11
            r4.update()
            goto L_0x02ec
        L_0x0442:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0448
            r4.A06 = r7
        L_0x0448:
            r4.A07 = r7
            r4.update()
            androidx.recyclerview.widget.RecyclerView r2 = r12.A00
            if (r2 == 0) goto L_0x045a
            r0 = r9 ^ 1
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
        L_0x045a:
            com.instagram.common.session.UserSession r3 = r12.A02
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r17 = r22.iterator()
        L_0x0464:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x04b2
            X.4bN r15 = X.C51966G9m.A0m(r17)
            X.1Xj r14 = r15.A02
            if (r14 == 0) goto L_0x0464
            boolean r0 = X.GKS.A04(r3, r14)
            if (r0 == 0) goto L_0x0464
            java.lang.String r16 = r15.A0C()
            X.1sQ r0 = X.C51966G9m.A0n(r14)
            if (r0 == 0) goto L_0x0488
            com.instagram.api.schemas.MusicInfo r0 = r0.BUr()
            if (r0 != 0) goto L_0x049e
        L_0x0488:
            X.1sQ r0 = X.C51966G9m.A0n(r14)
            if (r0 == 0) goto L_0x04ae
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r0.BZB()
            if (r0 == 0) goto L_0x04ae
            java.lang.Boolean r0 = r0.BXg()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r11)
            if (r0 == 0) goto L_0x04ae
        L_0x049e:
            r15 = 2131953191(0x7f130627, float:1.9542846E38)
        L_0x04a1:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.HsR r14 = new X.HsR
            r14.<init>(r0, r15)
            r0 = r16
            r2.put(r0, r14)
            goto L_0x0464
        L_0x04ae:
            r15 = 2131969095(0x7f134447, float:1.9575103E38)
            goto L_0x04a1
        L_0x04b2:
            com.instagram.music.common.model.AudioType r14 = com.instagram.music.common.model.AudioType.MUSIC
            r0 = r18
            if (r14 != r0) goto L_0x051a
            java.util.Iterator r16 = r22.iterator()
        L_0x04bc:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x052d
            X.4bN r15 = X.C51966G9m.A0m(r16)
            X.1Xj r0 = r15.A02
            r1 = 0
            if (r0 == 0) goto L_0x0518
            com.instagram.user.model.User r0 = r0.A2A(r3)
            if (r0 == 0) goto L_0x0518
            java.lang.String r0 = r0.getId()
        L_0x04d5:
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 == 0) goto L_0x04bc
            X.1Xj r0 = r15.A02
            if (r0 == 0) goto L_0x04e7
            boolean r0 = r0.A59()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x04e7:
            X.0qQ.A0B(r3, r7)
            if (r1 == 0) goto L_0x0500
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x0500
            r0 = 36319433160924568(0x81085500001d98, double:3.03189400536291E-306)
            r14 = r20
            boolean r1 = X.182.A06(r14, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0501
        L_0x0500:
            r0 = 0
        L_0x0501:
            java.lang.String r15 = r15.A0C()
            r14 = 2131953188(0x7f130624, float:1.954284E38)
            if (r0 == 0) goto L_0x050d
            r14 = 2131953200(0x7f130630, float:1.9542864E38)
        L_0x050d:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.HsR r0 = new X.HsR
            r0.<init>(r1, r14)
            r2.put(r15, r0)
            goto L_0x04bc
        L_0x0518:
            r0 = r1
            goto L_0x04d5
        L_0x051a:
            if (r1 == 0) goto L_0x052d
            java.lang.String r14 = X.C51965G9l.A0u(r1)
            r13 = 2131969096(0x7f134448, float:1.9575105E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.HsR r0 = new X.HsR
            r0.<init>(r1, r13)
            r2.put(r14, r0)
        L_0x052d:
            java.util.Iterator r1 = r22.iterator()
        L_0x0531:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x053b
            r1.next()
            goto L_0x0531
        L_0x053b:
            X.6sS r13 = r4.A0D
            r1 = r19
            r0 = r22
            java.util.ArrayList r0 = X.C52341GOk.A00(r13, r3, r1, r0, r2)
            r4.A06(r0, r7)
            X.Ghc r0 = r12.A03
            X.GVW r0 = X.C53044Ghc.A00(r0)
            if (r0 == 0) goto L_0x02ec
            boolean r0 = r0.A07
            if (r0 != r11) goto L_0x02ec
            X.2t9 r0 = r4.A0I
            r0.notifyDataSetChanged()
            goto L_0x02ec
        L_0x055b:
            java.lang.Object r0 = r2.A01
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = (com.instagram.clips.model.metadata.AudioPageMetadata) r0
            com.instagram.music.common.model.AudioType r0 = r0.A05
            r18 = r0
            goto L_0x02b5
        L_0x0565:
            X.3oV r0 = r4.A0B
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = r0.getView()
            r1.A01(r0, r2, r3)
            return
        L_0x0571:
            java.lang.String r21 = "audioPageMetadataController"
            goto L_0x0027
        L_0x0575:
            java.lang.Object r5 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r5 = (com.instagram.creation.fragment.EditMediaInfoFragment) r5
            java.lang.Object r7 = r2.A03
            X.Hn6 r7 = (X.C55771Hn6) r7
            X.MS9 r8 = (X.MS9) r8
            r6 = 0
            boolean r1 = X.AnonymousClass7TF.A1U(r6, r7, r8)
            boolean r0 = r8 instanceof X.C61196Jyp
            if (r0 == 0) goto L_0x0593
            android.view.View r1 = r7.A00
        L_0x058a:
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.creation.fragment.EditMediaInfoFragment.A07(r5)
            return
        L_0x0593:
            boolean r0 = X.C53520Gpq.A00(r1, r8)
            if (r0 == 0) goto L_0x05c7
            X.Gpq r8 = (X.C53520Gpq) r8
            java.lang.Object r2 = r8.A01
            java.lang.Object r0 = r8.A02
            com.instagram.creation.channels.model.AddChannelsRowChannelInfo r0 = (com.instagram.creation.channels.model.AddChannelsRowChannelInfo) r0
            java.lang.String r4 = r0.A02
            r3 = 2131961425(0x7f132651, float:1.9559547E38)
        L_0x05a6:
            android.view.View r1 = r7.A00
            r1.setVisibility(r6)
            r0 = 25
            X.C56800ICx.A00(r1, r0, r2)
            android.content.Context r2 = r1.getContext()
            com.instagram.common.ui.base.IgTextView r1 = r7.A03
            r0 = 2131954208(0x7f130a20, float:1.9544909E38)
            X.DbX.A13(r2, r1, r4, r0)
            com.instagram.common.ui.base.IgTextView r0 = r7.A02
            r0.setVisibility(r6)
            X.DbT.A18(r2, r0, r3)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r7.A01
            goto L_0x058a
        L_0x05c7:
            boolean r0 = X.C53520Gpq.A00(r6, r8)
            if (r0 == 0) goto L_0x05db
            X.Gpq r8 = (X.C53520Gpq) r8
            java.lang.Object r2 = r8.A01
            java.lang.Object r0 = r8.A02
            com.instagram.creation.channels.model.AddChannelsRowChannelInfo r0 = (com.instagram.creation.channels.model.AddChannelsRowChannelInfo) r0
            java.lang.String r4 = r0.A02
            r3 = 2131952258(0x7f130282, float:1.9540954E38)
            goto L_0x05a6
        L_0x05db:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IHI.onChanged(java.lang.Object):void");
    }
}
