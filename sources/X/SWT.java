package X;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ParcelableSparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseIntArray;
import com.google.android.material.navigation.NavigationBarPresenter$SavedState;
import com.google.android.material.slider.BaseSlider$SliderState;
import com.google.android.material.slider.RangeSlider$RangeSliderState;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zza;
import com.google.firebase.iid.zzm;
import com.google.firebase.messaging.RemoteMessage;
import com.google.mlkit.vision.common.internal.VisionImageMetadataParcel;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.aistudio.model.AiAgentShareModel;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerPersonaModel;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.AchievementButtonAction;
import com.instagram.api.schemas.AchievementButtonInfo;
import com.instagram.api.schemas.AchievementButtonInfoImpl;
import com.instagram.api.schemas.AchievementCategory;
import com.instagram.api.schemas.AchievementDetailsImpl;
import com.instagram.api.schemas.AchievementName;
import com.instagram.api.schemas.AcquisitionExploreCampaignType;
import com.instagram.api.schemas.ActionType;
import com.instagram.api.schemas.ActivityPubUserIngestionStatusStr;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdModelType;
import com.instagram.api.schemas.AdproObjectiveTypesEnum;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.AdsMessageExtensionType;
import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.AdvantageAudienceDataImpl;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import com.instagram.api.schemas.AiAgentMetadataDictImpl;
import com.instagram.api.schemas.ApiAdFormats;
import com.instagram.api.schemas.AppInstallCTAInfo;
import com.instagram.api.schemas.AppSwitcherBadgeStatus;
import com.instagram.api.schemas.AppreciationUFIEntryActionType;
import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.api.schemas.AssetType;
import com.instagram.api.schemas.AudienceList;
import com.instagram.api.schemas.AudienceMessageEntityRangeImpl;
import com.instagram.api.schemas.AudienceValidationActionImpl;
import com.instagram.api.schemas.AudienceValidationActionType;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.AudienceValidationResponseStatus;
import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.api.schemas.AudioBrowserCollectionType;
import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AutoDubStatus;
import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.BCAdsPermissionStatus;
import com.instagram.api.schemas.BCPDealOutputTypeEnum;
import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.BillingWizardName;
import com.instagram.api.schemas.BonusPromoDialogAudienceType;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.api.schemas.BoostUpsellBannerPayloadSchemaImpl;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.BoostedComponentMessageType;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAgeImpl;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BudgetRecommendationType;
import com.instagram.api.schemas.BusinessProfileDictImpl;
import com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes;
import com.instagram.api.schemas.BwPIconOverlayType;
import com.instagram.api.schemas.BwPPostClickLandingExperineceType;
import com.instagram.api.schemas.CTABarActionType;
import com.instagram.api.schemas.CTABarAnimationType;
import com.instagram.api.schemas.CTABarType;
import com.instagram.api.schemas.CachedExternalLoginUserImpl;
import com.instagram.api.schemas.CallAdsInfoDict;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.CaptionTextFontStyle;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeButtonAction;
import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeButtonInfoImpl;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.api.schemas.ChildCommentPagingDirection;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.ClipsACRMidCardSubType;
import com.instagram.api.schemas.ClipsAggregateTrendType;
import com.instagram.api.schemas.ClipsAudioMuteReasonType;
import com.instagram.api.schemas.ClipsBreakingCreatorInfoImpl;
import com.instagram.api.schemas.ClipsCameraSurface;
import com.instagram.api.schemas.ClipsCuratedTrendFlowVariant;
import com.instagram.api.schemas.ClipsMerchandisingPillType;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.EarnedOnMedia;
import com.instagram.api.schemas.EarnedOnMediaState;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.feed.audio.Audio;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Calendar;
import org.webrtc.EglBase14Impl;

public final class SWT implements Parcelable.Creator {
    public final int A00;

    public SWT(int i) {
        this.A00 = i;
    }

    public static SWT A00(int i) {
        return new SWT(i);
    }

