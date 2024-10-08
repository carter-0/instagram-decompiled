package X;

public final class GO8 extends IPM implements C250603lj {
    public final C254293sF A00;
    public final AnonymousClass2oZ A01;
    public final C55541HjN A02;
    public final C55542HjO A03;
    public final C2613149c A04;
    public final String A05;
    public final String A06;
    public final 0sL A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.5rM, java.lang.Object] */
    public GO8(AnonymousClass49X r7, AnonymousClass49S r8, C55541HjN hjN, C55542HjO hjO, String str, String str2, 0sL r13, boolean z, boolean z2, boolean z3) {
        AnonymousClass2oZ r4;
        0qQ.A0B(r7, 4);
        C2613149c r3 = null;
        if (r8.A09) {
            r4 = r7.A00;
        } else {
            r4 = null;
        }
        r3 = r8.A0A ? r7.A01 : r3;
        GOB gob = new GOB(DbS.A0O(str), new Object(), r7.A02);
        boolean z4 = r8.A06;
        this.A05 = str2;
        this.A01 = r4;
        this.A04 = r3;
        this.A03 = hjO;
        this.A02 = hjN;
        this.A00 = gob;
        this.A07 = r13;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = str;
        this.A0B = z3;
        this.A0A = z4;
    }

    /* JADX WARNING: type inference failed for: r10v14, types: [X.3s9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r22, X.C252093oY r23) {
        /*
            r21 = this;
            r6 = 0
            r1 = r22
            X.0qQ.A0B(r1, r6)
            r9 = 1
            r3 = r23
            X.0qQ.A0B(r3, r9)
            r0 = r21
            X.2oZ r2 = r0.A01
            if (r2 == 0) goto L_0x0174
            boolean r4 = r0.A0B
            if (r4 == 0) goto L_0x0174
            float r4 = r3.CFe(r1)
            r11 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r11
            int r8 = (int) r4
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r3.B9a(r5, r1)
            r3.CFR(r10)
            int r4 = r5.height()
            float r7 = (float) r4
            int r4 = r5.width()
            float r4 = (float) r4
            float r7 = r7 * r4
            int r4 = r10.height()
            float r5 = (float) r4
            int r4 = r10.width()
            float r4 = (float) r4
            float r5 = r5 * r4
            float r7 = r7 / r5
            float r7 = r7 * r11
            int r13 = (int) r7
            boolean r4 = r0.A0A
            if (r4 == 0) goto L_0x0170
            r0.A02(r1, r3)
            boolean r18 = r0.A03(r1)
        L_0x0052:
            r0.A03(r1)
            long r4 = r3.BlK()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r10 = r3.CEk(r1)
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            r17 = 0
            if (r10 != r7) goto L_0x006d
            r17 = 1
        L_0x006d:
            X.HjO r11 = r0.A03
            r14 = 0
            java.lang.String r10 = A00(r1, r0)
            X.0qQ.A0B(r10, r6)
            java.util.Map r7 = r2.A06
            r7.get(r10)
            java.lang.Integer r7 = r3.CEk(r1)
            int r7 = r7.intValue()
            if (r7 == r6) goto L_0x0168
            if (r7 == r9) goto L_0x0165
            X.JQQ r7 = r11.A00
            X.3sB r10 = r7.B3M()
        L_0x008e:
            boolean r7 = r10 instanceof X.C254233s9
            if (r7 == 0) goto L_0x0165
            X.3s9 r10 = (X.C254233s9) r10
        L_0x0094:
            boolean r7 = r10 instanceof X.C254253sB
            if (r7 == 0) goto L_0x009b
            r14 = r10
            X.3sB r14 = (X.C254253sB) r14
        L_0x009b:
            java.lang.String r10 = A00(r1, r0)
            java.lang.String r7 = r0.A05
            X.0qQ.A0B(r10, r9)
            X.3sF r12 = r0.A00
            java.util.Map r2 = r2.A05
            java.lang.Object r11 = r2.get(r10)
            X.Hmy r11 = (X.C55763Hmy) r11
            if (r11 != 0) goto L_0x00b8
            X.Hmy r11 = new X.Hmy
            r11.<init>(r10, r7)
            r2.put(r10, r11)
        L_0x00b8:
            if (r14 == 0) goto L_0x00bc
            r11.A00 = r14
        L_0x00bc:
            if (r15 == 0) goto L_0x00d3
            X.3sI r15 = r11.A01
            java.util.List r7 = r15.A07
            X.AnonymousClass2oZ.A00(r7, r9, r8, r4)
            java.util.List r14 = r15.A02
            r7 = 50
            X.AnonymousClass2oZ.A00(r14, r7, r8, r4)
            java.util.List r14 = r15.A04
            r7 = 100
            X.AnonymousClass2oZ.A00(r14, r7, r8, r4)
        L_0x00d3:
            if (r16 == 0) goto L_0x00e5
            X.3sI r14 = r11.A01
            java.util.List r8 = r14.A03
            r7 = 50
            X.AnonymousClass2oZ.A00(r8, r7, r13, r4)
            java.util.List r8 = r14.A05
            r7 = 100
            X.AnonymousClass2oZ.A00(r8, r7, r13, r4)
        L_0x00e5:
            if (r18 == 0) goto L_0x00f3
            X.3sI r14 = r11.A01
            long r7 = r14.A00
            r15 = -1
            int r13 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x00f3
            r14.A00 = r4
        L_0x00f3:
            if (r17 == 0) goto L_0x012e
            X.3sI r7 = r11.A01
            java.lang.String r4 = r7.A01
            X.3sI r5 = X.C56191HuK.A00(r4)
            X.3sG r4 = new X.3sG
            r4.<init>(r7, r5)
            java.util.List r20 = java.util.Collections.singletonList(r4)
            X.0qQ.A07(r20)
            java.lang.String r17 = ""
            java.lang.String r5 = r11.A02
            java.lang.String r4 = r11.A03
            r14 = 0
            X.3sK r15 = new X.3sK
            r15.<init>()
            X.3sB r7 = r11.A00
            X.3sL r13 = new X.3sL
            r19 = r4
            r16 = r7
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r5 = r13.A04
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            r12.DzO(r13, r4, r5)
            r2.remove(r10)
        L_0x012e:
            X.49c r2 = r0.A04
            if (r2 == 0) goto L_0x013e
            boolean r4 = r0.A09
            if (r4 == 0) goto L_0x013f
            java.lang.Integer r5 = r3.CEk(r1)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r5 != r4) goto L_0x013f
        L_0x013e:
            return
        L_0x013f:
            java.lang.Integer r4 = r3.CEk(r1)
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0162
            if (r4 == r9) goto L_0x015b
            java.lang.Integer r5 = X.AnonymousClass05K.A01
        L_0x014d:
            r10 = 0
        L_0x014e:
            boolean r4 = r0.A08
            if (r4 == 0) goto L_0x0257
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            if (r5 == r4) goto L_0x013e
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r5 != r4) goto L_0x0257
            return
        L_0x015b:
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            float r10 = r3.CFe(r1)
            goto L_0x014e
        L_0x0162:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x014d
        L_0x0165:
            r10 = 0
            goto L_0x0094
        L_0x0168:
            X.JQQ r7 = r11.A00
            X.3sB r10 = r7.B3L()
            goto L_0x008e
        L_0x0170:
            r18 = 0
            goto L_0x0052
        L_0x0174:
            java.lang.Integer r4 = r3.CEk(r1)
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0221
            if (r4 == r9) goto L_0x01ff
            if (r2 == 0) goto L_0x012e
            java.lang.String r5 = A00(r1, r0)
            X.0qQ.A0B(r5, r6)
            java.util.Map r4 = r2.A06
            r4.get(r5)
            X.HjO r4 = r0.A03
            X.JQQ r4 = r4.A00
            X.3sB r11 = r4.B3M()
            boolean r4 = r11 instanceof X.C254233s9
            if (r4 == 0) goto L_0x01dc
            X.3s9 r11 = (X.C254233s9) r11
        L_0x019c:
            java.lang.String r14 = A00(r1, r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            long r16 = r3.BlK()
            r15 = 0
            X.GOF r10 = new X.GOF
            r12 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.3sF r4 = r0.A00
            X.3sL r10 = r2.A02(r10, r4)
            X.HjN r2 = r0.A02
            X.Hiv r11 = r2.A00
            if (r11 == 0) goto L_0x012e
            java.util.List r4 = r10.A06
            r2 = 10
            int r2 = X.0Yv.A1E(r4, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x01ca:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x01de
            java.lang.Object r2 = r4.next()
            X.3sG r2 = (X.C254303sG) r2
            X.3sI r2 = r2.A01
            r5.add(r2)
            goto L_0x01ca
        L_0x01dc:
            r11 = 0
            goto L_0x019c
        L_0x01de:
            boolean r2 = r5.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x012e
            java.lang.Object r2 = r5.get(r6)
            X.3sI r2 = (X.C254323sI) r2
            long r7 = X.C292955jn.A00(r2)
            r4 = 250(0xfa, double:1.235E-321)
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x012e
            X.1Ua r4 = r11.A00
            java.lang.String r2 = r10.A03
            r4.A02(r2)
            goto L_0x012e
        L_0x01ff:
            boolean r4 = r0.A09
            if (r4 != 0) goto L_0x012e
            float r15 = r3.CFe(r1)
            if (r2 == 0) goto L_0x012e
            java.lang.String r5 = A00(r1, r0)
            X.0qQ.A0B(r5, r6)
            java.util.Map r4 = r2.A06
            r4.get(r5)
            r11 = 0
            java.lang.String r14 = A00(r1, r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            long r16 = r3.BlK()
            goto L_0x0248
        L_0x0221:
            if (r2 == 0) goto L_0x012e
            java.lang.String r5 = A00(r1, r0)
            X.0qQ.A0B(r5, r6)
            java.util.Map r4 = r2.A06
            r4.get(r5)
            X.HjO r4 = r0.A03
            X.JQQ r4 = r4.A00
            X.3sB r11 = r4.B3L()
            boolean r4 = r11 instanceof X.C254233s9
            if (r4 == 0) goto L_0x0255
            X.3s9 r11 = (X.C254233s9) r11
        L_0x023d:
            java.lang.String r14 = A00(r1, r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            long r16 = r3.BlK()
            r15 = 0
        L_0x0248:
            X.GOF r10 = new X.GOF
            r12 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.3sF r4 = r0.A00
            r2.A02(r10, r4)
            goto L_0x012e
        L_0x0255:
            r11 = 0
            goto L_0x023d
        L_0x0257:
            java.lang.String r6 = r0.A05
            java.lang.String r7 = A00(r1, r0)
            long r11 = r3.BlK()
            X.HjO r1 = r0.A03
            X.JQQ r1 = r1.A00
            X.3sB r4 = r1.BqR()
            java.lang.String r9 = r0.A06
            java.lang.String r8 = "ViewPoint"
            X.Glq r3 = new X.Glq
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.A01(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GO8.ATF(X.30Y, X.3oY):void");
    }

    public static final String A00(AnonymousClass30Y r3, GO8 go8) {
        return (String) go8.A07.invoke(r3.A03, r3.A04);
    }
}
