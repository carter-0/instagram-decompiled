package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.live.livestreaming.opengl.EglCore;
import com.facebook.live.livestreaming.opengl.GLUtil;
import com.facebook.live.livestreaming.opengl.Texture2dProgram;
import com.instagram.ui.widget.textureview.CircularTextureView;
import java.nio.FloatBuffer;

/* renamed from: X.U1r  reason: case insensitive filesystem */
public final class C14692U1r extends Handler {
    public final /* synthetic */ C18518VtI A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14692U1r(Looper looper, C18518VtI vtI) {
        super(looper);
        this.A00 = vtI;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, com.facebook.live.livestreaming.opengl.Texture2dProgram] */
    public final void handleMessage(Message message) {
        String A002;
        int A003;
        FloatBuffer floatBuffer;
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            C18518VtI vtI = this.A00;
            Surface surface = (Surface) message2.obj;
            if (surface == null) {
                C18518VtI.A00(vtI);
            } else if (vtI.A04 != null) {
                GLES20.glFinish();
                vtI.A04.A00();
                vtI.A04.A01();
                EglCore eglCore = vtI.A02;
                eglCore.getClass();
                EGLDisplay eGLDisplay = eglCore.A02;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    C17974VjC vjC = new C17974VjC(surface, vtI.A02);
                    vtI.A04 = vjC;
                    vjC.A00();
                    return;
                }
                throw new RuntimeException("eglMakeCurrent failed");
            } else {
                EglCore eglCore2 = new EglCore();
                vtI.A02 = eglCore2;
                C17974VjC vjC2 = new C17974VjC(surface, eglCore2);
                vtI.A04 = vjC2;
                vjC2.A00();
                Integer num = vtI.A05;
                ? obj = new Object();
                obj.A01 = -1;
                obj.A0A = new float[9];
                obj.A0B = new float[]{1.0f, 1.0f};
                int intValue = num.intValue();
                obj.A02 = 36197;
                switch (intValue) {
                    case 1:
                        A002 = Pxd.A00(301);
                        break;
                    case 2:
                        A002 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n";
                        break;
                    case 3:
                        A002 = "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n";
                        break;
                    default:
                        A002 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform vec2 uStretchFactor;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec2 scaledCoord = vTextureCoord * uStretchFactor;\n    vec2 scaledCentre = vec2(0.5 , 0.5) * uStretchFactor;\n    float alpha = 1.0 - (smoothstep(0.5, 0.5, distance(scaledCoord, scaledCentre)));\n    gl_FragColor = vec4(texture2D(sTexture, vTextureCoord).rgb * alpha, alpha);\n}\n";
                        break;
                }
                int A004 = GLUtil.A00(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
                int i2 = 0;
                if (!(A004 == 0 || (A003 = GLUtil.A00(35632, A002)) == 0)) {
                    int glCreateProgram = GLES20.glCreateProgram();
                    GLUtil.A02("glCreateProgram");
                    if (glCreateProgram == 0) {
                        0KC.A0C("com.facebook.live.livestreaming.opengl.GLUtil", "Could not create program");
                    }
                    GLES20.glAttachShader(glCreateProgram, A004);
                    GLUtil.A02("glAttachShader");
                    GLES20.glAttachShader(glCreateProgram, A003);
                    GLUtil.A02("glAttachShader");
                    GLES20.glLinkProgram(glCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        0KC.A0C("com.facebook.live.livestreaming.opengl.GLUtil", "Could not link program: ");
                        0KC.A0C("com.facebook.live.livestreaming.opengl.GLUtil", GLES20.glGetProgramInfoLog(glCreateProgram));
                        GLES20.glDeleteProgram(glCreateProgram);
                    } else {
                        i2 = glCreateProgram;
                    }
                }
                obj.A00 = i2;
                if (i2 != 0) {
                    int glGetAttribLocation = GLES20.glGetAttribLocation(i2, "aPosition");
                    obj.A03 = glGetAttribLocation;
                    GLUtil.A01(glGetAttribLocation, "aPosition");
                    int glGetAttribLocation2 = GLES20.glGetAttribLocation(obj.A00, "aTextureCoord");
                    obj.A04 = glGetAttribLocation2;
                    GLUtil.A01(glGetAttribLocation2, "aTextureCoord");
                    int glGetUniformLocation = GLES20.glGetUniformLocation(obj.A00, "uMVPMatrix");
                    obj.A07 = glGetUniformLocation;
                    GLUtil.A01(glGetUniformLocation, "uMVPMatrix");
                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(obj.A00, "uTexMatrix");
                    obj.A08 = glGetUniformLocation2;
                    GLUtil.A01(glGetUniformLocation2, "uTexMatrix");
                    int glGetUniformLocation3 = GLES20.glGetUniformLocation(obj.A00, "uKernel");
                    obj.A06 = glGetUniformLocation3;
                    if (glGetUniformLocation3 < 0) {
                        obj.A06 = -1;
                        obj.A09 = -1;
                        obj.A05 = -1;
                    } else {
                        int glGetUniformLocation4 = GLES20.glGetUniformLocation(obj.A00, "uTexOffset");
                        obj.A09 = glGetUniformLocation4;
                        GLUtil.A01(glGetUniformLocation4, "uTexOffset");
                        int glGetUniformLocation5 = GLES20.glGetUniformLocation(obj.A00, "uColorAdjust");
                        obj.A05 = glGetUniformLocation5;
                        GLUtil.A01(glGetUniformLocation5, "uColorAdjust");
                        System.arraycopy(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0, obj.A0A, 0, 9);
                        float f = 1.0f / 256.0f;
                        float[] fArr = new float[18];
                        float f2 = -f;
                        fArr[0] = f2;
                        fArr[1] = f2;
                        fArr[2] = 0.0f;
                        fArr[3] = f2;
                        fArr[4] = f;
                        fArr[5] = f2;
                        fArr[6] = f2;
                        fArr[7] = 0.0f;
                        fArr[8] = 0.0f;
                        fArr[9] = 0.0f;
                        fArr[10] = f;
                        fArr[11] = 0.0f;
                        C13990Tnq.A1X(fArr, f2, f);
                        fArr[14] = 0.0f;
                        fArr[15] = f;
                        fArr[16] = f;
                        fArr[17] = f;
                        obj.A0C = fArr;
                    }
                    if (num == AnonymousClass05K.A0Y) {
                        int glGetUniformLocation6 = GLES20.glGetUniformLocation(obj.A00, "uStretchFactor");
                        obj.A01 = glGetUniformLocation6;
                        GLUtil.A01(glGetUniformLocation6, "uStretchFactor");
                    }
                    C17313VQs vQs = new C17313VQs(obj);
                    vtI.A03 = vQs;
                    Texture2dProgram texture2dProgram = vQs.A00;
                    int[] iArr2 = new int[1];
                    GLES20.glGenTextures(1, iArr2, 0);
                    GLUtil.A02("glGenTextures");
                    int i3 = iArr2[0];
                    GLES20.glBindTexture(texture2dProgram.A02, i3);
                    GLUtil.A02(002.A0O("glBindTexture ", i3));
                    GLES20.glTexParameterf(36197, 10241, 9728.0f);
                    C13990Tnq.A0i(36197, 9729.0f);
                    GLUtil.A02("glTexParameter");
                    vtI.A00 = i3;
                    SurfaceTexture surfaceTexture = new SurfaceTexture(i3);
                    vtI.A01 = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(new C18848W5s((Object) vtI, 3));
                    VXF vxf = vtI.A0B;
                    if (vxf != null) {
                        new Surface(vtI.A01);
                        CircularTextureView circularTextureView = vxf.A02;
                        int i4 = vxf.A00;
                        int i5 = vxf.A01;
                        circularTextureView.A05 = true;
                        TextureView.SurfaceTextureListener surfaceTextureListener = circularTextureView.A03;
                        if (surfaceTextureListener != null && circularTextureView.A01()) {
                            SurfaceTexture surfaceTexture2 = circularTextureView.getSurfaceTexture();
                            surfaceTexture2.getClass();
                            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture2, i4, i5);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new RuntimeException("Unable to create program");
            }
        } else if (i == 2) {
            C18518VtI vtI2 = this.A00;
            SurfaceTexture surfaceTexture3 = vtI2.A01;
            if (surfaceTexture3 != null) {
                surfaceTexture3.updateTexImage();
                C17974VjC vjC3 = vtI2.A04;
                vjC3.getClass();
                vjC3.A00();
                GLES20.glViewport(vtI2.A0A.left, vtI2.A0A.top, vtI2.A0A.width(), vtI2.A0A.height());
                SurfaceTexture surfaceTexture4 = vtI2.A01;
                float[] fArr2 = vtI2.A07;
                surfaceTexture4.getTransformMatrix(fArr2);
                C17313VQs vQs2 = vtI2.A03;
                vQs2.getClass();
                int i6 = vtI2.A00;
                boolean z = vtI2.A0C;
                Texture2dProgram texture2dProgram2 = vQs2.A00;
                float[] fArr3 = GLUtil.A00;
                C17913Vi4 vi4 = vQs2.A01;
                FloatBuffer floatBuffer2 = vi4.A06;
                int i7 = vi4.A01;
                int i8 = vi4.A02;
                if (z) {
                    floatBuffer = vi4.A05;
                } else {
                    floatBuffer = vi4.A04;
                }
                int i9 = vi4.A00;
                GLUtil.A02("draw start");
                GLES20.glClear(16640);
                GLES20.glUseProgram(texture2dProgram2.A00);
                GLUtil.A02("glUseProgram");
                GLES20.glActiveTexture(33984);
                int i10 = texture2dProgram2.A02;
                GLES20.glBindTexture(i10, i6);
                GLES20.glUniformMatrix4fv(texture2dProgram2.A07, 1, false, fArr3, 0);
                GLUtil.A02("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(texture2dProgram2.A08, 1, false, fArr2, 0);
                GLUtil.A02("glUniformMatrix4fv");
                int i11 = texture2dProgram2.A03;
                GLES20.glEnableVertexAttribArray(i11);
                GLUtil.A02("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(i11, 2, 5126, false, i8, floatBuffer2);
                GLUtil.A02("glVertexAttribPointer");
                int i12 = texture2dProgram2.A04;
                GLES20.glEnableVertexAttribArray(i12);
                GLUtil.A02("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(i12, 2, 5126, false, i9, floatBuffer);
                GLUtil.A02("glVertexAttribPointer");
                int i13 = texture2dProgram2.A06;
                if (i13 >= 0) {
                    GLES20.glUniform1fv(i13, 9, texture2dProgram2.A0A, 0);
                    GLES20.glUniform2fv(texture2dProgram2.A09, 9, texture2dProgram2.A0C, 0);
                    GLES20.glUniform1f(texture2dProgram2.A05, 0.0f);
                }
                int i14 = texture2dProgram2.A01;
                if (i14 >= 0) {
                    float[] fArr4 = texture2dProgram2.A0B;
                    GLES20.glUniform2f(i14, fArr4[0], fArr4[1]);
                }
                GLES20.glDrawArrays(5, 0, i7);
                GLUtil.A02("glDrawArrays");
                GLES20.glDisableVertexAttribArray(i11);
                GLES20.glDisableVertexAttribArray(i12);
                GLES20.glBindTexture(i10, 0);
                GLES20.glUseProgram(0);
                C17974VjC vjC4 = vtI2.A04;
                EglCore eglCore3 = vjC4.A01;
                EGL14.eglSwapBuffers(eglCore3.A02, vjC4.A00);
            }
        } else if (i == 3) {
            C18518VtI vtI3 = this.A00;
            C18518VtI.A00(vtI3);
            ((HandlerThread) C13988Tno.A0h(vtI3.A06)).quit();
        } else {
            throw DbW.A0a("Invalid msg what:", i);
        }
    }
}
