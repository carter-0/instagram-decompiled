package X;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.IBinder;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.meta.arfx.engine.common.AREngineService$binder$1;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.8t1  reason: invalid class name and case insensitive filesystem */
public abstract class C368618t1 extends Service {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AssetManager A04;
    public SurfaceTexture A05;
    public EGLContext A06 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A07 = EGL14.EGL_NO_DISPLAY;
    public EGLSurface A08 = EGL14.EGL_NO_SURFACE;
    public Surface A09;
    public Surface A0A;
    public C368598sv A0B;
    public AREngineController A0C;
    public C40101ARn A0D;
    public C40106ARt A0E;
    public Slx A0F;
    public VersionedSharedMemory A0G;
    public C346337v0 A0H;
    public C39768A8i A0I;
    public IAREngineServiceCallback A0J;
    public Integer A0K;
    public ByteBuffer A0L;
    public boolean A0M;
    public final SurfaceTexture.OnFrameAvailableListener A0N = new AL9(this);
    public final AndroidAsyncExecutorFactory A0O;
    public final AndroidAsyncExecutorFactory A0P;
    public final LinkedList A0Q;
    public final LinkedList A0R;
    public final BlockingQueue A0S;
    public final ExecutorService A0T;
    public final ExecutorService A0U;
    public final float[] A0V = new float[16];
    public final float[] A0W = new float[16];
    public final float[] A0X = new float[16];
    public final AREngineService$binder$1 A0Y;
    public final ScheduledExecutorService A0Z;
    public volatile EffectServiceHost A0a;

    public static final void A00(C368618t1 r3) {
        EGLDisplay eGLDisplay = r3.A07;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(r3.A07, r3.A08);
        EGL14.eglDestroyContext(r3.A07, r3.A06);
        Surface surface = r3.A0A;
        if (surface != null) {
            surface.release();
        }
        r3.A0A = null;
        Surface surface2 = r3.A09;
        if (surface2 != null) {
            surface2.release();
        }
        r3.A09 = null;
        SurfaceTexture surfaceTexture = r3.A05;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        r3.A05 = null;
        C346337v0 r0 = r3.A0H;
        if (r0 != null) {
            r0.A01();
        }
        r3.A0H = null;
        r3.A01 = 0;
        r3.A00 = 0;
        r3.A07 = EGL14.EGL_NO_DISPLAY;
        r3.A06 = EGL14.EGL_NO_CONTEXT;
        r3.A08 = EGL14.EGL_NO_SURFACE;
    }

    public final boolean onUnbind(Intent intent) {
        this.A0U.execute(new C40924AlW(this));
        return true;
    }

    public C368618t1() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        0qQ.A07(newSingleThreadExecutor);
        this.A0U = newSingleThreadExecutor;
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        0qQ.A07(newSingleThreadExecutor2);
        this.A0T = newSingleThreadExecutor2;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
        0qQ.A07(newScheduledThreadPool);
        this.A0Z = newScheduledThreadPool;
        this.A0Q = new LinkedList();
        this.A0R = new LinkedList();
        this.A0K = AnonymousClass05K.A00;
        this.A0S = new LinkedBlockingQueue();
        this.A0Y = new AREngineService$binder$1(this);
        0KC.A00(2);
        this.A0O = new AndroidAsyncExecutorFactory(newScheduledThreadPool);
        this.A0P = new AndroidAsyncExecutorFactory(newScheduledThreadPool);
        newSingleThreadExecutor.execute(Ar9.A00);
    }

    public void onCreate() {
        int A042 = AnonymousClass0fD.A04(-1706485714);
        AssetManager assets = getResources().getAssets();
        0qQ.A07(assets);
        this.A04 = assets;
        AnonymousClass0fD.A0B(1662005804, A042);
    }

    public final void onDestroy() {
        AnonymousClass0fD.A0B(-948934655, AnonymousClass0fD.A04(1107409225));
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A042 = AnonymousClass0fD.A04(-488905658);
        if (intent != null) {
            0eG.A01.A01(this, intent);
        }
        0qQ.A0B(intent, 0);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        AnonymousClass0fD.A0B(-233204559, A042);
        return onStartCommand;
    }

    public final IBinder onBind(Intent intent) {
        return this.A0Y;
    }
}
