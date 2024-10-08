package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.FloatBuffer;

public final class QM1 extends SIX implements C13815Thi, SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public HandlerThread A01;
    public C10863RzO A02;
    public boolean A03;
    public final Object A04 = Pxe.A0p();

    public final void AQa(long j) {
        int i;
        int i2;
        int i3;
        C10863RzO rzO = this.A02;
        rzO.getClass();
        SurfaceTexture surfaceTexture = this.A00;
        surfaceTexture.getClass();
        C7242Q0o.A01("onDrawFrame start");
        float[] fArr = rzO.A0T;
        surfaceTexture.getTransformMatrix(fArr);
        GLES20.glUseProgram(rzO.A0G);
        C7242Q0o.A01("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, rzO.A0H);
        FloatBuffer floatBuffer = rzO.A0P;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(rzO.A0K, 3, 5126, false, 20, floatBuffer);
        C7242Q0o.A01("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(rzO.A0K);
        C7242Q0o.A01("glEnableVertexAttribArray maPositionHandle");
        floatBuffer.position(3);
        GLES20.glVertexAttribPointer(rzO.A0L, 2, 5126, false, 20, floatBuffer);
        C7242Q0o.A01("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(rzO.A0L);
        C7242Q0o.A01("glEnableVertexAttribArray maTextureHandle");
        GLES20.glUniformMatrix4fv(rzO.A0N, 1, false, rzO.A0S.A00);
        GLES20.glUniform1f(rzO.A09, rzO.A00);
        GLES20.glUniform1f(rzO.A0I, rzO.A07);
        GLES20.glUniform1f(rzO.A0J, rzO.A08);
        GLES20.glUniform1f(rzO.A0A, rzO.A01);
        GLES20.glUniform1f(rzO.A0B, rzO.A02);
        GLES20.glUniform2f(rzO.A0M, rzO.A06, rzO.A05);
        GLES20.glUniform2f(rzO.A0F, rzO.A03, rzO.A04);
        GLES20.glUniform1i(rzO.A0C, 0);
        if (rzO.A0Q || rzO.A0R) {
            GLES20.glEnable(3089);
            if (rzO.A0E == -1) {
                int[] iArr = new int[4];
                GLES20.glGetIntegerv(3088, iArr, 0);
                rzO.A0E = iArr[2];
                rzO.A0D = iArr[3];
            }
        }
        if (rzO.A0Q) {
            i = rzO.A0D;
            i2 = i / 4;
            i3 = rzO.A0E / 2;
        } else {
            if (rzO.A0R) {
                i = rzO.A0D;
                i2 = i / 2;
                i3 = rzO.A0E;
            }
            GLES20.glUniformMatrix4fv(rzO.A0O, 1, false, fArr, 0);
            GLES20.glDrawArrays(5, 0, 4);
            C7242Q0o.A01("glDrawArrays");
            if (rzO.A0Q || rzO.A0R) {
                GLES20.glDisable(3089);
            }
            GLES20.glFinish();
        }
        GLES20.glScissor(0, i2, i3, i / 2);
        GLES20.glUniformMatrix4fv(rzO.A0O, 1, false, fArr, 0);
        GLES20.glDrawArrays(5, 0, 4);
        C7242Q0o.A01("glDrawArrays");
        GLES20.glDisable(3089);
        GLES20.glFinish();
    }

    public final void Elt(boolean z) {
        C10863RzO rzO = this.A02;
        rzO.getClass();
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        rzO.A00 = f;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A04;
        synchronized (obj) {
            if (this.A03) {
                0wb.A03("VideoOverlayDecoderOutputSurface", "mFrameAvailable already set, frame could be dropped");
            }
            this.A03 = true;
            obj.notifyAll();
        }
    }

    public QM1() {
        int A002;
        C10863RzO rzO = new C10863RzO();
        this.A02 = rzO;
        int A003 = C7242Q0o.A00(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nuniform vec2 uInputSize;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying highp vec2 vFragCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  vFragCoord = ((aPosition.xy / (2.0, 2.0) + 0.5) * uInputSize);\n}\n");
        int i = 0;
        if (!(A003 == 0 || (A002 = C7242Q0o.A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nvarying highp vec2 vFragCoord;\nuniform highp vec2 uInputCenterPoint;   // The center point of the node's size in points\nuniform highp float uTopLeftRadius; // The corner radius in points\nuniform highp float uTopRightRadius; // The corner radius in points\nuniform highp float uBottomLeftRadius; // The corner radius in points\nuniform highp float uBottomRightRadius; // The corner radius in points\nuniform samplerExternalOES sTexture;\nuniform float alpha;\nuniform int convertYuv2Rgb;\n// @brief   Calculates the alpha of a point in a rounded rect.\n//\n// @param   point           A point in the rectangle to check. Ranges from (0,0) to (2a, 2b).\n// @param   fadeDistance    The distance over which to fade the alpha from 1.0 to 0.0.\n//\n// @return  The alpha value for a point in a rounded rect.\n//          > 0.0 if the point lies within the rounded rect\n//          0.0 if the point lies outside the rounded rect\n// Reference to the math https://benice-equation.blogspot.com/2016/10/equation-of-rounded-rectangle.html\nfloat alphaForPointInRoundedRect(highp vec2 point, highp float fadeDistance) {\n    vec2 topRightCenter = 2.0 * uInputCenterPoint - uTopRightRadius;\n    vec2 topRightDelta = point - topRightCenter;\n    float topRightFactor = mix(1.0,\n                              1.0 - smoothstep(uTopRightRadius, uTopRightRadius + fadeDistance + 1.0e-30, length(topRightDelta)),\n                              float(topRightDelta.x >= 0.0 && topRightDelta.y >= 0.0));\n\n    vec2 topLeftCenter = vec2(uTopLeftRadius, 2.0 * uInputCenterPoint.y - uTopLeftRadius);\n    vec2 topLeftDelta = point - topLeftCenter;\n    float topLeftFactor = mix(1.0,\n                             1.0 - smoothstep(uTopLeftRadius, uTopLeftRadius + fadeDistance + 1.0e-30, length(topLeftDelta)),\n                             float(topLeftDelta.x <= 0.0 && topLeftDelta.y >= 0.0));\n\n    vec2 bottomRightCenter = vec2(2.0 * uInputCenterPoint.x - uBottomRightRadius, uBottomRightRadius);\n    vec2 bottomRightDelta = point - bottomRightCenter;\n    float bottomRightFactor = mix(1.0,\n                                 1.0 - smoothstep(uBottomRightRadius, uBottomRightRadius + fadeDistance + 1.0e-30, length(bottomRightDelta)),\n                                 float(bottomRightDelta.x >= 0.0 && bottomRightDelta.y <= 0.0));\n\n    vec2 bottomLeftCenter = vec2(uBottomLeftRadius, uBottomLeftRadius);\n    vec2 bottomLeftDelta = point - bottomLeftCenter;\n    float bottomLeftFactor = mix(1.0,\n                                1.0 - smoothstep(uBottomLeftRadius, uBottomLeftRadius + fadeDistance + 1.0e-30, length(bottomLeftDelta)),\n                                float(bottomLeftDelta.x <= 0.0 && bottomLeftDelta.y <= 0.0));\n\n    return topRightFactor * topLeftFactor * bottomRightFactor * bottomLeftFactor;\n}\nvoid main() {\n  vec4 fgColor = texture2D(sTexture, vTextureCoord);\n  if (convertYuv2Rgb != 0) {    mat4 yuvMatrix = mat4(\n        1.00000, 1.00000, 1.00000, 0.00000,\n        0.00000,-0.21482, 2.12798, 0.00000,\n        1.28033,-0.38059, 0.00000, 0.00000,\n       -0.64017, 0.29771,-1.06399, 1.00000\n    );\n    fgColor = yuvMatrix * fgColor;\n  }\n  if (uTopLeftRadius > 0.0 || uTopRightRadius > 0.0 || uBottomLeftRadius > 0.0 || uBottomRightRadius > 0.0) {    highp float corner_alpha = alphaForPointInRoundedRect(vFragCoord, 0.0);\n    if (corner_alpha == 0.0) discard;\n  }  vec4 bgColor = vec4(0.0,0.0,0.0,1.0);\n  gl_FragColor = mix(bgColor, fgColor, alpha);\n}\n")) == 0)) {
            int glCreateProgram = GLES20.glCreateProgram();
            C7242Q0o.A01("glCreateProgram");
            if (glCreateProgram == 0) {
                0KC.A0C("GLProgramUtil", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, A003);
            C7242Q0o.A01("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, A002);
            C7242Q0o.A01("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                0KC.A0C("GLProgramUtil", "Could not link program: ");
                0KC.A0C("GLProgramUtil", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
        }
        rzO.A0G = i;
        if (i != 0) {
            rzO.A0K = GLES20.glGetAttribLocation(i, "aPosition");
            C7242Q0o.A01("glGetAttribLocation aPosition");
            if (rzO.A0K != -1) {
                rzO.A0L = GLES20.glGetAttribLocation(rzO.A0G, "aTextureCoord");
                C7242Q0o.A01("glGetAttribLocation aTextureCoord");
                if (rzO.A0L != -1) {
                    rzO.A0N = GLES20.glGetUniformLocation(rzO.A0G, "uMVPMatrix");
                    C7242Q0o.A01("glGetUniformLocation uMVPMatrix");
                    if (rzO.A0N != -1) {
                        rzO.A0O = GLES20.glGetUniformLocation(rzO.A0G, "uSTMatrix");
                        C7242Q0o.A01("glGetUniformLocation uSTMatrix");
                        if (rzO.A0O != -1) {
                            rzO.A0M = GLES20.glGetUniformLocation(rzO.A0G, "uInputSize");
                            C7242Q0o.A01("glGetUniformLocation uInputSize");
                            if (rzO.A0M != -1) {
                                rzO.A09 = GLES20.glGetUniformLocation(rzO.A0G, "alpha");
                                C7242Q0o.A01("glGetUniformLocation alpha");
                                if (rzO.A09 != -1) {
                                    rzO.A0F = GLES20.glGetUniformLocation(rzO.A0G, "uInputCenterPoint");
                                    C7242Q0o.A01("glGetUniformLocation uInputCenterPoint");
                                    if (rzO.A0F != -1) {
                                        rzO.A0I = GLES20.glGetUniformLocation(rzO.A0G, "uTopLeftRadius");
                                        C7242Q0o.A01("glGetUniformLocation uTopLeftRadius");
                                        if (rzO.A0I != -1) {
                                            rzO.A0J = GLES20.glGetUniformLocation(rzO.A0G, "uTopRightRadius");
                                            C7242Q0o.A01("glGetUniformLocation uTopRightRadius");
                                            if (rzO.A0J != -1) {
                                                rzO.A0A = GLES20.glGetUniformLocation(rzO.A0G, "uBottomLeftRadius");
                                                C7242Q0o.A01("glGetUniformLocation uBottomLeftRadius");
                                                if (rzO.A0A != -1) {
                                                    rzO.A0B = GLES20.glGetUniformLocation(rzO.A0G, "uBottomRightRadius");
                                                    C7242Q0o.A01("glGetUniformLocation uBottomRightRadius");
                                                    if (rzO.A0B != -1) {
                                                        rzO.A0C = GLES20.glGetUniformLocation(rzO.A0G, "convertYuv2Rgb");
                                                        C7242Q0o.A01("glGetUniformLocation convertYuv2Rgb");
                                                        if (rzO.A0C != -1) {
                                                            int[] iArr2 = new int[1];
                                                            GLES20.glGenTextures(1, iArr2, 0);
                                                            int i2 = iArr2[0];
                                                            rzO.A0H = i2;
                                                            GLES20.glBindTexture(36197, i2);
                                                            C7242Q0o.A01("glBindTexture mTextureID");
                                                            Pxk.A0L();
                                                            C7242Q0o.A01("glTexParameter");
                                                            SIX.A00("before createSurfaceTexture");
                                                            this.A00 = new SurfaceTexture(this.A02.A0H);
                                                            if (EGL14.eglGetError() != 12288) {
                                                                0wb.A03("VideoOverlayDecoderOutputSurface", "EGL Error after creating a SurfaceTexture");
                                                            }
                                                            HandlerThread A0I = Pxf.A0I("output-surface-cb-runner");
                                                            this.A01 = A0I;
                                                            A0I.start();
                                                            SurfaceTexture surfaceTexture = this.A00;
                                                            surfaceTexture.getClass();
                                                            Pxh.A16(this, surfaceTexture, this.A01);
                                                            this.A03 = new Surface(this.A00);
                                                            return;
                                                        }
                                                        throw AnonymousClass7TE.A15("Could not get attrib location for convertYuv2Rgb");
                                                    }
                                                    throw AnonymousClass7TE.A15("Could not get attrib location for uBottomRightRadius");
                                                }
                                                throw AnonymousClass7TE.A15("Could not get attrib location for uBottomLeftRadius");
                                            }
                                            throw AnonymousClass7TE.A15("Could not get attrib location for uTopRightRadius");
                                        }
                                        throw AnonymousClass7TE.A15("Could not get attrib location for uTopLeftRadius");
                                    }
                                    throw AnonymousClass7TE.A15("Could not get attrib location for uInputCenterPoint");
                                }
                                throw AnonymousClass7TE.A15("Could not get attrib location for alpha");
                            }
                            throw AnonymousClass7TE.A15("Could not get attrib location for uInputSize");
                        }
                        throw AnonymousClass7TE.A15("Could not get attrib location for uSTMatrix");
                    }
                    throw AnonymousClass7TE.A15("Could not get attrib location for uMVPMatrix");
                }
                throw AnonymousClass7TE.A15("Could not get attrib location for aTextureCoord");
            }
            throw AnonymousClass7TE.A15("Could not get attrib location for aPosition");
        }
        throw AnonymousClass7TE.A15("failed creating program");
    }

    public final void ACz() {
        long currentTimeMillis = System.currentTimeMillis() + 1000;
        Object obj = this.A04;
        synchronized (obj) {
            while (true) {
                if (this.A03) {
                    break;
                }
                try {
                    obj.wait(1000);
                    if (!this.A03 && System.currentTimeMillis() >= currentTimeMillis) {
                        break;
                    }
                } catch (InterruptedException e) {
                    throw C41845B3m.A0j(e);
                }
            }
            this.A03 = false;
        }
        SIX.A00("before updateTexImage");
        SurfaceTexture surfaceTexture = this.A00;
        surfaceTexture.getClass();
        surfaceTexture.updateTexImage();
    }

    public final void release() {
        super.release();
        C10863RzO rzO = this.A02;
        rzO.getClass();
        GLES20.glDeleteProgram(rzO.A0G);
        rzO.A0G = -1;
        rzO.A0H = 0;
        this.A02 = null;
        this.A00 = null;
        HandlerThread handlerThread = this.A01;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A01 = null;
        }
    }
}
