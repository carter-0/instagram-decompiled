package X;

public final class JVS extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JVS(Object obj, Object obj2, Object obj3, String str, String str2, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A06 = str;
        this.A05 = str2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.4D7, X.JVS] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c7, code lost:
        return new X.JVS(r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        return new X.JVS(r2, r3, r4, r5, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A02
            r7 = r11
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0024;
                case 2: goto L_0x00a3;
                case 3: goto L_0x0030;
                case 4: goto L_0x003c;
                case 5: goto L_0x0048;
                case 6: goto L_0x0054;
                case 7: goto L_0x00ad;
                case 8: goto L_0x00b7;
                case 9: goto L_0x0060;
                case 10: goto L_0x00c8;
                case 11: goto L_0x006d;
                case 12: goto L_0x007a;
                case 13: goto L_0x0087;
                case 14: goto L_0x0095;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r4 = r9.A04
            java.lang.String r5 = r9.A06
            java.lang.String r6 = r9.A05
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A01
            r8 = 15
        L_0x0012:
            X.JVS r1 = new X.JVS
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0018:
            java.lang.Object r4 = r9.A04
            java.lang.String r5 = r9.A06
            java.lang.String r6 = r9.A05
            java.lang.Object r2 = r9.A01
            java.lang.Object r3 = r9.A03
            r8 = 0
            goto L_0x0012
        L_0x0024:
            java.lang.Object r4 = r9.A04
            java.lang.String r5 = r9.A06
            java.lang.String r6 = r9.A05
            java.lang.Object r2 = r9.A01
            java.lang.Object r3 = r9.A03
            r8 = 1
            goto L_0x0012
        L_0x0030:
            java.lang.Object r4 = r9.A04
            java.lang.String r6 = r9.A05
            java.lang.Object r3 = r9.A03
            java.lang.String r5 = r9.A06
            java.lang.Object r2 = r9.A01
            r8 = 3
            goto L_0x0012
        L_0x003c:
            java.lang.Object r4 = r9.A04
            java.lang.String r5 = r9.A06
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A01
            java.lang.String r6 = r9.A05
            r8 = 4
            goto L_0x0012
        L_0x0048:
            java.lang.Object r4 = r9.A04
            java.lang.Object r2 = r9.A01
            java.lang.String r6 = r9.A05
            java.lang.Object r3 = r9.A03
            java.lang.String r5 = r9.A06
            r8 = 5
            goto L_0x0012
        L_0x0054:
            java.lang.Object r2 = r9.A01
            java.lang.Object r4 = r9.A04
            java.lang.Object r3 = r9.A03
            java.lang.String r5 = r9.A06
            java.lang.String r6 = r9.A05
            r8 = 6
            goto L_0x0012
        L_0x0060:
            java.lang.Object r2 = r9.A01
            java.lang.Object r3 = r9.A03
            java.lang.Object r4 = r9.A04
            java.lang.String r5 = r9.A06
            java.lang.String r6 = r9.A05
            r8 = 9
            goto L_0x0012
        L_0x006d:
            java.lang.Object r4 = r9.A04
            java.lang.Object r3 = r9.A03
            java.lang.String r5 = r9.A06
            java.lang.Object r2 = r9.A01
            java.lang.String r6 = r9.A05
            r8 = 11
            goto L_0x0012
        L_0x007a:
            java.lang.Object r4 = r9.A04
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A01
            java.lang.String r5 = r9.A06
            java.lang.String r6 = r9.A05
            r8 = 12
            goto L_0x0012
        L_0x0087:
            java.lang.Object r4 = r9.A04
            java.lang.Object r2 = r9.A01
            java.lang.String r6 = r9.A05
            java.lang.String r5 = r9.A06
            java.lang.Object r3 = r9.A03
            r8 = 13
            goto L_0x0012
        L_0x0095:
            java.lang.Object r2 = r9.A01
            java.lang.String r5 = r9.A06
            java.lang.Object r4 = r9.A04
            java.lang.Object r3 = r9.A03
            java.lang.String r6 = r9.A05
            r8 = 14
            goto L_0x0012
        L_0x00a3:
            java.lang.Object r3 = r9.A04
            java.lang.String r5 = r9.A05
            java.lang.String r6 = r9.A06
            java.lang.Object r4 = r9.A03
            r8 = 2
            goto L_0x00c1
        L_0x00ad:
            java.lang.Object r3 = r9.A04
            java.lang.Object r4 = r9.A03
            java.lang.String r5 = r9.A05
            java.lang.String r6 = r9.A06
            r8 = 7
            goto L_0x00c1
        L_0x00b7:
            java.lang.Object r3 = r9.A04
            java.lang.Object r4 = r9.A03
            java.lang.String r5 = r9.A05
            java.lang.String r6 = r9.A06
            r8 = 8
        L_0x00c1:
            X.JVS r1 = new X.JVS
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r1
        L_0x00c8:
            java.lang.Object r3 = r9.A04
            java.lang.String r6 = r9.A06
            java.lang.String r5 = r9.A05
            java.lang.Object r4 = r9.A03
            r8 = 10
            X.JVS r1 = new X.JVS
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.A01 = r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVS.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v227, resolved type: X.40G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v230, resolved type: X.40G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v231, resolved type: X.40G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v232, resolved type: X.40G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v233, resolved type: X.1Hj} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.JVS] */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x052a, code lost:
        if (r3 == false) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0cbd, code lost:
        X.0eS.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0cdd, code lost:
        r0 = r8.emit(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0ce1, code lost:
        if (r0 != r1) goto L_0x0cff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0ce3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x084b  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0896  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0916  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x098e  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0aa9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            r31 = this;
            r0 = r31
            r2 = r32
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x0115;
                case 1: goto L_0x0182;
                case 2: goto L_0x01b8;
                case 3: goto L_0x02a3;
                case 4: goto L_0x02e1;
                case 5: goto L_0x060b;
                case 6: goto L_0x06a5;
                case 7: goto L_0x0713;
                case 8: goto L_0x089f;
                case 9: goto L_0x0997;
                case 10: goto L_0x09c8;
                case 11: goto L_0x0b39;
                case 12: goto L_0x0be0;
                case 13: goto L_0x0caf;
                case 14: goto L_0x0ce4;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r6 = 1
            if (r3 == 0) goto L_0x003c
            if (r3 != r6) goto L_0x0110
            X.0eS.A00(r2)
        L_0x0015:
            X.3Ii r2 = (X.C239803Ii) r2
            java.lang.Object r5 = r0.A04
            X.HDe r5 = (X.C54431HDe) r5
            java.lang.Object r8 = r0.A03
            X.JwF r8 = (X.C61077JwF) r8
            java.lang.Object r7 = r0.A01
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b0
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
            X.CEF r1 = (X.CEF) r1
            X.05G r0 = r5.A03
            X.JTR.A1V(r0)
            X.YBI r2 = r1.A01
            if (r2 != 0) goto L_0x008b
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003c:
            X.0eS.A00(r2)
            java.lang.Object r3 = r0.A04
            X.HDe r3 = (X.C54431HDe) r3
            X.05G r2 = r3.A03
            X.AnonymousClass7TF.A1O(r2, r6)
            java.lang.String r8 = r0.A06
            java.lang.String r7 = r0.A05
            java.lang.Object r2 = r0.A03
            X.JwF r2 = (X.C61077JwF) r2
            java.lang.String r5 = r2.A01
            com.instagram.common.session.UserSession r3 = r3.A00
            r2 = 0
            X.0qQ.A0B(r8, r2)
            X.AnonymousClass7TF.A1B(r7, r6, r5)
            X.1NY r4 = X.AnonymousClass7TG.A0b(r3)
            java.lang.String r2 = "metaverse_bridges/get_horizon_world_pages/"
            r4.A0A(r2)
            java.lang.Class<X.CEF> r3 = X.CEF.class
            java.lang.Class<X.Cyt> r2 = X.C45581Cyt.class
            r4.A0Q(r3, r2)
            java.lang.String r2 = "horizon_world_id"
            r4.A9m(r2, r8)
            r2 = 3714(0xe82, float:5.204E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A9m(r2, r7)
            java.lang.String r2 = "page_token"
            X.1OC r3 = X.DbT.A0T(r4, r2, r5)
            r0.A00 = r6
            r2 = 1172727008(0x45e664e0, float:7372.6094)
            java.lang.Object r2 = r3.A00(r2, r0)
            if (r2 != r1) goto L_0x0015
            return r1
        L_0x008b:
            r0 = r2
            X.JxI r0 = (X.C61106JxI) r0
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x00b9
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x009a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r1.next()
            X.4sM r0 = (X.C276024sM) r0
            X.1Xj r0 = r0.BPf()
            if (r0 == 0) goto L_0x009a
            r4.add(r0)
            goto L_0x009a
        L_0x00b0:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00fa
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b9:
            X.0sn r4 = X.0sn.A00
        L_0x00bb:
            X.JxI r2 = (X.C61106JxI) r2
            com.instagram.api.schemas.HzwPageInfoImpl r0 = r2.A00
            if (r0 == 0) goto L_0x00c5
            java.lang.String r3 = r0.A01
            if (r3 != 0) goto L_0x00c7
        L_0x00c5:
            java.lang.String r3 = ""
        L_0x00c7:
            if (r0 == 0) goto L_0x0109
            java.lang.Boolean r0 = r0.A00
            boolean r2 = X.AnonymousClass7TF.A1Y(r0, r6)
        L_0x00cf:
            java.lang.Object r0 = r8.A00
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r1 = X.00k.A0S(r4, r0)
            r0 = 19
            X.JwF r4 = new X.JwF
            r4.<init>((java.util.List) r1, (boolean) r2, (java.lang.String) r3, (int) r0)
            X.05G r3 = r5.A01
        L_0x00e0:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            X.0eP r0 = new X.0eP
            r0.<init>(r7, r4)
            java.util.Map r0 = X.0Yt.A0C(r1, r0)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x00e0
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x00fa:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0cff
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x010b
            X.05G r0 = r5.A03
            X.JTR.A1V(r0)
            goto L_0x0cff
        L_0x0109:
            r2 = 0
            goto L_0x00cf
        L_0x010b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0110:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0115:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r6 = 1
            if (r3 == 0) goto L_0x0150
            if (r3 != r6) goto L_0x017d
            X.0eS.A00(r2)
        L_0x0121:
            X.3Ii r2 = (X.C239803Ii) r2
            java.lang.Object r3 = r0.A01
            X.0sP r3 = (X.0sP) r3
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0147
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
            r3.invoke(r1)
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x0136:
            java.lang.Object r1 = r0.A03
            X.0sa r1 = (X.C62320sa) r1
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0cff
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0178
            r1.invoke()
            goto L_0x0cff
        L_0x0147:
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0136
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0150:
            X.0eS.A00(r2)
            java.lang.Object r5 = r0.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            X.7aH r4 = X.C51968G9o.A0g(r5)
            java.lang.String r3 = r0.A06
            java.lang.String r2 = r0.A05
            X.7dj r2 = X.C335067cK.A01(r4, r3, r2)
            if (r2 == 0) goto L_0x0cff
            com.instagram.user.model.User r2 = r2.A0C
            java.lang.String r4 = r2.getId()
            com.instagram.common.session.UserSession r3 = r5.A0B
            java.lang.String r2 = r5.A0D
            r0.A00 = r6
            java.lang.Object r2 = com.instagram.comments.mvvm.data.network.RestrictedCommentNetworkRequestsKt.A01(r3, r4, r2, r0)
            if (r2 != r1) goto L_0x0121
            return r1
        L_0x0178:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x017d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0182:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r4 = 1
            if (r3 == 0) goto L_0x0190
            if (r3 == r4) goto L_0x0cbd
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0190:
            X.0eS.A00(r2)
            java.lang.Object r3 = r0.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r3 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r3
            X.7aH r2 = X.C51968G9o.A0g(r3)
            java.lang.String r8 = r0.A06
            java.lang.String r7 = r0.A05
            X.7dj r2 = X.C335067cK.A02(r2, r8, r7)
            if (r2 == 0) goto L_0x0cff
            java.lang.Object r5 = r0.A01
            java.lang.Object r6 = r0.A03
            r0.A00 = r4
            r9 = 14
            X.PqY r4 = new X.PqY
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.String) r7, (java.lang.String) r8, (int) r9)
            java.lang.Object r0 = X.JTQ.A0X(r3, r1, r0, r4)
            goto L_0x0ce1
        L_0x01b8:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0202
            if (r3 != r5) goto L_0x029e
            java.lang.Object r7 = r0.A01
            X.1Xj r7 = (X.1Xj) r7
            X.0eS.A00(r2)
        L_0x01c9:
            X.7dS r2 = (X.C335737dS) r2
            boolean r1 = X.C335747dT.A03(r2)
            if (r1 == 0) goto L_0x028e
            java.lang.Integer r10 = X.C335747dT.A00(r2)
            if (r10 == 0) goto L_0x01ef
            java.lang.Object r1 = r0.A04
            X.GgO r1 = (X.C52971GgO) r1
            java.lang.String r6 = r0.A05
            java.lang.String r4 = r0.A06
            X.7a0 r3 = r1.A0C
            r1 = 0
            X.0qQ.A0B(r7, r1)
            X.0wc r1 = r3.A01
            r8 = r1
            r9 = r7
            r11 = r6
            r12 = r4
            r13 = r5
            X.1Yp.A01(r8, r9, r10, r11, r12, r13)
        L_0x01ef:
            java.lang.Object r3 = r0.A04
            X.GgO r3 = (X.C52971GgO) r3
            com.instagram.user.model.User r1 = X.C51966G9m.A11(r7)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.7a3 r0 = r3.A09
            r0.A02(r1, r2)
            goto L_0x0cff
        L_0x0202:
            X.0eS.A00(r2)
            java.lang.Object r8 = r0.A04
            X.GgO r8 = (X.C52971GgO) r8
            X.0Ud r2 = r8.A0X
            java.lang.Object r3 = r2.getValue()
            boolean r2 = r3 instanceof X.C334947c8
            if (r2 == 0) goto L_0x0257
            X.7c8 r3 = (X.C334947c8) r3
            if (r3 == 0) goto L_0x0257
            java.util.List r2 = r3.A09
            if (r2 == 0) goto L_0x0257
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r2.iterator()
        L_0x0223:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0235
            java.lang.Object r3 = r4.next()
            boolean r2 = r3 instanceof X.C335907dj
            if (r2 == 0) goto L_0x0223
            r7.add(r3)
            goto L_0x0223
        L_0x0235:
            r2 = 100
            java.util.List r2 = X.00k.A0h(r7, r2)
            if (r2 == 0) goto L_0x0257
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x0245:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0257
            java.lang.Object r2 = r3.next()
            X.7dj r2 = (X.C335907dj) r2
            java.lang.String r2 = r2.A0K
            r6.add(r2)
            goto L_0x0245
        L_0x0257:
            X.7a5 r2 = r8.A0B
            X.1Xl r2 = r2.A00
            if (r2 == 0) goto L_0x0cff
            X.1Xj r7 = r2.BPf()
            if (r7 == 0) goto L_0x0cff
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r9 = X.C335077cL.A00()
            java.lang.String r4 = r0.A05
            java.lang.String r3 = r0.A06
            if (r6 != 0) goto L_0x026f
            X.0sn r6 = X.0sn.A00
        L_0x026f:
            java.lang.Object r2 = r0.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            com.instagram.common.session.UserSession r11 = r8.A0E
            X.0wc r10 = X.AnonymousClass0kN.A02(r11)
            r0.A01 = r7
            r0.A00 = r5
            r12 = r7
            r13 = r2
            r14 = r4
            r15 = r3
            r16 = r6
            r17 = r0
            r18 = r5
            java.lang.Enum r2 = r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r2 != r1) goto L_0x01c9
            return r1
        L_0x028e:
            java.lang.Object r0 = r0.A04
            X.GgO r0 = (X.C52971GgO) r0
            X.05G r1 = r0.A0O
            X.9JC r0 = new X.9JC
            r0.<init>(r7, r2)
            r1.Epw(r0)
            goto L_0x0cff
        L_0x029e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02a3:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r7 = 1
            if (r3 == 0) goto L_0x02b9
            if (r3 != r7) goto L_0x02dc
            X.0eS.A00(r2)
            X.0eR r2 = (X.0eR) r2
            java.lang.Object r0 = r2.A00
        L_0x02b3:
            X.0eR r1 = new X.0eR
            r1.<init>(r0)
            return r1
        L_0x02b9:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A04
            com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository r2 = (com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository) r2
            com.instagram.creation.capture.assetpicker.cutout.services.CutoutStickerUploadService r6 = r2.A03
            java.lang.String r5 = r0.A05
            java.lang.Object r4 = r0.A03
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.String r3 = r0.A06
            java.lang.Object r2 = r0.A01
            X.1ua r2 = (X.1ua) r2
            r0.A00 = r7
            r7 = r4
            r8 = r2
            r9 = r5
            r10 = r3
            r11 = r0
            java.lang.Object r0 = r6.A00(r7, r8, r9, r10, r11)
            if (r0 != r1) goto L_0x02b3
            return r1
        L_0x02dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02e1:
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x03a4
            if (r1 != r6) goto L_0x0606
            X.0eS.A00(r2)
        L_0x02eb:
            X.40G r2 = (X.AnonymousClass40G) r2
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x0cff
            java.lang.Object r1 = r2.A00
            double r4 = X.JTO.A00(r1)
            java.lang.Object r12 = r0.A04
            X.LAh r12 = (X.C63878LAh) r12
            double r2 = r12.A01
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0cff
            java.lang.Object r3 = r0.A03
            X.0sL r3 = (X.0sL) r3
            java.lang.Object r2 = r0.A01
            X.7Bo r1 = X.C327627Bo.NUX_TYPE_META_AI_INTENT_DETECTION
            r3.invoke(r2, r1)
            java.lang.String r0 = r0.A05
            r18 = r0
            X.L6V r0 = r12.A06
            X.1Av r13 = r0.A02
            r0 = 3598(0xe0e, float:5.042E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            r6 = 0
            X.0xa r11 = r13.A01
            long r8 = r11.getLong(r14, r6)
            long r4 = X.AnonymousClass7TG.A0I()
            X.L19 r0 = r12.A07
            com.instagram.common.session.UserSession r15 = r0.A00
            X.0Tu r10 = X.0Tu.A05
            r0 = 36607762905699959(0x820e9100041677, double:3.21423489696956E-306)
            long r16 = X.182.A01(r10, r15, r0)
            r2 = 1
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0388
            long r8 = r8 + r2
            r13.A11(r14, r8)
        L_0x033f:
            r0 = 706(0x2c2, float:9.9E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r13.A11(r0, r4)
            r0 = 3597(0xe0d, float:5.04E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            long r0 = r11.getLong(r4, r6)
            long r0 = r0 + r2
            r2 = 36607762905831033(0x820e9100061679, double:3.214234897052452E-306)
            long r2 = X.182.A01(r10, r15, r2)
            long r0 = java.lang.Math.min(r0, r2)
            r13.A11(r4, r0)
            X.7I3 r0 = r12.A05
            java.lang.String r3 = "mustache_shown"
            X.0wc r1 = r0.A01
            r0 = 968(0x3c8, float:1.356E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbS.A1I(r2, r3)
            r0 = 1595(0x63b, float:2.235E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = r18
            r2.AAJ(r1, r0)
            r2.Cgf()
            r12.A00 = r0
            goto L_0x0cff
        L_0x0388:
            r0 = 706(0x2c2, float:9.9E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r8 = r11.getLong(r0, r6)
            r0 = 36607762905765496(0x820e9100051678, double:3.214234897011006E-306)
            long r0 = X.182.A01(r10, r15, r0)
            long r8 = r8 + r0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x033f
            r13.A11(r14, r2)
            goto L_0x033f
        L_0x03a4:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A04
            X.LAh r1 = (X.C63878LAh) r1
            X.L6V r2 = r1.A06
            java.lang.String r1 = r0.A06
            r23 = r1
            r0.A00 = r6
            X.LbY r12 = r2.A00
            r5 = 0
            X.0qQ.A0B(r1, r5)
            X.0eM r1 = r12.A04
            r30 = r1
            java.lang.Object r1 = r30.getValue()
            X.Oq1 r1 = (X.C71741Oq1) r1
            boolean r3 = r1.CZg()
            r1 = 0
            java.lang.Double r19 = java.lang.Double.valueOf(r1)
            if (r3 != 0) goto L_0x03da
            java.lang.String r3 = "Prediction is not enabled"
            X.40G r2 = new X.40G
            r1 = r19
            r2.<init>(r1, r3, r5)
            goto L_0x02eb
        L_0x03da:
            X.02m r4 = X.C51965G9l.A0l()
            r30.getValue()
            r18 = 1028134711(0x3d481737, float:0.048850264)
            X.3zy r7 = new X.3zy
            r3 = r18
            r7.<init>(r4, r3)
            r7.A00()
            X.SoA r3 = r12.A00     // Catch:{ Exception -> 0x05f1 }
            if (r3 != 0) goto L_0x03fd
            java.lang.String r3 = "Predictor is not yet initialized"
            X.40G r2 = new X.40G     // Catch:{ Exception -> 0x05f1 }
            r1 = r19
            r2.<init>(r1, r3, r5)     // Catch:{ Exception -> 0x05f1 }
            goto L_0x02eb
        L_0x03fd:
            java.lang.Object r3 = r30.getValue()     // Catch:{ Exception -> 0x05f1 }
            X.Oq1 r3 = (X.C71741Oq1) r3     // Catch:{ Exception -> 0x05f1 }
            X.0gq r8 = r3.A00     // Catch:{ Exception -> 0x05f1 }
            if (r8 == 0) goto L_0x0424
            r3 = 36323835503586873(0x810c5600122e39, double:3.034678064589363E-306)
            boolean r3 = r8.Agw(r3)     // Catch:{ Exception -> 0x05f1 }
            if (r3 != r6) goto L_0x0424
            r3 = 42
            java.lang.String r9 = X.Pxd.A00(r3)     // Catch:{ Exception -> 0x05f1 }
            int r3 = r23.length()     // Catch:{ Exception -> 0x05f1 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x05f1 }
            com.facebook.quicklog.LightweightQuickPerformanceLogger r10 = r7.A01     // Catch:{ Exception -> 0x05f1 }
            r8 = r18
            r10.markerAnnotate(r8, r9, r3)     // Catch:{ Exception -> 0x05f1 }
        L_0x0424:
            java.lang.Object r3 = r30.getValue()     // Catch:{ Exception -> 0x05f1 }
            X.Oq1 r3 = (X.C71741Oq1) r3     // Catch:{ Exception -> 0x05f1 }
            X.0gq r8 = r3.A00     // Catch:{ Exception -> 0x05f1 }
            if (r8 == 0) goto L_0x0559
            r3 = 2342166844717215288(0x20810c5600112e38, double:4.068838061866841E-152)
            boolean r3 = r8.Agw(r3)     // Catch:{ Exception -> 0x05f1 }
            if (r3 != r6) goto L_0x0559
            X.0eM r3 = r12.A02     // Catch:{ Exception -> 0x05f1 }
            java.lang.Object r11 = r3.getValue()     // Catch:{ Exception -> 0x05f1 }
            X.LbX r11 = (X.C64416LbX) r11     // Catch:{ Exception -> 0x05f1 }
            r17 = 0
            r8 = 0
            r9 = 0
            X.02m r3 = X.C51965G9l.A0l()     // Catch:{ Exception -> 0x05f1 }
            r13 = 122955679(0x754279f, float:1.5960751E-34)
            X.3zy r10 = new X.3zy     // Catch:{ Exception -> 0x05f1 }
            r10.<init>(r3, r13)     // Catch:{ Exception -> 0x05f1 }
            r10.A00()     // Catch:{ Exception -> 0x05f1 }
            X.0eM r3 = r11.A02     // Catch:{ Exception -> 0x05f1 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x05f1 }
            X.Oq2 r3 = (X.C71742Oq2) r3     // Catch:{ Exception -> 0x05f1 }
            X.0gq r14 = r3.A00     // Catch:{ Exception -> 0x05f1 }
            r15 = 1
            if (r14 == 0) goto L_0x0549
            r3 = 36326506972854060(0x810ec4000c372c, double:3.036367512511075E-306)
            boolean r3 = r14.Agw(r3)     // Catch:{ Exception -> 0x05f1 }
            if (r3 != r6) goto L_0x0549
        L_0x046c:
            r16 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x05f1 }
            if (r15 != 0) goto L_0x048c
            java.lang.String r4 = "Blocklist is not enabled"
            X.40G r3 = new X.40G     // Catch:{ Exception -> 0x05f1 }
            r3.<init>(r14, r4, r5)     // Catch:{ Exception -> 0x05f1 }
        L_0x047b:
            java.lang.String r4 = "integrity_check_blocklist_end"
            r7.A01(r4)     // Catch:{ Exception -> 0x05f1 }
            boolean r4 = r3.A02     // Catch:{ Exception -> 0x05f1 }
            if (r4 == 0) goto L_0x054e
            java.lang.Object r4 = r3.A00     // Catch:{ Exception -> 0x05f1 }
            boolean r4 = X.AnonymousClass7TE.A1a(r4)     // Catch:{ Exception -> 0x05f1 }
            goto L_0x054c
        L_0x048c:
            X.L34 r3 = r11.A00     // Catch:{ Exception -> 0x05f1 }
            if (r3 != 0) goto L_0x049f
            java.lang.String r4 = "Blocklist is not initialized"
            X.40G r3 = new X.40G     // Catch:{ Exception -> 0x05f1 }
            r3.<init>(r14, r4, r5)     // Catch:{ Exception -> 0x05f1 }
        L_0x0497:
            boolean r8 = r3.A02     // Catch:{ Exception -> 0x05f1 }
            java.lang.String r4 = r3.A01     // Catch:{ Exception -> 0x05f1 }
            r10.A04(r8, r4)     // Catch:{ Exception -> 0x05f1 }
            goto L_0x047b
        L_0x049f:
            int r3 = r23.length()     // Catch:{ Exception -> 0x05f1 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x05f1 }
            r20 = r3
            r3 = 42
            java.lang.String r4 = X.Pxd.A00(r3)     // Catch:{ Exception -> 0x05f1 }
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r10.A01     // Catch:{ Exception -> 0x05f1 }
            r15 = r3
            r14 = r4
            r3 = r20
            r15.markerAnnotate(r13, r14, r3)     // Catch:{ Exception -> 0x05f1 }
            X.L34 r13 = r11.A00     // Catch:{ Exception -> 0x05f1 }
            r4 = 0
            if (r13 == 0) goto L_0x0527
            r11 = 32
            r3 = r23
            java.lang.String r15 = X.002.A0E(r3, r11, r11)     // Catch:{ Exception -> 0x05f1 }
            X.L5h r11 = r13.A00     // Catch:{ Exception -> 0x05f1 }
            X.L35 r3 = r11.A01     // Catch:{ Exception -> 0x05f1 }
            r20 = r3
            X.LMt r13 = r11.A00     // Catch:{ Exception -> 0x05f1 }
            r11 = 0
        L_0x04cb:
            int r3 = r15.length()     // Catch:{ Exception -> 0x05f1 }
            if (r11 >= r3) goto L_0x0529
            char r14 = r15.charAt(r11)     // Catch:{ Exception -> 0x05f1 }
            r3 = r20
            boolean r3 = r3.A00     // Catch:{ Exception -> 0x05f1 }
            if (r3 == 0) goto L_0x04df
            char r14 = java.lang.Character.toLowerCase(r14)     // Catch:{ Exception -> 0x05f1 }
        L_0x04df:
            java.lang.Character r14 = java.lang.Character.valueOf(r14)     // Catch:{ Exception -> 0x05f1 }
        L_0x04e3:
            java.util.Map r3 = r13.A03     // Catch:{ Exception -> 0x05f1 }
            java.lang.Object r3 = r3.get(r14)     // Catch:{ Exception -> 0x05f1 }
            X.LMt r3 = (X.C64099LMt) r3     // Catch:{ Exception -> 0x05f1 }
            if (r3 != 0) goto L_0x04f4
            X.LMt r3 = r13.A04     // Catch:{ Exception -> 0x05f1 }
            if (r3 != 0) goto L_0x04f4
            X.LMt r13 = r13.A01     // Catch:{ Exception -> 0x05f1 }
            goto L_0x04e3
        L_0x04f4:
            r13 = r3
            java.util.Set r14 = r3.A00     // Catch:{ Exception -> 0x05f1 }
            if (r14 != 0) goto L_0x04ff
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x05f1 }
            if (r14 == 0) goto L_0x0520
        L_0x04ff:
            boolean r3 = r14.isEmpty()     // Catch:{ Exception -> 0x05f1 }
            if (r3 != 0) goto L_0x0520
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x05f1 }
            boolean r3 = r14.hasNext()     // Catch:{ Exception -> 0x05f1 }
            if (r3 == 0) goto L_0x0520
            java.lang.Object r3 = r14.next()     // Catch:{ Exception -> 0x05f1 }
            X.M1X r3 = (X.M1X) r3     // Catch:{ Exception -> 0x05f1 }
            java.lang.String r9 = r3.A00     // Catch:{ Exception -> 0x05f1 }
            int r3 = r9.length()     // Catch:{ Exception -> 0x05f1 }
            int r3 = r11 - r3
            int r8 = r3 + 1
            goto L_0x0523
        L_0x0520:
            int r11 = r11 + 1
            goto L_0x04cb
        L_0x0523:
            r17 = r11
            r3 = 1
            goto L_0x052a
        L_0x0527:
            r3 = 0
            goto L_0x052c
        L_0x0529:
            r3 = 0
        L_0x052a:
            if (r3 != 0) goto L_0x052e
        L_0x052c:
            r16 = 1
        L_0x052e:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r16)     // Catch:{ Exception -> 0x05f1 }
            if (r3 == 0) goto L_0x0542
            java.lang.String r4 = ":"
            r3 = r17
            java.lang.String r4 = X.002.A0P(r4, r8, r3)     // Catch:{ Exception -> 0x05f1 }
            java.lang.String r3 = "="
            java.lang.String r4 = X.002.A0g(r4, r3, r9)     // Catch:{ Exception -> 0x05f1 }
        L_0x0542:
            X.40G r3 = new X.40G     // Catch:{ Exception -> 0x05f1 }
            r3.<init>(r11, r4, r6)     // Catch:{ Exception -> 0x05f1 }
            goto L_0x0497
        L_0x0549:
            r15 = 0
            goto L_0x046c
        L_0x054c:
            if (r4 != 0) goto L_0x0559
        L_0x054e:
            java.lang.String r3 = r3.A01     // Catch:{ Exception -> 0x05f1 }
            X.40G r2 = new X.40G     // Catch:{ Exception -> 0x05f1 }
            r1 = r19
            r2.<init>(r1, r3, r5)     // Catch:{ Exception -> 0x05f1 }
            goto L_0x02eb
        L_0x0559:
            X.3uA[] r3 = com.facebook.odin.model.Example.A04     // Catch:{ Exception -> 0x05f1 }
            r22 = 0
            java.lang.String r4 = ""
            com.facebook.odin.model.Type r21 = com.facebook.odin.model.Type.STRING     // Catch:{ Exception -> 0x05f1 }
            r28 = 0
            r27 = 16365(0x3fed, float:2.2932E-41)
            com.facebook.odin.model.FeatureData r3 = new com.facebook.odin.model.FeatureData     // Catch:{ Exception -> 0x05f1 }
            r20 = r3
            r24 = r22
            r25 = r1
            r20.<init>(r21, r22, r23, r24, r25, r27, r28)     // Catch:{ Exception -> 0x05f1 }
            X.0eP[] r3 = X.DbW.A1b(r4, r3)     // Catch:{ Exception -> 0x05f1 }
            java.util.HashMap r9 = X.0Yt.A02(r3)     // Catch:{ Exception -> 0x05f1 }
            java.lang.String r8 = "identity"
            com.facebook.odin.model.ExampleContext r4 = com.facebook.odin.model.ExampleContext.A05     // Catch:{ Exception -> 0x05f1 }
            com.facebook.odin.model.Example r3 = new com.facebook.odin.model.Example     // Catch:{ Exception -> 0x05f1 }
            r3.<init>(r4, r8, r9)     // Catch:{ Exception -> 0x05f1 }
            X.SoA r4 = r12.A00     // Catch:{ Exception -> 0x05f1 }
            if (r4 == 0) goto L_0x05ec
            java.util.List r3 = X.AnonymousClass7TE.A1I(r3)     // Catch:{ Exception -> 0x05f1 }
            X.40G r9 = r4.E3X(r7, r3)     // Catch:{ Exception -> 0x05f1 }
            boolean r8 = r9.A02     // Catch:{ Exception -> 0x05f1 }
            if (r8 == 0) goto L_0x05be
            java.lang.Object r3 = r9.A00     // Catch:{ Exception -> 0x05f1 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x05f1 }
            java.lang.Object r1 = r3.get(r6)     // Catch:{ Exception -> 0x05f1 }
            double r1 = X.JTO.A00(r1)     // Catch:{ Exception -> 0x05f1 }
            double r1 = java.lang.Math.exp(r1)     // Catch:{ Exception -> 0x05f1 }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ Exception -> 0x05f1 }
            r10 = 0
        L_0x05a7:
            boolean r3 = r12.hasNext()     // Catch:{ Exception -> 0x05f1 }
            if (r3 == 0) goto L_0x05bd
            java.lang.Object r3 = r12.next()     // Catch:{ Exception -> 0x05f1 }
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ Exception -> 0x05f1 }
            double r3 = r3.doubleValue()     // Catch:{ Exception -> 0x05f1 }
            double r3 = java.lang.Math.exp(r3)     // Catch:{ Exception -> 0x05f1 }
            double r10 = r10 + r3
            goto L_0x05a7
        L_0x05bd:
            double r1 = r1 / r10
        L_0x05be:
            java.lang.Object r3 = r30.getValue()     // Catch:{ Exception -> 0x05f1 }
            X.Oq1 r3 = (X.C71741Oq1) r3     // Catch:{ Exception -> 0x05f1 }
            X.0gq r10 = r3.A00     // Catch:{ Exception -> 0x05f1 }
            if (r10 == 0) goto L_0x05e0
            r3 = 36323835503652410(0x810c5600132e3a, double:3.0346780646308086E-306)
            boolean r3 = r10.Agw(r3)     // Catch:{ Exception -> 0x05f1 }
            if (r3 != r6) goto L_0x05e0
            r3 = 887(0x377, float:1.243E-42)
            java.lang.String r4 = X.C273654mx.A00(r3)     // Catch:{ Exception -> 0x05f1 }
            com.facebook.quicklog.LightweightQuickPerformanceLogger r6 = r7.A01     // Catch:{ Exception -> 0x05f1 }
            r3 = r18
            r6.markerAnnotate(r3, r4, r1)     // Catch:{ Exception -> 0x05f1 }
        L_0x05e0:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)     // Catch:{ Exception -> 0x05f1 }
            java.lang.String r1 = r9.A01     // Catch:{ Exception -> 0x05f1 }
            X.40G r2 = new X.40G     // Catch:{ Exception -> 0x05f1 }
            r2.<init>(r3, r1, r8)     // Catch:{ Exception -> 0x05f1 }
            goto L_0x05fd
        L_0x05ec:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x05f1 }
            throw r1     // Catch:{ Exception -> 0x05f1 }
        L_0x05f1:
            r1 = move-exception
            java.lang.String r3 = r1.getMessage()
            X.40G r2 = new X.40G
            r1 = r19
            r2.<init>(r1, r3, r5)
        L_0x05fd:
            boolean r3 = r2.A02
            java.lang.String r1 = r2.A01
            r7.A04(r3, r1)
            goto L_0x02eb
        L_0x0606:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x060b:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r6 = 1
            if (r3 == 0) goto L_0x066b
            if (r3 != r6) goto L_0x06a0
            X.0eS.A00(r2)
        L_0x0617:
            X.Kmi r2 = (X.C62806Kmi) r2
            boolean r1 = r2 instanceof X.C61899KQs
            if (r1 == 0) goto L_0x064c
            java.lang.Object r5 = r0.A04
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r5 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r5
            com.instagram.common.session.UserSession r1 = r5.A0L
            X.OC6 r1 = X.C70166NyK.A00(r1)
            X.02m r4 = r1.A00
            r3 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r1 = "FOLLOWING_THREADS_MSYS_FETCH_SUCCESS"
            r4.markerPoint(r3, r1)
            X.05G r3 = r5.A0g
            java.lang.String r1 = r0.A06
            r3.Epw(r1)
            X.05G r1 = r5.A0b
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            X.KQs r2 = (X.C61899KQs) r2
            java.util.List r2 = r2.A00
            X.Ew9 r0 = new X.Ew9
            r0.<init>(r3, r2)
        L_0x0647:
            r1.Epw(r0)
            goto L_0x0cff
        L_0x064c:
            boolean r1 = r2 instanceof X.C61898KQr
            if (r1 == 0) goto L_0x069b
            java.lang.Object r3 = r0.A04
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r3 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r3
            com.instagram.common.session.UserSession r0 = r3.A0L
            X.OC6 r0 = X.C70166NyK.A00(r0)
            X.02m r2 = r0.A00
            r1 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r0 = "FOLLOWING_THREADS_MSYS_FETCH_FAILURE"
            r2.markerPoint(r1, r0)
            X.05G r1 = r3.A0Z
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            goto L_0x0647
        L_0x066b:
            X.0eS.A00(r2)
            java.lang.Object r5 = r0.A04
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r5 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r5
            com.instagram.common.session.UserSession r2 = r5.A0L
            X.OC6 r2 = X.C70166NyK.A00(r2)
            X.02m r4 = r2.A00
            r3 = 145755797(0x8b00e95, float:1.0596043E-33)
            r2 = 946(0x3b2, float:1.326E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.markerPoint(r3, r2)
            com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository r5 = r5.A0N
            java.lang.Object r4 = r0.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.String r3 = r0.A05
            java.lang.Object r2 = r0.A03
            X.EVj r2 = (X.C48091EVj) r2
            r0.A00 = r6
            java.lang.Object r2 = r5.A00(r2, r3, r4, r0)
            if (r2 != r1) goto L_0x0617
            return r1
        L_0x069b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x06a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06a5:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r5 = 1
            if (r3 == 0) goto L_0x06b3
            if (r3 == r5) goto L_0x0cbd
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06b3:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A01
            X.3t3 r2 = (X.C254793t3) r2
            if (r2 == 0) goto L_0x0cff
            X.3t0 r2 = X.C300965yF.A02(r2)
            if (r2 == 0) goto L_0x0cff
            java.lang.String r10 = r2.A00
            if (r10 == 0) goto L_0x0cff
            java.lang.Object r2 = r0.A04
            X.KWs r2 = (X.C62036KWs) r2
            java.lang.Object r3 = r0.A03
            java.util.List r3 = (java.util.List) r3
            java.lang.String r9 = r0.A06
            java.lang.String r8 = r0.A05
            com.instagram.common.session.UserSession r2 = r2.A00
            java.lang.String r7 = X.C62036KWs.A00(r3)
            r6 = 3
            X.0qQ.A0B(r9, r6)
            X.1NY r4 = X.AnonymousClass7TG.A0a(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r10}
            java.lang.String r2 = "direct_v2/threads/%s/bulk_translate/"
            r4.A0K(r2, r3)
            java.lang.String r2 = "bulk_messages"
            r4.A9m(r2, r7)
            java.lang.String r2 = "target_dialect_code"
            r4.A9m(r2, r9)
            r2 = 1831(0x727, float:2.566E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.A0G(r2, r8)
            java.lang.Class<X.CCz> r3 = X.C43781CCz.class
            java.lang.Class<X.Cxp> r2 = X.C45515Cxp.class
            X.1OC r3 = X.DbU.A0S(r4, r3, r2)
            r2 = 1790817603(0x6abdb543, float:1.1467148E26)
            X.032 r2 = r3.A05(r2, r6)
            r0.A00 = r5
            java.lang.Object r0 = X.AnonymousClass11O.A01(r0, r2)
            goto L_0x0ce1
        L_0x0713:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r5 = 2
            r3 = 1
            if (r4 == 0) goto L_0x07ee
            if (r4 == r3) goto L_0x0842
            java.lang.Object r3 = r0.A01
            X.3Ii r3 = (X.C239803Ii) r3
            X.0eS.A00(r2)
        L_0x0724:
            java.lang.Object r6 = r0.A04
            com.instagram.direct.inbox.notes.NotesRepository r6 = (com.instagram.direct.inbox.notes.NotesRepository) r6
            java.lang.Object r9 = r0.A03
            X.4zZ r9 = (X.C279864zZ) r9
            java.lang.String r10 = r9.A0H
            java.util.HashMap r1 = r6.A0H
            java.util.AbstractCollection r12 = X.JTS.A0m(r10, r1)
            java.lang.String r8 = r0.A05
            if (r8 != 0) goto L_0x073b
            r12.clear()
        L_0x073b:
            X.3lr r5 = X.C41846B3n.A0R(r3)
            r1 = 0
            if (r5 == 0) goto L_0x07ec
            java.lang.Class<X.Bie> r4 = X.C42804Bie.class
            r7 = 0
            r2 = 1943(0x797, float:2.723E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = -2128954790(0xffffffff811aba5a, float:-2.8419034E-38)
            X.3lr r4 = r5.getRequiredTreeField(r7, r3, r4, r2)
            if (r4 == 0) goto L_0x07ec
            java.lang.Class<X.69z> r3 = X.C3035969z.class
            r2 = 1829502336(0x6d0bfd80, float:2.707805E27)
            X.3lr r3 = r4.reinterpretRequired(r7, r3, r2)
            X.69z r3 = (X.C3035969z) r3
            if (r3 == 0) goto L_0x07ec
            com.instagram.common.session.UserSession r2 = r6.A0B
            X.5y4 r11 = X.AnonymousClass69P.A01(r2, r3)
            java.util.List r2 = r11.A01
            if (r2 == 0) goto L_0x076e
            r12.addAll(r2)
        L_0x076e:
            X.05G r7 = r6.A0V
        L_0x0770:
            java.lang.Object r4 = r7.getValue()
            r3 = r4
            java.util.Map r3 = (java.util.Map) r3
            java.util.List r2 = X.00k.A0a(r12)
            java.util.Map r2 = com.instagram.direct.inbox.notes.NotesRepository.A00(r10, r2, r3)
            boolean r2 = r7.AIY(r4, r2)
            if (r2 == 0) goto L_0x0770
            if (r11 == 0) goto L_0x0790
            X.4sZ r3 = r11.A00
            if (r3 == 0) goto L_0x0790
            java.util.Map r2 = r6.A0J
            r2.put(r10, r3)
        L_0x0790:
            if (r8 != 0) goto L_0x0cff
            X.Cwu r8 = new X.Cwu
            r8.<init>(r9)
            if (r5 == 0) goto L_0x0862
            java.lang.Class<X.Bie> r4 = X.C42804Bie.class
            r9 = 0
            r2 = 1943(0x797, float:2.723E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = -2128954790(0xffffffff811aba5a, float:-2.8419034E-38)
            X.3lr r4 = r5.getRequiredTreeField(r9, r3, r4, r2)
            if (r4 == 0) goto L_0x0862
            java.lang.Class<X.69z> r3 = X.C3035969z.class
            r2 = 1829502336(0x6d0bfd80, float:2.707805E27)
            X.3lr r4 = r4.reinterpretRequired(r9, r3, r2)
            if (r4 == 0) goto L_0x0862
            com.instagram.common.session.UserSession r2 = r6.A0B
            X.1E5 r3 = X.1E4.A00(r2)
            java.lang.Class<X.6A0> r2 = X.AnonymousClass6A0.class
            com.facebook.pando.TreeJNI r7 = r4.reinterpret(r2)
            X.6A0 r7 = (X.AnonymousClass6A0) r7
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
            X.1E9 r5 = new X.1E9
            r5.<init>(r3, r2, r9)
            java.util.List r2 = r7.A0q()
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x07d9:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0864
            java.lang.Object r2 = r3.next()
            com.instagram.api.schemas.NoteEmojiReactionInfoIntf r2 = (com.instagram.api.schemas.NoteEmojiReactionInfoIntf) r2
            r2.E7n(r5)
            r4.add(r2)
            goto L_0x07d9
        L_0x07ec:
            r11 = r1
            goto L_0x076e
        L_0x07ee:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A04
            com.instagram.direct.inbox.notes.NotesRepository r2 = (com.instagram.direct.inbox.notes.NotesRepository) r2
            com.instagram.direct.inbox.notes.NotesApi r4 = r2.A0C
            java.lang.Object r2 = r0.A03
            X.4zZ r2 = (X.C279864zZ) r2
            java.lang.String r10 = r2.A0H
            java.lang.String r9 = r0.A05
            r0.A00 = r3
            r15 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r2 = "note_id"
            X.0Df r6 = X.C41845B3m.A03(r6, r10, r2)
            java.lang.String r2 = "max_id"
            X.0Df.A00(r6, r9, r2)
            java.lang.String r2 = "request"
            X.1vR r9 = X.C41847B3o.A04(r6, r8, r2)
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.Bif> r13 = X.C42805Bif.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "GetInboxTrayReactionsRequest"
            r14 = 0
            java.lang.String r18 = "xdt_get_inbox_tray_reactions"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1vn r2 = r4.A00
            java.lang.Object r2 = r2.A04(r8, r0)
            if (r2 != r1) goto L_0x0845
            return r1
        L_0x0842:
            X.0eS.A00(r2)
        L_0x0845:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r4 = r2 instanceof X.C239793Ih
            if (r4 == 0) goto L_0x0896
            java.lang.Object r4 = r0.A04
            com.instagram.direct.inbox.notes.NotesRepository r4 = (com.instagram.direct.inbox.notes.NotesRepository) r4
            X.05G r4 = r4.A0W
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.A01 = r2
            r0.A00 = r5
            java.lang.Object r3 = r4.emit(r3, r0)
            if (r3 == r1) goto L_0x0d01
            r3 = r2
            goto L_0x0724
        L_0x0862:
            r7 = r1
            goto L_0x0866
        L_0x0864:
            r7.A00 = r4
        L_0x0866:
            r8.A07 = r7
            X.4zZ r5 = r8.A01()
            java.lang.String r4 = r0.A06
            if (r4 == 0) goto L_0x0cff
            X.05G r3 = r6.A0Z
            java.util.Map r0 = X.JTO.A18(r3)
            java.util.LinkedHashMap r2 = X.0Yt.A03(r0)
            java.util.Map r0 = X.JTO.A18(r3)
            java.lang.Object r0 = r0.get(r4)
            X.4zc r0 = (X.C279894zc) r0
            if (r0 == 0) goto L_0x088e
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x088e
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
        L_0x088e:
            com.instagram.direct.inbox.notes.NotesRepository.A02(r5, r6, r4, r1, r2)
            r3.Epw(r2)
            goto L_0x0cff
        L_0x0896:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0cff
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x089f:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r7 = 2
            r6 = 1
            if (r3 == 0) goto L_0x08ef
            if (r3 == r6) goto L_0x090d
            java.lang.Object r3 = r0.A01
            X.3Ii r3 = (X.C239803Ii) r3
            X.0eS.A00(r2)
        L_0x08b0:
            java.lang.Object r5 = r0.A04
            com.instagram.direct.inbox.notes.NotesRepository r5 = (com.instagram.direct.inbox.notes.NotesRepository) r5
            java.lang.Object r8 = r0.A03
            X.4zZ r8 = (X.C279864zZ) r8
            java.lang.String r9 = r8.A0H
            java.util.HashMap r1 = r5.A0H
            java.util.AbstractCollection r10 = X.JTS.A0m(r9, r1)
            java.lang.String r7 = r0.A05
            if (r7 != 0) goto L_0x08c7
            r10.clear()
        L_0x08c7:
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r6 = r3.A00
            X.CEm r6 = (X.C43820CEm) r6
            X.5y4 r1 = r6.FH3()
            java.util.List r1 = r1.A01
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x08db:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x092c
            java.lang.Object r1 = r2.next()
            com.instagram.api.schemas.NoteEmojiReactionInfoIntf r1 = (com.instagram.api.schemas.NoteEmojiReactionInfoIntf) r1
            com.instagram.api.schemas.NoteEmojiReactionInfo r1 = X.AnonymousClass69P.A00(r1)
            r3.add(r1)
            goto L_0x08db
        L_0x08ef:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A04
            com.instagram.direct.inbox.notes.NotesRepository r2 = (com.instagram.direct.inbox.notes.NotesRepository) r2
            com.instagram.direct.inbox.notes.NotesApi r5 = r2.A0C
            java.lang.Object r2 = r0.A03
            X.4zZ r2 = (X.C279864zZ) r2
            java.lang.String r2 = r2.A0H
            long r3 = java.lang.Long.parseLong(r2)
            java.lang.String r2 = r0.A05
            r0.A00 = r6
            java.lang.Object r2 = r5.A06(r2, r0, r3)
            if (r2 != r1) goto L_0x0910
            return r1
        L_0x090d:
            X.0eS.A00(r2)
        L_0x0910:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r3 = r2 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x098e
            java.lang.Object r3 = r0.A04
            com.instagram.direct.inbox.notes.NotesRepository r3 = (com.instagram.direct.inbox.notes.NotesRepository) r3
            X.05G r4 = r3.A0W
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            r0.A01 = r2
            r0.A00 = r7
            java.lang.Object r3 = r4.emit(r3, r0)
            if (r3 == r1) goto L_0x0d01
            r3 = r2
            goto L_0x08b0
        L_0x092c:
            r10.addAll(r3)
            X.05G r4 = r5.A0V
        L_0x0931:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            java.util.Map r2 = (java.util.Map) r2
            java.util.List r1 = X.00k.A0a(r10)
            java.util.Map r1 = com.instagram.direct.inbox.notes.NotesRepository.A00(r9, r1, r2)
            boolean r1 = r4.AIY(r3, r1)
            if (r1 == 0) goto L_0x0931
            java.util.Map r2 = r5.A0J
            X.5y4 r1 = r6.FH3()
            X.4sZ r1 = r1.A00
            r2.put(r9, r1)
            if (r7 != 0) goto L_0x0cff
            X.Cwu r2 = new X.Cwu
            r2.<init>(r8)
            X.5y4 r1 = r6.FH3()
            r2.A07 = r1
            X.4zZ r4 = r2.A01()
            java.lang.String r3 = r0.A06
            if (r3 == 0) goto L_0x0cff
            X.05G r2 = r5.A0Z
            java.util.Map r0 = X.JTO.A18(r2)
            java.util.LinkedHashMap r1 = X.0Yt.A03(r0)
            java.util.Map r0 = X.JTO.A18(r2)
            java.lang.Object r0 = r0.get(r3)
            X.4zc r0 = (X.C279894zc) r0
            if (r0 == 0) goto L_0x098c
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x098c
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
        L_0x0984:
            com.instagram.direct.inbox.notes.NotesRepository.A02(r4, r5, r3, r0, r1)
            r2.Epw(r1)
            goto L_0x0cff
        L_0x098c:
            r0 = 0
            goto L_0x0984
        L_0x098e:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0cff
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0997:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r4 = 1
            if (r3 == 0) goto L_0x09a5
            if (r3 == r4) goto L_0x0cbd
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09a5:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A01
            X.07V r3 = X.JTO.A0J(r2)
            java.lang.Object r2 = r0.A03
            X.07U r2 = (X.07U) r2
            r9 = 0
            java.lang.Object r6 = r0.A04
            java.lang.String r7 = r0.A06
            java.lang.String r8 = r0.A05
            r10 = 14
            X.MGN r5 = new X.MGN
            r5.<init>((java.lang.Object) r6, (java.lang.String) r7, (java.lang.String) r8, (X.AnonymousClass4D7) r9, (int) r10)
            r0.A00 = r4
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r2, r3, r0, r5)
            goto L_0x0ce1
        L_0x09c8:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r7 = 1
            if (r3 == 0) goto L_0x0b15
            if (r3 != r7) goto L_0x0b34
            X.0eS.A00(r2)
        L_0x09d4:
            X.3Ii r2 = (X.C239803Ii) r2
            java.lang.Object r6 = r0.A04
            X.DdZ r6 = (X.DdZ) r6
            java.lang.Object r5 = r0.A03
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0b0c
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r4 = r2.A00
            X.6p5 r4 = (X.C318516p5) r4
            X.6pC r0 = r4.FH3()
            java.util.List r9 = r0.A08
            if (r9 == 0) goto L_0x0b07
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0b07
            X.6pC r0 = r4.FH3()
            java.lang.Boolean r0 = r0.A01
            boolean r20 = X.AnonymousClass7TG.A1X(r0)
            X.6pC r0 = r4.FH3()
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r0 = r0.A00
            if (r0 == 0) goto L_0x0b04
            java.lang.String r3 = r0.A02()
            java.lang.String r2 = r0.A03()
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = r0.A00()
            if (r0 != 0) goto L_0x0a1c
            java.lang.String r0 = ""
        L_0x0a1c:
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r14 = new com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse
            r14.<init>(r0, r1, r3, r2)
        L_0x0a21:
            X.6pC r0 = r4.FH3()
            java.lang.String r12 = r0.A07
            X.6pC r0 = r4.FH3()
            java.lang.Boolean r0 = r0.A03
            boolean r23 = X.AnonymousClass7TG.A1X(r0)
            X.6pC r0 = r4.FH3()
            java.lang.String r2 = r0.A04
            X.6pC r0 = r4.FH3()
            java.lang.String r1 = r0.A05
            X.6pC r0 = r4.FH3()
            java.lang.String r0 = r0.A06
            r10 = 0
            com.instagram.avatars.common.AvatarInfo r3 = new com.instagram.avatars.common.AvatarInfo
            r3.<init>(r2, r1, r0, r10)
            X.6pC r0 = r4.FH3()
            java.lang.Boolean r0 = r0.A02
            boolean r24 = X.C51972G9s.A1Z(r0)
            X.05G r4 = r6.A0E
            r2 = 0
            java.lang.Object r0 = r9.get(r2)
            X.6tD r0 = (X.C320936tD) r0
            X.6tC r0 = (X.C320926tC) r0
            java.lang.String r1 = r0.A05
            int r11 = r9.size()
            r0 = 2
            r8 = 3
            if (r11 != r8) goto L_0x0ac7
            com.instagram.common.session.UserSession r8 = r6.A09
            boolean r11 = X.DcE.A06(r8, r7)
            if (r11 == 0) goto L_0x0ac7
            java.lang.Object r11 = r9.get(r7)
            X.6tD r11 = (X.C320936tD) r11
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r15 = X.DdZ.A00(r11)
            java.lang.Object r0 = r9.get(r0)
        L_0x0a7e:
            X.6tD r0 = (X.C320936tD) r0
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r16 = X.DdZ.A00(r0)
            X.JVC r0 = r6.A0A
            java.lang.String r9 = r8.A06
            X.26t r0 = r0.A00
            X.0xa r8 = r0.A00
            java.lang.String r0 = "KEY_COIN_FLIP_INTRO_ON_PROFILE_ENALBED"
            java.lang.String r0 = X.002.A0R(r0, r9)
            boolean r21 = r8.getBoolean(r0, r7)
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r13 = new com.instagram.avatars.coinflip.AvatarCoinFlipConfig
            r22 = r2
            r19 = r12
            r18 = r3
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0aa3:
            com.instagram.common.session.UserSession r0 = r6.A09
            java.lang.String r0 = r0.A06
            if (r5 == 0) goto L_0x0aad
            boolean r2 = r5.booleanValue()
        L_0x0aad:
            X.6qM r3 = new X.6qM
            r3.<init>(r13, r1, r0, r2)
        L_0x0ab2:
            X.3Ih r2 = X.Dba.A0S(r3, r4)
        L_0x0ab6:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0cff
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0b2f
            X.05G r1 = r6.A0E
            X.KVy r0 = X.C62024KVy.A00
            r1.Epw(r0)
            goto L_0x0cff
        L_0x0ac7:
            int r8 = r9.size()
            if (r8 != r0) goto L_0x0ae4
            com.instagram.common.session.UserSession r8 = r6.A09
            boolean r0 = X.DcE.A06(r8, r7)
            if (r0 == 0) goto L_0x0ae4
            java.lang.Object r0 = r9.get(r2)
            X.6tD r0 = (X.C320936tD) r0
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r15 = X.DdZ.A00(r0)
            java.lang.Object r0 = r9.get(r7)
            goto L_0x0a7e
        L_0x0ae4:
            int r0 = r9.size()
            if (r0 != r7) goto L_0x0b02
            com.instagram.common.session.UserSession r8 = r6.A09
            boolean r0 = X.DcE.A06(r8, r7)
            if (r0 == 0) goto L_0x0b02
            java.lang.Object r0 = r9.get(r2)
            X.6tD r0 = (X.C320936tD) r0
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r15 = X.DdZ.A00(r0)
            java.lang.Object r0 = r9.get(r2)
            goto L_0x0a7e
        L_0x0b02:
            r13 = 0
            goto L_0x0aa3
        L_0x0b04:
            r14 = 0
            goto L_0x0a21
        L_0x0b07:
            X.05G r4 = r6.A0E
            X.KVy r3 = X.C62024KVy.A00
            goto L_0x0ab2
        L_0x0b0c:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0ab6
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b15:
            X.0eS.A00(r2)
            java.lang.Object r5 = r0.A01
            java.lang.Object r2 = r0.A04
            X.DdZ r2 = (X.DdZ) r2
            com.instagram.common.session.UserSession r4 = r2.A09
            java.lang.String r3 = r0.A06
            java.lang.String r2 = r0.A05
            r0.A01 = r5
            r0.A00 = r7
            java.lang.Object r2 = X.JVC.A00(r4, r3, r2, r0)
            if (r2 != r1) goto L_0x09d4
            return r1
        L_0x0b2f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b34:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b39:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r4 = 2
            r9 = 1
            if (r3 == 0) goto L_0x0b73
            if (r3 != r9) goto L_0x0cbd
            X.0eS.A00(r2)
        L_0x0b46:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r3 = r2 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x0bcb
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r2 = r2.A00
            X.Gyt r2 = (X.C54070Gyt) r2
            boolean r2 = r2.A04
            if (r2 == 0) goto L_0x0bcb
            java.lang.Object r11 = r0.A04
            X.6iS r11 = (X.C314556iS) r11
            X.0V2 r8 = r11.A0C
            java.lang.Object r12 = r0.A01
            java.lang.String r14 = r0.A05
            java.lang.String r13 = r0.A06
            java.lang.Object r10 = r0.A03
            r15 = 0
            X.MJJ r9 = new X.MJJ
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.Lw7 r7 = new X.Lw7
            r7.<init>(r9)
            r0.A00 = r4
            goto L_0x0cdd
        L_0x0b73:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A04
            X.6iS r2 = (X.C314556iS) r2
            java.lang.Object r3 = r0.A03
            X.1Xj r3 = (X.1Xj) r3
            com.instagram.common.session.UserSession r2 = r2.A04
            java.lang.String r8 = r0.A06
            r0.A00 = r9
            java.lang.String r7 = X.LKN.A00(r2)
            if (r7 != 0) goto L_0x0b94
            java.lang.String r7 = X.AnonymousClass7TF.A0b()
            X.LKN.A01(r2, r7)
            X.0qQ.A07(r7)
        L_0x0b94:
            java.lang.String r6 = r3.getId()
            X.1NY r5 = X.AnonymousClass7TG.A0a(r2)
            r2 = 3553(0xde1, float:4.979E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r5.A0A(r2)
            java.lang.Class<X.Gyt> r3 = X.C54070Gyt.class
            java.lang.Class<X.HwZ> r2 = X.C56322HwZ.class
            r5.A0Q(r3, r2)
            java.lang.String r2 = "comment_text"
            r5.A9m(r2, r8)
            X.JTO.A1W(r5, r6)
            r2 = 2905(0xb59, float:4.071E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r5.A9m(r2, r7)
            X.1OC r3 = X.DbT.A0U(r5, r9)
            r2 = 304392270(0x1224a84e, float:5.1956727E-28)
            java.lang.Object r2 = r3.A00(r2, r0)
            if (r2 != r1) goto L_0x0b46
            return r1
        L_0x0bcb:
            java.lang.Object r4 = r0.A04
            X.6iS r4 = (X.C314556iS) r4
            java.lang.Object r3 = r0.A01
            X.9JK r3 = (X.AnonymousClass9JK) r3
            java.lang.String r2 = r0.A05
            java.lang.String r1 = r0.A06
            java.lang.Object r0 = r0.A03
            X.1Xj r0 = (X.1Xj) r0
            X.C314556iS.A00(r3, r0, r4, r2, r1)
            goto L_0x0cff
        L_0x0be0:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r5 = 1
            if (r3 == 0) goto L_0x0c8c
            if (r3 != r5) goto L_0x0caa
            X.0eS.A00(r2)
        L_0x0bec:
            X.3Ii r2 = (X.C239803Ii) r2
            java.lang.Object r7 = r0.A04
            X.KWf r7 = (X.C62029KWf) r7
            java.lang.Object r6 = r0.A01
            com.instagram.common.typedurl.ImageUrl r6 = (com.instagram.common.typedurl.ImageUrl) r6
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0c83
            X.3lr r4 = X.C41846B3n.A0R(r2)
            if (r4 == 0) goto L_0x0c51
            java.lang.Class<X.C54> r3 = X.C54.class
            r8 = 0
            r1 = 4228(0x1084, float:5.925E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 646548066(0x26898a62, float:9.543793E-16)
            X.3lr r4 = r4.getRequiredTreeField(r8, r2, r3, r1)
            if (r4 == 0) goto L_0x0c51
            java.lang.Class<X.C53> r3 = X.C53.class
            r1 = 4030(0xfbe, float:5.647E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = -1998794135(0xffffffff88dcd269, float:-1.3290236E-33)
            X.3lr r2 = r4.getOptionalTreeField(r8, r2, r3, r1)
            if (r2 == 0) goto L_0x0c51
            java.lang.String r1 = "strong_id__"
            java.lang.String r4 = r2.getRequiredStringField(r8, r1)
            if (r4 == 0) goto L_0x0c51
            android.content.Context r3 = X.C60960kU.A00
            X.0qQ.A07(r3)
            X.6ap r2 = X.DbS.A0a()
            r1 = 2131952452(0x7f130344, float:1.9541347E38)
            X.DbS.A19(r3, r2, r1)
            r1 = 2131975851(0x7f135eab, float:1.9588806E38)
            X.DbW.A0q(r3, r2, r1)
            r2.A0L = r5
            r2.A09 = r6
            r2.A03()
            X.KSI r1 = new X.KSI
            r1.<init>(r7, r4)
            r2.A0A = r1
            X.DbY.A1N(r2)
        L_0x0c51:
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x0c55:
            java.lang.String r4 = r0.A06
            java.lang.String r3 = r0.A05
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0cff
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0ca5
            android.content.Context r2 = X.C60960kU.A00
            X.0qQ.A07(r2)
            X.6ap r1 = X.DbS.A0a()
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            X.DbS.A19(r2, r1, r0)
            r0 = 2131972371(0x7f135113, float:1.9581748E38)
            X.DbW.A0q(r2, r1, r0)
            r1.A0L = r5
            X.KSJ r0 = new X.KSJ
            r0.<init>(r6, r7, r4, r3)
            r1.A0A = r0
            X.DbY.A1N(r1)
            goto L_0x0cff
        L_0x0c83:
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0c55
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0c8c:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A04
            X.KWf r2 = (X.C62029KWf) r2
            X.1vn r3 = r2.A00
            java.lang.Object r2 = r0.A03
            X.1Ef r2 = (X.1Ef) r2
            X.0qQ.A0A(r2)
            r0.A00 = r5
            java.lang.Object r2 = r3.A04(r2, r0)
            if (r2 != r1) goto L_0x0bec
            return r1
        L_0x0ca5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0caa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0caf:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r6 = 1
            if (r3 == 0) goto L_0x0cc1
            if (r3 == r6) goto L_0x0cbd
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0cbd:
            X.0eS.A00(r2)
            goto L_0x0cff
        L_0x0cc1:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A04
            X.JjB r2 = (X.C60310JjB) r2
            X.0V2 r8 = r2.A0I
            java.lang.Object r5 = r0.A01
            X.3uh r5 = (X.C255773uh) r5
            java.lang.String r4 = r0.A05
            java.lang.String r3 = r0.A06
            java.lang.Object r2 = r0.A03
            X.6gd r2 = (X.C313556gd) r2
            X.Kf8 r7 = new X.Kf8
            r7.<init>(r5, r2, r4, r3)
            r0.A00 = r6
        L_0x0cdd:
            java.lang.Object r0 = r8.emit(r7, r0)
        L_0x0ce1:
            if (r0 != r1) goto L_0x0cff
            return r1
        L_0x0ce4:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r5 = 1
            if (r3 == 0) goto L_0x0d1d
            if (r3 != r5) goto L_0x0d7d
            X.0eS.A00(r2)
        L_0x0cf0:
            boolean r1 = r2 instanceof X.KVt
            if (r1 == 0) goto L_0x0d02
            java.lang.Object r0 = r0.A04
            X.LDn r0 = (X.C63930LDn) r0
            X.MUX r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0cfc:
            r1.DJm(r0)
        L_0x0cff:
            X.0gF r1 = X.C60340gF.A00
        L_0x0d01:
            return r1
        L_0x0d02:
            boolean r1 = r2 instanceof X.C62020KVu
            if (r1 == 0) goto L_0x0d0f
            java.lang.Object r0 = r0.A04
            X.LDn r0 = (X.C63930LDn) r0
            X.MUX r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0cfc
        L_0x0d0f:
            boolean r1 = r2 instanceof X.C62021KVv
            if (r1 == 0) goto L_0x0cff
            java.lang.Object r0 = r0.A04
            X.LDn r0 = (X.C63930LDn) r0
            X.MUX r0 = r0.A02
            r0.DJn()
            goto L_0x0cff
        L_0x0d1d:
            X.0eS.A00(r2)
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.lang.Object r6 = r0.A01
            X.1iA r6 = (X.1iA) r6
            X.JTR.A1N(r6, r7)
            java.lang.String r4 = r0.A06
            java.lang.String r2 = "upload_id"
            r7.put(r2, r4)
            java.lang.Object r8 = r0.A04
            X.LDn r8 = (X.C63930LDn) r8
            com.instagram.common.session.UserSession r2 = r8.A01
            java.lang.String r3 = r2.A06
            java.lang.String r2 = "ig_user_id"
            r7.put(r2, r3)
            java.lang.String r3 = r8.A03
            if (r3 == 0) goto L_0x0d48
            java.lang.String r2 = "product"
            r7.put(r2, r3)
        L_0x0d48:
            com.facebook.smartcapture.logging.AuthenticityUploadMedium r2 = r8.A00
            if (r2 == 0) goto L_0x0d59
            java.lang.String r3 = r2.getValue()
            r2 = 914(0x392, float:1.281E-42)
            java.lang.String r2 = X.Pxd.A00(r2)
            r7.put(r2, r3)
        L_0x0d59:
            com.instagram.pendingmedia.service.upload.FbUploaderUtil r9 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A00
            java.lang.Object r10 = r0.A03
            X.SmU r10 = (X.C12075SmU) r10
            java.lang.String r3 = r8.A04
            X.Lb3 r11 = new X.Lb3
            r11.<init>()
            java.lang.String r2 = r0.A05
            X.L4y r12 = X.C64171LRw.A02(r6, r2, r7)
            r0.A00 = r5
            r17 = 0
            java.lang.String r15 = ""
            r13 = r3
            r14 = r4
            r16 = r0
            java.lang.Object r2 = r9.A05(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r2 != r1) goto L_0x0cf0
            return r1
        L_0x0d7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JVS) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JVS(Object obj, Object obj2, String str, String str2, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A02 = i;
        this.A04 = obj;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = obj2;
    }
}
