package X;

/* renamed from: X.Ivj  reason: case insensitive filesystem */
public final class C58674Ivj extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58674Ivj(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C58674Ivj(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x04d9, code lost:
        return X.00k.A0k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r0 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        X.C320446sO.A01(r0, r1);
        X.C320446sO.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x001f;
                case 2: goto L_0x0081;
                case 3: goto L_0x008c;
                case 4: goto L_0x009e;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00bb;
                case 7: goto L_0x0030;
                case 8: goto L_0x004e;
                case 9: goto L_0x0007;
                case 10: goto L_0x0007;
                case 11: goto L_0x0007;
                case 12: goto L_0x0007;
                case 13: goto L_0x00cd;
                case 14: goto L_0x00de;
                case 15: goto L_0x00e7;
                case 16: goto L_0x00f1;
                case 17: goto L_0x0101;
                case 18: goto L_0x010a;
                case 19: goto L_0x011a;
                case 20: goto L_0x012e;
                case 21: goto L_0x0079;
                case 22: goto L_0x0144;
                case 23: goto L_0x0178;
                case 24: goto L_0x01b1;
                case 25: goto L_0x022d;
                case 26: goto L_0x0239;
                case 27: goto L_0x023f;
                case 28: goto L_0x024d;
                case 29: goto L_0x0258;
                case 30: goto L_0x0264;
                case 31: goto L_0x02a7;
                case 32: goto L_0x02b5;
                case 33: goto L_0x02e9;
                case 34: goto L_0x02f5;
                case 35: goto L_0x030b;
                case 36: goto L_0x031f;
                case 37: goto L_0x034b;
                case 38: goto L_0x0377;
                case 39: goto L_0x0385;
                case 40: goto L_0x03a7;
                case 41: goto L_0x03b7;
                case 42: goto L_0x03c3;
                case 43: goto L_0x03d1;
                case 44: goto L_0x03dd;
                case 45: goto L_0x043d;
                case 46: goto L_0x044d;
                case 47: goto L_0x045d;
                case 48: goto L_0x046d;
                case 49: goto L_0x04a1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.onBackPressed()
        L_0x000e:
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x0011:
            java.lang.Object r1 = r1.A01
            X.GE5 r1 = (X.GE5) r1
            X.4bN r0 = X.GE5.A00(r1)
            if (r0 == 0) goto L_0x000e
            X.GE5.A03(r0, r1)
            goto L_0x000e
        L_0x001f:
            X.0wX r0 = X.C61170le.A00
            X.18g r3 = X.C638918c.A01(r0)
            X.18q r2 = X.18q.A03
            java.lang.Object r1 = r1.A01
            X.0rq r1 = (X.0rq) r1
            r0 = 0
            r3.A0L(r1, r2, r0)
            goto L_0x000e
        L_0x0030:
            java.lang.Object r4 = r1.A01
            X.GIn r4 = (X.C52196GIn) r4
            X.GE0 r3 = r4.A0F
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            boolean r0 = X.GE0.A02(r3, r2)
            if (r0 == 0) goto L_0x0040
            r3.A01 = r2
        L_0x0040:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 17
            X.C58711IwK.A01(r3, r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.6sO r0 = r4.A06
            if (r0 == 0) goto L_0x000e
            goto L_0x0072
        L_0x004e:
            java.lang.Object r4 = r1.A01
            X.GIn r4 = (X.C52196GIn) r4
            X.GE0 r0 = r4.A0F
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            X.GIQ r2 = r0.A05
            java.lang.String r1 = X.GEB.A00(r3)
            java.lang.String r0 = "early_fetch_type"
            r2.A0J(r0, r1)
            java.lang.String r1 = X.GEB.A00(r3)
            java.lang.String r0 = "fetch_type"
            r2.A0J(r0, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            X.6sO r0 = r4.A06
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
        L_0x0072:
            X.C320446sO.A01(r0, r1)
            X.C320446sO.A00(r0, r2)
            goto L_0x000e
        L_0x0079:
            java.lang.Object r1 = r1.A01
            X.GCh r1 = (X.C52035GCh) r1
            r0 = 1
            r1.A00 = r0
            goto L_0x000e
        L_0x0081:
            java.lang.Object r0 = r1.A01
            X.Mep r0 = (X.C66906Mep) r0
            com.instagram.common.session.UserSession r0 = r0.A0J
            X.7YU r9 = X.AnonymousClass7YT.A00(r0)
            return r9
        L_0x008c:
            java.lang.Object r0 = r1.A01
            X.Mep r0 = (X.C66906Mep) r0
            com.instagram.common.session.UserSession r3 = r0.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326421072721665(0x810eb000003701, double:3.0363131889214564E-306)
            java.lang.Boolean r9 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r9
        L_0x009e:
            java.lang.Object r0 = r1.A01
            X.Mep r0 = (X.C66906Mep) r0
            com.instagram.common.session.UserSession r3 = r0.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326421072787202(0x810eb000013702, double:3.036313188962902E-306)
            java.lang.Boolean r9 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r9
        L_0x00b0:
            java.lang.Object r0 = r1.A01
            X.GIn r0 = (X.C52196GIn) r0
            com.instagram.common.session.UserSession r0 = r0.A08
            X.93a r9 = X.AnonymousClass93Z.A01(r0)
            return r9
        L_0x00bb:
            java.lang.Object r0 = r1.A01
            X.GIn r0 = (X.C52196GIn) r0
            com.instagram.common.session.UserSession r3 = r0.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322894904568476(0x810b7b00002a9c, double:3.03408322598264E-306)
            java.lang.Boolean r9 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r9
        L_0x00cd:
            X.3kF r3 = X.C249713kF.A00
            java.lang.Object r0 = r1.A01
            X.Hrq r0 = (X.C56043Hrq) r0
            com.instagram.common.session.UserSession r2 = r0.A03
            X.4DU r1 = r0.A04
            java.lang.String r0 = r0.A00
            X.HlF r9 = r3.A03(r1, r2, r0)
            return r9
        L_0x00de:
            java.lang.Object r1 = r1.A01
            r0 = 5
            X.Lz8 r9 = new X.Lz8
            r9.<init>(r1, r0)
            return r9
        L_0x00e7:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.GJS r9 = new X.GJS
            r9.<init>(r0)
            return r9
        L_0x00f1:
            java.lang.Object r0 = r1.A01
            X.GC7 r0 = (X.GC7) r0
            android.content.Context r2 = r0.A02
            com.instagram.common.session.UserSession r1 = r0.A06
            X.4DU r0 = r0.A07
            X.GCc r9 = new X.GCc
            r9.<init>(r2, r1, r0)
            return r9
        L_0x0101:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2nF r9 = X.C229342nE.A00(r0)
            return r9
        L_0x010a:
            java.lang.Object r3 = r1.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323371645938802(0x810bea00002c72, double:3.034384719144918E-306)
            java.lang.Boolean r9 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r9
        L_0x011a:
            java.lang.Object r3 = r1.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318509743872166(0x81077e000e18a6, double:3.031310032700669E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r9 = X.DbT.A0l(r0)
            return r9
        L_0x012e:
            java.lang.Object r1 = r1.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.1se r1 = X.1sd.A00(r1)
            X.6sP r0 = new X.6sP
            r0.<init>(r1)
            java.util.List r9 = X.AnonymousClass7TE.A1I(r0)
            return r9
        L_0x0144:
            java.lang.Object r1 = r1.A01
            X.GBH r1 = (X.GBH) r1
            com.instagram.common.session.UserSession r10 = r1.A02
            X.0eM r0 = r1.A0W
            java.lang.Object r11 = r0.getValue()
            X.H2C r11 = (X.H2C) r11
            X.0eM r0 = r1.A0M
            java.lang.Object r12 = r0.getValue()
            X.GEH r12 = (X.GEH) r12
            X.0eM r0 = r1.A0Z
            java.lang.Object r14 = r0.getValue()
            X.GEb r14 = (X.C52081GEb) r14
            X.0eM r0 = r1.A0S
            java.lang.Object r13 = r0.getValue()
            X.GEm r13 = (X.C52092GEm) r13
            X.0eM r0 = r1.A0H
            java.lang.Object r15 = r0.getValue()
            X.Hjn r15 = (X.C55567Hjn) r15
            X.H2M r9 = new X.H2M
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x0178:
            java.lang.Object r1 = r1.A01
            X.GBH r1 = (X.GBH) r1
            com.instagram.common.session.UserSession r10 = r1.A02
            X.GGJ r11 = new X.GGJ
            r11.<init>(r10)
            X.GAc r3 = r1.A07
            X.GGK r13 = new X.GGK
            r13.<init>(r10, r3)
            X.GGL r14 = new X.GGL
            r14.<init>(r3, r10)
            com.instagram.clips.intf.ClipsViewerConfig r0 = r1.A01
            com.instagram.search.common.analytics.SearchContext r4 = r0.A0S
            java.lang.String r0 = r0.A02
            X.Hlh r5 = r1.A08
            X.GGM r15 = new X.GGM
            r1 = r15
            r2 = r10
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            X.GGR r0 = new X.GGR
            r0.<init>(r10, r3)
            X.GGS r12 = new X.GGS
            r12.<init>(r10, r3)
            X.GGT r9 = new X.GGT
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L_0x01b1:
            java.lang.Object r13 = r1.A01
            X.GBH r13 = (X.GBH) r13
            com.instagram.common.session.UserSession r10 = r13.A02
            X.GAc r12 = r13.A07
            X.Hlh r11 = r13.A08
            X.93U r2 = r13.A04
            com.instagram.clips.intf.ClipsViewerConfig r1 = r13.A01
            com.instagram.search.common.analytics.SearchContext r9 = r1.A0S
            X.H3C r0 = r13.A05
            X.GGU r16 = new X.GGU
            r17 = r12
            r18 = r10
            r19 = r9
            r20 = r2
            r21 = r0
            r22 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.GGV r8 = new X.GGV
            r8.<init>(r10)
            X.GGW r7 = new X.GGW
            r7.<init>(r10)
            X.6jB r0 = X.C314986jA.A00(r10)
            X.GKM r6 = new X.GKM
            r6.<init>(r10, r0)
            X.GGX r5 = new X.GGX
            r5.<init>(r10)
            X.GGY r4 = new X.GGY
            r4.<init>(r12, r10, r2)
            X.GGZ r3 = new X.GGZ
            r3.<init>(r10)
            X.4h9 r0 = r13.A00
            X.GL5 r2 = new X.GL5
            r2.<init>(r0, r12, r10, r11)
            X.2f1 r13 = X.AnonymousClass2f1.A00(r10)
            java.lang.String r0 = r1.A02
            X.GGM r1 = new X.GGM
            r19 = r12
            r20 = r9
            r21 = r11
            r22 = r0
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            X.GGa r0 = new X.GGa
            r0.<init>(r10, r1)
            X.GEL r9 = new X.GEL
            r11 = r9
            r12 = r10
            r14 = r0
            r15 = r6
            r17 = r4
            r18 = r3
            r19 = r2
            r20 = r5
            r21 = r7
            r22 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r9
        L_0x022d:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.GDL r9 = new X.GDL
            r9.<init>(r0)
            return r9
        L_0x0239:
            X.H28 r9 = new X.H28
            r9.<init>()
            return r9
        L_0x023f:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r1 = r0.A02
            X.GBG r0 = r0.A06
            X.GGb r9 = new X.GGb
            r9.<init>(r1, r0)
            return r9
        L_0x024d:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.5rt r9 = X.C297495rq.A00(r0)
            return r9
        L_0x0258:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.Hjn r9 = new X.Hjn
            r9.<init>(r0)
            return r9
        L_0x0264:
            java.lang.Object r2 = r1.A01
            X.GBH r2 = (X.GBH) r2
            com.instagram.common.session.UserSession r11 = r2.A02
            X.GAc r12 = r2.A07
            com.instagram.clips.intf.ClipsViewerConfig r6 = r2.A01
            com.instagram.search.common.analytics.SearchContext r14 = r6.A0S
            java.lang.Long r1 = r6.A0g
            java.lang.String r0 = r6.A0p
            X.GDF r17 = new X.GDF
            r18 = r12
            r19 = r11
            r20 = r14
            r21 = r1
            r22 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            X.93U r15 = r2.A04
            X.GF2 r5 = r2.A09
            X.Hlh r4 = r2.A08
            X.4h9 r10 = r2.A00
            X.JU5 r13 = r2.A03
            X.4gf r3 = r6.A0T
            java.lang.String r2 = r6.A13
            java.lang.String r1 = r6.A14
            java.lang.String r0 = r6.A18
            X.GDG r9 = new X.GDG
            r22 = r0
            r18 = r4
            r19 = r5
            r20 = r2
            r21 = r1
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r9
        L_0x02a7:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r1 = r0.A02
            X.GAc r0 = r0.A07
            X.GGc r9 = new X.GGc
            r9.<init>(r1, r0)
            return r9
        L_0x02b5:
            java.lang.Object r1 = r1.A01
            X.GBH r1 = (X.GBH) r1
            com.instagram.common.session.UserSession r10 = r1.A02
            X.0eM r0 = r1.A0B
            java.lang.Object r11 = r0.getValue()
            X.GGT r11 = (X.GGT) r11
            X.0eM r0 = r1.A0C
            java.lang.Object r12 = r0.getValue()
            X.GEL r12 = (X.GEL) r12
            X.0eM r0 = r1.A0Y
            java.lang.Object r15 = r0.getValue()
            X.GEZ r15 = (X.GEZ) r15
            X.0eM r0 = r1.A0E
            java.lang.Object r13 = r0.getValue()
            X.H28 r13 = (X.H28) r13
            X.0eM r0 = r1.A0I
            java.lang.Object r14 = r0.getValue()
            X.Hey r14 = (X.C55269Hey) r14
            X.GEH r9 = new X.GEH
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x02e9:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.GDH r9 = new X.GDH
            r9.<init>(r0)
            return r9
        L_0x02f5:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r2 = r0.A02
            X.0eM r0 = r0.A0N
            java.lang.Object r1 = r0.getValue()
            X.GDH r1 = (X.GDH) r1
            r0 = 28
            X.GDr r9 = new X.GDr
            r9.<init>(r2, r1, r0)
            return r9
        L_0x030b:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r1 = r0.A02
            X.0eM r0 = r0.A0N
            java.lang.Object r0 = r0.getValue()
            X.GDH r0 = (X.GDH) r0
            X.GDI r9 = new X.GDI
            r9.<init>(r1, r0)
            return r9
        L_0x031f:
            java.lang.Object r1 = r1.A01
            X.GBH r1 = (X.GBH) r1
            com.instagram.common.session.UserSession r10 = r1.A02
            X.0eM r0 = r1.A0W
            java.lang.Object r11 = r0.getValue()
            X.H2C r11 = (X.H2C) r11
            X.0eM r0 = r1.A0M
            java.lang.Object r12 = r0.getValue()
            X.GEH r12 = (X.GEH) r12
            X.0eM r0 = r1.A0Z
            java.lang.Object r13 = r0.getValue()
            X.GEb r13 = (X.C52081GEb) r13
            X.0eM r0 = r1.A0X
            java.lang.Object r14 = r0.getValue()
            X.H2K r14 = (X.H2K) r14
            X.H2O r9 = new X.H2O
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x034b:
            java.lang.Object r1 = r1.A01
            X.GBH r1 = (X.GBH) r1
            com.instagram.common.session.UserSession r10 = r1.A02
            X.0eM r0 = r1.A0W
            java.lang.Object r11 = r0.getValue()
            X.H2C r11 = (X.H2C) r11
            X.0eM r0 = r1.A0M
            java.lang.Object r12 = r0.getValue()
            X.GEH r12 = (X.GEH) r12
            X.0eM r0 = r1.A0Z
            java.lang.Object r14 = r0.getValue()
            X.GEb r14 = (X.C52081GEb) r14
            X.0eM r0 = r1.A0S
            java.lang.Object r13 = r0.getValue()
            X.GEm r13 = (X.C52092GEm) r13
            X.GEo r9 = new X.GEo
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x0377:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r1 = r0.A02
            X.GAc r0 = r0.A07
            X.GEm r9 = new X.GEm
            r9.<init>(r0, r1)
            return r9
        L_0x0385:
            java.lang.Object r3 = r1.A01
            X.GBH r3 = (X.GBH) r3
            X.0eM r0 = r3.A0W
            java.lang.Object r2 = r0.getValue()
            X.H2C r2 = (X.H2C) r2
            X.0eM r0 = r3.A0M
            java.lang.Object r1 = r0.getValue()
            X.GEH r1 = (X.GEH) r1
            X.0eM r0 = r3.A0Z
            java.lang.Object r0 = r0.getValue()
            X.GEb r0 = (X.C52081GEb) r0
            X.H2L r9 = new X.H2L
            r9.<init>(r2, r1, r0)
            return r9
        L_0x03a7:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r1 = r0.A02
            X.2f5 r0 = X.C225892f5.A00(r1)
            X.GGe r9 = new X.GGe
            r9.<init>(r1, r0)
            return r9
        L_0x03b7:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.GGf r9 = new X.GGf
            r9.<init>(r0)
            return r9
        L_0x03c3:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r1 = r0.A02
            X.5vG r0 = X.C299485vG.A00
            X.H2K r9 = new X.H2K
            r9.<init>(r0, r1)
            return r9
        L_0x03d1:
            java.lang.Object r0 = r1.A01
            X.GBH r0 = (X.GBH) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.GEZ r9 = new X.GEZ
            r9.<init>(r0)
            return r9
        L_0x03dd:
            java.lang.Object r6 = r1.A01
            X.GBH r6 = (X.GBH) r6
            com.instagram.common.session.UserSession r11 = r6.A02
            X.GAc r5 = r6.A07
            com.instagram.clips.intf.ClipsViewerConfig r0 = r6.A01
            com.instagram.clips.intf.ClipsViewerSource r10 = r0.A0J
            boolean r4 = r0.A1m
            X.0eM r0 = r6.A0F
            java.lang.Object r13 = r0.getValue()
            X.GGb r13 = (X.C52133GGb) r13
            X.0eM r0 = r6.A0K
            java.lang.Object r15 = r0.getValue()
            X.GDG r15 = (X.GDG) r15
            X.0eM r0 = r6.A0L
            java.lang.Object r3 = r0.getValue()
            X.GGc r3 = (X.C52134GGc) r3
            X.0eM r0 = r6.A0G
            java.lang.Object r12 = r0.getValue()
            X.3g6 r12 = (X.C247293g6) r12
            X.0eM r0 = r6.A0U
            java.lang.Object r2 = r0.getValue()
            X.GGe r2 = (X.C52136GGe) r2
            X.0eM r0 = r6.A0V
            java.lang.Object r1 = r0.getValue()
            X.GGf r1 = (X.C52137GGf) r1
            X.0eM r0 = r6.A0J
            java.lang.Object r14 = r0.getValue()
            X.H2D r14 = (X.H2D) r14
            X.0eM r0 = r6.A0a
            java.lang.Object r0 = r0.getValue()
            X.H2E r0 = (X.H2E) r0
            X.GEb r9 = new X.GEb
            r17 = r2
            r18 = r1
            r19 = r0
            r20 = r5
            r21 = r4
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r9
        L_0x043d:
            java.lang.Object r3 = r1.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36606891027535357(0x820dc6000715fd, double:3.213683517707494E-306)
            java.lang.Integer r9 = X.C51970G9q.A0h(r2, r3, r0)
            return r9
        L_0x044d:
            java.lang.Object r3 = r1.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36606891027338747(0x820dc6000415fb, double:3.213683517583157E-306)
            java.lang.Integer r9 = X.C51970G9q.A0h(r2, r3, r0)
            return r9
        L_0x045d:
            java.lang.Object r3 = r1.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36606891027469820(0x820dc6000615fc, double:3.213683517666048E-306)
            java.lang.Integer r9 = X.C51970G9q.A0h(r2, r3, r0)
            return r9
        L_0x046d:
            java.lang.Object r3 = r1.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36888366003979043(0x830dc600030323, double:3.3916894262192374E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = ","
            java.util.List r0 = X.DbV.A18(r1, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x048a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04d5
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x048a
            r3.add(r1)
            goto L_0x048a
        L_0x04a1:
            java.lang.Object r3 = r1.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36888366003913506(0x830dc600020322, double:3.3916894261777915E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = ","
            java.util.List r0 = X.DbV.A18(r1, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x04be:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04d5
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x04be
            r3.add(r1)
            goto L_0x04be
        L_0x04d5:
            java.util.Set r9 = X.00k.A0k(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58674Ivj.invoke():java.lang.Object");
    }
}
