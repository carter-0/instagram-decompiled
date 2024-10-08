package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.CaptionTextFontStyle;
import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IABScreenshotTransitionTime;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl;
import com.instagram.api.schemas.IGAdProfileProductTabDictImpl;
import com.instagram.api.schemas.IGAdProfileProductTabFeatureModeEnum;
import com.instagram.api.schemas.IGAdScreenshotURLDataDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotVariant;
import com.instagram.api.schemas.IGAdsRrFormatEnum;
import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;
import com.instagram.api.schemas.IGBWPExperienceTypes;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDictImpl;
import com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes;
import com.instagram.api.schemas.IGCTATextVariantImpl;
import com.instagram.api.schemas.IGCTATextVariantSource;
import com.instagram.api.schemas.IGClickToMessagingCardTypeEnum;
import com.instagram.api.schemas.IGCommentSheetMoreInfoImpl;
import com.instagram.api.schemas.IGCreatorIncentiveProgram;
import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDictImpl;
import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;
import com.instagram.api.schemas.IGLiveGameStatus;
import com.instagram.api.schemas.IGLiveGames;
import com.instagram.api.schemas.IGLocalEventDictImpl;
import com.instagram.api.schemas.IGMusicArtistPinningErrorType;
import com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle;
import com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum;
import com.instagram.api.schemas.IGProjectPortalInfoDict;
import com.instagram.api.schemas.IGProjectPortalInfoDictImpl;
import com.instagram.api.schemas.IGRFSurveyContextDict;
import com.instagram.api.schemas.IGRFSurveyContextDictImpl;
import com.instagram.api.schemas.IGRFSurveyContextMappingDictImpl;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import com.instagram.api.schemas.ISOCountryCode;
import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;
import com.instagram.api.schemas.ImageURIDictImpl;
import com.instagram.api.schemas.InlineStyleAtRangeDict;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.InstagramMediaProductType;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.api.schemas.InstapalCharacterType;
import com.instagram.api.schemas.IntegrityInterstitialType;
import com.instagram.api.schemas.IntentAwareAdsFormatInfoImpl;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.api.schemas.LikeVisibilityType;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.LinkAttachmentDisallowedReason;
import com.instagram.api.schemas.LinkStickerType;
import com.instagram.api.schemas.LinkType;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.ListeningNowState;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LoadMoreType;
import com.instagram.api.schemas.LocationNoteResponseInfoImpl;
import com.instagram.api.schemas.LocationTypeaheadType;
import com.instagram.api.schemas.LoyaltyToplineInfoDictImpl;
import com.instagram.api.schemas.MapListType;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.api.schemas.MediaDestinationEnum;
import com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.api.schemas.MediaNoticeIcon;
import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.api.schemas.MetaGalleryAlbumType;
import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;
import com.instagram.api.schemas.MetaPlaceDictImpl;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.api.schemas.MidCardReelsChainCtaType;
import com.instagram.api.schemas.MiniShopColorCustomization;
import com.instagram.api.schemas.MiniShopColorPaletteCustomization;
import com.instagram.api.schemas.MiniShopColorPaletteCustomizationImpl;
import com.instagram.api.schemas.MiniShopSellerOnboardingStatus;
import com.instagram.api.schemas.ModuleVariant;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.api.schemas.MultiProductComponentDestinationType;
import com.instagram.api.schemas.MusicDropStreamingServiceData;
import com.instagram.api.schemas.MusicDropStreamingServiceEnum;
import com.instagram.api.schemas.MusicDropType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.api.schemas.MusicStatusStyleResponseInfoImpl;
import com.instagram.api.schemas.NativeInfoCardCommentLayout;
import com.instagram.api.schemas.NativeInfoCardTextAlignment;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.NonprofitSelectorSurfaceEnum;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteChatResponseInfoImpl;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.OneTapLinkedProfileInfoImpl;
import com.instagram.api.schemas.OpenDraftGalleryCommandImpl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

