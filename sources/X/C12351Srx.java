package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.util.creation.ShaderBridge;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Srx  reason: case insensitive filesystem */
public final class C12351Srx implements C13861Tih {
    public SurfaceTexture A00;
    public C14273Tsw A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final EGLContext A05;
    public final EGLDisplay A06;
    public final EGLSurface A07;
    public final UserSession A08;
    public final BaseFilter A09;
    public final VideoFilter A0A;
    public final C14279TtC A0B;
    public final C59783JYc A0C;

    public final void A8G(MediaEffect mediaEffect, int i) {
    }

    public final void AAZ(int i) {
    }

    public final /* synthetic */ void DKp(int i) {
    }

    public final void DVi() {
    }

    public final void DVj() {
    }

    public final void EDZ(MediaEffect mediaEffect, int i) {
    }

    public final /* synthetic */ void EeS(B19 b19) {
    }

    public final void Ef8(Surface surface, C9608Rdm rdm, int i) {
    }

    public final void FJk(int i, Bitmap bitmap) {
    }

    public final void FKX(C361238ft r1, int i) {
    }

    public final /* synthetic */ void cancel() {
    }

    public final void flush() {
    }

    public final void APj(int i, long j) {
        EGLDisplay eGLDisplay = this.A06;
        EGLSurface eGLSurface = this.A07;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
    }

    public final void AQY(long j) {
        C14273Tsw tsw = this.A01;
        if (tsw == null) {
            0qQ.A0F("transcodeTextureRenderer");
            throw AnonymousClass00P.createAndThrow();
        }
        long micros = TimeUnit.NANOSECONDS.toMicros(j);
        tsw.A05(this.A09, this.A0A, micros);
    }

    public final SurfaceTexture BHZ(int i, boolean z) {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        0qQ.A0F("surfaceTexture");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Bitmap EK2(int i) {
        return AnonymousClass9UO.A00(this.A03, this.A02);
    }

    public final void release() {
        C14273Tsw tsw = this.A01;
        if (tsw == null) {
            0qQ.A0F("transcodeTextureRenderer");
            throw AnonymousClass00P.createAndThrow();
        } else {
            tsw.A04();
        }
    }

    public C12351Srx(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, UserSession userSession, BaseFilter baseFilter, VideoFilter videoFilter, C14279TtC ttC, C59783JYc jYc, int i, int i2) {
        this.A0A = videoFilter;
        this.A09 = baseFilter;
        this.A0B = ttC;
        this.A04 = context;
        this.A08 = userSession;
        this.A05 = eGLContext;
        this.A06 = eGLDisplay;
        this.A07 = eGLSurface;
        this.A0C = jYc;
        this.A03 = i;
        this.A02 = i2;
    }

    public final void CMP() {
        ShaderBridge.ensureShaderBridgeLoaded();
        Context context = this.A04;
        EGLContext eGLContext = this.A05;
        UserSession userSession = this.A08;
        C14273Tsw tsw = new C14273Tsw(context, eGLContext, userSession, this.A0B, this.A0C, this.A03, this.A02, false);
        this.A01 = tsw;
        this.A00 = tsw.A03(userSession, this.A09, this.A0A);
    }
}
