package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* renamed from: X.TBd  reason: case insensitive filesystem */
public final class C12863TBd implements Runnable {
    public final /* synthetic */ C12136Sng A00;

    public C12863TBd(C12136Sng sng) {
        this.A00 = sng;
    }

    public final void run() {
        int A002;
        C12136Sng sng = this.A00;
        C11182SEi sEi = new C11182SEi();
        sng.A02 = sEi;
        EGLDisplay eGLDisplay = sEi.A01;
        EGLSurface eGLSurface = sEi.A02;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, sEi.A00);
        C11182SEi.A00("eglMakeCurrent");
        C11333SNm sNm = new C11333SNm(sng.A01, sng.A00);
        sng.A03 = sNm;
        int A003 = C11333SNm.A00("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", 35633);
        int i = 0;
        if (!(A003 == 0 || (A002 = C11333SNm.A00("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", 35632)) == 0)) {
            int glCreateProgram = GLES20.glCreateProgram();
            if (glCreateProgram == 0) {
                0KC.A02(C11333SNm.class, "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, A003);
            C11333SNm.A01("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, A002);
            C11333SNm.A01("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Class<C11333SNm> cls = C11333SNm.class;
                0KC.A02(cls, "Could not link program: ");
                0KC.A02(cls, GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
        }
        sNm.A00 = i;
        if (i == 0) {
            throw AnonymousClass7TE.A15("failed creating program");
        } else if (GLES20.glGetAttribLocation(i, "aPosition") < 0) {
            throw Pxg.A0k("Unable to locate in program: ", "aPosition");
        } else if (GLES20.glGetAttribLocation(sNm.A00, "aTextureCoord") < 0) {
            throw Pxg.A0k("Unable to locate in program: ", "aTextureCoord");
        } else if (GLES20.glGetUniformLocation(sNm.A00, "uMVPMatrix") < 0) {
            throw Pxg.A0k("Unable to locate in program: ", "uMVPMatrix");
        } else if (GLES20.glGetUniformLocation(sNm.A00, "uSTMatrix") >= 0) {
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            Integer valueOf = Integer.valueOf(iArr2[0]);
            sNm.A02 = valueOf;
            GLES20.glBindTexture(36197, JTP.A09(valueOf));
            C11333SNm.A01("glBindTexture mTextureID");
            Pxk.A0L();
            C11333SNm.A01("glTexParameter");
            SurfaceTexture surfaceTexture = new SurfaceTexture(JTP.A09(sNm.A02));
            sNm.A01 = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(sNm.A04, sNm.A03);
        } else {
            throw Pxg.A0k("Unable to locate in program: ", "uSTMatrix");
        }
    }
}
