package X;

public final class MI2 extends AnonymousClass1Ek implements 0sI {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MI2(Object obj, AnonymousClass4D7 r3, int i) {
        super(5, r3);
        this.A04 = i;
        this.A05 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        int i;
        AnonymousClass4D7 r8 = (AnonymousClass4D7) obj5;
        switch (this.A04) {
            case 0:
                obj6 = this.A05;
                i = 0;
                break;
            case 1:
                obj6 = this.A05;
                i = 1;
                break;
            default:
                obj6 = this.A05;
                i = 2;
                break;
        }
        MI2 mi2 = new MI2(obj6, r8, i);
        mi2.A00 = obj;
        mi2.A01 = obj2;
        mi2.A02 = obj3;
        mi2.A03 = obj4;
        return mi2.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0191, code lost:
        if (r1 != null) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0199, code lost:
        if (r1 != null) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (X.AnonymousClass7TE.A1b(r2) == true) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (r3.A0C != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00dd, code lost:
        if (r1 != null) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x016c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x019f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r7 = r23
            int r0 = r7.A04
            X.0eS.A00(r24)
            switch(r0) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x0204;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r8 = r7.A00
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r11 = r7.A01
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r5 = r7.A02
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r4 = r7.A03
            X.JvD r4 = (X.C61013JvD) r4
            java.util.LinkedHashSet r6 = X.DbS.A0y()
            r9 = 1
            if (r11 == 0) goto L_0x006b
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r11.iterator()
        L_0x0029:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0033
            X.C61064Jw2.A00(r2, r1)
            goto L_0x0029
        L_0x0033:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r2.iterator()
        L_0x003b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r2 = r3.next()
            java.lang.String r1 = X.DbS.A0q(r2)
            if (r4 == 0) goto L_0x0057
            com.instagram.user.model.User r0 = r4.A05
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r0.getId()
        L_0x0053:
            X.DbY.A1T(r1, r0, r2, r10)
            goto L_0x003b
        L_0x0057:
            r0 = 0
            goto L_0x0053
        L_0x0059:
            java.util.Iterator r1 = r10.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r1.next()
            r6.add(r0)
            goto L_0x005d
        L_0x006b:
            java.util.LinkedHashSet r10 = X.DbS.A0y()
            java.lang.Object r3 = r7.A05
            X.Jig r3 = (X.C60284Jig) r3
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0099
            if (r11 == 0) goto L_0x0093
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r11.iterator()
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008b
            X.C61064Jw2.A00(r2, r1)
            goto L_0x0081
        L_0x008b:
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 != r9) goto L_0x0093
            goto L_0x02df
        L_0x0093:
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x0099
            goto L_0x02df
        L_0x0099:
            if (r5 == 0) goto L_0x00ad
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r5.iterator()
        L_0x00a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02db
            X.C61064Jw2.A00(r2, r1)
            goto L_0x00a3
        L_0x00ad:
            X.0sl r8 = X.0sl.A00
            goto L_0x02df
        L_0x00b1:
            java.lang.Object r4 = r7.A00
            X.JvA r4 = (X.C61010JvA) r4
            java.lang.Object r1 = r7.A01
            X.Jvz r1 = (X.C61061Jvz) r1
            java.lang.Object r2 = r7.A02
            java.lang.Object r10 = r7.A03
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r7.A05
            X.JjJ r3 = (X.C60316JjJ) r3
            X.05G r5 = r3.A0A
            r11 = 0
            if (r1 == 0) goto L_0x0134
            java.lang.String r0 = r1.A04
        L_0x00ca:
            r5.Epw(r0)
            if (r4 == 0) goto L_0x0132
            java.lang.String r0 = r4.A06
        L_0x00d1:
            java.lang.String r17 = ""
            if (r0 != 0) goto L_0x0136
            boolean r0 = r2 instanceof X.C64472LcZ
            if (r0 == 0) goto L_0x011f
            X.Lce r8 = X.C64477Lce.A00
        L_0x00db:
            X.MPk r8 = (X.C66378MPk) r8
            if (r1 == 0) goto L_0x011c
        L_0x00df:
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x011c
            X.Jx0 r7 = new X.Jx0
            r7.<init>(r0)
        L_0x00e8:
            X.MPj r7 = (X.C66377MPj) r7
            if (r1 == 0) goto L_0x0119
            java.lang.String r0 = r1.A09
            if (r0 == 0) goto L_0x0119
            X.Jx2 r9 = new X.Jx2
            r9.<init>(r0)
        L_0x00f5:
            X.MPl r9 = (X.C66379MPl) r9
            if (r1 == 0) goto L_0x0116
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x0116
            X.Jwz r6 = new X.Jwz
            r6.<init>(r0)
        L_0x0102:
            X.MPi r6 = (X.C66376MPi) r6
            boolean r15 = r2 instanceof X.C64471LcY
            if (r1 == 0) goto L_0x010c
            java.util.List r14 = r1.A0C
            if (r14 != 0) goto L_0x010e
        L_0x010c:
            X.0sn r14 = X.0sn.A00
        L_0x010e:
            X.JvA r5 = new X.JvA
            r12 = r11
            r13 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        L_0x0116:
            X.Lcb r6 = X.C64474Lcb.A00
            goto L_0x0102
        L_0x0119:
            X.Lcf r9 = X.C64478Lcf.A00
            goto L_0x00f5
        L_0x011c:
            X.Lcc r7 = X.C64475Lcc.A00
            goto L_0x00e8
        L_0x011f:
            boolean r0 = r2 instanceof X.C64471LcY
            if (r0 == 0) goto L_0x012f
            if (r1 == 0) goto L_0x012f
            com.instagram.common.typedurl.ImageUrl r0 = r1.A01
            if (r0 == 0) goto L_0x012f
            X.Jx1 r8 = new X.Jx1
            r8.<init>(r0)
            goto L_0x00df
        L_0x012f:
            X.Lcd r8 = X.C64476Lcd.A00
            goto L_0x00db
        L_0x0132:
            r0 = r11
            goto L_0x00d1
        L_0x0134:
            r0 = r11
            goto L_0x00ca
        L_0x0136:
            boolean r0 = r2 instanceof X.C64471LcY
            if (r0 == 0) goto L_0x01be
            if (r1 == 0) goto L_0x0197
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x0197
            X.Jx0 r7 = new X.Jx0
            r7.<init>(r0)
        L_0x0145:
            java.lang.String r0 = r1.A09
            if (r0 == 0) goto L_0x019c
            X.Jx2 r9 = new X.Jx2
            r9.<init>(r0)
        L_0x014e:
            if (r1 == 0) goto L_0x018f
            com.instagram.common.typedurl.ImageUrl r0 = r1.A01
            if (r0 == 0) goto L_0x018f
            X.Jx1 r8 = new X.Jx1
            r8.<init>(r0)
        L_0x0159:
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x0194
            X.Jwz r6 = new X.Jwz
            r6.<init>(r0)
        L_0x0162:
            X.05G r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            X.JvA r0 = (X.C61010JvA) r0
            if (r0 == 0) goto L_0x019f
            if (r1 == 0) goto L_0x0172
            java.util.List r4 = r1.A0C
            if (r4 != 0) goto L_0x0174
        L_0x0172:
            X.0sn r4 = X.0sn.A00
        L_0x0174:
            java.lang.String r11 = r0.A06
            java.lang.String r3 = r0.A07
            java.lang.String r2 = r0.A05
            boolean r1 = X.JTQ.A1X(r7)
            X.AnonymousClass7TF.A1B(r10, r1, r9)
            r0 = 7
            X.0qQ.A0B(r6, r0)
            X.JvA r5 = new X.JvA
            r12 = r3
            r13 = r2
            r14 = r4
            r15 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        L_0x018f:
            X.Lcd r8 = X.C64476Lcd.A00
            if (r1 == 0) goto L_0x0194
            goto L_0x0159
        L_0x0194:
            X.MPi r6 = r4.A00
            goto L_0x0162
        L_0x0197:
            X.MPj r7 = r4.A01
            if (r1 == 0) goto L_0x019c
            goto L_0x0145
        L_0x019c:
            X.MPl r9 = r4.A03
            goto L_0x014e
        L_0x019f:
            if (r1 == 0) goto L_0x01a5
            java.lang.String r0 = r1.A08
            if (r0 != 0) goto L_0x01a7
        L_0x01a5:
            r0 = r17
        L_0x01a7:
            X.Jwz r6 = new X.Jwz
            r6.<init>(r0)
            if (r1 == 0) goto L_0x01b2
            java.util.List r0 = r1.A0C
            if (r0 != 0) goto L_0x01b4
        L_0x01b2:
            X.0sn r0 = X.0sn.A00
        L_0x01b4:
            r15 = 1
            X.JvA r5 = new X.JvA
            r12 = r11
            r13 = r11
            r14 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        L_0x01be:
            X.05G r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            X.JvA r0 = (X.C61010JvA) r0
            if (r0 == 0) goto L_0x01eb
            X.MPj r7 = r0.A01
            java.lang.String r10 = r0.A04
            X.MPl r9 = r0.A03
            X.MPk r8 = r0.A02
            java.lang.String r11 = r0.A06
            java.lang.String r12 = r0.A07
            java.lang.String r13 = r0.A05
            X.MPi r6 = r0.A00
            r15 = 0
            java.util.List r14 = r0.A08
            X.0qQ.A0B(r7, r15)
            X.AnonymousClass7TG.A1U(r10, r9, r8)
            r0 = 7
            X.AnonymousClass7TF.A1G(r6, r0, r14)
            X.JvA r5 = new X.JvA
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        L_0x01eb:
            X.Lcc r14 = X.C64475Lcc.A00
            X.Lcf r16 = X.C64478Lcf.A00
            X.Lce r15 = X.C64477Lce.A00
            X.Lcb r13 = X.C64474Lcb.A00
            r22 = 0
            X.0sn r21 = X.0sn.A00
            X.JvA r5 = new X.JvA
            r12 = r5
            r18 = r11
            r19 = r11
            r20 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r5
        L_0x0204:
            java.lang.Object r5 = r7.A00
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r3 = r7.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r7.A02
            java.lang.Object r1 = r7.A03
            X.EVC r0 = X.EVC.FAILED
            if (r2 == r0) goto L_0x029a
            if (r1 == r0) goto L_0x029a
            X.EVC r0 = X.EVC.PROGRESS
            if (r2 == r0) goto L_0x02a4
            if (r1 == r0) goto L_0x02a4
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r3.iterator()
        L_0x0224:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0244
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.F0B r0 = (X.F0B) r0
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x023a
            java.lang.Object r3 = X.00k.A0J(r0)
        L_0x023a:
            boolean r0 = X.00k.A0u(r5, r3)
            if (r0 == 0) goto L_0x0224
            r4.add(r1)
            goto L_0x0224
        L_0x0244:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r10 = r4.iterator()
        L_0x024c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02b5
            java.lang.Object r9 = r10.next()
            X.F0B r9 = (X.F0B) r9
            java.lang.String r8 = r9.A00
            java.lang.String r6 = ""
            if (r8 != 0) goto L_0x025f
            r8 = r6
        L_0x025f:
            java.util.List r0 = r9.A04
            X.0qQ.A07(r0)
            java.lang.Object r4 = X.00k.A0I(r0)
            X.0qQ.A07(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2 = 0
            java.lang.String r0 = r9.A01
            if (r0 == 0) goto L_0x0298
            java.lang.Character r1 = X.JTS.A0b(r0)
        L_0x0276:
            java.lang.String r0 = r9.A02
            if (r0 == 0) goto L_0x0296
            java.lang.Character r0 = X.JTS.A0b(r0)
        L_0x027e:
            java.lang.Character[] r0 = new java.lang.Character[]{r1, r0}
            X.0qQ.A0B(r0, r2)
            java.util.List r0 = X.03t.A0I(r0)
            java.lang.String r1 = X.00k.A0P(r6, r6, r6, r0, r3)
            X.Gn4 r0 = new X.Gn4
            r0.<init>(r8, r4, r1)
            r5.add(r0)
            goto L_0x024c
        L_0x0296:
            r0 = r3
            goto L_0x027e
        L_0x0298:
            r1 = r3
            goto L_0x0276
        L_0x029a:
            java.lang.Object r0 = r7.A05
            X.DkJ r0 = (X.C46730DkJ) r0
            X.05G r5 = r0.A04
            r2 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x02ad
        L_0x02a4:
            java.lang.Object r0 = r7.A05
            X.DkJ r0 = (X.C46730DkJ) r0
            X.05G r5 = r0.A04
            r2 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x02ad:
            r0 = 55
            X.Gmi r4 = new X.Gmi
            r4.<init>(r1, r2, r2, r0)
            goto L_0x02d7
        L_0x02b5:
            java.lang.Object r2 = r7.A05
            X.DkJ r2 = (X.C46730DkJ) r2
            X.05G r1 = r2.A03
            java.lang.Object r0 = r1.getValue()
            java.util.Set r0 = (java.util.Set) r0
            r0.addAll(r5)
            X.05G r5 = r2.A04
            java.lang.Iterable r0 = X.JTO.A0x(r1)
            java.util.List r2 = X.00k.A0a(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 54
            X.Gmi r4 = new X.Gmi
            r4.<init>(r1, r3, r2, r0)
        L_0x02d7:
            r5.Epw(r4)
            goto L_0x0337
        L_0x02db:
            java.util.Set r8 = X.00k.A0k(r2)
        L_0x02df:
            r10.addAll(r8)
            if (r4 == 0) goto L_0x02ff
            boolean r1 = r4.A0K
            X.LES r0 = r3.A0A
            X.05G r0 = r0.A0O
            X.AnonymousClass7TF.A1O(r0, r1)
            X.QP7 r2 = r4.A02
            if (r2 == 0) goto L_0x02ff
            X.OCw r0 = r3.A05
            if (r0 == 0) goto L_0x02ff
            X.1aS r1 = r0.A00
            X.3xQ r0 = new X.3xQ
            r0.<init>(r2)
            r1.accept(r0)
        L_0x02ff:
            X.LES r9 = r3.A0A
            X.05G r0 = r9.A0A
            r0.Epw(r10)
            X.05G r2 = r9.A0B
            int r0 = r10.size()
            long r7 = (long) r0
            long r4 = r9.A01
            r3 = 1
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x0316
            r0 = 1
        L_0x0316:
            X.AnonymousClass7TF.A1O(r2, r0)
            X.05G r2 = r9.A0I
            boolean r0 = r9.A0t
            if (r0 == 0) goto L_0x033a
            int r1 = r10.size()
        L_0x0323:
            X.05G r0 = r9.A05
            int r0 = X.JTR.A0I(r0)
            int r1 = r1 + r0
            int r0 = r9.A00
            int r0 = r0 + -1
            if (r1 >= r0) goto L_0x0331
            r3 = 0
        L_0x0331:
            X.AnonymousClass7TF.A1O(r2, r3)
            r9.A00(r6)
        L_0x0337:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x033a:
            r1 = 0
            goto L_0x0323
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MI2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
