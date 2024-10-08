package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.XvW  reason: case insensitive filesystem */
public final class C22106XvW implements C13809Thc {
    public int A00;
    public int A01;
    public int A02;
    public YBZ A03;
    public C21154XGv A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final SparseArray A08;
    public final SparseBooleanArray A09;
    public final SparseBooleanArray A0A;
    public final C11389SRd A0B;
    public final C21452Xb4 A0C;
    public final TZd A0D;
    public final List A0E;
    public final int A0F;
    public final SparseIntArray A0G;
    public final C13890TjD A0H;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void EKu(long j, long j2) {
        C21154XGv xGv;
        long j3;
        List list = this.A0E;
        int size = list.size();
        int i = 0;
        while (true) {
            long j4 = j2;
            if (i < size) {
                C21505XdL xdL = (C21505XdL) list.get(i);
                synchronized (xdL) {
                    j3 = xdL.A01;
                }
                if (j3 != -9223372036854775807L) {
                    long A002 = xdL.A00();
                    if (A002 != -9223372036854775807L) {
                        if (A002 != 0) {
                            if (A002 == j2) {
                            }
                        }
                    }
                    i++;
                }
                xdL.A04(j4);
                i++;
            } else {
                if (!(j2 == 0 || (xGv = this.A04) == null)) {
                    xGv.A01(j4);
                }
                this.A0B.A0M(0);
                this.A0G.clear();
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = this.A08;
                    if (i2 < sparseArray.size()) {
                        ((YAN) sparseArray.valueAt(i2)).EKt();
                        i2++;
                    } else {
                        this.A00 = 0;
                        return;
                    }
                }
            }
        }
    }

    public final void CMU(YBZ ybz) {
        if ((this.A0F & 1) == 0) {
            ybz = new C11703Sf0(ybz, this.A0H);
        }
        this.A03 = ybz;
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [X.Y91, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v7, types: [X.Xca, X.XGv] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0245, code lost:
        if (r6 == false) goto L_0x0247;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r25, X.C21363XYr r26) {
        /*
            r24 = this;
            r8 = r25
            long r0 = r8.getLength()
            r4 = 1
            r2 = 0
            r3 = r24
            boolean r5 = r3.A06
            r6 = -1
            if (r5 == 0) goto L_0x0163
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r9 = r26
            if (r5 == 0) goto L_0x00fd
            X.Xb4 r7 = r3.A0C
            boolean r5 = r7.A03
            if (r5 != 0) goto L_0x00fd
            int r3 = r3.A01
            if (r3 <= 0) goto L_0x00eb
            boolean r5 = r7.A05
            if (r5 != 0) goto L_0x0084
            r5 = 112800(0x1b8a0, double:5.57306E-319)
            long r5 = java.lang.Math.min(r5, r0)
            int r10 = (int) r5
            long r5 = (long) r10
            long r0 = r0 - r5
            long r11 = r8.Bdl()
            int r5 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00f9
            X.SRd r6 = r7.A06
            r6.A0M(r10)
            r8.EI7()
            byte[] r0 = r6.A02
            r8.E2F(r0, r2, r10)
            int r9 = r6.A01
            int r8 = r6.A00
            int r5 = r8 + -188
        L_0x0049:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 < r9) goto L_0x007e
            byte[] r11 = r6.A02
            r10 = -4
            r2 = 0
        L_0x0054:
            int r0 = r10 * 188
            int r0 = r0 + r5
            if (r0 < r9) goto L_0x0074
            if (r0 >= r8) goto L_0x0074
            byte r1 = r11[r0]
            r0 = 71
            if (r1 != r0) goto L_0x0074
            int r2 = r2 + 1
            r0 = 5
            if (r2 != r0) goto L_0x0075
            long r1 = X.XUH.A00(r6, r5, r3)
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
        L_0x006e:
            r7.A02 = r1
            r7.A05 = r4
        L_0x0072:
            r0 = 0
            return r0
        L_0x0074:
            r2 = 0
        L_0x0075:
            int r10 = r10 + 1
            r0 = 4
            if (r10 > r0) goto L_0x007b
            goto L_0x0054
        L_0x007b:
            int r5 = r5 + -1
            goto L_0x0049
        L_0x007e:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x006e
        L_0x0084:
            long r5 = r7.A02
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x00eb
            boolean r5 = r7.A04
            if (r5 != 0) goto L_0x00d6
            r5 = 112800(0x1b8a0, double:5.57306E-319)
            long r0 = java.lang.Math.min(r5, r0)
            int r6 = (int) r0
            long r10 = r8.Bdl()
            r0 = 0
            int r5 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00f9
            X.SRd r9 = r7.A06
            r9.A0M(r6)
            r8.EI7()
            byte[] r0 = r9.A02
            r8.E2F(r0, r2, r6)
            int r6 = r9.A01
            int r5 = r9.A00
        L_0x00b6:
            if (r6 >= r5) goto L_0x00d0
            byte[] r0 = r9.A02
            byte r1 = r0[r6]
            r0 = 71
            if (r1 != r0) goto L_0x00cd
            long r1 = X.XUH.A00(r9, r6, r3)
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00cd
        L_0x00c8:
            r7.A01 = r1
            r7.A04 = r4
            goto L_0x0072
        L_0x00cd:
            int r6 = r6 + 1
            goto L_0x00b6
        L_0x00d0:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00c8
        L_0x00d6:
            long r0 = r7.A01
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x00eb
            X.XdL r3 = r7.A07
            long r5 = r3.A02(r0)
            long r0 = r7.A02
            long r0 = r3.A03(r0)
            long r0 = r0 - r5
            r7.A00 = r0
        L_0x00eb:
            X.SRd r1 = r7.A06
            byte[] r0 = androidx.media3.common.util.Util.A07
            r1.A0Q(r0, r2)
            r7.A03 = r4
            r8.EI7()
            goto L_0x0072
        L_0x00f9:
            r9.A00 = r0
            r0 = 1
            return r0
        L_0x00fd:
            boolean r5 = r3.A05
            if (r5 != 0) goto L_0x0138
            r3.A05 = r4
            X.Xb4 r10 = r3.A0C
            long r14 = r10.A00
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x014e
            X.XdL r6 = r10.A07
            int r5 = r3.A01
            X.XvN r11 = new X.XvN
            r11.<init>()
            X.XvQ r12 = new X.XvQ
            r12.<init>(r6, r5)
            r5 = 1
            long r16 = r14 + r5
            r18 = 0
            r22 = 188(0xbc, double:9.3E-322)
            r13 = 940(0x3ac, float:1.317E-42)
            X.XGv r10 = new X.XGv
            r20 = r0
            r10.<init>(r11, r12, r13, r14, r16, r18, r20, r22)
            r3.A04 = r10
            X.YBZ r6 = r3.A03
            X.Xvd r5 = r10.A01
        L_0x0135:
            r6.EKw(r5)
        L_0x0138:
            boolean r5 = r3.A07
            if (r5 == 0) goto L_0x0156
            r3.A07 = r2
            r5 = 0
            r3.EKu(r5, r5)
            long r10 = r8.Bdl()
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0156
            r9.A00 = r5
            return r4
        L_0x014e:
            X.YBZ r6 = r3.A03
            X.Sf7 r5 = new X.Sf7
            r5.<init>(r14)
            goto L_0x0135
        L_0x0156:
            X.XGv r6 = r3.A04
            if (r6 == 0) goto L_0x0163
            X.XnH r5 = r6.A00
            if (r5 == 0) goto L_0x0163
            int r0 = r6.A00(r8, r9)
            return r0
        L_0x0163:
            X.SRd r9 = r3.A0B
            byte[] r12 = r9.A02
            int r6 = r9.A01
            int r5 = 9400 - r6
            r7 = 188(0xbc, float:2.63E-43)
            if (r5 >= r7) goto L_0x017a
            int r5 = r9.A00
            int r5 = r5 - r6
            if (r5 <= 0) goto L_0x0177
            java.lang.System.arraycopy(r12, r6, r12, r2, r5)
        L_0x0177:
            r9.A0Q(r12, r5)
        L_0x017a:
            int r10 = r9.A00
            int r11 = r9.A01
            int r5 = r10 - r11
            if (r5 >= r7) goto L_0x01ba
            int r5 = 9400 - r10
            int r5 = r8.read(r12, r10, r5)
            r6 = -1
            if (r5 == r6) goto L_0x0190
            int r10 = r10 + r5
            r9.A0N(r10)
            goto L_0x017a
        L_0x0190:
            android.util.SparseArray r1 = r3.A08
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x01b8
            java.lang.Object r5 = r1.valueAt(r2)
            X.YAN r5 = (X.YAN) r5
            boolean r0 = r5 instanceof X.C22124Xvo
            if (r0 == 0) goto L_0x01b5
            X.Xvo r5 = (X.C22124Xvo) r5
            int r1 = r5.A03
            r0 = 3
            if (r1 != r0) goto L_0x01b5
            int r0 = r5.A02
            if (r0 != r6) goto L_0x01b5
            X.SRd r0 = new X.SRd
            r0.<init>()
            r5.AJQ(r0, r4)
        L_0x01b5:
            int r2 = r2 + 1
            goto L_0x0190
        L_0x01b8:
            r0 = -1
            return r0
        L_0x01ba:
            byte[] r8 = r9.A02
            r7 = r11
        L_0x01bd:
            if (r7 >= r10) goto L_0x01c8
            byte r6 = r8[r7]
            r5 = 71
            if (r6 == r5) goto L_0x01c8
            int r7 = r7 + 1
            goto L_0x01bd
        L_0x01c8:
            r9.A0O(r7)
            int r8 = r7 + 188
            if (r8 <= r10) goto L_0x0257
            int r5 = r3.A00
            int r7 = r7 - r11
            int r5 = r5 + r7
            r3.A00 = r5
        L_0x01d5:
            int r11 = r9.A00
            if (r8 > r11) goto L_0x0256
            int r6 = r9.A01()
            r5 = 8388608(0x800000, float:1.17549435E-38)
            r5 = r5 & r6
            if (r5 != 0) goto L_0x0253
            r5 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 & r6
            boolean r10 = X.AnonymousClass7TF.A1P(r5)
            r5 = 2096896(0x1fff00, float:2.938377E-39)
            r5 = r5 & r6
            int r12 = r5 >> 8
            r5 = r6 & 32
            boolean r14 = X.AnonymousClass7TF.A1P(r5)
            r5 = r6 & 16
            if (r5 == 0) goto L_0x0253
            android.util.SparseArray r5 = r3.A08
            java.lang.Object r7 = r5.get(r12)
            X.YAN r7 = (X.YAN) r7
            if (r7 == 0) goto L_0x0253
            r6 = r6 & 15
            android.util.SparseIntArray r13 = r3.A0G
            int r5 = r6 + -1
            int r5 = r13.get(r12, r5)
            r13.put(r12, r6)
            if (r5 == r6) goto L_0x0253
            int r5 = r5 + 1
            r5 = r5 & 15
            if (r6 == r5) goto L_0x021b
            r7.EKt()
        L_0x021b:
            if (r14 == 0) goto L_0x0230
            int r13 = r9.A05()
            int r5 = r9.A05()
            r6 = r5 & 64
            r5 = 0
            if (r6 == 0) goto L_0x022b
            r5 = 2
        L_0x022b:
            r10 = r10 | r5
            int r13 = r13 - r4
            r9.A0P(r13)
        L_0x0230:
            boolean r6 = r3.A06
            if (r6 != 0) goto L_0x023c
            android.util.SparseBooleanArray r5 = r3.A0A
            boolean r5 = r5.get(r12, r2)
            if (r5 != 0) goto L_0x0247
        L_0x023c:
            r9.A0N(r8)
            r7.AJQ(r9, r10)
            r9.A0N(r11)
            if (r6 != 0) goto L_0x0253
        L_0x0247:
            boolean r5 = r3.A06
            if (r5 == 0) goto L_0x0253
            r6 = -1
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0253
            r3.A07 = r4
        L_0x0253:
            r9.A0O(r8)
        L_0x0256:
            return r2
        L_0x0257:
            r3.A00 = r2
            goto L_0x01d5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22106XvW.E67(X.TlA, X.XYr):int");
    }

    public final boolean Evx(C13910TlA tlA) {
        byte[] bArr = this.A0B.A02;
        tlA.E2F(bArr, 0, 940);
        int i = 0;
        do {
            int i2 = 0;
            while (bArr[(i2 * 188) + i] == 71) {
                i2++;
                if (i2 >= 5) {
                    tlA.Evk(i);
                    return true;
                }
            }
            i++;
        } while (i < 188);
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.SRd, java.lang.Object] */
    public C22106XvW(C21505XdL xdL, C13890TjD tjD, TZd tZd, int i) {
        this.A0D = tZd;
        this.A0F = i;
        this.A0H = tjD;
        this.A0E = Collections.singletonList(xdL);
        ? obj = new Object();
        obj.A02 = new byte[9400];
        obj.A00 = 0;
        this.A0B = obj;
        this.A09 = new SparseBooleanArray();
        this.A0A = new SparseBooleanArray();
        this.A08 = new SparseArray();
        this.A0G = new SparseIntArray();
        this.A0C = new C21452Xb4();
        this.A03 = YBZ.A00;
        this.A01 = -1;
        this.A09.clear();
        SparseArray sparseArray = this.A08;
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new C22123Xvn(new C11750Sfl(this)));
    }

    @Deprecated
    public C22106XvW() {
        this(new C21505XdL(), C13890TjD.A00, new C11752Sfn(ImmutableList.of()), 1);
    }
}
