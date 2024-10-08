package X;

/* renamed from: X.6SF  reason: invalid class name */
public abstract class AnonymousClass6SF {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r3 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass6SH A00(X.AnonymousClass6S4 r6, X.AnonymousClass6SH r7, X.AnonymousClass6SE r8, X.C307436Qc r9, java.util.List r10) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            X.0qQ.A0B(r8, r0)
            r0 = 4
            X.0qQ.A0B(r9, r0)
            X.4tV r5 = r8.A01
            if (r7 == 0) goto L_0x0035
            X.2TS r4 = r7.A00
            X.4tV r4 = (X.C276544tV) r4
            java.lang.Object r3 = r7.A01
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x001e
        L_0x001a:
            X.0sm r3 = X.0Yt.A0E()
        L_0x001e:
            r2 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            X.6SG r0 = new X.6SG
            r0.<init>(r6, r9, r1, r3)
            X.4tV r2 = A01(r5, r4, r0, r2)
            java.util.Map r1 = r0.A03
            X.6SH r0 = new X.6SH
            r0.<init>(r2, r1, r10)
            return r0
        L_0x0035:
            r4 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6SF.A00(X.6S4, X.6SH, X.6SE, X.6Qc, java.util.List):X.6SH");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, java.lang.RuntimeException, X.4tW] */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f2, code lost:
        if (r5.A07 == r3) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013d, code lost:
        if (r10.A02.AgE().AgI().Cfm() == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0152, code lost:
        if (r1.A05(r3) == false) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0288 A[SYNTHETIC, Splitter:B:152:0x0288] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012a A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014c A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0167 A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x019f A[Catch:{ all -> 0x028c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C276544tV A01(X.C276544tV r17, X.C276544tV r18, X.AnonymousClass6SG r19, boolean r20) {
        /*
            r5 = r18
            r3 = r17
            r4 = r19
            X.6S4 r2 = r4.A00     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            java.lang.Object r10 = r2.A01     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            if (r10 == 0) goto L_0x0295
            X.6Rm r10 = (X.C307786Rm) r10     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            int r0 = r3.A00     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0294
            int r6 = r3.A04     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            r0 = 13320(0x3408, float:1.8665E-41)
            if (r6 != r0) goto L_0x001f
            r0 = 49
            r3.A0K(r0)     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
        L_0x001f:
            if (r18 == 0) goto L_0x006b
            X.4tV r0 = r5.A07     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            if (r0 != r3) goto L_0x006b
            r8 = 0
            java.util.List r1 = r4.A02     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            boolean r0 = r1.isEmpty()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            if (r0 != 0) goto L_0x0293
            java.util.Set r7 = r3.A02     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            if (r7 != 0) goto L_0x0036
            java.util.Set r7 = java.util.Collections.emptySet()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
        L_0x0036:
            X.0qQ.A0A(r7)     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            boolean r0 = r7.isEmpty()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0293
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            if (r0 == 0) goto L_0x004c
            boolean r0 = r1.isEmpty()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            if (r0 == 0) goto L_0x004c
            return r5
        L_0x004c:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
        L_0x0050:
            boolean r0 = r1.hasNext()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            if (r0 == 0) goto L_0x0293
            java.lang.Object r0 = r1.next()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            X.Spk r0 = (X.C12230Spk) r0     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            X.0qQ.A0B(r0, r8)     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            int r0 = r0.A00     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            boolean r0 = r7.contains(r0)     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            if (r0 == 0) goto L_0x0050
        L_0x006b:
            X.6Qc r7 = r4.A01     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            X.3kJ r0 = X.1KZ.A01     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            boolean r19 = r0.isTracing()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            if (r19 == 0) goto L_0x0082
            java.lang.String r1 = "BloksResolveSubTree: "
            java.lang.String r0 = X.Q07.A02(r3)     // Catch:{ all -> 0x028c }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x028c }
            X.1KZ.A01(r0)     // Catch:{ all -> 0x028c }
        L_0x0082:
            if (r20 == 0) goto L_0x0126
            r8 = 156(0x9c, float:2.19E-43)
            r1 = 0
            if (r18 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r9 = r1
            goto L_0x0090
        L_0x008c:
            java.lang.Object r9 = X.C276544tV.A00(r5, r8)     // Catch:{ all -> 0x028c }
        L_0x0090:
            boolean r0 = r9 instanceof X.WJu     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0097
            X.WJu r9 = (X.WJu) r9     // Catch:{ all -> 0x028c }
            goto L_0x0098
        L_0x0097:
            r9 = r1
        L_0x0098:
            if (r18 == 0) goto L_0x00aa
            if (r9 != 0) goto L_0x00aa
            java.lang.String r8 = "ResolveFunction"
            java.lang.String r7 = "Could not find a previous deferred resolve node for model of style id: "
            java.lang.String r0 = " that requested to resolve lazily"
            java.lang.String r0 = X.002.A0c(r7, r0, r6)     // Catch:{ all -> 0x028c }
            X.1Kn.A00(r10, r8, r0, r1)     // Catch:{ all -> 0x028c }
            goto L_0x0126
        L_0x00aa:
            java.util.Set r10 = r3.A02     // Catch:{ all -> 0x028c }
            if (r10 != 0) goto L_0x00b2
            java.util.Set r10 = java.util.Collections.emptySet()     // Catch:{ all -> 0x028c }
        L_0x00b2:
            java.util.List r11 = r4.A02     // Catch:{ all -> 0x028c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x028c }
            r6.<init>()     // Catch:{ all -> 0x028c }
            java.util.Iterator r12 = r11.iterator()     // Catch:{ all -> 0x028c }
        L_0x00bd:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x00de
            java.lang.Object r5 = r12.next()     // Catch:{ all -> 0x028c }
            r4 = r5
            X.Spk r4 = (X.C12230Spk) r4     // Catch:{ all -> 0x028c }
            r0 = 0
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x028c }
            int r0 = r4.A00     // Catch:{ all -> 0x028c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x028c }
            boolean r0 = r10.contains(r0)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x00bd
            r6.add(r5)     // Catch:{ all -> 0x028c }
            goto L_0x00bd
        L_0x00de:
            r11.removeAll(r6)     // Catch:{ all -> 0x028c }
            if (r9 == 0) goto L_0x010e
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A07     // Catch:{ all -> 0x028c }
            boolean r0 = r0.get()     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x011f
            X.4ta r0 = r9.A01     // Catch:{ all -> 0x028c }
            java.lang.Object r0 = r0.A00()     // Catch:{ all -> 0x028c }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x028c }
            X.6SH r0 = (X.AnonymousClass6SH) r0     // Catch:{ all -> 0x028c }
            X.2TS r5 = r0.A00     // Catch:{ all -> 0x028c }
            java.lang.Object r4 = r0.A01     // Catch:{ all -> 0x028c }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x028c }
            if (r4 != 0) goto L_0x0102
            X.0sm r4 = X.0Yt.A0E()     // Catch:{ all -> 0x028c }
        L_0x0102:
            X.0sn r1 = X.0sn.A00     // Catch:{ all -> 0x028c }
        L_0x0104:
            X.VRn r0 = new X.VRn     // Catch:{ all -> 0x028c }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x028c }
            X.0eP r1 = new X.0eP     // Catch:{ all -> 0x028c }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x028c }
        L_0x010e:
            X.WJu r0 = new X.WJu     // Catch:{ all -> 0x028c }
            r9 = r0
            r10 = r2
            r11 = r3
            r12 = r7
            r13 = r6
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x028c }
            X.4tV r5 = X.Q07.A00(r3, r3, r0, r8)     // Catch:{ all -> 0x028c }
            goto L_0x0286
        L_0x011f:
            X.4tV r5 = r9.A03     // Catch:{ all -> 0x028c }
            java.util.Map r4 = r9.A06     // Catch:{ all -> 0x028c }
            java.util.List r1 = r9.A05     // Catch:{ all -> 0x028c }
            goto L_0x0104
        L_0x0126:
            r0 = 13317(0x3405, float:1.8661E-41)
            if (r6 != r0) goto L_0x013f
            r0 = 0
            X.0qQ.A0B(r10, r0)     // Catch:{ all -> 0x028c }
            X.2nJ r0 = r10.A02     // Catch:{ all -> 0x028c }
            X.2nt r0 = r0.AgE()     // Catch:{ all -> 0x028c }
            X.2nr r0 = r0.AgI()     // Catch:{ all -> 0x028c }
            boolean r0 = r0.Cfm()     // Catch:{ all -> 0x028c }
            r12 = 1
            if (r0 != 0) goto L_0x0140
        L_0x013f:
            r12 = 0
        L_0x0140:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x028c }
            X.4ts r1 = r0.A08     // Catch:{ all -> 0x028c }
            boolean r0 = X.C250563lf.A0m(r6)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0154
            boolean r0 = r1.A05(r3)     // Catch:{ all -> 0x028c }
            r18 = 1
            if (r0 != 0) goto L_0x0156
        L_0x0154:
            r18 = 0
        L_0x0156:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x028c }
            X.1KX r0 = r0.A03()     // Catch:{ all -> 0x028c }
            int[] r11 = r0.A01(r6)     // Catch:{ all -> 0x028c }
            int r10 = r11.length     // Catch:{ all -> 0x028c }
            r1 = r3
            r9 = 0
        L_0x0165:
            if (r9 >= r10) goto L_0x0189
            r8 = r11[r9]     // Catch:{ all -> 0x028c }
            X.4tV r0 = r1.A07(r8)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0186
            if (r5 == 0) goto L_0x0172
            goto L_0x0174
        L_0x0172:
            r7 = 0
            goto L_0x0178
        L_0x0174:
            X.4tV r7 = r5.A07(r8)     // Catch:{ all -> 0x028c }
        L_0x0178:
            X.4tV r6 = A01(r0, r7, r4, r12)     // Catch:{ all -> 0x028c }
            r0 = 0
            if (r6 == r7) goto L_0x0180
            r0 = 1
        L_0x0180:
            r18 = r18 | r0
            X.4tV r1 = X.Q07.A00(r1, r3, r6, r8)     // Catch:{ all -> 0x028c }
        L_0x0186:
            int r9 = r9 + 1
            goto L_0x0165
        L_0x0189:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x028c }
            X.1KX r6 = r0.A03()     // Catch:{ all -> 0x028c }
            int r0 = r1.A04     // Catch:{ all -> 0x028c }
            int[] r11 = r6.A00(r0)     // Catch:{ all -> 0x028c }
            int r0 = r11.length     // Catch:{ all -> 0x028c }
            r20 = r0
            r13 = 0
        L_0x019b:
            r0 = r20
            if (r13 >= r0) goto L_0x01eb
            r14 = r11[r13]     // Catch:{ all -> 0x028c }
            java.util.List r10 = r1.A0M(r14)     // Catch:{ all -> 0x028c }
            X.0qQ.A07(r10)     // Catch:{ all -> 0x028c }
            if (r5 == 0) goto L_0x01ab
            goto L_0x01ad
        L_0x01ab:
            r9 = 0
            goto L_0x01b1
        L_0x01ad:
            java.util.List r9 = r5.A0M(r14)     // Catch:{ all -> 0x028c }
        L_0x01b1:
            int r17 = r10.size()     // Catch:{ all -> 0x028c }
            r6 = r10
            r8 = 0
        L_0x01b7:
            r0 = r17
            if (r8 >= r0) goto L_0x01e2
            java.lang.Object r15 = r10.get(r8)     // Catch:{ all -> 0x028c }
            X.4tV r15 = (X.C276544tV) r15     // Catch:{ all -> 0x028c }
            if (r15 == 0) goto L_0x01df
            X.4tV r7 = X.Q07.A01(r15, r9, r8)     // Catch:{ all -> 0x028c }
            X.4tV r0 = A01(r15, r7, r4, r12)     // Catch:{ all -> 0x028c }
            r16 = 0
            if (r0 == r7) goto L_0x01d1
            r16 = 1
        L_0x01d1:
            r18 = r18 | r16
            if (r0 == r15) goto L_0x01df
            if (r6 != r10) goto L_0x01dc
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x028c }
            r6.<init>(r10)     // Catch:{ all -> 0x028c }
        L_0x01dc:
            r6.set(r8, r0)     // Catch:{ all -> 0x028c }
        L_0x01df:
            int r8 = r8 + 1
            goto L_0x01b7
        L_0x01e2:
            if (r6 == r10) goto L_0x01e8
            X.4tV r1 = X.Q07.A00(r1, r3, r6, r14)     // Catch:{ all -> 0x028c }
        L_0x01e8:
            int r13 = r13 + 1
            goto L_0x019b
        L_0x01eb:
            if (r18 != 0) goto L_0x01f4
            if (r5 == 0) goto L_0x01f4
            X.4tV r0 = r5.A07     // Catch:{ all -> 0x028c }
            r6 = r5
            if (r0 == r3) goto L_0x01f5
        L_0x01f4:
            r6 = r1
        L_0x01f5:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x028c }
            X.4ts r1 = r0.A08     // Catch:{ all -> 0x028c }
            int r0 = r6.A04     // Catch:{ all -> 0x028c }
            boolean r0 = X.C250563lf.A0m(r0)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0285
            boolean r0 = r1.A05(r6)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0285
            java.util.List r0 = r4.A02     // Catch:{ all -> 0x028c }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x028c }
        L_0x020f:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x023f
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x028c }
            X.Spk r9 = (X.C12230Spk) r9     // Catch:{ all -> 0x028c }
            int r1 = r9.A00     // Catch:{ all -> 0x028c }
            int r0 = r6.A03     // Catch:{ all -> 0x028c }
            if (r1 != r0) goto L_0x020f
            java.util.Map r8 = r4.A03     // Catch:{ all -> 0x028c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x028c }
            java.lang.Object r1 = r8.get(r7)     // Catch:{ all -> 0x028c }
            X.1MD r0 = r9.A01     // Catch:{ all -> 0x028c }
            java.lang.Object r0 = r0.apply(r1)     // Catch:{ all -> 0x028c }
            if (r1 == r0) goto L_0x023b
            r8.put(r7, r0)     // Catch:{ all -> 0x028c }
            java.util.Set r0 = r4.A04     // Catch:{ all -> 0x028c }
            r0.add(r7)     // Catch:{ all -> 0x028c }
        L_0x023b:
            r10.remove()     // Catch:{ all -> 0x028c }
            goto L_0x020f
        L_0x023f:
            if (r5 == 0) goto L_0x0256
            X.4tV r0 = r5.A07     // Catch:{ all -> 0x028c }
            if (r0 != r3) goto L_0x0256
            if (r6 != r3) goto L_0x0256
            int r0 = r3.A03     // Catch:{ all -> 0x028c }
            java.util.Set r1 = r4.A04     // Catch:{ all -> 0x028c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x028c }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x028c }
            if (r0 != 0) goto L_0x0256
            goto L_0x0286
        L_0x0256:
            java.util.Map r5 = r4.A03     // Catch:{ all -> 0x028c }
            int r0 = r3.A03     // Catch:{ all -> 0x028c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x028c }
            java.lang.Object r1 = r5.get(r4)     // Catch:{ all -> 0x028c }
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ all -> 0x028c }
            X.4ts r0 = r0.A08     // Catch:{ all -> 0x028c }
            android.util.Pair r2 = r0.A01(r2, r6, r1)     // Catch:{ all -> 0x028c }
            if (r2 == 0) goto L_0x0285
            java.lang.Object r1 = r2.first     // Catch:{ all -> 0x028c }
            if (r1 == 0) goto L_0x0278
            r0 = 156(0x9c, float:2.19E-43)
            X.4tV r6 = X.Q07.A00(r6, r3, r1, r0)     // Catch:{ all -> 0x028c }
        L_0x0278:
            java.lang.Object r1 = r2.second     // Catch:{ all -> 0x028c }
            if (r1 != 0) goto L_0x0282
            boolean r0 = r5.containsKey(r4)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0285
        L_0x0282:
            r5.put(r4, r1)     // Catch:{ all -> 0x028c }
        L_0x0285:
            r5 = r6
        L_0x0286:
            if (r19 == 0) goto L_0x0293
            X.1KZ.A00()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            return r5
        L_0x028c:
            r1 = move-exception
            if (r19 == 0) goto L_0x029c
            X.1KZ.A00()     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            goto L_0x029c
        L_0x0293:
            return r5
        L_0x0294:
            return r17
        L_0x0295:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
            r1.<init>(r0)     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
        L_0x029c:
            throw r1     // Catch:{ 4tW -> 0x02aa, RuntimeException -> 0x029d }
        L_0x029d:
            r0 = move-exception
            X.RhZ.A00(r3)
            X.4tW r1 = new X.4tW
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x02aa:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6SF.A01(X.4tV, X.4tV, X.6SG, boolean):X.4tV");
    }
}
