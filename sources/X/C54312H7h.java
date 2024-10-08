package X;

/* renamed from: X.H7h  reason: case insensitive filesystem */
public final class C54312H7h extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C54312H7h(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r11 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqe(android.view.View r84) {
        /*
            r83 = this;
            r2 = r83
            int r0 = r2.A00
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r6 = r2.A01
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r6 = (instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r6
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x003b
            com.instagram.common.session.UserSession r2 = r6.A07
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = "horizon_worlds_cross_screen_tap"
            r0 = 0
            X.AnonymousClass9PQ.A08(r6, r2, r1, r0, r0)
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            com.instagram.common.session.UserSession r3 = r6.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36882902805447124(0x8308ce000101d4, double:3.388234477469117E-306)
            java.lang.String r2 = X.182.A04(r2, r3, r0)
            X.2EG r0 = X.2EG.A1V
            X.SUL r1 = new X.SUL
            r1.<init>(r4, r3, r0, r2)
            java.lang.String r0 = "effect_page"
            r1.A0S = r0
            r1.A0A()
        L_0x0039:
            r0 = 1
            return r0
        L_0x003b:
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r6.A03
            if (r0 == 0) goto L_0x005d
            java.lang.String r11 = r0.A0D
            if (r11 != 0) goto L_0x0045
            java.lang.String r11 = r0.A0B
        L_0x0045:
            if (r11 == 0) goto L_0x005d
        L_0x0047:
            java.lang.String r10 = r6.A0K
            com.instagram.common.session.UserSession r1 = r6.A07
            java.lang.String r9 = r6.A0H
            java.lang.String r0 = r6.A0F
            java.lang.String r8 = r6.A0J
            X.4DU r7 = r6.A0R
            java.lang.String r4 = r6.A0G
            r5 = 1
            X.DbW.A1O(r1, r5, r7)
            r3 = 0
            if (r0 == 0) goto L_0x0064
            goto L_0x0060
        L_0x005d:
            java.lang.String r11 = ""
            goto L_0x0047
        L_0x0060:
            java.lang.Long r3 = X.DbV.A0q(r0)     // Catch:{ NumberFormatException -> 0x0064 }
        L_0x0064:
            X.0wc r1 = X.AnonymousClass0kN.A01(r7, r1)
            java.lang.String r0 = "instagram_organic_use_effect"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbW.A16(r2, r7)
            java.lang.Long r0 = X.DbV.A0q(r11)
            X.C51965G9l.A1F(r2, r0)
            if (r10 != 0) goto L_0x007c
            java.lang.String r10 = ""
        L_0x007c:
            X.C51965G9l.A1N(r2, r10)
            r0 = 0
            if (r9 == 0) goto L_0x0086
            java.lang.Long r0 = X.DbV.A0q(r9)     // Catch:{ NumberFormatException -> 0x0086 }
        L_0x0086:
            X.C51965G9l.A1E(r2, r0)
            if (r3 != 0) goto L_0x009a
            r0 = 0
        L_0x008c:
            java.lang.String r1 = "media_author_id"
            r2.AAE(r0, r1)
            java.lang.String r0 = "ranking_info_token"
            X.C51973G9u.A14(r2, r0, r8)
            r1 = 0
            if (r4 == 0) goto L_0x00a4
            goto L_0x00a0
        L_0x009a:
            X.4Ny r0 = new X.4Ny
            r0.<init>(r3)
            goto L_0x008c
        L_0x00a0:
            java.lang.Long r1 = X.DbV.A0q(r4)     // Catch:{ NumberFormatException -> 0x00a4 }
        L_0x00a4:
            java.lang.String r0 = "best_audio_cluster_id"
            r2.A9F(r0, r1)
            r2.Cgf()
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x00f2
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r6.A03
            if (r0 == 0) goto L_0x00f2
            java.lang.String r1 = r0.A0C
            if (r1 == 0) goto L_0x00f2
            android.content.Context r0 = r6.getContext()
            X.GNW r1 = X.GNJ.A00(r0, r1)
            X.GNW r0 = X.GNW.SOUND_SYNC
            if (r1 != r0) goto L_0x00f2
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r6.A03
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = r0.A0C
            if (r0 != 0) goto L_0x00ef
            X.28D r8 = X.28D.A13
        L_0x00d0:
            X.Hrt r2 = X.C250563lf.A0C(r8)
            r0 = 38
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
            r2.A0K = r0
            android.os.Bundle r2 = r2.A00()
        L_0x00e4:
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            com.instagram.common.session.UserSession r0 = r6.A07
            X.I3M.A00(r1, r2, r6, r8, r0)
            goto L_0x0039
        L_0x00ef:
            X.28D r8 = X.28D.A1d
            goto L_0x00d0
        L_0x00f2:
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r6.A03
            if (r0 == 0) goto L_0x01bb
            java.lang.String r0 = r0.A0C
            if (r0 != 0) goto L_0x01bb
            X.28D r8 = X.28D.A13
        L_0x00fc:
            r9 = 0
            X.50r r19 = X.C2801950r.CLIPS
            java.util.Set r65 = X.C51976G9y.A0N(r8)
            java.lang.String r7 = r6.A0H
            X.1Xj r0 = r6.A08
            if (r0 == 0) goto L_0x01b7
            java.lang.String r42 = X.DbT.A0x(r0)
        L_0x010d:
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r6.A03
            if (r0 == 0) goto L_0x01b4
            java.lang.String r4 = r0.A0D
        L_0x0113:
            if (r0 == 0) goto L_0x01b1
            java.lang.String r3 = r0.A0B
        L_0x0117:
            if (r0 == 0) goto L_0x01ae
            java.lang.String r2 = r0.A0C
        L_0x011b:
            java.lang.String r1 = r6.A0I
            com.instagram.music.common.config.MusicAttributionConfig r0 = r6.A0A
            X.8JL r13 = X.AnonymousClass8JL.AUDIO
            r66 = 0
            X.84B r12 = X.AnonymousClass84B.ATTRIBUTION
            X.8ZN r10 = r6.A01
            r11 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r20 = r9
            r21 = r9
            r22 = r0
            r23 = r9
            r24 = r9
            r25 = r9
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r30 = r9
            r31 = r9
            r32 = r4
            r33 = r9
            r34 = r9
            r35 = r9
            r36 = r2
            r37 = r3
            r38 = r1
            r39 = r9
            r40 = r9
            r41 = r7
            r43 = r9
            r44 = r9
            r45 = r9
            r46 = r9
            r47 = r9
            r48 = r9
            r49 = r9
            r50 = r9
            r51 = r9
            r52 = r9
            r53 = r9
            r54 = r9
            r55 = r9
            r56 = r9
            r57 = r9
            r58 = r9
            r59 = r9
            r60 = r9
            r61 = r9
            r62 = r9
            r63 = r9
            r64 = r9
            r67 = r66
            r68 = r66
            r69 = r66
            r70 = r66
            r71 = r66
            r72 = r66
            r73 = r66
            r74 = r66
            r75 = r66
            r76 = r66
            r77 = r5
            r78 = r66
            r79 = r66
            r80 = r66
            r81 = r66
            r82 = r5
            android.os.Bundle r2 = X.AEX.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82)
            goto L_0x00e4
        L_0x01ae:
            r2 = r9
            goto L_0x011b
        L_0x01b1:
            r3 = r9
            goto L_0x0117
        L_0x01b4:
            r4 = r9
            goto L_0x0113
        L_0x01b7:
            r42 = r9
            goto L_0x010d
        L_0x01bb:
            X.28D r8 = X.28D.A1d
            goto L_0x00fc
        L_0x01bf:
            java.lang.Object r1 = r2.A01
            com.instagram.arlink.fragment.NametagController r1 = (com.instagram.arlink.fragment.NametagController) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x01d2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x01d2
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            com.instagram.arlink.fragment.NametagController.A03(r1, r0)
            goto L_0x0039
        L_0x01d2:
            r1.A05()
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54312H7h.Dqe(android.view.View):boolean");
    }
}
