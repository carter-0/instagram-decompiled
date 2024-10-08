package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;
import com.instagram.api.schemas.ImageURIDict;
import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryPromptParticipationFrictionType;
import com.instagram.api.schemas.StoryPromptPrefType;
import com.instagram.api.schemas.StorySmbSupportStickerObjectImpl;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict;
import com.instagram.api.schemas.StoryTemplateReshareMediaDictImpl;
import com.instagram.api.schemas.StoryTextAttributionType;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import com.instagram.api.schemas.StoryTrendingTemplateSectionType;
import com.instagram.api.schemas.StoryUnlockableStickerDataImpl;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObjectImpl;
import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.TIXUDesignTypeEnum;
import com.instagram.api.schemas.TappableComponentFeedRole;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.TemplateTopic;
import com.instagram.api.schemas.TemplatesBrowserSectionSize;
import com.instagram.api.schemas.TestimonialDictImpl;
import com.instagram.api.schemas.TextAppAutoArchiveSettingInt;
import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.api.schemas.TextAppMessagingPrototypeEligibility;
import com.instagram.api.schemas.TextAppOnlineStatusVisibilitySetting;
import com.instagram.api.schemas.TextAppPostBatchPurpose;
import com.instagram.api.schemas.TextAppRecommendedUsersType;
import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;
import com.instagram.api.schemas.TextAppShareIgDirectContactRecommendationEntityType;
import com.instagram.api.schemas.TextAppTextFragmentType;
import com.instagram.api.schemas.TextAppUserFavoriteNotificationPostType;
import com.instagram.api.schemas.TextEntityType;
import com.instagram.api.schemas.TextPostAppAYSFButton;
import com.instagram.api.schemas.TextPostAppAYSFStyle;
import com.instagram.api.schemas.TextPostAppBadgeStatus;
import com.instagram.api.schemas.TextPostAppBottomSheetCTAType;
import com.instagram.api.schemas.TextPostAppPostUnavailableReason;
import com.instagram.api.schemas.TextPostAppUserFediverseInfoImpl;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderContextType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.api.schemas.ThumbnailInteractionType;
import com.instagram.api.schemas.Topic;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.api.schemas.UnlockableStickerStatus;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.api.schemas.UrpIndexAction;
import com.instagram.api.schemas.UrpRendererType;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDict;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDictImpl;
import com.instagram.api.schemas.UserCallSettings;
import com.instagram.api.schemas.UserRelatedAccountsInfoDictImpl;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.api.schemas.VisualSearchSuggestedProductContainer;
import com.instagram.api.schemas.WordOffsetImpl;
import com.instagram.api.schemas.WorldLocationPagesInfoImpl;
import com.instagram.api.schemas.XDTCreatorInspirationHubType;
import com.instagram.api.schemas.XDTIGAIAgentBannerType;
import com.instagram.api.schemas.XDTMetaAIMediaSuggestedPromptInfoImpl;
import com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory;
import com.instagram.api.schemas.XFBBABITermsAcceptanceStatus;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.api.schemas.XFBIGBoostAudienceGeolocationImportance;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfoImpl;
import com.instagram.api.schemas.ZodiacSign;
import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.avatar.AddAvatarHelper$LoadedImage$LoadedImageMetadata;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.barcelona.creation.location.model.PostLocationModel;
import com.instagram.barcelona.creation.voiceclips.model.TranscriptionToken;
import com.instagram.barcelona.creation.voiceclips.model.VoiceRecordingResult;
import com.instagram.barcelona.location.model.LocationModel;
import com.instagram.barcelona.permalink.ui.state.PermalinkTitle$CountdownTitle;
import com.instagram.barcelona.permalink.ui.state.PermalinkTitle$Ephemeral24HrTitle;
import com.instagram.barcelona.permalink.ui.state.PermalinkTitle$SectionTitle;
import com.instagram.barcelonaig.intf.GetApp$Type;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.brandedcontent.adseligibility.util.AdsEligibilityErrorDataItem;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs;
import com.instagram.brandedcontent.intf.response.MonetizationProductOnboardingNextStepInfo;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import go.Seq;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.webrtc.EglBase14Impl;

public final class FK6 implements Parcelable.Creator {
    public final int A00;

    public FK6(int i) {
        this.A00 = i;
    }

    public static FK6 A00(int i) {
        return new FK6(i);
    }

