package X;

import java.util.List;

/* renamed from: X.8fr  reason: invalid class name and case insensitive filesystem */
public final class C361218fr implements C344747sM {
    public C361228fs A00;
    public C345977uO A01;
    public C345897uG A02;
    public final C344407ro A03;

    public final void A00(C345897uG r9, C345137sz r10, C345097sv r11) {
        A01(r9, r10, r11, (C345057sr) null, true, true, false);
    }

    public final void A02(C345897uG r11, C345137sz r12, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            this.A03.A00(C368978td.GL_COPY_RENDERER_SKIP_OUTPUT_SET_EMPTY);
            return;
        }
        for (int i = 0; i < size; i++) {
            A01(r11, r12, (C345097sv) list.get(i), (C345057sr) null, true, z, false);
        }
    }

    public final void CMa(C344567s4 r1) {
    }

    public final void release() {
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [X.8fs, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r3.A00() != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r2.A00() != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019e, code lost:
        if (r2 == null) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a7, code lost:
        if (r5 != false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b0, code lost:
        if (r4 != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01cc, code lost:
        if (r2 != false) goto L_0x01ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C345897uG r38, X.C345137sz r39, X.C345097sv r40, X.C345057sr r41, boolean r42, boolean r43, boolean r44) {
        /*
            r37 = this;
            java.lang.String r0 = "GlCopyRenderer.renderFrame()"
            X.C349257zq.A03(r0)
            r13 = r40
            java.lang.Object r18 = r13.BNo()
            monitor-enter(r18)
            r14 = r37
            r19 = r38
            if (r38 != 0) goto L_0x0014
            goto L_0x01d9
        L_0x0014:
            X.7uG r1 = r14.A02     // Catch:{ all -> 0x01e5 }
            r0 = r19
            if (r0 == r1) goto L_0x0021
            X.7ro r1 = r14.A03     // Catch:{ all -> 0x01e5 }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_DIFFERENT_CONTEXT     // Catch:{ all -> 0x01e5 }
            r1.A00(r0)     // Catch:{ all -> 0x01e5 }
        L_0x0021:
            X.7uO r12 = r14.A01     // Catch:{ all -> 0x01e5 }
            X.7uN r1 = r19.Blv()     // Catch:{ all -> 0x01e5 }
            boolean r0 = r1.A01()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x002f
            X.7uO r12 = r1.A03     // Catch:{ all -> 0x01e5 }
        L_0x002f:
            if (r12 != 0) goto L_0x003d
            X.C349257zq.A01()     // Catch:{ all -> 0x01e5 }
            X.7ro r1 = r14.A03     // Catch:{ all -> 0x01e5 }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_NOT_INITIALIZED     // Catch:{ all -> 0x01e5 }
            r1.A00(r0)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e3
        L_0x003d:
            r1 = r39
            X.7v0 r22 = r1.getTexture()     // Catch:{ all -> 0x01e5 }
            boolean r0 = r13.CSb(r1)     // Catch:{ all -> 0x01e5 }
            r2 = r0 ^ 1
            if (r22 == 0) goto L_0x01c5
            if (r2 != 0) goto L_0x01ce
            java.lang.String r0 = "GlCopyRenderer.makeCurrent()"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x01bd }
            java.lang.Exception r0 = r13.ClT()     // Catch:{ all -> 0x01bd }
            X.C349257zq.A01()     // Catch:{ all -> 0x01bd }
            if (r0 != 0) goto L_0x01b9
            r0 = r41
            if (r41 == 0) goto L_0x0064
            X.7ss r2 = r13.FL1(r1, r0)     // Catch:{ all -> 0x01bd }
            goto L_0x0068
        L_0x0064:
            X.7ss r2 = r13.FL0(r1)     // Catch:{ all -> 0x01bd }
        L_0x0068:
            X.7ss r3 = r1.CFP()     // Catch:{ all -> 0x01bd }
            if (r3 == 0) goto L_0x0075
            boolean r0 = r3.A00()     // Catch:{ all -> 0x01bd }
            r5 = 1
            if (r0 == 0) goto L_0x0076
        L_0x0075:
            r5 = 0
        L_0x0076:
            if (r2 == 0) goto L_0x007f
            boolean r0 = r2.A00()     // Catch:{ all -> 0x01bd }
            r4 = 1
            if (r0 == 0) goto L_0x0080
        L_0x007f:
            r4 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x0197
            if (r2 == 0) goto L_0x01a0
            if (r5 != 0) goto L_0x01a9
            if (r4 != 0) goto L_0x01b2
            java.lang.String r0 = "GlCopyRenderer.draw()"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x01bd }
            int r0 = r1.Ap3()     // Catch:{ all -> 0x01bd }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r42)     // Catch:{ all -> 0x01bd }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r43)     // Catch:{ all -> 0x01bd }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r44)     // Catch:{ all -> 0x01bd }
            X.8ft r11 = r1.BCa()     // Catch:{ all -> 0x01bd }
            X.8fs r1 = r14.A00     // Catch:{ all -> 0x01bd }
            if (r1 != 0) goto L_0x0123
            int r17 = r13.BZU()     // Catch:{ all -> 0x01bd }
            boolean r16 = r6.booleanValue()     // Catch:{ all -> 0x01bd }
            boolean r15 = r5.booleanValue()     // Catch:{ all -> 0x01bd }
            boolean r10 = r13.CYX()     // Catch:{ all -> 0x01bd }
            boolean r9 = r13.CdZ()     // Catch:{ all -> 0x01bd }
            boolean r8 = r4.booleanValue()     // Catch:{ all -> 0x01bd }
            int r7 = r2.A01     // Catch:{ all -> 0x01bd }
            int r6 = r2.A00     // Catch:{ all -> 0x01bd }
            float[] r5 = r3.A03     // Catch:{ all -> 0x01bd }
            float[] r4 = r2.A03     // Catch:{ all -> 0x01bd }
            float[] r3 = r3.A02     // Catch:{ all -> 0x01bd }
            float[] r2 = r2.A02     // Catch:{ all -> 0x01bd }
            X.8fs r1 = new X.8fs     // Catch:{ all -> 0x01bd }
            r1.<init>()     // Catch:{ all -> 0x01bd }
            r1.A00 = r0     // Catch:{ all -> 0x01bd }
            r0 = r17
            r1.A01 = r0     // Catch:{ all -> 0x01bd }
            r0 = r16
            r1.A06 = r0     // Catch:{ all -> 0x01bd }
            r1.A07 = r15     // Catch:{ all -> 0x01bd }
            r1.A08 = r10     // Catch:{ all -> 0x01bd }
            r1.A09 = r9     // Catch:{ all -> 0x01bd }
            r1.A05 = r8     // Catch:{ all -> 0x01bd }
            r1.A03 = r7     // Catch:{ all -> 0x01bd }
            r1.A02 = r6     // Catch:{ all -> 0x01bd }
            r1.A0D = r5     // Catch:{ all -> 0x01bd }
            r1.A0B = r4     // Catch:{ all -> 0x01bd }
            r1.A0C = r3     // Catch:{ all -> 0x01bd }
            r1.A0A = r2     // Catch:{ all -> 0x01bd }
            r1.A04 = r11     // Catch:{ all -> 0x01bd }
            r14.A00 = r1     // Catch:{ all -> 0x01bd }
        L_0x00f0:
            X.7ti r21 = r19.BhQ()     // Catch:{ all -> 0x01bd }
            int r15 = r1.A00     // Catch:{ all -> 0x01bd }
            int r14 = r1.A01     // Catch:{ all -> 0x01bd }
            boolean r11 = r1.A06     // Catch:{ all -> 0x01bd }
            boolean r10 = r1.A07     // Catch:{ all -> 0x01bd }
            boolean r9 = r1.A08     // Catch:{ all -> 0x01bd }
            boolean r8 = r1.A09     // Catch:{ all -> 0x01bd }
            boolean r7 = r1.A05     // Catch:{ all -> 0x01bd }
            int r6 = r1.A03     // Catch:{ all -> 0x01bd }
            int r5 = r1.A02     // Catch:{ all -> 0x01bd }
            float[] r4 = r1.A0D     // Catch:{ all -> 0x01bd }
            if (r4 != 0) goto L_0x010c
            float[] r4 = X.C345977uO.A05     // Catch:{ all -> 0x01bd }
        L_0x010c:
            float[] r3 = r1.A0B     // Catch:{ all -> 0x01bd }
            if (r3 != 0) goto L_0x0112
            float[] r3 = X.C345977uO.A05     // Catch:{ all -> 0x01bd }
        L_0x0112:
            float[] r2 = r1.A0C     // Catch:{ all -> 0x01bd }
            if (r2 != 0) goto L_0x0118
            float[] r2 = X.C345977uO.A05     // Catch:{ all -> 0x01bd }
        L_0x0118:
            float[] r0 = r1.A0A     // Catch:{ all -> 0x01bd }
            if (r0 != 0) goto L_0x011e
            float[] r0 = X.C345977uO.A05     // Catch:{ all -> 0x01bd }
        L_0x011e:
            X.8ft r1 = r1.A04     // Catch:{ all -> 0x01bd }
            if (r1 != 0) goto L_0x0167
            goto L_0x0166
        L_0x0123:
            r1.A00 = r0     // Catch:{ all -> 0x01bd }
            int r0 = r13.BZU()     // Catch:{ all -> 0x01bd }
            r1.A01 = r0     // Catch:{ all -> 0x01bd }
            X.8fs r1 = r14.A00     // Catch:{ all -> 0x01bd }
            boolean r0 = r6.booleanValue()     // Catch:{ all -> 0x01bd }
            r1.A06 = r0     // Catch:{ all -> 0x01bd }
            boolean r0 = r5.booleanValue()     // Catch:{ all -> 0x01bd }
            r1.A07 = r0     // Catch:{ all -> 0x01bd }
            boolean r0 = r13.CYX()     // Catch:{ all -> 0x01bd }
            r1.A08 = r0     // Catch:{ all -> 0x01bd }
            boolean r0 = r13.CdZ()     // Catch:{ all -> 0x01bd }
            r1.A09 = r0     // Catch:{ all -> 0x01bd }
            boolean r0 = r4.booleanValue()     // Catch:{ all -> 0x01bd }
            r1.A05 = r0     // Catch:{ all -> 0x01bd }
            int r0 = r2.A01     // Catch:{ all -> 0x01bd }
            r1.A03 = r0     // Catch:{ all -> 0x01bd }
            int r0 = r2.A00     // Catch:{ all -> 0x01bd }
            r1.A02 = r0     // Catch:{ all -> 0x01bd }
            float[] r0 = r3.A03     // Catch:{ all -> 0x01bd }
            r1.A0D = r0     // Catch:{ all -> 0x01bd }
            float[] r0 = r2.A03     // Catch:{ all -> 0x01bd }
            r1.A0B = r0     // Catch:{ all -> 0x01bd }
            float[] r0 = r3.A02     // Catch:{ all -> 0x01bd }
            r1.A0C = r0     // Catch:{ all -> 0x01bd }
            float[] r0 = r2.A02     // Catch:{ all -> 0x01bd }
            r1.A0A = r0     // Catch:{ all -> 0x01bd }
            r1.A04 = r11     // Catch:{ all -> 0x01bd }
            goto L_0x00f0
        L_0x0166:
            r1 = 0
        L_0x0167:
            r20 = r12
            r23 = r1
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r0
            r28 = r15
            r29 = r14
            r30 = r6
            r31 = r5
            r32 = r11
            r33 = r10
            r34 = r9
            r35 = r8
            r36 = r7
            r20.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x01bd }
            X.C349257zq.A01()     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "GlCopyRenderer.swapBuffers()"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x01bd }
            r13.swapBuffers()     // Catch:{ all -> 0x01bd }
            X.C349257zq.A01()     // Catch:{ all -> 0x01bd }
            goto L_0x01b9
        L_0x0197:
            X.7ro r1 = r14.A03     // Catch:{ all -> 0x01bd }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_SKIP_INPUT_VIEWPORT_NULL     // Catch:{ all -> 0x01bd }
            r1.A00(r0)     // Catch:{ all -> 0x01bd }
            if (r2 != 0) goto L_0x01a7
        L_0x01a0:
            X.7ro r1 = r14.A03     // Catch:{ all -> 0x01bd }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_SKIP_INPUT_VIEWPORT_NOT_VALID     // Catch:{ all -> 0x01bd }
            r1.A00(r0)     // Catch:{ all -> 0x01bd }
        L_0x01a7:
            if (r5 == 0) goto L_0x01b0
        L_0x01a9:
            X.7ro r1 = r14.A03     // Catch:{ all -> 0x01bd }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_SKIP_OUTPUT_VIEWPORT_NULL     // Catch:{ all -> 0x01bd }
            r1.A00(r0)     // Catch:{ all -> 0x01bd }
        L_0x01b0:
            if (r4 == 0) goto L_0x01b9
        L_0x01b2:
            X.7ro r1 = r14.A03     // Catch:{ all -> 0x01bd }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_SKIP_OUTPUT_VIEWPORT_NOT_VALID     // Catch:{ all -> 0x01bd }
            r1.A00(r0)     // Catch:{ all -> 0x01bd }
        L_0x01b9:
            r19.makeCurrent()     // Catch:{ all -> 0x01e5 }
            goto L_0x01d5
        L_0x01bd:
            r0 = move-exception
            r19.makeCurrent()     // Catch:{ all -> 0x01e5 }
            X.C349257zq.A01()     // Catch:{ all -> 0x01e5 }
            throw r0     // Catch:{ all -> 0x01e5 }
        L_0x01c5:
            X.7ro r1 = r14.A03     // Catch:{ all -> 0x01e5 }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_SKIP_NULL_TEXTURE     // Catch:{ all -> 0x01e5 }
            r1.A00(r0)     // Catch:{ all -> 0x01e5 }
            if (r2 == 0) goto L_0x01d5
        L_0x01ce:
            X.7ro r1 = r14.A03     // Catch:{ all -> 0x01e5 }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_SKIP_OUTPUT_NOT_ENABLED     // Catch:{ all -> 0x01e5 }
            r1.A00(r0)     // Catch:{ all -> 0x01e5 }
        L_0x01d5:
            X.C349257zq.A01()     // Catch:{ all -> 0x01e5 }
            goto L_0x01e3
        L_0x01d9:
            X.C349257zq.A01()     // Catch:{ all -> 0x01e5 }
            X.7ro r1 = r14.A03     // Catch:{ all -> 0x01e5 }
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_SKIP_NULL_GL_CONTEXT     // Catch:{ all -> 0x01e5 }
            r1.A00(r0)     // Catch:{ all -> 0x01e5 }
        L_0x01e3:
            monitor-exit(r18)     // Catch:{ all -> 0x01e5 }
            return
        L_0x01e5:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x01e5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361218fr.A01(X.7uG, X.7sz, X.7sv, X.7sr, boolean, boolean, boolean):void");
    }

    public final void ACn(C345897uG r6) {
        C345897uG r0 = this.A02;
        if (!(r0 == null || r0 == r6)) {
            this.A03.A00(C368978td.GL_COPY_RENDERER_CONTEXT_NOT_DETACHED);
        }
        this.A02 = r6;
        C345967uN Blv = r6.Blv();
        if (!Blv.A01() && this.A01 == null) {
            C344507ry r4 = Blv.A01;
            C345977uO r3 = new C345977uO(r4);
            boolean z = false;
            Object obj = r4.A00.get(C344507ry.A08);
            if (obj != null) {
                z = obj;
            }
            r3.A01 = ((Boolean) z).booleanValue();
            this.A01 = r3;
        }
    }

    public final void detach() {
        C345977uO r1 = this.A01;
        if (r1 != null) {
            r1.A00();
            this.A01 = null;
        }
        this.A02 = null;
    }

    public C361218fr(C344407ro r1) {
        this.A03 = r1;
    }
}
