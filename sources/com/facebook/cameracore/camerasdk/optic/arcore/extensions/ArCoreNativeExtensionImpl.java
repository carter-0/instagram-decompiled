package com.facebook.cameracore.camerasdk.optic.arcore.extensions;

import X.C21368XYx;
import X.C21410XaJ;
import X.Pxe;
import X.XUS;
import X.XYZ;
import X.YA6;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation.PlatformAlgorithmAlwaysOnDataSourceHybrid;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataNativeFrame;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import java.util.HashMap;

public final class ArCoreNativeExtensionImpl implements YA6 {
    public PlatformAlgorithmAlwaysOnDataSource A00;
    public final boolean A01;

    public void run(Session session, Frame frame, C21368XYx xYx, C21410XaJ xaJ) {
        if (session != null && frame != null) {
            long nativeGetSessionNativeHandle = session.nativeGetSessionNativeHandle(session.nativeWrapperHandle);
            long j = frame.A00;
            PlatformAlgorithmDataNativeFrame platformAlgorithmDataNativeFrame = new PlatformAlgorithmDataNativeFrame(nativeGetSessionNativeHandle, j);
            XUS xus = XYZ.A02;
            HashMap hashMap = xYx.A00;
            hashMap.put(xus, platformAlgorithmDataNativeFrame);
            if (this.A01) {
                PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource = this.A00;
                if (platformAlgorithmAlwaysOnDataSource == null) {
                    platformAlgorithmAlwaysOnDataSource = new PlatformAlgorithmAlwaysOnDataSourceHybrid(true, xaJ.A02, xaJ.A01, xaJ.A00);
                    this.A00 = platformAlgorithmAlwaysOnDataSource;
                }
                platformAlgorithmAlwaysOnDataSource.updateFrame(nativeGetSessionNativeHandle, j);
                hashMap.put(XYZ.A00, this.A00);
                Pxe.A1X(XYZ.A01, hashMap, frame.A00());
            }
        }
    }

    public ArCoreNativeExtensionImpl(boolean z) {
        this.A01 = z;
    }

    public final PlatformAlgorithmAlwaysOnDataSource AbL() {
        return this.A00;
    }
}