    /* JADX WARNING: type inference failed for: r10v95, types: [java.lang.Object, com.instagram.brandedcontent.intf.response.MonetizationProductOnboardingNextStepInfo] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Float valueOf;
        Float valueOf2;
        Float valueOf3;
        Float valueOf4;
        Integer A12;
        Boolean valueOf5;
        Integer A122;
        Boolean valueOf6;
        ArrayList A0v;
        Long valueOf7;
        Integer A123;
        Integer A124;
        ArrayList A0v2;
        Long valueOf8;
        Boolean valueOf9;
        Integer A125;
        LinkedHashMap A0x;
        Integer A126;
        Double valueOf10;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                0qQ.A0B(parcel2, 0);
                return StoryPromptParticipationFrictionType.values()[parcel2.readInt()];
            case 1:
                0qQ.A0B(parcel2, 0);
                return StoryPromptPrefType.values()[parcel2.readInt()];
            case 2:
                String A1D = C41848B3p.A1D(parcel2);
                String readString = parcel2.readString();
                String readString2 = parcel2.readString();
                String readString3 = parcel2.readString();
                Float f = null;
                if (parcel2.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Float.valueOf(parcel2.readFloat());
                }
                Float A0B = Dbc.A0B(parcel2);
                String readString4 = parcel2.readString();
                Integer A0C = Dbc.A0C(parcel2);
                Integer A0C2 = Dbc.A0C(parcel2);
                Integer A0C3 = Dbc.A0C(parcel2);
                Integer A0C4 = Dbc.A0C(parcel2);
                String readString5 = parcel2.readString();
                Float A0B2 = Dbc.A0B(parcel2);
                Class<StorySmbSupportStickerObjectImpl> cls = StorySmbSupportStickerObjectImpl.class;
                SMBSupportStickerDict sMBSupportStickerDict = (SMBSupportStickerDict) C41847B3o.A03(parcel2, cls);
                Float A0B3 = Dbc.A0B(parcel2);
                Integer A0C5 = Dbc.A0C(parcel2);
                SubscriptionStickerDict subscriptionStickerDict = (SubscriptionStickerDict) C41847B3o.A03(parcel2, cls);
                StickerTraySurface stickerTraySurface = (StickerTraySurface) C41847B3o.A03(parcel2, cls);
                Float A0B4 = Dbc.A0B(parcel2);
                Float A0B5 = Dbc.A0B(parcel2);
                Float A0B6 = Dbc.A0B(parcel2);
                if (parcel2.readInt() != 0) {
                    f = Float.valueOf(parcel2.readFloat());
                }
                return new StorySmbSupportStickerObjectImpl(sMBSupportStickerDict, stickerTraySurface, subscriptionStickerDict, valueOf, A0B, A0B2, A0B3, A0B4, A0B5, A0B6, f, A0C, A0C2, A0C3, A0C4, A0C5, A1D, readString, readString2, readString3, readString4, readString5);
            case 3:
                String A1D2 = C41848B3p.A1D(parcel2);
                Integer num = null;
                if (parcel2.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Float.valueOf(parcel2.readFloat());
                }
                String readString6 = parcel2.readString();
                String readString7 = parcel2.readString();
                Float A0B7 = Dbc.A0B(parcel2);
                Float A0B8 = Dbc.A0B(parcel2);
                Float A0B9 = Dbc.A0B(parcel2);
                Float A0B10 = Dbc.A0B(parcel2);
                if (parcel2.readInt() != 0) {
                    num = C41847B3o.A12(parcel2);
                }
                return new StoryTemplateAvatarStickerOverlayDictImpl(valueOf2, A0B7, A0B8, A0B9, A0B10, num, A1D2, readString6, readString7);
            case 4:
                0qQ.A0B(parcel2, 0);
                StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes = (StoryTemplateFillableGalleryStickerShapes) C41847B3o.A03(parcel2, StoryTemplateFillableGalleryStickerDictImpl.class);
                Integer num2 = null;
                if (parcel2.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Float.valueOf(parcel2.readFloat());
                }
                Float A0B11 = Dbc.A0B(parcel2);
                Float A0B12 = Dbc.A0B(parcel2);
                Float A0B13 = Dbc.A0B(parcel2);
                Float A0B14 = Dbc.A0B(parcel2);
                if (parcel2.readInt() != 0) {
                    num2 = C41847B3o.A12(parcel2);
                }
                return new StoryTemplateFillableGalleryStickerDictImpl(storyTemplateFillableGalleryStickerShapes, valueOf3, A0B11, A0B12, A0B13, A0B14, num2);
            case 5:
                0qQ.A0B(parcel2, 0);
                return StoryTemplateFillableGalleryStickerShapes.values()[parcel2.readInt()];
            case 6:
                String A1D3 = C41848B3p.A1D(parcel2);
                Integer num3 = null;
                if (parcel2.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Float.valueOf(parcel2.readFloat());
                }
                Float A0B15 = Dbc.A0B(parcel2);
                Float A0B16 = Dbc.A0B(parcel2);
                Float A0B17 = Dbc.A0B(parcel2);
                Float A0B18 = Dbc.A0B(parcel2);
                if (parcel2.readInt() != 0) {
                    num3 = C41847B3o.A12(parcel2);
                }
                return new StoryTemplateFillableMusicStickerDictImpl(valueOf4, A0B15, A0B16, A0B17, A0B18, num3, A1D3);
            case 7:
                String A1D4 = C41848B3p.A1D(parcel2);
                String readString8 = parcel2.readString();
                Boolean bool = null;
                if (parcel2.readInt() == 0) {
                    A12 = null;
                } else {
                    A12 = C41847B3o.A12(parcel2);
                }
                boolean z = true;
                if (parcel2.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                if (parcel2.readInt() != 0) {
                    if (parcel2.readInt() == 0) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new StoryTemplateMusicAssetInfoDict(valueOf5, bool, A12, A1D4, readString8, parcel2.readString(), parcel2.readString());
            case 8:
                if (C41848B3p.A00(parcel2) == 0) {
                    A122 = null;
                } else {
                    A122 = C41847B3o.A12(parcel2);
                }
                return new StoryTemplateReshareMediaDictImpl(parcel2.readString(), A122, parcel2.readString());
            case 9:
                0qQ.A0B(parcel2, 0);
                return StoryTextAttributionType.values()[parcel2.readInt()];
            case 10:
                String A1D5 = C41848B3p.A1D(parcel2);
                String readString9 = parcel2.readString();
                String readString10 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                return new StoryThenAndNowStickerDict(valueOf6, A1D5, readString9, readString10);
            case 11:
                0qQ.A0B(parcel2, 0);
                return StoryTrendingPromptMediaSubType.values()[parcel2.readInt()];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                0qQ.A0B(parcel2, 0);
                return StoryTrendingPromptSubType.values()[parcel2.readInt()];
            case 13:
                0qQ.A0B(parcel2, 0);
                return StoryTrendingTemplateSectionType.values()[parcel2.readInt()];
            case 14:
                Class<StoryUnlockableStickerDataImpl> cls2 = StoryUnlockableStickerDataImpl.class;
                return new StoryUnlockableStickerDataImpl((ImageURIDict) C41847B3o.A03(parcel2, cls2), (UnlockableStickerStatus) C41847B3o.A03(parcel2, cls2), C41848B3p.A1D(parcel2), parcel2.readString());
            case 15:
                if (C41848B3p.A00(parcel2) == 0) {
                    A0v = null;
                } else {
                    int readInt = parcel2.readInt();
                    A0v = DbS.A0v(readInt);
                    for (int i = 0; i != readInt; i++) {
                        C41848B3p.A1J(parcel2, StoryUnlockableStickerTappableObjectImpl.class, A0v);
                    }
                }
                return new StoryUnlockableStickerTappableObjectImpl(parcel2.readString(), parcel2.readString(), A0v);
            case 16:
                0qQ.A0B(parcel2, 0);
                return SubmittedSubPostManageType.values()[parcel2.readInt()];
            case 17:
                0qQ.A0B(parcel2, 0);
                return TIXUDesignTypeEnum.values()[parcel2.readInt()];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                0qQ.A0B(parcel2, 0);
                return TappableComponentFeedRole.values()[parcel2.readInt()];
            case 19:
                0qQ.A0B(parcel2, 0);
                return TargetingRelaxationConstants.values()[parcel2.readInt()];
            case 20:
                0qQ.A0B(parcel2, 0);
                return TemplateTopic.values()[parcel2.readInt()];
            case 21:
                0qQ.A0B(parcel2, 0);
                return TemplatesBrowserSectionSize.values()[parcel2.readInt()];
            case 22:
                0qQ.A0B(parcel2, 0);
                User A03 = C41847B3o.A03(parcel2, TestimonialDictImpl.class);
                if (parcel2.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Long.valueOf(parcel2.readLong());
                }
                return new TestimonialDictImpl(A03, valueOf7, parcel2.readString(), parcel2.readString());
            case 23:
                0qQ.A0B(parcel2, 0);
                return TextAppAutoArchiveSettingInt.values()[parcel2.readInt()];
            case 24:
                0qQ.A0B(parcel2, 0);
                return TextAppMentionType.values()[parcel2.readInt()];
            case 25:
                0qQ.A0B(parcel2, 0);
                return TextAppMessagingPrototypeEligibility.values()[parcel2.readInt()];
            case 26:
                0qQ.A0B(parcel2, 0);
                return TextAppOnlineStatusVisibilitySetting.values()[parcel2.readInt()];
            case 27:
                0qQ.A0B(parcel2, 0);
                return TextAppPostBatchPurpose.values()[parcel2.readInt()];
            case 28:
                0qQ.A0B(parcel2, 0);
                return TextAppRecommendedUsersType.values()[parcel2.readInt()];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new TextAppSearchDiscussionTopicImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 30:
                0qQ.A0B(parcel2, 0);
                return TextAppShareIgDirectContactRecommendationEntityType.values()[parcel2.readInt()];
            case 31:
                0qQ.A0B(parcel2, 0);
                return TextAppTextFragmentType.values()[parcel2.readInt()];
            case 32:
                0qQ.A0B(parcel2, 0);
                return TextAppUserFavoriteNotificationPostType.values()[parcel2.readInt()];
            case 33:
                0qQ.A0B(parcel2, 0);
                return TextEntityType.values()[parcel2.readInt()];
            case 34:
                0qQ.A0B(parcel2, 0);
                return TextPostAppAYSFButton.values()[parcel2.readInt()];
            case 35:
                0qQ.A0B(parcel2, 0);
                return TextPostAppAYSFStyle.values()[parcel2.readInt()];
            case 36:
                0qQ.A0B(parcel2, 0);
                return TextPostAppBadgeStatus.values()[parcel2.readInt()];
            case 37:
                0qQ.A0B(parcel2, 0);
                return TextPostAppBottomSheetCTAType.values()[parcel2.readInt()];
            case 38:
                0qQ.A0B(parcel2, 0);
                return TextPostAppPostUnavailableReason.values()[parcel2.readInt()];
            case 39:
                Integer num4 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    A123 = null;
                } else {
                    A123 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    num4 = C41847B3o.A12(parcel2);
                }
                return new TextPostAppUserFediverseInfoImpl(A123, num4);
            case 40:
                0qQ.A0B(parcel2, 0);
                return TextReviewStatus.values()[parcel2.readInt()];
            case Seq.NULL_REFNUM:
                String A1D6 = C41848B3p.A1D(parcel2);
                if (parcel2.readInt() == 0) {
                    A124 = null;
                } else {
                    A124 = C41847B3o.A12(parcel2);
                }
                return new TextWithEntitiesBlockDict((TextWithEntities) C41847B3o.A03(parcel2, TextWithEntitiesBlockDict.class), A124, A1D6);
            case Seq.RefTracker.REF_OFFSET:
                0qQ.A0B(parcel2, 0);
                return ThreadContainerType.values()[parcel2.readInt()];
            case 43:
                0qQ.A0B(parcel2, 0);
                return ThreadHeaderContextType.values()[parcel2.readInt()];
            case 44:
                0qQ.A0B(parcel2, 0);
                return ThreadHeaderStyle.values()[parcel2.readInt()];
            case 45:
                0qQ.A0B(parcel2, 0);
                return ThreadItemType.values()[parcel2.readInt()];
            case 46:
                0qQ.A0B(parcel2, 0);
                return ThumbnailInteractionType.values()[parcel2.readInt()];
            case 47:
                return new Topic(C41848B3p.A1D(parcel2), parcel2.readString());
            case 48:
                boolean z2 = true;
                boolean A1P = AnonymousClass7TF.A1P(C41848B3p.A00(parcel2));
                Integer num5 = null;
                if (parcel2.readInt() == 0) {
                    A0v2 = null;
                } else {
                    int readInt2 = parcel2.readInt();
                    A0v2 = DbS.A0v(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        C41848B3p.A1J(parcel2, TrackMetadataImpl.class, A0v2);
                    }
                }
                if (parcel2.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Long.valueOf(parcel2.readLong());
                }
                String readString11 = parcel2.readString();
                boolean A1X = C41848B3p.A1X(parcel2);
                if (parcel2.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    if (parcel2.readInt() == 0) {
                        z2 = false;
                    }
                    valueOf9 = Boolean.valueOf(z2);
                }
                Integer A0C6 = Dbc.A0C(parcel2);
                if (parcel2.readInt() != 0) {
                    num5 = C41847B3o.A12(parcel2);
                }
                return new TrackMetadataImpl(valueOf9, A0C6, num5, valueOf8, readString11, A0v2, A1P, A1X);
            case 49:
                0qQ.A0B(parcel2, 0);
                Class<TrackOrOriginalSoundSchema> cls3 = TrackOrOriginalSoundSchema.class;
                return new TrackOrOriginalSoundSchema(C41847B3o.A03(parcel2, cls3), (TrackData) C41847B3o.A03(parcel2, cls3), (TrackMetadata) C41847B3o.A03(parcel2, cls3));
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                0qQ.A0B(parcel2, 0);
                return UnlockableStickerStatus.values()[parcel2.readInt()];
            case 51:
                0qQ.A0B(parcel2, 0);
                Class<UntaggableReason> cls4 = UntaggableReason.class;
                return new UntaggableReason((InstagramProductTaggabilityState) C41847B3o.A03(parcel2, cls4), (LinkWithText) C41847B3o.A03(parcel2, cls4), (LinkWithText) C41847B3o.A03(parcel2, cls4), parcel2.readString(), parcel2.readString());
            case 52:
                0qQ.A0B(parcel2, 0);
                return UpcomingEventIDType.values()[parcel2.readInt()];
            case 53:
                0qQ.A0B(parcel2, 0);
                return UpcomingEventStickerSource.values()[parcel2.readInt()];
            case 54:
                0qQ.A0B(parcel2, 0);
                return UrpIndexAction.values()[parcel2.readInt()];
            case 55:
                0qQ.A0B(parcel2, 0);
                return UrpRendererType.values()[parcel2.readInt()];
            case 56:
                return new UserBannerInlineOtherProfileDictImpl((IgUserRelatedAccountTypeEnum) C41847B3o.A03(parcel2, UserBannerInlineOtherProfileDictImpl.class), C41848B3p.A1D(parcel2), parcel2.readString());
            case 57:
                0qQ.A0B(parcel2, 0);
                return UserCallSettings.values()[parcel2.readInt()];
            case 58:
                0qQ.A0B(parcel2, 0);
                return new UserRelatedAccountsInfoDictImpl((UserBannerInlineOtherProfileDict) C41847B3o.A03(parcel2, UserRelatedAccountsInfoDictImpl.class), parcel2.readString());
            case 59:
                0qQ.A0B(parcel2, 0);
                return UserRoleOnFundraiser.values()[parcel2.readInt()];
            case 60:
                0qQ.A0B(parcel2, 0);
                return new VisualSearchSuggestedProductContainer(parcel2.readLong(), parcel2.readLong());
            case 61:
                return new WordOffsetImpl(C41848B3p.A00(parcel2), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), C41848B3p.A1X(parcel2));
            case 62:
                String A1D7 = C41848B3p.A1D(parcel2);
                if (parcel2.readInt() == 0) {
                    A125 = null;
                } else {
                    A125 = C41847B3o.A12(parcel2);
                }
                return new WorldLocationPagesInfoImpl(A1D7, A125, parcel2.readString());
            case 63:
                0qQ.A0B(parcel2, 0);
                return XDTCreatorInspirationHubType.values()[parcel2.readInt()];
            case 64:
                0qQ.A0B(parcel2, 0);
                return XDTIGAIAgentBannerType.values()[parcel2.readInt()];
            case 65:
                return new XDTMetaAIMediaSuggestedPromptInfoImpl(C41848B3p.A1D(parcel2));
            case 66:
                0qQ.A0B(parcel2, 0);
                return XFBAdproRegionalRegulatedCategory.values()[parcel2.readInt()];
            case 67:
                0qQ.A0B(parcel2, 0);
                return XFBBABITermsAcceptanceStatus.values()[parcel2.readInt()];
            case 68:
                0qQ.A0B(parcel2, 0);
                return XFBCTXWelcomeMessageStatus.values()[parcel2.readInt()];
            case 69:
                0qQ.A0B(parcel2, 0);
                return XFBFXIGPCEntryPoint.values()[parcel2.readInt()];
            case 70:
                0qQ.A0B(parcel2, 0);
                return XFBIGBoostAudienceGeolocationImportance.values()[parcel2.readInt()];
            case 71:
                0qQ.A0B(parcel2, 0);
                return XFBTargetingAutomationAdvantageAudienceStatus.values()[parcel2.readInt()];
            case 72:
                0qQ.A0B(parcel2, 0);
                return XFBYPRequestStatus.values()[parcel2.readInt()];
            case 73:
                0qQ.A0B(parcel2, 0);
                return XIGIGBoostCallToAction.values()[parcel2.readInt()];
            case 74:
                0qQ.A0B(parcel2, 0);
                return XIGIGBoostDestination.values()[parcel2.readInt()];
            case 75:
                return new XpostOriginalSoundFBCreatorInfoImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 76:
                0qQ.A0B(parcel2, 0);
                return ZodiacSign.values()[parcel2.readInt()];
            case 77:
                return new LoggingData(C41848B3p.A1D(parcel2), parcel2.readString());
            case 78:
                return new LoggingFanData(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 79:
                boolean z3 = true;
                boolean A1P2 = AnonymousClass7TF.A1P(C41848B3p.A00(parcel2));
                if (parcel2.readInt() == 0) {
                    z3 = false;
                }
                if (parcel2.readInt() == 0) {
                    A0x = null;
                } else {
                    int readInt3 = parcel2.readInt();
                    A0x = DbS.A0x(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        A0x.put(Long.valueOf(parcel2.readLong()), Long.valueOf(parcel2.readLong()));
                    }
                }
                return new CreatorLoggingData(A1P2, z3, A0x);
            case 80:
                String A1D8 = C41848B3p.A1D(parcel2);
                String readString12 = parcel2.readString();
                Class<EffectsPageModel> cls5 = EffectsPageModel.class;
                ImageUrl imageUrl = (ImageUrl) C41847B3o.A03(parcel2, cls5);
                Integer num6 = null;
                if (parcel2.readInt() == 0) {
                    A126 = null;
                } else {
                    A126 = C41847B3o.A12(parcel2);
                }
                String readString13 = parcel2.readString();
                String readString14 = parcel2.readString();
                String readString15 = parcel2.readString();
                String readString16 = parcel2.readString();
                String readString17 = parcel2.readString();
                boolean A1X2 = C41848B3p.A1X(parcel2);
                boolean A1X3 = C41848B3p.A1X(parcel2);
                Integer A0C7 = Dbc.A0C(parcel2);
                boolean A1X4 = C41848B3p.A1X(parcel2);
                boolean A1X5 = C41848B3p.A1X(parcel2);
                EffectAttribution effectAttribution = (EffectAttribution) C41847B3o.A03(parcel2, cls5);
                Integer A0C8 = Dbc.A0C(parcel2);
                boolean A1X6 = C41848B3p.A1X(parcel2);
                boolean A1X7 = C41848B3p.A1X(parcel2);
                boolean A1X8 = C41848B3p.A1X(parcel2);
                String readString18 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num6 = C41847B3o.A12(parcel2);
                }
                return new EffectsPageModel(effectAttribution, imageUrl, A126, A0C7, A0C8, num6, A1D8, readString12, readString13, readString14, readString15, readString16, readString17, readString18, A1X2, A1X3, A1X4, A1X5, A1X6, A1X7, A1X8, C41848B3p.A1X(parcel2));
            case 81:
                return new ArchivePendingUpload(C41848B3p.A1D(parcel2), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2));
            case 82:
                0qQ.A0B(parcel2, 0);
                return new AddAvatarHelper$LoadedImage$LoadedImageMetadata(parcel2);
            case 83:
                return UpdateProfilePicturePagerAdapter$UpdateProfileTabType.valueOf(C41848B3p.A1D(parcel2));
            case 84:
                return new PostLocationModel((LocationModel) C41847B3o.A03(parcel2, PostLocationModel.class), C41848B3p.A1D(parcel2));
            case 85:
                return new TranscriptionToken(C41848B3p.A1D(parcel2), parcel2.readInt(), parcel2.readInt(), C41848B3p.A1X(parcel2));
            case 86:
                return new VoiceRecordingResult(C41848B3p.A1D(parcel2), parcel2.readString());
            case 87:
                0qQ.A0B(parcel2, 0);
                long readLong = parcel2.readLong();
                String readString19 = parcel2.readString();
                Double d = null;
                if (parcel2.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Double.valueOf(parcel2.readDouble());
                }
                if (parcel2.readInt() != 0) {
                    d = Double.valueOf(parcel2.readDouble());
                }
                return new LocationModel(valueOf10, d, readString19, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), readLong);
            case 88:
                return new PermalinkTitle$CountdownTitle(C41848B3p.A00(parcel2), parcel2.readLong());
            case 89:
                return new PermalinkTitle$Ephemeral24HrTitle(C41848B3p.A00(parcel2));
            case 90:
                return new PermalinkTitle$SectionTitle(C41848B3p.A00(parcel2), parcel2.readString());
            case 91:
                return GetApp$Type.valueOf(C41848B3p.A1D(parcel2));
            case 92:
                return new IgBloksScreenConfig(parcel2);
            case 93:
                return new AdsEligibilityErrorDataItem(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString());
            case 94:
                0qQ.A0B(parcel2, 0);
                parcel2.readInt();
                return new BrandedContentDisclosureArgs();
            case 95:
                0qQ.A0B(parcel2, 0);
                ? obj = new Object();
                obj.A00 = parcel2.readInt();
                obj.A01 = parcel2.readString();
                return obj;
            case 96:
                String A1D9 = C41848B3p.A1D(parcel2);
                if (A1D9 == null) {
                    A1D9 = "";
                }
                String readString20 = parcel2.readString();
                if (readString20 == null) {
                    readString20 = "";
                }
                String readString21 = parcel2.readString();
                if (readString21 == null) {
                    readString21 = "";
                }
                return new BugReportComposerViewModel(A1D9, readString20, readString21, AnonymousClass7TF.A1P(parcel2.readByte()), AnonymousClass7TF.A1P(parcel2.readByte()), AnonymousClass7TF.A1P(parcel2.readByte()));
            case 97:
                String A1D10 = C41848B3p.A1D(parcel2);
                String readString22 = parcel2.readString();
                int readInt4 = parcel2.readInt();
                ArrayList A0v3 = DbS.A0v(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    C41848B3p.A1J(parcel2, BugReport.class, A0v3);
                }
                int readInt5 = parcel2.readInt();
                ArrayList A0v4 = DbS.A0v(readInt5);
                for (int i5 = 0; i5 != readInt5; i5++) {
                    int readInt6 = parcel2.readInt();
                    ArrayList A0v5 = DbS.A0v(readInt6);
                    for (int i6 = 0; i6 != readInt6; i6++) {
                        C41848B3p.A1J(parcel2, BugReport.class, A0v5);
                    }
                    A0v4.add(A0v5);
                }
                int readInt7 = parcel2.readInt();
                ArrayList A0v6 = DbS.A0v(readInt7);
                for (int i7 = 0; i7 != readInt7; i7++) {
                    C41848B3p.A1J(parcel2, BugReport.class, A0v6);
                }
                int readInt8 = parcel2.readInt();
                ArrayList A0v7 = DbS.A0v(readInt8);
                for (int i8 = 0; i8 != readInt8; i8++) {
                    C41848B3p.A1J(parcel2, BugReport.class, A0v7);
                }
                String readString23 = parcel2.readString();
                String readString24 = parcel2.readString();
                String readString25 = parcel2.readString();
                String readString26 = parcel2.readString();
                BugReportSource valueOf11 = BugReportSource.valueOf(parcel2.readString());
                int readInt9 = parcel2.readInt();
                LinkedHashMap A0x2 = DbS.A0x(readInt9);
                for (int i9 = 0; i9 != readInt9; i9++) {
                    A0x2.put(parcel2.readString(), parcel2.readString());
                }
                boolean A1X9 = C41848B3p.A1X(parcel2);
                Class<BugReport> cls6 = BugReport.class;
                return new BugReport(valueOf11, (AttachmentCounter) C41847B3o.A03(parcel2, cls6), (AttachmentCounter) C41847B3o.A03(parcel2, cls6), (AttachmentCounter) C41847B3o.A03(parcel2, cls6), (AttachmentCounter) C41847B3o.A03(parcel2, cls6), (File) parcel2.readSerializable(), A1D10, readString22, readString23, readString24, readString25, readString26, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), A0v3, A0v4, A0v6, A0v7, A0x2, A1X9);
            case 98:
                return BoostMediaPickerTabType.valueOf(C41848B3p.A1D(parcel2));
            default:
                0qQ.A0B(parcel2, 0);
                return AdCreativeAuthorizationCategory.values()[parcel2.readInt()];
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new StoryPromptParticipationFrictionType[i];
            case 1:
                return new StoryPromptPrefType[i];
            case 2:
                return new StorySmbSupportStickerObjectImpl[i];
            case 3:
                return new StoryTemplateAvatarStickerOverlayDictImpl[i];
            case 4:
                return new StoryTemplateFillableGalleryStickerDictImpl[i];
            case 5:
                return new StoryTemplateFillableGalleryStickerShapes[i];
            case 6:
                return new StoryTemplateFillableMusicStickerDictImpl[i];
            case 7:
                return new StoryTemplateMusicAssetInfoDict[i];
            case 8:
                return new StoryTemplateReshareMediaDictImpl[i];
            case 9:
                return new StoryTextAttributionType[i];
            case 10:
                return new StoryThenAndNowStickerDict[i];
            case 11:
                return new StoryTrendingPromptMediaSubType[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new StoryTrendingPromptSubType[i];
            case 13:
                return new StoryTrendingTemplateSectionType[i];
            case 14:
                return new StoryUnlockableStickerDataImpl[i];
            case 15:
                return new StoryUnlockableStickerTappableObjectImpl[i];
            case 16:
                return new SubmittedSubPostManageType[i];
            case 17:
                return new TIXUDesignTypeEnum[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new TappableComponentFeedRole[i];
            case 19:
                return new TargetingRelaxationConstants[i];
            case 20:
                return new TemplateTopic[i];
            case 21:
                return new TemplatesBrowserSectionSize[i];
            case 22:
                return new TestimonialDictImpl[i];
            case 23:
                return new TextAppAutoArchiveSettingInt[i];
            case 24:
                return new TextAppMentionType[i];
            case 25:
                return new TextAppMessagingPrototypeEligibility[i];
            case 26:
                return new TextAppOnlineStatusVisibilitySetting[i];
            case 27:
                return new TextAppPostBatchPurpose[i];
            case 28:
                return new TextAppRecommendedUsersType[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new TextAppSearchDiscussionTopicImpl[i];
            case 30:
                return new TextAppShareIgDirectContactRecommendationEntityType[i];
            case 31:
                return new TextAppTextFragmentType[i];
            case 32:
                return new TextAppUserFavoriteNotificationPostType[i];
            case 33:
                return new TextEntityType[i];
            case 34:
                return new TextPostAppAYSFButton[i];
            case 35:
                return new TextPostAppAYSFStyle[i];
            case 36:
                return new TextPostAppBadgeStatus[i];
            case 37:
                return new TextPostAppBottomSheetCTAType[i];
            case 38:
                return new TextPostAppPostUnavailableReason[i];
            case 39:
                return new TextPostAppUserFediverseInfoImpl[i];
            case 40:
                return new TextReviewStatus[i];
            case Seq.NULL_REFNUM:
                return new TextWithEntitiesBlockDict[i];
            case Seq.RefTracker.REF_OFFSET:
                return new ThreadContainerType[i];
            case 43:
                return new ThreadHeaderContextType[i];
            case 44:
                return new ThreadHeaderStyle[i];
            case 45:
                return new ThreadItemType[i];
            case 46:
                return new ThumbnailInteractionType[i];
            case 47:
                return new Topic[i];
            case 48:
                return new TrackMetadataImpl[i];
            case 49:
                return new TrackOrOriginalSoundSchema[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new UnlockableStickerStatus[i];
            case 51:
                return new UntaggableReason[i];
            case 52:
                return new UpcomingEventIDType[i];
            case 53:
                return new UpcomingEventStickerSource[i];
            case 54:
                return new UrpIndexAction[i];
            case 55:
                return new UrpRendererType[i];
            case 56:
                return new UserBannerInlineOtherProfileDictImpl[i];
            case 57:
                return new UserCallSettings[i];
            case 58:
                return new UserRelatedAccountsInfoDictImpl[i];
            case 59:
                return new UserRoleOnFundraiser[i];
            case 60:
                return new VisualSearchSuggestedProductContainer[i];
            case 61:
                return new WordOffsetImpl[i];
            case 62:
                return new WorldLocationPagesInfoImpl[i];
            case 63:
                return new XDTCreatorInspirationHubType[i];
            case 64:
                return new XDTIGAIAgentBannerType[i];
            case 65:
                return new XDTMetaAIMediaSuggestedPromptInfoImpl[i];
            case 66:
                return new XFBAdproRegionalRegulatedCategory[i];
            case 67:
                return new XFBBABITermsAcceptanceStatus[i];
            case 68:
                return new XFBCTXWelcomeMessageStatus[i];
            case 69:
                return new XFBFXIGPCEntryPoint[i];
            case 70:
                return new XFBIGBoostAudienceGeolocationImportance[i];
            case 71:
                return new XFBTargetingAutomationAdvantageAudienceStatus[i];
            case 72:
                return new XFBYPRequestStatus[i];
            case 73:
                return new XIGIGBoostCallToAction[i];
            case 74:
                return new XIGIGBoostDestination[i];
            case 75:
                return new XpostOriginalSoundFBCreatorInfoImpl[i];
            case 76:
                return new ZodiacSign[i];
            case 77:
                return new LoggingData[i];
            case 78:
                return new LoggingFanData[i];
            case 79:
                return new CreatorLoggingData[i];
            case 80:
                return new EffectsPageModel[i];
            case 81:
                return new ArchivePendingUpload[i];
            case 82:
                return new AddAvatarHelper$LoadedImage$LoadedImageMetadata[i];
            case 83:
                return new UpdateProfilePicturePagerAdapter$UpdateProfileTabType[i];
            case 84:
                return new PostLocationModel[i];
            case 85:
                return new TranscriptionToken[i];
            case 86:
                return new VoiceRecordingResult[i];
            case 87:
                return new LocationModel[i];
            case 88:
                return new PermalinkTitle$CountdownTitle[i];
            case 89:
                return new PermalinkTitle$Ephemeral24HrTitle[i];
            case 90:
                return new PermalinkTitle$SectionTitle[i];
            case 91:
                return new GetApp$Type[i];
            case 92:
                return new IgBloksScreenConfig[i];
            case 93:
                return new AdsEligibilityErrorDataItem[i];
            case 94:
                return new BrandedContentDisclosureArgs[i];
            case 95:
                return new MonetizationProductOnboardingNextStepInfo[i];
            case 96:
                return new BugReportComposerViewModel[i];
            case 97:
                return new BugReport[i];
            case 98:
                return new BoostMediaPickerTabType[i];
            default:
                return new AdCreativeAuthorizationCategory[i];
        }
    }
}
