package X;

/* renamed from: X.Ivw  reason: case insensitive filesystem */
public final class C58687Ivw extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58687Ivw(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C58687Ivw A00(Object obj, Object obj2, int i) {
        return new C58687Ivw(i, obj, obj2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0578, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x06c8, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0224, code lost:
        if (r1 == 0) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x023a, code lost:
        if (r0 == null) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023c, code lost:
        r0.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 2: goto L_0x0071;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x009a;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00ca;
                case 9: goto L_0x0005;
                case 10: goto L_0x00e7;
                case 11: goto L_0x0117;
                case 12: goto L_0x0132;
                case 13: goto L_0x0150;
                case 14: goto L_0x016e;
                case 15: goto L_0x018c;
                case 16: goto L_0x019f;
                case 17: goto L_0x01b2;
                case 18: goto L_0x01e1;
                case 19: goto L_0x01f0;
                case 20: goto L_0x020f;
                case 21: goto L_0x022d;
                case 22: goto L_0x0241;
                case 23: goto L_0x0255;
                case 24: goto L_0x02cf;
                case 25: goto L_0x02fa;
                case 26: goto L_0x0310;
                case 27: goto L_0x0327;
                case 28: goto L_0x0337;
                case 29: goto L_0x0024;
                case 30: goto L_0x035e;
                case 31: goto L_0x043d;
                case 32: goto L_0x0483;
                case 33: goto L_0x04a4;
                case 34: goto L_0x04e6;
                case 35: goto L_0x0510;
                case 36: goto L_0x052c;
                case 37: goto L_0x055c;
                case 38: goto L_0x057f;
                case 39: goto L_0x059f;
                case 40: goto L_0x05cf;
                case 41: goto L_0x0606;
                case 42: goto L_0x0618;
                case 43: goto L_0x0627;
                case 44: goto L_0x0635;
                case 45: goto L_0x0682;
                case 46: goto L_0x0037;
                case 47: goto L_0x06a3;
                case 48: goto L_0x06a3;
                case 49: goto L_0x06b0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r6 = r0.invoke()
            if (r6 != 0) goto L_0x0023
        L_0x0011:
            java.lang.Object r0 = r15.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x006e
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x006e
            X.2YQ r6 = r1.getDefaultViewModelCreationExtras()
        L_0x0023:
            return r6
        L_0x0024:
            java.lang.Object r0 = r15.A02
            X.Gwj r0 = (X.C53939Gwj) r0
            X.90O r6 = r0.A00
            if (r6 != 0) goto L_0x0023
            java.lang.Object r0 = r15.A01
            android.content.Context r0 = X.C51966G9m.A0Q(r0)
            X.90O r6 = X.AnonymousClass90O.A00(r0)
            return r6
        L_0x0037:
            java.lang.Object r3 = r15.A02
            X.Gw8 r3 = (X.C53902Gw8) r3
            X.HQ2 r2 = r3.A02
            boolean r1 = r2 instanceof X.HIE
            r0 = 0
            if (r1 == 0) goto L_0x005c
            X.HIE r2 = (X.HIE) r2
            if (r2 == 0) goto L_0x0048
            X.HQ0 r0 = r2.A01
        L_0x0048:
            boolean r0 = r0 instanceof X.C54521HHh
            java.lang.Object r1 = r15.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            if (r0 == 0) goto L_0x0058
            r0 = 2131966320(0x7f133970, float:1.9569475E38)
        L_0x0053:
            java.lang.String r6 = X.C244013aV.A0E(r1, r0)
            return r6
        L_0x0058:
            r0 = 2131966321(0x7f133971, float:1.9569477E38)
            goto L_0x0053
        L_0x005c:
            java.lang.String r6 = r3.A03
            if (r6 == 0) goto L_0x0066
            boolean r0 = X.00l.A0W(r6)
            if (r0 == 0) goto L_0x0023
        L_0x0066:
            java.lang.Object r1 = r15.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            r0 = 2131966334(0x7f13397e, float:1.9569503E38)
            goto L_0x0053
        L_0x006e:
            X.2YP r6 = X.AnonymousClass2YP.A00
            return r6
        L_0x0071:
            java.lang.Object r4 = r15.A02
            X.H0W r4 = (X.H0W) r4
            X.0eM r0 = r4.A07
            java.lang.Object r3 = r0.getValue()
            X.Gh5 r3 = (X.C53014Gh5) r3
            java.lang.Object r0 = r15.A01
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            int r2 = r0.A02
            java.lang.String r1 = r0.A03
            if (r1 != 0) goto L_0x0089
            java.lang.String r1 = ""
        L_0x0089:
            X.Ibn r0 = new X.Ibn
            r0.<init>(r2, r1)
            X.JML[] r0 = new X.JML[]{r0}
            r3.A00(r0)
            X.DbZ.A15(r4)
            goto L_0x06c6
        L_0x009a:
            java.lang.Object r1 = r15.A02
            com.instagram.wonderwall.repository.WallPostRepository r1 = (com.instagram.wonderwall.repository.WallPostRepository) r1
            java.lang.Object r2 = r15.A01
            com.instagram.wonderwall.model.WallPostItem r2 = (com.instagram.wonderwall.model.WallPostItem) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.JQP r1 = r1.A01
            X.J4h r0 = X.C59048J4h.A00
            com.instagram.wonderwall.model.WallPostItem r0 = com.instagram.wonderwall.repository.WallPostRepository.A00(r2, r0)
            r1.E01(r0)
            r1.DXF()
            goto L_0x06c6
        L_0x00b6:
            java.lang.Object r2 = r15.A02
            X.Ghg r2 = (X.C53048Ghg) r2
            java.lang.Object r0 = r15.A01
            java.lang.String r1 = X.DbS.A0q(r0)
            X.Ibv r0 = new X.Ibv
            r0.<init>(r1)
            X.C53048Ghg.A02(r0, r2)
            goto L_0x06c6
        L_0x00ca:
            java.lang.Object r2 = r15.A02
            X.Ghg r2 = (X.C53048Ghg) r2
            java.lang.Object r0 = r15.A01
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            java.util.List r0 = r2.A06
            r0.clear()
            r0.addAll(r1)
            r0 = 19
            X.J6g r0 = X.C59098J6g.A01(r2, r0)
            X.C53048Ghg.A03(r2, r0)
            goto L_0x06c6
        L_0x00e7:
            java.lang.Object r6 = r15.A02
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r6 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r6
            X.HjP r1 = r6.A09
            java.lang.Object r5 = r15.A01
            X.Htm r0 = com.meta.compose.material.bottomsheet.AnchoredDraggableState.A01(r6)
            float r4 = r0.A00(r5)
            boolean r0 = java.lang.Float.isNaN(r4)
            if (r0 != 0) goto L_0x0110
            r3 = 0
            r2 = 0
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = r1.A00
            X.5PZ r0 = r1.A03
            r0.EWt(r4)
            X.5PZ r0 = r1.A02
            r0.EWt(r2)
            X.5Oz r0 = r6.A06
            r0.Epw(r3)
        L_0x0110:
            X.5Oz r0 = r6.A05
            r0.Epw(r5)
            goto L_0x06c6
        L_0x0117:
            java.lang.Object r2 = r15.A02
            X.Hri r2 = (X.C56035Hri) r2
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r0 = r2.A02
            X.0sP r1 = r0.A0B
            X.HLh r0 = X.C54624HLh.Hidden
            boolean r0 = X.C51971G9r.A1a(r0, r1)
            if (r0 == 0) goto L_0x06c6
            java.lang.Object r1 = r15.A01
            X.4Cq r1 = (X.C262224Cq) r1
            r0 = 28
            X.C58106ImS.A03(r2, r1, r0)
            goto L_0x06c6
        L_0x0132:
            java.lang.Object r2 = r15.A02
            X.Hri r2 = (X.C56035Hri) r2
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r0 = r2.A02
            X.0sP r1 = r0.A0B
            X.HLh r0 = X.C54624HLh.Hidden
            boolean r0 = X.C51971G9r.A1a(r0, r1)
            if (r0 == 0) goto L_0x014b
            java.lang.Object r1 = r15.A01
            X.4Cq r1 = (X.C262224Cq) r1
            r0 = 29
            X.C58106ImS.A03(r2, r1, r0)
        L_0x014b:
            java.lang.Boolean r6 = X.AnonymousClass7TE.A0v()
            return r6
        L_0x0150:
            java.lang.Object r2 = r15.A02
            X.Hri r2 = (X.C56035Hri) r2
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r0 = r2.A02
            X.0sP r1 = r0.A0B
            X.HLh r0 = X.C54624HLh.Expanded
            boolean r0 = X.C51971G9r.A1a(r0, r1)
            if (r0 == 0) goto L_0x0169
            java.lang.Object r1 = r15.A01
            X.4Cq r1 = (X.C262224Cq) r1
            r0 = 30
            X.C58106ImS.A03(r2, r1, r0)
        L_0x0169:
            java.lang.Boolean r6 = X.AnonymousClass7TE.A0v()
            return r6
        L_0x016e:
            java.lang.Object r2 = r15.A02
            X.Hri r2 = (X.C56035Hri) r2
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r0 = r2.A02
            X.0sP r1 = r0.A0B
            X.HLh r0 = X.C54624HLh.HalfExpanded
            boolean r0 = X.C51971G9r.A1a(r0, r1)
            if (r0 == 0) goto L_0x0187
            java.lang.Object r1 = r15.A01
            X.4Cq r1 = (X.C262224Cq) r1
            r0 = 31
            X.C58106ImS.A03(r2, r1, r0)
        L_0x0187:
            java.lang.Boolean r6 = X.AnonymousClass7TE.A0v()
            return r6
        L_0x018c:
            java.lang.Object r0 = r15.A01
            X.2Wa r0 = (X.2Wa) r0
            X.C51971G9r.A1I(r0)
            java.lang.Object r0 = r15.A02
            X.GbJ r0 = (X.C52706GbJ) r0
            r0.A01()
            r0.A02()
            goto L_0x06c6
        L_0x019f:
            java.lang.Object r0 = r15.A02
            X.Guf r0 = (X.C53812Guf) r0
            X.F3q r1 = r0.A02
            java.lang.Object r0 = r15.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            X.0sa r0 = (X.C62320sa) r0
            r1.A03(r0)
            goto L_0x06c6
        L_0x01b2:
            java.lang.Object r3 = r15.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r1 = r15.A02
            X.HLi r1 = (X.C54625HLi) r1
            r2 = 0
            boolean r0 = X.AnonymousClass7TF.A1U(r2, r3, r1)
            int r1 = r1.ordinal()
            if (r1 == r2) goto L_0x01dd
            if (r1 == r0) goto L_0x01d9
            r0 = 2
            if (r1 != r0) goto L_0x06c6
            r1 = 2131974907(0x7f135afb, float:1.9586891E38)
        L_0x01cd:
            X.6ap r0 = X.DbS.A0a()
            X.DbS.A19(r3, r0, r1)
            X.DbY.A1N(r0)
            goto L_0x06c6
        L_0x01d9:
            r1 = 2131974896(0x7f135af0, float:1.958687E38)
            goto L_0x01cd
        L_0x01dd:
            r1 = 2131974908(0x7f135afc, float:1.9586893E38)
            goto L_0x01cd
        L_0x01e1:
            java.lang.Object r1 = r15.A01
            com.facebook.litho.ComponentTree r1 = (com.facebook.litho.ComponentTree) r1
            java.lang.Object r0 = r15.A02
            X.GsD r0 = (X.C53660GsD) r0
            X.3mp r0 = r0.A00
            r1.A0L(r0)
            r6 = 0
            return r6
        L_0x01f0:
            java.lang.Object r0 = r15.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r2 = r0.A05
            java.lang.Object r0 = r15.A02
            X.GsD r0 = (X.C53660GsD) r0
            X.3mp r0 = r0.A00
            X.3X6 r1 = com.facebook.litho.ComponentTree.A01(r0, r2)
            X.3X5 r0 = r2.A02
            X.2Sa r0 = r0.A01
            X.2Sa r0 = X.2Sa.A00(r0)
            r1.A06 = r0
            com.facebook.litho.ComponentTree r6 = r1.A00()
            return r6
        L_0x020f:
            java.lang.Object r3 = r15.A01
            X.2Wa r3 = (X.2Wa) r3
            java.lang.Object r2 = r15.A02
            X.Gsk r2 = (X.C53693Gsk) r2
            X.GbJ r0 = r2.A00
            java.lang.CharSequence r0 = r0.A00()
            if (r0 == 0) goto L_0x0226
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0227
        L_0x0226:
            r0 = 1
        L_0x0227:
            X.C51967G9n.A1I(r3, r0)
            X.0sa r0 = r2.A02
            goto L_0x023a
        L_0x022d:
            java.lang.Object r0 = r15.A01
            X.2Wa r0 = (X.2Wa) r0
            r0.A00()
            java.lang.Object r0 = r15.A02
            X.GuP r0 = (X.C53796GuP) r0
            X.0sa r0 = r0.A01
        L_0x023a:
            if (r0 == 0) goto L_0x06c6
            r0.invoke()
            goto L_0x06c6
        L_0x0241:
            java.lang.Object r0 = r15.A02
            X.GuP r0 = (X.C53796GuP) r0
            X.0sa r0 = r0.A00
            if (r0 == 0) goto L_0x024c
            r0.invoke()
        L_0x024c:
            java.lang.Object r0 = r15.A01
            X.2Wa r0 = (X.2Wa) r0
            X.C51971G9r.A1I(r0)
            goto L_0x06c6
        L_0x0255:
            java.lang.Object r0 = r15.A01
            X.HKy r0 = (X.C54615HKy) r0
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 != r0) goto L_0x02ca
            java.lang.Object r6 = r15.A02
            X.3Y5 r6 = (X.AnonymousClass3Y5) r6
            X.JNh r5 = X.I3I.A01(r6)
            java.lang.Integer r1 = X.AnonymousClass05K.A09
            X.0qQ.A0B(r5, r0)
            X.JRA r0 = X.C56611I4l.A02(r5)
            int r2 = r0.AKp(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.JRA r0 = X.C56611I4l.A02(r5)
            boolean r0 = r0.AVl(r1)
            if (r0 == 0) goto L_0x02a4
            long r0 = X.C51965G9l.A07(r2)
            float r4 = X.C51969G9p.A02(r6, r0)
            float r3 = X.C51969G9p.A02(r6, r0)
            X.XRa r0 = X.C21255XRa.A1q
            int r2 = X.C56611I4l.A01(r0, r5)
            X.XRa r0 = X.C21255XRa.A0T
            int r1 = X.C56611I4l.A01(r0, r5)
            X.HHK r0 = new X.HHK
            r0.<init>(r2, r1, r4, r3)
        L_0x029e:
            X.HsA r6 = new X.HsA
            r6.<init>(r0)
            return r6
        L_0x02a4:
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.JRA r0 = X.C56611I4l.A02(r5)
            X.GNY r4 = r0.AE2(r1)
            double r0 = (double) r2
            int r0 = X.C51972G9s.A0B(r6, r0)
            float r3 = (float) r0
            java.lang.Object r0 = r4.A01
            X.XRa r0 = (X.C21255XRa) r0
            int r2 = X.C56611I4l.A01(r0, r5)
            float r0 = r4.A00
            double r0 = (double) r0
            int r0 = X.C51972G9s.A0B(r6, r0)
            float r1 = (float) r0
            X.HHJ r0 = new X.HHJ
            r0.<init>(r3, r2, r1)
            goto L_0x029e
        L_0x02ca:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02cf:
            java.lang.Object r0 = r15.A02
            X.Gv1 r0 = (X.C53834Gv1) r0
            java.lang.Object r5 = r15.A01
            X.3Y5 r5 = (X.AnonymousClass3Y5) r5
            boolean r4 = r0.A03
            int r3 = r0.A01
            long r1 = r0.A02
            int r0 = r0.A00
            android.graphics.drawable.Drawable r6 = X.C244013aV.A0D(r5, r0)
            if (r4 == 0) goto L_0x02ee
            android.graphics.drawable.Drawable r6 = r6.mutate()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            X.C51969G9p.A12(r0, r6, r3)
        L_0x02ee:
            X.0qQ.A0A(r6)
            int r1 = X.C51969G9p.A07(r5, r1)
            r0 = 0
            r6.setBounds(r0, r0, r1, r1)
            return r6
        L_0x02fa:
            java.lang.Object r0 = r15.A02
            X.GvX r0 = (X.C53866GvX) r0
            X.GbJ r0 = r0.A00
            r0.A00()
            java.lang.CharSequence r0 = r0.A00()
            boolean r0 = X.00l.A0W(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0310:
            java.lang.Object r0 = r15.A02
            X.GvX r0 = (X.C53866GvX) r0
            X.GbJ r0 = r0.A00
            r0.A00()
            r1 = 1
            java.lang.CharSequence r0 = r0.A00()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0574
            r1 = 0
            goto L_0x0574
        L_0x0327:
            java.lang.Object r0 = r15.A02
            X.GvX r0 = (X.C53866GvX) r0
            X.GbJ r1 = r0.A00
            java.lang.Object r0 = r15.A01
            X.2Wa r0 = (X.2Wa) r0
            X.Icg r6 = new X.Icg
            r6.<init>(r0, r1)
            return r6
        L_0x0337:
            java.lang.Object r1 = r15.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 9
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            java.lang.String r0 = "xav_cds_switcher"
            X.0xG r2 = X.DbS.A0O(r0)
            java.lang.Object r3 = r15.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r0 = 564(0x234, float:7.9E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            java.lang.String r5 = "accounts_center_home"
            r6 = 0
            X.C49955FGk.A05(r1, r2, r3, r4, r5, r6)
            goto L_0x06c6
        L_0x035e:
            java.lang.Object r4 = r15.A01
            android.graphics.Canvas r4 = (android.graphics.Canvas) r4
            java.lang.Object r6 = r15.A02
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView r6 = (com.meta.metaai.components.animation.ui.view.ListeningIndicatorView) r6
            android.graphics.RadialGradient r0 = com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A0S
            float r3 = r6.A01
            float r2 = X.AnonymousClass7TE.A02(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r1 = X.AnonymousClass7TE.A03(r6)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.scale(r0, r3, r2, r1)
            android.graphics.Paint r1 = r6.A0A
            int r0 = r6.A05
            r1.setAlpha(r0)
            android.graphics.RectF r0 = r6.A0G
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            float r9 = r0.width()
            r1 = 1128792064(0x43480000, float:200.0)
            float r9 = r9 / r1
            float r0 = r0.height()
            float r0 = r0 / r1
            float r10 = r6.A02
            float r10 = r10 * r0
            android.graphics.RadialGradient r5 = com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A0R
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A00(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.RectF r0 = r6.A0F
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            float r9 = r0.width()
            float r9 = r9 / r1
            float r10 = r0.height()
            float r10 = r10 / r1
            float r0 = r6.A00
            float r10 = r10 * r0
            android.graphics.RadialGradient r5 = com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A0Q
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A00(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.RectF r0 = r6.A0H
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            float r9 = r0.width()
            float r9 = r9 / r1
            float r0 = r0.height()
            float r0 = r0 / r1
            float r10 = r6.A03
            float r10 = r10 * r0
            android.graphics.RadialGradient r5 = com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A0S
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A00(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.RectF r0 = r6.A0B
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            float r9 = r0.width()
            float r9 = r9 / r1
            float r10 = r0.height()
            float r10 = r10 / r1
            android.graphics.RadialGradient r5 = com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A0M
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A00(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.RectF r0 = r6.A0E
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            float r9 = r0.width()
            float r9 = r9 / r1
            float r10 = r0.height()
            float r10 = r10 / r1
            android.graphics.RadialGradient r5 = com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A0P
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A00(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.RectF r0 = r6.A0D
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            float r9 = r0.width()
            float r9 = r9 / r1
            float r10 = r0.height()
            float r10 = r10 / r1
            android.graphics.RadialGradient r5 = com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A0O
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A00(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.RectF r0 = r6.A0C
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            float r9 = r0.width()
            float r9 = r9 / r1
            float r10 = r0.height()
            float r10 = r10 / r1
            android.graphics.RadialGradient r5 = com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A0N
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A00(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x06c6
        L_0x043d:
            java.lang.Object r5 = r15.A01
            android.graphics.Canvas r5 = (android.graphics.Canvas) r5
            java.lang.Object r6 = r15.A02
            com.meta.metaai.components.animation.ui.view.SpeechIndicatorView r6 = (com.meta.metaai.components.animation.ui.view.SpeechIndicatorView) r6
            int[] r0 = com.meta.metaai.components.animation.ui.view.SpeechIndicatorView.A0b
            float r0 = r6.A08
            r4 = 0
            r5.rotate(r0, r4, r4)
            android.graphics.Paint r3 = r6.A0R
            X.I1w r0 = r6.A0D
            float r1 = r0.A05
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.setAlpha(r0)
            float r1 = r6.A07
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            float r1 = r1 * r0
            float r1 = java.lang.Math.max(r1, r4)
            android.graphics.Matrix r2 = r6.A0Q
            r0 = 1075000115(0x40133333, float:2.3)
            float r1 = r1 + r0
            r2.setScale(r1, r1, r4, r4)
            float r1 = r6.A04
            r0 = -1035468800(0xffffffffc2480000, float:-50.0)
            float r1 = r1 + r0
            r2.preTranslate(r1, r0)
            android.graphics.LinearGradient r0 = r6.A0A
            if (r0 == 0) goto L_0x047c
            r0.setLocalMatrix(r2)
        L_0x047c:
            r0 = 1112014848(0x42480000, float:50.0)
            r5.drawCircle(r4, r4, r0, r3)
            goto L_0x06c6
        L_0x0483:
            java.lang.Object r5 = r15.A02
            com.meta.metaai.components.animation.ui.view.SpeechIndicatorView r5 = (com.meta.metaai.components.animation.ui.view.SpeechIndicatorView) r5
            int[] r0 = com.meta.metaai.components.animation.ui.view.SpeechIndicatorView.A0b
            android.graphics.Paint r4 = r5.A0R
            android.graphics.RadialGradient r0 = r5.A0B
            r4.setShader(r0)
            java.lang.Object r3 = r15.A01
            android.graphics.Canvas r3 = (android.graphics.Canvas) r3
            r2 = 0
            r1 = 1112014848(0x42480000, float:50.0)
            r3.drawCircle(r2, r2, r1, r4)
            android.graphics.RadialGradient r0 = r5.A0C
            r4.setShader(r0)
            r3.drawCircle(r2, r2, r1, r4)
            goto L_0x06c6
        L_0x04a4:
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5 = 0
            X.2WX r2 = X.G9t.A12(r1, r0, r5)
            java.lang.Object r1 = r15.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            r0 = 2131966397(0x7f1339bd, float:1.956963E38)
            java.lang.String r4 = X.C244013aV.A0E(r1, r0)
            r3 = 32
            java.lang.Object r1 = r15.A02
            X.GwH r1 = (X.C53911GwH) r1
            float[] r0 = X.C53911GwH.A0L
            int r0 = r1.A03
            int r0 = r0 + 1
            java.lang.String r1 = X.002.A0G(r4, r3, r0)
            if (r1 == 0) goto L_0x04d6
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.2WX r2 = X.C51971G9r.A0Y(r2, r0, r1, r5)
        L_0x04d6:
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.9JS r0 = X.C51965G9l.A0d(r1, r0, r5)
            X.2WX r6 = X.C51965G9l.A0X(r2, r0)
            return r6
        L_0x04e6:
            java.lang.Object r4 = r15.A01
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3 = 1120403456(0x42c80000, float:100.0)
            r2 = 0
            X.2WX r1 = X.G9t.A11(r0, r3, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.2WX r1 = X.C51971G9r.A0X(r1, r0, r3, r2)
            java.lang.Object r2 = r15.A02
            X.Gsp r2 = (X.C53698Gsp) r2
            X.2WX r0 = r2.A00
            X.2WX r1 = r1.A00(r0)
            r0 = 34
            X.JFy r0 = X.C59346JFy.A00(r2, r0)
            X.Gxc r6 = X.HSK.A00(r4, r1, r0)
            return r6
        L_0x0510:
            java.lang.Object r0 = r15.A02
            X.HIr r0 = (X.C54556HIr) r0
            X.0sP r3 = r0.A0I
            java.lang.Object r0 = r15.A01
            X.HQ3 r0 = (X.HQ3) r0
            X.HIF r0 = (X.HIF) r0
            X.HsD r0 = r0.A00
            if (r0 == 0) goto L_0x0527
            X.HIm r4 = new X.HIm
            r4.<init>(r0)
            goto L_0x066e
        L_0x0527:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x052c:
            java.lang.Object r2 = r15.A02
            X.HIr r2 = (X.C54556HIr) r2
            androidx.fragment.app.Fragment r0 = X.C56604I4d.A09(r2)
            android.app.Application r7 = X.DbY.A05(r0)
            com.meta.foa.session.FoaUserSession r8 = r2.A01
            java.lang.Object r11 = r15.A01
            X.HLw r11 = (X.C54639HLw) r11
            X.Htc r1 = r2.A0D
            X.Nky r0 = r1.A02
            java.lang.String r12 = r0.toString()
            X.Hsf r10 = r1.A05
            X.I1s r9 = r2.A09
            X.0Tu r2 = X.0Tu.A05
            r0 = 2324156539310455607(0x2041100f00003b37, double:2.545192916104496E-153)
            boolean r13 = X.1AW.A06(r2, r0)
            r14 = 0
            X.IHO r6 = new X.IHO
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r6
        L_0x055c:
            java.lang.Object r3 = r15.A02
            X.HIr r3 = (X.C54556HIr) r3
            X.GgP r2 = r3.A01
            if (r2 != 0) goto L_0x056c
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x056c:
            java.lang.Object r0 = r15.A01
            r1 = 1
            if (r0 != 0) goto L_0x0579
            r2.A0E()
        L_0x0574:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        L_0x0579:
            X.G4Q r0 = X.G4Q.A00
            r3.A0H(r0)
            goto L_0x0574
        L_0x057f:
            java.lang.Object r3 = r15.A02
            X.Gv3 r3 = (X.C53836Gv3) r3
            X.Hss r0 = r3.A00
            if (r0 == 0) goto L_0x06c6
            X.HtY r2 = r0.A02
            java.lang.Object r1 = r15.A01
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0596
            X.0sL r0 = r3.A02
            r0.invoke(r2, r1)
            goto L_0x06c6
        L_0x0596:
            X.0sP r3 = r3.A01
            X.HHo r4 = new X.HHo
            r4.<init>(r2)
            goto L_0x066e
        L_0x059f:
            java.lang.Object r0 = r15.A02
            X.Gv3 r0 = (X.C53836Gv3) r0
            X.Hss r5 = r0.A00
            if (r5 == 0) goto L_0x05cd
            java.lang.Object r4 = r15.A01
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            X.0sP r3 = r0.A01
            X.HtY r0 = r5.A02
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            boolean r2 = X.AnonymousClass7TF.A1W(r1, r0)
            int r1 = r5.A00
            X.HHt r0 = new X.HHt
            r0.<init>(r2, r1)
            r3.invoke(r0)
            android.content.res.Resources r1 = X.C51969G9p.A0M(r4)
            android.graphics.Bitmap r0 = r5.A01
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r1, r0)
            return r6
        L_0x05cd:
            r6 = 0
            return r6
        L_0x05cf:
            java.lang.Object r2 = r15.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            r0 = 4629700416936869888(0x4040000000000000, double:32.0)
            int r1 = X.C51972G9s.A0B(r2, r0)
            android.content.Context r0 = X.C243803a8.A00(r2)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r0)
            int r3 = r0.widthPixels
            int r3 = r3 - r1
            java.lang.Object r2 = r15.A02
            X.GwM r2 = (X.C53916GwM) r2
            X.HLk r1 = r2.A03
            X.HLk r0 = X.C54627HLk.HScroll
            if (r1 != r0) goto L_0x0603
            X.HMY r1 = r2.A04
            X.HMY r0 = X.HMY.SQUARE
            if (r1 != r0) goto L_0x0603
            X.3XV r0 = X.2WX.A02
            long r3 = X.C51969G9p.A0G(r3)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r1 = 0
            r0 = 0
            X.2WX r6 = X.AnonymousClass9JR.A00(r1, r2, r0, r3)
            return r6
        L_0x0603:
            X.3XV r6 = X.2WX.A02
            return r6
        L_0x0606:
            java.lang.Object r3 = r15.A01
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r15.A02
            X.HtY r0 = (X.C56146HtY) r0
            java.lang.String r1 = r0.A07
            java.lang.String r0 = r0.A08
            X.HHw r4 = new X.HHw
            r4.<init>(r1, r0)
            goto L_0x066e
        L_0x0618:
            java.lang.Object r3 = r15.A02
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r1 = r15.A01
            X.Hsu r1 = (X.C56107Hsu) r1
            r0 = 0
            X.HHu r4 = new X.HHu
            r4.<init>(r1, r0)
            goto L_0x066e
        L_0x0627:
            java.lang.Object r3 = r15.A01
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r15.A02
            X.HtY r0 = (X.C56146HtY) r0
            X.HHj r4 = new X.HHj
            r4.<init>(r0)
            goto L_0x066e
        L_0x0635:
            java.lang.Object r4 = r15.A02
            X.Gw8 r4 = (X.C53902Gw8) r4
            X.GbJ r0 = r4.A00
            java.lang.CharSequence r3 = r0.A00()
            java.lang.String r0 = r3.toString()
            X.I1q r2 = r4.A01
            java.lang.String r1 = r2.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0678
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x0678
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)
        L_0x0655:
            java.lang.Object r2 = r0.A00
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r1 = r0.A01
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.C51966G9m.A1X(r2)
            X.0sP r3 = r4.A04
            if (r0 == 0) goto L_0x0672
            java.lang.Object r0 = r15.A01
            X.I1t r0 = (X.C56565I1t) r0
            X.HHx r4 = new X.HHx
            r4.<init>(r0, r2, r1)
        L_0x066e:
            r3.invoke(r4)
            goto L_0x06c6
        L_0x0672:
            X.HHv r4 = new X.HHv
            r4.<init>(r1, r2)
            goto L_0x066e
        L_0x0678:
            java.lang.CharSequence r1 = X.00l.A0B(r3)
            r0 = 0
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            goto L_0x0655
        L_0x0682:
            java.lang.Object r1 = r15.A02
            X.Gw8 r1 = (X.C53902Gw8) r1
            X.GbJ r0 = r1.A00
            java.lang.CharSequence r4 = r0.A00()
            java.lang.Object r3 = r15.A01
            X.0r1 r3 = (X.0r1) r3
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x069f
            X.0sP r2 = r1.A04
            r1 = 0
            X.HHv r0 = new X.HHv
            r0.<init>(r1, r4)
            r2.invoke(r0)
        L_0x069f:
            r0 = 1
            r3.A00 = r0
            goto L_0x06c6
        L_0x06a3:
            java.lang.Object r0 = r15.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r15.A02
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
            r0.dismiss()
            goto L_0x06c6
        L_0x06b0:
            java.lang.Object r0 = r15.A02
            X.GuQ r0 = (X.C53797GuQ) r0
            X.GgI r3 = r0.A00
            java.lang.Object r0 = r15.A01
            X.HtY r0 = (X.C56146HtY) r0
            java.lang.String r2 = r0.A07
            java.lang.String r1 = r0.A08
            X.HHw r0 = new X.HHw
            r0.<init>(r2, r1)
            r3.A0E(r0)
        L_0x06c6:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58687Ivw.invoke():java.lang.Object");
    }
}
