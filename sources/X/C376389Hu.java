package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubInfoDictImpl;
import com.instagram.api.schemas.FanClubStatusSyncInfoImpl;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.api.schemas.FeedItemType;
import com.instagram.api.schemas.GalleryMediaFolderEnum;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.GreetingAttachment;
import com.instagram.api.schemas.GrowthFrictionInfoImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionCategories;
import com.instagram.api.schemas.GrowthFrictionInterventionCategoriesImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.api.schemas.HallpassDetailsDictImpl;
import com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl;
import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDictImpl;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import com.instagram.api.schemas.IGAdsGenericCardFormatEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.api.schemas.IGAdsStickerCardRevampTypographyHierarchyEnum;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
import com.instagram.api.schemas.IGCTAStickerPositioningStrategyEnum;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGConsiderAndBrowseType;
import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.IGLiveModeratorEligibilityType;
import com.instagram.api.schemas.IGLiveModeratorStatus;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.api.schemas.IGLiveWaveStatus;
import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;
import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.api.schemas.IGUserProfileGridType;
import com.instagram.api.schemas.IGUserThirdPartyDownloads;
import com.instagram.api.schemas.IceBreakerMessage;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.InterestPivotStyle;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.MediaCommentAudienceControlType;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MediaGiftCountVisibilityState;
import com.instagram.api.schemas.MediaGiftingState;
import com.instagram.api.schemas.MediaNoteMimicryTrigger;
import com.instagram.api.schemas.MediaNoteMimicryType;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.MediaReminderImpl;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.MomentAdsTypeEnum;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.NavBarCameraDestination;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.api.schemas.NudgeType;
import com.instagram.api.schemas.NudgeVisualType;
import com.instagram.api.schemas.OnFeedMessages;
import com.instagram.api.schemas.OnImpressionStyle;
import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.OnboardingEntryPointPriority;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.api.schemas.OrganicCTAType;
import com.instagram.api.schemas.OriginalAudioPartMetadata;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfo;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger;
import com.instagram.api.schemas.PrimaryProfileLinkType;
import com.instagram.api.schemas.PrivacyDisclosureInfo;
import com.instagram.api.schemas.PrivacyDisclosureInfoImpl;
import com.instagram.api.schemas.SocialProofInfo;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.WhatsAppAttributionInfo;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Hu  reason: invalid class name and case insensitive filesystem */
public final class C376389Hu implements Parcelable.Creator {
    public final int A00;

