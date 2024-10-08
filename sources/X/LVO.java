package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBanner;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerBottomSheetContent;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerButton;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionTagInfo;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionFooterLink;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl;
import com.instagram.model.shopping.reels.ProductShareConfig;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadata;
import com.instagram.model.shopping.sizechart.SizeChart;
import com.instagram.model.shopping.sizechart.SizeChartMeasurement;
import com.instagram.model.shopping.sizechart.SizeChartRow;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.model.simpleplace.SimplePlace;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.LyricsPhrase;
import com.instagram.music.common.model.MusicAssetBeatInfo;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicBrowserCategoryModel;
import com.instagram.music.common.model.MusicModelEffectPair;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.music.common.model.WordOffset;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.newsfeed.model.PillsFilterCategory;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.ContentText;
import com.instagram.nux.cal.model.DpActionContent;
import com.instagram.nux.cal.model.FXCalAgeInfo;
import com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent;
import com.instagram.nux.cal.model.FxAccountInfo;
import com.instagram.nux.cal.model.NuxConnectResponse;
import com.instagram.nux.cal.model.SignupContent;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.payments.checkout.model.CheckoutData;
import com.instagram.pendingmedia.model.AllUserStoryTarget;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import com.instagram.pendingmedia.model.GroupProfileUserStoryTarget;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.profile.bindergroup.AccountLinkModel;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.MultipleLinksEditModel;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent;
import com.instagram.reels.memories.model.MemoryItem;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class LVO implements Parcelable.Creator {
    public final int A00;

    public LVO(int i) {
        this.A00 = i;
    }

    public static LVO A00(int i) {
        return new LVO(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.os.Parcel} */
    /* JADX WARNING: type inference failed for: r10v21, types: [java.lang.Object, com.instagram.pendingmedia.model.GroupUserStoryTarget] */
    /* JADX WARNING: type inference failed for: r10v22, types: [com.instagram.pendingmedia.model.GroupProfileUserStoryTarget, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v23, types: [com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v24, types: [com.instagram.pendingmedia.model.BrandedContentTag, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v25, types: [java.lang.Object, com.instagram.pendingmedia.model.AllUserStoryTarget] */
    /* JADX WARNING: type inference failed for: r10v26, types: [com.instagram.payments.checkout.model.CheckoutData, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v30, types: [com.instagram.nux.cal.model.SignupContent, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v32, types: [com.instagram.nux.cal.model.FxAccountInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v33, types: [com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v35, types: [com.instagram.nux.cal.model.DpActionContent, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v36, types: [com.instagram.nux.cal.model.ContentText, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v41, types: [com.instagram.music.common.model.TrackSnippet, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v45, types: [com.instagram.music.common.model.MusicModelEffectPair, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v46, types: [com.instagram.music.common.model.MusicBrowserCategoryModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v47, types: [com.instagram.music.common.model.MusicBrowseCategory, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v48, types: [com.instagram.music.common.model.MusicAssetModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v55, types: [com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v57, types: [com.instagram.model.simpleplace.SimplePlace, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v58, types: [java.lang.Object, com.instagram.model.shopping.video.ShoppingCreationConfig] */
    /* JADX WARNING: type inference failed for: r10v59, types: [java.lang.Object, com.instagram.model.shopping.sizechart.SizeChartRow] */
    /* JADX WARNING: type inference failed for: r10v60, types: [com.instagram.model.shopping.sizechart.SizeChartMeasurement, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v61, types: [java.lang.Object, com.instagram.model.shopping.sizechart.SizeChart] */
    /* JADX WARNING: type inference failed for: r10v72, types: [java.lang.Object, com.instagram.model.shopping.reels.InstagramShopLink] */
    /* JADX WARNING: type inference failed for: r10v76, types: [com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v77, types: [com.instagram.model.shopping.productfeed.ProductTileMedia, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v78, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductTile] */
    /* JADX WARNING: type inference failed for: r10v80, types: [com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v81, types: [com.instagram.model.shopping.productfeed.ProductCollectionTile, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v83, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductCollectionFooterLink] */
    /* JADX WARNING: type inference failed for: r10v98, types: [com.instagram.reels.memories.model.MemoryItem, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v373, types: [X.CvU, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r65) {
        /*
            r64 = this;
            r2 = r64
            int r1 = r2.A00
            r0 = r65
            switch(r1) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0058;
                case 2: goto L_0x0067;
                case 3: goto L_0x0076;
                case 4: goto L_0x0084;
                case 5: goto L_0x0093;
                case 6: goto L_0x00cd;
                case 7: goto L_0x00df;
                case 8: goto L_0x00e9;
                case 9: goto L_0x0126;
                case 10: goto L_0x013e;
                case 11: goto L_0x0154;
                case 12: goto L_0x017a;
                case 13: goto L_0x0180;
                case 14: goto L_0x0197;
                case 15: goto L_0x01b7;
                case 16: goto L_0x01ed;
                case 17: goto L_0x0240;
                case 18: goto L_0x027f;
                case 19: goto L_0x02b2;
                case 20: goto L_0x0302;
                case 21: goto L_0x0336;
                case 22: goto L_0x0375;
                case 23: goto L_0x0383;
                case 24: goto L_0x03c0;
                case 25: goto L_0x03cf;
                case 26: goto L_0x03df;
                case 27: goto L_0x0465;
                case 28: goto L_0x0493;
                case 29: goto L_0x04ad;
                case 30: goto L_0x04b7;
                case 31: goto L_0x0544;
                case 32: goto L_0x055e;
                case 33: goto L_0x057e;
                case 34: goto L_0x0590;
                case 35: goto L_0x05ae;
                case 36: goto L_0x05bc;
                case 37: goto L_0x05ea;
                case 38: goto L_0x0623;
                case 39: goto L_0x064b;
                case 40: goto L_0x0665;
                case 41: goto L_0x06a1;
                case 42: goto L_0x070f;
                case 43: goto L_0x0738;
                case 44: goto L_0x0741;
                case 45: goto L_0x0799;
                case 46: goto L_0x07ab;
                case 47: goto L_0x07b4;
                case 48: goto L_0x07db;
                case 49: goto L_0x07f5;
                case 50: goto L_0x08e3;
                case 51: goto L_0x0931;
                case 52: goto L_0x0949;
                case 53: goto L_0x096d;
                case 54: goto L_0x09a9;
                case 55: goto L_0x09b2;
                case 56: goto L_0x09cc;
                case 57: goto L_0x09e2;
                case 58: goto L_0x09fc;
                case 59: goto L_0x0a14;
                case 60: goto L_0x0a26;
                case 61: goto L_0x0ad2;
                case 62: goto L_0x0b00;
                case 63: goto L_0x0b1c;
                case 64: goto L_0x0b22;
                case 65: goto L_0x0b50;
                case 66: goto L_0x0b78;
                case 67: goto L_0x0b90;
                case 68: goto L_0x0bdf;
                case 69: goto L_0x0c14;
                case 70: goto L_0x0c36;
                case 71: goto L_0x0c88;
                case 72: goto L_0x0c98;
                case 73: goto L_0x0cd1;
                case 74: goto L_0x0d03;
                case 75: goto L_0x0d3c;
                case 76: goto L_0x0d5a;
                case 77: goto L_0x0d86;
                case 78: goto L_0x0d90;
                case 79: goto L_0x0d9e;
                case 80: goto L_0x0dac;
                case 81: goto L_0x0dba;
                case 82: goto L_0x0dc8;
                case 83: goto L_0x0dde;
                case 84: goto L_0x0dec;
                case 85: goto L_0x0e0a;
                case 86: goto L_0x0e1c;
                case 87: goto L_0x0e2a;
                case 88: goto L_0x0e38;
                case 89: goto L_0x0e46;
                case 90: goto L_0x0ea1;
                case 91: goto L_0x0ec9;
                case 92: goto L_0x0eff;
                case 93: goto L_0x1027;
                case 94: goto L_0x1043;
                case 95: goto L_0x1052;
                case 96: goto L_0x1061;
                case 97: goto L_0x001b;
                case 98: goto L_0x1077;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.reels.musicpick.model.MusicPickStickerModel> r1 = com.instagram.reels.musicpick.model.MusicPickStickerModel.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.StoryMusicPickTappableData r0 = (com.instagram.api.schemas.StoryMusicPickTappableData) r0
            com.instagram.reels.musicpick.model.MusicPickStickerModel r10 = new com.instagram.reels.musicpick.model.MusicPickStickerModel
            r10.<init>((com.instagram.api.schemas.StoryMusicPickTappableData) r0)
        L_0x001a:
            return r10
        L_0x001b:
            com.instagram.reels.memories.model.MemoryItem r10 = new com.instagram.reels.memories.model.MemoryItem
            r10.<init>()
            X.CvU r1 = new X.CvU
            r1.<init>()
            r10.A01 = r1
            java.lang.String r2 = r0.readString()
            java.util.Map r1 = X.C62558Kho.A01
            java.lang.Object r1 = r1.get(r2)
            X.Kho r1 = (X.C62558Kho) r1
            if (r1 == 0) goto L_0x109e
            r10.A00 = r1
            java.lang.String r0 = r0.readString()
            if (r0 == 0) goto L_0x001a
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x001a }
            X.CvU r0 = X.D2C.parseFromJson(r0)     // Catch:{ IOException -> 0x001a }
            r10.A01 = r0     // Catch:{ IOException -> 0x001a }
            goto L_0x109d
        L_0x0049:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType[] r1 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType.values()
            int r0 = r0.readInt()
            r10 = r1[r0]
            return r10
        L_0x0058:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType[] r1 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType.values()
            int r0 = r0.readInt()
            r10 = r1[r0]
            return r10
        L_0x0067:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType[] r1 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType.values()
            int r0 = r0.readInt()
            r10 = r1[r0]
            return r10
        L_0x0076:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl r10 = new com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl
            r10.<init>(r1, r0)
            return r10
        L_0x0084:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle[] r1 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle.values()
            int r0 = r0.readInt()
            r10 = r1[r0]
            return r10
        L_0x0093:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r12 = 0
            if (r1 != 0) goto L_0x00bb
            r15 = r12
        L_0x009f:
            java.lang.Integer r11 = X.Dbc.A0C(r0)
            long r16 = r0.readLong()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x00b1
            java.lang.Integer r12 = X.C41847B3o.A12(r0)
        L_0x00b1:
            java.lang.String r14 = r0.readString()
            com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBanner r10 = new com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBanner
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x00bb:
            int r3 = r0.readInt()
            java.util.ArrayList r15 = X.DbS.A0v(r3)
            r2 = 0
        L_0x00c4:
            if (r2 == r3) goto L_0x009f
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerBottomSheetContent.CREATOR
            int r2 = X.JTT.A04(r0, r1, r15, r2)
            goto L_0x00c4
        L_0x00cd:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerBottomSheetContent r10 = new com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerBottomSheetContent
            r10.<init>(r2, r1, r0)
            return r10
        L_0x00df:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerButton r10 = new com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerButton
            r10.<init>(r0)
            return r10
        L_0x00e9:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata> r2 = com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata.class
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.payments.DeliveryWindowInfo r13 = (com.instagram.model.payments.DeliveryWindowInfo) r13
            int r1 = r0.readInt()
            r15 = 0
            if (r1 != 0) goto L_0x011d
            r14 = r15
        L_0x00fd:
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.payments.CurrencyAmountInfo r11 = (com.instagram.model.payments.CurrencyAmountInfo) r11
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x010d
            java.lang.Integer r15 = X.C41847B3o.A12(r0)
        L_0x010d:
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.payments.CurrencyAmountInfo r12 = (com.instagram.model.payments.CurrencyAmountInfo) r12
            java.lang.String r16 = r0.readString()
            com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata r10 = new com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x011d:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            goto L_0x00fd
        L_0x0126:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl> r2 = com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r1 = (com.instagram.model.shopping.productimagecontainer.ProductImageContainer) r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.showreelnative.IgShowreelNativeAnimation r0 = (com.instagram.model.showreelnative.IgShowreelNativeAnimation) r0
            com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl r10 = new com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl
            r10.<init>(r1, r0)
            return r10
        L_0x013e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r3 = X.C41848B3p.A1X(r0)
            long r1 = r0.readLong()
            java.lang.Integer r0 = X.JTU.A0U(r0)
            com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl r10 = new com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl
            r10.<init>(r0, r1, r3)
            return r10
        L_0x0154:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0171
            r11 = 0
        L_0x016b:
            com.instagram.model.shopping.productcollection.ProductCollectionTagInfo r10 = new com.instagram.model.shopping.productcollection.ProductCollectionTagInfo
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0171:
            boolean r0 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            goto L_0x016b
        L_0x017a:
            com.instagram.model.shopping.productfeed.MultiProductComponent r10 = new com.instagram.model.shopping.productfeed.MultiProductComponent
            r10.<init>(r0)
            return r10
        L_0x0180:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.productfeed.ProductCollectionFooter r10 = new com.instagram.model.shopping.productfeed.ProductCollectionFooter
            r10.<init>()
            java.lang.String r1 = r0.readString()
            r10.A00 = r1
            java.util.ArrayList r2 = r10.A01
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.productfeed.ProductCollectionFooterLink.CREATOR
            r0.readTypedList(r2, r1)
            return r10
        L_0x0197:
            com.instagram.model.shopping.productfeed.ProductCollectionFooterLink r10 = new com.instagram.model.shopping.productfeed.ProductCollectionFooterLink
            r10.<init>()
            int r2 = r0.readInt()
            android.util.SparseArray r1 = X.AnonymousClass47L.A01
            java.lang.Object r1 = r1.get(r2)
            X.47L r1 = (X.AnonymousClass47L) r1
            r10.A00 = r1
            java.lang.String r1 = r0.readString()
            r10.A02 = r1
            java.lang.String r0 = r0.readString()
            r10.A01 = r0
            return r10
        L_0x01b7:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.shopping.productfeed.ProductCollectionHeader> r4 = com.instagram.model.shopping.productfeed.ProductCollectionHeader.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r4)
            com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl r11 = (com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl) r11
            java.lang.String r13 = r0.readString()
            int r3 = r0.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r3)
        L_0x01cf:
            if (r1 == r3) goto L_0x01d7
            X.C41848B3p.A1J(r0, r4, r2)
            int r1 = r1 + 1
            goto L_0x01cf
        L_0x01d7:
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r4)
            com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl r12 = (com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl) r12
            com.instagram.model.shopping.productfeed.ProductCollectionHeader r10 = new com.instagram.model.shopping.productfeed.ProductCollectionHeader
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x01ed:
            java.lang.String r9 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r3 = 0
            if (r1 != 0) goto L_0x0237
            r1 = r3
        L_0x01f9:
            java.lang.String r8 = r0.readString()
            java.lang.String r7 = r0.readString()
            java.lang.String r6 = r0.readString()
            java.lang.Class<com.instagram.model.shopping.productfeed.ProductCollectionTile> r2 = com.instagram.model.shopping.productfeed.ProductCollectionTile.class
            android.os.Parcelable r5 = X.C41847B3o.A03(r0, r2)
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            android.os.Parcelable r4 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl r4 = (com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl) r4
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x0221
            long r2 = r0.readLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
        L_0x0221:
            com.instagram.model.shopping.productfeed.ProductCollectionTile r10 = new com.instagram.model.shopping.productfeed.ProductCollectionTile
            r10.<init>()
            r10.A04 = r9
            r10.A01 = r1
            r10.A05 = r8
            r10.A07 = r7
            r10.A06 = r6
            r10.A02 = r5
            r10.A00 = r4
            r10.A03 = r3
            return r10
        L_0x0237:
            java.lang.String r1 = r0.readString()
            X.57K r1 = X.AnonymousClass57K.valueOf(r1)
            goto L_0x01f9
        L_0x0240:
            com.instagram.model.shopping.productfeed.ProductFeedItem r10 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r10.<init>()
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r10.A06 = r1
            java.lang.Class<com.instagram.model.shopping.productfeed.MultiProductComponent> r1 = com.instagram.model.shopping.productfeed.MultiProductComponent.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.productfeed.MultiProductComponent r1 = (com.instagram.model.shopping.productfeed.MultiProductComponent) r1
            r10.A01 = r1
            java.lang.Class<com.instagram.user.model.Product> r1 = com.instagram.user.model.Product.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.ProductDetailsProductItemDict r1 = (com.instagram.user.model.ProductDetailsProductItemDict) r1
            r10.A04 = r1
            java.lang.Class<com.instagram.user.model.UnavailableProductImpl> r1 = com.instagram.user.model.UnavailableProductImpl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.UnavailableProductImpl r1 = (com.instagram.user.model.UnavailableProductImpl) r1
            r10.A05 = r1
            java.lang.Class<com.instagram.model.shopping.productfeed.ProductTile> r1 = com.instagram.model.shopping.productfeed.ProductTile.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.productfeed.ProductTile r1 = (com.instagram.model.shopping.productfeed.ProductTile) r1
            r10.A02 = r1
            java.lang.Class<com.instagram.model.shopping.productfeed.ProductTileMedia> r1 = com.instagram.model.shopping.productfeed.ProductTileMedia.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.productfeed.ProductTileMedia r0 = (com.instagram.model.shopping.productfeed.ProductTileMedia) r0
            r10.A03 = r0
            r10.A04()
            return r10
        L_0x027f:
            com.instagram.model.shopping.productfeed.ProductFeedResponse r10 = new com.instagram.model.shopping.productfeed.ProductFeedResponse
            r10.<init>()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r10.A03 = r1
            int r2 = r0.readInt()
            r1 = 1
            if (r2 == r1) goto L_0x0292
            r1 = 0
        L_0x0292:
            r10.A04 = r1
            java.lang.String r1 = r0.readString()
            r10.A01 = r1
            int r1 = r0.readInt()
            r10.A00 = r1
            java.util.List r2 = r10.A03
            java.lang.Class<com.instagram.model.shopping.productfeed.ProductFeedItem> r1 = com.instagram.model.shopping.productfeed.ProductFeedItem.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.readList(r2, r1)
            java.lang.String r0 = r0.readString()
            r10.A02 = r0
            return r10
        L_0x02b2:
            com.instagram.model.shopping.productfeed.ProductTile r10 = new com.instagram.model.shopping.productfeed.ProductTile
            r10.<init>()
            java.lang.Class<com.instagram.user.model.ProductDetailsProductItemDict> r1 = com.instagram.user.model.ProductDetailsProductItemDict.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.ProductDetailsProductItemDict r1 = (com.instagram.user.model.ProductDetailsProductItemDict) r1
            r10.A08 = r1
            com.instagram.user.model.Product r1 = X.C14502TxO.A00(r1)
            r10.A07 = r1
            java.lang.Class<com.instagram.api.schemas.ProductTileProductImpl> r1 = com.instagram.api.schemas.ProductTileProductImpl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.ProductTileProductImpl r1 = (com.instagram.api.schemas.ProductTileProductImpl) r1
            r10.A02 = r1
            java.io.Serializable r1 = r0.readSerializable()
            com.instagram.api.schemas.ProductCardSubtitleType r1 = (com.instagram.api.schemas.ProductCardSubtitleType) r1
            r10.A00 = r1
            java.lang.Class<com.instagram.api.schemas.ProductTileMetadataImpl> r1 = com.instagram.api.schemas.ProductTileMetadataImpl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.ProductTileMetadataImpl r1 = (com.instagram.api.schemas.ProductTileMetadataImpl) r1
            r10.A01 = r1
            java.lang.Class<com.instagram.model.shopping.productfeed.ProductTileMedia> r1 = com.instagram.model.shopping.productfeed.ProductTileMedia.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.productfeed.ProductTileMedia r1 = (com.instagram.model.shopping.productfeed.ProductTileMedia) r1
            r10.A06 = r1
            java.lang.Class<com.instagram.api.schemas.RankingInfo> r1 = com.instagram.api.schemas.RankingInfo.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.RankingInfo r1 = (com.instagram.api.schemas.RankingInfo) r1
            r10.A04 = r1
            java.lang.Class<com.instagram.api.schemas.ProductTileUCILoggingInfo> r1 = com.instagram.api.schemas.ProductTileUCILoggingInfo.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.ProductTileUCILoggingInfoImpl r0 = (com.instagram.api.schemas.ProductTileUCILoggingInfoImpl) r0
            r10.A03 = r0
            return r10
        L_0x0302:
            com.instagram.model.shopping.productfeed.ProductTileMedia r10 = new com.instagram.model.shopping.productfeed.ProductTileMedia
            r10.<init>()
            java.lang.String r1 = r0.readString()
            r1.getClass()
            r10.A02 = r1
            java.lang.Class<com.instagram.model.mediasize.ImageInfo> r1 = com.instagram.model.mediasize.ImageInfo.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.mediasize.ImageInfo r1 = (com.instagram.model.mediasize.ImageInfo) r1
            if (r1 == 0) goto L_0x0334
            com.instagram.model.mediasize.ImageInfoImpl r1 = r1.FEa()
        L_0x031e:
            r10.A00 = r1
            java.lang.String r1 = r0.readString()
            r10.A03 = r1
            java.lang.Class<com.instagram.user.model.User> r1 = com.instagram.user.model.User.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            r0.getClass()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r10.A01 = r0
            return r10
        L_0x0334:
            r1 = 0
            goto L_0x031e
        L_0x0336:
            java.lang.String r9 = X.C41848B3p.A1D(r0)
            java.lang.String r8 = r0.readString()
            long r4 = r0.readLong()
            java.lang.String r7 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x036c
            r6 = 0
        L_0x034d:
            long r2 = r0.readLong()
            long r0 = r0.readLong()
            X.C51974G9v.A1L(r9, r8, r7)
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r10 = new com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo
            r10.<init>()
            r10.A04 = r9
            r10.A05 = r8
            r10.A00 = r4
            r10.A06 = r7
            r10.A03 = r6
            r10.A02 = r2
            r10.A01 = r0
            return r10
        L_0x036c:
            java.lang.String r1 = r0.readString()
            X.Ki1 r6 = X.C62570Ki1.valueOf(r1)
            goto L_0x034d
        L_0x0375:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r10 = new com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation
            r10.<init>(r1, r0)
            return r10
        L_0x0383:
            java.lang.String r5 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r2 = 1
            r4 = 0
            if (r1 != 0) goto L_0x03b7
            r3 = r4
        L_0x0390:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x03ab
            r2 = r4
        L_0x0397:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x03a5
            long r0 = r0.readLong()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x03a5:
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl r10 = new com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl
            r10.<init>(r3, r2, r4, r5)
            return r10
        L_0x03ab:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x03b2
            r2 = 0
        L_0x03b2:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0397
        L_0x03b7:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            goto L_0x0390
        L_0x03c0:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle[] r1 = com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle.values()
            int r0 = r0.readInt()
            r10 = r1[r0]
            return r10
        L_0x03cf:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r0 = X.JTU.A1Q(r0)
            com.instagram.model.shopping.reels.InstagramShopLink r10 = new com.instagram.model.shopping.reels.InstagramShopLink
            r10.<init>()
            r10.A00 = r0
            return r10
        L_0x03df:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r7 = 0
            r4 = 0
            if (r1 != 0) goto L_0x043c
            r11 = r4
        L_0x03ec:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0429
            r5 = r4
        L_0x03f3:
            java.lang.String r13 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0416
            r6 = r4
        L_0x03fe:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0445
            int r2 = r0.readInt()
            java.util.ArrayList r4 = X.DbS.A0v(r2)
        L_0x040c:
            if (r7 == r2) goto L_0x0445
            java.lang.Class<com.instagram.model.shopping.reels.MultiProductSticker> r1 = com.instagram.model.shopping.reels.MultiProductSticker.class
            X.C41848B3p.A1J(r0, r1, r4)
            int r7 = r7 + 1
            goto L_0x040c
        L_0x0416:
            int r3 = r0.readInt()
            java.util.ArrayList r6 = X.DbS.A0v(r3)
            r2 = 0
        L_0x041f:
            if (r2 == r3) goto L_0x03fe
            java.lang.Class<com.instagram.model.shopping.reels.MultiProductSticker> r1 = com.instagram.model.shopping.reels.MultiProductSticker.class
            X.C41848B3p.A1J(r0, r1, r6)
            int r2 = r2 + 1
            goto L_0x041f
        L_0x0429:
            int r3 = r0.readInt()
            java.util.ArrayList r5 = X.DbS.A0v(r3)
            r2 = 0
        L_0x0432:
            if (r2 == r3) goto L_0x03f3
            java.lang.Class<com.instagram.model.shopping.reels.MultiProductSticker> r1 = com.instagram.model.shopping.reels.MultiProductSticker.class
            X.C41848B3p.A1J(r0, r1, r5)
            int r2 = r2 + 1
            goto L_0x0432
        L_0x043c:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            goto L_0x03ec
        L_0x0445:
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            com.instagram.model.shopping.reels.MultiProductSticker r10 = new com.instagram.model.shopping.reels.MultiProductSticker
            r19 = r5
            r20 = r6
            r21 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r10
        L_0x0465:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            java.lang.String r14 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x048c
            r12 = 0
        L_0x0474:
            com.instagram.model.shopping.reels.ShoppingDestinationMetadata r12 = (com.instagram.model.shopping.reels.ShoppingDestinationMetadata) r12
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.instagram.model.shopping.reels.ProductCollectionLink> r1 = com.instagram.model.shopping.reels.ProductCollectionLink.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.MultiProductComponentDestinationType r11 = (com.instagram.api.schemas.MultiProductComponentDestinationType) r11
            com.instagram.model.shopping.reels.ProductCollectionLink r10 = new com.instagram.model.shopping.reels.ProductCollectionLink
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x048c:
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.reels.ShoppingDestinationMetadata.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
            goto L_0x0474
        L_0x0493:
            java.lang.String r4 = X.C41848B3p.A1D(r0)
            java.lang.String r3 = r0.readString()
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl> r1 = com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus r0 = (com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus) r0
            com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl r10 = new com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl
            r10.<init>(r0, r4, r3, r2)
            return r10
        L_0x04ad:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.reels.ProductShareConfig r10 = new com.instagram.model.shopping.reels.ProductShareConfig
            r10.<init>(r0)
            return r10
        L_0x04b7:
            java.lang.String r18 = X.C41848B3p.A1D(r0)
            java.lang.Class<com.instagram.model.shopping.reels.ProductSticker> r2 = com.instagram.model.shopping.reels.ProductSticker.class
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.shopping.drops.DropsLaunchAnimation r13 = (com.instagram.model.shopping.drops.DropsLaunchAnimation) r13
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.DropsEventPageNavigationMetadata r11 = (com.instagram.api.schemas.DropsEventPageNavigationMetadata) r11
            java.lang.String r19 = r0.readString()
            int r1 = r0.readInt()
            r5 = 1
            r17 = 0
            if (r1 != 0) goto L_0x053b
            r15 = r17
        L_0x04d8:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0532
            r16 = r17
        L_0x04e0:
            java.lang.String r20 = r0.readString()
            android.os.Parcelable r14 = X.C41847B3o.A03(r0, r2)
            com.instagram.user.model.ProductDetailsProductItemDict r14 = (com.instagram.user.model.ProductDetailsProductItemDict) r14
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0521
            r1 = r17
        L_0x04f2:
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.TextReviewStatus r12 = (com.instagram.api.schemas.TextReviewStatus) r12
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x0519
            int r0 = r0.readInt()
            if (r0 != 0) goto L_0x0515
            r5 = 0
        L_0x0515:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r5)
        L_0x0519:
            com.instagram.model.shopping.reels.ProductSticker r10 = new com.instagram.model.shopping.reels.ProductSticker
            r25 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r10
        L_0x0521:
            int r4 = r0.readInt()
            java.util.ArrayList r1 = X.DbS.A0v(r4)
            r3 = 0
        L_0x052a:
            if (r3 == r4) goto L_0x04f2
            X.C41848B3p.A1J(r0, r2, r1)
            int r3 = r3 + 1
            goto L_0x052a
        L_0x0532:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r1)
            goto L_0x04e0
        L_0x053b:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r1)
            goto L_0x04d8
        L_0x0544:
            java.lang.String r4 = X.C41848B3p.A1D(r0)
            java.lang.String r3 = r0.readString()
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.model.shopping.reels.ProfileShopLink> r1 = com.instagram.model.shopping.reels.ProfileShopLink.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.SellerShoppableFeedType r0 = (com.instagram.api.schemas.SellerShoppableFeedType) r0
            com.instagram.model.shopping.reels.ProfileShopLink r10 = new com.instagram.model.shopping.reels.ProfileShopLink
            r10.<init>(r0, r4, r3, r2)
            return r10
        L_0x055e:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x056b
            r3 = 0
        L_0x0565:
            com.instagram.model.shopping.reels.ReelMultiProductLink r10 = new com.instagram.model.shopping.reels.ReelMultiProductLink
            r10.<init>(r3)
            return r10
        L_0x056b:
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0574:
            if (r2 == r4) goto L_0x0565
            java.lang.Class<com.instagram.model.shopping.reels.ReelMultiProductLink> r1 = com.instagram.model.shopping.reels.ReelMultiProductLink.class
            X.C41848B3p.A1J(r0, r1, r3)
            int r2 = r2 + 1
            goto L_0x0574
        L_0x057e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.shopping.reels.ReelProductLink> r1 = com.instagram.model.shopping.reels.ReelProductLink.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            com.instagram.model.shopping.reels.ReelProductLink r10 = new com.instagram.model.shopping.reels.ReelProductLink
            r10.<init>(r0)
            return r10
        L_0x0590:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x05a7
            r2 = 0
        L_0x0597:
            com.instagram.model.shopping.reels.ShoppingIncentiveMetadata r2 = (com.instagram.model.shopping.reels.ShoppingIncentiveMetadata) r2
            java.lang.Class<com.instagram.model.shopping.reels.ShoppingDestinationMetadata> r1 = com.instagram.model.shopping.reels.ShoppingDestinationMetadata.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.reels.ProductCollectionLinkMetadata r0 = (com.instagram.model.shopping.reels.ProductCollectionLinkMetadata) r0
            com.instagram.model.shopping.reels.ShoppingDestinationMetadata r10 = new com.instagram.model.shopping.reels.ShoppingDestinationMetadata
            r10.<init>(r0, r2)
            return r10
        L_0x05a7:
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.reels.ShoppingIncentiveMetadata.CREATOR
            java.lang.Object r2 = r1.createFromParcel(r0)
            goto L_0x0597
        L_0x05ae:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.model.shopping.reels.ShoppingIncentiveMetadata r10 = new com.instagram.model.shopping.reels.ShoppingIncentiveMetadata
            r10.<init>(r1, r0)
            return r10
        L_0x05bc:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.sizechart.SizeChart r10 = new com.instagram.model.shopping.sizechart.SizeChart
            r10.<init>()
            java.util.ArrayList r1 = r0.createStringArrayList()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x05e5
            r10.A01 = r1
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.sizechart.SizeChartRow.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            if (r1 == 0) goto L_0x05e0
            r10.A02 = r1
            java.lang.String r0 = r0.readString()
            r10.A00 = r0
            return r10
        L_0x05e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x05e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x05ea:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.sizechart.SizeChartMeasurement r10 = new com.instagram.model.shopping.sizechart.SizeChartMeasurement
            r10.<init>()
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x061e
            r10.A02 = r1
            byte r1 = r0.readByte()
            r2 = 0
            if (r1 != 0) goto L_0x0617
            r10.A00 = r2
        L_0x0604:
            byte r1 = r0.readByte()
            if (r1 == 0) goto L_0x060e
            java.lang.Integer r2 = X.C41847B3o.A12(r0)
        L_0x060e:
            r10.A01 = r2
            java.lang.String r0 = r0.readString()
            r10.A03 = r0
            return r10
        L_0x0617:
            java.lang.Integer r1 = X.C41847B3o.A12(r0)
            r10.A00 = r1
            goto L_0x0604
        L_0x061e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0623:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.sizechart.SizeChartRow r10 = new com.instagram.model.shopping.sizechart.SizeChartRow
            r10.<init>()
            java.lang.String r1 = r0.readString()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0646
            r10.A00 = r1
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.sizechart.SizeChartMeasurement.CREATOR
            java.util.ArrayList r0 = r0.createTypedArrayList(r1)
            if (r0 == 0) goto L_0x0641
            r10.A01 = r0
            return r10
        L_0x0641:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0646:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x064b:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.video.ShoppingCreationConfig r10 = new com.instagram.model.shopping.video.ShoppingCreationConfig
            r10.<init>()
            byte r1 = r0.readByte()
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r10.A01 = r1
            int r0 = r0.readInt()
            r10.A00 = r0
            return r10
        L_0x0665:
            com.instagram.model.simpleplace.SimplePlace r10 = new com.instagram.model.simpleplace.SimplePlace
            r10.<init>()
            java.lang.String r1 = r0.readString()
            r10.A05 = r1
            double r1 = r0.readDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r10.A01 = r1
            double r1 = r0.readDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r10.A02 = r1
            java.lang.String r1 = r0.readString()
            r10.A06 = r1
            java.lang.String r1 = r0.readString()
            r10.A04 = r1
            java.lang.String r1 = r0.readString()
            r10.A03 = r1
            java.lang.Class<com.instagram.user.model.User> r1 = com.instagram.user.model.User.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r10.A00 = r0
            return r10
        L_0x06a1:
            java.lang.String r16 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            r2 = 1
            r4 = 0
            r3 = 0
            if (r1 != 0) goto L_0x06fe
            r13 = r3
        L_0x06af:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x06f2
            r14 = r3
        L_0x06b6:
            java.lang.String r17 = r0.readString()
            java.lang.Class<com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl> r5 = com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r5)
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r12 = (com.instagram.model.shopping.productimagecontainer.ProductImageContainer) r12
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r5)
            com.instagram.model.mediasize.ImageInfo r11 = (com.instagram.model.mediasize.ImageInfo) r11
            java.lang.String r18 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x06e9
            r15 = r3
        L_0x06d3:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0707
            int r1 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r1)
        L_0x06e1:
            if (r4 == r1) goto L_0x0707
            X.C41848B3p.A1J(r0, r5, r3)
            int r4 = r4 + 1
            goto L_0x06e1
        L_0x06e9:
            double r1 = r0.readDouble()
            java.lang.Double r15 = java.lang.Double.valueOf(r1)
            goto L_0x06d3
        L_0x06f2:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x06f9
            r2 = 0
        L_0x06f9:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            goto L_0x06b6
        L_0x06fe:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            goto L_0x06af
        L_0x0707:
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl r10 = new com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl
            r19 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r10
        L_0x070f:
            r3 = 0
            X.0qQ.A0B(r0, r3)
            r2 = 0
            r1 = 3345(0xd11, float:4.687E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo r10 = new com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo
            r10.<init>()
            r10.A00 = r3
            r10.A02 = r2
            r10.A01 = r1
            int r1 = r0.readInt()
            r10.A00 = r1
            java.lang.String r1 = r0.readString()
            r10.A02 = r1
            java.lang.String r0 = r0.readString()
            r10.A01 = r0
            return r10
        L_0x0738:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.music.common.constants.AudioTrackType r10 = com.instagram.music.common.constants.AudioTrackType.valueOf(r0)
            return r10
        L_0x0741:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            double r16 = r0.readDouble()
            double r18 = r0.readDouble()
            double r20 = r0.readDouble()
            double r22 = r0.readDouble()
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0787
            r14 = 0
        L_0x0768:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0775
            r15 = 0
        L_0x076f:
            com.instagram.music.common.model.ARAudioEffectData r10 = new com.instagram.music.common.model.ARAudioEffectData
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r20, r22)
            return r10
        L_0x0775:
            int r3 = r0.readInt()
            java.util.ArrayList r15 = X.DbS.A0v(r3)
            r2 = 0
        L_0x077e:
            if (r2 == r3) goto L_0x076f
            android.os.Parcelable$Creator r1 = com.instagram.music.common.model.LyricsPhrase.CREATOR
            int r2 = X.JTT.A04(r0, r1, r15, r2)
            goto L_0x077e
        L_0x0787:
            int r3 = r0.readInt()
            java.util.ArrayList r14 = X.DbS.A0v(r3)
            r2 = 0
        L_0x0790:
            if (r2 == r3) goto L_0x0768
            android.os.Parcelable$Creator r1 = com.instagram.music.common.model.MusicAssetBeatInfo.CREATOR
            int r2 = X.JTT.A04(r0, r1, r14, r2)
            goto L_0x0790
        L_0x0799:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            int r0 = r0.readInt()
            com.instagram.music.common.model.DownloadedTrack r10 = new com.instagram.music.common.model.DownloadedTrack
            r10.<init>(r2, r1, r0)
            return r10
        L_0x07ab:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.music.common.model.InstagramAudioApplySource r10 = com.instagram.music.common.model.InstagramAudioApplySource.valueOf(r0)
            return r10
        L_0x07b4:
            int r6 = X.C41848B3p.A00(r0)
            java.lang.String r5 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x07c9
            r3 = 0
        L_0x07c3:
            com.instagram.music.common.model.LyricsPhrase r10 = new com.instagram.music.common.model.LyricsPhrase
            r10.<init>(r3, r6, r5)
            return r10
        L_0x07c9:
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x07d2:
            if (r2 == r4) goto L_0x07c3
            android.os.Parcelable$Creator r1 = com.instagram.music.common.model.WordOffset.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x07d2
        L_0x07db:
            int r12 = X.C41848B3p.A00(r0)
            boolean r11 = X.C41848B3p.A1X(r0)
            boolean r13 = X.C41848B3p.A1X(r0)
            boolean r14 = X.C41848B3p.A1X(r0)
            boolean r15 = X.C41848B3p.A1X(r0)
            com.instagram.music.common.model.MusicAssetBeatInfo r10 = new com.instagram.music.common.model.MusicAssetBeatInfo
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x07f5:
            com.instagram.music.common.model.MusicAssetModel r10 = new com.instagram.music.common.model.MusicAssetModel
            r10.<init>()
            com.instagram.api.schemas.OriginalAudioSubtype r1 = com.instagram.api.schemas.OriginalAudioSubtype.A05
            r10.A01 = r1
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r10.A0K = r1
            r4 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r10.A07 = r2
            r1 = 0
            r10.A04 = r1
            r10.A08 = r2
            java.lang.String r1 = r0.readString()
            r10.A0E = r1
            java.lang.String r1 = r0.readString()
            r10.A0B = r1
            java.lang.String r1 = r0.readString()
            r10.A0H = r1
            java.lang.String r1 = r0.readString()
            r10.A0C = r1
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r1 = r0.readArrayList(r1)
            r10.A0J = r1
            java.lang.String r1 = r0.readString()
            r10.A0I = r1
            java.lang.String r1 = r0.readString()
            r10.A0D = r1
            java.lang.String r1 = r0.readString()
            r10.A0A = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r2 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r10.A02 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r10.A03 = r1
            int r1 = r0.readInt()
            r10.A00 = r1
            int r1 = r0.readInt()
            r3 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r3)
            r10.A0S = r1
            boolean r1 = X.DbY.A1X(r0)
            r10.A0Q = r1
            boolean r1 = X.DbY.A1X(r0)
            r10.A0R = r1
            boolean r1 = X.DbY.A1X(r0)
            r10.A0O = r1
            boolean r1 = X.DbY.A1X(r0)
            r10.A0U = r1
            boolean r1 = X.DbY.A1X(r0)
            r10.A0L = r1
            java.lang.String r1 = r0.readString()
            r10.A0G = r1
            boolean r1 = X.DbY.A1X(r0)
            r10.A0P = r1
            boolean r1 = X.DbY.A1X(r0)
            r10.A0T = r1
            java.lang.String r1 = r0.readString()
            r10.A0F = r1
            boolean r1 = X.DbY.A1X(r0)
            r10.A0M = r1
            boolean r1 = X.DbY.A1X(r0)
            r10.A0N = r1
            java.lang.String r1 = r0.readString()
            com.instagram.api.schemas.OriginalAudioSubtype r1 = com.instagram.api.schemas.OriginalAudioSubtype.valueOf(r1)
            r10.A01 = r1
            java.util.List r2 = r10.A0K
            java.lang.Class<com.instagram.music.common.model.OriginalPartsAttributionModel> r1 = com.instagram.music.common.model.OriginalPartsAttributionModel.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.readList(r2, r1)
            boolean r1 = X.DbY.A1X(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r10.A07 = r1
            int r0 = r0.readInt()
            if (r0 != r3) goto L_0x08d1
            r4 = 1
        L_0x08d1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r10.A08 = r0
            com.instagram.music.common.model.MusicAssetModel.A04(r10)     // Catch:{ IOException -> 0x08db }
            goto L_0x08e2
        L_0x08db:
            r1 = move-exception
            java.lang.String r0 = "MusicAssetModel"
            X.0wb.A07(r0, r1)
            return r10
        L_0x08e2:
            return r10
        L_0x08e3:
            java.lang.String r8 = X.C41848B3p.A1D(r0)
            if (r8 == 0) goto L_0x092c
            java.lang.String r7 = r0.readString()
            java.lang.String r6 = r0.readString()
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Bundle r5 = r0.readBundle(r1)
            java.lang.String r4 = r0.readString()
            java.lang.Class<com.instagram.music.common.model.MusicSearchPlaylistType> r1 = com.instagram.music.common.model.MusicSearchPlaylistType.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r1)
            com.instagram.music.common.model.MusicSearchPlaylistType r3 = (com.instagram.music.common.model.MusicSearchPlaylistType) r3
            java.lang.String r2 = r0.readString()
            int r1 = r0.readInt()
            r0 = 1
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            com.instagram.music.common.model.MusicBrowseCategory r10 = new com.instagram.music.common.model.MusicBrowseCategory
            r10.<init>()
            r10.A02 = r8
            r10.A04 = r7
            r10.A06 = r6
            r10.A00 = r5
            r10.A05 = r4
            r10.A01 = r3
            r10.A03 = r2
            r10.A07 = r0
            return r10
        L_0x092c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0931:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.music.common.model.MusicBrowserCategoryModel r10 = new com.instagram.music.common.model.MusicBrowserCategoryModel
            r10.<init>()
            r10.A00 = r2
            r10.A01 = r1
            r10.A02 = r0
            return r10
        L_0x0949:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.music.common.model.MusicAssetModel> r1 = com.instagram.music.common.model.MusicAssetModel.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.music.common.model.MusicAssetModel r1 = (com.instagram.music.common.model.MusicAssetModel) r1
            java.lang.String r0 = r0.readString()
            if (r0 == 0) goto L_0x0962
            X.8IJ r0 = X.AnonymousClass8IJ.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0960 }
            goto L_0x0963
        L_0x0960:
            r0 = 0
            goto L_0x0963
        L_0x0962:
            r0 = 0
        L_0x0963:
            com.instagram.music.common.model.MusicModelEffectPair r10 = new com.instagram.music.common.model.MusicModelEffectPair
            r10.<init>()
            r10.A01 = r1
            r10.A00 = r0
            return r10
        L_0x096d:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r1 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r5 = X.C41847B3o.A03(r0, r1)
            java.lang.String r1 = "Required value was null."
            if (r5 == 0) goto L_0x09a4
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            java.lang.String r4 = r0.readString()
            if (r4 == 0) goto L_0x099f
            X.0qQ.A0B(r5, r2)
            java.lang.String r3 = r0.readString()
            java.lang.String r2 = r0.readString()
            X.Jx5 r1 = new X.Jx5
            r1.<init>(r5, r3, r2, r4)
            com.instagram.music.common.model.MusicSearchArtist r10 = new com.instagram.music.common.model.MusicSearchArtist
            r10.<init>(r1)
            java.lang.String r0 = r0.readString()
            r10.A00 = r0
            return r10
        L_0x099f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x09a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x09a9:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.music.common.model.MusicSearchPlaylistType r10 = com.instagram.music.common.model.MusicSearchPlaylistType.valueOf(r0)
            return r10
        L_0x09b2:
            java.lang.String r4 = X.C41848B3p.A1D(r0)
            java.lang.String r3 = r0.readString()
            boolean r2 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.instagram.music.common.model.OriginalPartsAttributionModel> r1 = com.instagram.music.common.model.OriginalPartsAttributionModel.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            com.instagram.music.common.model.OriginalPartsAttributionModel r10 = new com.instagram.music.common.model.OriginalPartsAttributionModel
            r10.<init>(r0, r4, r3, r2)
            return r10
        L_0x09cc:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.music.common.model.TrackSnippet r10 = new com.instagram.music.common.model.TrackSnippet
            r10.<init>()
            int r1 = r0.readInt()
            r10.A01 = r1
            int r0 = r0.readInt()
            r10.A00 = r0
            return r10
        L_0x09e2:
            int r11 = X.C41848B3p.A00(r0)
            int r12 = r0.readInt()
            int r13 = r0.readInt()
            int r14 = r0.readInt()
            boolean r15 = X.C41848B3p.A1X(r0)
            com.instagram.music.common.model.WordOffset r10 = new com.instagram.music.common.model.WordOffset
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x09fc:
            int r3 = X.C41848B3p.A00(r0)
            java.lang.Class<com.instagram.music.search.tabloader.MusicOverlaySearchTab> r2 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.music.common.model.MusicBrowseCategory r1 = (com.instagram.music.common.model.MusicBrowseCategory) r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r2)
            com.instagram.music.common.model.MusicBrowserCategoryModel r0 = (com.instagram.music.common.model.MusicBrowserCategoryModel) r0
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r10 = new com.instagram.music.search.tabloader.MusicOverlaySearchTab
            r10.<init>(r1, r0, r3)
            return r10
        L_0x0a14:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.newsfeed.model.PillsFilterCategory r10 = new com.instagram.newsfeed.model.PillsFilterCategory
            r10.<init>(r2, r1, r0)
            return r10
        L_0x0a26:
            com.instagram.nux.cal.model.ConnectContent r10 = new com.instagram.nux.cal.model.ConnectContent
            r10.<init>()
            java.lang.Class r5 = r10.getClass()
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r5)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r10.A00 = r1
            java.lang.String r1 = r0.readString()
            r10.A0D = r1
            java.lang.String r1 = r0.readString()
            r10.A08 = r1
            java.lang.String r1 = r0.readString()
            r10.A09 = r1
            java.lang.String r1 = r0.readString()
            r10.A07 = r1
            java.lang.String r1 = r0.readString()
            r10.A05 = r1
            java.lang.String r1 = r0.readString()
            r10.A06 = r1
            java.lang.String r1 = r0.readString()
            r10.A0C = r1
            int r4 = r0.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r4)
            r3 = 0
            r1 = 0
        L_0x0a6b:
            if (r1 >= r4) goto L_0x0a73
            X.C41848B3p.A1J(r0, r5, r2)
            int r1 = r1 + 1
            goto L_0x0a6b
        L_0x0a73:
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r10.A0I = r1
            java.lang.String r1 = r0.readString()
            r10.A0A = r1
            java.lang.String r1 = r0.readString()
            r10.A0B = r1
            java.lang.String r1 = r0.readString()
            r10.A04 = r1
            int r2 = r0.readInt()
            java.util.ArrayList r1 = X.DbS.A0v(r2)
        L_0x0a93:
            if (r3 >= r2) goto L_0x0a9b
            X.C41848B3p.A1J(r0, r5, r1)
            int r3 = r3 + 1
            goto L_0x0a93
        L_0x0a9b:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r10.A0J = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r5)
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r1 = (com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent) r1
            r10.A01 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r5)
            com.instagram.nux.cal.model.FxAccountInfo r1 = (com.instagram.nux.cal.model.FxAccountInfo) r1
            r10.A03 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r5)
            com.instagram.nux.cal.model.FxAccountInfo r1 = (com.instagram.nux.cal.model.FxAccountInfo) r1
            r10.A02 = r1
            java.lang.String r1 = r0.readString()
            r10.A0F = r1
            java.lang.String r1 = r0.readString()
            r10.A0G = r1
            java.lang.String r1 = r0.readString()
            r10.A0E = r1
            java.lang.String r0 = r0.readString()
            r10.A0H = r0
            return r10
        L_0x0ad2:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.nux.cal.model.ContentText r10 = new com.instagram.nux.cal.model.ContentText
            r10.<init>()
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0ae7
            java.lang.Integer r1 = X.Eo9.A00(r1)
            r10.A01 = r1
        L_0x0ae7:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r10.A02 = r1
            r0.readStringList(r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r0 = r0.readValue(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r10.A00 = r0
            return r10
        L_0x0b00:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.nux.cal.model.DpActionContent r10 = new com.instagram.nux.cal.model.DpActionContent
            r10.<init>()
            java.lang.String r1 = r0.readString()
            r10.A02 = r1
            java.lang.String r1 = r0.readString()
            r10.A00 = r1
            java.lang.String r0 = r0.readString()
            r10.A01 = r0
            return r10
        L_0x0b1c:
            com.instagram.nux.cal.model.FXCalAgeInfo r10 = new com.instagram.nux.cal.model.FXCalAgeInfo
            r10.<init>(r0)
            return r10
        L_0x0b22:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r10 = new com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent
            r10.<init>()
            java.lang.Class<com.instagram.nux.cal.model.FXCalAgeInfo> r2 = com.instagram.nux.cal.model.FXCalAgeInfo.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.nux.cal.model.FXCalAgeInfo r1 = (com.instagram.nux.cal.model.FXCalAgeInfo) r1
            r10.A01 = r1
            java.lang.String r1 = r0.readString()
            r10.A04 = r1
            java.lang.String r1 = r0.readString()
            r10.A02 = r1
            java.lang.String r1 = r0.readString()
            r10.A03 = r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r2)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = (com.instagram.nux.cal.model.FXCalAgeInfo) r0
            r10.A00 = r0
            return r10
        L_0x0b50:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.nux.cal.model.FxAccountInfo r10 = new com.instagram.nux.cal.model.FxAccountInfo
            r10.<init>()
            java.lang.String r1 = r0.readString()
            r10.A01 = r1
            java.lang.String r1 = r0.readString()
            r10.A02 = r1
            java.lang.Class r1 = r10.getClass()
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r10.A00 = r1
            java.lang.String r0 = r0.readString()
            r10.A03 = r0
            return r10
        L_0x0b78:
            com.instagram.nux.cal.model.NuxConnectResponse r10 = new com.instagram.nux.cal.model.NuxConnectResponse
            r10.<init>()
            java.lang.String r1 = r0.readString()
            r10.A01 = r1
            java.lang.String r1 = r0.readString()
            r10.A02 = r1
            java.lang.String r0 = r0.readString()
            r10.A00 = r0
            return r10
        L_0x0b90:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.nux.cal.model.SignupContent r10 = new com.instagram.nux.cal.model.SignupContent
            r10.<init>()
            java.lang.String r1 = r0.readString()
            r10.A02 = r1
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x0ba8:
            if (r2 >= r4) goto L_0x0bb4
            java.lang.Class r1 = r10.getClass()
            X.C41848B3p.A1J(r0, r1, r3)
            int r2 = r2 + 1
            goto L_0x0ba8
        L_0x0bb4:
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            r10.A07 = r1
            java.lang.String r1 = r0.readString()
            r10.A00 = r1
            java.lang.String r1 = r0.readString()
            r10.A01 = r1
            java.lang.String r1 = r0.readString()
            r10.A04 = r1
            java.lang.String r1 = r0.readString()
            r10.A05 = r1
            java.lang.String r1 = r0.readString()
            r10.A03 = r1
            java.lang.String r0 = r0.readString()
            r10.A06 = r0
            return r10
        L_0x0bdf:
            int r1 = X.C41848B3p.A00(r0)
            r5 = 0
            if (r1 != 0) goto L_0x0c0f
            r4 = r5
        L_0x0be7:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0c0a
            r3 = r5
        L_0x0bee:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0c05
            r2 = r5
        L_0x0bf5:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0bff
            java.lang.Integer r5 = X.C41847B3o.A12(r0)
        L_0x0bff:
            com.instagram.nux.common.HowItWorksNuxFragment$Row r10 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r10.<init>(r4, r3, r2, r5)
            return r10
        L_0x0c05:
            java.lang.Integer r2 = X.C41847B3o.A12(r0)
            goto L_0x0bf5
        L_0x0c0a:
            java.lang.Integer r3 = X.C41847B3o.A12(r0)
            goto L_0x0bee
        L_0x0c0f:
            java.lang.Integer r4 = X.C41847B3o.A12(r0)
            goto L_0x0be7
        L_0x0c14:
            java.lang.String r11 = X.C41848B3p.A1D(r0)
            java.lang.String r12 = r0.readString()
            boolean r15 = X.C41848B3p.A1X(r0)
            boolean r16 = X.C41848B3p.A1X(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            boolean r17 = X.C41848B3p.A1X(r0)
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r10 = new com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L_0x0c36:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r20 = X.C41848B3p.A1X(r0)
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            boolean r21 = X.C41848B3p.A1X(r0)
            java.lang.String r17 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.KhB r11 = X.C62520KhB.valueOf(r1)
            boolean r22 = X.C41848B3p.A1X(r0)
            int r19 = r0.readInt()
            int r4 = r0.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r4)
            r3 = 0
        L_0x0c73:
            if (r3 == r4) goto L_0x0c7c
            android.os.Parcelable$Creator r1 = com.instagram.opal.impl.data.OpalAudienceSelectorRepository.OpalAudience.CREATOR
            int r3 = X.JTT.A04(r0, r1, r2, r3)
            goto L_0x0c73
        L_0x0c7c:
            boolean r23 = X.C41848B3p.A1X(r0)
            com.instagram.opal.impl.data.OpalProfileData r10 = new com.instagram.opal.impl.data.OpalProfileData
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r10
        L_0x0c88:
            com.instagram.payments.checkout.model.CheckoutData r10 = new com.instagram.payments.checkout.model.CheckoutData
            r10.<init>()
            java.lang.Class<com.instagram.model.payments.checkout.CheckoutLaunchParams> r1 = com.instagram.model.payments.checkout.CheckoutLaunchParams.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.payments.checkout.CheckoutLaunchParams r0 = (com.instagram.model.payments.checkout.CheckoutLaunchParams) r0
            r10.A00 = r0
            return r10
        L_0x0c98:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.pendingmedia.model.AllUserStoryTarget r10 = new com.instagram.pendingmedia.model.AllUserStoryTarget
            r10.<init>()
            java.lang.String r1 = "ALL_WITH_BLACKLIST"
            r10.A00 = r1
            java.lang.String r1 = r0.readString()
            r10.A00 = r1
            java.lang.Class<com.instagram.pendingmedia.model.AllUserStoryTarget> r1 = com.instagram.pendingmedia.model.AllUserStoryTarget.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r0 = r0.readArrayList(r1)
            if (r0 == 0) goto L_0x0ccd
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0cbf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0cce
            java.lang.Object r0 = r1.next()
            X.DbU.A1X(r0, r2)
            goto L_0x0cbf
        L_0x0ccd:
            r2 = 0
        L_0x0cce:
            r10.A01 = r2
            return r10
        L_0x0cd1:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.pendingmedia.model.BrandedContentTag r10 = new com.instagram.pendingmedia.model.BrandedContentTag
            r10.<init>()
            java.lang.String r1 = ""
            r10.A02 = r1
            java.lang.String r1 = r0.readString()
            r10.A01 = r1
            java.lang.String r1 = r0.readString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r10.A02 = r1
            java.lang.String r1 = r0.readString()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            r10.A04 = r1
            java.lang.String r0 = r0.readString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r10.A03 = r0
            return r10
        L_0x0d03:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget r10 = new com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget
            r10.<init>()
            java.lang.String r1 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            r10.A00 = r1
            java.lang.String r1 = r0.readString()
            r10.A00 = r1
            java.lang.Class<com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget> r1 = com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r0 = r0.readArrayList(r1)
            if (r0 == 0) goto L_0x0d38
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0d2a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0d39
            java.lang.Object r0 = r1.next()
            X.DbU.A1X(r0, r2)
            goto L_0x0d2a
        L_0x0d38:
            r2 = 0
        L_0x0d39:
            r10.A01 = r2
            return r10
        L_0x0d3c:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.pendingmedia.model.GroupProfileUserStoryTarget r10 = new com.instagram.pendingmedia.model.GroupProfileUserStoryTarget
            r10.<init>()
            java.lang.String r1 = "GROUP_PROFILE"
            r10.A01 = r1
            java.lang.String r1 = r0.readString()
            r10.A01 = r1
            android.os.Parcelable$Creator r1 = com.instagram.pendingmedia.model.recipients.PendingRecipient.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            r10.A00 = r0
            return r10
        L_0x0d5a:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.pendingmedia.model.GroupUserStoryTarget r10 = new com.instagram.pendingmedia.model.GroupUserStoryTarget
            r10.<init>()
            java.lang.String r1 = "GROUP"
            r10.A02 = r1
            java.lang.String r1 = r0.readString()
            r10.A02 = r1
            android.os.Parcelable$Creator r1 = com.instagram.pendingmedia.model.recipients.PendingRecipient.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            r10.A03 = r1
            java.lang.String r1 = r0.readString()
            r10.A01 = r1
            java.lang.Class<com.instagram.model.direct.DirectThreadKey> r1 = com.instagram.model.direct.DirectThreadKey.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            r10.A00 = r0
            return r10
        L_0x0d86:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkData r10 = new com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkData
            r10.<init>(r0)
            return r10
        L_0x0d90:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataEnhanced r10 = new com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataEnhanced
            r10.<init>(r1, r0)
            return r10
        L_0x0d9e:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataV2 r10 = new com.instagram.profile.bindergroup.AccountLinkModel$AddExternalLinkDataV2
            r10.<init>(r1, r0)
            return r10
        L_0x0dac:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookLinkData r10 = new com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookLinkData
            r10.<init>(r1, r0)
            return r10
        L_0x0dba:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookPageLinkData r10 = new com.instagram.profile.bindergroup.AccountLinkModel$AddFacebookPageLinkData
            r10.<init>(r1, r0)
            return r10
        L_0x0dc8:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = r0.readString()
            com.instagram.profile.bindergroup.AccountLinkModel$BottomMessageData r10 = new com.instagram.profile.bindergroup.AccountLinkModel$BottomMessageData
            r10.<init>(r0, r1)
            return r10
        L_0x0dde:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkData r10 = new com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkData
            r10.<init>(r1, r0)
            return r10
        L_0x0dec:
            java.lang.String r11 = X.C41848B3p.A1D(r0)
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            boolean r16 = X.C41848B3p.A1X(r0)
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced r10 = new com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x0e0a:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2 r10 = new com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataV2
            r10.<init>(r2, r1, r0)
            return r10
        L_0x0e1c:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkData r10 = new com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkData
            r10.<init>(r1, r0)
            return r10
        L_0x0e2a:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkDataV2 r10 = new com.instagram.profile.bindergroup.AccountLinkModel$FacebookLinkDataV2
            r10.<init>(r1, r0)
            return r10
        L_0x0e38:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.profile.bindergroup.AccountLinkModel$FacebookPageLinkData r10 = new com.instagram.profile.bindergroup.AccountLinkModel$FacebookPageLinkData
            r10.<init>(r1, r0)
            return r10
        L_0x0e46:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x0e73
            r11 = 0
        L_0x0e4d:
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            boolean r16 = X.C41848B3p.A1X(r0)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            boolean r17 = X.C41848B3p.A1X(r0)
            boolean r18 = X.C41848B3p.A1X(r0)
            boolean r19 = X.C41848B3p.A1X(r0)
            com.instagram.profile.intf.AutoLaunchReelParams r10 = new com.instagram.profile.intf.AutoLaunchReelParams
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r10
        L_0x0e73:
            java.lang.String r2 = r0.readString()
            r1 = 484(0x1e4, float:6.78E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e86
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            goto L_0x0e4d
        L_0x0e86:
            java.lang.String r1 = "USER_STORY"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e91
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x0e4d
        L_0x0e91:
            java.lang.String r1 = "LIVE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e9c
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x0e4d
        L_0x0e9c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x0ea1:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = "CREATE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0eb9
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0eaf:
            java.lang.String r0 = r0.readString()
            com.instagram.profile.intf.MultipleLinksEditModel r10 = new com.instagram.profile.intf.MultipleLinksEditModel
            r10.<init>(r1, r0)
            return r10
        L_0x0eb9:
            java.lang.String r1 = "EDIT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0ec4
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0eaf
        L_0x0ec4:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x0ec9:
            java.lang.String r11 = X.C41848B3p.A1D(r0)
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.util.ArrayList r22 = r0.createStringArrayList()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            com.instagram.profile.intf.UserDetailEntryInfo r10 = new com.instagram.profile.intf.UserDetailEntryInfo
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r10
        L_0x0eff:
            java.lang.String r20 = X.C41848B3p.A1D(r0)
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            int r1 = r0.readInt()
            r17 = 0
            if (r1 != 0) goto L_0x101f
            r14 = r17
        L_0x0f1d:
            com.instagram.profile.intf.AutoLaunchReelParams r14 = (com.instagram.profile.intf.AutoLaunchReelParams) r14
            boolean r44 = X.C41848B3p.A1X(r0)
            java.lang.String r25 = r0.readString()
            java.lang.String r26 = r0.readString()
            java.lang.String r27 = r0.readString()
            java.lang.String r28 = r0.readString()
            java.lang.String r29 = r0.readString()
            java.util.ArrayList r43 = r0.createStringArrayList()
            java.lang.Class<com.instagram.profile.intf.UserDetailLaunchConfig> r2 = com.instagram.profile.intf.UserDetailLaunchConfig.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r2)
            com.instagram.discovery.filters.intf.FilterConfig r11 = (com.instagram.discovery.filters.intf.FilterConfig) r11
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r2)
            com.instagram.sponsored.analytics.SourceModelInfoParams r3 = (com.instagram.sponsored.analytics.SourceModelInfoParams) r3
            boolean r45 = X.C41848B3p.A1X(r0)
            boolean r46 = X.C41848B3p.A1X(r0)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x1017
            r15 = r17
        L_0x0f59:
            com.instagram.profile.intf.UserDetailEntryInfo r15 = (com.instagram.profile.intf.UserDetailEntryInfo) r15
            boolean r47 = X.C41848B3p.A1X(r0)
            java.lang.String r30 = r0.readString()
            boolean r48 = X.C41848B3p.A1X(r0)
            boolean r49 = X.C41848B3p.A1X(r0)
            boolean r50 = X.C41848B3p.A1X(r0)
            java.lang.String r31 = r0.readString()
            java.lang.String r32 = r0.readString()
            java.lang.String r33 = r0.readString()
            boolean r51 = X.C41848B3p.A1X(r0)
            java.lang.String r34 = r0.readString()
            java.lang.String r35 = r0.readString()
            boolean r52 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r2)
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r12 = (com.instagram.fanclub.intf.UserPayFanclubUpsellParams) r12
            boolean r53 = X.C41848B3p.A1X(r0)
            java.lang.String r36 = r0.readString()
            java.lang.String r37 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x100e
            r18 = r17
        L_0x0fa5:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x1005
            r19 = r17
        L_0x0fad:
            boolean r54 = X.C41848B3p.A1X(r0)
            boolean r55 = X.C41848B3p.A1X(r0)
            boolean r56 = X.C41848B3p.A1X(r0)
            boolean r57 = X.C41848B3p.A1X(r0)
            java.lang.String r38 = r0.readString()
            boolean r58 = X.C41848B3p.A1X(r0)
            java.lang.String r39 = r0.readString()
            java.lang.String r40 = r0.readString()
            boolean r59 = X.C41848B3p.A1X(r0)
            boolean r60 = X.C41848B3p.A1X(r0)
            java.lang.String r41 = r0.readString()
            boolean r61 = X.C41848B3p.A1X(r0)
            java.lang.String r42 = r0.readString()
            boolean r62 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r2)
            com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams r13 = (com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams) r13
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0ff9
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r1)
        L_0x0ff9:
            boolean r63 = X.C41848B3p.A1X(r0)
            com.instagram.profile.intf.UserDetailLaunchConfig r10 = new com.instagram.profile.intf.UserDetailLaunchConfig
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            return r10
        L_0x1005:
            long r4 = r0.readLong()
            java.lang.Long r19 = java.lang.Long.valueOf(r4)
            goto L_0x0fad
        L_0x100e:
            long r4 = r0.readLong()
            java.lang.Long r18 = java.lang.Long.valueOf(r4)
            goto L_0x0fa5
        L_0x1017:
            android.os.Parcelable$Creator r1 = com.instagram.profile.intf.UserDetailEntryInfo.CREATOR
            java.lang.Object r15 = r1.createFromParcel(r0)
            goto L_0x0f59
        L_0x101f:
            android.os.Parcelable$Creator r1 = com.instagram.profile.intf.AutoLaunchReelParams.CREATOR
            java.lang.Object r14 = r1.createFromParcel(r0)
            goto L_0x0f1d
        L_0x1027:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel> r1 = com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.String r0 = r0.readString()
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r10 = new com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel
            r10.<init>(r1, r2, r0)
            return r10
        L_0x1043:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.reels.chat.model.ChatStickerChannelType[] r1 = com.instagram.reels.chat.model.ChatStickerChannelType.values()
            int r0 = r0.readInt()
            r10 = r1[r0]
            return r10
        L_0x1052:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.reels.chat.model.ChatStickerStickerType[] r1 = com.instagram.reels.chat.model.ChatStickerStickerType.values()
            int r0 = r0.readInt()
            r10 = r1[r0]
            return r10
        L_0x1061:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent> r1 = com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent r10 = new com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent
            r10.<init>(r0, r3, r2)
            return r10
        L_0x1077:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            float r11 = r0.readFloat()
            float r12 = r0.readFloat()
            int r17 = r0.readInt()
            float r13 = r0.readFloat()
            float r14 = r0.readFloat()
            float r15 = r0.readFloat()
            float r16 = r0.readFloat()
            com.instagram.reels.musicpick.model.MusicPickReelTag r10 = new com.instagram.reels.musicpick.model.MusicPickReelTag
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L_0x109d:
            return r10
        L_0x109e:
            r0 = 2522(0x9da, float:3.534E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r2)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LVO.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new IgFundedIncentiveBannerButtonStyleType[i];
            case 1:
                return new IgFundedIncentiveBannerIconType[i];
            case 2:
                return new IgFundedIncentiveButtonDestinationType[i];
            case 3:
                return new IgFundedIncentiveDetailImpl[i];
            case 4:
                return new IgFundedIncentiveNuxDisplayStyle[i];
            case 5:
                return new SellerIncentiveBanner[i];
            case 6:
                return new SellerIncentiveBannerBottomSheetContent[i];
            case 7:
                return new SellerIncentiveBannerButton[i];
            case 8:
                return new ShippingAndReturnsMetadata[i];
            case 9:
                return new ProductCollectionCoverImpl[i];
            case 10:
                return new ProductCollectionDropsMetadataImpl[i];
            case 11:
                return new ProductCollectionTagInfo[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new MultiProductComponent[i];
            case 13:
                return new ProductCollectionFooter[i];
            case 14:
                return new ProductCollectionFooterLink[i];
            case 15:
                return new ProductCollectionHeader[i];
            case 16:
                return new ProductCollectionTile[i];
            case 17:
                return new ProductFeedItem[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new ProductFeedResponse[i];
            case 19:
                return new ProductTile[i];
            case 20:
                return new ProductTileMedia[i];
            case 21:
                return new ShoppingModuleLoggingInfo[i];
            case 22:
                return new TaggingFeedSessionInformation[i];
            case 23:
                return new ProductLaunchInformationImpl[i];
            case 24:
                return new ProductVariantVisualStyle[i];
            case 25:
                return new InstagramShopLink[i];
            case 26:
                return new MultiProductSticker[i];
            case 27:
                return new ProductCollectionLink[i];
            case 28:
                return new ProductCollectionLinkMetadataImpl[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new ProductShareConfig[i];
            case 30:
                return new ProductSticker[i];
            case 31:
                return new ProfileShopLink[i];
            case 32:
                return new ReelMultiProductLink[i];
            case 33:
                return new ReelProductLink[i];
            case 34:
                return new ShoppingDestinationMetadata[i];
            case 35:
                return new ShoppingIncentiveMetadata[i];
            case 36:
                return new SizeChart[i];
            case 37:
                return new SizeChartMeasurement[i];
            case 38:
                return new SizeChartRow[i];
            case 39:
                return new ShoppingCreationConfig[i];
            case 40:
                return new SimplePlace[i];
            case Seq.NULL_REFNUM:
                return new UpcomingEventMediaImpl[i];
            case Seq.RefTracker.REF_OFFSET:
                return new ProductOnboardingNextStepInfo[i];
            case 43:
                return new AudioTrackType[i];
            case 44:
                return new ARAudioEffectData[i];
            case 45:
                return new DownloadedTrack[i];
            case 46:
                return new InstagramAudioApplySource[i];
            case 47:
                return new LyricsPhrase[i];
            case 48:
                return new MusicAssetBeatInfo[i];
            case 49:
                return new MusicAssetModel[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new MusicBrowseCategory[i];
            case 51:
                return new MusicBrowserCategoryModel[i];
            case 52:
                return new MusicModelEffectPair[i];
            case 53:
                return new MusicSearchArtist[i];
            case 54:
                return new MusicSearchPlaylistType[i];
            case 55:
                return new OriginalPartsAttributionModel[i];
            case 56:
                return new TrackSnippet[i];
            case 57:
                return new WordOffset[i];
            case 58:
                return new MusicOverlaySearchTab[i];
            case 59:
                return new PillsFilterCategory[i];
            case 60:
                return new ConnectContent[i];
            case 61:
                return new ContentText[i];
            case 62:
                return new DpActionContent[i];
            case 63:
                return new FXCalAgeInfo[i];
            case 64:
                return new FXCalAgeRestrictionScreenContent[i];
            case 65:
                return new FxAccountInfo[i];
            case 66:
                return new NuxConnectResponse[i];
            case 67:
                return new SignupContent[i];
            case 68:
                return new HowItWorksNuxFragment$Row[i];
            case 69:
                return new OpalAudienceSelectorRepository.OpalAudience[i];
            case 70:
                return new OpalProfileData[i];
            case 71:
                return new CheckoutData[i];
            case 72:
                return new AllUserStoryTarget[i];
            case 73:
                return new BrandedContentTag[i];
            case 74:
                return new CloseFriendsUserStoryTarget[i];
            case 75:
                return new GroupProfileUserStoryTarget[i];
            case 76:
                return new GroupUserStoryTarget[i];
            case 77:
                return new AccountLinkModel.AddExternalLinkData[i];
            case 78:
                return new AccountLinkModel.AddExternalLinkDataEnhanced[i];
            case 79:
                return new AccountLinkModel.AddExternalLinkDataV2[i];
            case 80:
                return new AccountLinkModel.AddFacebookLinkData[i];
            case 81:
                return new AccountLinkModel.AddFacebookPageLinkData[i];
            case 82:
                return new AccountLinkModel.BottomMessageData[i];
            case 83:
                return new AccountLinkModel.ExternalLinkData[i];
            case 84:
                return new AccountLinkModel.ExternalLinkDataEnhanced[i];
            case 85:
                return new AccountLinkModel.ExternalLinkDataV2[i];
            case 86:
                return new AccountLinkModel.FacebookLinkData[i];
            case 87:
                return new AccountLinkModel.FacebookLinkDataV2[i];
            case 88:
                return new AccountLinkModel.FacebookPageLinkData[i];
            case 89:
                return new AutoLaunchReelParams[i];
            case 90:
                return new MultipleLinksEditModel[i];
            case 91:
                return new UserDetailEntryInfo[i];
            case 92:
                return new UserDetailLaunchConfig[i];
            case 93:
                return new ChannelChallengeStickerWinnerModel[i];
            case 94:
                return new ChatStickerChannelType[i];
            case 95:
                return new ChatStickerStickerType[i];
            case 96:
                return new GroupMentionQuickReplySheetContent[i];
            case 97:
                return new MemoryItem[i];
            case 98:
                return new MusicPickReelTag[i];
            default:
                return new MusicPickStickerModel[i];
        }
    }
}
