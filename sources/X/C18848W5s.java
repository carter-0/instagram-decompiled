package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.W5s  reason: case insensitive filesystem */
public final class C18848W5s implements SurfaceTexture.OnFrameAvailableListener {
    public final int A00;
    public final Object A01;

    public C18848W5s(C18015Vjr vjr, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = vjr;
        } else {
            this.A01 = vjr;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onFrameAvailable(android.graphics.SurfaceTexture r34) {
        /*
            r33 = this;
            r1 = r33
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x0017;
                case 2: goto L_0x006f;
                case 3: goto L_0x0060;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.RzB r0 = (X.C10851RzB) r0
            java.util.concurrent.Semaphore r1 = r0.A0B
            int r0 = r1.availablePermits()
            if (r0 != 0) goto L_0x0016
            r1.release()
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r2 = r1.A01
            X.Vjr r2 = (X.C18015Vjr) r2
            X.VwB r0 = r2.A03
            r32 = r0
            boolean r0 = r32.A03()
            if (r0 != 0) goto L_0x0016
            X.Vvx r6 = r2.A05
            r3 = 0
            boolean r0 = r6.A03(r3)
            if (r0 == 0) goto L_0x0016
            X.Vvx r1 = r2.A04
            boolean r0 = r1.A03(r3)
            if (r0 == 0) goto L_0x0016
            X.Vl5 r5 = r2.A00
            if (r5 == 0) goto L_0x0016
            X.7uT r4 = r5.A00
            if (r4 == 0) goto L_0x0016
            monitor-enter(r4)
            goto L_0x0077
        L_0x0040:
            java.lang.Object r2 = r1.A01
            X.VuO r2 = (X.C18572VuO) r2
            X.VwB r0 = r2.A03
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0016
            X.Vvx r1 = r2.A04
            r0 = 0
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0016
            X.Vl5 r0 = r2.A01
            X.C18572VuO.A00(r2, r0)
            X.Vl5 r0 = r2.A00
            X.C18572VuO.A00(r2, r0)
            return
        L_0x0060:
            java.lang.Object r0 = r1.A01
            X.VtI r0 = (X.C18518VtI) r0
            X.U1r r1 = r0.A06
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L_0x006f:
            java.lang.Object r1 = r1.A01
            X.Vjr r1 = (X.C18015Vjr) r1
            r0 = 1
            r1.A07 = r0
            return
        L_0x0077:
            boolean r0 = r4.A04()     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x01e5
            r5.A02()     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            X.W1E r12 = r2.A06     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r0 = r6.A00     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r31 = r0
            float[] r0 = r6.A01     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r20 = r0
            int r0 = r6.A07     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r18 = r0
            int r0 = r6.A06     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r17 = r0
            int r0 = r1.A00     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r30 = r0
            float[] r0 = r1.A01     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r29 = r0
            int r8 = r1.A07     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r7 = r1.A06     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            boolean r0 = r2.A07     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r28 = r0
            int r15 = r1.A05     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r11 = r1.A04     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r3 = r5.A01()     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r2 = r5.A00()     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r21 = 1
            X.Va9 r0 = r12.A00     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            if (r0 == 0) goto L_0x01d4
            r1 = 0
            android.opengl.GLES20.glViewport(r1, r1, r3, r2)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            monitor-enter(r12)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            if (r3 == 0) goto L_0x0122
            if (r2 == 0) goto L_0x0122
            if (r8 == 0) goto L_0x0122
            if (r7 == 0) goto L_0x0122
            boolean r0 = r12.A0A     // Catch:{ all -> 0x011f }
            if (r0 != 0) goto L_0x00d6
            int r0 = r12.A09     // Catch:{ all -> 0x011f }
            if (r0 != r3) goto L_0x00d6
            int r0 = r12.A08     // Catch:{ all -> 0x011f }
            if (r0 != r2) goto L_0x00d6
            int r0 = r12.A07     // Catch:{ all -> 0x011f }
            if (r0 != r8) goto L_0x00d6
            int r0 = r12.A06     // Catch:{ all -> 0x011f }
            if (r0 != r7) goto L_0x00d6
            goto L_0x0122
        L_0x00d6:
            float r14 = (float) r2     // Catch:{ all -> 0x011f }
            float r0 = (float) r3     // Catch:{ all -> 0x011f }
            float r14 = r14 / r0
            float r13 = (float) r7     // Catch:{ all -> 0x011f }
            float r0 = (float) r8     // Catch:{ all -> 0x011f }
            float r13 = r13 / r0
            r12.A09 = r3     // Catch:{ all -> 0x011f }
            r12.A08 = r2     // Catch:{ all -> 0x011f }
            r12.A07 = r8     // Catch:{ all -> 0x011f }
            r12.A06 = r7     // Catch:{ all -> 0x011f }
            r12.A0A = r1     // Catch:{ all -> 0x011f }
            float[] r10 = r12.A01     // Catch:{ all -> 0x011f }
            android.opengl.Matrix.setIdentityM(r10, r1)     // Catch:{ all -> 0x011f }
            r9 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            android.opengl.Matrix.translateM(r10, r1, r8, r8, r9)     // Catch:{ all -> 0x011f }
            float r13 = r13 * r14
            float r0 = r12.A05     // Catch:{ all -> 0x011f }
            float r0 = r0 * r14
            float r13 = r13 / r0
            float r0 = r12.A05     // Catch:{ all -> 0x011f }
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r7 / r0
            android.opengl.Matrix.scaleM(r10, r1, r13, r0, r7)     // Catch:{ all -> 0x011f }
            float r0 = r12.A04     // Catch:{ all -> 0x011f }
            r22 = r10
            r23 = r1
            r24 = r0
            r25 = r9
            r26 = r9
            r27 = r7
            android.opengl.Matrix.rotateM(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x011f }
            float r0 = r7 / r14
            android.opengl.Matrix.scaleM(r10, r1, r0, r7, r7)     // Catch:{ all -> 0x011f }
            float r7 = r12.A02     // Catch:{ all -> 0x011f }
            float r7 = r7 - r8
            float r0 = r12.A03     // Catch:{ all -> 0x011f }
            float r0 = r0 - r8
            android.opengl.Matrix.translateM(r10, r1, r7, r0, r9)     // Catch:{ all -> 0x011f }
            goto L_0x0122
        L_0x011f:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            throw r0     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
        L_0x0122:
            monitor-exit(r12)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            X.Va9 r0 = r12.A00     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float[] r16 = X.W1E.A0D     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float[] r8 = r12.A01     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r9 = (float) r15     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r7 = r12.A05     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r9 = r9 * r7
            int r10 = (int) r9     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r9 = (float) r11     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r7 = r12.A05     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r9 = r9 * r7
            int r11 = (int) r9     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            java.lang.String r7 = "draw start"
            X.W1E.A01(r7)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r7 = r0.A00     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            android.opengl.GLES20.glUseProgram(r7)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            java.lang.String r7 = "glUseProgram"
            X.W1E.A01(r7)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            X.Vhw r7 = r0.A05     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r9 = r18
            float r12 = (float) r9     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r9 = r17
            float r9 = (float) r9     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r19 = 0
            r14 = r7
            r15 = r20
            r17 = r12
            r18 = r9
            r20 = r31
            r14.A00(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            X.Vhw r9 = r0.A04     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r12 = (float) r10     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r11 = (float) r11     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r10 = 1025758986(0x3d23d70a, float:0.04)
            float r18 = r12 * r10
            r13 = r9
            r14 = r29
            r15 = r8
            r16 = r12
            r17 = r11
            r19 = r30
            r20 = r28
            r13.A00(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r8 = r0.A01     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            android.opengl.GLES20.glEnableVertexAttribArray(r8)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            java.lang.String r12 = "glEnableVertexAttribArray"
            X.W1E.A01(r12)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            java.nio.FloatBuffer r18 = X.W1E.A0B     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r14 = 2
            r15 = 5126(0x1406, float:7.183E-42)
            r17 = 8
            r13 = r8
            r16 = r1
            android.opengl.GLES20.glVertexAttribPointer(r13, r14, r15, r16, r17, r18)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            java.lang.String r11 = "glVertexAttribPointer"
            X.W1E.A01(r11)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r10 = r0.A02     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            android.opengl.GLES20.glEnableVertexAttribArray(r10)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            X.W1E.A01(r12)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            java.nio.FloatBuffer r18 = X.W1E.A0C     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r13 = r10
            android.opengl.GLES20.glVertexAttribPointer(r13, r14, r15, r16, r17, r18)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            X.W1E.A01(r11)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r11 = r0.A03     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r3 = (float) r3     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            float r0 = (float) r2     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            android.opengl.GLES20.glUniform2f(r11, r3, r0)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            java.lang.String r0 = "glUniform2f"
            X.W1E.A01(r0)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r2 = 5
            r0 = 4
            android.opengl.GLES20.glDrawArrays(r2, r1, r0)     // Catch:{ RuntimeException -> 0x01b3 }
            java.lang.String r0 = "glDrawArrays"
            X.W1E.A01(r0)     // Catch:{ RuntimeException -> 0x01b3 }
        L_0x01b3:
            android.opengl.GLES20.glDisableVertexAttribArray(r8)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            android.opengl.GLES20.glDisableVertexAttribArray(r10)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r0 = r7.A00     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r3 = 33984(0x84c0, float:4.7622E-41)
            int r0 = r0 + r3
            android.opengl.GLES20.glActiveTexture(r0)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r2 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r2, r1)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r0 = r9.A00     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            int r0 = r0 + r3
            android.opengl.GLES20.glActiveTexture(r0)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            android.opengl.GLES20.glBindTexture(r2, r1)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            android.opengl.GLES20.glUseProgram(r1)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
        L_0x01d4:
            long r0 = r6.A08     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r5.A05(r0)     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            r5.A04()     // Catch:{ RuntimeException -> 0x01e2, all -> 0x01dd }
            goto L_0x01e2
        L_0x01dd:
            r0 = move-exception
            r32.A01()     // Catch:{ all -> 0x01e7 }
            throw r0     // Catch:{ all -> 0x01e7 }
        L_0x01e2:
            r32.A01()     // Catch:{ all -> 0x01e7 }
        L_0x01e5:
            monitor-exit(r4)     // Catch:{ all -> 0x01e7 }
            return
        L_0x01e7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01e7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18848W5s.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }

    public C18848W5s(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
