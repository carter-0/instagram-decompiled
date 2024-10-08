package X;

import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;

/* renamed from: X.Wgw  reason: case insensitive filesystem */
public final class C19869Wgw implements AutoCloseable {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public C19870Wgx A03;
    public boolean A04;
    public int[] A05;
    public final int A06 = 2;
    public final int A07 = 1;
    public final Handler A08;
    public final HandlerThread A09;
    public final VQS A0A = new Object();
    public final List A0B = new ArrayList();
    public final AtomicBoolean A0C = new AtomicBoolean(false);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.VQS] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object, X.V4X] */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, X.Vst] */
    public C19869Wgw(String str, int i, int i2, int i3, boolean z) {
        HandlerThread A0J = Pxf.A0J("HeifEncoderThread", -2);
        this.A09 = A0J;
        this.A08 = Pxg.A0N(A0J);
        this.A00 = 1;
        this.A02 = new MediaMuxer(str, 3);
        MediaCodecList mediaCodecList = U86.A00;
        C19870Wgx wgx = new C19870Wgx(this.A08, new C18729Vz4(this), i, i2, i3, z);
        wgx.A02.setCallback(new C14683U1i(wgx), wgx.A0N);
        wgx.A02.configure(wgx.A0M, (Surface) null, (MediaCrypto) null, 1);
        Surface createInputSurface = wgx.A02.createInputSurface();
        wgx.A03 = createInputSurface;
        boolean z2 = wgx.A0S;
        wgx.A07 = new C18577VuT(wgx, z2);
        if (z2) {
            ? obj = new Object();
            obj.A01 = EGL14.EGL_NO_DISPLAY;
            obj.A00 = EGL14.EGL_NO_CONTEXT;
            obj.A02 = EGL14.EGL_NO_SURFACE;
            obj.A04 = new EGLConfig[1];
            createInputSurface.getClass();
            obj.A03 = createInputSurface;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            obj.A01 = eglGetDisplay;
            if (!2Ob.A00(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(obj.A01, iArr, 0, iArr, 1)) {
                    int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 0, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};
                    EGLDisplay eGLDisplay = obj.A01;
                    EGLConfig[] eGLConfigArr = obj.A04;
                    if (EGL14.eglChooseConfig(eGLDisplay, iArr2, 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0)) {
                        obj.A00 = EGL14.eglCreateContext(obj.A01, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                        int eglGetError = EGL14.eglGetError();
                        if (eglGetError != 12288) {
                            throw C13989Tnp.A0j("eglCreateContext", eglGetError);
                        } else if (obj.A00 != null) {
                            obj.A02 = EGL14.eglCreateWindowSurface(obj.A01, obj.A04[0], obj.A03, new int[]{12344}, 0);
                            int eglGetError2 = EGL14.eglGetError();
                            if (eglGetError2 == 12288) {
                                EGLSurface eGLSurface = obj.A02;
                                if (eGLSurface != null) {
                                    EGL14.eglQuerySurface(obj.A01, eGLSurface, 12375, new int[1], 0);
                                    EGL14.eglQuerySurface(obj.A01, obj.A02, 12374, new int[1], 0);
                                    wgx.A06 = obj;
                                    obj.A00();
                                    FloatBuffer floatBuffer = C18491Vsm.A05;
                                    ? obj2 = new Object();
                                    obj2.A01 = 3553;
                                    int glCreateShader = GLES20.glCreateShader(35633);
                                    C18498Vst.A00(002.A0O("glCreateShader type=", 35633));
                                    if (C13990Tnq.A06(glCreateShader, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n") == 0) {
                                        C13990Tnq.A1S("Texture2dProgram", 002.A0c("Could not compile shader ", ":", 35633), glCreateShader);
                                        glCreateShader = 0;
                                    }
                                    int i4 = 0;
                                    if (glCreateShader != 0) {
                                        int glCreateShader2 = GLES20.glCreateShader(35632);
                                        C18498Vst.A00(002.A0O("glCreateShader type=", 35632));
                                        if (C13990Tnq.A06(glCreateShader2, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n") == 0) {
                                            C13990Tnq.A1S("Texture2dProgram", 002.A0c("Could not compile shader ", ":", 35632), glCreateShader2);
                                        } else if (glCreateShader2 != 0) {
                                            int glCreateProgram = GLES20.glCreateProgram();
                                            C18498Vst.A00("glCreateProgram");
                                            if (glCreateProgram == 0) {
                                                Log.e("Texture2dProgram", "Could not create program");
                                            }
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader);
                                            C18498Vst.A00("glAttachShader");
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader2);
                                            C18498Vst.A00("glAttachShader");
                                            GLES20.glLinkProgram(glCreateProgram);
                                            int[] iArr3 = new int[1];
                                            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr3, 0);
                                            if (iArr3[0] != 1) {
                                                Log.e("Texture2dProgram", "Could not link program: ");
                                                Log.e("Texture2dProgram", GLES20.glGetProgramInfoLog(glCreateProgram));
                                                GLES20.glDeleteProgram(glCreateProgram);
                                            } else {
                                                i4 = glCreateProgram;
                                            }
                                        }
                                    }
                                    obj2.A00 = i4;
                                    if (i4 != 0) {
                                        int glGetAttribLocation = GLES20.glGetAttribLocation(i4, "aPosition");
                                        obj2.A02 = glGetAttribLocation;
                                        if (glGetAttribLocation >= 0) {
                                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(obj2.A00, "aTextureCoord");
                                            obj2.A03 = glGetAttribLocation2;
                                            if (glGetAttribLocation2 >= 0) {
                                                int glGetUniformLocation = GLES20.glGetUniformLocation(obj2.A00, "uMVPMatrix");
                                                obj2.A04 = glGetUniformLocation;
                                                if (glGetUniformLocation >= 0) {
                                                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(obj2.A00, "uTexMatrix");
                                                    obj2.A05 = glGetUniformLocation2;
                                                    if (glGetUniformLocation2 >= 0) {
                                                        C18491Vsm vsm = new C18491Vsm(obj2, wgx.A0L, wgx.A0I);
                                                        wgx.A05 = vsm;
                                                        C18498Vst vst = vsm.A00;
                                                        int[] iArr4 = new int[1];
                                                        GLES20.glGenTextures(1, iArr4, 0);
                                                        C18498Vst.A00("glGenTextures");
                                                        int i5 = iArr4[0];
                                                        int i6 = vst.A01;
                                                        GLES20.glBindTexture(i6, i5);
                                                        C18498Vst.A00(002.A0O("glBindTexture ", i5));
                                                        float f = 9728.0f;
                                                        GLES20.glTexParameterf(i6, 10241, 9728.0f);
                                                        C13990Tnq.A0i(i6, i6 != 3553 ? 9729.0f : f);
                                                        C18498Vst.A00("glTexParameter");
                                                        wgx.A01 = i5;
                                                        wgx.A06.A01();
                                                    } else {
                                                        throw C13989Tnp.A0l("Unable to locate '", "uTexMatrix");
                                                    }
                                                } else {
                                                    throw C13989Tnp.A0l("Unable to locate '", "uMVPMatrix");
                                                }
                                            } else {
                                                throw C13989Tnp.A0l("Unable to locate '", "aTextureCoord");
                                            }
                                        } else {
                                            throw C13989Tnp.A0l("Unable to locate '", "aPosition");
                                        }
                                    } else {
                                        throw new RuntimeException("Unable to create program");
                                    }
                                } else {
                                    throw new RuntimeException(Pxd.A00(41));
                                }
                            } else {
                                throw C13989Tnp.A0j("eglCreateWindowSurface", eglGetError2);
                            }
                        } else {
                            throw new RuntimeException(Pxd.A00(252));
                        }
                    } else {
                        throw new RuntimeException(Pxd.A00(282));
                    }
                } else {
                    throw new RuntimeException(Pxd.A00(23));
                }
            } else {
                throw new RuntimeException(Pxd.A00(22));
            }
        } else {
            wgx.A04 = createInputSurface;
        }
        this.A03 = wgx;
    }

    public final void A00() {
        try {
            MediaMuxer mediaMuxer = this.A02;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.A02.release();
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.A02 = null;
            throw th;
        }
        this.A02 = null;
        try {
            C19870Wgx wgx = this.A03;
            if (wgx != null) {
                wgx.close();
            }
            synchronized (this) {
                this.A03 = null;
            }
            return;
        } catch (Exception unused2) {
            synchronized (this) {
                this.A03 = null;
                return;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    public final void A01() {
        Pair pair;
        if (this.A0C.get()) {
            while (true) {
                List list = this.A0B;
                synchronized (list) {
                    if (!list.isEmpty()) {
                        pair = (Pair) list.remove(0);
                    } else {
                        return;
                    }
                }
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(((Buffer) pair.second).position(), ((Buffer) pair.second).remaining(), 0, 16);
                this.A02.writeSampleData(this.A05[AnonymousClass7TE.A0M(pair.first)], (ByteBuffer) pair.second, bufferInfo);
            }
            while (true) {
            }
        }
    }

    public final void close() {
        this.A08.postAtFrontOfQueue(new C19907Whc(this));
    }
}
