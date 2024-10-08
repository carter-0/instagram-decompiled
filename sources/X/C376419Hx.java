package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.api.schemas.ProductArtsLabelsDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProfessionalClipsUpsellType;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.api.schemas.ProfilePicUrlInfoImpl;
import com.instagram.api.schemas.ProfilePictureImpl;
import com.instagram.api.schemas.RIXUActionSource;
import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import com.instagram.api.schemas.RIXUPlayType;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.api.schemas.RingSpecPointImpl;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.api.schemas.ShopManagementAccessState;
import com.instagram.api.schemas.ShoppingOnboardingState;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.api.schemas.SocialProofInfoImpl;
import com.instagram.api.schemas.SponsoredAdsDisclaimerType;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryPollColorType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptFailureTooltipDict;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.StoryTemplateCaptionDict;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDict;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDict;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.api.schemas.TIFUAppDestinationEnum;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier;
import com.instagram.api.schemas.ThreadThemeType;
import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.UndoStyle;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.api.schemas.UserTagInfoDict;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WhatsAppAttributionInfoImpl;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import com.instagram.api.schemas.XDTTextPostAppAccountPrivacyOptions;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.common.AvatarInfo;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfo;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;
import com.instagram.direct.model.DirectMessageEditHistory;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.direct.model.mentions.MentionedEntity;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Hx  reason: invalid class name and case insensitive filesystem */
public final class C376419Hx implements Parcelable.Creator {
    public final int A00;

