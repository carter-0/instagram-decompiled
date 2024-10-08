package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.android.R;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Sry  reason: case insensitive filesystem */
public final class C12352Sry implements C13861Tih {
    public int A00;
    public int A01;
    public SurfaceTexture A02;
    public C361248fu A03;
    public C346337v0 A04;
    public C7232Q0d A05;
    public C11354SOn A06;
    public C7334Q4k A07;
    public boolean A08;
    public final C345557ti A09;
    public final C368538so A0A;
    public final List A0B;
    public final float[] A0C;
    public final float[] A0D;
    public final float[] A0E;
    public final float[] A0F;
    public final EGLContext A0G;
    public final EGLDisplay A0H;
    public final EGLSurface A0I;
    public final C345997uQ A0J = S9W.A00();

    public final void A8G(MediaEffect mediaEffect, int i) {
    }

    public final void AAZ(int i) {
    }

    public final void CMP() {
        C345557ti r5;
        Object[] objArr;
        String str;
        int i;
        int i2;
        C7334Q4k q4k;
        C7334Q4k q4k2;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        C7232Q0d q0d = this.A05;
        if (q0d != null && ((i2 = q0d.A02) != 6 ? !(i2 != 7 || (q4k = this.A07) == null || !q4k.A07()) : !((q4k2 = this.A07) == null || !q4k2.A0B()))) {
            this.A00 = i2;
        }
        int i3 = this.A00;
        if (i3 == 6) {
            try {
                r5 = this.A09;
                this.A03 = r5.A01(R.raw.video_transcode_vs_color_convert, R.raw.video_transcode_fs_rgba_color_convert);
            } catch (Exception unused) {
                r5 = this.A09;
                this.A03 = r5.A01(R.raw.video_transcode_vs, R.raw.video_transcode_fs_rgba);
            }
        } else if (i3 == 7) {
            SJA sja = this.A06.A0G;
            if (sja == null || !sja.A01) {
                r5 = this.A09;
                this.A03 = r5.A01(R.raw.video_transcode_vs_color_convert, R.raw.video_transcode_fs_hlg_rgba_color_convert);
            } else {
                r5 = this.A09;
                this.A03 = r5.A01(R.raw.video_transcode_vs_yuv_raw_to_rgba, R.raw.video_transcode_fs_yuv_raw_to_rgba);
            }
        } else {
            r5 = this.A09;
            this.A03 = r5.A01(R.raw.video_transcode_vs, R.raw.video_transcode_fs_rgba);
        }
        List<C361868gx> list = this.A0B;
        if (!list.isEmpty()) {
            C346327uz A0C2 = Pxk.A0C("SimpleFrameRenderer");
            int i4 = 36197;
            if (this.A08) {
                i4 = 3553;
            }
            A0C2.A03 = i4;
            this.A04 = new C346337v0(A0C2);
            for (C361868gx r2 : list) {
                if (r2 instanceof C12300Sr1) {
                    ((C12300Sr1) r2).A00 = this.A00;
                }
                r2.DpY(r5);
                C11354SOn sOn = this.A06;
                r2.DpU(sOn.A0C, sOn.A0A);
            }
            objArr = Pxe.A1b();
            str = "video texture";
        } else {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i5 = iArr[0];
            this.A01 = i5;
            GLES20.glBindTexture(36197, i5);
            C345907uH.A02("glBindTexture mTextureID", new Object[0]);
            Pxk.A0L();
            objArr = new Object[0];
            str = "glTexParameter";
        }
        C345907uH.A02(str, objArr);
        if (!list.isEmpty()) {
            C346337v0 r22 = this.A04;
            C266784aL.A06(AnonymousClass7TF.A1V(r22), (String) null);
            i = r22.A00;
        } else {
            i = this.A01;
        }
        this.A02 = new SurfaceTexture(i);
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

    public final void FKX(C361238ft r1, int i) {
    }

    public final /* synthetic */ void cancel() {
    }

    public final void flush() {
    }

    public final void APj(int i, long j) {
        EGLDisplay eGLDisplay = this.A0H;
        EGLSurface eGLSurface = this.A0I;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
    }

    public final Bitmap EK2(int i) {
        C11354SOn sOn = this.A06;
        return AnonymousClass9UO.A00(sOn.A0C, sOn.A0A);
    }

    public final void FJk(int i, Bitmap bitmap) {
        int i2;
        C365268mo.A02(this.A0C, (float) this.A06.A07);
        if (!this.A0B.isEmpty()) {
            C346337v0 r2 = this.A04;
            C266784aL.A06(AnonymousClass7TF.A1V(r2), (String) null);
            i2 = r2.A00;
        } else {
            i2 = this.A01;
        }
        GLES20.glBindTexture(3553, i2);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }

    public final void release() {
        for (C361868gx Dpb : this.A0B) {
            Dpb.Dpb();
        }
    }

    public C12352Sry(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, C345557ti r12, C7232Q0d q0d, C11354SOn sOn, MediaComposition mediaComposition, C7334Q4k q4k) {
        float[] fArr = new float[16];
        this.A0E = fArr;
        float[] fArr2 = new float[16];
        this.A0C = fArr2;
        float[] fArr3 = new float[16];
        this.A0F = fArr3;
        float[] fArr4 = new float[16];
        this.A0D = fArr4;
        this.A0A = new C368538so();
        this.A01 = -12345;
        this.A00 = 0;
        r12.getClass();
        this.A09 = r12;
        this.A06 = sOn;
        this.A0G = eGLContext;
        this.A0H = eGLDisplay;
        this.A0I = eGLSurface;
        boolean z = sOn.A0N;
        this.A08 = z;
        if (z) {
            List list = sOn.A0J;
            if (list == null) {
                list = AnonymousClass7TE.A1C();
                sOn.A0J = list;
            }
            if (list.isEmpty()) {
                sOn.A0J.add(new C12300Sr1(false));
            }
        }
        List list2 = this.A06.A0J;
        this.A0B = list2 == null ? Collections.emptyList() : list2;
        this.A07 = q4k;
        this.A05 = q0d;
        if (q0d == null && mediaComposition != null) {
            HashMap A072 = mediaComposition.A07(C266714aE.VIDEO);
            A072.getClass();
            File file = ((C266754aI) Pxg.A0j(((C266794aM) C51971G9r.A0p(AnonymousClass7TF.A0s(A072))).A04)).A04;
            C266784aL.A05(file);
            this.A05 = SRj.A02(context, Uri.fromFile(file).toString(), false);
        }
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr3, 0);
        S9W.A01(sOn, fArr2, fArr4);
    }

