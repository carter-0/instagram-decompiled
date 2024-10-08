package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SsH  reason: case insensitive filesystem */
public final class C12368SsH implements C13859Tie {
    public final /* synthetic */ C12372SsL A00;

    public final void A8G(MediaEffect mediaEffect, int i) {
    }

    public final void AAZ(int i) {
    }

    public final void APk(long j) {
    }

    public final void EDZ(MediaEffect mediaEffect, int i) {
    }

    public final void EEo(int i) {
    }

    public final void flush() {
    }

    public C12368SsH(C12372SsL ssL) {
        this.A00 = ssL;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Q1b, java.lang.Object] */
    public final void AVT() {
        ? obj = new Object();
        C12372SsL ssL = this.A00;
        new C7948Qdp((C7254Q1b) obj, ssL.A06).A00();
        Q1W q1w = ssL.A07.A0A;
        q1w.getClass();
        synchronized (q1w) {
        }
        C10849Rz9 rz9 = ssL.A07;
        C9134RQj rQj = rz9.A09;
        rQj.getClass();
        EGLDisplay eGLDisplay = rQj.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        C9134RQj rQj2 = rz9.A09;
        rQj2.getClass();
        EGLDisplay eGLDisplay2 = rQj2.A02;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(rQj2.A02, rQj2.A03);
            EGL14.eglDestroyContext(rQj2.A02, rQj2.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(rQj2.A02);
        }
        rQj2.A02 = EGL14.EGL_NO_DISPLAY;
        rQj2.A01 = EGL14.EGL_NO_CONTEXT;
        rQj2.A00 = null;
        rz9.A09 = null;
        GLES20.glDeleteTextures(1, new int[]{rz9.A00}, 0);
        rz9.A00 = -1;
        SurfaceTexture surfaceTexture = rz9.A02;
        surfaceTexture.getClass();
        surfaceTexture.release();
        rz9.A02 = null;
        Surface surface = rz9.A04;
        surface.getClass();
        surface.release();
        rz9.A04 = null;
        C10780Ry1 ry1 = rz9.A07;
        ry1.getClass();
        ry1.A00.A02();
        rz9.A07 = null;
        C10809RyV ryV = rz9.A08;
        ryV.getClass();
        ryV.A01.A02();
        rz9.A08 = null;
        List<C369008tg> list = rz9.A0B;
        list.getClass();
        for (C369008tg A01 : list) {
            A01.A01();
        }
        List list2 = rz9.A0B;
        list2.getClass();
        list2.clear();
        rz9.A0B = null;
        rz9.A0A = null;
        HandlerThread handlerThread = rz9.A03;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            rz9.A03 = null;
        }
        obj.A01();
    }

    public final String B1O() {
        try {
            return this.A00.A06.A05.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int BZa() {
        C11354SOn sOn = this.A00.A03;
        return (sOn.A0B + sOn.A05) % 360;
    }

    public final void E42(Context context, C7232Q0d q0d, C11354SOn sOn, C9608Rdm rdm, C7334Q4k q4k, int i) {
        C8907RFa rFa = C8907RFa.CODEC_VIDEO_H264;
        C11354SOn sOn2 = sOn;
        SJA sja = sOn2.A0G;
        if (sja != null) {
            rFa = sja.A04;
        }
        int i2 = sOn2.A0C;
        int i3 = sOn2.A0A;
        boolean z = false;
        int i4 = 1;
        int i5 = 256;
        int i6 = -1;
        int A01 = sOn2.A01();
        int i7 = sOn2.A03;
        int i8 = sOn2.A02;
        if (sja != null) {
            i4 = sja.A03;
            i5 = sja.A02;
            z = true;
        }
        int i9 = sOn2.A0D;
        if (i9 != -1) {
            i6 = i9;
        }
        MediaFormat A002 = C9604Rdi.A00(rFa, (RQc) null, 0, i6, i3, i7, i5, i4, A01, i8, i2, false, z);
        Map map = sOn2.A0K;
        if (map != null) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A002.setInteger(DbT.A13(A1J), C66582MXn.A08(A1J));
            }
        }
        C12372SsL ssL = this.A00;
        String str = rFa.A00;
        Q17 A02 = C7257Q1f.A02(A002, RDj.SURFACE, q4k, str, sOn2.A0I);
        ssL.A06 = A02;
        A02.A02();
        C345557ti r4 = new C345557ti(context.getResources());
        Q17 q17 = ssL.A06;
        C266784aL.A06(AnonymousClass7TF.A1W(q17.A07, AnonymousClass05K.A01), (String) null);
        ssL.A07 = new C10849Rz9(q17.A06, r4, sOn2);
        ssL.A03 = sOn2;
        ssL.A02 = sOn2.A0F;
        ssL.A01 = -71000;
    }

    public final void ECi(Q1A q1a) {
        Q17 q17 = this.A00.A06;
        q17.A08.append("releaseOutputBuffer,");
        q17.A04(q1a, q17.A0A);
    }

    public final void EF4(long j) {
        C12372SsL ssL = this.A00;
        boolean z = ssL.A08;
        ssL.A01 = j;
        C10849Rz9 rz9 = ssL.A07;
        SurfaceTexture surfaceTexture = rz9.A02;
        surfaceTexture.getClass();
        float[] fArr = rz9.A0D;
        surfaceTexture.getTransformMatrix(fArr);
        C11354SOn sOn = rz9.A06;
        int i = sOn.A08;
        int i2 = sOn.A06;
        C369008tg r1 = new C369008tg(i, i2);
        List list = rz9.A0B;
        list.getClass();
        list.add(r1);
        Pxe.A1J(j, rz9.A0C);
        GLES20.glBindFramebuffer(36160, r1.A00);
        GLES20.glViewport(0, 0, i, i2);
        C10780Ry1 ry1 = rz9.A07;
        ry1.getClass();
        int i3 = rz9.A00;
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i3);
        C361258fv A01 = ry1.A00.A01();
        A01.A04("uSTMatrix", fArr);
        A01.A04("uConstMatrix", ry1.A03);
        A01.A04("uSceneMatrix", ry1.A05);
        A01.A04("uContentTransform", ry1.A04);
        A01.A01(ry1.A01);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, 0);
        rz9.A05.getClass();
    }

    public final void Evc() {
        C12372SsL ssL = this.A00;
        if (!ssL.A08) {
            ssL.A08 = true;
            C10849Rz9 rz9 = ssL.A07;
            List list = rz9.A0B;
            list.getClass();
            List list2 = rz9.A0C;
            C266784aL.A06(AnonymousClass7TF.A1S(list2.size(), list.size()), "Presentation time list and FrameBufferTexture time list should be the same");
            rz9.A05.getClass();
            for (int size = list.size() - 1; size >= 0; size--) {
                long A0I = Pxg.A0I(list2, DbT.A02(list2, 1) - size);
                int i = ((C369008tg) list.get(size)).A03.A00;
                C10809RyV ryV = rz9.A08;
                ryV.getClass();
                C345907uH.A02("onDrawFrame start", new Object[0]);
                C11354SOn sOn = ryV.A02;
                GLES20.glViewport(0, 0, sOn.A0C, sOn.A0A);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i);
                C361258fv A01 = ryV.A01.A01();
                A01.A04("uSTMatrix", ryV.A05);
                A01.A04("uConstMatrix", ryV.A03);
                A01.A04("uContentTransform", ryV.A04);
                A01.A01(ryV.A00);
                C345907uH.A02("drawFrame here", new Object[0]);
                GLES20.glBindTexture(3553, -1);
                GLES20.glFinish();
                rz9.A05.getClass();
                long nanos = TimeUnit.MICROSECONDS.toNanos(A0I);
                C9134RQj rQj = rz9.A09;
                rQj.getClass();
                EGLExt.eglPresentationTimeANDROID(rQj.A02, rQj.A03, nanos);
                C9134RQj rQj2 = rz9.A09;
                rQj2.getClass();
                EGL14.eglSwapBuffers(rQj2.A02, rQj2.A03);
            }
        }
        Q17 q17 = ssL.A06;
        C266784aL.A06(AnonymousClass7TF.A1W(q17.A07, AnonymousClass05K.A01), (String) null);
        q17.A05.signalEndOfInputStream();
    }

    public final MediaFormat getOutputFormat() {
        return this.A00.A06.A00;
    }

    public final Q1A AOj(long j) {
        return this.A00.A06.A01(250000);
    }
}
