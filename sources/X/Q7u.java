package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.facebook.videolite.transcoder.resizer.DummySurface;
import java.util.Locale;
import org.webrtc.EglBase10Impl;

public final class Q7u extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public DummySurface A01;
    public TLA A02;
    public Error A03;
    public RuntimeException A04;

    public Q7u() {
        super("DummySurface");
    }

    public final boolean handleMessage(Message message) {
        RuntimeException runtimeException;
        EGLConfig eGLConfig;
        TLA tla;
        int i = message.what;
        if (i == 1) {
            try {
                0Sd.A00(this.A02);
                TLA tla2 = this.A02;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != null) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        tla2.A02 = eglGetDisplay;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr2 = new int[1];
                        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, TLA.A06, 0, eGLConfigArr, 0, 1, iArr2, 0);
                        if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                            runtimeException = new RuntimeException(String.format(Locale.ROOT, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[]{Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]}));
                        } else {
                            EGLContext eglCreateContext = EGL14.eglCreateContext(tla2.A02, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                            if (eglCreateContext != null) {
                                tla2.A01 = eglCreateContext;
                                EGLDisplay eGLDisplay = tla2.A02;
                                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                                if (eglCreatePbufferSurface == null) {
                                    runtimeException = new RuntimeException("eglCreatePbufferSurface failed");
                                } else if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                    tla2.A03 = eglCreatePbufferSurface;
                                    int[] iArr3 = tla2.A05;
                                    GLES20.glGenTextures(1, iArr3, 0);
                                    int i2 = 0;
                                    while (true) {
                                        int glGetError = GLES20.glGetError();
                                        if (glGetError == 0) {
                                            break;
                                        }
                                        i2 = glGetError;
                                    }
                                    if (i2 == 0) {
                                        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
                                        tla2.A00 = surfaceTexture;
                                        surfaceTexture.setOnFrameAvailableListener(tla2);
                                        SurfaceTexture surfaceTexture2 = this.A02.A00;
                                        0Sd.A00(surfaceTexture2);
                                        this.A01 = new DummySurface(surfaceTexture2, this);
                                        synchronized (this) {
                                            notify();
                                        }
                                        return true;
                                    }
                                    runtimeException = Pxg.A0k("glError ", GLU.gluErrorString(i2));
                                } else {
                                    runtimeException = new RuntimeException("eglMakeCurrent failed");
                                }
                            } else {
                                runtimeException = new RuntimeException("eglCreateContext failed");
                            }
                        }
                    } else {
                        runtimeException = new RuntimeException("eglInitialize failed");
                    }
                } else {
                    runtimeException = new RuntimeException("eglGetDisplay failed");
                }
                throw runtimeException;
            } catch (RuntimeException e) {
                this.A04 = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                this.A03 = e2;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                synchronized (this) {
                    try {
                        notify();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    throw th;
                }
            }
        } else if (i == 2) {
            try {
                0Sd.A00(this.A02);
                tla = this.A02;
                tla.A04.removeCallbacks(tla);
                SurfaceTexture surfaceTexture3 = tla.A00;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                    GLES20.glDeleteTextures(1, tla.A05, 0);
                }
                EGLDisplay eGLDisplay2 = tla.A02;
                if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay3 = tla.A02;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay3, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = tla.A03;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(tla.A02, tla.A03);
                }
                EGLContext eGLContext = tla.A01;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(tla.A02, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay4 = tla.A02;
                if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(tla.A02);
                }
                tla.A02 = null;
                tla.A01 = null;
                tla.A03 = null;
                tla.A00 = null;
            } catch (Throwable unused) {
            }
            quit();
            return true;
        }
        return true;
    }
}
