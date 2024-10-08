package com.facebook.rsys.ended.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class EndedModel {
    public static 2LV CONVERTER = C71546Omh.A00(37);
    public static long sMcfTypeId;
    public final boolean canTryAgain;
    public final UnsupportedCapabilityFallbacks fallbacks;
    public final int postCallViewType;
    public final int reason;
    public final boolean remoteEnded;
    public final boolean shouldInformPeer;
    public final boolean shouldTriggerVoicemail;
    public final String subReason;
    public final VideoQuality videoQuality;
    public final boolean wasConnected;

    public static native EndedModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EndedModel)) {
                return false;
            }
            EndedModel endedModel = (EndedModel) obj;
            if (this.reason != endedModel.reason || !this.subReason.equals(endedModel.subReason) || this.wasConnected != endedModel.wasConnected || this.postCallViewType != endedModel.postCallViewType || this.canTryAgain != endedModel.canTryAgain || this.remoteEnded != endedModel.remoteEnded || this.shouldInformPeer != endedModel.shouldInformPeer || this.shouldTriggerVoicemail != endedModel.shouldTriggerVoicemail) {
                return false;
            }
            UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks = this.fallbacks;
            UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks2 = endedModel.fallbacks;
            if (unsupportedCapabilityFallbacks == null) {
                if (unsupportedCapabilityFallbacks2 != null) {
                    return false;
                }
            } else if (!unsupportedCapabilityFallbacks.equals(unsupportedCapabilityFallbacks2)) {
                return false;
            }
            VideoQuality videoQuality2 = this.videoQuality;
            VideoQuality videoQuality3 = endedModel.videoQuality;
            if (videoQuality2 != null) {
                return videoQuality2.equals(videoQuality3);
            }
            if (videoQuality3 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass7TF.A08(this.subReason, C66583MXo.A01(this.reason)) + (this.wasConnected ? 1 : 0)) * 31) + this.postCallViewType) * 31) + (this.canTryAgain ? 1 : 0)) * 31) + (this.remoteEnded ? 1 : 0)) * 31) + (this.shouldInformPeer ? 1 : 0)) * 31) + (this.shouldTriggerVoicemail ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.fallbacks)) * 31) + AnonymousClass7TE.A0L(this.videoQuality);
    }

    public EndedModel(int i, String str, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks, VideoQuality videoQuality2) {
        str.getClass();
        this.reason = i;
        this.subReason = str;
        this.wasConnected = z;
        this.postCallViewType = i2;
        this.canTryAgain = z2;
        this.remoteEnded = z3;
        this.shouldInformPeer = z4;
        this.shouldTriggerVoicemail = z5;
        this.fallbacks = unsupportedCapabilityFallbacks;
        this.videoQuality = videoQuality2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EndedModel{reason=");
        A1A.append(this.reason);
        A1A.append(",subReason=");
        A1A.append(this.subReason);
        A1A.append(",wasConnected=");
        A1A.append(this.wasConnected);
        A1A.append(",postCallViewType=");
        A1A.append(this.postCallViewType);
        A1A.append(",canTryAgain=");
        A1A.append(this.canTryAgain);
        A1A.append(",remoteEnded=");
        A1A.append(this.remoteEnded);
        A1A.append(",shouldInformPeer=");
        A1A.append(this.shouldInformPeer);
        A1A.append(",shouldTriggerVoicemail=");
        A1A.append(this.shouldTriggerVoicemail);
        A1A.append(",fallbacks=");
        A1A.append(this.fallbacks);
        A1A.append(",videoQuality=");
        return C66582MXn.A0v(this.videoQuality, A1A);
    }
}
