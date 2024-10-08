package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;

/* renamed from: X.ARk  reason: case insensitive filesystem */
public final class C40098ARk implements C365408n3 {
    public C369008tg A00;
    public C345937uK A01;
    public C346337v0 A02;
    public C368938tZ A03;
    public int A04;
    public final AnonymousClass8n4 A05 = new AnonymousClass8n4();
    public final AnonymousClass8n4 A06 = new AnonymousClass8n4();
    public final C345557ti A07;
    public final float[] A08;
    public final C365378n0 A09;
    public final C365388n1 A0A;
    public final C365468nA A0B;
    public final Object A0C = new Object();
    public volatile Handler A0D;
    public volatile Surface A0E;
    public volatile Surface A0F;
    public volatile C365368mz A0G = new C365368mz(0, 0, 0, 0, 0, 0);
    public volatile C365438n7 A0H;
    public volatile AXQ A0I = null;
    public volatile boolean A0J;

    public C40098ARk(Context context, C365378n0 r13, C365388n1 r14, C365468nA r15) {
        float[] fArr = new float[16];
        this.A08 = fArr;
        this.A0A = r14;
        this.A09 = r13;
        this.A0B = r15;
        this.A07 = new C345557ti(context.getResources());
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public final void A00(AXQ axq) {
        synchronized (this.A0C) {
            if (this.A0I != axq) {
                if (axq == null) {
                    this.A0I = null;
                } else {
                    this.A0I = null;
                    Handler handler = this.A0D;
                    if (handler != null) {
                        handler.post(new C40941Aln(this, axq));
                    } else {
                        this.A0I = axq;
                    }
                }
            }
        }
    }

    public final C365388n1 AoM() {
        return this.A0A;
    }

    public final int Ap3() {
        return this.A0G.A00;
    }

    public final AnonymousClass8n4 B81() {
        int i;
        AnonymousClass8n4 r1;
        int i2;
        C345937uK r3;
        this.A02.getClass();
        0fg.A01("getFrame", 1808078228);
        try {
            AXQ axq = this.A0I;
            if (axq == null) {
                r1 = this.A06;
                i2 = -710820308;
            } else {
                0fg.A01("copyFrame", -1860196744);
                this.A02.getClass();
                if (this.A0F == null) {
                    C369008tg r0 = this.A00;
                    if (r0 != null) {
                        r0.A01();
                        this.A00 = null;
                    }
                } else if (Beq() != 0 && !this.A0J) {
                    if (this.A03 == null) {
                        C368938tZ r12 = new C368938tZ(true);
                        this.A03 = r12;
                        r12.A00 = this.A07;
                    }
                    int i3 = this.A0G.A02;
                    int i4 = this.A0G.A01;
                    C369008tg r13 = this.A00;
                    if (r13 != null) {
                        if (!(r13.A02 == i3 && r13.A01 == i4)) {
                            r13.A01();
                            this.A00 = null;
                        }
                        GLES20.glBindFramebuffer(36160, r13.A00);
                        C369008tg r02 = this.A00;
                        GLES20.glViewport(0, 0, r02.A02, r02.A01);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                        GLES20.glClear(16640);
                        AnonymousClass8n4 r14 = this.A05;
                        r14.A06(this, this.A02);
                        this.A03.DAo(r14, 0);
                        GLES20.glBindFramebuffer(36160, 0);
                        this.A06.A01(this.A00.A03, (float[]) null, r14.A00);
                    }
                    r13 = new C369008tg(i3, i4);
                    this.A00 = r13;
                    GLES20.glBindFramebuffer(36160, r13.A00);
                    C369008tg r022 = this.A00;
                    GLES20.glViewport(0, 0, r022.A02, r022.A01);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                    GLES20.glClear(16640);
                    AnonymousClass8n4 r142 = this.A05;
                    r142.A06(this, this.A02);
                    this.A03.DAo(r142, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                    this.A06.A01(this.A00.A03, (float[]) null, r142.A00);
                }
                0fg.A00(-1225627957);
                synchronized (axq.A06) {
                    C341897nh r15 = axq.A05;
                    if (!axq.A0C || r15 == null) {
                        SurfaceTexture surfaceTexture = axq.A01;
                        if (surfaceTexture != null) {
                            surfaceTexture.updateTexImage();
                        }
                    } else {
                        r15.update();
                    }
                }
                if (axq.A01() == 0) {
                    r1 = this.A06;
                    i2 = -135253848;
                } else {
                    0fg.A01("copyPreviewFrame", -2022064914);
                    this.A02.getClass();
                    C365438n7 r4 = this.A0H;
                    if (r4 != null) {
                        Surface surface = this.A0F;
                        if (surface == null) {
                            C345937uK r03 = this.A01;
                            if (r03 != null) {
                                r03.A02();
                                this.A01 = null;
                                this.A0E = null;
                            }
                        } else {
                            if (!(surface == this.A0E || (r3 = this.A01) == null)) {
                                r3.A02();
                                this.A01 = null;
                                this.A0E = null;
                            }
                            C344557s3 Azk = r4.Azk();
                            if (Azk != null) {
                                if (this.A03 == null) {
                                    C368938tZ r42 = new C368938tZ(true);
                                    this.A03 = r42;
                                    r42.A00 = this.A07;
                                }
                                if (this.A01 == null) {
                                    this.A01 = Azk.AMY(surface);
                                    this.A0E = surface;
                                }
                                this.A01.A05();
                                GLES20.glViewport(0, 0, this.A01.A01(), this.A01.A00());
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                GLES20.glClear(16640);
                                AnonymousClass8n4 r43 = this.A05;
                                r43.A02(this.A02, this.A08, (float[]) null, (float[]) null, Beq());
                                this.A03.DAo(r43, 0);
                                this.A01.A04(r43.A00);
                                this.A01.A03();
                            }
                        }
                    }
                    0fg.A00(-1940969362);
                    this.A04 = 0;
                    i = -2002040914;
                    0fg.A00(i);
                    if (this.A0F != null && !this.A0J) {
                        return this.A06;
                    }
                    this.A0J = false;
                    AnonymousClass8n4 r16 = this.A06;
                    r16.A06(this, this.A02);
                    return r16;
                }
            }
            0fg.A00(i2);
            return r1;
        } catch (RuntimeException e) {
            try {
                int i5 = this.A04 + 1;
                this.A04 = i5;
                if (i5 < 10) {
                    i = 1044036461;
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                0fg.A00(-998966424);
                throw th;
            }
        }
    }

    public final int BHR() {
        return this.A0G.A01;
    }

    public final int BHc() {
        return this.A0G.A02;
    }

    public final String BO5() {
        return "IgCameraVideoInputV2";
    }

    public final long Beq() {
        AXQ axq = this.A0I;
        if (axq != null) {
            return axq.A01();
        }
        return 0;
    }

    public final int Bez() {
        return this.A0G.A03;
    }

    public final int BfA() {
        return this.A0G.A04;
    }

    public final C365468nA Bnc() {
        return this.A0B;
    }

    public final void C9S(float[] fArr) {
        SurfaceTexture surfaceTexture;
        AXQ axq = this.A0I;
        if (axq != null) {
            synchronized (axq.A06) {
                if (axq.A0C) {
                    surfaceTexture = axq.A00;
                } else {
                    surfaceTexture = axq.A01;
                }
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(fArr);
                } else {
                    Matrix.setIdentityM(fArr, 0);
                }
            }
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    public final boolean CKh() {
        return true;
    }

    public final void CMV(C365438n7 r5) {
        C346337v0 r0;
        C346337v0 r02;
        synchronized (this.A0C) {
            this.A0J = true;
            r5.EXB(this.A09, this);
            if (C344237rX.A00()) {
                r0 = new C381079b8("TextureVideoInput");
            } else {
                C346327uz r1 = new C346327uz("TextureVideoInput");
                r1.A03 = 36197;
                r0 = new C346337v0(r1);
            }
            this.A02 = r0;
            r0.A00(this.A0G.A02, this.A0G.A01);
            this.A0H = r5;
            AXQ axq = this.A0I;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.A0D = new Handler(myLooper);
            }
            if (axq != null) {
                if (C344237rX.A00()) {
                    r02 = ((C381079b8) this.A02).A00;
                } else {
                    r02 = this.A02;
                }
                axq.A02(r02);
            }
        }
    }

    public final boolean EFG() {
        return true;
    }

    public final boolean EFH() {
        return false;
    }

    public final void release() {
        synchronized (this.A0C) {
            C369008tg r0 = this.A00;
            if (r0 != null) {
                r0.A01();
                this.A00 = null;
            }
            C345937uK r02 = this.A01;
            if (r02 != null) {
                r02.A02();
                this.A01 = null;
                this.A0E = null;
            }
            C368938tZ r03 = this.A03;
            if (r03 != null) {
                r03.Dpb();
                this.A03 = null;
            }
            if (this.A02 != null) {
                AXQ axq = this.A0I;
                if (axq != null) {
                    AXQ.A00(axq);
                }
                this.A02.A01();
                this.A02 = null;
            }
            this.A0D = null;
        }
    }

    public final void destroy() {
        release();
        AXQ axq = this.A0I;
        if (axq != null) {
            AXQ.A00(axq);
        }
    }
}
