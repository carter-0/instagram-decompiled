package X;

/* renamed from: X.J6m  reason: case insensitive filesystem */
public final class C59104J6m extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59104J6m(C286025Tq r2, C53556GqS gqS, 0sP r4, int i) {
        super(1);
        this.A00 = i;
        if (29 - i != 0) {
            this.A03 = r2;
            this.A01 = r4;
            this.A02 = gqS;
        } else {
            this.A01 = r2;
            this.A02 = r4;
            this.A03 = gqS;
        }
    }

    public static C59104J6m A00(C286575Wy r1, Object obj, Object obj2, Object obj3, int i) {
        C59104J6m j6m = new C59104J6m(i, obj, obj2, obj3);
        r1.FLL(j6m);
        return j6m;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x04bf, code lost:
        r5 = ((X.AnonymousClass30M) r3.A00).A00;
        r7 = ((X.AnonymousClass30M) r3.A01).A00;
        r4 = X.C51966G9m.A10(r2).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x04d1, code lost:
        X.0qQ.A0B(r4, 2);
        r2.Epw(new X.C53270GlI(r4, r5, r7));
        r1 = (X.C53560GqW) r0.A03;
        r7 = (X.C284945Oz) r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x04ef, code lost:
        if (r1.A01 != X.C51966G9m.A10(r2).A01) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x04fb, code lost:
        if (r1.A00 != X.C51966G9m.A10(r2).A00) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x04fd, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x050a, code lost:
        if (X.0qQ.A0K(r1.A07, X.C51966G9m.A10(r2).A02) != false) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x050c, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x050d, code lost:
        X.C51967G9n.A16(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x052a, code lost:
        r1.invoke(((X.C53556GqS) r0).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x05e0, code lost:
        r2.A01(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x074e, code lost:
        r0.A05(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x07db, code lost:
        r2 = 150;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x07de, code lost:
        r2 = 64;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x07e4, code lost:
        if (r12.length() <= r2) goto L_0x07f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x07e6, code lost:
        ((android.view.View) X.C51966G9m.A18(r0.A03)).performHapticFeedback(17, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x07f5, code lost:
        r0 = r0.A01;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0858, code lost:
        X.C51965G9l.A1W(r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x089c, code lost:
        X.AnonymousClass7TE.A1Z(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x09e3, code lost:
        r3.post(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r12 = r25
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x09b6;
                case 1: goto L_0x0986;
                case 2: goto L_0x0951;
                case 3: goto L_0x08a1;
                case 4: goto L_0x086e;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x0009;
                case 8: goto L_0x085d;
                case 9: goto L_0x0009;
                case 10: goto L_0x0009;
                case 11: goto L_0x085d;
                case 12: goto L_0x0836;
                case 13: goto L_0x0830;
                case 14: goto L_0x07f8;
                case 15: goto L_0x07c3;
                case 16: goto L_0x0794;
                case 17: goto L_0x077c;
                case 18: goto L_0x0753;
                case 19: goto L_0x06af;
                case 20: goto L_0x0b85;
                case 21: goto L_0x0680;
                case 22: goto L_0x0660;
                case 23: goto L_0x05e5;
                case 24: goto L_0x05c4;
                case 25: goto L_0x0590;
                case 26: goto L_0x054f;
                case 27: goto L_0x0533;
                case 28: goto L_0x0b04;
                case 29: goto L_0x0512;
                case 30: goto L_0x04aa;
                case 31: goto L_0x0494;
                case 32: goto L_0x046a;
                case 33: goto L_0x0450;
                case 34: goto L_0x042d;
                case 35: goto L_0x09e8;
                case 36: goto L_0x03e6;
                case 37: goto L_0x03b6;
                case 38: goto L_0x0313;
                case 39: goto L_0x02f5;
                case 40: goto L_0x02c9;
                case 41: goto L_0x028e;
                case 42: goto L_0x0244;
                case 43: goto L_0x01d6;
                case 44: goto L_0x01c1;
                case 45: goto L_0x00e9;
                case 46: goto L_0x00cd;
                case 47: goto L_0x0071;
                case 48: goto L_0x002f;
                case 49: goto L_0x001c;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r3 = r0.A03
            X.0sJ r3 = (X.0sJ) r3
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A02
            r0 = 0
            r3.invoke(r2, r12, r0, r1)
        L_0x0019:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x001c:
            java.lang.Object r2 = r0.A03
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r0.A01
            java.lang.Object r1 = X.C51966G9m.A17(r1)
            r2.invoke(r1)
            java.lang.Object r0 = r0.A02
            X.DbS.A1U(r0)
            goto L_0x0019
        L_0x002f:
            int r2 = X.AnonymousClass7TE.A0M(r12)
            r1 = 3
            java.lang.Object r6 = r0.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            if (r2 < r1) goto L_0x0065
            X.8ab r5 = X.DbW.A0U(r6)
            r1 = 2131969470(0x7f1345be, float:1.9575864E38)
            r5.A09(r1)
            r1 = 2131969469(0x7f1345bd, float:1.9575862E38)
            r5.A08(r1)
            r4 = 2131956481(0x7f131301, float:1.9549519E38)
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r0.A02
            r1 = 5
            X.I8H r0 = new X.I8H
            r0.<init>(r1, r6, r3, r2)
            r5.A0I(r0, r4)
            r0 = 1
            r5.A0r(r0)
            r5.A05()
            X.DbT.A1V(r5)
            goto L_0x0019
        L_0x0065:
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            X.C55087Hbw.A00(r6, r1, r0)
            goto L_0x0019
        L_0x0071:
            java.util.Date r12 = (java.util.Date) r12
            if (r12 == 0) goto L_0x0019
            java.lang.Object r2 = r0.A03
            X.GiF r2 = (X.C53081GiF) r2
            X.0eM r1 = r2.A0C
            java.lang.Object r3 = r1.getValue()
            X.LPH r3 = (X.LPH) r3
            X.JVg r1 = X.C59722JVg.DRAFT_FOLDER
            r3.A01(r1)
            java.lang.Object r7 = r0.A01
            X.5kq r7 = (X.C293505kq) r7
            java.lang.Object r10 = r0.A02
            X.3Q2 r10 = (X.AnonymousClass3Q2) r10
            android.content.Context r0 = r2.A04
            X.GcX r3 = new X.GcX
            r3.<init>(r0)
            r0 = 0
            r3.setCancelable(r0)
            X.AnonymousClass0fN.A00(r3)
            r5 = 0
            r13 = 1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r12.getTime()
            long r0 = r4.toSeconds(r0)
            int r4 = (int) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            X.JxB r0 = new X.JxB
            r0.<init>(r1, r5)
            r10.A0v = r0
            android.app.Activity r4 = r2.A03
            com.instagram.common.session.UserSession r6 = r2.A07
            boolean r12 = r7.A17
            com.instagram.api.schemas.MediaCroppingCoordinates r5 = r7.A06
            X.IQJ r9 = new X.IQJ
            r9.<init>()
            X.IQI r8 = new X.IQI
            r8.<init>(r3, r7, r10, r2)
            java.lang.String r11 = r10.A2Z
            X.LRt.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0019
        L_0x00cd:
            X.GO1 r12 = (X.GO1) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r3 = r0.A02
            X.GjN r3 = (X.C53151GjN) r3
            java.lang.Object r2 = r0.A01
            X.8vc r2 = (X.C369968vc) r2
            java.lang.Object r1 = r0.A03
            X.GiF r1 = (X.C53081GiF) r1
            X.IjD r0 = new X.IjD
            r0.<init>(r2, r12, r3, r1)
            X.11Z.A02(r0)
            goto L_0x0019
        L_0x00e9:
            java.lang.Object r2 = r0.A02
            X.2Wa r2 = (X.2Wa) r2
            java.lang.Object r1 = r2.A03
            java.lang.Object r4 = r0.A01
            com.instagram.api.schemas.AudioFilterType r4 = (com.instagram.api.schemas.AudioFilterType) r4
            if (r1 == r4) goto L_0x0019
            r2.A01(r4)
            java.lang.Object r0 = r0.A03
            X.Gt2 r0 = (X.C53711Gt2) r0
            X.HjZ r1 = r0.A01
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.IO9 r3 = r1.A00
            X.Ghc r6 = r3.A0X
            X.GVW r0 = X.C53044Ghc.A00(r6)
            r8 = 0
            if (r0 == 0) goto L_0x01be
            X.46i r0 = r0.A03
            if (r0 == 0) goto L_0x01be
            com.instagram.music.common.model.AudioType r0 = r0.Adv()
        L_0x0115:
            X.HOL r12 = X.C55059HbU.A00(r0)
            com.instagram.common.session.UserSession r5 = r3.A0R
            X.GVT r7 = r3.A0V
            X.HOu r2 = X.C54689HOu.A0X
            X.6sU r9 = r3.A0Q
            java.lang.String r0 = r3.A0b
            r16 = r0
            java.lang.String r13 = r3.A0a
            long r0 = r3.A0M
            java.lang.String r15 = r3.A0c
            X.8IJ r11 = X.C263304Kd.A02(r4)
            r10 = 9
            X.0wc r14 = X.C51967G9n.A0Z(r7, r5, r11, r10)
            java.lang.String r10 = "instagram_organic_audio_page_audio_filter_tap"
            X.0Aj r10 = X.AnonymousClass7TE.A0e(r14, r10)
            boolean r14 = r10.isSampled()
            if (r14 == 0) goto L_0x0193
            java.lang.String r14 = "audio_page"
            X.C51973G9u.A12(r10, r14, r0)
            if (r15 != 0) goto L_0x014a
            java.lang.String r15 = ""
        L_0x014a:
            X.C51965G9l.A1N(r10, r15)
            java.lang.Long r0 = X.C51972G9s.A0j(r16)
            X.C51965G9l.A1E(r10, r0)
            java.lang.Long r0 = X.C51972G9s.A0j(r13)
            X.C51965G9l.A1H(r10, r0)
            java.lang.String r0 = "audio_type"
            r10.A8M(r12, r0)
            X.C51973G9u.A11(r10, r9)
            java.lang.Long r1 = X.C51972G9s.A0i(r13)
            java.lang.String r0 = "audio_owner_id"
            r10.A9F(r0, r1)
            X.C51965G9l.A1C(r2, r10)
            r12 = 0
            X.80P[] r13 = X.AnonymousClass80P.values()
            r9 = 0
            int r2 = r13.length
        L_0x0176:
            if (r9 >= r2) goto L_0x018b
            r14 = r13[r9]
            java.lang.String r1 = r14.name()
            com.instagram.api.schemas.AudioFilterType r0 = r11.A04
            java.lang.String r0 = r0.name()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bb
            r12 = r14
        L_0x018b:
            java.lang.String r0 = "filter_type"
            r10.A8M(r12, r0)
            r10.Cgf()
        L_0x0193:
            com.instagram.api.schemas.AudioFilterType r2 = com.instagram.api.schemas.AudioFilterType.UNRECOGNIZED
            if (r4 == r2) goto L_0x0198
            r8 = r4
        L_0x0198:
            r6.A01 = r8
            android.content.Context r7 = r7.getContext()
            int r0 = r3.A0L
            r11 = 1
            r8 = r4
            r9 = r5
            r10 = r0
            r6.A02(r7, r8, r9, r10, r11)
            boolean r0 = r3.A0f
            if (r0 == 0) goto L_0x01b2
            X.Gh3 r1 = r3.A0U
            java.lang.String r0 = r3.A0d
            r1.A00(r4, r0)
        L_0x01b2:
            boolean r0 = X.C51969G9p.A1a(r4, r2)
            X.IO9.A00(r3, r0)
            goto L_0x0019
        L_0x01bb:
            int r9 = r9 + 1
            goto L_0x0176
        L_0x01be:
            r0 = r8
            goto L_0x0115
        L_0x01c1:
            X.2WE r3 = X.C51968G9o.A0f(r12)
            java.lang.Object r2 = r0.A02
            java.lang.Object r1 = r0.A01
            java.lang.Object r0 = r0.A03
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            X.JFh r0 = X.C59329JFh.A00
            r3.A02(r0, r1)
            goto L_0x0019
        L_0x01d6:
            X.IIT r12 = (X.IIT) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            r1 = 2131974906(0x7f135afa, float:1.958689E38)
            java.lang.String r18 = X.C244013aV.A0E(r12, r1)
            X.HLi r3 = X.C54625HLi.SHOW
            java.lang.Object r1 = r0.A02
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r2 = r1.A03
            X.HLi r2 = (X.C54625HLi) r2
            X.IcM r15 = X.Gw2.A00(r3, r2)
            java.lang.Object r1 = r0.A01
            r0 = 47
            X.Ivv r22 = X.C58686Ivv.A00(r1, r0)
            r14 = 0
            X.Gv9 r13 = new X.Gv9
            r16 = r14
            r17 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12.A00(r13)
            r0 = 2131974901(0x7f135af5, float:1.958688E38)
            java.lang.String r18 = X.C244013aV.A0E(r12, r0)
            X.HLi r0 = X.C54625HLi.HIDE
            X.IcM r15 = X.Gw2.A00(r0, r2)
            r0 = 48
            X.Ivv r22 = X.C58686Ivv.A00(r1, r0)
            X.Gv9 r13 = new X.Gv9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12.A00(r13)
            r0 = 2131974902(0x7f135af6, float:1.9586881E38)
            java.lang.String r18 = X.C244013aV.A0E(r12, r0)
            X.HLi r0 = X.C54625HLi.HIDE_FOR_30_DAYS
            X.IcM r15 = X.Gw2.A00(r0, r2)
            r0 = 49
            X.Ivv r22 = X.C58686Ivv.A00(r1, r0)
            X.Gv9 r13 = new X.Gv9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12.A00(r13)
            goto L_0x0019
        L_0x0244:
            X.4cl r12 = (X.C268104cl) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r1 = r0.A02
            X.4cc r1 = (X.C268014cc) r1
            boolean r2 = r1.CWf()
            java.lang.Object r3 = r0.A03
            X.Gel r3 = (X.C52911Gel) r3
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = r3.A01
            if (r2 == 0) goto L_0x0289
            X.Htm r2 = com.meta.compose.material.bottomsheet.AnchoredDraggableState.A01(r1)
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = r3.A01
            X.4gU r1 = r1.A08
            java.lang.Object r1 = r1.getValue()
            float r4 = r2.A00(r1)
        L_0x026a:
            X.6Gj r3 = r3.A00
            X.6Gj r1 = X.AnonymousClass6Gj.Horizontal
            r2 = 0
            if (r3 != r1) goto L_0x0272
            r2 = r4
        L_0x0272:
            X.6Gj r1 = X.AnonymousClass6Gj.Vertical
            if (r3 == r1) goto L_0x0277
            r4 = 0
        L_0x0277:
            java.lang.Object r3 = r0.A01
            X.4cY r3 = (X.C267974cY) r3
            int r2 = X.AnonymousClass1GB.A01(r2)
            int r1 = X.AnonymousClass1GB.A01(r4)
            r0 = 0
            r12.A05(r3, r0, r2, r1)
            goto L_0x0019
        L_0x0289:
            float r4 = r1.A03()
            goto L_0x026a
        L_0x028e:
            X.HlK r12 = (X.C55661HlK) r12
            java.lang.Integer r1 = r12.A01
            int r5 = X.AnonymousClass7TG.A0A(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            java.lang.Object r4 = r0.A03
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r3 = 2131820997(0x7f1101c5, float:1.9274725E38)
            java.lang.String r1 = X.DbY.A0d(r1, r5, r3)
            X.0qQ.A07(r1)
            r2.A0H(r1)
            java.lang.Integer r1 = r12.A00
            int r2 = X.AnonymousClass7TG.A0A(r1)
            java.lang.Object r1 = r0.A01
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            android.content.res.Resources r0 = X.DbV.A05(r4)
            java.lang.String r0 = X.DbY.A0d(r0, r2, r3)
            X.0qQ.A07(r0)
            r1.A0H(r0)
            goto L_0x0019
        L_0x02c9:
            X.Hme r12 = (X.C55743Hme) r12
            boolean r1 = r12.A02
            r3 = 1
            java.lang.Object r2 = r0.A01
            X.61u r2 = (X.C3021461u) r2
            if (r1 == 0) goto L_0x02f0
            r2.setPrimaryActionIsLoading(r3)
        L_0x02d7:
            java.lang.Object r1 = r12.A01
            X.Uvw r1 = (X.C16500Uvw) r1
            int r2 = r1.ordinal()
            if (r2 == r3) goto L_0x02ed
            r1 = 0
            if (r2 != r1) goto L_0x0bba
            java.lang.Object r0 = r0.A02
        L_0x02e6:
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r3)
            goto L_0x0019
        L_0x02ed:
            java.lang.Object r0 = r0.A03
            goto L_0x02e6
        L_0x02f0:
            r1 = 0
            r2.setPrimaryActionIsLoading(r1)
            goto L_0x02d7
        L_0x02f5:
            X.LEz r12 = (X.C63953LEz) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r1 = r0.A03
            X.Kkc r1 = (X.C62676Kkc) r1
            r12.A00(r1)
            java.lang.Object r1 = r0.A01
            X.M0V r1 = (X.M0V) r1
            long r1 = r1.A03
            r12.A00 = r1
            java.lang.Object r0 = r0.A02
            java.util.Map r0 = (java.util.Map) r0
            r12.A01(r0)
            goto L_0x0019
        L_0x0313:
            X.Hmb r12 = (X.C55740Hmb) r12
            java.lang.Object r2 = r0.A03
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r12.A02
            r3 = 0
            int r1 = X.DbW.A01(r1)
            r2.setVisibility(r1)
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r12.A01
            if (r1 != 0) goto L_0x032d
            r3 = 8
        L_0x032d:
            r2.setVisibility(r3)
            java.lang.Object r5 = r0.A01
            X.L7L r5 = (X.L7L) r5
            java.util.List r7 = r12.A00
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r7.iterator()
        L_0x033e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x035b
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.user.model.UpcomingEvent r1 = (com.instagram.user.model.UpcomingEvent) r1
            boolean r0 = X.C18810W3l.A0B(r1)
            if (r0 == 0) goto L_0x033e
            boolean r0 = X.C18810W3l.A0A(r1)
            if (r0 == 0) goto L_0x033e
            r4.add(r2)
            goto L_0x033e
        L_0x035b:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r7.iterator()
        L_0x0363:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x038e
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.instagram.user.model.UpcomingEvent r2 = (com.instagram.user.model.UpcomingEvent) r2
            boolean r0 = X.C18810W3l.A0B(r2)
            if (r0 == 0) goto L_0x0363
            boolean r0 = X.C18810W3l.A0A(r2)
            if (r0 != 0) goto L_0x0363
            r0 = 0
            X.0qQ.A0B(r2, r0)
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.C18810W3l.A0D(r2, r0)
            if (r0 != 0) goto L_0x0363
            r6.add(r3)
            goto L_0x0363
        L_0x038e:
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r4.<init>()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x03b2
            java.util.Iterator r2 = r6.iterator()
        L_0x039d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03b2
            java.lang.Object r1 = r2.next()
            com.instagram.user.model.UpcomingEvent r1 = (com.instagram.user.model.UpcomingEvent) r1
            X.Lhm r0 = new X.Lhm
            r0.<init>(r1)
            r4.A00(r0)
            goto L_0x039d
        L_0x03b2:
            X.2t9 r0 = r5.A01
            goto L_0x074e
        L_0x03b6:
            X.Jvk r12 = (X.C61046Jvk) r12
            java.lang.Object r1 = r0.A02
            X.Jhw r1 = (X.C60239Jhw) r1
            X.2Fk r1 = r1.A00
            java.lang.Object r3 = r1.A02()
            X.Jue r3 = (X.C60982Jue) r3
            if (r3 == 0) goto L_0x0019
            java.lang.Object r2 = r0.A03
            X.LjG r2 = (X.C64854LjG) r2
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.widget.TextView r2 = r2.A08
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x03db
            java.lang.String r0 = r12.A00
        L_0x03d6:
            r2.setText(r0)
            goto L_0x0019
        L_0x03db:
            android.content.Context r1 = r1.requireContext()
            int r0 = r3.A01
            java.lang.String r0 = r1.getString(r0)
            goto L_0x03d6
        L_0x03e6:
            java.io.File r12 = (java.io.File) r12
            if (r12 == 0) goto L_0x0019
            java.lang.Object r1 = r0.A03     // Catch:{ IOException -> 0x03ff }
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ IOException -> 0x03ff }
            X.8gQ r3 = X.C361538gO.A00(r1)     // Catch:{ IOException -> 0x03ff }
            java.lang.Object r2 = r0.A02     // Catch:{ IOException -> 0x03ff }
            com.instagram.common.gallery.RemoteMedia r2 = (com.instagram.common.gallery.RemoteMedia) r2     // Catch:{ IOException -> 0x03ff }
            com.instagram.common.gallery.Medium r1 = X.C361558gQ.A00(r2, r12)     // Catch:{ IOException -> 0x03ff }
            r3.A02(r1, r2)     // Catch:{ IOException -> 0x03ff }
            goto L_0x0019
        L_0x03ff:
            r2 = move-exception
            java.lang.Object r5 = r0.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r1 = "MediaPickerRemoteMediaFetcher"
            X.0xG r4 = X.DbS.A0O(r1)
            java.lang.Object r3 = r0.A02
            com.instagram.common.gallery.RemoteMedia r3 = (com.instagram.common.gallery.RemoteMedia) r3
            java.lang.String r2 = r2.getMessage()
            java.lang.String r1 = "direct"
            X.AnonymousClass9PQ.A03(r4, r3, r5, r1, r2)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            r1 = 2131962943(0x7f132c3f, float:1.9562625E38)
            r0 = 3181(0xc6d, float:4.458E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C59689JTv.A01(r3, r0, r1, r2)
            goto L_0x0019
        L_0x042d:
            X.VYk r12 = (X.C17506VYk) r12
            java.lang.Object r4 = r0.A03
            X.WQm r4 = (X.C19231WQm) r4
            com.instagram.common.session.UserSession r3 = r4.A02
            java.lang.Object r2 = r0.A02
            X.VZn r2 = (X.C17534VZn) r2
            X.0qQ.A0A(r12)
            X.4DU r1 = r4.A03
            X.VGO.A00(r1, r3, r4, r2, r12)
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            android.view.View r0 = r2.A00
            int r0 = r0.getVisibility()
            r1.setVisibility(r0)
            goto L_0x0019
        L_0x0450:
            int r2 = X.AnonymousClass7TE.A0M(r12)
            java.lang.Object r1 = r0.A03
            X.5Tq r1 = (X.C286025Tq) r1
            java.util.List r1 = r1.A03(r2, r2)
            java.lang.Object r1 = X.00k.A0J(r1)
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
            goto L_0x052a
        L_0x046a:
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r2 = r0.A02
            X.5Oz r2 = (X.C284945Oz) r2
            X.0eM r1 = X.I6Z.A00
            X.GlI r1 = X.C51966G9m.A10(r2)
            X.YCQ r1 = r1.A02
            java.util.Set r3 = X.00k.A0j(r1)
            boolean r1 = r3.remove(r12)
            if (r1 != 0) goto L_0x0487
            r3.add(r12)
        L_0x0487:
            X.GlI r1 = X.C51966G9m.A10(r2)
            X.YCQ r4 = X.AnonymousClass62Q.A02(r3)
            long r5 = r1.A01
            long r7 = r1.A00
            goto L_0x04d1
        L_0x0494:
            X.30M r12 = (X.AnonymousClass30M) r12
            long r5 = r12.A00
            java.lang.Object r2 = r0.A02
            X.5Oz r2 = (X.C284945Oz) r2
            X.0eM r1 = X.I6Z.A00
            X.GlI r1 = X.C51966G9m.A10(r2)
            long r3 = r1.A01
            r1 = 1
            X.0eP r3 = X.I6Z.A01(r3, r5, r1)
            goto L_0x04bf
        L_0x04aa:
            X.30M r12 = (X.AnonymousClass30M) r12
            long r5 = r12.A00
            java.lang.Object r2 = r0.A02
            X.5Oz r2 = (X.C284945Oz) r2
            X.0eM r1 = X.I6Z.A00
            X.GlI r1 = X.C51966G9m.A10(r2)
            long r3 = r1.A00
            r1 = 0
            X.0eP r3 = X.I6Z.A01(r5, r3, r1)
        L_0x04bf:
            java.lang.Object r1 = r3.A00
            X.30M r1 = (X.AnonymousClass30M) r1
            long r5 = r1.A00
            java.lang.Object r1 = r3.A01
            X.30M r1 = (X.AnonymousClass30M) r1
            long r7 = r1.A00
            X.GlI r1 = X.C51966G9m.A10(r2)
            X.YCQ r4 = r1.A02
        L_0x04d1:
            r1 = 2
            X.0qQ.A0B(r4, r1)
            X.GlI r3 = new X.GlI
            r3.<init>(r4, r5, r7)
            r2.Epw(r3)
            java.lang.Object r1 = r0.A03
            X.GqW r1 = (X.C53560GqW) r1
            java.lang.Object r7 = r0.A01
            X.5Oz r7 = (X.C284945Oz) r7
            long r5 = r1.A01
            X.GlI r0 = X.C51966G9m.A10(r2)
            long r3 = r0.A01
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x050c
            long r5 = r1.A00
            X.GlI r0 = X.C51966G9m.A10(r2)
            long r3 = r0.A00
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x050c
            X.YCQ r1 = r1.A07
            X.GlI r0 = X.C51966G9m.A10(r2)
            X.YCQ r0 = r0.A02
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x050d
        L_0x050c:
            r0 = 1
        L_0x050d:
            X.C51967G9n.A16(r7, r0)
            goto L_0x0019
        L_0x0512:
            int r2 = X.AnonymousClass7TE.A0M(r12)
            java.lang.Object r1 = r0.A01
            X.5Tq r1 = (X.C286025Tq) r1
            java.util.List r1 = r1.A03(r2, r2)
            java.lang.Object r1 = X.00k.A0J(r1)
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A03
        L_0x052a:
            X.GqS r0 = (X.C53556GqS) r0
            java.lang.String r0 = r0.A01
            r1.invoke(r0)
            goto L_0x0019
        L_0x0533:
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            int r4 = r1.indexOf(r12)
            java.lang.Object r3 = r0.A03
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r0.A02
            r1 = 0
            r0 = 29
            X.MGb r5 = new X.MGb
            r5.<init>(r2, r1, r4, r0)
            goto L_0x089c
        L_0x054f:
            com.facebook.msys.mca.Mailbox r12 = (com.facebook.msys.mca.Mailbox) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            X.OVr r2 = X.C70996OVr.A03
            java.lang.String r1 = "engine_init_and_connect_msys_e2ee_mailbox_init_end"
            r2.A01(r1)
            java.lang.Object r6 = r0.A03
            X.Odx r6 = (X.C71143Odx) r6
            r6.A00 = r12
            com.instagram.common.session.UserSession r7 = r6.A0H
            java.lang.Object r5 = r0.A02
            X.1aD r5 = (X.1aD) r5
            X.1aS r3 = r5.A02
            r2 = 26
            X.Owd r1 = new X.Owd
            r1.<init>(r2)
            X.1aU r4 = r3.A0L(r1)
            X.68G r3 = r5.A04
            r2 = 0
            java.lang.String r1 = "RtcRsysInteractor"
            X.6AO r1 = X.AnonymousClass6AN.A00(r4, r7, r3, r2, r1)
            X.1aU r3 = r1.A00()
            java.lang.Object r2 = r0.A01
            r1 = 25
            X.J6m r0 = new X.J6m
            r0.<init>((int) r1, (java.lang.Object) r12, (java.lang.Object) r2, (java.lang.Object) r6)
            X.C71143Odx.A01(r3, r0)
            goto L_0x0019
        L_0x0590:
            X.OVr r2 = X.C70996OVr.A03
            java.lang.String r1 = "engine_init_and_connect_msys_e2ee_end"
            r2.A01(r1)
            java.lang.Object r7 = r0.A03
            X.Odx r7 = (X.C71143Odx) r7
            java.lang.Object r6 = r0.A02
            com.facebook.msys.mca.Mailbox r6 = (com.facebook.msys.mca.Mailbox) r6
            java.lang.Object r5 = r0.A01
            X.6E1 r4 = X.AnonymousClass6E0.A01
            com.instagram.common.session.UserSession r3 = r7.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330789054464787(0x8112a900004313, double:3.0390755181642575E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A01(r6, r3, r0)
            X.OVF r2 = r7.A0K
            r0 = 23
            X.J6m r10 = new X.J6m
            r10.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r5, (java.lang.Object) r7)
            r0 = 47
            X.MJ8 r1 = new X.MJ8
            r1.<init>(r0, r6, r7)
            goto L_0x05e0
        L_0x05c4:
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r13 = r0.A03
            X.Odx r13 = (X.C71143Odx) r13
            X.OVF r2 = r13.A0K
            java.lang.Object r15 = r0.A01
            java.lang.Object r14 = r0.A02
            r11 = 17
            X.IxF r10 = new X.IxF
            r10.<init>(r11, r12, r13, r14, r15)
            r0 = 8
            X.Wxb r1 = new X.Wxb
            r1.<init>(r0, r13, r12, r15)
        L_0x05e0:
            r2.A01(r1, r10)
            goto L_0x0019
        L_0x05e5:
            X.N4R r12 = (X.N4R) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r3 = r0.A03
            X.Odx r3 = (X.C71143Odx) r3
            java.lang.Object r2 = r0.A02
            com.facebook.msys.mca.Mailbox r2 = (com.facebook.msys.mca.Mailbox) r2
            java.lang.Object r4 = r0.A01
            X.0sP r4 = (X.0sP) r4
            com.facebook.msys.mca.Mailbox r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x0659
            X.OWb r6 = X.C71004OWb.A00
            java.lang.String r13 = "Mailbox has changed for: "
            com.instagram.common.session.UserSession r5 = r3.A0H
            java.lang.String r14 = r5.A06
            java.lang.String r15 = ", old: "
            com.facebook.msys.mca.Mailbox r0 = r3.A01
            int r17 = X.C51971G9r.A0E(r0)
            java.lang.String r16 = ", new: "
            int r18 = r2.hashCode()
            java.lang.String r0 = X.002.A0y(r13, r14, r15, r16, r17, r18)
            java.lang.String r11 = "RtcRsysInteractor"
            r6.A01(r11, r0)
            r0 = 1
            java.util.concurrent.CountDownLatch r10 = new java.util.concurrent.CountDownLatch
            r10.<init>(r0)
            java.lang.Object r7 = r12.A00
            X.OEP r7 = (X.OEP) r7
            X.Gy5 r9 = new X.Gy5
            r9.<init>(r10)
            com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClient r8 = r7.A00
            com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator r0 = r7.A02
            java.lang.String r1 = r0.getUserId()
            java.lang.String r0 = ""
            r8.unregisterUser(r1, r0, r9)
            r10.await()     // Catch:{ InterruptedException -> 0x063e }
            goto L_0x0644
        L_0x063e:
            r1 = move-exception
            java.lang.String r0 = "Exception while unregistering user from RTC Call Manager"
            r6.A02(r11, r0, r1)
        L_0x0644:
            X.6E1 r0 = X.AnonymousClass6E0.A01
            java.lang.Class<X.6E0> r0 = X.AnonymousClass6E0.class
            java.lang.Object r0 = r5.A00(r0)
            X.6E0 r0 = (X.AnonymousClass6E0) r0
            if (r0 == 0) goto L_0x065e
            com.facebook.rsys.crypto.gen.CryptoContextHolder r1 = r0.A00
        L_0x0652:
            com.instagram.rtc.rsys.proxies.IGRTCCallManager r0 = r7.A01
            r0.registerUser(r1)
            r3.A01 = r2
        L_0x0659:
            r4.invoke(r12)
            goto L_0x0019
        L_0x065e:
            r1 = 0
            goto L_0x0652
        L_0x0660:
            android.view.View r1 = X.C51969G9p.A0O(r12)
            java.lang.Object r3 = r0.A01
            X.2si r3 = (X.C231972si) r3
            java.lang.Object r2 = r1.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.quickpromotion.ui.megaphone.BloksMegaphoneViewBinder.BloksHolder"
            X.0qQ.A0C(r2, r1)
            X.3ru r2 = (X.C254083ru) r2
            java.lang.Object r1 = r0.A03
            X.2bv r1 = (X.2bv) r1
            java.lang.Object r0 = r0.A02
            X.4UC r0 = (X.AnonymousClass4UC) r0
            r3.ADo(r1, r0, r2)
            goto L_0x0019
        L_0x0680:
            X.5RU r2 = X.C51968G9o.A0S(r12)
            java.lang.Object r1 = r0.A02
            X.4gU r1 = (X.C270284gU) r1
            float r1 = X.C51971G9r.A03(r1)
            r2.Ej4(r1)
            r1 = 1094713344(0x41400000, float:12.0)
            float r1 = r2.F06(r1)
            r2.EQN(r1)
            java.lang.Object r1 = r0.A03
            X.GnU r1 = (X.C53397GnU) r1
            boolean r1 = r1.A0C
            if (r1 == 0) goto L_0x06a6
            r0 = 0
        L_0x06a1:
            r2.EpH(r0)
            goto L_0x0019
        L_0x06a6:
            java.lang.Object r0 = r0.A01
            X.4gU r0 = (X.C270284gU) r0
            float r0 = X.C51971G9r.A03(r0)
            goto L_0x06a1
        L_0x06af:
            java.util.List r12 = (java.util.List) r12
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r4.<init>()
            java.lang.Object r5 = r0.A03
            X.E3G r5 = (X.E3G) r5
            X.0qQ.A0A(r12)
            android.content.Context r7 = r5.requireContext()
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r6 = r5.A00
            com.instagram.user.model.User r1 = X.DbX.A0l(r1, r6)
            X.4Cl r1 = r1.A03
            X.5Cd r3 = r1.AZe()
            java.lang.Integer r1 = X.E3G.A01(r5, r12)
            r2 = 0
            if (r1 == 0) goto L_0x0712
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x0712
            if (r3 == 0) goto L_0x06ea
            java.lang.String r2 = r3.Azw()
            if (r2 == 0) goto L_0x06ea
            int r1 = r2.length()
            if (r1 != 0) goto L_0x06f1
        L_0x06ea:
            r1 = 2131966468(0x7f133a04, float:1.9569775E38)
            java.lang.String r2 = r7.getString(r1)
        L_0x06f1:
            X.FY4 r1 = new X.FY4
            r1.<init>(r2)
            r4.A00(r1)
            java.util.Iterator r3 = r12.iterator()
        L_0x06fd:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0732
            java.lang.Object r2 = r3.next()
            com.instagram.model.business.ProfileAddressData r2 = (com.instagram.model.business.ProfileAddressData) r2
            X.DtJ r1 = new X.DtJ
            r1.<init>(r2)
            r4.A00(r1)
            goto L_0x06fd
        L_0x0712:
            if (r3 == 0) goto L_0x0730
            java.lang.Integer r1 = r3.BPE()
            if (r1 == 0) goto L_0x0730
            int r3 = r1.intValue()
        L_0x071e:
            int r1 = r12.size()
            if (r1 < r3) goto L_0x06f1
            r2 = 2131966469(0x7f133a05, float:1.9569777E38)
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r3)
            java.lang.String r2 = r7.getString(r2, r1)
            goto L_0x06f1
        L_0x0730:
            r3 = 0
            goto L_0x071e
        L_0x0732:
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            android.text.SpannableStringBuilder r2 = X.C49074Eos.A00(r3, r5, r2, r1)
            if (r2 == 0) goto L_0x074a
            X.IOR r1 = new X.IOR
            r1.<init>(r2)
            r4.A00(r1)
        L_0x074a:
            java.lang.Object r0 = r0.A01
            X.2t9 r0 = (X.AnonymousClass2t9) r0
        L_0x074e:
            r0.A05(r4)
            goto L_0x0019
        L_0x0753:
            int r3 = X.AnonymousClass7TE.A0M(r12)
            java.lang.Object r2 = r0.A01
            X.5Tq r2 = (X.C286025Tq) r2
            java.lang.String r1 = "community_guidelines"
            X.62b r1 = X.C51975G9x.A0N(r2, r1, r3)
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r1.A02
            if (r1 == 0) goto L_0x0019
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A2g
            r0 = 78
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.Dbb.A0k(r3, r2, r1, r0)
            goto L_0x0019
        L_0x077c:
            java.lang.String r12 = (java.lang.String) r12
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r1 = r0.A02
            X.HLJ r1 = (X.HLJ) r1
            int r1 = r1.ordinal()
            r3 = 1
            if (r1 == r2) goto L_0x07de
            if (r1 == r3) goto L_0x07db
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0794:
            X.5ch r12 = (X.C288915ch) r12
            r3 = 0
            X.0qQ.A0B(r12, r3)
            boolean r1 = r12.CTr()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.A02
            X.HLJ r1 = (X.HLJ) r1
            int r2 = r1.ordinal()
            if (r2 == r3) goto L_0x07c0
            r1 = 1
            if (r2 != r1) goto L_0x0bbf
            java.lang.String r2 = "bio"
        L_0x07af:
            java.lang.Object r1 = r0.A03
            java.lang.Object r1 = X.C51966G9m.A18(r1)
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.C56640I5v.A04(r0, r1, r2)
            goto L_0x0019
        L_0x07c0:
            java.lang.String r2 = "name"
            goto L_0x07af
        L_0x07c3:
            java.lang.String r12 = (java.lang.String) r12
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r1 = r0.A02
            X.HLJ r1 = (X.HLJ) r1
            int r1 = r1.ordinal()
            r3 = 1
            if (r1 == r2) goto L_0x07de
            if (r1 == r3) goto L_0x07db
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07db:
            r2 = 150(0x96, float:2.1E-43)
            goto L_0x07e0
        L_0x07de:
            r2 = 64
        L_0x07e0:
            int r1 = r12.length()
            if (r1 <= r2) goto L_0x07f5
            java.lang.Object r0 = r0.A03
            java.lang.Object r1 = X.C51966G9m.A18(r0)
            android.view.View r1 = (android.view.View) r1
            r0 = 17
            r1.performHapticFeedback(r0, r3)
            goto L_0x0019
        L_0x07f5:
            java.lang.Object r0 = r0.A01
            goto L_0x0858
        L_0x07f8:
            X.5ch r12 = (X.C288915ch) r12
            r3 = 0
            X.0qQ.A0B(r12, r3)
            boolean r1 = r12.CTr()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.A02
            X.HLJ r1 = (X.HLJ) r1
            int r2 = r1.ordinal()
            if (r2 == r3) goto L_0x082d
            r1 = 1
            if (r2 != r1) goto L_0x0bc4
            java.lang.String r4 = "bio"
        L_0x0813:
            java.lang.Object r1 = r0.A03
            java.lang.Object r2 = X.C51966G9m.A18(r1)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A01
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.String r5 = "opal_self_profile"
            X.62O r0 = X.I7S.A00
            java.lang.String r6 = r2.A06
            java.lang.String r3 = "tap"
            r7 = 0
            X.C49049EoT.A00(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0019
        L_0x082d:
            java.lang.String r4 = "name"
            goto L_0x0813
        L_0x0830:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            goto L_0x0019
        L_0x0836:
            int r3 = X.AnonymousClass7TE.A0M(r12)
            java.lang.Object r2 = r0.A02
            X.5Tq r2 = (X.C286025Tq) r2
            java.lang.String r1 = "InlineLinkUrn"
            X.62b r1 = X.C51975G9x.A0N(r2, r1, r3)
            if (r1 == 0) goto L_0x0019
            java.lang.Object r3 = r1.A02
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0019
            X.3mC r2 = X.C250863mB.A03
            X.MfN r1 = X.C66928MfN.A00
            java.lang.Object r12 = r2.A00(r3, r1)
            if (r12 == 0) goto L_0x0019
            java.lang.Object r0 = r0.A03
        L_0x0858:
            X.C51965G9l.A1W(r0, r12)
            goto L_0x0019
        L_0x085d:
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.Object r2 = r0.A03
            X.0sK r2 = (X.0sK) r2
            java.lang.Object r1 = r0.A01
            java.lang.Object r0 = r0.A02
            r2.invoke(r12, r1, r0)
            goto L_0x0019
        L_0x086e:
            X.0tS r4 = X.DbT.A0h()
            X.0s0 r3 = r4.A37
            X.0YZ[] r2 = X.0tS.A4G
            r1 = 249(0xf9, float:3.49E-43)
            X.DbS.A1a(r4, r12, r3, r2, r1)
            java.lang.Object r8 = r0.A03
            java.lang.Object r7 = r0.A01
            java.lang.Object r6 = r0.A02
            X.12T r2 = X.AnonymousClass12T.A00
            X.AnonymousClass7TG.A1N(r8, r7)
            r1 = 3
            X.0qQ.A0B(r2, r1)
            r9 = 0
            r0 = 131255691(0x7d2cd8b, float:3.1718095E-34)
            X.0nV r0 = r2.CO6(r0, r1)
            X.19S r3 = X.19E.A02(r0)
            r10 = 5
            X.9KE r5 = new X.9KE
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x089c:
            X.AnonymousClass7TE.A1Z(r5, r3)
            goto L_0x0019
        L_0x08a1:
            X.EVR r12 = (X.EVR) r12
            r4 = 0
            X.0qQ.A0B(r12, r4)
            java.lang.Object r1 = r0.A02
            android.app.Dialog r1 = (android.app.Dialog) r1
            r1.dismiss()
            java.lang.Object r3 = r0.A03
            com.instagram.mainactivity.InstagramMainActivity r3 = (com.instagram.mainactivity.InstagramMainActivity) r3
            java.lang.Object r6 = r0.A01
            X.HOd r6 = (X.C54672HOd) r6
            int r1 = r12.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0929
            if (r1 == r4) goto L_0x090a
            r0 = 1
            if (r1 == r0) goto L_0x08ca
            r0 = 3
            if (r1 == r0) goto L_0x08ca
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08ca:
            r3.EU5()
            X.8ab r2 = X.DbS.A0X(r3)
            r0 = 2131954750(0x7f130c3e, float:1.9546008E38)
            r2.A09(r0)
            r0 = 2131962214(0x7f132966, float:1.9561147E38)
            r2.A08(r0)
            r1 = 2131961848(0x7f1327f8, float:1.9560404E38)
            r0 = 0
            r2.A0I(r0, r1)
            X.DbT.A1V(r2)
            com.instagram.common.session.UserSession r1 = r3.A05
            if (r1 == 0) goto L_0x0019
            X.INA r0 = new X.INA
            r0.<init>(r1)
            X.0wc r1 = X.INA.A02(r0, r6, r4)
            java.lang.String r0 = "ig_school_reliability_ineligible_dialog_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0019
            X.C51965G9l.A1B(r6, r1)
            X.HOp r0 = X.C54684HOp.RELIABILITY_PAGE_GENERAL
            X.C51974G9v.A0j(r0, r1)
            goto L_0x0019
        L_0x090a:
            X.1QK r0 = X.1QK.A0E
            r3.Eng(r0)
            com.instagram.common.session.UserSession r5 = r3.A05
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r6.A00
            r0 = 466(0x1d2, float:6.53E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r0, r1)
            r0 = 387(0x183, float:5.42E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0943
        L_0x0929:
            X.1QK r0 = X.1QK.A0E
            r3.Eng(r0)
            com.instagram.common.session.UserSession r5 = r3.A05
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r6.A00
            r0 = 466(0x1d2, float:6.53E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r0, r1)
            java.lang.String r0 = "school_tab"
        L_0x0943:
            X.6W8 r1 = X.DbS.A0b(r3, r2, r5, r4, r0)
            r0 = 1
            r1.A08 = r0
            r0 = 7002(0x1b5a, float:9.812E-42)
            r1.A0A(r3, r0)
            goto L_0x0019
        L_0x0951:
            X.2WE r5 = X.C51968G9o.A0f(r12)
            java.lang.Object r4 = r0.A03
            X.GxX r4 = (X.C53989GxX) r4
            int r1 = r4.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r4.A01
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r1}
            java.lang.Object r2 = r0.A02
            r1 = 35
            X.JG2 r0 = new X.JG2
            r0.<init>(r1, r2, r4)
            r5.A02(r0, r3)
            java.lang.Object[] r1 = X.C51966G9m.A1b()
            r0 = 2
            X.C59345JFx.A00(r5, r4, r1, r0)
            X.2V5 r1 = r4.A02
            r0 = 42
            X.JJR r0 = X.JJR.A00(r4, r0)
            X.C244463bE.A00(r1, r5, r0)
            goto L_0x0019
        L_0x0986:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            java.lang.Object r3 = r0.A01
            android.view.View r3 = (android.view.View) r3
            boolean r2 = r12.booleanValue()
            int r1 = X.DbW.A01(r2)
            r3.setVisibility(r1)
            if (r2 == 0) goto L_0x09ac
            java.lang.Object r1 = r0.A03
            X.UaD r1 = (X.C15306UaD) r1
            X.0eM r1 = r1.A08
            java.lang.Object r1 = r1.getValue()
            X.U8Z r1 = (X.U8Z) r1
            X.Vfp r2 = r1.A03
            java.lang.String r1 = r1.A06
            r2.A00(r1)
        L_0x09ac:
            java.lang.Object r0 = r0.A02
            android.view.View r0 = (android.view.View) r0
            X.IiP r1 = new X.IiP
            r1.<init>(r3, r0, r12)
            goto L_0x09e3
        L_0x09b6:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            java.lang.Object r3 = r0.A01
            android.view.View r3 = (android.view.View) r3
            boolean r2 = r12.booleanValue()
            int r1 = X.DbW.A01(r2)
            r3.setVisibility(r1)
            if (r2 == 0) goto L_0x09da
            java.lang.Object r1 = r0.A03
            X.UaG r1 = (X.C15309UaG) r1
            X.U8d r1 = r1.A02()
            X.Vfp r2 = r1.A02
            java.lang.String r1 = r1.A00()
            r2.A00(r1)
        L_0x09da:
            java.lang.Object r0 = r0.A02
            android.view.View r0 = (android.view.View) r0
            X.IiO r1 = new X.IiO
            r1.<init>(r3, r0, r12)
        L_0x09e3:
            r3.post(r1)
            goto L_0x0019
        L_0x09e8:
            X.Tpd r12 = (X.C14087Tpd) r12
            r3 = 0
            X.0qQ.A0B(r12, r3)
            java.lang.Object r8 = r0.A03
            X.U8q r8 = (X.C14780U8q) r8
            X.2Fk r9 = r8.A01
            java.lang.Object r1 = r9.A02()
            X.0qQ.A0A(r1)
            X.Tpd r1 = (X.C14087Tpd) r1
            java.util.Set r1 = r1.A06
            java.lang.Object r4 = r0.A02
            com.instagram.user.model.Product r4 = (com.instagram.user.model.Product) r4
            java.lang.String r7 = r4.A0H
            boolean r2 = r1.contains(r7)
            java.util.List r1 = r12.A03
            if (r2 != 0) goto L_0x0a36
            java.util.ArrayList r6 = X.00k.A0T(r4, r1)
            java.util.Set r1 = r12.A06
            java.util.LinkedHashSet r18 = X.094.A01(r7, r1)
        L_0x0a17:
            java.util.HashSet r10 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r6.iterator()
        L_0x0a23:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0a58
            java.lang.Object r5 = r6.next()
            r1 = r5
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            java.lang.String r1 = r1.A0H
            X.C51971G9r.A1O(r1, r5, r10, r2)
            goto L_0x0a23
        L_0x0a36:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r1.iterator()
        L_0x0a3e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0a51
            java.lang.Object r2 = r5.next()
            r1 = r2
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            java.lang.String r1 = r1.A0H
            X.DbY.A1T(r1, r7, r2, r6)
            goto L_0x0a3e
        L_0x0a51:
            java.util.Set r1 = r12.A06
            java.util.Set r18 = X.094.A03(r7, r1)
            goto L_0x0a17
        L_0x0a58:
            java.lang.Object r1 = r9.A02()
            X.0qQ.A0A(r1)
            X.Tpd r1 = (X.C14087Tpd) r1
            java.util.Set r1 = r1.A05
            java.lang.Object r5 = r0.A01
            X.VkR r5 = (X.C18043VkR) r5
            java.lang.String r0 = r5.A01()
            boolean r6 = r1.contains(r0)
            java.util.Set r1 = r12.A05
            java.lang.String r0 = r5.A01()
            if (r6 != 0) goto L_0x0ae4
            java.util.LinkedHashSet r1 = X.094.A01(r0, r1)
            java.util.List r0 = X.C14780U8q.A00(r8, r7)
            java.util.LinkedHashSet r17 = X.094.A00(r0, r1)
        L_0x0a83:
            boolean r0 = r18.isEmpty()
            r0 = r0 ^ 1
            r11 = 0
            if (r0 == 0) goto L_0x0ae2
            com.instagram.user.model.User r0 = r4.A0B
            if (r0 == 0) goto L_0x0ae2
            java.lang.String r14 = X.AnonymousClass3ZA.A00(r0)
        L_0x0a94:
            java.util.List r15 = r12.A04
            java.lang.String r1 = r5.A02()
            r0 = 3786(0xeca, float:5.305E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0af2
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r15)
            java.util.Iterator r8 = r15.iterator()
        L_0x0aae:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0af1
            java.lang.Object r7 = r8.next()
            X.VkR r7 = (X.C18043VkR) r7
            java.lang.String r1 = r7.A01()
            java.lang.String r0 = r5.A01()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0ade
            X.VYg r0 = r7.A00()
            X.VWo r0 = r0.A01
            if (r0 == 0) goto L_0x0ade
            com.instagram.model.shopping.ProductGroup r1 = r0.A00
            if (r1 == 0) goto L_0x0ade
            java.util.List r0 = X.AnonymousClass7TE.A1I(r4)
            java.util.List r0 = X.C14502TxO.A04(r0)
            r1.A01 = r0
        L_0x0ade:
            r6.add(r7)
            goto L_0x0aae
        L_0x0ae2:
            r14 = r11
            goto L_0x0a94
        L_0x0ae4:
            java.util.Set r1 = X.094.A03(r0, r1)
            java.util.List r0 = X.C14780U8q.A00(r8, r7)
            java.util.Set r17 = X.094.A02(r0, r1)
            goto L_0x0a83
        L_0x0af1:
            r15 = r6
        L_0x0af2:
            r19 = 7109(0x1bc5, float:9.962E-42)
            r13 = r11
            r16 = r2
            r20 = r3
            r21 = r3
            r22 = r3
            r23 = r3
            X.Tpd r0 = X.C14087Tpd.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x0b04:
            java.lang.Object r2 = r0.A03
            X.N4N r2 = (X.N4N) r2
            java.lang.Object r6 = r0.A01
            X.N3A r6 = (X.N3A) r6
            java.lang.Object r0 = r0.A02
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r8 = r0.A00
            r7 = 0
            boolean r10 = X.AnonymousClass7TF.A1U(r7, r2, r6)
            X.Jvf r5 = r2.A06
            boolean r12 = r5.A05
            if (r12 != 0) goto L_0x0b80
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0b80
            java.util.List r0 = r2.A0H
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0b2b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b3b
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.N3A
            X.DbV.A1U(r1, r9, r0)
            goto L_0x0b2b
        L_0x0b3b:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r9.iterator()
        L_0x0b43:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b53
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.N62
            X.DbV.A1U(r1, r4, r0)
            goto L_0x0b43
        L_0x0b53:
            java.util.ArrayList r0 = X.00k.A0U(r4)
            if (r8 == 0) goto L_0x0b5c
            r0.add(r7, r8)
        L_0x0b5c:
            r0.add(r7, r6)
            java.util.List r1 = X.00k.A0a(r0)
            X.QP5 r0 = r6.A02
            java.lang.String r8 = r0.A01
            java.lang.CharSequence r0 = r6.A03
            java.lang.String r9 = r0.toString()
            boolean r11 = r5.A06
            java.lang.Object r7 = r5.A01
            X.N62 r7 = (X.N62) r7
            X.AnonymousClass7TF.A1B(r8, r10, r9)
            X.Jvf r6 = new X.Jvf
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.N4N r0 = X.N4N.A00((X.C15051ULh) null, r6, (X.N3M) null, (X.1Xj) null, (X.OEW) null, (X.C69628NpA) null, r2, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r1, (java.util.Map) null, (java.util.Map) null, 0, 0, 16777214, false, false, false, false, false, false)
            return r0
        L_0x0b80:
            X.N4N r0 = X.C56348Hwz.A00(r2)
            return r0
        L_0x0b85:
            android.content.Context r12 = (android.content.Context) r12
            r5 = 0
            X.0qQ.A0B(r12, r5)
            java.lang.Object r4 = r0.A02
            X.EGP r4 = (X.EGP) r4
            java.lang.Object r3 = r0.A01
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r12)
            X.0qQ.A07(r2)
            X.0qQ.A0B(r3, r5)
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r1 = 2131628372(0x7f0e1154, float:1.8884035E38)
            android.view.View r1 = X.DbT.A0D(r2, r3, r1, r5)
            X.Doz r2 = new X.Doz
            r2.<init>(r1)
            java.lang.Object r1 = r0.A03
            X.6q8 r1 = (X.C319156q8) r1
            X.IOS r0 = new X.IOS
            r0.<init>(r1)
            r4.bind(r2, r0)
            android.view.View r0 = r2.itemView
            return r0
        L_0x0bba:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0bbf:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0bc4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59104J6m.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59104J6m(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }
}
