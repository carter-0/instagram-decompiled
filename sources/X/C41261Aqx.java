package X;

import android.content.res.AssetManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.Matrix;
import android.os.RemoteException;
import com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import com.meta.arfx.engine.interfaces.IARExperimentUtilBinding;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import org.webrtc.EglBase10Impl;

/* renamed from: X.Aqx  reason: case insensitive filesystem */
public final class C41261Aqx implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C368618t1 A02;
    public final /* synthetic */ IARAnalyticsLoggerHost A03;
    public final /* synthetic */ IARExperimentUtilBinding A04;
    public final /* synthetic */ IARNetworkClientWorkerHost A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C41261Aqx(C368618t1 r1, IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARExperimentUtilBinding iARExperimentUtilBinding, IARNetworkClientWorkerHost iARNetworkClientWorkerHost, int i, int i2, boolean z, boolean z2) {
        this.A02 = r1;
        this.A03 = iARAnalyticsLoggerHost;
        this.A04 = iARExperimentUtilBinding;
        this.A05 = iARNetworkClientWorkerHost;
        this.A07 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = z2;
    }

    public final void run() {
        Boolean bool;
        C368568sr r4;
        C368618t1 r2 = this.A02;
        Integer num = r2.A0K;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2 && r2.A04 != null) {
            C40101ARn aRn = new C40101ARn();
            C40106ARt aRt = new C40106ARt();
            Slx slx = new Slx();
            r2.A0D = aRn;
            r2.A0E = aRt;
            r2.A0F = slx;
            r2.A0B = new ARW(r2, new C40100ARm(), aRn, aRt, slx);
            IgSandboxEffectServiceHost.Companion.A00(r2);
            r2.A0I = new C39768A8i();
            C40101ARn aRn2 = r2.A0D;
            if (aRn2 != null) {
                aRn2.A00 = this.A03;
            }
            C40106ARt aRt2 = r2.A0E;
            if (aRt2 != null) {
                aRt2.A00 = this.A04;
                aRt2.A01.clear();
            }
            Slx slx2 = r2.A0F;
            if (slx2 != null) {
                slx2.A00 = this.A05;
            }
            r2.A0a = null;
            C368598sv r0 = r2.A0B;
            if (r0 != null) {
                EffectServiceHost AME = r0.AME(r2);
                boolean z = this.A07;
                int i = this.A01;
                int i2 = this.A00;
                boolean z2 = this.A06;
                AssetManager assetManager = r2.A04;
                if (assetManager != null) {
                    r2.A0C = new AREngineController(assetManager, r2.A0O, r2.A0P, AME.getEnginePluginConfigProvider());
                    try {
                        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                        r2.A07 = eglGetDisplay;
                        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                            int[] iArr = new int[2];
                            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                                if (EGL14.eglChooseConfig(r2.A07, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12327, 12344, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                    EGLContext eglCreateContext = EGL14.eglCreateContext(r2.A07, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                                    r2.A06 = eglCreateContext;
                                    if (eglCreateContext == null || EGL14.eglGetError() != 12288) {
                                        throw AnonymousClass7TE.A15(Pxd.A00(252));
                                    }
                                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r2.A07, eGLConfigArr[0], r2.A0A, new int[]{12344}, 0);
                                    r2.A08 = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface == null || EGL14.eglGetError() != 12288) {
                                        throw AnonymousClass7TE.A15(Pxd.A00(41));
                                    }
                                    EGLDisplay eGLDisplay = r2.A07;
                                    EGLSurface eGLSurface = r2.A08;
                                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, r2.A06);
                                    AREngineController aREngineController = r2.A0C;
                                    if (aREngineController != null) {
                                        aREngineController.resize(r2.A03, r2.A02);
                                    }
                                    AREngineController aREngineController2 = r2.A0C;
                                    if (aREngineController2 != null) {
                                        aREngineController2.setupServiceHost(AME);
                                    }
                                    AREngineController aREngineController3 = r2.A0C;
                                    if (aREngineController3 != null) {
                                        C368568sr[] r13 = C368568sr.A01;
                                        int length = r13.length;
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= length) {
                                                r4 = C368568sr.PROD;
                                                break;
                                            }
                                            r4 = r13[i3];
                                            if (r4.A00 == i) {
                                                break;
                                            }
                                            i3++;
                                        }
                                        bool = Boolean.valueOf(aREngineController3.renderSessionInit(z, r4, i2, (GPUTimerImpl) null, (HybridLogSink) null, z2));
                                    } else {
                                        bool = null;
                                    }
                                    if (AnonymousClass7TF.A1Y(bool, true)) {
                                        r2.A0a = AME;
                                        r2.A0K = AnonymousClass05K.A01;
                                    } else {
                                        throw new Exception("renderSessionInit failed: native");
                                    }
                                } else {
                                    throw AnonymousClass7TE.A15(Pxd.A00(282));
                                }
                            } else {
                                r2.A07 = null;
                                throw AnonymousClass7TE.A15(Pxd.A00(23));
                            }
                        } else {
                            throw AnonymousClass7TE.A15(Pxd.A00(22));
                        }
                    } catch (Exception e) {
                        Class<C368618t1> cls = C368618t1.class;
                        0KC.A05(cls, "renderSessionInit failed: ", e);
                        AREngineController aREngineController4 = r2.A0C;
                        if (aREngineController4 != null) {
                            aREngineController4.releaseGl();
                        }
                        EffectServiceHost effectServiceHost = r2.A0a;
                        if (effectServiceHost != null) {
                            effectServiceHost.destroy();
                        }
                        r2.A0a = null;
                        C368618t1.A00(r2);
                        r2.A0C = null;
                        C40101ARn aRn3 = r2.A0D;
                        if (aRn3 != null) {
                            aRn3.A00();
                        }
                        C40101ARn aRn4 = r2.A0D;
                        if (aRn4 != null) {
                            aRn4.A00 = null;
                        }
                        C40106ARt aRt3 = r2.A0E;
                        if (aRt3 != null) {
                            aRt3.A00 = null;
                            aRt3.A01.clear();
                        }
                        Slx slx3 = r2.A0F;
                        if (slx3 != null) {
                            slx3.A00 = null;
                        }
                        r2.A0K = num2;
                        try {
                            IAREngineServiceCallback iAREngineServiceCallback = r2.A0J;
                            if (iAREngineServiceCallback != null) {
                                iAREngineServiceCallback.Crr(e.getMessage());
                            }
                        } catch (RemoteException e2) {
                            0KC.A05(cls, "Callback notifyException failed: ", e2);
                            r2.stopSelf();
                        }
                    }
                } else {
                    0qQ.A0F("assetManager");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            C40101ARn aRn5 = r2.A0D;
            if (aRn5 != null) {
                aRn5.A00();
            }
            Matrix.setIdentityM(r2.A0W, 0);
            Matrix.setIdentityM(r2.A0X, 0);
            Matrix.setIdentityM(r2.A0V, 0);
        }
    }
}
