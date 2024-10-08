package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.webrtc.RendererCommon;

/* renamed from: X.Wu1  reason: case insensitive filesystem */
public abstract class C20551Wu1 implements RendererCommon.GlDrawer {
    public static final FloatBuffer A0H;
    public static final FloatBuffer A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public float[] A04 = {0.0f, 0.0f};
    public float[] A05 = {1.0f, 1.0f};
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public V4G A0D;
    public Integer A0E;
    public final float A0F;
    public final C69728NrD A0G;

    public C20551Wu1(C69728NrD nrD, float f) {
        this.A0G = nrD;
        this.A0F = f;
    }

    public final void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        0qQ.A0B(fArr, 1);
        A00(AnonymousClass05K.A00, fArr, i2, i3, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        C13990Tnq.A0j(i4, i5, i6, i7, 36197);
    }

    public final void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        0qQ.A0B(fArr, 1);
        A00(AnonymousClass05K.A01, fArr, i2, i3, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        C13990Tnq.A0j(i4, i5, i6, i7, 3553);
    }

    public final void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        AnonymousClass7TF.A1H(iArr, fArr);
        int i7 = i5;
        int i8 = i6;
        A00(AnonymousClass05K.A0C, fArr, i, i2, i7, i8);
        for (int i9 = 0; i9 < 3; i9++) {
            GLES20.glActiveTexture(33984 + i9);
            GLES20.glBindTexture(3553, iArr[i9]);
        }
        GLES20.glViewport(i3, i4, i7, i8);
        GLES20.glDrawArrays(5, 0, 4);
        int i10 = 0;
        do {
            GLES20.glActiveTexture(i10 + 33984);
            GLES20.glBindTexture(3553, 0);
            i10++;
        } while (i10 < 3);
    }

    static {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        0qQ.A07(allocateDirect);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        0qQ.A07(asFloatBuffer);
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        A0H = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        0qQ.A07(allocateDirect2);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        0qQ.A07(asFloatBuffer2);
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        A0I = asFloatBuffer2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.V4G] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(java.lang.Integer r19, float[] r20, int r21, int r22, int r23, int r24) {
        /*
            r18 = this;
            r3 = r18
            java.lang.Integer r0 = r3.A0E
            r6 = r19
            boolean r0 = r6.equals(r0)
            r2 = 1
            r15 = 0
            if (r0 == 0) goto L_0x00cd
            X.V4G r1 = r3.A0D
            if (r1 == 0) goto L_0x001f
        L_0x0012:
            int r1 = r1.A00
            r0 = -1
            if (r1 == r0) goto L_0x01eb
            android.opengl.GLES20.glUseProgram(r1)
            java.lang.String r0 = "glUseProgram"
            X.V6L.A00(r0)
        L_0x001f:
            int r0 = r3.A01
            r1 = r20
            r9 = r21
            r8 = r22
            r6 = r23
            r5 = r24
            if (r0 != r9) goto L_0x0039
            int r0 = r3.A00
            if (r0 != r8) goto L_0x0039
            int r0 = r3.A03
            if (r0 != r6) goto L_0x0039
            int r0 = r3.A02
            if (r0 == r5) goto L_0x0099
        L_0x0039:
            r3.A01 = r9
            r3.A00 = r8
            r3.A03 = r6
            r3.A02 = r5
            float r10 = r3.A0F
            r7 = 0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            float r4 = (float) r9
            float r4 = r4 * r10
            float r0 = (float) r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00c7
            float r0 = (float) r8
            float r10 = r10 * r0
            float r0 = (float) r5
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00c7
        L_0x0056:
            int r4 = r3.A06
            r0 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glUniform1f(r4, r0)
            float[] r10 = r3.A05
            r4 = r20[r15]
            r10[r15] = r4
            r0 = 5
            r0 = r20[r0]
            float r0 = -r0
            r10[r2] = r0
            float r12 = (float) r9
            float r14 = r12 / r4
            float r11 = (float) r8
            float r13 = r11 / r0
            float r8 = (float) r6
            float r6 = (float) r5
            float r4 = r14 / r13
            float r0 = r8 / r6
            r9 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            float[] r0 = r3.A04
            if (r4 <= 0) goto L_0x00c1
            float r14 = r14 - r12
            float r14 = r14 / r9
            r0[r15] = r14
        L_0x0082:
            r0[r2] = r5
            int r4 = r3.A09
            r0 = r0[r15]
            android.opengl.GLES20.glUniform2f(r4, r0, r5)
            int r5 = r3.A0A
            r4 = r10[r15]
            r0 = r10[r2]
            android.opengl.GLES20.glUniform2f(r5, r4, r0)
            int r0 = r3.A0B
            android.opengl.GLES20.glUniform2f(r0, r8, r6)
        L_0x0099:
            int r0 = r3.A07
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            int r12 = r3.A07
            r13 = 2
            r14 = 5126(0x1406, float:7.183E-42)
            java.nio.FloatBuffer r17 = A0H
            r16 = r15
            android.opengl.GLES20.glVertexAttribPointer(r12, r13, r14, r15, r16, r17)
            int r0 = r3.A08
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            int r12 = r3.A08
            java.nio.FloatBuffer r17 = A0I
            android.opengl.GLES20.glVertexAttribPointer(r12, r13, r14, r15, r16, r17)
            int r0 = r3.A0C
            android.opengl.GLES20.glUniformMatrix4fv(r0, r2, r15, r1, r15)
            java.lang.String r0 = "Preparing shader"
            X.V6L.A00(r0)
            return
        L_0x00c1:
            r0[r15] = r7
            float r13 = r13 - r11
            float r5 = r13 / r9
            goto L_0x0082
        L_0x00c7:
            int r0 = r3.A06
            android.opengl.GLES20.glUniform1f(r0, r7)
            goto L_0x0099
        L_0x00cd:
            r3.A0E = r6
            X.V4G r4 = r3.A0D
            if (r4 == 0) goto L_0x00dd
            int r1 = r4.A00
            r0 = -1
            if (r1 == r0) goto L_0x00dd
            android.opengl.GLES20.glDeleteProgram(r1)
            r4.A00 = r0
        L_0x00dd:
            java.lang.String r7 = "#version 300 es\nout vec2 vTexCoord;\n      layout (location = 0) in  vec4 aPosition;  // Vertex coordinates, Get and pass in externally\n      layout (location = 1) in vec4 aTexCoord;   // texture of material (texture) Vertex coordinates\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = aPosition;\n  vTexCoord = (tex_mat * aTexCoord).xy;\n}\n"
            java.lang.String r5 = "#version 300 es\n          precision mediump float;    // Precision\n          in vec2 vTexCoord;       // Coordinates passed by vertex shader\n          uniform vec2 vSurfaceSize;\n          uniform bool bUpscaling;\n          uniform sampler2D yTexture;   // Input material\n          uniform sampler2D uTexture;\n          uniform sampler2D vTexture;\n          uniform vec2 scalingRatio;\n          uniform vec2 offset;\n          out vec4 fragColor;\n          void main() {\n            vec2 vTextureSize=vec2(textureSize(yTexture, 0));\n            vec3 yuv;\n            vec3 rgb;\n            if (bUpscaling) {\n              // Scale constants\n              vec4 scale = vec4(1. / vTextureSize,\n                  vTextureSize / vSurfaceSize);\n\n              vec2 adjustedFragCoord = gl_FragCoord.xy;\n              // Flip the y coords as Android starts (0,0) on bottom left\n              adjustedFragCoord.y = vSurfaceSize.y-adjustedFragCoord.y;\n\n              // Discard fragments outside the source texture   \n              if(adjustedFragCoord.x < 0.0 || adjustedFragCoord.x > vSurfaceSize.x|| \n               adjustedFragCoord.y < 0.0 || adjustedFragCoord.y > vSurfaceSize.y){\n               discard;\n              }\n              // Source position in fractions of a texel\n              vec2 src_pos = scalingRatio * adjustedFragCoord * scale.zw + offset;            \n\n              // Source bottom left texel centre\n              vec2 src_centre = floor(src_pos - .5) + .5;\n              // f is position. f.x runs left to right, y bottom to top, z right to left, w top to bottom\n              vec4 f; f.zw = 1. - (f.xy = src_pos - src_centre);\n              // Calculate weights in x and y in parallel.\n              // These polynomials are piecewise approximation of Lanczos kernel\n              vec4 l2_w0_o3 = ((1.5672 * f - 2.6445) * f + 0.0837) * f + 0.9976;\n              vec4 l2_w1_o3 = ((-0.7389 * f + 1.3652) * f - 0.6295) * f - 0.0004;\n              vec4 w1_2 = l2_w0_o3;\n              vec2 w12 = w1_2.xy + w1_2.zw;\n              vec4 wedge = l2_w1_o3.xyzw * w12.yxyx;\n              // Calculate texture read positions. tc12 uses bilinear interpolation to do 4 reads in 1.\n              vec2 tc12 = scale.xy * (src_centre + w1_2.zw / w12);\n              vec2 tc0 = scale.xy * (src_centre - 1.);\n              vec2 tc3 = scale.xy * (src_centre + 2.);\n              // Sharpening adjustment\n              float sum = wedge.x + wedge.y + wedge.z + wedge.w + w12.x * w12.y;\n\n             // For Y the value is unsigned thus the range is [0.0, 1.0]\n             wedge /= sum;\n             yuv.r =\n                texture(yTexture, vec2(tc12.x, tc0.y)).r * wedge.y +\n                texture(yTexture, vec2(tc0.x, tc12.y)).r * wedge.x +\n                texture(yTexture, tc12.xy).r * (w12.x * w12.y/sum) +\n                texture(yTexture, vec2(tc3.x, tc12.y)).r * wedge.z +\n                texture(yTexture, vec2(tc12.x, tc3.y)).r * wedge.w;\n\n              yuv.g =\n                texture(uTexture, vec2(tc12.x, tc0.y)).r * wedge.y +\n                texture(uTexture, vec2(tc0.x, tc12.y)).r * wedge.x +\n                texture(uTexture, tc12.xy).r * (w12.x * w12.y/sum) +\n                texture(uTexture, vec2(tc3.x, tc12.y)).r * wedge.z +\n                texture(uTexture, vec2(tc12.x, tc3.y)).r * wedge.w -0.5;\n\n              yuv.b =\n                texture(vTexture, vec2(tc12.x, tc0.y)).r * wedge.y +\n                texture(vTexture, vec2(tc0.x, tc12.y)).r * wedge.x +\n                texture(vTexture, tc12.xy).r * (w12.x * w12.y/sum) +\n                texture(vTexture, vec2(tc3.x, tc12.y)).r * wedge.z +\n                texture(vTexture, vec2(tc12.x, tc3.y)).r * wedge.w -0.5;\n            } else {\n              // fall back to original gl rendering approach\n              yuv.r = texture(yTexture, vTexCoord).r;       // Y component\n              yuv.g = texture(uTexture, vTexCoord).r - 0.5; // U component\n              yuv.b = texture(vTexture, vTexCoord).r - 0.5; // V component\n            }\n            yuv.r = yuv.r - 0.0625;\n            // YUV to RGB conversion (BT709 limited range) - https://fburl.com/code/5qnfs7l7\n            rgb = mat3(1.164, 1.164, 1.164,\n                       0.0, -0.213, 2.112,\n                       1.793, -0.533, 0.0) * yuv;\n\n            fragColor = vec4(rgb, 1.0);\n          }\n        "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r6 != r1) goto L_0x00f4
            java.lang.String r0 = "#version 300 es\n"
            r8.append(r0)
            java.lang.String r0 = "#extension GL_OES_EGL_image_external_essl3 : require\n"
            r8.append(r0)
        L_0x00f4:
            java.lang.String r0 = "precision mediump float;\n"
            r8.append(r0)
            java.lang.String r0 = "in vec2 vTexCoord;\n"
            r8.append(r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            if (r6 == r4) goto L_0x0122
            if (r6 != r1) goto L_0x01e7
            java.lang.String r1 = "samplerExternalOES"
        L_0x0106:
            java.lang.String r0 = "uniform "
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = " tex;\n"
            r8.append(r0)
            java.lang.String r1 = "sampleFunc("
            java.lang.String r0 = "texture(tex, "
            java.lang.String r0 = X.00p.A0g(r5, r1, r0, r15)
            java.lang.String r5 = X.AnonymousClass7TF.A0l(r0, r8)
            X.0qQ.A07(r5)
        L_0x0122:
            X.V4G r1 = new X.V4G
            r1.<init>()
            r0 = 35633(0x8b31, float:4.9932E-41)
            int r9 = X.V6K.A00(r0, r7)
            r0 = 35632(0x8b30, float:4.9931E-41)
            int r8 = X.V6K.A00(r0, r5)
            int r0 = android.opengl.GLES20.glCreateProgram()
            r1.A00 = r0
            if (r0 == 0) goto L_0x0230
            android.opengl.GLES20.glAttachShader(r0, r9)
            int r0 = r1.A00
            android.opengl.GLES20.glAttachShader(r0, r8)
            int r0 = r1.A00
            android.opengl.GLES20.glLinkProgram(r0)
            int[] r7 = new int[]{r15}
            int r5 = r1.A00
            r0 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r5, r0, r7, r15)
            r0 = r7[r15]
            if (r0 != r2) goto L_0x0219
            android.opengl.GLES20.glDeleteShader(r9)
            android.opengl.GLES20.glDeleteShader(r8)
            java.lang.String r0 = "Creating GlShader"
            X.V6L.A00(r0)
            r3.A0D = r1
            int r0 = r1.A00
            r5 = -1
            if (r0 == r5) goto L_0x0211
            android.opengl.GLES20.glUseProgram(r0)
            java.lang.String r0 = "glUseProgram"
            X.V6L.A00(r0)
            if (r6 != r4) goto L_0x01dd
            java.lang.String r0 = "yTexture"
            int r0 = r1.A00(r0)
            android.opengl.GLES20.glUniform1i(r0, r15)
            java.lang.String r0 = "uTexture"
            int r0 = r1.A00(r0)
            android.opengl.GLES20.glUniform1i(r0, r2)
            java.lang.String r0 = "vTexture"
            int r4 = r1.A00(r0)
            r0 = 2
            android.opengl.GLES20.glUniform1i(r4, r0)
            java.lang.String r4 = "aPosition"
            int r0 = r1.A00
            if (r0 == r5) goto L_0x0209
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r4)
            if (r0 < 0) goto L_0x0202
            r3.A07 = r0
            java.lang.String r4 = "aTexCoord"
            int r0 = r1.A00
            if (r0 == r5) goto L_0x01fa
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r4)
            if (r0 < 0) goto L_0x01f3
            r3.A08 = r0
            java.lang.String r0 = "vSurfaceSize"
            int r0 = r1.A00(r0)
            r3.A0B = r0
            java.lang.String r0 = "bUpscaling"
            int r0 = r1.A00(r0)
            r3.A06 = r0
            java.lang.String r0 = "offset"
            int r0 = r1.A00(r0)
            r3.A09 = r0
            java.lang.String r0 = "scalingRatio"
            int r0 = r1.A00(r0)
            r3.A0A = r0
        L_0x01ce:
            java.lang.String r0 = "tex_mat"
            int r0 = r1.A00(r0)
            r3.A0C = r0
            java.lang.String r0 = "Creating shader"
            X.V6L.A00(r0)
            goto L_0x0012
        L_0x01dd:
            java.lang.String r0 = "tex"
            int r0 = r1.A00(r0)
            android.opengl.GLES20.glUniform1i(r0, r15)
            goto L_0x01ce
        L_0x01e7:
            java.lang.String r1 = "sampler2D"
            goto L_0x0106
        L_0x01eb:
            java.lang.String r1 = "The program has been released"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01f3:
            java.lang.String r0 = "Could not locate '"
            java.lang.RuntimeException r0 = X.C13989Tnp.A0l(r0, r4)
            throw r0
        L_0x01fa:
            java.lang.String r1 = "The program has been released"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0202:
            java.lang.String r0 = "Could not locate '"
            java.lang.RuntimeException r0 = X.C13989Tnp.A0l(r0, r4)
            throw r0
        L_0x0209:
            java.lang.String r1 = "The program has been released"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0211:
            java.lang.String r1 = "The program has been released"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0219:
            int r0 = r1.A00
            java.lang.String r3 = android.opengl.GLES20.glGetProgramInfoLog(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            java.lang.String r1 = "GlShaderES30"
            java.lang.String r0 = "Could not link program: %s"
            X.0KC.A0O(r1, r0, r2)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        L_0x0230:
            java.lang.String r1 = "glCreateProgram() failed. GLES30 error: "
            int r0 = android.opengl.GLES20.glGetError()
            java.lang.RuntimeException r0 = X.C13989Tnp.A0k(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20551Wu1.A00(java.lang.Integer, float[], int, int, int, int):void");
    }

    public final void release() {
        V4G v4g = this.A0D;
        if (v4g != null) {
            int i = v4g.A00;
            if (i != -1) {
                GLES20.glDeleteProgram(i);
                v4g.A00 = -1;
            }
            this.A0D = null;
            this.A0E = null;
        }
    }
}
