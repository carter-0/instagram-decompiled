package com.facebook.rsys.rooms.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C66581MXm;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class RoomJoiningModel {
    public final boolean active;
    public final boolean canAnonymousUserJoin;
    public final RoomCapabilityModel capabilities;
    public final String conferenceName;
    public final int groupRoomType;
    public final boolean isAudioOnly;
    public final boolean isE2eEncrypted;
    public final boolean isHostPresent;
    public final Boolean isJoinPermissionMutable;
    public final boolean isOnlineLearningSpace;
    public final boolean isVideoAllowed;
    public final boolean isWorkrooms;
    public final int joinPermissionSetting;
    public final Long linkId;
    public final String linkUrl;
    public final int lockStatus;
    public final RoomMetadataModel metadata;
    public final boolean notInAudience;
    public final boolean open;
    public final int participantCount;
    public final boolean roomChatIsCommunityMessagingThread;
    public final boolean shouldDisplayBloksLobby;
    public final boolean shouldJoinWithAudio;

    public static native RoomJoiningModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomJoiningModel)) {
                return false;
            }
            RoomJoiningModel roomJoiningModel = (RoomJoiningModel) obj;
            if (!this.linkUrl.equals(roomJoiningModel.linkUrl)) {
                return false;
            }
            Long l = this.linkId;
            Long l2 = roomJoiningModel.linkId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (this.participantCount != roomJoiningModel.participantCount || this.active != roomJoiningModel.active || this.open != roomJoiningModel.open || this.notInAudience != roomJoiningModel.notInAudience || this.lockStatus != roomJoiningModel.lockStatus || this.canAnonymousUserJoin != roomJoiningModel.canAnonymousUserJoin || this.isHostPresent != roomJoiningModel.isHostPresent || this.isE2eEncrypted != roomJoiningModel.isE2eEncrypted || !this.metadata.equals(roomJoiningModel.metadata) || !this.capabilities.equals(roomJoiningModel.capabilities)) {
                return false;
            }
            String str = this.conferenceName;
            String str2 = roomJoiningModel.conferenceName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.joinPermissionSetting != roomJoiningModel.joinPermissionSetting) {
                return false;
            }
            Boolean bool = this.isJoinPermissionMutable;
            Boolean bool2 = roomJoiningModel.isJoinPermissionMutable;
            if (bool == null) {
                if (bool2 != null) {
                    return false;
                }
            } else if (!bool.equals(bool2)) {
                return false;
            }
            if (!(this.isAudioOnly == roomJoiningModel.isAudioOnly && this.isOnlineLearningSpace == roomJoiningModel.isOnlineLearningSpace && this.roomChatIsCommunityMessagingThread == roomJoiningModel.roomChatIsCommunityMessagingThread && this.groupRoomType == roomJoiningModel.groupRoomType && this.isVideoAllowed == roomJoiningModel.isVideoAllowed && this.shouldDisplayBloksLobby == roomJoiningModel.shouldDisplayBloksLobby && this.shouldJoinWithAudio == roomJoiningModel.shouldJoinWithAudio && this.isWorkrooms == roomJoiningModel.isWorkrooms)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((AnonymousClass7TF.A07(this.capabilities, AnonymousClass7TF.A07(this.metadata, (((((((((((((((((C66583MXo.A06(this.linkUrl) + AnonymousClass7TG.A0C(this.linkId)) * 31) + this.participantCount) * 31) + (this.active ? 1 : 0)) * 31) + (this.open ? 1 : 0)) * 31) + (this.notInAudience ? 1 : 0)) * 31) + this.lockStatus) * 31) + (this.canAnonymousUserJoin ? 1 : 0)) * 31) + (this.isHostPresent ? 1 : 0)) * 31) + (this.isE2eEncrypted ? 1 : 0)) * 31)) + AnonymousClass7TG.A0E(this.conferenceName)) * 31) + this.joinPermissionSetting) * 31) + AnonymousClass7TE.A0L(this.isJoinPermissionMutable)) * 31) + (this.isAudioOnly ? 1 : 0)) * 31) + (this.isOnlineLearningSpace ? 1 : 0)) * 31) + (this.roomChatIsCommunityMessagingThread ? 1 : 0)) * 31) + this.groupRoomType) * 31) + (this.isVideoAllowed ? 1 : 0)) * 31) + (this.shouldDisplayBloksLobby ? 1 : 0)) * 31) + (this.shouldJoinWithAudio ? 1 : 0)) * 31) + (this.isWorkrooms ? 1 : 0);
    }

    public RoomJoiningModel(String str, Long l, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, boolean z5, boolean z6, RoomMetadataModel roomMetadataModel, RoomCapabilityModel roomCapabilityModel, String str2, int i3, Boolean bool, boolean z7, boolean z8, boolean z9, int i4, boolean z10, boolean z11, boolean z12, boolean z13) {
        C66581MXm.A1R(str, roomMetadataModel, roomCapabilityModel);
        this.linkUrl = str;
        this.linkId = l;
        this.participantCount = i;
        this.active = z;
        this.open = z2;
        this.notInAudience = z3;
        this.lockStatus = i2;
        this.canAnonymousUserJoin = z4;
        this.isHostPresent = z5;
        this.isE2eEncrypted = z6;
        this.metadata = roomMetadataModel;
        this.capabilities = roomCapabilityModel;
        this.conferenceName = str2;
        this.joinPermissionSetting = i3;
        this.isJoinPermissionMutable = bool;
        this.isAudioOnly = z7;
        this.isOnlineLearningSpace = z8;
        this.roomChatIsCommunityMessagingThread = z9;
        this.groupRoomType = i4;
        this.isVideoAllowed = z10;
        this.shouldDisplayBloksLobby = z11;
        this.shouldJoinWithAudio = z12;
        this.isWorkrooms = z13;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RoomJoiningModel{linkUrl=");
        A1A.append(this.linkUrl);
        A1A.append(",linkId=");
        A1A.append(this.linkId);
        A1A.append(",participantCount=");
        A1A.append(this.participantCount);
        A1A.append(",active=");
        A1A.append(this.active);
        A1A.append(",open=");
        A1A.append(this.open);
        A1A.append(",notInAudience=");
        A1A.append(this.notInAudience);
        A1A.append(",lockStatus=");
        A1A.append(this.lockStatus);
        A1A.append(",canAnonymousUserJoin=");
        A1A.append(this.canAnonymousUserJoin);
        A1A.append(",isHostPresent=");
        A1A.append(this.isHostPresent);
        A1A.append(",isE2eEncrypted=");
        A1A.append(this.isE2eEncrypted);
        A1A.append(",metadata=");
        A1A.append(this.metadata);
        A1A.append(",capabilities=");
        A1A.append(this.capabilities);
        A1A.append(",conferenceName=");
        A1A.append(this.conferenceName);
        A1A.append(",joinPermissionSetting=");
        A1A.append(this.joinPermissionSetting);
        A1A.append(",isJoinPermissionMutable=");
        A1A.append(this.isJoinPermissionMutable);
        A1A.append(",isAudioOnly=");
        A1A.append(this.isAudioOnly);
        A1A.append(",isOnlineLearningSpace=");
        A1A.append(this.isOnlineLearningSpace);
        A1A.append(",roomChatIsCommunityMessagingThread=");
        A1A.append(this.roomChatIsCommunityMessagingThread);
        A1A.append(",groupRoomType=");
        A1A.append(this.groupRoomType);
        A1A.append(",isVideoAllowed=");
        A1A.append(this.isVideoAllowed);
        A1A.append(",shouldDisplayBloksLobby=");
        A1A.append(this.shouldDisplayBloksLobby);
        A1A.append(",shouldJoinWithAudio=");
        A1A.append(this.shouldJoinWithAudio);
        A1A.append(",isWorkrooms=");
        return C66584MXp.A0b(A1A, this.isWorkrooms);
    }
}
