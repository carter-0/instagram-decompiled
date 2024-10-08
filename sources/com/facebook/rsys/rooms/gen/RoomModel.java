package com.facebook.rsys.rooms.gen;

import X.2LV;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;

public class RoomModel {
    public static 2LV CONVERTER = C22181Xwr.A00(53);
    public static long sMcfTypeId;
    public final Boolean canAnonymousUserJoin;
    public final RoomCapabilityModel capabilities;
    public final String conferenceName;
    public final int failureReason;
    public final int groupRoomType;
    public final Boolean isAudioOnly;
    public final Boolean isE2eEncrypted;
    public final Boolean isHostPresent;
    public final Boolean isJoinPermissionMutable;
    public final Boolean isOnlineLearningSpace;
    public final Boolean isVideoAllowed;
    public final Boolean isWorkrooms;
    public final int joinPermissionSetting;
    public final Long linkId;
    public final Boolean locked;
    public final RoomMetadataModel metadata;
    public final UserProfile owner;
    public final Integer participantCount;
    public final RoomResolveConfig resolveConfig;
    public final Boolean roomChatIsCommunityMessagingThread;
    public final Boolean shouldDisplayBloksLobby;
    public final Boolean shouldJoinWithAudio;
    public final int state;
    public final String url;

    public static native RoomModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomModel)) {
                return false;
            }
            RoomModel roomModel = (RoomModel) obj;
            if (this.state != roomModel.state || this.failureReason != roomModel.failureReason || !this.url.equals(roomModel.url)) {
                return false;
            }
            Long l = this.linkId;
            Long l2 = roomModel.linkId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (!this.resolveConfig.equals(roomModel.resolveConfig)) {
                return false;
            }
            UserProfile userProfile = this.owner;
            UserProfile userProfile2 = roomModel.owner;
            if (userProfile == null) {
                if (userProfile2 != null) {
                    return false;
                }
            } else if (!userProfile.equals(userProfile2)) {
                return false;
            }
            Boolean bool = this.locked;
            Boolean bool2 = roomModel.locked;
            if (bool == null) {
                if (bool2 != null) {
                    return false;
                }
            } else if (!bool.equals(bool2)) {
                return false;
            }
            Boolean bool3 = this.canAnonymousUserJoin;
            Boolean bool4 = roomModel.canAnonymousUserJoin;
            if (bool3 == null) {
                if (bool4 != null) {
                    return false;
                }
            } else if (!bool3.equals(bool4)) {
                return false;
            }
            if (this.joinPermissionSetting != roomModel.joinPermissionSetting) {
                return false;
            }
            Boolean bool5 = this.isJoinPermissionMutable;
            Boolean bool6 = roomModel.isJoinPermissionMutable;
            if (bool5 == null) {
                if (bool6 != null) {
                    return false;
                }
            } else if (!bool5.equals(bool6)) {
                return false;
            }
            Integer num = this.participantCount;
            Integer num2 = roomModel.participantCount;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            Boolean bool7 = this.isHostPresent;
            Boolean bool8 = roomModel.isHostPresent;
            if (bool7 == null) {
                if (bool8 != null) {
                    return false;
                }
            } else if (!bool7.equals(bool8)) {
                return false;
            }
            Boolean bool9 = this.isE2eEncrypted;
            Boolean bool10 = roomModel.isE2eEncrypted;
            if (bool9 == null) {
                if (bool10 != null) {
                    return false;
                }
            } else if (!bool9.equals(bool10)) {
                return false;
            }
            RoomMetadataModel roomMetadataModel = this.metadata;
            RoomMetadataModel roomMetadataModel2 = roomModel.metadata;
            if (roomMetadataModel == null) {
                if (roomMetadataModel2 != null) {
                    return false;
                }
            } else if (!roomMetadataModel.equals(roomMetadataModel2)) {
                return false;
            }
            RoomCapabilityModel roomCapabilityModel = this.capabilities;
            RoomCapabilityModel roomCapabilityModel2 = roomModel.capabilities;
            if (roomCapabilityModel == null) {
                if (roomCapabilityModel2 != null) {
                    return false;
                }
            } else if (!roomCapabilityModel.equals(roomCapabilityModel2)) {
                return false;
            }
            String str = this.conferenceName;
            String str2 = roomModel.conferenceName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            Boolean bool11 = this.isAudioOnly;
            Boolean bool12 = roomModel.isAudioOnly;
            if (bool11 == null) {
                if (bool12 != null) {
                    return false;
                }
            } else if (!bool11.equals(bool12)) {
                return false;
            }
            Boolean bool13 = this.isOnlineLearningSpace;
            Boolean bool14 = roomModel.isOnlineLearningSpace;
            if (bool13 == null) {
                if (bool14 != null) {
                    return false;
                }
            } else if (!bool13.equals(bool14)) {
                return false;
            }
            Boolean bool15 = this.roomChatIsCommunityMessagingThread;
            Boolean bool16 = roomModel.roomChatIsCommunityMessagingThread;
            if (bool15 == null) {
                if (bool16 != null) {
                    return false;
                }
            } else if (!bool15.equals(bool16)) {
                return false;
            }
            if (this.groupRoomType != roomModel.groupRoomType) {
                return false;
            }
            Boolean bool17 = this.isVideoAllowed;
            Boolean bool18 = roomModel.isVideoAllowed;
            if (bool17 == null) {
                if (bool18 != null) {
                    return false;
                }
            } else if (!bool17.equals(bool18)) {
                return false;
            }
            Boolean bool19 = this.shouldDisplayBloksLobby;
            Boolean bool20 = roomModel.shouldDisplayBloksLobby;
            if (bool19 == null) {
                if (bool20 != null) {
                    return false;
                }
            } else if (!bool19.equals(bool20)) {
                return false;
            }
            Boolean bool21 = this.shouldJoinWithAudio;
            Boolean bool22 = roomModel.shouldJoinWithAudio;
            if (bool21 == null) {
                if (bool22 != null) {
                    return false;
                }
            } else if (!bool21.equals(bool22)) {
                return false;
            }
            Boolean bool23 = this.isWorkrooms;
            Boolean bool24 = roomModel.isWorkrooms;
            if (bool23 != null) {
                return bool23.equals(bool24);
            }
            if (bool24 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        String str = this.url;
        return ((((((((((((((((((((((((((((((((((((AnonymousClass7TF.A07(this.resolveConfig, (AnonymousClass7TF.A08(str, (C66583MXo.A01(this.state) + this.failureReason) * 31) + AnonymousClass7TG.A0C(this.linkId)) * 31) + AnonymousClass7TG.A0C(this.owner)) * 31) + AnonymousClass7TG.A0C(this.locked)) * 31) + AnonymousClass7TG.A0C(this.canAnonymousUserJoin)) * 31) + this.joinPermissionSetting) * 31) + AnonymousClass7TG.A0C(this.isJoinPermissionMutable)) * 31) + AnonymousClass7TG.A0C(this.participantCount)) * 31) + AnonymousClass7TG.A0C(this.isHostPresent)) * 31) + AnonymousClass7TG.A0C(this.isE2eEncrypted)) * 31) + AnonymousClass7TG.A0C(this.metadata)) * 31) + AnonymousClass7TG.A0C(this.capabilities)) * 31) + AnonymousClass7TG.A0E(this.conferenceName)) * 31) + AnonymousClass7TG.A0C(this.isAudioOnly)) * 31) + AnonymousClass7TG.A0C(this.isOnlineLearningSpace)) * 31) + AnonymousClass7TG.A0C(this.roomChatIsCommunityMessagingThread)) * 31) + this.groupRoomType) * 31) + AnonymousClass7TG.A0C(this.isVideoAllowed)) * 31) + AnonymousClass7TG.A0C(this.shouldDisplayBloksLobby)) * 31) + AnonymousClass7TG.A0C(this.shouldJoinWithAudio)) * 31) + AnonymousClass7TE.A0L(this.isWorkrooms);
    }

    public RoomModel(int i, int i2, String str, Long l, RoomResolveConfig roomResolveConfig, UserProfile userProfile, Boolean bool, Boolean bool2, int i3, Boolean bool3, Integer num, Boolean bool4, Boolean bool5, RoomMetadataModel roomMetadataModel, RoomCapabilityModel roomCapabilityModel, String str2, Boolean bool6, Boolean bool7, Boolean bool8, int i4, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12) {
        str.getClass();
        roomResolveConfig.getClass();
        this.state = i;
        this.failureReason = i2;
        this.url = str;
        this.linkId = l;
        this.resolveConfig = roomResolveConfig;
        this.owner = userProfile;
        this.locked = bool;
        this.canAnonymousUserJoin = bool2;
        this.joinPermissionSetting = i3;
        this.isJoinPermissionMutable = bool3;
        this.participantCount = num;
        this.isHostPresent = bool4;
        this.isE2eEncrypted = bool5;
        this.metadata = roomMetadataModel;
        this.capabilities = roomCapabilityModel;
        this.conferenceName = str2;
        this.isAudioOnly = bool6;
        this.isOnlineLearningSpace = bool7;
        this.roomChatIsCommunityMessagingThread = bool8;
        this.groupRoomType = i4;
        this.isVideoAllowed = bool9;
        this.shouldDisplayBloksLobby = bool10;
        this.shouldJoinWithAudio = bool11;
        this.isWorkrooms = bool12;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RoomModel{state=");
        A1A.append(this.state);
        A1A.append(",failureReason=");
        A1A.append(this.failureReason);
        A1A.append(",url=");
        A1A.append(this.url);
        A1A.append(",linkId=");
        A1A.append(this.linkId);
        A1A.append(",resolveConfig=");
        A1A.append(this.resolveConfig);
        A1A.append(AnonymousClass000.A00(2057));
        A1A.append(this.owner);
        A1A.append(",locked=");
        A1A.append(this.locked);
        A1A.append(",canAnonymousUserJoin=");
        A1A.append(this.canAnonymousUserJoin);
        A1A.append(",joinPermissionSetting=");
        A1A.append(this.joinPermissionSetting);
        A1A.append(",isJoinPermissionMutable=");
        A1A.append(this.isJoinPermissionMutable);
        A1A.append(",participantCount=");
        A1A.append(this.participantCount);
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
        return C66582MXn.A0v(this.isWorkrooms, A1A);
    }
}
