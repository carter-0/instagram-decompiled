package X;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8n2  reason: invalid class name and case insensitive filesystem */
public final class C365398n2 implements C365408n3 {
    public SurfaceTexture A00;
    public C365368mz A01;
    public C346337v0 A02;
    public CountDownLatch A03 = new CountDownLatch(1);
    public C365438n7 A04;
    public boolean A05;
    public final Object A06;
    public final Object A07 = new Object();
    public final boolean A08;
    public final boolean A09;
    public final C365378n0 A0A;
    public final C365388n1 A0B;
    public final AnonymousClass8n4 A0C = new AnonymousClass8n4();
    public final C365468nA A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public volatile boolean A0I;

    public final boolean CKh() {
        return false;
    }

    public final boolean EFG() {
        return true;
    }

    public static void A00(int i, int i2, float[] fArr, int i3) {
        float f = fArr[i];
        float abs = Math.abs(f);
        float f2 = fArr[i2];
        float f3 = 0.0f;
        if (abs > 0.0f && abs < 1.0f && i3 > 2) {
            float f4 = (float) (i3 - 2);
            float f5 = f2 * (f4 / abs);
            float f6 = (float) i3;
            if (Math.abs(f5 - 1.0f) < 0.01f) {
                fArr[i] = (f * f6) / f4;
            } else if (Math.abs((f6 - f5) - 1.0f) < 0.01f) {
                fArr[i] = (f * f6) / f4;
                f3 = (fArr[i2] * f6) / ((float) (i3 - 1));
            } else {
                return;
            }
            fArr[i2] = f3;
        }
    }

    public final SurfaceTexture A01(boolean z) {
        int i;
        SurfaceTexture surfaceTexture;
        17k.A0G(this.A09, "VideoInput hasn't set to use internal SurfaceTexture!");
        if (this.A0G) {
            return null;
        }
        if (this.A0F) {
            this.A05 = z;
            if (this.A00 == null || z) {
                synchronized (this.A07) {
                    this.A0I = false;
                    C346337v0 r0 = this.A02;
                    if (r0 != null) {
                        i = r0.A00;
                    } else {
                        i = 0;
                    }
                    surfaceTexture = new SurfaceTexture(i);
                    C365368mz r02 = this.A01;
                    surfaceTexture.setDefaultBufferSize(r02.A02, r02.A01);
                    this.A00 = surfaceTexture;
                }
                return surfaceTexture;
            }
        } else {
            this.A03.await(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
        }
        return this.A00;
    }

    public final void A02(C346337v0 r5) {
        if (this.A04 == null) {
            this.A03.await(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
        }
        if (r5 == null) {
            r5 = this.A02;
        }
        this.A02 = r5;
        C365438n7 r0 = this.A04;
        if (r0 != null) {
            r0.Crt(this);
        }
    }

    public final C365388n1 AoM() {
        return this.A0B;
    }

    public final int Ap3() {
        return this.A01.A00;
    }

    public final AnonymousClass8n4 B81() {
        SurfaceTexture surfaceTexture;
        synchronized (this.A07) {
            if (!this.A0I && (surfaceTexture = this.A00) != null && this.A08) {
                synchronized (this.A06) {
                    surfaceTexture.updateTexImage();
                }
            }
        }
        AnonymousClass8n4 r1 = this.A0C;
        r1.A06(this, this.A02);
        return r1;
    }

    public final int BHR() {
        return this.A01.A01;
    }

    public final int BHc() {
        return this.A01.A02;
    }

    public final String BO5() {
        return this.A0E;
    }

    public final long Beq() {
        return this.A0B.ANS();
    }

    public final int Bez() {
        return this.A01.A03;
    }

    public final int BfA() {
        return this.A01.A04;
    }

    public final C365468nA Bnc() {
        return this.A0D;
    }

    public final void C9S(float[] fArr) {
        if (this.A0G) {
            Matrix.setIdentityM(fArr, 0);
            C365268mo.A02(fArr, (float) (-this.A01.A05));
            C365268mo.A00(fArr);
            C365268mo.A02(fArr, 180.0f);
            return;
        }
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
            C365368mz r0 = this.A01;
            int i = r0.A02;
            int i2 = r0.A01;
            int i3 = i;
            int i4 = r0.A05 % 180;
            if (i4 != 0) {
                i3 = i2;
            }
            A00(0, 12, fArr, i3);
            if (i4 != 0) {
                i2 = i;
            }
            A00(4, 12, fArr, i2);
            A00(1, 13, fArr, i3);
            A00(5, 13, fArr, i2);
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    public final void CMV(C365438n7 r5) {
        C346337v0 r3;
        r5.EXB(this.A0A, this);
        this.A04 = r5;
        if (this.A09) {
            if (this.A0G) {
                C346327uz r1 = new C346327uz("SharedTextureVideoInputForBitmap");
                r1.A03 = 3553;
                r3 = new C346337v0(r1);
            } else {
                C346327uz r12 = new C346327uz("SharedTextureVideoInput");
                r12.A03 = 36197;
                r3 = new C346337v0(r12);
                if (this.A0F) {
                    SurfaceTexture surfaceTexture = this.A00;
                    if (surfaceTexture != null) {
                        surfaceTexture.detachFromGLContext();
                        surfaceTexture.attachToGLContext(r3.A00);
                        C365368mz r0 = this.A01;
                        surfaceTexture.setDefaultBufferSize(r0.A02, r0.A01);
                        surfaceTexture.updateTexImage();
                    }
                } else {
                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(r3.A00);
                    C365368mz r02 = this.A01;
                    surfaceTexture2.setDefaultBufferSize(r02.A02, r02.A01);
                    this.A00 = surfaceTexture2;
                }
            }
            this.A02 = r3;
            C365368mz r03 = this.A01;
            r3.A00(r03.A02, r03.A01);
        }
        this.A03.countDown();
    }

    public final boolean EFH() {
        return !this.A0H;
    }

    public final void release() {
        if (this.A09) {
            SurfaceTexture surfaceTexture = this.A00;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                if (!this.A05) {
                    surfaceTexture.release();
                }
            }
            C346337v0 r0 = this.A02;
            if (r0 != null) {
                r0.A01();
            }
            this.A03 = new CountDownLatch(1);
        }
        this.A00 = null;
        this.A02 = null;
    }

    public C365398n2(C365378n0 r3, C365368mz r4, C365388n1 r5, C365468nA r6, Object obj, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = r4;
        this.A0A = r3;
        this.A0D = r6;
        this.A0H = z2;
        this.A0E = str;
        this.A0B = r5;
        this.A09 = z;
        this.A08 = z3;
        this.A0G = z4;
        this.A06 = obj;
        this.A0F = z5;
    }

    public final void destroy() {
        release();
        this.A04 = null;
    }
}
