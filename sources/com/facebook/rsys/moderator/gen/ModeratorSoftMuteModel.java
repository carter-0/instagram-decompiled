package com.facebook.rsys.moderator.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

public class ModeratorSoftMuteModel {
    public static 2LV CONVERTER = C71546Omh.A00(63);
    public static long sMcfTypeId;
    public final boolean actionCapabilitiesAsModerator;
    public final boolean actionCapabilitiesAsParticipant;
    public final ModeratorActionInfo actionExecuted;
    public final ModeratorActionInfo actionIssued;
    public final ModeratorActionInfo actionPending;
    public final Map conferenceParticipantCapabilities;
    public final boolean isCapabilityInitialized;
    public final boolean isFeatureEnabled;
    public final HashSet issueActionTargetUids;

    public static native ModeratorSoftMuteModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ModeratorSoftMuteModel)) {
                return false;
            }
            ModeratorSoftMuteModel moderatorSoftMuteModel = (ModeratorSoftMuteModel) obj;
            if (this.isCapabilityInitialized != moderatorSoftMuteModel.isCapabilityInitialized || this.isFeatureEnabled != moderatorSoftMuteModel.isFeatureEnabled || this.actionCapabilitiesAsModerator != moderatorSoftMuteModel.actionCapabilitiesAsModerator || this.actionCapabilitiesAsParticipant != moderatorSoftMuteModel.actionCapabilitiesAsParticipant || !this.conferenceParticipantCapabilities.equals(moderatorSoftMuteModel.conferenceParticipantCapabilities)) {
                return false;
            }
            ModeratorActionInfo moderatorActionInfo = this.actionIssued;
            ModeratorActionInfo moderatorActionInfo2 = moderatorSoftMuteModel.actionIssued;
            if (moderatorActionInfo == null) {
                if (moderatorActionInfo2 != null) {
                    return false;
                }
            } else if (!moderatorActionInfo.equals(moderatorActionInfo2)) {
                return false;
            }
            ModeratorActionInfo moderatorActionInfo3 = this.actionPending;
            ModeratorActionInfo moderatorActionInfo4 = moderatorSoftMuteModel.actionPending;
            if (moderatorActionInfo3 == null) {
                if (moderatorActionInfo4 != null) {
                    return false;
                }
            } else if (!moderatorActionInfo3.equals(moderatorActionInfo4)) {
                return false;
            }
            ModeratorActionInfo moderatorActionInfo5 = this.actionExecuted;
            ModeratorActionInfo moderatorActionInfo6 = moderatorSoftMuteModel.actionExecuted;
            if (moderatorActionInfo5 == null) {
                if (moderatorActionInfo6 != null) {
                    return false;
                }
            } else if (!moderatorActionInfo5.equals(moderatorActionInfo6)) {
                return false;
            }
            return this.issueActionTargetUids.equals(moderatorSoftMuteModel.issueActionTargetUids);
        }
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.issueActionTargetUids, (((((((((((((C66583MXo.A01(this.isCapabilityInitialized ? 1 : 0) + (this.isFeatureEnabled ? 1 : 0)) * 31) + (this.actionCapabilitiesAsModerator ? 1 : 0)) * 31) + (this.actionCapabilitiesAsParticipant ? 1 : 0)) * 31) + this.conferenceParticipantCapabilities.hashCode()) * 31) + AnonymousClass7TG.A0C(this.actionIssued)) * 31) + AnonymousClass7TG.A0C(this.actionPending)) * 31) + AnonymousClass7TE.A0L(this.actionExecuted)) * 31);
    }

    public ModeratorSoftMuteModel(boolean z, boolean z2, boolean z3, boolean z4, Map map, ModeratorActionInfo moderatorActionInfo, ModeratorActionInfo moderatorActionInfo2, ModeratorActionInfo moderatorActionInfo3, HashSet hashSet) {
        map.getClass();
        hashSet.getClass();
        this.isCapabilityInitialized = z;
        this.isFeatureEnabled = z2;
        this.actionCapabilitiesAsModerator = z3;
        this.actionCapabilitiesAsParticipant = z4;
        this.conferenceParticipantCapabilities = map;
        this.actionIssued = moderatorActionInfo;
        this.actionPending = moderatorActionInfo2;
        this.actionExecuted = moderatorActionInfo3;
        this.issueActionTargetUids = hashSet;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ModeratorSoftMuteModel{isCapabilityInitialized=");
        A1A.append(this.isCapabilityInitialized);
        A1A.append(",isFeatureEnabled=");
        A1A.append(this.isFeatureEnabled);
        A1A.append(",actionCapabilitiesAsModerator=");
        A1A.append(this.actionCapabilitiesAsModerator);
        A1A.append(",actionCapabilitiesAsParticipant=");
        A1A.append(this.actionCapabilitiesAsParticipant);
        A1A.append(",conferenceParticipantCapabilities=");
        A1A.append(this.conferenceParticipantCapabilities);
        A1A.append(",actionIssued=");
        A1A.append(this.actionIssued);
        A1A.append(",actionPending=");
        A1A.append(this.actionPending);
        A1A.append(",actionExecuted=");
        A1A.append(this.actionExecuted);
        A1A.append(",issueActionTargetUids=");
        return C66582MXn.A0v(this.issueActionTargetUids, A1A);
    }
}
