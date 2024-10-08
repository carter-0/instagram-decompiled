package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7uO  reason: invalid class name and case insensitive filesystem */
public final class C345977uO {
    public static final float[] A05;
    public boolean A00;
    public boolean A01 = false;
    public C344507ry A02;
    public final Map A03 = new HashMap();
    public final C345997uQ A04;

    static {
        float[] fArr = new float[16];
        A05 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public final void A00() {
        Map map = this.A03;
        for (C361248fu A022 : map.values()) {
            A022.A02();
        }
        map.clear();
    }

    public C345977uO(C344507ry r7) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("aPosition", new C345987uP(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        arrayList.add("aPosition");
        hashMap.put("aTextureCoord", new C345987uP(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        arrayList.add("aTextureCoord");
        this.A04 = new C345997uQ(arrayList, hashMap);
        this.A02 = r7;
        boolean z = false;
        Object obj = r7.A00.get(C344507ry.A06);
        this.A00 = ((Boolean) (obj != null ? obj : z)).booleanValue();
    }

    public final void A01(C345557ti r19, C346337v0 r20, C361238ft r21, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        float f;
        short s;
        C345907uH.A02("GlCoreCopyRenderer::renderFrame:err1 Already in error state entering renderAfterBind", new Object[0]);
        if (z3 || z4 || z5) {
            GLES20.glBlendFunc(1, 771);
            GLES20.glBlendEquation(32774);
            GLES20.glEnable(3042);
        } else {
            GLES20.glDisable(3042);
        }
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        C345907uH.A02("GlCoreCopyRenderer::renderFrame:err4", new Object[0]);
        int i5 = i3;
        int i6 = i4;
        GLES20.glViewport(0, 0, i5, i6);
        C345907uH.A02("GlCoreCopyRenderer::renderFrame:err4b glViewport", new Object[0]);
        if (z || z3 || z4) {
            float f2 = 1.0f;
            if (z4) {
                f2 = 0.0f;
            }
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, f2);
            C345907uH.A02("GlCoreCopyRenderer::renderFrame:err5a glClearColor", new Object[0]);
            GLES20.glClear(16640);
            C345907uH.A02("GlCoreCopyRenderer::renderFrame:err5b glClear", new Object[0]);
        }
        C346337v0 r3 = r20;
        if (z2) {
            boolean z6 = false;
            if (r3.A01 == 36197) {
                z6 = true;
            }
            int i7 = i;
            int i8 = z6 ? 1 : 0;
            int i9 = i2;
            Map map = this.A03;
            Integer valueOf = Integer.valueOf(i8 + (i * 2) + (i2 * 100));
            C361248fu r8 = (C361248fu) map.get(valueOf);
            C361238ft r6 = r21;
            if (r8 == null) {
                C345557ti r12 = r19;
                if (i7 == -1) {
                    r8 = r12.A03("#version 300 es\nprecision mediump float;\nuniform mat4 uTextureTransformMatrix;\nuniform mat4 uCropTransformMatrix;\nuniform mat4 uInContentTransformMatrix;\nuniform mat4 uContentTransformMatrix;\n\nin vec4 aPosition;\nin vec4 aTextureCoord;\n\nout vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uContentTransformMatrix * uInContentTransformMatrix * aPosition;\n  vTextureCoord = (uTextureTransformMatrix * uCropTransformMatrix * aTextureCoord).xy;\n}", "#version 300 es\n\n#extension GL_OES_EGL_image_external : require\nprecision mediump float; // highp here doesn't seem to matter\n\nuniform samplerExternalOES sTexture;\n\nin vec2 vTextureCoord;\nout vec4 outColor;\n\n// Column-major matrix declarations; pre-multiply by input vectors\nconst mat3 P3_BT709 = mat3(1.22476, -0.0420633, -0.0196438, -0.224866, 1.04206, -0.00786447, 0, 0, 1.09854);\n\nhighp vec3 sRGB_EOTF_Inv(highp vec3 x) {\n    highp vec3 A = 12.92 * x;\n    highp vec3 B = 1.055 * pow(x, vec3(1.0 / 2.4)) - 0.055;\n    return mix(A, B, step(0.0031308, x));\n}\n\nhighp vec3 sRGB_EOTF(highp vec3 x) {\n    highp vec3 A = x / 12.92;\n    highp vec3 B = pow((x + 0.055) / 1.055, vec3(2.4));\n    return mix(A, B, step(0.04045, x));\n}\n\nvoid main() {\n  highp vec3 srcRGB = texture(sTexture, vTextureCoord).xyz;\n\n  // Display P3 RGB non-linear to Display P3 RGB display linear\n  highp vec3 rgb_P3_displayLinear = sRGB_EOTF(srcRGB);\n\n  // Display P3 RGB display linear -> BT.709 display linear\n  highp vec3 rgb_BT709_displayLinear = P3_BT709 * rgb_P3_displayLinear;\n\n  // Color gamut compression\n  rgb_BT709_displayLinear = clamp(rgb_BT709_displayLinear, 0., 1.);\n\n  // BT.709 display linear -> BT.709 non-linear\n  highp vec3 rgb_BT709_sRGB = sRGB_EOTF_Inv(rgb_BT709_displayLinear);\n\n  outColor = vec4(rgb_BT709_sRGB, 1.0);\n}\n", z6);
                } else if (i7 != 6) {
                    if (i7 != 7) {
                        if (z6) {
                            try {
                                if (this.A01 || i9 == 9) {
                                    r8 = r12.A02(R.raw.passthrough_300_vs, R.raw.bt709_yuv_to_rgb_sampler_fs, true);
                                }
                            } catch (Exception unused) {
                                r8 = r12.A02(R.raw.passthrough_vs, R.raw.copy_fs, z6);
                            }
                        }
                        r8 = r12.A02(R.raw.passthrough_vs, R.raw.copy_fs, z6);
                    } else if (z6) {
                        if (i9 != 3) {
                            r8 = r12.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.hdr_yuv_to_rgb_sampler_fs, true);
                        } else {
                            r8 = r12.A02(R.raw.passthrough_300_vs, R.raw.wrapping_tonemap_hlg_fs, true);
                            r8.A01().A02("alpha", 1.0f);
                        }
                    } else if (i9 == 3) {
                        r8 = r12.A02(R.raw.passthrough_300_vs, R.raw.bt2020_rgb_to_bt709, false);
                        r8.A01().A02("alpha", 1.0f);
                    } else {
                        r8 = r12.A02(R.raw.passthrough_vs, R.raw.copy_fs, false);
                    }
                } else if (i9 == 3) {
                    if (r21 != null) {
                        r8 = r12.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.wrapping_tonemap_pq_with_max_cl_uniform_fs, z6);
                    } else {
                        r8 = r12.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.wrapping_tonemap_pq_fs, z6);
                    }
                } else if (i9 == 7) {
                    r8 = r12.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.wrapping_tonemap_pq_to_hlg_fs, z6);
                } else {
                    r8 = r12.A02(R.raw.hdr_yuv_to_rgb_sampler_vs, R.raw.hdr_yuv_to_rgb_sampler_fs, z6);
                }
                map.put(valueOf, r8);
            }
            C345907uH.A02("GlCoreCopyRenderer::renderFrame:err6", new Object[0]);
            try {
                C346367v3 r0 = r3.A02;
                int i10 = r0.A01;
                int i11 = r0.A00;
                if (this.A00) {
                    String.format("input=%dx%d output=%dx%d", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i5), Integer.valueOf(i6)});
                }
                C361258fv A012 = r8.A01();
                A012.A04("uTextureTransformMatrix", fArr);
                A012.A04("uCropTransformMatrix", fArr2);
                A012.A04("uInContentTransformMatrix", fArr3);
                A012.A04("uContentTransformMatrix", fArr4);
                A012.A03("sTexture", r3);
                if (GLES20.glGetUniformLocation(A012.A00.A00, "uMaxContentLuminance") != -1) {
                    if (r21 != null) {
                        A3Q a3q = r6.A00;
                        if (a3q != null) {
                            s = a3q.A00;
                        } else {
                            s = 1000;
                        }
                        f = (float) s;
                    } else {
                        f = 1000.0f;
                    }
                    A012.A02("uMaxContentLuminance", f);
                }
                A012.A01(this.A04);
            } catch (C345117sx e) {
                C345117sx r02 = new C345117sx(e.A00, 002.A0R("GlCoreCopyRenderer", e.getMessage()));
                r02.initCause(e);
                throw r02;
            }
        }
        C345907uH.A02("GlCoreCopyRenderer::renderFrame: textureTarget: %s textureHandle: %s", Integer.valueOf(r3.A01), Integer.valueOf(r3.A00));
    }
}
