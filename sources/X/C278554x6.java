package X;

/* renamed from: X.4x6  reason: invalid class name and case insensitive filesystem */
public final class C278554x6 implements Runnable {
    public final /* synthetic */ C278544x5 A00;

    public C278554x6(C278544x5 r1) {
        this.A00 = r1;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0156  */
    public final void run() {
        /*
            r21 = this;
            android.opengl.EGLSurface r8 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r7 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLDisplay r6 = android.opengl.EGL14.EGL_NO_DISPLAY
            r5 = 2
            r10 = r21
            X.4x5 r4 = r10.A00     // Catch:{ all -> 0x0169 }
            X.4x5 r0 = X.C278544x5.A05     // Catch:{ all -> 0x0169 }
            int r3 = r4.A03     // Catch:{ all -> 0x0169 }
            r2 = 0
            android.opengl.EGLDisplay r6 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch:{ all -> 0x0169 }
            int[] r0 = new int[r5]     // Catch:{ all -> 0x0169 }
            r1 = 1
            boolean r0 = android.opengl.EGL14.eglInitialize(r6, r0, r2, r0, r1)     // Catch:{ all -> 0x0169 }
            if (r0 != 0) goto L_0x003e
            android.opengl.EGL14.eglGetError()     // Catch:{ all -> 0x0169 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r8 == r0) goto L_0x0027
            android.opengl.EGL14.eglDestroySurface(r6, r8)
        L_0x0027:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r7 == r0) goto L_0x002e
            android.opengl.EGL14.eglDestroyContext(r6, r7)
        L_0x002e:
            android.opengl.EGL14.eglReleaseThread()
            java.lang.Object r0 = r4.A04
            monitor-enter(r0)
            r4.A00 = r5     // Catch:{ all -> 0x003b }
            r0.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r2
        L_0x003e:
            android.opengl.EGLConfig[] r9 = new android.opengl.EGLConfig[r1]     // Catch:{ all -> 0x0169 }
            int[] r11 = new int[r1]     // Catch:{ all -> 0x0169 }
            r12 = 12324(0x3024, float:1.727E-41)
            r13 = 8
            r14 = 12323(0x3023, float:1.7268E-41)
            r19 = 4
            r16 = 12322(0x3022, float:1.7267E-41)
            r18 = 12352(0x3040, float:1.7309E-41)
            r0 = 12344(0x3038, float:1.7298E-41)
            r15 = r13
            r17 = r13
            r20 = r0
            int[] r12 = new int[]{r12, r13, r14, r15, r16, r17, r18, r19, r20}     // Catch:{ all -> 0x0169 }
            r13 = r2
            r14 = r9
            r15 = r2
            r16 = r1
            r17 = r11
            r18 = r2
            r11 = r6
            boolean r11 = android.opengl.EGL14.eglChooseConfig(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0169 }
            if (r11 != 0) goto L_0x008a
            android.opengl.EGL14.eglGetError()     // Catch:{ all -> 0x0169 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r8 == r0) goto L_0x0073
            android.opengl.EGL14.eglDestroySurface(r6, r8)
        L_0x0073:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r7 == r0) goto L_0x007a
            android.opengl.EGL14.eglDestroyContext(r6, r7)
        L_0x007a:
            android.opengl.EGL14.eglReleaseThread()
            java.lang.Object r0 = r4.A04
            monitor-enter(r0)
            r4.A00 = r5     // Catch:{ all -> 0x0087 }
            r0.notifyAll()     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            return
        L_0x0087:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            throw r2
        L_0x008a:
            r11 = r9[r2]     // Catch:{ all -> 0x0169 }
            r12 = 12375(0x3057, float:1.7341E-41)
            r9 = 12374(0x3056, float:1.734E-41)
            int[] r9 = new int[]{r12, r1, r9, r1, r0}     // Catch:{ all -> 0x0169 }
            android.opengl.EGLSurface r8 = android.opengl.EGL14.eglCreatePbufferSurface(r6, r11, r9, r2)     // Catch:{ all -> 0x0169 }
            android.opengl.EGLSurface r9 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0169 }
            if (r8 != r9) goto L_0x00bd
            android.opengl.EGL14.eglGetError()     // Catch:{ all -> 0x0169 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r8 == r0) goto L_0x00a6
            android.opengl.EGL14.eglDestroySurface(r6, r8)
        L_0x00a6:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r7 == r0) goto L_0x00ad
            android.opengl.EGL14.eglDestroyContext(r6, r7)
        L_0x00ad:
            android.opengl.EGL14.eglReleaseThread()
            java.lang.Object r0 = r4.A04
            monitor-enter(r0)
            r4.A00 = r5     // Catch:{ all -> 0x00ba }
            r0.notifyAll()     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return
        L_0x00ba:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r2
        L_0x00bd:
            r9 = 12440(0x3098, float:1.7432E-41)
            int[] r9 = new int[]{r9, r3, r0}     // Catch:{ all -> 0x0169 }
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ all -> 0x0169 }
            android.opengl.EGLContext r7 = android.opengl.EGL14.eglCreateContext(r6, r11, r0, r9, r2)     // Catch:{ all -> 0x0169 }
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ all -> 0x0169 }
            if (r7 != r0) goto L_0x00ee
            android.opengl.EGL14.eglGetError()     // Catch:{ all -> 0x0169 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r8 == r0) goto L_0x00d7
            android.opengl.EGL14.eglDestroySurface(r6, r8)
        L_0x00d7:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r7 == r0) goto L_0x00de
            android.opengl.EGL14.eglDestroyContext(r6, r7)
        L_0x00de:
            android.opengl.EGL14.eglReleaseThread()
            java.lang.Object r0 = r4.A04
            monitor-enter(r0)
            r4.A00 = r5     // Catch:{ all -> 0x00eb }
            r0.notifyAll()     // Catch:{ all -> 0x00eb }
            monitor-exit(r0)     // Catch:{ all -> 0x00eb }
            return
        L_0x00eb:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00eb }
            throw r2
        L_0x00ee:
            boolean r0 = android.opengl.EGL14.eglMakeCurrent(r6, r8, r8, r7)     // Catch:{ all -> 0x0169 }
            if (r0 != 0) goto L_0x0115
            android.opengl.EGL14.eglGetError()     // Catch:{ all -> 0x0169 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r8 == r0) goto L_0x00fe
            android.opengl.EGL14.eglDestroySurface(r6, r8)
        L_0x00fe:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r7 == r0) goto L_0x0105
            android.opengl.EGL14.eglDestroyContext(r6, r7)
        L_0x0105:
            android.opengl.EGL14.eglReleaseThread()
            java.lang.Object r0 = r4.A04
            monitor-enter(r0)
            r4.A00 = r5     // Catch:{ all -> 0x0112 }
            r0.notifyAll()     // Catch:{ all -> 0x0112 }
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            return
        L_0x0112:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            throw r2
        L_0x0115:
            r4.A02 = r1     // Catch:{ all -> 0x0169 }
            if (r3 != r5) goto L_0x012e
            java.nio.IntBuffer r1 = java.nio.IntBuffer.allocate(r1)     // Catch:{ all -> 0x0169 }
            r0 = 34930(0x8872, float:4.8947E-41)
            android.opengl.GLES20.glGetIntegerv(r0, r1)     // Catch:{ all -> 0x0169 }
            int r0 = android.opengl.GLES20.glGetError()     // Catch:{ all -> 0x0169 }
            if (r0 != 0) goto L_0x0144
            int r0 = r1.get()     // Catch:{ all -> 0x0169 }
            goto L_0x0142
        L_0x012e:
            java.nio.IntBuffer r1 = java.nio.IntBuffer.allocate(r1)     // Catch:{ all -> 0x0169 }
            r0 = 34930(0x8872, float:4.8947E-41)
            android.opengl.GLES20.glGetIntegerv(r0, r1)     // Catch:{ all -> 0x0169 }
            int r0 = android.opengl.GLES20.glGetError()     // Catch:{ all -> 0x0169 }
            if (r0 != 0) goto L_0x0144
            int r0 = r1.get()     // Catch:{ all -> 0x0169 }
        L_0x0142:
            r4.A01 = r0     // Catch:{ all -> 0x0169 }
        L_0x0144:
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0169 }
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ all -> 0x0169 }
            android.opengl.EGL14.eglMakeCurrent(r6, r1, r1, r0)     // Catch:{ all -> 0x0169 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r8 == r0) goto L_0x0152
            android.opengl.EGL14.eglDestroySurface(r6, r8)
        L_0x0152:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r7 == r0) goto L_0x0159
            android.opengl.EGL14.eglDestroyContext(r6, r7)
        L_0x0159:
            android.opengl.EGL14.eglReleaseThread()
            java.lang.Object r0 = r4.A04
            monitor-enter(r0)
            r4.A00 = r5     // Catch:{ all -> 0x0166 }
            r0.notifyAll()     // Catch:{ all -> 0x0166 }
            monitor-exit(r0)     // Catch:{ all -> 0x0166 }
            return
        L_0x0166:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0166 }
            throw r2
        L_0x0169:
            r2 = move-exception
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r8 == r0) goto L_0x0171
            android.opengl.EGL14.eglDestroySurface(r6, r8)
        L_0x0171:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r7 == r0) goto L_0x0178
            android.opengl.EGL14.eglDestroyContext(r6, r7)
        L_0x0178:
            android.opengl.EGL14.eglReleaseThread()
            X.4x5 r1 = r10.A00
            java.lang.Object r0 = r1.A04
            monitor-enter(r0)
            r1.A00 = r5     // Catch:{ all -> 0x0187 }
            r0.notifyAll()     // Catch:{ all -> 0x0187 }
        L_0x0185:
            monitor-exit(r0)     // Catch:{ all -> 0x0187 }
            goto L_0x0189
        L_0x0187:
            r2 = move-exception
            goto L_0x0185
        L_0x0189:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278554x6.run():void");
    }
}