    /* JADX WARNING: type inference failed for: r6v87, types: [java.lang.Object, com.google.firebase.messaging.RemoteMessage] */
    /* JADX WARNING: type inference failed for: r6v89, types: [com.google.firebase.iid.zzm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v93, types: [android.view.View$BaseSavedState, com.google.android.material.slider.BaseSlider$SliderState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v94, types: [java.lang.Object, com.google.android.material.navigation.NavigationBarPresenter$SavedState] */
    /* JADX WARNING: type inference failed for: r6v95, types: [com.google.android.material.datepicker.SingleDateSelector, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        ArrayList A0v;
        Integer A12;
        ArrayList A0v2;
        ArrayList A0v3;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                int readInt = parcel2.readInt();
                int readInt2 = parcel2.readInt();
                Calendar A0u = Pxj.A0u();
                A0u.set(1, readInt);
                A0u.set(2, readInt2);
                return new Month(A0u);
            case 1:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                Class<Long> cls = Long.class;
                rangeDateSelector.A01 = (Long) Pxi.A0U(parcel2, cls);
                rangeDateSelector.A00 = (Long) Pxi.A0U(parcel2, cls);
                return rangeDateSelector;
            case 2:
                ? obj = new Object();
                obj.A00 = (Long) Pxi.A0U(parcel2, Long.class);
                return obj;
            case 3:
                int readInt3 = parcel2.readInt();
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(readInt3);
                int[] iArr = new int[readInt3];
                boolean[] zArr = new boolean[readInt3];
                parcel2.readIntArray(iArr);
                parcel2.readBooleanArray(zArr);
                for (int i = 0; i < readInt3; i++) {
                    sparseBooleanArray.put(iArr[i], zArr[i]);
                }
                return sparseBooleanArray;
            case 4:
                int readInt4 = parcel2.readInt();
                SparseIntArray sparseIntArray = new SparseIntArray(readInt4);
                int[] iArr2 = new int[readInt4];
                int[] iArr3 = new int[readInt4];
                parcel2.readIntArray(iArr2);
                parcel2.readIntArray(iArr3);
                for (int i2 = 0; i2 < readInt4; i2++) {
                    sparseIntArray.put(iArr2[i2], iArr3[i2]);
                }
                return sparseIntArray;
            case 5:
                ? obj2 = new Object();
                obj2.A00 = parcel2.readInt();
                obj2.A01 = (ParcelableSparseArray) C41847B3o.A03(parcel2, obj2.getClass());
                return obj2;
            case 6:
                ? baseSavedState = new View.BaseSavedState(parcel2);
                baseSavedState.A01 = parcel2.readFloat();
                baseSavedState.A02 = parcel2.readFloat();
                ArrayList A1C = AnonymousClass7TE.A1C();
                baseSavedState.A03 = A1C;
                Pxe.A1O(parcel2, Float.class, A1C);
                baseSavedState.A00 = parcel2.readFloat();
                baseSavedState.A04 = parcel2.createBooleanArray()[0];
                return baseSavedState;
            case 7:
                return new RangeSlider$RangeSliderState(parcel2);
            case 8:
                return new TimeModel(parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt());
            case 9:
                return new zza((PendingIntent) C41847B3o.A03(parcel2, ReviewInfo.class), C41848B3p.A1X(parcel2));
            case 10:
                IBinder readStrongBinder = parcel2.readStrongBinder();
                if (readStrongBinder == null) {
                    return null;
                }
                ? obj3 = new Object();
                obj3.A00 = new Messenger(readStrongBinder);
                return obj3;
            case 11:
                int A002 = C295505oK.A00(parcel2);
                Bundle bundle = null;
                while (parcel2.dataPosition() < A002) {
                    int readInt5 = parcel2.readInt();
                    if (((char) readInt5) != 2) {
                        C295505oK.A0C(parcel2, readInt5);
                    } else {
                        bundle = C295505oK.A02(parcel2, readInt5);
                    }
                }
                C295505oK.A0B(parcel2, A002);
                ? obj4 = new Object();
                obj4.A00 = bundle;
                return obj4;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                int A003 = C295505oK.A00(parcel2);
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (parcel2.dataPosition() < A003) {
                    int readInt6 = parcel2.readInt();
                    char c = (char) readInt6;
                    if (c == 1) {
                        i3 = Pxh.A08(parcel2, readInt6);
                    } else if (c == 2) {
                        i4 = Pxh.A08(parcel2, readInt6);
                    } else if (c == 3) {
                        i5 = Pxh.A08(parcel2, readInt6);
                    } else if (c != 4) {
                        i6 = Pxj.A09(parcel2, c, 5, readInt6, i6);
                    } else {
                        j = Pxi.A08(parcel2, readInt6);
                    }
                }
                C295505oK.A0B(parcel2, A003);
                return new VisionImageMetadataParcel(i3, i4, i5, j, i6);
            case 13:
                return new AiStudioLoggingData(C41847B3o.A03(parcel2, AiStudioLoggingData.class), C41848B3p.A1D(parcel2));
            case 14:
                Class<AiAgentShareModel> cls2 = AiAgentShareModel.class;
                return new AiAgentShareModel(C41847B3o.A03(parcel2, cls2), (IGAIAgentVisibilityStatus) C41847B3o.A03(parcel2, cls2), C41848B3p.A1D(parcel2));
            case 15:
                return new UtmMetadata(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 16:
                String A1D = C41848B3p.A1D(parcel2);
                int readInt7 = parcel2.readInt();
                ArrayList A0v4 = DbS.A0v(readInt7);
                for (int i7 = 0; i7 != readInt7; i7 = JTT.A04(parcel2, AiStudioProfileBannerPersonaModel.CREATOR, A0v4, i7)) {
                }
                return new AiStudioProfileBannerModel(A1D, A0v4);
            case 17:
                return new AiStudioProfileBannerPersonaModel(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                String A1D2 = C41848B3p.A1D(parcel2);
                long readLong = parcel2.readLong();
                String readString = parcel2.readString();
                Class<Achievement> cls3 = Achievement.class;
                AchievementCategory achievementCategory = (AchievementCategory) C41847B3o.A03(parcel2, cls3);
                Integer num = null;
                if (parcel2.readInt() == 0) {
                    A0v3 = null;
                } else {
                    int readInt8 = parcel2.readInt();
                    A0v3 = DbS.A0v(readInt8);
                    for (int i8 = 0; i8 != readInt8; i8++) {
                        C41848B3p.A1J(parcel2, cls3, A0v3);
                    }
                }
                String readString2 = parcel2.readString();
                String readString3 = parcel2.readString();
                String readString4 = parcel2.readString();
                String readString5 = parcel2.readString();
                String readString6 = parcel2.readString();
                EarnedOnMediaState earnedOnMediaState = (EarnedOnMediaState) C41847B3o.A03(parcel2, cls3);
                String readString7 = parcel2.readString();
                AchievementButtonInfo achievementButtonInfo = (AchievementButtonInfo) C41847B3o.A03(parcel2, cls3);
                String readString8 = parcel2.readString();
                String readString9 = parcel2.readString();
                AchievementName achievementName = (AchievementName) C41847B3o.A03(parcel2, cls3);
                AchievementButtonInfo achievementButtonInfo2 = (AchievementButtonInfo) C41847B3o.A03(parcel2, cls3);
                Integer A0C = Dbc.A0C(parcel2);
                AchievementButtonInfo achievementButtonInfo3 = (AchievementButtonInfo) C41847B3o.A03(parcel2, cls3);
                String readString10 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num = C41847B3o.A12(parcel2);
                }
                return new Achievement(achievementButtonInfo, achievementButtonInfo2, achievementButtonInfo3, achievementCategory, achievementName, earnedOnMediaState, A0C, num, A1D2, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, parcel2.readString(), parcel2.readString(), A0v3, parcel2.readInt(), readLong);
            case 19:
                0qQ.A0B(parcel2, 0);
                return AchievementButtonAction.values()[parcel2.readInt()];
            case 20:
                0qQ.A0B(parcel2, 0);
                return new AchievementButtonInfoImpl((AchievementButtonAction) C41847B3o.A03(parcel2, AchievementButtonInfoImpl.class), parcel2.readString(), parcel2.readString());
            case 21:
                0qQ.A0B(parcel2, 0);
                return AchievementCategory.values()[parcel2.readInt()];
            case 22:
                String A1D3 = C41848B3p.A1D(parcel2);
                Class<AchievementDetailsImpl> cls4 = AchievementDetailsImpl.class;
                AchievementCategory achievementCategory2 = (AchievementCategory) C41847B3o.A03(parcel2, cls4);
                Integer num2 = null;
                if (parcel2.readInt() == 0) {
                    A0v2 = null;
                } else {
                    int readInt9 = parcel2.readInt();
                    A0v2 = DbS.A0v(readInt9);
                    for (int i9 = 0; i9 != readInt9; i9++) {
                        C41848B3p.A1J(parcel2, cls4, A0v2);
                    }
                }
                String readString11 = parcel2.readString();
                String readString12 = parcel2.readString();
                EarnedOnMedia earnedOnMedia = (EarnedOnMedia) C41847B3o.A03(parcel2, cls4);
                String readString13 = parcel2.readString();
                int readInt10 = parcel2.readInt();
                AchievementName achievementName2 = (AchievementName) C41847B3o.A03(parcel2, cls4);
                AchievementButtonInfo achievementButtonInfo4 = (AchievementButtonInfo) C41847B3o.A03(parcel2, cls4);
                Integer A0C2 = Dbc.A0C(parcel2);
                String readString14 = parcel2.readString();
                AchievementButtonInfo achievementButtonInfo5 = (AchievementButtonInfo) C41847B3o.A03(parcel2, cls4);
                if (parcel2.readInt() != 0) {
                    num2 = C41847B3o.A12(parcel2);
                }
                return new AchievementDetailsImpl(achievementButtonInfo4, achievementButtonInfo5, achievementCategory2, achievementName2, earnedOnMedia, A0C2, num2, A1D3, readString11, readString12, readString13, readString14, parcel2.readString(), A0v2, readInt10);
            case 23:
                0qQ.A0B(parcel2, 0);
                return AchievementName.values()[parcel2.readInt()];
            case 24:
                0qQ.A0B(parcel2, 0);
                return AcquisitionExploreCampaignType.values()[parcel2.readInt()];
            case 25:
                0qQ.A0B(parcel2, 0);
                return ActionType.values()[parcel2.readInt()];
            case 26:
                0qQ.A0B(parcel2, 0);
                return ActivityPubUserIngestionStatusStr.values()[parcel2.readInt()];
            case 27:
                0qQ.A0B(parcel2, 0);
                return AdGeoLocationType.values()[parcel2.readInt()];
            case 28:
                0qQ.A0B(parcel2, 0);
                return AdModelType.values()[parcel2.readInt()];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                0qQ.A0B(parcel2, 0);
                return AdproObjectiveTypesEnum.values()[parcel2.readInt()];
            case 30:
                0qQ.A0B(parcel2, 0);
                return AdproRegulatedCategory.values()[parcel2.readInt()];
            case 31:
                0qQ.A0B(parcel2, 0);
                return AdsAPIInstagramPosition.values()[parcel2.readInt()];
            case 32:
                0qQ.A0B(parcel2, 0);
                return AdsMessageExtensionType.values()[parcel2.readInt()];
            case 33:
                0qQ.A0B(parcel2, 0);
                return AdsRatingAndReviewDisplayFormat.values()[parcel2.readInt()];
            case 34:
                0qQ.A0B(parcel2, 0);
                return AdsRatingAndReviewStarType.values()[parcel2.readInt()];
            case 35:
                0qQ.A0B(parcel2, 0);
                return AdsTargetingGender.values()[parcel2.readInt()];
            case 36:
                0qQ.A0B(parcel2, 0);
                return new AdvantageAudienceDataImpl((XFBTargetingAutomationAdvantageAudienceStatus) C41847B3o.A03(parcel2, AdvantageAudienceDataImpl.class), JTU.A0U(parcel2));
            case 37:
                0qQ.A0B(parcel2, 0);
                return AfiInterestsRecoStyle.values()[parcel2.readInt()];
            case 38:
                return new AiAgentMetadataDictImpl(C41847B3o.A03(parcel2, AiAgentMetadataDictImpl.class), C41848B3p.A1D(parcel2), parcel2.readString());
            case 39:
                0qQ.A0B(parcel2, 0);
                return ApiAdFormats.values()[parcel2.readInt()];
            case 40:
                return new AppInstallCTAInfo(C41848B3p.A1D(parcel2), parcel2.readString());
            case Seq.NULL_REFNUM /*41*/:
                0qQ.A0B(parcel2, 0);
                return AppSwitcherBadgeStatus.values()[parcel2.readInt()];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                0qQ.A0B(parcel2, 0);
                return AppreciationUFIEntryActionType.values()[parcel2.readInt()];
            case 43:
                0qQ.A0B(parcel2, 0);
                return AssetRecommendationType.values()[parcel2.readInt()];
            case 44:
                0qQ.A0B(parcel2, 0);
                return AssetType.values()[parcel2.readInt()];
            case 45:
                0qQ.A0B(parcel2, 0);
                return new AudienceList(parcel2.readString(), parcel2.readString(), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2));
            case 46:
                Integer num3 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    A12 = null;
                } else {
                    A12 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    num3 = C41847B3o.A12(parcel2);
                }
                return new AudienceMessageEntityRangeImpl(A12, num3, parcel2.readString());
            case 47:
                0qQ.A0B(parcel2, 0);
                return new AudienceValidationActionImpl((AudienceValidationActionType) C41847B3o.A03(parcel2, AudienceValidationActionImpl.class), parcel2.readString(), parcel2.readString());
            case 48:
                0qQ.A0B(parcel2, 0);
                return AudienceValidationActionType.values()[parcel2.readInt()];
            case 49:
                ArrayList arrayList = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    A0v = null;
                } else {
                    int readInt11 = parcel2.readInt();
                    A0v = DbS.A0v(readInt11);
                    for (int i10 = 0; i10 != readInt11; i10++) {
                        C41848B3p.A1J(parcel2, AudienceValidationResponse.class, A0v);
                    }
                }
                String readString15 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    int readInt12 = parcel2.readInt();
                    arrayList = DbS.A0v(readInt12);
                    for (int i11 = 0; i11 != readInt12; i11++) {
                        C41848B3p.A1J(parcel2, AudienceValidationResponse.class, arrayList);
                    }
                }
                Class<AudienceValidationResponse> cls5 = AudienceValidationResponse.class;
                return new AudienceValidationResponse((AudienceValidationResponseStatus) C41847B3o.A03(parcel2, cls5), (BoostedComponentMessageType) C41847B3o.A03(parcel2, cls5), readString15, parcel2.readString(), A0v, arrayList);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                0qQ.A0B(parcel2, 0);
                return AudienceValidationResponseStatus.values()[parcel2.readInt()];
            case 51:
                0qQ.A0B(parcel2, 0);
                return AudioBrowserCategoryType.values()[parcel2.readInt()];
            case 52:
                0qQ.A0B(parcel2, 0);
                return AudioBrowserCollectionType.values()[parcel2.readInt()];
            case 53:
                0qQ.A0B(parcel2, 0);
                return AudioBrowserPlaylistType.values()[parcel2.readInt()];
            case 54:
                0qQ.A0B(parcel2, 0);
                return new AudioFilterInfo((AudioFilterType) C41847B3o.A03(parcel2, AudioFilterInfo.class));
            case 55:
                0qQ.A0B(parcel2, 0);
                return new AudioNoteResponseInfo((Audio) C41847B3o.A03(parcel2, AudioNoteResponseInfo.class), parcel2.readString());
            case 56:
                0qQ.A0B(parcel2, 0);
                return AutoDubStatus.values()[parcel2.readInt()];
            case 57:
                0qQ.A0B(parcel2, 0);
                return new AvatarNoteResponseInfoImpl((MediaType) C41847B3o.A03(parcel2, AvatarNoteResponseInfoImpl.class), parcel2.readString(), parcel2.readString());
            case 58:
                0qQ.A0B(parcel2, 0);
                return BCAdsPermissionStatus.values()[parcel2.readInt()];
            case 59:
                0qQ.A0B(parcel2, 0);
                return BCPDealOutputTypeEnum.values()[parcel2.readInt()];
            case 60:
                0qQ.A0B(parcel2, 0);
                return BeneficiaryType.values()[parcel2.readInt()];
            case 61:
                0qQ.A0B(parcel2, 0);
                return BillingWizardName.values()[parcel2.readInt()];
            case 62:
                0qQ.A0B(parcel2, 0);
                return BonusPromoDialogAudienceType.values()[parcel2.readInt()];
            case 63:
                0qQ.A0B(parcel2, 0);
                return BonusPromoDialogType.values()[parcel2.readInt()];
            case 64:
                return new BoostUpsellBannerPayloadSchemaImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString());
            case 65:
                0qQ.A0B(parcel2, 0);
                return BoostedActionStatus.values()[parcel2.readInt()];
            case 66:
                0qQ.A0B(parcel2, 0);
                return BoostedComponentMessageType.values()[parcel2.readInt()];
            case 67:
                0qQ.A0B(parcel2, 0);
                return BoostedPostAudienceOption.values()[parcel2.readInt()];
            case 68:
                0qQ.A0B(parcel2, 0);
                return BrandedContentBrandTaggingRequestApprovalStatus.values()[parcel2.readInt()];
            case 69:
                return new BrandedContentGatingCountryMinimumAgeImpl(C41848B3p.A1D(parcel2), JTU.A0U(parcel2));
            case 70:
                0qQ.A0B(parcel2, 0);
                return BrandedContentProjectAction.values()[parcel2.readInt()];
            case 71:
                0qQ.A0B(parcel2, 0);
                Class<BrandedContentProjectMetadata> cls6 = BrandedContentProjectMetadata.class;
                BrandedContentProjectAction brandedContentProjectAction = (BrandedContentProjectAction) C41847B3o.A03(parcel2, cls6);
                if (parcel2.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                return new BrandedContentProjectMetadata((BCPDealOutputTypeEnum) C41847B3o.A03(parcel2, cls6), brandedContentProjectAction, valueOf, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 72:
                0qQ.A0B(parcel2, 0);
                return BudgetRecommendationType.values()[parcel2.readInt()];
            case 73:
                return new BusinessProfileDictImpl((ImageUrl) C41847B3o.A03(parcel2, BusinessProfileDictImpl.class), C41848B3p.A1D(parcel2), parcel2.readString());
            case 74:
                0qQ.A0B(parcel2, 0);
                return BuyWithIntegrationPostClickExperienceTypes.values()[parcel2.readInt()];
            case 75:
                0qQ.A0B(parcel2, 0);
                return BwPIconOverlayType.values()[parcel2.readInt()];
            case 76:
                0qQ.A0B(parcel2, 0);
                return BwPPostClickLandingExperineceType.values()[parcel2.readInt()];
            case 77:
                0qQ.A0B(parcel2, 0);
                return CTABarActionType.values()[parcel2.readInt()];
            case 78:
                0qQ.A0B(parcel2, 0);
                return CTABarAnimationType.values()[parcel2.readInt()];
            case 79:
                0qQ.A0B(parcel2, 0);
                return CTABarType.values()[parcel2.readInt()];
            case 80:
                return new CachedExternalLoginUserImpl((ImageUrl) C41847B3o.A03(parcel2, CachedExternalLoginUserImpl.class), C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 81:
                return new CallAdsInfoDict(C41848B3p.A1D(parcel2), C41848B3p.A1X(parcel2));
            case 82:
                0qQ.A0B(parcel2, 0);
                return CallToActionType.values()[parcel2.readInt()];
            case 83:
                0qQ.A0B(parcel2, 0);
                return CaptionTextFontStyle.values()[parcel2.readInt()];
            case 84:
                String A1D4 = C41848B3p.A1D(parcel2);
                String readString16 = parcel2.readString();
                Class<Challenge> cls7 = Challenge.class;
                String readString17 = parcel2.readString();
                String readString18 = parcel2.readString();
                long readLong2 = parcel2.readLong();
                String readString19 = parcel2.readString();
                boolean A1X = C41848B3p.A1X(parcel2);
                String readString20 = parcel2.readString();
                String readString21 = parcel2.readString();
                String readString22 = parcel2.readString();
                String readString23 = parcel2.readString();
                String readString24 = parcel2.readString();
                return new Challenge((ChallengeButtonInfo) C41847B3o.A03(parcel2, cls7), (ChallengeButtonInfo) C41847B3o.A03(parcel2, cls7), (ChallengeButtonInfo) C41847B3o.A03(parcel2, cls7), (ChallengeButtonInfo) C41847B3o.A03(parcel2, cls7), (ChallengeName) C41847B3o.A03(parcel2, cls7), (ChallengeState) C41847B3o.A03(parcel2, cls7), JTU.A0U(parcel2), A1D4, readString16, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, parcel2.readString(), parcel2.readString(), parcel2.readInt(), parcel2.readInt(), readLong2, A1X);
            case 85:
                0qQ.A0B(parcel2, 0);
                return ChallengeButtonAction.values()[parcel2.readInt()];
            case 86:
                0qQ.A0B(parcel2, 0);
                return new ChallengeButtonInfoImpl((ChallengeButtonAction) C41847B3o.A03(parcel2, ChallengeButtonInfoImpl.class), parcel2.readString(), parcel2.readString());
            case 87:
                String A1D5 = C41848B3p.A1D(parcel2);
                String readString25 = parcel2.readString();
                boolean A1X2 = C41848B3p.A1X(parcel2);
                String readString26 = parcel2.readString();
                Class<ChallengeDetails> cls8 = ChallengeDetails.class;
                ChallengeButtonInfo challengeButtonInfo = (ChallengeButtonInfo) C41847B3o.A03(parcel2, cls8);
                int readInt13 = parcel2.readInt();
                return new ChallengeDetails(challengeButtonInfo, (ChallengeButtonInfo) C41847B3o.A03(parcel2, cls8), (ChallengeButtonInfo) C41847B3o.A03(parcel2, cls8), (ChallengeName) C41847B3o.A03(parcel2, cls8), (ChallengeState) C41847B3o.A03(parcel2, cls8), A1D5, readString25, readString26, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), readInt13, parcel2.readInt(), A1X2);
            case 88:
                0qQ.A0B(parcel2, 0);
                return ChallengeName.values()[parcel2.readInt()];
            case 89:
                0qQ.A0B(parcel2, 0);
                return ChallengeState.values()[parcel2.readInt()];
            case 90:
                0qQ.A0B(parcel2, 0);
                return ChildCommentPagingDirection.values()[parcel2.readInt()];
            case 91:
                0qQ.A0B(parcel2, 0);
                return ClipChainType.values()[parcel2.readInt()];
            case 92:
                0qQ.A0B(parcel2, 0);
                return ClipsACRMidCardSubType.values()[parcel2.readInt()];
            case 93:
                0qQ.A0B(parcel2, 0);
                return ClipsAggregateTrendType.values()[parcel2.readInt()];
            case 94:
                0qQ.A0B(parcel2, 0);
                return ClipsAudioMuteReasonType.values()[parcel2.readInt()];
            case 95:
                return new ClipsBreakingCreatorInfoImpl(C41848B3p.A1D(parcel2));
            case 96:
                0qQ.A0B(parcel2, 0);
                return ClipsCameraSurface.values()[parcel2.readInt()];
            case 97:
                0qQ.A0B(parcel2, 0);
                return ClipsCuratedTrendFlowVariant.values()[parcel2.readInt()];
            case 98:
                0qQ.A0B(parcel2, 0);
                return ClipsMerchandisingPillType.values()[parcel2.readInt()];
            default:
                0qQ.A0B(parcel2, 0);
                return ClipsMidCardSubtype.values()[parcel2.readInt()];
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new Month[i];
            case 1:
                return new RangeDateSelector[i];
            case 2:
                return new SingleDateSelector[i];
            case 3:
                return new ParcelableSparseBooleanArray[i];
            case 4:
                return new ParcelableSparseIntArray[i];
            case 5:
                return new NavigationBarPresenter$SavedState[i];
            case 6:
                return new BaseSlider$SliderState[i];
            case 7:
                return new RangeSlider$RangeSliderState[i];
            case 8:
                return new TimeModel[i];
            case 9:
                return new ReviewInfo[i];
            case 10:
                return new zzm[i];
            case 11:
                return new RemoteMessage[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new VisionImageMetadataParcel[i];
            case 13:
                return new AiStudioLoggingData[i];
            case 14:
                return new AiAgentShareModel[i];
            case 15:
                return new UtmMetadata[i];
            case 16:
                return new AiStudioProfileBannerModel[i];
            case 17:
                return new AiStudioProfileBannerPersonaModel[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new Achievement[i];
            case 19:
                return new AchievementButtonAction[i];
            case 20:
                return new AchievementButtonInfoImpl[i];
            case 21:
                return new AchievementCategory[i];
            case 22:
                return new AchievementDetailsImpl[i];
            case 23:
                return new AchievementName[i];
            case 24:
                return new AcquisitionExploreCampaignType[i];
            case 25:
                return new ActionType[i];
            case 26:
                return new ActivityPubUserIngestionStatusStr[i];
            case 27:
                return new AdGeoLocationType[i];
            case 28:
                return new AdModelType[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new AdproObjectiveTypesEnum[i];
            case 30:
                return new AdproRegulatedCategory[i];
            case 31:
                return new AdsAPIInstagramPosition[i];
            case 32:
                return new AdsMessageExtensionType[i];
            case 33:
                return new AdsRatingAndReviewDisplayFormat[i];
            case 34:
                return new AdsRatingAndReviewStarType[i];
            case 35:
                return new AdsTargetingGender[i];
            case 36:
                return new AdvantageAudienceDataImpl[i];
            case 37:
                return new AfiInterestsRecoStyle[i];
            case 38:
                return new AiAgentMetadataDictImpl[i];
            case 39:
                return new ApiAdFormats[i];
            case 40:
                return new AppInstallCTAInfo[i];
            case Seq.NULL_REFNUM /*41*/:
                return new AppSwitcherBadgeStatus[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new AppreciationUFIEntryActionType[i];
            case 43:
                return new AssetRecommendationType[i];
            case 44:
                return new AssetType[i];
            case 45:
                return new AudienceList[i];
            case 46:
                return new AudienceMessageEntityRangeImpl[i];
            case 47:
                return new AudienceValidationActionImpl[i];
            case 48:
                return new AudienceValidationActionType[i];
            case 49:
                return new AudienceValidationResponse[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new AudienceValidationResponseStatus[i];
            case 51:
                return new AudioBrowserCategoryType[i];
            case 52:
                return new AudioBrowserCollectionType[i];
            case 53:
                return new AudioBrowserPlaylistType[i];
            case 54:
                return new AudioFilterInfo[i];
            case 55:
                return new AudioNoteResponseInfo[i];
            case 56:
                return new AutoDubStatus[i];
            case 57:
                return new AvatarNoteResponseInfoImpl[i];
            case 58:
                return new BCAdsPermissionStatus[i];
            case 59:
                return new BCPDealOutputTypeEnum[i];
            case 60:
                return new BeneficiaryType[i];
            case 61:
                return new BillingWizardName[i];
            case 62:
                return new BonusPromoDialogAudienceType[i];
            case 63:
                return new BonusPromoDialogType[i];
            case 64:
                return new BoostUpsellBannerPayloadSchemaImpl[i];
            case 65:
                return new BoostedActionStatus[i];
            case 66:
                return new BoostedComponentMessageType[i];
            case 67:
                return new BoostedPostAudienceOption[i];
            case 68:
                return new BrandedContentBrandTaggingRequestApprovalStatus[i];
            case 69:
                return new BrandedContentGatingCountryMinimumAgeImpl[i];
            case 70:
                return new BrandedContentProjectAction[i];
            case 71:
                return new BrandedContentProjectMetadata[i];
            case 72:
                return new BudgetRecommendationType[i];
            case 73:
                return new BusinessProfileDictImpl[i];
            case 74:
                return new BuyWithIntegrationPostClickExperienceTypes[i];
            case 75:
                return new BwPIconOverlayType[i];
            case 76:
                return new BwPPostClickLandingExperineceType[i];
            case 77:
                return new CTABarActionType[i];
            case 78:
                return new CTABarAnimationType[i];
            case 79:
                return new CTABarType[i];
            case 80:
                return new CachedExternalLoginUserImpl[i];
            case 81:
                return new CallAdsInfoDict[i];
            case 82:
                return new CallToActionType[i];
            case 83:
                return new CaptionTextFontStyle[i];
            case 84:
                return new Challenge[i];
            case 85:
                return new ChallengeButtonAction[i];
            case 86:
                return new ChallengeButtonInfoImpl[i];
            case 87:
                return new ChallengeDetails[i];
            case 88:
                return new ChallengeName[i];
            case 89:
                return new ChallengeState[i];
            case 90:
                return new ChildCommentPagingDirection[i];
            case 91:
                return new ClipChainType[i];
            case 92:
                return new ClipsACRMidCardSubType[i];
            case 93:
                return new ClipsAggregateTrendType[i];
            case 94:
                return new ClipsAudioMuteReasonType[i];
            case 95:
                return new ClipsBreakingCreatorInfoImpl[i];
            case 96:
                return new ClipsCameraSurface[i];
            case 97:
                return new ClipsCuratedTrendFlowVariant[i];
            case 98:
                return new ClipsMerchandisingPillType[i];
            default:
                return new ClipsMidCardSubtype[i];
        }
    }
}
