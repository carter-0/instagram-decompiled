package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.ImmutablePandoAchievement;
import com.instagram.api.schemas.ImmutablePandoAchievementButtonInfo;
import com.instagram.api.schemas.ImmutablePandoAchievementDetails;
import com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData;
import com.instagram.api.schemas.ImmutablePandoAiAgentMetadataDict;
import com.instagram.api.schemas.ImmutablePandoAppInstallCTAInfo;
import com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict;
import com.instagram.api.schemas.ImmutablePandoAttributionUser;
import com.instagram.api.schemas.ImmutablePandoAudienceList;
import com.instagram.api.schemas.ImmutablePandoAudienceMessageEntityRange;
import com.instagram.api.schemas.ImmutablePandoAudienceValidationAction;
import com.instagram.api.schemas.ImmutablePandoAudienceValidationResponse;
import com.instagram.api.schemas.ImmutablePandoAudioFilterInfo;
import com.instagram.api.schemas.ImmutablePandoAudioNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoAvatarCoinFlipBackgroundOptionResponse;
import com.instagram.api.schemas.ImmutablePandoAvatarNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoAvatarStatus;
import com.instagram.api.schemas.ImmutablePandoBoostUpsellBannerPayloadSchema;
import com.instagram.api.schemas.ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.ImmutablePandoBrandedContentGatingCountryMinimumAge;
import com.instagram.api.schemas.ImmutablePandoBrandedContentGatingInfo;
import com.instagram.api.schemas.ImmutablePandoBrandedContentProjectMetadata;
import com.instagram.api.schemas.ImmutablePandoBusinessProfileDict;
import com.instagram.api.schemas.ImmutablePandoCachedExternalLoginUser;
import com.instagram.api.schemas.ImmutablePandoCallAdsInfoDict;
import com.instagram.api.schemas.ImmutablePandoChallenge;
import com.instagram.api.schemas.ImmutablePandoChallengeButtonInfo;
import com.instagram.api.schemas.ImmutablePandoChallengeDetails;
import com.instagram.api.schemas.ImmutablePandoClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ImmutablePandoClipsMashupFollowButtonInfo;
import com.instagram.api.schemas.ImmutablePandoClipsTrialDict;
import com.instagram.api.schemas.ImmutablePandoCloseToEarningAchievementMedia;
import com.instagram.api.schemas.ImmutablePandoCollabFollowButtonInfo;
import com.instagram.api.schemas.ImmutablePandoCollectionButtonCustomization;
import com.instagram.api.schemas.ImmutablePandoCollectionCustomization;
import com.instagram.api.schemas.ImmutablePandoCollectionTitleCustomization;
import com.instagram.api.schemas.ImmutablePandoColorAtTextRangeDict;
import com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaImages;
import com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaInfo;
import com.instagram.api.schemas.ImmutablePandoCommentPrompt;
import com.instagram.api.schemas.ImmutablePandoCommerceReviewStatisticsDict;
import com.instagram.api.schemas.ImmutablePandoContextualAdResponseExtras;
import com.instagram.api.schemas.ImmutablePandoContextualAdResponseOrganicInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorDigestSignalInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerBottomCTA;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerContextCTA;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerInsightInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalDetails;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalModel;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalReelsTextDetails;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalWithInsightsInfo;
import com.instagram.api.schemas.ImmutablePandoDEPProgramLevelContentResponse;
import com.instagram.api.schemas.ImmutablePandoDevserverInfo;
import com.instagram.api.schemas.ImmutablePandoDirectAudioFallbackUrl;
import com.instagram.api.schemas.ImmutablePandoDirectMediaFallbackUrl;
import com.instagram.api.schemas.ImmutablePandoDropsEventPageNavigationMetadata;
import com.instagram.api.schemas.ImmutablePandoEarnedOnMedia;
import com.instagram.api.schemas.ImmutablePandoElectionAddYoursInfoDict;
import com.instagram.api.schemas.ImmutablePandoEntity;
import com.instagram.api.schemas.ImmutablePandoEstimate;
import com.instagram.api.schemas.ImmutablePandoEventPageNavigationMetadata;
import com.instagram.api.schemas.ImmutablePandoFBProductItemDetailsDict;
import com.instagram.api.schemas.ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.ImmutablePandoFanClubInfoDict;
import com.instagram.api.schemas.ImmutablePandoFanClubStatusSyncInfo;
import com.instagram.api.schemas.ImmutablePandoFileCandidate;
import com.instagram.api.schemas.ImmutablePandoFormattedString;
import com.instagram.api.schemas.ImmutablePandoGIFNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoGenAIMessagingData;
import com.instagram.api.schemas.ImmutablePandoGenAIPersonaBannerDict;
import com.instagram.api.schemas.ImmutablePandoGenAIPersonaBannersResponse;
import com.instagram.api.schemas.ImmutablePandoGenAIToolInfoDict;
import com.instagram.api.schemas.ImmutablePandoGoalsToastInfo;
import com.instagram.api.schemas.ImmutablePandoGraphGuardianContent;
import com.instagram.api.schemas.ImmutablePandoGreetingAttachment;
import com.instagram.api.schemas.ImmutablePandoGroupMetadata;
import com.instagram.api.schemas.ImmutablePandoGrowthFrictionInfo;
import com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionButton;
import com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionCategories;
import com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionDetail;
import com.instagram.api.schemas.ImmutablePandoGuidanceTipResponse;
import com.instagram.api.schemas.ImmutablePandoHallpassDetailsDict;
import com.instagram.api.schemas.ImmutablePandoHzwPageInfo;
import com.instagram.api.schemas.ImmutablePandoIABPostClickDataDict;
import com.instagram.api.schemas.ImmutablePandoIGAdCreationOptimizationPayloadDict;
import com.instagram.api.schemas.ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict;
import com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.ImmutablePandoIGAdProfileProductTabDict;
import com.instagram.api.schemas.ImmutablePandoIGAdScreenshotURLDataDict;
import com.instagram.api.schemas.ImmutablePandoIGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.ImmutablePandoIGBWPIABPostClickDataExtensionDict;
import com.instagram.api.schemas.ImmutablePandoIGCTATextVariant;
import com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.ImmutablePandoIGCommentSheetMoreInfo;
import com.instagram.api.schemas.ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict;
import com.instagram.api.schemas.ImmutablePandoIGLocalEventDict;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class CTC extends C3035269k {
    public final int A00;

    public CTC(int i) {
        this.A00 = i;
    }

    public static CTC A00(int i) {
        return new CTC(i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ImmutablePandoAchievement[i];
            case 1:
                return new ImmutablePandoAchievementButtonInfo[i];
            case 2:
                return new ImmutablePandoAchievementDetails[i];
            case 3:
                return new ImmutablePandoAdvantageAudienceData[i];
            case 4:
                return new ImmutablePandoAiAgentMetadataDict[i];
            case 5:
                return new ImmutablePandoAppInstallCTAInfo[i];
            case 6:
                return new ImmutablePandoAppstoreMetadataDict[i];
            case 7:
                return new ImmutablePandoAttributionUser[i];
            case 8:
                return new ImmutablePandoAudienceList[i];
            case 9:
                return new ImmutablePandoAudienceMessageEntityRange[i];
            case 10:
                return new ImmutablePandoAudienceValidationAction[i];
            case 11:
                return new ImmutablePandoAudienceValidationResponse[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new ImmutablePandoAudioFilterInfo[i];
            case 13:
                return new ImmutablePandoAudioNoteResponseInfo[i];
            case 14:
                return new ImmutablePandoAvatarCoinFlipBackgroundOptionResponse[i];
            case 15:
                return new ImmutablePandoAvatarNoteResponseInfo[i];
            case 16:
                return new ImmutablePandoAvatarStatus[i];
            case 17:
                return new ImmutablePandoBoostUpsellBannerPayloadSchema[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj[i];
            case 19:
                return new ImmutablePandoBrandedContentGatingCountryMinimumAge[i];
            case 20:
                return new ImmutablePandoBrandedContentGatingInfo[i];
            case 21:
                return new ImmutablePandoBrandedContentProjectMetadata[i];
            case 22:
                return new ImmutablePandoBusinessProfileDict[i];
            case 23:
                return new ImmutablePandoCachedExternalLoginUser[i];
            case 24:
                return new ImmutablePandoCallAdsInfoDict[i];
            case 25:
                return new ImmutablePandoChallenge[i];
            case 26:
                return new ImmutablePandoChallengeButtonInfo[i];
            case 27:
                return new ImmutablePandoChallengeDetails[i];
            case 28:
                return new ImmutablePandoClipsBreakingCreatorInfo[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new ImmutablePandoClipsMashupFollowButtonInfo[i];
            case 30:
                return new ImmutablePandoClipsTrialDict[i];
            case 31:
                return new ImmutablePandoCloseToEarningAchievementMedia[i];
            case 32:
                return new ImmutablePandoCollabFollowButtonInfo[i];
            case 33:
                return new ImmutablePandoCollectionButtonCustomization[i];
            case 34:
                return new ImmutablePandoCollectionCustomization[i];
            case 35:
                return new ImmutablePandoCollectionTitleCustomization[i];
            case 36:
                return new ImmutablePandoColorAtTextRangeDict[i];
            case 37:
                return new ImmutablePandoCommentGiphyMediaFixedHeightImages[i];
            case 38:
                return new ImmutablePandoCommentGiphyMediaImages[i];
            case 39:
                return new ImmutablePandoCommentGiphyMediaInfo[i];
            case 40:
                return new ImmutablePandoCommentPrompt[i];
            case Seq.NULL_REFNUM:
                return new ImmutablePandoCommerceReviewStatisticsDict[i];
            case Seq.RefTracker.REF_OFFSET:
                return new ImmutablePandoContextualAdResponseExtras[i];
            case 43:
                return new ImmutablePandoContextualAdResponseOrganicInfo[i];
            case 44:
                return new ImmutablePandoCreatorDigestSignalInfo[i];
            case 45:
                return new ImmutablePandoCreatorViewerBottomCTA[i];
            case 46:
                return new ImmutablePandoCreatorViewerContextCTA[i];
            case 47:
                return new ImmutablePandoCreatorViewerInsightInfo[i];
            case 48:
                return new ImmutablePandoCreatorViewerSignalAudioDetails[i];
            case 49:
                return new ImmutablePandoCreatorViewerSignalDetails[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new ImmutablePandoCreatorViewerSignalInfo[i];
            case 51:
                return new ImmutablePandoCreatorViewerSignalModel[i];
            case 52:
                return new ImmutablePandoCreatorViewerSignalPlainDetails[i];
            case 53:
                return new ImmutablePandoCreatorViewerSignalReelsTextDetails[i];
            case 54:
                return new ImmutablePandoCreatorViewerSignalWithInsightsInfo[i];
            case 55:
                return new ImmutablePandoDEPProgramLevelContentResponse[i];
            case 56:
                return new ImmutablePandoDevserverInfo[i];
            case 57:
                return new ImmutablePandoDirectAudioFallbackUrl[i];
            case 58:
                return new ImmutablePandoDirectMediaFallbackUrl[i];
            case 59:
                return new ImmutablePandoDropsEventPageNavigationMetadata[i];
            case 60:
                return new ImmutablePandoEarnedOnMedia[i];
            case 61:
                return new ImmutablePandoElectionAddYoursInfoDict[i];
            case 62:
                return new ImmutablePandoEntity[i];
            case 63:
                return new ImmutablePandoEstimate[i];
            case 64:
                return new ImmutablePandoEventPageNavigationMetadata[i];
            case 65:
                return new ImmutablePandoFBProductItemDetailsDict[i];
            case 66:
                return new ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse[i];
            case 67:
                return new ImmutablePandoFanClubInfoDict[i];
            case 68:
                return new ImmutablePandoFanClubStatusSyncInfo[i];
            case 69:
                return new ImmutablePandoFileCandidate[i];
            case 70:
                return new ImmutablePandoFormattedString[i];
            case 71:
                return new ImmutablePandoGIFNoteResponseInfo[i];
            case 72:
                return new ImmutablePandoGenAIMessagingData[i];
            case 73:
                return new ImmutablePandoGenAIPersonaBannerDict[i];
            case 74:
                return new ImmutablePandoGenAIPersonaBannersResponse[i];
            case 75:
                return new ImmutablePandoGenAIToolInfoDict[i];
            case 76:
                return new ImmutablePandoGoalsToastInfo[i];
            case 77:
                return new ImmutablePandoGraphGuardianContent[i];
            case 78:
                return new ImmutablePandoGreetingAttachment[i];
            case 79:
                return new ImmutablePandoGroupMetadata[i];
            case 80:
                return new ImmutablePandoGrowthFrictionInfo[i];
            case 81:
                return new ImmutablePandoGrowthFrictionInterventionButton[i];
            case 82:
                return new ImmutablePandoGrowthFrictionInterventionCategories[i];
            case 83:
                return new ImmutablePandoGrowthFrictionInterventionDetail[i];
            case 84:
                return new ImmutablePandoGuidanceTipResponse[i];
            case 85:
                return new ImmutablePandoHallpassDetailsDict[i];
            case 86:
                return new ImmutablePandoHzwPageInfo[i];
            case 87:
                return new ImmutablePandoIABPostClickDataDict[i];
            case 88:
                return new ImmutablePandoIGAdCreationOptimizationPayloadDict[i];
            case 89:
                return new ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict[i];
            case 90:
                return new ImmutablePandoIGAdCreativeStory9x16CaptionData[i];
            case 91:
                return new ImmutablePandoIGAdProfileProductTabDict[i];
            case 92:
                return new ImmutablePandoIGAdScreenshotURLDataDict[i];
            case 93:
                return new ImmutablePandoIGAdsIABScreenshotDataDict[i];
            case 94:
                return new ImmutablePandoIGBWPIABPostClickDataExtensionDict[i];
            case 95:
                return new ImmutablePandoIGCTATextVariant[i];
            case 96:
                return new ImmutablePandoIGCTMessagingAdsInfoDict[i];
            case 97:
                return new ImmutablePandoIGCommentSheetMoreInfo[i];
            case 98:
                return new ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict[i];
            default:
                return new ImmutablePandoIGLocalEventDict[i];
        }
    }
}
