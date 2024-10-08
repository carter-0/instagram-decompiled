package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.Wui  reason: case insensitive filesystem */
public final class C20565Wui extends Thread {
    public int A00 = 1;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = true;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public C18754Vzp A0E;
    public boolean A0F = true;
    public boolean A0G;
    public boolean A0H;
    public final WeakReference A0I;
    public final ArrayList A0J = new ArrayList();

    public C20565Wui(WeakReference weakReference) {
        0qQ.A0B(weakReference, 1);
        this.A0I = weakReference;
    }

    public final void A05(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        C18565VuH vuH = GLDrawingView.A0I;
        synchronized (vuH) {
            this.A00 = i;
            vuH.notifyAll();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 477 */
    private final void A00() {
        /*
            r37 = this;
            r8 = r37
            java.lang.ref.WeakReference r0 = r8.A0I
            r36 = r0
            X.Vzp r1 = new X.Vzp
            r1.<init>(r0)
            r8.A0E = r1
            r0 = 0
            r8.A04 = r0
            r8.A05 = r0
            r7 = 0
            r12 = 0
            r29 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r24 = 0
            r23 = 0
            r17 = 0
            r16 = 0
            r5 = 0
            goto L_0x0029
        L_0x0028:
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
        L_0x0029:
            X.VuH r6 = com.instagram.ui.widget.drawing.gl.GLDrawingView.A0I     // Catch:{ all -> 0x046b }
            monitor-enter(r6)     // Catch:{ all -> 0x046b }
        L_0x002c:
            boolean r0 = r8.A0G     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x0032
            goto L_0x0434
        L_0x0032:
            java.util.ArrayList r1 = r8.A0J     // Catch:{ all -> 0x0460 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0460 }
            if (r0 != 0) goto L_0x0041
            r0 = 0
            java.lang.Object r5 = r1.remove(r0)     // Catch:{ all -> 0x0460 }
            goto L_0x02ac
        L_0x0041:
            boolean r0 = r8.A06     // Catch:{ all -> 0x0460 }
            boolean r1 = r8.A08     // Catch:{ all -> 0x0460 }
            if (r0 == r1) goto L_0x005a
            r8.A06 = r1     // Catch:{ all -> 0x0460 }
            r6.notifyAll()     // Catch:{ all -> 0x0460 }
        L_0x004c:
            boolean r0 = r8.A0A     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x005e
            r8.A02()     // Catch:{ all -> 0x0460 }
            r8.A01()     // Catch:{ all -> 0x0460 }
            r0 = 0
            r8.A0A = r0     // Catch:{ all -> 0x0460 }
            goto L_0x005c
        L_0x005a:
            r1 = 0
            goto L_0x004c
        L_0x005c:
            r23 = 1
        L_0x005e:
            if (r27 == 0) goto L_0x0068
            r8.A02()     // Catch:{ all -> 0x0460 }
            r8.A01()     // Catch:{ all -> 0x0460 }
            r27 = 0
        L_0x0068:
            if (r1 == 0) goto L_0x009c
            boolean r0 = r8.A05     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x0071
            r8.A02()     // Catch:{ all -> 0x0460 }
        L_0x0071:
            boolean r0 = r8.A04     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x0460 }
            com.instagram.ui.widget.drawing.gl.GLDrawingView r0 = (com.instagram.ui.widget.drawing.gl.GLDrawingView) r0     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.A09     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x0087
            monitor-enter(r6)     // Catch:{ all -> 0x0460 }
            boolean r0 = r6.A02     // Catch:{ all -> 0x045d }
            monitor-exit(r6)     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r8.A01()     // Catch:{ all -> 0x0460 }
        L_0x008a:
            monitor-enter(r6)     // Catch:{ all -> 0x0460 }
            X.C18565VuH.A00(r6)     // Catch:{ all -> 0x045d }
            boolean r0 = r6.A03     // Catch:{ all -> 0x045d }
            r0 = r0 ^ 1
            monitor-exit(r6)     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x009c
            X.Vzp r0 = r8.A0E     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x009c
            r0.A01()     // Catch:{ all -> 0x0460 }
        L_0x009c:
            boolean r0 = r8.A03     // Catch:{ all -> 0x0460 }
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r8.A0B     // Catch:{ all -> 0x0460 }
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r8.A05     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x00ab
            r8.A02()     // Catch:{ all -> 0x0460 }
        L_0x00ab:
            r0 = 1
            r8.A0B = r0     // Catch:{ all -> 0x0460 }
            r0 = 0
            r8.A0H = r0     // Catch:{ all -> 0x0460 }
            r6.notifyAll()     // Catch:{ all -> 0x0460 }
        L_0x00b4:
            boolean r0 = r8.A03     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r8.A0B     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x00c2
            r0 = 0
            r8.A0B = r0     // Catch:{ all -> 0x0460 }
            r6.notifyAll()     // Catch:{ all -> 0x0460 }
        L_0x00c2:
            if (r24 == 0) goto L_0x00ce
            r25 = 0
            r24 = 0
            r0 = 1
            r8.A07 = r0     // Catch:{ all -> 0x0460 }
            r6.notifyAll()     // Catch:{ all -> 0x0460 }
        L_0x00ce:
            boolean r0 = r8.A03()     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x02a7
            boolean r0 = r8.A04     // Catch:{ all -> 0x0460 }
            if (r0 != 0) goto L_0x00fa
            if (r23 == 0) goto L_0x00dd
            r23 = 0
            goto L_0x00fa
        L_0x00dd:
            X.Wui r1 = r6.A00     // Catch:{ all -> 0x0460 }
            r22 = 1
            if (r1 == r8) goto L_0x00e6
            if (r1 == 0) goto L_0x00e6
            goto L_0x00ec
        L_0x00e6:
            r6.A00 = r8     // Catch:{ all -> 0x0460 }
            r6.notifyAll()     // Catch:{ all -> 0x0460 }
            goto L_0x0107
        L_0x00ec:
            X.C18565VuH.A00(r6)     // Catch:{ all -> 0x0460 }
            boolean r0 = r6.A03     // Catch:{ all -> 0x0460 }
            if (r0 != 0) goto L_0x0107
            r0 = r22
            r1.A0A = r0     // Catch:{ all -> 0x0460 }
        L_0x00f7:
            r6.notifyAll()     // Catch:{ all -> 0x0460 }
        L_0x00fa:
            boolean r0 = r8.A04     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x0287
            boolean r0 = r8.A05     // Catch:{ all -> 0x0460 }
            if (r0 != 0) goto L_0x0287
            r0 = 1
            r8.A05 = r0     // Catch:{ all -> 0x0460 }
            goto L_0x0281
        L_0x0107:
            X.Vzp r12 = r8.A0E     // Catch:{ RuntimeException -> 0x0451 }
            if (r12 == 0) goto L_0x027a
            javax.microedition.khronos.egl.EGL r1 = javax.microedition.khronos.egl.EGLContext.getEGL()     // Catch:{ RuntimeException -> 0x0451 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10"
            X.0qQ.A0C(r1, r0)     // Catch:{ RuntimeException -> 0x0451 }
            javax.microedition.khronos.egl.EGL10 r1 = (javax.microedition.khronos.egl.EGL10) r1     // Catch:{ RuntimeException -> 0x0451 }
            r12.A00 = r1     // Catch:{ RuntimeException -> 0x0451 }
            r11 = 0
            if (r1 == 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r2 = r11
            goto L_0x0124
        L_0x011e:
            java.lang.Object r0 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY     // Catch:{ RuntimeException -> 0x0451 }
            javax.microedition.khronos.egl.EGLDisplay r2 = r1.eglGetDisplay(r0)     // Catch:{ RuntimeException -> 0x0451 }
        L_0x0124:
            r12.A03 = r2     // Catch:{ RuntimeException -> 0x0451 }
            javax.microedition.khronos.egl.EGLDisplay r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY     // Catch:{ RuntimeException -> 0x0451 }
            if (r2 == r0) goto L_0x026b
            r0 = 2
            int[] r1 = new int[r0]     // Catch:{ RuntimeException -> 0x0451 }
            javax.microedition.khronos.egl.EGL10 r0 = r12.A00     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x0143
            boolean r0 = r0.eglInitialize(r2, r1)     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 != 0) goto L_0x0143
            r0 = 706(0x2c2, float:9.9E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ RuntimeException -> 0x0451 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x0451 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0451 }
        L_0x0142:
            throw r1     // Catch:{ RuntimeException -> 0x0451 }
        L_0x0143:
            java.lang.ref.WeakReference r0 = r12.A05     // Catch:{ RuntimeException -> 0x0451 }
            java.lang.Object r10 = r0.get()     // Catch:{ RuntimeException -> 0x0451 }
            com.instagram.ui.widget.drawing.gl.GLDrawingView r10 = (com.instagram.ui.widget.drawing.gl.GLDrawingView) r10     // Catch:{ RuntimeException -> 0x0451 }
            if (r10 != 0) goto L_0x0169
            r12.A01 = r11     // Catch:{ RuntimeException -> 0x0451 }
            r12.A02 = r11     // Catch:{ RuntimeException -> 0x0451 }
        L_0x0151:
            r12.A02 = r11     // Catch:{ RuntimeException -> 0x0451 }
            java.lang.String r2 = "createContext"
            javax.microedition.khronos.egl.EGL10 r0 = r12.A00     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x0278
            X.A8D r1 = X.C18754Vzp.A06     // Catch:{ RuntimeException -> 0x0451 }
            int r0 = r0.eglGetError()     // Catch:{ RuntimeException -> 0x0451 }
            java.lang.String r0 = r1.A00(r2, r0)     // Catch:{ RuntimeException -> 0x0451 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x0451 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0451 }
            goto L_0x0142
        L_0x0169:
            X.X1J r9 = r10.A04     // Catch:{ RuntimeException -> 0x0451 }
            if (r9 == 0) goto L_0x0217
            javax.microedition.khronos.egl.EGL10 r4 = r12.A00     // Catch:{ RuntimeException -> 0x0451 }
            javax.microedition.khronos.egl.EGLDisplay r3 = r12.A03     // Catch:{ RuntimeException -> 0x0451 }
            X.WTF r9 = (X.WTF) r9     // Catch:{ RuntimeException -> 0x0451 }
            r0 = r22
            int[] r14 = new int[r0]     // Catch:{ RuntimeException -> 0x0451 }
            r13 = 0
            if (r4 == 0) goto L_0x0262
            int[] r2 = r9.A00     // Catch:{ RuntimeException -> 0x0451 }
            r30 = r4
            r31 = r3
            r32 = r2
            r33 = r11
            r34 = r13
            r35 = r14
            boolean r0 = r30.eglChooseConfig(r31, r32, r33, r34, r35)     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x0262
            r1 = r14[r13]     // Catch:{ RuntimeException -> 0x0451 }
            if (r1 <= 0) goto L_0x0259
            javax.microedition.khronos.egl.EGLConfig[] r0 = new javax.microedition.khronos.egl.EGLConfig[r1]     // Catch:{ RuntimeException -> 0x0451 }
            r21 = r0
            r33 = r0
            r34 = r1
            boolean r0 = r30.eglChooseConfig(r31, r32, r33, r34, r35)     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x0250
            X.Ujb r9 = (X.C15851Ujb) r9     // Catch:{ RuntimeException -> 0x0451 }
            r0 = r21
            int r0 = r0.length     // Catch:{ RuntimeException -> 0x0451 }
            r30 = r0
            r2 = 0
        L_0x01a8:
            r1 = r21[r2]     // Catch:{ RuntimeException -> 0x0451 }
            r0 = 12325(0x3025, float:1.7271E-41)
            r15 = 0
            int[] r14 = r9.A02     // Catch:{ RuntimeException -> 0x0451 }
            boolean r0 = r4.eglGetConfigAttrib(r3, r1, r0, r14)     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x01b7
            r15 = r14[r13]     // Catch:{ RuntimeException -> 0x0451 }
        L_0x01b7:
            r0 = 12326(0x3026, float:1.7272E-41)
            r18 = 0
            boolean r0 = r4.eglGetConfigAttrib(r3, r1, r0, r14)     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x01c3
            r18 = r14[r13]     // Catch:{ RuntimeException -> 0x0451 }
        L_0x01c3:
            int r0 = r9.A01     // Catch:{ RuntimeException -> 0x0451 }
            if (r15 < r0) goto L_0x020d
            r0 = r18
            if (r0 < r13) goto L_0x020d
            r0 = 12324(0x3024, float:1.727E-41)
            r20 = 0
            boolean r0 = r4.eglGetConfigAttrib(r3, r1, r0, r14)     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x01d7
            r20 = r14[r13]     // Catch:{ RuntimeException -> 0x0451 }
        L_0x01d7:
            r0 = 12323(0x3023, float:1.7268E-41)
            r19 = 0
            boolean r0 = r4.eglGetConfigAttrib(r3, r1, r0, r14)     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x01e3
            r19 = r14[r13]     // Catch:{ RuntimeException -> 0x0451 }
        L_0x01e3:
            r0 = 12322(0x3022, float:1.7267E-41)
            r18 = 0
            boolean r0 = r4.eglGetConfigAttrib(r3, r1, r0, r14)     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x01ef
            r18 = r14[r13]     // Catch:{ RuntimeException -> 0x0451 }
        L_0x01ef:
            r0 = 12321(0x3021, float:1.7265E-41)
            r15 = 0
            boolean r0 = r4.eglGetConfigAttrib(r3, r1, r0, r14)     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x01fa
            r15 = r14[r13]     // Catch:{ RuntimeException -> 0x0451 }
        L_0x01fa:
            r14 = 8
            r0 = r20
            if (r0 != r14) goto L_0x020d
            r0 = r19
            if (r0 != r14) goto L_0x020d
            r0 = r18
            if (r0 != r14) goto L_0x020d
            int r14 = r9.A00     // Catch:{ RuntimeException -> 0x0451 }
            if (r15 != r14) goto L_0x020d
            goto L_0x0214
        L_0x020d:
            int r2 = r2 + 1
            r0 = r30
            if (r2 >= r0) goto L_0x0247
            goto L_0x01a8
        L_0x0214:
            if (r1 == 0) goto L_0x0247
            goto L_0x0218
        L_0x0217:
            r1 = r11
        L_0x0218:
            r12.A01 = r1     // Catch:{ RuntimeException -> 0x0451 }
            X.VMn r0 = r10.A02     // Catch:{ RuntimeException -> 0x0451 }
            if (r0 == 0) goto L_0x0237
            javax.microedition.khronos.egl.EGL10 r10 = r12.A00     // Catch:{ RuntimeException -> 0x0451 }
            javax.microedition.khronos.egl.EGLDisplay r9 = r12.A03     // Catch:{ RuntimeException -> 0x0451 }
            r2 = 12440(0x3098, float:1.7432E-41)
            com.instagram.ui.widget.drawing.gl.GLDrawingView r0 = r0.A00     // Catch:{ RuntimeException -> 0x0451 }
            int r4 = r0.A00     // Catch:{ RuntimeException -> 0x0451 }
            r0 = 12344(0x3038, float:1.7298E-41)
            int[] r3 = new int[]{r2, r4, r0}     // Catch:{ RuntimeException -> 0x0451 }
            r2 = 0
            if (r10 == 0) goto L_0x023d
            javax.microedition.khronos.egl.EGLContext r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ RuntimeException -> 0x0451 }
            if (r4 != 0) goto L_0x0239
            r3 = r11
            goto L_0x0239
        L_0x0237:
            r2 = r11
            goto L_0x023d
        L_0x0239:
            javax.microedition.khronos.egl.EGLContext r2 = r10.eglCreateContext(r9, r1, r0, r3)     // Catch:{ RuntimeException -> 0x0451 }
        L_0x023d:
            r12.A02 = r2     // Catch:{ RuntimeException -> 0x0451 }
            if (r2 == 0) goto L_0x0151
            javax.microedition.khronos.egl.EGLContext r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ RuntimeException -> 0x0451 }
            if (r2 != r0) goto L_0x0278
            goto L_0x0151
        L_0x0247:
            java.lang.String r0 = "No config chosen"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0451 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0451 }
            goto L_0x0142
        L_0x0250:
            java.lang.String r0 = "eglChooseConfig#2 failed"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0451 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0451 }
            goto L_0x0142
        L_0x0259:
            java.lang.String r0 = "No configs match configSpec"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0451 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0451 }
            goto L_0x0142
        L_0x0262:
            java.lang.String r0 = "eglChooseConfig failed"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0451 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0451 }
            goto L_0x0142
        L_0x026b:
            r0 = 705(0x2c1, float:9.88E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ RuntimeException -> 0x0451 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x0451 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0451 }
            goto L_0x0142
        L_0x0278:
            r12.A04 = r11     // Catch:{ RuntimeException -> 0x0451 }
        L_0x027a:
            r0 = r22
            r8.A04 = r0     // Catch:{ all -> 0x0460 }
            r12 = 1
            goto L_0x00f7
        L_0x0281:
            r29 = 1
            r28 = 1
            r26 = 1
        L_0x0287:
            boolean r0 = r8.A05     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x02a7
            boolean r0 = r8.A0F     // Catch:{ all -> 0x0460 }
            if (r0 == 0) goto L_0x02a0
            r26 = 1
            int r0 = r8.A0D     // Catch:{ all -> 0x0460 }
            r17 = r0
            int r0 = r8.A0C     // Catch:{ all -> 0x0460 }
            r16 = r0
            r25 = 1
            r29 = 1
            r0 = 0
            r8.A0F = r0     // Catch:{ all -> 0x0460 }
        L_0x02a0:
            r0 = 0
            r8.A09 = r0     // Catch:{ all -> 0x0460 }
            r6.notifyAll()     // Catch:{ all -> 0x0460 }
            goto L_0x02ac
        L_0x02a7:
            r6.wait()     // Catch:{ all -> 0x0460 }
            goto L_0x002c
        L_0x02ac:
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
            r1 = 0
            if (r5 == 0) goto L_0x02ba
            java.lang.Runnable r5 = (java.lang.Runnable) r5     // Catch:{ all -> 0x046b }
            if (r5 == 0) goto L_0x02b7
            r5.run()     // Catch:{ all -> 0x046b }
        L_0x02b7:
            r5 = r1
            goto L_0x0029
        L_0x02ba:
            if (r29 == 0) goto L_0x0355
            X.Vzp r10 = r8.A0E     // Catch:{ all -> 0x046b }
            if (r10 == 0) goto L_0x0321
            javax.microedition.khronos.egl.EGL10 r0 = r10.A00     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0446
            javax.microedition.khronos.egl.EGLDisplay r0 = r10.A03     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x043e
            javax.microedition.khronos.egl.EGLConfig r0 = r10.A01     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0463
            X.C18754Vzp.A00(r10)     // Catch:{ all -> 0x046b }
            java.lang.ref.WeakReference r0 = r10.A05     // Catch:{ all -> 0x046b }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x046b }
            com.instagram.ui.widget.drawing.gl.GLDrawingView r9 = (com.instagram.ui.widget.drawing.gl.GLDrawingView) r9     // Catch:{ all -> 0x046b }
            r11 = 0
            if (r9 == 0) goto L_0x02f0
            javax.microedition.khronos.egl.EGL10 r4 = r10.A00     // Catch:{ all -> 0x046b }
            if (r4 == 0) goto L_0x02f0
            X.VB4 r0 = r9.A03     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x02f0
            javax.microedition.khronos.egl.EGLDisplay r3 = r10.A03     // Catch:{ all -> 0x046b }
            javax.microedition.khronos.egl.EGLConfig r2 = r10.A01     // Catch:{ all -> 0x046b }
            android.graphics.SurfaceTexture r0 = r9.getSurfaceTexture()     // Catch:{ all -> 0x046b }
            r9 = 0
            javax.microedition.khronos.egl.EGLSurface r9 = r4.eglCreateWindowSurface(r3, r2, r0, r11)     // Catch:{ IllegalArgumentException -> 0x02f2 }
            goto L_0x02fa
        L_0x02f0:
            r9 = r11
            goto L_0x02fa
        L_0x02f2:
            r3 = move-exception
            java.lang.String r2 = "GLTextureView"
            java.lang.String r0 = "eglCreateWindowSurface"
            X.0KC.A0F(r2, r0, r3)     // Catch:{ all -> 0x046b }
        L_0x02fa:
            r10.A04 = r9     // Catch:{ all -> 0x046b }
            if (r9 == 0) goto L_0x0323
            javax.microedition.khronos.egl.EGLSurface r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ all -> 0x046b }
            if (r9 == r0) goto L_0x0323
            javax.microedition.khronos.egl.EGL10 r4 = r10.A00     // Catch:{ all -> 0x046b }
            if (r4 == 0) goto L_0x034b
            javax.microedition.khronos.egl.EGLDisplay r2 = r10.A03     // Catch:{ all -> 0x046b }
            javax.microedition.khronos.egl.EGLContext r0 = r10.A02     // Catch:{ all -> 0x046b }
            boolean r0 = r4.eglMakeCurrent(r2, r9, r9, r0)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x034b
            X.A8D r3 = X.C18754Vzp.A06     // Catch:{ all -> 0x046b }
            int r2 = r4.eglGetError()     // Catch:{ all -> 0x046b }
            java.lang.String r1 = "EGLHelper"
            java.lang.String r0 = "eglMakeCurrent"
            java.lang.String r0 = r3.A00(r0, r2)     // Catch:{ all -> 0x046b }
            X.0KC.A0D(r1, r0)     // Catch:{ all -> 0x046b }
        L_0x0321:
            monitor-enter(r6)     // Catch:{ all -> 0x046b }
            goto L_0x0341
        L_0x0323:
            javax.microedition.khronos.egl.EGL10 r0 = r10.A00     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0321
            int r0 = r0.eglGetError()     // Catch:{ all -> 0x046b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x046b }
            r1 = 12299(0x300b, float:1.7235E-41)
            if (r0 == 0) goto L_0x0321
            int r0 = r0.intValue()     // Catch:{ all -> 0x046b }
            if (r0 != r1) goto L_0x0321
            java.lang.String r1 = "EglHelper"
            java.lang.String r0 = "createWindowSurface returned EGL_BAD_NATIVE_WINDOW."
            X.0KC.A0C(r1, r0)     // Catch:{ all -> 0x046b }
            goto L_0x0321
        L_0x0341:
            r0 = 1
            r8.A02 = r0     // Catch:{ all -> 0x044e }
            r8.A0H = r0     // Catch:{ all -> 0x044e }
            r6.notifyAll()     // Catch:{ all -> 0x044e }
            goto L_0x0028
        L_0x034b:
            monitor-enter(r6)     // Catch:{ all -> 0x046b }
            r0 = 1
            r8.A02 = r0     // Catch:{ all -> 0x044e }
            r6.notifyAll()     // Catch:{ all -> 0x044e }
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
            r29 = 0
        L_0x0355:
            if (r28 == 0) goto L_0x03a7
            X.Vzp r2 = r8.A0E     // Catch:{ all -> 0x046b }
            if (r2 == 0) goto L_0x0369
            javax.microedition.khronos.egl.EGLContext r0 = r2.A02     // Catch:{ all -> 0x046b }
            r1 = 0
            if (r0 == 0) goto L_0x0364
            javax.microedition.khronos.opengles.GL r1 = r0.getGL()     // Catch:{ all -> 0x046b }
        L_0x0364:
            java.lang.ref.WeakReference r0 = r2.A05     // Catch:{ all -> 0x046b }
            r0.get()     // Catch:{ all -> 0x046b }
        L_0x0369:
            java.lang.String r0 = "null cannot be cast to non-null type javax.microedition.khronos.opengles.GL10"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x046b }
            javax.microedition.khronos.opengles.GL10 r1 = (javax.microedition.khronos.opengles.GL10) r1     // Catch:{ all -> 0x046b }
            r7 = r1
            monitor-enter(r6)     // Catch:{ all -> 0x046b }
            boolean r0 = r6.A01     // Catch:{ all -> 0x044e }
            if (r0 != 0) goto L_0x03a4
            X.C18565VuH.A00(r6)     // Catch:{ all -> 0x044e }
            r4 = 0
            if (r1 == 0) goto L_0x0382
            r0 = 7937(0x1f01, float:1.1122E-41)
            java.lang.String r4 = r1.glGetString(r0)     // Catch:{ all -> 0x044e }
        L_0x0382:
            int r3 = com.instagram.ui.widget.drawing.gl.GLDrawingView.A0H     // Catch:{ all -> 0x044e }
            r0 = 131072(0x20000, float:1.83671E-40)
            r2 = 1
            r1 = 0
            if (r3 >= r0) goto L_0x039b
            if (r4 == 0) goto L_0x0398
            java.lang.String r0 = "Q3Dimension MSM7500 "
            boolean r0 = X.00p.A0k(r4, r0, r1)     // Catch:{ all -> 0x044e }
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r6.A03 = r0     // Catch:{ all -> 0x044e }
        L_0x0398:
            r6.notifyAll()     // Catch:{ all -> 0x044e }
        L_0x039b:
            boolean r0 = r6.A03     // Catch:{ all -> 0x044e }
            if (r0 != 0) goto L_0x03a0
            r1 = 1
        L_0x03a0:
            r6.A02 = r1     // Catch:{ all -> 0x044e }
            r6.A01 = r2     // Catch:{ all -> 0x044e }
        L_0x03a4:
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
            r28 = 0
        L_0x03a7:
            if (r12 == 0) goto L_0x03c2
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x046b }
            com.instagram.ui.widget.drawing.gl.GLDrawingView r0 = (com.instagram.ui.widget.drawing.gl.GLDrawingView) r0     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x03c1
            android.opengl.GLSurfaceView$Renderer r1 = r0.A01     // Catch:{ all -> 0x046b }
            if (r1 == 0) goto L_0x03c1
            X.Vzp r0 = r8.A0E     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x03bf
            javax.microedition.khronos.egl.EGLConfig r0 = r0.A01     // Catch:{ all -> 0x046b }
        L_0x03bb:
            r1.onSurfaceCreated(r7, r0)     // Catch:{ all -> 0x046b }
            goto L_0x03c1
        L_0x03bf:
            r0 = 0
            goto L_0x03bb
        L_0x03c1:
            r12 = 0
        L_0x03c2:
            if (r26 == 0) goto L_0x03d9
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x046b }
            com.instagram.ui.widget.drawing.gl.GLDrawingView r0 = (com.instagram.ui.widget.drawing.gl.GLDrawingView) r0     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x03d7
            android.opengl.GLSurfaceView$Renderer r2 = r0.A01     // Catch:{ all -> 0x046b }
            if (r2 == 0) goto L_0x03d7
            r1 = r17
            r0 = r16
            r2.onSurfaceChanged(r7, r1, r0)     // Catch:{ all -> 0x046b }
        L_0x03d7:
            r26 = 0
        L_0x03d9:
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x046b }
            com.instagram.ui.widget.drawing.gl.GLDrawingView r0 = (com.instagram.ui.widget.drawing.gl.GLDrawingView) r0     // Catch:{ all -> 0x046b }
            if (r7 == 0) goto L_0x03ea
            if (r0 == 0) goto L_0x03ea
            android.opengl.GLSurfaceView$Renderer r0 = r0.A01     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x03ea
            r0.onDrawFrame(r7)     // Catch:{ all -> 0x046b }
        L_0x03ea:
            X.Vzp r0 = r8.A0E     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0411
            javax.microedition.khronos.egl.EGL10 r3 = r0.A00     // Catch:{ all -> 0x046b }
            r2 = 12288(0x3000, float:1.7219E-41)
            if (r3 == 0) goto L_0x0402
            javax.microedition.khronos.egl.EGLDisplay r1 = r0.A03     // Catch:{ all -> 0x046b }
            javax.microedition.khronos.egl.EGLSurface r0 = r0.A04     // Catch:{ all -> 0x046b }
            boolean r0 = r3.eglSwapBuffers(r1, r0)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x0402
            int r2 = r3.eglGetError()     // Catch:{ all -> 0x046b }
        L_0x0402:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x046b }
            r0 = 12288(0x3000, float:1.7219E-41)
            if (r1 == 0) goto L_0x0411
            int r3 = r1.intValue()     // Catch:{ all -> 0x046b }
            if (r3 == r0) goto L_0x0420
            goto L_0x041a
        L_0x0411:
            monitor-enter(r6)     // Catch:{ all -> 0x046b }
            r0 = 1
            r8.A0H = r0     // Catch:{ all -> 0x044e }
            r6.notifyAll()     // Catch:{ all -> 0x044e }
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
            goto L_0x0420
        L_0x041a:
            r0 = 12302(0x300e, float:1.7239E-41)
            if (r3 != r0) goto L_0x0426
            r27 = 1
        L_0x0420:
            if (r25 == 0) goto L_0x0029
            r24 = 1
            goto L_0x0029
        L_0x0426:
            X.A8D r2 = X.C18754Vzp.A06     // Catch:{ all -> 0x046b }
            java.lang.String r1 = "GLThread"
            java.lang.String r0 = "eglSwapBuffers"
            java.lang.String r0 = r2.A00(r0, r3)     // Catch:{ all -> 0x046b }
            X.0KC.A0D(r1, r0)     // Catch:{ all -> 0x046b }
            goto L_0x0411
        L_0x0434:
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
            monitor-enter(r6)
            r8.A02()
            r8.A01()
            monitor-exit(r6)
            return
        L_0x043e:
            java.lang.String r0 = "eglDisplay not initialized"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x046b }
            r1.<init>(r0)     // Catch:{ all -> 0x046b }
            goto L_0x046a
        L_0x0446:
            java.lang.String r0 = "egl not initialized"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x046b }
            r1.<init>(r0)     // Catch:{ all -> 0x046b }
            goto L_0x046a
        L_0x044e:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
            goto L_0x046a
        L_0x0451:
            r1 = move-exception
            X.Wui r0 = r6.A00     // Catch:{ all -> 0x0460 }
            if (r0 != r8) goto L_0x0459
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x0460 }
        L_0x0459:
            r6.notifyAll()     // Catch:{ all -> 0x0460 }
            goto L_0x045f
        L_0x045d:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0460 }
        L_0x045f:
            throw r1     // Catch:{ all -> 0x0460 }
        L_0x0460:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
            goto L_0x046a
        L_0x0463:
            java.lang.String r0 = "eglConfig not initialized"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x046b }
            r1.<init>(r0)     // Catch:{ all -> 0x046b }
        L_0x046a:
            throw r1     // Catch:{ all -> 0x046b }
        L_0x046b:
            r0 = move-exception
            X.VuH r1 = com.instagram.ui.widget.drawing.gl.GLDrawingView.A0I
            monitor-enter(r1)
            r8.A02()     // Catch:{ all -> 0x0477 }
            r8.A01()     // Catch:{ all -> 0x0477 }
            monitor-exit(r1)
            throw r0
        L_0x0477:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20565Wui.A00():void");
    }

    private final void A01() {
        if (this.A04) {
            C18754Vzp vzp = this.A0E;
            if (vzp != null) {
                vzp.A01();
            }
            this.A04 = false;
            C18565VuH vuH = GLDrawingView.A0I;
            if (vuH.A00 == this) {
                vuH.A00 = null;
            }
            vuH.notifyAll();
        }
    }

    private final void A02() {
        if (this.A05) {
            this.A05 = false;
            C18754Vzp vzp = this.A0E;
            if (vzp != null) {
                C18754Vzp.A00(vzp);
            }
        }
    }

    private final boolean A03() {
        if (this.A06 || !this.A03 || this.A0H || this.A0D <= 0 || this.A0C <= 0) {
            return false;
        }
        if (this.A09 || this.A00 == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|19|16|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0009, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r2 = this;
            X.VuH r1 = com.instagram.ui.widget.drawing.gl.GLDrawingView.A0I
            monitor-enter(r1)
            r0 = 1
            r2.A0G = r0     // Catch:{ all -> 0x0017 }
            r1.notifyAll()     // Catch:{ all -> 0x0017 }
        L_0x0009:
            boolean r0 = r2.A01     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            r1.wait()     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0009
        L_0x0011:
            X.Pxe.A1F()     // Catch:{ all -> 0x0017 }
            goto L_0x0009
        L_0x0015:
            monitor-exit(r1)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20565Wui.A04():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|18|19|33|25|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0012, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(int r3, int r4) {
        /*
            r2 = this;
            X.VuH r1 = com.instagram.ui.widget.drawing.gl.GLDrawingView.A0I
            monitor-enter(r1)
            r2.A0D = r3     // Catch:{ all -> 0x0036 }
            r2.A0C = r4     // Catch:{ all -> 0x0036 }
            r0 = 1
            r2.A0F = r0     // Catch:{ all -> 0x0036 }
            r2.A09 = r0     // Catch:{ all -> 0x0036 }
            r0 = 0
            r2.A07 = r0     // Catch:{ all -> 0x0036 }
            r1.notifyAll()     // Catch:{ all -> 0x0036 }
        L_0x0012:
            boolean r0 = r2.A01     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            boolean r0 = r2.A06     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            boolean r0 = r2.A07     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            boolean r0 = r2.A04     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            boolean r0 = r2.A05     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            boolean r0 = r2.A03()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            r1.wait()     // Catch:{ InterruptedException -> 0x0030 }
            goto L_0x0012
        L_0x0030:
            X.Pxe.A1F()     // Catch:{ all -> 0x0036 }
            goto L_0x0012
        L_0x0034:
            monitor-exit(r1)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20565Wui.A06(int, int):void");
    }

    public final void A07(Runnable runnable) {
        C18565VuH vuH = GLDrawingView.A0I;
        synchronized (vuH) {
            this.A0J.add(runnable);
            vuH.notifyAll();
        }
    }

    public final void run() {
        setName(002.A0Q("GLThread ", getId()));
        try {
            A00();
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            GLDrawingView.A0I.A01(this);
            throw th;
        }
        GLDrawingView.A0I.A01(this);
    }
}
