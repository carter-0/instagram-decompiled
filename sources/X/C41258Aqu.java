package X;

/* renamed from: X.Aqu  reason: case insensitive filesystem */
public final class C41258Aqu implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C368618t1 A05;
    public final /* synthetic */ boolean A06;

    public C41258Aqu(C368618t1 r1, int i, int i2, int i3, long j, long j2, boolean z) {
        this.A05 = r1;
        this.A03 = j;
        this.A04 = j2;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = z;
        this.A02 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0119, code lost:
        if (r3 == null) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r1 = 32
            java.lang.String r3 = "AREngineService.doFrame"
            r0 = 236153495(0xe136a97, float:1.817047E-30)
            X.0fc.A01(r1, r3, r0)
            r13 = r28
            X.8t1 r8 = r13.A05
            java.lang.Integer r3 = r8.A0K
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r3 != r0) goto L_0x011e
            android.opengl.EGLSurface r4 = r8.A08
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r4 == r0) goto L_0x011e
            com.facebook.cameracore.mediapipeline.engine.AREngineController r0 = r8.A0C
            if (r0 == 0) goto L_0x011e
            android.opengl.EGLDisplay r3 = r8.A07
            android.opengl.EGLContext r0 = r8.A06
            android.opengl.EGL14.eglMakeCurrent(r3, r4, r4, r0)
            long r5 = r13.A03
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x0043
            android.graphics.SurfaceTexture r0 = r8.A05
            if (r0 == 0) goto L_0x0032
            r0.updateTexImage()
        L_0x0032:
            android.graphics.SurfaceTexture r3 = r8.A05
            if (r3 == 0) goto L_0x003b
            float[] r0 = r8.A0W
            r3.getTransformMatrix(r0)
        L_0x003b:
            android.graphics.SurfaceTexture r0 = r8.A05
            if (r0 == 0) goto L_0x0043
            long r5 = r0.getTimestamp()
        L_0x0043:
            X.Slx r0 = r8.A0F
            if (r0 == 0) goto L_0x004a
            r0.A00()
        L_0x004a:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ RemoteException -> 0x00a7 }
            java.util.concurrent.BlockingQueue r0 = r8.A0S     // Catch:{ RemoteException -> 0x00a7 }
            r0.drainTo(r3)     // Catch:{ RemoteException -> 0x00a7 }
            X.A8i r9 = r8.A0I     // Catch:{ RemoteException -> 0x00a7 }
            if (r9 == 0) goto L_0x009e
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ RemoteException -> 0x00a7 }
            java.util.Iterator r11 = r3.iterator()     // Catch:{ RemoteException -> 0x00a7 }
        L_0x005f:
            boolean r0 = r11.hasNext()     // Catch:{ RemoteException -> 0x00a7 }
            if (r0 == 0) goto L_0x009f
            java.lang.Object r10 = r11.next()     // Catch:{ RemoteException -> 0x00a7 }
            android.os.Bundle r10 = (android.os.Bundle) r10     // Catch:{ RemoteException -> 0x00a7 }
            java.lang.Class<com.facebook.cameracore.util.memory.VersionedSharedMemory> r0 = com.facebook.cameracore.util.memory.VersionedSharedMemory.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ RemoteException -> 0x00a7 }
            r10.setClassLoader(r0)     // Catch:{ RemoteException -> 0x00a7 }
            java.lang.String r3 = "serviceType"
            boolean r0 = r10.containsKey(r3)     // Catch:{ RemoteException -> 0x00a7 }
            if (r0 == 0) goto L_0x005f
            int r0 = r10.getInt(r3)     // Catch:{ RemoteException -> 0x00a7 }
            java.util.Map r4 = r9.A00     // Catch:{ RemoteException -> 0x00a7 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ RemoteException -> 0x00a7 }
            boolean r0 = r4.containsKey(r3)     // Catch:{ RemoteException -> 0x00a7 }
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r4.get(r3)     // Catch:{ RemoteException -> 0x00a7 }
            X.B1g r0 = (X.C41801B1g) r0     // Catch:{ RemoteException -> 0x00a7 }
            if (r0 == 0) goto L_0x005f
            java.util.List r0 = r0.EzQ(r10)     // Catch:{ RemoteException -> 0x00a7 }
            if (r0 == 0) goto L_0x005f
            r7.addAll(r0)     // Catch:{ RemoteException -> 0x00a7 }
            goto L_0x005f
        L_0x009e:
            r7 = 0
        L_0x009f:
            com.meta.arfx.engine.interfaces.IAREngineServiceCallback r0 = r8.A0J     // Catch:{ RemoteException -> 0x00a7 }
            if (r0 == 0) goto L_0x00b2
            r0.Ek0(r7)     // Catch:{ RemoteException -> 0x00a7 }
            goto L_0x00b2
        L_0x00a7:
            r4 = move-exception
            java.lang.Class<X.8t1> r3 = X.C368618t1.class
            java.lang.String r0 = "Service configuration update failed: "
            X.0KC.A05(r3, r0, r4)
            r8.stopSelf()
        L_0x00b2:
            com.facebook.cameracore.mediapipeline.engine.AREngineController r12 = r8.A0C
            if (r12 == 0) goto L_0x00f6
            X.7v0 r3 = r8.A0H
            if (r3 == 0) goto L_0x0115
            int r11 = r3.A00
            int r10 = r3.A01
            X.7v3 r0 = r3.A02
            if (r0 == 0) goto L_0x0118
            int r9 = r0.A01
        L_0x00c4:
            X.7v3 r0 = r3.A02
            if (r0 == 0) goto L_0x011c
            int r7 = r0.A00
        L_0x00ca:
            float[] r0 = r8.A0W
            r17 = r0
            float[] r0 = r8.A0X
            r18 = r0
            float[] r0 = r8.A0V
            r16 = r0
            long r3 = r13.A04
            int r15 = r13.A00
            int r14 = r13.A01
            boolean r0 = r13.A06
            int r13 = r13.A02
            r24 = r15
            r25 = r14
            r26 = r0
            r27 = r13
            r22 = r5
            r19 = r16
            r20 = r3
            r16 = r7
            r13 = r11
            r14 = r10
            r15 = r9
            r12.doFrame(r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r25, r26, r27)
        L_0x00f6:
            android.opengl.EGLDisplay r3 = r8.A07
            android.opengl.EGLSurface r0 = r8.A08
            boolean r0 = android.opengl.EGL14.eglSwapBuffers(r3, r0)
            if (r0 != 0) goto L_0x0107
            java.lang.Class<X.8t1> r3 = X.C368618t1.class
            java.lang.String r0 = "WARNING: swapBuffers() failed"
            X.0KC.A02(r3, r0)
        L_0x0107:
            X.ARn r0 = r8.A0D
            if (r0 == 0) goto L_0x010e
            r0.A00()
        L_0x010e:
            r0 = 1185939615(0x46b0009f, float:22528.31)
            X.0fc.A00(r1, r0)
            return
        L_0x0115:
            r11 = -1
            r10 = 3553(0xde1, float:4.979E-42)
        L_0x0118:
            r9 = 0
            if (r3 == 0) goto L_0x011c
            goto L_0x00c4
        L_0x011c:
            r7 = 0
            goto L_0x00ca
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41258Aqu.run():void");
    }
}
