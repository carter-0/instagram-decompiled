package X;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4S9  reason: invalid class name */
public final class AnonymousClass4S9 extends Timeline {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C256633w6 A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final AnonymousClass4RO A08;
    public final AnonymousClass4RL A09;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r8.A06 != -9223372036854775807L) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4RE A0E(X.AnonymousClass4RE r37, int r38, long r39) {
        /*
            r36 = this;
            r6 = 0
            r15 = 1
            r0 = r38
            X.C256703wD.A00(r0, r15)
            r9 = r36
            long r0 = r9.A02
            X.3w6 r8 = r9.A04
            boolean r10 = r8.A0R
            if (r10 == 0) goto L_0x0035
            long r2 = r8.A0A
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            long r2 = r8.A06
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x0035
            r13 = 0
            int r2 = (r39 > r13 ? 1 : (r39 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x007c
            long r0 = r0 + r39
            long r2 = r9.A03
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x007c
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0035:
            java.lang.Object r19 = X.AnonymousClass4RE.A0H
            X.4RL r2 = r9.A09
            r18 = r2
            long r13 = r9.A06
            long r11 = r9.A07
            long r6 = r9.A05
            if (r10 == 0) goto L_0x0056
            long r2 = r8.A0A
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0056
            long r2 = r8.A06
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r35 = 1
            if (r4 == 0) goto L_0x0058
        L_0x0056:
            r35 = 0
        L_0x0058:
            X.4RO r10 = r9.A08
            long r4 = r9.A03
            int r2 = r9.A01()
            int r21 = r2 + -1
            long r2 = r9.A01
            r16 = r37
            r22 = r13
            r24 = r11
            r26 = r6
            r28 = r0
            r30 = r4
            r32 = r2
            r34 = r15
            r17 = r10
            r20 = r8
            r16.A00(r17, r18, r19, r20, r21, r22, r24, r26, r28, r30, r32, r34, r35)
            return r37
        L_0x007c:
            long r4 = r9.A01
            long r4 = r4 + r0
            long r2 = r8.A00(r6)
            r11 = 0
        L_0x0084:
            java.util.List r7 = r8.A0Q
            int r7 = r7.size()
            int r7 = r7 + -1
            if (r11 >= r7) goto L_0x009a
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x009a
            long r4 = r4 - r2
            int r11 = r11 + 1
            long r2 = r8.A00(r11)
            goto L_0x0084
        L_0x009a:
            X.3wM r12 = r8.A02(r11)
            r7 = 2
            int r11 = r12.A00(r7)
            r7 = -1
            if (r11 == r7) goto L_0x0035
            java.util.List r7 = r12.A03
            java.lang.Object r7 = r7.get(r11)
            X.3wK r7 = (X.C256773wK) r7
            java.util.List r7 = r7.A07
            java.lang.Object r6 = r7.get(r6)
            X.3wG r6 = (X.C256733wG) r6
            X.4XE r7 = r6.A00()
            if (r7 == 0) goto L_0x0035
            long r11 = r7.BrO(r2)
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0035
            long r2 = r7.BrS(r4, r2)
            long r2 = r7.C7P(r2)
            long r0 = r0 + r2
            long r0 = r0 - r4
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4S9.A0E(X.4RE, int, long):X.4RE");
    }

    public AnonymousClass4S9(AnonymousClass4RO r4, AnonymousClass4RL r5, C256633w6 r6, int i, long j, long j2, long j3, long j4, long j5, long j6) {
        C256703wD.A04(r6.A0R != (r4 != null) ? false : true);
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A00 = i;
        this.A01 = j4;
        this.A03 = j5;
        this.A02 = j6;
        this.A04 = r6;
        this.A09 = r5;
        this.A08 = r4;
    }

    public final C264744Rc A0D(C264744Rc r12, int i, boolean z) {
        String str;
        C256703wD.A00(i, A01());
        Integer num = null;
        if (z) {
            str = this.A04.A02(i).A02;
            int i2 = this.A00;
            C256703wD.A00(i, A01());
            num = Integer.valueOf(i2 + i);
        } else {
            str = null;
        }
        C256633w6 r1 = this.A04;
        r12.A02(r1.A00(i), str, Util.A07(r1.A02(i).A00 - r1.A02(0).A00) - this.A01, num);
        return r12;
    }
}
