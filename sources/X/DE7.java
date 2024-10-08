package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.ClipsRSAMidCardSubType;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import com.instagram.api.schemas.ClipsTemplateBrowserCategory;
import com.instagram.api.schemas.ClipsTemplateBrowserType;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.ClipsTrendType;
import com.instagram.api.schemas.ClipsTrialDictImpl;
import com.instagram.api.schemas.ClipsTrimmingStrategy;
import com.instagram.api.schemas.CloseToEarningAchievementMedia;
import com.instagram.api.schemas.CollectionButtonCustomization;
import com.instagram.api.schemas.CollectionCustomization;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.api.schemas.CollectionTitleCustomization;
import com.instagram.api.schemas.CollectionTitleCustomizationImpl;
import com.instagram.api.schemas.ColorAtTextRangeDict;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImagesImpl;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.CommentPromptImpl;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.ContentActivation;
import com.instagram.api.schemas.ContentAppreciationDisclaimerType;
import com.instagram.api.schemas.ContentAppreciationFanOfferType;
import com.instagram.api.schemas.ContentAppreciationFeatureStatus;
import com.instagram.api.schemas.ContentAppreciationLoggingOnboardingStatusEnum;
import com.instagram.api.schemas.ContentStudioSurface;
import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import com.instagram.api.schemas.ContextualLinkCtaType;
import com.instagram.api.schemas.CreatorDigestSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerBottomCTAImpl;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import com.instagram.api.schemas.CreatorViewerContextCTAImpl;
import com.instagram.api.schemas.CreatorViewerContextCTATarget;
import com.instagram.api.schemas.CreatorViewerContextCTAType;
import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightInfoImpl;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.CreatorViewerInsightTypeV2;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalDetails;
import com.instagram.api.schemas.CreatorViewerSignalDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalInfo;
import com.instagram.api.schemas.CreatorViewerSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalModelImpl;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalType;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfoImpl;
import com.instagram.api.schemas.CreditCardAssociation;
import com.instagram.api.schemas.DEPProgramLevelContentResponse;
import com.instagram.api.schemas.DayOfTheWeek;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.DevserverInfoImpl;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.api.schemas.DynamicCreativeOptimizationDoFType;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.api.schemas.EarnedOnMediaImpl;
import com.instagram.api.schemas.EarnedOnMediaState;
import com.instagram.api.schemas.EditFailureReason;
import com.instagram.api.schemas.EntityImpl;
import com.instagram.api.schemas.ErrorHandlingResponseType;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.ErrorLevel;
import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.EventPageNavigationMetadataImpl;
import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.api.schemas.FBTagType;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.api.schemas.FanClubNextStepsCompletionState;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import com.instagram.api.schemas.FanClubSubscriptionButtonType;
import com.instagram.api.schemas.FeedAfterPartyPromoteEligibilityStatusEnum;
import com.instagram.api.schemas.FileCandidateImpl;
import com.instagram.api.schemas.FormattedString;
import com.instagram.api.schemas.FormattedStringImpl;
import com.instagram.api.schemas.FundingSourceType;
import com.instagram.api.schemas.FundraiserCampaignStateEnum;
import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import com.instagram.api.schemas.GatingResponseType;
import com.instagram.api.schemas.GenAIMagicModNotificationType;
import com.instagram.api.schemas.GenAIMessagingData;
import com.instagram.api.schemas.GenAIMessagingDataImpl;
import com.instagram.api.schemas.GenAIPersonaBannerDictImpl;
import com.instagram.api.schemas.GenAIPersonaBannersResponseImpl;
import com.instagram.api.schemas.GiftsMonetizationStatus;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.api.schemas.GoalsToastInfoImpl;
import com.instagram.api.schemas.GoalsToastType;
import com.instagram.api.schemas.GraphGuardianContentImpl;
import com.instagram.api.schemas.GreetingAttachment;
import com.instagram.api.schemas.GroupMetadataImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionButtonImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionDetailImpl;
import com.instagram.api.schemas.GuidanceTipIconAsset;
import com.instagram.api.schemas.GuidanceTipResponseImpl;
import com.instagram.api.schemas.GuideMediaType;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.api.schemas.HzwPageInfoImpl;
import com.instagram.api.schemas.IABPostClickDataDictImpl;
import com.instagram.api.schemas.IABPostClickEligibleExperienceTypes;
import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.api.schemas.MiniShopColorCustomization;
import com.instagram.api.schemas.RingSpec;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