    public C376419Hx(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new PrivateReplyStatus[i];
            case 1:
                return new ProductArtsLabelsDict[i];
            case 2:
                return new ProductReviewStatus[i];
            case 3:
                return new ProfessionalClipsUpsellType[i];
            case 4:
                return new ProfileBannerType[i];
            case 5:
                return new ProfilePicUrlInfoImpl[i];
            case 6:
                return new ProfilePictureImpl[i];
            case 7:
                return new RIXUActionSource[i];
            case 8:
                return new RIXUAspectRatio[i];
            case 9:
                return new RIXUChainingSourceType[i];
            case 10:
                return new RIXUCoverChainingType[i];
            case 11:
                return new RIXUCtaType[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new RIXULayoutFormat[i];
            case 13:
                return new RIXULayoutStyle[i];
            case 14:
                return new RIXUPlayType[i];
            case 15:
                return new ReelAutoArchiveSettingStr[i];
            case 16:
                return new ReplyControlStr[i];
            case 17:
                return new RepostRestrictedReason[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new RingSpecImpl[i];
            case 19:
                return new RingSpecPointImpl[i];
            case 20:
                return new SMBPartnerType[i];
            case 21:
                return new ScreenTimeScreenType[i];
            case 22:
                return new SellerShoppableFeedType[i];
            case 23:
                return new ShopManagementAccessState[i];
            case 24:
                return new ShoppingOnboardingState[i];
            case 25:
                return new SocialContextType[i];
            case 26:
                return new SocialProofInfoImpl[i];
            case 27:
                return new SponsoredAdsDisclaimerType[i];
            case 28:
                return new StickerTraySectionCTAType[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new StoryLinkInfoDict[i];
            case 30:
                return new StoryPollColorType[i];
            case 31:
                return new StoryPromptDisablementState[i];
            case 32:
                return new StoryPromptFailureTooltipDict[i];
            case 33:
                return new StoryPromptTappableData[i];
            case 34:
                return new StoryPromptType[i];
            case 35:
                return new StoryTemplateAssetDict[i];
            case 36:
                return new StoryTemplateCaptionDict[i];
            case 37:
                return new StoryTemplateDict[i];
            case 38:
                return new StoryTemplateFillableStickersDictImpl[i];
            case 39:
                return new StoryTemplateGiphyStickerDict[i];
            case 40:
                return new StoryTemplateGiphyStickerImageDict[i];
            case Seq.NULL_REFNUM:
                return new StoryTemplateMusicStickerDict[i];
            case Seq.RefTracker.REF_OFFSET:
                return new StoryTemplateStaticOverlayDict[i];
            case 43:
                return new SubscriptionStickerDict[i];
            case 44:
                return new SuggestedUsersStyle[i];
            case 45:
                return new TIFUAppDestinationEnum[i];
            case 46:
                return new TextPostAppHeaderFollowVariant[i];
            case 47:
                return new TextPostAppSuggestionCardProfileContextIdentifier[i];
            case 48:
                return new ThreadThemeType[i];
            case 49:
                return new ThreadsInFeedUnitTypeEnum[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new TrackDataImpl[i];
            case 51:
                return new UndoStyle[i];
            case 52:
                return new UserMonetizationProductType[i];
            case 53:
                return new UserTagInfoDict[i];
            case 54:
                return new WearablesAppAttributionType[i];
            case 55:
                return new WhatsAppAttributionInfoImpl[i];
            case 56:
                return new XDTTextAppQuoteAttachmentEligibility[i];
            case 57:
                return new XDTTextPostAppAccountPrivacyOptions[i];
            case 58:
                return new XFBsizeCalibrationScore[i];
            case 59:
                return new AvatarCoinFlipConfig[i];
            case 60:
                return new AvatarCoinFlipSticker[i];
            case 61:
                return new AvatarInfo[i];
            case 62:
                return new CameraAREffect[i];
            case 63:
                return new ClipsViewerConfig[i];
            case 64:
                return new ClipsViewerDirectData[i];
            case 65:
                return new ClipsViewerSource[i];
            case 66:
                return new ClipsWatchAndBrowseData[i];
            case 67:
                return new ClipsReplyBarData[i];
            case 68:
                return new ClipsContextualHighlightInfo[i];
            case 69:
                return new PlaylistContext[i];
            case 70:
                return new Draft[i];
            case 71:
                return new GeneratedMediaMetadata[i];
            case 72:
                return new Medium[i];
            case 73:
                return new RemoteMedia[i];
            case 74:
                return new ImmersiveMediaFields[i];
            case 75:
                return new MediaUploadMetadata[i];
            case 76:
                return new ImageCacheKey[i];
            case 77:
                return new SimpleImageUrl[i];
            case 78:
                return new ReboundHorizontalScrollView.SavedState[i];
            case 79:
                return new SocialContextBubbleUiState[i];
            case 80:
                return new CropInfo[i];
            case 81:
                return new CameraConfiguration[i];
            case 82:
                return new NineSixteenLayoutConfigImpl[i];
            case 83:
                return new CameraSpec[i];
            case 84:
                return new GalleryGridFormat[i];
            case 85:
                return new CaptureRuleSystemState[i];
            case 86:
                return new PhotoFilter[i];
            case 87:
                return new SurfaceCropFilter[i];
            case 88:
                return new Capabilities[i];
            case 89:
                return new MediaViewerReplyBarEligibilityCheckerImpl[i];
            case 90:
                return new NoteAudience[i];
            case 91:
                return new NoteStyle[i];
            case 92:
                return new DirectCountBasedReaction[i];
            case 93:
                return new ReactionViewModel[i];
            case 94:
                return new DirectMessageEditHistory[i];
            case 95:
                return new DirectThreadThemeInfo[i];
            case 96:
                return new DirectMessageComments[i];
            case 97:
                return new MentionedEntity[i];
            case 98:
                return new MessagingUser[i];
            default:
                return new ChannelsContextLine[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.os.Parcel} */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.direct.model.mentions.MentionedEntity] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, com.instagram.direct.model.comments.DirectMessageComments] */
    /* JADX WARNING: type inference failed for: r0v24, types: [com.instagram.direct.model.DirectMessageEditHistory, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v52, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    /* JADX WARNING: type inference failed for: r0v149, types: [android.view.View$BaseSavedState, com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v159, types: [com.instagram.common.gallery.metadata.ImmersiveMediaFields, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v404, types: [java.lang.Object, com.instagram.camera.effect.models.CameraAREffect] */
    /* JADX WARNING: type inference failed for: r0v739, types: [java.lang.Object, com.instagram.direct.model.thread.ChannelsContextLine] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r168) {
        /*
            r167 = this;
            r0 = r167
            int r0 = r0.A00
            r1 = r168
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x0034;
                case 2: goto L_0x0061;
                case 3: goto L_0x0070;
                case 4: goto L_0x007f;
                case 5: goto L_0x008e;
                case 6: goto L_0x00a4;
                case 7: goto L_0x00ba;
                case 8: goto L_0x00c9;
                case 9: goto L_0x00d8;
                case 10: goto L_0x00e7;
                case 11: goto L_0x00f6;
                case 12: goto L_0x0105;
                case 13: goto L_0x0114;
                case 14: goto L_0x0123;
                case 15: goto L_0x0132;
                case 16: goto L_0x0141;
                case 17: goto L_0x0150;
                case 18: goto L_0x015f;
                case 19: goto L_0x01a4;
                case 20: goto L_0x01b6;
                case 21: goto L_0x01c5;
                case 22: goto L_0x01d4;
                case 23: goto L_0x01e3;
                case 24: goto L_0x01f2;
                case 25: goto L_0x0201;
                case 26: goto L_0x0210;
                case 27: goto L_0x022a;
                case 28: goto L_0x0239;
                case 29: goto L_0x0248;
                case 30: goto L_0x02ca;
                case 31: goto L_0x02d9;
                case 32: goto L_0x02e8;
                case 33: goto L_0x02fa;
                case 34: goto L_0x049b;
                case 35: goto L_0x04aa;
                case 36: goto L_0x050b;
                case 37: goto L_0x055a;
                case 38: goto L_0x0629;
                case 39: goto L_0x0662;
                case 40: goto L_0x0684;
                case 41: goto L_0x069e;
                case 42: goto L_0x06f8;
                case 43: goto L_0x072f;
                case 44: goto L_0x0751;
                case 45: goto L_0x0760;
                case 46: goto L_0x076f;
                case 47: goto L_0x077e;
                case 48: goto L_0x078d;
                case 49: goto L_0x079c;
                case 50: goto L_0x07ab;
                case 51: goto L_0x0899;
                case 52: goto L_0x08a8;
                case 53: goto L_0x08b7;
                case 54: goto L_0x0928;
                case 55: goto L_0x0937;
                case 56: goto L_0x0949;
                case 57: goto L_0x0958;
                case 58: goto L_0x0967;
                case 59: goto L_0x0976;
                case 60: goto L_0x09e5;
                case 61: goto L_0x0a08;
                case 62: goto L_0x0a22;
                case 63: goto L_0x0b0b;
                case 64: goto L_0x10b1;
                case 65: goto L_0x1120;
                case 66: goto L_0x112f;
                case 67: goto L_0x1296;
                case 68: goto L_0x1350;
                case 69: goto L_0x1372;
                case 70: goto L_0x1380;
                case 71: goto L_0x13cb;
                case 72: goto L_0x13e1;
                case 73: goto L_0x1525;
                case 74: goto L_0x15a5;
                case 75: goto L_0x15bf;
                case 76: goto L_0x1609;
                case 77: goto L_0x160f;
                case 78: goto L_0x1624;
                case 79: goto L_0x1634;
                case 80: goto L_0x1710;
                case 81: goto L_0x172e;
                case 82: goto L_0x1738;
                case 83: goto L_0x1763;
                case 84: goto L_0x1782;
                case 85: goto L_0x178f;
                case 86: goto L_0x19b8;
                case 87: goto L_0x19be;
                case 88: goto L_0x19fe;
                case 89: goto L_0x1a20;
                case 90: goto L_0x1a42;
                case 91: goto L_0x1a51;
                case 92: goto L_0x1a60;
                case 93: goto L_0x1a7a;
                case 94: goto L_0x1acf;
                case 95: goto L_0x1ae9;
                case 96: goto L_0x1c37;
                case 97: goto L_0x1c51;
                case 98: goto L_0x1c77;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r3 = r1.readString()
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.direct.model.thread.ChannelsContextLine r0 = new com.instagram.direct.model.thread.ChannelsContextLine
            r0.<init>()
            r0.A01 = r3
            r0.A00 = r2
            r0.A02 = r1
            return r0
        L_0x0025:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.PrivateReplyStatus[] r2 = com.instagram.api.schemas.PrivateReplyStatus.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0034:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0045
            r3 = 0
        L_0x003f:
            com.instagram.api.schemas.ProductArtsLabelsDict r0 = new com.instagram.api.schemas.ProductArtsLabelsDict
            r0.<init>(r3)
            return r0
        L_0x0045:
            int r4 = r1.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x004f:
            if (r2 == r4) goto L_0x003f
            java.lang.Class<com.instagram.api.schemas.ProductArtsLabelsDict> r0 = com.instagram.api.schemas.ProductArtsLabelsDict.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r1.readParcelable(r0)
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x004f
        L_0x0061:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ProductReviewStatus[] r2 = com.instagram.api.schemas.ProductReviewStatus.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0070:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ProfessionalClipsUpsellType[] r2 = com.instagram.api.schemas.ProfessionalClipsUpsellType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x007f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ProfileBannerType[] r2 = com.instagram.api.schemas.ProfileBannerType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x008e:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r3 = r1.readInt()
            java.lang.String r2 = r1.readString()
            int r1 = r1.readInt()
            com.instagram.api.schemas.ProfilePicUrlInfoImpl r0 = new com.instagram.api.schemas.ProfilePicUrlInfoImpl
            r0.<init>(r3, r2, r1)
            return r0
        L_0x00a4:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.api.schemas.ProfilePictureImpl> r0 = com.instagram.api.schemas.ProfilePictureImpl.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r1 = r1.readParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            com.instagram.api.schemas.ProfilePictureImpl r0 = new com.instagram.api.schemas.ProfilePictureImpl
            r0.<init>(r1)
            return r0
        L_0x00ba:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.RIXUActionSource[] r2 = com.instagram.api.schemas.RIXUActionSource.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x00c9:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.RIXUAspectRatio[] r2 = com.instagram.api.schemas.RIXUAspectRatio.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x00d8:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.RIXUChainingSourceType[] r2 = com.instagram.api.schemas.RIXUChainingSourceType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x00e7:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.RIXUCoverChainingType[] r2 = com.instagram.api.schemas.RIXUCoverChainingType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x00f6:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.RIXUCtaType[] r2 = com.instagram.api.schemas.RIXUCtaType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0105:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.RIXULayoutFormat[] r2 = com.instagram.api.schemas.RIXULayoutFormat.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0114:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.RIXULayoutStyle[] r2 = com.instagram.api.schemas.RIXULayoutStyle.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0123:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.RIXUPlayType[] r2 = com.instagram.api.schemas.RIXUPlayType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0132:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ReelAutoArchiveSettingStr[] r2 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0141:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ReplyControlStr[] r2 = com.instagram.api.schemas.ReplyControlStr.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0150:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.RepostRestrictedReason[] r2 = com.instagram.api.schemas.RepostRestrictedReason.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x015f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.ArrayList r8 = r1.createStringArrayList()
            java.lang.Class<com.instagram.api.schemas.RingSpecImpl> r6 = com.instagram.api.schemas.RingSpecImpl.class
            java.lang.ClassLoader r0 = r6.getClassLoader()
            android.os.Parcelable r5 = r1.readParcelable(r0)
            com.instagram.api.schemas.RingSpecPoint r5 = (com.instagram.api.schemas.RingSpecPoint) r5
            int r4 = r1.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x017d:
            if (r2 == r4) goto L_0x018d
            float r0 = r1.readFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x017d
        L_0x018d:
            java.lang.String r7 = r1.readString()
            java.lang.ClassLoader r0 = r6.getClassLoader()
            android.os.Parcelable r1 = r1.readParcelable(r0)
            com.instagram.api.schemas.RingSpecPoint r1 = (com.instagram.api.schemas.RingSpecPoint) r1
            com.instagram.api.schemas.RingSpecImpl r0 = new com.instagram.api.schemas.RingSpecImpl
            r6 = r1
            r9 = r3
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x01a4:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            float r2 = r1.readFloat()
            float r1 = r1.readFloat()
            com.instagram.api.schemas.RingSpecPointImpl r0 = new com.instagram.api.schemas.RingSpecPointImpl
            r0.<init>(r2, r1)
            return r0
        L_0x01b6:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.SMBPartnerType[] r2 = com.instagram.api.schemas.SMBPartnerType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x01c5:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ScreenTimeScreenType[] r2 = com.instagram.api.schemas.ScreenTimeScreenType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x01d4:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.SellerShoppableFeedType[] r2 = com.instagram.api.schemas.SellerShoppableFeedType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x01e3:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ShopManagementAccessState[] r2 = com.instagram.api.schemas.ShopManagementAccessState.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x01f2:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ShoppingOnboardingState[] r2 = com.instagram.api.schemas.ShoppingOnboardingState.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0201:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.SocialContextType[] r2 = com.instagram.api.schemas.SocialContextType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0210:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0221
            r1 = 0
        L_0x021b:
            com.instagram.api.schemas.SocialProofInfoImpl r0 = new com.instagram.api.schemas.SocialProofInfoImpl
            r0.<init>(r1)
            return r0
        L_0x0221:
            int r0 = r1.readInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x021b
        L_0x022a:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.SponsoredAdsDisclaimerType[] r2 = com.instagram.api.schemas.SponsoredAdsDisclaimerType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0239:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.StickerTraySectionCTAType[] r2 = com.instagram.api.schemas.StickerTraySectionCTAType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0248:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            java.lang.String r11 = r1.readString()
            int r0 = r1.readInt()
            r3 = 1
            r8 = 0
            if (r0 != 0) goto L_0x02bd
            r4 = r8
        L_0x0261:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x02b0
            r5 = r8
        L_0x0268:
            java.lang.String r12 = r1.readString()
            java.lang.String r13 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x02a3
            r6 = r8
        L_0x0277:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0297
            r7 = r8
        L_0x027e:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x028c
            int r0 = r1.readInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x028c:
            java.lang.String r14 = r1.readString()
            com.instagram.api.schemas.StoryLinkInfoDict r0 = new com.instagram.api.schemas.StoryLinkInfoDict
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0297:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x029e
            r3 = 0
        L_0x029e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            goto L_0x027e
        L_0x02a3:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x02ab
            r0 = 1
        L_0x02ab:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            goto L_0x0277
        L_0x02b0:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x02b8
            r0 = 1
        L_0x02b8:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            goto L_0x0268
        L_0x02bd:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x02c5
            r0 = 1
        L_0x02c5:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            goto L_0x0261
        L_0x02ca:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.StoryPollColorType[] r2 = com.instagram.api.schemas.StoryPollColorType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x02d9:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.StoryPromptDisablementState[] r2 = com.instagram.api.schemas.StoryPromptDisablementState.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x02e8:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.api.schemas.StoryPromptFailureTooltipDict r0 = new com.instagram.api.schemas.StoryPromptFailureTooltipDict
            r0.<init>(r2, r1)
            return r0
        L_0x02fa:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r31 = r1.readString()
            java.lang.Class<com.instagram.api.schemas.StoryPromptTappableData> r11 = com.instagram.api.schemas.StoryPromptTappableData.class
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r10 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryPromptDisablementState r10 = (com.instagram.api.schemas.StoryPromptDisablementState) r10
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r9 = r1.readParcelable(r0)
            com.instagram.api.schemas.ElectionAddYoursInfoDict r9 = (com.instagram.api.schemas.ElectionAddYoursInfoDict) r9
            int r4 = r1.readInt()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
            r3 = 0
            r2 = 0
        L_0x0323:
            java.lang.ClassLoader r0 = r11.getClassLoader()
            if (r2 == r4) goto L_0x0333
            android.os.Parcelable r0 = r1.readParcelable(r0)
            r8.add(r0)
            int r2 = r2 + 1
            goto L_0x0323
        L_0x0333:
            android.os.Parcelable r7 = r1.readParcelable(r0)
            com.instagram.api.schemas.GenAIToolInfoDict r7 = (com.instagram.api.schemas.GenAIToolInfoDict) r7
            int r0 = r1.readInt()
            r30 = 0
            if (r0 != 0) goto L_0x048d
            r19 = r30
        L_0x0343:
            java.lang.String r32 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x047f
            r20 = r30
        L_0x034f:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0471
            r21 = r30
        L_0x0357:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0463
            r22 = r30
        L_0x035f:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0455
            r23 = r30
        L_0x0367:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0447
            r24 = r30
        L_0x036f:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0439
            r25 = r30
        L_0x0377:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x042b
            r26 = r30
        L_0x037f:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x041d
            r27 = r30
        L_0x0387:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x040f
            r28 = r30
        L_0x038f:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0402
            r29 = r30
        L_0x0397:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x03a8
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x03a4
            r3 = 1
        L_0x03a4:
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r3)
        L_0x03a8:
            java.lang.String r33 = r1.readString()
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r6 = r1.readParcelable(r0)
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            int r38 = r1.readInt()
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r5 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict r5 = (com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict) r5
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryPromptFailureTooltipDict r4 = (com.instagram.api.schemas.StoryPromptFailureTooltipDict) r4
            java.lang.String r34 = r1.readString()
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryPromptType r3 = (com.instagram.api.schemas.StoryPromptType) r3
            java.lang.String r35 = r1.readString()
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryTemplateDict r2 = (com.instagram.api.schemas.StoryTemplateDict) r2
            java.lang.String r36 = r1.readString()
            com.instagram.api.schemas.StoryPromptTappableData r0 = new com.instagram.api.schemas.StoryPromptTappableData
            r37 = r8
            r12 = r7
            r13 = r10
            r14 = r4
            r15 = r5
            r16 = r3
            r17 = r2
            r18 = r6
            r10 = r0
            r11 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r0
        L_0x0402:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x040a
            r0 = 1
        L_0x040a:
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r0)
            goto L_0x0397
        L_0x040f:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0417
            r0 = 1
        L_0x0417:
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r0)
            goto L_0x038f
        L_0x041d:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0425
            r0 = 1
        L_0x0425:
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r0)
            goto L_0x0387
        L_0x042b:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0433
            r0 = 1
        L_0x0433:
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r0)
            goto L_0x037f
        L_0x0439:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0441
            r0 = 1
        L_0x0441:
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r0)
            goto L_0x0377
        L_0x0447:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x044f
            r0 = 1
        L_0x044f:
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r0)
            goto L_0x036f
        L_0x0455:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x045d
            r0 = 1
        L_0x045d:
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r0)
            goto L_0x0367
        L_0x0463:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x046b
            r0 = 1
        L_0x046b:
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r0)
            goto L_0x035f
        L_0x0471:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0479
            r0 = 1
        L_0x0479:
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r0)
            goto L_0x0357
        L_0x047f:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0487
            r0 = 1
        L_0x0487:
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r0)
            goto L_0x034f
        L_0x048d:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0495
            r0 = 1
        L_0x0495:
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r0)
            goto L_0x0343
        L_0x049b:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.StoryPromptType[] r2 = com.instagram.api.schemas.StoryPromptType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x04aa:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r9 = r1.readString()
            java.lang.Class<com.instagram.api.schemas.StoryTemplateAssetDict> r2 = com.instagram.api.schemas.StoryTemplateAssetDict.class
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r0)
            com.instagram.model.mediasize.ImageInfo r4 = (com.instagram.model.mediasize.ImageInfo) r4
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.model.mediasize.ImageInfo r3 = (com.instagram.model.mediasize.ImageInfo) r3
            int r0 = r1.readInt()
            r8 = 0
            if (r0 != 0) goto L_0x04fe
            r6 = r8
        L_0x04d0:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x04f5
            r7 = r8
        L_0x04d7:
            java.lang.String r10 = r1.readString()
            java.lang.String r11 = r1.readString()
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x04ed
            int r0 = r1.readInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x04ed:
            com.instagram.api.schemas.StoryTemplateAssetDict r0 = new com.instagram.api.schemas.StoryTemplateAssetDict
            r5 = r3
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x04f5:
            int r0 = r1.readInt()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x04d7
        L_0x04fe:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0506
            r0 = 1
        L_0x0506:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            goto L_0x04d0
        L_0x050b:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r3 = r1.readString()
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            float r9 = r1.readFloat()
            java.lang.Class<com.instagram.api.schemas.StoryTemplateCaptionDict> r0 = com.instagram.api.schemas.StoryTemplateCaptionDict.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r0)
            com.instagram.api.schemas.ClipsTextFormatType r2 = (com.instagram.api.schemas.ClipsTextFormatType) r2
            float r10 = r1.readFloat()
            float r11 = r1.readFloat()
            float r12 = r1.readFloat()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            float r13 = r1.readFloat()
            float r14 = r1.readFloat()
            float r15 = r1.readFloat()
            int r16 = r1.readInt()
            com.instagram.api.schemas.StoryTemplateCaptionDict r0 = new com.instagram.api.schemas.StoryTemplateCaptionDict
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x055a:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.api.schemas.StoryTemplateDict> r11 = com.instagram.api.schemas.StoryTemplateDict.class
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r6 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryTemplateFillableStickersDict r6 = (com.instagram.api.schemas.StoryTemplateFillableStickersDict) r6
            int r0 = r1.readInt()
            r3 = 1
            r8 = 0
            r5 = 0
            if (r0 != 0) goto L_0x05fc
            r14 = r5
        L_0x0574:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x05f0
            r15 = r5
        L_0x057b:
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r9 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryTemplateMusicStickerDict r9 = (com.instagram.api.schemas.StoryTemplateMusicStickerDict) r9
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r7 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryTemplateReshareMediaDict r7 = (com.instagram.api.schemas.StoryTemplateReshareMediaDict) r7
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x05d6
            r4 = r5
        L_0x0596:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x05bc
            r10 = r5
        L_0x059d:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x060a
            int r2 = r1.readInt()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x05ac:
            if (r8 == r2) goto L_0x060a
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r0 = r1.readParcelable(r0)
            r5.add(r0)
            int r8 = r8 + 1
            goto L_0x05ac
        L_0x05bc:
            int r3 = r1.readInt()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r3)
            r2 = 0
        L_0x05c6:
            if (r2 == r3) goto L_0x059d
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r0 = r1.readParcelable(r0)
            r10.add(r0)
            int r2 = r2 + 1
            goto L_0x05c6
        L_0x05d6:
            int r3 = r1.readInt()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r2 = 0
        L_0x05e0:
            if (r2 == r3) goto L_0x0596
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r0 = r1.readParcelable(r0)
            r4.add(r0)
            int r2 = r2 + 1
            goto L_0x05e0
        L_0x05f0:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x05f7
            r3 = 0
        L_0x05f7:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r3)
            goto L_0x057b
        L_0x05fc:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0604
            r0 = 1
        L_0x0604:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            goto L_0x0574
        L_0x060a:
            java.lang.ClassLoader r0 = r11.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryTemplateAssetDict r2 = (com.instagram.api.schemas.StoryTemplateAssetDict) r2
            java.util.ArrayList r19 = r1.createStringArrayList()
            com.instagram.api.schemas.StoryTemplateDict r0 = new com.instagram.api.schemas.StoryTemplateDict
            r11 = r6
            r12 = r9
            r13 = r7
            r16 = r4
            r17 = r10
            r18 = r5
            r9 = r0
            r10 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0629:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0646
            r3 = 0
        L_0x0634:
            java.lang.Class<com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl> r0 = com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r1 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict r1 = (com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict) r1
            com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl r0 = new com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl
            r0.<init>(r1, r3)
            return r0
        L_0x0646:
            int r4 = r1.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x0650:
            if (r2 == r4) goto L_0x0634
            java.lang.Class<com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl> r0 = com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r1.readParcelable(r0)
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x0650
        L_0x0662:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r4 = r1.readString()
            java.lang.Class<com.instagram.api.schemas.StoryTemplateGiphyStickerDict> r0 = com.instagram.api.schemas.StoryTemplateGiphyStickerDict.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict r3 = (com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict) r3
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.api.schemas.StoryTemplateGiphyStickerDict r0 = new com.instagram.api.schemas.StoryTemplateGiphyStickerDict
            r0.<init>(r3, r4, r2, r1)
            return r0
        L_0x0684:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r4 = r1.readString()
            java.lang.String r3 = r1.readString()
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict r0 = new com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x069e:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            int r15 = r1.readInt()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            int r16 = r1.readInt()
            java.lang.String r9 = r1.readString()
            float r10 = r1.readFloat()
            java.lang.Class<com.instagram.api.schemas.StoryTemplateMusicStickerDict> r2 = com.instagram.api.schemas.StoryTemplateMusicStickerDict.class
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.api.schemas.Lyrics r3 = (com.instagram.api.schemas.Lyrics) r3
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict r2 = (com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict) r2
            int r17 = r1.readInt()
            float r11 = r1.readFloat()
            float r12 = r1.readFloat()
            float r13 = r1.readFloat()
            float r14 = r1.readFloat()
            int r18 = r1.readInt()
            com.instagram.api.schemas.StoryTemplateMusicStickerDict r0 = new com.instagram.api.schemas.StoryTemplateMusicStickerDict
            r4 = r2
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x06f8:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.api.schemas.StoryTemplateStaticOverlayDict> r0 = com.instagram.api.schemas.StoryTemplateStaticOverlayDict.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r0)
            com.instagram.api.schemas.StoryTemplateGiphyStickerDict r2 = (com.instagram.api.schemas.StoryTemplateGiphyStickerDict) r2
            float r5 = r1.readFloat()
            float r6 = r1.readFloat()
            java.lang.String r3 = r1.readString()
            java.lang.String r4 = r1.readString()
            float r7 = r1.readFloat()
            float r8 = r1.readFloat()
            float r9 = r1.readFloat()
            int r10 = r1.readInt()
            com.instagram.api.schemas.StoryTemplateStaticOverlayDict r0 = new com.instagram.api.schemas.StoryTemplateStaticOverlayDict
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x072f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.api.schemas.SubscriptionStickerDict> r0 = com.instagram.api.schemas.SubscriptionStickerDict.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r0)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r3 = r1.readString()
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.api.schemas.SubscriptionStickerDict r0 = new com.instagram.api.schemas.SubscriptionStickerDict
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x0751:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.SuggestedUsersStyle[] r2 = com.instagram.api.schemas.SuggestedUsersStyle.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0760:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.TIFUAppDestinationEnum[] r2 = com.instagram.api.schemas.TIFUAppDestinationEnum.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x076f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.TextPostAppHeaderFollowVariant[] r2 = com.instagram.api.schemas.TextPostAppHeaderFollowVariant.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x077e:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier[] r2 = com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x078d:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ThreadThemeType[] r2 = com.instagram.api.schemas.ThreadThemeType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x079c:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum[] r2 = com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x07ab:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r1.readInt()
            r28 = 0
            if (r0 == 0) goto L_0x07b9
            r28 = 1
        L_0x07b9:
            java.lang.String r12 = r1.readString()
            java.lang.String r13 = r1.readString()
            java.lang.String r14 = r1.readString()
            java.lang.Class<com.instagram.api.schemas.TrackDataImpl> r7 = com.instagram.api.schemas.TrackDataImpl.class
            java.lang.ClassLoader r0 = r7.getClassLoader()
            android.os.Parcelable r6 = r1.readParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r6 = (com.instagram.common.typedurl.ImageUrl) r6
            java.lang.ClassLoader r0 = r7.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            java.lang.String r15 = r1.readString()
            java.lang.String r16 = r1.readString()
            java.lang.String r17 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x088f
            r11 = 0
        L_0x07ee:
            java.lang.String r18 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0881
            r8 = 0
        L_0x07f9:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0867
            r2 = 0
        L_0x0800:
            java.lang.String r19 = r1.readString()
            java.lang.String r20 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x085a
            r9 = 0
        L_0x080f:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x084d
            r10 = 0
        L_0x0816:
            int r0 = r1.readInt()
            r29 = 0
            if (r0 == 0) goto L_0x0820
            r29 = 1
        L_0x0820:
            java.lang.ClassLoader r0 = r7.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.api.schemas.Lyrics r3 = (com.instagram.api.schemas.Lyrics) r3
            java.lang.String r21 = r1.readString()
            java.lang.String r22 = r1.readString()
            java.lang.String r23 = r1.readString()
            java.lang.String r24 = r1.readString()
            java.lang.String r25 = r1.readString()
            java.lang.String r26 = r1.readString()
            com.instagram.api.schemas.TrackDataImpl r0 = new com.instagram.api.schemas.TrackDataImpl
            r27 = r2
            r7 = r4
            r4 = r0
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        L_0x084d:
            int r3 = r1.readInt()
            r0 = 0
            if (r3 == 0) goto L_0x0855
            r0 = 1
        L_0x0855:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            goto L_0x0816
        L_0x085a:
            int r3 = r1.readInt()
            r0 = 0
            if (r3 == 0) goto L_0x0862
            r0 = 1
        L_0x0862:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            goto L_0x080f
        L_0x0867:
            int r5 = r1.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            r3 = 0
        L_0x0871:
            if (r3 == r5) goto L_0x0800
            int r0 = r1.readInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            int r3 = r3 + 1
            goto L_0x0871
        L_0x0881:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0889
            r0 = 1
        L_0x0889:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            goto L_0x07f9
        L_0x088f:
            int r0 = r1.readInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            goto L_0x07ee
        L_0x0899:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.UndoStyle[] r2 = com.instagram.api.schemas.UndoStyle.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x08a8:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.UserMonetizationProductType[] r2 = com.instagram.api.schemas.UserMonetizationProductType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x08b7:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.ArrayList r8 = r1.createStringArrayList()
            int r0 = r1.readInt()
            r7 = 0
            if (r0 != 0) goto L_0x091f
            r6 = r7
        L_0x08c7:
            int r0 = r1.readInt()
            r5 = 0
            if (r0 != 0) goto L_0x0905
            r4 = r7
        L_0x08cf:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x08f9
            r5 = r7
        L_0x08d6:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x08e4
            float r0 = r1.readFloat()
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
        L_0x08e4:
            java.lang.Class<com.instagram.api.schemas.UserTagInfoDict> r0 = com.instagram.api.schemas.UserTagInfoDict.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r1 = r1.readParcelable(r0)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            com.instagram.api.schemas.UserTagInfoDict r0 = new com.instagram.api.schemas.UserTagInfoDict
            r9 = r4
            r3 = r0
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x08f9:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x0900
            r5 = 1
        L_0x0900:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L_0x08d6
        L_0x0905:
            int r3 = r1.readInt()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r2 = 0
        L_0x090f:
            if (r2 == r3) goto L_0x08cf
            float r0 = r1.readFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.add(r0)
            int r2 = r2 + 1
            goto L_0x090f
        L_0x091f:
            float r0 = r1.readFloat()
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            goto L_0x08c7
        L_0x0928:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.WearablesAppAttributionType[] r2 = com.instagram.api.schemas.WearablesAppAttributionType.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0937:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.api.schemas.WhatsAppAttributionInfoImpl r0 = new com.instagram.api.schemas.WhatsAppAttributionInfoImpl
            r0.<init>(r2, r1)
            return r0
        L_0x0949:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility[] r2 = com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0958:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.XDTTextPostAppAccountPrivacyOptions[] r2 = com.instagram.api.schemas.XDTTextPostAppAccountPrivacyOptions.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0967:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.api.schemas.XFBsizeCalibrationScore[] r2 = com.instagram.api.schemas.XFBsizeCalibrationScore.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x0976:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.os.Parcelable$Creator r0 = com.instagram.avatars.coinflip.AvatarCoinFlipSticker.CREATOR
            java.lang.Object r5 = r0.createFromParcel(r1)
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r5 = (com.instagram.avatars.coinflip.AvatarCoinFlipSticker) r5
            java.lang.Object r4 = r0.createFromParcel(r1)
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r4 = (com.instagram.avatars.coinflip.AvatarCoinFlipSticker) r4
            java.lang.Class<com.instagram.avatars.coinflip.AvatarCoinFlipConfig> r2 = com.instagram.avatars.coinflip.AvatarCoinFlipConfig.class
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r3 = (com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse) r3
            java.lang.String r10 = r1.readString()
            int r0 = r1.readInt()
            r11 = 0
            if (r0 == 0) goto L_0x09a0
            r11 = 1
        L_0x09a0:
            int r0 = r1.readInt()
            r12 = 0
            if (r0 == 0) goto L_0x09a8
            r12 = 1
        L_0x09a8:
            int r0 = r1.readInt()
            r13 = 0
            if (r0 == 0) goto L_0x09b0
            r13 = 1
        L_0x09b0:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x09dc
            r8 = 0
        L_0x09b7:
            int r0 = r1.readInt()
            r14 = 0
            if (r0 == 0) goto L_0x09bf
            r14 = 1
        L_0x09bf:
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r0)
            com.instagram.avatars.common.AvatarInfo r2 = (com.instagram.avatars.common.AvatarInfo) r2
            int r0 = r1.readInt()
            r15 = 0
            if (r0 == 0) goto L_0x09d1
            r15 = 1
        L_0x09d1:
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r0 = new com.instagram.avatars.coinflip.AvatarCoinFlipConfig
            r6 = r5
            r7 = r4
            r9 = r2
            r4 = r0
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L_0x09dc:
            java.lang.String r0 = r1.readString()
            X.6tJ r8 = X.C320946tJ.valueOf(r0)
            goto L_0x09b7
        L_0x09e5:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r2 = r1.readString()
            int r3 = r1.readInt()
            int r4 = r1.readInt()
            int r5 = r1.readInt()
            int r6 = r1.readInt()
            int r7 = r1.readInt()
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r0 = new com.instagram.avatars.coinflip.AvatarCoinFlipSticker
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x0a08:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r4 = r1.readString()
            java.lang.String r3 = r1.readString()
            java.lang.String r2 = r1.readString()
            java.lang.String r1 = r1.readString()
            com.instagram.avatars.common.AvatarInfo r0 = new com.instagram.avatars.common.AvatarInfo
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x0a22:
            com.instagram.camera.effect.models.CameraAREffect r0 = new com.instagram.camera.effect.models.CameraAREffect
            r0.<init>()
            java.util.List r2 = java.util.Collections.emptyList()
            r0.A0X = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r0.A0b = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r0.A0a = r2
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r0.A09 = r2
            java.util.List r2 = java.util.Collections.emptyList()
            r0.A0T = r2
            com.facebook.cameracore.ardelivery.model.SparkVisionCapability r2 = new com.facebook.cameracore.ardelivery.model.SparkVisionCapability
            r2.<init>()
            r0.A04 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.A0V = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.A0W = r2
            java.lang.String r3 = ""
            com.instagram.common.typedurl.SimpleImageUrl r2 = new com.instagram.common.typedurl.SimpleImageUrl
            r2.<init>(r3)
            r0.A06 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.A0Y = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.A0Z = r2
            java.lang.String r2 = r1.readString()
            r2.getClass()
            r0.A0K = r2
            java.lang.String r2 = r1.readString()
            r2.getClass()
            r0.A0S = r2
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r2 = com.instagram.common.typedurl.ImageUrl.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r2)
            r2.getClass()
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            r0.A07 = r2
            java.lang.String r2 = r1.readString()
            r0.A0B = r2
            java.lang.String r2 = r1.readString()
            r0.A0C = r2
            int r2 = r1.readInt()
            r0.A01 = r2
            java.util.ArrayList r2 = r1.createStringArrayList()
            r2.getClass()
            r0.A0V = r2
            java.util.ArrayList r2 = r1.createStringArrayList()
            r2.getClass()
            r0.A0W = r2
            byte r3 = r1.readByte()
            r4 = 1
            r2 = 0
            if (r3 == 0) goto L_0x0ac1
            r2 = 1
        L_0x0ac1:
            r0.A0g = r2
            byte r3 = r1.readByte()
            r2 = 0
            if (r3 == 0) goto L_0x0acb
            r2 = 1
        L_0x0acb:
            r0.A0h = r2
            byte r3 = r1.readByte()
            r2 = 0
            if (r3 == 0) goto L_0x0ad5
            r2 = 1
        L_0x0ad5:
            r0.A0d = r2
            java.lang.String r2 = r1.readString()
            r2.getClass()
            r0.A0M = r2
            java.lang.String r2 = r1.readString()
            r2.getClass()
            r0.A0G = r2
            byte r2 = r1.readByte()
            if (r2 != 0) goto L_0x0af0
            r4 = 0
        L_0x0af0:
            r0.A0e = r4
            java.lang.String r2 = r1.readString()
            r0.A0D = r2
            java.lang.String r2 = r1.readString()
            r0.A0R = r2
            java.lang.String r2 = r1.readString()
            r0.A0F = r2
            java.lang.String r1 = r1.readString()
            r0.A0E = r1
            return r0
        L_0x0b0b:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.os.Parcelable$Creator r0 = com.instagram.clips.intf.ClipsViewerSource.CREATOR
            java.lang.Object r18 = r0.createFromParcel(r1)
            r0 = r18
            com.instagram.clips.intf.ClipsViewerSource r0 = (com.instagram.clips.intf.ClipsViewerSource) r0
            r18 = r0
            java.lang.String r59 = r1.readString()
            java.lang.String r60 = r1.readString()
            java.lang.String r61 = r1.readString()
            java.lang.String r62 = r1.readString()
            int r113 = r1.readInt()
            java.lang.String r63 = r1.readString()
            java.io.Serializable r19 = r1.readSerializable()
            r0 = r19
            com.google.common.collect.ImmutableList r0 = (com.google.common.collect.ImmutableList) r0
            r19 = r0
            java.lang.String r64 = r1.readString()
            int r0 = r1.readInt()
            r117 = 0
            if (r0 == 0) goto L_0x0b4b
            r117 = 1
        L_0x0b4b:
            java.lang.String r65 = r1.readString()
            java.lang.String r66 = r1.readString()
            java.lang.String r67 = r1.readString()
            int r0 = r1.readInt()
            r58 = 0
            if (r0 != 0) goto L_0x1091
            r44 = r58
        L_0x0b61:
            java.lang.Class<com.instagram.clips.intf.ClipsViewerConfig> r2 = com.instagram.clips.intf.ClipsViewerConfig.class
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r20 = r1.readParcelable(r0)
            r0 = r20
            com.instagram.clips.model.metadata.ClipsContextualHighlightInfo r0 = (com.instagram.clips.model.metadata.ClipsContextualHighlightInfo) r0
            r20 = r0
            java.lang.String r68 = r1.readString()
            int r114 = r1.readInt()
            java.lang.String r69 = r1.readString()
            java.lang.String r70 = r1.readString()
            java.lang.String r71 = r1.readString()
            java.lang.String r72 = r1.readString()
            java.lang.String r73 = r1.readString()
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r21 = r1.readParcelable(r0)
            r0 = r21
            com.instagram.music.common.model.AudioType r0 = (com.instagram.music.common.model.AudioType) r0
            r21 = r0
            java.io.Serializable r15 = r1.readSerializable()
            com.google.common.collect.ImmutableList r15 = (com.google.common.collect.ImmutableList) r15
            java.lang.String r74 = r1.readString()
            java.lang.String r75 = r1.readString()
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r14 = r1.readParcelable(r0)
            com.instagram.api.schemas.PollType r14 = (com.instagram.api.schemas.PollType) r14
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x1087
            r25 = r58
        L_0x0bbb:
            java.lang.String r76 = r1.readString()
            java.lang.String r77 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x107d
            r46 = r58
        L_0x0bcb:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x1073
            r23 = r58
        L_0x0bd3:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x1069
            r24 = r58
        L_0x0bdb:
            int r0 = r1.readInt()
            r118 = 0
            if (r0 == 0) goto L_0x0be5
            r118 = 1
        L_0x0be5:
            java.lang.String r0 = r1.readString()
            X.28D r22 = X.28D.valueOf(r0)
            java.lang.String r78 = r1.readString()
            int r0 = r1.readInt()
            r119 = 0
            if (r0 == 0) goto L_0x0bfb
            r119 = 1
        L_0x0bfb:
            java.lang.String r0 = r1.readString()
            X.4h4 r30 = X.C270644h4.valueOf(r0)
            java.lang.String r0 = r1.readString()
            java.lang.Integer r47 = X.AnonymousClass9OE.A00(r0)
            int r0 = r1.readInt()
            r120 = 0
            if (r0 == 0) goto L_0x0c15
            r120 = 1
        L_0x0c15:
            int r0 = r1.readInt()
            r121 = 0
            if (r0 == 0) goto L_0x0c1f
            r121 = 1
        L_0x0c1f:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x105f
            r43 = r58
        L_0x0c27:
            int r0 = r1.readInt()
            r122 = 0
            if (r0 == 0) goto L_0x0c31
            r122 = 1
        L_0x0c31:
            int r0 = r1.readInt()
            r123 = 0
            if (r0 == 0) goto L_0x0c3b
            r123 = 1
        L_0x0c3b:
            int r0 = r1.readInt()
            r124 = 0
            if (r0 == 0) goto L_0x0c45
            r124 = 1
        L_0x0c45:
            int r0 = r1.readInt()
            r125 = 0
            if (r0 == 0) goto L_0x0c4f
            r125 = 1
        L_0x0c4f:
            int r0 = r1.readInt()
            r126 = 0
            if (r0 == 0) goto L_0x0c59
            r126 = 1
        L_0x0c59:
            int r0 = r1.readInt()
            r127 = 0
            if (r0 == 0) goto L_0x0c63
            r127 = 1
        L_0x0c63:
            java.lang.String r79 = r1.readString()
            java.lang.String r80 = r1.readString()
            int r0 = r1.readInt()
            r128 = 0
            if (r0 == 0) goto L_0x0c75
            r128 = 1
        L_0x0c75:
            int r0 = r1.readInt()
            r129 = 0
            if (r0 == 0) goto L_0x0c7f
            r129 = 1
        L_0x0c7f:
            int r115 = r1.readInt()
            int r0 = r1.readInt()
            r130 = 0
            if (r0 == 0) goto L_0x0c8d
            r130 = 1
        L_0x0c8d:
            int r0 = r1.readInt()
            r131 = 0
            if (r0 == 0) goto L_0x0c97
            r131 = 1
        L_0x0c97:
            int r0 = r1.readInt()
            r132 = 0
            if (r0 == 0) goto L_0x0ca1
            r132 = 1
        L_0x0ca1:
            int r0 = r1.readInt()
            r133 = 0
            if (r0 == 0) goto L_0x0cab
            r133 = 1
        L_0x0cab:
            int r0 = r1.readInt()
            r134 = 0
            if (r0 == 0) goto L_0x0cb5
            r134 = 1
        L_0x0cb5:
            int r0 = r1.readInt()
            r135 = 0
            if (r0 == 0) goto L_0x0cbf
            r135 = 1
        L_0x0cbf:
            int r0 = r1.readInt()
            r136 = 0
            if (r0 == 0) goto L_0x0cc9
            r136 = 1
        L_0x0cc9:
            int r0 = r1.readInt()
            r137 = 0
            if (r0 == 0) goto L_0x0cd3
            r137 = 1
        L_0x0cd3:
            int r0 = r1.readInt()
            r138 = 0
            if (r0 == 0) goto L_0x0cdd
            r138 = 1
        L_0x0cdd:
            java.lang.String r81 = r1.readString()
            java.lang.String r82 = r1.readString()
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r13 = r1.readParcelable(r0)
            com.instagram.music.common.model.AudioOverlayTrack r13 = (com.instagram.music.common.model.AudioOverlayTrack) r13
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r12 = r1.readParcelable(r0)
            com.instagram.search.common.analytics.SearchContext r12 = (com.instagram.search.common.analytics.SearchContext) r12
            java.lang.String r83 = r1.readString()
            java.lang.String r84 = r1.readString()
            java.lang.String r85 = r1.readString()
            java.lang.String r86 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x1055
            r48 = r58
        L_0x0d11:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x104d
            r11 = r58
        L_0x0d19:
            com.instagram.clips.intf.ClipsWatchAndBrowseData r11 = (com.instagram.clips.intf.ClipsWatchAndBrowseData) r11
            java.lang.String r87 = r1.readString()
            java.lang.String r88 = r1.readString()
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r10 = r1.readParcelable(r0)
            com.instagram.clips.model.ClipsReplyBarData r10 = (com.instagram.clips.model.ClipsReplyBarData) r10
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r9 = r1.readParcelable(r0)
            com.instagram.clips.model.ClipsTogetherData r9 = (com.instagram.clips.model.ClipsTogetherData) r9
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r8 = r1.readParcelable(r0)
            com.instagram.clips.model.ClipsSpotlightData r8 = (com.instagram.clips.model.ClipsSpotlightData) r8
            int r0 = r1.readInt()
            r139 = 0
            if (r0 == 0) goto L_0x0d4b
            r139 = 1
        L_0x0d4b:
            int r0 = r1.readInt()
            r140 = 0
            if (r0 == 0) goto L_0x0d55
            r140 = 1
        L_0x0d55:
            java.lang.String r89 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x1045
            r7 = r58
        L_0x0d61:
            com.instagram.clips.intf.ClipsViewerDirectData r7 = (com.instagram.clips.intf.ClipsViewerDirectData) r7
            int r0 = r1.readInt()
            r141 = 0
            if (r0 == 0) goto L_0x0d6d
            r141 = 1
        L_0x0d6d:
            java.lang.String r90 = r1.readString()
            int r116 = r1.readInt()
            java.lang.String r91 = r1.readString()
            java.lang.String r92 = r1.readString()
            int r0 = r1.readInt()
            r142 = 0
            if (r0 == 0) goto L_0x0d87
            r142 = 1
        L_0x0d87:
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r6 = r1.readParcelable(r0)
            com.instagram.clips.model.metadata.PlaylistContext r6 = (com.instagram.clips.model.metadata.PlaylistContext) r6
            java.lang.String r93 = r1.readString()
            int r0 = r1.readInt()
            r143 = 0
            if (r0 == 0) goto L_0x0d9f
            r143 = 1
        L_0x0d9f:
            int r0 = r1.readInt()
            r144 = 0
            if (r0 == 0) goto L_0x0da9
            r144 = 1
        L_0x0da9:
            int r0 = r1.readInt()
            r145 = 0
            if (r0 == 0) goto L_0x0db3
            r145 = 1
        L_0x0db3:
            int r0 = r1.readInt()
            r146 = 0
            if (r0 == 0) goto L_0x0dbd
            r146 = 1
        L_0x0dbd:
            int r0 = r1.readInt()
            r147 = 0
            if (r0 == 0) goto L_0x0dc7
            r147 = 1
        L_0x0dc7:
            java.io.Serializable r5 = r1.readSerializable()
            X.0sP r5 = (X.0sP) r5
            int r0 = r1.readInt()
            r148 = 0
            if (r0 == 0) goto L_0x0dd7
            r148 = 1
        L_0x0dd7:
            float r109 = r1.readFloat()
            float r110 = r1.readFloat()
            float r111 = r1.readFloat()
            float r112 = r1.readFloat()
            int r0 = r1.readInt()
            r149 = 0
            if (r0 == 0) goto L_0x0df1
            r149 = 1
        L_0x0df1:
            java.lang.String r94 = r1.readString()
            int r0 = r1.readInt()
            r150 = 0
            if (r0 == 0) goto L_0x0dff
            r150 = 1
        L_0x0dff:
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r0)
            com.instagram.model.rixu.RIXUChainingBehaviorDefinition r4 = (com.instagram.model.rixu.RIXUChainingBehaviorDefinition) r4
            int r0 = r1.readInt()
            r151 = 0
            if (r0 == 0) goto L_0x0e13
            r151 = 1
        L_0x0e13:
            int r0 = r1.readInt()
            r152 = 0
            if (r0 == 0) goto L_0x0e1d
            r152 = 1
        L_0x0e1d:
            int r0 = r1.readInt()
            r153 = 0
            if (r0 == 0) goto L_0x0e27
            r153 = 1
        L_0x0e27:
            java.lang.String r95 = r1.readString()
            java.lang.String r96 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x103b
            r49 = r58
        L_0x0e37:
            int r0 = r1.readInt()
            r154 = 0
            if (r0 == 0) goto L_0x0e41
            r154 = 1
        L_0x0e41:
            int r0 = r1.readInt()
            r155 = 0
            if (r0 == 0) goto L_0x0e4b
            r155 = 1
        L_0x0e4b:
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.api.schemas.ClipChainType r3 = (com.instagram.api.schemas.ClipChainType) r3
            java.lang.String r2 = r1.readString()
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x101f
            java.lang.Integer r50 = X.AnonymousClass05K.A00
        L_0x0e63:
            java.lang.String r97 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x1015
            r51 = r58
        L_0x0e6f:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x100b
            r57 = r58
        L_0x0e77:
            java.lang.String r98 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0ff7
            r52 = r58
        L_0x0e83:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0fed
            r53 = r58
        L_0x0e8b:
            int r0 = r1.readInt()
            r156 = 0
            if (r0 == 0) goto L_0x0e95
            r156 = 1
        L_0x0e95:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0f95
            r54 = r58
        L_0x0e9d:
            java.lang.String r99 = r1.readString()
            java.lang.String r100 = r1.readString()
            int r0 = r1.readInt()
            r157 = 0
            if (r0 == 0) goto L_0x0eaf
            r157 = 1
        L_0x0eaf:
            java.lang.String r101 = r1.readString()
            int r0 = r1.readInt()
            r158 = 0
            if (r0 == 0) goto L_0x0ebd
            r158 = 1
        L_0x0ebd:
            int r0 = r1.readInt()
            r159 = 0
            if (r0 == 0) goto L_0x0ec7
            r159 = 1
        L_0x0ec7:
            int r0 = r1.readInt()
            r160 = 0
            if (r0 == 0) goto L_0x0ed1
            r160 = 1
        L_0x0ed1:
            java.lang.String r102 = r1.readString()
            int r0 = r1.readInt()
            r161 = 0
            if (r0 == 0) goto L_0x0edf
            r161 = 1
        L_0x0edf:
            int r0 = r1.readInt()
            r162 = 0
            if (r0 == 0) goto L_0x0ee9
            r162 = 1
        L_0x0ee9:
            java.lang.String r103 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0f8b
            r55 = r58
        L_0x0ef5:
            java.lang.String r104 = r1.readString()
            int r0 = r1.readInt()
            r163 = 0
            if (r0 == 0) goto L_0x0f03
            r163 = 1
        L_0x0f03:
            java.lang.String r105 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0f7e
            r45 = r58
        L_0x0f0f:
            int r0 = r1.readInt()
            r164 = 0
            if (r0 == 0) goto L_0x0f19
            r164 = 1
        L_0x0f19:
            int r0 = r1.readInt()
            r165 = 0
            if (r0 == 0) goto L_0x0f23
            r165 = 1
        L_0x0f23:
            java.lang.String r106 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x0f75
            r56 = r58
        L_0x0f2f:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x0f3d
            long r16 = r1.readLong()
            java.lang.Long r58 = java.lang.Long.valueOf(r16)
        L_0x0f3d:
            java.lang.String r107 = r1.readString()
            int r0 = r1.readInt()
            r166 = 0
            if (r0 == 0) goto L_0x0f4b
            r166 = 1
        L_0x0f4b:
            com.instagram.clips.intf.ClipsViewerConfig r0 = new com.instagram.clips.intf.ClipsViewerConfig
            r33 = r11
            r34 = r10
            r35 = r8
            r36 = r9
            r37 = r20
            r38 = r6
            r39 = r4
            r40 = r13
            r41 = r21
            r42 = r12
            r108 = r5
            r26 = r19
            r27 = r15
            r28 = r3
            r29 = r14
            r31 = r7
            r32 = r18
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166)
            return r0
        L_0x0f75:
            int r0 = r1.readInt()
            java.lang.Integer r56 = java.lang.Integer.valueOf(r0)
            goto L_0x0f2f
        L_0x0f7e:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x0f86
            r0 = 1
        L_0x0f86:
            java.lang.Boolean r45 = java.lang.Boolean.valueOf(r0)
            goto L_0x0f0f
        L_0x0f8b:
            int r0 = r1.readInt()
            java.lang.Integer r55 = java.lang.Integer.valueOf(r0)
            goto L_0x0ef5
        L_0x0f95:
            java.lang.String r2 = r1.readString()
            java.lang.String r0 = "RANKED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fa5
            java.lang.Integer r54 = X.AnonymousClass05K.A00
            goto L_0x0e9d
        L_0x0fa5:
            java.lang.String r0 = "LATEST_TOP"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fb1
            java.lang.Integer r54 = X.AnonymousClass05K.A01
            goto L_0x0e9d
        L_0x0fb1:
            java.lang.String r0 = "META_VERIFIED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fbd
            java.lang.Integer r54 = X.AnonymousClass05K.A0C
            goto L_0x0e9d
        L_0x0fbd:
            java.lang.String r0 = "FOLLOWERS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fc9
            java.lang.Integer r54 = X.AnonymousClass05K.A0N
            goto L_0x0e9d
        L_0x0fc9:
            java.lang.String r0 = "PEOPLE_YOU_FOLLOW"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fd5
            java.lang.Integer r54 = X.AnonymousClass05K.A0Y
            goto L_0x0e9d
        L_0x0fd5:
            java.lang.String r0 = "QUESTIONS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0fe1
            java.lang.Integer r54 = X.AnonymousClass05K.A0j
            goto L_0x0e9d
        L_0x0fe1:
            java.lang.String r0 = "NOT_SET"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x109f
            java.lang.Integer r54 = X.AnonymousClass05K.A0u
            goto L_0x0e9d
        L_0x0fed:
            int r0 = r1.readInt()
            java.lang.Integer r53 = java.lang.Integer.valueOf(r0)
            goto L_0x0e8b
        L_0x0ff7:
            java.lang.String r2 = r1.readString()
            r0 = 1206(0x4b6, float:1.69E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10a5
            java.lang.Integer r52 = X.AnonymousClass05K.A00
            goto L_0x0e83
        L_0x100b:
            long r16 = r1.readLong()
            java.lang.Long r57 = java.lang.Long.valueOf(r16)
            goto L_0x0e77
        L_0x1015:
            int r0 = r1.readInt()
            java.lang.Integer r51 = java.lang.Integer.valueOf(r0)
            goto L_0x0e6f
        L_0x101f:
            java.lang.String r0 = "AD_SEED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x102b
            java.lang.Integer r50 = X.AnonymousClass05K.A01
            goto L_0x0e63
        L_0x102b:
            r0 = 945(0x3b1, float:1.324E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x10ab
            java.lang.Integer r50 = X.AnonymousClass05K.A0C
            goto L_0x0e63
        L_0x103b:
            int r0 = r1.readInt()
            java.lang.Integer r49 = java.lang.Integer.valueOf(r0)
            goto L_0x0e37
        L_0x1045:
            android.os.Parcelable$Creator r0 = com.instagram.clips.intf.ClipsViewerDirectData.CREATOR
            java.lang.Object r7 = r0.createFromParcel(r1)
            goto L_0x0d61
        L_0x104d:
            android.os.Parcelable$Creator r0 = com.instagram.clips.intf.ClipsWatchAndBrowseData.CREATOR
            java.lang.Object r11 = r0.createFromParcel(r1)
            goto L_0x0d19
        L_0x1055:
            int r0 = r1.readInt()
            java.lang.Integer r48 = java.lang.Integer.valueOf(r0)
            goto L_0x0d11
        L_0x105f:
            java.lang.String r0 = r1.readString()
            X.4gf r43 = X.C270394gf.valueOf(r0)
            goto L_0x0c27
        L_0x1069:
            java.lang.String r0 = r1.readString()
            X.5OD r24 = X.AnonymousClass5OD.valueOf(r0)
            goto L_0x0bdb
        L_0x1073:
            java.lang.String r0 = r1.readString()
            X.5OC r23 = X.AnonymousClass5OC.valueOf(r0)
            goto L_0x0bd3
        L_0x107d:
            int r0 = r1.readInt()
            java.lang.Integer r46 = java.lang.Integer.valueOf(r0)
            goto L_0x0bcb
        L_0x1087:
            java.lang.String r0 = r1.readString()
            X.5OB r25 = X.AnonymousClass5OB.valueOf(r0)
            goto L_0x0bbb
        L_0x1091:
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x1099
            r0 = 1
        L_0x1099:
            java.lang.Boolean r44 = java.lang.Boolean.valueOf(r0)
            goto L_0x0b61
        L_0x109f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x10a5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x10ab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x10b1:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r2 = r1.readString()
            int r0 = r1.readInt()
            r5 = 0
            if (r0 == 0) goto L_0x10c1
            r5 = 1
        L_0x10c1:
            java.lang.String r3 = r1.readString()
            java.lang.String r4 = r1.readString()
            int r0 = r1.readInt()
            r6 = 0
            if (r0 == 0) goto L_0x10d1
            r6 = 1
        L_0x10d1:
            int r0 = r1.readInt()
            r7 = 0
            if (r0 == 0) goto L_0x10d9
            r7 = 1
        L_0x10d9:
            int r0 = r1.readInt()
            r8 = 0
            if (r0 == 0) goto L_0x10e1
            r8 = 1
        L_0x10e1:
            int r0 = r1.readInt()
            r9 = 0
            if (r0 == 0) goto L_0x10e9
            r9 = 1
        L_0x10e9:
            int r0 = r1.readInt()
            r10 = 0
            if (r0 == 0) goto L_0x10f1
            r10 = 1
        L_0x10f1:
            int r0 = r1.readInt()
            r11 = 0
            if (r0 == 0) goto L_0x10f9
            r11 = 1
        L_0x10f9:
            int r0 = r1.readInt()
            r12 = 0
            if (r0 == 0) goto L_0x1101
            r12 = 1
        L_0x1101:
            int r0 = r1.readInt()
            r13 = 0
            if (r0 == 0) goto L_0x1109
            r13 = 1
        L_0x1109:
            int r0 = r1.readInt()
            r14 = 0
            if (r0 == 0) goto L_0x1111
            r14 = 1
        L_0x1111:
            int r0 = r1.readInt()
            r15 = 0
            if (r0 == 0) goto L_0x1119
            r15 = 1
        L_0x1119:
            com.instagram.clips.intf.ClipsViewerDirectData r0 = new com.instagram.clips.intf.ClipsViewerDirectData
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L_0x1120:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.clips.intf.ClipsViewerSource[] r2 = com.instagram.clips.intf.ClipsViewerSource.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x112f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r19 = r1.readInt()
            float r14 = r1.readFloat()
            int r20 = r1.readInt()
            java.lang.String r0 = r1.readString()
            java.lang.Integer r4 = X.AnonymousClass9OE.A00(r0)
            java.lang.String r0 = r1.readString()
            java.lang.Integer r5 = X.AnonymousClass9OE.A00(r0)
            java.lang.String r3 = r1.readString()
            java.lang.String r2 = "DISABLED"
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x125a
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x115d:
            java.lang.String r3 = r1.readString()
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x1236
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x1169:
            int r0 = r1.readInt()
            r21 = 0
            if (r0 == 0) goto L_0x1173
            r21 = 1
        L_0x1173:
            int r0 = r1.readInt()
            r22 = 0
            if (r0 == 0) goto L_0x117d
            r22 = 1
        L_0x117d:
            float r15 = r1.readFloat()
            int r0 = r1.readInt()
            r23 = 0
            if (r0 == 0) goto L_0x118b
            r23 = 1
        L_0x118b:
            int r0 = r1.readInt()
            r24 = 0
            if (r0 == 0) goto L_0x1195
            r24 = 1
        L_0x1195:
            int r0 = r1.readInt()
            r25 = 0
            if (r0 == 0) goto L_0x119f
            r25 = 1
        L_0x119f:
            int r0 = r1.readInt()
            r26 = 0
            if (r0 == 0) goto L_0x11a9
            r26 = 1
        L_0x11a9:
            int r0 = r1.readInt()
            r27 = 0
            if (r0 == 0) goto L_0x11b3
            r27 = 1
        L_0x11b3:
            int r0 = r1.readInt()
            r28 = 0
            if (r0 == 0) goto L_0x11bd
            r28 = 1
        L_0x11bd:
            int r0 = r1.readInt()
            r29 = 0
            if (r0 == 0) goto L_0x11c7
            r29 = 1
        L_0x11c7:
            int r0 = r1.readInt()
            r30 = 0
            if (r0 == 0) goto L_0x11d1
            r30 = 1
        L_0x11d1:
            int r0 = r1.readInt()
            r31 = 0
            if (r0 == 0) goto L_0x11db
            r31 = 1
        L_0x11db:
            int r0 = r1.readInt()
            r32 = 0
            if (r0 == 0) goto L_0x11e5
            r32 = 1
        L_0x11e5:
            int r0 = r1.readInt()
            r33 = 0
            if (r0 == 0) goto L_0x11ef
            r33 = 1
        L_0x11ef:
            int r0 = r1.readInt()
            r34 = 0
            if (r0 == 0) goto L_0x11f9
            r34 = 1
        L_0x11f9:
            int r0 = r1.readInt()
            r35 = 0
            if (r0 == 0) goto L_0x1203
            r35 = 1
        L_0x1203:
            float r16 = r1.readFloat()
            double r8 = r1.readDouble()
            double r10 = r1.readDouble()
            float r17 = r1.readFloat()
            double r12 = r1.readDouble()
            float r18 = r1.readFloat()
            int r0 = r1.readInt()
            r36 = 0
            if (r0 == 0) goto L_0x1225
            r36 = 1
        L_0x1225:
            int r0 = r1.readInt()
            r37 = 0
            if (r0 == 0) goto L_0x122f
            r37 = 1
        L_0x122f:
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = new com.instagram.clips.intf.ClipsWatchAndBrowseData
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r0
        L_0x1236:
            java.lang.String r0 = "DISMISS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x1242
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            goto L_0x1169
        L_0x1242:
            java.lang.String r0 = "EXPAND_BOTTOM_SHEET"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x124e
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            goto L_0x1169
        L_0x124e:
            java.lang.String r0 = "EXPAND_OR_CHAIN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x128a
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            goto L_0x1169
        L_0x125a:
            java.lang.String r0 = "DISMISS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x1266
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x115d
        L_0x1266:
            java.lang.String r0 = "COLLAPSE_BOTTOM_SHEET"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x1272
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            goto L_0x115d
        L_0x1272:
            java.lang.String r0 = "COLLAPSE_OR_DISMISS_BOTTOM_SHEET"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x127e
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            goto L_0x115d
        L_0x127e:
            java.lang.String r0 = "DISMISS_ONLY_BROWSER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x1290
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            goto L_0x115d
        L_0x128a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x1290:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x1296:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Class<com.instagram.clips.model.ClipsReplyBarData> r2 = com.instagram.clips.model.ClipsReplyBarData.class
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r0)
            com.instagram.model.direct.DirectThreadKey r4 = (com.instagram.model.direct.DirectThreadKey) r4
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r3 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r3
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            java.lang.String r11 = r1.readString()
            java.lang.String r12 = r1.readString()
            java.lang.ClassLoader r0 = r2.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r0)
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            int r0 = r1.readInt()
            r17 = 0
            if (r0 == 0) goto L_0x12dc
            r17 = 1
        L_0x12dc:
            int r0 = r1.readInt()
            r18 = 0
            if (r0 == 0) goto L_0x12e6
            r18 = 1
        L_0x12e6:
            int r0 = r1.readInt()
            r19 = 0
            if (r0 == 0) goto L_0x12f0
            r19 = 1
        L_0x12f0:
            int r0 = r1.readInt()
            r20 = 0
            if (r0 == 0) goto L_0x12fa
            r20 = 1
        L_0x12fa:
            java.lang.String r13 = r1.readString()
            int r0 = r1.readInt()
            r21 = 0
            if (r0 == 0) goto L_0x1308
            r21 = 1
        L_0x1308:
            int r0 = r1.readInt()
            r22 = 0
            if (r0 == 0) goto L_0x1312
            r22 = 1
        L_0x1312:
            int r15 = r1.readInt()
            int r16 = r1.readInt()
            int r0 = r1.readInt()
            r23 = 0
            if (r0 == 0) goto L_0x1324
            r23 = 1
        L_0x1324:
            int r0 = r1.readInt()
            r24 = 0
            if (r0 == 0) goto L_0x132e
            r24 = 1
        L_0x132e:
            int r0 = r1.readInt()
            r25 = 0
            if (r0 == 0) goto L_0x1338
            r25 = 1
        L_0x1338:
            int r0 = r1.readInt()
            r26 = 0
            if (r0 == 0) goto L_0x1342
            r26 = 1
        L_0x1342:
            java.lang.String r14 = r1.readString()
            com.instagram.clips.model.ClipsReplyBarData r0 = new com.instagram.clips.model.ClipsReplyBarData
            r5 = r4
            r6 = r3
            r3 = r0
            r4 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        L_0x1350:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r4 = r1.readString()
            java.lang.String r3 = r1.readString()
            java.lang.String r2 = r1.readString()
            java.lang.Class<com.instagram.clips.model.metadata.ClipsContextualHighlightInfo> r0 = com.instagram.clips.model.metadata.ClipsContextualHighlightInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r1 = r1.readParcelable(r0)
            com.instagram.api.schemas.ContextualHighlightType r1 = (com.instagram.api.schemas.ContextualHighlightType) r1
            com.instagram.clips.model.metadata.ClipsContextualHighlightInfo r0 = new com.instagram.clips.model.metadata.ClipsContextualHighlightInfo
            r0.<init>(r1, r4, r3, r2)
            return r0
        L_0x1372:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r1 = r1.readString()
            com.instagram.clips.model.metadata.PlaylistContext r0 = new com.instagram.clips.model.metadata.PlaylistContext
            r0.<init>(r1)
            return r0
        L_0x1380:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r4 = r1.readString()
            int r0 = r1.readInt()
            r8 = 0
            if (r0 == 0) goto L_0x1390
            r8 = 1
        L_0x1390:
            int r0 = r1.readInt()
            r9 = 0
            if (r0 == 0) goto L_0x1398
            r9 = 1
        L_0x1398:
            int r7 = r1.readInt()
            java.lang.String r5 = r1.readString()
            int r0 = r1.readInt()
            r10 = 0
            if (r0 == 0) goto L_0x13a8
            r10 = 1
        L_0x13a8:
            int r0 = r1.readInt()
            r11 = 0
            if (r0 == 0) goto L_0x13b0
            r11 = 1
        L_0x13b0:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x13c2
            r3 = 0
        L_0x13b7:
            java.lang.String r6 = r1.readString()
            com.instagram.common.gallery.Draft r0 = new com.instagram.common.gallery.Draft
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x13c2:
            long r2 = r1.readLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            goto L_0x13b7
        L_0x13cb:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r2 = r1.readString()
            int r0 = r1.readInt()
            r1 = 0
            if (r0 == 0) goto L_0x13db
            r1 = 1
        L_0x13db:
            com.instagram.common.gallery.GeneratedMediaMetadata r0 = new com.instagram.common.gallery.GeneratedMediaMetadata
            r0.<init>(r2, r1)
            return r0
        L_0x13e1:
            r4 = 0
            X.0qQ.A0B(r1, r4)
            com.instagram.common.gallery.Medium r0 = new com.instagram.common.gallery.Medium
            r0.<init>()
            int r2 = r1.readInt()
            r0.A05 = r2
            int r2 = r1.readInt()
            r0.A08 = r2
            java.lang.String r2 = r1.readString()
            java.lang.String r6 = "Required value was null."
            if (r2 == 0) goto L_0x151f
            r0.A0X = r2
            int r2 = r1.readInt()
            r0.A02 = r2
            java.lang.String r2 = r1.readString()
            r0.A0O = r2
            int r2 = r1.readInt()
            r0.A03 = r2
            java.lang.String r2 = r1.readString()
            if (r2 == 0) goto L_0x1519
            r0.A0U = r2
            java.lang.String r2 = r1.readString()
            r0.A0b = r2
            int r3 = r1.readInt()
            r5 = 1
            r2 = 0
            if (r3 != r5) goto L_0x1429
            r2 = 1
        L_0x1429:
            r0.A0e = r2
            java.lang.String r2 = r1.readString()
            r0.A0a = r2
            int r2 = r1.readInt()
            r0.A07 = r2
            long r2 = r1.readLong()
            r0.A0D = r2
            long r2 = r1.readLong()
            r0.A0C = r2
            int r2 = r1.readInt()
            r0.A06 = r2
            java.lang.Class<com.instagram.common.gallery.metadata.MediaUploadMetadata> r2 = com.instagram.common.gallery.metadata.MediaUploadMetadata.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r7 = r1.readParcelable(r2)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = (com.instagram.common.gallery.metadata.MediaUploadMetadata) r7
            if (r7 != 0) goto L_0x146c
            r8 = 0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x146c:
            r0.A0G = r7
            java.lang.Class<com.instagram.common.util.gradient.BackgroundGradientColors> r2 = com.instagram.common.util.gradient.BackgroundGradientColors.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r2)
            com.instagram.common.util.gradient.BackgroundGradientColors r2 = (com.instagram.common.util.gradient.BackgroundGradientColors) r2
            r0.A0H = r2
            java.lang.String r2 = r1.readString()
            r0.A0N = r2
            int r3 = r1.readInt()
            r2 = 0
            if (r3 != r5) goto L_0x148a
            r2 = 1
        L_0x148a:
            r0.A0g = r2
            int r3 = r1.readInt()
            r2 = 0
            if (r3 != r5) goto L_0x1494
            r2 = 1
        L_0x1494:
            r0.A0d = r2
            double r2 = r1.readDouble()
            r0.A00 = r2
            double r2 = r1.readDouble()
            r0.A01 = r2
            int r2 = r1.readInt()
            r0.A0B = r2
            int r2 = r1.readInt()
            r0.A04 = r2
            java.lang.String r2 = r1.readString()
            r0.A0V = r2
            java.lang.String r2 = r1.readString()
            r0.A0T = r2
            java.lang.String r2 = r1.readString()
            r0.A0Z = r2
            java.lang.String r2 = r1.readString()
            r0.A0L = r2
            java.lang.String r2 = r1.readString()
            r0.A0R = r2
            android.os.Parcelable$Creator r2 = com.instagram.common.gallery.FaceCenter.CREATOR
            java.util.ArrayList r3 = r1.createTypedArrayList(r2)
            if (r3 == 0) goto L_0x1513
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r0.A0c = r2
            java.lang.String r2 = r1.readString()
            r0.A0Y = r2
            java.lang.String r2 = r1.readString()
            r0.A0M = r2
            int r2 = r1.readInt()
            r3 = 0
            if (r2 == 0) goto L_0x150e
            if (r2 == r5) goto L_0x1509
            r2 = r3
        L_0x14f1:
            r0.A0I = r2
            java.lang.Class<com.instagram.common.gallery.GeneratedMediaMetadata> r2 = com.instagram.common.gallery.GeneratedMediaMetadata.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            com.instagram.common.gallery.GeneratedMediaMetadata r1 = (com.instagram.common.gallery.GeneratedMediaMetadata) r1
            if (r1 != 0) goto L_0x1506
            com.instagram.common.gallery.GeneratedMediaMetadata r1 = new com.instagram.common.gallery.GeneratedMediaMetadata
            r1.<init>(r3, r4)
        L_0x1506:
            r0.A0E = r1
            return r0
        L_0x1509:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            goto L_0x14f1
        L_0x150e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            goto L_0x14f1
        L_0x1513:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x1519:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x151f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x1525:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r10 = r1.readString()
            java.lang.Class<com.instagram.common.gallery.RemoteMedia> r4 = com.instagram.common.gallery.RemoteMedia.class
            java.lang.ClassLoader r0 = r4.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            int r0 = r1.readInt()
            r13 = 0
            if (r0 == 0) goto L_0x1541
            r13 = 1
        L_0x1541:
            int r12 = r1.readInt()
            java.lang.ClassLoader r0 = r4.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            int r0 = r1.readInt()
            r9 = 0
            if (r0 != 0) goto L_0x159c
            r7 = r9
        L_0x1557:
            java.lang.ClassLoader r0 = r4.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r0)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r4 = (com.instagram.common.gallery.metadata.MediaUploadMetadata) r4
            java.lang.String r11 = r1.readString()
            int r0 = r1.readInt()
            r14 = 0
            if (r0 == 0) goto L_0x156d
            r14 = 1
        L_0x156d:
            int r0 = r1.readInt()
            r15 = 0
            if (r0 == 0) goto L_0x1575
            r15 = 1
        L_0x1575:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x1593
            r8 = r9
        L_0x157c:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x158a
            int r0 = r1.readInt()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x158a:
            com.instagram.common.gallery.RemoteMedia r0 = new com.instagram.common.gallery.RemoteMedia
            r5 = r3
            r6 = r2
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L_0x1593:
            int r0 = r1.readInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L_0x157c
        L_0x159c:
            int r0 = r1.readInt()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x1557
        L_0x15a5:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r2 = r1.readString()
            int r0 = r1.readInt()
            r1 = 0
            if (r0 == 0) goto L_0x15b5
            r1 = 1
        L_0x15b5:
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = new com.instagram.common.gallery.metadata.ImmersiveMediaFields
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            return r0
        L_0x15bf:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r2 = r1.readString()
            java.lang.String r3 = r1.readString()
            java.lang.String r4 = r1.readString()
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.lang.String r9 = r1.readString()
            int r0 = r1.readInt()
            r12 = 0
            if (r0 == 0) goto L_0x15eb
            r12 = 1
        L_0x15eb:
            java.lang.String r10 = r1.readString()
            java.lang.String r11 = r1.readString()
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x1602
            r1 = 0
        L_0x15fa:
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r1 = (com.instagram.common.gallery.metadata.ImmersiveMediaFields) r1
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x1602:
            android.os.Parcelable$Creator r0 = com.instagram.common.gallery.metadata.ImmersiveMediaFields.CREATOR
            java.lang.Object r1 = r0.createFromParcel(r1)
            goto L_0x15fa
        L_0x1609:
            com.instagram.common.typedurl.ImageCacheKey r0 = new com.instagram.common.typedurl.ImageCacheKey
            r0.<init>(r1)
            return r0
        L_0x160f:
            java.lang.String r3 = r1.readString()
            r3.getClass()
            int r2 = r1.readInt()
            int r1 = r1.readInt()
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r3, r2, r1)
            return r0
        L_0x1624:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView$SavedState r0 = new com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView$SavedState
            r0.<init>(r1)
            int r1 = r1.readInt()
            r0.A00 = r1
            return r0
        L_0x1634:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r12 = r1.readString()
            java.lang.Class<com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState> r9 = com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState.class
            java.lang.ClassLoader r0 = r9.getClassLoader()
            android.os.Parcelable r7 = r1.readParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r7 = (com.instagram.common.typedurl.ImageUrl) r7
            java.lang.String r13 = r1.readString()
            java.lang.ClassLoader r0 = r9.getClassLoader()
            android.os.Parcelable r6 = r1.readParcelable(r0)
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            int r19 = r1.readInt()
            java.lang.String r14 = r1.readString()
            int r3 = r1.readInt()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r5 = 0
            r2 = 0
        L_0x1669:
            if (r2 == r3) goto L_0x1679
            java.lang.ClassLoader r0 = r9.getClassLoader()
            android.os.Parcelable r0 = r1.readParcelable(r0)
            r4.add(r0)
            int r2 = r2 + 1
            goto L_0x1669
        L_0x1679:
            int r0 = r1.readInt()
            r20 = 0
            if (r0 == 0) goto L_0x1683
            r20 = 1
        L_0x1683:
            java.lang.ClassLoader r0 = r9.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.api.schemas.SocialContextType r3 = (com.instagram.api.schemas.SocialContextType) r3
            java.lang.String r15 = r1.readString()
            java.lang.String r16 = r1.readString()
            java.lang.String r2 = r1.readString()
            java.lang.String r0 = "BELOW_CAPTION_REELS_VIEWER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x16d0
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x16a3:
            int r0 = r1.readInt()
            r21 = 0
            if (r0 == 0) goto L_0x16ad
            r21 = 1
        L_0x16ad:
            int r0 = r1.readInt()
            r22 = 0
            if (r0 == 0) goto L_0x16b7
            r22 = 1
        L_0x16b7:
            int r0 = r1.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
        L_0x16c0:
            if (r5 == r0) goto L_0x16f1
            java.lang.ClassLoader r8 = r9.getClassLoader()
            java.lang.Object r8 = r1.readValue(r8)
            r2.add(r8)
            int r5 = r5 + 1
            goto L_0x16c0
        L_0x16d0:
            java.lang.String r0 = "OVERLAID_ON_MEDIA_REELS_VIEWER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x16db
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x16a3
        L_0x16db:
            java.lang.String r0 = "OVERLAID_ON_MEDIA_FEED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x16e6
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x16a3
        L_0x16e6:
            java.lang.String r0 = "SEPERATE_ROW_FEED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x170a
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            goto L_0x16a3
        L_0x16f1:
            java.lang.ClassLoader r0 = r9.getClassLoader()
            java.lang.Object r1 = r1.readValue(r0)
            X.JwI r1 = (X.C61080JwI) r1
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r0 = new com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState
            r18 = r2
            r8 = r3
            r9 = r7
            r10 = r6
            r17 = r4
            r6 = r0
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x170a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x1710:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r3 = r1.readInt()
            int r2 = r1.readInt()
            java.lang.Class<com.instagram.creation.base.CropInfo> r0 = com.instagram.creation.base.CropInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r1 = r1.readParcelable(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            com.instagram.creation.base.CropInfo r0 = new com.instagram.creation.base.CropInfo
            r0.<init>(r1, r3, r2)
            return r0
        L_0x172e:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = new com.instagram.creation.cameraconfiguration.CameraConfiguration
            r0.<init>(r1)
            return r0
        L_0x1738:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r2 = r1.readInt()
            int r3 = r1.readInt()
            int r4 = r1.readInt()
            int r5 = r1.readInt()
            int r6 = r1.readInt()
            int r7 = r1.readInt()
            int r0 = r1.readInt()
            r8 = 0
            if (r0 == 0) goto L_0x175c
            r8 = 1
        L_0x175c:
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = new com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x1763:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r2 = r1.readInt()
            int r3 = r1.readInt()
            java.lang.String r6 = r1.readString()
            int r4 = r1.readInt()
            int r5 = r1.readInt()
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r0 = new com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L_0x1782:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = r1.readString()
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat r0 = com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat.valueOf(r0)
            return r0
        L_0x178f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = r1.readString()
            X.89U r4 = X.AnonymousClass89U.valueOf(r0)
            int r0 = r1.readInt()
            r5 = 0
            if (r0 != 0) goto L_0x19ae
            r3 = r5
        L_0x17a3:
            int r0 = r1.readInt()
            r9 = 0
            if (r0 == 0) goto L_0x17ab
            r9 = 1
        L_0x17ab:
            int r0 = r1.readInt()
            r10 = 0
            if (r0 == 0) goto L_0x17b3
            r10 = 1
        L_0x17b3:
            int r0 = r1.readInt()
            r11 = 0
            if (r0 == 0) goto L_0x17bb
            r11 = 1
        L_0x17bb:
            int r0 = r1.readInt()
            r12 = 0
            if (r0 == 0) goto L_0x17c3
            r12 = 1
        L_0x17c3:
            int r0 = r1.readInt()
            r13 = 0
            if (r0 == 0) goto L_0x17cb
            r13 = 1
        L_0x17cb:
            int r0 = r1.readInt()
            r14 = 0
            if (r0 == 0) goto L_0x17d3
            r14 = 1
        L_0x17d3:
            int r0 = r1.readInt()
            r15 = 0
            if (r0 == 0) goto L_0x17db
            r15 = 1
        L_0x17db:
            int r0 = r1.readInt()
            r16 = 0
            if (r0 == 0) goto L_0x17e5
            r16 = 1
        L_0x17e5:
            int r0 = r1.readInt()
            r17 = 0
            if (r0 == 0) goto L_0x17ef
            r17 = 1
        L_0x17ef:
            int r6 = r1.readInt()
            int r0 = r1.readInt()
            r18 = 0
            if (r0 == 0) goto L_0x17fd
            r18 = 1
        L_0x17fd:
            int r0 = r1.readInt()
            r19 = 0
            if (r0 == 0) goto L_0x1807
            r19 = 1
        L_0x1807:
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x1819
            int r2 = r1.readInt()
            r0 = 0
            if (r2 == 0) goto L_0x1815
            r0 = 1
        L_0x1815:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L_0x1819:
            int r0 = r1.readInt()
            r20 = 0
            if (r0 == 0) goto L_0x1823
            r20 = 1
        L_0x1823:
            int r0 = r1.readInt()
            r21 = 0
            if (r0 == 0) goto L_0x182d
            r21 = 1
        L_0x182d:
            int r0 = r1.readInt()
            r22 = 0
            if (r0 == 0) goto L_0x1837
            r22 = 1
        L_0x1837:
            int r0 = r1.readInt()
            r23 = 0
            if (r0 == 0) goto L_0x1841
            r23 = 1
        L_0x1841:
            int r0 = r1.readInt()
            r24 = 0
            if (r0 == 0) goto L_0x184b
            r24 = 1
        L_0x184b:
            int r0 = r1.readInt()
            r25 = 0
            if (r0 == 0) goto L_0x1855
            r25 = 1
        L_0x1855:
            int r0 = r1.readInt()
            r26 = 0
            if (r0 == 0) goto L_0x185f
            r26 = 1
        L_0x185f:
            int r0 = r1.readInt()
            r27 = 0
            if (r0 == 0) goto L_0x1869
            r27 = 1
        L_0x1869:
            int r0 = r1.readInt()
            r28 = 0
            if (r0 == 0) goto L_0x1873
            r28 = 1
        L_0x1873:
            int r0 = r1.readInt()
            r29 = 0
            if (r0 == 0) goto L_0x187d
            r29 = 1
        L_0x187d:
            int r0 = r1.readInt()
            r30 = 0
            if (r0 == 0) goto L_0x1887
            r30 = 1
        L_0x1887:
            int r0 = r1.readInt()
            r31 = 0
            if (r0 == 0) goto L_0x1891
            r31 = 1
        L_0x1891:
            int r0 = r1.readInt()
            r32 = 0
            if (r0 == 0) goto L_0x189b
            r32 = 1
        L_0x189b:
            int r0 = r1.readInt()
            r33 = 0
            if (r0 == 0) goto L_0x18a5
            r33 = 1
        L_0x18a5:
            int r0 = r1.readInt()
            r34 = 0
            if (r0 == 0) goto L_0x18af
            r34 = 1
        L_0x18af:
            int r0 = r1.readInt()
            r35 = 0
            if (r0 == 0) goto L_0x18b9
            r35 = 1
        L_0x18b9:
            int r0 = r1.readInt()
            r36 = 0
            if (r0 == 0) goto L_0x18c3
            r36 = 1
        L_0x18c3:
            int r7 = r1.readInt()
            int r0 = r1.readInt()
            r37 = 0
            if (r0 == 0) goto L_0x18d1
            r37 = 1
        L_0x18d1:
            int r0 = r1.readInt()
            r38 = 0
            if (r0 == 0) goto L_0x18db
            r38 = 1
        L_0x18db:
            int r0 = r1.readInt()
            r39 = 0
            if (r0 == 0) goto L_0x18e5
            r39 = 1
        L_0x18e5:
            int r0 = r1.readInt()
            r40 = 0
            if (r0 == 0) goto L_0x18ef
            r40 = 1
        L_0x18ef:
            int r0 = r1.readInt()
            r41 = 0
            if (r0 == 0) goto L_0x18f9
            r41 = 1
        L_0x18f9:
            int r0 = r1.readInt()
            r42 = 0
            if (r0 == 0) goto L_0x1903
            r42 = 1
        L_0x1903:
            int r0 = r1.readInt()
            r43 = 0
            if (r0 == 0) goto L_0x190d
            r43 = 1
        L_0x190d:
            int r0 = r1.readInt()
            r44 = 0
            if (r0 == 0) goto L_0x1917
            r44 = 1
        L_0x1917:
            int r0 = r1.readInt()
            r45 = 0
            if (r0 == 0) goto L_0x1921
            r45 = 1
        L_0x1921:
            int r0 = r1.readInt()
            r46 = 0
            if (r0 == 0) goto L_0x192b
            r46 = 1
        L_0x192b:
            int r0 = r1.readInt()
            r47 = 0
            if (r0 == 0) goto L_0x1935
            r47 = 1
        L_0x1935:
            int r0 = r1.readInt()
            r48 = 0
            if (r0 == 0) goto L_0x193f
            r48 = 1
        L_0x193f:
            int r0 = r1.readInt()
            r49 = 0
            if (r0 == 0) goto L_0x1949
            r49 = 1
        L_0x1949:
            int r0 = r1.readInt()
            r50 = 0
            if (r0 == 0) goto L_0x1953
            r50 = 1
        L_0x1953:
            int r0 = r1.readInt()
            r51 = 0
            if (r0 == 0) goto L_0x195d
            r51 = 1
        L_0x195d:
            int r0 = r1.readInt()
            r52 = 0
            if (r0 == 0) goto L_0x1967
            r52 = 1
        L_0x1967:
            int r0 = r1.readInt()
            r53 = 0
            if (r0 == 0) goto L_0x1971
            r53 = 1
        L_0x1971:
            int r0 = r1.readInt()
            r54 = 0
            if (r0 == 0) goto L_0x197b
            r54 = 1
        L_0x197b:
            int r0 = r1.readInt()
            r55 = 0
            if (r0 == 0) goto L_0x1985
            r55 = 1
        L_0x1985:
            int r0 = r1.readInt()
            r56 = 0
            if (r0 == 0) goto L_0x198f
            r56 = 1
        L_0x198f:
            int r0 = r1.readInt()
            r57 = 0
            if (r0 == 0) goto L_0x1999
            r57 = 1
        L_0x1999:
            int r0 = r1.readInt()
            r58 = 0
            if (r0 == 0) goto L_0x19a3
            r58 = 1
        L_0x19a3:
            int r8 = r1.readInt()
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r0 = new com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            return r0
        L_0x19ae:
            java.lang.String r0 = r1.readString()
            X.6oG r3 = X.C318046oG.valueOf(r0)
            goto L_0x17a3
        L_0x19b8:
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r0 = new com.instagram.creation.photo.edit.effectfilter.PhotoFilter
            r0.<init>(r1)
            return r0
        L_0x19be:
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r0 = new com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter
            r0.<init>()
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel> r2 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r2)
            r4.getClass()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel) r4
            r0.A00 = r4
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r3 = r4.A06
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r2 = r4.A0J
            float r1 = r3.A06
            r2.A06 = r1
            float r1 = r3.A00
            r2.A00 = r1
            float r1 = r3.A01
            r2.A01 = r1
            float r1 = r3.A02
            r2.A02 = r1
            float r1 = r3.A03
            r2.A03 = r1
            float r1 = r3.A04
            r2.A04 = r1
            float r1 = r3.A05
            r2.A05 = r1
            int r1 = r3.A07
            r2.A07 = r1
            r1 = 1
            r4.A0G = r1
            r4.A06 = r2
            return r0
        L_0x19fe:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.os.Parcelable$Creator r0 = com.instagram.direct.capabilities.Capabilities.CREATOR
            byte[] r0 = r1.createByteArray()
            java.util.BitSet r2 = java.util.BitSet.valueOf(r0)
            X.0qQ.A07(r2)
            byte[] r0 = r1.createByteArray()
            java.util.BitSet r1 = java.util.BitSet.valueOf(r0)
            X.0qQ.A07(r1)
            com.instagram.direct.capabilities.Capabilities r0 = new com.instagram.direct.capabilities.Capabilities
            r0.<init>(r2, r1)
            return r0
        L_0x1a20:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r1.readInt()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x1a2d
            r3 = 1
        L_0x1a2d:
            int r0 = r1.readInt()
            r2 = 0
            if (r0 == 0) goto L_0x1a35
            r2 = 1
        L_0x1a35:
            int r0 = r1.readInt()
            if (r0 != 0) goto L_0x1a3c
            r4 = 0
        L_0x1a3c:
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl r0 = new com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl
            r0.<init>(r3, r2, r4)
            return r0
        L_0x1a42:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.direct.inbox.notes.models.NoteAudience[] r2 = com.instagram.direct.inbox.notes.models.NoteAudience.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x1a51:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.direct.inbox.notes.models.NoteStyle[] r2 = com.instagram.direct.inbox.notes.models.NoteStyle.values()
            int r0 = r1.readInt()
            r0 = r2[r0]
            return r0
        L_0x1a60:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r3 = r1.readString()
            int r2 = r1.readInt()
            int r0 = r1.readInt()
            r1 = 0
            if (r0 == 0) goto L_0x1a74
            r1 = 1
        L_0x1a74:
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r0 = new com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction
            r0.<init>(r3, r2, r1)
            return r0
        L_0x1a7a:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            int r9 = r1.readInt()
            java.lang.Class<com.instagram.direct.messagethread.reactions.model.ReactionViewModel> r4 = com.instagram.direct.messagethread.reactions.model.ReactionViewModel.class
            java.lang.ClassLoader r0 = r4.getClassLoader()
            android.os.Parcelable r3 = r1.readParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.lang.String r8 = r1.readString()
            int r0 = r1.readInt()
            r10 = 0
            if (r0 == 0) goto L_0x1aa2
            r10 = 1
        L_0x1aa2:
            int r0 = r1.readInt()
            r11 = 0
            if (r0 == 0) goto L_0x1aaa
            r11 = 1
        L_0x1aaa:
            int r0 = r1.readInt()
            r12 = 0
            if (r0 == 0) goto L_0x1ab2
            r12 = 1
        L_0x1ab2:
            java.lang.ClassLoader r0 = r4.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r0)
            com.instagram.direct.model.messaginguser.MessagingUser r2 = (com.instagram.direct.model.messaginguser.MessagingUser) r2
            java.lang.ClassLoader r0 = r4.getClassLoader()
            android.os.Parcelable r1 = r1.readParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r0 = new com.instagram.direct.messagethread.reactions.model.ReactionViewModel
            r4 = r1
            r5 = r2
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x1acf:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r3 = r1.readString()
            long r1 = r1.readLong()
            r0 = 1
            X.0qQ.A0B(r3, r0)
            com.instagram.direct.model.DirectMessageEditHistory r0 = new com.instagram.direct.model.DirectMessageEditHistory
            r0.<init>()
            r0.A01 = r3
            r0.A00 = r1
            return r0
        L_0x1ae9:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r1.readInt()
            r58 = 0
            if (r0 == 0) goto L_0x1af7
            r58 = 1
        L_0x1af7:
            java.lang.String r5 = r1.readString()
            java.lang.String r6 = r1.readString()
            java.lang.String r7 = r1.readString()
            java.lang.String r8 = r1.readString()
            java.util.ArrayList r45 = r1.createStringArrayList()
            java.util.ArrayList r46 = r1.createStringArrayList()
            java.lang.String r9 = r1.readString()
            java.lang.String r10 = r1.readString()
            int r0 = r1.readInt()
            r4 = 0
            if (r0 != 0) goto L_0x1c03
            r3 = r4
        L_0x1b1f:
            java.lang.String r11 = r1.readString()
            java.lang.String r12 = r1.readString()
            int r49 = r1.readInt()
            java.lang.String r13 = r1.readString()
            java.lang.String r14 = r1.readString()
            int r50 = r1.readInt()
            int r51 = r1.readInt()
            int r52 = r1.readInt()
            int r53 = r1.readInt()
            java.lang.String r15 = r1.readString()
            java.lang.String r16 = r1.readString()
            java.lang.String r17 = r1.readString()
            java.lang.String r18 = r1.readString()
            java.lang.String r19 = r1.readString()
            java.lang.String r20 = r1.readString()
            int r54 = r1.readInt()
            int r55 = r1.readInt()
            int r56 = r1.readInt()
            java.lang.String r21 = r1.readString()
            java.lang.String r22 = r1.readString()
            java.lang.String r23 = r1.readString()
            java.lang.String r24 = r1.readString()
            java.lang.String r25 = r1.readString()
            java.lang.String r26 = r1.readString()
            java.lang.String r27 = r1.readString()
            java.lang.String r28 = r1.readString()
            java.util.ArrayList r47 = r1.createStringArrayList()
            java.util.ArrayList r48 = r1.createStringArrayList()
            java.lang.String r29 = r1.readString()
            java.lang.String r30 = r1.readString()
            java.lang.String r31 = r1.readString()
            java.lang.String r32 = r1.readString()
            java.lang.String r33 = r1.readString()
            java.lang.String r34 = r1.readString()
            java.lang.String r35 = r1.readString()
            java.lang.String r36 = r1.readString()
            int r0 = r1.readInt()
            if (r0 == 0) goto L_0x1bc3
            java.lang.String r0 = r1.readString()
            java.lang.String r2 = "COLOR"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x1bf8
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x1bc3:
            int r57 = r1.readInt()
            java.lang.String r37 = r1.readString()
            java.lang.String r38 = r1.readString()
            java.lang.String r39 = r1.readString()
            int r0 = r1.readInt()
            r59 = 0
            if (r0 == 0) goto L_0x1bdd
            r59 = 1
        L_0x1bdd:
            java.lang.String r40 = r1.readString()
            java.lang.String r41 = r1.readString()
            java.lang.String r42 = r1.readString()
            java.lang.String r43 = r1.readString()
            java.lang.String r44 = r1.readString()
            com.instagram.direct.model.DirectThreadThemeInfo r0 = new com.instagram.direct.model.DirectThreadThemeInfo
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            return r0
        L_0x1bf8:
            java.lang.String r2 = "THEME"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x1c2b
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x1bc3
        L_0x1c03:
            java.lang.String r2 = r1.readString()
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1c13
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x1b1f
        L_0x1c13:
            java.lang.String r0 = "DARK_MODE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1c1f
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x1b1f
        L_0x1c1f:
            java.lang.String r0 = "LIGHT_MODE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1c31
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x1b1f
        L_0x1c2b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x1c31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x1c37:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r2 = r1.readInt()
            java.lang.String r1 = r1.readString()
            r0 = 2
            X.0qQ.A0B(r1, r0)
            com.instagram.direct.model.comments.DirectMessageComments r0 = new com.instagram.direct.model.comments.DirectMessageComments
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            return r0
        L_0x1c51:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r4 = r1.readString()
            if (r4 != 0) goto L_0x1c5d
            java.lang.String r4 = ""
        L_0x1c5d:
            int r3 = r1.readInt()
            int r2 = r1.readInt()
            int r1 = r1.readInt()
            com.instagram.direct.model.mentions.MentionedEntity r0 = new com.instagram.direct.model.mentions.MentionedEntity
            r0.<init>()
            r0.A03 = r4
            r0.A01 = r3
            r0.A00 = r2
            r0.A02 = r1
            return r0
        L_0x1c77:
            com.instagram.direct.model.messaginguser.MessagingUser r0 = new com.instagram.direct.model.messaginguser.MessagingUser
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376419Hx.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
