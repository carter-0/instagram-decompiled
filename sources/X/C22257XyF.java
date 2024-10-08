package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.ARTrackableDelegate;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.CameraConfigFilter;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import com.google.ar.core.SharedCamera;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.XyF  reason: case insensitive filesystem */
public final class C22257XyF implements C341897nh {
    public SurfaceTexture A00;
    public Handler A01;
    public Y9N A02;
    public SharedCamera A03;
    public CameraDevice.StateCallback A04;
    public CameraDevice A05;
    public YA6 A06;
    public final Context A07;
    public final C21410XaJ A08;
    public final Runnable A09;
    public final Handler A0A;
    public final C21367XYw A0B;
    public final C341277mc A0C = C341267mb.A00;
    public final ARTrackableDelegate A0D = new ARTrackableDelegate();
    public final C340647lb A0E;
    public final C340667ld A0F;
    public volatile XR3 A0G;
    public volatile Session A0H;
    public volatile Integer A0I;
    public volatile Integer A0J;
    public volatile boolean A0K;
    public volatile int A0L;
    public volatile Frame A0M = null;

    public final boolean CO8() {
        return true;
    }

    public final synchronized List addArSurfaces(List list) {
        ArrayList A1D;
        this.A03.getClass();
        this.A05.getClass();
        this.A03.A0D(this.A05.getId(), list);
        A1D = AnonymousClass7TE.A1D(list);
        Iterator it = this.A03.A0B().iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) it.next();
            if (!A1D.contains(surface)) {
                A1D.add(surface);
            }
        }
        return A1D;
    }

    public final synchronized void closeSession() {
        C341237mY r0;
        CameraDevice cameraDevice;
        if (this.A0H != null) {
            this.A0K = false;
            CameraDevice.StateCallback stateCallback = this.A04;
            if (!(stateCallback == null || (cameraDevice = this.A05) == null)) {
                stateCallback.onClosed(cameraDevice);
            }
            C21368XYx xYx = new C21368XYx();
            xYx.A00.put(XYT.A00, AnonymousClass7TE.A0v());
            PlatformAlgorithmAlwaysOnDataSource AbL = this.A06.AbL();
            if (AbL != null) {
                AbL.closeSession();
            }
            WeakReference weakReference = this.A0C.A00;
            if (!(weakReference == null || (r0 = (C341237mY) weakReference.get()) == null)) {
                r0.DGp(xYx);
            }
            this.A0H.close();
            this.A0H = null;
            this.A03 = null;
            this.A05 = null;
            this.A04 = null;
        }
    }

    public final synchronized void createSession(CameraDevice cameraDevice, int i) {
        Session session;
        synchronized (this) {
            if (this.A05 != cameraDevice) {
                closeSession();
                this.A05 = cameraDevice;
                if (i == 1) {
                    session = new Session(this.A07, EnumSet.of(C21254XQz.SHARED_CAMERA, C21254XQz.FRONT_CAMERA));
                } else {
                    try {
                        session = new Session(this.A07, EnumSet.of(C21254XQz.SHARED_CAMERA));
                    } catch (C8628QyR | C8629QyS | C8630QyT | C8631QyU e) {
                        throw new RuntimeException("Creating ar session failed", e);
                    }
                }
                this.A0H = session;
                Config config = this.A0H.getConfig();
                config.A03();
                config.A02();
                config.A01();
                config.A05(this.A0I);
                config.A06(this.A0J);
                config.A00();
                Session session2 = this.A0H;
                if (session2.nativeIsDepthModeSupported(session2.nativeWrapperHandle, 1)) {
                    config.A04(this.A0G);
                } else {
                    config.A04(XR3.DISABLED);
                }
                CameraConfigFilter cameraConfigFilter = new CameraConfigFilter(this.A0H);
                cameraConfigFilter.A00(EnumSet.of(C21252XQx.TARGET_FPS_30));
                this.A0H.setCameraConfig((CameraConfig) this.A0H.getSupportedCameraConfigs(cameraConfigFilter).get(0));
                this.A0H.configure(config);
                SharedCamera sharedCamera = this.A0H.sharedCamera;
                if (sharedCamera != null) {
                    this.A03 = sharedCamera;
                    C21127XFt xFt = new C21127XFt(new C342657ox(this.A0E, this.A0F), this.A0A, sharedCamera);
                    this.A04 = xFt;
                    xFt.onOpened(cameraDevice);
                } else {
                    throw AnonymousClass7TE.A0z("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
                }
            }
        }
    }

    public final synchronized SurfaceTexture getArSurfaceTexture(int i, Y9N y9n) {
        SurfaceTexture surfaceTexture;
        Session session = this.A0H;
        SharedCamera sharedCamera = this.A03;
        if (session == null || sharedCamera == null) {
            surfaceTexture = null;
        } else {
            this.A02 = y9n;
            this.A01 = new Handler();
            session.setCameraTextureName(i);
            surfaceTexture = sharedCamera.A02.A00;
            this.A00 = surfaceTexture;
        }
        return surfaceTexture;
    }

    public final synchronized List getArSurfaces() {
        ArrayList A1C;
        this.A03.getClass();
        A1C = AnonymousClass7TE.A1C();
        Iterator it = this.A03.A0B().iterator();
        while (it.hasNext()) {
            A1C.add((Surface) it.next());
        }
        return A1C;
    }

    public final synchronized Surface getPreviewSurface(SurfaceTexture surfaceTexture) {
        this.A03.getClass();
        return (Surface) this.A03.A0B().get(0);
    }

    public final int getPreviewTemplate() {
        return 3;
    }

    public final boolean getUseArCoreIfSupported() {
        return true;
    }

    public final boolean isARCoreEnabled() {
        return true;
    }

    public final boolean isARCoreSupported() {
        return true;
    }

    public final synchronized boolean isCameraSessionActivated() {
        return this.A0K;
    }

    public final synchronized void onCameraClosed(CameraDevice cameraDevice) {
        CameraDevice.StateCallback stateCallback = this.A04;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
    }

    public final synchronized void onCameraDisconnected(CameraDevice cameraDevice) {
        CameraDevice.StateCallback stateCallback = this.A04;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
    }

    public final synchronized void onCameraError(CameraDevice cameraDevice, int i) {
        CameraDevice.StateCallback stateCallback = this.A04;
        if (stateCallback != null) {
            try {
                stateCallback.onError(cameraDevice, i);
            } catch (RuntimeException unused) {
            }
        }
    }

    public final synchronized void setCameraSessionActivated(C343297pz r4, C343187po r5) {
        if (!(this.A03 == null || this.A0H == null || this.A0K)) {
            try {
                r5.A00 = this.A0B;
                this.A0H.resume();
                this.A0K = true;
                this.A03.A0C(new AnonymousClass9XR(this, r5, r4), this.A0A);
            } catch (RKK e) {
                throw new RuntimeException("Unable to activate ar core, camera closed.", e);
            }
        }
    }

    public final void setUseArCoreIfSupported(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5 = r11.A0C;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0.get() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r6 = r4.A00();
        new com.google.ar.core.Camera(r4, r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r6 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r6 = r11.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r9 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        r0 = (android.view.WindowManager) r11.A07.getSystemService("window");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r0 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r10 = r0.getDefaultDisplay();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r10 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        if (r11.A0L == r10.getRotation()) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        if (r9[1] >= r9[0]) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        r11.A0H.setDisplayGeometry(r10.getRotation(), r9[1], r9[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r11.A0L = r10.getRotation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        r3 = new X.C21368XYx();
        r3.A00.put(X.XYT.A01, r6);
        r11.A06.run(r11.A0H, r4, r3, r11.A08);
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r0 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        r0 = (X.C341237mY) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        if (r0 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r0.DGp(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r11.A0M = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        r11.A0H.setDisplayGeometry(r10.getRotation(), r9[0], r9[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void update() {
        /*
            r11 = this;
            monitor-enter(r11)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            boolean r0 = r11.A0K     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x00a0
            com.google.ar.core.Session r0 = r11.A0H     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x00a0
            com.google.ar.core.Session r0 = r11.A0H     // Catch:{ all -> 0x00a2 }
            com.google.ar.core.Frame r4 = r0.update()     // Catch:{ all -> 0x00a2 }
            monitor-exit(r11)     // Catch:{ all -> 0x00a2 }
            X.7mc r5 = r11.A0C     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            java.lang.ref.WeakReference r0 = r5.A00     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r0.get()     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            if (r0 == 0) goto L_0x00b0
            long r6 = r4.A00()     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            com.google.ar.core.Session r1 = r4.A02     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            com.google.ar.core.Camera r0 = new com.google.ar.core.Camera     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r0.<init>(r4, r1)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b0
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.ARTrackableDelegate r6 = r11.A0D     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            monitor-enter(r6)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            int[] r9 = r6.A00     // Catch:{ all -> 0x00a5 }
            monitor-exit(r6)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            if (r9 == 0) goto L_0x006a
            android.content.Context r1 = r11.A07     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            if (r0 == 0) goto L_0x006a
            android.view.Display r10 = r0.getDefaultDisplay()     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            if (r10 == 0) goto L_0x006a
            int r1 = r11.A0L     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            int r0 = r10.getRotation()     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            if (r1 == r0) goto L_0x006a
            r8 = 1
            r1 = r9[r8]     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r7 = 0
            r0 = r9[r7]     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            if (r1 >= r0) goto L_0x0091
            com.google.ar.core.Session r3 = r11.A0H     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            int r2 = r10.getRotation()     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r1 = r9[r8]     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r0 = r9[r7]     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r3.setDisplayGeometry(r2, r1, r0)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
        L_0x0064:
            int r0 = r10.getRotation()     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r11.A0L = r0     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
        L_0x006a:
            X.XYx r3 = new X.XYx     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r3.<init>()     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            X.XUS r1 = X.XYT.A01     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            java.util.HashMap r0 = r3.A00     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r0.put(r1, r6)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            X.YA6 r2 = r11.A06     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            com.google.ar.core.Session r1 = r11.A0H     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            X.XaJ r0 = r11.A08     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r2.run(r1, r4, r3, r0)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            java.lang.ref.WeakReference r0 = r5.A00     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r0.get()     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            X.7mY r0 = (X.C341237mY) r0     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            if (r0 == 0) goto L_0x008e
            r0.DGp(r3)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
        L_0x008e:
            r11.A0M = r4     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            goto L_0x009f
        L_0x0091:
            com.google.ar.core.Session r3 = r11.A0H     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            int r2 = r10.getRotation()     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r1 = r9[r7]     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r0 = r9[r8]     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            r3.setDisplayGeometry(r2, r1, r0)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
            goto L_0x0064
        L_0x009f:
            return
        L_0x00a0:
            monitor-exit(r11)     // Catch:{ all -> 0x00a2 }
            return
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a7
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
        L_0x00a7:
            throw r0     // Catch:{ RKK | RL6 | TQc -> 0x00a8 }
        L_0x00a8:
            r2 = move-exception
            java.lang.String r1 = "ar-session"
            java.lang.String r0 = "failed to update ArCore frames"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00b0:
            return
        L_0x00b1:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22257XyF.update():void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.XFr, android.hardware.camera2.CameraCaptureSession$StateCallback] */
    public final synchronized CameraCaptureSession.StateCallback wrapSessionConfigurationCallback(CameraCaptureSession.StateCallback stateCallback) {
        ? stateCallback2;
        this.A03.getClass();
        XFs xFs = new XFs(stateCallback, this.A0A, this.A03);
        stateCallback2 = new CameraCaptureSession.StateCallback();
        stateCallback2.A00 = xFs;
        return stateCallback2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EOp(java.util.HashMap r4) {
        /*
            r3 = this;
            r0 = 1302(0x516, float:1.824E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L_0x0012
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
        L_0x0012:
            boolean r1 = r0.booleanValue()
            r0 = 1304(0x518, float:1.827E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L_0x0028
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
        L_0x0028:
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r1 == 0) goto L_0x007f
            if (r0 == 0) goto L_0x007c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0033:
            r3.A0J = r0
            X.XaJ r1 = r3.A08
            r1.A02 = r2
        L_0x0039:
            r0 = 1303(0x517, float:1.826E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L_0x004b
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
        L_0x004b:
            boolean r0 = r0.booleanValue()
            r1.A01 = r0
            if (r0 == 0) goto L_0x0079
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0055:
            r3.A0I = r0
            r0 = 1301(0x515, float:1.823E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
        L_0x0069:
            boolean r0 = r0.booleanValue()
            r1.A00 = r0
            if (r0 == 0) goto L_0x0076
            X.XR3 r0 = X.XR3.AUTOMATIC
        L_0x0073:
            r3.A0G = r0
            return
        L_0x0076:
            X.XR3 r0 = X.XR3.DISABLED
            goto L_0x0073
        L_0x0079:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0055
        L_0x007c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0033
        L_0x007f:
            if (r0 == 0) goto L_0x0084
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0033
        L_0x0084:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A0J = r0
            X.XaJ r1 = r3.A08
            r0 = 0
            r1.A02 = r0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22257XyF.EOp(java.util.HashMap):void");
    }

    public final long getFrameTimestamp() {
        Frame frame = this.A0M;
        if (frame != null) {
            return frame.A00();
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.XaJ, java.lang.Object] */
    public C22257XyF(Context context, boolean z) {
        YA6 ya6;
        Integer num = AnonymousClass05K.A00;
        this.A0I = num;
        this.A0J = num;
        this.A0G = XR3.DISABLED;
        this.A0L = -1;
        this.A08 = new Object();
        this.A09 = new C22376Y1e(this);
        this.A0E = new C22255XyD();
        this.A0F = new C22256XyE(this);
        this.A0B = new C21367XYw(this);
        this.A07 = context.getApplicationContext();
        HandlerThread handlerThread = new HandlerThread("ARCoreCallback");
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        this.A0A = new Handler(handlerThread.getLooper());
        YA6 ya62 = C22148XwD.A00;
        try {
            ya6 = (YA6) Class.forName("com.facebook.cameracore.camerasdk.optic.arcore.extensions.ArCoreNativeExtensionImpl").getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Exception unused) {
            ya6 = ya62;
        }
        this.A06 = ya6;
    }
}
