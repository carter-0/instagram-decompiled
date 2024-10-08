package X;

/* renamed from: X.4Q9  reason: invalid class name */
public final class AnonymousClass4Q9 extends C264434Pw {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1 A[LOOP:4: B:27:0x00b1->B:28:0x00b3, LOOP_START, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:12:0x0035, B:28:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E5v(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r4 = r10.position()
            int r3 = r10.limit()
            int r2 = r3 - r4
            X.4Px r0 = r9.A00
            int r0 = r0.A02
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = 4
            r1 = 3
            if (r0 == r1) goto L_0x002b
            if (r0 == r5) goto L_0x0026
            if (r0 == r6) goto L_0x002d
            if (r0 == r7) goto L_0x0029
            if (r0 == r8) goto L_0x0026
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0026:
            int r2 = r2 / 2
            goto L_0x002d
        L_0x0029:
            int r2 = r2 / 3
        L_0x002b:
            int r2 = r2 * 2
        L_0x002d:
            java.nio.ByteBuffer r2 = r9.A02(r2)
            X.4Px r0 = r9.A00
            int r0 = r0.A02
            if (r0 == r1) goto L_0x00b1
            if (r0 == r5) goto L_0x0088
            if (r0 == r6) goto L_0x0073
            if (r0 == r7) goto L_0x005c
            if (r0 == r8) goto L_0x0045
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0045:
            if (r4 >= r3) goto L_0x00c6
            int r0 = r4 + 2
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r0 = r4 + 3
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r4 = r4 + 4
            goto L_0x0045
        L_0x005c:
            if (r4 >= r3) goto L_0x00c6
            int r0 = r4 + 1
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r0 = r4 + 2
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r4 = r4 + 3
            goto L_0x005c
        L_0x0073:
            if (r4 >= r3) goto L_0x00c6
            int r0 = r4 + 1
            byte r0 = r10.get(r0)
            r2.put(r0)
            byte r0 = r10.get(r4)
            r2.put(r0)
            int r4 = r4 + 2
            goto L_0x0073
        L_0x0088:
            if (r4 >= r3) goto L_0x00c6
            float r5 = r10.getFloat(r4)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r5, r0)
            float r1 = java.lang.Math.max(r1, r0)
            r0 = 1191181824(0x46fffe00, float:32767.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            short r1 = (short) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 4
            goto L_0x0088
        L_0x00b1:
            if (r4 >= r3) goto L_0x00c6
            r0 = 0
            r2.put(r0)
            byte r0 = r10.get(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + -128
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 1
            goto L_0x00b1
        L_0x00c6:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Q9.E5v(java.nio.ByteBuffer):void");
    }
}
