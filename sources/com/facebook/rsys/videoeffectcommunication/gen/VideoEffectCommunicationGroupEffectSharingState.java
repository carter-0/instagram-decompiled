package com.facebook.rsys.videoeffectcommunication.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21056XCh;
import X.C22179Xwp;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoEffectCommunicationGroupEffectSharingState {
    public static 2LV CONVERTER = new C22179Xwp(16);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationSharedEffectInfo effectInfo;
    public final String notificationId;
    public final boolean useEffectMatch;

    public static native VideoEffectCommunicationGroupEffectSharingState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEffectCommunicationGroupEffectSharingState)) {
            return false;
        }
        VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState = (VideoEffectCommunicationGroupEffectSharingState) obj;
        return this.effectInfo.equals(videoEffectCommunicationGroupEffectSharingState.effectInfo) && this.notificationId.equals(videoEffectCommunicationGroupEffectSharingState.notificationId) && this.useEffectMatch == videoEffectCommunicationGroupEffectSharingState.useEffectMatch;
    }

    public int hashCode() {
        return AnonymousClass7TF.A08(this.notificationId, C21056XCh.A01(this.effectInfo)) + (this.useEffectMatch ? 1 : 0);
    }

    public VideoEffectCommunicationGroupEffectSharingState(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, String str, boolean z) {
        videoEffectCommunicationSharedEffectInfo.getClass();
        str.getClass();
        this.effectInfo = videoEffectCommunicationSharedEffectInfo;
        this.notificationId = str;
        this.useEffectMatch = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoEffectCommunicationGroupEffectSharingState{effectInfo=");
        A1A.append(this.effectInfo);
        A1A.append(",notificationId=");
        A1A.append(this.notificationId);
        A1A.append(",useEffectMatch=");
        return C66584MXp.A0b(A1A, this.useEffectMatch);
    }
}
