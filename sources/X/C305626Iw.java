package X;

/* renamed from: X.6Iw  reason: invalid class name and case insensitive filesystem */
public final class C305626Iw implements C305636Ix {
    public final int A00;
    public final Object[] A01;
    public final 01h A02;

    public final int BGq(Object obj) {
        01h r0 = this.A02;
        int A03 = r0.A03(obj);
        if (A03 >= 0) {
            return r0.A02[A03];
        }
        return -1;
    }

    public final Object BK0(int i) {
        Object[] objArr = this.A01;
        int i2 = i - this.A00;
        if (i2 < 0) {
            return null;
        }
        0qQ.A0B(objArr, 0);
        if (i2 <= objArr.length - 1) {
            return objArr[i2];
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007b, code lost:
        if (r2 == null) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C305626Iw(X.AnonymousClass69H r15, X.2HY r16) {
        /*
            r14 = this;
            r14.<init>()
            X.6Is r4 = r15.A00()
            r0 = r16
            int r12 = r0.A00
            r3 = 1
            r2 = 0
            if (r12 < 0) goto L_0x0099
            int r1 = r0.A01
            X.6Ir r4 = (X.C305596Ir) r4
            int r0 = r4.A00
            int r0 = r0 - r3
            int r11 = java.lang.Math.min(r1, r0)
            if (r11 >= r12) goto L_0x002a
            X.0vu r1 = X.AnonymousClass01i.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"
            X.0qQ.A0C(r1, r0)
            r14.A02 = r1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r14.A01 = r0
            return
        L_0x002a:
            int r0 = r11 - r12
            int r1 = r0 + 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r14.A01 = r0
            r14.A00 = r12
            X.0vu r10 = new X.0vu
            r10.<init>(r1)
            X.C305596Ir.A00(r4, r12)
            X.C305596Ir.A00(r4, r11)
            X.5Pl r9 = r4.A02
            int r13 = X.AnonymousClass6Iy.A00(r9, r12)
            java.lang.Object[] r0 = r9.A02
            r0 = r0[r13]
            X.6It r0 = (X.AnonymousClass6It) r0
            int r8 = r0.A01
        L_0x004d:
            if (r8 > r11) goto L_0x0096
            java.lang.Object[] r0 = r9.A02
            r1 = r0[r13]
            X.6It r1 = (X.AnonymousClass6It) r1
            java.lang.Object r0 = r1.A02
            X.6Iv r0 = (X.AnonymousClass6Iv) r0
            X.0sP r7 = r0.BK5()
            int r6 = r1.A01
            int r5 = java.lang.Math.max(r12, r6)
            int r4 = r1.A00
            int r0 = r6 + r4
            int r0 = r0 + -1
            int r3 = java.lang.Math.min(r11, r0)
            if (r5 > r3) goto L_0x0092
        L_0x006f:
            if (r7 == 0) goto L_0x007d
            int r0 = r5 - r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r7.invoke(r0)
            if (r2 != 0) goto L_0x0082
        L_0x007d:
            androidx.compose.foundation.lazy.layout.DefaultLazyKey r2 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
            r2.<init>(r5)
        L_0x0082:
            r10.A06(r2, r5)
            java.lang.Object[] r1 = r14.A01
            int r0 = r14.A00
            int r0 = r5 - r0
            r1[r0] = r2
            if (r5 == r3) goto L_0x0092
            int r5 = r5 + 1
            goto L_0x006f
        L_0x0092:
            int r8 = r8 + r4
            int r13 = r13 + 1
            goto L_0x004d
        L_0x0096:
            r14.A02 = r10
            return
        L_0x0099:
            java.lang.String r1 = "negative nearestRange.first"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C305626Iw.<init>(X.69H, X.2HY):void");
    }
}
