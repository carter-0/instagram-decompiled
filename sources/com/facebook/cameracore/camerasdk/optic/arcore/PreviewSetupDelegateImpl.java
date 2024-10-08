package com.facebook.cameracore.camerasdk.optic.arcore;

import X.C22257XyF;
import X.C341897nh;
import X.C343187po;
import X.C343297pz;
import X.Y9N;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;

public class PreviewSetupDelegateImpl implements C341897nh {
    public int A00;
    public final Context A01;
    public final boolean A02;
    public volatile C341897nh A03;
    public volatile HashMap A04;
    public volatile boolean A05;

    public PreviewSetupDelegateImpl(Context context) {
        this(context, false, false);
    }

    public final synchronized boolean CO8() {
        boolean z;
        z = false;
        if (this.A00 == 0) {
            z = true;
        }
        return z;
    }

    public synchronized void closeSession() {
        C341897nh r0 = this.A03;
        if (r0 != null) {
            r0.closeSession();
            this.A03 = null;
        }
    }

    public synchronized void createSession(CameraDevice cameraDevice, int i) {
        this.A00 = i;
        A00().createSession(cameraDevice, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (CO8() == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isARCoreEnabled() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A05     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r2.CO8()     // Catch:{ all -> 0x000f }
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.camerasdk.optic.arcore.PreviewSetupDelegateImpl.isARCoreEnabled():boolean");
    }

    public boolean isARCoreSupported() {
        return true;
    }

    public synchronized void setUseArCoreIfSupported(boolean z) {
        this.A05 = z;
    }

    private C341897nh A00() {
        C341897nh r2;
        C341897nh r22 = this.A03;
        if (r22 != null) {
            return r22;
        }
        synchronized (this) {
            r2 = this.A03;
            if (r2 == null) {
                if (isARCoreEnabled()) {
                    r2 = new C22257XyF(this.A01, this.A02);
                } else {
                    r2 = C341897nh.A01;
                }
                HashMap hashMap = this.A04;
                if (hashMap != null) {
                    r2.EOp(hashMap);
                }
                this.A03 = r2;
            }
        }
        return r2;
    }

    public final void EOp(HashMap hashMap) {
        this.A04 = new HashMap(hashMap);
    }

    public boolean getUseArCoreIfSupported() {
        return this.A05;
    }

    public void onCameraClosed(CameraDevice cameraDevice) {
        if (this.A03 != null) {
            A00().onCameraClosed(cameraDevice);
        }
    }

    public List addArSurfaces(List list) {
        return A00().addArSurfaces(list);
    }

    public SurfaceTexture getArSurfaceTexture(int i, Y9N y9n) {
        return A00().getArSurfaceTexture(i, y9n);
    }

    public List getArSurfaces() {
        return A00().getArSurfaces();
    }

    public long getFrameTimestamp() {
        return A00().getFrameTimestamp();
    }

    public Surface getPreviewSurface(SurfaceTexture surfaceTexture) {
        return A00().getPreviewSurface(surfaceTexture);
    }

    public int getPreviewTemplate() {
        return A00().getPreviewTemplate();
    }

    public boolean isCameraSessionActivated() {
        return A00().isCameraSessionActivated();
    }

    public void onCameraDisconnected(CameraDevice cameraDevice) {
        A00().onCameraDisconnected(cameraDevice);
    }

    public void onCameraError(CameraDevice cameraDevice, int i) {
        A00().onCameraError(cameraDevice, i);
    }

    public void setCameraSessionActivated(C343297pz r2, C343187po r3) {
        A00().setCameraSessionActivated(r2, r3);
    }

    public void update() {
        A00().update();
    }

    public CameraCaptureSession.StateCallback wrapSessionConfigurationCallback(CameraCaptureSession.StateCallback stateCallback) {
        return A00().wrapSessionConfigurationCallback(stateCallback);
    }

    public PreviewSetupDelegateImpl(Context context, boolean z, boolean z2) {
        this.A01 = context.getApplicationContext();
        this.A05 = z;
        this.A02 = z2;
    }
}
