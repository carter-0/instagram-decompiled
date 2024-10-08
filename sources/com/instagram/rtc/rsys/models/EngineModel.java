package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C66583MXo;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationModel;
import com.facebook.rsys.crypto.gen.CryptoE2eeModel;
import com.facebook.rsys.dominantspeaker.gen.DominantSpeakerModel;
import com.facebook.rsys.grid.gen.GridModel;
import com.facebook.rsys.livevideo.gen.LiveVideoModel;
import com.facebook.rsys.moderator.gen.ModeratorSoftMuteModel;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridModel;
import com.facebook.rsys.photobooth.gen.PhotoboothModel;
import com.facebook.rsys.reactions.gen.EmojiReactionsModel;
import com.facebook.rsys.rooms.gen.RoomModel;
import com.facebook.rsys.roomslobby.gen.LobbyModel;
import com.facebook.rsys.screenshare.gen.ScreenShareModel;
import java.util.Map;

public class EngineModel {
    public static 2LV CONVERTER = new C71545Omg(20);
    public static long sMcfTypeId;
    public final AvatarCommunicationModel avatarCommunicationModel;
    public final CallEndedModel callEndedModel;
    public final IgCallModel callModel;
    public final CryptoE2eeModel cryptoE2eeModel;
    public final DominantSpeakerModel dominantSpeakerModel;
    public final EmojiReactionsModel emojiReactionsModel;
    public final GridModel gridModel;
    public final LiveVideoModel liveVideoModel;
    public final LobbyModel lobbyModel;
    public final ModeratorSoftMuteModel moderatorSoftMuteModel;
    public final MosaicGridModel mosaicGridModel;
    public final PhotoboothModel photoboothModel;
    public final Map rawModels;
    public final RoomModel roomModel;
    public final ScreenShareModel screenShareModel;
    public final int state;