    public C376389Hu(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Integer valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Boolean valueOf5;
        Long valueOf6;
        ArrayList arrayList;
        ArrayList arrayList2;
        Boolean valueOf7;
        Boolean valueOf8;
        Boolean valueOf9;
        Boolean valueOf10;
        Integer valueOf11;
        Integer valueOf12;
        Long valueOf13;
        Boolean valueOf14;
        Boolean valueOf15;
        Boolean valueOf16;
        Integer valueOf17;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Integer valueOf18;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Boolean valueOf19;
        Boolean valueOf20;
        Integer valueOf21;
        Boolean valueOf22;
        Boolean valueOf23;
        Boolean valueOf24;
        Boolean valueOf25;
        Boolean valueOf26;
        Boolean valueOf27;
        Integer valueOf28;
        Integer valueOf29;
        Integer valueOf30;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                0qQ.A0B(parcel2, 0);
                boolean z = true;
                Integer num = null;
                if (parcel2.readInt() == 0) {
                    valueOf = null;
                } else {
                    boolean z2 = false;
                    if (parcel2.readInt() != 0) {
                        z2 = true;
                    }
                    valueOf = Boolean.valueOf(z2);
                }
                if (parcel2.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel2.readInt());
                }
                String readString = parcel2.readString();
                String readString2 = parcel2.readString();
                FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse = (FanClubFanConsiderationPageFeatureEligibilityResponse) parcel2.readParcelable(FanClubInfoDictImpl.class.getClassLoader());
                if (parcel2.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    boolean z3 = false;
                    if (parcel2.readInt() != 0) {
                        z3 = true;
                    }
                    valueOf3 = Boolean.valueOf(z3);
                }
                if (parcel2.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    boolean z4 = false;
                    if (parcel2.readInt() != 0) {
                        z4 = true;
                    }
                    valueOf4 = Boolean.valueOf(z4);
                }
                if (parcel2.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    if (parcel2.readInt() == 0) {
                        z = false;
                    }
                    valueOf5 = Boolean.valueOf(z);
                }
                String readString3 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num = Integer.valueOf(parcel2.readInt());
                }
                return new FanClubInfoDictImpl(fanClubFanConsiderationPageFeatureEligibilityResponse, valueOf, valueOf3, valueOf4, valueOf5, valueOf2, num, readString, readString2, readString3);
            case 1:
                0qQ.A0B(parcel2, 0);
                boolean z5 = true;
                boolean z6 = false;
                if (parcel2.readInt() != 0) {
                    z6 = true;
                }
                if (parcel2.readInt() == 0) {
                    z5 = false;
                }
                if (parcel2.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(parcel2.readLong());
                }
                return new FanClubStatusSyncInfoImpl(valueOf6, z6, z5);
            case 2:
                0qQ.A0B(parcel2, 0);
                return FanClubStoriesTeaserType.values()[parcel2.readInt()];
            case 3:
                0qQ.A0B(parcel2, 0);
                return FeedItemType.values()[parcel2.readInt()];
            case 4:
                0qQ.A0B(parcel2, 0);
                return GalleryMediaFolderEnum.values()[parcel2.readInt()];
            case 5:
                0qQ.A0B(parcel2, 0);
                return new GenAIToolInfoDict((CameraTool) parcel2.readParcelable(GenAIToolInfoDict.class.getClassLoader()), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 6:
                0qQ.A0B(parcel2, 0);
                boolean z7 = false;
                if (parcel2.readInt() != 0) {
                    z7 = true;
                }
                return new GrowthFrictionInfoImpl((GrowthFrictionInterventionCategories) parcel2.readParcelable(GrowthFrictionInfoImpl.class.getClassLoader()), z7);
            case 7:
                0qQ.A0B(parcel2, 0);
                Class<GrowthFrictionInterventionCategoriesImpl> cls = GrowthFrictionInterventionCategoriesImpl.class;
                return new GrowthFrictionInterventionCategoriesImpl((GrowthFrictionInterventionDetail) parcel2.readParcelable(cls.getClassLoader()), (GrowthFrictionInterventionDetail) parcel2.readParcelable(cls.getClassLoader()), (GrowthFrictionInterventionDetail) parcel2.readParcelable(cls.getClassLoader()));
            case 8:
                0qQ.A0B(parcel2, 0);
                String readString4 = parcel2.readString();
                String readString5 = parcel2.readString();
                String readString6 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel2.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(parcel2.readParcelable(HallpassDetailsDictImpl.class.getClassLoader()));
                    }
                }
                return new HallpassDetailsDictImpl(readString4, readString5, readString6, arrayList);
            case 9:
                0qQ.A0B(parcel2, 0);
                return HasOnboardedCreatorMonetizationProduct.values()[parcel2.readInt()];
            case 10:
                0qQ.A0B(parcel2, 0);
                return HasPasswordState.values()[parcel2.readInt()];
            case 11:
                0qQ.A0B(parcel2, 0);
                return HighlightReelTypeStr.values()[parcel2.readInt()];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                0qQ.A0B(parcel2, 0);
                return IGAIAgentType.values()[parcel2.readInt()];
            case 13:
                0qQ.A0B(parcel2, 0);
                return IGAIAgentVisibilityStatus.values()[parcel2.readInt()];
            case 14:
                0qQ.A0B(parcel2, 0);
                if (parcel2.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel2.readInt();
                    arrayList2 = new ArrayList(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        arrayList2.add(parcel2.readParcelable(IGAdCreationOptimizationPayloadDictImpl.class.getClassLoader()));
                    }
                }
                return new IGAdCreationOptimizationPayloadDictImpl(arrayList2);
            case 15:
                0qQ.A0B(parcel2, 0);
                return new IGAdCreativeOptimizationConfigByTypeDictImpl(parcel2.readString(), parcel2.readString());
            case 16:
                0qQ.A0B(parcel2, 0);
                return IGAdTransparencyDisclaimerPlacement.values()[parcel2.readInt()];
            case 17:
                0qQ.A0B(parcel2, 0);
                return IGAdsCardBackgroundTypeEnum.values()[parcel2.readInt()];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                0qQ.A0B(parcel2, 0);
                return IGAdsCardStickerCTATypeEnum.values()[parcel2.readInt()];
            case 19:
                0qQ.A0B(parcel2, 0);
                return IGAdsCardStickerClickAreaEnum.values()[parcel2.readInt()];
            case 20:
                0qQ.A0B(parcel2, 0);
                return IGAdsCardStickerSizeEnum.values()[parcel2.readInt()];
            case 21:
                0qQ.A0B(parcel2, 0);
                return IGAdsFeedVideoWBViewerTypeEnum.values()[parcel2.readInt()];
            case 22:
                0qQ.A0B(parcel2, 0);
                return IGAdsGenericCardFormatEnum.values()[parcel2.readInt()];
            case 23:
                0qQ.A0B(parcel2, 0);
                return IGAdsGenericCardInfoTypeEnum.values()[parcel2.readInt()];
            case 24:
                0qQ.A0B(parcel2, 0);
                return IGAdsStickerCardRevampTypographyHierarchyEnum.values()[parcel2.readInt()];
            case 25:
                0qQ.A0B(parcel2, 0);
                return IGAdsStoryInteractiveMediaGestureType.values()[parcel2.readInt()];
            case 26:
                0qQ.A0B(parcel2, 0);
                return IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.values()[parcel2.readInt()];
            case 27:
                0qQ.A0B(parcel2, 0);
                return IGCTAStickerPositioningStrategyEnum.values()[parcel2.readInt()];
            case 28:
                0qQ.A0B(parcel2, 0);
                String readString7 = parcel2.readString();
                boolean z8 = true;
                Boolean bool = null;
                if (parcel2.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    boolean z9 = false;
                    if (parcel2.readInt() != 0) {
                        z9 = true;
                    }
                    valueOf7 = Boolean.valueOf(z9);
                }
                if (parcel2.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    boolean z10 = false;
                    if (parcel2.readInt() != 0) {
                        z10 = true;
                    }
                    valueOf8 = Boolean.valueOf(z10);
                }
                Class<IGCTMessagingAdsInfoDict> cls2 = IGCTMessagingAdsInfoDict.class;
                OnFeedMessages onFeedMessages = (OnFeedMessages) parcel2.readParcelable(cls2.getClassLoader());
                String readString8 = parcel2.readString();
                PrivacyDisclosureInfo privacyDisclosureInfo = (PrivacyDisclosureInfo) parcel2.readParcelable(cls2.getClassLoader());
                String readString9 = parcel2.readString();
                String readString10 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    boolean z11 = false;
                    if (parcel2.readInt() != 0) {
                        z11 = true;
                    }
                    valueOf9 = Boolean.valueOf(z11);
                }
                if (parcel2.readInt() != 0) {
                    if (parcel2.readInt() == 0) {
                        z8 = false;
                    }
                    bool = Boolean.valueOf(z8);
                }
                return new IGCTMessagingAdsInfoDict(onFeedMessages, privacyDisclosureInfo, (SocialProofInfo) parcel2.readParcelable(cls2.getClassLoader()), (WhatsAppAttributionInfo) parcel2.readParcelable(cls2.getClassLoader()), valueOf7, valueOf8, valueOf9, bool, readString7, readString8, readString9, readString10);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                0qQ.A0B(parcel2, 0);
                return IGConsiderAndBrowseType.values()[parcel2.readInt()];
            case 30:
                0qQ.A0B(parcel2, 0);
                return IGFormatLiquidityUseCaseEnum.values()[parcel2.readInt()];
            case 31:
                0qQ.A0B(parcel2, 0);
                return IGLiveBadgeSettings.values()[parcel2.readInt()];
            case 32:
                0qQ.A0B(parcel2, 0);
                return IGLiveModeratorEligibilityType.values()[parcel2.readInt()];
            case 33:
                0qQ.A0B(parcel2, 0);
                return IGLiveModeratorStatus.values()[parcel2.readInt()];
            case 34:
                0qQ.A0B(parcel2, 0);
                return IGLiveNotificationPreference.values()[parcel2.readInt()];
            case 35:
                0qQ.A0B(parcel2, 0);
                return IGLiveWaveStatus.values()[parcel2.readInt()];
            case 36:
                0qQ.A0B(parcel2, 0);
                return IGPBIAProfileBrowseTypeEnum.values()[parcel2.readInt()];
            case 37:
                0qQ.A0B(parcel2, 0);
                return IGPostClickEligibleExperienceTypes.values()[parcel2.readInt()];
            case 38:
                0qQ.A0B(parcel2, 0);
                return IGPostTriggerExperience.values()[parcel2.readInt()];
            case 39:
                0qQ.A0B(parcel2, 0);
                return IGStoryTextAlignmentTypeEnum.values()[parcel2.readInt()];
            case 40:
                0qQ.A0B(parcel2, 0);
                return IGTVAccountLevelMonetizationToggleSetting.values()[parcel2.readInt()];
            case Seq.NULL_REFNUM:
                0qQ.A0B(parcel2, 0);
                return IGUserHighlightsTrayType.values()[parcel2.readInt()];
            case Seq.RefTracker.REF_OFFSET:
                0qQ.A0B(parcel2, 0);
                return IGUserProfileGridType.values()[parcel2.readInt()];
            case 43:
                0qQ.A0B(parcel2, 0);
                return IGUserThirdPartyDownloads.values()[parcel2.readInt()];
            case 44:
                0qQ.A0B(parcel2, 0);
                return new IceBreakerMessage(parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 45:
                0qQ.A0B(parcel2, 0);
                return IgUserBioLinkTypeEnum.values()[parcel2.readInt()];
            case 46:
                0qQ.A0B(parcel2, 0);
                return IntentAwareAdsFormatType.values()[parcel2.readInt()];
            case 47:
                0qQ.A0B(parcel2, 0);
                IntentAwareAdsFormatInfo intentAwareAdsFormatInfo = (IntentAwareAdsFormatInfo) parcel2.readParcelable(IntentAwareAdsInfo.class.getClassLoader());
                String readString11 = parcel2.readString();
                Integer num2 = null;
                if (parcel2.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    boolean z12 = false;
                    if (parcel2.readInt() != 0) {
                        z12 = true;
                    }
                    valueOf10 = Boolean.valueOf(z12);
                }
                String readString12 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Integer.valueOf(parcel2.readInt());
                }
                String readString13 = parcel2.readString();
                String readString14 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num2 = Integer.valueOf(parcel2.readInt());
                }
                return new IntentAwareAdsInfo(intentAwareAdsFormatInfo, valueOf10, valueOf11, num2, readString11, readString12, readString13, readString14, parcel2.readString(), parcel2.readString());
            case 48:
                0qQ.A0B(parcel2, 0);
                return InterestPivotStyle.values()[parcel2.readInt()];
            case 49:
                0qQ.A0B(parcel2, 0);
                return LimitedInteractionsVersions.values()[parcel2.readInt()];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                0qQ.A0B(parcel2, 0);
                return LineType.values()[parcel2.readInt()];
            case 51:
                0qQ.A0B(parcel2, 0);
                return LiveUserPaySupportTier.values()[parcel2.readInt()];
            case 52:
                0qQ.A0B(parcel2, 0);
                int readInt3 = parcel2.readInt();
                ArrayList arrayList7 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList7.add(parcel2.readParcelable(Lyrics.class.getClassLoader()));
                }
                return new Lyrics(arrayList7);
            case 53:
                0qQ.A0B(parcel2, 0);
                return MediaCommentAudienceControlType.values()[parcel2.readInt()];
            case 54:
                0qQ.A0B(parcel2, 0);
                return new MediaCroppingCoordinates(parcel2.readFloat(), parcel2.readFloat(), parcel2.readFloat(), parcel2.readFloat());
            case 55:
                0qQ.A0B(parcel2, 0);
                return MediaGenAIDetectionMethod.values()[parcel2.readInt()];
            case 56:
                0qQ.A0B(parcel2, 0);
                return MediaGiftCountVisibilityState.values()[parcel2.readInt()];
            case 57:
                0qQ.A0B(parcel2, 0);
                return MediaGiftingState.values()[parcel2.readInt()];
            case 58:
                0qQ.A0B(parcel2, 0);
                return MediaNoteMimicryTrigger.values()[parcel2.readInt()];
            case 59:
                0qQ.A0B(parcel2, 0);
                return MediaNoteMimicryType.values()[parcel2.readInt()];
            case 60:
                0qQ.A0B(parcel2, 0);
                return MediaOptionStyle.values()[parcel2.readInt()];
            case 61:
                0qQ.A0B(parcel2, 0);
                Boolean bool2 = null;
                if (parcel2.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Integer.valueOf(parcel2.readInt());
                }
                if (parcel2.readInt() != 0) {
                    int readInt4 = parcel2.readInt();
                    boolean z13 = false;
                    if (readInt4 != 0) {
                        z13 = true;
                    }
                    bool2 = Boolean.valueOf(z13);
                }
                return new MediaReminderImpl(bool2, valueOf12);
            case 62:
                0qQ.A0B(parcel2, 0);
                return MediaType.values()[parcel2.readInt()];
            case 63:
                0qQ.A0B(parcel2, 0);
                return MerchantCheckoutStyle.values()[parcel2.readInt()];
            case 64:
                0qQ.A0B(parcel2, 0);
                return MomentAdsTypeEnum.values()[parcel2.readInt()];
            case 65:
                0qQ.A0B(parcel2, 0);
                return MonetizationEligibilityDecision.values()[parcel2.readInt()];
            case 66:
                0qQ.A0B(parcel2, 0);
                return MoreInfoFacepilePositionType.values()[parcel2.readInt()];
            case 67:
                0qQ.A0B(parcel2, 0);
                return MoreInfoFacepileSizeType.values()[parcel2.readInt()];
            case 68:
                0qQ.A0B(parcel2, 0);
                return MoreInfoProductTagType.values()[parcel2.readInt()];
            case 69:
                0qQ.A0B(parcel2, 0);
                return MoreInfoSUGPositionType.values()[parcel2.readInt()];
            case 70:
                0qQ.A0B(parcel2, 0);
                return MoreInfoStickerCTAType.values()[parcel2.readInt()];
            case 71:
                0qQ.A0B(parcel2, 0);
                return MoreInfoTextStyle.values()[parcel2.readInt()];
            case 72:
                0qQ.A0B(parcel2, 0);
                return MoreInfoType.values()[parcel2.readInt()];
            case 73:
                0qQ.A0B(parcel2, 0);
                return MusicCanonicalType.values()[parcel2.readInt()];
            case 74:
                0qQ.A0B(parcel2, 0);
                Class<MusicInfoImpl> cls3 = MusicInfoImpl.class;
                TrackData trackData = (TrackData) parcel2.readParcelable(cls3.getClassLoader());
                if (parcel2.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Long.valueOf(parcel2.readLong());
                }
                return new MusicInfoImpl(trackData, (MusicConsumptionModel) parcel2.readParcelable(cls3.getClassLoader()), valueOf13);
            case 75:
                0qQ.A0B(parcel2, 0);
                return MusicMuteAudioReason.values()[parcel2.readInt()];
            case 76:
                0qQ.A0B(parcel2, 0);
                boolean z14 = true;
                Integer num3 = null;
                if (parcel2.readInt() == 0) {
                    valueOf14 = null;
                } else {
                    boolean z15 = false;
                    if (parcel2.readInt() != 0) {
                        z15 = true;
                    }
                    valueOf14 = Boolean.valueOf(z15);
                }
                if (parcel2.readInt() == 0) {
                    valueOf15 = null;
                } else {
                    if (parcel2.readInt() == 0) {
                        z14 = false;
                    }
                    valueOf15 = Boolean.valueOf(z14);
                }
                Class<MusicNoteResponseInfo> cls4 = MusicNoteResponseInfo.class;
                MusicInfo musicInfo = (MusicInfo) parcel2.readParcelable(cls4.getClassLoader());
                if (parcel2.readInt() != 0) {
                    num3 = Integer.valueOf(parcel2.readInt());
                }
                return new MusicNoteResponseInfo(musicInfo, parcel2.readParcelable(cls4.getClassLoader()), valueOf14, valueOf15, num3, parcel2.readString());
            case 77:
                0qQ.A0B(parcel2, 0);
                return MusicProduct.values()[parcel2.readInt()];
            case 78:
                0qQ.A0B(parcel2, 0);
                return NavBarCameraDestination.values()[parcel2.readInt()];
            case 79:
                0qQ.A0B(parcel2, 0);
                return NoteBackgroundColor.values()[parcel2.readInt()];
            case 80:
                0qQ.A0B(parcel2, 0);
                return new NoteCustomThemeImpl((NoteActivationType) parcel2.readParcelable(NoteCustomThemeImpl.class.getClassLoader()), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 81:
                0qQ.A0B(parcel2, 0);
                String readString15 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf16 = null;
                } else {
                    boolean z16 = false;
                    if (parcel2.readInt() != 0) {
                        z16 = true;
                    }
                    valueOf16 = Boolean.valueOf(z16);
                }
                return new NoteEmojiReactionInfo(parcel2.readParcelable(NoteEmojiReactionInfo.class.getClassLoader()), valueOf16, readString15);
            case 82:
                0qQ.A0B(parcel2, 0);
                return NoteFontStyle.values()[parcel2.readInt()];
            case 83:
                0qQ.A0B(parcel2, 0);
                String readString16 = parcel2.readString();
                Class<NotePogVideoDict> cls5 = NotePogVideoDict.class;
                ImageInfo imageInfo = (ImageInfo) parcel2.readParcelable(cls5.getClassLoader());
                String readString17 = parcel2.readString();
                int readInt5 = parcel2.readInt();
                ArrayList arrayList8 = new ArrayList(readInt5);
                for (int i4 = 0; i4 != readInt5; i4++) {
                    arrayList8.add(parcel2.readParcelable(cls5.getClassLoader()));
                }
                return new NotePogVideoDict(imageInfo, readString16, readString17, arrayList8);
            case 84:
                0qQ.A0B(parcel2, 0);
                return NudgeType.values()[parcel2.readInt()];
            case 85:
                0qQ.A0B(parcel2, 0);
                return NudgeVisualType.values()[parcel2.readInt()];
            case 86:
                0qQ.A0B(parcel2, 0);
                Boolean bool3 = null;
                if (parcel2.readInt() == 0) {
                    valueOf17 = null;
                } else {
                    valueOf17 = Integer.valueOf(parcel2.readInt());
                }
                String readString18 = parcel2.readString();
                String readString19 = parcel2.readString();
                String readString20 = parcel2.readString();
                String readString21 = parcel2.readString();
                String readString22 = parcel2.readString();
                boolean z17 = false;
                if (parcel2.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt6 = parcel2.readInt();
                    arrayList3 = new ArrayList(readInt6);
                    for (int i5 = 0; i5 != readInt6; i5++) {
                        arrayList3.add(parcel2.readParcelable(OnFeedMessages.class.getClassLoader()));
                    }
                }
                GreetingAttachment greetingAttachment = (GreetingAttachment) parcel2.readParcelable(OnFeedMessages.class.getClassLoader());
                if (parcel2.readInt() != 0) {
                    if (parcel2.readInt() != 0) {
                        z17 = true;
                    }
                    bool3 = Boolean.valueOf(z17);
                }
                return new OnFeedMessages(greetingAttachment, bool3, valueOf17, readString18, readString19, readString20, readString21, readString22, arrayList3);
            case 87:
                0qQ.A0B(parcel2, 0);
                return OnImpressionStyle.values()[parcel2.readInt()];
            case 88:
                0qQ.A0B(parcel2, 0);
                return OnboardingEntryActionType.values()[parcel2.readInt()];
            case 89:
                0qQ.A0B(parcel2, 0);
                return OnboardingEntryPointPriority.values()[parcel2.readInt()];
            case 90:
                0qQ.A0B(parcel2, 0);
                return OpenCarouselSubmissionState.values()[parcel2.readInt()];
            case 91:
                0qQ.A0B(parcel2, 0);
                return OrganicCTAType.values()[parcel2.readInt()];
            case 92:
                0qQ.A0B(parcel2, 0);
                Boolean bool4 = null;
                if (parcel2.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int readInt7 = parcel2.readInt();
                    arrayList4 = new ArrayList(readInt7);
                    for (int i6 = 0; i6 != readInt7; i6++) {
                        arrayList4.add(parcel2.readParcelable(OriginalAudioPartMetadata.class.getClassLoader()));
                    }
                }
                int readInt8 = parcel2.readInt();
                Class<OriginalAudioPartMetadata> cls6 = OriginalAudioPartMetadata.class;
                MusicCanonicalType readParcelable = parcel2.readParcelable(cls6.getClassLoader());
                String readString23 = parcel2.readString();
                String readString24 = parcel2.readString();
                int readInt9 = parcel2.readInt();
                User readParcelable2 = parcel2.readParcelable(cls6.getClassLoader());
                boolean z18 = false;
                if (parcel2.readInt() != 0) {
                    z18 = true;
                }
                if (parcel2.readInt() != 0) {
                    boolean z19 = false;
                    if (parcel2.readInt() != 0) {
                        z19 = true;
                    }
                    bool4 = Boolean.valueOf(z19);
                }
                boolean z20 = false;
                if (parcel2.readInt() != 0) {
                    z20 = true;
                }
                return new OriginalAudioPartMetadata(readParcelable, (ImageUrl) parcel2.readParcelable(cls6.getClassLoader()), readParcelable2, bool4, readString23, readString24, parcel2.readString(), arrayList4, readInt8, readInt9, parcel2.readInt(), z18, z20);
            case 93:
                0qQ.A0B(parcel2, 0);
                return OriginalAudioSubtype.values()[parcel2.readInt()];
            case 94:
                0qQ.A0B(parcel2, 0);
                String readString25 = parcel2.readString();
                boolean z21 = false;
                boolean z22 = false;
                if (parcel2.readInt() != 0) {
                    z22 = true;
                }
                if (parcel2.readInt() != 0) {
                    z21 = true;
                }
                return new OriginalSoundConsumptionInfo(parcel2.readParcelable(OriginalSoundConsumptionInfo.class.getClassLoader()), readString25, parcel2.readString(), z22, z21);
            case 95:
                0qQ.A0B(parcel2, 0);
                boolean z23 = false;
                if (parcel2.readInt() != 0) {
                    z23 = true;
                }
                String readString26 = parcel2.readString();
                Integer num4 = null;
                if (parcel2.readInt() == 0) {
                    valueOf18 = null;
                } else {
                    valueOf18 = Integer.valueOf(parcel2.readInt());
                }
                if (parcel2.readInt() == 0) {
                    arrayList5 = null;
                } else {
                    int readInt10 = parcel2.readInt();
                    arrayList5 = new ArrayList(readInt10);
                    for (int i7 = 0; i7 != readInt10; i7++) {
                        arrayList5.add(parcel2.readParcelable(OriginalSoundData.class.getClassLoader()));
                    }
                }
                int readInt11 = parcel2.readInt();
                ArrayList arrayList9 = new ArrayList(readInt11);
                for (int i8 = 0; i8 != readInt11; i8++) {
                    arrayList9.add(parcel2.readParcelable(OriginalSoundData.class.getClassLoader()));
                }
                if (parcel2.readInt() == 0) {
                    arrayList6 = null;
                } else {
                    int readInt12 = parcel2.readInt();
                    arrayList6 = new ArrayList(readInt12);
                    for (int i9 = 0; i9 != readInt12; i9++) {
                        arrayList6.add(parcel2.readParcelable(OriginalSoundData.class.getClassLoader()));
                    }
                }
                if (parcel2.readInt() == 0) {
                    valueOf19 = null;
                } else {
                    boolean z24 = false;
                    if (parcel2.readInt() != 0) {
                        z24 = true;
                    }
                    valueOf19 = Boolean.valueOf(z24);
                }
                if (parcel2.readInt() == 0) {
                    valueOf20 = null;
                } else {
                    boolean z25 = false;
                    if (parcel2.readInt() != 0) {
                        z25 = true;
                    }
                    valueOf20 = Boolean.valueOf(z25);
                }
                Class<OriginalSoundData> cls7 = OriginalSoundData.class;
                OriginalSoundConsumptionInfo readParcelable3 = parcel2.readParcelable(cls7.getClassLoader());
                String readString27 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf21 = null;
                } else {
                    valueOf21 = Integer.valueOf(parcel2.readInt());
                }
                String readString28 = parcel2.readString();
                boolean z26 = false;
                if (parcel2.readInt() != 0) {
                    z26 = true;
                }
                User readParcelable4 = parcel2.readParcelable(cls7.getClassLoader());
                boolean z27 = false;
                if (parcel2.readInt() != 0) {
                    z27 = true;
                }
                if (parcel2.readInt() == 0) {
                    valueOf22 = null;
                } else {
                    boolean z28 = false;
                    if (parcel2.readInt() != 0) {
                        z28 = true;
                    }
                    valueOf22 = Boolean.valueOf(z28);
                }
                if (parcel2.readInt() == 0) {
                    valueOf23 = null;
                } else {
                    boolean z29 = false;
                    if (parcel2.readInt() != 0) {
                        z29 = true;
                    }
                    valueOf23 = Boolean.valueOf(z29);
                }
                boolean z30 = false;
                if (parcel2.readInt() != 0) {
                    z30 = true;
                }
                if (parcel2.readInt() == 0) {
                    valueOf24 = null;
                } else {
                    boolean z31 = false;
                    if (parcel2.readInt() != 0) {
                        z31 = true;
                    }
                    valueOf24 = Boolean.valueOf(z31);
                }
                if (parcel2.readInt() == 0) {
                    valueOf25 = null;
                } else {
                    boolean z32 = false;
                    if (parcel2.readInt() != 0) {
                        z32 = true;
                    }
                    valueOf25 = Boolean.valueOf(z32);
                }
                if (parcel2.readInt() == 0) {
                    valueOf26 = null;
                } else {
                    boolean z33 = false;
                    if (parcel2.readInt() != 0) {
                        z33 = true;
                    }
                    valueOf26 = Boolean.valueOf(z33);
                }
                String readString29 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf27 = null;
                } else {
                    boolean z34 = false;
                    if (parcel2.readInt() != 0) {
                        z34 = true;
                    }
                    valueOf27 = Boolean.valueOf(z34);
                }
                OriginalAudioSubtype readParcelable5 = parcel2.readParcelable(cls7.getClassLoader());
                String readString30 = parcel2.readString();
                String readString31 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf28 = null;
                } else {
                    valueOf28 = Integer.valueOf(parcel2.readInt());
                }
                if (parcel2.readInt() == 0) {
                    valueOf29 = null;
                } else {
                    valueOf29 = Integer.valueOf(parcel2.readInt());
                }
                String readString32 = parcel2.readString();
                boolean z35 = false;
                if (parcel2.readInt() != 0) {
                    z35 = true;
                }
                if (parcel2.readInt() == 0) {
                    valueOf30 = null;
                } else {
                    valueOf30 = Integer.valueOf(parcel2.readInt());
                }
                if (parcel2.readInt() != 0) {
                    num4 = Integer.valueOf(parcel2.readInt());
                }
                return new OriginalSoundData(readParcelable5, readParcelable3, (XpostOriginalSoundFBCreatorInfo) parcel2.readParcelable(cls7.getClassLoader()), readParcelable4, valueOf19, valueOf20, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf18, valueOf21, valueOf28, valueOf29, valueOf30, num4, readString26, readString27, readString28, readString29, readString30, readString31, readString32, arrayList5, arrayList9, arrayList6, z23, z26, z27, z30, z35);
            case 96:
                0qQ.A0B(parcel2, 0);
                return PollType.values()[parcel2.readInt()];
            case 97:
                0qQ.A0B(parcel2, 0);
                return PostTriggerExperienceEligibleTrigger.values()[parcel2.readInt()];
            case 98:
                0qQ.A0B(parcel2, 0);
                return PrimaryProfileLinkType.values()[parcel2.readInt()];
            default:
                0qQ.A0B(parcel2, 0);
                return new PrivacyDisclosureInfoImpl(parcel2.readString(), parcel2.readString());
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new FanClubInfoDictImpl[i];
            case 1:
                return new FanClubStatusSyncInfoImpl[i];
            case 2:
                return new FanClubStoriesTeaserType[i];
            case 3:
                return new FeedItemType[i];
            case 4:
                return new GalleryMediaFolderEnum[i];
            case 5:
                return new GenAIToolInfoDict[i];
            case 6:
                return new GrowthFrictionInfoImpl[i];
            case 7:
                return new GrowthFrictionInterventionCategoriesImpl[i];
            case 8:
                return new HallpassDetailsDictImpl[i];
            case 9:
                return new HasOnboardedCreatorMonetizationProduct[i];
            case 10:
                return new HasPasswordState[i];
            case 11:
                return new HighlightReelTypeStr[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new IGAIAgentType[i];
            case 13:
                return new IGAIAgentVisibilityStatus[i];
            case 14:
                return new IGAdCreationOptimizationPayloadDictImpl[i];
            case 15:
                return new IGAdCreativeOptimizationConfigByTypeDictImpl[i];
            case 16:
                return new IGAdTransparencyDisclaimerPlacement[i];
            case 17:
                return new IGAdsCardBackgroundTypeEnum[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new IGAdsCardStickerCTATypeEnum[i];
            case 19:
                return new IGAdsCardStickerClickAreaEnum[i];
            case 20:
                return new IGAdsCardStickerSizeEnum[i];
            case 21:
                return new IGAdsFeedVideoWBViewerTypeEnum[i];
            case 22:
                return new IGAdsGenericCardFormatEnum[i];
            case 23:
                return new IGAdsGenericCardInfoTypeEnum[i];
            case 24:
                return new IGAdsStickerCardRevampTypographyHierarchyEnum[i];
            case 25:
                return new IGAdsStoryInteractiveMediaGestureType[i];
            case 26:
                return new IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum[i];
            case 27:
                return new IGCTAStickerPositioningStrategyEnum[i];
            case 28:
                return new IGCTMessagingAdsInfoDict[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new IGConsiderAndBrowseType[i];
            case 30:
                return new IGFormatLiquidityUseCaseEnum[i];
            case 31:
                return new IGLiveBadgeSettings[i];
            case 32:
                return new IGLiveModeratorEligibilityType[i];
            case 33:
                return new IGLiveModeratorStatus[i];
            case 34:
                return new IGLiveNotificationPreference[i];
            case 35:
                return new IGLiveWaveStatus[i];
            case 36:
                return new IGPBIAProfileBrowseTypeEnum[i];
            case 37:
                return new IGPostClickEligibleExperienceTypes[i];
            case 38:
                return new IGPostTriggerExperience[i];
            case 39:
                return new IGStoryTextAlignmentTypeEnum[i];
            case 40:
                return new IGTVAccountLevelMonetizationToggleSetting[i];
            case Seq.NULL_REFNUM:
                return new IGUserHighlightsTrayType[i];
            case Seq.RefTracker.REF_OFFSET:
                return new IGUserProfileGridType[i];
            case 43:
                return new IGUserThirdPartyDownloads[i];
            case 44:
                return new IceBreakerMessage[i];
            case 45:
                return new IgUserBioLinkTypeEnum[i];
            case 46:
                return new IntentAwareAdsFormatType[i];
            case 47:
                return new IntentAwareAdsInfo[i];
            case 48:
                return new InterestPivotStyle[i];
            case 49:
                return new LimitedInteractionsVersions[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new LineType[i];
            case 51:
                return new LiveUserPaySupportTier[i];
            case 52:
                return new Lyrics[i];
            case 53:
                return new MediaCommentAudienceControlType[i];
            case 54:
                return new MediaCroppingCoordinates[i];
            case 55:
                return new MediaGenAIDetectionMethod[i];
            case 56:
                return new MediaGiftCountVisibilityState[i];
            case 57:
                return new MediaGiftingState[i];
            case 58:
                return new MediaNoteMimicryTrigger[i];
            case 59:
                return new MediaNoteMimicryType[i];
            case 60:
                return new MediaOptionStyle[i];
            case 61:
                return new MediaReminderImpl[i];
            case 62:
                return new MediaType[i];
            case 63:
                return new MerchantCheckoutStyle[i];
            case 64:
                return new MomentAdsTypeEnum[i];
            case 65:
                return new MonetizationEligibilityDecision[i];
            case 66:
                return new MoreInfoFacepilePositionType[i];
            case 67:
                return new MoreInfoFacepileSizeType[i];
            case 68:
                return new MoreInfoProductTagType[i];
            case 69:
                return new MoreInfoSUGPositionType[i];
            case 70:
                return new MoreInfoStickerCTAType[i];
            case 71:
                return new MoreInfoTextStyle[i];
            case 72:
                return new MoreInfoType[i];
            case 73:
                return new MusicCanonicalType[i];
            case 74:
                return new MusicInfoImpl[i];
            case 75:
                return new MusicMuteAudioReason[i];
            case 76:
                return new MusicNoteResponseInfo[i];
            case 77:
                return new MusicProduct[i];
            case 78:
                return new NavBarCameraDestination[i];
            case 79:
                return new NoteBackgroundColor[i];
            case 80:
                return new NoteCustomThemeImpl[i];
            case 81:
                return new NoteEmojiReactionInfo[i];
            case 82:
                return new NoteFontStyle[i];
            case 83:
                return new NotePogVideoDict[i];
            case 84:
                return new NudgeType[i];
            case 85:
                return new NudgeVisualType[i];
            case 86:
                return new OnFeedMessages[i];
            case 87:
                return new OnImpressionStyle[i];
            case 88:
                return new OnboardingEntryActionType[i];
            case 89:
                return new OnboardingEntryPointPriority[i];
            case 90:
                return new OpenCarouselSubmissionState[i];
            case 91:
                return new OrganicCTAType[i];
            case 92:
                return new OriginalAudioPartMetadata[i];
            case 93:
                return new OriginalAudioSubtype[i];
            case 94:
                return new OriginalSoundConsumptionInfo[i];
            case 95:
                return new OriginalSoundData[i];
            case 96:
                return new PollType[i];
            case 97:
                return new PostTriggerExperienceEligibleTrigger[i];
            case 98:
                return new PrimaryProfileLinkType[i];
            default:
                return new PrivacyDisclosureInfoImpl[i];
        }
    }
}
