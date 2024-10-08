package X;

/* renamed from: X.Vh2  reason: case insensitive filesystem */
public final class C17849Vh2 {
    public C367508qr A00 = new C367508qr(1, 1);
    public Integer A01;
    public final C17760VfW A02;
    public final /* synthetic */ C18812W3v A03;

    public C17849Vh2(C18812W3v w3v) {
        Integer num;
        this.A03 = w3v;
        if (w3v.A0K.A00.CTO(80)) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0N;
        }
        this.A01 = num;
        this.A02 = new C17760VfW(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016b, code lost:
        if (r5 <= 1) goto L_0x019d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C367508qr A00(X.C365468nA r21, int r22, int r23) {
        /*
            r20 = this;
            r3 = r20
            X.W3v r6 = r3.A03
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x019d
            X.7rW r0 = r6.A0K
            X.7r6 r9 = r0.A00
            r0 = 80
            boolean r0 = r9.CTO(r0)
            X.0JA.A06(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r3.A01 = r2
            r0 = 0
            r6.A0E = r0
            r4 = 1
            r8 = r22
            r7 = r23
            if (r22 == 0) goto L_0x010f
            if (r23 == 0) goto L_0x010f
            java.util.ArrayList r5 = r6.A0f
            X.8KU r0 = X.V5Y.A00(r5)
            if (r0 == 0) goto L_0x010f
            X.8nA r12 = X.C365468nA.CROP
            r0 = r21
            if (r0 == r12) goto L_0x0034
            r4 = 0
        L_0x0034:
            X.8KU r19 = X.V5Y.A00(r5)
            r19.getClass()
            int r18 = r5.size()
            r17 = 0
            r11 = 0
        L_0x0042:
            r0 = r18
            if (r11 >= r0) goto L_0x00f1
            java.lang.Object r13 = r5.get(r11)
            X.8KU r13 = (X.AnonymousClass8KU) r13
            boolean r0 = X.C16767V5a.A00(r13)
            if (r0 == 0) goto L_0x00e7
            int r10 = r13.getHeight()
            int r1 = r13.getWidth()
        L_0x005a:
            r0 = 1
            if (r10 <= r0) goto L_0x00e3
            if (r1 <= r0) goto L_0x00e3
            int r10 = r19.getWidth()
            int r0 = r19.getHeight()
            boolean r1 = X.C16767V5a.A00(r19)
            float r14 = (float) r0
            r15 = r14
            float r0 = (float) r10
            if (r1 == 0) goto L_0x0072
            r14 = r0
            r0 = r15
        L_0x0072:
            float r14 = r14 / r0
            int r15 = r13.getWidth()
            int r1 = r13.getHeight()
            boolean r16 = X.C16767V5a.A00(r13)
            float r10 = (float) r1
            float r0 = (float) r15
            if (r16 == 0) goto L_0x0085
            float r10 = (float) r15
            float r0 = (float) r1
        L_0x0085:
            float r10 = r10 / r0
            r15 = 4576918229175238656(0x3f847ae140000000, double:0.009999999776482582)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e0
            float r14 = r14 / r10
        L_0x0092:
            float r14 = r14 - r1
            double r0 = (double) r14
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x00a4
            X.8nA r0 = r13.BHU()
            if (r0 == 0) goto L_0x00e3
            X.8nA r0 = r13.BHU()
            if (r0 == r12) goto L_0x00e3
        L_0x00a4:
            if (r4 == 0) goto L_0x010d
            if (r17 == 0) goto L_0x00f4
            X.8KU r13 = X.V5Y.A00(r5)
            r13.getClass()
            int r11 = r5.size()
            r10 = 0
        L_0x00b4:
            if (r10 >= r11) goto L_0x0111
            java.lang.Object r4 = r5.get(r10)
            X.8KU r4 = (X.AnonymousClass8KU) r4
            boolean r0 = X.C16767V5a.A00(r4)
            if (r0 == 0) goto L_0x00db
            int r1 = r4.getHeight()
        L_0x00c6:
            boolean r0 = X.C16767V5a.A00(r13)
            if (r0 == 0) goto L_0x00d6
            int r0 = r13.getHeight()
        L_0x00d0:
            if (r1 <= r0) goto L_0x00d3
            r13 = r4
        L_0x00d3:
            int r10 = r10 + 1
            goto L_0x00b4
        L_0x00d6:
            int r0 = r13.getWidth()
            goto L_0x00d0
        L_0x00db:
            int r1 = r4.getWidth()
            goto L_0x00c6
        L_0x00e0:
            float r14 = r10 / r14
            goto L_0x0092
        L_0x00e3:
            int r11 = r11 + 1
            goto L_0x0042
        L_0x00e7:
            int r10 = r13.getWidth()
            int r1 = r13.getHeight()
            goto L_0x005a
        L_0x00f1:
            r17 = 1
            goto L_0x00a4
        L_0x00f4:
            X.Va6 r0 = r6.A0L
            X.VLE r10 = r0.A02
            if (r10 == 0) goto L_0x0101
            long r0 = r10.A00
            r4 = 1
            long r0 = r0 + r4
            r10.A00 = r0
        L_0x0101:
            r0 = 82
            boolean r0 = r9.CTO(r0)
            if (r0 == 0) goto L_0x010d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3.A01 = r0
        L_0x010d:
            r4 = r8
            goto L_0x012f
        L_0x010f:
            r5 = 1
            goto L_0x0130
        L_0x0111:
            float r12 = (float) r7
            float r11 = (float) r8
            float r10 = r12 / r11
            int r5 = r13.getWidth()
            int r0 = r13.getHeight()
            boolean r4 = X.C16767V5a.A00(r13)
            float r1 = (float) r0
            r13 = r1
            float r0 = (float) r5
            if (r4 == 0) goto L_0x0128
            r1 = r0
            r0 = r13
        L_0x0128:
            float r1 = r1 / r0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0199
            float r12 = r12 / r1
            int r4 = (int) r12
        L_0x012f:
            r5 = r7
        L_0x0130:
            r1 = 82
            boolean r0 = r9.CTO(r1)
            if (r0 == 0) goto L_0x0144
            java.lang.Integer r0 = r3.A01
            if (r0 != r2) goto L_0x0144
            if (r4 != r8) goto L_0x0144
            if (r5 != r7) goto L_0x0144
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A01 = r0
        L_0x0144:
            r0 = 81
            boolean r0 = r9.CTO(r0)
            if (r0 == 0) goto L_0x016d
            boolean r0 = r9.CTO(r1)
            if (r0 != 0) goto L_0x015e
            java.lang.Integer r0 = r3.A01
            if (r0 != r2) goto L_0x015e
            if (r4 != r8) goto L_0x015e
            if (r5 != r7) goto L_0x015e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A01 = r0
        L_0x015e:
            X.8qr r0 = r3.A00
            int r2 = r0.A01
            int r1 = r0.A00
            r0 = 1
            if (r2 <= r0) goto L_0x016d
            if (r1 <= r0) goto L_0x016d
            if (r4 <= r0) goto L_0x019d
            if (r5 <= r0) goto L_0x019d
        L_0x016d:
            float r1 = r6.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x017a
            float r0 = (float) r4
            float r0 = r0 * r1
            int r4 = (int) r0
            float r0 = (float) r5
            float r0 = r0 * r1
            int r5 = (int) r0
        L_0x017a:
            X.8qr r2 = r3.A00
            if (r2 == 0) goto L_0x0193
            int r0 = r2.A01
            int r0 = X.C13988Tno.A06(r0, r4)
            r1 = 16
            if (r0 >= r1) goto L_0x0193
            int r0 = r2.A00
            int r0 = X.C13988Tno.A06(r0, r5)
            if (r0 >= r1) goto L_0x0193
        L_0x0190:
            r3.A00 = r2
            return r2
        L_0x0193:
            X.8qr r2 = new X.8qr
            r2.<init>(r4, r5)
            goto L_0x0190
        L_0x0199:
            float r11 = r11 * r1
            int r5 = (int) r11
            r4 = r8
            goto L_0x0130
        L_0x019d:
            X.8qr r2 = r3.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17849Vh2.A00(X.8nA, int, int):X.8qr");
    }
}
