package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.profilecard.model.ProfileCardStickerModel;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.reels.question.model.QuestionResponsesModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import com.instagram.rtc.activity.RtcIncomingParams;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.rtc.statemodel.RtcSettingsParticipant;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig;
import com.instagram.save.model.CollaborativeCollectionMetadata;
import com.instagram.save.model.SavedCollection;
import com.instagram.schools.management.data.BadgeVisibilitySettingItem;
import com.instagram.schools.management.data.SchoolAddress;
import com.instagram.schools.management.data.SchoolInfo;
import com.instagram.schools.management.data.SchoolOnboardingParcelData;
import com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig;
import com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import com.instagram.settings2.core.view.SettingsScreenConfirmBottomSheetFragment$Item;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments;
import com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments;
import com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.shopping.intf.productpicker.MultiProductPickerResult;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.ShippingAndReturnsSection;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import com.instagram.shopping.model.destination.home.DestinationContentType;
import com.instagram.shopping.model.destination.home.DestinationItemLabelType;
import com.instagram.shopping.model.destination.home.DestinationSignalType;
import com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel;
import com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;
import com.instagram.shopping.model.share.ShopShareInfo;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import com.instagram.shopping.model.taggingfeed.SourceType;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl;
import com.instagram.sponsored.signals.model.AdsCTATrustInfo;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsTextTrustInfo;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.trials.model.TrialMetricsData;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import com.instagram.ui.widget.editphonenumber.CountryCodeTextView;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductWrapper;
import com.instagram.user.model.ScheduledLiveProductsMetadata;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.UpcomingEventLiveMetadataImpl;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import com.instagram.util.gallery.ImageManager$ImageListParam;
import com.instagram.video.common.events.IgRtcEventHeader;
import com.instagram.videofeed.intf.VideoFeedType;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class W6F implements Parcelable.Creator {
    public final int A00;

    public static Object A00(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return DirectMessageInteropReachabilityOptions.CREATOR.createFromParcel(parcel);
        }
        return null;
    }

    public W6F(int i) {
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Parcel} */
    /* JADX WARNING: type inference failed for: r8v8, types: [com.instagram.registration.model.RegFlowExtras, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v106, types: [X.Vir, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v9, types: [com.instagram.registration.model.UserBirthDate, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v20, types: [java.lang.Object, com.instagram.save.model.CollaborativeCollectionMetadata] */
    /* JADX WARNING: type inference failed for: r8v46, types: [java.lang.Object, com.instagram.shopping.model.ShippingAndReturnsSection] */
    /* JADX WARNING: type inference failed for: r8v68, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    /* JADX WARNING: type inference failed for: r8v74, types: [com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v75, types: [com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v76, types: [android.view.View$BaseSavedState, com.instagram.tagging.widget.TagsInteractiveLayout$UnnamedTagSavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v86, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v87, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel$SlideCardSectionViewModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v99, types: [java.lang.Object, com.instagram.util.gallery.ImageManager$ImageListParam] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r52) {
        /*
            r51 = this;
            r0 = r51
            int r1 = r0.A00
            r0 = r52
            switch(r1) {
                case 0: goto L_0x16e4;
                case 1: goto L_0x16cc;
                case 2: goto L_0x166b;
                case 3: goto L_0x161f;
                case 4: goto L_0x15ce;
                case 5: goto L_0x156f;
                case 6: goto L_0x154d;
                case 7: goto L_0x14d1;
                case 8: goto L_0x12e8;
                case 9: goto L_0x12d0;
                case 10: goto L_0x12b2;
                case 11: goto L_0x12a0;
                case 12: goto L_0x1296;
                case 13: goto L_0x122d;
                case 14: goto L_0x11e5;
                case 15: goto L_0x1167;
                case 16: goto L_0x1129;
                case 17: goto L_0x10f3;
                case 18: goto L_0x10d3;
                case 19: goto L_0x10bd;
                case 20: goto L_0x1092;
                case 21: goto L_0x0fe8;
                case 22: goto L_0x0fd2;
                case 23: goto L_0x0fc0;
                case 24: goto L_0x0faa;
                case 25: goto L_0x0f07;
                case 26: goto L_0x0ee9;
                case 27: goto L_0x0edf;
                case 28: goto L_0x0ebd;
                case 29: goto L_0x0eb2;
                case 30: goto L_0x0ea9;
                case 31: goto L_0x0e4e;
                case 32: goto L_0x0e40;
                case 33: goto L_0x0da5;
                case 34: goto L_0x0d2e;
                case 35: goto L_0x0d24;
                case 36: goto L_0x0cc9;
                case 37: goto L_0x0c4b;
                case 38: goto L_0x0b49;
                case 39: goto L_0x0aec;
                case 40: goto L_0x0aa8;
                case 41: goto L_0x0a29;
                case 42: goto L_0x0974;
                case 43: goto L_0x0958;
                case 44: goto L_0x094e;
                case 45: goto L_0x0944;
                case 46: goto L_0x092e;
                case 47: goto L_0x091a;
                case 48: goto L_0x08cf;
                case 49: goto L_0x08c0;
                case 50: goto L_0x08b1;
                case 51: goto L_0x08a2;
                case 52: goto L_0x089c;
                case 53: goto L_0x0886;
                case 54: goto L_0x0865;
                case 55: goto L_0x085a;
                case 56: goto L_0x0854;
                case 57: goto L_0x080b;
                case 58: goto L_0x07e9;
                case 59: goto L_0x07a7;
                case 60: goto L_0x0785;
                case 61: goto L_0x0776;
                case 62: goto L_0x0708;
                case 63: goto L_0x0702;
                case 64: goto L_0x06bc;
                case 65: goto L_0x0676;
                case 66: goto L_0x0660;
                case 67: goto L_0x0635;
                case 68: goto L_0x05f8;
                case 69: goto L_0x05b5;
                case 70: goto L_0x058a;
                case 71: goto L_0x047e;
                case 72: goto L_0x0468;
                case 73: goto L_0x044d;
                case 74: goto L_0x0437;
                case 75: goto L_0x0415;
                case 76: goto L_0x040c;
                case 77: goto L_0x03fa;
                case 78: goto L_0x03ec;
                case 79: goto L_0x03e2;
                case 80: goto L_0x03c8;
                case 81: goto L_0x035a;
                case 82: goto L_0x0340;
                case 83: goto L_0x02e1;
                case 84: goto L_0x0299;
                case 85: goto L_0x0293;
                case 86: goto L_0x028a;
                case 87: goto L_0x023a;
                case 88: goto L_0x0224;
                case 89: goto L_0x01dc;
                case 90: goto L_0x01c6;
                case 91: goto L_0x018b;
                case 92: goto L_0x010d;
                case 93: goto L_0x00cc;
                case 94: goto L_0x00ae;
                case 95: goto L_0x009c;
                case 96: goto L_0x0064;
                case 97: goto L_0x002f;
                case 98: goto L_0x001f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r8 = new com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel
            r8.<init>(r3, r2, r1, r0)
            return r8
        L_0x001f:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            if (r0 == 0) goto L_0x002a
            com.instagram.videofeed.intf.VideoFeedType r8 = com.instagram.videofeed.intf.VideoFeedType.valueOf(r0)
            return r8
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x002f:
            int r1 = X.C41848B3p.A00(r0)
            r11 = 0
            if (r1 != 0) goto L_0x005f
            r12 = r11
        L_0x0037:
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.Integer r9 = X.Dbc.A0C(r0)
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.Integer r10 = X.Dbc.A0C(r0)
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r11 = X.C41847B3o.A12(r0)
        L_0x0059:
            com.instagram.video.common.events.IgRtcEventHeader r8 = new com.instagram.video.common.events.IgRtcEventHeader
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x005f:
            java.lang.Long r12 = X.Pxi.A0T(r0)
            goto L_0x0037
        L_0x0064:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.util.gallery.ImageManager$ImageListParam r8 = new com.instagram.util.gallery.ImageManager$ImageListParam
            r8.<init>()
            r1 = 4
            java.lang.Integer[] r2 = X.AnonymousClass05K.A00(r1)
            int r1 = r0.readInt()
            r1 = r2[r1]
            r8.A03 = r1
            int r1 = r0.readInt()
            r8.A00 = r1
            int r1 = r0.readInt()
            r8.A01 = r1
            java.lang.String r1 = r0.readString()
            r8.A04 = r1
            r1 = 0
            android.os.Parcelable r1 = r0.readParcelable(r1)
            android.net.Uri r1 = (android.net.Uri) r1
            r8.A02 = r1
            boolean r0 = X.C41848B3p.A1X(r0)
            r8.A05 = r0
            return r8
        L_0x009c:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.Class<com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig> r1 = com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.recommended.FollowListData r0 = (com.instagram.user.recommended.FollowListData) r0
            com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig r8 = new com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig
            r8.<init>(r0, r2)
            return r8
        L_0x00ae:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.Df5 r9 = X.C46443Df5.valueOf(r1)
            java.lang.String r10 = r0.readString()
            java.lang.String r11 = r0.readString()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.String r12 = r0.readString()
            com.instagram.user.recommended.FollowListData r8 = new com.instagram.user.recommended.FollowListData
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x00cc:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r11 = 0
            if (r1 != 0) goto L_0x0104
            r10 = r11
        L_0x00d8:
            boolean r14 = X.C41848B3p.A1X(r0)
            boolean r15 = X.C41848B3p.A1X(r0)
            java.lang.String r13 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x00fd
            r9 = r11
        L_0x00eb:
            com.instagram.user.model.ScheduledLiveProductsMetadata r9 = (com.instagram.user.model.ScheduledLiveProductsMetadata) r9
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x00f7
            java.lang.Integer r11 = X.C41847B3o.A12(r0)
        L_0x00f7:
            com.instagram.user.model.UpcomingEventLiveMetadataImpl r8 = new com.instagram.user.model.UpcomingEventLiveMetadataImpl
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x00fd:
            android.os.Parcelable$Creator r1 = com.instagram.user.model.ScheduledLiveProductsMetadata.CREATOR
            java.lang.Object r9 = r1.createFromParcel(r0)
            goto L_0x00eb
        L_0x0104:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            goto L_0x00d8
        L_0x010d:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.user.model.UpcomingEventImpl> r1 = com.instagram.user.model.UpcomingEventImpl.class
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.UpcomingDropCampaignEventMetadata r13 = (com.instagram.user.model.UpcomingDropCampaignEventMetadata) r13
            int r2 = r0.readInt()
            r15 = 0
            if (r2 != 0) goto L_0x0186
            r17 = r15
        L_0x0122:
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.EventPageNavigationMetadata r9 = (com.instagram.api.schemas.EventPageNavigationMetadata) r9
            java.lang.String r19 = r0.readString()
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.IGLocalEventDict r10 = (com.instagram.api.schemas.IGLocalEventDict) r10
            int r2 = r0.readInt()
            if (r2 != 0) goto L_0x017d
            r16 = r15
        L_0x013a:
            int r2 = r0.readInt()
            if (r2 != 0) goto L_0x0178
            r18 = r15
        L_0x0142:
            android.os.Parcelable r14 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.UpcomingEventLiveMetadata r14 = (com.instagram.user.model.UpcomingEventLiveMetadata) r14
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia r12 = (com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia) r12
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x015a
            android.os.Parcelable$Creator r2 = com.instagram.user.model.User.CREATOR
            java.lang.Object r15 = r2.createFromParcel(r0)
        L_0x015a:
            com.instagram.user.model.User r15 = (com.instagram.user.model.User) r15
            boolean r24 = X.C41848B3p.A1X(r0)
            long r22 = r0.readLong()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.UpcomingEventIDType r11 = (com.instagram.api.schemas.UpcomingEventIDType) r11
            com.instagram.user.model.UpcomingEventImpl r8 = new com.instagram.user.model.UpcomingEventImpl
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24)
            return r8
        L_0x0178:
            java.lang.Long r18 = X.Pxi.A0T(r0)
            goto L_0x0142
        L_0x017d:
            boolean r2 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)
            goto L_0x013a
        L_0x0186:
            java.lang.Long r17 = X.Pxi.A0T(r0)
            goto L_0x0122
        L_0x018b:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl> r1 = com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.ProductCollection r10 = (com.instagram.user.model.ProductCollection) r10
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia r9 = (com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia) r9
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            java.lang.Object r11 = r1.createFromParcel(r0)
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            int r3 = r0.readInt()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r3)
            r2 = 0
        L_0x01b7:
            if (r2 == r3) goto L_0x01c0
            android.os.Parcelable$Creator r1 = com.instagram.user.model.ProductDetailsProductItemDict.CREATOR
            int r2 = X.JTT.A04(r0, r1, r14, r2)
            goto L_0x01b7
        L_0x01c0:
            com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl r8 = new com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x01c6:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r0 = r0.readString()
            com.instagram.user.model.UnavailableProductImpl r8 = new com.instagram.user.model.UnavailableProductImpl
            r8.<init>(r1, r2, r0)
            return r8
        L_0x01dc:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.user.model.ScheduledLiveProductsMetadata> r1 = com.instagram.user.model.ScheduledLiveProductsMetadata.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.ScheduledLiveAffiliateInfo r9 = (com.instagram.api.schemas.ScheduledLiveAffiliateInfo) r9
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.ProductCollection r11 = (com.instagram.user.model.ProductCollection) r11
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.ScheduledLiveDiscountInfo r10 = (com.instagram.api.schemas.ScheduledLiveDiscountInfo) r10
            int r1 = r0.readInt()
            r13 = 0
            if (r1 != 0) goto L_0x0217
            r12 = r13
        L_0x01fc:
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x021e
            int r3 = r0.readInt()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r3)
            r2 = 0
        L_0x020e:
            if (r2 == r3) goto L_0x021e
            android.os.Parcelable$Creator r1 = com.instagram.user.model.ProductWrapper.CREATOR
            int r2 = X.JTT.A04(r0, r1, r13, r2)
            goto L_0x020e
        L_0x0217:
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
            goto L_0x01fc
        L_0x021e:
            com.instagram.user.model.ScheduledLiveProductsMetadata r8 = new com.instagram.user.model.ScheduledLiveProductsMetadata
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0224:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x0233
            r0 = 0
        L_0x022b:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            com.instagram.user.model.ProductWrapper r8 = new com.instagram.user.model.ProductWrapper
            r8.<init>(r0)
            return r8
        L_0x0233:
            android.os.Parcelable$Creator r1 = com.instagram.user.model.ProductDetailsProductItemDict.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            goto L_0x022b
        L_0x023a:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            java.lang.Class<com.instagram.user.model.ProductCollectionImpl> r1 = com.instagram.user.model.ProductCollectionImpl.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus r10 = (com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus) r10
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.ProductCollectionV2Type r9 = (com.instagram.api.schemas.ProductCollectionV2Type) r9
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.productcollection.ProductCollectionCover r11 = (com.instagram.model.shopping.productcollection.ProductCollectionCover) r11
            java.lang.String r14 = r0.readString()
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata r12 = (com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata) r12
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0277
            r4 = 0
        L_0x026f:
            com.instagram.user.model.ProductCollectionImpl r8 = new com.instagram.user.model.ProductCollectionImpl
            r18 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L_0x0277:
            int r3 = r0.readInt()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r2 = 0
        L_0x0281:
            if (r2 == r3) goto L_0x026f
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            int r2 = X.JTT.A04(r0, r1, r4, r2)
            goto L_0x0281
        L_0x028a:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r8 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.valueOf(r0)
            return r8
        L_0x0293:
            com.instagram.ui.widget.editphonenumber.CountryCodeTextView$SavedState r8 = new com.instagram.ui.widget.editphonenumber.CountryCodeTextView$SavedState
            r8.<init>(r0)
            return r8
        L_0x0299:
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel$SlideCardSectionViewModel r8 = new com.instagram.ui.slidecardpageadapter.SlideCardViewModel$SlideCardSectionViewModel
            r8.<init>()
            int r1 = r0.readInt()
            r8.A03 = r1
            java.lang.String r1 = r0.readString()
            r8.A08 = r1
            java.lang.String r1 = r0.readString()
            r8.A07 = r1
            int r1 = r0.readInt()
            r8.A01 = r1
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r8.A05 = r1
            int r1 = r0.readInt()
            r8.A02 = r1
            boolean r1 = X.Pxg.A1U(r0)
            r8.A09 = r1
            int r1 = r0.readInt()
            r8.A00 = r1
            java.lang.String r1 = r0.readString()
            r8.A06 = r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r2)
            android.net.Uri r0 = (android.net.Uri) r0
            r8.A04 = r0
            return r8
        L_0x02e1:
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r8 = new com.instagram.ui.slidecardpageadapter.SlideCardViewModel
            r8.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8.A0C = r2
            android.os.Parcelable$Creator r1 = com.instagram.ui.slidecardpageadapter.SlideCardViewModel.SlideCardSectionViewModel.CREATOR
            r0.readTypedList(r2, r1)
            int r1 = r0.readInt()
            r8.A00 = r1
            int r1 = r0.readInt()
            r8.A01 = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r2 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r8.A06 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r8.A05 = r1
            java.lang.String r1 = r0.readString()
            r8.A0B = r1
            java.lang.String r1 = r0.readString()
            r8.A0A = r1
            java.lang.String r1 = r0.readString()
            r8.A08 = r1
            java.lang.String r1 = r0.readString()
            r8.A09 = r1
            android.os.Parcelable$Creator r2 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r2.createFromParcel(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r8.A07 = r1
            java.lang.Object r0 = r2.createFromParcel(r0)
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            r8.A02 = r0
            r0 = 0
            r8.A03 = r0
            r8.A04 = r0
            return r8
        L_0x0340:
            int r2 = X.C41848B3p.A00(r0)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0353
            r0 = 0
        L_0x034b:
            com.instagram.ui.primer.ColorTint r0 = (com.instagram.ui.primer.ColorTint) r0
            com.instagram.ui.primer.TitleIcon r8 = new com.instagram.ui.primer.TitleIcon
            r8.<init>(r0, r2)
            return r8
        L_0x0353:
            android.os.Parcelable$Creator r1 = com.instagram.ui.primer.ColorTint.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            goto L_0x034b
        L_0x035a:
            java.lang.String r17 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r10 = 0
            if (r1 != 0) goto L_0x037f
            r9 = r10
        L_0x0366:
            com.instagram.ui.primer.TitleIcon r9 = (com.instagram.ui.primer.TitleIcon) r9
            int r22 = r0.readInt()
            int r4 = r0.readInt()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            r3 = 0
        L_0x0376:
            if (r3 == r4) goto L_0x0386
            android.os.Parcelable$Creator r2 = com.instagram.ui.primer.InfoItem.CREATOR
            int r3 = X.JTT.A04(r0, r2, r1, r3)
            goto L_0x0376
        L_0x037f:
            android.os.Parcelable$Creator r1 = com.instagram.ui.primer.TitleIcon.CREATOR
            java.lang.Object r9 = r1.createFromParcel(r0)
            goto L_0x0366
        L_0x0386:
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            boolean r23 = X.C41848B3p.A1X(r0)
            boolean r24 = X.C41848B3p.A1X(r0)
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x03a0
            java.lang.Integer r10 = X.C41847B3o.A12(r0)
        L_0x03a0:
            boolean r25 = X.C41848B3p.A1X(r0)
            java.lang.Integer r11 = X.Dbc.A0C(r0)
            java.lang.Integer r12 = X.Dbc.A0C(r0)
            java.lang.Integer r13 = X.Dbc.A0C(r0)
            java.lang.Integer r14 = X.Dbc.A0C(r0)
            java.lang.Integer r15 = X.Dbc.A0C(r0)
            java.lang.Integer r16 = X.C13991Tnr.A0W(r0)
            java.lang.String r20 = r0.readString()
            com.instagram.ui.primer.PrimerBottomSheetConfig r8 = new com.instagram.ui.primer.PrimerBottomSheetConfig
            r21 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r8
        L_0x03c8:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.Class<com.instagram.ui.primer.InfoItem> r1 = com.instagram.ui.primer.InfoItem.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.ui.primer.IconConfig r2 = (com.instagram.ui.primer.IconConfig) r2
            java.lang.String r1 = r0.readString()
            java.lang.Integer r0 = X.JTU.A0U(r0)
            com.instagram.ui.primer.InfoItem r8 = new com.instagram.ui.primer.InfoItem
            r8.<init>(r2, r0, r3, r1)
            return r8
        L_0x03e2:
            int r0 = X.C41848B3p.A00(r0)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r8 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r8.<init>(r0)
            return r8
        L_0x03ec:
            int r1 = X.C41848B3p.A00(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.ui.primer.IconConfig$IconWithTextConfig r8 = new com.instagram.ui.primer.IconConfig$IconWithTextConfig
            r8.<init>(r1, r0)
            return r8
        L_0x03fa:
            int r2 = X.C41848B3p.A00(r0)
            int r1 = r0.readInt()
            int r0 = r0.readInt()
            com.instagram.ui.primer.ColorTint r8 = new com.instagram.ui.primer.ColorTint
            r8.<init>(r2, r1, r0)
            return r8
        L_0x040c:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel$MixedAttributionType r8 = com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel.MixedAttributionType.valueOf(r0)
            return r8
        L_0x0415:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel.MixedAttributionType.CREATOR
            java.lang.Object r4 = r1.createFromParcel(r0)
            com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel$MixedAttributionType r4 = (com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel.MixedAttributionType) r4
            java.lang.String r3 = r0.readString()
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel> r1 = com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel r8 = new com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel
            r8.<init>(r0, r4, r3, r2)
            return r8
        L_0x0437:
            int r3 = X.C41848B3p.A00(r0)
            int r2 = r0.readInt()
            int r1 = r0.readInt()
            int r0 = r0.readInt()
            com.instagram.trials.model.TrialMetricsData r8 = new com.instagram.trials.model.TrialMetricsData
            r8.<init>(r3, r2, r1, r0)
            return r8
        L_0x044d:
            com.instagram.tagging.widget.TagsInteractiveLayout$UnnamedTagSavedState r8 = new com.instagram.tagging.widget.TagsInteractiveLayout$UnnamedTagSavedState
            r8.<init>(r0)
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            r8.A00 = r2
            float r1 = r0.readFloat()
            r2.x = r1
            android.graphics.PointF r1 = r8.A00
            float r0 = r0.readFloat()
            r1.y = r0
            return r8
        L_0x0468:
            com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer r8 = new com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer
            r8.<init>()
            java.lang.Class<com.instagram.user.model.Product> r1 = com.instagram.user.model.Product.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.ProductDetailsProductItemDict r1 = (com.instagram.user.model.ProductDetailsProductItemDict) r1
            r8.A01 = r1
            float r0 = r0.readFloat()
            r8.A00 = r0
            return r8
        L_0x047e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r2 = 1
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r8 = new com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo
            r8.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0B = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0F = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0C = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0A = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0D = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0E = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A09 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r8.A00 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0G = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0585
            r8.A06 = r1
            java.lang.Class<com.instagram.common.typedurl.SimpleImageUrl> r1 = com.instagram.common.typedurl.SimpleImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r8.A02 = r1
            java.lang.String r1 = r0.readString()
            r8.A08 = r1
            android.os.Parcelable$Creator r1 = com.instagram.model.people.PeopleTag.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            if (r1 != 0) goto L_0x04e9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x04e9:
            r8.A0B = r1
            android.os.Parcelable$Creator r1 = com.instagram.model.fbusertag.FBUserTag.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            if (r1 != 0) goto L_0x04f8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x04f8:
            r8.A0A = r1
            android.os.Parcelable$Creator r1 = com.instagram.model.people.PeopleTag.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            if (r1 != 0) goto L_0x0507
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0507:
            r8.A0F = r1
            int r1 = r0.readInt()
            r8.A01 = r1
            float r1 = r0.readFloat()
            r8.A00 = r1
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.ProductTag.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            if (r1 != 0) goto L_0x0522
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0522:
            r8.A0C = r1
            android.os.Parcelable$Creator r1 = com.instagram.tagging.api.model.MediaSuggestedProductTag.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            if (r1 != 0) goto L_0x0531
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0531:
            r8.A0D = r1
            int r1 = r0.readInt()
            boolean r1 = X.C13988Tno.A1W(r1, r2)
            r8.A0H = r1
            java.io.Serializable r2 = r0.readSerializable()
            r1 = 1635(0x663, float:2.291E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            X.1iA r2 = (X.1iA) r2
            r8.A03 = r2
            java.util.ArrayList r1 = r0.createStringArrayList()
            r8.A0G = r1
            java.lang.Class<com.instagram.pendingmedia.model.ClipInfo> r1 = com.instagram.pendingmedia.model.ClipInfo.class
            java.lang.Object r1 = X.Pxi.A0U(r0, r1)
            com.instagram.pendingmedia.model.ClipInfo r1 = (com.instagram.pendingmedia.model.ClipInfo) r1
            r8.A04 = r1
            java.util.ArrayList r1 = r0.createStringArrayList()
            if (r1 != 0) goto L_0x0569
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0569:
            r8.A0E = r1
            java.util.ArrayList r1 = r0.createStringArrayList()
            if (r1 != 0) goto L_0x0576
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0576:
            r8.A09 = r1
            java.lang.String r1 = r0.readString()
            r8.A05 = r1
            java.lang.String r0 = r0.readString()
            r8.A07 = r0
            return r8
        L_0x0585:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x058a:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.sponsored.signals.model.AdsTextTrustInfo> r5 = com.instagram.sponsored.signals.model.AdsTextTrustInfo.class
            android.os.Parcelable r4 = X.C41847B3o.A03(r0, r5)
            com.instagram.sponsored.signals.model.AdsBizBadgeInfo r4 = (com.instagram.sponsored.signals.model.AdsBizBadgeInfo) r4
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x05a3
            r2 = 0
        L_0x059d:
            com.instagram.sponsored.signals.model.AdsTextTrustInfo r8 = new com.instagram.sponsored.signals.model.AdsTextTrustInfo
            r8.<init>(r4, r2)
            return r8
        L_0x05a3:
            int r3 = r0.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1 = 0
        L_0x05ad:
            if (r1 == r3) goto L_0x059d
            X.C41848B3p.A1J(r0, r5, r2)
            int r1 = r1 + 1
            goto L_0x05ad
        L_0x05b5:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r3 = 0
            r14 = 0
            if (r1 != 0) goto L_0x05e1
            r10 = r14
        L_0x05c2:
            java.lang.Class<com.instagram.sponsored.signals.model.AdsRatingInfo> r2 = com.instagram.sponsored.signals.model.AdsRatingInfo.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat r9 = (com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat) r9
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x05ea
            int r1 = r0.readInt()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r1)
        L_0x05d9:
            if (r3 == r1) goto L_0x05ea
            X.C41848B3p.A1J(r0, r2, r14)
            int r3 = r3 + 1
            goto L_0x05d9
        L_0x05e1:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            goto L_0x05c2
        L_0x05ea:
            java.lang.Float r11 = X.Dbc.A0B(r0)
            java.lang.Integer r12 = X.C13991Tnr.A0W(r0)
            com.instagram.sponsored.signals.model.AdsRatingInfo r8 = new com.instagram.sponsored.signals.model.AdsRatingInfo
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x05f8:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r3 = 0
            r13 = 0
            if (r1 != 0) goto L_0x061e
            r9 = r13
        L_0x0605:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0627
            int r2 = r0.readInt()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r2)
        L_0x0614:
            if (r3 == r2) goto L_0x0627
            java.lang.Class<com.instagram.sponsored.signals.model.AdsIAWRatingInfo> r1 = com.instagram.sponsored.signals.model.AdsIAWRatingInfo.class
            X.C41848B3p.A1J(r0, r1, r13)
            int r3 = r3 + 1
            goto L_0x0614
        L_0x061e:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            goto L_0x0605
        L_0x0627:
            java.lang.Float r10 = X.Dbc.A0B(r0)
            java.lang.Integer r11 = X.C13991Tnr.A0W(r0)
            com.instagram.sponsored.signals.model.AdsIAWRatingInfo r8 = new com.instagram.sponsored.signals.model.AdsIAWRatingInfo
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0635:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.sponsored.signals.model.AdsCTATrustInfo> r5 = com.instagram.sponsored.signals.model.AdsCTATrustInfo.class
            android.os.Parcelable r4 = X.C41847B3o.A03(r0, r5)
            com.instagram.sponsored.signals.model.AdsBizBadgeInfo r4 = (com.instagram.sponsored.signals.model.AdsBizBadgeInfo) r4
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x064e
            r2 = 0
        L_0x0648:
            com.instagram.sponsored.signals.model.AdsCTATrustInfo r8 = new com.instagram.sponsored.signals.model.AdsCTATrustInfo
            r8.<init>(r4, r2)
            return r8
        L_0x064e:
            int r3 = r0.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1 = 0
        L_0x0658:
            if (r1 == r3) goto L_0x0648
            X.C41848B3p.A1J(r0, r5, r2)
            int r1 = r1 + 1
            goto L_0x0658
        L_0x0660:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x066f
            r0 = 0
        L_0x0667:
            com.instagram.sponsored.signals.model.AdsRatingInfo r0 = (com.instagram.sponsored.signals.model.AdsRatingInfo) r0
            com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl r8 = new com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl
            r8.<init>(r0)
            return r8
        L_0x066f:
            android.os.Parcelable$Creator r1 = com.instagram.sponsored.signals.model.AdsRatingInfo.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            goto L_0x0667
        L_0x0676:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.sponsored.analytics.SourceModelInfoParams r8 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r8.<init>()
            java.lang.String r1 = r0.readString()
            r8.A06 = r1
            int r1 = r0.readInt()
            r8.A02 = r1
            int r1 = r0.readInt()
            r8.A00 = r1
            java.lang.String r1 = r0.readString()
            r8.A09 = r1
            java.lang.String r1 = r0.readString()
            r8.A05 = r1
            java.lang.String r1 = r0.readString()
            r8.A04 = r1
            int r1 = r0.readInt()
            r8.A01 = r1
            int r1 = r0.readInt()
            r8.A03 = r1
            java.lang.String r1 = r0.readString()
            r8.A08 = r1
            java.lang.String r0 = r0.readString()
            r8.A07 = r0
            return r8
        L_0x06bc:
            java.lang.String r9 = X.C41848B3p.A1D(r0)
            java.lang.String r10 = r0.readString()
            java.lang.String r11 = r0.readString()
            boolean r13 = X.C41848B3p.A1X(r0)
            boolean r14 = X.C41848B3p.A1X(r0)
            boolean r15 = X.C41848B3p.A1X(r0)
            boolean r16 = X.C41848B3p.A1X(r0)
            boolean r17 = X.C41848B3p.A1X(r0)
            boolean r18 = X.C41848B3p.A1X(r0)
            boolean r19 = X.C41848B3p.A1X(r0)
            boolean r20 = X.C41848B3p.A1X(r0)
            boolean r21 = X.C41848B3p.A1X(r0)
            boolean r22 = X.C41848B3p.A1X(r0)
            boolean r23 = X.C41848B3p.A1X(r0)
            boolean r24 = X.C41848B3p.A1X(r0)
            java.lang.String r12 = r0.readString()
            com.instagram.simplewebview.SimpleWebViewConfig r8 = new com.instagram.simplewebview.SimpleWebViewConfig
            r8.<init>((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21, (boolean) r22, (boolean) r23, (boolean) r24)
            return r8
        L_0x0702:
            com.instagram.shopping.model.variantselector.VariantSelectorModel r8 = new com.instagram.shopping.model.variantselector.VariantSelectorModel
            r8.<init>(r0)
            return r8
        L_0x0708:
            int r4 = X.C41848B3p.A00(r0)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r4)
            r5 = 0
            r3 = 0
        L_0x0713:
            if (r3 == r4) goto L_0x0725
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState> r1 = com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            r11.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0713
        L_0x0725:
            int r4 = r0.readInt()
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r4)
            r3 = 0
        L_0x072f:
            if (r3 == r4) goto L_0x0741
            java.lang.String r2 = r0.readString()
            android.os.Parcelable$Creator r1 = com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            r12.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x072f
        L_0x0741:
            int r3 = r0.readInt()
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r3)
        L_0x074a:
            if (r5 == r3) goto L_0x075c
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState> r1 = com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            r13.put(r2, r1)
            int r5 = r5 + 1
            goto L_0x074a
        L_0x075c:
            java.util.ArrayList r10 = r0.createStringArrayList()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x076f
            r9 = 0
        L_0x0767:
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r9 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r9
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r8 = new com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x076f:
            android.os.Parcelable$Creator r1 = com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta.CREATOR
            java.lang.Object r9 = r1.createFromParcel(r0)
            goto L_0x0767
        L_0x0776:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.shopping.model.taggingfeed.SourceType[] r1 = com.instagram.shopping.model.taggingfeed.SourceType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x0785:
            java.lang.String r9 = X.C41848B3p.A1D(r0)
            java.lang.String r10 = r0.readString()
            boolean r12 = X.C41848B3p.A1X(r0)
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.String r11 = r0.readString()
            boolean r14 = X.C41848B3p.A1X(r0)
            boolean r15 = X.C41848B3p.A1X(r0)
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader r8 = new com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x07a7:
            int r4 = X.C41848B3p.A00(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r4)
            r3 = 0
            r2 = 0
        L_0x07b2:
            if (r2 == r4) goto L_0x07bc
            java.lang.Class<com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState> r1 = com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState.class
            X.C41848B3p.A1J(r0, r1, r9)
            int r2 = r2 + 1
            goto L_0x07b2
        L_0x07bc:
            java.util.ArrayList r10 = r0.createStringArrayList()
            java.util.ArrayList r11 = r0.createStringArrayList()
            java.util.ArrayList r12 = r0.createStringArrayList()
            java.util.ArrayList r13 = r0.createStringArrayList()
            int r2 = r0.readInt()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r2)
        L_0x07d5:
            if (r3 == r2) goto L_0x07df
            java.lang.Class<com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState> r1 = com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState.class
            X.C41848B3p.A1J(r0, r1, r14)
            int r3 = r3 + 1
            goto L_0x07d5
        L_0x07df:
            java.util.ArrayList r15 = r0.createStringArrayList()
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState r8 = new com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x07e9:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.Class<com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta> r1 = com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.ProductCollectionV2Type r9 = (com.instagram.api.schemas.ProductCollectionV2Type) r9
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            boolean r14 = X.C41848B3p.A1X(r0)
            java.lang.String r13 = r0.readString()
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r8 = new com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x080b:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            int r1 = r0.readInt()
            r4 = 0
            boolean r17 = X.AnonymousClass7TF.A1P(r1)
            java.lang.Class<com.instagram.shopping.model.share.ShopShareInfo> r3 = com.instagram.shopping.model.share.ShopShareInfo.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r3)
            com.instagram.common.typedurl.ImageUrl r9 = (com.instagram.common.typedurl.ImageUrl) r9
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.util.ArrayList r15 = r0.createStringArrayList()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0843
            r1 = 0
        L_0x083b:
            com.instagram.shopping.model.share.ShopShareInfo r8 = new com.instagram.shopping.model.share.ShopShareInfo
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r8
        L_0x0843:
            int r2 = r0.readInt()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
        L_0x084c:
            if (r4 == r2) goto L_0x083b
            X.C41848B3p.A1J(r0, r3, r1)
            int r4 = r4 + 1
            goto L_0x084c
        L_0x0854:
            X.Pxi.A11(r0)
            com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint$ReconDestinationFeedEndpoint r8 = com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint.ReconDestinationFeedEndpoint.A00
            return r8
        L_0x085a:
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus[] r1 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x0865:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.shopping.model.productsource.ProductSourceOverrideStatus> r1 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r1)
            X.0qQ.A0A(r3)
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r3 = (com.instagram.shopping.model.productsource.ProductSourceOverrideStatus) r3
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.model.shopping.ProductSource> r1 = com.instagram.model.shopping.ProductSource.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.ProductSource r0 = (com.instagram.model.shopping.ProductSource) r0
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r8 = new com.instagram.shopping.model.productsource.ProductSourceOverrideState
            r8.<init>(r0, r3, r2)
            return r8
        L_0x0886:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent r8 = new com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent
            r8.<init>()
            java.lang.String r1 = r0.readString()
            r8.A00 = r1
            java.util.ArrayList r0 = r0.createStringArrayList()
            r8.A01 = r0
            return r8
        L_0x089c:
            com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel r8 = new com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x08a2:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.shopping.model.destination.home.DestinationSignalType[] r1 = com.instagram.shopping.model.destination.home.DestinationSignalType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x08b1:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.shopping.model.destination.home.DestinationItemLabelType[] r1 = com.instagram.shopping.model.destination.home.DestinationItemLabelType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x08c0:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.shopping.model.destination.home.DestinationContentType[] r1 = com.instagram.shopping.model.destination.home.DestinationContentType.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x08cf:
            java.lang.String r11 = X.C41848B3p.A1D(r0)
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.Class<com.instagram.shopping.model.collection.ProductCollectionShareInfo> r4 = com.instagram.shopping.model.collection.ProductCollectionShareInfo.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r4)
            com.instagram.common.typedurl.ImageUrl r9 = (com.instagram.common.typedurl.ImageUrl) r9
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r4)
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0908
            r3 = 0
        L_0x0900:
            com.instagram.shopping.model.collection.ProductCollectionShareInfo r8 = new com.instagram.shopping.model.collection.ProductCollectionShareInfo
            r18 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L_0x0908:
            int r2 = r0.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r1 = 0
        L_0x0912:
            if (r1 == r2) goto L_0x0900
            X.C41848B3p.A1J(r0, r4, r3)
            int r1 = r1 + 1
            goto L_0x0912
        L_0x091a:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.io.Serializable r1 = r0.readSerializable()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r0 = r0.readString()
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r8 = new com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo
            r8.<init>(r2, r0, r1)
            return r8
        L_0x092e:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.shopping.model.analytics.ShoppingNavigationInfo r8 = new com.instagram.shopping.model.analytics.ShoppingNavigationInfo
            r8.<init>(r3, r2, r1, r0)
            return r8
        L_0x0944:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo r8 = new com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo
            r8.<init>(r0)
            return r8
        L_0x094e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo r8 = new com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo
            r8.<init>(r0)
            return r8
        L_0x0958:
            com.instagram.shopping.model.ShippingAndReturnsSection r8 = new com.instagram.shopping.model.ShippingAndReturnsSection
            r8.<init>()
            java.lang.String r1 = r0.readString()
            r8.A02 = r1
            java.lang.String r1 = r0.readString()
            r8.A01 = r1
            java.lang.Class<com.instagram.api.schemas.LinkWithText> r1 = com.instagram.api.schemas.LinkWithText.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.LinkWithText r0 = (com.instagram.api.schemas.LinkWithText) r0
            r8.A00 = r0
            return r8
        L_0x0974:
            java.lang.String r16 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "AFFILIATE_DISCOVERY"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x09de
            java.lang.Integer r14 = X.AnonymousClass05K.A00
        L_0x0986:
            java.lang.String r1 = r0.readString()
            X.Uxb r10 = X.C16581Uxb.valueOf(r1)
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.util.ArrayList r24 = r0.createStringArrayList()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            boolean r25 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments> r1 = com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader r12 = (com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader) r12
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState r11 = (com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState) r11
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.pendingmedia.model.ClipInfo r9 = (com.instagram.pendingmedia.model.ClipInfo) r9
            java.lang.Long r15 = X.C13992Tns.A0D(r0)
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r1)
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r13 = (com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState) r13
            boolean r26 = X.C41848B3p.A1X(r0)
            boolean r27 = X.C41848B3p.A1X(r0)
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r8 = new com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r8
        L_0x09de:
            java.lang.String r1 = "PRODUCT_TAGS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x09e9
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            goto L_0x0986
        L_0x09e9:
            java.lang.String r1 = "PRODUCT_STICKERS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x09f4
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            goto L_0x0986
        L_0x09f4:
            java.lang.String r1 = "SWIPE_UP_LINK"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x09ff
            java.lang.Integer r14 = X.AnonymousClass05K.A0N
            goto L_0x0986
        L_0x09ff:
            java.lang.String r1 = "HIGHLIGHTED_PRODUCTS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a0b
            java.lang.Integer r14 = X.AnonymousClass05K.A0Y
            goto L_0x0986
        L_0x0a0b:
            java.lang.String r1 = "REQUEST_TO_FEATURE_IN_SHOP"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a17
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            goto L_0x0986
        L_0x0a17:
            java.lang.String r1 = "IGTV_COMPOSER"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a23
            java.lang.Integer r14 = X.AnonymousClass05K.A0u
            goto L_0x0986
        L_0x0a23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0a29:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.String r5 = r0.readString()
            X.0qQ.A0A(r5)
            X.0qQ.A0B(r5, r1)
            r1 = 7
            java.lang.Integer[] r4 = X.AnonymousClass05K.A00(r1)
            int r3 = r4.length
            r2 = 0
        L_0x0a3e:
            if (r2 >= r3) goto L_0x0a4f
            r10 = r4[r2]
            java.lang.String r1 = X.C18267Voh.A00(r10)
            boolean r1 = X.0qQ.A0K(r1, r5)
            if (r1 != 0) goto L_0x0a50
            int r2 = r2 + 1
            goto L_0x0a3e
        L_0x0a4f:
            r10 = 0
        L_0x0a50:
            X.0qQ.A0A(r10)
            java.lang.String r11 = r0.readString()
            X.0qQ.A0A(r11)
            boolean r19 = X.C13991Tnr.A1W(r0)
            java.lang.String r12 = r0.readString()
            boolean r20 = X.C13991Tnr.A1W(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.ProductTag.CREATOR
            java.util.ArrayList r16 = r0.createTypedArrayList(r1)
            java.util.ArrayList r17 = r0.createTypedArrayList(r1)
            java.util.ArrayList r18 = r0.createStringArrayList()
            java.lang.String r5 = r0.readString()
            X.Uxb[] r4 = X.C16581Uxb.values()
            int r3 = r4.length
            r2 = 0
        L_0x0a86:
            if (r2 >= r3) goto L_0x0a95
            r9 = r4[r2]
            java.lang.String r1 = r9.A00
            boolean r1 = X.0qQ.A0K(r1, r5)
            if (r1 != 0) goto L_0x0a96
            int r2 = r2 + 1
            goto L_0x0a86
        L_0x0a95:
            r9 = 0
        L_0x0a96:
            boolean r21 = X.C13991Tnr.A1W(r0)
            boolean r22 = X.C13991Tnr.A1W(r0)
            java.lang.String r15 = r0.readString()
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r8 = new com.instagram.shopping.intf.productpicker.ProductPickerArguments
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r8
        L_0x0aa8:
            int r3 = X.C41848B3p.A00(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r5 = 0
            r2 = 0
        L_0x0ab3:
            if (r2 == r3) goto L_0x0abd
            java.lang.Class<com.instagram.shopping.intf.productpicker.MultiProductPickerResult> r1 = com.instagram.shopping.intf.productpicker.MultiProductPickerResult.class
            X.C41848B3p.A1J(r0, r1, r6)
            int r2 = r2 + 1
            goto L_0x0ab3
        L_0x0abd:
            int r4 = r0.readInt()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r4)
        L_0x0ac6:
            if (r5 == r4) goto L_0x0ad8
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.shopping.intf.productpicker.MultiProductPickerResult> r1 = com.instagram.shopping.intf.productpicker.MultiProductPickerResult.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            r3.put(r2, r1)
            int r5 = r5 + 1
            goto L_0x0ac6
        L_0x0ad8:
            java.lang.Class<com.instagram.shopping.intf.productpicker.MultiProductPickerResult> r2 = com.instagram.shopping.intf.productpicker.MultiProductPickerResult.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.user.model.ProductCollection r1 = (com.instagram.user.model.ProductCollection) r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r2)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r0
            com.instagram.shopping.intf.productpicker.MultiProductPickerResult r8 = new com.instagram.shopping.intf.productpicker.MultiProductPickerResult
            r8.<init>(r0, r1, r6, r3)
            return r8
        L_0x0aec:
            java.lang.String r9 = X.C41848B3p.A1D(r0)
            X.0qQ.A0A(r9)
            java.lang.String r10 = r0.readString()
            X.0qQ.A0A(r10)
            java.lang.String r11 = r0.readString()
            X.0qQ.A0A(r11)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.readStringList(r1)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x0b11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0b29
            java.lang.Object r2 = r4.next()
            java.util.Map r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.A01
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L_0x0b25
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.UNRECOGNIZED
        L_0x0b25:
            r3.add(r1)
            goto L_0x0b11
        L_0x0b29:
            java.util.ArrayList r17 = r0.createStringArrayList()
            java.lang.String r12 = r0.readString()
            boolean r18 = X.C13991Tnr.A1W(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration r8 = new com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L_0x0b49:
            java.lang.String r18 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = ""
            if (r18 != 0) goto L_0x0b53
            r18 = r1
        L_0x0b53:
            java.lang.String r19 = r0.readString()
            if (r19 != 0) goto L_0x0b5b
            r19 = r1
        L_0x0b5b:
            java.lang.String r20 = r0.readString()
            if (r20 != 0) goto L_0x0b63
            r20 = r1
        L_0x0b63:
            java.lang.Class<com.instagram.model.shopping.productfeed.ProductTileMedia> r1 = com.instagram.model.shopping.productfeed.ProductTileMedia.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.productfeed.ProductTileMedia r11 = (com.instagram.model.shopping.productfeed.ProductTileMedia) r11
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Object r15 = X.Pxi.A0U(r0, r3)
            boolean r1 = r15 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0c48
            java.lang.Integer r15 = (java.lang.Integer) r15
        L_0x0b83:
            java.lang.Object r2 = X.Pxi.A0U(r0, r3)
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0c45
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0b8d:
            java.lang.String r24 = r0.readString()
            boolean r46 = X.C13991Tnr.A1W(r0)
            java.lang.String r25 = r0.readString()
            java.lang.Object r1 = X.Pxi.A0U(r0, r3)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0c42
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x0ba3:
            java.lang.Class<com.instagram.user.model.Product> r3 = com.instagram.user.model.Product.class
            android.os.Parcelable r14 = X.C41847B3o.A03(r0, r3)
            com.instagram.user.model.Product r14 = (com.instagram.user.model.Product) r14
            java.lang.String r26 = r0.readString()
            java.lang.String r27 = r0.readString()
            java.lang.String r28 = r0.readString()
            boolean r47 = X.C13991Tnr.A1W(r0)
            java.lang.String r29 = r0.readString()
            java.lang.Class<com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo> r3 = com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo.class
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r3)
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r13 = (com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo) r13
            boolean r48 = X.C13991Tnr.A1W(r0)
            java.lang.Class<com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo> r3 = com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r3)
            com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo r12 = (com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo) r12
            java.lang.String r30 = r0.readString()
            long r44 = r0.readLong()
            android.os.Bundle r9 = r0.readBundle()
            java.lang.Class<com.instagram.api.schemas.RankingInfo> r3 = com.instagram.api.schemas.RankingInfo.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.RankingInfo r10 = (com.instagram.api.schemas.RankingInfo) r10
            java.lang.String r31 = r0.readString()
            java.lang.String r32 = r0.readString()
            boolean r49 = X.C13991Tnr.A1W(r0)
            java.lang.String r33 = r0.readString()
            java.lang.String r34 = r0.readString()
            java.lang.String r35 = r0.readString()
            java.lang.String r36 = r0.readString()
            java.lang.String r37 = r0.readString()
            java.lang.String r38 = r0.readString()
            java.lang.String r39 = r0.readString()
            java.lang.String r3 = r0.readString()
            if (r3 == 0) goto L_0x0c40
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r3)
        L_0x0c1a:
            boolean r50 = X.C13991Tnr.A1W(r0)
            java.lang.String r40 = r0.readString()
            java.lang.String r41 = r0.readString()
            if (r41 != 0) goto L_0x0c30
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            java.lang.String r41 = r3.getID()
        L_0x0c30:
            java.lang.String r42 = r0.readString()
            com.instagram.shopping.intf.ProductDetailsPageArguments r8 = new com.instagram.shopping.intf.ProductDetailsPageArguments
            r17 = r1
            r43 = r4
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r47, r48, r49, r50)
            return r8
        L_0x0c40:
            r4 = 0
            goto L_0x0c1a
        L_0x0c42:
            r1 = 0
            goto L_0x0ba3
        L_0x0c45:
            r2 = 0
            goto L_0x0b8d
        L_0x0c48:
            r15 = 0
            goto L_0x0b83
        L_0x0c4b:
            int r4 = X.C41848B3p.A00(r0)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r4)
            r8 = 0
            r3 = 0
        L_0x0c56:
            if (r3 == r4) goto L_0x0c6a
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.3Yl r1 = X.C243363Yl.valueOf(r1)
            r7.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0c56
        L_0x0c6a:
            int r4 = r0.readInt()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r4)
            r3 = 0
        L_0x0c74:
            if (r3 == r4) goto L_0x0c88
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.3Ym r1 = X.C243373Ym.valueOf(r1)
            r6.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0c74
        L_0x0c88:
            int r4 = r0.readInt()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r4)
            r3 = 0
        L_0x0c92:
            if (r3 == r4) goto L_0x0ca6
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.3Ym r1 = X.C243373Ym.valueOf(r1)
            r5.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0c92
        L_0x0ca6:
            int r4 = r0.readInt()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r4)
        L_0x0caf:
            if (r8 == r4) goto L_0x0cc3
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.3Ym r1 = X.C243373Ym.valueOf(r1)
            r3.put(r2, r1)
            int r8 = r8 + 1
            goto L_0x0caf
        L_0x0cc3:
            com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState$LikeSaveStatus r8 = new com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState$LikeSaveStatus
            r8.<init>(r7, r6, r5, r3)
            return r8
        L_0x0cc9:
            int r2 = X.C41848B3p.A00(r0)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>(r2)
            r3 = 0
            r1 = 0
        L_0x0cd4:
            if (r1 == r2) goto L_0x0cdb
            int r1 = X.C13990Tnq.A07(r0, r9, r1)
            goto L_0x0cd4
        L_0x0cdb:
            int r2 = r0.readInt()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>(r2)
            r1 = 0
        L_0x0ce5:
            if (r1 == r2) goto L_0x0cec
            int r1 = X.C13990Tnq.A07(r0, r10, r1)
            goto L_0x0ce5
        L_0x0cec:
            int r2 = r0.readInt()
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>(r2)
            r1 = 0
        L_0x0cf6:
            if (r1 == r2) goto L_0x0cfd
            int r1 = X.C13990Tnq.A07(r0, r11, r1)
            goto L_0x0cf6
        L_0x0cfd:
            int r2 = r0.readInt()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>(r2)
            r1 = 0
        L_0x0d07:
            if (r1 == r2) goto L_0x0d0e
            int r1 = X.C13990Tnq.A07(r0, r12, r1)
            goto L_0x0d07
        L_0x0d0e:
            int r1 = r0.readInt()
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>(r1)
        L_0x0d17:
            if (r3 == r1) goto L_0x0d1e
            int r3 = X.C13990Tnq.A07(r0, r13, r3)
            goto L_0x0d17
        L_0x0d1e:
            com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState$HiddenIds r8 = new com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState$HiddenIds
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0d24:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState r8 = new com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState
            r8.<init>(r0)
            return r8
        L_0x0d2e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments> r6 = com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r6)
            com.instagram.user.model.Product r10 = (com.instagram.user.model.Product) r10
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            int r5 = r0.readInt()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r5)
            r3 = 0
        L_0x0d58:
            if (r3 == r5) goto L_0x0d68
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            r4.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0d58
        L_0x0d68:
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r6)
            com.instagram.api.schemas.RankingInfo r9 = (com.instagram.api.schemas.RankingInfo) r9
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            int r2 = r0.readInt()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>(r2)
            r1 = 0
        L_0x0d90:
            if (r1 == r2) goto L_0x0d97
            int r1 = X.C13990Tnq.A07(r0, r3, r1)
            goto L_0x0d90
        L_0x0d97:
            java.lang.String r22 = r0.readString()
            com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments r8 = new com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments
            r23 = r4
            r24 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r8
        L_0x0da5:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r28 = X.C41848B3p.A1X(r0)
            int r3 = r0.readInt()
            android.os.Parcelable[] r7 = new android.os.Parcelable[r3]
            r2 = 0
        L_0x0db4:
            java.lang.Class<com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments> r1 = com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments.class
            if (r2 == r3) goto L_0x0dc1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            r7[r2] = r1
            int r2 = r2 + 1
            goto L_0x0db4
        L_0x0dc1:
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.Product r10 = (com.instagram.user.model.Product) r10
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            int r6 = r0.readInt()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r6)
            r5 = 0
        L_0x0ded:
            if (r5 == r6) goto L_0x0dfd
            java.lang.String r3 = r0.readString()
            java.lang.String r2 = r0.readString()
            r4.put(r3, r2)
            int r5 = r5 + 1
            goto L_0x0ded
        L_0x0dfd:
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.RankingInfo r9 = (com.instagram.api.schemas.RankingInfo) r9
            int r2 = r0.readInt()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>(r2)
            r1 = 0
        L_0x0e21:
            if (r1 == r2) goto L_0x0e28
            int r1 = X.C13990Tnq.A07(r0, r3, r1)
            goto L_0x0e21
        L_0x0e28:
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            boolean r29 = X.C41848B3p.A1X(r0)
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r8 = new com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments
            r25 = r4
            r26 = r3
            r27 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r8
        L_0x0e40:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.Integer r0 = X.JTU.A0U(r0)
            com.instagram.settings2.core.view.SettingsScreenConfirmBottomSheetFragment$Item r8 = new com.instagram.settings2.core.view.SettingsScreenConfirmBottomSheetFragment$Item
            r8.<init>(r1, r0)
            return r8
        L_0x0e4e:
            int r1 = X.C41848B3p.A00(r0)
            r4 = 0
            if (r1 != 0) goto L_0x0ea2
            r9 = r4
        L_0x0e56:
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r9 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r9
            java.lang.Object r10 = A00(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r10 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r10
            java.lang.Object r11 = A00(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r11 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r11
            java.lang.Object r12 = A00(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r12 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r12
            java.lang.Object r13 = A00(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r13 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r13
            java.lang.Object r14 = A00(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r14 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r14
            java.lang.Object r15 = A00(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r15 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r15
            java.lang.Object r3 = A00(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r3 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r3
            java.lang.Object r2 = A00(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r2 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r2
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0e94
            android.os.Parcelable$Creator r1 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.CREATOR
            java.lang.Object r4 = r1.createFromParcel(r0)
        L_0x0e94:
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r4 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r4
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r8 = new com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel
            r17 = r2
            r18 = r4
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L_0x0ea2:
            android.os.Parcelable$Creator r1 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.CREATOR
            java.lang.Object r9 = r1.createFromParcel(r0)
            goto L_0x0e56
        L_0x0ea9:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r8 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.valueOf(r0)
            return r8
        L_0x0eb2:
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse$JobStatus[] r1 = com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse.JobStatus.values()
            int r0 = r0.readInt()
            r8 = r1[r0]
            return r8
        L_0x0ebd:
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse r8 = new com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse
            r8.<init>()
            java.lang.String r1 = r0.readString()
            r8.A03 = r1
            java.lang.String r1 = r0.readString()
            r8.A02 = r1
            java.lang.String r1 = r0.readString()
            r8.A01 = r1
            java.lang.Class<com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse$JobStatus> r1 = com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse.JobStatus.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse$JobStatus r0 = (com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse.JobStatus) r0
            r8.A00 = r0
            return r8
        L_0x0edf:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig r8 = new com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig
            r8.<init>(r0)
            return r8
        L_0x0ee9:
            java.lang.String r9 = X.C41848B3p.A1D(r0)
            java.lang.String r10 = r0.readString()
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig r8 = new com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0f07:
            java.lang.String r15 = X.C41848B3p.A1D(r0)
            java.lang.String r16 = r0.readString()
            int r1 = r0.readInt()
            r10 = 0
            if (r1 != 0) goto L_0x0f33
            r11 = r10
        L_0x0f17:
            java.lang.Integer r13 = X.Dbc.A0C(r0)
            java.lang.Integer r14 = X.Dbc.A0C(r0)
            int r4 = r0.readInt()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r1 = 0
            r3 = 0
        L_0x0f2a:
            if (r3 == r4) goto L_0x0f3c
            android.os.Parcelable$Creator r2 = com.instagram.schools.management.data.SchoolInfo.CREATOR
            int r3 = X.JTT.A04(r0, r2, r5, r3)
            goto L_0x0f2a
        L_0x0f33:
            java.lang.String r1 = r0.readString()
            X.HM6 r11 = X.HM6.valueOf(r1)
            goto L_0x0f17
        L_0x0f3c:
            int r6 = r0.readInt()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r6)
            r3 = 0
        L_0x0f46:
            if (r3 == r6) goto L_0x0f4f
            android.os.Parcelable$Creator r2 = com.instagram.schools.management.data.SchoolInfo.CREATOR
            int r3 = X.JTT.A04(r0, r2, r4, r3)
            goto L_0x0f46
        L_0x0f4f:
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            boolean r24 = X.C41848B3p.A1X(r0)
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x0f6d
            java.lang.String r2 = r0.readString()
            X.HM5 r10 = X.HM5.valueOf(r2)
        L_0x0f6d:
            java.lang.String r2 = r0.readString()
            X.HLs r12 = X.C54635HLs.valueOf(r2)
            boolean r25 = X.C41848B3p.A1X(r0)
            java.lang.String r20 = r0.readString()
            java.lang.String r2 = r0.readString()
            X.HOd r9 = X.C54672HOd.valueOf(r2)
            int r2 = r0.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
        L_0x0f8e:
            if (r1 == r2) goto L_0x0f9e
            java.lang.String r6 = r0.readString()
            X.HMD r6 = X.HMD.valueOf(r6)
            r3.add(r6)
            int r1 = r1 + 1
            goto L_0x0f8e
        L_0x0f9e:
            com.instagram.schools.management.data.SchoolOnboardingParcelData r8 = new com.instagram.schools.management.data.SchoolOnboardingParcelData
            r21 = r5
            r22 = r4
            r23 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r8
        L_0x0faa:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            android.os.Parcelable$Creator r1 = com.instagram.schools.management.data.SchoolAddress.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            com.instagram.schools.management.data.SchoolAddress r0 = (com.instagram.schools.management.data.SchoolAddress) r0
            com.instagram.schools.management.data.SchoolInfo r8 = new com.instagram.schools.management.data.SchoolInfo
            r8.<init>(r0, r3, r2)
            return r8
        L_0x0fc0:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.schools.management.data.SchoolAddress r8 = new com.instagram.schools.management.data.SchoolAddress
            r8.<init>(r2, r1, r0)
            return r8
        L_0x0fd2:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.Uya r2 = X.C16638Uya.valueOf(r1)
            java.lang.String r1 = r0.readString()
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.schools.management.data.BadgeVisibilitySettingItem r8 = new com.instagram.schools.management.data.BadgeVisibilitySettingItem
            r8.<init>(r2, r1, r0)
            return r8
        L_0x0fe8:
            com.instagram.save.model.SavedCollection r8 = new com.instagram.save.model.SavedCollection
            r8.<init>()
            X.HMw r4 = X.C54665HMw.MEDIA
            r8.A07 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0L = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0M = r1
            r3 = 0
            r8.A06 = r3
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r8.A0B = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0K = r1
            r8.A02 = r3
            r8.A0I = r3
            r8.A0N = r2
            java.lang.String r1 = r0.readString()
            r8.A0F = r1
            java.lang.String r1 = r0.readString()
            r8.A0G = r1
            java.lang.String r1 = r0.readString()
            r8.A0H = r1
            java.lang.String r3 = r0.readString()
            java.util.Map r2 = X.C54665HMw.A02
            if (r3 != 0) goto L_0x1090
            java.lang.String r1 = ""
        L_0x1032:
            java.lang.Object r1 = r2.get(r1)
            if (r1 != 0) goto L_0x1044
            java.lang.String r1 = "Can't parse type "
            java.lang.String r2 = X.002.A0R(r1, r3)
            java.lang.String r1 = "SavedCollectionType"
            X.0wb.A03(r1, r2)
            r1 = r4
        L_0x1044:
            X.HMw r1 = (X.C54665HMw) r1
            r8.A07 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.readStringList(r1)
            r8.A0K = r1
            int r2 = r0.readInt()
            r1 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.A09 = r1
            boolean r1 = X.Pxg.A1V(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.A0C = r1
            java.lang.Class<com.instagram.save.model.CollaborativeCollectionMetadata> r1 = com.instagram.save.model.CollaborativeCollectionMetadata.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.save.model.CollaborativeCollectionMetadata r1 = (com.instagram.save.model.CollaborativeCollectionMetadata) r1
            r8.A05 = r1
            java.lang.Class<com.instagram.api.schemas.CollectionPrivacyModeEnum> r1 = com.instagram.api.schemas.CollectionPrivacyModeEnum.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.CollectionPrivacyModeEnum r1 = (com.instagram.api.schemas.CollectionPrivacyModeEnum) r1
            r8.A00 = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r1 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r8.A02 = r1
            java.lang.String r0 = r0.readString()
            r8.A0I = r0
            return r8
        L_0x1090:
            r1 = r3
            goto L_0x1032
        L_0x1092:
            int r4 = X.C41848B3p.A00(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x109c:
            if (r2 == r4) goto L_0x10a6
            java.lang.Class<com.instagram.save.model.CollaborativeCollectionMetadata> r1 = com.instagram.save.model.CollaborativeCollectionMetadata.class
            X.C41848B3p.A1J(r0, r1, r3)
            int r2 = r2 + 1
            goto L_0x109c
        L_0x10a6:
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            X.AnonymousClass7TG.A1Q(r1, r0)
            com.instagram.save.model.CollaborativeCollectionMetadata r8 = new com.instagram.save.model.CollaborativeCollectionMetadata
            r8.<init>()
            r8.A02 = r3
            r8.A01 = r1
            r8.A00 = r0
            return r8
        L_0x10bd:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig> r1 = com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.save.model.SavedCollection r1 = (com.instagram.save.model.SavedCollection) r1
            java.lang.String r0 = r0.readString()
            com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig r8 = new com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig
            r8.<init>(r1, r0)
            return r8
        L_0x10d3:
            java.lang.String r4 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r3 = 1
            boolean r2 = X.AnonymousClass7TF.A1P(r1)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x10e7
            r3 = 0
        L_0x10e7:
            java.io.Serializable r0 = r0.readSerializable()
            X.0jB r0 = (X.0jB) r0
            com.instagram.save.analytics.SaveToCollectionsParentInsightsHost r8 = new com.instagram.save.analytics.SaveToCollectionsParentInsightsHost
            r8.<init>(r0, r4, r2, r3)
            return r8
        L_0x10f3:
            java.lang.String r11 = X.C41848B3p.A1D(r0)
            java.lang.String r12 = r0.readString()
            java.lang.Long r10 = X.C13992Tns.A0D(r0)
            int r16 = r0.readInt()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.Class<com.instagram.rtc.statemodel.RtcSettingsParticipant> r1 = com.instagram.rtc.statemodel.RtcSettingsParticipant.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r9 = (com.instagram.common.typedurl.ImageUrl) r9
            java.util.ArrayList r15 = r0.createStringArrayList()
            boolean r17 = X.C41848B3p.A1X(r0)
            boolean r18 = X.C41848B3p.A1X(r0)
            boolean r19 = X.C41848B3p.A1X(r0)
            com.instagram.rtc.statemodel.RtcSettingsParticipant r8 = new com.instagram.rtc.statemodel.RtcSettingsParticipant
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r8
        L_0x1129:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.NjG r10 = X.C69315NjG.valueOf(r1)
            java.lang.String r14 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.Integer r11 = X.ABH.A00(r1)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r12 = X.ABF.A00(r1)
            java.lang.String r15 = r0.readString()
            java.lang.Class<com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity> r1 = com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallGenericConnectionEntity.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.rtc.RtcIgNotification r9 = (com.instagram.model.rtc.RtcIgNotification) r9
            java.lang.Long r13 = X.C13992Tns.A0D(r0)
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity r8 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L_0x1167:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.NjG r13 = X.C69315NjG.valueOf(r1)
            java.lang.String r18 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.Integer r15 = X.ABH.A00(r1)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r16 = X.ABF.A00(r1)
            java.lang.String r19 = r0.readString()
            java.lang.Class<com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity> r1 = com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.rtc.RtcIgNotification r12 = (com.instagram.model.rtc.RtcIgNotification) r12
            java.lang.Long r17 = X.C13992Tns.A0D(r0)
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            java.lang.String r25 = r0.readString()
            java.lang.String r26 = r0.readString()
            java.lang.String r27 = r0.readString()
            java.lang.String r28 = r0.readString()
            java.lang.String r2 = r0.readString()
            X.Nid r9 = X.C69277Nid.valueOf(r2)
            boolean r29 = X.C41848B3p.A1X(r0)
            java.lang.String r2 = r0.readString()
            X.Nie r10 = X.C69278Nie.valueOf(r2)
            boolean r30 = X.C41848B3p.A1X(r0)
            boolean r31 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r14 = X.C41847B3o.A03(r0, r1)
            com.instagram.video.common.events.IgRtcEventHeader r14 = (com.instagram.video.common.events.IgRtcEventHeader) r14
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.rtc.RtcCallKey r11 = (com.instagram.model.rtc.RtcCallKey) r11
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r8 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r8
        L_0x11e5:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.NjG r11 = X.C69315NjG.valueOf(r1)
            java.lang.String r15 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.Integer r12 = X.ABH.A00(r1)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r13 = X.ABF.A00(r1)
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity> r1 = com.instagram.rtc.signaling.models.RtcConnectionEntity.LiveInviteConnectionEntity.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.rtc.RtcIgNotification r10 = (com.instagram.model.rtc.RtcIgNotification) r10
            java.lang.Long r14 = X.C13992Tns.A0D(r0)
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r9 = (com.instagram.common.typedurl.ImageUrl) r9
            com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity r8 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r8
        L_0x122d:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.NjG r11 = X.C69315NjG.valueOf(r1)
            java.lang.String r16 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.Integer r12 = X.ABH.A00(r1)
            java.lang.String r1 = r0.readString()
            java.lang.Integer r13 = X.ABF.A00(r1)
            java.lang.String r17 = r0.readString()
            java.lang.Class<com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity> r1 = com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.rtc.RtcIgNotification r10 = (com.instagram.model.rtc.RtcIgNotification) r10
            int r1 = r0.readInt()
            r15 = 0
            if (r1 == 0) goto L_0x1260
            java.lang.Long r15 = X.Pxi.A0T(r0)
        L_0x1260:
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            boolean r25 = X.C41848B3p.A1X(r0)
            java.lang.Integer r14 = X.C13991Tnr.A0W(r0)
            java.lang.String r1 = r0.readString()
            X.Nid r9 = X.C69277Nid.valueOf(r1)
            boolean r26 = X.C41848B3p.A1X(r0)
            com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity r8 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r8
        L_0x1296:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString r8 = new com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString
            r8.<init>(r0)
            return r8
        L_0x12a0:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId> r1 = com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            android.os.ParcelUuid r0 = (android.os.ParcelUuid) r0
            com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId r8 = new com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId
            r8.<init>(r0)
            return r8
        L_0x12b2:
            java.lang.String r4 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r3 = 1
            boolean r2 = X.AnonymousClass7TF.A1P(r1)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x12c6
            r3 = 0
        L_0x12c6:
            java.lang.String r0 = r0.readString()
            com.instagram.rtc.activity.RtcIncomingParams r8 = new com.instagram.rtc.activity.RtcIncomingParams
            r8.<init>(r4, r0, r2, r3)
            return r8
        L_0x12d0:
            com.instagram.registration.model.UserBirthDate r8 = new com.instagram.registration.model.UserBirthDate
            r8.<init>()
            int r1 = r0.readInt()
            r8.A02 = r1
            int r1 = r0.readInt()
            r8.A01 = r1
            int r0 = r0.readInt()
            r8.A00 = r0
            return r8
        L_0x12e8:
            com.instagram.registration.model.RegFlowExtras r8 = new com.instagram.registration.model.RegFlowExtras
            r8.<init>()
            r2 = 0
            r8.A0u = r2
            r8.A0m = r2
            java.lang.ClassLoader r7 = X.Pxf.A0W(r8)
            android.os.Parcelable r1 = r0.readParcelable(r7)
            com.instagram.phonenumber.model.CountryCodeData r1 = (com.instagram.phonenumber.model.CountryCodeData) r1
            r8.A01 = r1
            java.lang.String r1 = r0.readString()
            r8.A0R = r1
            java.lang.String r1 = r0.readString()
            r8.A0Q = r1
            java.lang.String r1 = r0.readString()
            r8.A08 = r1
            java.lang.String r1 = r0.readString()
            r8.A0O = r1
            java.lang.String r1 = r0.readString()
            r8.A0Z = r1
            java.lang.String r1 = r0.readString()
            r8.A0W = r1
            java.lang.String r1 = r0.readString()
            r8.A0P = r1
            java.lang.String r1 = r0.readString()
            r8.A05 = r1
            java.lang.String r1 = r0.readString()
            r8.A0B = r1
            java.lang.String r1 = r0.readString()
            r8.A0D = r1
            java.lang.String r1 = r0.readString()
            r8.A0C = r1
            java.lang.String r1 = r0.readString()
            r8.A0X = r1
            long r3 = r0.readLong()
            r8.A00 = r3
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0n = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A10 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0h = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0q = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0w = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0g = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A12 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0s = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0v = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0k = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0u = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A11 = r1
            android.os.Parcelable r1 = r0.readParcelable(r7)
            com.instagram.registration.model.UserBirthDate r1 = (com.instagram.registration.model.UserBirthDate) r1
            r8.A03 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.A0e = r1
            r0.readStringList(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.readStringList(r3)
            java.util.ArrayList r1 = X.Pxg.A14(r3)
            r8.A0f = r1
            java.util.Iterator r4 = r3.iterator()
        L_0x13b8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x13d2
            java.lang.String r1 = X.AnonymousClass7TE.A18(r4)
            java.util.List r3 = r8.A0f
            X.16F r1 = X.16P.A00(r1)     // Catch:{ IOException -> 0x13cd }
            X.Ewr r1 = X.C49113Epc.parseFromJson(r1)     // Catch:{ IOException -> 0x13cd }
            goto L_0x13ce
        L_0x13cd:
            r1 = 0
        L_0x13ce:
            r3.add(r1)
            goto L_0x13b8
        L_0x13d2:
            int r6 = r0.readInt()
            if (r6 < 0) goto L_0x13fb
            X.Vis r1 = new X.Vis
            r1.<init>()
            r8.A02 = r1
            r5 = 0
        L_0x13e0:
            if (r5 >= r6) goto L_0x13fb
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.readList(r4, r7)
            X.Vis r1 = r8.A02
            java.util.List r3 = r1.A00
            X.Vir r1 = new X.Vir
            r1.<init>()
            r1.A00 = r4
            r3.add(r1)
            int r5 = r5 + 1
            goto L_0x13e0
        L_0x13fb:
            java.lang.String r1 = r0.readString()
            r8.A0S = r1
            java.lang.String r1 = r0.readString()
            r8.A0N = r1
            java.lang.String r1 = r0.readString()
            r8.A0V = r1
            java.lang.String r1 = r0.readString()
            r8.A07 = r1
            java.lang.String r1 = r0.readString()
            r8.A06 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0l = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0x = r1
            java.lang.String r1 = r0.readString()
            r8.A0Y = r1
            java.lang.String r1 = r0.readString()
            r8.A0A = r1
            java.lang.String r1 = r0.readString()
            r8.A04 = r1
            java.lang.String r1 = r0.readString()
            r8.A0T = r1
            java.lang.String r1 = r0.readString()
            r8.A0U = r1
            java.lang.String r1 = r0.readString()
            r8.A0J = r1
            java.lang.String r1 = r0.readString()
            r8.A0M = r1
            java.lang.String r1 = r0.readString()
            r8.A09 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0r = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0m = r1
            java.lang.String r1 = r0.readString()
            r8.A0b = r1
            java.lang.String r1 = r0.readString()
            r8.A0d = r1
            java.lang.String r1 = r0.readString()
            r8.A0c = r1
            java.lang.String r1 = r0.readString()
            r8.A0a = r1
            java.lang.String r1 = r0.readString()
            r8.A0H = r1
            java.lang.String r1 = r0.readString()
            r8.A0G = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0t = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0y = r1
            java.lang.String r1 = r0.readString()
            r8.A0K = r1
            java.lang.String r1 = r0.readString()
            r8.A0L = r1
            java.lang.String r1 = r0.readString()
            r8.A0I = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0z = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0i = r1
            java.lang.String r1 = r0.readString()
            r8.A0E = r1
            java.lang.String r1 = r0.readString()
            r8.A0F = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0o = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r8.A0p = r1
            byte r0 = r0.readByte()
            if (r0 == 0) goto L_0x14ce
            r2 = 1
        L_0x14ce:
            r8.A0j = r2
            return r8
        L_0x14d1:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = com.instagram.reels.smb.model.ProfileStickerModel.CREATOR
            java.lang.Class<com.instagram.reels.smb.model.ProfileStickerModel> r1 = com.instagram.reels.smb.model.ProfileStickerModel.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            java.lang.String r1 = r0.readString()
            X.16F r1 = X.16P.A00(r1)
            X.6nz r9 = X.C369248u6.parseFromJson(r1)
            X.0qQ.A07(r9)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "BLACK"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x1536
            java.lang.Integer r12 = X.AnonymousClass05K.A00
        L_0x14fc:
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "BUSINESS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x1520
            java.lang.Integer r13 = X.AnonymousClass05K.A00
        L_0x150a:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x1519
            r10 = 0
        L_0x1511:
            com.instagram.reels.smb.model.ProfileStickerAiAgentData r10 = (com.instagram.reels.smb.model.ProfileStickerAiAgentData) r10
            com.instagram.reels.smb.model.ProfileStickerModel r8 = new com.instagram.reels.smb.model.ProfileStickerModel
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x1519:
            android.os.Parcelable$Creator r1 = com.instagram.reels.smb.model.ProfileStickerAiAgentData.CREATOR
            java.lang.Object r10 = r1.createFromParcel(r0)
            goto L_0x1511
        L_0x1520:
            java.lang.String r1 = "PERSONAL"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x152b
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            goto L_0x150a
        L_0x152b:
            java.lang.String r1 = "AI_AGENT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x1541
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            goto L_0x150a
        L_0x1536:
            java.lang.String r1 = "BLUE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x1547
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            goto L_0x14fc
        L_0x1541:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x1547:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x154d:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.Class<com.instagram.reels.smb.model.ProfileStickerAiAgentData> r1 = com.instagram.reels.smb.model.ProfileStickerAiAgentData.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.IGAIAgentType r9 = (com.instagram.api.schemas.IGAIAgentType) r9
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            com.instagram.reels.smb.model.ProfileStickerAiAgentData r8 = new com.instagram.reels.smb.model.ProfileStickerAiAgentData
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x156f:
            int r1 = X.C41848B3p.A00(r0)
            r3 = 0
            r2 = 0
            if (r1 != 0) goto L_0x15bd
            r11 = r2
        L_0x1578:
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.instagram.reels.questionv2.model.QuestionMediaResponseModel> r4 = com.instagram.reels.questionv2.model.QuestionMediaResponseModel.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r4)
            com.instagram.model.mediasize.ImageInfo r9 = (com.instagram.model.mediasize.ImageInfo) r9
            java.lang.Integer r12 = X.Dbc.A0C(r0)
            java.lang.Integer r13 = X.Dbc.A0C(r0)
            java.lang.Integer r14 = X.Dbc.A0C(r0)
            java.lang.Integer r15 = X.Dbc.A0C(r0)
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r4)
            com.instagram.model.mediasize.SpritesheetInfo r10 = (com.instagram.model.mediasize.SpritesheetInfo) r10
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x15c6
            int r1 = r0.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x15b5:
            if (r3 == r1) goto L_0x15c6
            X.C41848B3p.A1J(r0, r4, r2)
            int r3 = r3 + 1
            goto L_0x15b5
        L_0x15bd:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            goto L_0x1578
        L_0x15c6:
            com.instagram.reels.questionv2.model.QuestionMediaResponseModel r8 = new com.instagram.reels.questionv2.model.QuestionMediaResponseModel
            r20 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r8
        L_0x15ce:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            java.lang.Long r11 = X.C13992Tns.A0D(r0)
            java.lang.String r13 = r0.readString()
            int r1 = r0.readInt()
            r4 = 0
            boolean r20 = X.AnonymousClass7TF.A1P(r1)
            java.lang.String r14 = r0.readString()
            java.lang.Class<com.instagram.reels.question.model.QuestionResponsesModel> r1 = com.instagram.reels.question.model.QuestionResponsesModel.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.String r15 = r0.readString()
            int r18 = r0.readInt()
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.instagram.reels.question.constants.QuestionStickerType r9 = (com.instagram.reels.question.constants.QuestionStickerType) r9
            int r3 = r0.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
        L_0x1606:
            if (r4 == r3) goto L_0x160f
            android.os.Parcelable$Creator r1 = com.instagram.reels.question.model.QuestionResponseModel.CREATOR
            int r4 = X.JTT.A04(r0, r1, r2, r4)
            goto L_0x1606
        L_0x160f:
            java.lang.String r16 = r0.readString()
            int r19 = r0.readInt()
            com.instagram.reels.question.model.QuestionResponsesModel r8 = new com.instagram.reels.question.model.QuestionResponsesModel
            r17 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r8
        L_0x161f:
            int r19 = X.C41848B3p.A00(r0)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.instagram.reels.question.model.QuestionResponseReshareModel> r2 = com.instagram.reels.question.model.QuestionResponseReshareModel.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r2)
            com.instagram.reels.question.model.responsetype.QuestionResponseType r10 = (com.instagram.reels.question.model.responsetype.QuestionResponseType) r10
            java.lang.String r17 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x1664
            r9 = 0
        L_0x1642:
            com.instagram.reels.question.model.MusicQuestionResponseModel r9 = (com.instagram.reels.question.model.MusicQuestionResponseModel) r9
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r2)
            com.instagram.reels.questionv2.model.QuestionMediaResponseModel r11 = (com.instagram.reels.questionv2.model.QuestionMediaResponseModel) r11
            java.lang.String r18 = r0.readString()
            boolean r20 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r2)
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r2)
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            com.instagram.reels.question.model.QuestionResponseReshareModel r8 = new com.instagram.reels.question.model.QuestionResponseReshareModel
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r8
        L_0x1664:
            android.os.Parcelable$Creator r1 = com.instagram.reels.question.model.MusicQuestionResponseModel.CREATOR
            java.lang.Object r9 = r1.createFromParcel(r0)
            goto L_0x1642
        L_0x166b:
            int r1 = X.C41848B3p.A00(r0)
            r3 = 1
            boolean r18 = X.AnonymousClass7TF.A1P(r1)
            java.lang.String r15 = r0.readString()
            java.lang.Class<com.instagram.reels.question.model.QuestionResponseModel> r2 = com.instagram.reels.question.model.QuestionResponseModel.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r2)
            com.instagram.reels.questionv2.model.QuestionMediaResponseModel r11 = (com.instagram.reels.questionv2.model.QuestionMediaResponseModel) r11
            int r1 = r0.readInt()
            r14 = 0
            if (r1 != 0) goto L_0x16c5
            r9 = r14
        L_0x1688:
            com.instagram.reels.question.model.MusicQuestionResponseModel r9 = (com.instagram.reels.question.model.MusicQuestionResponseModel) r9
            java.lang.String r16 = r0.readString()
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r2)
            com.instagram.reels.question.model.responsetype.QuestionResponseType r10 = (com.instagram.reels.question.model.responsetype.QuestionResponseType) r10
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x16bc
            r13 = r14
        L_0x169b:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x16ac
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x16a8
            r3 = 0
        L_0x16a8:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
        L_0x16ac:
            int r17 = r0.readInt()
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r2)
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            com.instagram.reels.question.model.QuestionResponseModel r8 = new com.instagram.reels.question.model.QuestionResponseModel
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L_0x16bc:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            goto L_0x169b
        L_0x16c5:
            android.os.Parcelable$Creator r1 = com.instagram.reels.question.model.MusicQuestionResponseModel.CREATOR
            java.lang.Object r9 = r1.createFromParcel(r0)
            goto L_0x1688
        L_0x16cc:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.reels.question.model.MusicQuestionResponseModel> r2 = com.instagram.reels.question.model.MusicQuestionResponseModel.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.TrackData r1 = (com.instagram.api.schemas.TrackData) r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r2)
            com.instagram.music.common.model.MusicConsumptionModel r0 = (com.instagram.music.common.model.MusicConsumptionModel) r0
            com.instagram.reels.question.model.MusicQuestionResponseModel r8 = new com.instagram.reels.question.model.MusicQuestionResponseModel
            r8.<init>(r1, r0)
            return r8
        L_0x16e4:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.reels.profilecard.model.ProfileCardStickerModel> r1 = com.instagram.reels.profilecard.model.ProfileCardStickerModel.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = (com.instagram.music.common.model.MusicOverlayStickerModel) r0
            com.instagram.reels.profilecard.model.ProfileCardStickerModel r8 = new com.instagram.reels.profilecard.model.ProfileCardStickerModel
            r8.<init>(r0, r3, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W6F.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ProfileCardStickerModel[i];
            case 1:
                return new MusicQuestionResponseModel[i];
            case 2:
                return new QuestionResponseModel[i];
            case 3:
                return new QuestionResponseReshareModel[i];
            case 4:
                return new QuestionResponsesModel[i];
            case 5:
                return new QuestionMediaResponseModel[i];
            case 6:
                return new ProfileStickerAiAgentData[i];
            case 7:
                return new ProfileStickerModel[i];
            case 8:
                return new RegFlowExtras[i];
            case 9:
                return new UserBirthDate[i];
            case 10:
                return new RtcIncomingParams[i];
            case 11:
                return new RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString[i];
            case 13:
                return new RtcConnectionEntity.EndCallConnectionEntity[i];
            case 14:
                return new RtcConnectionEntity.LiveInviteConnectionEntity[i];
            case 15:
                return new RtcConnectionEntity.RtcCallConnectionEntity[i];
            case 16:
                return new RtcConnectionEntity.RtcCallGenericConnectionEntity[i];
            case 17:
                return new RtcSettingsParticipant[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new SaveToCollectionsParentInsightsHost[i];
            case 19:
                return new SavedContextualFeedNetworkConfig[i];
            case 20:
                return new CollaborativeCollectionMetadata[i];
            case 21:
                return new SavedCollection[i];
            case 22:
                return new BadgeVisibilitySettingItem[i];
            case 23:
                return new SchoolAddress[i];
            case 24:
                return new SchoolInfo[i];
            case 25:
                return new SchoolOnboardingParcelData[i];
            case 26:
                return new SerpContextualFeedConfig[i];
            case 27:
                return new KeywordSerpContextualFeedConfig[i];
            case 28:
                return new DataDownloadStatusCheckResponse[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new DataDownloadStatusCheckResponse.JobStatus[i];
            case 30:
                return new DirectMessageInteropReachabilityOptions[i];
            case 31:
                return new DirectMessagesInteropOptionsViewModel[i];
            case 32:
                return new SettingsScreenConfirmBottomSheetFragment$Item[i];
            case 33:
                return new LightboxArguments[i];
            case 34:
                return new MediaGridArguments[i];
            case 35:
                return new ShoppingHomeState[i];
            case 36:
                return new ShoppingHomeState.HiddenIds[i];
            case 37:
                return new ShoppingHomeState.LikeSaveStatus[i];
            case 38:
                return new ProductDetailsPageArguments[i];
            case 39:
                return new FeaturedProductMediaFeedGridConfiguration[i];
            case 40:
                return new MultiProductPickerResult[i];
            case Seq.NULL_REFNUM /*41*/:
                return new ProductPickerArguments[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new ShoppingTaggingFeedArguments[i];
            case 43:
                return new ShippingAndReturnsSection[i];
            case 44:
                return new ProductDetailsPageLoggingInfo[i];
            case 45:
                return new ShoppingGuideLoggingInfo[i];
            case 46:
                return new ShoppingNavigationInfo[i];
            case 47:
                return new ShoppingSearchLoggingInfo[i];
            case 48:
                return new ProductCollectionShareInfo[i];
            case 49:
                return new DestinationContentType[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new DestinationItemLabelType[i];
            case 51:
                return new DestinationSignalType[i];
            case 52:
                return new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel[i];
            case 53:
                return new SecondaryTextContent[i];
            case 54:
                return new ProductSourceOverrideState[i];
            case 55:
                return new ProductSourceOverrideStatus[i];
            case 56:
                return new ShoppingReconFeedEndpoint.ReconDestinationFeedEndpoint[i];
            case 57:
                return new ShopShareInfo[i];
            case 58:
                return new ProductCollectionFeedTaggingMeta[i];
            case 59:
                return new ShoppingTaggingFeedClientState[i];
            case 60:
                return new ShoppingTaggingFeedHeader[i];
            case 61:
                return new SourceType[i];
            case 62:
                return new TaggingFeedMultiSelectState[i];
            case 63:
                return new VariantSelectorModel[i];
            case 64:
                return new SimpleWebViewConfig[i];
            case 65:
                return new SourceModelInfoParams[i];
            case 66:
                return new AdsBizBadgeInfoImpl[i];
            case 67:
                return new AdsCTATrustInfo[i];
            case 68:
                return new AdsIAWRatingInfo[i];
            case 69:
                return new AdsRatingInfo[i];
            case 70:
                return new AdsTextTrustInfo[i];
            case 71:
                return new MediaTaggingInfo[i];
            case 72:
                return new MediaSuggestedProductTagProductItemContainer[i];
            case 73:
                return new TagsInteractiveLayout.UnnamedTagSavedState[i];
            case 74:
                return new TrialMetricsData[i];
            case 75:
                return new MixedAttributionModel[i];
            case 76:
                return new MixedAttributionModel.MixedAttributionType[i];
            case 77:
                return new ColorTint[i];
            case 78:
                return new IconConfig.IconWithTextConfig[i];
            case 79:
                return new IconConfig.SimpleIconConfig[i];
            case 80:
                return new InfoItem[i];
            case 81:
                return new PrimerBottomSheetConfig[i];
            case 82:
                return new TitleIcon[i];
            case 83:
                return new SlideCardViewModel[i];
            case 84:
                return new SlideCardViewModel.SlideCardSectionViewModel[i];
            case 85:
                return new CountryCodeTextView.SavedState[i];
            case 86:
                return new UpcomingEventReminderAction[i];
            case 87:
                return new ProductCollectionImpl[i];
            case 88:
                return new ProductWrapper[i];
            case 89:
                return new ScheduledLiveProductsMetadata[i];
            case 90:
                return new UnavailableProductImpl[i];
            case 91:
                return new UpcomingDropCampaignEventMetadataImpl[i];
            case 92:
                return new UpcomingEventImpl[i];
            case 93:
                return new UpcomingEventLiveMetadataImpl[i];
            case 94:
                return new FollowListData[i];
            case 95:
                return new SocialContextFollowListFragmentConfig[i];
            case 96:
                return new ImageManager$ImageListParam[i];
            case 97:
                return new IgRtcEventHeader[i];
            case 98:
                return new VideoFeedType[i];
            default:
                return new ExistingStandaloneFundraiserForFeedModel[i];
        }
    }
}
