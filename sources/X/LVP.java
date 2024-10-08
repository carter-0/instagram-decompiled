package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState;
import com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent;
import com.instagram.contentnotes.domain.uistate.NoteTextStringResourceContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.creation.capture.assetpicker.model.ShoppingMultiProductConfig;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NoOpCreationLayoutConfig;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.controller.visibility.VisibilityControllerComponentInterface$State;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.creation.capture.quickcapture.precapture.PreCaptureButtonManagerIntf$State;
import com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient;
import com.instagram.creation.capture.quickcapture.sundial.edit.nux.EducationNuxType;
import com.instagram.creation.capture.quickcapture.sundial.remix.model.ClipsRemixControllerSavedState;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;
import com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams;
import com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage;
import com.instagram.creation.genai.magicmod.model.ExpanderConfig;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.creation.genai.magicmod.model.MagicModTopicInfo;
import com.instagram.creation.photo.edit.effectfilter.UnifiedVideoCoverFrameFilter;
import com.instagram.creation.photo.edit.filter.UnifiedFilterParamCallbackImpl;
import com.instagram.creation.photo.util.ExifImageData;
import com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.creation.state.CreationState;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.creatortools.api.schemas.CreatorToolsComponent;
import com.instagram.creatortools.api.schemas.EligibilityCriteria;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.direct.emojipong.data.EmojiPongUser;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeOneWinnerShareInfo;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengePromptShareInfo;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeSubmissionShareInfo;
import com.instagram.direct.fragment.prompts.dailyprompt.model.DailyPromptsShareInfo;
import com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel;
import com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent;
import com.instagram.direct.inbox.notes.reply.QuickReplySheetContent;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;
import com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo;
import com.instagram.direct.model.launcher.AutoSendMessageData;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.direct.model.textformatting.FormattedText;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class LVP implements Parcelable.Creator {
    public final int A00;

    public static void A01(Parcel parcel) {
        0qQ.A0B(parcel, 0);
        parcel.readInt();
    }

    public LVP(int i) {
        this.A00 = i;
    }

    public static LVP A00(int i) {
        return new LVP(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.os.Parcel} */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.direct.model.thread.DiscoverableThreadInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, com.instagram.direct.model.textformatting.FormattedText] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.direct.model.mentions.SendMentionData$MentionData, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Object, com.instagram.direct.model.DirectAREffectShare] */
    /* JADX WARNING: type inference failed for: r0v22, types: [com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v328, types: [java.lang.Object, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo] */
    /* JADX WARNING: type inference failed for: r0v334, types: [com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v335, types: [com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v345, types: [com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v350, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v358, types: [android.view.View$BaseSavedState, java.lang.Object, com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker$SavedState] */
    /* JADX WARNING: type inference failed for: r0v401, types: [android.view.View$BaseSavedState, com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r48) {
        /*
            r47 = this;
            r0 = r47
            int r0 = r0.A00
            r1 = r48
            switch(r0) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x00d4;
                case 2: goto L_0x00de;
                case 3: goto L_0x00e8;
                case 4: goto L_0x027b;
                case 5: goto L_0x02a3;
                case 6: goto L_0x02a9;
                case 7: goto L_0x02b3;
                case 8: goto L_0x02bd;
                case 9: goto L_0x02c9;
                case 10: goto L_0x02d7;
                case 11: goto L_0x02e1;
                case 12: goto L_0x0324;
                case 13: goto L_0x000f;
                case 14: goto L_0x034e;
                case 15: goto L_0x0364;
                case 16: goto L_0x0386;
                case 17: goto L_0x0390;
                case 18: goto L_0x0399;
                case 19: goto L_0x03af;
                case 20: goto L_0x03e2;
                case 21: goto L_0x044e;
                case 22: goto L_0x04c3;
                case 23: goto L_0x04cf;
                case 24: goto L_0x04ff;
                case 25: goto L_0x051a;
                case 26: goto L_0x0520;
                case 27: goto L_0x052e;
                case 28: goto L_0x0544;
                case 29: goto L_0x055e;
                case 30: goto L_0x0567;
                case 31: goto L_0x0579;
                case 32: goto L_0x0587;
                case 33: goto L_0x05a5;
                case 34: goto L_0x05b7;
                case 35: goto L_0x05dc;
                case 36: goto L_0x05ee;
                case 37: goto L_0x062b;
                case 38: goto L_0x063d;
                case 39: goto L_0x067f;
                case 40: goto L_0x0695;
                case 41: goto L_0x06a7;
                case 42: goto L_0x06e4;
                case 43: goto L_0x0703;
                case 44: goto L_0x071e;
                case 45: goto L_0x0724;
                case 46: goto L_0x006e;
                case 47: goto L_0x072d;
                case 48: goto L_0x077e;
                case 49: goto L_0x078d;
                case 50: goto L_0x0799;
                case 51: goto L_0x07de;
                case 52: goto L_0x0832;
                case 53: goto L_0x0899;
                case 54: goto L_0x08cb;
                case 55: goto L_0x08ed;
                case 56: goto L_0x0903;
                case 57: goto L_0x0921;
                case 58: goto L_0x0930;
                case 59: goto L_0x093f;
                case 60: goto L_0x094e;
                case 61: goto L_0x096d;
                case 62: goto L_0x0973;
                case 63: goto L_0x0979;
                case 64: goto L_0x097f;
                case 65: goto L_0x0985;
                case 66: goto L_0x098e;
                case 67: goto L_0x09a9;
                case 68: goto L_0x0a0a;
                case 69: goto L_0x0a49;
                case 70: goto L_0x0a7c;
                case 71: goto L_0x0ab7;
                case 72: goto L_0x0af5;
                case 73: goto L_0x0b2f;
                case 74: goto L_0x0b49;
                case 75: goto L_0x0b6e;
                case 76: goto L_0x0baf;
                case 77: goto L_0x0bd6;
                case 78: goto L_0x0c01;
                case 79: goto L_0x0c35;
                case 80: goto L_0x0c44;
                case 81: goto L_0x0c92;
                case 82: goto L_0x0d28;
                case 83: goto L_0x0d52;
                case 84: goto L_0x0d68;
                case 85: goto L_0x0d6e;
                case 86: goto L_0x0db9;
                case 87: goto L_0x0e53;
                case 88: goto L_0x1155;
                case 89: goto L_0x1163;
                case 90: goto L_0x12c3;
                case 91: goto L_0x12fe;
                case 92: goto L_0x133a;
                case 93: goto L_0x1388;
                case 94: goto L_0x13b3;
                case 95: goto L_0x13c5;
                case 96: goto L_0x13db;
                case 97: goto L_0x13f3;
                case 98: goto L_0x1419;
                default: goto L_0x0009;
            }
        L_0x0009:
            A01(r1)
            com.instagram.direct.msys.subtype.MsysThreadSubtype$BlendDualSendNoNetwork r0 = com.instagram.direct.msys.subtype.MsysThreadSubtype.BlendDualSendNoNetwork.A00
        L_0x000e:
            return r0
        L_0x000f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState r0 = new com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState
            r0.<init>(r1)
            r2 = 9
            float[] r2 = new float[r2]
            r0.A06 = r2
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            r0.A03 = r2
            int r2 = r1.readInt()
            r0.A00 = r2
            java.lang.String r2 = r1.readString()
            r0.A01 = r2
            java.lang.String r2 = r1.readString()
            r0.A02 = r2
            int r2 = r1.readInt()
            r6 = 0
            r3 = 1
            boolean r2 = X.AnonymousClass7TF.A1S(r2, r3)
            r0.A04 = r2
            float[] r2 = r0.A06
            r1.readFloatArray(r2)
            java.lang.String[] r2 = r1.createStringArray()
            r0.A07 = r2
            int r2 = r1.readInt()
            if (r2 == r3) goto L_0x0054
            r3 = 0
        L_0x0054:
            r0.A05 = r3
            int r5 = r1.readInt()
        L_0x005a:
            if (r6 >= r5) goto L_0x000e
            java.lang.String r4 = r1.readString()
            java.lang.Class<com.instagram.creation.capture.gallery.GalleryPreviewInfo> r2 = com.instagram.creation.capture.gallery.GalleryPreviewInfo.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r2)
            java.util.Map r2 = r0.A03
            r2.put(r4, r3)
            int r6 = r6 + 1
            goto L_0x005a
        L_0x006e:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.photo.util.ExifImageData r0 = new com.instagram.creation.photo.util.ExifImageData
            r0.<init>()
            double r3 = r1.readDouble()
            r7 = 0
            r5 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b3
            r2 = r7
        L_0x0086:
            r0.A01 = r2
            double r3 = r1.readDouble()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0094
            java.lang.Double r7 = java.lang.Double.valueOf(r3)
        L_0x0094:
            r0.A02 = r7
            int r2 = r1.readInt()
            r0.A00 = r2
            int r6 = r1.readInt()
            r5 = 0
        L_0x00a1:
            if (r5 >= r6) goto L_0x000e
            java.lang.String r4 = r1.readString()
            java.lang.String r3 = r1.readString()
            java.util.HashMap r2 = r0.A03
            r2.put(r4, r3)
            int r5 = r5 + 1
            goto L_0x00a1
        L_0x00b3:
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            goto L_0x0086
        L_0x00b8:
            java.lang.String r5 = X.C41848B3p.A1D(r1)
            int r4 = r1.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x00c5:
            if (r2 == r4) goto L_0x00ce
            android.os.Parcelable$Creator r0 = com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState.CREATOR
            int r2 = X.JTT.A04(r1, r0, r3, r2)
            goto L_0x00c5
        L_0x00ce:
            com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState r0 = new com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState
            r0.<init>(r5, r3)
            return r0
        L_0x00d4:
            java.lang.String r1 = X.C41848B3p.A1D(r1)
            com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent r0 = new com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent
            r0.<init>(r1)
            return r0
        L_0x00de:
            int r1 = X.C41848B3p.A00(r1)
            com.instagram.contentnotes.domain.uistate.NoteTextStringResourceContent r0 = new com.instagram.contentnotes.domain.uistate.NoteTextStringResourceContent
            r0.<init>(r1)
            return r0
        L_0x00e8:
            java.lang.String r21 = X.C41848B3p.A1D(r1)
            java.lang.Class<com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState> r2 = com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState.class
            android.os.Parcelable r7 = X.C41847B3o.A03(r1, r2)
            com.instagram.contentnotes.domain.uistate.NoteTextContent r7 = (com.instagram.contentnotes.domain.uistate.NoteTextContent) r7
            android.os.Parcelable r6 = X.C41847B3o.A03(r1, r2)
            com.instagram.common.typedurl.ImageUrl r6 = (com.instagram.common.typedurl.ImageUrl) r6
            boolean r33 = X.C41848B3p.A1X(r1)
            java.lang.String r22 = r1.readString()
            java.lang.String r23 = r1.readString()
            int r0 = r1.readInt()
            r20 = 0
            if (r0 != 0) goto L_0x0188
            r16 = r20
        L_0x0110:
            android.os.Parcelable r5 = X.C41847B3o.A03(r1, r2)
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            boolean r34 = X.C41848B3p.A1X(r1)
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x0128
            long r3 = r1.readLong()
            java.lang.Long r20 = java.lang.Long.valueOf(r3)
        L_0x0128:
            int r31 = r1.readInt()
            java.lang.String r24 = r1.readString()
            java.lang.String r3 = r1.readString()
            r0 = 4370(0x1112, float:6.124E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x015b
            java.lang.Integer r17 = X.AnonymousClass05K.A00
        L_0x0142:
            java.lang.String r25 = r1.readString()
            java.lang.String r26 = r1.readString()
            int r3 = r1.readInt()
            java.util.ArrayList r9 = X.DbS.A0v(r3)
            r0 = 0
        L_0x0153:
            if (r0 == r3) goto L_0x018d
            X.C41848B3p.A1J(r1, r2, r9)
            int r0 = r0 + 1
            goto L_0x0153
        L_0x015b:
            r0 = 4381(0x111d, float:6.139E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x016a
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            goto L_0x0142
        L_0x016a:
            r0 = 2307(0x903, float:3.233E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0179
            java.lang.Integer r17 = X.AnonymousClass05K.A0C
            goto L_0x0142
        L_0x0179:
            r0 = 2308(0x904, float:3.234E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0276
            java.lang.Integer r17 = X.AnonymousClass05K.A0N
            goto L_0x0142
        L_0x0188:
            java.lang.Integer r16 = X.C41847B3o.A12(r1)
            goto L_0x0110
        L_0x018d:
            int r3 = r1.readInt()
            java.util.ArrayList r8 = X.DbS.A0v(r3)
            r0 = 0
        L_0x0196:
            if (r0 == r3) goto L_0x019e
            X.C41848B3p.A1J(r1, r2, r8)
            int r0 = r0 + 1
            goto L_0x0196
        L_0x019e:
            boolean r35 = X.C41848B3p.A1X(r1)
            boolean r36 = X.C41848B3p.A1X(r1)
            java.lang.String r0 = r1.readString()
            java.lang.String r3 = "NOT_MIMICRY"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0230
            java.lang.Integer r18 = X.AnonymousClass05K.A00
        L_0x01b4:
            boolean r37 = X.C41848B3p.A1X(r1)
            java.lang.String r27 = r1.readString()
            android.os.Parcelable r4 = X.C41847B3o.A03(r1, r2)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            int r32 = r1.readInt()
            boolean r38 = X.C41848B3p.A1X(r1)
            java.lang.String r0 = r1.readString()
            java.lang.String r3 = "NONE"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0212
            java.lang.Integer r19 = X.AnonymousClass05K.A00
        L_0x01d8:
            boolean r39 = X.C41848B3p.A1X(r1)
            boolean r40 = X.C41848B3p.A1X(r1)
            boolean r41 = X.C41848B3p.A1X(r1)
            boolean r42 = X.C41848B3p.A1X(r1)
            boolean r43 = X.C41848B3p.A1X(r1)
            boolean r44 = X.C41848B3p.A1X(r1)
            boolean r45 = X.C41848B3p.A1X(r1)
            boolean r46 = X.C41848B3p.A1X(r1)
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r2)
            com.instagram.api.schemas.NoteCustomTheme r2 = (com.instagram.api.schemas.NoteCustomTheme) r2
            java.lang.String r28 = r1.readString()
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r0 = new com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState
            r10 = r0
            r11 = r2
            r12 = r6
            r13 = r4
            r14 = r7
            r15 = r5
            r29 = r9
            r30 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return r0
        L_0x0212:
            r3 = 2195(0x893, float:3.076E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0221
            java.lang.Integer r19 = X.AnonymousClass05K.A01
            goto L_0x01d8
        L_0x0221:
            r3 = 2506(0x9ca, float:3.512E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x026c
            java.lang.Integer r19 = X.AnonymousClass05K.A0C
            goto L_0x01d8
        L_0x0230:
            java.lang.String r3 = "OVERFLOW_SHEET_MIMICRY"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x023c
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            goto L_0x01b4
        L_0x023c:
            java.lang.String r3 = "COMMENT_SHEET_MIMICRY"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0248
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
            goto L_0x01b4
        L_0x0248:
            java.lang.String r3 = "NUX_ON_REC_MIMICRY"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0254
            java.lang.Integer r18 = X.AnonymousClass05K.A0N
            goto L_0x01b4
        L_0x0254:
            java.lang.String r3 = "IMMERSIVE_REPLY_MIMICRY"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0260
            java.lang.Integer r18 = X.AnonymousClass05K.A0Y
            goto L_0x01b4
        L_0x0260:
            java.lang.String r3 = "VIEWER_MIMICRY"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0271
            java.lang.Integer r18 = X.AnonymousClass05K.A0j
            goto L_0x01b4
        L_0x026c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0271:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0276:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r3)
            throw r0
        L_0x027b:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent> r5 = com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent.class
            android.os.Parcelable r4 = X.C41847B3o.A03(r1, r5)
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r4 = (com.instagram.contentnotes.data.metadata.ContentNoteMetadata) r4
            int r0 = r1.readInt()
            r3 = 1
            boolean r2 = X.AnonymousClass7TF.A1P(r0)
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0297
            r3 = 0
        L_0x0297:
            android.os.Parcelable r1 = X.C41847B3o.A03(r1, r5)
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r1 = (com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState) r1
            com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent r0 = new com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x02a3:
            com.instagram.creation.base.CreationSession r0 = new com.instagram.creation.base.CreationSession
            r0.<init>(r1)
            return r0
        L_0x02a9:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.base.PhotoSession r0 = new com.instagram.creation.base.PhotoSession
            r0.<init>(r1)
            return r0
        L_0x02b3:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.base.VideoSession r0 = new com.instagram.creation.base.VideoSession
            r0.<init>(r1)
            return r0
        L_0x02bd:
            com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker$SavedState r0 = new com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker$SavedState
            r0.<init>(r1)
            int r1 = r1.readInt()
            r0.A00 = r1
            return r0
        L_0x02c9:
            int r2 = X.C41848B3p.A00(r1)
            int r1 = r1.readInt()
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = new com.instagram.creation.base.ui.mediatabbar.Tab
            r0.<init>(r2, r1)
            return r0
        L_0x02d7:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.capture.assetpicker.model.ShoppingMultiProductConfig r0 = new com.instagram.creation.capture.assetpicker.model.ShoppingMultiProductConfig
            r0.<init>(r1)
            return r0
        L_0x02e1:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel> r0 = com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = (com.instagram.common.gallery.metadata.MediaUploadMetadata) r2
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            int r8 = r1.readInt()
            int r9 = r1.readInt()
            int r10 = r1.readInt()
            int r11 = r1.readInt()
            int r12 = r1.readInt()
            boolean r13 = X.C41848B3p.A1X(r1)
            java.lang.String r0 = r1.readString()
            X.9sG r3 = X.C391049sG.valueOf(r0)
            float r6 = r1.readFloat()
            float r7 = r1.readFloat()
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r0 = new com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0324:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            float[] r4 = r1.createFloatArray()
            java.lang.String r3 = r1.readString()
            java.lang.Class<com.instagram.creation.base.CropInfo> r0 = com.instagram.creation.base.CropInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.creation.base.CropInfo r2 = (com.instagram.creation.base.CropInfo) r2
            java.lang.Class<com.instagram.creation.photo.util.ExifImageData> r0 = com.instagram.creation.photo.util.ExifImageData.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r1, r0)
            com.instagram.creation.photo.util.ExifImageData r1 = (com.instagram.creation.photo.util.ExifImageData) r1
            com.instagram.creation.capture.gallery.GalleryPreviewInfo r0 = new com.instagram.creation.capture.gallery.GalleryPreviewInfo
            r0.<init>()
            r0.A03 = r4
            r0.A02 = r3
            r0.A00 = r2
            r0.A01 = r1
            return r0
        L_0x034e:
            java.lang.String r4 = X.C41848B3p.A1D(r1)
            java.lang.String r3 = r1.readString()
            float r2 = r1.readFloat()
            boolean r1 = X.C41848B3p.A1X(r1)
            com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig r0 = new com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x0364:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            float r4 = r1.readFloat()
            float r3 = r1.readFloat()
            float r2 = r1.readFloat()
            float r1 = r1.readFloat()
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r0 = new com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation
            r0.<init>()
            r0.A01 = r4
            r0.A02 = r3
            r0.A03 = r2
            r0.A00 = r1
            return r0
        L_0x0386:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r0 = new com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo
            r0.<init>(r1)
            return r0
        L_0x0390:
            A01(r1)
            com.instagram.creation.capture.quickcapture.aspectratioutil.NoOpCreationLayoutConfig r0 = new com.instagram.creation.capture.quickcapture.aspectratioutil.NoOpCreationLayoutConfig
            r0.<init>()
            return r0
        L_0x0399:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel> r0 = com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.MediaVCRTappableData r2 = (com.instagram.api.schemas.MediaVCRTappableData) r2
            boolean r1 = X.C41848B3p.A1X(r1)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = new com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel
            r0.<init>(r2, r1)
            return r0
        L_0x03af:
            int r3 = X.C41848B3p.A00(r1)
            int r4 = r1.readInt()
            int r5 = r1.readInt()
            boolean r6 = X.C41848B3p.A1X(r1)
            java.lang.Class<com.instagram.creation.capture.quickcapture.controller.visibility.VisibilityControllerComponentInterface$State> r0 = com.instagram.creation.capture.quickcapture.controller.visibility.VisibilityControllerComponentInterface$State.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            boolean r7 = X.C41848B3p.A1X(r1)
            boolean r8 = X.C41848B3p.A1X(r1)
            boolean r9 = X.C41848B3p.A1X(r1)
            boolean r10 = X.C41848B3p.A1X(r1)
            boolean r11 = X.C41848B3p.A1X(r1)
            com.instagram.creation.capture.quickcapture.controller.visibility.VisibilityControllerComponentInterface$State r0 = new com.instagram.creation.capture.quickcapture.controller.visibility.VisibilityControllerComponentInterface$State
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x03e2:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration r0 = new com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration
            r0.<init>()
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            r0.A02 = r2
            X.28D r5 = X.28D.A5J
            r0.A01 = r5
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            android.os.Parcelable$Creator r2 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration.CREATOR
            r1.readTypedList(r3, r2)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r3)
            r0.A02 = r2
            int r2 = r1.readInt()
            r0.A00 = r2
            byte r2 = r1.readByte()
            r4 = 1
            boolean r2 = X.AnonymousClass7TF.A1P(r2)
            r0.A06 = r2
            java.io.Serializable r2 = r1.readSerializable()
            X.28D r2 = (X.28D) r2
            if (r2 != 0) goto L_0x044b
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "unknown camera entry point"
            r3.append(r2)
            java.io.Serializable r2 = r1.readSerializable()
            java.lang.String r3 = X.AnonymousClass7TF.A0i(r2, r3)
            java.lang.String r2 = "EffectInfoBottomSheetConfiguration"
            X.0kD.A01(r2, r3)
            r0.A01 = r5
        L_0x0431:
            java.lang.String r2 = r1.readString()
            r0.A03 = r2
            byte r2 = r1.readByte()
            boolean r2 = X.AnonymousClass7TF.A1P(r2)
            r0.A05 = r2
            byte r1 = r1.readByte()
            if (r1 != 0) goto L_0x0448
            r4 = 0
        L_0x0448:
            r0.A04 = r4
            return r0
        L_0x044b:
            r0.A01 = r2
            goto L_0x0431
        L_0x044e:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration r0 = new com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration
            r0.<init>()
            java.lang.Class<com.instagram.model.effect.AREffect> r2 = com.instagram.model.effect.AREffect.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r2)
            r2.getClass()
            com.instagram.model.effect.AREffect r2 = (com.instagram.model.effect.AREffect) r2
            r0.A04 = r2
            java.lang.String r2 = r1.readString()
            r2.getClass()
            r0.A06 = r2
            java.lang.Class<com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution> r2 = com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r2)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r2 = (com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) r2
            r0.A00 = r2
            java.lang.String r2 = r1.readString()
            r0.A07 = r2
            java.lang.String r2 = r1.readString()
            r0.A09 = r2
            java.lang.String r3 = r1.readString()
            X.6Kv r2 = X.C306106Ku.A01
            X.6Ku r2 = r2.A00(r3)
            r0.A02 = r2
            java.lang.Class<com.instagram.model.shopping.ProductAREffectContainer> r2 = com.instagram.model.shopping.ProductAREffectContainer.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r2)
            com.instagram.model.shopping.ProductAREffectContainer r2 = (com.instagram.model.shopping.ProductAREffectContainer) r2
            r0.A05 = r2
            java.lang.String r2 = r1.readString()
            r0.A08 = r2
            java.lang.Class<com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode> r2 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r2)
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r2 = (com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode) r2
            r0.A01 = r2
            java.io.Serializable r2 = r1.readSerializable()
            X.Kit r2 = (X.C62622Kit) r2
            r0.A03 = r2
            byte r2 = r1.readByte()
            r4 = 0
            r3 = 1
            boolean r2 = X.AnonymousClass7TF.A1S(r2, r3)
            r0.A0B = r2
            byte r1 = r1.readByte()
            if (r1 != r3) goto L_0x04c0
            r4 = 1
        L_0x04c0:
            r0.A0A = r4
            return r0
        L_0x04c3:
            java.lang.String r0 = r1.readString()
            r0.getClass()
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r0 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.valueOf(r0)
            return r0
        L_0x04cf:
            java.lang.String r6 = X.C41848B3p.A1D(r1)
            int r3 = r1.readInt()
            java.util.ArrayList r5 = X.DbS.A0v(r3)
            r4 = 0
            r2 = 0
        L_0x04dd:
            if (r2 == r3) goto L_0x04e7
            java.lang.Class<com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config> r0 = com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config.class
            X.C41848B3p.A1J(r1, r0, r5)
            int r2 = r2 + 1
            goto L_0x04dd
        L_0x04e7:
            int r3 = r1.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r3)
        L_0x04ef:
            if (r4 == r3) goto L_0x04f9
            java.lang.Class<com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config> r0 = com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config.class
            X.C41848B3p.A1J(r1, r0, r2)
            int r4 = r4 + 1
            goto L_0x04ef
        L_0x04f9:
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config r0 = new com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config
            r0.<init>(r5, r2, r6)
            return r0
        L_0x04ff:
            java.lang.String r3 = X.C41848B3p.A1D(r1)
            java.lang.String r2 = r1.readString()
            int r1 = r1.readInt()
            X.AnonymousClass7TG.A1O(r3, r2)
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo r0 = new com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo
            r0.<init>()
            r0.A02 = r3
            r0.A01 = r2
            r0.A00 = r1
            return r0
        L_0x051a:
            com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive r0 = new com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive
            r0.<init>(r1)
            return r0
        L_0x0520:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.ArrayList r1 = r1.createStringArrayList()
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = new com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim
            r0.<init>(r1)
            return r0
        L_0x052e:
            int r0 = X.C41848B3p.A00(r1)
            if (r0 != 0) goto L_0x053b
            r1 = 0
        L_0x0535:
            com.instagram.creation.capture.quickcapture.precapture.PreCaptureButtonManagerIntf$State r0 = new com.instagram.creation.capture.quickcapture.precapture.PreCaptureButtonManagerIntf$State
            r0.<init>(r1)
            return r0
        L_0x053b:
            boolean r0 = X.C41848B3p.A1X(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            goto L_0x0535
        L_0x0544:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient> r0 = com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r3 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r3
            boolean r2 = X.C41848B3p.A1X(r1)
            int r1 = r1.readInt()
            com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient r0 = new com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient
            r0.<init>(r3, r1, r2)
            return r0
        L_0x055e:
            java.lang.String r0 = X.C41848B3p.A1D(r1)
            com.instagram.creation.capture.quickcapture.sundial.edit.nux.EducationNuxType r0 = com.instagram.creation.capture.quickcapture.sundial.edit.nux.EducationNuxType.valueOf(r0)
            return r0
        L_0x0567:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r2 = X.C41848B3p.A1X(r1)
            java.lang.String r1 = r1.readString()
            com.instagram.creation.capture.quickcapture.sundial.remix.model.ClipsRemixControllerSavedState r0 = new com.instagram.creation.capture.quickcapture.sundial.remix.model.ClipsRemixControllerSavedState
            r0.<init>(r2, r1)
            return r0
        L_0x0579:
            java.lang.String r2 = X.C41848B3p.A1D(r1)
            boolean r1 = X.C41848B3p.A1X(r1)
            com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel r0 = new com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel
            r0.<init>(r2, r1)
            return r0
        L_0x0587:
            java.lang.String r4 = X.C41848B3p.A1D(r1)
            java.lang.String r3 = r1.readString()
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem> r0 = com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            java.lang.String r0 = r1.readString()
            X.8JL r1 = X.AnonymousClass8JL.valueOf(r0)
            com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem r0 = new com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem
            r0.<init>(r1, r2, r4, r3)
            return r0
        L_0x05a5:
            java.lang.String r3 = X.C41848B3p.A1D(r1)
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r0 = new com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption
            r0.<init>(r3, r2, r1)
            return r0
        L_0x05b7:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker> r0 = com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r0)
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            float r4 = r1.readFloat()
            float r5 = r1.readFloat()
            int r6 = r1.readInt()
            com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker r0 = new com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L_0x05dc:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers> r0 = com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r1, r0)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers r0 = new com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers
            r0.<init>(r1)
            return r0
        L_0x05ee:
            java.lang.String r8 = X.C41848B3p.A1D(r1)
            java.lang.String r9 = r1.readString()
            int r3 = r1.readInt()
            java.util.ArrayList r5 = X.DbS.A0v(r3)
            r4 = 0
            r2 = 0
        L_0x0600:
            if (r2 == r3) goto L_0x0609
            android.os.Parcelable$Creator r0 = com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker.CREATOR
            int r2 = X.JTT.A04(r1, r0, r5, r2)
            goto L_0x0600
        L_0x0609:
            java.lang.String r0 = r1.readString()
            X.UwR r7 = X.C16522UwR.valueOf(r0)
            int r3 = r1.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r3)
        L_0x0619:
            if (r4 == r3) goto L_0x0622
            android.os.Parcelable$Creator r0 = com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers.CREATOR
            int r4 = X.JTT.A04(r1, r0, r2, r4)
            goto L_0x0619
        L_0x0622:
            com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel r0 = new com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel
            r6 = r0
            r10 = r5
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x062b:
            java.lang.String r3 = X.C41848B3p.A1D(r1)
            java.lang.String r2 = r1.readString()
            int r1 = r1.readInt()
            com.instagram.creation.channels.model.AddChannelsRowChannelInfo r0 = new com.instagram.creation.channels.model.AddChannelsRowChannelInfo
            r0.<init>(r3, r2, r1)
            return r0
        L_0x063d:
            java.lang.String r2 = X.C41848B3p.A1D(r1)
            java.lang.String r0 = "IMAGINE_ME"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0659
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x064b:
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams r0 = new com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams
            r0.<init>(r2, r3, r1)
            return r0
        L_0x0659:
            java.lang.String r0 = "IMAGINE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0664
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x064b
        L_0x0664:
            java.lang.String r0 = "AI_CONTEXTUAL_BACKGROUND"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x066f
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x064b
        L_0x066f:
            java.lang.String r0 = "MEMU_IN_FEED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x067a
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x064b
        L_0x067a:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x067f:
            java.lang.String r3 = X.C41848B3p.A1D(r1)
            java.lang.Class<com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage> r0 = com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            java.lang.String r1 = r1.readString()
            com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage r0 = new com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage
            r0.<init>(r2, r3, r1)
            return r0
        L_0x0695:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.creation.genai.magicmod.model.ExpanderConfig> r0 = com.instagram.creation.genai.magicmod.model.ExpanderConfig.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r1, r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            com.instagram.creation.genai.magicmod.model.ExpanderConfig r0 = new com.instagram.creation.genai.magicmod.model.ExpanderConfig
            r0.<init>(r1)
            return r0
        L_0x06a7:
            int r0 = X.C41848B3p.A00(r1)
            r5 = 0
            if (r0 != 0) goto L_0x06dd
            r4 = r5
        L_0x06af:
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r4 = (com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform) r4
            java.lang.Class<com.instagram.creation.genai.magicmod.model.MagicModLaunchParams> r0 = com.instagram.creation.genai.magicmod.model.MagicModLaunchParams.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig) r3
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x06d6
            r2 = r5
        L_0x06c0:
            com.instagram.creation.genai.magicmod.model.MagicModTopicInfo r2 = (com.instagram.creation.genai.magicmod.model.MagicModTopicInfo) r2
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x06ce
            android.os.Parcelable$Creator r0 = com.instagram.creation.genai.magicmod.model.ExpanderConfig.CREATOR
            java.lang.Object r5 = r0.createFromParcel(r1)
        L_0x06ce:
            com.instagram.creation.genai.magicmod.model.ExpanderConfig r5 = (com.instagram.creation.genai.magicmod.model.ExpanderConfig) r5
            com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r0 = new com.instagram.creation.genai.magicmod.model.MagicModLaunchParams
            r0.<init>(r3, r5, r4, r2)
            return r0
        L_0x06d6:
            android.os.Parcelable$Creator r0 = com.instagram.creation.genai.magicmod.model.MagicModTopicInfo.CREATOR
            java.lang.Object r2 = r0.createFromParcel(r1)
            goto L_0x06c0
        L_0x06dd:
            android.os.Parcelable$Creator r0 = com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform.CREATOR
            java.lang.Object r4 = r0.createFromParcel(r1)
            goto L_0x06af
        L_0x06e4:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            float r2 = r1.readFloat()
            float r3 = r1.readFloat()
            float r4 = r1.readFloat()
            float r5 = r1.readFloat()
            float r6 = r1.readFloat()
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r0 = new com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L_0x0703:
            java.lang.String r2 = X.C41848B3p.A1D(r1)
            boolean r6 = X.C41848B3p.A1X(r1)
            java.lang.String r3 = r1.readString()
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            com.instagram.creation.genai.magicmod.model.MagicModTopicInfo r0 = new com.instagram.creation.genai.magicmod.model.MagicModTopicInfo
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L_0x071e:
            com.instagram.creation.photo.edit.effectfilter.UnifiedVideoCoverFrameFilter r0 = new com.instagram.creation.photo.edit.effectfilter.UnifiedVideoCoverFrameFilter
            r0.<init>(r1)
            return r0
        L_0x0724:
            A01(r1)
            com.instagram.creation.photo.edit.filter.UnifiedFilterParamCallbackImpl r0 = new com.instagram.creation.photo.edit.filter.UnifiedFilterParamCallbackImpl
            r0.<init>()
            return r0
        L_0x072d:
            java.lang.String r9 = X.C41848B3p.A1D(r1)
            java.lang.String r10 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0753
            r8 = 0
        L_0x073c:
            boolean r12 = X.C41848B3p.A1X(r1)
            int r3 = r1.readInt()
            java.util.ArrayList r4 = X.DbS.A0v(r3)
            r2 = 0
        L_0x0749:
            java.lang.Class<com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig> r0 = com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig.class
            if (r2 == r3) goto L_0x075c
            X.C41848B3p.A1J(r1, r0, r4)
            int r2 = r2 + 1
            goto L_0x0749
        L_0x0753:
            boolean r0 = X.C41848B3p.A1X(r1)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            goto L_0x073c
        L_0x075c:
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.BrandedContentProjectMetadata r3 = (com.instagram.api.schemas.BrandedContentProjectMetadata) r3
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.BrandedContentGatingInfo r2 = (com.instagram.api.schemas.BrandedContentGatingInfo) r2
            boolean r13 = X.C41848B3p.A1X(r1)
            boolean r14 = X.C41848B3p.A1X(r1)
            boolean r15 = X.C41848B3p.A1X(r1)
            com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig r0 = new com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig
            r5 = r0
            r6 = r2
            r7 = r3
            r11 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L_0x077e:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType[] r2 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x078d:
            java.lang.String r0 = r1.readString()
            r0.getClass()
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.valueOf(r0)
            return r0
        L_0x0799:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            long r9 = r1.readLong()
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            int r0 = r1.readInt()
            r4 = 0
            if (r0 != 0) goto L_0x07d9
            r2 = r4
        L_0x07b9:
            java.lang.Integer r3 = X.Dbc.A0C(r1)
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x07c7
            java.lang.Integer r4 = X.C41847B3o.A12(r1)
        L_0x07c7:
            boolean r11 = X.C41848B3p.A1X(r1)
            java.lang.Class<com.instagram.creator.achievements.modules.models.Badge$AchievementBadge> r0 = com.instagram.creator.achievements.modules.models.Badge.AchievementBadge.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.Achievement r1 = (com.instagram.api.schemas.Achievement) r1
            com.instagram.creator.achievements.modules.models.Badge$AchievementBadge r0 = new com.instagram.creator.achievements.modules.models.Badge$AchievementBadge
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return r0
        L_0x07d9:
            java.lang.Integer r2 = X.C41847B3o.A12(r1)
            goto L_0x07b9
        L_0x07de:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            long r13 = r1.readLong()
            java.lang.String r8 = r1.readString()
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            int r0 = r1.readInt()
            r5 = 0
            if (r0 != 0) goto L_0x080d
            r7 = r5
        L_0x07fa:
            int r6 = r1.readInt()
            java.util.ArrayList r4 = X.DbS.A0v(r6)
            r3 = 0
            r2 = 0
        L_0x0804:
            if (r2 == r6) goto L_0x0812
            android.os.Parcelable$Creator r0 = com.instagram.creator.achievements.modules.models.Badge.AchievementBadge.CREATOR
            int r2 = X.JTT.A04(r1, r0, r4, r2)
            goto L_0x0804
        L_0x080d:
            java.lang.Integer r7 = X.C41847B3o.A12(r1)
            goto L_0x07fa
        L_0x0812:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x0829
            int r2 = r1.readInt()
            java.util.ArrayList r5 = X.DbS.A0v(r2)
        L_0x0820:
            if (r3 == r2) goto L_0x0829
            android.os.Parcelable$Creator r0 = com.instagram.creator.achievements.modules.models.Badge.AchievementBadge.CREATOR
            int r3 = X.JTT.A04(r1, r0, r5, r3)
            goto L_0x0820
        L_0x0829:
            com.instagram.creator.achievements.modules.models.Badge$AchievementTieredBadge r0 = new com.instagram.creator.achievements.modules.models.Badge$AchievementTieredBadge
            r6 = r0
            r11 = r4
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0832:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            long r14 = r1.readLong()
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            java.lang.String r11 = r1.readString()
            int r0 = r1.readInt()
            r4 = 0
            if (r0 != 0) goto L_0x0894
            r2 = r4
        L_0x085e:
            java.lang.Integer r3 = X.Dbc.A0C(r1)
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x086c
            java.lang.Integer r4 = X.C41847B3o.A12(r1)
        L_0x086c:
            int r0 = r1.readInt()
            r17 = 0
            boolean r16 = X.AnonymousClass7TF.A1P(r0)
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x087e
            r17 = 1
        L_0x087e:
            java.lang.String r12 = r1.readString()
            java.lang.String r13 = r1.readString()
            java.lang.Class<com.instagram.creator.achievements.modules.models.Badge$ChallengeBadge> r0 = com.instagram.creator.achievements.modules.models.Badge.ChallengeBadge.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.Challenge r1 = (com.instagram.api.schemas.Challenge) r1
            com.instagram.creator.achievements.modules.models.Badge$ChallengeBadge r0 = new com.instagram.creator.achievements.modules.models.Badge$ChallengeBadge
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17)
            return r0
        L_0x0894:
            java.lang.Integer r2 = X.C41847B3o.A12(r1)
            goto L_0x085e
        L_0x0899:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            long r10 = r1.readLong()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.Integer r5 = X.JTU.A0U(r1)
            int r4 = r1.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x08ba:
            if (r2 == r4) goto L_0x08c3
            android.os.Parcelable$Creator r0 = com.instagram.creator.achievements.modules.models.Badge.ChallengeBadge.CREATOR
            int r2 = X.JTT.A04(r1, r0, r3, r2)
            goto L_0x08ba
        L_0x08c3:
            com.instagram.creator.achievements.modules.models.Badge$ChallengeTieredBadge r0 = new com.instagram.creator.achievements.modules.models.Badge$ChallengeTieredBadge
            r4 = r0
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x08cb:
            java.lang.String r4 = X.C41848B3p.A1D(r1)
            java.lang.String r3 = r1.readString()
            java.lang.String r2 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x08e4
            r1 = 0
        L_0x08de:
            com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext r0 = new com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext
            r0.<init>(r1, r4, r3, r2)
            return r0
        L_0x08e4:
            java.lang.String r0 = r1.readString()
            X.KkE r1 = X.C62652KkE.valueOf(r0)
            goto L_0x08de
        L_0x08ed:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.creatormessaging.intf.CategorySelectionScreenArgs> r0 = com.instagram.creatormessaging.intf.CategorySelectionScreenArgs.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.FanClubCategoryType r2 = (com.instagram.api.schemas.FanClubCategoryType) r2
            java.lang.String r1 = r1.readString()
            com.instagram.creatormessaging.intf.CategorySelectionScreenArgs r0 = new com.instagram.creatormessaging.intf.CategorySelectionScreenArgs
            r0.<init>(r2, r1)
            return r0
        L_0x0903:
            int r0 = X.C41848B3p.A00(r1)
            if (r0 != 0) goto L_0x091a
            r3 = 0
        L_0x090a:
            com.instagram.creatormessaging.intf.CategorySelectionScreenArgs r3 = (com.instagram.creatormessaging.intf.CategorySelectionScreenArgs) r3
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r0 = new com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs
            r0.<init>(r3, r2, r1)
            return r0
        L_0x091a:
            android.os.Parcelable$Creator r0 = com.instagram.creatormessaging.intf.CategorySelectionScreenArgs.CREATOR
            java.lang.Object r3 = r0.createFromParcel(r1)
            goto L_0x090a
        L_0x0921:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creatortools.api.schemas.CreatorToolsComponent[] r2 = com.instagram.creatortools.api.schemas.CreatorToolsComponent.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0930:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creatortools.api.schemas.EligibilityCriteria[] r2 = com.instagram.creatortools.api.schemas.EligibilityCriteria.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x093f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creatortools.api.schemas.ValuePropsFlow[] r2 = com.instagram.creatortools.api.schemas.ValuePropsFlow.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x094e:
            java.lang.String r2 = X.C41848B3p.A1D(r1)
            java.lang.String r3 = r1.readString()
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            boolean r7 = X.C41848B3p.A1X(r1)
            com.instagram.direct.appwidget.DirectThreadWidgetItem r0 = new com.instagram.direct.appwidget.DirectThreadWidgetItem
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x096d:
            A01(r1)
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig$NestedTray r0 = com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig.NestedTray.A00
            return r0
        L_0x0973:
            A01(r1)
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig$StandaloneNonDraggableTray r0 = com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig.StandaloneNonDraggableTray.A00
            return r0
        L_0x0979:
            A01(r1)
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig$StandaloneTray r0 = com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig.StandaloneTray.A00
            return r0
        L_0x097f:
            A01(r1)
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig$Tab r0 = com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig.Tab.A00
            return r0
        L_0x0985:
            java.lang.String r0 = X.C41848B3p.A1D(r1)
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.valueOf(r0)
            return r0
        L_0x098e:
            java.lang.String r2 = X.C41848B3p.A1D(r1)
            java.lang.String r3 = r1.readString()
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            int r6 = r1.readInt()
            com.instagram.direct.emojipong.data.EmojiPongUser r0 = new com.instagram.direct.emojipong.data.EmojiPongUser
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L_0x09a9:
            java.lang.String r6 = X.C41848B3p.A1D(r1)
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            int r4 = r1.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r5 = 0
            r2 = 0
        L_0x09c7:
            if (r2 == r4) goto L_0x09d1
            java.lang.Class<com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo> r0 = com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo.class
            X.C41848B3p.A1J(r1, r0, r3)
            int r2 = r2 + 1
            goto L_0x09c7
        L_0x09d1:
            int r4 = r1.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r4)
        L_0x09d9:
            if (r5 == r4) goto L_0x09e3
            java.lang.Class<com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo> r0 = com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo.class
            X.C41848B3p.A1J(r1, r0, r2)
            int r5 = r5 + 1
            goto L_0x09d9
        L_0x09e3:
            int r18 = r1.readInt()
            java.lang.String r11 = r1.readString()
            java.lang.String r12 = r1.readString()
            java.lang.Integer r5 = X.JTU.A0U(r1)
            java.lang.String r13 = r1.readString()
            java.lang.String r14 = r1.readString()
            java.lang.String r15 = r1.readString()
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo r0 = new com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo
            r4 = r0
            r16 = r3
            r17 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0a0a:
            java.lang.String r4 = X.C41848B3p.A1D(r1)
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.Class<com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeOneWinnerShareInfo> r0 = com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeOneWinnerShareInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r2 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r2
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            java.lang.String r11 = r1.readString()
            java.lang.Integer r3 = X.JTU.A0U(r1)
            java.lang.String r12 = r1.readString()
            java.lang.String r13 = r1.readString()
            java.lang.String r14 = r1.readString()
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeOneWinnerShareInfo r0 = new com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeOneWinnerShareInfo
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0a49:
            java.lang.String r3 = X.C41848B3p.A1D(r1)
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.String r9 = r1.readString()
            java.lang.Integer r2 = X.JTU.A0U(r1)
            java.lang.String r10 = r1.readString()
            java.lang.String r11 = r1.readString()
            java.lang.String r12 = r1.readString()
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengePromptShareInfo r0 = new com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengePromptShareInfo
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0a7c:
            java.lang.String r4 = X.C41848B3p.A1D(r1)
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.Class<com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeSubmissionShareInfo> r0 = com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeSubmissionShareInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r2 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r2
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            java.lang.Integer r3 = X.JTU.A0U(r1)
            java.lang.String r11 = r1.readString()
            java.lang.String r12 = r1.readString()
            java.lang.String r13 = r1.readString()
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeSubmissionShareInfo r0 = new com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeSubmissionShareInfo
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0ab7:
            java.lang.String r4 = X.C41848B3p.A1D(r1)
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            int r0 = r1.readInt()
            r3 = 0
            if (r0 != 0) goto L_0x0aec
            r2 = r3
        L_0x0ad3:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x0add
            java.lang.Integer r3 = X.C41847B3o.A12(r1)
        L_0x0add:
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            com.instagram.direct.fragment.prompts.dailyprompt.model.DailyPromptsShareInfo r0 = new com.instagram.direct.fragment.prompts.dailyprompt.model.DailyPromptsShareInfo
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0aec:
            boolean r0 = X.C41848B3p.A1X(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            goto L_0x0ad3
        L_0x0af5:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            long r10 = r1.readLong()
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            int r0 = r1.readInt()
            r4 = 0
            boolean r12 = X.AnonymousClass7TF.A1P(r0)
            int r3 = r1.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r3)
        L_0x0b1a:
            if (r4 == r3) goto L_0x0b23
            android.os.Parcelable$Creator r0 = com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel.CREATOR
            int r4 = X.JTT.A04(r1, r0, r2, r4)
            goto L_0x0b1a
        L_0x0b23:
            int r9 = r1.readInt()
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r0 = new com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel
            r4 = r0
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r12)
            return r0
        L_0x0b2f:
            java.lang.String r4 = X.C41848B3p.A1D(r1)
            java.lang.String r3 = r1.readString()
            java.lang.String r2 = r1.readString()
            java.lang.Class<com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel> r0 = com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r1, r0)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel r0 = new com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel
            r0.<init>(r1, r4, r3, r2)
            return r0
        L_0x0b49:
            int r4 = X.C41848B3p.A00(r1)
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0b52:
            if (r2 == r4) goto L_0x0b64
            java.lang.Class<com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem> r0 = com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r1.readValue(r0)
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x0b52
        L_0x0b64:
            java.lang.String r1 = r1.readString()
            com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem r0 = new com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem
            r0.<init>(r3, r1)
            return r0
        L_0x0b6e:
            java.lang.String r4 = X.C41848B3p.A1D(r1)
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            boolean r13 = X.C41848B3p.A1X(r1)
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.Class<com.instagram.direct.groupinvites.models.InviteLinkShareInfo> r0 = com.instagram.direct.groupinvites.models.InviteLinkShareInfo.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r0)
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            int r10 = r1.readInt()
            int r11 = r1.readInt()
            int r12 = r1.readInt()
            boolean r14 = X.C41848B3p.A1X(r1)
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r9 = r1.readString()
            com.instagram.direct.groupinvites.models.InviteLinkShareInfo r0 = new com.instagram.direct.groupinvites.models.InviteLinkShareInfo
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0baf:
            int r4 = X.C41848B3p.A00(r1)
            java.lang.String r2 = r1.readString()
            java.lang.String r3 = r1.readString()
            int r5 = r1.readInt()
            int r6 = r1.readInt()
            int r7 = r1.readInt()
            int r8 = r1.readInt()
            int r9 = r1.readInt()
            com.instagram.direct.inbox.DirectInviteContactViewModel r0 = new com.instagram.direct.inbox.DirectInviteContactViewModel
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0bd6:
            java.lang.String r7 = X.C41848B3p.A1D(r1)
            java.lang.String r8 = r1.readString()
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            java.lang.Class<com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent> r0 = com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.SocialContextType r3 = (com.instagram.api.schemas.SocialContextType) r3
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            java.lang.String r11 = r1.readString()
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r0 = new com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent
            r4 = r0
            r5 = r3
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0c01:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.os.Parcelable$Creator r0 = com.instagram.direct.inbox.notes.models.NoteAudience.CREATOR
            java.lang.Object r7 = r0.createFromParcel(r1)
            com.instagram.direct.inbox.notes.models.NoteAudience r7 = (com.instagram.direct.inbox.notes.models.NoteAudience) r7
            java.lang.String r6 = r1.readString()
            int r5 = r1.readInt()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0c22
            r3 = 0
        L_0x0c1c:
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r0 = new com.instagram.direct.inbox.notes.models.NoteAudienceItem
            r0.<init>(r7, r6, r3, r5)
            return r0
        L_0x0c22:
            int r4 = r1.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0c2b:
            if (r2 == r4) goto L_0x0c1c
            java.lang.Class<com.instagram.direct.inbox.notes.models.NoteAudienceItem> r0 = com.instagram.direct.inbox.notes.models.NoteAudienceItem.class
            X.C41848B3p.A1J(r1, r0, r3)
            int r2 = r2 + 1
            goto L_0x0c2b
        L_0x0c35:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.direct.inbox.notes.models.NoteCreationSource[] r2 = com.instagram.direct.inbox.notes.models.NoteCreationSource.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0c44:
            int r10 = X.C41848B3p.A00(r1)
            int r11 = r1.readInt()
            java.lang.String r9 = r1.readString()
            int r0 = r1.readInt()
            r4 = 1
            boolean r12 = X.AnonymousClass7TF.A1P(r0)
            java.lang.Class<com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent> r0 = com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.TrackData r3 = (com.instagram.api.schemas.TrackData) r3
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            int r0 = r1.readInt()
            r8 = 0
            if (r0 != 0) goto L_0x0c89
            r7 = r8
        L_0x0c6f:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x0c80
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0c7c
            r4 = 0
        L_0x0c7c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
        L_0x0c80:
            com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent r0 = new com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent
            r4 = r0
            r5 = r3
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0c89:
            boolean r0 = X.C41848B3p.A1X(r1)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            goto L_0x0c6f
        L_0x0c92:
            java.lang.String r19 = X.C41848B3p.A1D(r1)
            java.lang.String r20 = r1.readString()
            java.lang.Class<com.instagram.direct.inbox.notes.reply.QuickReplySheetContent> r0 = com.instagram.direct.inbox.notes.reply.QuickReplySheetContent.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r1, r0)
            com.instagram.common.typedurl.ImageUrl r9 = (com.instagram.common.typedurl.ImageUrl) r9
            java.lang.String r21 = r1.readString()
            long r27 = r1.readLong()
            java.lang.String r22 = r1.readString()
            boolean r29 = X.C41848B3p.A1X(r1)
            int r26 = r1.readInt()
            android.os.Parcelable r8 = X.C41847B3o.A03(r1, r0)
            com.instagram.direct.inbox.notes.models.NoteAudience r8 = (com.instagram.direct.inbox.notes.models.NoteAudience) r8
            java.lang.String r23 = r1.readString()
            boolean r30 = X.C41848B3p.A1X(r1)
            boolean r31 = X.C41848B3p.A1X(r1)
            boolean r32 = X.C41848B3p.A1X(r1)
            boolean r33 = X.C41848B3p.A1X(r1)
            boolean r34 = X.C41848B3p.A1X(r1)
            java.lang.String r24 = r1.readString()
            java.lang.String r25 = r1.readString()
            int r2 = r1.readInt()
            if (r2 != 0) goto L_0x0d21
            r2 = 0
        L_0x0ce3:
            com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent r2 = (com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent) r2
            android.os.Parcelable r7 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.LocationNoteResponseInfo r7 = (com.instagram.api.schemas.LocationNoteResponseInfo) r7
            android.os.Parcelable r6 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.NotePogVideoDict r6 = (com.instagram.api.schemas.NotePogVideoDict) r6
            android.os.Parcelable r5 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.NotePogImageDict r5 = (com.instagram.api.schemas.NotePogImageDict) r5
            android.os.Parcelable r4 = X.C41847B3o.A03(r1, r0)
            com.instagram.api.schemas.GIFNoteResponseInfo r4 = (com.instagram.api.schemas.GIFNoteResponseInfo) r4
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r0)
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r3 = (com.instagram.contentnotes.data.metadata.ContentNoteMetadata) r3
            boolean r35 = X.C41848B3p.A1X(r1)
            boolean r36 = X.C41848B3p.A1X(r1)
            boolean r37 = X.C41848B3p.A1X(r1)
            com.instagram.direct.inbox.notes.reply.QuickReplySheetContent r0 = new com.instagram.direct.inbox.notes.reply.QuickReplySheetContent
            r10 = r0
            r11 = r4
            r12 = r7
            r13 = r5
            r14 = r6
            r15 = r9
            r16 = r3
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r0
        L_0x0d21:
            android.os.Parcelable$Creator r2 = com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent.CREATOR
            java.lang.Object r2 = r2.createFromParcel(r1)
            goto L_0x0ce3
        L_0x0d28:
            java.lang.String r6 = X.C41848B3p.A1D(r1)
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            int r4 = r1.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0d3d:
            if (r2 == r4) goto L_0x0d46
            android.os.Parcelable$Creator r0 = com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel.SectionBulletPoint.CREATOR
            int r2 = X.JTT.A04(r1, r0, r3, r2)
            goto L_0x0d3d
        L_0x0d46:
            java.lang.Integer r5 = X.JTU.A0U(r1)
            com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel r0 = new com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel
            r4 = r0
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x0d52:
            java.lang.String r4 = X.C41848B3p.A1D(r1)
            java.lang.String r3 = r1.readString()
            java.lang.String r2 = r1.readString()
            java.lang.Integer r1 = X.JTU.A0U(r1)
            com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel$SectionBulletPoint r0 = new com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel$SectionBulletPoint
            r0.<init>(r1, r4, r3, r2)
            return r0
        L_0x0d68:
            com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo r0 = new com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo
            r0.<init>(r1)
            return r0
        L_0x0d6e:
            int r4 = X.C41848B3p.A00(r1)
            boolean r5 = X.C41848B3p.A1X(r1)
            boolean r6 = X.C41848B3p.A1X(r1)
            boolean r7 = X.C41848B3p.A1X(r1)
            boolean r8 = X.C41848B3p.A1X(r1)
            boolean r9 = X.C41848B3p.A1X(r1)
            boolean r10 = X.C41848B3p.A1X(r1)
            boolean r11 = X.C41848B3p.A1X(r1)
            boolean r12 = X.C41848B3p.A1X(r1)
            boolean r13 = X.C41848B3p.A1X(r1)
            java.lang.String r2 = r1.readString()
            boolean r14 = X.C41848B3p.A1X(r1)
            boolean r15 = X.C41848B3p.A1X(r1)
            boolean r16 = X.C41848B3p.A1X(r1)
            java.lang.String r3 = r1.readString()
            boolean r17 = X.C41848B3p.A1X(r1)
            boolean r18 = X.C41848B3p.A1X(r1)
            com.instagram.direct.intf.DirectShareSheetAppearance r0 = new com.instagram.direct.intf.DirectShareSheetAppearance
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0db9:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.direct.messagethread.collections.model.DirectCollectionArguments> r4 = com.instagram.direct.messagethread.collections.model.DirectCollectionArguments.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r1, r4)
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.lang.String r12 = r1.readString()
            int r0 = r1.readInt()
            r6 = 1
            r2 = 0
            boolean r19 = X.AnonymousClass7TF.A1P(r0)
            java.lang.String r5 = r1.readString()
            java.lang.String r0 = "THREAD"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0e1e
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x0de1:
            java.lang.String r13 = r1.readString()
            java.lang.String r14 = r1.readString()
            java.lang.String r15 = r1.readString()
            android.os.Parcelable r5 = X.C41847B3o.A03(r1, r4)
            com.instagram.model.direct.DirectThreadKey r5 = (com.instagram.model.direct.DirectThreadKey) r5
            java.lang.String r16 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0e12
            r10 = 0
        L_0x0dfe:
            java.lang.String r17 = r1.readString()
            int r0 = r1.readInt()
            java.util.ArrayList r6 = X.DbS.A0v(r0)
        L_0x0e0a:
            if (r2 == r0) goto L_0x0e43
            X.C41848B3p.A1J(r1, r4, r6)
            int r2 = r2 + 1
            goto L_0x0e0a
        L_0x0e12:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0e19
            r6 = 0
        L_0x0e19:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            goto L_0x0dfe
        L_0x0e1e:
            java.lang.String r0 = "FEED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0e29
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x0de1
        L_0x0e29:
            java.lang.String r0 = "DEEP_LINK"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0e34
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x0de1
        L_0x0e34:
            r0 = 610(0x262, float:8.55E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0e4e
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            goto L_0x0de1
        L_0x0e43:
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = new com.instagram.direct.messagethread.collections.model.DirectCollectionArguments
            r7 = r0
            r8 = r3
            r9 = r5
            r18 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0e4e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r5)
            throw r0
        L_0x0e53:
            java.lang.String r2 = X.C41848B3p.A1D(r1)
            java.lang.String r0 = "MESSAGE_STATUS_TEXT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e93
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x0e61:
            java.lang.String r6 = r1.readString()
            int r0 = r1.readInt()
            r2 = 0
            if (r0 != 0) goto L_0x0e8e
            r5 = r2
        L_0x0e6d:
            java.lang.String r0 = r1.readString()
            X.NkG r3 = X.C69376NkG.valueOf(r0)
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x0e81
            android.os.Parcelable$Creator r0 = com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan.CREATOR
            java.lang.Object r2 = r0.createFromParcel(r1)
        L_0x0e81:
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan r2 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan) r2
            java.lang.String r7 = r1.readString()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r0 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x0e8e:
            java.lang.Integer r5 = X.C41847B3o.A12(r1)
            goto L_0x0e6d
        L_0x0e93:
            java.lang.String r0 = "REPLY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e9e
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0e61
        L_0x0e9e:
            java.lang.String r0 = "COMMENT_REPLY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ea9
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            goto L_0x0e61
        L_0x0ea9:
            java.lang.String r0 = "REPORT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0eb4
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            goto L_0x0e61
        L_0x0eb4:
            java.lang.String r0 = "UNSEND"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ebf
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            goto L_0x0e61
        L_0x0ebf:
            java.lang.String r0 = "REMOVE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0eca
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            goto L_0x0e61
        L_0x0eca:
            java.lang.String r0 = "GOOD_RESULT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ed5
            java.lang.Integer r4 = X.AnonymousClass05K.A0u
            goto L_0x0e61
        L_0x0ed5:
            java.lang.String r0 = "BAD_RESULT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ee0
            java.lang.Integer r4 = X.AnonymousClass05K.A15
            goto L_0x0e61
        L_0x0ee0:
            java.lang.String r0 = "FORWARD"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0eec
            java.lang.Integer r4 = X.AnonymousClass05K.A1F
            goto L_0x0e61
        L_0x0eec:
            java.lang.String r0 = "SHARE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ef8
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            goto L_0x0e61
        L_0x0ef8:
            java.lang.String r0 = "SAVE_MEDIA"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f04
            java.lang.Integer r4 = X.AnonymousClass05K.A02
            goto L_0x0e61
        L_0x0f04:
            java.lang.String r0 = "SAVE_QUICK_REPLY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f10
            java.lang.Integer r4 = X.AnonymousClass05K.A03
            goto L_0x0e61
        L_0x0f10:
            java.lang.String r0 = "COPY_TEXT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f1c
            java.lang.Integer r4 = X.AnonymousClass05K.A04
            goto L_0x0e61
        L_0x0f1c:
            java.lang.String r0 = "UNLIKE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f28
            java.lang.Integer r4 = X.AnonymousClass05K.A05
            goto L_0x0e61
        L_0x0f28:
            java.lang.String r0 = "LIKE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f34
            java.lang.Integer r4 = X.AnonymousClass05K.A06
            goto L_0x0e61
        L_0x0f34:
            java.lang.String r0 = "DETAILS_FOR_EXPIRING_MEDIA"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f40
            java.lang.Integer r4 = X.AnonymousClass05K.A07
            goto L_0x0e61
        L_0x0f40:
            java.lang.String r0 = "CAMERA_REPLY_FOR_EXPIRING_MEDIA"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f4c
            java.lang.Integer r4 = X.AnonymousClass05K.A08
            goto L_0x0e61
        L_0x0f4c:
            java.lang.String r0 = "REPORT_BUG_FOR_VISUAL_MEDIA"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f58
            java.lang.Integer r4 = X.AnonymousClass05K.A09
            goto L_0x0e61
        L_0x0f58:
            java.lang.String r0 = "SEE_ALL_BY_CREATOR"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f64
            java.lang.Integer r4 = X.AnonymousClass05K.A0A
            goto L_0x0e61
        L_0x0f64:
            java.lang.String r0 = "SHARE_TO_STORY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f70
            java.lang.Integer r4 = X.AnonymousClass05K.A0B
            goto L_0x0e61
        L_0x0f70:
            java.lang.String r0 = "PIN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f7c
            java.lang.Integer r4 = X.AnonymousClass05K.A0D
            goto L_0x0e61
        L_0x0f7c:
            java.lang.String r0 = "UNPIN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f88
            java.lang.Integer r4 = X.AnonymousClass05K.A0E
            goto L_0x0e61
        L_0x0f88:
            java.lang.String r0 = "DELETE_SHARED_STACK"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f94
            java.lang.Integer r4 = X.AnonymousClass05K.A0F
            goto L_0x0e61
        L_0x0f94:
            java.lang.String r0 = "EDIT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fa0
            java.lang.Integer r4 = X.AnonymousClass05K.A0G
            goto L_0x0e61
        L_0x0fa0:
            java.lang.String r0 = "MESSAGE_ARMADILLO_EXPRESS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fac
            java.lang.Integer r4 = X.AnonymousClass05K.A0H
            goto L_0x0e61
        L_0x0fac:
            java.lang.String r0 = "GOOD_RESPONSE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fb8
            java.lang.Integer r4 = X.AnonymousClass05K.A0I
            goto L_0x0e61
        L_0x0fb8:
            java.lang.String r0 = "BAD_RESPONSE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fc4
            java.lang.Integer r4 = X.AnonymousClass05K.A0J
            goto L_0x0e61
        L_0x0fc4:
            java.lang.String r0 = "AI_SUBSCRIPTION_MANAGE_UPDATE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fd0
            java.lang.Integer r4 = X.AnonymousClass05K.A0K
            goto L_0x0e61
        L_0x0fd0:
            java.lang.String r0 = "REIMAGINE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fdc
            java.lang.Integer r4 = X.AnonymousClass05K.A0L
            goto L_0x0e61
        L_0x0fdc:
            java.lang.String r0 = "DELETE_MESSAGE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fe8
            java.lang.Integer r4 = X.AnonymousClass05K.A0M
            goto L_0x0e61
        L_0x0fe8:
            java.lang.String r0 = "DELETE_SINGLE_MESSAGE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ff4
            java.lang.Integer r4 = X.AnonymousClass05K.A0O
            goto L_0x0e61
        L_0x0ff4:
            java.lang.String r0 = "TRANSLATE_MESSAGE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1000
            java.lang.Integer r4 = X.AnonymousClass05K.A0P
            goto L_0x0e61
        L_0x1000:
            java.lang.String r0 = "RESTORE_MESSAGE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x100c
            java.lang.Integer r4 = X.AnonymousClass05K.A0Q
            goto L_0x0e61
        L_0x100c:
            java.lang.String r0 = "HIDE_TRANSLATION"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1018
            java.lang.Integer r4 = X.AnonymousClass05K.A0R
            goto L_0x0e61
        L_0x1018:
            java.lang.String r0 = "SHOW_TRANSLATION"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1024
            java.lang.Integer r4 = X.AnonymousClass05K.A0S
            goto L_0x0e61
        L_0x1024:
            java.lang.String r0 = "SAVE_STICKER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1030
            java.lang.Integer r4 = X.AnonymousClass05K.A0T
            goto L_0x0e61
        L_0x1030:
            java.lang.String r0 = "UNSAVE_STICKER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x103c
            java.lang.Integer r4 = X.AnonymousClass05K.A0U
            goto L_0x0e61
        L_0x103c:
            java.lang.String r0 = "MORE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1048
            java.lang.Integer r4 = X.AnonymousClass05K.A0V
            goto L_0x0e61
        L_0x1048:
            java.lang.String r0 = "Debug"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1054
            java.lang.Integer r4 = X.AnonymousClass05K.A0W
            goto L_0x0e61
        L_0x1054:
            java.lang.String r0 = "PAID_PARTNERSHIP"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1060
            java.lang.Integer r4 = X.AnonymousClass05K.A0X
            goto L_0x0e61
        L_0x1060:
            java.lang.String r0 = "CREATOR_AI_INSPECT_MESSAGE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x106c
            java.lang.Integer r4 = X.AnonymousClass05K.A0Z
            goto L_0x0e61
        L_0x106c:
            java.lang.String r0 = "HIDE_BC_REPLY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1078
            java.lang.Integer r4 = X.AnonymousClass05K.A0a
            goto L_0x0e61
        L_0x1078:
            java.lang.String r0 = "UNCOVER_BC_REPLY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1084
            java.lang.Integer r4 = X.AnonymousClass05K.A0b
            goto L_0x0e61
        L_0x1084:
            java.lang.String r0 = "UNHIDE_BC_REPLY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1090
            java.lang.Integer r4 = X.AnonymousClass05K.A0c
            goto L_0x0e61
        L_0x1090:
            java.lang.String r0 = "RESEND"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x109c
            java.lang.Integer r4 = X.AnonymousClass05K.A0d
            goto L_0x0e61
        L_0x109c:
            java.lang.String r0 = "SAVE_CUTOUT_STICKER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10a8
            java.lang.Integer r4 = X.AnonymousClass05K.A0e
            goto L_0x0e61
        L_0x10a8:
            java.lang.String r0 = "ADD_STICKER_REACTION"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10b4
            java.lang.Integer r4 = X.AnonymousClass05K.A0f
            goto L_0x0e61
        L_0x10b4:
            java.lang.String r0 = "XMA_ACTION"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10c0
            java.lang.Integer r4 = X.AnonymousClass05K.A0g
            goto L_0x0e61
        L_0x10c0:
            java.lang.String r0 = "HANDLE_EDIT_AI_FOR_MESSAGE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10cc
            java.lang.Integer r4 = X.AnonymousClass05K.A0h
            goto L_0x0e61
        L_0x10cc:
            java.lang.String r0 = "REGENERATE_AI_RESPONSE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10d8
            java.lang.Integer r4 = X.AnonymousClass05K.A0i
            goto L_0x0e61
        L_0x10d8:
            java.lang.String r0 = "EDIT_WITH_AI_FOR_IMAGE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10e4
            java.lang.Integer r4 = X.AnonymousClass05K.A0k
            goto L_0x0e61
        L_0x10e4:
            java.lang.String r0 = "IMAGINE_ME"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10f0
            java.lang.Integer r4 = X.AnonymousClass05K.A0l
            goto L_0x0e61
        L_0x10f0:
            java.lang.String r0 = "UNSEND_PROMPT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10fc
            java.lang.Integer r4 = X.AnonymousClass05K.A0m
            goto L_0x0e61
        L_0x10fc:
            java.lang.String r0 = "SHARE_PROMPT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1108
            java.lang.Integer r4 = X.AnonymousClass05K.A0n
            goto L_0x0e61
        L_0x1108:
            java.lang.String r0 = "REPORT_PROMPT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1114
            java.lang.Integer r4 = X.AnonymousClass05K.A0o
            goto L_0x0e61
        L_0x1114:
            java.lang.String r0 = "VIEW_STICKER_PACK"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1120
            java.lang.Integer r4 = X.AnonymousClass05K.A0p
            goto L_0x0e61
        L_0x1120:
            java.lang.String r0 = "CREATE_CUTOUT_STICKER_FROM_MEDIA"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x112c
            java.lang.Integer r4 = X.AnonymousClass05K.A0q
            goto L_0x0e61
        L_0x112c:
            java.lang.String r0 = "CREATE_CUTOUT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1138
            java.lang.Integer r4 = X.AnonymousClass05K.A0r
            goto L_0x0e61
        L_0x1138:
            java.lang.String r0 = "CREATE_YOUR_OWN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1144
            java.lang.Integer r4 = X.AnonymousClass05K.A0s
            goto L_0x0e61
        L_0x1144:
            java.lang.String r0 = "NONE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1150
            java.lang.Integer r4 = X.AnonymousClass05K.A0t
            goto L_0x0e61
        L_0x1150:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x1155:
            java.lang.String r2 = X.C41848B3p.A1D(r1)
            int r1 = r1.readInt()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan r0 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan
            r0.<init>(r2, r1)
            return r0
        L_0x1163:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel> r0 = com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r1, r0)
            com.instagram.model.direct.messageid.MessageIdentifier r15 = (com.instagram.model.direct.messageid.MessageIdentifier) r15
            int r38 = r1.readInt()
            int r37 = r1.readInt()
            int r3 = r1.readInt()
            java.util.ArrayList r14 = X.DbS.A0v(r3)
            r2 = 0
        L_0x1180:
            if (r2 == r3) goto L_0x1188
            X.C41848B3p.A1J(r1, r0, r14)
            int r2 = r2 + 1
            goto L_0x1180
        L_0x1188:
            int r3 = r1.readInt()
            java.util.ArrayList r13 = X.DbS.A0v(r3)
            r2 = 0
        L_0x1191:
            if (r2 == r3) goto L_0x1199
            X.C41848B3p.A1J(r1, r0, r13)
            int r2 = r2 + 1
            goto L_0x1191
        L_0x1199:
            java.lang.String r36 = r1.readString()
            long r5 = r1.readLong()
            int r2 = r1.readInt()
            r12 = 0
            if (r2 != 0) goto L_0x12b9
            r2 = r12
        L_0x11a9:
            android.os.Parcelable r11 = X.C41847B3o.A03(r1, r0)
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            android.os.Parcelable r10 = X.C41847B3o.A03(r1, r0)
            android.graphics.Rect r10 = (android.graphics.Rect) r10
            java.util.ArrayList r35 = r1.createStringArrayList()
            java.lang.String r34 = r1.readString()
            java.lang.String r33 = r1.readString()
            boolean r32 = X.C41848B3p.A1X(r1)
            int r3 = r1.readInt()
            if (r3 != 0) goto L_0x12af
            r3 = r12
        L_0x11cc:
            int r4 = r1.readInt()
            if (r4 != 0) goto L_0x12a5
            r4 = r12
        L_0x11d3:
            boolean r31 = X.C41848B3p.A1X(r1)
            boolean r30 = X.C41848B3p.A1X(r1)
            boolean r29 = X.C41848B3p.A1X(r1)
            boolean r28 = X.C41848B3p.A1X(r1)
            int r27 = r1.readInt()
            boolean r26 = X.C41848B3p.A1X(r1)
            boolean r25 = X.C41848B3p.A1X(r1)
            boolean r24 = X.C41848B3p.A1X(r1)
            boolean r23 = X.C41848B3p.A1X(r1)
            java.lang.String r22 = r1.readString()
            java.lang.String r21 = r1.readString()
            java.lang.String r20 = r1.readString()
            boolean r19 = X.C41848B3p.A1X(r1)
            java.lang.String r18 = r1.readString()
            java.util.ArrayList r17 = r1.createStringArrayList()
            java.lang.String r9 = r1.readString()
            boolean r8 = X.C41848B3p.A1X(r1)
            java.lang.Integer r7 = X.Dbc.A0C(r1)
            int r16 = r1.readInt()
            if (r16 == 0) goto L_0x1225
            java.lang.Integer r12 = X.C41847B3o.A12(r1)
        L_0x1225:
            android.os.Parcelable r1 = X.C41847B3o.A03(r1, r0)
            com.instagram.aistudio.logging.AiStudioLoggingData r1 = (com.instagram.aistudio.logging.AiStudioLoggingData) r1
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r0 = new com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel
            r0.<init>()
            r0.A08 = r15
            r15 = r38
            r0.A02 = r15
            r15 = r37
            r0.A00 = r15
            r0.A0L = r14
            r0.A0O = r13
            r13 = r36
            r0.A0K = r13
            r0.A03 = r5
            r0.A07 = r2
            r0.A04 = r11
            r0.A05 = r10
            r2 = r35
            r0.A0N = r2
            r2 = r34
            r0.A0I = r2
            r2 = r33
            r0.A0J = r2
            r2 = r32
            r0.A0Z = r2
            r0.A09 = r3
            r0.A0C = r4
            r2 = r31
            r0.A0Y = r2
            r2 = r30
            r0.A0V = r2
            r2 = r29
            r0.A0X = r2
            r2 = r28
            r0.A0W = r2
            r2 = r27
            r0.A01 = r2
            r2 = r26
            r0.A0T = r2
            r2 = r25
            r0.A0S = r2
            r2 = r24
            r0.A0Q = r2
            r2 = r23
            r0.A0U = r2
            r2 = r22
            r0.A0F = r2
            r2 = r21
            r0.A0D = r2
            r2 = r20
            r0.A0G = r2
            r2 = r19
            r0.A0R = r2
            r2 = r18
            r0.A0E = r2
            r2 = r17
            r0.A0M = r2
            r0.A0H = r9
            r0.A0P = r8
            r0.A0B = r7
            r0.A0A = r12
            r0.A06 = r1
            return r0
        L_0x12a5:
            long r7 = r1.readLong()
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            goto L_0x11d3
        L_0x12af:
            boolean r3 = X.C41848B3p.A1X(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x11cc
        L_0x12b9:
            java.lang.String r2 = r1.readString()
            X.2FW r2 = X.2FW.valueOf(r2)
            goto L_0x11a9
        L_0x12c3:
            java.lang.String r2 = X.C41848B3p.A1D(r1)
            int r10 = r1.readInt()
            java.lang.String r3 = r1.readString()
            int r11 = r1.readInt()
            int r12 = r1.readInt()
            int[] r8 = r1.createIntArray()
            int[] r9 = r1.createIntArray()
            int r13 = r1.readInt()
            int r14 = r1.readInt()
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r0 = new com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x12fe:
            com.instagram.direct.model.DirectAREffectShare r0 = new com.instagram.direct.model.DirectAREffectShare
            r0.<init>()
            java.util.List r2 = java.util.Collections.emptyList()
            r0.A09 = r2
            java.util.List r2 = java.util.Collections.emptyList()
            r0.A0A = r2
            java.lang.String r2 = r1.readString()
            r0.A07 = r2
            java.lang.String r2 = r1.readString()
            r0.A08 = r2
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r3 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r3)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            r0.A01 = r2
            java.lang.String r2 = r1.readString()
            r0.A06 = r2
            java.lang.String r2 = r1.readString()
            r0.A05 = r2
            android.os.Parcelable r1 = X.C41847B3o.A03(r1, r3)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r0.A00 = r1
            return r0
        L_0x133a:
            java.lang.String r6 = X.C41848B3p.A1D(r1)
            java.lang.String r7 = r1.readString()
            boolean r12 = X.C41848B3p.A1X(r1)
            int r0 = r1.readInt()
            r5 = 0
            if (r0 != 0) goto L_0x1383
            r2 = r5
        L_0x134e:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x137e
            r3 = r5
        L_0x1355:
            java.lang.String r8 = r1.readString()
            boolean r13 = X.C41848B3p.A1X(r1)
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            java.lang.Integer r4 = X.Dbc.A0C(r1)
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x1373
            java.lang.Integer r5 = X.C41847B3o.A12(r1)
        L_0x1373:
            java.lang.String r11 = r1.readString()
            com.instagram.direct.model.DirectForwardingParams r0 = new com.instagram.direct.model.DirectForwardingParams
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x137e:
            java.lang.Integer r3 = X.C41847B3o.A12(r1)
            goto L_0x1355
        L_0x1383:
            java.lang.Integer r2 = X.C41847B3o.A12(r1)
            goto L_0x134e
        L_0x1388:
            java.lang.String r3 = X.C41848B3p.A1D(r1)
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            java.lang.Class<com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo> r0 = com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r1, r0)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            int r0 = r1.readInt()
            r7 = 0
            boolean r6 = X.AnonymousClass7TF.A1P(r0)
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x13ac
            r7 = 1
        L_0x13ac:
            com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo r0 = new com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x13b3:
            java.lang.String r3 = X.C41848B3p.A1D(r1)
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.direct.model.launcher.AutoSendMessageData r0 = new com.instagram.direct.model.launcher.AutoSendMessageData
            r0.<init>(r3, r2, r1)
            return r0
        L_0x13c5:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.9Hx r0 = com.instagram.direct.model.mentions.MentionedEntity.CREATOR
            java.util.ArrayList r1 = r1.createTypedArrayList(r0)
            if (r1 != 0) goto L_0x13d3
            X.0sn r1 = X.0sn.A00
        L_0x13d3:
            com.instagram.direct.model.mentions.SendMentionData$MentionData r0 = new com.instagram.direct.model.mentions.SendMentionData$MentionData
            r0.<init>()
            r0.A00 = r1
            return r0
        L_0x13db:
            int r3 = X.C41848B3p.A00(r1)
            int r2 = r1.readInt()
            int r1 = r1.readInt()
            com.instagram.direct.model.textformatting.FormattedText r0 = new com.instagram.direct.model.textformatting.FormattedText
            r0.<init>()
            r0.A01 = r3
            r0.A00 = r2
            r0.A02 = r1
            return r0
        L_0x13f3:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = new com.instagram.direct.model.thread.DiscoverableThreadInfo
            r0.<init>()
            java.lang.String r2 = r1.readString()
            r0.A02 = r2
            byte r2 = r1.readByte()
            boolean r2 = X.AnonymousClass7TF.A1P(r2)
            r0.A03 = r2
            java.lang.String r2 = r1.readString()
            r0.A01 = r2
            java.lang.String r1 = r1.readString()
            r0.A00 = r1
            return r0
        L_0x1419:
            A01(r1)
            com.instagram.direct.msys.subtype.MsysThreadSubtype$BlendDualSend r0 = com.instagram.direct.msys.subtype.MsysThreadSubtype.BlendDualSend.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LVP.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ContentNotesOverflowFragmentUiState[i];
            case 1:
                return new NoteTextStringLiteralContent[i];
            case 2:
                return new NoteTextStringResourceContent[i];
            case 3:
                return new NotesPogThoughtBubbleUiState[i];
            case 4:
                return new ContentNotesImmersiveSelfNoteContent[i];
            case 5:
                return new CreationSession[i];
            case 6:
                return new PhotoSession[i];
            case 7:
                return new VideoSession[0];
            case 8:
                return new FeedColorFilterPicker.SavedState[i];
            case 9:
                return new Tab[i];
            case 10:
                return new ShoppingMultiProductConfig[i];
            case 11:
                return new SharePlatformStickerClientModel[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new GalleryPreviewInfo[i];
            case 13:
                return new GalleryPickerView$SavedState[i];
            case 14:
                return new OpenCarouselCaptureConfig[i];
            case 15:
                return new MediaTransformation[i];
            case 16:
                return new ShareMediaLoggingInfo[i];
            case 17:
                return new NoOpCreationLayoutConfig[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new ReelsVisualRepliesModel[i];
            case 19:
                return new VisibilityControllerComponentInterface$State[i];
            case 20:
                return new EffectInfoBottomSheetConfiguration[i];
            case 21:
                return new EffectInfoAttributionConfiguration[i];
            case 22:
                return new EffectInfoBottomSheetMode[i];
            case 23:
                return new GalleryGridEditMediaSelectionFragment$Config[i];
            case 24:
                return new GallerySuggestionsInfo[i];
            case 25:
                return new FundraiserSharedToLive[i];
            case 26:
                return new IngestSessionShim[i];
            case 27:
                return new PreCaptureButtonManagerIntf$State[i];
            case 28:
                return new GroupProfileStoryRecipient[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new EducationNuxType[i];
            case 30:
                return new ClipsRemixControllerSavedState[i];
            case 31:
                return new ClipsCelebrationReshareViewModel[i];
            case 32:
                return new ClipsPreloadedSettingItem[i];
            case 33:
                return new VoiceOption[i];
            case 34:
                return new SuperlativeMentionSticker[i];
            case 35:
                return new SuperlativeNotifyToUsers[i];
            case 36:
                return new SuperlativeStickerClientModel[i];
            case 37:
                return new AddChannelsRowChannelInfo[i];
            case 38:
                return new CreationGenAIAttributionBottomSheetParams[i];
            case 39:
                return new ContextualBackgroundSourceImage[i];
            case 40:
                return new ExpanderConfig[i];
            case Seq.NULL_REFNUM:
                return new MagicModLaunchParams[i];
            case Seq.RefTracker.REF_OFFSET:
                return new MagicModPostCaptureTransform[i];
            case 43:
                return new MagicModTopicInfo[i];
            case 44:
                return new UnifiedVideoCoverFrameFilter[i];
            case 45:
                return new UnifiedFilterParamCallbackImpl[i];
            case 46:
                return new ExifImageData[i];
            case 47:
                return new ClipsAdvancedSettingsConfig[i];
            case 48:
                return new PublishScreenCategoryType[i];
            case 49:
                return new CreationState[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new Badge.AchievementBadge[i];
            case 51:
                return new Badge.AchievementTieredBadge[i];
            case 52:
                return new Badge.ChallengeBadge[i];
            case 53:
                return new Badge.ChallengeTieredBadge[i];
            case 54:
                return new SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext[i];
            case 55:
                return new CategorySelectionScreenArgs[i];
            case 56:
                return new ChannelCreationFlowExtraArgs[i];
            case 57:
                return new CreatorToolsComponent[i];
            case 58:
                return new EligibilityCriteria[i];
            case 59:
                return new ValuePropsFlow[i];
            case 60:
                return new DirectThreadWidgetItem[i];
            case 61:
                return new DirectAvatarTrayFragmentConfig.NestedTray[i];
            case 62:
                return new DirectAvatarTrayFragmentConfig.StandaloneNonDraggableTray[i];
            case 63:
                return new DirectAvatarTrayFragmentConfig.StandaloneTray[i];
            case 64:
                return new DirectAvatarTrayFragmentConfig.Tab[i];
            case 65:
                return new ChannelCreationSource[i];
            case 66:
                return new EmojiPongUser[i];
            case 67:
                return new ChannelChallengeAllWinnersShareInfo[i];
            case 68:
                return new ChannelChallengeOneWinnerShareInfo[i];
            case 69:
                return new ChannelChallengePromptShareInfo[i];
            case 70:
                return new ChannelChallengeSubmissionShareInfo[i];
            case 71:
                return new DailyPromptsShareInfo[i];
            case 72:
                return new PollMessageOptionViewModel[i];
            case 73:
                return new PollMessageVoterInfoViewModel[i];
            case 74:
                return new ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem[i];
            case 75:
                return new InviteLinkShareInfo[i];
            case 76:
                return new DirectInviteContactViewModel[i];
            case 77:
                return new ClipsInteractionReplySheetContent[i];
            case 78:
                return new NoteAudienceItem[i];
            case 79:
                return new NoteCreationSource[i];
            case 80:
                return new MusicNoteQuickReplySheetContent[i];
            case 81:
                return new QuickReplySheetContent[i];
            case 82:
                return new FullscreenBannerViewModel[i];
            case 83:
                return new FullscreenBannerViewModel.SectionBulletPoint[i];
            case 84:
                return new DirectReplyModalPrivateReplyInfo[i];
            case 85:
                return new Parcelable[i];
            case 86:
                return new DirectCollectionArguments[i];
            case 87:
                return new LongPressActionData[i];
            case 88:
                return new LongPressActionLabelSpan[i];
            case 89:
                return new MessageActionsViewModel[i];
            case 90:
                return new ThemeViewModelDelegate[i];
            case 91:
                return new DirectAREffectShare[i];
            case 92:
                return new DirectForwardingParams[i];
            case 93:
                return new BroadcastChannelXpostingChannelInfo[i];
            case 94:
                return new AutoSendMessageData[i];
            case 95:
                return new SendMentionData$MentionData[i];
            case 96:
                return new FormattedText[i];
            case 97:
                return new DiscoverableThreadInfo[i];
            case 98:
                return new MsysThreadSubtype.BlendDualSend[i];
            default:
                return new MsysThreadSubtype.BlendDualSendNoNetwork[i];
        }
    }
}
