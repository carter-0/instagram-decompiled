package X;

/* renamed from: X.2vl  reason: invalid class name and case insensitive filesystem */
public final class C233462vl extends C233472vm {
    public static final C233462vl A0D = new C233462vl((C67241sS) null, (C233492vo) null, (String) null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
    public int A00;
    public C67241sS A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C376699Iz A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C233462vl() {
        this((C67241sS) null, (C233492vo) null, (String) null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C233462vl(X.C67241sS r17, X.C233492vo r18, java.lang.String r19, int r20, int r21, int r22, int r23, int r24, int r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            r16 = this;
            r13 = r19
            r14 = r18
            r11 = r21
            r12 = r20
            r9 = r23
            r10 = r22
            r8 = r24
            r6 = r27
            r7 = r26
            r4 = r29
            r5 = r28
            r3 = 0
            r15 = r25
            r0 = r25 & 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            r14 = r3
        L_0x001f:
            r0 = r25 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0025
            r12 = 0
        L_0x0025:
            r0 = r25 & 4
            if (r0 == 0) goto L_0x002a
            r11 = 0
        L_0x002a:
            r0 = r25 & 8
            if (r0 == 0) goto L_0x002f
            r7 = 0
        L_0x002f:
            r0 = r25 & 16
            if (r0 == 0) goto L_0x0034
            r6 = 0
        L_0x0034:
            r0 = r25 & 32
            if (r0 == 0) goto L_0x0039
            r5 = 0
        L_0x0039:
            r0 = r25 & 64
            if (r0 == 0) goto L_0x003e
            r10 = 0
        L_0x003e:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0043
            r9 = 0
        L_0x0043:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0049
            r2 = r17
        L_0x0049:
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004e
            r8 = 0
        L_0x004e:
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0054
            java.lang.String r13 = ""
        L_0x0054:
            r0 = r15 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0059
            r4 = 0
        L_0x0059:
            r0 = r15 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0062
            X.9Iz r3 = new X.9Iz
            r3.<init>()
        L_0x0062:
            r0 = 11
            X.0qQ.A0B(r13, r0)
            r0 = 13
            X.0qQ.A0B(r3, r0)
            r15 = r16
            r15.<init>(r14)
            r15.A05 = r12
            r15.A04 = r11
            r15.A0A = r7
            r15.A0C = r6
            r15.A0B = r5
            r15.A00 = r10
            r15.A06 = r9
            r15.A01 = r2
            r15.A03 = r8
            r15.A08 = r13
            r15.A09 = r4
            r15.A07 = r3
            r15.A02 = r1
            if (r2 != 0) goto L_0x0095
            if (r14 == 0) goto L_0x0095
            X.1sS r0 = r14.A00
            if (r0 == 0) goto L_0x0095
            r15.A01 = r0
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233462vl.<init>(X.1sS, X.2vo, java.lang.String, int, int, int, int, int, int, boolean, boolean, boolean, boolean):void");
    }

    public final boolean A0D(Integer num, Integer num2, int i) {
        int i2;
        if (!C266914aY.A02(num) || !C266914aY.A02(num2)) {
            throw new IllegalArgumentException("Gaps can be only evaluated for ADs and NETEGOs");
        }
        if (num != num2) {
            i2 = this.A04;
        } else {
            Integer num3 = AnonymousClass05K.A0C;
            if (num == num3 && num2 == num3) {
                i2 = A05();
            } else {
                i2 = this.A05;
            }
        }
        if (i < i2) {
            return false;
        }
        return true;
    }
}