    public static native EngineModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EngineModel)) {
                return false;
            }
            EngineModel engineModel = (EngineModel) obj;
            if (this.state != engineModel.state) {
                return false;
            }
            IgCallModel igCallModel = this.callModel;
            IgCallModel igCallModel2 = engineModel.callModel;
            if (igCallModel == null) {
                if (igCallModel2 != null) {
                    return false;
                }
            } else if (!igCallModel.equals(igCallModel2)) {
                return false;
            }
            RoomModel roomModel2 = this.roomModel;
            RoomModel roomModel3 = engineModel.roomModel;
            if (roomModel2 == null) {
                if (roomModel3 != null) {
                    return false;
                }
            } else if (!roomModel2.equals(roomModel3)) {
                return false;
            }
            LobbyModel lobbyModel2 = this.lobbyModel;
            LobbyModel lobbyModel3 = engineModel.lobbyModel;
            if (lobbyModel2 == null) {
                if (lobbyModel3 != null) {
                    return false;
                }
            } else if (!lobbyModel2.equals(lobbyModel3)) {
                return false;
            }
            LiveVideoModel liveVideoModel2 = this.liveVideoModel;
            LiveVideoModel liveVideoModel3 = engineModel.liveVideoModel;
            if (liveVideoModel2 == null) {
                if (liveVideoModel3 != null) {
                    return false;
                }
            } else if (!liveVideoModel2.equals(liveVideoModel3)) {
                return false;
            }
            MosaicGridModel mosaicGridModel2 = this.mosaicGridModel;
            MosaicGridModel mosaicGridModel3 = engineModel.mosaicGridModel;
            if (mosaicGridModel2 == null) {
                if (mosaicGridModel3 != null) {
                    return false;
                }
            } else if (!mosaicGridModel2.equals(mosaicGridModel3)) {
                return false;
            }
            CallEndedModel callEndedModel2 = this.callEndedModel;
            CallEndedModel callEndedModel3 = engineModel.callEndedModel;
            if (callEndedModel2 == null) {
                if (callEndedModel3 != null) {
                    return false;
                }
            } else if (!callEndedModel2.equals(callEndedModel3)) {
                return false;
            }
            GridModel gridModel2 = this.gridModel;
            GridModel gridModel3 = engineModel.gridModel;
            if (gridModel2 == null) {
                if (gridModel3 != null) {
                    return false;
                }
            } else if (!gridModel2.equals(gridModel3)) {
                return false;
            }
            ModeratorSoftMuteModel moderatorSoftMuteModel2 = this.moderatorSoftMuteModel;
            ModeratorSoftMuteModel moderatorSoftMuteModel3 = engineModel.moderatorSoftMuteModel;
            if (moderatorSoftMuteModel2 == null) {
                if (moderatorSoftMuteModel3 != null) {
                    return false;
                }
            } else if (!moderatorSoftMuteModel2.equals(moderatorSoftMuteModel3)) {
                return false;
            }
            PhotoboothModel photoboothModel2 = this.photoboothModel;
            PhotoboothModel photoboothModel3 = engineModel.photoboothModel;
            if (photoboothModel2 == null) {
                if (photoboothModel3 != null) {
                    return false;
                }
            } else if (!photoboothModel2.equals(photoboothModel3)) {
                return false;
            }
            CryptoE2eeModel cryptoE2eeModel2 = this.cryptoE2eeModel;
            CryptoE2eeModel cryptoE2eeModel3 = engineModel.cryptoE2eeModel;
            if (cryptoE2eeModel2 == null) {
                if (cryptoE2eeModel3 != null) {
                    return false;
                }
            } else if (!cryptoE2eeModel2.equals(cryptoE2eeModel3)) {
                return false;
            }
            AvatarCommunicationModel avatarCommunicationModel2 = this.avatarCommunicationModel;
            AvatarCommunicationModel avatarCommunicationModel3 = engineModel.avatarCommunicationModel;
            if (avatarCommunicationModel2 == null) {
                if (avatarCommunicationModel3 != null) {
                    return false;
                }
            } else if (!avatarCommunicationModel2.equals(avatarCommunicationModel3)) {
                return false;
            }
            ScreenShareModel screenShareModel2 = this.screenShareModel;
            ScreenShareModel screenShareModel3 = engineModel.screenShareModel;
            if (screenShareModel2 == null) {
                if (screenShareModel3 != null) {
                    return false;
                }
            } else if (!screenShareModel2.equals(screenShareModel3)) {
                return false;
            }
            EmojiReactionsModel emojiReactionsModel2 = this.emojiReactionsModel;
            EmojiReactionsModel emojiReactionsModel3 = engineModel.emojiReactionsModel;
            if (emojiReactionsModel2 == null) {
                if (emojiReactionsModel3 != null) {
                    return false;
                }
            } else if (!emojiReactionsModel2.equals(emojiReactionsModel3)) {
                return false;
            }
            DominantSpeakerModel dominantSpeakerModel2 = this.dominantSpeakerModel;
            DominantSpeakerModel dominantSpeakerModel3 = engineModel.dominantSpeakerModel;
            if (dominantSpeakerModel2 == null) {
                if (dominantSpeakerModel3 != null) {
                    return false;
                }
            } else if (!dominantSpeakerModel2.equals(dominantSpeakerModel3)) {
                return false;
            }
            return this.rawModels.equals(engineModel.rawModels);
        }
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((C66583MXo.A01(this.state) + AnonymousClass7TG.A0C(this.callModel)) * 31) + AnonymousClass7TG.A0C(this.roomModel)) * 31) + AnonymousClass7TG.A0C(this.lobbyModel)) * 31) + AnonymousClass7TG.A0C(this.liveVideoModel)) * 31) + AnonymousClass7TG.A0C(this.mosaicGridModel)) * 31) + AnonymousClass7TG.A0C(this.callEndedModel)) * 31) + AnonymousClass7TG.A0C(this.gridModel)) * 31) + AnonymousClass7TG.A0C(this.moderatorSoftMuteModel)) * 31) + AnonymousClass7TG.A0C(this.photoboothModel)) * 31) + AnonymousClass7TG.A0C(this.cryptoE2eeModel)) * 31) + AnonymousClass7TG.A0C(this.avatarCommunicationModel)) * 31) + AnonymousClass7TG.A0C(this.screenShareModel)) * 31) + AnonymousClass7TG.A0C(this.emojiReactionsModel)) * 31) + AnonymousClass7TE.A0L(this.dominantSpeakerModel)) * 31) + this.rawModels.hashCode();
    }

    public EngineModel(int i, IgCallModel igCallModel, RoomModel roomModel2, LobbyModel lobbyModel2, LiveVideoModel liveVideoModel2, MosaicGridModel mosaicGridModel2, CallEndedModel callEndedModel2, GridModel gridModel2, ModeratorSoftMuteModel moderatorSoftMuteModel2, PhotoboothModel photoboothModel2, CryptoE2eeModel cryptoE2eeModel2, AvatarCommunicationModel avatarCommunicationModel2, ScreenShareModel screenShareModel2, EmojiReactionsModel emojiReactionsModel2, DominantSpeakerModel dominantSpeakerModel2, Map map) {
        Map map2 = map;
        map2.getClass();
        this.state = i;
        this.callModel = igCallModel;
        this.roomModel = roomModel2;
        this.lobbyModel = lobbyModel2;
        this.liveVideoModel = liveVideoModel2;
        this.mosaicGridModel = mosaicGridModel2;
        this.callEndedModel = callEndedModel2;
        this.gridModel = gridModel2;
        this.moderatorSoftMuteModel = moderatorSoftMuteModel2;
        this.photoboothModel = photoboothModel2;
        this.cryptoE2eeModel = cryptoE2eeModel2;
        this.avatarCommunicationModel = avatarCommunicationModel2;
        this.screenShareModel = screenShareModel2;
        this.emojiReactionsModel = emojiReactionsModel2;
        this.dominantSpeakerModel = dominantSpeakerModel2;
        this.rawModels = map2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EngineModel{state=");
        A1A.append(this.state);
        A1A.append(",callModel=");
        A1A.append(this.callModel);
        A1A.append(",roomModel=");
        A1A.append(this.roomModel);
        A1A.append(",lobbyModel=");
        A1A.append(this.lobbyModel);
        A1A.append(",liveVideoModel=");
        A1A.append(this.liveVideoModel);
        A1A.append(",mosaicGridModel=");
        A1A.append(this.mosaicGridModel);
        A1A.append(",callEndedModel=");
        A1A.append(this.callEndedModel);
        A1A.append(",gridModel=");
        A1A.append(this.gridModel);
        A1A.append(",moderatorSoftMuteModel=");
        A1A.append(this.moderatorSoftMuteModel);
        A1A.append(",photoboothModel=");
        A1A.append(this.photoboothModel);
        A1A.append(",cryptoE2eeModel=");
        A1A.append(this.cryptoE2eeModel);
        A1A.append(",avatarCommunicationModel=");
        A1A.append(this.avatarCommunicationModel);
        A1A.append(",screenShareModel=");
        A1A.append(this.screenShareModel);
        A1A.append(",emojiReactionsModel=");
        A1A.append(this.emojiReactionsModel);
        A1A.append(",dominantSpeakerModel=");
        A1A.append(this.dominantSpeakerModel);
        A1A.append(",rawModels=");
        return C66582MXn.A0v(this.rawModels, A1A);
    }
}
