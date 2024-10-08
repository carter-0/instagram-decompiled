package com.instagram.filterkit.filter;

import X.0KC;
import X.0qQ;
import X.2PP;
import X.AnonymousClass7TF;
import X.AnonymousClass9S9;
import X.C13988Tno;
import X.C14261Tsj;
import X.C14266Tso;
import X.C14268Tsr;
import X.C14269Tss;
import X.C14270Tst;
import X.C14271Tsu;
import X.C14278TtB;
import X.C266624a2;
import X.C353978Kd;
import X.C365358my;
import X.Tt7;
import X.Tt8;
import X.Um1;
import X.Um2;
import X.Um3;
import X.Um4;
import X.Um6;
import X.UmA;
import X.UmB;
import X.UmC;
import X.UmH;
import X.VY1;
import X.X98;
import X.XBw;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.instagram.model.filterkit.TextureAsset;
import com.instagram.util.video.GlProgramCompiler;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Map;

@Deprecated
public class VideoFilter extends BaseFilter {
    public static final C14270Tst A0W = C14268Tsr.A00();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public C266624a2 A06 = new C14269Tss();
    public Tt7 A07;
    public C14261Tsj A08;
    public C14278TtB A09;
    public C14278TtB A0A;
    public C14278TtB A0B;
    public C14278TtB A0C;
    public C14278TtB A0D;
    public C14270Tst A0E = C14268Tsr.A00();
    public boolean A0F;
    public boolean A0G;
    public float[] A0H;
    public float[] A0I;
    public C14271Tsu A0J;
    public Um6 A0K;
    public FloatBuffer A0L;
    public boolean A0M;
    public boolean A0N;
    public final int A0O;
    public final Rect A0P = new Rect();
    public final VY1 A0Q = new Object();
    public final String A0R;
    public final List A0S;
    public final C365358my[] A0T;
    public final C353978Kd A0U;
    public final Context A0V;

