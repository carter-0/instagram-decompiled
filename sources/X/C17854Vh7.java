package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vh7  reason: case insensitive filesystem */
public final class C17854Vh7 {
    public final C18439Vri A00;
    public final List A01;
    public final C17771Vfi A02;
    public final VXI A03;

    public C17854Vh7(C18439Vri vri, List list) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = vri;
        C17771Vfi vfi = new C17771Vfi(this);
        this.A02 = vfi;
        ArrayList A1M = 0sr.A1M(new Integer[]{C51967G9n.A0k()});
        int i = 0;
        int i2 = 0;
        for (C15092UOk uOk : this.A01) {
            int i3 = i + 1;
            if (i2 != 0) {
                int length = uOk.A06.length() + i2 + 1;
                C18439Vri vri2 = this.A00;
                if (length > (vri2 == null ? new C18439Vri(27, 35) : vri2).A00) {
                    AnonymousClass7TF.A1M(A1M, i);
                    i2 = 0;
                }
            }
            i2 += uOk.A06.length() + 1;
            i = i3;
        }
        this.A03 = new VXI(vfi, A1M);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r12 >= r1.size()) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0113, code lost:
        if (r12 > r1.size()) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00() {
        /*
            r17 = this;
            r1 = r17
            java.util.List r0 = r1.A01
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0171
            r11 = 1
            if (r0 == r11) goto L_0x0168
            X.VXI r10 = r1.A03
            java.lang.Object r9 = r10.A01
            X.Vfi r8 = r10.A00
            int r7 = r8.A00(r9)
            r6 = 500(0x1f4, float:7.0E-43)
            r5 = r7
            r4 = 0
            r16 = r9
        L_0x001d:
            float r1 = (float) r4
            r0 = 1140457472(0x43fa0000, float:500.0)
            float r1 = r1 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2 - r1
            r0 = 1008981770(0x3c23d70a, float:0.01)
            float r15 = X.C229632nm.A02(r1, r0, r2)
            java.util.Random r3 = r10.A02
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            X.Dba.A0j(r11, r3, r1)
        L_0x0034:
            r0 = 3
            int r0 = r3.nextInt(r0)
            if (r0 == 0) goto L_0x0136
            if (r0 == r11) goto L_0x00df
            int r0 = r1.size()
            if (r0 <= r11) goto L_0x0034
            int r0 = X.DbT.A02(r1, r11)
            int r0 = r3.nextInt(r0)
            int r12 = r0 + 1
            java.lang.Object r0 = X.00k.A0O(r1, r12)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0034
            int r13 = r0.intValue()
            boolean r2 = r3.nextBoolean()
            r0 = -1
            if (r2 == 0) goto L_0x0061
            r0 = 1
        L_0x0061:
            int r13 = r13 + r0
            int r0 = r12 + -1
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00dd
            int r2 = r0.intValue()
        L_0x0070:
            int r0 = r12 + 1
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00d4
            int r0 = r0.intValue()
        L_0x007e:
            if (r2 > r13) goto L_0x0034
            if (r13 >= r0) goto L_0x0034
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            X.Vh7 r14 = r8.A00
            if (r12 < 0) goto L_0x0092
            int r1 = r1.size()
            r0 = 1
            if (r12 < r1) goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x0156
            if (r13 < 0) goto L_0x0150
            java.util.List r0 = r14.A01
            int r0 = r0.size()
            if (r13 >= r0) goto L_0x0150
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r2.set(r12, r0)
        L_0x00a8:
            int r12 = r8.A00(r2)
            if (r12 >= r7) goto L_0x00c8
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x00b0:
            float r0 = r3.nextFloat()
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bf
            r9 = r2
            r7 = r12
            if (r12 >= r5) goto L_0x00bf
            r16 = r2
            r5 = r12
        L_0x00bf:
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x001d
            r0 = r16
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x00c8:
            int r0 = r12 - r7
            int r0 = -r0
            float r0 = (float) r0
            float r0 = r0 / r15
            double r0 = (double) r0
            double r0 = java.lang.Math.exp(r0)
            float r13 = (float) r0
            goto L_0x00b0
        L_0x00d4:
            X.Vh7 r0 = r8.A00
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            goto L_0x007e
        L_0x00dd:
            r2 = 1
            goto L_0x0070
        L_0x00df:
            int r0 = r1.size()
            int r0 = r3.nextInt(r0)
            int r12 = r0 + 1
            int r0 = r12 + -1
            int r0 = X.C51971G9r.A0I(r1, r0)
            int r13 = r0 + 1
            java.lang.Object r0 = X.00k.A0O(r1, r12)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x012d
            int r0 = r0.intValue()
        L_0x00fd:
            if (r13 >= r0) goto L_0x0034
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            X.Vh7 r14 = r8.A00
            int r0 = r0 - r13
            int r0 = r3.nextInt(r0)
            int r13 = r13 + r0
            if (r12 < 0) goto L_0x0115
            int r1 = r1.size()
            r0 = 1
            if (r12 <= r1) goto L_0x0116
        L_0x0115:
            r0 = 0
        L_0x0116:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x0162
            if (r13 < 0) goto L_0x015c
            java.util.List r0 = r14.A01
            int r0 = r0.size()
            if (r13 >= r0) goto L_0x015c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r2.add(r12, r0)
            goto L_0x00a8
        L_0x012d:
            X.Vh7 r0 = r8.A00
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            goto L_0x00fd
        L_0x0136:
            int r0 = r1.size()
            if (r0 <= r11) goto L_0x0034
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            int r0 = X.DbT.A02(r1, r11)
            int r0 = r3.nextInt(r0)
            int r0 = r0 + 1
            r2.remove(r0)
            goto L_0x00a8
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0156:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x015c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0162:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0168:
            java.lang.Integer r0 = X.C51967G9n.A0k()
            java.util.List r16 = X.AnonymousClass7TE.A1I(r0)
            return r16
        L_0x0171:
            X.0sn r16 = X.0sn.A00
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17854Vh7.A00():java.util.List");
    }
}
