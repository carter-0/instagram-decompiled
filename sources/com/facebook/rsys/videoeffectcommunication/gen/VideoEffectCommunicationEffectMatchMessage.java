package com.facebook.rsys.videoeffectcommunication.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51972G9s;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class VideoEffectCommunicationEffectMatchMessage {
    public final long activeCallLayoutEffectId;
    public final boolean readyToStartCallLayout;
    public final VideoEffectCommunicationSharedEffectInfo sharedEffectInfo;
    public final boolean shouldClearSharedEffectInfo;
    public final Map userIdToActiveEffectStatus;
    public final Map userIdToEffectId;

    public static native VideoEffectCommunicationEffectMatchMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationEffectMatchMessage)) {
                return false;
            }
            VideoEffectCommunicationEffectMatchMessage videoEffectCommunicationEffectMatchMessage = (VideoEffectCommunicationEffectMatchMessage) obj;
            Map map = this.userIdToEffectId;
            Map map2 = videoEffectCommunicationEffectMatchMessage.userIdToEffectId;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo = this.sharedEffectInfo;
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo2 = videoEffectCommunicationEffectMatchMessage.sharedEffectInfo;
            if (videoEffectCommunicationSharedEffectInfo == null) {
                if (videoEffectCommunicationSharedEffectInfo2 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationSharedEffectInfo.equals(videoEffectCommunicationSharedEffectInfo2)) {
                return false;
            }
            if (this.activeCallLayoutEffectId != videoEffectCommunicationEffectMatchMessage.activeCallLayoutEffectId || this.readyToStartCallLayout != videoEffectCommunicationEffectMatchMessage.readyToStartCallLayout || this.shouldClearSharedEffectInfo != videoEffectCommunicationEffectMatchMessage.shouldClearSharedEffectInfo) {
                return false;
            }
            Map map3 = this.userIdToActiveEffectStatus;
            Map map4 = videoEffectCommunicationEffectMatchMessage.userIdToActiveEffectStatus;
            if (map3 != null) {
                return map3.equals(map4);
            }
            if (map4 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        int hashCode;
        Map map = this.userIdToEffectId;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int A07 = (((C51972G9s.A07(this.activeCallLayoutEffectId, (C66583MXo.A01(hashCode) + AnonymousClass7TG.A0C(this.sharedEffectInfo)) * 31) + (this.readyToStartCallLayout ? 1 : 0)) * 31) + (this.shouldClearSharedEffectInfo ? 1 : 0)) * 31;
        Map map2 = this.userIdToActiveEffectStatus;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return A07 + i;
    }

    public VideoEffectCommunicationEffectMatchMessage(Map map, VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, long j, boolean z, boolean z2, Map map2) {
        this.userIdToEffectId = map;
        this.sharedEffectInfo = videoEffectCommunicationSharedEffectInfo;
        this.activeCallLayoutEffectId = j;
        this.readyToStartCallLayout = z;
        this.shouldClearSharedEffectInfo = z2;
        this.userIdToActiveEffectStatus = map2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoEffectCommunicationEffectMatchMessage{userIdToEffectId=");
        A1A.append(this.userIdToEffectId);
        A1A.append(",sharedEffectInfo=");
        A1A.append(this.sharedEffectInfo);
        A1A.append(",activeCallLayoutEffectId=");
        A1A.append(this.activeCallLayoutEffectId);
        A1A.append(",readyToStartCallLayout=");
        A1A.append(this.readyToStartCallLayout);
        A1A.append(",shouldClearSharedEffectInfo=");
        A1A.append(this.shouldClearSharedEffectInfo);
        A1A.append(",userIdToActiveEffectStatus=");
        return C66582MXn.A0v(this.userIdToActiveEffectStatus, A1A);
    }
}