    public static float[] A00(int i) {
        return new float[]{((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f, 1.0f};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r5.length != 4) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(float[] r4, float[] r5) {
        /*
            r3 = this;
            int r0 = r4.length
            r2 = 4
            if (r0 != r2) goto L_0x0008
            int r0 = r5.length
            r1 = 1
            if (r0 == r2) goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            java.lang.String r0 = " Color must contain 4 elements R, G, B, A"
            X.17k.A0H(r1, r0)
            java.lang.Object r0 = r4.clone()
            float[] r0 = (float[]) r0
            r3.A0I = r0
            java.lang.Object r0 = r5.clone()
            float[] r0 = (float[]) r0
            r3.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.filterkit.filter.VideoFilter.A05(float[], float[]):void");
    }

    public final int A01() {
        int i = this.A01;
        if (i != 0) {
            return i;
        }
        try {
            int compileProgram = GlProgramCompiler.compileProgram(this.A0R, this.A0G, false, this.A0M);
            this.A01 = compileProgram;
            this.A08 = new C14261Tsj(compileProgram);
            GLES20.glUseProgram(this.A01);
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.A01, "image"), 0);
            C14278TtB ttB = (C14278TtB) ((UmH) this.A08.A03.get("u_filterStrength"));
            this.A09 = ttB;
            if (ttB != null) {
                ttB.A00(1.0f);
            }
            this.A0J = (C14271Tsu) ((UmH) this.A08.A03.get("u_enableTransformMatrix"));
            A04(this.A0N);
            this.A0K = (Um6) ((UmH) this.A08.A03.get("u_transformMatrix"));
            A02(this.A06);
            this.A0C = (C14278TtB) ((UmH) this.A08.A03.get("u_min"));
            this.A0B = (C14278TtB) ((UmH) this.A08.A03.get("u_max"));
            this.A0D = (C14278TtB) ((UmH) this.A08.A03.get("u_width"));
            this.A0A = (C14278TtB) ((UmH) this.A08.A03.get("u_height"));
            this.A00 = GLES20.glGetAttribLocation(this.A01, "position");
            this.A04 = GLES20.glGetAttribLocation(this.A01, "transformedTextureCoordinate");
            this.A02 = GLES20.glGetAttribLocation(this.A01, "staticTextureCoordinate");
            Tt7 tt7 = this.A07;
            if (tt7 != null) {
                C14261Tsj tsj = this.A08;
                if (tt7 instanceof Tt8) {
                    Tt8 tt8 = (Tt8) tt7;
                    Map map = tsj.A03;
                    tt8.A02 = Tt7.A00("u_bottomColor", map);
                    tt8.A04 = Tt7.A00("u_topColor", map);
                    tt8.A01 = (UmA) ((UmH) map.get("u_direction"));
                    tt8.A03 = Tt7.A00("u_cropRect", map);
                    tt8.A05 = (C14266Tso) ((UmH) map.get("bitmapBackgroundSampler"));
                } else if (!(tt7 instanceof Um2)) {
                    if (tt7 instanceof Um1) {
                        Um1 um1 = (Um1) tt7;
                        Map map2 = tsj.A03;
                        um1.A0C = Tt7.A00("uInputImageSize", map2);
                        um1.A0D = Tt7.A00("uLutSize", map2);
                        um1.A07 = C13988Tno.A0M("uLutBlend", map2);
                        um1.A09 = C13988Tno.A0M("uSatBlendPow", map2);
                        um1.A0B = Tt7.A00("uInnerTint", map2);
                        um1.A0F = Tt7.A00("uOuterTint", map2);
                        um1.A06 = C13988Tno.A0M("uInnerRadius", map2);
                        um1.A08 = C13988Tno.A0M("uOuterRadius", map2);
                        um1.A05 = C13988Tno.A0M("uHighPass", map2);
                        um1.A0E = Tt7.A00("uNoiseFreqAmp", map2);
                        um1.A0G = Tt7.A00("uRadialChromaticAberration", map2);
                        um1.A0A = C13988Tno.A0M("uTime", map2);
                        if (!(um1.A0C == null || um1.A0D == null || um1.A07 == null || um1.A09 == null || um1.A0B == null || um1.A0F == null || um1.A06 == null || um1.A08 == null || um1.A05 == null)) {
                        }
                    } else if (tt7 instanceof Um3) {
                        Um3 um3 = (Um3) tt7;
                        Map map3 = tsj.A03;
                        um3.A0F = (C14266Tso) ((UmH) map3.get("sSmallBuffA"));
                        um3.A0C = (UmC) ((UmH) map3.get("uPassIndex"));
                        um3.A0E = (C14266Tso) ((UmH) map3.get("lookup"));
                        um3.A08 = (UmA) ((UmH) map3.get("uInputImageSize"));
                        um3.A0D = (UmC) ((UmH) map3.get("uUseLut"));
                        um3.A00 = C13988Tno.A0M("uLutAlpha", map3);
                        um3.A04 = C13988Tno.A0M("uSmoothingAlpha", map3);
                        um3.A05 = C13988Tno.A0M("uSmoothingIntensity", map3);
                        um3.A09 = (UmB) ((UmH) map3.get("uColorIntensity"));
                        um3.A03 = C13988Tno.A0M("uSharpeningIntensity", map3);
                        um3.A01 = C13988Tno.A0M("uPhotoScreen", map3);
                        um3.A02 = C13988Tno.A0M("uSCurve", map3);
                        um3.A0A = Tt7.A00("uVignetteInColor", map3);
                        um3.A0B = Tt7.A00("uVignetteOutColor", map3);
                        um3.A06 = C13988Tno.A0M("uVignetteInRadius", map3);
                        um3.A07 = C13988Tno.A0M("uVignetteOutRadius", map3);
                        if (!(um3.A0E == null || um3.A08 == null || um3.A0D == null || um3.A00 == null || um3.A04 == null || um3.A05 == null || um3.A09 == null || um3.A03 == null || um3.A01 == null || um3.A02 == null || um3.A0A == null)) {
                        }
                    } else {
                        Um4 um4 = (Um4) tt7;
                        0qQ.A0B(tsj, 0);
                        Map map4 = tsj.A03;
                        um4.A09 = (C14266Tso) ((UmH) map4.get("sLookup"));
                        um4.A08 = (C14266Tso) ((UmH) map4.get("blurred"));
                        um4.A07 = (UmC) ((UmH) map4.get("uPassIndex"));
                        um4.A06 = (UmA) ((UmH) map4.get("uInputImageSize"));
                        um4.A02 = C13988Tno.A0M("uSharpen", map4);
                        um4.A04 = C13988Tno.A0M("uSigmaFr", map4);
                        um4.A03 = C13988Tno.A0M("uSigmaFb", map4);
                        um4.A05 = C13988Tno.A0M("uStrength", map4);
                        um4.A01 = (C14271Tsu) ((UmH) map4.get("uHasFace"));
                        um4.A00 = (C14271Tsu) ((UmH) map4.get("uAlwaysUseStrongerLut"));
                        if (!(um4.A09 == null || um4.A07 == null || um4.A06 == null || um4.A02 == null)) {
                            C14278TtB ttB2 = um4.A04;
                        }
                    }
                }
            }
            int i2 = 0;
            while (true) {
                List list = this.A0S;
                if (i2 >= list.size()) {
                    break;
                }
                TextureAsset textureAsset = (TextureAsset) list.get(i2);
                int i3 = this.A01;
                String str = textureAsset.A00;
                str.getClass();
                int i4 = i2 + 1;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(i3, str), i4);
                C365358my[] r4 = this.A0T;
                Context context = this.A0V;
                String str2 = textureAsset.A01;
                str2.getClass();
                boolean z = textureAsset.A02;
                BitmapFactory.Options options = AnonymousClass9S9.A00;
                0qQ.A0B(context, 0);
                r4[i2] = AnonymousClass9S9.A01(context, str2, 2, z, false);
                i2 = i4;
            }
        } catch (Exception e) {
            0KC.A0O("VideoFilter", "Error initializing %s program: ", new Object[]{this.A0R, e});
        }
        return this.A01;
    }

    public void A03(X98 x98, C365358my r8, XBw xBw) {
        Tt7 tt7 = this.A07;
        if (tt7 != null) {
            tt7.A02(this.A08, x98, r8, xBw, this.A0T);
        }
    }

    public final void A04(boolean z) {
        this.A0N = z;
        C14271Tsu tsu = this.A0J;
        if (tsu != null) {
            tsu.A00(z);
        }
        if (this.A0N) {
            A02(this.A06);
        }
    }

    public final void AHH(X98 x98) {
        for (C365358my r0 : this.A0T) {
            if (r0 != null) {
                r0.cleanup();
            }
        }
        int i = this.A01;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.A01 = 0;
        }
    }

    public final void finalize() {
        for (C365358my r0 : this.A0T) {
            if (r0 != null) {
                r0.cleanup();
            }
        }
        int i = this.A01;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.A01 = 0;
        }
    }

    public final String toString() {
        return this.A0R;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.VY1, java.lang.Object] */
    public VideoFilter(Context context, Tt7 tt7, C353978Kd r6) {
        this.A0V = context;
        int i = r6.A00;
        this.A0O = i;
        this.A0R = r6.A05;
        List list = r6.A06;
        this.A0S = list;
        this.A0M = r6.A07;
        this.A0T = new C365358my[list.size()];
        this.A03 = 100;
        this.A0F = AnonymousClass7TF.A1S(i, -1);
        this.A0U = r6;
        this.A07 = tt7;
    }

    public final void A02(C266624a2 r3) {
        r3.getClass();
        this.A06 = r3;
        if (this.A0N && this.A0K != null) {
            FloatBuffer floatBuffer = this.A0L;
            if (floatBuffer == null || !2PP.A00(floatBuffer.array(), this.A06.C5o())) {
                this.A0L = FloatBuffer.wrap(this.A06.C5o());
            }
            Um6 um6 = this.A0K;
            um6.A00 = this.A0L;
            um6.A00 = true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.VY1, java.lang.Object] */
    public VideoFilter(Context context, List list) {
        this.A0V = context;
        this.A0O = -3;
        this.A0R = "ImageOverlay";
        this.A0S = list;
        this.A0T = new C365358my[list.size()];
        this.A03 = 100;
        this.A0U = null;
        this.A07 = null;
    }
}
