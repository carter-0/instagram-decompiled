package X;

import com.instagram.common.session.UserSession;

public final class GZ3 implements C59620JQo {
    public 0sL A00;
    public 0sJ A01;
    public 0sH A02;
    public final UserSession A03;
    public final C51979GAc A04;
    public final C52073GDt A05;
    public final C62320sa A06;

    public final void Eb5(0sH r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
    }

    public final void Ebd(0sJ r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
    }

    public final void Ebk(0sL r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public GZ3(UserSession userSession, C52073GDt gDt, C51979GAc gAc, C62320sa r4) {
        this.A03 = userSession;
        this.A05 = gDt;
        this.A04 = gAc;
        this.A06 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ea, code lost:
        if (X.182.A06(X.0Tu.A06, r8.A00, 36319119628377004L) != false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ec, code lost:
        r8 = r14.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ee, code lost:
        if (r8 == null) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f0, code lost:
        r4 = r14.A0H;
        r2 = r9.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f6, code lost:
        if (r2 == r6) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f8, code lost:
        if (r2 == 2) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fa, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01fb, code lost:
        r2 = new X.C53594Gr9(r3, r5, r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0202, code lost:
        r3 = X.AnonymousClass8ZN.CLIPS_MIDCARD_REVISIT_AUDIO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0205, code lost:
        r3 = X.AnonymousClass8ZN.CLIPS_MIDCARD_RECENTLY_SAVED_AUDIO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d7, code lost:
        if (X.182.A06(X.0Tu.A06, r8.A00, 36317015094465290L) == false) goto L_0x01d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CJP(com.instagram.api.schemas.ClipsMidCardSubtype r12, com.instagram.api.schemas.InstagramMidcardType r13, X.C53332GmI r14, java.lang.String r15, int r16) {
        /*
            r11 = this;
            boolean r6 = X.AnonymousClass7TG.A1Z(r13, r12)
            r7 = 2
            int r4 = X.C51970G9q.A08(r7, r14, r15)
            com.instagram.common.session.UserSession r1 = r11.A03
            java.lang.String r5 = "midcard_media_tap"
            X.GAc r0 = r11.A04
            X.0Aj r3 = X.C51972G9s.A0M(r0, r1)
            boolean r2 = r3.isSampled()
            if (r2 == 0) goto L_0x0020
            X.93T r2 = X.C51979GAc.A00(r3, r0, r5)
            X.I3w.A02(r3, r12, r13, r2)
        L_0x0020:
            X.0sa r2 = r11.A06
            java.lang.Object r2 = r2.invoke()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x020c
            r3 = r16
            X.1Xj r3 = X.C51966G9m.A0u(r2, r3)
        L_0x0030:
            X.GDt r8 = r11.A05
            X.Gok r5 = r14.A06
            r9 = 0
            if (r3 == 0) goto L_0x01ba
            if (r5 == 0) goto L_0x0173
            X.Goh r10 = r5.A06
            if (r10 == 0) goto L_0x0173
            com.instagram.api.schemas.MidCardClipsClickedAction r2 = r10.A00
            if (r2 == 0) goto L_0x013d
            int r2 = r2.ordinal()
            if (r2 != r4) goto L_0x013d
            X.Gr7 r2 = new X.Gr7
            r2.<init>(r3, r15)
        L_0x004c:
            X.JNF r2 = (X.JNF) r2
            boolean r3 = r2 instanceof X.C53593Gr8
            if (r3 == 0) goto L_0x006e
            X.0sJ r5 = r11.A01
            if (r5 == 0) goto L_0x006d
            X.Gr8 r2 = (X.C53593Gr8) r2
            X.4h3 r4 = r2.A00
            X.1Xj r0 = r2.A01
            java.lang.String r3 = r0.getId()
            java.lang.String r1 = r2.A02
            boolean r0 = r0.A5I()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.invoke(r4, r3, r1, r0)
        L_0x006d:
            return
        L_0x006e:
            boolean r3 = r2 instanceof X.C53592Gr7
            if (r3 == 0) goto L_0x0080
            X.0sL r3 = r11.A00
            if (r3 == 0) goto L_0x006d
            X.Gr7 r2 = (X.C53592Gr7) r2
            X.1Xj r1 = r2.A00
            java.lang.String r0 = r2.A01
            r3.invoke(r1, r0)
            return
        L_0x0080:
            boolean r3 = r2 instanceof X.C53594Gr9
            if (r3 == 0) goto L_0x0130
            java.lang.String r10 = X.AnonymousClass7TG.A0j()
            X.0sH r4 = r11.A02
            if (r4 == 0) goto L_0x009b
            r3 = r2
            X.Gr9 r3 = (X.C53594Gr9) r3
            X.46i r5 = r3.A02
            java.util.List r6 = r3.A03
            r7 = 0
            X.8ZN r8 = r3.A00
            X.Gok r9 = r3.A01
            r4.invoke(r5, r6, r7, r8, r9, r10)
        L_0x009b:
            X.Gr9 r2 = (X.C53594Gr9) r2
            X.46i r8 = r2.A02
            java.util.List r9 = r2.A03
            X.8ZN r4 = r2.A00
            X.Gok r6 = r2.A01
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r9.iterator()
        L_0x00ad:
            boolean r2 = r5.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x00c4
            X.1Xj r2 = X.C51968G9o.A0n(r5)
            if (r2 == 0) goto L_0x00ad
            java.lang.String r2 = r2.A30()
            if (r2 == 0) goto L_0x00ad
            X.C51973G9u.A1F(r2, r7)
            goto L_0x00ad
        L_0x00c4:
            if (r6 == 0) goto L_0x012e
            com.instagram.api.schemas.ClipsMidCardType r2 = r6.A04
            if (r2 == 0) goto L_0x012e
            com.instagram.api.schemas.InstagramMidcardType r2 = X.I7H.A00(r2)
            X.XSE r5 = X.I3w.A01(r2)
        L_0x00d2:
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r1)
            r1 = 162(0xa2, float:2.27E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x006d
            X.C51979GAc.A01(r2, r0)
            java.lang.Object r0 = X.00k.A0I(r9)
            X.4bN r0 = (X.C267324bN) r0
            java.lang.String r0 = r0.getId()
            X.C51965G9l.A1P(r2, r0)
            X.HOu r0 = X.C54689HOu.A0F
            X.C51965G9l.A1C(r0, r2)
            java.lang.String r1 = r8.getAudioAssetId()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            long r0 = X.DbZ.A07(r1)
            X.C51973G9u.A13(r2, r10, r0)
            java.lang.String r0 = "media_list"
            r2.AAe(r0, r7)
            java.lang.String r0 = "midcard_type"
            r2.A8M(r5, r0)
            if (r6 == 0) goto L_0x011e
            com.instagram.api.schemas.ClipsMidCardSubtype r0 = r6.A03
            if (r0 == 0) goto L_0x011e
            java.lang.String r3 = r0.toString()
        L_0x011e:
            java.lang.String r0 = "midcard_subtype"
            r2.AAJ(r0, r3)
            if (r4 != 0) goto L_0x0127
            X.8ZN r4 = X.AnonymousClass8ZN.CLIPS_VIEWER_MIDCARD
        L_0x0127:
            X.C51971G9r.A16(r4, r2, r10)
            X.DbX.A1L(r2)
            return
        L_0x012e:
            r5 = r3
            goto L_0x00d2
        L_0x0130:
            X.Ied r0 = X.C57674Ied.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x006d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x013d:
            X.Goj r2 = r10.A03
            if (r2 != 0) goto L_0x0149
            X.Goi r2 = r10.A02
            if (r2 == 0) goto L_0x0173
            X.Goj r2 = r2.A00
            if (r2 == 0) goto L_0x0173
        L_0x0149:
            X.Gor r9 = r2.A07
            if (r9 == 0) goto L_0x0173
            com.instagram.common.session.UserSession r7 = r8.A00
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.List r2 = r10.A08
            if (r2 == 0) goto L_0x017c
            java.util.Iterator r4 = r2.iterator()
        L_0x015b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x017c
            java.lang.Object r2 = r4.next()
            X.4sL r2 = (X.C276014sL) r2
            X.1Xj r2 = r2.A00
            java.lang.String r2 = r2.getId()
            if (r2 == 0) goto L_0x020f
            r5.add(r2)
            goto L_0x015b
        L_0x0173:
            com.instagram.common.session.UserSession r4 = r8.A00
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD
            X.4h3 r4 = X.C51965G9l.A0i(r2, r4)
            goto L_0x01af
        L_0x017c:
            com.instagram.clips.intf.ClipsViewerSource r2 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_OPEN_REELS_CHAIN
            X.4h3 r4 = X.C51965G9l.A0i(r2, r7)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5)
            r4.A0B = r2
            java.util.List r7 = r9.A03
            if (r7 == 0) goto L_0x01b8
            java.lang.String r5 = ","
            X.J66 r2 = X.J66.A00
            java.lang.String r2 = X.DbT.A0z(r5, r7, r2)
        L_0x0194:
            r4.A0s = r2
            java.lang.String r2 = r9.A01
            r4.A0n = r2
            java.lang.String r2 = r9.A02
            r4.A0o = r2
            com.instagram.api.schemas.MidCardReelsChainCtaType r2 = r9.A00
            if (r2 == 0) goto L_0x01b6
            int r2 = r2.ordinal()
            if (r2 != r6) goto L_0x01b6
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x01aa:
            r4.A0R = r2
            r2 = 0
            r4.A1l = r2
        L_0x01af:
            X.Gr8 r2 = new X.Gr8
            r2.<init>(r4, r3, r15)
            goto L_0x004c
        L_0x01b6:
            r2 = 0
            goto L_0x01aa
        L_0x01b8:
            r2 = 0
            goto L_0x0194
        L_0x01ba:
            com.instagram.api.schemas.InstagramMidcardType r3 = r14.A05
            com.instagram.api.schemas.InstagramMidcardType r2 = com.instagram.api.schemas.InstagramMidcardType.A0V
            if (r3 != r2) goto L_0x0208
            X.Got r2 = r14.A07
            if (r2 == 0) goto L_0x01c6
            com.instagram.api.schemas.ClipsRSAMidCardSubType r9 = r2.A00
        L_0x01c6:
            com.instagram.api.schemas.ClipsRSAMidCardSubType r2 = com.instagram.api.schemas.ClipsRSAMidCardSubType.RECENTLY_SAVED_AUDIO
            if (r9 != r2) goto L_0x01d9
            com.instagram.common.session.UserSession r10 = r8.A00
            X.0Tu r4 = X.0Tu.A06
            r2 = 36317015094465290(0x8106220002130a, double:3.0303648103972905E-306)
            boolean r2 = X.182.A06(r4, r10, r2)
            if (r2 != 0) goto L_0x01ec
        L_0x01d9:
            com.instagram.api.schemas.ClipsRSAMidCardSubType r2 = com.instagram.api.schemas.ClipsRSAMidCardSubType.REVISIT_AUDIO
            if (r9 != r2) goto L_0x0208
            com.instagram.common.session.UserSession r8 = r8.A00
            X.0Tu r4 = X.0Tu.A06
            r2 = 36319119628377004(0x81080c00011bac, double:3.031695726117336E-306)
            boolean r2 = X.182.A06(r4, r8, r2)
            if (r2 == 0) goto L_0x0208
        L_0x01ec:
            X.46i r8 = r14.A09
            if (r8 == 0) goto L_0x0208
            java.util.List r4 = r14.A0H
            int r2 = r9.ordinal()
            if (r2 == r6) goto L_0x0205
            if (r2 == r7) goto L_0x0202
            r3 = 0
        L_0x01fb:
            X.Gr9 r2 = new X.Gr9
            r2.<init>(r3, r5, r8, r4)
            goto L_0x004c
        L_0x0202:
            X.8ZN r3 = X.AnonymousClass8ZN.CLIPS_MIDCARD_REVISIT_AUDIO
            goto L_0x01fb
        L_0x0205:
            X.8ZN r3 = X.AnonymousClass8ZN.CLIPS_MIDCARD_RECENTLY_SAVED_AUDIO
            goto L_0x01fb
        L_0x0208:
            X.Ied r2 = X.C57674Ied.A00
            goto L_0x004c
        L_0x020c:
            r3 = 0
            goto L_0x0030
        L_0x020f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GZ3.CJP(com.instagram.api.schemas.ClipsMidCardSubtype, com.instagram.api.schemas.InstagramMidcardType, X.GmI, java.lang.String, int):void");
    }
}
