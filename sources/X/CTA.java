package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateReshareMediaDict;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateStaticOverlayDict;
import com.instagram.api.schemas.ImmutablePandoStoryThenAndNowStickerDict;
import com.instagram.api.schemas.ImmutablePandoStoryUnlockableStickerData;
import com.instagram.api.schemas.ImmutablePandoStoryUnlockableStickerTappableObject;
import com.instagram.api.schemas.ImmutablePandoSubscriptionStickerDict;
import com.instagram.api.schemas.ImmutablePandoTestimonialDict;
import com.instagram.api.schemas.ImmutablePandoTextAppSearchDiscussionTopic;
import com.instagram.api.schemas.ImmutablePandoTextPostAppUserFediverseInfo;
import com.instagram.api.schemas.ImmutablePandoTextWithEntitiesBlockDict;
import com.instagram.api.schemas.ImmutablePandoTopic;
import com.instagram.api.schemas.ImmutablePandoTrackMetadata;
import com.instagram.api.schemas.ImmutablePandoTrackOrOriginalSoundSchema;
import com.instagram.api.schemas.ImmutablePandoUntaggableReason;
import com.instagram.api.schemas.ImmutablePandoUserBannerInlineOtherProfileDict;
import com.instagram.api.schemas.ImmutablePandoUserRelatedAccountsInfoDict;
import com.instagram.api.schemas.ImmutablePandoUserTagInfoDict;
import com.instagram.api.schemas.ImmutablePandoVisualSearchSuggestedProductContainer;
import com.instagram.api.schemas.ImmutablePandoWhatsAppAttributionInfo;
import com.instagram.api.schemas.ImmutablePandoWordOffset;
import com.instagram.api.schemas.ImmutablePandoWorldLocationPagesInfo;
import com.instagram.api.schemas.ImmutablePandoXDTMetaAIMediaSuggestedPromptInfo;
import com.instagram.api.schemas.ImmutablePandoXpostOriginalSoundFBCreatorInfo;
import com.instagram.clips.model.metadata.ImmutablePandoClipsContextualHighlightInfo;
import com.instagram.common.textwithentities.model.ImmutablePandoTextWithEntities;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.feed.audio.ImmutablePandoAudio;
import com.instagram.feed.media.ImmutablePandoCameraToolInfo;
import com.instagram.feed.media.ImmutablePandoCreativeConfig;
import com.instagram.feed.media.ImmutablePandoEffectActionSheet;
import com.instagram.feed.media.ImmutablePandoEffectPreview;
import com.instagram.feed.media.ImmutablePandoReelCTA;
import com.instagram.leadgen.core.api.ImmutablePandoLeadForm;
import com.instagram.leadgen.core.api.ImmutablePandoLeadGenInfoFieldData;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import com.instagram.model.hashtag.ImmutablePandoHashtag;
import com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo;
import com.instagram.model.payments.ImmutablePandoCurrencyAmountInfo;
import com.instagram.model.payments.ImmutablePandoDeliveryWindowInfo;
import com.instagram.model.shopping.ImmutablePandoEffectThumbnailImageDict;
import com.instagram.model.shopping.ImmutablePandoProductArEffectMetadata;
import com.instagram.model.shopping.ImmutablePandoProductItemWithAR;
import com.instagram.model.shopping.ImmutablePandoProductTagDict;
import com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingCTABar;
import com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingInfo;
import com.instagram.model.shopping.clips.ImmutablePandoIGTVShoppingInfo;
import com.instagram.model.shopping.drops.ImmutablePandoDropsLaunchAnimation;
import com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentiveDetail;
import com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoShippingAndReturnsMetadata;
import com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionCover;
import com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionDropsMetadata;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productlaunchinformation.ImmutablePandoProductLaunchInformation;
import com.instagram.model.shopping.reels.ImmutablePandoMultiProductSticker;
import com.instagram.model.shopping.reels.ImmutablePandoProductCollectionLink;
import com.instagram.model.shopping.reels.ImmutablePandoProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ImmutablePandoProductSticker;
import com.instagram.model.shopping.reels.ImmutablePandoProfileShopLink;
import com.instagram.model.shopping.reels.ImmutablePandoReelMultiProductLink;
import com.instagram.model.shopping.reels.ImmutablePandoReelProductLink;
import com.instagram.model.shopping.reels.ImmutablePandoShoppingDestinationMetadata;
import com.instagram.model.shopping.reels.ImmutablePandoShoppingIncentiveMetadata;
import com.instagram.model.showreel.ImmutablePandoIgShowreelComposition;
import com.instagram.model.showreel.ImmutablePandoIgShowreelCompositionAssetInfo;
import com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation;
import com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAsset;
import com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia;
import com.instagram.model.venue.ImmutablePandoLocationDict;
import com.instagram.music.common.model.ImmutablePandoMusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.question.model.ImmutablePandoMusicQuestionResponseModel;
import com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel;
import com.instagram.reels.question.model.ImmutablePandoQuestionResponsesModel;
import com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel;
import com.instagram.shopping.model.taggingfeed.ImmutablePandoProductCollectionFeedTaggingMeta;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsBizBadgeInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsCTATrustInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsTextTrustInfo;
import com.instagram.user.model.ImmutablePandoCreatorShoppingInfo;
import com.instagram.user.model.ImmutablePandoProductCollection;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ImmutablePandoProductWrapper;
import com.instagram.user.model.ImmutablePandoScheduledLiveProductsMetadata;
import com.instagram.user.model.ImmutablePandoUnavailableProduct;
import com.instagram.user.model.ImmutablePandoUpcomingDropCampaignEventMetadata;
import com.instagram.user.model.ImmutablePandoUpcomingEvent;
import com.instagram.user.model.ImmutablePandoUpcomingEventLiveMetadata;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class CTA extends C3035269k {
    public final int A00;

    public CTA(int i) {
        this.A00 = i;
    }

    public static CTA A00(int i) {
        return new CTA(i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ImmutablePandoStoryTemplateReshareMediaDict[i];
            case 1:
                return new ImmutablePandoStoryTemplateStaticOverlayDict[i];
            case 2:
                return new ImmutablePandoStoryThenAndNowStickerDict[i];
            case 3:
                return new ImmutablePandoStoryUnlockableStickerData[i];
            case 4:
                return new ImmutablePandoStoryUnlockableStickerTappableObject[i];
            case 5:
                return new ImmutablePandoSubscriptionStickerDict[i];
            case 6:
                return new ImmutablePandoTestimonialDict[i];
            case 7:
                return new ImmutablePandoTextAppSearchDiscussionTopic[i];
            case 8:
                return new ImmutablePandoTextPostAppUserFediverseInfo[i];
            case 9:
                return new ImmutablePandoTextWithEntitiesBlockDict[i];
            case 10:
                return new ImmutablePandoTopic[i];
            case 11:
                return new ImmutablePandoTrackMetadata[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new ImmutablePandoTrackOrOriginalSoundSchema[i];
            case 13:
                return new ImmutablePandoUntaggableReason[i];
            case 14:
                return new ImmutablePandoUserBannerInlineOtherProfileDict[i];
            case 15:
                return new ImmutablePandoUserRelatedAccountsInfoDict[i];
            case 16:
                return new ImmutablePandoUserTagInfoDict[i];
            case 17:
                return new ImmutablePandoVisualSearchSuggestedProductContainer[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new ImmutablePandoWhatsAppAttributionInfo[i];
            case 19:
                return new ImmutablePandoWordOffset[i];
            case 20:
                return new ImmutablePandoWorldLocationPagesInfo[i];
            case 21:
                return new ImmutablePandoXDTMetaAIMediaSuggestedPromptInfo[i];
            case 22:
                return new ImmutablePandoXpostOriginalSoundFBCreatorInfo[i];
            case 23:
                return new ImmutablePandoClipsContextualHighlightInfo[i];
            case 24:
                return new ImmutablePandoTextWithEntities[i];
            case 25:
                return new ImmutablePandoAudio[i];
            case 26:
                return new ImmutablePandoCameraToolInfo[i];
            case 27:
                return new ImmutablePandoCreativeConfig[i];
            case 28:
                return new ImmutablePandoEffectActionSheet[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new ImmutablePandoEffectPreview[i];
            case 30:
                return new ImmutablePandoReelCTA[i];
            case 31:
                return new ImmutablePandoLeadForm[i];
            case 32:
                return new ImmutablePandoLeadGenInfoFieldData[i];
            case 33:
                return new ImmutablePandoAndroidLink[i];
            case 34:
                return new ImmutablePandoHashtag[i];
            case 35:
                return new ImmutablePandoSpritesheetInfo[i];
            case 36:
                return new ImmutablePandoCurrencyAmountInfo[i];
            case 37:
                return new ImmutablePandoDeliveryWindowInfo[i];
            case 38:
                return new ImmutablePandoEffectThumbnailImageDict[i];
            case 39:
                return new ImmutablePandoProductArEffectMetadata[i];
            case 40:
                return new ImmutablePandoProductItemWithAR[i];
            case Seq.NULL_REFNUM:
                return new ImmutablePandoProductTagDict[i];
            case Seq.RefTracker.REF_OFFSET:
                return new ImmutablePandoClipsShoppingCTABar[i];
            case 43:
                return new ImmutablePandoClipsShoppingInfo[i];
            case 44:
                return new ImmutablePandoIGTVShoppingInfo[i];
            case 45:
                return new ImmutablePandoDropsLaunchAnimation[i];
            case 46:
                return new ImmutablePandoIgFundedIncentive[i];
            case 47:
                return new ImmutablePandoIgFundedIncentiveBannerButton[i];
            case 48:
                return new ImmutablePandoIgFundedIncentiveDetail[i];
            case 49:
                return new ImmutablePandoProductCheckoutProperties[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new ImmutablePandoShippingAndReturnsMetadata[i];
            case 51:
                return new ImmutablePandoProductCollectionCover[i];
            case 52:
                return new ImmutablePandoProductCollectionDropsMetadata[i];
            case 53:
                return new ImmutablePandoProductImageContainer[i];
            case 54:
                return new ImmutablePandoProductLaunchInformation[i];
            case 55:
                return new ImmutablePandoMultiProductSticker[i];
            case 56:
                return new ImmutablePandoProductCollectionLink[i];
            case 57:
                return new ImmutablePandoProductCollectionLinkMetadata[i];
            case 58:
                return new ImmutablePandoProductSticker[i];
            case 59:
                return new ImmutablePandoProfileShopLink[i];
            case 60:
                return new ImmutablePandoReelMultiProductLink[i];
            case 61:
                return new ImmutablePandoReelProductLink[i];
            case 62:
                return new ImmutablePandoShoppingDestinationMetadata[i];
            case 63:
                return new ImmutablePandoShoppingIncentiveMetadata[i];
            case 64:
                return new ImmutablePandoIgShowreelComposition[i];
            case 65:
                return new ImmutablePandoIgShowreelCompositionAssetInfo[i];
            case 66:
                return new ImmutablePandoIgShowreelNativeAnimation[i];
            case 67:
                return new ImmutablePandoIgShowreelNativeAsset[i];
            case 68:
                return new ImmutablePandoUpcomingEventMedia[i];
            case 69:
                return new ImmutablePandoLocationDict[i];
            case 70:
                return new ImmutablePandoMusicOverlayStickerModel[i];
            case 71:
                return new ImmutablePandoMusicQuestionResponseModel[i];
            case 72:
                return new ImmutablePandoQuestionResponseModel[i];
            case 73:
                return new ImmutablePandoQuestionResponsesModel[i];
            case 74:
                return new ImmutablePandoQuestionMediaResponseModel[i];
            case 75:
                return new ImmutablePandoProductCollectionFeedTaggingMeta[i];
            case 76:
                return new ImmutablePandoAdsBizBadgeInfo[i];
            case 77:
                return new ImmutablePandoAdsCTATrustInfo[i];
            case 78:
                return new ImmutablePandoAdsIAWRatingInfo[i];
            case 79:
                return new ImmutablePandoAdsRatingInfo[i];
            case 80:
                return new ImmutablePandoAdsTextTrustInfo[i];
            case 81:
                return new ImmutablePandoCreatorShoppingInfo[i];
            case 82:
                return new ImmutablePandoProductCollection[i];
            case 83:
                return new ImmutablePandoProductDetailsProductItemDict[i];
            case 84:
                return new ImmutablePandoProductWrapper[i];
            case 85:
                return new ImmutablePandoScheduledLiveProductsMetadata[i];
            case 86:
                return new ImmutablePandoUnavailableProduct[i];
            case 87:
                return new ImmutablePandoUpcomingDropCampaignEventMetadata[i];
            case 88:
                return new ImmutablePandoUpcomingEvent[i];
            default:
                return new ImmutablePandoUpcomingEventLiveMetadata[i];
        }
    }
}
