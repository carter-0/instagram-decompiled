package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.CreditCardAssociation;
import com.instagram.api.schemas.Entity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.FundingSourceType;
import com.instagram.api.schemas.MusicStatusStyleResponseInfo;
import com.instagram.api.schemas.OpenInspirationHubCommandImpl;
import com.instagram.api.schemas.OriginalityFollowButtonInfo;
import com.instagram.api.schemas.OriginalityFollowButtonInfoImpl;
import com.instagram.api.schemas.OriginalityInfoImpl;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import com.instagram.api.schemas.OriginalitySourceMediaInfoImpl;
import com.instagram.api.schemas.OverlayAdTapDestinationEnum;
import com.instagram.api.schemas.OverlayAdsFormatEnum;
import com.instagram.api.schemas.OverlayAdsTextStyleEnum;
import com.instagram.api.schemas.PartnerProgramOnboardingSteps;
import com.instagram.api.schemas.PartnerTypes;
import com.instagram.api.schemas.PaymentCredentialTypeEnum;
import com.instagram.api.schemas.PaymentInfo;
import com.instagram.api.schemas.PaymentMethod;
import com.instagram.api.schemas.PaymentMethodImpl;
import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import com.instagram.api.schemas.PermalinkItemType;
import com.instagram.api.schemas.Phrase;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadataImpl;
import com.instagram.api.schemas.PresenceAudience;
import com.instagram.api.schemas.ProductAffiliateInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelInformationDictImpl;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.api.schemas.ProductDetailsSellerBadgeContent;
import com.instagram.api.schemas.ProductDetailsSellerBadgeContentImpl;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.api.schemas.ProductDiscountsDictImpl;
import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.ProductMediaType;
import com.instagram.api.schemas.ProductPivotsButtonActionType;
import com.instagram.api.schemas.ProductPivotsButtonImpl;
import com.instagram.api.schemas.ProductPivotsSourceMediaType;
import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import com.instagram.api.schemas.ProductTileBannerMetadataDecorationImpl;
import com.instagram.api.schemas.ProductTileBannerType;
import com.instagram.api.schemas.ProductTileContext;
import com.instagram.api.schemas.ProductTileContextImpl;
import com.instagram.api.schemas.ProductTileContextMetadata;
import com.instagram.api.schemas.ProductTileContextMetadataImpl;
import com.instagram.api.schemas.ProductTileContextVariant;
import com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptions;
import com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileLabelImpl;
import com.instagram.api.schemas.ProductTileLabelType;
import com.instagram.api.schemas.ProductTileLayoutContent;
import com.instagram.api.schemas.ProductTileLayoutContentImpl;
import com.instagram.api.schemas.ProductTileMetadataDecorations;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import com.instagram.api.schemas.ProductTileMetadataDestination;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTilePriceLabelOptions;
import com.instagram.api.schemas.ProductTilePriceLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileProductNameLabelOptions;
import com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileTextColorType;
import com.instagram.api.schemas.ProductTileTextStyleType;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.ProductVariantPossibleValueDict;
import com.instagram.api.schemas.ProductWithMediaImageImpl;
import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.api.schemas.ProfileThemeImpl;
import com.instagram.api.schemas.ProfileThemeType;
import com.instagram.api.schemas.PromoteUnavailableReason;
import com.instagram.api.schemas.PromptFirstMediaType;
import com.instagram.api.schemas.PublisherPlatform;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import com.instagram.api.schemas.RIXUCoverCTAPosition;
import com.instagram.api.schemas.RIXUCoverElementMetadataType;
import com.instagram.api.schemas.RIXUCoverPreviewType;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.api.schemas.RIXUTextLinkImpl;
import com.instagram.api.schemas.Range;
import com.instagram.api.schemas.RankingAlgorithm;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.api.schemas.ReelsMediaInteractivityType;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfoImpl;
import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.SellerBadgeSurfaces;
import com.instagram.api.schemas.SellerBadgeType;
import com.instagram.api.schemas.SettingId;
import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import com.instagram.api.schemas.ShoppingBrandWithProductsSubtitle;
import com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles;
import com.instagram.api.schemas.ShoppingPivotItemType;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.api.schemas.SoundPlatformProduct;
import com.instagram.api.schemas.StatusResponseImpl;
import com.instagram.api.schemas.StatusStyle;
import com.instagram.api.schemas.StatusStyleResponseInfo;
import com.instagram.api.schemas.StatusStyleResponseInfoImpl;
import com.instagram.api.schemas.StatusType;
import com.instagram.api.schemas.StickerPack;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;
import com.instagram.api.schemas.StoryEmojisEntryAnimationType;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryMultiProductStickerLinkDataImpl;
import com.instagram.api.schemas.StoryMusicPickAggregationVisibility;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDictImpl;
import com.instagram.api.schemas.StoryPromptParticipationFrictionType;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.XDTCreatorInspirationHubType;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.ProductDetailsProductItemDict;
import go.Seq;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