    public final void AQY(long j) {
        C345907uH.A02("onDrawFrame start", Pxe.A1b());
        List<C361868gx> list = this.A0B;
        if (!list.isEmpty()) {
            C266784aL.A06(AnonymousClass7TF.A1V(this.A04), (String) null);
            SurfaceTexture surfaceTexture = this.A02;
            float[] fArr = this.A0E;
            surfaceTexture.getTransformMatrix(fArr);
            if (this.A08) {
                C365268mo.A01(fArr);
            }
            for (C361868gx DAo : list) {
                long micros = TimeUnit.NANOSECONDS.toMicros(j);
                C368538so r4 = this.A0A;
                r4.A03(this.A04, fArr, this.A0C, this.A0F, this.A0D, j);
                DAo.DAo(r4, micros);
            }
            return;
        }
        SurfaceTexture surfaceTexture2 = this.A02;
        float[] fArr2 = this.A0E;
        surfaceTexture2.getTransformMatrix(fArr2);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.A01);
        C361258fv A012 = this.A03.A01();
        A012.A04("uSTMatrix", fArr2);
        A012.A04("uConstMatrix", this.A0C);
        A012.A04("uSceneMatrix", this.A0F);
        A012.A04("uContentTransform", this.A0D);
        A012.A01(this.A0J);
        GLES20.glFinish();
    }

    public final SurfaceTexture BHZ(int i, boolean z) {
        return this.A02;
    }
}
