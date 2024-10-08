package com.facebook.rsys.devxcallagent.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;
import java.util.ArrayList;

public class DevXAgentCallConfig {
    public static 2LV CONVERTER = C71546Omh.A00(35);
    public static long sMcfTypeId;
    public final AudioProxy audioProxy;
    public final CameraProxy cameraProxy;
    public final ArrayList features;
    public final ScreenShareProxy screenShareProxy;

    public static native DevXAgentCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DevXAgentCallConfig)) {
                return false;
            }
            DevXAgentCallConfig devXAgentCallConfig = (DevXAgentCallConfig) obj;
            CameraProxy cameraProxy2 = this.cameraProxy;
            CameraProxy cameraProxy3 = devXAgentCallConfig.cameraProxy;
            if (cameraProxy2 == null) {
                if (cameraProxy3 != null) {
                    return false;
                }
            } else if (!cameraProxy2.equals(cameraProxy3)) {
                return false;
            }
            AudioProxy audioProxy2 = this.audioProxy;
            AudioProxy audioProxy3 = devXAgentCallConfig.audioProxy;
            if (audioProxy2 == null) {
                if (audioProxy3 != null) {
                    return false;
                }
            } else if (!audioProxy2.equals(audioProxy3)) {
                return false;
            }
            ScreenShareProxy screenShareProxy2 = this.screenShareProxy;
            ScreenShareProxy screenShareProxy3 = devXAgentCallConfig.screenShareProxy;
            if (screenShareProxy2 == null) {
                if (screenShareProxy3 != null) {
                    return false;
                }
            } else if (!screenShareProxy2.equals(screenShareProxy3)) {
                return false;
            }
            ArrayList arrayList = this.features;
            ArrayList arrayList2 = devXAgentCallConfig.features;
            if (arrayList != null) {
                return arrayList.equals(arrayList2);
            }
            if (arrayList2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((C66583MXo.A01(AnonymousClass7TG.A0C(this.cameraProxy)) + AnonymousClass7TG.A0C(this.audioProxy)) * 31) + AnonymousClass7TG.A0C(this.screenShareProxy)) * 31) + AnonymousClass7TE.A0L(this.features);
    }

    public DevXAgentCallConfig(CameraProxy cameraProxy2, AudioProxy audioProxy2, ScreenShareProxy screenShareProxy2, ArrayList arrayList) {
        this.cameraProxy = cameraProxy2;
        this.audioProxy = audioProxy2;
        this.screenShareProxy = screenShareProxy2;
        this.features = arrayList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DevXAgentCallConfig{cameraProxy=");
        A1A.append(this.cameraProxy);
        A1A.append(",audioProxy=");
        A1A.append(this.audioProxy);
        A1A.append(",screenShareProxy=");
        A1A.append(this.screenShareProxy);
        A1A.append(",features=");
        return C66582MXn.A0v(this.features, A1A);
    }
}