public final class DE6 implements Parcelable.Creator {
    public final int A00;

    public DE6(int i) {
        this.A00 = i;
    }

    public static DE6 A00(int i) {
        return new DE6(i);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Boolean valueOf2;
        Integer A12;
        Integer A122;
        Integer A123;
        ArrayList arrayList;
        Boolean valueOf3;
        Integer A124;
        Integer A125;
        Float valueOf4;
        Boolean valueOf5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Integer A126;
        Integer A127;
        Integer A128;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                0qQ.A0B(parcel2, 0);
                return new OpenInspirationHubCommandImpl((XDTCreatorInspirationHubType) C41847B3o.A03(parcel2, OpenInspirationHubCommandImpl.class));
            case 1:
                boolean z = true;
                Boolean bool = null;
                if (C41848B3p.A00(parcel2) == 0) {
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
                return new OriginalityFollowButtonInfoImpl(valueOf, bool);
            case 2:
                if (C41848B3p.A00(parcel2) == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                Class<OriginalityInfoImpl> cls = OriginalityInfoImpl.class;
                return new OriginalityInfoImpl((OriginalityFollowButtonInfo) C41847B3o.A03(parcel2, cls), (OriginalitySourceMediaInfo) C41847B3o.A03(parcel2, cls), valueOf2);
            case 3:
                return new OriginalitySourceMediaInfoImpl(C41847B3o.A03(parcel2, OriginalitySourceMediaInfoImpl.class), C41848B3p.A1D(parcel2));
            case 4:
                0qQ.A0B(parcel2, 0);
                return OverlayAdTapDestinationEnum.values()[parcel2.readInt()];
            case 5:
                0qQ.A0B(parcel2, 0);
                return OverlayAdsFormatEnum.values()[parcel2.readInt()];
            case 6:
                0qQ.A0B(parcel2, 0);
                return OverlayAdsTextStyleEnum.values()[parcel2.readInt()];
            case 7:
                0qQ.A0B(parcel2, 0);
                return PartnerProgramOnboardingSteps.values()[parcel2.readInt()];
            case 8:
                0qQ.A0B(parcel2, 0);
                return PartnerTypes.values()[parcel2.readInt()];
            case 9:
                0qQ.A0B(parcel2, 0);
                return PaymentCredentialTypeEnum.values()[parcel2.readInt()];
            case 10:
                Integer num = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    A12 = null;
                } else {
                    A12 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    num = C41847B3o.A12(parcel2);
                }
                return new PaymentInfo((PaymentMethod) C41847B3o.A03(parcel2, PaymentInfo.class), A12, num, parcel2.readString(), C41848B3p.A1X(parcel2));
            case 11:
                0qQ.A0B(parcel2, 0);
                Class<PaymentMethodImpl> cls2 = PaymentMethodImpl.class;
                return new PaymentMethodImpl((CreditCardAssociation) C41847B3o.A03(parcel2, cls2), (FundingSourceType) C41847B3o.A03(parcel2, cls2), parcel2.readString(), parcel2.readString());
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                0qQ.A0B(parcel2, 0);
                return PendingShareToFriendsStoryBadgePreviewState.values()[parcel2.readInt()];
            case 13:
                0qQ.A0B(parcel2, 0);
                return PermalinkItemType.values()[parcel2.readInt()];
            case 14:
                ArrayList arrayList4 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    A122 = null;
                } else {
                    A122 = C41847B3o.A12(parcel2);
                }
                String readString = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    A123 = null;
                } else {
                    A123 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    int readInt = parcel2.readInt();
                    arrayList4 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        C41848B3p.A1J(parcel2, Phrase.class, arrayList4);
                    }
                }
                return new Phrase(A122, A123, readString, arrayList4);
            case 15:
                return new PopularReelWithFollowersInsightMetadataImpl(parcel2.createStringArrayList(), C41848B3p.A00(parcel2), parcel2.readInt(), parcel2.readInt());
            case 16:
                0qQ.A0B(parcel2, 0);
                return PresenceAudience.values()[parcel2.readInt()];
            case 17:
                return new ProductAffiliateInformationDictImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new ProductArtsLabelInformationDictImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case 19:
                0qQ.A0B(parcel2, 0);
                return ProductCardSubtitleType.values()[parcel2.readInt()];
            case 20:
                0qQ.A0B(parcel2, 0);
                return ProductCollectionV2Type.values()[parcel2.readInt()];
            case 21:
                return new ProductDetailsSellerBadgeContentImpl(C41848B3p.A1D(parcel2), parcel2.readString());
            case 22:
                return new ProductDiscountInformationDictImpl(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 23:
                if (C41848B3p.A00(parcel2) == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel2.readInt();
                    arrayList = new ArrayList(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        C41848B3p.A1J(parcel2, ProductDiscountsDictImpl.class, arrayList);
                    }
                }
                return new ProductDiscountsDictImpl(arrayList);
            case 24:
                0qQ.A0B(parcel2, 0);
                return ProductItemStickerBundleStyle.values()[parcel2.readInt()];
            case 25:
                0qQ.A0B(parcel2, 0);
                return ProductMediaType.values()[parcel2.readInt()];
            case 26:
                0qQ.A0B(parcel2, 0);
                return ProductPivotsButtonActionType.values()[parcel2.readInt()];
            case 27:
                0qQ.A0B(parcel2, 0);
                Class<ProductPivotsButtonImpl> cls3 = ProductPivotsButtonImpl.class;
                return new ProductPivotsButtonImpl((ProductPivotsButtonActionType) C41847B3o.A03(parcel2, cls3), (ProductPivotsButtonActionType) C41847B3o.A03(parcel2, cls3), C41847B3o.A03(parcel2, cls3), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 28:
                0qQ.A0B(parcel2, 0);
                return ProductPivotsSourceMediaType.values()[parcel2.readInt()];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                0qQ.A0B(parcel2, 0);
                return ProductTaggingFeedComponentType.values()[parcel2.readInt()];
            case 30:
                return new ProductTileBannerMetadataDecorationImpl((ProductTileBannerType) C41847B3o.A03(parcel2, ProductTileBannerMetadataDecorationImpl.class), C41848B3p.A1D(parcel2));
            case 31:
                0qQ.A0B(parcel2, 0);
                return ProductTileBannerType.values()[parcel2.readInt()];
            case 32:
                0qQ.A0B(parcel2, 0);
                Class<ProductTileContextImpl> cls4 = ProductTileContextImpl.class;
                return new ProductTileContextImpl((ProductTileContextMetadata) C41847B3o.A03(parcel2, cls4), (ProductTileContextVariant) C41847B3o.A03(parcel2, cls4), parcel2.readString());
            case 33:
                int A002 = C41848B3p.A00(parcel2);
                ArrayList arrayList5 = new ArrayList(A002);
                for (int i3 = 0; i3 != A002; i3++) {
                    C41848B3p.A1J(parcel2, ProductTileContextMetadataImpl.class, arrayList5);
                }
                return new ProductTileContextMetadataImpl(arrayList5);
            case 34:
                0qQ.A0B(parcel2, 0);
                return ProductTileContextVariant.values()[parcel2.readInt()];
            case 35:
                return new ProductTileFeaturedProductPermissionInfoLabelOptionsImpl((ProductTileTextStyleType) C41847B3o.A03(parcel2, ProductTileFeaturedProductPermissionInfoLabelOptionsImpl.class), C41848B3p.A1D(parcel2));
            case 36:
                0qQ.A0B(parcel2, 0);
                Class<ProductTileLabelImpl> cls5 = ProductTileLabelImpl.class;
                return new ProductTileLabelImpl((ProductTileLabelType) C41847B3o.A03(parcel2, cls5), (ProductTileLayoutContent) C41847B3o.A03(parcel2, cls5));
            case 37:
                0qQ.A0B(parcel2, 0);
                return ProductTileLabelType.values()[parcel2.readInt()];
            case 38:
                0qQ.A0B(parcel2, 0);
                Class<ProductTileLayoutContentImpl> cls6 = ProductTileLayoutContentImpl.class;
                return new ProductTileLayoutContentImpl((ProductTileFeaturedProductPermissionInfoLabelOptions) C41847B3o.A03(parcel2, cls6), (ProductTilePriceLabelOptions) C41847B3o.A03(parcel2, cls6), (ProductTileProductNameLabelOptions) C41847B3o.A03(parcel2, cls6));
            case 39:
                int A003 = C41848B3p.A00(parcel2);
                ArrayList arrayList6 = new ArrayList(A003);
                int i4 = 0;
                while (true) {
                    Class<ProductTileMetadataDecorationsImpl> cls7 = ProductTileMetadataDecorationsImpl.class;
                    if (i4 != A003) {
                        C41848B3p.A1J(parcel2, cls7, arrayList6);
                        i4++;
                    } else {
                        ProductTileContext productTileContext = (ProductTileContext) C41847B3o.A03(parcel2, cls7);
                        boolean A1X = C41848B3p.A1X(parcel2);
                        boolean A1X2 = C41848B3p.A1X(parcel2);
                        if (parcel2.readInt() == 0) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                        }
                        return new ProductTileMetadataDecorationsImpl(productTileContext, valueOf3, arrayList6, A1X, A1X2, C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2));
                    }
                }
            case 40:
                0qQ.A0B(parcel2, 0);
                return ProductTileMetadataDestination.values()[parcel2.readInt()];
            case Seq.NULL_REFNUM:
                0qQ.A0B(parcel2, 0);
                Class<ProductTileMetadataImpl> cls8 = ProductTileMetadataImpl.class;
                ProductTileMetadataDecorations productTileMetadataDecorations = (ProductTileMetadataDecorations) C41847B3o.A03(parcel2, cls8);
                ProductTileMetadataDestination productTileMetadataDestination = (ProductTileMetadataDestination) C41847B3o.A03(parcel2, cls8);
                int readInt3 = parcel2.readInt();
                ArrayList arrayList7 = new ArrayList(readInt3);
                for (int i5 = 0; i5 != readInt3; i5++) {
                    C41848B3p.A1J(parcel2, cls8, arrayList7);
                }
                return new ProductTileMetadataImpl(productTileMetadataDecorations, productTileMetadataDestination, arrayList7);
            case Seq.RefTracker.REF_OFFSET:
                boolean z2 = true;
                boolean A1P = AnonymousClass7TF.A1P(C41848B3p.A00(parcel2));
                boolean A1X3 = C41848B3p.A1X(parcel2);
                if (parcel2.readInt() == 0) {
                    z2 = false;
                }
                return new ProductTilePriceLabelOptionsImpl(A1P, A1X3, z2);
            case 43:
                0qQ.A0B(parcel2, 0);
                return new ProductTileProductImpl((FBProductItemDetailsDict) C41847B3o.A03(parcel2, ProductTileProductImpl.class));
            case 44:
                return new ProductTileProductNameLabelOptionsImpl(C41848B3p.A00(parcel2), C41848B3p.A1X(parcel2));
            case 45:
                0qQ.A0B(parcel2, 0);
                return ProductTileTextColorType.values()[parcel2.readInt()];
            case 46:
                0qQ.A0B(parcel2, 0);
                return ProductTileTextStyleType.values()[parcel2.readInt()];
            case 47:
                return new ProductTileUCILoggingInfoImpl(parcel2.readLong(), C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readLong());
            case 48:
                return new ProductVariantPossibleValueDict((ProductVariantVisualStyle) C41847B3o.A03(parcel2, ProductVariantPossibleValueDict.class), C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), C41848B3p.A1X(parcel2));
            case 49:
                0qQ.A0B(parcel2, 0);
                return new ProductWithMediaImageImpl((ProductDetailsProductItemDict) C41847B3o.A03(parcel2, ProductWithMediaImageImpl.class));
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                0qQ.A0B(parcel2, 0);
                return ProfileGridItemTypeEnum.values()[parcel2.readInt()];
            case 51:
                return new ProfileThemeImpl((ProfileThemeType) C41847B3o.A03(parcel2, ProfileThemeImpl.class), C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.createStringArrayList());
            case 52:
                0qQ.A0B(parcel2, 0);
                return ProfileThemeType.values()[parcel2.readInt()];
            case 53:
                0qQ.A0B(parcel2, 0);
                return PromoteUnavailableReason.values()[parcel2.readInt()];
            case 54:
                0qQ.A0B(parcel2, 0);
                return PromptFirstMediaType.values()[parcel2.readInt()];
            case 55:
                0qQ.A0B(parcel2, 0);
                return PublisherPlatform.values()[parcel2.readInt()];
            case 56:
                0qQ.A0B(parcel2, 0);
                return REPETITION_UI_TYPE.values()[parcel2.readInt()];
            case 57:
                0qQ.A0B(parcel2, 0);
                return RIXUCoverCTAPosition.values()[parcel2.readInt()];
            case 58:
                0qQ.A0B(parcel2, 0);
                return RIXUCoverElementMetadataType.values()[parcel2.readInt()];
            case 59:
                0qQ.A0B(parcel2, 0);
                return RIXUCoverPreviewType.values()[parcel2.readInt()];
            case 60:
                0qQ.A0B(parcel2, 0);
                return RIXUCoverSize.values()[parcel2.readInt()];
            case 61:
                Integer num2 = null;
                if (C41848B3p.A00(parcel2) == 0) {
                    A124 = null;
                } else {
                    A124 = C41847B3o.A12(parcel2);
                }
                String readString2 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num2 = C41847B3o.A12(parcel2);
                }
                return new RIXUTextLinkImpl(A124, num2, readString2, parcel2.readString());
            case 62:
                0qQ.A0B(parcel2, 0);
                Entity entity = (Entity) C41847B3o.A03(parcel2, Range.class);
                Integer num3 = null;
                if (parcel2.readInt() == 0) {
                    A125 = null;
                } else {
                    A125 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    num3 = C41847B3o.A12(parcel2);
                }
                return new Range(entity, A125, num3);
            case 63:
                0qQ.A0B(parcel2, 0);
                return RankingAlgorithm.values()[parcel2.readInt()];
            case 64:
                return new RankingInfo(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString());
            case 65:
                0qQ.A0B(parcel2, 0);
                return ReelTappableObjectType.values()[parcel2.readInt()];
            case 66:
                0qQ.A0B(parcel2, 0);
                return ReelsMediaInteractivityType.values()[parcel2.readInt()];
            case 67:
                0qQ.A0B(parcel2, 0);
                return RemoteBooleanSettingId.values()[parcel2.readInt()];
            case 68:
                0qQ.A0B(parcel2, 0);
                return RemoteStringSettingId.values()[parcel2.readInt()];
            case 69:
                0qQ.A0B(parcel2, 0);
                Class<SMBSupportStickerDict> cls9 = SMBSupportStickerDict.class;
                BusinessProfileDict businessProfileDict = (BusinessProfileDict) C41847B3o.A03(parcel2, cls9);
                String readString3 = parcel2.readString();
                String readString4 = parcel2.readString();
                String readString5 = parcel2.readString();
                String readString6 = parcel2.readString();
                String readString7 = parcel2.readString();
                String readString8 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Float.valueOf(parcel2.readFloat());
                }
                return new SMBSupportStickerDict(businessProfileDict, (SMBPartnerType) C41847B3o.A03(parcel2, cls9), valueOf4, readString3, readString4, readString5, readString6, readString7, readString8, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 70:
                return new ScheduledLiveAffiliateInfoImpl(C41848B3p.A1D(parcel2));
            case 71:
                String A1D = C41848B3p.A1D(parcel2);
                if (parcel2.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(C41848B3p.A1X(parcel2));
                }
                return new ScheduledLiveDiscountInfoImpl(A1D, valueOf5);
            case 72:
                String A1D2 = C41848B3p.A1D(parcel2);
                String readString9 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt4 = parcel2.readInt();
                    arrayList2 = new ArrayList(readInt4);
                    for (int i6 = 0; i6 != readInt4; i6++) {
                        C41848B3p.A1J(parcel2, SellerBadgeDict.class, arrayList2);
                    }
                }
                return new SellerBadgeDict((SellerBadgeType) C41847B3o.A03(parcel2, SellerBadgeDict.class), A1D2, readString9, arrayList2);
            case 73:
                0qQ.A0B(parcel2, 0);
                return SellerBadgeSurfaces.values()[parcel2.readInt()];
            case 74:
                0qQ.A0B(parcel2, 0);
                return SellerBadgeType.values()[parcel2.readInt()];
            case 75:
                0qQ.A0B(parcel2, 0);
                return SettingId.values()[parcel2.readInt()];
            case 76:
                String A1D3 = C41848B3p.A1D(parcel2);
                int readInt5 = parcel2.readInt();
                ArrayList arrayList8 = new ArrayList(readInt5);
                for (int i7 = 0; i7 != readInt5; i7++) {
                    C41848B3p.A1J(parcel2, ShoppingBrandWithProductsImpl.class, arrayList8);
                }
                if (parcel2.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt6 = parcel2.readInt();
                    arrayList3 = new ArrayList(readInt6);
                    for (int i8 = 0; i8 != readInt6; i8++) {
                        C41848B3p.A1J(parcel2, ShoppingBrandWithProductsImpl.class, arrayList3);
                    }
                }
                Class<ShoppingBrandWithProductsImpl> cls10 = ShoppingBrandWithProductsImpl.class;
                return new ShoppingBrandWithProductsImpl((ProductDetailsSellerBadgeContent) C41847B3o.A03(parcel2, cls10), (ShoppingBrandWithProductsSubtitle) C41847B3o.A03(parcel2, cls10), C41847B3o.A03(parcel2, cls10), A1D3, arrayList8, arrayList3);
            case 77:
                0qQ.A0B(parcel2, 0);
                return new ShoppingBrandWithProductsSubtitle(C41848B3p.A1X(parcel2), parcel2.readString());
            case 78:
                0qQ.A0B(parcel2, 0);
                return ShoppingIGFundedIncentivesShopAdsBannerStyles.values()[parcel2.readInt()];
            case 79:
                0qQ.A0B(parcel2, 0);
                return ShoppingPivotItemType.values()[parcel2.readInt()];
            case 80:
                0qQ.A0B(parcel2, 0);
                return ShoppingSwipeUpCTATextIcon.values()[parcel2.readInt()];
            case 81:
                0qQ.A0B(parcel2, 0);
                return ShowreelNativeClientName.values()[parcel2.readInt()];
            case 82:
                0qQ.A0B(parcel2, 0);
                return SmartReelType.values()[parcel2.readInt()];
            case 83:
                0qQ.A0B(parcel2, 0);
                return SoundPlatformProduct.values()[parcel2.readInt()];
            case 84:
                String A1D4 = C41848B3p.A1D(parcel2);
                String readString10 = parcel2.readString();
                String readString11 = parcel2.readString();
                String readString12 = parcel2.readString();
                String readString13 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    A126 = null;
                } else {
                    A126 = C41847B3o.A12(parcel2);
                }
                Class<StatusResponseImpl> cls11 = StatusResponseImpl.class;
                return new StatusResponseImpl((StatusStyle) C41847B3o.A03(parcel2, cls11), (StatusStyleResponseInfo) C41847B3o.A03(parcel2, cls11), (StatusType) C41847B3o.A03(parcel2, cls11), A126, A1D4, readString10, readString11, readString12, readString13, parcel2.readString(), parcel2.readString());
            case 85:
                0qQ.A0B(parcel2, 0);
                return StatusStyle.values()[parcel2.readInt()];
            case 86:
                0qQ.A0B(parcel2, 0);
                return new StatusStyleResponseInfoImpl((MusicStatusStyleResponseInfo) C41847B3o.A03(parcel2, StatusStyleResponseInfoImpl.class));
            case 87:
                0qQ.A0B(parcel2, 0);
                return StatusType.values()[parcel2.readInt()];
            case 88:
                0qQ.A0B(parcel2, 0);
                return StickerPack.values()[parcel2.readInt()];
            case 89:
                0qQ.A0B(parcel2, 0);
                return StickerTraySurface.values()[parcel2.readInt()];
            case 90:
                0qQ.A0B(parcel2, 0);
                return StoryAdKeywordStyleEnum.values()[parcel2.readInt()];
            case 91:
                0qQ.A0B(parcel2, 0);
                return StoryAdKeywordTypeEnum.values()[parcel2.readInt()];
            case 92:
                0qQ.A0B(parcel2, 0);
                return StoryEmojisEntryAnimationType.values()[parcel2.readInt()];
            case 93:
                String A1D5 = C41848B3p.A1D(parcel2);
                String readString14 = parcel2.readString();
                int readInt7 = parcel2.readInt();
                ArrayList arrayList9 = new ArrayList(readInt7);
                for (int i9 = 0; i9 != readInt7; i9++) {
                    C41848B3p.A1J(parcel2, StoryGroupMentionTappableData.class, arrayList9);
                }
                if (parcel2.readInt() == 0) {
                    A127 = null;
                } else {
                    A127 = C41847B3o.A12(parcel2);
                }
                return new StoryGroupMentionTappableData(A127, A1D5, readString14, parcel2.readString(), arrayList9);
            case 94:
                0qQ.A0B(parcel2, 0);
                return StoryJoinChatStatus.values()[parcel2.readInt()];
            case 95:
                if (C41848B3p.A00(parcel2) == 0) {
                    A128 = null;
                } else {
                    A128 = C41847B3o.A12(parcel2);
                }
                return new StoryMultiProductStickerLinkDataImpl(A128);
            case 96:
                0qQ.A0B(parcel2, 0);
                return StoryMusicPickAggregationVisibility.values()[parcel2.readInt()];
            case 97:
                0qQ.A0B(parcel2, 0);
                Class<StoryMusicPickTappableData> cls12 = StoryMusicPickTappableData.class;
                TrackData trackData = (TrackData) C41847B3o.A03(parcel2, cls12);
                String readString15 = parcel2.readString();
                StoryPromptDisablementState storyPromptDisablementState = (StoryPromptDisablementState) C41847B3o.A03(parcel2, cls12);
                int readInt8 = parcel2.readInt();
                ArrayList arrayList10 = new ArrayList(readInt8);
                for (int i10 = 0; i10 != readInt8; i10++) {
                    C41848B3p.A1J(parcel2, cls12, arrayList10);
                }
                return new StoryMusicPickTappableData(C41847B3o.A03(parcel2, cls12), storyPromptDisablementState, (StoryTemplateAssetDict) C41847B3o.A03(parcel2, cls12), trackData, readString15, parcel2.readString(), parcel2.readString(), parcel2.readString(), arrayList10, parcel2.readInt());
            case 98:
                0qQ.A0B(parcel2, 0);
                return new StoryProductItemStickerTappableData((ProductItemStickerBundleStyle) C41847B3o.A03(parcel2, StoryProductItemStickerTappableData.class));
            default:
                Class<StoryPromptParticipationFrictionInfoDictImpl> cls13 = StoryPromptParticipationFrictionInfoDictImpl.class;
                return new StoryPromptParticipationFrictionInfoDictImpl((StoryLinkInfoDict) C41847B3o.A03(parcel2, cls13), (StoryPromptParticipationFrictionType) C41847B3o.A03(parcel2, cls13), C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString());
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new OpenInspirationHubCommandImpl[i];
            case 1:
                return new OriginalityFollowButtonInfoImpl[i];
            case 2:
                return new OriginalityInfoImpl[i];
            case 3:
                return new OriginalitySourceMediaInfoImpl[i];
            case 4:
                return new OverlayAdTapDestinationEnum[i];
            case 5:
                return new OverlayAdsFormatEnum[i];
            case 6:
                return new OverlayAdsTextStyleEnum[i];
            case 7:
                return new PartnerProgramOnboardingSteps[i];
            case 8:
                return new PartnerTypes[i];
            case 9:
                return new PaymentCredentialTypeEnum[i];
            case 10:
                return new PaymentInfo[i];
            case 11:
                return new PaymentMethodImpl[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new PendingShareToFriendsStoryBadgePreviewState[i];
            case 13:
                return new PermalinkItemType[i];
            case 14:
                return new Phrase[i];
            case 15:
                return new PopularReelWithFollowersInsightMetadataImpl[i];
            case 16:
                return new PresenceAudience[i];
            case 17:
                return new ProductAffiliateInformationDictImpl[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new ProductArtsLabelInformationDictImpl[i];
            case 19:
                return new ProductCardSubtitleType[i];
            case 20:
                return new ProductCollectionV2Type[i];
            case 21:
                return new ProductDetailsSellerBadgeContentImpl[i];
            case 22:
                return new ProductDiscountInformationDictImpl[i];
            case 23:
                return new ProductDiscountsDictImpl[i];
            case 24:
                return new ProductItemStickerBundleStyle[i];
            case 25:
                return new ProductMediaType[i];
            case 26:
                return new ProductPivotsButtonActionType[i];
            case 27:
                return new ProductPivotsButtonImpl[i];
            case 28:
                return new ProductPivotsSourceMediaType[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new ProductTaggingFeedComponentType[i];
            case 30:
                return new ProductTileBannerMetadataDecorationImpl[i];
            case 31:
                return new ProductTileBannerType[i];
            case 32:
                return new ProductTileContextImpl[i];
            case 33:
                return new ProductTileContextMetadataImpl[i];
            case 34:
                return new ProductTileContextVariant[i];
            case 35:
                return new ProductTileFeaturedProductPermissionInfoLabelOptionsImpl[i];
            case 36:
                return new ProductTileLabelImpl[i];
            case 37:
                return new ProductTileLabelType[i];
            case 38:
                return new ProductTileLayoutContentImpl[i];
            case 39:
                return new ProductTileMetadataDecorationsImpl[i];
            case 40:
                return new ProductTileMetadataDestination[i];
            case Seq.NULL_REFNUM:
                return new ProductTileMetadataImpl[i];
            case Seq.RefTracker.REF_OFFSET:
                return new ProductTilePriceLabelOptionsImpl[i];
            case 43:
                return new ProductTileProductImpl[i];
            case 44:
                return new ProductTileProductNameLabelOptionsImpl[i];
            case 45:
                return new ProductTileTextColorType[i];
            case 46:
                return new ProductTileTextStyleType[i];
            case 47:
                return new ProductTileUCILoggingInfoImpl[i];
            case 48:
                return new ProductVariantPossibleValueDict[i];
            case 49:
                return new ProductWithMediaImageImpl[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new ProfileGridItemTypeEnum[i];
            case 51:
                return new ProfileThemeImpl[i];
            case 52:
                return new ProfileThemeType[i];
            case 53:
                return new PromoteUnavailableReason[i];
            case 54:
                return new PromptFirstMediaType[i];
            case 55:
                return new PublisherPlatform[i];
            case 56:
                return new REPETITION_UI_TYPE[i];
            case 57:
                return new RIXUCoverCTAPosition[i];
            case 58:
                return new RIXUCoverElementMetadataType[i];
            case 59:
                return new RIXUCoverPreviewType[i];
            case 60:
                return new RIXUCoverSize[i];
            case 61:
                return new RIXUTextLinkImpl[i];
            case 62:
                return new Range[i];
            case 63:
                return new RankingAlgorithm[i];
            case 64:
                return new RankingInfo[i];
            case 65:
                return new ReelTappableObjectType[i];
            case 66:
                return new ReelsMediaInteractivityType[i];
            case 67:
                return new RemoteBooleanSettingId[i];
            case 68:
                return new RemoteStringSettingId[i];
            case 69:
                return new SMBSupportStickerDict[i];
            case 70:
                return new ScheduledLiveAffiliateInfoImpl[i];
            case 71:
                return new ScheduledLiveDiscountInfoImpl[i];
            case 72:
                return new SellerBadgeDict[i];
            case 73:
                return new SellerBadgeSurfaces[i];
            case 74:
                return new SellerBadgeType[i];
            case 75:
                return new SettingId[i];
            case 76:
                return new ShoppingBrandWithProductsImpl[i];
            case 77:
                return new ShoppingBrandWithProductsSubtitle[i];
            case 78:
                return new ShoppingIGFundedIncentivesShopAdsBannerStyles[i];
            case 79:
                return new ShoppingPivotItemType[i];
            case 80:
                return new ShoppingSwipeUpCTATextIcon[i];
            case 81:
                return new ShowreelNativeClientName[i];
            case 82:
                return new SmartReelType[i];
            case 83:
                return new SoundPlatformProduct[i];
            case 84:
                return new StatusResponseImpl[i];
            case 85:
                return new StatusStyle[i];
            case 86:
                return new StatusStyleResponseInfoImpl[i];
            case 87:
                return new StatusType[i];
            case 88:
                return new StickerPack[i];
            case 89:
                return new StickerTraySurface[i];
            case 90:
                return new StoryAdKeywordStyleEnum[i];
            case 91:
                return new StoryAdKeywordTypeEnum[i];
            case 92:
                return new StoryEmojisEntryAnimationType[i];
            case 93:
                return new StoryGroupMentionTappableData[i];
            case 94:
                return new StoryJoinChatStatus[i];
            case 95:
                return new StoryMultiProductStickerLinkDataImpl[i];
            case 96:
                return new StoryMusicPickAggregationVisibility[i];
            case 97:
                return new StoryMusicPickTappableData[i];
            case 98:
                return new StoryProductItemStickerTappableData[i];
            default:
                return new StoryPromptParticipationFrictionInfoDictImpl[i];
        }
    }
}