public final class DE7 implements Parcelable.Creator {
    public final int A00;

    public DE7(int i) {
        this.A00 = i;
    }

    public static DE7 A00(int i) {
        return new DE7(i);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Integer A12;
        Integer A122;
        Integer A123;
        Integer A124;
        Integer A125;
        Integer A126;
        ArrayList arrayList;
        Integer A127;
        Boolean valueOf2;
        Long valueOf3;
        Integer A128;
        Boolean valueOf4;
        Boolean valueOf5;
        Boolean valueOf6;
        ArrayList arrayList2;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                0qQ.A0B(parcel2, 0);
                return ClipsMidCardType.values()[parcel2.readInt()];
            case 1:
                0qQ.A0B(parcel2, 0);
                return ClipsRSAMidCardSubType.values()[parcel2.readInt()];
            case 2:
                0qQ.A0B(parcel2, 0);
                return ClipsSpinSwappableElementType.values()[parcel2.readInt()];
            case 3:
                0qQ.A0B(parcel2, 0);
                return ClipsTemplateBrowserCategory.values()[parcel2.readInt()];
            case 4:
                0qQ.A0B(parcel2, 0);
                return ClipsTemplateBrowserType.values()[parcel2.readInt()];
            case 5:
                0qQ.A0B(parcel2, 0);
                return ClipsTemplateBrowserV2Type.values()[parcel2.readInt()];
            case 6:
                0qQ.A0B(parcel2, 0);
                return ClipsTemplatesStickerType.values()[parcel2.readInt()];
            case 7:
                0qQ.A0B(parcel2, 0);
                return ClipsTrendType.values()[parcel2.readInt()];
            case 8:
                boolean z = true;
                Boolean bool = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                Class<ClipsTrialDictImpl> cls = ClipsTrialDictImpl.class;
                MediaTrialGraduationStrategy mediaTrialGraduationStrategy = (MediaTrialGraduationStrategy) C41847B3o.A03(parcel2, cls);
                if (parcel2.readInt() != 0) {
                    if (parcel2.readInt() == 0) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new ClipsTrialDictImpl(mediaTrialGraduationStrategy, (MediaTrialStatus) C41847B3o.A03(parcel2, cls), valueOf, bool);
            case 9:
                0qQ.A0B(parcel2, 0);
                return ClipsTrimmingStrategy.values()[parcel2.readInt()];
            case 10:
                return new CloseToEarningAchievementMedia(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readInt());
            case 11:
                0qQ.A0B(parcel2, 0);
                return new CollectionButtonCustomization((MiniShopColorCustomization) C41847B3o.A03(parcel2, CollectionButtonCustomization.class));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                0qQ.A0B(parcel2, 0);
                Class<CollectionCustomization> cls2 = CollectionCustomization.class;
                return new CollectionCustomization((CollectionButtonCustomization) C41847B3o.A03(parcel2, cls2), (CollectionTitleCustomization) C41847B3o.A03(parcel2, cls2));
            case 13:
                0qQ.A0B(parcel2, 0);
                return CollectionPrivacyModeEnum.values()[parcel2.readInt()];
            case 14:
                return new CollectionTitleCustomizationImpl(C41848B3p.A00(parcel2));
            case 15:
                String A1D = C41848B3p.A1D(parcel2);
                String readString = parcel2.readString();
                Integer num = null;
                if (parcel2.readInt() == 0) {
                    A12 = null;
                } else {
                    A12 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    num = C41847B3o.A12(parcel2);
                }
                return new ColorAtTextRangeDict(A12, num, A1D, readString);
            case 16:
                Integer num2 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    A122 = null;
                } else {
                    A122 = C41847B3o.A12(parcel2);
                }
                String readString2 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    A123 = null;
                } else {
                    A123 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() == 0) {
                    A124 = null;
                } else {
                    A124 = C41847B3o.A12(parcel2);
                }
                String readString3 = parcel2.readString();
                String readString4 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    A125 = null;
                } else {
                    A125 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    num2 = C41847B3o.A12(parcel2);
                }
                return new CommentGiphyMediaFixedHeightImagesImpl(A122, A123, A124, A125, num2, readString2, readString3, readString4);
            case 17:
                0qQ.A0B(parcel2, 0);
                return new CommentGiphyMediaImages((CommentGiphyMediaFixedHeightImages) C41847B3o.A03(parcel2, CommentGiphyMediaImages.class));
            case EglBase14Impl.EGLExt_SDK_VERSION:
                String A1D2 = C41848B3p.A1D(parcel2);
                if (parcel2.readInt() == 0) {
                    A126 = null;
                } else {
                    A126 = C41847B3o.A12(parcel2);
                }
                return new CommentPromptImpl(A1D2, A126);
            case 19:
                0qQ.A0B(parcel2, 0);
                return ContainerEffectEnum.values()[parcel2.readInt()];
            case 20:
                0qQ.A0B(parcel2, 0);
                return ContentActivation.values()[parcel2.readInt()];
            case 21:
                0qQ.A0B(parcel2, 0);
                return ContentAppreciationDisclaimerType.values()[parcel2.readInt()];
            case 22:
                0qQ.A0B(parcel2, 0);
                return ContentAppreciationFanOfferType.values()[parcel2.readInt()];
            case 23:
                0qQ.A0B(parcel2, 0);
                return ContentAppreciationFeatureStatus.values()[parcel2.readInt()];
            case 24:
                0qQ.A0B(parcel2, 0);
                return ContentAppreciationLoggingOnboardingStatusEnum.values()[parcel2.readInt()];
            case 25:
                0qQ.A0B(parcel2, 0);
                return ContentStudioSurface.values()[parcel2.readInt()];
            case 26:
                return new ContextualAdResponseExtrasImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 27:
                return new ContextualAdResponseOrganicInfoImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case 28:
                0qQ.A0B(parcel2, 0);
                return ContextualLinkCtaType.values()[parcel2.readInt()];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                0qQ.A0B(parcel2, 0);
                return new CreatorDigestSignalInfoImpl((InspirationSignalType) C41847B3o.A03(parcel2, CreatorDigestSignalInfoImpl.class), parcel2.readString(), parcel2.readString());
            case 30:
                0qQ.A0B(parcel2, 0);
                return new CreatorViewerBottomCTAImpl((CreatorViewerBottomCTAType) C41847B3o.A03(parcel2, CreatorViewerBottomCTAImpl.class), parcel2.readString());
            case 31:
                0qQ.A0B(parcel2, 0);
                return CreatorViewerBottomCTAType.values()[parcel2.readInt()];
            case 32:
                0qQ.A0B(parcel2, 0);
                Class<CreatorViewerContextCTAImpl> cls3 = CreatorViewerContextCTAImpl.class;
                return new CreatorViewerContextCTAImpl((CreatorViewerContextCTATarget) C41847B3o.A03(parcel2, cls3), (CreatorViewerContextCTAType) C41847B3o.A03(parcel2, cls3), (FormattedString) C41847B3o.A03(parcel2, cls3), parcel2.readString(), parcel2.readString());
            case 33:
                0qQ.A0B(parcel2, 0);
                return CreatorViewerContextCTATarget.values()[parcel2.readInt()];
            case 34:
                0qQ.A0B(parcel2, 0);
                return CreatorViewerContextCTAType.values()[parcel2.readInt()];
            case 35:
                0qQ.A0B(parcel2, 0);
                return CreatorViewerInsightCTA.values()[parcel2.readInt()];
            case 36:
                0qQ.A0B(parcel2, 0);
                Class<CreatorViewerInsightInfoImpl> cls4 = CreatorViewerInsightInfoImpl.class;
                return new CreatorViewerInsightInfoImpl((CreatorViewerInsightTypeV2) C41847B3o.A03(parcel2, cls4), (FormattedString) C41847B3o.A03(parcel2, cls4), parcel2.readString());
            case 37:
                0qQ.A0B(parcel2, 0);
                return CreatorViewerInsightType.values()[parcel2.readInt()];
            case 38:
                0qQ.A0B(parcel2, 0);
                return CreatorViewerInsightTypeV2.values()[parcel2.readInt()];
            case 39:
                0qQ.A0B(parcel2, 0);
                Class<CreatorViewerSignalAudioDetailsImpl> cls5 = CreatorViewerSignalAudioDetailsImpl.class;
                return new CreatorViewerSignalAudioDetailsImpl((FormattedString) C41847B3o.A03(parcel2, cls5), (TrackOrOriginalSoundSchema) C41847B3o.A03(parcel2, cls5));
            case 40:
                0qQ.A0B(parcel2, 0);
                Class<CreatorViewerSignalDetailsImpl> cls6 = CreatorViewerSignalDetailsImpl.class;
                return new CreatorViewerSignalDetailsImpl((CreatorViewerSignalAudioDetails) C41847B3o.A03(parcel2, cls6), (CreatorViewerSignalPlainDetails) C41847B3o.A03(parcel2, cls6), (CreatorViewerSignalReelsTextDetails) C41847B3o.A03(parcel2, cls6));
            case Seq.NULL_REFNUM:
                0qQ.A0B(parcel2, 0);
                return new CreatorViewerSignalInfoImpl((CreatorViewerSignalType) C41847B3o.A03(parcel2, CreatorViewerSignalInfoImpl.class), parcel2.readString());
            case Seq.RefTracker.REF_OFFSET:
                0qQ.A0B(parcel2, 0);
                Class<CreatorViewerSignalModelImpl> cls7 = CreatorViewerSignalModelImpl.class;
                return new CreatorViewerSignalModelImpl((CreatorViewerSignalDetails) C41847B3o.A03(parcel2, cls7), (InspirationSignalType) C41847B3o.A03(parcel2, cls7), parcel2.readString());
            case 43:
                return new CreatorViewerSignalPlainDetailsImpl((FormattedString) C41847B3o.A03(parcel2, CreatorViewerSignalPlainDetailsImpl.class), C41848B3p.A1D(parcel2));
            case 44:
                0qQ.A0B(parcel2, 0);
                Class<CreatorViewerSignalReelsTextDetailsImpl> cls8 = CreatorViewerSignalReelsTextDetailsImpl.class;
                return new CreatorViewerSignalReelsTextDetailsImpl((ClipsTextFormatType) C41847B3o.A03(parcel2, cls8), (FormattedString) C41847B3o.A03(parcel2, cls8));
            case 45:
                0qQ.A0B(parcel2, 0);
                return CreatorViewerSignalType.values()[parcel2.readInt()];
            case 46:
                String A1D3 = C41848B3p.A1D(parcel2);
                String readString5 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel2.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        C41848B3p.A1J(parcel2, CreatorViewerSignalWithInsightsInfoImpl.class, arrayList);
                    }
                }
                return new CreatorViewerSignalWithInsightsInfoImpl((CreatorViewerSignalInfo) C41847B3o.A03(parcel2, CreatorViewerSignalWithInsightsInfoImpl.class), A1D3, readString5, arrayList);
            case 47:
                0qQ.A0B(parcel2, 0);
                return CreditCardAssociation.values()[parcel2.readInt()];
            case 48:
                return new DEPProgramLevelContentResponse(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), C41848B3p.A1X(parcel2));
            case 49:
                0qQ.A0B(parcel2, 0);
                return DayOfTheWeek.values()[parcel2.readInt()];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                0qQ.A0B(parcel2, 0);
                return DestinationRecommendationReason.values()[parcel2.readInt()];
            case 51:
                return new DevserverInfoImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString());
            case 52:
                return new DropsEventPageNavigationMetadataImpl(C41848B3p.A1D(parcel2));
            case 53:
                0qQ.A0B(parcel2, 0);
                return DynamicCreativeOptimizationDoFType.values()[parcel2.readInt()];
            case 54:
                0qQ.A0B(parcel2, 0);
                return DynamicEffectState.values()[parcel2.readInt()];
            case 55:
                return new EarnedOnMediaImpl((EarnedOnMediaState) C41847B3o.A03(parcel2, EarnedOnMediaImpl.class), C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 56:
                0qQ.A0B(parcel2, 0);
                return EarnedOnMediaState.values()[parcel2.readInt()];
            case 57:
                0qQ.A0B(parcel2, 0);
                return EditFailureReason.values()[parcel2.readInt()];
            case 58:
                return new EntityImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString());
            case 59:
                0qQ.A0B(parcel2, 0);
                return ErrorHandlingResponseType.values()[parcel2.readInt()];
            case 60:
                0qQ.A0B(parcel2, 0);
                return ErrorIdentifier.values()[parcel2.readInt()];
            case 61:
                0qQ.A0B(parcel2, 0);
                return ErrorLevel.values()[parcel2.readInt()];
            case 62:
                return new Estimate(C41848B3p.A00(parcel2), parcel2.readInt());
            case 63:
                String A1D4 = C41848B3p.A1D(parcel2);
                if (parcel2.readInt() == 0) {
                    A127 = null;
                } else {
                    A127 = C41847B3o.A12(parcel2);
                }
                return new EventPageNavigationMetadataImpl(A1D4, A127, parcel2.readString());
            case 64:
                0qQ.A0B(parcel2, 0);
                return EventVisibilityType.values()[parcel2.readInt()];
            case 65:
                0qQ.A0B(parcel2, 0);
                Class<FBProductItemDetailsDictImpl> cls9 = FBProductItemDetailsDictImpl.class;
                ProductCheckoutProperties productCheckoutProperties = (ProductCheckoutProperties) C41847B3o.A03(parcel2, cls9);
                if (parcel2.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                return new FBProductItemDetailsDictImpl(productCheckoutProperties, (ProductImageContainer) C41847B3o.A03(parcel2, cls9), (ProductImageContainer) C41847B3o.A03(parcel2, cls9), valueOf2, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 66:
                0qQ.A0B(parcel2, 0);
                return FBTagType.values()[parcel2.readInt()];
            case 67:
                0qQ.A0B(parcel2, 0);
                return FanClubCategoryType.values()[parcel2.readInt()];
            case 68:
                0qQ.A0B(parcel2, 0);
                return FanClubNextStepsCompletionState.values()[parcel2.readInt()];
            case 69:
                0qQ.A0B(parcel2, 0);
                return FanClubNextStepsRecommendationsType.values()[parcel2.readInt()];
            case 70:
                0qQ.A0B(parcel2, 0);
                return FanClubSubscriptionButtonType.values()[parcel2.readInt()];
            case 71:
                0qQ.A0B(parcel2, 0);
                return FeedAfterPartyPromoteEligibilityStatusEnum.values()[parcel2.readInt()];
            case 72:
                String A1D5 = C41848B3p.A1D(parcel2);
                String readString6 = parcel2.readString();
                String readString7 = parcel2.readString();
                String readString8 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(parcel2.readLong());
                }
                return new FileCandidateImpl(valueOf3, A1D5, readString6, readString7, readString8, parcel2.readString(), parcel2.readString());
            case 73:
                return new FormattedStringImpl(C41848B3p.A1D(parcel2));
            case 74:
                0qQ.A0B(parcel2, 0);
                return FundingSourceType.values()[parcel2.readInt()];
            case 75:
                0qQ.A0B(parcel2, 0);
                return FundraiserCampaignStateEnum.values()[parcel2.readInt()];
            case 76:
                0qQ.A0B(parcel2, 0);
                return FundraiserVisibilityOnProfileStatus.values()[parcel2.readInt()];
            case 77:
                0qQ.A0B(parcel2, 0);
                return new GIFNoteResponseInfoImpl((CommentGiphyMediaInfo) C41847B3o.A03(parcel2, GIFNoteResponseInfoImpl.class));
            case 78:
                0qQ.A0B(parcel2, 0);
                return GatingResponseType.values()[parcel2.readInt()];
            case 79:
                0qQ.A0B(parcel2, 0);
                return GenAIMagicModNotificationType.values()[parcel2.readInt()];
            case 80:
                return new GenAIMessagingDataImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case 81:
                0qQ.A0B(parcel2, 0);
                return new GenAIPersonaBannerDictImpl((GenAIMessagingData) C41847B3o.A03(parcel2, GenAIPersonaBannerDictImpl.class), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 82:
                int A002 = C41848B3p.A00(parcel2);
                ArrayList arrayList3 = new ArrayList(A002);
                for (int i2 = 0; i2 != A002; i2++) {
                    C41848B3p.A1J(parcel2, GenAIPersonaBannersResponseImpl.class, arrayList3);
                }
                return new GenAIPersonaBannersResponseImpl(arrayList3);
            case 83:
                0qQ.A0B(parcel2, 0);
                return GiftsMonetizationStatus.values()[parcel2.readInt()];
            case 84:
                0qQ.A0B(parcel2, 0);
                return GiphyRequestSurface.values()[parcel2.readInt()];
            case 85:
                return new GoalsToastInfoImpl((GoalsToastType) C41847B3o.A03(parcel2, GoalsToastInfoImpl.class), C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 86:
                0qQ.A0B(parcel2, 0);
                return GoalsToastType.values()[parcel2.readInt()];
            case 87:
                return new GraphGuardianContentImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 88:
                Integer num3 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    A128 = null;
                } else {
                    A128 = C41847B3o.A12(parcel2);
                }
                String readString9 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num3 = C41847B3o.A12(parcel2);
                }
                return new GreetingAttachment(A128, num3, readString9);
            case 89:
                0qQ.A0B(parcel2, 0);
                ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
                ArrayList<String> createStringArrayList2 = parcel2.createStringArrayList();
                boolean A1X = C41848B3p.A1X(parcel2);
                String readString10 = parcel2.readString();
                String readString11 = parcel2.readString();
                String readString12 = parcel2.readString();
                String readString13 = parcel2.readString();
                boolean A1X2 = C41848B3p.A1X(parcel2);
                boolean A1X3 = C41848B3p.A1X(parcel2);
                Long l = null;
                if (parcel2.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                boolean A1X4 = C41848B3p.A1X(parcel2);
                boolean A1X5 = C41848B3p.A1X(parcel2);
                boolean A1X6 = C41848B3p.A1X(parcel2);
                boolean A1X7 = C41848B3p.A1X(parcel2);
                boolean A1X8 = C41848B3p.A1X(parcel2);
                boolean A1X9 = C41848B3p.A1X(parcel2);
                boolean A1X10 = C41848B3p.A1X(parcel2);
                if (parcel2.readInt() != 0) {
                    l = Long.valueOf(parcel2.readLong());
                }
                return new GroupMetadataImpl((RingSpec) C41847B3o.A03(parcel2, GroupMetadataImpl.class), valueOf4, l, readString10, readString11, readString12, readString13, createStringArrayList, createStringArrayList2, parcel2.createStringArrayList(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), A1X, A1X2, A1X3, A1X4, A1X5, A1X6, A1X7, A1X8, A1X9, A1X10);
            case 90:
                String A1D6 = C41848B3p.A1D(parcel2);
                if (parcel2.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                return new GrowthFrictionInterventionButtonImpl(valueOf5, A1D6, parcel2.readString(), parcel2.readString());
            case 91:
                String A1D7 = C41848B3p.A1D(parcel2);
                int readInt2 = parcel2.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                for (int i3 = 0; i3 != readInt2; i3++) {
                    C41848B3p.A1J(parcel2, GrowthFrictionInterventionDetailImpl.class, arrayList4);
                }
                return new GrowthFrictionInterventionDetailImpl(A1D7, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), arrayList4);
            case 92:
                0qQ.A0B(parcel2, 0);
                return GuidanceTipIconAsset.values()[parcel2.readInt()];
            case 93:
                return new GuidanceTipResponseImpl((GuidanceTipIconAsset) C41847B3o.A03(parcel2, GuidanceTipResponseImpl.class), C41848B3p.A1D(parcel2), parcel2.readString());
            case 94:
                0qQ.A0B(parcel2, 0);
                return GuideMediaType.values()[parcel2.readInt()];
            case 95:
                0qQ.A0B(parcel2, 0);
                return GuideTypeStr.values()[parcel2.readInt()];
            case 96:
                String A1D8 = C41848B3p.A1D(parcel2);
                if (parcel2.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                return new HzwPageInfoImpl(A1D8, valueOf6);
            case 97:
                0qQ.A0B(parcel2, 0);
                Class<IABPostClickDataDictImpl> cls10 = IABPostClickDataDictImpl.class;
                IGBWPIABPostClickDataExtensionDict iGBWPIABPostClickDataExtensionDict = (IGBWPIABPostClickDataExtensionDict) C41847B3o.A03(parcel2, cls10);
                if (parcel2.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt3 = parcel2.readInt();
                    arrayList2 = new ArrayList(readInt3);
                    for (int i4 = 0; i4 != readInt3; i4++) {
                        C41848B3p.A1J(parcel2, cls10, arrayList2);
                    }
                }
                return new IABPostClickDataDictImpl(iGBWPIABPostClickDataExtensionDict, arrayList2);
            case 98:
                0qQ.A0B(parcel2, 0);
                return IABPostClickEligibleExperienceTypes.values()[parcel2.readInt()];
            default:
                0qQ.A0B(parcel2, 0);
                return IABScreenshotEffectOnUserAction.values()[parcel2.readInt()];
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ClipsMidCardType[i];
            case 1:
                return new ClipsRSAMidCardSubType[i];
            case 2:
                return new ClipsSpinSwappableElementType[i];
            case 3:
                return new ClipsTemplateBrowserCategory[i];
            case 4:
                return new ClipsTemplateBrowserType[i];
            case 5:
                return new ClipsTemplateBrowserV2Type[i];
            case 6:
                return new ClipsTemplatesStickerType[i];
            case 7:
                return new ClipsTrendType[i];
            case 8:
                return new ClipsTrialDictImpl[i];
            case 9:
                return new ClipsTrimmingStrategy[i];
            case 10:
                return new CloseToEarningAchievementMedia[i];
            case 11:
                return new CollectionButtonCustomization[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new CollectionCustomization[i];
            case 13:
                return new CollectionPrivacyModeEnum[i];
            case 14:
                return new CollectionTitleCustomizationImpl[i];
            case 15:
                return new ColorAtTextRangeDict[i];
            case 16:
                return new CommentGiphyMediaFixedHeightImagesImpl[i];
            case 17:
                return new CommentGiphyMediaImages[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new CommentPromptImpl[i];
            case 19:
                return new ContainerEffectEnum[i];
            case 20:
                return new ContentActivation[i];
            case 21:
                return new ContentAppreciationDisclaimerType[i];
            case 22:
                return new ContentAppreciationFanOfferType[i];
            case 23:
                return new ContentAppreciationFeatureStatus[i];
            case 24:
                return new ContentAppreciationLoggingOnboardingStatusEnum[i];
            case 25:
                return new ContentStudioSurface[i];
            case 26:
                return new ContextualAdResponseExtrasImpl[i];
            case 27:
                return new ContextualAdResponseOrganicInfoImpl[i];
            case 28:
                return new ContextualLinkCtaType[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new CreatorDigestSignalInfoImpl[i];
            case 30:
                return new CreatorViewerBottomCTAImpl[i];
            case 31:
                return new CreatorViewerBottomCTAType[i];
            case 32:
                return new CreatorViewerContextCTAImpl[i];
            case 33:
                return new CreatorViewerContextCTATarget[i];
            case 34:
                return new CreatorViewerContextCTAType[i];
            case 35:
                return new CreatorViewerInsightCTA[i];
            case 36:
                return new CreatorViewerInsightInfoImpl[i];
            case 37:
                return new CreatorViewerInsightType[i];
            case 38:
                return new CreatorViewerInsightTypeV2[i];
            case 39:
                return new CreatorViewerSignalAudioDetailsImpl[i];
            case 40:
                return new CreatorViewerSignalDetailsImpl[i];
            case Seq.NULL_REFNUM:
                return new CreatorViewerSignalInfoImpl[i];
            case Seq.RefTracker.REF_OFFSET:
                return new CreatorViewerSignalModelImpl[i];
            case 43:
                return new CreatorViewerSignalPlainDetailsImpl[i];
            case 44:
                return new CreatorViewerSignalReelsTextDetailsImpl[i];
            case 45:
                return new CreatorViewerSignalType[i];
            case 46:
                return new CreatorViewerSignalWithInsightsInfoImpl[i];
            case 47:
                return new CreditCardAssociation[i];
            case 48:
                return new DEPProgramLevelContentResponse[i];
            case 49:
                return new DayOfTheWeek[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new DestinationRecommendationReason[i];
            case 51:
                return new DevserverInfoImpl[i];
            case 52:
                return new DropsEventPageNavigationMetadataImpl[i];
            case 53:
                return new DynamicCreativeOptimizationDoFType[i];
            case 54:
                return new DynamicEffectState[i];
            case 55:
                return new EarnedOnMediaImpl[i];
            case 56:
                return new EarnedOnMediaState[i];
            case 57:
                return new EditFailureReason[i];
            case 58:
                return new EntityImpl[i];
            case 59:
                return new ErrorHandlingResponseType[i];
            case 60:
                return new ErrorIdentifier[i];
            case 61:
                return new ErrorLevel[i];
            case 62:
                return new Estimate[i];
            case 63:
                return new EventPageNavigationMetadataImpl[i];
            case 64:
                return new EventVisibilityType[i];
            case 65:
                return new FBProductItemDetailsDictImpl[i];
            case 66:
                return new FBTagType[i];
            case 67:
                return new FanClubCategoryType[i];
            case 68:
                return new FanClubNextStepsCompletionState[i];
            case 69:
                return new FanClubNextStepsRecommendationsType[i];
            case 70:
                return new FanClubSubscriptionButtonType[i];
            case 71:
                return new FeedAfterPartyPromoteEligibilityStatusEnum[i];
            case 72:
                return new FileCandidateImpl[i];
            case 73:
                return new FormattedStringImpl[i];
            case 74:
                return new FundingSourceType[i];
            case 75:
                return new FundraiserCampaignStateEnum[i];
            case 76:
                return new FundraiserVisibilityOnProfileStatus[i];
            case 77:
                return new GIFNoteResponseInfoImpl[i];
            case 78:
                return new GatingResponseType[i];
            case 79:
                return new GenAIMagicModNotificationType[i];
            case 80:
                return new GenAIMessagingDataImpl[i];
            case 81:
                return new GenAIPersonaBannerDictImpl[i];
            case 82:
                return new GenAIPersonaBannersResponseImpl[i];
            case 83:
                return new GiftsMonetizationStatus[i];
            case 84:
                return new GiphyRequestSurface[i];
            case 85:
                return new GoalsToastInfoImpl[i];
            case 86:
                return new GoalsToastType[i];
            case 87:
                return new GraphGuardianContentImpl[i];
            case 88:
                return new GreetingAttachment[i];
            case 89:
                return new GroupMetadataImpl[i];
            case 90:
                return new GrowthFrictionInterventionButtonImpl[i];
            case 91:
                return new GrowthFrictionInterventionDetailImpl[i];
            case 92:
                return new GuidanceTipIconAsset[i];
            case 93:
                return new GuidanceTipResponseImpl[i];
            case 94:
                return new GuideMediaType[i];
            case 95:
                return new GuideTypeStr[i];
            case 96:
                return new HzwPageInfoImpl[i];
            case 97:
                return new IABPostClickDataDictImpl[i];
            case 98:
                return new IABPostClickEligibleExperienceTypes[i];
            default:
                return new IABScreenshotEffectOnUserAction[i];
        }
    }
}
