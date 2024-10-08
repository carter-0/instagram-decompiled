package com.facebook.rsys.screenshare.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51972G9s;
import X.C66583MXo;
import X.C66584MXp;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

public class ScreenShareModel {
    public static 2LV CONVERTER = new C71545Omg(4);
    public static long sMcfTypeId;
    public final boolean audioFeatureEnabled;
    public final boolean isSctpEnabled;
    public final long maxParticipants;
    public final PeerScreenShareStates peerStates;
    public final int screenShareAvailability;
    public final boolean screenShareInitiateSharing;
    public final boolean screenShareIntendedOn;
    public final int screenSharePlayerCurrentIndex;
    public final int screenSharePlayerMediaQueueCount;
    public final int screenShareSourceType;
    public final int screenShareState;
    public final boolean screenShareStopSharing;
    public final int screenShareStopSharingActionSource;
    public final HashSet selfRemoteScreenShareChannelIds;

    public static native ScreenShareModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ScreenShareModel)) {
                return false;
            }
            ScreenShareModel screenShareModel = (ScreenShareModel) obj;
            if (this.screenShareInitiateSharing != screenShareModel.screenShareInitiateSharing || this.screenShareState != screenShareModel.screenShareState || this.screenShareIntendedOn != screenShareModel.screenShareIntendedOn || this.screenShareSourceType != screenShareModel.screenShareSourceType || this.screenShareAvailability != screenShareModel.screenShareAvailability || this.screenShareStopSharing != screenShareModel.screenShareStopSharing || this.screenShareStopSharingActionSource != screenShareModel.screenShareStopSharingActionSource) {
                return false;
            }
            PeerScreenShareStates peerScreenShareStates = this.peerStates;
            PeerScreenShareStates peerScreenShareStates2 = screenShareModel.peerStates;
            if (peerScreenShareStates == null) {
                if (peerScreenShareStates2 != null) {
                    return false;
                }
            } else if (!peerScreenShareStates.equals(peerScreenShareStates2)) {
                return false;
            }
            if (!(this.maxParticipants == screenShareModel.maxParticipants && this.audioFeatureEnabled == screenShareModel.audioFeatureEnabled && this.screenSharePlayerMediaQueueCount == screenShareModel.screenSharePlayerMediaQueueCount && this.screenSharePlayerCurrentIndex == screenShareModel.screenSharePlayerCurrentIndex && this.selfRemoteScreenShareChannelIds.equals(screenShareModel.selfRemoteScreenShareChannelIds) && this.isSctpEnabled == screenShareModel.isSctpEnabled)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.maxParticipants;
        return AnonymousClass7TF.A07(this.selfRemoteScreenShareChannelIds, (((((C51972G9s.A07(j, (((((((((((((C66583MXo.A01(this.screenShareInitiateSharing ? 1 : 0) + this.screenShareState) * 31) + (this.screenShareIntendedOn ? 1 : 0)) * 31) + this.screenShareSourceType) * 31) + this.screenShareAvailability) * 31) + (this.screenShareStopSharing ? 1 : 0)) * 31) + this.screenShareStopSharingActionSource) * 31) + AnonymousClass7TG.A0C(this.peerStates)) * 31) + (this.audioFeatureEnabled ? 1 : 0)) * 31) + this.screenSharePlayerMediaQueueCount) * 31) + this.screenSharePlayerCurrentIndex) * 31) + (this.isSctpEnabled ? 1 : 0);
    }

    public ScreenShareModel(boolean z, int i, boolean z2, int i2, int i3, boolean z3, int i4, PeerScreenShareStates peerScreenShareStates, long j, boolean z4, int i5, int i6, HashSet hashSet, boolean z5) {
        hashSet.getClass();
        this.screenShareInitiateSharing = z;
        this.screenShareState = i;
        this.screenShareIntendedOn = z2;
        this.screenShareSourceType = i2;
        this.screenShareAvailability = i3;
        this.screenShareStopSharing = z3;
        this.screenShareStopSharingActionSource = i4;
        this.peerStates = peerScreenShareStates;
        this.maxParticipants = j;
        this.audioFeatureEnabled = z4;
        this.screenSharePlayerMediaQueueCount = i5;
        this.screenSharePlayerCurrentIndex = i6;
        this.selfRemoteScreenShareChannelIds = hashSet;
        this.isSctpEnabled = z5;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ScreenShareModel{screenShareInitiateSharing=");
        A1A.append(this.screenShareInitiateSharing);
        A1A.append(",screenShareState=");
        A1A.append(this.screenShareState);
        A1A.append(",screenShareIntendedOn=");
        A1A.append(this.screenShareIntendedOn);
        A1A.append(",screenShareSourceType=");
        A1A.append(this.screenShareSourceType);
        A1A.append(",screenShareAvailability=");
        A1A.append(this.screenShareAvailability);
        A1A.append(",screenShareStopSharing=");
        A1A.append(this.screenShareStopSharing);
        A1A.append(",screenShareStopSharingActionSource=");
        A1A.append(this.screenShareStopSharingActionSource);
        A1A.append(",peerStates=");
        A1A.append(this.peerStates);
        A1A.append(",maxParticipants=");
        A1A.append(this.maxParticipants);
        A1A.append(",audioFeatureEnabled=");
        A1A.append(this.audioFeatureEnabled);
        A1A.append(",screenSharePlayerMediaQueueCount=");
        A1A.append(this.screenSharePlayerMediaQueueCount);
        A1A.append(",screenSharePlayerCurrentIndex=");
        A1A.append(this.screenSharePlayerCurrentIndex);
        A1A.append(",selfRemoteScreenShareChannelIds=");
        A1A.append(this.selfRemoteScreenShareChannelIds);
        A1A.append(",isSctpEnabled=");
        return C66584MXp.A0b(A1A, this.isSctpEnabled);
    }
}
