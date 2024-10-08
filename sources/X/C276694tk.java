package X;

/* renamed from: X.4tk  reason: invalid class name and case insensitive filesystem */
public final class C276694tk {
    public final C307436Qc A00;
    public final S53 A01;
    public final C10992S4m A02;
    public final C17981VjJ A03;
    public final C17981VjJ A04;

    public final C276694tk A01(C17981VjJ vjJ) {
        C17981VjJ vjJ2 = vjJ;
        if (vjJ == null) {
            vjJ2 = this.A04;
        }
        C17981VjJ vjJ3 = this.A03;
        return new C276694tk(this.A00, this.A01, this.A02, vjJ2, vjJ3);
    }

    /* JADX INFO: finally extract failed */
    public final boolean A03(C17981VjJ vjJ, long j) {
        boolean A042;
        0qQ.A0B(vjJ, 1);
        VVU A002 = vjJ.A00(j);
        if (A002 != null) {
            Object obj = A002.A00;
            Object obj2 = A00()[0];
            A00()[0] = obj;
            try {
                A02(j);
                A00()[0] = obj2;
                C17981VjJ vjJ2 = this.A03;
                synchronized (vjJ2.A01) {
                    A042 = vjJ2.A00.A04(Long.valueOf(j));
                }
                return !A042;
            } catch (Throwable th) {
                A00()[0] = obj2;
                throw th;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final Object[] A00() {
        Object obj = C51635FxT.A00.get();
        if (obj != null) {
            return (Object[]) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C276694tk(C307436Qc r1, S53 s53, C10992S4m s4m, C17981VjJ vjJ, C17981VjJ vjJ2) {
        this.A04 = vjJ;
        this.A03 = vjJ2;
        this.A01 = s53;
        this.A02 = s4m;
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.Rpo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.Vfg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.Rpo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.Rpo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: X.6TQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v49, resolved type: X.4tV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v50, resolved type: X.4tV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v51, resolved type: X.4tV} */
    /* JADX WARNING: type inference failed for: r12v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Can't wrap try/catch for region: R(28:203|(3:205|206|207)|208|(1:210)|211|212|213|214|215|(1:221)(1:219)|220|(1:(2:223|(8:394|225|(1:227)(1:229)|228|(3:232|(4:235|(1:398)(2:237|(2:239|(2:241|400)(1:399))(2:242|401))|396|233)|397)|243|(2:246|244)|402)(1:230))(5:395|247|(3:250|253|(3:403|255|(1:257)(1:268))(1:248))|404|251))|258|(2:260|(14:262|263|(2:265|(3:267|269|(3:270|(4:272|(3:274|(2:276|408)(1:409)|277)|407|(1:405))|(1:280)(1:406)))(0))(0)|281|(1:283)|288|289|(0)|311|(0)|372|(0)(0)|376|377))|252|263|(0)(0)|281|(0)|288|289|(0)|311|(0)|372|(0)(0)|376|377) */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x057e, code lost:
        if (r11.A0B() != null) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0590, code lost:
        if (r25 == false) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0599, code lost:
        if (X.1KZ.A01.isTracing() == false) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06cc, code lost:
        if (r2 == false) goto L_0x06ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06ea, code lost:
        if (r3 != r2) goto L_0x06ce;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:214:0x0434 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0445 A[Catch:{ all -> 0x058f }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x045a A[Catch:{ all -> 0x058f }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x045f A[Catch:{ all -> 0x058f }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0507 A[Catch:{ all -> 0x058f }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0517 A[Catch:{ all -> 0x058f }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0576 A[Catch:{ all -> 0x058f }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x058b A[Catch:{ Exception -> 0x05d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x04c7 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.VVU A02(long r31) {
        /*
            r30 = this;
            java.lang.Object[] r1 = A00()
            r0 = 0
            r8 = 0
            r6 = r1[r0]
            if (r6 != 0) goto L_0x000b
            r6 = 0
        L_0x000b:
            java.lang.Object[] r0 = A00()
            r7 = 3
            r26 = r0[r7]
            if (r26 != 0) goto L_0x0016
            r26 = 0
        L_0x0016:
            r0 = r26
            java.lang.Number r0 = (java.lang.Number) r0
            r26 = r0
            r10 = 0
            r0 = r31
            if (r26 == 0) goto L_0x0046
            long r3 = r26.longValue()
            int r2 = (r3 > r31 ? 1 : (r3 == r31 ? 0 : -1))
            if (r2 != 0) goto L_0x0046
            java.lang.String r4 = "Forbidden: Signal of type ["
            X.SOY r2 = X.SOY.A00
            java.lang.String r3 = r2.A01(r0)
            java.lang.String r2 = "] cannot depend on itself"
            java.lang.String r3 = X.002.A0g(r4, r3, r2)
            X.RL1 r2 = new X.RL1
            r2.<init>(r3)
            X.R9a r0 = X.SOY.A00(r2, r6, r0)
            X.VVU r4 = new X.VVU
            r4.<init>(r0, r6, r10)
            return r4
        L_0x0046:
            r9 = r30
            X.VjJ r2 = r9.A03
            r29 = r2
            X.VVU r4 = r2.A00(r0)
            java.lang.Object[] r3 = A00()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3[r7] = r2
            r5 = 1
            r16 = 0
            if (r4 == 0) goto L_0x008b
            X.SOY r17 = X.SOY.A00
            java.lang.Object r2 = r4.A01
            r18 = r9
            r19 = r6
            r20 = r2
            r21 = r0
            r23 = r5
            boolean r2 = r17.A02(r18, r19, r20, r21, r23)
            if (r2 == 0) goto L_0x008b
        L_0x0073:
            java.lang.Object[] r3 = A00()
            r2 = 1
            r2 = r3[r2]
            if (r2 != 0) goto L_0x007d
            r2 = 0
        L_0x007d:
            X.Vfg r2 = (X.C17769Vfg) r2
            if (r2 == 0) goto L_0x0084
            r2.A00(r0)
        L_0x0084:
            java.lang.Object[] r0 = A00()
            r0[r7] = r26
            return r4
        L_0x008b:
            X.VjJ r14 = r9.A04
            if (r14 == 0) goto L_0x0111
            X.VVU r4 = r14.A00(r0)
            if (r4 == 0) goto L_0x0112
            X.SOY r17 = X.SOY.A00
            java.lang.Object r11 = r4.A01
            r18 = r9
            r19 = r6
            r20 = r11
            r21 = r0
            r23 = r8
            boolean r2 = r17.A02(r18, r19, r20, r21, r23)
            if (r2 == 0) goto L_0x0112
            long[] r15 = r4.A02
            if (r15 == 0) goto L_0x00bc
            int r13 = r15.length
            r12 = 0
        L_0x00af:
            if (r12 >= r13) goto L_0x00bc
            r2 = r15[r12]
            boolean r2 = r9.A03(r14, r2)
            if (r2 == 0) goto L_0x0112
            int r12 = r12 + 1
            goto L_0x00af
        L_0x00bc:
            X.0qQ.A0B(r11, r7)
            r2 = 60
            long r2 = r31 >>> r2
            int r6 = (int) r2
            boolean r2 = X.C250563lf.A0n(r6)
            if (r2 == 0) goto L_0x06df
            if (r6 == r5) goto L_0x00eb
            r2 = 2
            if (r6 == r2) goto L_0x06df
            if (r6 == r7) goto L_0x06df
            r2 = 4
            if (r6 == r2) goto L_0x06df
            r2 = 5
            if (r6 == r2) goto L_0x06df
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            X.R9a r11 = (X.C8774R9a) r11
            java.util.List r2 = r11.A01
            if (r2 == 0) goto L_0x06df
            X.S53 r9 = r9.A01
            java.util.Map r8 = r9.A08
            if (r8 == 0) goto L_0x06df
            java.util.Iterator r6 = r2.iterator()
        L_0x00fb:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x06df
            java.lang.Object r5 = r6.next()
            java.lang.Object r3 = r8.get(r5)
            if (r3 == 0) goto L_0x00fb
            java.util.Map r2 = r9.A07
            r2.put(r5, r3)
            goto L_0x00fb
        L_0x0111:
            r4 = r10
        L_0x0112:
            X.Vfg r27 = new X.Vfg
            r27.<init>()
            java.lang.Object[] r2 = A00()
            r28 = r2[r5]
            java.lang.Object[] r2 = A00()
            r2[r5] = r27
            X.SOY r12 = X.SOY.A00     // Catch:{ Exception -> 0x05d4 }
            if (r4 == 0) goto L_0x0129
            java.lang.Object r10 = r4.A01     // Catch:{ Exception -> 0x05d4 }
        L_0x0129:
            r2 = 60
            long r2 = r31 >>> r2
            int r11 = (int) r2     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r3 = "compute"
            java.lang.String r12 = r12.A01(r0)     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r2 = " / "
            java.lang.String r3 = X.002.A0q(r3, r12, r2, r0)     // Catch:{ Exception -> 0x05d4 }
            X.3kJ r2 = X.1KZ.A01     // Catch:{ all -> 0x05c7 }
            boolean r2 = r2.isTracing()     // Catch:{ all -> 0x05c7 }
            if (r2 == 0) goto L_0x0145
            X.1KZ.A01(r3)     // Catch:{ all -> 0x05c7 }
        L_0x0145:
            boolean r2 = X.C250563lf.A0n(r11)     // Catch:{ all -> 0x05c7 }
            if (r2 == 0) goto L_0x05a7
            if (r11 == r5) goto L_0x03f0
            r2 = 2
            if (r11 == r2) goto L_0x0393
            if (r11 == r7) goto L_0x0324
            r2 = 4
            if (r11 == r2) goto L_0x01c0
            r2 = 5
            if (r11 != r2) goto L_0x05b3
            boolean r2 = r6 instanceof X.C276544tV     // Catch:{ all -> 0x05c7 }
            if (r2 == 0) goto L_0x01b7
            r11 = r6
            X.4tV r11 = (X.C276544tV) r11     // Catch:{ all -> 0x05c7 }
            if (r11 == 0) goto L_0x01b7
            X.EV7 r8 = X.EV7.LAYOUT_CONTEXT     // Catch:{ all -> 0x05c7 }
            java.lang.Object[] r3 = A00()     // Catch:{ all -> 0x05c7 }
            r2 = 2
            r3 = r3[r2]     // Catch:{ all -> 0x05c7 }
            if (r3 != 0) goto L_0x0189
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c7 }
            r3.<init>()     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = "Expected scoped data of type "
            r3.append(r2)     // Catch:{ all -> 0x05c7 }
            r3.append(r8)     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = " but was not found"
            r3.append(r2)     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x05c7 }
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05c7 }
            r8.<init>(r2)     // Catch:{ all -> 0x05c7 }
            goto L_0x05c6
        L_0x0189:
            X.3c0 r3 = (X.C244943c0) r3     // Catch:{ all -> 0x05c7 }
            X.1Kj r2 = X.C64361Kj.A00()     // Catch:{ all -> 0x05c7 }
            X.4ts r2 = r2.A08     // Catch:{ all -> 0x05c7 }
            java.lang.Object r3 = r3.A05     // Catch:{ all -> 0x05c7 }
            X.6Rm r3 = (X.C307786Rm) r3     // Catch:{ all -> 0x05c7 }
            X.2Th r2 = r2.A03(r3, r11)     // Catch:{ all -> 0x05c7 }
            X.2Th r10 = r11.A06(r2, r3)     // Catch:{ all -> 0x05c7 }
            if (r10 == 0) goto L_0x01b0
            long r12 = r10.A0H()     // Catch:{ all -> 0x05c7 }
            int r2 = r11.A03     // Catch:{ all -> 0x05c7 }
            long r2 = (long) r2     // Catch:{ all -> 0x05c7 }
            int r8 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x01b0
            X.Tz5 r8 = new X.Tz5     // Catch:{ all -> 0x05c7 }
            r8.<init>(r10, r2)     // Catch:{ all -> 0x05c7 }
            r10 = r8
        L_0x01b0:
            X.Rt1 r9 = new X.Rt1     // Catch:{ all -> 0x05c7 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x05c7 }
            goto L_0x0583
        L_0x01b7:
            java.lang.String r2 = "Required value was null."
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05c7 }
            r8.<init>(r2)     // Catch:{ all -> 0x05c7 }
            goto L_0x05c6
        L_0x01c0:
            boolean r2 = r6 instanceof X.S6C     // Catch:{ all -> 0x05c7 }
            r14 = 0
            if (r2 == 0) goto L_0x01f4
            r10 = r6
            X.S6C r10 = (X.S6C) r10     // Catch:{ all -> 0x05c7 }
        L_0x01c8:
            java.lang.String r3 = "Required value was null."
            if (r10 == 0) goto L_0x031d
            X.EV7 r11 = X.EV7.LAYOUT_CONTEXT     // Catch:{ all -> 0x05c7 }
            java.lang.Object[] r12 = A00()     // Catch:{ all -> 0x05c7 }
            r2 = 2
            r13 = r12[r2]     // Catch:{ all -> 0x05c7 }
            if (r13 != 0) goto L_0x01f6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c7 }
            r3.<init>()     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = "Expected scoped data of type "
            r3.append(r2)     // Catch:{ all -> 0x05c7 }
            r3.append(r11)     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = " but was not found"
            r3.append(r2)     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x05c7 }
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05c7 }
            r3.<init>(r2)     // Catch:{ all -> 0x05c7 }
            goto L_0x03ef
        L_0x01f4:
            r10 = r14
            goto L_0x01c8
        L_0x01f6:
            X.3c0 r13 = (X.C244943c0) r13     // Catch:{ all -> 0x05c7 }
            int r2 = r10.A01     // Catch:{ all -> 0x05c7 }
            r21 = r2
            int r2 = r10.A00     // Catch:{ all -> 0x05c7 }
            r20 = r2
            X.4tV r11 = r10.A02     // Catch:{ all -> 0x05c7 }
            java.lang.Object r12 = r13.A05     // Catch:{ all -> 0x05c7 }
            if (r12 == 0) goto L_0x0316
            X.6Rm r12 = (X.C307786Rm) r12     // Catch:{ all -> 0x05c7 }
            X.3kJ r2 = X.1KZ.A01     // Catch:{ all -> 0x05c7 }
            boolean r19 = r2.isTracing()     // Catch:{ all -> 0x05c7 }
            if (r19 == 0) goto L_0x023e
            java.lang.String r2 = r11.A0B()     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = "Bloks Layout: "
            if (r2 == 0) goto L_0x021f
            java.lang.String r2 = X.002.A0R(r3, r2)     // Catch:{ all -> 0x0308 }
            X.1KZ.A01(r2)     // Catch:{ all -> 0x0308 }
        L_0x021f:
            int r2 = r11.A04     // Catch:{ all -> 0x0308 }
            java.lang.String r3 = X.002.A0O(r3, r2)     // Catch:{ all -> 0x0308 }
            X.0qQ.A0B(r3, r8)     // Catch:{ all -> 0x0308 }
            X.3kJ r2 = X.1KZ.A01     // Catch:{ all -> 0x0308 }
            X.1Kb r10 = r2.ADH(r3)     // Catch:{ all -> 0x0308 }
            r2 = 128(0x80, float:1.794E-43)
            java.lang.String r3 = r11.A0K(r2)     // Catch:{ all -> 0x0308 }
            if (r3 == 0) goto L_0x023b
            java.lang.String r2 = "bloks_debug_metadata"
            r10.ACP(r3, r2)     // Catch:{ all -> 0x0308 }
        L_0x023b:
            r10.flush()     // Catch:{ all -> 0x0308 }
        L_0x023e:
            X.C64361Kj.A00()     // Catch:{ all -> 0x0308 }
            int r2 = r11.A04     // Catch:{ all -> 0x0308 }
            boolean r2 = X.C250563lf.A0m(r2)     // Catch:{ all -> 0x0308 }
            if (r2 == 0) goto L_0x02a4
            X.1Kj r2 = X.C64361Kj.A00()     // Catch:{ all -> 0x0308 }
            X.4ts r2 = r2.A08     // Catch:{ all -> 0x0308 }
            boolean r2 = r2.A05(r11)     // Catch:{ all -> 0x0308 }
            if (r2 == 0) goto L_0x02a4
            int r2 = r11.A03     // Catch:{ all -> 0x0308 }
            long r15 = (long) r2     // Catch:{ all -> 0x0308 }
            r2 = 27
            long r2 = r15 << r2
            r17 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r2 = r2 | r17
            X.RvQ r18 = new X.RvQ     // Catch:{ all -> 0x0308 }
            r10 = r18
            r10.<init>(r11)     // Catch:{ all -> 0x0308 }
            java.lang.Object[] r10 = A00()     // Catch:{ all -> 0x0308 }
            r17 = r10[r8]     // Catch:{ all -> 0x0308 }
            java.lang.Object[] r10 = A00()     // Catch:{ all -> 0x0308 }
            r10[r8] = r18     // Catch:{ all -> 0x0308 }
            X.VVU r2 = r9.A02(r2)     // Catch:{ all -> 0x02a2 }
            java.lang.Object[] r3 = A00()     // Catch:{ all -> 0x0308 }
            r3[r8] = r17     // Catch:{ all -> 0x0308 }
            java.lang.Object r2 = r2.A01     // Catch:{ all -> 0x0308 }
            X.Rt2 r2 = (X.C10487Rt2) r2     // Catch:{ all -> 0x0308 }
            X.2TS r8 = r2.A00     // Catch:{ all -> 0x0308 }
            java.lang.String r2 = "null cannot be cast to non-null type com.facebook.rendercore.Node<com.instagram.common.bloks.BloksContext>"
            X.0qQ.A0C(r8, r2)     // Catch:{ all -> 0x0308 }
            r3 = r21
            r2 = r20
            X.2Ta r8 = r8.AEy(r13, r3, r2)     // Catch:{ all -> 0x0308 }
            boolean r2 = r8 instanceof X.AnonymousClass6TQ     // Catch:{ all -> 0x0308 }
            if (r2 != 0) goto L_0x02df
            X.2Th r10 = r8.Blo()     // Catch:{ all -> 0x0308 }
            if (r10 == 0) goto L_0x02db
            X.Tz5 r9 = new X.Tz5     // Catch:{ all -> 0x0308 }
            r2 = r15
            r9.<init>(r10, r2)     // Catch:{ all -> 0x0308 }
            r10 = r9
            goto L_0x02db
        L_0x02a2:
            r3 = move-exception
            goto L_0x0301
        L_0x02a4:
            java.lang.Object[] r2 = A00()     // Catch:{ all -> 0x0308 }
            r12 = r2[r8]     // Catch:{ all -> 0x0308 }
            java.lang.Object[] r2 = A00()     // Catch:{ all -> 0x0308 }
            r2[r8] = r11     // Catch:{ all -> 0x0308 }
            int r2 = r11.A03     // Catch:{ all -> 0x02f9 }
            long r2 = (long) r2     // Catch:{ all -> 0x02f9 }
            r10 = 27
            long r2 = r2 << r10
            r14 = 5764607523034234880(0x5000000000000000, double:2.315841784746324E77)
            long r2 = r2 | r14
            X.VVU r3 = r9.A02(r2)     // Catch:{ all -> 0x02f9 }
            java.lang.Object[] r2 = A00()     // Catch:{ all -> 0x0308 }
            r2[r8] = r12     // Catch:{ all -> 0x0308 }
            java.lang.Object r2 = r3.A01     // Catch:{ all -> 0x0308 }
            X.Rt1 r2 = (X.C10486Rt1) r2     // Catch:{ all -> 0x0308 }
            X.2Th r14 = r2.A00     // Catch:{ all -> 0x0308 }
            X.1Kj r2 = X.C64361Kj.A00()     // Catch:{ all -> 0x0308 }
            X.4ts r2 = r2.A08     // Catch:{ all -> 0x0308 }
            r9 = r13
            r10 = r14
            r12 = r21
            r13 = r20
            r8 = r2
            X.2Ta r8 = r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0308 }
            goto L_0x02df
        L_0x02db:
            X.2Th r14 = r11.A06(r10, r12)     // Catch:{ all -> 0x0308 }
        L_0x02df:
            X.C64361Kj.A00()     // Catch:{ all -> 0x0308 }
            boolean r2 = r8 instanceof X.AnonymousClass6TQ     // Catch:{ all -> 0x0308 }
            if (r2 != 0) goto L_0x02ec
            X.6TQ r2 = new X.6TQ     // Catch:{ all -> 0x0308 }
            r2.<init>(r8, r14)     // Catch:{ all -> 0x0308 }
            r8 = r2
        L_0x02ec:
            X.S6O r9 = new X.S6O     // Catch:{ all -> 0x0308 }
            r3 = r21
            r2 = r20
            r9.<init>(r8, r11, r3, r2)     // Catch:{ all -> 0x0308 }
            if (r19 == 0) goto L_0x0583
            goto L_0x0577
        L_0x02f9:
            r3 = move-exception
            java.lang.Object[] r2 = A00()     // Catch:{ all -> 0x0308 }
            r2[r8] = r12     // Catch:{ all -> 0x0308 }
            goto L_0x0307
        L_0x0301:
            java.lang.Object[] r2 = A00()     // Catch:{ all -> 0x0308 }
            r2[r8] = r17     // Catch:{ all -> 0x0308 }
        L_0x0307:
            throw r3     // Catch:{ all -> 0x0308 }
        L_0x0308:
            r8 = move-exception
            if (r19 == 0) goto L_0x05c6
            X.1KZ.A00()     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = r11.A0B()     // Catch:{ all -> 0x05c7 }
            if (r2 == 0) goto L_0x05c6
            goto L_0x059b
        L_0x0316:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05c7 }
            r8.<init>(r3)     // Catch:{ all -> 0x05c7 }
            goto L_0x05c6
        L_0x031d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05c7 }
            r8.<init>(r3)     // Catch:{ all -> 0x05c7 }
            goto L_0x05c6
        L_0x0324:
            boolean r2 = r6 instanceof X.C10632RvQ     // Catch:{ all -> 0x05c7 }
            r12 = 0
            if (r2 == 0) goto L_0x038a
            r11 = r6
            X.RvQ r11 = (X.C10632RvQ) r11     // Catch:{ all -> 0x05c7 }
            if (r11 == 0) goto L_0x038a
            X.4tV r10 = r11.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = "resolveModel: "
            int r3 = r10.A04     // Catch:{ all -> 0x05c7 }
            java.lang.String r8 = X.002.A0O(r2, r3)     // Catch:{ all -> 0x05c7 }
            X.3kJ r2 = X.1KZ.A01     // Catch:{ all -> 0x0387 }
            boolean r2 = r2.isTracing()     // Catch:{ all -> 0x0387 }
            if (r2 == 0) goto L_0x0343
            X.1KZ.A01(r8)     // Catch:{ all -> 0x0387 }
        L_0x0343:
            X.1Kj r2 = X.C64361Kj.A00()     // Catch:{ all -> 0x0387 }
            X.4ts r14 = r2.A08     // Catch:{ all -> 0x0387 }
            X.S4m r13 = r9.A02     // Catch:{ all -> 0x0387 }
            X.6S4 r8 = r13.A01     // Catch:{ all -> 0x0387 }
            java.lang.Object r2 = r11.A00     // Catch:{ all -> 0x0387 }
            android.util.Pair r9 = r14.A01(r8, r10, r2)     // Catch:{ all -> 0x0387 }
            if (r9 == 0) goto L_0x037b
            X.3kJ r2 = X.1KZ.A01     // Catch:{ all -> 0x05c7 }
            boolean r2 = r2.isTracing()     // Catch:{ all -> 0x05c7 }
            if (r2 == 0) goto L_0x0360
            X.1KZ.A00()     // Catch:{ all -> 0x05c7 }
        L_0x0360:
            int r8 = r10.A03     // Catch:{ all -> 0x05c7 }
            java.lang.Object r3 = r9.second     // Catch:{ all -> 0x05c7 }
            java.util.List r2 = r11.A01     // Catch:{ all -> 0x05c7 }
            r13.A01(r3, r2, r8)     // Catch:{ all -> 0x05c7 }
            r11.A00 = r12     // Catch:{ all -> 0x05c7 }
            r11.A01 = r12     // Catch:{ all -> 0x05c7 }
            java.lang.Object r2 = r9.first     // Catch:{ all -> 0x05c7 }
            X.0qQ.A06(r2)     // Catch:{ all -> 0x05c7 }
            X.2TS r2 = (X.AnonymousClass2TS) r2     // Catch:{ all -> 0x05c7 }
            X.Rt2 r9 = new X.Rt2     // Catch:{ all -> 0x05c7 }
            r9.<init>(r2, r10)     // Catch:{ all -> 0x05c7 }
            goto L_0x0583
        L_0x037b:
            java.lang.String r2 = "Expected a valid resolve result for model with style id: "
            java.lang.String r3 = X.002.A0O(r2, r3)     // Catch:{ all -> 0x0387 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0387 }
            r2.<init>(r3)     // Catch:{ all -> 0x0387 }
            throw r2     // Catch:{ all -> 0x0387 }
        L_0x0387:
            r8 = move-exception
            goto L_0x0593
        L_0x038a:
            java.lang.String r2 = "Required value was null."
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05c7 }
            r8.<init>(r2)     // Catch:{ all -> 0x05c7 }
            goto L_0x05c6
        L_0x0393:
            boolean r2 = X.0u4.A08(r6)     // Catch:{ all -> 0x05c7 }
            if (r2 == 0) goto L_0x03e8
            r10 = r6
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x05c7 }
            if (r10 == 0) goto L_0x03e8
            int r9 = r10.size()     // Catch:{ all -> 0x05c7 }
            r3 = r10
            r13 = 0
        L_0x03a4:
            if (r8 >= r9) goto L_0x03e1
            java.lang.Object r12 = r10.get(r8)     // Catch:{ all -> 0x05c7 }
            X.4tV r12 = (X.C276544tV) r12     // Catch:{ all -> 0x05c7 }
            int r11 = r12.A04     // Catch:{ all -> 0x05c7 }
            r2 = 16851(0x41d3, float:2.3613E-41)
            if (r11 != r2) goto L_0x03d9
            r2 = 32
            java.util.List r11 = r12.A0M(r2)     // Catch:{ all -> 0x05c7 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x05c7 }
            boolean r2 = r11.isEmpty()     // Catch:{ all -> 0x05c7 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x03de
            if (r3 != r10) goto L_0x03cb
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x05c7 }
            r2.<init>(r3)     // Catch:{ all -> 0x05c7 }
            r3 = r2
        L_0x03cb:
            int r2 = r8 + r13
            r3.remove(r2)     // Catch:{ all -> 0x05c7 }
            r3.addAll(r2, r11)     // Catch:{ all -> 0x05c7 }
            int r2 = r11.size()     // Catch:{ all -> 0x05c7 }
            int r13 = r13 + r2
            goto L_0x03de
        L_0x03d9:
            int r2 = r8 + r13
            r3.set(r2, r12)     // Catch:{ all -> 0x05c7 }
        L_0x03de:
            int r8 = r8 + 1
            goto L_0x03a4
        L_0x03e1:
            X.R9Z r9 = new X.R9Z     // Catch:{ all -> 0x05c7 }
            r9.<init>(r3, r10)     // Catch:{ all -> 0x05c7 }
            goto L_0x0583
        L_0x03e8:
            java.lang.String r2 = "Required value was null."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05c7 }
            r3.<init>(r2)     // Catch:{ all -> 0x05c7 }
        L_0x03ef:
            throw r3     // Catch:{ all -> 0x05c7 }
        L_0x03f0:
            boolean r2 = r6 instanceof X.S6N     // Catch:{ all -> 0x05c7 }
            r3 = 0
            if (r2 == 0) goto L_0x059f
            r2 = r6
            X.S6N r2 = (X.S6N) r2     // Catch:{ all -> 0x05c7 }
            if (r2 == 0) goto L_0x059f
            int r12 = r2.A00     // Catch:{ all -> 0x05c7 }
            X.4tV r11 = r2.A01     // Catch:{ all -> 0x05c7 }
            X.4uI r13 = r2.A02     // Catch:{ all -> 0x05c7 }
            java.lang.Object r8 = r2.A03     // Catch:{ all -> 0x05c7 }
            X.3kJ r2 = X.1KZ.A01     // Catch:{ all -> 0x05c7 }
            boolean r25 = r2.isTracing()     // Catch:{ all -> 0x05c7 }
            if (r25 == 0) goto L_0x0419
            java.lang.String r15 = "evaluateAttribute: "
            java.lang.String r14 = X.Q07.A02(r11)     // Catch:{ all -> 0x058f }
            r2 = 58
            java.lang.String r2 = X.002.A0V(r15, r14, r2, r12)     // Catch:{ all -> 0x058f }
            X.1KZ.A01(r2)     // Catch:{ all -> 0x058f }
        L_0x0419:
            java.util.List r2 = r11.A09     // Catch:{ all -> 0x058f }
            r16 = r2
            if (r2 != 0) goto L_0x0421
            X.0sn r16 = X.0sn.A00     // Catch:{ all -> 0x058f }
        L_0x0421:
            X.S53 r2 = r9.A01     // Catch:{ all -> 0x058f }
            r19 = r2
            X.T6s r9 = new X.T6s     // Catch:{ all -> 0x058f }
            r9.<init>(r2)     // Catch:{ all -> 0x058f }
            X.6Rx r14 = r2.A00(r11, r9, r13)     // Catch:{ all -> 0x058f }
            X.6Tm r2 = X.AnonymousClass6Tm.A01     // Catch:{ 6QV -> 0x0434 }
            java.lang.Object r8 = X.AnonymousClass6Tn.A00(r14, r2, r13)     // Catch:{ 6QV -> 0x0434 }
        L_0x0434:
            r14.A01 = r3     // Catch:{ all -> 0x058f }
            X.6Rz r2 = r14.A07     // Catch:{ all -> 0x058f }
            java.util.concurrent.CopyOnWriteArraySet r2 = r2.A00     // Catch:{ all -> 0x058f }
            r2.clear()     // Catch:{ all -> 0x058f }
            boolean r2 = r10 instanceof X.C8774R9a     // Catch:{ all -> 0x058f }
            if (r2 == 0) goto L_0x045a
            X.R9a r10 = (X.C8774R9a) r10     // Catch:{ all -> 0x058f }
            if (r10 == 0) goto L_0x045a
            android.util.SparseArray r2 = r10.A00     // Catch:{ all -> 0x058f }
            r17 = r2
        L_0x0449:
            X.1Kj r2 = X.C64361Kj.A00()     // Catch:{ all -> 0x058f }
            X.1KX r2 = r2.A03()     // Catch:{ all -> 0x058f }
            int r13 = r11.A04     // Catch:{ all -> 0x058f }
            int[] r15 = r2.A00(r13)     // Catch:{ all -> 0x058f }
            int r14 = r15.length     // Catch:{ all -> 0x058f }
            r10 = 0
            goto L_0x045d
        L_0x045a:
            r17 = r3
            goto L_0x0449
        L_0x045d:
            if (r10 >= r14) goto L_0x04c7
            r2 = r15[r10]     // Catch:{ all -> 0x058f }
            if (r2 != r12) goto L_0x047b
            java.util.LinkedHashSet r22 = new java.util.LinkedHashSet     // Catch:{ all -> 0x058f }
            r22.<init>()     // Catch:{ all -> 0x058f }
            android.util.SparseArray r10 = new android.util.SparseArray     // Catch:{ all -> 0x058f }
            r10.<init>()     // Catch:{ all -> 0x058f }
            boolean r2 = r8 instanceof java.util.List     // Catch:{ all -> 0x058f }
            if (r2 == 0) goto L_0x0479
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x058f }
        L_0x0473:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x058f }
            r12.<init>()     // Catch:{ all -> 0x058f }
            goto L_0x047e
        L_0x0479:
            r8 = r3
            goto L_0x0473
        L_0x047b:
            int r10 = r10 + 1
            goto L_0x045d
        L_0x047e:
            if (r8 == 0) goto L_0x04b0
            java.util.Iterator r14 = r8.iterator()     // Catch:{ all -> 0x058f }
        L_0x0484:
            boolean r2 = r14.hasNext()     // Catch:{ all -> 0x058f }
            if (r2 == 0) goto L_0x04b0
            java.lang.Object r20 = r14.next()     // Catch:{ all -> 0x058f }
            r18 = r11
            r21 = r16
            X.4tV r13 = X.C9818Rhg.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x058f }
            if (r13 == 0) goto L_0x0484
            int r8 = r13.A04     // Catch:{ all -> 0x058f }
            r2 = 16851(0x41d3, float:2.3613E-41)
            if (r8 != r2) goto L_0x04ac
            java.util.List r8 = r13.A0L()     // Catch:{ all -> 0x058f }
            boolean r2 = r8.isEmpty()     // Catch:{ all -> 0x058f }
            if (r2 != 0) goto L_0x0484
            r12.addAll(r8)     // Catch:{ all -> 0x058f }
            goto L_0x0484
        L_0x04ac:
            r12.add(r13)     // Catch:{ all -> 0x058f }
            goto L_0x0484
        L_0x04b0:
            r8 = r12
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x058f }
        L_0x04b5:
            boolean r2 = r12.hasNext()     // Catch:{ all -> 0x058f }
            if (r2 == 0) goto L_0x0501
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x058f }
            X.4tV r11 = (X.C276544tV) r11     // Catch:{ all -> 0x058f }
            int r2 = r11.A03     // Catch:{ all -> 0x058f }
            r10.put(r2, r11)     // Catch:{ all -> 0x058f }
            goto L_0x04b5
        L_0x04c7:
            X.1Kj r2 = X.C64361Kj.A00()     // Catch:{ all -> 0x058f }
            X.1KX r2 = r2.A03()     // Catch:{ all -> 0x058f }
            int[] r14 = r2.A01(r13)     // Catch:{ all -> 0x058f }
            int r13 = r14.length     // Catch:{ all -> 0x058f }
            r10 = 0
            goto L_0x04d8
        L_0x04d6:
            int r10 = r10 + 1
        L_0x04d8:
            if (r10 >= r13) goto L_0x04db
            goto L_0x04df
        L_0x04db:
            r10 = r3
        L_0x04dc:
            r24 = r3
            goto L_0x0511
        L_0x04df:
            r2 = r14[r10]     // Catch:{ all -> 0x058f }
            if (r2 != r12) goto L_0x04d6
            java.util.LinkedHashSet r22 = new java.util.LinkedHashSet     // Catch:{ all -> 0x058f }
            r22.<init>()     // Catch:{ all -> 0x058f }
            r10 = r17
            r12 = r19
            r13 = r8
            r14 = r16
            r15 = r22
            X.4tV r8 = X.C9818Rhg.A00(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x058f }
            if (r8 == 0) goto L_0x0523
            android.util.SparseArray r10 = new android.util.SparseArray     // Catch:{ all -> 0x058f }
            r10.<init>()     // Catch:{ all -> 0x058f }
            int r2 = r8.A03     // Catch:{ all -> 0x058f }
            r10.put(r2, r8)     // Catch:{ all -> 0x058f }
        L_0x0501:
            boolean r2 = r22.isEmpty()     // Catch:{ all -> 0x058f }
            if (r2 == r5) goto L_0x04dc
            boolean r2 = r22.isEmpty()     // Catch:{ all -> 0x058f }
            if (r2 != 0) goto L_0x04dc
            java.util.List r24 = X.00k.A0a(r22)     // Catch:{ all -> 0x058f }
        L_0x0511:
            X.0vq r9 = r9.A00     // Catch:{ all -> 0x058f }
            int r2 = r9.A01     // Catch:{ all -> 0x058f }
            if (r2 == 0) goto L_0x056d
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x058f }
            java.lang.Object[] r15 = r9.A03     // Catch:{ all -> 0x058f }
            long[] r14 = r9.A02     // Catch:{ all -> 0x058f }
            int r2 = r14.length     // Catch:{ all -> 0x058f }
            int r13 = r2 + -2
            if (r13 < 0) goto L_0x056d
            goto L_0x0525
        L_0x0523:
            r10 = r3
            goto L_0x0501
        L_0x0525:
            r12 = 0
            r23 = 0
        L_0x0528:
            r21 = r14[r12]     // Catch:{ all -> 0x058f }
            r18 = -1
            long r18 = r18 ^ r21
            r2 = 7
            long r18 = r18 << r2
            long r18 = r18 & r21
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r18 = r18 & r16
            int r2 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x0568
            int r2 = r12 - r13
            r2 = r2 ^ -1
            int r2 = r2 >>> 31
            r11 = 8
            int r9 = 8 - r2
            r2 = 0
        L_0x0549:
            if (r2 >= r9) goto L_0x0566
            r16 = 255(0xff, double:1.26E-321)
            long r19 = r21 & r16
            r17 = 128(0x80, double:6.32E-322)
            int r16 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r16 >= 0) goto L_0x0561
            int r16 = r12 << 3
            int r16 = r16 + r2
            r17 = r15[r16]     // Catch:{ all -> 0x058f }
            int r16 = r23 + 1
            r3[r23] = r17     // Catch:{ all -> 0x058f }
            r23 = r16
        L_0x0561:
            long r21 = r21 >> r11
            int r2 = r2 + 1
            goto L_0x0549
        L_0x0566:
            if (r9 != r11) goto L_0x056d
        L_0x0568:
            if (r12 == r13) goto L_0x056d
            int r12 = r12 + 1
            goto L_0x0528
        L_0x056d:
            X.R9a r9 = new X.R9a     // Catch:{ all -> 0x058f }
            r2 = r24
            r9.<init>(r10, r8, r2, r3)     // Catch:{ all -> 0x058f }
            if (r25 == 0) goto L_0x0583
            goto L_0x0580
        L_0x0577:
            X.1KZ.A00()     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = r11.A0B()     // Catch:{ all -> 0x05c7 }
            if (r2 == 0) goto L_0x0583
        L_0x0580:
            X.1KZ.A00()     // Catch:{ all -> 0x05c7 }
        L_0x0583:
            X.3kJ r2 = X.1KZ.A01     // Catch:{ Exception -> 0x05d4 }
            boolean r2 = r2.isTracing()     // Catch:{ Exception -> 0x05d4 }
            if (r2 == 0) goto L_0x05d9
            X.1KZ.A00()     // Catch:{ Exception -> 0x05d4 }
            goto L_0x05d9
        L_0x058f:
            r8 = move-exception
            if (r25 == 0) goto L_0x05c6
            goto L_0x059b
        L_0x0593:
            X.3kJ r2 = X.1KZ.A01     // Catch:{ all -> 0x05c7 }
            boolean r2 = r2.isTracing()     // Catch:{ all -> 0x05c7 }
            if (r2 == 0) goto L_0x05c6
        L_0x059b:
            X.1KZ.A00()     // Catch:{ all -> 0x05c7 }
            goto L_0x05c6
        L_0x059f:
            java.lang.String r2 = "Required value was null."
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05c7 }
            r8.<init>(r2)     // Catch:{ all -> 0x05c7 }
            goto L_0x05c6
        L_0x05a7:
            java.lang.String r2 = "No signal for type "
            java.lang.String r2 = X.002.A0O(r2, r11)     // Catch:{ all -> 0x05c7 }
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x05c7 }
            r8.<init>(r2)     // Catch:{ all -> 0x05c7 }
            goto L_0x05c6
        L_0x05b3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x05c7 }
            java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x05c7 }
            java.lang.String r2 = "No implementation bound to key: %s"
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x05c7 }
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x05c7 }
            r8.<init>(r2)     // Catch:{ all -> 0x05c7 }
        L_0x05c6:
            throw r8     // Catch:{ all -> 0x05c7 }
        L_0x05c7:
            r3 = move-exception
            X.3kJ r2 = X.1KZ.A01     // Catch:{ Exception -> 0x05d4 }
            boolean r2 = r2.isTracing()     // Catch:{ Exception -> 0x05d4 }
            if (r2 == 0) goto L_0x05d3
            X.1KZ.A00()     // Catch:{ Exception -> 0x05d4 }
        L_0x05d3:
            throw r3     // Catch:{ Exception -> 0x05d4 }
        L_0x05d4:
            r2 = move-exception
            X.R9a r9 = X.SOY.A00(r2, r6, r0)     // Catch:{ all -> 0x06ee }
        L_0x05d9:
            java.lang.Object[] r2 = A00()
            r2[r5] = r28
            if (r4 == 0) goto L_0x06ce
            java.lang.Object r10 = r4.A01
            r8 = 4
            X.0qQ.A0B(r10, r8)
            r2 = 60
            long r2 = r31 >>> r2
            int r4 = (int) r2
            boolean r2 = X.C250563lf.A0n(r4)
            if (r2 == 0) goto L_0x06c8
            if (r4 == r5) goto L_0x0650
            r2 = 2
            if (r4 == r2) goto L_0x0640
            if (r4 == r7) goto L_0x062f
            if (r4 == r8) goto L_0x061e
            r2 = 5
            if (r4 != r2) goto L_0x0609
            r2 = r9
            X.Rt1 r2 = (X.C10486Rt1) r2     // Catch:{ Exception -> 0x06ce }
            X.Rt1 r10 = (X.C10486Rt1) r10     // Catch:{ Exception -> 0x06ce }
            X.2Th r3 = r2.A00     // Catch:{ Exception -> 0x06ce }
            X.2Th r2 = r10.A00     // Catch:{ Exception -> 0x06ce }
            goto L_0x06ea
        L_0x0609:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x06ce }
            java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x06ce }
            java.lang.String r2 = "No implementation bound to key: %s"
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ Exception -> 0x06ce }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x06ce }
            r3.<init>(r2)     // Catch:{ Exception -> 0x06ce }
            goto L_0x06c7
        L_0x061e:
            r4 = r9
            X.S6O r4 = (X.S6O) r4     // Catch:{ Exception -> 0x06ce }
            X.S6O r10 = (X.S6O) r10     // Catch:{ Exception -> 0x06ce }
            X.2Ta r3 = r4.A02     // Catch:{ Exception -> 0x06ce }
            X.2Ta r2 = r10.A02     // Catch:{ Exception -> 0x06ce }
            if (r3 != r2) goto L_0x06ce
            X.4tV r3 = r4.A03     // Catch:{ Exception -> 0x06ce }
            X.4tV r2 = r10.A03     // Catch:{ Exception -> 0x06ce }
            goto L_0x06ea
        L_0x062f:
            r4 = r9
            X.Rt2 r4 = (X.C10487Rt2) r4     // Catch:{ Exception -> 0x06ce }
            X.Rt2 r10 = (X.C10487Rt2) r10     // Catch:{ Exception -> 0x06ce }
            X.2TS r3 = r4.A00     // Catch:{ Exception -> 0x06ce }
            X.2TS r2 = r10.A00     // Catch:{ Exception -> 0x06ce }
            if (r3 != r2) goto L_0x06ce
            X.4tV r3 = r4.A01     // Catch:{ Exception -> 0x06ce }
            X.4tV r2 = r10.A01     // Catch:{ Exception -> 0x06ce }
            goto L_0x06ea
        L_0x0640:
            if (r9 == r10) goto L_0x06ec
            r2 = r9
            X.Rpo r2 = (X.C10290Rpo) r2     // Catch:{ Exception -> 0x06ce }
            X.Rpo r10 = (X.C10290Rpo) r10     // Catch:{ Exception -> 0x06ce }
            java.lang.Object r3 = r2.A00     // Catch:{ Exception -> 0x06ce }
            java.lang.Object r2 = r10.A00     // Catch:{ Exception -> 0x06ce }
            boolean r2 = X.Q06.A00(r3, r2)     // Catch:{ Exception -> 0x06ce }
            goto L_0x06cc
        L_0x0650:
            r12 = 2
            if (r9 == r10) goto L_0x06ec
            boolean r2 = r6 instanceof X.S6N     // Catch:{ Exception -> 0x06ce }
            r8 = 0
            if (r2 == 0) goto L_0x06c0
            r2 = r6
            X.S6N r2 = (X.S6N) r2     // Catch:{ Exception -> 0x06ce }
            if (r2 == 0) goto L_0x06c0
            int r13 = r2.A00     // Catch:{ Exception -> 0x06ce }
            X.4tV r3 = r2.A01     // Catch:{ Exception -> 0x06ce }
            X.1Kj r2 = X.C64361Kj.A00()     // Catch:{ Exception -> 0x06ce }
            X.1KX r2 = r2.A03()     // Catch:{ Exception -> 0x06ce }
            int r11 = r3.A04     // Catch:{ Exception -> 0x06ce }
            int[] r14 = r2.A01(r11)     // Catch:{ Exception -> 0x06ce }
            int r4 = r14.length     // Catch:{ Exception -> 0x06ce }
            r3 = 0
        L_0x0671:
            if (r3 >= r4) goto L_0x067d
            r2 = r14[r3]     // Catch:{ Exception -> 0x06ce }
            if (r2 != r13) goto L_0x0678
            goto L_0x067b
        L_0x0678:
            int r3 = r3 + 1
            goto L_0x0671
        L_0x067b:
            r3 = 1
            goto L_0x0698
        L_0x067d:
            X.1Kj r2 = X.C64361Kj.A00()     // Catch:{ Exception -> 0x06ce }
            X.1KX r2 = r2.A03()     // Catch:{ Exception -> 0x06ce }
            int[] r11 = r2.A00(r11)     // Catch:{ Exception -> 0x06ce }
            int r4 = r11.length     // Catch:{ Exception -> 0x06ce }
            r3 = 0
        L_0x068b:
            if (r3 >= r4) goto L_0x0697
            r2 = r11[r3]     // Catch:{ Exception -> 0x06ce }
            if (r2 != r13) goto L_0x0692
            goto L_0x0695
        L_0x0692:
            int r3 = r3 + 1
            goto L_0x068b
        L_0x0695:
            r3 = 2
            goto L_0x0698
        L_0x0697:
            r3 = 0
        L_0x0698:
            r2 = r9
            X.Rpo r2 = (X.C10290Rpo) r2     // Catch:{ Exception -> 0x06ce }
            X.Rpo r10 = (X.C10290Rpo) r10     // Catch:{ Exception -> 0x06ce }
            if (r3 == r5) goto L_0x06bb
            java.lang.Object r4 = r2.A00     // Catch:{ Exception -> 0x06ce }
            if (r3 == r12) goto L_0x06aa
            java.lang.Object r2 = r10.A00     // Catch:{ Exception -> 0x06ce }
            boolean r2 = X.0qQ.A0K(r4, r2)     // Catch:{ Exception -> 0x06ce }
            goto L_0x06cc
        L_0x06aa:
            boolean r2 = r4 instanceof java.util.List     // Catch:{ Exception -> 0x06ce }
            if (r2 != 0) goto L_0x06af
            r4 = r8
        L_0x06af:
            java.lang.Object r3 = r10.A00     // Catch:{ Exception -> 0x06ce }
            boolean r2 = r3 instanceof java.util.List     // Catch:{ Exception -> 0x06ce }
            if (r2 == 0) goto L_0x06b6
            r8 = r3
        L_0x06b6:
            boolean r2 = X.Q06.A00(r4, r8)     // Catch:{ Exception -> 0x06ce }
            goto L_0x06cc
        L_0x06bb:
            java.lang.Object r3 = r2.A00     // Catch:{ Exception -> 0x06ce }
            java.lang.Object r2 = r10.A00     // Catch:{ Exception -> 0x06ce }
            goto L_0x06ea
        L_0x06c0:
            java.lang.String r2 = "Required value was null."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x06ce }
            r3.<init>(r2)     // Catch:{ Exception -> 0x06ce }
        L_0x06c7:
            throw r3     // Catch:{ Exception -> 0x06ce }
        L_0x06c8:
            boolean r2 = X.0qQ.A0K(r9, r10)
        L_0x06cc:
            if (r2 != 0) goto L_0x06ec
        L_0x06ce:
            r2 = r27
            java.util.LinkedHashSet r2 = r2.A00
            if (r2 == 0) goto L_0x06e8
            long[] r2 = X.00k.A0y(r2)
        L_0x06d8:
            X.VVU r4 = new X.VVU
            r4.<init>(r9, r6, r2)
            r16 = r5
        L_0x06df:
            r3 = r29
            r2 = r16
            r3.A01(r4, r0, r2)
            goto L_0x0073
        L_0x06e8:
            r2 = 0
            goto L_0x06d8
        L_0x06ea:
            if (r3 != r2) goto L_0x06ce
        L_0x06ec:
            r5 = 0
            goto L_0x06ce
        L_0x06ee:
            r1 = move-exception
            java.lang.Object[] r0 = A00()
            r0[r5] = r28
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276694tk.A02(long):X.VVU");
    }
}
