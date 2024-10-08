package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.webrtc.EglBase10Impl;

/* renamed from: X.7s6  reason: invalid class name and case insensitive filesystem */
public final class C344587s6 implements C344557s3 {
    public int A00 = 0;
    public int A01;
    public EGLConfig A02;
    public EGLContext A03 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A04 = EGL14.EGL_NO_DISPLAY;
    public C344597s7 A05;
    public final int A06;
    public final Object A07;
    public final Map A08 = new HashMap();

    public static EGLConfig A00(EGLDisplay eGLDisplay, int[] iArr, int i) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0) && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        C345907uH.A01("eglChooseConfig");
        throw new GLException(-1, 002.A0c("unable to find EGL config with flags = ", ", no GL Errors", i));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C345937uK AMZ(android.view.Surface r6, int r7) {
        /*
            r5 = this;
            r4 = 5
            java.lang.Object r3 = r5.A07
            if (r3 == 0) goto L_0x001e
            monitor-enter(r3)
            X.7uX r2 = new X.7uX     // Catch:{ all -> 0x001b }
            r2.<init>(r5)     // Catch:{ all -> 0x001b }
            X.7s6 r1 = r2.A01     // Catch:{ all -> 0x001b }
            android.opengl.EGLConfig r0 = r1.A02     // Catch:{ all -> 0x001b }
            android.opengl.EGLConfig r0 = A01(r1, r4)     // Catch:{ RuntimeException -> 0x0013 }
        L_0x0013:
            android.opengl.EGLSurface r0 = A02(r0, r6, r1)     // Catch:{ all -> 0x001b }
            r2.A00 = r0     // Catch:{ all -> 0x001b }
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            return r2
        L_0x001b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            X.7uX r2 = new X.7uX
            r2.<init>(r5)
            X.7s6 r1 = r2.A01
            android.opengl.EGLConfig r0 = r1.A02
            android.opengl.EGLConfig r0 = A01(r1, r4)     // Catch:{ RuntimeException -> 0x002b }
        L_0x002b:
            android.opengl.EGLSurface r0 = A02(r0, r6, r1)
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344587s6.AMZ(android.view.Surface, int):X.7uK");
    }

    public static EGLConfig A01(C344587s6 r41, int i) {
        int i2;
        C344587s6 r5 = r41;
        Map map = r5.A08;
        int i3 = i;
        Integer valueOf = Integer.valueOf(i3);
        if (map.containsKey(valueOf)) {
            return (EGLConfig) map.get(valueOf);
        }
        int i4 = 4;
        if ((i & 2) != 0) {
            i4 = 68;
        }
        int i5 = 0;
        if ((i & 4) != 0) {
            i5 = 16;
        }
        int i6 = i & 32;
        int i7 = 8;
        int i8 = 8;
        if (i6 != 0) {
            i7 = 2;
            i8 = 10;
        }
        if ((i & 8) != 0) {
            i7 = 0;
        }
        int[] iArr = {12324, i8, 12323, i8, 12322, i8, 12321, i7, 12325, i5, 12352, i4, 12344, 0, 12344, 0, 12344, 0, 12344, 0, 12344, 0, 12344};
        if ((i3 & 1) != 0) {
            iArr[20] = 12610;
            iArr[21] = 1;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            iArr[16] = 12338;
            iArr[17] = 1;
            iArr[18] = 12337;
            iArr[19] = 4;
        }
        if ((i3 & 64) != 0) {
            iArr[14] = 12339;
            iArr[15] = 1;
        }
        if ((i3 & 128) != 0) {
            iArr[14] = 12339;
            iArr[15] = 4;
        }
        if (i6 == 0 || (i3 & 4096) == 0) {
            if ((i3 & C249703kE.FLAG_MOVED) != 0) {
                iArr[12] = 12327;
                i2 = -1;
            } else if ((i3 & 512) != 0) {
                iArr[12] = 12327;
                i2 = 12368;
            } else if ((i3 & 1024) != 0) {
                iArr[12] = 12327;
                i2 = 12369;
            } else if ((i3 & 256) != 0) {
                iArr[12] = 12327;
                iArr[13] = 12344;
            }
            iArr[13] = i2;
        }
        try {
            EGLConfig A002 = A00(r5.A04, iArr, i3);
            if (!(i6 == 0 || (i3 & 4096) == 0)) {
                int[] iArr2 = new int[1];
                EGL14.eglGetConfigAttrib(r5.A04, A002, 12327, iArr2, 0);
                iArr[12] = 12327;
                iArr[13] = iArr2[0];
                A002 = A00(r5.A04, iArr, i3);
            }
            map.put(valueOf, A002);
            return A002;
        } catch (GLException e) {
            if (i9 != 0) {
                iArr[16] = 12344;
                iArr[17] = 0;
                iArr[18] = 12344;
                iArr[19] = 0;
                EGLConfig A003 = A00(r5.A04, iArr, i3);
                map.put(valueOf, A003);
                return A003;
            }
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.7uK, X.7uJ] */
    private C345927uJ A03(int i, int i2) {
        ? r4 = new C345937uK(this);
        C344587s6 r0 = r4.A01;
        r4.A00 = EGL14.eglCreatePbufferSurface(r0.A04, r0.A02, new int[]{12375, i, 12374, i2, 12344}, 0);
        C345907uH.A01("eglCreatePbufferSurface");
        r4.A00.getClass();
        return r4;
    }

    private void A04() {
        EGLDisplay eGLDisplay = this.A04;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }

    private void A05() {
        if (this.A04 != EGL14.EGL_NO_DISPLAY) {
            if (CQx()) {
                A04();
                EGL14.eglDestroyContext(this.A04, this.A03);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.A04);
            } else {
                EGL14.eglDestroyContext(this.A04, this.A03);
            }
        }
        this.A04 = EGL14.EGL_NO_DISPLAY;
        this.A03 = EGL14.EGL_NO_CONTEXT;
        this.A02 = null;
        this.A08.clear();
        this.A00 = 0;
        C344597s7 r2 = this.A05;
        if (r2 != null) {
            C345917uI r1 = C345917uI.A02;
            synchronized (r1) {
                r1.A01.remove(r2);
            }
            C344597s7 r22 = this.A05;
            List list = r22.A00;
            list.remove(Integer.valueOf(hashCode()));
            if (list.isEmpty()) {
                r22.A01.clear();
            }
            list.isEmpty();
        }
        this.A05 = null;
    }

    private void A06(EGLContext eGLContext, int i) {
        String format;
        this.A00 = i;
        this.A04 = EGL14.eglGetDisplay(0);
        C345907uH.A01("eglGetDisplay");
        EGLDisplay eGLDisplay = this.A04;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eGLDisplay, iArr, 0, iArr, 1)) {
                EGLConfig A012 = A01(this, i);
                this.A02 = A012;
                int i2 = this.A06;
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.A04, A012, eGLContext, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, i2, 12344}, 0);
                this.A03 = eglCreateContext;
                if (i2 == 3 && (eglCreateContext == null || eglCreateContext == EGL14.EGL_NO_CONTEXT || EGL14.eglGetError() != 12288)) {
                    this.A03 = EGL14.eglCreateContext(this.A04, this.A02, eGLContext, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                    format = Pxd.A00(209);
                } else {
                    format = String.format((Locale) null, "eglCreateContext Version %d", new Object[]{Integer.valueOf(i2)});
                }
                C345907uH.A01(format);
                this.A03.getClass();
                C345917uI r2 = C345917uI.A02;
                C344597s7 r1 = this.A05;
                synchronized (r2) {
                    if (r1 != null) {
                        r2.A01.add(r1);
                    }
                }
                int[] iArr2 = new int[1];
                EGL14.eglQueryContext(this.A04, this.A03, EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, iArr2, 0);
                this.A01 = iArr2[0];
                return;
            }
            C345907uH.A01("eglInitialize");
            throw new GLException(-1, "unable to initialize EGL14, no GL Errors");
        }
        throw new IllegalStateException();
    }

    public static boolean A07(EGLSurface eGLSurface, EGLSurface eGLSurface2, C344587s6 r13) {
        boolean equals = r13.A03.equals(EGL14.eglGetCurrentContext());
        boolean equals2 = r13.A04.equals(EGL14.EGL_NO_DISPLAY);
        boolean equals3 = eGLSurface.equals(EGL14.eglGetCurrentSurface(12377));
        boolean equals4 = eGLSurface2.equals(EGL14.eglGetCurrentSurface(12378));
        if ((!equals || !equals3 || !equals4) && !EGL14.eglMakeCurrent(r13.A04, eGLSurface, eGLSurface2, r13.A03)) {
            StringBuilder sb = new StringBuilder();
            sb.append("eglMakeCurrent, contextWasAlreadyCurrent=");
            sb.append(equals);
            sb.append(" isDisplayNoDisplay=");
            sb.append(equals2);
            sb.append(" drawSurfaceWasAlreadyCurrent=");
            sb.append(equals3);
            sb.append(" readSurfaceWasAlreadyCurrent=");
            sb.append(equals4);
            C345907uH.A01(sb.toString());
            if (!EGL14.eglMakeCurrent(r13.A04, eGLSurface, eGLSurface2, r13.A03)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("eglMakeCurrent, contextWasAlreadyCurrent=");
                sb2.append(equals);
                sb2.append(" isDisplayNoDisplay=");
                sb2.append(equals2);
                sb2.append(" drawSurfaceWasAlreadyCurrent=");
                sb2.append(equals3);
                sb2.append(" readSurfaceWasAlreadyCurrent=");
                sb2.append(equals4);
                C345907uH.A01(sb2.toString());
                return false;
            }
        }
        return true;
    }

    public static int[] A08(C344587s6 r4) {
        int[] iArr = {12344};
        int i = r4.A00;
        if ((i & 32) == 0 || (i & 8192) == 0 || EGL14.eglQueryString(r4.A04, 12373) == null || !EGL14.eglQueryString(r4.A04, 12373).contains("KHR_gl_colorspace") || EGL14.eglQueryString(r4.A04, 12373) == null || !EGL14.eglQueryString(r4.A04, 12373).contains("EXT_gl_colorspace_bt2020")) {
            return iArr;
        }
        return new int[]{12445, 13632, 12344};
    }

    public final void A09(EGLContext eGLContext, int i) {
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                A06(eGLContext, i);
            }
            return;
        }
        A06(eGLContext, i);
    }

    public final C345937uK AMW(int i, int i2) {
        C345927uJ A032;
        Object obj = this.A07;
        if (obj == null) {
            return A03(i, i2);
        }
        synchronized (obj) {
            A032 = A03(i, i2);
        }
        return A032;
    }

    public final C345937uK AMY(Surface surface) {
        C345937uK r2;
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                r2 = new C345937uK(this);
                C344587s6 r1 = r2.A01;
                r2.A00 = A02(r1.A02, surface, r1);
            }
            return r2;
        }
        C345937uK r22 = new C345937uK(this);
        C344587s6 r12 = r22.A01;
        r22.A00 = A02(r12.A02, surface, r12);
        return r22;
    }

    public final int Apq() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ EGLContext Azj() {
        return this.A03;
    }

    public final int BYP() {
        return this.A01;
    }

    public final C344597s7 C5n() {
        return this.A05;
    }

    public final boolean CQx() {
        EGLContext eGLContext = this.A03;
        if (eGLContext != EGL14.EGL_NO_CONTEXT) {
            return eGLContext.equals(EGL14.eglGetCurrentContext());
        }
        return false;
    }

    public final void ClX() {
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                A04();
            }
            return;
        }
        A04();
    }

    public final /* bridge */ /* synthetic */ C344587s6 ErB(int i) {
        A09(EGL14.EGL_NO_CONTEXT, i);
        return this;
    }

    public final void release() {
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                A05();
            }
            return;
        }
        A05();
    }

    public C344587s6(Object obj, int i) {
        this.A07 = obj;
        this.A05 = new C344597s7(this);
        this.A06 = i;
    }

    public static EGLSurface A02(EGLConfig eGLConfig, Surface surface, C344587s6 r5) {
        int[] A082 = A08(r5);
        if (surface.isValid()) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r5.A04, eGLConfig, surface, A082, 0);
            C345907uH.A01("eglCreateWindowSurface");
            eglCreateWindowSurface.getClass();
            return eglCreateWindowSurface;
        }
        throw new C345117sx(-1, "Surface is invalid while createWindowSurface");
    }

    public final void A0A(C344557s3 r3, int i) {
        this.A05 = r3.C5n();
        A09(r3.Azj(), i);
        C344597s7 r0 = this.A05;
        if (r0 != null) {
            r0.A00.add(Integer.valueOf(hashCode()));
        } else {
            this.A05 = new C344597s7(this);
        }
    }

    public final /* bridge */ /* synthetic */ C344557s3 ErC(C344557s3 r1, int i) {
        A0A(r1, i);
        return this;
    }
}
