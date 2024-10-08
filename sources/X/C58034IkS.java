package X;

/* renamed from: X.IkS  reason: case insensitive filesystem */
public final class C58034IkS implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C58034IkS(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.util.Map r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 18
            boolean r0 = X.C66131MDj.A01(r3, r11)
            if (r0 == 0) goto L_0x002c
            r5 = r11
            X.MDj r5 = (X.C66131MDj) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r8 = 1056964608(0x3f000000, float:0.5)
            r3 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 != r3) goto L_0x0036
            java.lang.Object r10 = r5.A02
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r0 = r5.A01
            X.IkS r0 = (X.C58034IkS) r0
            goto L_0x0032
        L_0x002c:
            X.MDj r5 = new X.MDj
            r5.<init>(r9, r11, r3)
            goto L_0x0016
        L_0x0032:
            X.0eS.A00(r1)     // Catch:{ all -> 0x00ba }
            goto L_0x005c
        L_0x0036:
            java.lang.IllegalStateException r7 = X.AnonymousClass7TE.A0x()
            throw r7
        L_0x003b:
            X.0eS.A00(r1)
            java.lang.Object r0 = r9.A02     // Catch:{ all -> 0x00b7 }
            java.lang.Float r0 = X.C55213He4.A00(r0, r10)     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r2 = r9.A03     // Catch:{ all -> 0x00b7 }
            com.meta.compose.component.swipeable.SwipeableState r2 = (com.meta.compose.component.swipeable.SwipeableState) r2     // Catch:{ all -> 0x00b7 }
            float r1 = r0.floatValue()     // Catch:{ all -> 0x00b7 }
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x00b7 }
            X.5b9 r0 = (X.AnonymousClass5b9) r0     // Catch:{ all -> 0x00b7 }
            X.C51966G9m.A1P(r9, r10, r5, r3)     // Catch:{ all -> 0x00b7 }
            java.lang.Object r0 = com.meta.compose.component.swipeable.SwipeableState.A00(r0, r2, r5, r1)     // Catch:{ all -> 0x00b7 }
            if (r0 == r4) goto L_0x00af
            r0 = r9
        L_0x005c:
            java.lang.Object r4 = r0.A03
            com.meta.compose.component.swipeable.SwipeableState r4 = (com.meta.compose.component.swipeable.SwipeableState) r4
            X.5Oz r0 = r4.A04
            float r6 = X.C51971G9r.A02(r0)
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r10)
        L_0x006e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0098
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r0 = r2.getKey()
            float r0 = X.AnonymousClass7TE.A04(r0)
            float r0 = X.AnonymousClass7TE.A00(r0, r6)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            boolean r0 = X.C51970G9q.A1T(r0)
            if (r0 == 0) goto L_0x006e
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r5.put(r1, r0)
            goto L_0x006e
        L_0x0098:
            java.util.Collection r0 = r5.values()
            java.lang.Object r1 = X.00k.A0A(r0)
            if (r1 != 0) goto L_0x00a8
            X.5Oz r0 = r4.A07
            java.lang.Object r1 = r0.getValue()
        L_0x00a8:
            X.5Oz r0 = r4.A07
            r0.Epw(r1)
            X.0gF r4 = X.C60340gF.A00
        L_0x00af:
            return r4
        L_0x00b0:
            java.lang.String r0 = "The target value must have an associated anchor."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r7 = move-exception
            r0 = r9
            goto L_0x00bb
        L_0x00ba:
            r7 = move-exception
        L_0x00bb:
            java.lang.Object r4 = r0.A03
            com.meta.compose.component.swipeable.SwipeableState r4 = (com.meta.compose.component.swipeable.SwipeableState) r4
            X.5Oz r0 = r4.A04
            float r6 = X.C51971G9r.A02(r0)
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r10)
        L_0x00cd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r0 = r2.getKey()
            float r0 = X.AnonymousClass7TE.A04(r0)
            float r0 = X.AnonymousClass7TE.A00(r0, r6)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            boolean r0 = X.C51970G9q.A1T(r0)
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r5.put(r1, r0)
            goto L_0x00cd
        L_0x00f7:
            java.util.Collection r0 = r5.values()
            java.lang.Object r1 = X.00k.A0A(r0)
            if (r1 != 0) goto L_0x0107
            X.5Oz r0 = r4.A07
            java.lang.Object r1 = r0.getValue()
        L_0x0107:
            X.5Oz r0 = r4.A07
            r0.Epw(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58034IkS.A00(java.util.Map, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v147, resolved type: X.MDv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v154, resolved type: X.MDu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v169, resolved type: X.MDv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v170, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v171, resolved type: X.MDv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v172, resolved type: X.MDu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v173, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v174, resolved type: X.MDu} */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v3, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02a5, code lost:
        r0 = r3.emit(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x044d, code lost:
        X.0eS.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04cc, code lost:
        r9.A00 = 1;
        r0 = r8.emit(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04d2, code lost:
        if (r0 != r1) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04d4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x052c, code lost:
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x052e, code lost:
        r1 = r1.A05(X.C51965G9l.A0q(r0), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0538, code lost:
        if (r1 != X.1Hj.A02) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x053a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x054d, code lost:
        X.AnonymousClass7TE.A1Z(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0557, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05c0, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r25, X.AnonymousClass4D7 r26) {
        /*
            r24 = this;
            r6 = r24
            r2 = r25
            int r0 = r6.A00
            r3 = r26
            switch(r0) {
                case 0: goto L_0x0593;
                case 1: goto L_0x0508;
                case 2: goto L_0x04d5;
                case 3: goto L_0x0421;
                case 4: goto L_0x03a5;
                case 5: goto L_0x031b;
                case 6: goto L_0x02bc;
                case 7: goto L_0x0225;
                case 8: goto L_0x005c;
                case 9: goto L_0x0012;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r6.A00(r2, r3)
            return r1
        L_0x0012:
            boolean r4 = X.AnonymousClass7TE.A1a(r2)
            java.lang.Object r0 = r6.A01
            X.0sa r0 = (X.C62320sa) r0
            boolean r3 = X.C51971G9r.A1b(r0)
            java.lang.Object r2 = r6.A02
            X.0r1 r2 = (X.0r1) r2
            boolean r0 = r2.A00
            r1 = 0
            if (r3 == r0) goto L_0x0028
            r1 = 1
        L_0x0028:
            r2.A00 = r3
            java.lang.String r3 = "long_pressed"
            java.lang.Object r0 = r6.A03
            X.Hor r0 = (X.C55870Hor) r0
            if (r4 == 0) goto L_0x0051
            if (r1 != 0) goto L_0x0036
            java.lang.String r3 = "start"
        L_0x0036:
            r2 = 0
            X.Tol r1 = r0.A04
            boolean r0 = r1.A0F()
            if (r0 != 0) goto L_0x05be
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "resume"
            r1.A0C(r0, r2)
            goto L_0x05be
        L_0x004c:
            r1.A0C(r3, r2)
            goto L_0x05be
        L_0x0051:
            if (r1 != 0) goto L_0x0055
            java.lang.String r3 = "scroll"
        L_0x0055:
            X.Tol r0 = r0.A04
            r0.A0A(r3)
            goto L_0x05be
        L_0x005c:
            r7 = 9
            boolean r0 = X.C66142MDu.A02(r7, r3)
            if (r0 == 0) goto L_0x0082
            r0 = r3
            X.MDu r0 = (X.C66142MDu) r0
            int r5 = r0.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r4
            if (r1 == 0) goto L_0x0082
            int r5 = r5 - r4
            r0.A00 = r5
        L_0x0072:
            java.lang.Object r5 = r0.A02
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r4 = 1
            if (r3 == 0) goto L_0x0088
            if (r3 == r4) goto L_0x044d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0082:
            X.MDu r0 = new X.MDu
            r0.<init>(r6, r3, r7)
            goto L_0x0072
        L_0x0088:
            X.0eS.A00(r5)
            java.lang.Object r3 = r6.A02
            X.02o r3 = (X.02o) r3
            X.5GP r2 = (X.AnonymousClass5GP) r2
            boolean r5 = r2 instanceof X.KWO
            if (r5 == 0) goto L_0x00b2
            r12 = 0
            r20 = 0
            java.lang.String r17 = ""
            X.Drt r11 = new X.Drt
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r18 = r12
            r19 = r12
            r22 = r4
            r23 = r20
            r21 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00ae:
            r0.A00 = r4
            goto L_0x02a5
        L_0x00b2:
            boolean r5 = r2 instanceof X.AnonymousClass5GR
            if (r5 != 0) goto L_0x0200
            X.5GO r5 = X.AnonymousClass5GO.A00
            boolean r5 = X.0qQ.A0K(r2, r5)
            if (r5 != 0) goto L_0x0200
            boolean r5 = r2 instanceof X.AnonymousClass5GQ
            if (r5 == 0) goto L_0x0220
            X.5GQ r2 = (X.AnonymousClass5GQ) r2
            java.lang.Object r2 = r2.A00
            X.Jvm r2 = (X.C61048Jvm) r2
            java.lang.Object r7 = r2.A03
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r10 = r7.iterator()
        L_0x00d4:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x010f
            java.lang.Object r8 = r10.next()
            X.0eP r8 = (X.0eP) r8
            java.lang.Object r9 = r8.A00
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            com.instagram.common.typedurl.ImageUrl r12 = r9.Bh3()
            java.lang.String r16 = r9.getUsername()
            X.4Cl r7 = r9.A03
            java.lang.String r17 = r7.B3O()
            if (r17 != 0) goto L_0x00f8
            java.lang.String r17 = r9.getFullName()
        L_0x00f8:
            X.4Cl r7 = r9.A03
            java.lang.String r18 = r7.BxN()
            java.lang.Object r8 = r8.A01
            com.instagram.user.model.FollowStatus r8 = (com.instagram.user.model.FollowStatus) r8
            r13 = 0
            X.Glk r7 = new X.Glk
            r11 = r7
            r14 = r8
            r15 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r5.add(r7)
            goto L_0x00d4
        L_0x010f:
            java.lang.Object r12 = r6.A03
            X.DkI r12 = (X.C46729DkI) r12
            X.JwH r7 = r12.A00
            java.lang.Object r11 = r7.A01
            X.Knp r11 = (X.C62875Knp) r11
            java.lang.Object r13 = r6.A01
            android.content.Context r13 = (android.content.Context) r13
            boolean r6 = r11 instanceof X.C69217NhX
            if (r6 == 0) goto L_0x01b5
            X.NhX r11 = (X.C69217NhX) r11
            X.1Xl r10 = r11.A01
            r15 = 0
            if (r10 == 0) goto L_0x01ae
            X.1Xj r9 = r10.BPf()
            r8 = 1
            if (r9 == 0) goto L_0x01af
            boolean r6 = r9.A4S()
            if (r6 == r4) goto L_0x0136
            r8 = 0
        L_0x0136:
            com.instagram.common.session.UserSession r6 = r12.A01
            boolean r6 = X.C243353Yk.A02(r6, r9)
            if (r6 == 0) goto L_0x01af
            if (r8 != 0) goto L_0x019a
            boolean r6 = r9.A5G()
            if (r6 == 0) goto L_0x019a
            X.1Xy r6 = r9.A0C
            java.lang.Integer r6 = r6.Bd0()
            if (r6 == 0) goto L_0x01ac
            int r6 = r6.intValue()
            X.Iaq r8 = new X.Iaq
            r8.<init>(r6)
        L_0x0157:
            com.instagram.common.session.UserSession r14 = r12.A01
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.F3m r16 = X.C335997dt.A00(r14, r9, r6, r6)
        L_0x015f:
            int r11 = r11.A00
            boolean r6 = X.1sx.A0R(r10, r11)
            if (r6 == 0) goto L_0x016f
            if (r10 == 0) goto L_0x016f
            com.instagram.common.session.UserSession r6 = r12.A01
            X.GSY r15 = X.C55001HaY.A00(r13, r6, r10, r11)
        L_0x016f:
            r14 = 21
            X.JwC r12 = new X.JwC
            r17 = r9
            r18 = r8
            r13 = r12
            r13.<init>(r14, r15, r16, r17, r18)
        L_0x017b:
            java.util.HashSet r10 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r5.iterator()
        L_0x0187:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x01ca
            java.lang.Object r6 = r8.next()
            r5 = r6
            X.Glk r5 = (X.C53298Glk) r5
            java.lang.String r5 = r5.A05
            X.C51971G9r.A1O(r5, r6, r10, r9)
            goto L_0x0187
        L_0x019a:
            X.1Xy r6 = r9.A0C
            java.lang.Integer r6 = r6.CEg()
            if (r6 == 0) goto L_0x01ac
            int r6 = r6.intValue()
            X.Iar r8 = new X.Iar
            r8.<init>(r6)
            goto L_0x0157
        L_0x01ac:
            r8 = r15
            goto L_0x0157
        L_0x01ae:
            r9 = r15
        L_0x01af:
            r8 = r15
            if (r9 != 0) goto L_0x0157
            r16 = r15
            goto L_0x015f
        L_0x01b5:
            boolean r6 = r11 instanceof X.C69216NhW
            if (r6 == 0) goto L_0x021b
            r13 = 0
            r18 = 15
            r19 = 21
            X.JwC r12 = new X.JwC
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r12.<init>((X.GSY) r13, (X.1Xj) r14, (X.C49723F3m) r15, (X.JMH) r16, (kotlin.jvm.internal.DefaultConstructorMarker) r17, (int) r18, (int) r19)
            goto L_0x017b
        L_0x01ca:
            X.62P r19 = X.AnonymousClass62Q.A00(r9)
            int r9 = r2.A01
            java.lang.Object r5 = r7.A00
            X.QP4 r5 = (X.QP4) r5
            boolean r10 = r5.A01
            java.lang.Object r8 = r2.A02
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r7 = r2.A08
            java.lang.Object r6 = r2.A05
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r5 = r2.A06
            com.instagram.api.schemas.GraphGuardianContent r5 = (com.instagram.api.schemas.GraphGuardianContent) r5
            java.lang.Object r2 = r2.A07
            java.lang.Integer r2 = (java.lang.Integer) r2
            r21 = 0
            java.lang.String r17 = ""
            X.Drt r11 = new X.Drt
            r13 = r5
            r14 = r8
            r15 = r6
            r16 = r2
            r18 = r7
            r20 = r9
            r22 = r21
            r23 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00ae
        L_0x0200:
            r12 = 0
            r20 = 0
            java.lang.String r17 = ""
            X.Drt r11 = new X.Drt
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r18 = r12
            r19 = r12
            r22 = r20
            r23 = r20
            r21 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00ae
        L_0x021b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0220:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0225:
            r7 = 20
            boolean r0 = X.C66143MDv.A02(r7, r3)
            if (r0 == 0) goto L_0x024b
            r0 = r3
            X.MDv r0 = (X.C66143MDv) r0
            int r5 = r0.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r4
            if (r1 == 0) goto L_0x024b
            int r5 = r5 - r4
            r0.A00 = r5
        L_0x023b:
            java.lang.Object r5 = r0.A02
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r7 = 1
            if (r3 == 0) goto L_0x0251
            if (r3 == r7) goto L_0x044d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x024b:
            X.MDv r0 = new X.MDv
            r0.<init>(r6, r3, r7)
            goto L_0x023b
        L_0x0251:
            X.0eS.A00(r5)
            java.lang.Object r3 = r6.A02
            X.02o r3 = (X.02o) r3
            X.5GP r2 = (X.AnonymousClass5GP) r2
            boolean r8 = r2 instanceof X.KWO
            if (r8 == 0) goto L_0x0269
            java.lang.Object r4 = r6.A03
            X.H2T r4 = (X.H2T) r4
            X.05G r5 = r4.A02
            X.I1E r4 = X.I1E.A00
            r5.Epw(r4)
        L_0x0269:
            boolean r4 = r2 instanceof X.AnonymousClass5GR
            if (r4 != 0) goto L_0x02b4
            boolean r4 = r2 instanceof X.AnonymousClass5GO
            if (r4 != 0) goto L_0x02b4
            if (r8 == 0) goto L_0x02ad
            X.HLa r12 = X.C54617HLa.ERROR
        L_0x0275:
            java.lang.Object r4 = r2.A00()
            X.JwA r4 = (X.C61072JwA) r4
            if (r4 == 0) goto L_0x0283
            java.lang.Object r2 = r4.A02
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            if (r2 != 0) goto L_0x0285
        L_0x0283:
            X.0sn r2 = X.0sn.A00
        L_0x0285:
            X.62P r15 = X.AnonymousClass62Q.A00(r2)
            if (r4 == 0) goto L_0x02ab
            int r5 = r4.A01
        L_0x028d:
            java.lang.Object r4 = r6.A01
            X.GlZ r4 = (X.C53287GlZ) r4
            java.lang.Integer r13 = r4.A03
            int r2 = r4.A01
            java.lang.Integer r14 = r4.A04
            X.0qQ.A0B(r15, r7)
            X.GlZ r11 = new X.GlZ
            r17 = r2
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.A00 = r7
        L_0x02a5:
            java.lang.Object r0 = r3.emit(r11, r0)
            goto L_0x04d2
        L_0x02ab:
            r5 = 0
            goto L_0x028d
        L_0x02ad:
            boolean r4 = r2 instanceof X.AnonymousClass5GQ
            if (r4 == 0) goto L_0x02b7
            X.HLa r12 = X.C54617HLa.SUCCESS
            goto L_0x0275
        L_0x02b4:
            X.HLa r12 = X.C54617HLa.LOADING
            goto L_0x0275
        L_0x02b7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02bc:
            X.5cr r2 = (X.C289005cr) r2
            java.lang.Object r8 = r6.A01
            X.HmE r8 = (X.C55717HmE) r8
            X.5Oz r0 = r8.A02
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            if (r2 == 0) goto L_0x05be
            if (r1 == 0) goto L_0x05be
            int r7 = r1.intValue()
            if (r7 <= 0) goto L_0x05be
            java.lang.Object r0 = r6.A03
            java.util.List r0 = (java.util.List) r0
            r9 = 0
            int r0 = X.C51970G9q.A0A(r0)
            if (r7 == r0) goto L_0x05be
            long r4 = r2.A00
            java.lang.Object r0 = r6.A02
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r2 = r0.invoke(r1)
            X.Gmb r2 = (X.C53351Gmb) r2
            r1 = 1
            if (r2 == 0) goto L_0x0316
            int r0 = r2.A01
            if (r0 != r1) goto L_0x0316
            float r6 = r2.A00
            int r2 = X.C51965G9l.A04(r4)
            r0 = 2
            int r2 = r2 / r0
            int r0 = X.C289005cr.A00(r4)
            float r1 = (float) r0
            float r1 = r1 * r6
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = (float) r2
            float r0 = r0 - r1
            int r0 = X.AnonymousClass1GB.A01(r0)
            int r0 = java.lang.Math.max(r0, r9)
            androidx.compose.foundation.lazy.LazyListState r1 = r8.A00
            int r0 = -r0
            java.lang.Object r1 = r1.A04(r3, r7, r0)
            goto L_0x0536
        L_0x0316:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x031b:
            r5 = 49
            boolean r0 = X.JUG.A03(r5, r3)
            if (r0 == 0) goto L_0x0341
            r8 = r3
            X.JUG r8 = (X.JUG) r8
            int r4 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0341
            int r4 = r4 - r1
            r8.A00 = r4
        L_0x0331:
            java.lang.Object r5 = r8.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r8.A00
            r9 = 1
            if (r0 == 0) goto L_0x0347
            if (r0 == r9) goto L_0x044d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0341:
            X.JUG r8 = new X.JUG
            r8.<init>(r6, r3, r5)
            goto L_0x0331
        L_0x0347:
            X.0eS.A00(r5)
            java.lang.Object r7 = r6.A02
            X.02o r7 = (X.02o) r7
            X.Klf r2 = (X.C62741Klf) r2
            boolean r0 = r2 instanceof X.KJY
            if (r0 == 0) goto L_0x0387
            X.KJY r2 = (X.KJY) r2
            java.util.List r0 = r2.A00
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x0360:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x037b
            java.lang.Object r0 = r11.next()
            X.N49 r0 = (X.N49) r0
            java.lang.String r5 = r0.A00
            java.lang.String r4 = r0.A01
            r3 = 20
            X.N49 r0 = new X.N49
            r0.<init>(r5, r4, r3)
            r10.add(r0)
            goto L_0x0360
        L_0x037b:
            boolean r3 = r2.A01
            java.lang.Object r2 = r6.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.H8w r0 = new X.H8w
            r0.<init>(r2, r10, r3)
            goto L_0x039d
        L_0x0387:
            boolean r0 = r2 instanceof X.KJZ
            if (r0 != 0) goto L_0x0394
            boolean r0 = r2 instanceof X.JUC
            if (r0 != 0) goto L_0x0394
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0394:
            java.lang.Object r2 = r6.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.H8v r0 = new X.H8v
            r0.<init>(r2)
        L_0x039d:
            r8.A00 = r9
            java.lang.Object r0 = r7.emit(r0, r8)
            goto L_0x04d2
        L_0x03a5:
            X.JL5 r2 = (X.JL5) r2
            boolean r0 = r2 instanceof X.C56843IEq
            if (r0 != 0) goto L_0x03fd
            boolean r0 = r2 instanceof X.GPY
            if (r0 == 0) goto L_0x03cb
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r2
            X.GPY r0 = (X.GPY) r0
            X.IEq r0 = r0.A00
        L_0x03b8:
            r1.remove(r0)
        L_0x03bb:
            java.lang.Object r0 = r6.A02
            boolean r0 = X.G9w.A1b(r0)
            if (r0 == 0) goto L_0x0405
            java.lang.Object r0 = r6.A03
            X.GPP r0 = (X.GPP) r0
            X.5b4 r1 = r0.A00
            goto L_0x052c
        L_0x03cb:
            boolean r0 = r2 instanceof X.C56846IEt
            if (r0 == 0) goto L_0x03d9
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r2
            X.IEt r0 = (X.C56846IEt) r0
            X.IEq r0 = r0.A00
            goto L_0x03b8
        L_0x03d9:
            boolean r0 = r2 instanceof X.C56842IEp
            if (r0 != 0) goto L_0x03fd
            boolean r0 = r2 instanceof X.C56845IEs
            if (r0 == 0) goto L_0x03eb
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r2
            X.IEs r0 = (X.C56845IEs) r0
            X.IEp r0 = r0.A00
            goto L_0x03b8
        L_0x03eb:
            boolean r0 = r2 instanceof X.C56841IEo
            if (r0 != 0) goto L_0x03fd
            boolean r0 = r2 instanceof X.C56844IEr
            if (r0 == 0) goto L_0x03bb
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r2
            X.IEr r0 = (X.C56844IEr) r0
            X.IEo r0 = r0.A00
            goto L_0x03b8
        L_0x03fd:
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L_0x03bb
        L_0x0405:
            boolean r0 = r2 instanceof X.GPY
            if (r0 == 0) goto L_0x0419
            java.lang.Object r4 = r6.A01
            X.4Cq r4 = (X.C262224Cq) r4
            r2 = 0
            java.lang.Object r1 = r6.A03
            r0 = 28
            X.MG7 r3 = new X.MG7
            r3.<init>(r1, r2, r0)
            goto L_0x054d
        L_0x0419:
            java.lang.Object r0 = r6.A03
            X.GPP r0 = (X.GPP) r0
            X.5b4 r1 = r0.A00
            goto L_0x0557
        L_0x0421:
            r5 = 37
            boolean r0 = X.ME4.A03(r5, r3)
            if (r0 == 0) goto L_0x0447
            r9 = r3
            X.ME4 r9 = (X.ME4) r9
            int r4 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0447
            int r4 = r4 - r1
            r9.A00 = r4
        L_0x0437:
            java.lang.Object r5 = r9.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r9.A00
            r10 = 1
            if (r0 == 0) goto L_0x0452
            if (r0 == r10) goto L_0x044d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0447:
            X.ME4 r9 = new X.ME4
            r9.<init>(r6, r3, r5)
            goto L_0x0437
        L_0x044d:
            X.0eS.A00(r5)
            goto L_0x05be
        L_0x0452:
            X.0eS.A00(r5)
            java.lang.Object r8 = r6.A02
            X.02o r8 = (X.02o) r8
            r7 = r2
            X.36g r7 = (X.C2370836g) r7
            java.lang.Object r0 = r6.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x05be
            X.GnG r0 = (X.C53384GnG) r0
            java.util.List r3 = r0.A06
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0474
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0474
            goto L_0x05be
        L_0x0474:
            java.util.Iterator r13 = r3.iterator()
        L_0x0478:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05be
            java.lang.Object r0 = r13.next()
            X.Gl5 r0 = (X.C53257Gl5) r0
            X.GlW r0 = r0.A00
            java.util.List r3 = r0.A05
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0493
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0493
            goto L_0x0478
        L_0x0493:
            java.util.Iterator r12 = r3.iterator()
        L_0x0497:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0478
            java.lang.Object r0 = r12.next()
            X.Gm6 r0 = (X.C53320Gm6) r0
            X.JRG r11 = r0.A02
            java.lang.Object r0 = r6.A03
            X.HDr r0 = (X.C54439HDr) r0
            com.instagram.common.session.UserSession r5 = r0.A02
            com.instagram.user.model.User r0 = r11.CCe(r5)
            r4 = 0
            java.lang.String r0 = X.C51968G9o.A15(r0)
            com.instagram.user.model.User r3 = r7.A00
            boolean r0 = X.DbV.A1Z(r3, r0)
            if (r0 != 0) goto L_0x04cc
            com.instagram.user.model.User r0 = r11.Bn3(r5)
            if (r0 == 0) goto L_0x04c6
            java.lang.String r4 = r0.getId()
        L_0x04c6:
            boolean r0 = X.DbV.A1Z(r3, r4)
            if (r0 == 0) goto L_0x0497
        L_0x04cc:
            r9.A00 = r10
            java.lang.Object r0 = r8.emit(r2, r9)
        L_0x04d2:
            if (r0 != r1) goto L_0x05be
            return r1
        L_0x04d5:
            boolean r4 = X.AnonymousClass7TE.A1a(r2)
            java.lang.Object r0 = r6.A01
            X.0sa r0 = (X.C62320sa) r0
            boolean r3 = X.C51971G9r.A1b(r0)
            java.lang.Object r2 = r6.A02
            X.0r1 r2 = (X.0r1) r2
            boolean r1 = r2.A00
            r0 = 0
            if (r3 == r1) goto L_0x04eb
            r0 = 1
        L_0x04eb:
            r2.A00 = r3
            java.lang.String r2 = "long_pressed"
            java.lang.Object r1 = r6.A03
            X.6D9 r1 = (X.AnonymousClass6D9) r1
            if (r4 == 0) goto L_0x04ff
            if (r0 != 0) goto L_0x04f9
            java.lang.String r2 = "start"
        L_0x04f9:
            r0 = 0
            r1.A05(r2, r0)
            goto L_0x05be
        L_0x04ff:
            if (r0 != 0) goto L_0x0503
            java.lang.String r2 = "scroll"
        L_0x0503:
            r1.A03(r2)
            goto L_0x05be
        L_0x0508:
            X.JL5 r2 = (X.JL5) r2
            boolean r0 = r2 instanceof X.C56843IEq
            if (r0 != 0) goto L_0x058b
            boolean r0 = r2 instanceof X.GPY
            if (r0 == 0) goto L_0x0559
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r2
            X.GPY r0 = (X.GPY) r0
            X.IEq r0 = r0.A00
        L_0x051b:
            r1.remove(r0)
        L_0x051e:
            java.lang.Object r0 = r6.A02
            boolean r0 = X.G9w.A1b(r0)
            if (r0 == 0) goto L_0x053b
            java.lang.Object r0 = r6.A03
            X.6Dl r0 = (X.C304436Dl) r0
            X.5b4 r1 = r0.A00
        L_0x052c:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x052e:
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
            java.lang.Object r1 = r1.A05(r0, r3)
        L_0x0536:
            X.1Hj r0 = X.1Hj.A02
            if (r1 != r0) goto L_0x05be
            return r1
        L_0x053b:
            boolean r0 = r2 instanceof X.GPY
            if (r0 == 0) goto L_0x0551
            java.lang.Object r4 = r6.A01
            X.4Cq r4 = (X.C262224Cq) r4
            r2 = 0
            java.lang.Object r1 = r6.A03
            r0 = 33
            X.MFS r3 = new X.MFS
            r3.<init>(r1, r2, r0)
        L_0x054d:
            X.AnonymousClass7TE.A1Z(r3, r4)
            goto L_0x05be
        L_0x0551:
            java.lang.Object r0 = r6.A03
            X.6Dl r0 = (X.C304436Dl) r0
            X.5b4 r1 = r0.A00
        L_0x0557:
            r0 = 0
            goto L_0x052e
        L_0x0559:
            boolean r0 = r2 instanceof X.C56846IEt
            if (r0 == 0) goto L_0x0567
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r2
            X.IEt r0 = (X.C56846IEt) r0
            X.IEq r0 = r0.A00
            goto L_0x051b
        L_0x0567:
            boolean r0 = r2 instanceof X.C56842IEp
            if (r0 != 0) goto L_0x058b
            boolean r0 = r2 instanceof X.C56845IEs
            if (r0 == 0) goto L_0x0579
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r2
            X.IEs r0 = (X.C56845IEs) r0
            X.IEp r0 = r0.A00
            goto L_0x051b
        L_0x0579:
            boolean r0 = r2 instanceof X.C56841IEo
            if (r0 != 0) goto L_0x058b
            boolean r0 = r2 instanceof X.C56844IEr
            if (r0 == 0) goto L_0x051e
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r2
            X.IEr r0 = (X.C56844IEr) r0
            X.IEo r0 = r0.A00
            goto L_0x051b
        L_0x058b:
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L_0x051e
        L_0x0593:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            java.lang.Object r3 = r6.A01
            X.5Oz r3 = (X.C284945Oz) r3
            if (r0 == 0) goto L_0x05c1
            java.lang.Object r0 = r6.A03
            java.lang.Object r2 = X.C51966G9m.A18(r0)
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r6.A02
            X.I4f r0 = (X.C56606I4f) r0
            java.lang.Object r1 = r0.A04()
            X.5Oz r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = r2.invoke(r1, r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
        L_0x05bb:
            X.C51967G9n.A16(r3, r0)
        L_0x05be:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x05c1:
            r0 = 0
            goto L_0x05bb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58034IkS.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
