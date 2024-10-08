package org.webrtc;

import X.002;
import X.C13989Tnp;
import X.C51969G9p;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;

public class EglBase10Impl implements EglBase10 {
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    public static final EglConnection EGL_NO_CONNECTION = new EglConnection();
    public static final String TAG = "EglBase10Impl";
    public EglConnection eglConnection;
    public EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    public class Context implements EglBase10.Context {
        public final EGLContext eglContext;

        public long getNativeEglContext() {
            return 0;
        }

        public EGLContext getRawContext() {
            return this.eglContext;
        }

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }
    }

    public class EglConnection implements EglBase10.EglConnection {
        public final EGL10 egl;
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

        public EGL10 getEgl() {
            return this.egl;
        }

        /* renamed from: lambda$new$0$org-webrtc-EglBase10Impl$EglConnection  reason: not valid java name */
        public /* synthetic */ void m32lambda$new$0$orgwebrtcEglBase10Impl$EglConnection() {
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
            this.egl.eglTerminate(this.eglDisplay);
        }

        public void release() {
            this.refCountDelegate.release();
        }

        public void retain() {
            this.refCountDelegate.retain();
        }

        public EglConnection(EGLContext eGLContext, int[] iArr) {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eglDisplay2 = EglBase10Impl.getEglDisplay(egl10);
            this.eglDisplay = eglDisplay2;
            EGLConfig eglConfig2 = EglBase10Impl.getEglConfig(egl10, eglDisplay2, iArr);
            this.eglConfig = eglConfig2;
            int openGlesVersionFromConfig = EglBase.CC.getOpenGlesVersionFromConfig(iArr);
            boolean z = Logging.loggingEnabled;
            this.eglContext = EglBase10Impl.createEglContext(egl10, eGLContext, eglDisplay2, eglConfig2, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new EglBase10Impl$EglConnection$$ExternalSyntheticLambda1(this));
        }

        public EglConnection() {
            this.egl = (EGL10) EGLContext.getEGL();
            this.eglContext = EGL10.EGL_NO_CONTEXT;
            this.eglDisplay = EGL10.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new EglBase10Impl$EglConnection$$ExternalSyntheticLambda0());
        }
    }

    public static EGLConfig getEglConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            throw C13989Tnp.A0i("eglChooseConfig failed: 0x", egl10.eglGetError());
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

    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    public int surfaceHeight() {
        int[] iArr = new int[1];
        EglConnection eglConnection2 = this.eglConnection;
        eglConnection2.getEgl().eglQuerySurface(eglConnection2.getDisplay(), this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    public int surfaceWidth() {
        int[] iArr = new int[1];
        EglConnection eglConnection2 = this.eglConnection;
        eglConnection2.getEgl().eglQuerySurface(eglConnection2.getDisplay(), this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglConnection == EGL_NO_CONNECTION) {
            throw new RuntimeException("This object has been released");
        }
    }

    public static EGLContext createEglContext(EGL10 egl10, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext == null || eGLContext != EGL10.EGL_NO_CONTEXT) {
            int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, i, 12344};
            if (eGLContext == null) {
                eGLContext = EGL10.EGL_NO_CONTEXT;
            }
            synchronized (EglBase.lock) {
                eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
            }
            if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                return eglCreateContext;
            }
            throw C13989Tnp.A0i("Failed to create EGL context: 0x", egl10.eglGetError());
        }
        throw new RuntimeException("Invalid sharedContext");
    }

    private void createSurfaceInternal(Object obj) {
        if ((obj instanceof SurfaceHolder) || (obj instanceof SurfaceTexture)) {
            checkIsNotReleased();
            EGLSurface eGLSurface = this.eglSurface;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface == eGLSurface2) {
                EglConnection eglConnection2 = this.eglConnection;
                EGL10 egl = eglConnection2.getEgl();
                EGLSurface eglCreateWindowSurface = egl.eglCreateWindowSurface(eglConnection2.getDisplay(), eglConnection2.getConfig(), obj, new int[]{12344});
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == eGLSurface2) {
                    throw C13989Tnp.A0i("Failed to create window surface: 0x", egl.eglGetError());
                }
                return;
            }
            throw new RuntimeException("Already has an EGLSurface");
        }
        throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
    }

    public static EGLDisplay getEglDisplay(EGL10 egl10) {
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw C13989Tnp.A0i("Unable to get EGL10 display: 0x", egl10.eglGetError());
        } else if (egl10.eglInitialize(eglGetDisplay, new int[2])) {
            return eglGetDisplay;
        } else {
            throw C13989Tnp.A0i("Unable to initialize EGL10: 0x", egl10.eglGetError());
        }
    }

    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) {
            public final Surface surface;

            public void addCallback(SurfaceHolder.Callback callback) {
            }

            public Rect getSurfaceFrame() {
                return null;
            }

            public boolean isCreating() {
                return false;
            }

            public Canvas lockCanvas() {
                return null;
            }

            public Canvas lockCanvas(Rect rect) {
                return null;
            }

            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            public void setFixedSize(int i, int i2) {
            }

            public void setFormat(int i) {
            }

            public void setKeepScreenOn(boolean z) {
            }

            public void setSizeFromLayout() {
            }

            @Deprecated
            public void setType(int i) {
            }

            public void unlockCanvasAndPost(Canvas canvas) {
            }

            {
                this.surface = r2;
            }

            public Surface getSurface() {
                return this.surface;
            }
        });
    }

    public void detachCurrent() {
        synchronized (EglBase.lock) {
            EglConnection eglConnection2 = this.eglConnection;
            EGL10 egl = eglConnection2.getEgl();
            EGLDisplay display = eglConnection2.getDisplay();
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (!egl.eglMakeCurrent(display, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                throw C13989Tnp.A0i("eglDetachCurrent failed: 0x", egl.eglGetError());
            }
        }
    }

    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglConnection.getContext());
    }

    public boolean hasSurface() {
        return C51969G9p.A1a(this.eglSurface, EGL10.EGL_NO_SURFACE);
    }

    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            EglConnection eglConnection2 = this.eglConnection;
            eglConnection2.getEgl().eglDestroySurface(eglConnection2.getDisplay(), eGLSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    public EglBase10Impl(EglConnection eglConnection2) {
        this.eglConnection = eglConnection2;
        eglConnection2.retain();
    }

    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface == eGLSurface2) {
            EglConnection eglConnection2 = this.eglConnection;
            EGL10 egl = eglConnection2.getEgl();
            int i3 = i;
            int i4 = i2;
            EGLSurface eglCreatePbufferSurface = egl.eglCreatePbufferSurface(eglConnection2.getDisplay(), eglConnection2.getConfig(), new int[]{12375, i, 12374, i2, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == eGLSurface2) {
                throw new RuntimeException(002.A0x("Failed to create pixel buffer surface with size ", "x", ": 0x", Integer.toHexString(egl.eglGetError()), i3, i4));
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EglConnection eglConnection2 = this.eglConnection;
                EGL10 egl = eglConnection2.getEgl();
                EGLDisplay display = eglConnection2.getDisplay();
                EGLSurface eGLSurface = this.eglSurface;
                if (!egl.eglMakeCurrent(display, eGLSurface, eGLSurface, eglConnection2.getContext())) {
                    throw C13989Tnp.A0i("eglMakeCurrent failed: 0x", egl.eglGetError());
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
        swapBuffers();
    }

    public EglBase10Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EglConnection eglConnection2 = this.eglConnection;
                eglConnection2.getEgl().eglSwapBuffers(eglConnection2.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
}
