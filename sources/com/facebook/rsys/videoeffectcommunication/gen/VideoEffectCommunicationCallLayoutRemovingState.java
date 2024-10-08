package com.facebook.rsys.videoeffectcommunication.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C21056XCh;
import X.C22179Xwp;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoEffectCommunicationCallLayoutRemovingState {
    public static 2LV CONVERTER = new C22179Xwp(15);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationSharedEffectInfo effectInfo;
    public final String notificationId;

    public static native VideoEffectCommunicationCallLayoutRemovingState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEffectCommunicationCallLayoutRemovingState)) {
            return false;
        }
        VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState = (VideoEffectCommunicationCallLayoutRemovingState) obj;
        return this.effectInfo.equals(videoEffectCommunicationCallLayoutRemovingState.effectInfo) && this.notificationId.equals(videoEffectCommunicationCallLayoutRemovingState.notificationId);
    }

    public int hashCode() {
        return C21056XCh.A01(this.effectInfo) + this.notificationId.hashCode();
    }

    public VideoEffectCommunicationCallLayoutRemovingState(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, String str) {
        videoEffectCommunicationSharedEffectInfo.getClass();
        str.getClass();
        this.effectInfo = videoEffectCommunicationSharedEffectInfo;
        this.notificationId = str;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoEffectCommunicationCallLayoutRemovingState{effectInfo=");
        A1A.append(this.effectInfo);
        A1A.append(",notificationId=");
        return C66584MXp.A0a(this.notificationId, A1A);
    }
}