public final class FK5 implements Parcelable.Creator {
    public final int A00;

    public FK5(int i) {
        this.A00 = i;
    }

    public static FK5 A00(int i) {
        return new FK5(i);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer A12;
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Integer A122;
        Float valueOf4;
        Integer A123;
        Boolean valueOf5;
        ArrayList A0v;
        Integer A124;
        Integer A125;
        Boolean valueOf6;
        ArrayList A0v2;
        Boolean valueOf7;
        Float valueOf8;
        Integer A126;
        Integer A127;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                0qQ.A0B(parcel2, 0);
                return IABScreenshotTransitionTime.values()[parcel2.readInt()];
            case 1:
                String A1D = C41848B3p.A1D(parcel2);
                String readString = parcel2.readString();
                Boolean bool = null;
                if (parcel2.readInt() == 0) {
                    A12 = null;
                } else {
                    A12 = C41847B3o.A12(parcel2);
                }
                Float A0B = Dbc.A0B(parcel2);
                Float A0B2 = Dbc.A0B(parcel2);
                String readString2 = parcel2.readString();
                Integer A0C = Dbc.A0C(parcel2);
                CaptionTextFontStyle captionTextFontStyle = (CaptionTextFontStyle) C41847B3o.A03(parcel2, IGAdCreativeStory9x16CaptionDataImpl.class);
                Integer A0C2 = Dbc.A0C(parcel2);
                boolean z = true;
                if (parcel2.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                if (parcel2.readInt() != 0) {
                    if (parcel2.readInt() == 0) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new IGAdCreativeStory9x16CaptionDataImpl(captionTextFontStyle, valueOf, bool, A0B, A0B2, A12, A0C, A0C2, A1D, readString, readString2);
            case 2:
                0qQ.A0B(parcel2, 0);
                Class<IGAdProfileProductTabDictImpl> cls = IGAdProfileProductTabDictImpl.class;
                IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum = (IGAdProfileProductTabFeatureModeEnum) C41847B3o.A03(parcel2, cls);
                boolean z2 = true;
                ArrayList arrayList = null;
                if (parcel2.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                if (parcel2.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    if (parcel2.readInt() == 0) {
                        z2 = false;
                    }
                    valueOf3 = Boolean.valueOf(z2);
                }
                if (parcel2.readInt() != 0) {
                    int readInt = parcel2.readInt();
                    arrayList = DbS.A0v(readInt);
                    for (int i = 0; i != readInt; i++) {
                        C41848B3p.A1J(parcel2, cls, arrayList);
                    }
                }
                return new IGAdProfileProductTabDictImpl(iGAdProfileProductTabFeatureModeEnum, valueOf2, valueOf3, arrayList);
            case 3:
                0qQ.A0B(parcel2, 0);
                return IGAdProfileProductTabFeatureModeEnum.values()[parcel2.readInt()];
            case 4:
                String A1D2 = C41848B3p.A1D(parcel2);
                Integer num = null;
                if (parcel2.readInt() == 0) {
                    A122 = null;
                } else {
                    A122 = C41847B3o.A12(parcel2);
                }
                IGProjectPortalInfoDict iGProjectPortalInfoDict = (IGProjectPortalInfoDict) C41847B3o.A03(parcel2, IGAdScreenshotURLDataDictImpl.class);
                String readString3 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num = C41847B3o.A12(parcel2);
                }
                return new IGAdScreenshotURLDataDictImpl(iGProjectPortalInfoDict, A122, num, A1D2, readString3);
            case 5:
                Boolean bool2 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Float.valueOf(parcel2.readFloat());
                }
                Float A0B3 = Dbc.A0B(parcel2);
                Class<IGAdsIABScreenshotDataDictImpl> cls2 = IGAdsIABScreenshotDataDictImpl.class;
                IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction = (IABScreenshotEffectOnUserAction) C41847B3o.A03(parcel2, cls2);
                Float A0B4 = Dbc.A0B(parcel2);
                Float A0B5 = Dbc.A0B(parcel2);
                IABScreenshotTransitionTime iABScreenshotTransitionTime = (IABScreenshotTransitionTime) C41847B3o.A03(parcel2, cls2);
                String readString4 = parcel2.readString();
                IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant = (IGAdsIABScreenshotVariant) C41847B3o.A03(parcel2, cls2);
                if (parcel2.readInt() != 0) {
                    bool2 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                return new IGAdsIABScreenshotDataDictImpl(iABScreenshotEffectOnUserAction, iABScreenshotTransitionTime, iGAdsIABScreenshotVariant, bool2, valueOf4, A0B3, A0B4, A0B5, readString4, parcel2.readString());
            case 6:
                0qQ.A0B(parcel2, 0);
                return IGAdsIABScreenshotVariant.values()[parcel2.readInt()];
            case 7:
                0qQ.A0B(parcel2, 0);
                return IGAdsRrFormatEnum.values()[parcel2.readInt()];
            case 8:
                0qQ.A0B(parcel2, 0);
                return IGAdsTrustInfoTypeEnum.values()[parcel2.readInt()];
            case 9:
                0qQ.A0B(parcel2, 0);
                return IGBWPExperienceTypes.values()[parcel2.readInt()];
            case 10:
                String A1D3 = C41848B3p.A1D(parcel2);
                Integer num2 = null;
                if (parcel2.readInt() == 0) {
                    A123 = null;
                } else {
                    A123 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    num2 = C41847B3o.A12(parcel2);
                }
                return new IGBWPIABPostClickDataExtensionDictImpl((IGBWPExperienceTypes) C41847B3o.A03(parcel2, IGBWPIABPostClickDataExtensionDictImpl.class), A123, num2, A1D3, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 11:
                0qQ.A0B(parcel2, 0);
                return IGBuyWithPrimeExperienceTypes.values()[parcel2.readInt()];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                String A1D4 = C41848B3p.A1D(parcel2);
                if (parcel2.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                return new IGCTATextVariantImpl((IGCTATextVariantSource) C41847B3o.A03(parcel2, IGCTATextVariantImpl.class), valueOf5, A1D4, parcel2.readString());
            case 13:
                0qQ.A0B(parcel2, 0);
                return IGCTATextVariantSource.values()[parcel2.readInt()];
            case 14:
                0qQ.A0B(parcel2, 0);
                return IGClickToMessagingCardTypeEnum.values()[parcel2.readInt()];
            case 15:
                return new IGCommentSheetMoreInfoImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case 16:
                0qQ.A0B(parcel2, 0);
                return IGCreatorIncentiveProgram.values()[parcel2.readInt()];
            case 17:
                0qQ.A0B(parcel2, 0);
                return IGCreatorIncentiveProgramFetchEntryPoint.values()[parcel2.readInt()];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new IGLeadGenSubheaderTrustSignalDataDictImpl(C41848B3p.A1D(parcel2));
            case 19:
                0qQ.A0B(parcel2, 0);
                return IGLiveFriendChatGuestStatus.values()[parcel2.readInt()];
            case 20:
                0qQ.A0B(parcel2, 0);
                return IGLiveGameStatus.values()[parcel2.readInt()];
            case 21:
                0qQ.A0B(parcel2, 0);
                return IGLiveGames.values()[parcel2.readInt()];
            case 22:
                return new IGLocalEventDictImpl((EventVisibilityType) C41847B3o.A03(parcel2, IGLocalEventDictImpl.class), C41848B3p.A1D(parcel2));
            case 23:
                0qQ.A0B(parcel2, 0);
                return IGMusicArtistPinningErrorType.values()[parcel2.readInt()];
            case 24:
                0qQ.A0B(parcel2, 0);
                return IGNativeSmartTextOverlayFontStyleEnum.values()[parcel2.readInt()];
            case 25:
                0qQ.A0B(parcel2, 0);
                return IGNativeSmartTextOverlayStylingAlignment.values()[parcel2.readInt()];
            case 26:
                0qQ.A0B(parcel2, 0);
                return IGNativeSmartTextOverlayStylingFontStyle.values()[parcel2.readInt()];
            case 27:
                0qQ.A0B(parcel2, 0);
                return IGNativeSmartTextOverlayTextAlignmentEnum.values()[parcel2.readInt()];
            case 28:
                return new IGProjectPortalInfoDictImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                if (C41848B3p.A00(parcel2) == 0) {
                    A0v = null;
                } else {
                    int readInt2 = parcel2.readInt();
                    A0v = DbS.A0v(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        C41848B3p.A1J(parcel2, IGRFSurveyContextDictImpl.class, A0v);
                    }
                }
                return new IGRFSurveyContextDictImpl(A0v, parcel2.readString());
            case 30:
                return new IGRFSurveyContextMappingDictImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case 31:
                0qQ.A0B(parcel2, 0);
                return new IGRFSurveyInfoDictImpl((IGRFSurveyContextDict) C41847B3o.A03(parcel2, IGRFSurveyInfoDictImpl.class));
            case 32:
                0qQ.A0B(parcel2, 0);
                return IGRevShareProductType.values()[parcel2.readInt()];
            case 33:
                0qQ.A0B(parcel2, 0);
                return INLINE_SURVEY_QUESTION_TYPES.values()[parcel2.readInt()];
            case 34:
                0qQ.A0B(parcel2, 0);
                return ISOCountryCode.values()[parcel2.readInt()];
            case 35:
                0qQ.A0B(parcel2, 0);
                return IgUserRelatedAccountTypeEnum.values()[parcel2.readInt()];
            case 36:
                return new ImageURIDictImpl(C41848B3p.A1D(parcel2));
            case 37:
                Integer num3 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    A124 = null;
                } else {
                    A124 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() == 0) {
                    A125 = null;
                } else {
                    A125 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    num3 = C41847B3o.A12(parcel2);
                }
                return new InlineStyleAtRangeDict(A124, A125, num3);
            case 38:
                0qQ.A0B(parcel2, 0);
                return InspirationSignalType.values()[parcel2.readInt()];
            case 39:
                0qQ.A0B(parcel2, 0);
                return InstagramMediaProductType.values()[parcel2.readInt()];
            case 40:
                0qQ.A0B(parcel2, 0);
                return InstagramMidcardType.values()[parcel2.readInt()];
            case Seq.NULL_REFNUM:
                0qQ.A0B(parcel2, 0);
                return InstagramProductTaggabilityState.values()[parcel2.readInt()];
            case Seq.RefTracker.REF_OFFSET:
                0qQ.A0B(parcel2, 0);
                return InstagramProfileCallToActionDestinations.values()[parcel2.readInt()];
            case 43:
                0qQ.A0B(parcel2, 0);
                return InstapalCharacterType.values()[parcel2.readInt()];
            case 44:
                0qQ.A0B(parcel2, 0);
                return IntegrityInterstitialType.values()[parcel2.readInt()];
            case 45:
                0qQ.A0B(parcel2, 0);
                return new IntentAwareAdsFormatInfoImpl((IntentAwareAdsFormatType) C41847B3o.A03(parcel2, IntentAwareAdsFormatInfoImpl.class), parcel2.readString());
            case 46:
                0qQ.A0B(parcel2, 0);
                return InterestPivotRedirect.values()[parcel2.readInt()];
            case 47:
                0qQ.A0B(parcel2, 0);
                return LeadGenEntryPoint.values()[parcel2.readInt()];
            case 48:
                0qQ.A0B(parcel2, 0);
                return LikeVisibilityType.values()[parcel2.readInt()];
            case 49:
                0qQ.A0B(parcel2, 0);
                return LinkAction.values()[parcel2.readInt()];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                0qQ.A0B(parcel2, 0);
                return LinkAttachmentDisallowedReason.values()[parcel2.readInt()];
            case 51:
                0qQ.A0B(parcel2, 0);
                return LinkStickerType.values()[parcel2.readInt()];
            case 52:
                0qQ.A0B(parcel2, 0);
                return LinkType.values()[parcel2.readInt()];
            case 53:
                return new LinkWithText(C41848B3p.A1D(parcel2), parcel2.readString());
            case 54:
                Integer num4 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                Class<ListeningNowResponseInfo> cls3 = ListeningNowResponseInfo.class;
                ListeningNowState listeningNowState = (ListeningNowState) C41847B3o.A03(parcel2, cls3);
                MusicInfo musicInfo = (MusicInfo) C41847B3o.A03(parcel2, cls3);
                if (parcel2.readInt() != 0) {
                    num4 = C41847B3o.A12(parcel2);
                }
                return new ListeningNowResponseInfo(listeningNowState, musicInfo, valueOf6, num4);
            case 55:
                0qQ.A0B(parcel2, 0);
                return ListeningNowState.values()[parcel2.readInt()];
            case 56:
                if (C41848B3p.A00(parcel2) == 0) {
                    A0v2 = null;
                } else {
                    int readInt3 = parcel2.readInt();
                    A0v2 = DbS.A0v(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        C41848B3p.A1J(parcel2, LiveNoteResponseInfo.class, A0v2);
                    }
                }
                return new LiveNoteResponseInfo(A0v2, parcel2.readLong());
            case 57:
                0qQ.A0B(parcel2, 0);
                return LoadMoreType.values()[parcel2.readInt()];
            case 58:
                return new LocationNoteResponseInfoImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case 59:
                0qQ.A0B(parcel2, 0);
                return LocationTypeaheadType.values()[parcel2.readInt()];
            case 60:
                if (C41848B3p.A00(parcel2) == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                return new LoyaltyToplineInfoDictImpl(parcel2.readString(), valueOf7);
            case 61:
                0qQ.A0B(parcel2, 0);
                return MapListType.values()[parcel2.readInt()];
            case 62:
                0qQ.A0B(parcel2, 0);
                return MediaControlEventSourceEnum.values()[parcel2.readInt()];
            case 63:
                0qQ.A0B(parcel2, 0);
                return MediaControlSurfaceEnum.values()[parcel2.readInt()];
            case 64:
                0qQ.A0B(parcel2, 0);
                return MediaDestinationEnum.values()[parcel2.readInt()];
            case 65:
                0qQ.A0B(parcel2, 0);
                return new MediaIdToBrandSafetyContentBlocklistBitmapMapImpl((BrandSafetyContentBlocklistBitmapQLObj) C41847B3o.A03(parcel2, MediaIdToBrandSafetyContentBlocklistBitmapMapImpl.class), parcel2.readString());
            case 66:
                0qQ.A0B(parcel2, 0);
                return MediaKitVisibility.values()[parcel2.readInt()];
            case 67:
                0qQ.A0B(parcel2, 0);
                return MediaNoticeIcon.values()[parcel2.readInt()];
            case 68:
                0qQ.A0B(parcel2, 0);
                return MediaPromptPrefType.values()[parcel2.readInt()];
            case 69:
                0qQ.A0B(parcel2, 0);
                return MediaTrialGraduationStrategy.values()[parcel2.readInt()];
            case 70:
                0qQ.A0B(parcel2, 0);
                return MediaTrialStatus.values()[parcel2.readInt()];
            case 71:
                0qQ.A0B(parcel2, 0);
                boolean A1X = C41848B3p.A1X(parcel2);
                String readString5 = parcel2.readString();
                Float f = null;
                if (parcel2.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Float.valueOf(parcel2.readFloat());
                }
                User A03 = C41847B3o.A03(parcel2, MediaVCRTappableData.class);
                String readString6 = parcel2.readString();
                String readString7 = parcel2.readString();
                String readString8 = parcel2.readString();
                String readString9 = parcel2.readString();
                String readString10 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    f = Float.valueOf(parcel2.readFloat());
                }
                return new MediaVCRTappableData(A03, valueOf8, f, readString5, readString6, readString7, readString8, readString9, readString10, parcel2.readString(), A1X);
            case 72:
                0qQ.A0B(parcel2, 0);
                return MessagingOffPlatformShareType.values()[parcel2.readInt()];
            case 73:
                0qQ.A0B(parcel2, 0);
                return MetaGalleryAlbumType.values()[parcel2.readInt()];
            case 74:
                0qQ.A0B(parcel2, 0);
                return MetaGalleryNetegoInStoryMediaType.values()[parcel2.readInt()];
            case 75:
                return new MetaPlaceDictImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case 76:
                0qQ.A0B(parcel2, 0);
                return MidCardClipsClickedAction.values()[parcel2.readInt()];
            case 77:
                0qQ.A0B(parcel2, 0);
                return MidCardLayoutType.values()[parcel2.readInt()];
            case 78:
                0qQ.A0B(parcel2, 0);
                return MidCardOverlayType.values()[parcel2.readInt()];
            case 79:
                0qQ.A0B(parcel2, 0);
                return MidCardReelsChainCtaType.values()[parcel2.readInt()];
            case 80:
                0qQ.A0B(parcel2, 0);
                Class<MiniShopColorCustomization> cls4 = MiniShopColorCustomization.class;
                return new MiniShopColorCustomization((MiniShopColorPaletteCustomization) C41847B3o.A03(parcel2, cls4), (MiniShopColorPaletteCustomization) C41847B3o.A03(parcel2, cls4));
            case 81:
                return new MiniShopColorPaletteCustomizationImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case 82:
                0qQ.A0B(parcel2, 0);
                return MiniShopSellerOnboardingStatus.values()[parcel2.readInt()];
            case 83:
                0qQ.A0B(parcel2, 0);
                return ModuleVariant.values()[parcel2.readInt()];
            case 84:
                0qQ.A0B(parcel2, 0);
                return MultiAuthorStoryType.values()[parcel2.readInt()];
            case 85:
                0qQ.A0B(parcel2, 0);
                return MultiProductComponentDestinationType.values()[parcel2.readInt()];
            case 86:
                return new MusicDropStreamingServiceData((MusicDropStreamingServiceEnum) C41847B3o.A03(parcel2, MusicDropStreamingServiceData.class), C41848B3p.A1D(parcel2), parcel2.readString());
            case 87:
                0qQ.A0B(parcel2, 0);
                return MusicDropStreamingServiceEnum.values()[parcel2.readInt()];
            case 88:
                0qQ.A0B(parcel2, 0);
                return MusicDropType.values()[parcel2.readInt()];
            case 89:
                0qQ.A0B(parcel2, 0);
                return MusicPageTabType.values()[parcel2.readInt()];
            case 90:
                return new MusicStatusStyleResponseInfoImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString());
            case 91:
                0qQ.A0B(parcel2, 0);
                return NativeInfoCardCommentLayout.values()[parcel2.readInt()];
            case 92:
                0qQ.A0B(parcel2, 0);
                return NativeInfoCardTextAlignment.values()[parcel2.readInt()];
            case 93:
                boolean z3 = true;
                boolean A1P = AnonymousClass7TF.A1P(C41848B3p.A00(parcel2));
                if (parcel2.readInt() == 0) {
                    z3 = false;
                }
                return new NonDiscInfo(A1P, z3);
            case 94:
                0qQ.A0B(parcel2, 0);
                return NonprofitSelectorSurfaceEnum.values()[parcel2.readInt()];
            case 95:
                0qQ.A0B(parcel2, 0);
                return NoteActivationType.values()[parcel2.readInt()];
            case 96:
                String A1D5 = C41848B3p.A1D(parcel2);
                boolean A1P2 = AnonymousClass7TF.A1P(parcel2.readInt());
                if (parcel2.readInt() == 0) {
                    A126 = null;
                } else {
                    A126 = C41847B3o.A12(parcel2);
                }
                int readInt4 = parcel2.readInt();
                int readInt5 = parcel2.readInt();
                ArrayList A0v3 = DbS.A0v(readInt5);
                for (int i4 = 0; i4 != readInt5; i4++) {
                    C41848B3p.A1J(parcel2, NoteChatResponseInfoImpl.class, A0v3);
                }
                return new NoteChatResponseInfoImpl(A126, A1D5, A0v3, readInt4, A1P2);
            case 97:
                return new NotePogImageDict(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString());
            case 98:
                return new OneTapLinkedProfileInfoImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            default:
                if (C41848B3p.A00(parcel2) == 0) {
                    A127 = null;
                } else {
                    A127 = C41847B3o.A12(parcel2);
                }
                return new OpenDraftGalleryCommandImpl(A127);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new IABScreenshotTransitionTime[i];
            case 1:
                return new IGAdCreativeStory9x16CaptionDataImpl[i];
            case 2:
                return new IGAdProfileProductTabDictImpl[i];
            case 3:
                return new IGAdProfileProductTabFeatureModeEnum[i];
            case 4:
                return new IGAdScreenshotURLDataDictImpl[i];
            case 5:
                return new IGAdsIABScreenshotDataDictImpl[i];
            case 6:
                return new IGAdsIABScreenshotVariant[i];
            case 7:
                return new IGAdsRrFormatEnum[i];
            case 8:
                return new IGAdsTrustInfoTypeEnum[i];
            case 9:
                return new IGBWPExperienceTypes[i];
            case 10:
                return new IGBWPIABPostClickDataExtensionDictImpl[i];
            case 11:
                return new IGBuyWithPrimeExperienceTypes[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new IGCTATextVariantImpl[i];
            case 13:
                return new IGCTATextVariantSource[i];
            case 14:
                return new IGClickToMessagingCardTypeEnum[i];
            case 15:
                return new IGCommentSheetMoreInfoImpl[i];
            case 16:
                return new IGCreatorIncentiveProgram[i];
            case 17:
                return new IGCreatorIncentiveProgramFetchEntryPoint[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new IGLeadGenSubheaderTrustSignalDataDictImpl[i];
            case 19:
                return new IGLiveFriendChatGuestStatus[i];
            case 20:
                return new IGLiveGameStatus[i];
            case 21:
                return new IGLiveGames[i];
            case 22:
                return new IGLocalEventDictImpl[i];
            case 23:
                return new IGMusicArtistPinningErrorType[i];
            case 24:
                return new IGNativeSmartTextOverlayFontStyleEnum[i];
            case 25:
                return new IGNativeSmartTextOverlayStylingAlignment[i];
            case 26:
                return new IGNativeSmartTextOverlayStylingFontStyle[i];
            case 27:
                return new IGNativeSmartTextOverlayTextAlignmentEnum[i];
            case 28:
                return new IGProjectPortalInfoDictImpl[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new IGRFSurveyContextDictImpl[i];
            case 30:
                return new IGRFSurveyContextMappingDictImpl[i];
            case 31:
                return new IGRFSurveyInfoDictImpl[i];
            case 32:
                return new IGRevShareProductType[i];
            case 33:
                return new INLINE_SURVEY_QUESTION_TYPES[i];
            case 34:
                return new ISOCountryCode[i];
            case 35:
                return new IgUserRelatedAccountTypeEnum[i];
            case 36:
                return new ImageURIDictImpl[i];
            case 37:
                return new InlineStyleAtRangeDict[i];
            case 38:
                return new InspirationSignalType[i];
            case 39:
                return new InstagramMediaProductType[i];
            case 40:
                return new InstagramMidcardType[i];
            case Seq.NULL_REFNUM:
                return new InstagramProductTaggabilityState[i];
            case Seq.RefTracker.REF_OFFSET:
                return new InstagramProfileCallToActionDestinations[i];
            case 43:
                return new InstapalCharacterType[i];
            case 44:
                return new IntegrityInterstitialType[i];
            case 45:
                return new IntentAwareAdsFormatInfoImpl[i];
            case 46:
                return new InterestPivotRedirect[i];
            case 47:
                return new LeadGenEntryPoint[i];
            case 48:
                return new LikeVisibilityType[i];
            case 49:
                return new LinkAction[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new LinkAttachmentDisallowedReason[i];
            case 51:
                return new LinkStickerType[i];
            case 52:
                return new LinkType[i];
            case 53:
                return new LinkWithText[i];
            case 54:
                return new ListeningNowResponseInfo[i];
            case 55:
                return new ListeningNowState[i];
            case 56:
                return new LiveNoteResponseInfo[i];
            case 57:
                return new LoadMoreType[i];
            case 58:
                return new LocationNoteResponseInfoImpl[i];
            case 59:
                return new LocationTypeaheadType[i];
            case 60:
                return new LoyaltyToplineInfoDictImpl[i];
            case 61:
                return new MapListType[i];
            case 62:
                return new MediaControlEventSourceEnum[i];
            case 63:
                return new MediaControlSurfaceEnum[i];
            case 64:
                return new MediaDestinationEnum[i];
            case 65:
                return new MediaIdToBrandSafetyContentBlocklistBitmapMapImpl[i];
            case 66:
                return new MediaKitVisibility[i];
            case 67:
                return new MediaNoticeIcon[i];
            case 68:
                return new MediaPromptPrefType[i];
            case 69:
                return new MediaTrialGraduationStrategy[i];
            case 70:
                return new MediaTrialStatus[i];
            case 71:
                return new MediaVCRTappableData[i];
            case 72:
                return new MessagingOffPlatformShareType[i];
            case 73:
                return new MetaGalleryAlbumType[i];
            case 74:
                return new MetaGalleryNetegoInStoryMediaType[i];
            case 75:
                return new MetaPlaceDictImpl[i];
            case 76:
                return new MidCardClipsClickedAction[i];
            case 77:
                return new MidCardLayoutType[i];
            case 78:
                return new MidCardOverlayType[i];
            case 79:
                return new MidCardReelsChainCtaType[i];
            case 80:
                return new MiniShopColorCustomization[i];
            case 81:
                return new MiniShopColorPaletteCustomizationImpl[i];
            case 82:
                return new MiniShopSellerOnboardingStatus[i];
            case 83:
                return new ModuleVariant[i];
            case 84:
                return new MultiAuthorStoryType[i];
            case 85:
                return new MultiProductComponentDestinationType[i];
            case 86:
                return new MusicDropStreamingServiceData[i];
            case 87:
                return new MusicDropStreamingServiceEnum[i];
            case 88:
                return new MusicDropType[i];
            case 89:
                return new MusicPageTabType[i];
            case 90:
                return new MusicStatusStyleResponseInfoImpl[i];
            case 91:
                return new NativeInfoCardCommentLayout[i];
            case 92:
                return new NativeInfoCardTextAlignment[i];
            case 93:
                return new NonDiscInfo[i];
            case 94:
                return new NonprofitSelectorSurfaceEnum[i];
            case 95:
                return new NoteActivationType[i];
            case 96:
                return new NoteChatResponseInfoImpl[i];
            case 97:
                return new NotePogImageDict[i];
            case 98:
                return new OneTapLinkedProfileInfoImpl[i];
            default:
                return new OpenDraftGalleryCommandImpl[i];
        }
    }
}
