package X;

public final class GNG extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GNG(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0463, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        r2 = new X.C59678JTj(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
        r3.FIG(r2);
        r3.AI3((java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0121, code lost:
        if (X.C51971G9r.A1b((X.C62320sa) r2.A01) != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0123, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025b, code lost:
        r1.invoke(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r22 = this;
            r2 = r22
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x006a;
                case 2: goto L_0x007a;
                case 3: goto L_0x008c;
                case 4: goto L_0x0099;
                case 5: goto L_0x00a4;
                case 6: goto L_0x00af;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00cc;
                case 9: goto L_0x0125;
                case 10: goto L_0x0133;
                case 11: goto L_0x0140;
                case 12: goto L_0x014c;
                case 13: goto L_0x0178;
                case 14: goto L_0x0178;
                case 15: goto L_0x018a;
                case 16: goto L_0x01a1;
                case 17: goto L_0x01a1;
                case 18: goto L_0x01a9;
                case 19: goto L_0x023f;
                case 20: goto L_0x0255;
                case 21: goto L_0x0255;
                case 22: goto L_0x01a1;
                case 23: goto L_0x0105;
                case 24: goto L_0x0260;
                case 25: goto L_0x0007;
                case 26: goto L_0x02b1;
                case 27: goto L_0x02e7;
                case 28: goto L_0x02fe;
                case 29: goto L_0x035e;
                case 30: goto L_0x0373;
                case 31: goto L_0x01c4;
                case 32: goto L_0x0007;
                case 33: goto L_0x0396;
                case 34: goto L_0x0026;
                case 35: goto L_0x0007;
                case 36: goto L_0x03a7;
                case 37: goto L_0x0026;
                case 38: goto L_0x003d;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x0007;
                case 42: goto L_0x0007;
                case 43: goto L_0x003d;
                case 44: goto L_0x03e9;
                case 45: goto L_0x03ff;
                case 46: goto L_0x0418;
                case 47: goto L_0x0418;
                case 48: goto L_0x0444;
                case 49: goto L_0x0456;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0025
        L_0x0013:
            java.lang.Object r0 = r2.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x005a
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x005a
            X.2YQ r5 = r1.getDefaultViewModelCreationExtras()
        L_0x0025:
            return r5
        L_0x0026:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0032
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0025
        L_0x0032:
            java.lang.Object r0 = r2.A02
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.2YQ r5 = r0.getDefaultViewModelCreationExtras()
            return r5
        L_0x003d:
            java.lang.Object r0 = r2.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0051
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0051
            X.2YM r5 = r1.getDefaultViewModelProviderFactory()
            if (r5 != 0) goto L_0x0025
        L_0x0051:
            java.lang.Object r0 = r2.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r5 = r0.getDefaultViewModelProviderFactory()
            return r5
        L_0x005a:
            X.2YP r5 = X.AnonymousClass2YP.A00
            return r5
        L_0x005d:
            java.lang.Object r1 = r2.A02
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r0 = r2.A01
            android.widget.ImageView$ScaleType r0 = (android.widget.ImageView.ScaleType) r0
            r1.setScaleType(r0)
            goto L_0x0461
        L_0x006a:
            java.lang.Object r1 = r2.A02
            X.GgO r1 = (X.C52971GgO) r1
            r0 = 1
            r1.A02 = r0
            java.lang.Object r0 = r2.A01
            X.JLf r0 = (X.C59481JLf) r0
            r1.A0O(r0)
            goto L_0x0461
        L_0x007a:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r2.A02
            X.GgO r0 = (X.C52971GgO) r0
            X.05G r1 = r0.A0O
            X.7c5 r0 = X.C334917c5.A00
            r1.Epw(r0)
            goto L_0x0461
        L_0x008c:
            java.lang.Object r1 = r2.A01
            X.Wcn r1 = (X.C19624Wcn) r1
            java.lang.Object r0 = r2.A02
            X.Urd r0 = (X.C16276Urd) r0
            r1.DIv(r0)
            goto L_0x0461
        L_0x0099:
            java.lang.Object r3 = r2.A01
            X.3jv r3 = (X.C249523jv) r3
            java.lang.Object r0 = r2.A02
            X.5sO r2 = X.C41845B3m.A0c(r0)
            goto L_0x00c3
        L_0x00a4:
            java.lang.Object r3 = r2.A01
            X.3jv r3 = (X.C249523jv) r3
            java.lang.Object r0 = r2.A02
            X.3Ih r2 = X.C41845B3m.A0d(r0)
            goto L_0x00c3
        L_0x00af:
            java.lang.Object r3 = r2.A01
            X.3jv r3 = (X.C249523jv) r3
            java.lang.Object r1 = r2.A02
            r0 = 0
            goto L_0x00be
        L_0x00b7:
            java.lang.Object r3 = r2.A01
            X.3jv r3 = (X.C249523jv) r3
            java.lang.Object r1 = r2.A02
            r0 = 1
        L_0x00be:
            X.JTj r2 = new X.JTj
            r2.<init>(r1, r0)
        L_0x00c3:
            r3.FIG(r2)
            r0 = 0
            r3.AI3(r0)
            goto L_0x0461
        L_0x00cc:
            java.lang.Object r9 = r2.A01
            X.4tk r9 = (X.C276694tk) r9
            java.lang.Object r0 = r2.A02
            X.VVU r0 = (X.VVU) r0
            long[] r10 = r0.A02
            X.VjJ r8 = r9.A04
            if (r10 == 0) goto L_0x0123
            int r7 = r10.length
            r6 = 0
        L_0x00dc:
            if (r6 >= r7) goto L_0x0123
            r2 = r10[r6]
            r0 = 60
            long r4 = r2 >>> r0
            int r1 = (int) r4
            r0 = 6
            if (r1 == r0) goto L_0x00fb
            r0 = 7
            if (r1 == r0) goto L_0x00fb
            r0 = 8
            if (r1 == r0) goto L_0x00fb
            boolean r0 = r9.A03(r8, r2)
            if (r0 != 0) goto L_0x0102
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x00fb:
            boolean r0 = X.C16921VAy.A00(r2)
            if (r0 == 0) goto L_0x0102
            goto L_0x00f5
        L_0x0102:
            int r6 = r6 + 1
            goto L_0x00dc
        L_0x0105:
            java.lang.Object r1 = r2.A02
            androidx.compose.foundation.lazy.LazyListState r1 = (androidx.compose.foundation.lazy.LazyListState) r1
            X.6Gl r0 = r1.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            int r0 = r0.A06
            if (r0 == 0) goto L_0x00f5
            int r0 = r1.A00()
            if (r0 != 0) goto L_0x00f5
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 == 0) goto L_0x00f5
        L_0x0123:
            r0 = 1
            goto L_0x00f6
        L_0x0125:
            java.lang.Object r1 = r2.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            X.Mf8 r5 = new X.Mf8
            r5.<init>(r1, r0)
            return r5
        L_0x0133:
            java.lang.Object r1 = r2.A02
            X.0lg r1 = (X.0lg) r1
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            X.3KG r5 = X.AnonymousClass3KF.A00(r0, r1)
            return r5
        L_0x0140:
            java.lang.Object r0 = r2.A02
            X.72o r0 = (X.C3254772o) r0
            X.C3254772o.A00(r0)
            X.C3254772o.A01(r0)
            goto L_0x0461
        L_0x014c:
            java.lang.Object r9 = r2.A01
            X.57l r9 = (X.C2813957l) r9
            java.lang.Object r10 = r2.A02
            X.IP3 r10 = (X.IP3) r10
            X.H7z r8 = r10.A07
            X.Tnz r6 = r10.A05
            X.0fA r7 = r10.A06
            X.0sP r13 = r10.A0A
            java.util.List r12 = r10.A09
            int r0 = r10.A01
            int r14 = r0 + 1
            int r15 = r10.A02
            int r2 = r10.A04
            int r1 = r10.A03
            X.3Vh r11 = r10.A08
            int r0 = r10.A00
            X.IP3 r5 = new X.IP3
            r16 = r2
            r17 = r1
            r18 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        L_0x0178:
            java.lang.Object r1 = r2.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A01
            X.62b r0 = (X.C3022062b) r0
            int r0 = r0.A01
            X.C51967G9n.A0w(r0, r1)
            java.lang.Boolean r5 = X.AnonymousClass7TE.A0v()
            return r5
        L_0x018a:
            java.lang.Object r4 = r2.A01
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r3 = r2.A02
            r1 = 0
            r0 = 29
            X.MG7 r2 = new X.MG7
            r2.<init>(r3, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r2, r4)
            goto L_0x0461
        L_0x01a1:
            java.lang.Object r1 = r2.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A01
            goto L_0x025b
        L_0x01a9:
            java.lang.Object r0 = r2.A02
            X.Gbq r0 = (X.C52738Gbq) r0
            java.lang.Object r0 = r0.A03
            X.0sa r0 = (X.C62320sa) r0
            if (r0 != 0) goto L_0x0238
            java.lang.Object r0 = r2.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r0 = X.C61270mF.A00(r0)
            r0.onBackPressed()
            goto L_0x0461
        L_0x01c4:
            java.lang.Object r3 = r2.A01
            X.2Wa r3 = (X.2Wa) r3
            X.GMm r1 = X.C52296GMm.A00
            X.GMO r0 = new X.GMO
            r0.<init>(r1, r1)
            r3.A01(r0)
            java.lang.Object r8 = r2.A02
            X.GMH r8 = (X.GMH) r8
            X.0sP r0 = r8.A0E
            r9 = 0
            X.C51968G9o.A1O(r0, r9)
            X.0sP r1 = r8.A0F
            int r0 = r8.A00
            int r0 = r0 + 1
            X.C51967G9n.A0w(r0, r1)
            X.3ex r2 = r8.A05
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0236
            com.instagram.common.session.UserSession r1 = r8.A03
            X.4DU r0 = r8.A08
            java.lang.String r7 = r0.getModuleName()
            java.lang.String r6 = r2.A05
            java.lang.String r5 = r2.A07
            java.lang.String r4 = r2.A06
            X.4GS r0 = r8.A04
            r3 = 0
            if (r0 == 0) goto L_0x023d
            java.lang.String r3 = r0.All()
            java.lang.Integer r2 = r0.Als()
        L_0x0208:
            X.0qQ.A0B(r1, r9)
            X.C51972G9s.A1B(r7, r4)
            X.0wc r1 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r0 = "instagram_media_note_unminimize_client"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0236
            X.C51965G9l.A1J(r1, r4)
            X.C51971G9r.A1A(r1, r7, r6)
            X.C51965G9l.A1Q(r1, r5)
            java.lang.Long r0 = X.DbZ.A0c(r2)
            X.C51965G9l.A1G(r1, r0)
            java.lang.String r0 = "carousel_media_id"
            r1.AAJ(r0, r3)
            X.AnonymousClass7TH.A0V(r1)
        L_0x0236:
            X.0sa r0 = r8.A0C
        L_0x0238:
            r0.invoke()
            goto L_0x0461
        L_0x023d:
            r2 = r3
            goto L_0x0208
        L_0x023f:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A02
            java.lang.Object r0 = X.C51966G9m.A17(r0)
            X.4ch r0 = (X.C268064ch) r0
            if (r0 == 0) goto L_0x0252
            X.5VN r0 = X.C289425dZ.A01(r0)
            goto L_0x025b
        L_0x0252:
            X.5VN r0 = X.AnonymousClass5VN.A04
            goto L_0x025b
        L_0x0255:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A02
        L_0x025b:
            r1.invoke(r0)
            goto L_0x0461
        L_0x0260:
            r3 = 0
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            r8 = 0
            java.util.BitSet r0 = X.DbS.A0w(r8)
            int r0 = r0.nextClearBit(r8)
            if (r0 < r8) goto L_0x02ac
            X.0sm r17 = X.0Yt.A0E()
            java.util.Map r16 = X.0Yt.A0B(r1)
            r11 = 1
            r19 = 60
            r18 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r13 = "com.bloks.www.ig.creator_connections.BloksIGAddCollaboratorEducationNUXScreenQuery"
            X.ShW r12 = new X.ShW
            r14 = r3
            r15 = r3
            r21 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21)
            java.lang.Object r1 = r2.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r2.A02
            X.0lg r0 = (X.0lg) r0
            X.6Qj r0 = X.C48721Ej6.A00(r0, r8)
            r7 = 1065353216(0x3f800000, float:1.0)
            X.FRI r2 = new X.FRI
            r4 = r3
            r5 = r3
            r6 = r3
            r9 = r8
            r10 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.0qQ.A0B(r1, r8)
            X.0qQ.A0B(r0, r11)
            r12.E0s(r1, r2, r0)
            goto L_0x0461
        L_0x02ac:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        L_0x02b1:
            android.os.Handler r5 = X.AnonymousClass7TF.A0D()
            java.lang.Object r4 = r2.A02
            X.GMH r4 = (X.GMH) r4
            X.3ex r0 = r4.A05
            java.lang.Integer r1 = X.GMK.A01(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x02db
            java.lang.Object r1 = r2.A01
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r0 = r1.A03
            if (r0 == 0) goto L_0x02db
            X.Igw r3 = new X.Igw
            r3.<init>(r1, r4)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 10
            long r0 = r2.toMillis(r0)
            r5.postDelayed(r3, r0)
        L_0x02db:
            r1 = 18
            X.MMC r0 = new X.MMC
            r0.<init>(r5, r1)
            X.3dj r5 = X.C51965G9l.A0V(r0)
            return r5
        L_0x02e7:
            java.lang.Object r0 = r2.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r3 = r0.A00
            X.2xU r3 = (X.AnonymousClass2xU) r3
            if (r3 == 0) goto L_0x0461
            java.lang.Object r0 = r2.A02
            X.GMH r0 = (X.GMH) r0
            X.3W1 r2 = r0.A09
            r1 = 0
            r0 = 0
            r2.A0M(r3, r1, r0)
            goto L_0x0461
        L_0x02fe:
            java.lang.Object r3 = r2.A02
            X.GMH r3 = (X.GMH) r3
            X.4DV r7 = r3.A0A
            if (r7 == 0) goto L_0x0352
            X.4DU r0 = r3.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "feed_timeline"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0352
            com.instagram.common.session.UserSession r6 = r3.A03
            r5 = 0
            X.0Tu r4 = X.DbS.A0J(r6, r5)
            r0 = 36320652937143033(0x810971005422f9, double:3.032665396755112E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0352
            X.3je r0 = X.C55387Hgt.A00
            java.lang.Object r0 = r2.A01
            X.2Wa r0 = (X.2Wa) r0
            X.HiG r1 = new X.HiG
            r1.<init>(r0)
            X.3ex r0 = r3.A05
            int r0 = r0.A00
            X.0qQ.A0B(r7, r5)
            if (r0 > 0) goto L_0x0352
            X.3je r0 = X.C55387Hgt.A00
            if (r0 != 0) goto L_0x0352
            X.HC8 r0 = new X.HC8
            r0.<init>(r1, r5)
            X.C55387Hgt.A00 = r0
            X.3Ar r1 = r7.getScrollingViewProxy()
            if (r1 == 0) goto L_0x0352
            X.3je r0 = X.C55387Hgt.A00
            if (r0 == 0) goto L_0x0352
            r1.AAD(r0)
        L_0x0352:
            r1 = 19
            X.MMC r0 = new X.MMC
            r0.<init>(r3, r1)
            X.3dj r5 = X.C51965G9l.A0V(r0)
            return r5
        L_0x035e:
            java.lang.Object r0 = r2.A02
            X.GMH r0 = (X.GMH) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.INc> r1 = X.C57062INc.class
            java.lang.Object r0 = r2.A01
            X.1wn r0 = (X.1wn) r0
            r3.A02(r0, r1)
            goto L_0x0461
        L_0x0373:
            java.lang.Object r3 = r2.A02
            X.GMH r3 = (X.GMH) r3
            java.lang.Object r1 = r2.A01
            r0 = 1
            X.INz r2 = new X.INz
            r2.<init>(r0, r1, r3)
            com.instagram.common.session.UserSession r0 = r3.A03
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.INc> r0 = X.C57062INc.class
            r1.A01(r2, r0)
            r1 = 29
            X.GNG r0 = new X.GNG
            r0.<init>(r1, r2, r3)
            X.3dj r5 = X.C51965G9l.A0V(r0)
            return r5
        L_0x0396:
            java.lang.Object r1 = r2.A02
            X.LN3 r1 = (X.LN3) r1
            java.lang.Object r0 = r2.A01
            X.OI6 r0 = (X.OI6) r0
            boolean r0 = X.LN3.A00(r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x03a7:
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            X.2tC r1 = X.AnonymousClass2t9.A00(r0)
            X.H7M r0 = new X.H7M
            r0.<init>()
            X.2t9 r5 = X.DbU.A0U(r1, r0)
            java.lang.Object r0 = r2.A02
            X.L3Z r0 = (X.L3Z) r0
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r0 = r0.A00
            java.util.List r0 = r0.A0B
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x03c8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03e5
            java.lang.Object r0 = r3.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r2 = r0.B8Q()
            java.lang.String r1 = r0.getId()
            X.IOU r0 = new X.IOU
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x03c8
        L_0x03e5:
            r5.A08(r4)
            return r5
        L_0x03e9:
            java.lang.Object r3 = r2.A02
            java.lang.Object r2 = r2.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            r0 = 0
            X.MsB r1 = new X.MsB
            r1.<init>(r0, r2, r3)
            android.content.Context r0 = X.C243803a8.A00(r2)
            X.2Vt r5 = new X.2Vt
            r5.<init>(r0, r1)
            return r5
        L_0x03ff:
            java.lang.Object r3 = r2.A01
            X.5xz r3 = (X.C300835xz) r3
            java.lang.Object r0 = r2.A02
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            r3.A01(r0)
            r1 = 15
            X.MJ0 r0 = new X.MJ0
            r0.<init>(r3, r1)
            X.3dj r5 = X.C51965G9l.A0V(r0)
            return r5
        L_0x0418:
            java.lang.Object r5 = r2.A01
            X.Hpd r5 = (X.C55916Hpd) r5
            android.view.View r4 = r5.A00
            if (r4 == 0) goto L_0x043c
            android.view.ViewParent r3 = r4.getParent()
            boolean r0 = r3 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L_0x043c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L_0x043c
            boolean r0 = r3 instanceof com.facebook.litho.ComponentHost
            if (r0 != 0) goto L_0x043c
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L_0x043c
            r3.removeView(r4)
            r5.A00 = r1
        L_0x043c:
            java.lang.Object r0 = r2.A02
            X.2Wa r0 = (X.2Wa) r0
            X.C51971G9r.A1I(r0)
            goto L_0x0461
        L_0x0444:
            java.lang.Object r0 = r2.A01
            boolean r0 = X.C51972G9s.A1a(r0)
            if (r0 != 0) goto L_0x0454
            java.lang.Object r1 = r2.A02
            X.2V5 r1 = (X.2V5) r1
            r0 = 0
            X.C51967G9n.A19(r1, r0)
        L_0x0454:
            r5 = 0
            return r5
        L_0x0456:
            java.lang.Object r1 = r2.A02
            X.8Yz r1 = (X.C357638Yz) r1
            java.lang.Object r0 = r2.A01
            X.80u r0 = (X.C3495480u) r0
            r1.A0H(r0)
        L_0x0461:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GNG.invoke():java.lang.Object");
    }
}
