package X;

/* renamed from: X.9Mu  reason: invalid class name and case insensitive filesystem */
public final class C377689Mu extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377689Mu(Object obj, Object obj2, String str, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: X.3WR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: X.3lr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v88, resolved type: X.3WR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: X.3WR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x039f, code lost:
        r1.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r0 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r90 = this;
            r4 = r90
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x001d;
                case 2: goto L_0x040d;
                case 3: goto L_0x041c;
                case 4: goto L_0x0007;
                case 5: goto L_0x0007;
                case 6: goto L_0x0074;
                case 7: goto L_0x023c;
                case 8: goto L_0x029e;
                case 9: goto L_0x02fa;
                case 10: goto L_0x034f;
                case 11: goto L_0x03a4;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03fe;
                case 14: goto L_0x042b;
                case 15: goto L_0x0460;
                case 16: goto L_0x04be;
                case 17: goto L_0x06a8;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A02
            X.5vk r0 = (X.C299725vk) r0
            if (r0 == 0) goto L_0x001a
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x001a
            java.lang.Object r1 = r4.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r4.A03
            r1.DqO(r0, r2)
        L_0x001a:
            X.0gF r4 = X.C60340gF.A00
        L_0x001c:
            return r4
        L_0x001d:
            java.lang.Object r2 = r4.A02
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r1 = r4.A03
            java.lang.Object r0 = r4.A01
            java.lang.Class r0 = (java.lang.Class) r0
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r1, r0)
            X.3lr r1 = (X.C250663lr) r1
            r4 = 0
            if (r1 == 0) goto L_0x001c
            boolean r0 = X.AnonymousClass1vU.A00
            if (r0 == 0) goto L_0x005a
            boolean r0 = r1.areAllSelectionsOptionalOrNonnull()
            if (r0 != 0) goto L_0x005a
            return r4
        L_0x003b:
            java.lang.Object r2 = r4.A02
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r1 = r4.A03
            java.lang.Object r0 = r4.A01
            java.lang.Class r0 = (java.lang.Class) r0
            com.google.common.collect.ImmutableList r1 = r2.getOptionalTreeList(r1, r0)
            r4 = 0
            if (r1 == 0) goto L_0x001c
            boolean r0 = X.AnonymousClass1vU.A00
            if (r0 == 0) goto L_0x005a
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x005b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            return r1
        L_0x005b:
            java.util.Iterator r2 = r1.iterator()
        L_0x005f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r2.next()
            X.3lr r0 = (X.C250663lr) r0
            boolean r0 = r0.areAllSelectionsOptionalOrNonnull()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005f
            return r4
        L_0x0074:
            java.lang.Object r5 = r4.A02
            com.instagram.common.uigraph.UiGraph r5 = (com.instagram.common.uigraph.UiGraph) r5
            java.lang.String r3 = r4.A03
            java.lang.Object r4 = r4.A01
            X.3Vr r4 = (X.C242723Vr) r4
            java.util.Map r0 = r5.A04
            java.lang.Object r12 = r0.get(r3)
            X.3Vc r12 = (X.C242593Vc) r12
            if (r12 == 0) goto L_0x015c
            X.0sP r8 = r5.A07
            r11 = 0
            X.0qQ.A0B(r4, r11)
            r0 = 1
            X.0qQ.A0B(r8, r0)
            boolean r0 = X.AnonymousClass9IN.A00(r0, r4)
            if (r0 == 0) goto L_0x00e4
            r2 = r4
            X.9IN r2 = (X.AnonymousClass9IN) r2
            int r10 = r2.A02
            int r9 = r2.A01
            if (r10 < 0) goto L_0x0146
            if (r9 < 0) goto L_0x0146
            java.util.List r7 = r12.A04
            monitor-enter(r7)
            X.C242593Vc.A00(r12, r10, r9)     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r7.get(r10)     // Catch:{ all -> 0x06bf }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x06bf }
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x06bf }
            X.3Vs r1 = (X.C242733Vs) r1     // Catch:{ all -> 0x06bf }
            X.3Vx r0 = new X.3Vx     // Catch:{ all -> 0x06bf }
            r0.<init>(r2)     // Catch:{ all -> 0x06bf }
            r1.A01 = r0     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r2.A03     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r8.invoke(r0)     // Catch:{ all -> 0x06bf }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x06bf }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x06bf }
        L_0x00c8:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x06bf }
            if (r0 == 0) goto L_0x0219
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x06bf }
            if (r2 == 0) goto L_0x00c8
            java.util.Map r1 = r12.A05     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r7.get(r10)     // Catch:{ all -> 0x06bf }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x06bf }
            r1.put(r2, r0)     // Catch:{ all -> 0x06bf }
            goto L_0x00c8
        L_0x00e4:
            boolean r0 = X.AnonymousClass9IN.A00(r11, r4)
            if (r0 == 0) goto L_0x0168
            r2 = r4
            X.9IN r2 = (X.AnonymousClass9IN) r2
            int r10 = r2.A02
            int r9 = r2.A01
            if (r10 < 0) goto L_0x0146
            if (r9 < 0) goto L_0x0146
            java.util.List r7 = r12.A04
            monitor-enter(r7)
            X.C242593Vc.A00(r12, r10, r9)     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r7.get(r10)     // Catch:{ all -> 0x06bf }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x06bf }
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x06bf }
            X.3Vs r1 = (X.C242733Vs) r1     // Catch:{ all -> 0x06bf }
            X.9VW r0 = new X.9VW     // Catch:{ all -> 0x06bf }
            r0.<init>(r2)     // Catch:{ all -> 0x06bf }
            r1.A01 = r0     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r2.A03     // Catch:{ all -> 0x06bf }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x06bf }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x06bf }
        L_0x0116:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x06bf }
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r8.invoke(r0)     // Catch:{ all -> 0x06bf }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x06bf }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x06bf }
        L_0x012a:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x06bf }
            if (r0 == 0) goto L_0x0116
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x06bf }
            if (r2 == 0) goto L_0x012a
            java.util.Map r1 = r12.A05     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r7.get(r10)     // Catch:{ all -> 0x06bf }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x06bf }
            r1.put(r2, r0)     // Catch:{ all -> 0x06bf }
            goto L_0x012a
        L_0x0146:
            X.0fA r2 = r12.A01
            r1 = 817901863(0x30c03127, float:1.3983809E-9)
            java.lang.String r0 = "Invalid coordinates"
            X.0f9 r1 = r2.AEf(r0, r1)
            java.lang.String r0 = "row"
            r1.ABO(r0, r10)
            java.lang.String r0 = "column"
            r1.ABO(r0, r9)
            goto L_0x0189
        L_0x015c:
            X.0fA r2 = r5.A03
            r1 = 817901863(0x30c03127, float:1.3983809E-9)
            java.lang.String r0 = "Missing surface"
            X.0f9 r1 = r2.AEf(r0, r1)
            goto L_0x0189
        L_0x0168:
            boolean r0 = r4 instanceof X.AnonymousClass4FT
            if (r0 == 0) goto L_0x06c5
            r13 = r4
            X.4FT r13 = (X.AnonymousClass4FT) r13
            int r10 = r13.A01
            r14 = 0
            if (r10 >= 0) goto L_0x018e
            X.0fA r2 = r12.A01
            r1 = 817901863(0x30c03127, float:1.3983809E-9)
            java.lang.String r0 = "Invalid coordinates"
            X.0f9 r1 = r2.AEf(r0, r1)
            java.lang.String r0 = "row"
            r1.ABO(r0, r10)
            java.lang.String r0 = "column"
            r1.ABO(r0, r11)
        L_0x0189:
            r1.report()
            goto L_0x021a
        L_0x018e:
            java.util.List r6 = r12.A04
            monitor-enter(r6)
            X.C242593Vc.A00(r12, r10, r11)     // Catch:{ all -> 0x06c2 }
            java.util.List r9 = r13.A02     // Catch:{ all -> 0x06c2 }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x06c2 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0208
            java.lang.Object r0 = r6.get(r10)     // Catch:{ all -> 0x06c2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x06c2 }
            java.lang.Object r7 = r0.get(r11)     // Catch:{ all -> 0x06c2 }
            X.3Vs r7 = (X.C242733Vs) r7     // Catch:{ all -> 0x06c2 }
            X.Tnz r2 = r12.A00     // Catch:{ all -> 0x06c2 }
            X.0fA r1 = r12.A01     // Catch:{ all -> 0x06c2 }
            X.4FU r0 = new X.4FU     // Catch:{ all -> 0x06c2 }
            r0.<init>(r2, r1, r13, r8)     // Catch:{ all -> 0x06c2 }
            r7.A01 = r0     // Catch:{ all -> 0x06c2 }
            java.util.Iterator r13 = r9.iterator()     // Catch:{ all -> 0x06c2 }
        L_0x01b9:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x06c2 }
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x06c2 }
            java.lang.Object r0 = r8.invoke(r0)     // Catch:{ all -> 0x06c2 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x06c2 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x06c2 }
        L_0x01cd:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x06c2 }
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x06c2 }
            if (r2 == 0) goto L_0x01cd
            java.util.Map r1 = r12.A05     // Catch:{ all -> 0x06c2 }
            java.lang.Object r0 = r6.get(r10)     // Catch:{ all -> 0x06c2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x06c2 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x06c2 }
            r1.put(r2, r0)     // Catch:{ all -> 0x06c2 }
            goto L_0x01cd
        L_0x01e9:
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x06c2 }
        L_0x01ed:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x06c2 }
            if (r0 == 0) goto L_0x0217
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x06c2 }
            int r0 = r14 + 1
            if (r14 >= 0) goto L_0x0203
            X.0sr.A1T()     // Catch:{ all -> 0x06c2 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x06c2 }
            throw r0     // Catch:{ all -> 0x06c2 }
        L_0x0203:
            r8.invoke(r1)     // Catch:{ all -> 0x06c2 }
            r14 = r0
            goto L_0x01ed
        L_0x0208:
            java.lang.Object r0 = r6.get(r10)     // Catch:{ all -> 0x06c2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x06c2 }
            java.lang.Object r1 = r0.get(r11)     // Catch:{ all -> 0x06c2 }
            X.3Vs r1 = (X.C242733Vs) r1     // Catch:{ all -> 0x06c2 }
            r0 = 0
            r1.A01 = r0     // Catch:{ all -> 0x06c2 }
        L_0x0217:
            monitor-exit(r6)
            goto L_0x021a
        L_0x0219:
            monitor-exit(r7)
        L_0x021a:
            X.1wY r1 = r5.A01
            if (r1 == 0) goto L_0x001a
            X.1ws r0 = r1.A0A
            boolean r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x0237
            X.1Rm r0 = X.1Rm.A00()
            java.lang.String r0 = r0.A00
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x001a
            X.1wY.A03(r1, r3)
            goto L_0x001a
        L_0x0237:
            X.1wY.A01(r4, r1, r3)
            goto L_0x001a
        L_0x023c:
            java.lang.Object r7 = r4.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r4.A02
            com.instagram.common.uigraph.UiGraph r6 = (com.instagram.common.uigraph.UiGraph) r6
            java.lang.String r4 = r4.A03
            java.util.Iterator r5 = r7.iterator()
        L_0x024a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0266
            java.lang.Object r3 = r5.next()
            r2 = 1
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0qQ.A0B(r3, r2)
            r1 = 6
            X.9Mu r0 = new X.9Mu
            r0.<init>(r6, r3, r4, r1)
            com.instagram.common.uigraph.UiGraph.A00(r6, r0, r2)
            goto L_0x024a
        L_0x0266:
            X.1wY r2 = r6.A01
            if (r2 == 0) goto L_0x001a
            X.1ws r0 = r2.A0A
            boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x028a
            X.1Rm r0 = X.1Rm.A00()
            java.lang.String r0 = r0.A00
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0281
            X.1wY.A03(r2, r4)
        L_0x0281:
            X.3li r1 = r2.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.ExO(r0)
            goto L_0x001a
        L_0x028a:
            java.util.Iterator r1 = r7.iterator()
        L_0x028e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0281
            java.lang.Object r0 = r1.next()
            X.3Vr r0 = (X.C242723Vr) r0
            X.1wY.A01(r0, r2, r4)
            goto L_0x028e
        L_0x029e:
            java.lang.Object r6 = r4.A02
            com.instagram.common.uigraph.UiGraph r6 = (com.instagram.common.uigraph.UiGraph) r6
            java.util.Map r0 = r6.A04
            java.lang.String r5 = r4.A03
            java.lang.Object r2 = r0.get(r5)
            X.3Vc r2 = (X.C242593Vc) r2
            r3 = 1
            if (r2 == 0) goto L_0x02dc
            X.0sP r1 = r6.A06
            java.lang.Object r0 = r4.A01
            java.lang.Object r0 = r1.invoke(r0)
            boolean r0 = r2.A02(r0)
            if (r0 != r3) goto L_0x02dc
        L_0x02bd:
            X.1wY r0 = r6.A00
            if (r0 == 0) goto L_0x001a
            java.lang.Object r2 = r4.A01
            X.16b r2 = (X.AnonymousClass16b) r2
            if (r3 == 0) goto L_0x02de
            X.3li r1 = r0.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.ExO(r0)
            java.lang.Object r0 = r2.AjH()
            com.instagram.common.typedurl.ImageCacheKey r0 = (com.instagram.common.typedurl.ImageCacheKey) r0
            java.lang.String r1 = r0.A03
            r0 = 1
            X.1wY.A06(r1, r0)
            goto L_0x001a
        L_0x02dc:
            r3 = 0
            goto L_0x02bd
        L_0x02de:
            X.1xz r0 = r0.A06
            if (r0 == 0) goto L_0x001a
            java.lang.Object r2 = r2.AjH()
            java.util.Map r0 = r0.A01
            java.lang.Object r1 = r0.get(r5)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L_0x039f
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.put(r5, r1)
            goto L_0x039f
        L_0x02fa:
            java.lang.Object r3 = r4.A02
            com.instagram.common.uigraph.UiGraph r3 = (com.instagram.common.uigraph.UiGraph) r3
            java.util.Map r0 = r3.A04
            java.lang.String r5 = r4.A03
            java.lang.Object r2 = r0.get(r5)
            X.3Vc r2 = (X.C242593Vc) r2
            r6 = 1
            if (r2 == 0) goto L_0x034d
            X.0sP r1 = r3.A06
            java.lang.Object r0 = r4.A01
            java.lang.Object r0 = r1.invoke(r0)
            boolean r0 = r2.A01(r0)
            if (r0 != r6) goto L_0x034d
        L_0x0319:
            X.1wY r3 = r3.A00
            if (r3 == 0) goto L_0x001a
            java.lang.Object r2 = r4.A01
            X.16b r2 = (X.AnonymousClass16b) r2
            if (r6 == 0) goto L_0x0336
            X.3li r1 = r3.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.ExO(r0)
            java.lang.Object r0 = r2.AjH()
            com.instagram.common.typedurl.ImageCacheKey r0 = (com.instagram.common.typedurl.ImageCacheKey) r0
            java.lang.String r1 = r0.A03
            r0 = 0
            X.1wY.A06(r1, r0)
        L_0x0336:
            X.1xz r0 = r3.A06
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r2.AjH()
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r5)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x001a
            r0.remove(r1)
            goto L_0x001a
        L_0x034d:
            r6 = 0
            goto L_0x0319
        L_0x034f:
            java.lang.Object r3 = r4.A02
            com.instagram.common.uigraph.UiGraph r3 = (com.instagram.common.uigraph.UiGraph) r3
            java.util.Map r0 = r3.A04
            java.lang.String r6 = r4.A03
            java.lang.Object r2 = r0.get(r6)
            X.3Vc r2 = (X.C242593Vc) r2
            r5 = 1
            if (r2 == 0) goto L_0x0387
            X.0sP r1 = r3.A08
            java.lang.Object r0 = r4.A01
            java.lang.Object r0 = r1.invoke(r0)
            boolean r0 = r2.A02(r0)
            if (r0 != r5) goto L_0x0387
        L_0x036e:
            X.1wY r3 = r3.A00
            if (r3 == 0) goto L_0x001a
            java.lang.Object r2 = r4.A01
            X.3WR r2 = (X.AnonymousClass3WR) r2
            if (r5 == 0) goto L_0x0389
            X.3li r1 = r3.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.ExO(r0)
            java.lang.String r1 = r2.A0G
            r0 = 1
            X.1wY.A04(r3, r1, r0)
            goto L_0x001a
        L_0x0387:
            r5 = 0
            goto L_0x036e
        L_0x0389:
            X.1xz r0 = r3.A06
            if (r0 == 0) goto L_0x001a
            java.util.Map r0 = r0.A02
            java.lang.Object r1 = r0.get(r6)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L_0x039f
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.put(r6, r1)
        L_0x039f:
            r1.add(r2)
            goto L_0x001a
        L_0x03a4:
            java.lang.Object r3 = r4.A02
            com.instagram.common.uigraph.UiGraph r3 = (com.instagram.common.uigraph.UiGraph) r3
            java.util.Map r0 = r3.A04
            java.lang.String r6 = r4.A03
            java.lang.Object r2 = r0.get(r6)
            X.3Vc r2 = (X.C242593Vc) r2
            r5 = 1
            if (r2 == 0) goto L_0x03ed
            X.0sP r1 = r3.A08
            java.lang.Object r0 = r4.A01
            java.lang.Object r0 = r1.invoke(r0)
            boolean r0 = r2.A01(r0)
            if (r0 != r5) goto L_0x03ed
        L_0x03c3:
            X.1wY r3 = r3.A00
            if (r3 == 0) goto L_0x001a
            java.lang.Object r2 = r4.A01
            X.3WR r2 = (X.AnonymousClass3WR) r2
            if (r5 == 0) goto L_0x03da
            X.3li r1 = r3.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.ExO(r0)
            java.lang.String r1 = r2.A0G
            r0 = 0
            X.1wY.A04(r3, r1, r0)
        L_0x03da:
            X.1xz r0 = r3.A06
            if (r0 == 0) goto L_0x001a
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r6)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x001a
            r0.remove(r2)
            goto L_0x001a
        L_0x03ed:
            r5 = 0
            goto L_0x03c3
        L_0x03ef:
            java.lang.Object r2 = r4.A02
            X.8gT r2 = (X.C361588gT) r2
            java.lang.String r1 = r4.A03
            java.lang.Object r0 = r4.A01
            X.0sP r0 = (X.0sP) r0
            X.C361588gT.A01(r2, r1, r0)
            goto L_0x001a
        L_0x03fe:
            java.lang.Object r2 = r4.A02
            X.8gT r2 = (X.C361588gT) r2
            java.lang.String r1 = r4.A03
            java.lang.Object r0 = r4.A01
            X.0sP r0 = (X.0sP) r0
            X.C361588gT.A02(r2, r1, r0)
            goto L_0x001a
        L_0x040d:
            java.lang.Object r2 = r4.A02
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r1 = r4.A03
            java.lang.Object r0 = r4.A01
            java.lang.Class r0 = (java.lang.Class) r0
            X.Cvn r4 = r2.getPaginableListEdges(r1, r0)
            return r4
        L_0x041c:
            java.lang.Object r2 = r4.A02
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r1 = r4.A03
            java.lang.Object r0 = r4.A01
            java.lang.Class r0 = (java.lang.Class) r0
            com.google.common.collect.ImmutableList r4 = r2.getTreeList(r1, r0)
            return r4
        L_0x042b:
            java.lang.Object r1 = r4.A02
            X.7WH r1 = (X.AnonymousClass7WH) r1
            X.7VS r0 = r1.A04
            java.lang.Boolean r7 = r0.A00
            java.lang.Object r5 = r4.A01
            X.7Zg r5 = (X.C333517Zg) r5
            X.7S7 r0 = r5.C6l()
            X.3sy r6 = r0.AfV()
            java.lang.String r8 = r4.A03
            X.0sa r0 = r1.A07
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            com.instagram.common.session.UserSession r3 = r1.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317835433088606(0x8106e10000165e, double:3.030883595845914E-306)
            boolean r10 = X.182.A06(r2, r3, r0)
            X.OGq r4 = new X.OGq
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x0460:
            java.lang.Object r0 = r4.A02
            X.7ZX r0 = (X.AnonymousClass7ZX) r0
            X.7L2 r9 = r0.A0F
            if (r9 != 0) goto L_0x0472
            java.lang.String r0 = "threadTheme"
        L_0x046a:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0472:
            X.7S7 r3 = r0.A0p
            android.content.Context r2 = r0.A00
            if (r2 != 0) goto L_0x047b
            java.lang.String r0 = "context"
            goto L_0x046a
        L_0x047b:
            com.instagram.common.session.UserSession r5 = r0.A0g
            java.lang.String r11 = r4.A03
            X.0eK r0 = r0.A0x
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r12 = r0.booleanValue()
            java.lang.Object r7 = r4.A01
            X.9HO r7 = (X.AnonymousClass9HO) r7
            r0 = 5
            X.0qQ.A0B(r11, r0)
            r0 = 7
            X.0qQ.A0B(r7, r0)
            X.AdV r10 = new X.AdV
            r10.<init>()
            X.7TO r6 = new X.7TO
            r6.<init>()
            r1 = 20
            X.Ply r0 = new X.Ply
            r0.<init>(r9, r1)
            X.0t0 r1 = X.AnonymousClass0eN.A01(r0)
            X.7Ri r0 = X.C331497Rf.A00(r5, r3)
            X.OFA r8 = new X.OFA
            r8.<init>(r2, r5, r0, r1)
            X.ODp r4 = new X.ODp
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L_0x04be:
            r7 = 0
            java.lang.String r21 = ""
            r13 = r21
            java.lang.String r14 = "android"
            java.lang.String r24 = "gateway.instagram.com"
            r0 = 94
            java.lang.String r17 = X.AnonymousClass000.A00(r0)
            java.lang.String r10 = r4.A03
            r5 = 0
            com.facebook.distribgw.client.DGWPersonalizationThreshold r6 = new com.facebook.distribgw.client.DGWPersonalizationThreshold
            r6.<init>(r5, r5)
            java.lang.Object r0 = r4.A02
            X.0lg r0 = (X.0lg) r0
            X.0Tu r1 = X.0Tu.A05
            r2 = 36593151428985821(0x820147002303dd, double:3.204994540259845E-306)
            long r2 = X.182.A01(r1, r0, r2)
            int r9 = (int) r2
            r8 = 10
            com.facebook.distribgw.client.DGWPersonalizationProperty r3 = new com.facebook.distribgw.client.DGWPersonalizationProperty
            r3.<init>(r8, r8, r8, r9)
            com.facebook.distribgw.client.DGWPersonalizationProperty r2 = new com.facebook.distribgw.client.DGWPersonalizationProperty
            r2.<init>(r8, r8, r8, r8)
            com.facebook.distribgw.client.DGWPersonalizationConfig r9 = new com.facebook.distribgw.client.DGWPersonalizationConfig
            r9.<init>(r6, r3, r2, r5)
            java.lang.Object r15 = r4.A01
            com.facebook.distribgw.client.ConnectivityManagerOptions r15 = (com.facebook.distribgw.client.ConnectivityManagerOptions) r15
            r2 = 2342154685666231001(0x20810147002702d9, double:4.0585282180555165E-152)
            boolean r39 = X.182.A06(r1, r0, r2)
            r2 = 36311676451947221(0x810147001e02d5, double:3.026988631371876E-306)
            boolean r48 = X.182.A06(r1, r0, r2)
            r2 = 36311676452012758(0x810147001f02d6, double:3.0269886314133216E-306)
            boolean r40 = X.182.A06(r1, r0, r2)
            r2 = 36593151429444577(0x820147002a03e1, double:3.204994540549964E-306)
            long r29 = X.182.A01(r1, r0, r2)
            r2 = 36593151429379040(0x820147002903e0, double:3.204994540508518E-306)
            long r41 = X.182.A01(r1, r0, r2)
            r2 = 36324260704956336(0x810cb9000c2fb0, double:3.0349469636475596E-306)
            boolean r44 = X.182.A06(r1, r0, r2)
            r2 = 36311676452209368(0x810147002202d8, double:3.0269886315376585E-306)
            boolean r31 = X.182.A06(r1, r0, r2)
            r2 = 36593151429116894(0x820147002503de, double:3.204994540342736E-306)
            long r25 = X.182.A01(r1, r0, r2)
            r2 = 36593151429182431(0x820147002603df, double:3.204994540384182E-306)
            long r27 = X.182.A01(r1, r0, r2)
            r2 = 36311676452602586(0x810147002802da, double:3.026988631786331E-306)
            boolean r50 = X.182.A06(r1, r0, r2)
            r2 = 36311676452799195(0x810147002b02db, double:3.0269886319106675E-306)
            boolean r60 = X.182.A06(r1, r0, r2)
            X.0qv r3 = X.0qv.A02
            android.content.Context r2 = X.C60960kU.A00
            java.lang.String r2 = r3.A04(r2)
            if (r2 == 0) goto L_0x0568
            r13 = r2
        L_0x0568:
            r2 = 36311676451291855(0x810147001402cf, double:3.0269886309574196E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            r62 = 0
            if (r2 == 0) goto L_0x0596
            com.facebook.msys.mci.JsonSerialization.initialize()
            X.1BJ r3 = X.AnonymousClass1F2.A00()
            r2 = 1903444774(0x71744326, float:1.2095283E30)
            java.io.File r2 = r3.AXT(r7, r2)
            java.lang.String r62 = r2.toString()
            X.1BJ r3 = X.AnonymousClass1F2.A00()
            r2 = 523303762(0x1f30fb52, float:3.7477337E-20)
            java.io.File r2 = r3.AXT(r7, r2)
            java.lang.String r7 = r2.toString()
        L_0x0596:
            r86 = 0
            r2 = 2342154685664527051(0x20810147000d02cb, double:4.0585282166107114E-152)
            boolean r64 = X.182.A06(r1, r0, r2)
            r2 = 36593151427478486(0x820147000c03d6, double:3.2049945393066E-306)
            long r65 = X.182.A01(r1, r0, r2)
            r2 = 36593151427675096(0x820147000f03d8, double:3.204994539430937E-306)
            long r67 = X.182.A01(r1, r0, r2)
            r2 = 36593151427609559(0x820147000e03d7, double:3.204994539389491E-306)
            long r69 = X.182.A01(r1, r0, r2)
            r2 = 36593151428264923(0x820147001803db, double:3.204994539803946E-306)
            long r71 = X.182.A01(r1, r0, r2)
            java.lang.String r73 = X.1Ch.A00()
            X.0xi r2 = X.0tS.A4E
            X.0tS r2 = r2.A00()
            java.lang.String r2 = r2.A06()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            int r3 = r2.length()
            if (r3 != 0) goto L_0x05df
            r5 = 1
        L_0x05df:
            java.lang.String r6 = "DGWClientHolder"
            if (r5 != 0) goto L_0x0616
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x060d }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x060d }
            java.util.Iterator r5 = r3.keys()     // Catch:{ JSONException -> 0x060d }
            X.0qQ.A07(r5)     // Catch:{ JSONException -> 0x060d }
        L_0x05ef:
            boolean r2 = r5.hasNext()     // Catch:{ JSONException -> 0x060d }
            if (r2 == 0) goto L_0x0606
            java.lang.Object r2 = r5.next()     // Catch:{ JSONException -> 0x060d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x060d }
            java.lang.String r4 = r3.getString(r2)     // Catch:{ JSONException -> 0x060d }
            X.0qQ.A07(r4)     // Catch:{ JSONException -> 0x060d }
            r8.put(r2, r4)     // Catch:{ JSONException -> 0x060d }
            goto L_0x05ef
        L_0x0606:
            boolean r2 = r8.isEmpty()     // Catch:{ JSONException -> 0x060d }
            if (r2 != 0) goto L_0x0616
            goto L_0x0614
        L_0x060d:
            r3 = move-exception
            java.lang.String r2 = "Sandbox overrides are not set because of a malformed JSON"
            X.0KC.A0F(r6, r2, r3)
            goto L_0x0616
        L_0x0614:
            r86 = 1
        L_0x0616:
            r16 = 0
            r75 = 200(0xc8, double:9.9E-322)
            r77 = 150(0x96, double:7.4E-322)
            r79 = 30
            r55 = 0
            r88 = 500(0x1f4, double:2.47E-321)
            com.facebook.distribgw.client.mns.MNSDGWNetworkStackConfig r61 = new com.facebook.distribgw.client.mns.MNSDGWNetworkStackConfig
            r63 = r7
            r74 = r16
            r81 = r16
            r82 = r16
            r83 = r21
            r84 = r55
            r87 = r16
            r61.<init>(r62, r63, r64, r65, r67, r69, r71, r73, r74, r75, r77, r79, r81, r82, r83, r84, r86, r87, r88)
            com.facebook.jni.HybridData r2 = com.facebook.distribgw.client.mns.MNSDGWNetworkStackWrapperHolder.initHybrid(r61)
            X.0qQ.A0A(r2)
            com.facebook.distribgw.client.mns.MNSDGWNetworkStackWrapperHolder r4 = new com.facebook.distribgw.client.mns.MNSDGWNetworkStackWrapperHolder
            r4.<init>(r2)
            r2 = 36324947899068947(0x810d5900023213, double:3.0353815479714834E-306)
            boolean r0 = X.182.A06(r1, r0, r2)
            if (r0 == 0) goto L_0x069d
            X.0eM r0 = X.AnonymousClass1vW.A02
            java.lang.Object r0 = r0.getValue()
            X.1vW r0 = (X.AnonymousClass1vW) r0
            com.facebook.realtime.common.appstate.AppStateSyncer r0 = r0.A00
        L_0x0656:
            r12 = -1
            r19 = 1800000(0x1b7740, double:8.89318E-318)
            r32 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r34 = 4629137466983448576(0x403e000000000000, double:30.0)
            r36 = 2
            r46 = 10
            com.facebook.distribgw.client.DGWClientConfig r11 = new com.facebook.distribgw.client.DGWClientConfig
            r22 = r16
            r23 = r16
            r38 = r9
            r43 = r16
            r45 = r16
            r49 = r16
            r51 = r16
            r52 = r16
            r53 = r16
            r54 = r16
            r57 = r16
            r58 = r55
            r61 = r16
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r27, r29, r31, r32, r34, r36, r38, r39, r40, r41, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r54, r55, r57, r58, r60, r61)
            com.facebook.distribgw.client.DGWClient r1 = com.facebook.distribgw.client.DGWClient.$redex_init_class
            X.0nl r1 = X.C61560nl.A00()
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r1.A00
            com.facebook.distribgw.client.DGWClient r1 = new com.facebook.distribgw.client.DGWClient
            r3 = r1
            r5 = r2
            r6 = r0
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            com.instagram.distribgw.client.DGWClientHolder r4 = new com.instagram.distribgw.client.DGWClientHolder
            r4.<init>(r1)
            return r4
        L_0x069d:
            X.0eM r0 = X.C67451ta.A02
            java.lang.Object r0 = r0.getValue()
            X.1ta r0 = (X.C67451ta) r0
            com.facebook.realtime.common.appstate.AppStateSyncer r0 = r0.A01
            goto L_0x0656
        L_0x06a8:
            java.lang.Object r2 = r4.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r4.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = r0.getApplicationContext()
            X.0qQ.A07(r1)
            java.lang.String r0 = r4.A03
            com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl r4 = new com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl
            r4.<init>(r2, r1, r0)
            return r4
        L_0x06bf:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x06c2:
            r1 = move-exception
            monitor-exit(r6)
            throw r1
        L_0x06c5:
            r0 = 2531(0x9e3, float:3.547E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377689Mu.invoke():java.lang.Object");
    }
}
