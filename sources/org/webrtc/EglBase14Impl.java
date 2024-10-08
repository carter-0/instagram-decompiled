package org.webrtc;

import X.002;
import X.C13989Tnp;
import X.C51969G9p;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;

public class EglBase14Impl implements EglBase14 {
    public static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    public static final int EGLExt_SDK_VERSION = 18;
    public static final EglConnection EGL_NO_CONNECTION = new EglConnection();
    public static final String TAG = "EglBase14Impl";
    public EglConnection eglConnection;
    public EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    public class Context implements EglBase14.Context {
        public final EGLContext egl14Context;

        public long getNativeEglContext() {
            int i = EglBase14Impl.CURRENT_SDK_VERSION;
            EGLContext eGLContext = this.egl14Context;
            if (i >= 21) {
                return eGLContext.getNativeHandle();
            }
            return (long) eGLContext.getHandle();
        }

        public EGLContext getRawContext() {
            return this.egl14Context;
        }

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }
    }

    public class EglConnection implements EglBase14.EglConnection {
        public final EGLConfig eglConfig;
        public final EGLContext eglContext;
        public final EGLDisplay eglDisplay;
        public final RefCountDelegate refCountDelegate;

        public static /* synthetic */ void lambda$new$1() {
        }

        public EGLConfig getConfig() {
            return this.eglConfig;
        }

        public EGLContext getContext() {
            return this.eglContext;
        }

        public EGLDisplay getDisplay() {
            return this.eglDisplay;
        }

        /* renamed from: lambda$new$0$org-webrtc-EglBase14Impl$EglConnection  reason: not valid java name */
        public /* synthetic */ void m33lambda$new$0$orgwebrtcEglBase14Impl$EglConnection() {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.eglDisplay);
        }

        public void release() {
            this.refCountDelegate.release();
        }

        public void retain() {
            this.refCountDelegate.retain();
        }

        public EglConnection(EGLContext eGLContext, int[] iArr) {
            EGLDisplay eglDisplay2 = EglBase14Impl.getEglDisplay();
            this.eglDisplay = eglDisplay2;
            EGLConfig eglConfig2 = EglBase14Impl.getEglConfig(eglDisplay2, iArr);
            this.eglConfig = eglConfig2;
            int openGlesVersionFromConfig = EglBase.CC.getOpenGlesVersionFromConfig(iArr);
            boolean z = Logging.loggingEnabled;
            this.eglContext = EglBase14Impl.createEglContext(eGLContext, eglDisplay2, eglConfig2, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new EglBase14Impl$EglConnection$$ExternalSyntheticLambda0(this));
        }

        public EglConnection() {
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new EglBase14Impl$EglConnection$$ExternalSyntheticLambda1());
        }
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw C13989Tnp.A0i("eglChooseConfig failed: 0x", EGL14.eglGetError());
        } else if (iArr2[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new RuntimeException("eglChooseConfig returned null");
        } else {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
    }

    public static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw C13989Tnp.A0i("Unable to initialize EGL14: 0x", EGL14.eglGetError());
        }
        throw C13989Tnp.A0i("Unable to get EGL14 display: 0x", EGL14.eglGetError());
    }

    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglConnection == EGL_NO_CONNECTION) {
            throw new RuntimeException("This object has been released");
        }
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext == null || eGLContext != EGL14.EGL_NO_CONTEXT) {
            int[] iArr = {EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, i, 12344};
            if (eGLContext == null) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            }
            synchronized (EglBase.lock) {
                eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
            }
            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                return eglCreateContext;
            }
            throw C13989Tnp.A0i("Failed to create EGL context: 0x", EGL14.eglGetError());
        }
        throw new RuntimeException("Invalid sharedContext");
    }

    private void createSurfaceInternal(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            checkIsNotReleased();
            if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
                EglConnection eglConnection2 = this.eglConnection;
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eglConnection2.getDisplay(), eglConnection2.getConfig(), obj, new int[]{12344}, 0);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    throw C13989Tnp.A0i("Failed to create window surface: 0x", EGL14.eglGetError());
                }
                return;
            }
            throw new RuntimeException("Already has an EGLSurface");
        }
        throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
    }

    public static boolean isEGL14Supported() {
        int i = CURRENT_SDK_VERSION;
        boolean z = Logging.loggingEnabled;
        if (i < 18) {
            return false;
        }
        return true;
    }

    public void detachCurrent() {
        synchronized (EglBase.lock) {
            EGLDisplay display = this.eglConnection.getDisplay();
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(display, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                throw C13989Tnp.A0i("eglDetachCurrent failed: 0x", EGL14.eglGetError());
            }
        }
    }

    public Context getEglBaseContext() {
        return new Context(this.eglConnection.getContext());
    }

    public boolean hasSurface() {
        return C51969G9p.A1a(this.eglSurface, EGL14.EGL_NO_SURFACE);
    }

    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglConnection.getDisplay(), eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public EglBase14Impl(EglConnection eglConnection2) {
        this.eglConnection = eglConnection2;
        eglConnection2.retain();
    }

    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            int i3 = i;
            int i4 = i2;
            EglConnection eglConnection2 = this.eglConnection;
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglConnection2.getDisplay(), eglConnection2.getConfig(), new int[]{12375, i, 12374, i2, 12344}, 0);
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                throw new RuntimeException(002.A0x("Failed to create pixel buffer surface with size ", "x", ": 0x", Integer.toHexString(EGL14.eglGetError()), i3, i4));
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EglConnection eglConnection2 = this.eglConnection;
                EGLDisplay display = eglConnection2.getDisplay();
                EGLSurface eGLSurface = this.eglSurface;
                if (!EGL14.eglMakeCurrent(display, eGLSurface, eGLSurface, eglConnection2.getContext())) {
                    throw C13989Tnp.A0i("eglMakeCurrent failed: 0x", EGL14.eglGetError());
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    public void release() {
        checkIsNotReleased();
        releaseSurface();
        this.eglConnection.release();
        this.eglConnection = EGL_NO_CONNECTION;
    }

    public void swapBuffers(long j) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglConnection.getDisplay(), this.eglSurface, j);
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public EglBase14Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
}
