package X;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* renamed from: X.Q4h  reason: case insensitive filesystem */
public final class C7331Q4h implements C13858Tid {
    public EGLContext A00 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A01 = EGL14.EGL_NO_DISPLAY;
    public EGLSurface A02 = EGL14.EGL_NO_SURFACE;
    public C344587s6 A03 = null;
    public final Surface A04;
    public final C345557ti A05;
    public final C7334Q4k A06;
    public final /* synthetic */ C10429Rs5 A07;

    public final void A8G(MediaEffect mediaEffect, int i) {
        C13861Tih tih = this.A07.A00;
        tih.getClass();
        tih.A8G(mediaEffect, i);
    }

    public final void AAZ(int i) {
        C13861Tih tih = this.A07.A00;
        tih.getClass();
        tih.AAZ(i);
    }

    public final void APk(long j) {
        C349257zq.A03("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        C13861Tih tih = this.A07.A00;
        tih.getClass();
        tih.APj(0, j);
        C349257zq.A01();
    }

    public final void AQY(long j) {
        C13861Tih tih = this.A07.A00;
        tih.getClass();
        tih.AQY(j);
    }

    public final void EDZ(MediaEffect mediaEffect, int i) {
        C13861Tih tih = this.A07.A00;
        if (tih != null) {
            tih.EDZ(mediaEffect, i);
        }
    }

    public final Bitmap EJv() {
        C13861Tih tih = this.A07.A00;
        tih.getClass();
        return tih.EK2(0);
    }

    public final void EMX(C344907sc r3) {
        C13861Tih tih = this.A07.A00;
        if (tih instanceof C344777sP) {
            ((C344777sP) tih).E4c(r3);
        }
    }

    public final void EMY(C344907sc r3, C345237tA r4) {
        C13861Tih tih = this.A07.A00;
        if (tih instanceof C344777sP) {
            ((C344777sP) tih).E4d(r3, r4);
        }
    }

    public final void EeS(B19 b19) {
        C13861Tih tih = this.A07.A00;
        if (tih != null) {
            tih.EeS(b19);
        }
    }

    public final void FKI(Surface surface) {
        C13861Tih tih = this.A07.A00;
        tih.getClass();
        tih.Ef8(surface, (C9608Rdm) null, 0);
    }

    public final void FNK() {
        this.A07.A00.getClass();
    }

    public final void cancel() {
        C13861Tih tih = this.A07.A00;
        if (tih != null) {
            tih.cancel();
        }
    }

    public final void flush() {
        C13861Tih tih = this.A07.A00;
        tih.getClass();
        tih.flush();
    }

    public final void release() {
        EGLSurface eGLSurface;
        C10429Rs5 rs5 = this.A07;
        C344587s6 r0 = this.A03;
        if (r0 != null) {
            r0.release();
        }
        if (this.A00 != null) {
            if (EGL14.eglGetCurrentContext().equals(this.A00)) {
                EGLDisplay eGLDisplay = this.A01;
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            }
            EGL14.eglDestroyContext(this.A01, this.A00);
        }
        EGLDisplay eGLDisplay2 = this.A01;
        if (!(eGLDisplay2 == null || (eGLSurface = this.A02) == null)) {
            EGL14.eglDestroySurface(eGLDisplay2, eGLSurface);
        }
        C13861Tih tih = rs5.A00;
        if (tih != null) {
            tih.release();
        }
        this.A01 = null;
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        rs5.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (r13.A08() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        if (r0 == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r7.A06.A0G() == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        if (r13.A08() == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        if (r0 == false) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7331Q4h(android.content.Context r40, android.view.Surface r41, X.C7232Q0d r42, X.C11354SOn r43, com.facebook.videolite.transcoder.base.composition.MediaComposition r44, X.C13781Tgw r45, X.C10429Rs5 r46, X.C10796RyI r47, X.C9608Rdm r48, X.C7334Q4k r49) {
        /*
            r39 = this;
            r2 = 0
            r7 = r39
            r4 = r46
            r7.A07 = r4
            r7.<init>()
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r7.A01 = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r7.A00 = r0
            r10 = 0
            r7.A03 = r10
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r7.A02 = r0
            r3 = r49
            r7.A06 = r3
            r28 = r40
            android.content.res.Resources r1 = r28.getResources()
            X.7ti r0 = new X.7ti
            r0.<init>(r1)
            r7.A05 = r0
            r27 = r45
            boolean r0 = r27.CK7()
            r5 = r41
            if (r0 == 0) goto L_0x00ff
            r7.A04 = r10
        L_0x0036:
            X.Tih r0 = r4.A00
            if (r0 != 0) goto L_0x0278
            r6 = r43
            int r0 = r6.A09
            r9 = 7
            boolean r14 = X.AnonymousClass7TF.A1S(r0, r9)
            android.opengl.EGLContext r8 = r27.BtT()
            if (r8 != 0) goto L_0x004a
            r8 = 0
        L_0x004a:
            boolean r0 = r3 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x00db
            r13 = r3
            X.QeC r13 = (X.C7964QeC) r13
            int r0 = r13.A00
            if (r0 != 0) goto L_0x0103
            java.lang.Object r12 = r13.A01
            X.0lg r12 = (X.0lg) r12
            X.0Tu r11 = X.0Tu.A05
            r0 = 36316190464872520(0x81056200411048, double:3.029843311322306E-306)
            boolean r11 = X.182.A06(r11, r12, r0)
            if (r14 == 0) goto L_0x006d
            boolean r1 = r13.A08()
            r0 = 1
            if (r1 != 0) goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r11 != 0) goto L_0x0072
            if (r0 == 0) goto L_0x0103
        L_0x0072:
            r1 = 2
            X.7s6 r0 = new X.7s6
            r0.<init>(r10, r1)
            r7.A03 = r0
            int r0 = r6.A09
            if (r0 != r9) goto L_0x0088
            X.Q4k r0 = r7.A06
            boolean r1 = r0.A0G()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L_0x008a
        L_0x0088:
            r0 = 256(0x100, float:3.59E-43)
        L_0x008a:
            android.view.Surface r10 = r7.A04
            r1 = r0 | 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x0092
            r1 = r0 | 64
        L_0x0092:
            int r0 = r6.A09
            if (r0 != r9) goto L_0x0098
            r1 = r1 | 32
        L_0x0098:
            X.7s6 r0 = r7.A03
            if (r8 != 0) goto L_0x009e
            android.opengl.EGLContext r8 = android.opengl.EGL14.EGL_NO_CONTEXT
        L_0x009e:
            r0.A09(r8, r1)
            X.7s6 r9 = r7.A03
            android.opengl.EGLDisplay r8 = r9.A04
            r7.A01 = r8
            r0 = 12344(0x3038, float:1.7298E-41)
            int[] r1 = new int[]{r0}
            if (r10 == 0) goto L_0x00c8
            android.opengl.EGLConfig r0 = r9.A02
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreateWindowSurface(r8, r0, r10, r1, r2)
            r7.A02 = r0
            java.lang.String r0 = "eglCreateWindowSurface"
        L_0x00b9:
            X.C345907uH.A01(r0)
            android.opengl.EGLSurface r8 = r7.A02
            if (r8 != 0) goto L_0x01f7
            java.lang.String r0 = "surface was null"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x00c8:
            r0 = 5
            int[] r1 = new int[r0]
            r1 = {12375, 8, 12374, 8, 12344} // fill-array
            X.7s6 r0 = r7.A03
            android.opengl.EGLConfig r0 = r0.A02
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreatePbufferSurface(r8, r0, r1, r2)
            r7.A02 = r0
            java.lang.String r0 = "eglCreatePbufferSurface"
            goto L_0x00b9
        L_0x00db:
            boolean r0 = r3 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0103
            r13 = r3
            X.QeF r13 = (X.C7967QeF) r13
            com.instagram.common.session.UserSession r12 = r13.A00
            X.0Tu r11 = X.0Tu.A05
            r0 = 36316190461399072(0x810562000c1020, double:3.0298433091256834E-306)
            boolean r11 = X.182.A06(r11, r12, r0)
            if (r14 == 0) goto L_0x00f8
            boolean r1 = r13.A08()
            r0 = 1
            if (r1 != 0) goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            if (r11 != 0) goto L_0x0072
            if (r0 == 0) goto L_0x0103
            goto L_0x0072
        L_0x00ff:
            r7.A04 = r5
            goto L_0x0036
        L_0x0103:
            android.opengl.EGLDisplay r11 = android.opengl.EGL14.eglGetDisplay(r2)
            r7.A01 = r11
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r11 == r0) goto L_0x026a
            r1 = 2
            int[] r0 = new int[r1]
            r13 = 1
            boolean r0 = android.opengl.EGL14.eglInitialize(r11, r0, r2, r0, r13)
            if (r0 == 0) goto L_0x0260
            android.view.Surface r14 = r7.A04
            r26 = 4
            r25 = 4
            if (r14 != 0) goto L_0x0121
            r25 = 1
        L_0x0121:
            int r0 = r6.A09
            r24 = 9
            r23 = 12321(0x3021, float:1.7265E-41)
            r22 = 12322(0x3022, float:1.7267E-41)
            r21 = 6
            r20 = 12323(0x3023, float:1.7268E-41)
            r19 = 12324(0x3024, float:1.727E-41)
            r18 = 12352(0x3040, float:1.7309E-41)
            r10 = 17
            r12 = 5
            r11 = 3
            r17 = 12344(0x3038, float:1.7298E-41)
            r16 = 10
            r15 = 8
            if (r0 != r9) goto L_0x01df
            X.Q4k r0 = r7.A06
            r0.A0G()
            int[] r10 = new int[r10]
            r10[r2] = r18
            r10[r13] = r26
            r10[r1] = r19
            r10[r11] = r16
            r10[r26] = r20
            r10[r12] = r16
            r10[r21] = r22
            r10[r9] = r16
            r10[r15] = r23
            r10[r24] = r1
        L_0x0158:
            r0 = 12325(0x3025, float:1.7271E-41)
            r10[r16] = r0
            r0 = 11
            r10[r0] = r2
            r1 = 12327(0x3027, float:1.7274E-41)
            r0 = 12
            r10[r0] = r1
            r0 = 13
            r10[r0] = r17
            r1 = 14
            r0 = 12339(0x3033, float:1.729E-41)
            r10[r1] = r0
            r0 = 15
            r10[r0] = r25
            r0 = 16
            r10[r0] = r17
            android.opengl.EGLConfig[] r0 = new android.opengl.EGLConfig[r13]
            int[] r9 = new int[r13]
            android.opengl.EGLDisplay r1 = r7.A01
            r18 = r1
            r19 = r10
            r20 = r2
            r21 = r0
            r22 = r2
            r23 = r13
            r24 = r9
            r25 = r2
            boolean r1 = android.opengl.EGL14.eglChooseConfig(r18, r19, r20, r21, r22, r23, r24, r25)
            if (r1 == 0) goto L_0x0258
            int[] r10 = new int[r11]
            r10 = {12440, 2, 12344} // fill-array
            android.opengl.EGLDisplay r9 = r7.A01
            r1 = r0[r2]
            if (r8 != 0) goto L_0x01a1
            android.opengl.EGLContext r8 = android.opengl.EGL14.EGL_NO_CONTEXT
        L_0x01a1:
            android.opengl.EGLContext r1 = android.opengl.EGL14.eglCreateContext(r9, r1, r8, r10, r2)
            r7.A00 = r1
            java.lang.String r1 = "eglCreateContext"
            X.C345907uH.A01(r1)
            android.opengl.EGLContext r1 = r7.A00
            if (r1 == 0) goto L_0x0250
            int[] r8 = new int[]{r17}
            if (r14 == 0) goto L_0x01d1
            android.opengl.EGLDisplay r1 = r7.A01
            r0 = r0[r2]
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreateWindowSurface(r1, r0, r14, r8, r2)
        L_0x01be:
            r7.A02 = r0
            java.lang.String r0 = "eglCreateWindowSurface"
            X.C345907uH.A01(r0)
            android.opengl.EGLSurface r8 = r7.A02
            if (r8 != 0) goto L_0x01f7
            java.lang.String r0 = "surface was null"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x01d1:
            int[] r8 = new int[r12]
            r8 = {12375, 8, 12374, 8, 12344} // fill-array
            android.opengl.EGLDisplay r1 = r7.A01
            r0 = r0[r2]
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreatePbufferSurface(r1, r0, r8, r2)
            goto L_0x01be
        L_0x01df:
            int[] r10 = new int[r10]
            r10[r2] = r18
            r10[r13] = r26
            r10[r1] = r19
            r10[r11] = r15
            r10[r26] = r20
            r10[r12] = r15
            r10[r21] = r22
            r10[r9] = r15
            r10[r15] = r23
            r10[r24] = r15
            goto L_0x0158
        L_0x01f7:
            X.7s6 r0 = r7.A03
            if (r0 == 0) goto L_0x020e
            android.opengl.EGLContext r1 = r0.A03
        L_0x01fd:
            if (r1 == 0) goto L_0x0211
            android.opengl.EGLDisplay r0 = r7.A01
            boolean r0 = android.opengl.EGL14.eglMakeCurrent(r0, r8, r8, r1)
            if (r0 != 0) goto L_0x0211
            java.lang.String r0 = "eglMakeCurrent failed"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x020e:
            android.opengl.EGLContext r1 = r7.A00
            goto L_0x01fd
        L_0x0211:
            X.Rs5 r11 = r7.A07
            X.7ti r10 = r7.A05
            java.lang.Integer r38 = X.AnonymousClass05K.A00
            android.opengl.EGLContext r9 = r7.A00
            r9.getClass()
            X.7s6 r8 = r7.A03
            android.opengl.EGLDisplay r1 = r7.A01
            r1.getClass()
            android.opengl.EGLSurface r0 = r7.A02
            r0.getClass()
            r34 = r42
            r36 = r44
            r29 = r9
            r30 = r1
            r31 = r0
            r32 = r8
            r33 = r10
            r35 = r6
            r37 = r3
            X.Tih r0 = r27.ALL(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r11.A00 = r0
            r3 = r47
            if (r47 == 0) goto L_0x0273
            X.0qQ.A0B(r0, r2)
            java.lang.Object r1 = r3.A02
            monitor-enter(r1)
            r3.A00 = r0     // Catch:{ all -> 0x024d }
            goto L_0x0272
        L_0x024d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0250:
            java.lang.String r0 = "null context"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0258:
            java.lang.String r0 = "unable to find RGB888+recordable ES2 EGL config"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0260:
            r7.A01 = r10
            java.lang.String r0 = "unable to initialize EGL14"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x026a:
            java.lang.String r0 = "unable to get EGL14 display"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0272:
            monitor-exit(r1)
        L_0x0273:
            X.Tih r0 = r11.A00
            r0.CMP()
        L_0x0278:
            X.Tih r0 = r4.A00
            r0.getClass()
            r1 = r48
            r0.Ef8(r5, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7331Q4h.<init>(android.content.Context, android.view.Surface, X.Q0d, X.SOn, com.facebook.videolite.transcoder.base.composition.MediaComposition, X.Tgw, X.Rs5, X.RyI, X.Rdm, X.Q4k):void");
    }
}
