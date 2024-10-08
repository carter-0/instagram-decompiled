package com.facebook.rsys.videoeffectcommunication.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22179Xwp;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoEffectCommunicationModel {
    public static 2LV CONVERTER = new C22179Xwp(17);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationCallLayoutRemovingState callLayoutRemovingState;
    public final long confirmationPromptEffectId;
    public final int confirmationPromptState;
    public final boolean effectReadyForSplitScreen;
    public final VideoEffectCommunicationGroupEffectSharingState effectReceivingState;
    public final VideoEffectCommunicationGroupEffectSharingState effectSendingState;
    public final long multipeerListeningEffectId;
    public final long participantModuleEffectId;
    public final Long updatedCallLayoutEffectId;
    public final int updatedGroupEffectStatus;

    public static native VideoEffectCommunicationModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationModel)) {
                return false;
            }
            VideoEffectCommunicationModel videoEffectCommunicationModel = (VideoEffectCommunicationModel) obj;
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState = this.effectReceivingState;
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState2 = videoEffectCommunicationModel.effectReceivingState;
            if (videoEffectCommunicationGroupEffectSharingState == null) {
                if (videoEffectCommunicationGroupEffectSharingState2 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationGroupEffectSharingState.equals(videoEffectCommunicationGroupEffectSharingState2)) {
                return false;
            }
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState3 = this.effectSendingState;
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState4 = videoEffectCommunicationModel.effectSendingState;
            if (videoEffectCommunicationGroupEffectSharingState3 == null) {
                if (videoEffectCommunicationGroupEffectSharingState4 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationGroupEffectSharingState3.equals(videoEffectCommunicationGroupEffectSharingState4)) {
                return false;
            }
            if (this.confirmationPromptState != videoEffectCommunicationModel.confirmationPromptState || this.confirmationPromptEffectId != videoEffectCommunicationModel.confirmationPromptEffectId || this.multipeerListeningEffectId != videoEffectCommunicationModel.multipeerListeningEffectId || this.participantModuleEffectId != videoEffectCommunicationModel.participantModuleEffectId) {
                return false;
            }
            Long l = this.updatedCallLayoutEffectId;
            Long l2 = videoEffectCommunicationModel.updatedCallLayoutEffectId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (this.updatedGroupEffectStatus != videoEffectCommunicationModel.updatedGroupEffectStatus) {
                return false;
            }
            VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState = this.callLayoutRemovingState;
            VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState2 = videoEffectCommunicationModel.callLayoutRemovingState;
            if (videoEffectCommunicationCallLayoutRemovingState == null) {
                if (videoEffectCommunicationCallLayoutRemovingState2 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationCallLayoutRemovingState.equals(videoEffectCommunicationCallLayoutRemovingState2)) {
                return false;
            }
            return this.effectReadyForSplitScreen == videoEffectCommunicationModel.effectReadyForSplitScreen;
        }
    }

    public int hashCode() {
        return ((((((AnonymousClass7TF.A01(this.participantModuleEffectId, AnonymousClass7TF.A01(this.multipeerListeningEffectId, AnonymousClass7TF.A01(this.confirmationPromptEffectId, (((C66583MXo.A01(AnonymousClass7TG.A0C(this.effectReceivingState)) + AnonymousClass7TG.A0C(this.effectSendingState)) * 31) + this.confirmationPromptState) * 31))) + AnonymousClass7TG.A0C(this.updatedCallLayoutEffectId)) * 31) + this.updatedGroupEffectStatus) * 31) + AnonymousClass7TE.A0L(this.callLayoutRemovingState)) * 31) + (this.effectReadyForSplitScreen ? 1 : 0);
    }

    public VideoEffectCommunicationModel(VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState, VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState2, int i, long j, long j2, long j3, Long l, int i2, VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState, boolean z) {
        this.effectReceivingState = videoEffectCommunicationGroupEffectSharingState;
        this.effectSendingState = videoEffectCommunicationGroupEffectSharingState2;
        this.confirmationPromptState = i;
        this.confirmationPromptEffectId = j;
        this.multipeerListeningEffectId = j2;
        this.participantModuleEffectId = j3;
        this.updatedCallLayoutEffectId = l;
        this.updatedGroupEffectStatus = i2;
        this.callLayoutRemovingState = videoEffectCommunicationCallLayoutRemovingState;
        this.effectReadyForSplitScreen = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoEffectCommunicationModel{effectReceivingState=");
        A1A.append(this.effectReceivingState);
        A1A.append(",effectSendingState=");
        A1A.append(this.effectSendingState);
        A1A.append(",confirmationPromptState=");
        A1A.append(this.confirmationPromptState);
        A1A.append(",confirmationPromptEffectId=");
        A1A.append(this.confirmationPromptEffectId);
        A1A.append(",multipeerListeningEffectId=");
        A1A.append(this.multipeerListeningEffectId);
        A1A.append(",participantModuleEffectId=");
        A1A.append(this.participantModuleEffectId);
        A1A.append(",updatedCallLayoutEffectId=");
        A1A.append(this.updatedCallLayoutEffectId);
        A1A.append(",updatedGroupEffectStatus=");
        A1A.append(this.updatedGroupEffectStatus);
        A1A.append(",callLayoutRemovingState=");
        A1A.append(this.callLayoutRemovingState);
        A1A.append(",effectReadyForSplitScreen=");
        return C66584MXp.A0b(A1A, this.effectReadyForSplitScreen);
    }
}
