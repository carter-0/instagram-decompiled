package X;

import java.nio.FloatBuffer;

/* renamed from: X.VhA  reason: case insensitive filesystem */
public final class C17857VhA {
    public final C14271Tsu A00;
    public final Um6 A01;
    public final FloatBuffer A02 = FloatBuffer.allocate(16);
    public final C14261Tsj A03;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.UmH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17857VhA(X.C14261Tsj r6) {
        /*
            r5 = this;
            r4 = 1
            X.0qQ.A0B(r6, r4)
            r5.<init>()
            r5.A03 = r6
            r0 = 16
            java.nio.FloatBuffer r0 = java.nio.FloatBuffer.allocate(r0)
            r5.A02 = r0
            java.lang.String r0 = "u_enableModelViewMatrix"
            java.util.Map r1 = r6.A03
            java.lang.Object r3 = r1.get(r0)
            X.UmH r3 = (X.UmH) r3
            boolean r0 = r3 instanceof X.C14271Tsu
            r2 = 0
            if (r0 == 0) goto L_0x003a
            X.Tsu r3 = (X.C14271Tsu) r3
        L_0x0022:
            java.lang.String r0 = "u_modelViewMatrix"
            java.lang.Object r1 = r1.get(r0)
            X.UmH r1 = (X.UmH) r1
            boolean r0 = r1 instanceof X.Um6
            if (r0 == 0) goto L_0x0031
            r2 = r1
            X.Um6 r2 = (X.Um6) r2
        L_0x0031:
            if (r3 == 0) goto L_0x003c
            if (r2 == 0) goto L_0x003c
            r5.A00 = r3
            r5.A01 = r2
            return
        L_0x003a:
            r3 = r2
            goto L_0x0022
        L_0x003c:
            java.lang.String r1 = "Could not initialize "
            java.lang.String r0 = X.C51968G9o.A16(r5)
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.0qQ.A0B(r1, r4)
            X.V1t r0 = new X.V1t
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17857VhA.<init>(X.Tsj):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (X.AnonymousClass9S9.A05("glViewport") != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (X.AnonymousClass9S9.A05("prepareToRender") != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.VY1 r24) {
        /*
            r23 = this;
            r9 = 0
            r10 = r24
            X.0qQ.A0B(r10, r9)
            int r8 = r10.A01
            float r0 = (float) r8
            r3 = 1325400064(0x4f000000, float:2.14748365E9)
            float r0 = r0 / r3
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            r20 = r0
            int r7 = r10.A00
            float r0 = (float) r7
            float r0 = r0 / r3
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r6 = (int) r0
            int r8 = r8 / r20
            int r7 = r7 / r6
            r19 = 0
            r5 = 0
        L_0x0024:
            if (r5 >= r6) goto L_0x010d
            r4 = 0
        L_0x0027:
            r0 = r20
            if (r4 >= r0) goto L_0x0109
            int r3 = r10.A02
            int r0 = r4 * r8
            int r11 = r3 + r0
            int r0 = r20 + -1
            if (r4 >= r0) goto L_0x0104
            int r3 = r11 + r8
        L_0x0037:
            int r1 = r10.A03
            int r0 = r5 * r7
            int r2 = r1 + r0
            int r0 = r6 + -1
            if (r5 >= r0) goto L_0x00ff
            int r1 = r2 + r7
        L_0x0043:
            r12 = 1
            r22 = r23
            r0 = r20
            if (r0 != r12) goto L_0x0090
            if (r6 != r12) goto L_0x0090
            r0 = r22
            X.Tsu r0 = r0.A00
            r0.A00(r9)
        L_0x0053:
            int r3 = r3 - r11
            int r1 = r1 - r2
            android.opengl.GLES20.glViewport(r11, r2, r3, r1)
            if (r19 != 0) goto L_0x0063
            java.lang.String r0 = "glViewport"
            boolean r0 = X.AnonymousClass9S9.A05(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0064
        L_0x0063:
            r1 = 1
        L_0x0064:
            r0 = r22
            X.Tsj r0 = r0.A03
            r0.A00()
            if (r1 != 0) goto L_0x0076
            java.lang.String r0 = "prepareToRender"
            boolean r0 = X.AnonymousClass9S9.A05(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0077
        L_0x0076:
            r2 = 1
        L_0x0077:
            r1 = 5
            r0 = 4
            android.opengl.GLES20.glDrawArrays(r1, r9, r0)
            if (r2 != 0) goto L_0x0088
            java.lang.String r0 = "glDrawArrays"
            boolean r0 = X.AnonymousClass9S9.A05(r0)
            r19 = 0
            if (r0 == 0) goto L_0x008a
        L_0x0088:
            r19 = 1
        L_0x008a:
            android.opengl.GLES20.glFlush()
            int r4 = r4 + 1
            goto L_0x0027
        L_0x0090:
            r0 = r22
            java.nio.FloatBuffer r0 = r0.A02
            r21 = r0
            float[] r0 = r21.array()
            android.opengl.Matrix.setIdentityM(r0, r9)
            int r0 = r11 + r3
            float r0 = (float) r0
            r17 = 1073741824(0x40000000, float:2.0)
            float r18 = r0 / r17
            int r0 = r2 + r1
            float r0 = (float) r0
            float r16 = r0 / r17
            int r0 = r10.A02
            float r14 = (float) r0
            int r0 = r10.A01
            float r0 = (float) r0
            float r0 = r0 / r17
            float r14 = r14 + r0
            int r0 = r10.A03
            float r13 = (float) r0
            int r0 = r10.A00
            float r0 = (float) r0
            float r0 = r0 / r17
            float r13 = r13 + r0
            float[] r15 = r21.array()
            float r14 = r14 - r18
            float r14 = r14 * r17
            int r0 = r3 - r11
            float r0 = (float) r0
            r18 = r0
            float r14 = r14 / r0
            float r13 = r13 - r16
            float r13 = r13 * r17
            int r0 = r1 - r2
            float r0 = (float) r0
            r17 = r0
            float r13 = r13 / r0
            r0 = 0
            android.opengl.Matrix.translateM(r15, r9, r14, r13, r0)
            float[] r16 = r21.array()
            int r0 = r10.A01
            float r15 = (float) r0
            float r15 = r15 / r18
            int r0 = r10.A00
            float r14 = (float) r0
            float r14 = r14 / r17
            r13 = 1065353216(0x3f800000, float:1.0)
            r0 = r16
            android.opengl.Matrix.scaleM(r0, r9, r15, r14, r13)
            r0 = r22
            X.Tsu r0 = r0.A00
            r0.A00(r12)
            r0 = r22
            X.Um6 r13 = r0.A01
            r0 = r21
            r13.A00 = r0
            r13.A00 = r12
            goto L_0x0053
        L_0x00ff:
            int r0 = r10.A00
            int r1 = r1 + r0
            goto L_0x0043
        L_0x0104:
            int r0 = r10.A01
            int r3 = r3 + r0
            goto L_0x0037
        L_0x0109:
            int r5 = r5 + 1
            goto L_0x0024
        L_0x010d:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17857VhA.A00(X.VY1):boolean");
    }
}
