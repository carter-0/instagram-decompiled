package X;

public final class IHH implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;

    public IHH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r20) {
        /*
            r19 = this;
            r2 = r19
            r15 = r20
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x01ee;
                case 1: goto L_0x01d5;
                case 2: goto L_0x00ca;
                case 3: goto L_0x004f;
                case 4: goto L_0x0038;
                case 5: goto L_0x0015;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r2.A01
            X.I1z r2 = (X.C56569I1z) r2
            X.4Cq r1 = r2.A0D
            r0 = 21
            X.C58099ImL.A01(r2, r1, r0)
        L_0x0014:
            return
        L_0x0015:
            X.8fx r15 = (X.C361278fx) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            int r1 = r15.A00
            r0 = 3
            if (r1 != r0) goto L_0x0014
            java.lang.Object r3 = r2.A01
            X.GgR r3 = (X.C52974GgR) r3
            X.8Vz r0 = r3.A0A
            java.lang.Object r2 = r15.A00()
            X.2Fj r1 = r0.A03
            X.88W r0 = new X.88W
            r0.<init>(r2)
            r1.A0B(r0)
            r3.onCleared()
            return
        L_0x0038:
            X.8fx r15 = (X.C361278fx) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            int r1 = r15.A00
            r0 = 3
            if (r1 != r0) goto L_0x0014
            java.lang.Object r0 = r2.A01
            X.GgR r0 = (X.C52974GgR) r0
            X.8Vz r1 = r0.A0A
            X.8Vt r0 = X.C356928Vt.POST_CAPTURE
            r1.A00(r0)
            return
        L_0x004f:
            java.lang.String r15 = (java.lang.String) r15
            r12 = 0
            X.0qQ.A0B(r15, r12)
            java.lang.Object r2 = r2.A01
            X.GVT r2 = (X.GVT) r2
            X.IO9 r13 = r2.A0H
            r3 = 0
            if (r13 != 0) goto L_0x0061
            java.lang.String r0 = "audioPageMetadataController"
            goto L_0x00d7
        L_0x0061:
            com.instagram.api.schemas.OriginalAudioSubtype r14 = com.instagram.api.schemas.OriginalAudioSubtype.A05
            r16 = r3
            r17 = r12
            r18 = r12
            r13.A02(r14, r15, r16, r17, r18)
            X.GVX r0 = r2.A0E
            if (r0 == 0) goto L_0x0088
            java.lang.String r7 = r0.A04
            X.46i r5 = r0.A01
            java.lang.String r8 = r0.A06
            com.instagram.user.model.User r6 = r0.A02
            java.lang.String r9 = r0.A03
            java.lang.String r10 = r0.A05
            java.lang.String r11 = r0.A07
            X.1ro r4 = r0.A00
            X.0qQ.A0B(r7, r12)
            X.GVX r3 = new X.GVX
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0088:
            r2.A0E = r3
            X.0eM r3 = r2.A0o
            X.1E8 r1 = X.DbX.A0d(r3)
            java.lang.String r0 = r2.A0Q
            X.1Xj r1 = r1.A02(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.D36.A01(r15, r0, r1)
            X.D36.A00(r1)
            X.6sV r0 = r2.A0N
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = "clipsGridAdapter"
            goto L_0x00d7
        L_0x00a7:
            java.util.List r0 = r0.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x00af:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r2.next()
            X.6sp r0 = (X.C320716sp) r0
            X.4bN r0 = r0.A03
            X.1Xj r1 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.D36.A01(r15, r0, r1)
            X.D36.A00(r1)
            goto L_0x00af
        L_0x00ca:
            X.GlA r15 = (X.C53262GlA) r15
            java.lang.Object r0 = r2.A01
            X.GVT r0 = (X.GVT) r0
            X.GiL r8 = r0.A0G
            r3 = 0
            if (r8 != 0) goto L_0x00df
            java.lang.String r0 = "audioPageGridController"
        L_0x00d7:
            X.0qQ.A0F(r0)
        L_0x00da:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00df:
            X.0qQ.A0A(r15)
            X.Ghc r0 = r0.A0J
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "audioPageViewModel"
            goto L_0x00d7
        L_0x00e9:
            X.GVW r0 = X.C53044Ghc.A00(r0)
            if (r0 == 0) goto L_0x00f1
            java.util.List r3 = r0.A06
        L_0x00f1:
            r7 = 0
            X.0qQ.A0B(r15, r7)
            X.Ghc r0 = r8.A03
            com.instagram.clips.audio.model.AudioPageAssetModel r0 = r0.A02
            if (r0 == 0) goto L_0x0014
            java.util.List r6 = r15.A01
            com.instagram.api.schemas.AudioFilterType r9 = r15.A00
            X.6sV r5 = r8.A04
            java.util.List r0 = r5.A01()
            java.util.ArrayList r13 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x010d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r1 = r16.next()
            X.6sp r1 = (X.C320716sp) r1
            X.HsR r14 = r1.A04
            r12 = 0
            if (r14 == 0) goto L_0x014a
            int r0 = r14.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L_0x0124:
            X.4bN r11 = r1.A03
            if (r15 == 0) goto L_0x013f
            com.instagram.api.schemas.AudioFilterType[] r10 = com.instagram.api.schemas.AudioFilterType.values()
            int r4 = r10.length
            r2 = 0
        L_0x012e:
            if (r2 >= r4) goto L_0x013f
            r0 = r10[r2]
            int r1 = X.C263304Kd.A00(r0)
            int r0 = r15.intValue()
            if (r1 == r0) goto L_0x0140
            int r2 = r2 + 1
            goto L_0x012e
        L_0x013f:
            r12 = r14
        L_0x0140:
            r1 = 0
            X.6sp r0 = new X.6sp
            r0.<init>(r1, r11, r12)
            r13.add(r0)
            goto L_0x010d
        L_0x014a:
            r15 = r12
            goto L_0x0124
        L_0x014c:
            java.util.ArrayList r4 = X.00k.A0U(r13)
            r12 = 0
            r11 = 1
            if (r3 == 0) goto L_0x0197
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0197
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0162:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = r3.next()
            int r2 = r12 + 1
            if (r12 >= 0) goto L_0x0175
            X.0sr.A1T()
            goto L_0x00da
        L_0x0175:
            X.4bN r0 = (X.C267324bN) r0
            java.lang.String r1 = r0.A0C()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            X.AnonymousClass7TF.A1I(r1, r0, r10)
            r12 = r2
            goto L_0x0162
        L_0x0184:
            java.util.Map r2 = X.0Yt.A08(r10)
            int r0 = r4.size()
            if (r0 <= r11) goto L_0x0197
            r1 = 5
            X.MAZ r0 = new X.MAZ
            r0.<init>((java.lang.Object) r2, (int) r1)
            X.01V.A1D(r4, r0)
        L_0x0197:
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x019f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r0 = r6.next()
            X.4sL r0 = (X.C276014sL) r0
            X.4bN r3 = X.C295325ny.A02(r0)
            int r1 = X.C263304Kd.A00(r9)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.HsR r2 = new X.HsR
            r2.<init>(r0, r1)
            r1 = 0
            X.6sp r0 = new X.6sp
            r0.<init>(r1, r3, r2)
            r10.add(r0)
            goto L_0x019f
        L_0x01c4:
            r4.removeAll(r10)
            r4.addAll(r7, r10)
            r5.A06(r4, r7)
            androidx.recyclerview.widget.RecyclerView r0 = r8.A00
            if (r0 == 0) goto L_0x0014
            r0.A0o(r7)
            return
        L_0x01d5:
            java.lang.Object r0 = r2.A01
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r0 = (instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r0
            com.instagram.model.reels.Reel r15 = (com.instagram.model.reels.Reel) r15
            if (r15 == 0) goto L_0x0014
            r0.A09 = r15
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r0.A0D
            if (r0 == 0) goto L_0x0014
            X.IZT r2 = X.IZT.A00
            r1 = 1
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A04(r2, r0, r1)
            return
        L_0x01ee:
            java.lang.Object r0 = r2.A01
            X.5Oz r0 = (X.C284945Oz) r0
            r0.Epw(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IHH.onChanged(java.lang.Object):void");
    }
}
