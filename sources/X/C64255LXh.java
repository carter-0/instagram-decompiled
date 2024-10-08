package X;

import android.view.View;

/* renamed from: X.LXh  reason: case insensitive filesystem */
public final class C64255LXh implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C64255LXh(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A05 = obj4;
        this.A01 = obj;
        this.A06 = obj2;
        this.A03 = obj5;
        this.A04 = obj6;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0185, code lost:
        if (r1.isValid() != true) goto L_0x0187;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r2 = r19
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x015a;
                case 1: goto L_0x011d;
                case 2: goto L_0x00a1;
                case 3: goto L_0x005d;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 776664187(0x2e4af47b, float:4.6146625E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r2.A06
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.8sM r4 = X.C368278sM.ACCEPT
            java.lang.Object r8 = r2.A05
            X.L2V r8 = (X.L2V) r8
            X.1Xj r1 = r8.A00
            java.lang.String r1 = r1.getId()
            r3 = 0
            X.LTD.A04(r4, r7, r1, r3)
            java.lang.Object r9 = r2.A04
            X.LAl r9 = (X.C63882LAl) r9
            com.instagram.igds.components.button.IgdsButton r1 = r9.A06
            X.JTQ.A1I(r1)
            java.lang.Object r6 = r2.A03
            X.4DH r6 = (X.AnonymousClass4DH) r6
            java.lang.Object r5 = r2.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r10 = r2.A02
            X.E6i r10 = (X.C47522E6i) r10
            X.M1H r4 = new X.M1H
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.1Z9 r2 = X.C48920EmK.A00()
            r1 = 19
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r6, r1)
            X.ELU r2 = r2.A01(r6, r7, r4)
            X.EXN r1 = X.EXN.A0H
            java.lang.String r1 = r1.A01()
            r2.A06(r1, r3)
            r1 = 1366385805(0x5171648d, float:6.479838E10)
        L_0x0059:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x005d:
            r0 = -521997034(0xffffffffe0e2f516, float:-1.30832014E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r2.A05
            com.instagram.reels.prompt.model.PromptStickerModel r8 = (com.instagram.reels.prompt.model.PromptStickerModel) r8
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r8.A00
            com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict r1 = r1.Ban()
            if (r1 == 0) goto L_0x0093
            java.lang.Object r7 = r2.A01
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r6 = r2.A06
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r5 = r2.A03
            java.lang.Object r3 = r2.A04
            r1 = 47
            X.Iw4 r4 = new X.Iw4
            r4.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r3, (java.lang.Object) r5)
            java.lang.Object r3 = r2.A02
            r2 = 42
            X.MMd r1 = new X.MMd
            r1.<init>(r3, r2)
            X.C64019LJg.A01(r7, r6, r8, r4, r1)
        L_0x008f:
            r1 = -1024401414(0xffffffffc2f0dffa, float:-120.437454)
            goto L_0x0059
        L_0x0093:
            java.lang.Object r4 = r2.A03
            X.K7c r4 = (X.C61427K7c) r4
            java.lang.Object r3 = r2.A04
            X.Lnw r3 = (X.C65134Lnw) r3
            r2 = 0
            r1 = 0
            r4.A03(r2, r3, r1)
            goto L_0x008f
        L_0x00a1:
            r0 = 134501193(0x8045349, float:3.9820206E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            com.facebook.common.callercontext.CallerContext r1 = X.C59719JVd.A01
            java.lang.Object r7 = r2.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r4 = r2.A04
            X.LEH r4 = (X.LEH) r4
            java.lang.Object r1 = r2.A05
            X.L6a r1 = (X.C63768L6a) r1
            java.lang.Object r6 = r2.A03
            X.4DH r6 = (X.AnonymousClass4DH) r6
            java.lang.Object r9 = r2.A06
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.Object r3 = r2.A02
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r3 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r3
            boolean r2 = r1.A01
            if (r2 == 0) goto L_0x00d1
            boolean r2 = r1.A00
            if (r2 == 0) goto L_0x00e7
            com.instagram.igds.components.button.IgdsButton r2 = r4.A00()
            X.JTQ.A1I(r2)
        L_0x00d1:
            r13 = 0
            r8 = r6
            r10 = r1
            r11 = r4
            r12 = r3
            r14 = r13
            X.LSZ.A01(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00da:
            X.819 r4 = X.AnonymousClass819.ROWSHARE_SINGLE_STORY
            X.8sM r3 = X.C368278sM.ACCEPT
            r2 = 0
            X.LSZ.A02(r3, r4, r9, r1, r2)
            r1 = 213562415(0xcbab42f, float:2.8766282E-31)
            goto L_0x0059
        L_0x00e7:
            if (r6 == 0) goto L_0x00da
            androidx.fragment.app.FragmentActivity r5 = r6.getActivity()
            if (r5 == 0) goto L_0x00da
            X.Lxb r12 = new X.Lxb
            r13 = r7
            r14 = r6
            r15 = r9
            r16 = r1
            r17 = r4
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.LRS r4 = X.C62052KYa.A03
            X.818 r7 = X.AnonymousClass818.IG_ROWSHARE_SINGLE_STORY_ACCEPT
            X.LxP r11 = X.C65648LxP.A00
            X.3uh r2 = r1.A02
            X.1Xj r2 = r2.A0b
            if (r2 == 0) goto L_0x010f
            java.lang.String r14 = r2.getId()
            if (r14 != 0) goto L_0x0111
        L_0x010f:
            java.lang.String r14 = ""
        L_0x0111:
            r10 = 0
            X.819 r8 = X.AnonymousClass819.BOTTOMSHEET_SHARE_LATER_STORY
            java.lang.String r15 = ""
            r16 = 0
            r13 = r10
            r4.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00da
        L_0x011d:
            r0 = 94960469(0x5a8fb55, float:1.5890969E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A04
            X.LOZ r1 = (X.LOZ) r1
            r1.A01()
            java.lang.Object r6 = r2.A06
            X.7jJ r6 = (X.C339257jJ) r6
            r9 = 0
            r6.A00 = r9
            java.lang.Object r7 = r2.A01
            java.lang.Object r3 = r2.A02
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r8 = r2.A05
            java.lang.Object r5 = r2.A03
            X.0eM r1 = r6.A01
            java.lang.Object r2 = r1.getValue()
            X.12V r2 = (X.AnonymousClass12V) r2
            r1 = 23341140(0x1642854, float:4.190592E-38)
            X.0nV r1 = X.JTP.A0U(r2, r1)
            r10 = 11
            X.MGj r4 = new X.MGj
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            X.1Eo.A05(r1, r4, r3)
            r1 = 267598091(0xff3390b, float:2.3983622E-29)
            goto L_0x0059
        L_0x015a:
            r0 = -1418586099(0xffffffffab72180d, float:-8.600905E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            android.content.Context r9 = X.AnonymousClass7TE.A0S(r1)
            java.lang.Object r4 = r2.A06
            X.Jp3 r4 = (X.C60656Jp3) r4
            X.JaS r1 = r4.A04
            com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView r1 = r1.A00
            boolean r8 = r1.A09
            java.lang.Object r1 = r2.A04
            X.LiD r1 = (X.C64793LiD) r1
            X.9I9 r1 = r1.A00
            boolean r7 = r1.A02
            com.instagram.common.gallery.Draft r1 = r4.A01
            r3 = 1
            if (r1 == 0) goto L_0x0187
            boolean r1 = r1.isValid()
            r6 = 1
            if (r1 == r3) goto L_0x0188
        L_0x0187:
            r6 = 0
        L_0x0188:
            com.instagram.common.gallery.Draft r1 = r4.A01
            if (r1 == 0) goto L_0x01bd
            boolean r5 = r1.A06
        L_0x018e:
            java.lang.Object r4 = r2.A05
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r1 = r2.A02
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            java.lang.Object r3 = r2.A03
            X.L3h r3 = (X.C63697L3h) r3
            if (r8 != 0) goto L_0x019e
            if (r7 != 0) goto L_0x01a3
        L_0x019e:
            if (r6 != 0) goto L_0x01a8
            X.C59848JaO.A01(r9, r5)
        L_0x01a3:
            r1 = -128468312(0xfffffffff857baa8, float:-1.7502026E34)
            goto L_0x0059
        L_0x01a8:
            X.27r r2 = X.27p.A01(r4)
            java.lang.String r1 = r1.A0A
            r2.A1p(r1)
            X.JWs r1 = r3.A00
            X.0sP r2 = r1.A04
            X.LiD r1 = r3.A01
            com.instagram.common.gallery.model.GalleryItem r1 = r1.A01
            r2.invoke(r1)
            goto L_0x01a3
        L_0x01bd:
            r5 = 0
            goto L_0x018e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64255LXh.onClick(android.view.View):void");
    }
}
