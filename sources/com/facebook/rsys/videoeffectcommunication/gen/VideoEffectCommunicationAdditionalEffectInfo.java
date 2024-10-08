package com.facebook.rsys.videoeffectcommunication.gen;

import X.002;
import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoEffectCommunicationAdditionalEffectInfo {
    public static 2LV CONVERTER = new C22179Xwp(14);
    public static long sMcfTypeId;
    public final int notificationType;

    public static native VideoEffectCommunicationAdditionalEffectInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof VideoEffectCommunicationAdditionalEffectInfo) && this.notificationType == ((VideoEffectCommunicationAdditionalEffectInfo) obj).notificationType;
        }
        return true;
    }

    public int hashCode() {
        return 527 + this.notificationType;
    }

    public String toString() {
        return 002.A0c("VideoEffectCommunicationAdditionalEffectInfo{notificationType=", "}", this.notificationType);
    }

    public VideoEffectCommunicationAdditionalEffectInfo(int i) {
        this.notificationType = i;
    }
}
