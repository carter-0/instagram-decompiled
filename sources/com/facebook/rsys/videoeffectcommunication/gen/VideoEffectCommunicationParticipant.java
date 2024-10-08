package com.facebook.rsys.videoeffectcommunication.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66583MXo;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoEffectCommunicationParticipant {
    public static 2LV CONVERTER = new C71545Omg(13);
    public static long sMcfTypeId;
    public final boolean isActiveInCall;
    public final boolean isActiveInSameEffect;
    public final int loadStatus;
    public final String participantId;

    public static native VideoEffectCommunicationParticipant createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEffectCommunicationParticipant)) {
            return false;
        }
        VideoEffectCommunicationParticipant videoEffectCommunicationParticipant = (VideoEffectCommunicationParticipant) obj;
        return this.participantId.equals(videoEffectCommunicationParticipant.participantId) && this.isActiveInCall == videoEffectCommunicationParticipant.isActiveInCall && this.isActiveInSameEffect == videoEffectCommunicationParticipant.isActiveInSameEffect && this.loadStatus == videoEffectCommunicationParticipant.loadStatus;
    }

    public int hashCode() {
        return ((((C66583MXo.A06(this.participantId) + (this.isActiveInCall ? 1 : 0)) * 31) + (this.isActiveInSameEffect ? 1 : 0)) * 31) + this.loadStatus;
    }

    public VideoEffectCommunicationParticipant(String str, boolean z, boolean z2, int i) {
        str.getClass();
        this.participantId = str;
        this.isActiveInCall = z;
        this.isActiveInSameEffect = z2;
        this.loadStatus = i;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoEffectCommunicationParticipant{participantId=");
        A1A.append(this.participantId);
        A1A.append(",isActiveInCall=");
        A1A.append(this.isActiveInCall);
        A1A.append(",isActiveInSameEffect=");
        A1A.append(this.isActiveInSameEffect);
        A1A.append(",loadStatus=");
        A1A.append(this.loadStatus);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
