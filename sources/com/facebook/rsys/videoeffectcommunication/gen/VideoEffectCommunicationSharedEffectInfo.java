package com.facebook.rsys.videoeffectcommunication.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51968G9o;
import X.C66582MXn;
import X.C66583MXo;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoEffectCommunicationSharedEffectInfo {
    public static 2LV CONVERTER = new C71545Omg(14);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationAdditionalEffectInfo additionalInfo;
    public final boolean applyOnJoin;
    public final String cryptoHash;
    public final long effectId;
    public final String effectName;
    public final String effectThumbnailUri;
    public final int effectType;
    public final String initiatorId;
    public final String initiatorName;
    public final boolean synchronizedStart;
    public final boolean synchronizedStop;

    public static native VideoEffectCommunicationSharedEffectInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationSharedEffectInfo)) {
                return false;
            }
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo = (VideoEffectCommunicationSharedEffectInfo) obj;
            if (this.effectId != videoEffectCommunicationSharedEffectInfo.effectId) {
                return false;
            }
            String str = this.effectName;
            String str2 = videoEffectCommunicationSharedEffectInfo.effectName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.effectThumbnailUri;
            String str4 = videoEffectCommunicationSharedEffectInfo.effectThumbnailUri;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.initiatorId;
            String str6 = videoEffectCommunicationSharedEffectInfo.initiatorId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.initiatorName;
            String str8 = videoEffectCommunicationSharedEffectInfo.initiatorName;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.cryptoHash;
            String str10 = videoEffectCommunicationSharedEffectInfo.cryptoHash;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            if (this.synchronizedStart != videoEffectCommunicationSharedEffectInfo.synchronizedStart || this.synchronizedStop != videoEffectCommunicationSharedEffectInfo.synchronizedStop || this.applyOnJoin != videoEffectCommunicationSharedEffectInfo.applyOnJoin || this.effectType != videoEffectCommunicationSharedEffectInfo.effectType) {
                return false;
            }
            VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo = this.additionalInfo;
            VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo2 = videoEffectCommunicationSharedEffectInfo.additionalInfo;
            if (videoEffectCommunicationAdditionalEffectInfo != null) {
                return videoEffectCommunicationAdditionalEffectInfo.equals(videoEffectCommunicationAdditionalEffectInfo2);
            }
            if (videoEffectCommunicationAdditionalEffectInfo2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((((((((((((((C66583MXo.A01(C51968G9o.A03(this.effectId)) + AnonymousClass7TG.A0E(this.effectName)) * 31) + AnonymousClass7TG.A0E(this.effectThumbnailUri)) * 31) + AnonymousClass7TG.A0E(this.initiatorId)) * 31) + AnonymousClass7TG.A0E(this.initiatorName)) * 31) + AnonymousClass7TG.A0E(this.cryptoHash)) * 31) + (this.synchronizedStart ? 1 : 0)) * 31) + (this.synchronizedStop ? 1 : 0)) * 31) + (this.applyOnJoin ? 1 : 0)) * 31) + this.effectType) * 31) + AnonymousClass7TE.A0L(this.additionalInfo);
    }

    public VideoEffectCommunicationSharedEffectInfo(long j, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, int i, VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo) {
        this.effectId = j;
        this.effectName = str;
        this.effectThumbnailUri = str2;
        this.initiatorId = str3;
        this.initiatorName = str4;
        this.cryptoHash = str5;
        this.synchronizedStart = z;
        this.synchronizedStop = z2;
        this.applyOnJoin = z3;
        this.effectType = i;
        this.additionalInfo = videoEffectCommunicationAdditionalEffectInfo;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoEffectCommunicationSharedEffectInfo{effectId=");
        A1A.append(this.effectId);
        A1A.append(",effectName=");
        A1A.append(this.effectName);
        A1A.append(",effectThumbnailUri=");
        A1A.append(this.effectThumbnailUri);
        A1A.append(",initiatorId=");
        A1A.append(this.initiatorId);
        A1A.append(",initiatorName=");
        A1A.append(this.initiatorName);
        A1A.append(",cryptoHash=");
        A1A.append(this.cryptoHash);
        A1A.append(",synchronizedStart=");
        A1A.append(this.synchronizedStart);
        A1A.append(",synchronizedStop=");
        A1A.append(this.synchronizedStop);
        A1A.append(",applyOnJoin=");
        A1A.append(this.applyOnJoin);
        A1A.append(",effectType=");
        A1A.append(this.effectType);
        A1A.append(",additionalInfo=");
        return C66582MXn.A0v(this.additionalInfo, A1A);
    }
}
