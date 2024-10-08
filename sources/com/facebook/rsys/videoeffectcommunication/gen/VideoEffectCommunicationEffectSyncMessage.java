package com.facebook.rsys.videoeffectcommunication.gen;

import X.AnonymousClass7TE;
import X.C21056XCh;
import X.C41845B3m;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class VideoEffectCommunicationEffectSyncMessage {
    public final int action;
    public final VideoEffectCommunicationSharedEffectInfo effectInfo;
    public final String senderId;
    public final Map userIdToEffectId;

    public static native VideoEffectCommunicationEffectSyncMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationEffectSyncMessage)) {
                return false;
            }
            VideoEffectCommunicationEffectSyncMessage videoEffectCommunicationEffectSyncMessage = (VideoEffectCommunicationEffectSyncMessage) obj;
            if (!this.effectInfo.equals(videoEffectCommunicationEffectSyncMessage.effectInfo) || this.action != videoEffectCommunicationEffectSyncMessage.action) {
                return false;
            }
            Map map = this.userIdToEffectId;
            Map map2 = videoEffectCommunicationEffectSyncMessage.userIdToEffectId;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            String str = this.senderId;
            String str2 = videoEffectCommunicationEffectSyncMessage.senderId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        int hashCode;
        int A01 = (C21056XCh.A01(this.effectInfo) + this.action) * 31;
        Map map = this.userIdToEffectId;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return ((A01 + hashCode) * 31) + C41845B3m.A00(this.senderId);
    }

    public VideoEffectCommunicationEffectSyncMessage(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, int i, Map map, String str) {
        videoEffectCommunicationSharedEffectInfo.getClass();
        this.effectInfo = videoEffectCommunicationSharedEffectInfo;
        this.action = i;
        this.userIdToEffectId = map;
        this.senderId = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoEffectCommunicationEffectSyncMessage{effectInfo=");
        A1A.append(this.effectInfo);
        A1A.append(",action=");
        A1A.append(this.action);
        A1A.append(",userIdToEffectId=");
        A1A.append(this.userIdToEffectId);
        A1A.append(",senderId=");
        return C66584MXp.A0a(this.senderId, A1A);
    }
}
