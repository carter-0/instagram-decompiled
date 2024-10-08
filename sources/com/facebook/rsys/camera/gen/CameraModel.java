package com.facebook.rsys.camera.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import java.util.ArrayList;

public class CameraModel {
    public static 2LV CONVERTER = C71546Omh.A00(25);
    public static long sMcfTypeId;
    public final int activeCameraIdx;
    public final boolean cameraEverOn;
    public final boolean cameraOn;
    public final boolean cameraPaused;
    public final int cameraState;
    public final ArrayList cameras;
    public final StreamInfo streamInfo;
    public final int targetCaptureResolutionHeight;
    public final int targetCaptureResolutionWidth;
    public final int targetFps;
    public final boolean userHasDeclinedVideoPrompt;

    public static native CameraModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraModel)) {
            return false;
        }
        CameraModel cameraModel = (CameraModel) obj;
        return this.cameraOn == cameraModel.cameraOn && this.cameraState == cameraModel.cameraState && this.cameraPaused == cameraModel.cameraPaused && this.activeCameraIdx == cameraModel.activeCameraIdx && this.cameras.equals(cameraModel.cameras) && this.cameraEverOn == cameraModel.cameraEverOn && this.userHasDeclinedVideoPrompt == cameraModel.userHasDeclinedVideoPrompt && this.targetFps == cameraModel.targetFps && this.targetCaptureResolutionWidth == cameraModel.targetCaptureResolutionWidth && this.targetCaptureResolutionHeight == cameraModel.targetCaptureResolutionHeight && this.streamInfo.equals(cameraModel.streamInfo);
    }

    public int hashCode() {
        ArrayList arrayList = this.cameras;
        return AnonymousClass7TE.A0N(this.streamInfo, (((((((((AnonymousClass7TF.A07(arrayList, (((((C66583MXo.A01(this.cameraOn ? 1 : 0) + this.cameraState) * 31) + (this.cameraPaused ? 1 : 0)) * 31) + this.activeCameraIdx) * 31) + (this.cameraEverOn ? 1 : 0)) * 31) + (this.userHasDeclinedVideoPrompt ? 1 : 0)) * 31) + this.targetFps) * 31) + this.targetCaptureResolutionWidth) * 31) + this.targetCaptureResolutionHeight) * 31);
    }

    public CameraModel(boolean z, int i, boolean z2, int i2, ArrayList arrayList, boolean z3, boolean z4, int i3, int i4, int i5, StreamInfo streamInfo2) {
        arrayList.getClass();
        streamInfo2.getClass();
        this.cameraOn = z;
        this.cameraState = i;
        this.cameraPaused = z2;
        this.activeCameraIdx = i2;
        this.cameras = arrayList;
        this.cameraEverOn = z3;
        this.userHasDeclinedVideoPrompt = z4;
        this.targetFps = i3;
        this.targetCaptureResolutionWidth = i4;
        this.targetCaptureResolutionHeight = i5;
        this.streamInfo = streamInfo2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CameraModel{cameraOn=");
        A1A.append(this.cameraOn);
        A1A.append(",cameraState=");
        A1A.append(this.cameraState);
        A1A.append(",cameraPaused=");
        A1A.append(this.cameraPaused);
        A1A.append(",activeCameraIdx=");
        A1A.append(this.activeCameraIdx);
        A1A.append(",cameras=");
        A1A.append(this.cameras);
        A1A.append(",cameraEverOn=");
        A1A.append(this.cameraEverOn);
        A1A.append(",userHasDeclinedVideoPrompt=");
        A1A.append(this.userHasDeclinedVideoPrompt);
        A1A.append(",targetFps=");
        A1A.append(this.targetFps);
        A1A.append(",targetCaptureResolutionWidth=");
        A1A.append(this.targetCaptureResolutionWidth);
        A1A.append(",targetCaptureResolutionHeight=");
        A1A.append(this.targetCaptureResolutionHeight);
        A1A.append(",streamInfo=");
        return C66582MXn.A0v(this.streamInfo, A1A);
    }
}
