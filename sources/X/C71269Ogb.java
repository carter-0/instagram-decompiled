package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig;
import com.instagram.location.impl.LocationSignalPackageImpl;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.location.surface.data.LocationPageInfo;
import com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount;
import com.instagram.login.api.TwoFactorInfoConfig;
import com.instagram.login.twofac.model.TotpSeed;
import com.instagram.login.twofac.model.TrustedDevice;
import com.instagram.mainfeed.intentawaread.api.ContextualOrganicInfo;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.analytics.VisibilitySheetOrigin;
import com.instagram.mediakit.config.MediaKitConfig;
import com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig;
import com.instagram.mediakit.config.MediaKitInfoSheetConfig;
import com.instagram.mediakit.config.MediaKitSectionActionSheetConfig;
import com.instagram.mediakit.model.MediaKitInsightType;
import com.instagram.mediakit.model.MediaKitSectionType;
import com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel;
import com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel;
import com.instagram.mediakit.ui.model.MediaKitLink;
import com.instagram.model.arads.ArAdsUIModel;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.model.comments.ParcelableCommenterDetails;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;
import com.instagram.model.direct.DirectIfyXma;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectPendingMusicShare;
import com.instagram.model.direct.DirectRoomsXma;
import com.instagram.model.direct.DirectSearchMetaAIResponse;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectVisualMessageTarget;
import com.instagram.model.direct.HighlightRange;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.direct.stickerstore.StickerPack;
import com.instagram.model.direct.stickerstore.StickerPackResponseItem;
import com.instagram.model.direct.stickerstore.TypedImageUrl;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import com.instagram.model.direct.threadkey.util.ThreadIdParcelable;
import com.instagram.model.direct.threadkey.util.UnifiedThreadKeyParcelable;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.hashtag.HashtagFollowStatus;
import com.instagram.model.hashtag.response.HashtagCollection;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.keyword.KeywordRecommendations;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.payments.common.ProductItem;
import com.instagram.model.reels.ReelViewerContextButtonType;
import com.instagram.model.reels.StoryWedgingType;
import com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.model.shopping.CompoundProductId;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductAutoTagMetadata;
import com.instagram.model.shopping.ProductContainer;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.ShoppingCameraSurveyMetadata;
import com.instagram.model.shopping.ShoppingHomeDestination;
import com.instagram.model.shopping.ThumbnailImage;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.clips.ClipsShoppingCTABar;
import com.instagram.model.shopping.clips.IGTVShoppingInfo;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.featuredproduct.SurfaceVisibility;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Ogb  reason: case insensitive filesystem */
public final class C71269Ogb implements Parcelable.Creator {
    public final int A00;

    public C71269Ogb(int i) {
        this.A00 = i;
    }

    public static C71269Ogb A00(int i) {
        return new C71269Ogb(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Parcel} */
    /* JADX WARNING: type inference failed for: r9v6, types: [com.instagram.model.shopping.ThumbnailImage, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v7, types: [com.instagram.model.shopping.ShoppingHomeDestination, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v10, types: [com.instagram.model.shopping.ProductTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    /* JADX WARNING: type inference failed for: r9v11, types: [com.instagram.model.shopping.ProductSource, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v13, types: [java.lang.Object, com.instagram.model.shopping.ProductGroup$VariantKey] */
    /* JADX WARNING: type inference failed for: r9v14, types: [com.instagram.model.shopping.ProductGroup, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v15, types: [com.instagram.model.shopping.ProductContainer, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v18, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
    /* JADX WARNING: type inference failed for: r9v20, types: [java.lang.Object, com.instagram.model.sharelater.ShareLaterMedia] */
    /* JADX WARNING: type inference failed for: r9v35, types: [java.lang.Object, com.instagram.model.payments.common.ProductItem] */
    /* JADX WARNING: type inference failed for: r9v36, types: [com.instagram.model.payments.checkout.CheckoutLaunchParams, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v40, types: [com.instagram.model.keyword.KeywordRecommendations, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v46, types: [com.instagram.model.fbusertag.FBUserTag$FBUserInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v47, types: [java.lang.Object, com.instagram.model.effect.AttributedAREffect] */
    /* JADX WARNING: type inference failed for: r2v52, types: [com.instagram.model.direct.DirectThreadKey, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v57, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v58, types: [com.instagram.model.direct.DirectVisualMessageTarget, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v59, types: [java.lang.Object, com.instagram.model.direct.DirectSearchResharedContent] */
    /* JADX WARNING: type inference failed for: r9v61, types: [com.instagram.model.direct.DirectSearchMetaAIResponse, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v63, types: [com.instagram.model.direct.DirectPendingMusicShare, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v65, types: [java.lang.Object, com.instagram.model.direct.DirectMessageSearchThread] */
    /* JADX WARNING: type inference failed for: r9v66, types: [com.instagram.model.direct.DirectMessageSearchMessage, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v70, types: [com.instagram.model.coupon.PromoteCouponCurrencyAmount, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v73, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v75, types: [com.instagram.model.business.BusinessInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v76, types: [java.lang.Object, com.instagram.model.business.Address] */
    /* JADX WARNING: type inference failed for: r9v89, types: [java.lang.Object, com.instagram.mainfeed.intentawaread.api.ContextualOrganicInfo] */
    /* JADX WARNING: type inference failed for: r9v90, types: [java.lang.Object, com.instagram.login.twofac.model.TrustedDevice] */
    /* JADX WARNING: type inference failed for: r9v91, types: [com.instagram.login.twofac.model.TotpSeed, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v93, types: [com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v95, types: [com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x1109: MOVE  (r10v10 X.28D) = (r10v7 X.28D)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r30) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r0.A00
            r0 = r30
            switch(r1) {
                case 0: goto L_0x0027;
                case 1: goto L_0x007a;
                case 2: goto L_0x0080;
                case 3: goto L_0x008e;
                case 4: goto L_0x00a3;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00da;
                case 7: goto L_0x00fc;
                case 8: goto L_0x013a;
                case 9: goto L_0x0152;
                case 10: goto L_0x0192;
                case 11: goto L_0x01a4;
                case 12: goto L_0x01ad;
                case 13: goto L_0x01b6;
                case 14: goto L_0x01cc;
                case 15: goto L_0x01e5;
                case 16: goto L_0x01f5;
                case 17: goto L_0x01ff;
                case 18: goto L_0x020e;
                case 19: goto L_0x021d;
                case 20: goto L_0x0239;
                case 21: goto L_0x0262;
                case 22: goto L_0x0272;
                case 23: goto L_0x0298;
                case 24: goto L_0x02c0;
                case 25: goto L_0x03ae;
                case 26: goto L_0x03eb;
                case 27: goto L_0x040d;
                case 28: goto L_0x0417;
                case 29: goto L_0x0427;
                case 30: goto L_0x0459;
                case 31: goto L_0x0472;
                case 32: goto L_0x04b7;
                case 33: goto L_0x054d;
                case 34: goto L_0x05d4;
                case 35: goto L_0x05fe;
                case 36: goto L_0x0630;
                case 37: goto L_0x0652;
                case 38: goto L_0x067c;
                case 39: goto L_0x06c7;
                case 40: goto L_0x073d;
                case 41: goto L_0x0767;
                case 42: goto L_0x077f;
                case 43: goto L_0x07b1;
                case 44: goto L_0x080a;
                case 45: goto L_0x0837;
                case 46: goto L_0x084d;
                case 47: goto L_0x0867;
                case 48: goto L_0x08bb;
                case 49: goto L_0x08d3;
                case 50: goto L_0x092e;
                case 51: goto L_0x0982;
                case 52: goto L_0x0a0d;
                case 53: goto L_0x0a49;
                case 54: goto L_0x0a63;
                case 55: goto L_0x0a95;
                case 56: goto L_0x0aa4;
                case 57: goto L_0x0adc;
                case 58: goto L_0x0b22;
                case 59: goto L_0x0b48;
                case 60: goto L_0x0b83;
                case 61: goto L_0x0b99;
                case 62: goto L_0x0bab;
                case 63: goto L_0x0c07;
                case 64: goto L_0x0c29;
                case 65: goto L_0x0c39;
                case 66: goto L_0x0c48;
                case 67: goto L_0x0c57;
                case 68: goto L_0x0c66;
                case 69: goto L_0x0c75;
                case 70: goto L_0x0c84;
                case 71: goto L_0x0cb9;
                case 72: goto L_0x0cc3;
                case 73: goto L_0x0ce9;
                case 74: goto L_0x0d4a;
                case 75: goto L_0x0d78;
                case 76: goto L_0x0dd0;
                case 77: goto L_0x0dee;
                case 78: goto L_0x0f13;
                case 79: goto L_0x0f6f;
                case 80: goto L_0x0f7d;
                case 81: goto L_0x0f9a;
                case 82: goto L_0x0fea;
                case 83: goto L_0x1008;
                case 84: goto L_0x1026;
                case 85: goto L_0x1067;
                case 86: goto L_0x107f;
                case 87: goto L_0x1099;
                case 88: goto L_0x10c1;
                case 89: goto L_0x10e2;
                case 90: goto L_0x10e8;
                case 91: goto L_0x111d;
                case 92: goto L_0x115f;
                case 93: goto L_0x1173;
                case 94: goto L_0x1182;
                case 95: goto L_0x11c3;
                case 96: goto L_0x11ff;
                case 97: goto L_0x1215;
                case 98: goto L_0x1224;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType.CREATOR
            java.lang.Object r2 = r1.createFromParcel(r0)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType r2 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType) r2
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType r1 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType) r1
            java.lang.String r0 = r0.readString()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton r9 = new com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton
            r9.<init>(r1, r2, r0)
            return r9
        L_0x0027:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.Uxw r11 = X.C16602Uxw.valueOf(r1)
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.Class<com.instagram.leadgen.organic.model.LeadGenFormData> r1 = com.instagram.leadgen.organic.model.LeadGenFormData.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            int r1 = r0.readInt()
            r4 = 0
            boolean r17 = X.AnonymousClass7TF.A1P(r1)
            boolean r18 = X.C41848B3p.A1X(r0)
            boolean r19 = X.C41848B3p.A1X(r0)
            boolean r20 = X.C41848B3p.A1X(r0)
            int r3 = r0.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r3)
        L_0x0064:
            if (r4 == r3) goto L_0x0072
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.organic.model.LeadFormCustomQuestion.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            r2.add(r1)
            int r4 = r4 + 1
            goto L_0x0064
        L_0x0072:
            com.instagram.leadgen.organic.model.LeadGenFormData r9 = new com.instagram.leadgen.organic.model.LeadGenFormData
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r9
        L_0x007a:
            com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig r9 = new com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig
            r9.<init>(r0)
            return r9
        L_0x0080:
            java.lang.Class<X.SG0> r1 = X.SG0.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            X.SG0 r0 = (X.SG0) r0
            com.instagram.location.impl.LocationSignalPackageImpl r9 = new com.instagram.location.impl.LocationSignalPackageImpl
            r9.<init>(r0)
            return r9
        L_0x008e:
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour r9 = new com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A00 = r1
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r9.A01 = r1
            r0.readStringList(r1)
            return r9
        L_0x00a3:
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r9 = new com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r9.A04 = r2
            java.lang.Class<com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour> r1 = com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour.class
            A01(r0, r1, r2)
            java.lang.String r1 = r0.readString()
            r9.A01 = r1
            java.lang.String r1 = r0.readString()
            r9.A02 = r1
            boolean r0 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A00 = r0
            return r9
        L_0x00d0:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.location.surface.data.LocationPageInfo r9 = new com.instagram.location.surface.data.LocationPageInfo
            r9.<init>(r0)
            return r9
        L_0x00da:
            com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount r9 = new com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r1 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r9.A00 = r1
            java.lang.String r0 = r0.readString()
            r9.A01 = r0
            return r9
        L_0x00fc:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            boolean r15 = X.C41848B3p.A1X(r0)
            boolean r16 = X.C41848B3p.A1X(r0)
            boolean r17 = X.C41848B3p.A1X(r0)
            java.lang.String r12 = r0.readString()
            boolean r18 = X.C41848B3p.A1X(r0)
            boolean r19 = X.C41848B3p.A1X(r0)
            boolean r20 = X.C41848B3p.A1X(r0)
            boolean r21 = X.C41848B3p.A1X(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            boolean r22 = X.C41848B3p.A1X(r0)
            boolean r23 = X.C41848B3p.A1X(r0)
            com.instagram.login.api.TwoFactorInfoConfig r9 = new com.instagram.login.api.TwoFactorInfoConfig
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r9
        L_0x013a:
            com.instagram.login.twofac.model.TotpSeed r9 = new com.instagram.login.twofac.model.TotpSeed
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A00 = r1
            java.lang.String r0 = r0.readString()
            r9.A01 = r0
            return r9
        L_0x0152:
            com.instagram.login.twofac.model.TrustedDevice r9 = new com.instagram.login.twofac.model.TrustedDevice
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r9.A05 = r1
            java.lang.String r1 = r0.readString()
            r9.A06 = r1
            java.lang.String r1 = r0.readString()
            r9.A07 = r1
            long r1 = r0.readLong()
            r9.A02 = r1
            double r1 = r0.readDouble()
            r9.A00 = r1
            double r1 = r0.readDouble()
            r9.A01 = r1
            int r1 = r0.readInt()
            boolean r1 = X.C66581MXm.A1V(r1)
            r9.A09 = r1
            java.lang.String r0 = r0.readString()
            r9.A08 = r0
            return r9
        L_0x0192:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.mainfeed.intentawaread.api.ContextualOrganicInfo r9 = new com.instagram.mainfeed.intentawaread.api.ContextualOrganicInfo
            r9.<init>()
            r9.A01 = r1
            r9.A00 = r0
            return r9
        L_0x01a4:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.mediakit.analytics.MediaKitEntryPoint r9 = com.instagram.mediakit.analytics.MediaKitEntryPoint.valueOf(r0)
            return r9
        L_0x01ad:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.mediakit.analytics.VisibilitySheetOrigin r9 = com.instagram.mediakit.analytics.VisibilitySheetOrigin.valueOf(r0)
            return r9
        L_0x01b6:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.mediakit.config.MediaKitConfig> r1 = com.instagram.mediakit.config.MediaKitConfig.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.mediakit.analytics.MediaKitEntryPoint r0 = (com.instagram.mediakit.analytics.MediaKitEntryPoint) r0
            com.instagram.mediakit.config.MediaKitConfig r9 = new com.instagram.mediakit.config.MediaKitConfig
            r9.<init>(r0, r3, r2)
            return r9
        L_0x01cc:
            int r4 = X.C41848B3p.A00(r0)
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x01d5:
            if (r2 == r4) goto L_0x01df
            java.lang.Class<com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig> r1 = com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig.class
            X.C41848B3p.A1J(r0, r1, r3)
            int r2 = r2 + 1
            goto L_0x01d5
        L_0x01df:
            com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig r9 = new com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig
            r9.<init>(r3)
            return r9
        L_0x01e5:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r1 = com.instagram.mediakit.config.MediaKitInfoSheetConfig.A0D
            java.lang.Integer r0 = X.JTU.A0U(r0)
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r9 = new com.instagram.mediakit.config.MediaKitInfoSheetConfig
            r9.<init>(r0)
            return r9
        L_0x01f5:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.mediakit.config.MediaKitSectionActionSheetConfig r9 = new com.instagram.mediakit.config.MediaKitSectionActionSheetConfig
            r9.<init>(r0)
            return r9
        L_0x01ff:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.mediakit.model.MediaKitInsightType[] r1 = com.instagram.mediakit.model.MediaKitInsightType.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x020e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.mediakit.model.MediaKitSectionType[] r1 = com.instagram.mediakit.model.MediaKitSectionType.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x021d:
            int r3 = X.C41848B3p.A00(r0)
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel> r1 = com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            java.io.Serializable r0 = r0.readSerializable()
            X.0sP r0 = (X.0sP) r0
            com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel r9 = new com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel
            r9.<init>(r1, r2, r0, r3)
            return r9
        L_0x0239:
            int r1 = X.C41848B3p.A00(r0)
            r4 = 0
            if (r1 != 0) goto L_0x025d
            r3 = r4
        L_0x0241:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0258
            r2 = r4
        L_0x0248:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0252
            java.lang.Integer r4 = X.C41847B3o.A12(r0)
        L_0x0252:
            com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel r9 = new com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel
            r9.<init>(r3, r2, r4)
            return r9
        L_0x0258:
            java.lang.Integer r2 = X.C41847B3o.A12(r0)
            goto L_0x0248
        L_0x025d:
            java.lang.Integer r3 = X.C41847B3o.A12(r0)
            goto L_0x0241
        L_0x0262:
            int r1 = X.C41848B3p.A00(r0)
            java.io.Serializable r0 = r0.readSerializable()
            X.0sa r0 = (X.C62320sa) r0
            com.instagram.mediakit.ui.model.MediaKitLink r9 = new com.instagram.mediakit.ui.model.MediaKitLink
            r9.<init>(r0, r1)
            return r9
        L_0x0272:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            com.instagram.model.arads.ArAdsUIModel r9 = new com.instagram.model.arads.ArAdsUIModel
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r9
        L_0x0298:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.business.Address r9 = new com.instagram.model.business.Address
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r9.A01 = r1
            java.lang.String r1 = r0.readString()
            r9.A00 = r1
            java.lang.String r0 = r0.readString()
            r9.A02 = r0
            return r9
        L_0x02c0:
            com.instagram.model.business.BusinessInfo r9 = new com.instagram.model.business.BusinessInfo
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A09 = r1
            java.lang.String r1 = r0.readString()
            r9.A0A = r1
            java.lang.String r1 = r0.readString()
            r9.A0B = r1
            java.lang.Class<com.instagram.model.business.PublicPhoneContact> r1 = com.instagram.model.business.PublicPhoneContact.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.business.PublicPhoneContact r1 = (com.instagram.model.business.PublicPhoneContact) r1
            r9.A01 = r1
            java.lang.String r1 = r0.readString()
            r9.A0J = r1
            java.lang.String r1 = r0.readString()
            r9.A0L = r1
            java.lang.Class<com.instagram.model.business.Address> r1 = com.instagram.model.business.Address.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.business.Address r1 = (com.instagram.model.business.Address) r1
            r9.A00 = r1
            java.lang.Class<com.instagram.model.business.ProfileAddressData> r1 = com.instagram.model.business.ProfileAddressData.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r1 = r0.readArrayList(r1)
            r9.A0M = r1
            java.lang.String r1 = r0.readString()
            r9.A0K = r1
            java.lang.String r1 = r0.readString()
            r9.A05 = r1
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r9.A06 = r1
            java.lang.String r1 = r0.readString()
            r9.A07 = r1
            java.lang.String r1 = r0.readString()
            r9.A08 = r1
            java.lang.String r1 = r0.readString()
            r9.A0C = r1
            java.lang.String r1 = r0.readString()
            r9.A0D = r1
            java.lang.String r1 = r0.readString()
            r9.A0E = r1
            java.lang.String r1 = r0.readString()
            r9.A0F = r1
            byte r1 = r0.readByte()
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r9.A0N = r1
            byte r1 = r0.readByte()
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r9.A0Q = r1
            byte r1 = r0.readByte()
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r9.A0S = r1
            byte r1 = r0.readByte()
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r9.A0R = r1
            byte r1 = r0.readByte()
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r9.A0O = r1
            byte r1 = r0.readByte()
            if (r1 != 0) goto L_0x0379
            r2 = 0
        L_0x0379:
            r9.A0P = r2
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x038b
            int r1 = java.lang.Integer.parseInt(r1)
            X.16V r1 = X.16U.A00(r1)
            r9.A02 = r1
        L_0x038b:
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x039b
            int r1 = java.lang.Integer.parseInt(r1)
            X.16V r1 = X.16U.A00(r1)
            r9.A03 = r1
        L_0x039b:
            java.lang.String r1 = r0.readString()
            r9.A0G = r1
            java.lang.String r1 = r0.readString()
            r9.A0I = r1
            java.lang.String r0 = r0.readString()
            r9.A0H = r0
            return r9
        L_0x03ae:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            int r1 = r0.readInt()
            r11 = 0
            if (r1 != 0) goto L_0x03e2
            r10 = r11
        L_0x03ca:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x03d8
            float r1 = r0.readFloat()
            java.lang.Float r11 = java.lang.Float.valueOf(r1)
        L_0x03d8:
            java.lang.String r17 = r0.readString()
            com.instagram.model.business.ProfileAddressData r9 = new com.instagram.model.business.ProfileAddressData
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r9
        L_0x03e2:
            float r1 = r0.readFloat()
            java.lang.Float r10 = java.lang.Float.valueOf(r1)
            goto L_0x03ca
        L_0x03eb:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.business.PublicPhoneContact r9 = new com.instagram.model.business.PublicPhoneContact
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.String r1 = r0.readString()
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A01 = r1
            java.lang.String r0 = r0.readString()
            r9.A02 = r0
            return r9
        L_0x040d:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.comments.ParcelableCommenterDetails r9 = new com.instagram.model.comments.ParcelableCommenterDetails
            r9.<init>(r0)
            return r9
        L_0x0417:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            if (r0 == 0) goto L_0x0422
            com.instagram.model.coupon.PromoteAdsCouponUseCase r9 = com.instagram.model.coupon.PromoteAdsCouponUseCase.valueOf(r0)
            return r9
        L_0x0422:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0427:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r9 = new com.instagram.model.coupon.PromoteCouponCurrencyAmount
            r9.<init>()
            java.lang.String r1 = r0.readString()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0454
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x044f
            r9.A03 = r1
            int r1 = r0.readInt()
            r9.A00 = r1
            int r0 = r0.readInt()
            r9.A01 = r0
            return r9
        L_0x044f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0454:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0459:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            if (r1 == 0) goto L_0x046d
            java.lang.String r0 = "RECREATE_MIN_SPEND_X_TO_GET_Y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x046a
            com.instagram.model.coupon.PromoteCouponType r9 = com.instagram.model.coupon.PromoteCouponType.RECREATE_MIN_SPEND_X_TO_GET_Y
            return r9
        L_0x046a:
            com.instagram.model.coupon.PromoteCouponType r9 = com.instagram.model.coupon.PromoteCouponType.HERES_X
            return r9
        L_0x046d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0472:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            long r18 = r0.readLong()
            int r1 = r0.readInt()
            r10 = 0
            if (r1 != 0) goto L_0x04ae
            r11 = r10
        L_0x0482:
            java.lang.String r12 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0494
            java.lang.String r1 = r0.readString()
            X.EVp r10 = X.C48097EVp.valueOf(r1)
        L_0x0494:
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            com.instagram.model.direct.DirectIfyXma r9 = new com.instagram.model.direct.DirectIfyXma
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r9
        L_0x04ae:
            long r1 = r0.readLong()
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            goto L_0x0482
        L_0x04b7:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.direct.DirectMessageSearchMessage r9 = new com.instagram.model.direct.DirectMessageSearchMessage
            r9.<init>()
            java.lang.String r1 = r0.readString()
            java.lang.String r3 = "Required value was null."
            if (r1 == 0) goto L_0x0548
            r9.A07 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0543
            r9.A08 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x053e
            r9.A0B = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r2 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            if (r1 == 0) goto L_0x0539
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r9.A05 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r9.A06 = r1
            long r1 = r0.readLong()
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0534
            r9.A09 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x052f
            r9.A0A = r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Class<com.instagram.model.direct.HighlightRange> r1 = com.instagram.model.direct.HighlightRange.class
            A01(r0, r1, r2)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
            r9.A03 = r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Class<com.instagram.pendingmedia.model.recipients.PendingRecipient> r1 = com.instagram.pendingmedia.model.recipients.PendingRecipient.class
            A01(r0, r1, r2)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
            r9.A04 = r1
            long r1 = r0.readLong()
            r9.A01 = r1
            long r0 = r0.readLong()
            r9.A00 = r0
            return r9
        L_0x052f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0534:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0539:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x053e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0543:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0548:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x054d:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.direct.DirectMessageSearchThread r9 = new com.instagram.model.direct.DirectMessageSearchThread
            r9.<init>()
            java.lang.String r1 = r0.readString()
            java.lang.String r3 = "Required value was null."
            if (r1 == 0) goto L_0x05cf
            r9.A08 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x05ca
            r9.A06 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x05c5
            r9.A09 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x05c0
            r9.A0A = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x05bb
            r9.A07 = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r2 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            if (r1 == 0) goto L_0x05b6
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r9.A04 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r9.A05 = r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Class<com.instagram.pendingmedia.model.recipients.PendingRecipient> r1 = com.instagram.pendingmedia.model.recipients.PendingRecipient.class
            A01(r0, r1, r2)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
            r9.A03 = r1
            long r1 = r0.readLong()
            r9.A02 = r1
            long r1 = r0.readLong()
            r9.A01 = r1
            long r0 = r0.readLong()
            r9.A00 = r0
            return r9
        L_0x05b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x05bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x05c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x05c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x05ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x05cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x05d4:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            java.lang.String r14 = r0.readString()
            java.lang.Class<com.instagram.model.direct.DirectPendingLayeredXma> r1 = com.instagram.model.direct.DirectPendingLayeredXma.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            boolean r15 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.mediasize.ExtendedImageUrl r10 = (com.instagram.model.mediasize.ExtendedImageUrl) r10
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.mediasize.ExtendedImageUrl r11 = (com.instagram.model.mediasize.ExtendedImageUrl) r11
            boolean r16 = X.C41848B3p.A1X(r0)
            com.instagram.model.direct.DirectPendingLayeredXma r9 = new com.instagram.model.direct.DirectPendingLayeredXma
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L_0x05fe:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.direct.DirectPendingMusicShare> r1 = com.instagram.model.direct.DirectPendingMusicShare.class
            android.os.Parcelable r5 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.mediasize.ExtendedImageUrl r5 = (com.instagram.model.mediasize.ExtendedImageUrl) r5
            java.lang.String r4 = r0.readString()
            java.lang.String r3 = r0.readString()
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.model.direct.DirectPendingMusicShare r9 = new com.instagram.model.direct.DirectPendingMusicShare
            r9.<init>()
            r9.A00 = r5
            r9.A05 = r4
            r9.A04 = r3
            r9.A02 = r2
            r9.A01 = r1
            r9.A03 = r0
            return r9
        L_0x0630:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            boolean r15 = X.C41848B3p.A1X(r0)
            java.lang.String r14 = r0.readString()
            java.lang.String r16 = r0.readString()
            com.instagram.model.direct.DirectRoomsXma r9 = new com.instagram.model.direct.DirectRoomsXma
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L_0x0652:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.Ogb r1 = com.instagram.model.direct.DirectSearchPrompt.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r1)
            if (r2 == 0) goto L_0x0677
            java.lang.String r1 = r0.readString()
            X.NkX r0 = X.C69393NkX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r0 = com.facebook.graphql.enums.EnumHelper.A00(r1, r0)
            X.NkX r0 = (X.C69393NkX) r0
            X.0qQ.A07(r0)
            com.instagram.model.direct.DirectSearchMetaAIResponse r9 = new com.instagram.model.direct.DirectSearchMetaAIResponse
            r9.<init>()
            r9.A01 = r2
            r9.A00 = r0
            return r9
        L_0x0677:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x067c:
            java.lang.String r8 = X.C41848B3p.A1D(r0)
            java.lang.String r7 = "Required value was null."
            if (r8 == 0) goto L_0x06c2
            java.lang.String r6 = r0.readString()
            if (r6 == 0) goto L_0x06bd
            X.9VB[] r5 = X.AnonymousClass9VB.values()
            int r4 = r5.length
            r3 = 0
        L_0x0690:
            if (r3 >= r4) goto L_0x069f
            r2 = r5[r3]
            java.lang.String r1 = r2.A00
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 != 0) goto L_0x06a1
            int r3 = r3 + 1
            goto L_0x0690
        L_0x069f:
            X.9VB r2 = X.AnonymousClass9VB.TEXT
        L_0x06a1:
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x06b8
            java.lang.String r0 = r0.readString()
            if (r0 == 0) goto L_0x06b3
            com.instagram.model.direct.DirectSearchPrompt r9 = new com.instagram.model.direct.DirectSearchPrompt
            r9.<init>(r2, r8, r1, r0)
            return r9
        L_0x06b3:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r7)
            throw r0
        L_0x06b8:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r7)
            throw r0
        L_0x06bd:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r7)
            throw r0
        L_0x06c2:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r7)
            throw r0
        L_0x06c7:
            com.instagram.model.direct.DirectSearchResharedContent r9 = new com.instagram.model.direct.DirectSearchResharedContent
            r9.<init>()
            java.lang.String r3 = r0.readString()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r1, r3)
            com.instagram.common.session.UserSession r1 = X.DbS.A0U(r2)
            r9.A00 = r1
            int r2 = r0.readInt()
            java.lang.String r4 = "DirectSearchResharedContent"
            r1 = 1
            if (r2 != r1) goto L_0x070b
            int r1 = r0.readInt()
            byte[] r2 = new byte[r1]
            r0.readByteArray(r2)
            com.instagram.common.session.UserSession r1 = r9.A00     // Catch:{ IOException -> 0x0705 }
            X.9IV r2 = X.C266884aV.A00(r1, r2)     // Catch:{ IOException -> 0x0705 }
            java.lang.Object r1 = r2.A00     // Catch:{ IOException -> 0x0705 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ IOException -> 0x0705 }
            if (r1 != 0) goto L_0x0704
            java.lang.Object r1 = r2.A01     // Catch:{ IOException -> 0x0705 }
            X.1Xj r1 = (X.1Xj) r1     // Catch:{ IOException -> 0x0705 }
            r9.A01 = r1     // Catch:{ IOException -> 0x0705 }
            goto L_0x070b
        L_0x0704:
            throw r1     // Catch:{ IOException -> 0x0705 }
        L_0x0705:
            r2 = move-exception
            java.lang.String r1 = "Media was not deserializable."
            X.0KC.A0F(r4, r1, r2)
        L_0x070b:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r1 = 0
            r0.readList(r2, r1)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x071b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0736
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x072f }
            com.instagram.user.model.User r0 = X.1aC.A04(r1)     // Catch:{ IOException -> 0x072f }
            r3.add(r0)     // Catch:{ IOException -> 0x072f }
            goto L_0x071b
        L_0x072f:
            r1 = move-exception
            java.lang.String r0 = "Couldn't deserialize string to user"
            X.0KC.A0F(r4, r0, r1)
            goto L_0x071b
        L_0x0736:
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r3)
            r9.A02 = r0
            return r9
        L_0x073d:
            com.instagram.model.direct.DirectVisualMessageTarget r9 = new com.instagram.model.direct.DirectVisualMessageTarget
            r9.<init>()
            android.os.Parcelable$Creator r1 = com.instagram.pendingmedia.model.recipients.PendingRecipient.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            if (r1 != 0) goto L_0x074e
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
        L_0x074e:
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A01 = r1
            byte r0 = r0.readByte()
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r9.A03 = r0
            return r9
        L_0x0767:
            com.instagram.model.direct.HighlightRange r9 = new com.instagram.model.direct.HighlightRange
            r9.<init>()
            int r1 = r0.readInt()
            r9.A02 = r1
            int r1 = r0.readInt()
            r9.A01 = r1
            int r0 = r0.readInt()
            r9.A00 = r0
            return r9
        L_0x077f:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x07aa
            r10 = 0
        L_0x078a:
            com.instagram.model.direct.stickerstore.TypedImageUrl r10 = (com.instagram.model.direct.stickerstore.TypedImageUrl) r10
            android.os.Parcelable$Creator r1 = com.instagram.model.direct.stickerstore.TypedImageUrl.CREATOR
            java.lang.Object r11 = r1.createFromParcel(r0)
            com.instagram.model.direct.stickerstore.TypedImageUrl r11 = (com.instagram.model.direct.stickerstore.TypedImageUrl) r11
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            boolean r16 = X.C41848B3p.A1X(r0)
            com.instagram.model.direct.stickerstore.DirectStoreSticker r9 = new com.instagram.model.direct.stickerstore.DirectStoreSticker
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L_0x07aa:
            android.os.Parcelable$Creator r1 = com.instagram.model.direct.stickerstore.TypedImageUrl.CREATOR
            java.lang.Object r10 = r1.createFromParcel(r0)
            goto L_0x078a
        L_0x07b1:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            int r19 = r0.readInt()
            int r20 = r0.readInt()
            int r1 = r0.readInt()
            r11 = 0
            if (r1 != 0) goto L_0x0801
            r12 = r11
        L_0x07cd:
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            int r1 = r0.readInt()
            r2 = 1
            if (r1 != 0) goto L_0x07f8
            r10 = r11
        L_0x07dd:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x07ee
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x07ea
            r2 = 0
        L_0x07ea:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
        L_0x07ee:
            java.lang.String r18 = r0.readString()
            com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem r9 = new com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r9
        L_0x07f8:
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            goto L_0x07dd
        L_0x0801:
            double r1 = r0.readDouble()
            java.lang.Double r12 = java.lang.Double.valueOf(r1)
            goto L_0x07cd
        L_0x080a:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            int r3 = r0.readInt()
            java.util.ArrayList r14 = X.DbS.A0v(r3)
            r2 = 0
        L_0x0823:
            if (r2 == r3) goto L_0x0831
            android.os.Parcelable$Creator r1 = com.instagram.model.direct.stickerstore.DirectStoreSticker.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            r14.add(r1)
            int r2 = r2 + 1
            goto L_0x0823
        L_0x0831:
            com.instagram.model.direct.stickerstore.StickerPack r9 = new com.instagram.model.direct.stickerstore.StickerPack
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x0837:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.model.direct.stickerstore.StickerPackResponseItem r9 = new com.instagram.model.direct.stickerstore.StickerPackResponseItem
            r9.<init>(r3, r2, r1, r0)
            return r9
        L_0x084d:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.direct.stickerstore.TypedImageUrl> r1 = com.instagram.model.direct.stickerstore.TypedImageUrl.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            java.lang.String r1 = r0.readString()
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.model.direct.stickerstore.TypedImageUrl r9 = new com.instagram.model.direct.stickerstore.TypedImageUrl
            r9.<init>(r2, r1, r0)
            return r9
        L_0x0867:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            long r19 = r0.readLong()
            int r18 = r0.readInt()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.Class<com.instagram.model.direct.threadkey.impl.MsysPendingRecipient> r1 = com.instagram.model.direct.threadkey.impl.MsysPendingRecipient.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.FollowStatus r11 = (com.instagram.user.model.FollowStatus) r11
            boolean r21 = X.C41848B3p.A1X(r0)
            boolean r22 = X.C41848B3p.A1X(r0)
            boolean r23 = X.C41848B3p.A1X(r0)
            boolean r24 = X.C41848B3p.A1X(r0)
            boolean r25 = X.C41848B3p.A1X(r0)
            boolean r26 = X.C41848B3p.A1X(r0)
            java.lang.Integer r12 = X.JTU.A0U(r0)
            boolean r27 = X.C41848B3p.A1X(r0)
            boolean r28 = X.C41848B3p.A1X(r0)
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r9 = new com.instagram.model.direct.threadkey.impl.MsysPendingRecipient
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            return r9
        L_0x08bb:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey> r2 = com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey r9 = new com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey
            r9.<init>(r1, r0)
            return r9
        L_0x08d3:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x0916
            java.lang.String r3 = "Required value was null."
            if (r2 == r1) goto L_0x0907
            r1 = 2
            if (r2 != r1) goto L_0x0927
            java.lang.Class<com.instagram.model.direct.threadkey.impl.MsysThreadId> r1 = com.instagram.model.direct.threadkey.impl.MsysThreadId.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r2
            if (r2 == 0) goto L_0x0922
            java.lang.String r0 = r0.readString()
            X.0qQ.A0A(r0)
            X.3t0 r1 = X.C66580MXl.A0g(r0)
            X.Ndc r0 = new X.Ndc
            r0.<init>(r1, r2)
        L_0x08ff:
            X.3t3 r0 = (X.C254793t3) r0
            com.instagram.model.direct.threadkey.util.ThreadIdParcelable r9 = new com.instagram.model.direct.threadkey.util.ThreadIdParcelable
            r9.<init>(r0)
            return r9
        L_0x0907:
            java.lang.Class<com.instagram.model.direct.threadkey.impl.MsysThreadId> r1 = com.instagram.model.direct.threadkey.impl.MsysThreadId.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            if (r0 != 0) goto L_0x08ff
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0916:
            java.lang.String r0 = r0.readString()
            X.0qQ.A0A(r0)
            X.3t0 r0 = X.C66580MXl.A0g(r0)
            goto L_0x08ff
        L_0x0922:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0927:
            java.lang.String r0 = "Unexpected parcel contents"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x092e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x0963
            java.lang.String r3 = "Required value was null."
            if (r2 == r1) goto L_0x0954
            r1 = 2
            if (r2 != r1) goto L_0x094d
            java.lang.Class<com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey> r1 = com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            if (r2 != 0) goto L_0x097a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x094d:
            java.lang.String r0 = "Unexpected parcel contents"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0954:
            java.lang.Class<com.instagram.model.direct.threadkey.impl.MsysThreadId> r1 = com.instagram.model.direct.threadkey.impl.MsysThreadId.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r2
            if (r2 != 0) goto L_0x097a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0963:
            com.instagram.model.direct.DirectThreadKey r2 = new com.instagram.model.direct.DirectThreadKey
            r2.<init>()
            java.lang.String r1 = r0.readString()
            r2.A00 = r1
            java.lang.String r1 = r0.readString()
            r2.A01 = r1
            java.util.ArrayList r0 = r0.createStringArrayList()
            r2.A02 = r0
        L_0x097a:
            X.3sy r2 = (X.C254743sy) r2
            com.instagram.model.direct.threadkey.util.UnifiedThreadKeyParcelable r9 = new com.instagram.model.direct.threadkey.util.UnifiedThreadKeyParcelable
            r9.<init>(r2)
            return r9
        L_0x0982:
            com.instagram.model.effect.AttributedAREffect r9 = new com.instagram.model.effect.AttributedAREffect
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r1.getClass()
            r9.A09 = r1
            java.lang.String r1 = r0.readString()
            r1.getClass()
            r9.A0A = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r2 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A07 = r1
            java.lang.String r1 = r0.readString()
            r9.A06 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r9.A01 = r1
            int r1 = r0.readInt()
            r9.A00 = r1
            byte r1 = r0.readByte()
            if (r1 == 0) goto L_0x0a0a
            X.3Ym r1 = X.C243373Ym.SAVED
        L_0x09c5:
            r9.A05 = r1
            java.util.ArrayList r1 = r0.createStringArrayList()
            r1.getClass()
            r9.A0E = r1
            java.util.ArrayList r1 = r0.createStringArrayList()
            r1.getClass()
            r9.A0G = r1
            java.lang.String r1 = r0.readString()
            r9.A0C = r1
            java.lang.Class<com.instagram.model.shopping.ProductAREffectContainer> r1 = com.instagram.model.shopping.ProductAREffectContainer.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.ProductAREffectContainer r1 = (com.instagram.model.shopping.ProductAREffectContainer) r1
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r9.A0B = r1
            java.util.ArrayList r1 = r0.createStringArrayList()
            r9.A0F = r1
            java.lang.String r1 = r0.readString()
            r9.A08 = r1
            java.lang.String r1 = r0.readString()
            r9.A0D = r1
            java.io.Serializable r0 = r0.readSerializable()
            X.Kit r0 = (X.C62622Kit) r0
            r9.A03 = r0
            return r9
        L_0x0a0a:
            X.3Ym r1 = X.C243373Ym.NOT_SAVED
            goto L_0x09c5
        L_0x0a0d:
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r9 = new com.instagram.model.fbusertag.FBUserTag$FBUserInfo
            r9.<init>()
            java.lang.String r1 = r0.readString()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0a46
            r9.A05 = r1
        L_0x0a1c:
            java.lang.String r1 = r0.readString()
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0a43
            r9.A01 = r1
        L_0x0a2a:
            java.lang.String r1 = r0.readString()
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r0 = r0.readString()
            r9.A06 = r0
            return r9
        L_0x0a43:
            r9.A01 = r2
            goto L_0x0a2a
        L_0x0a46:
            r9.A05 = r2
            goto L_0x0a1c
        L_0x0a49:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            com.instagram.model.fundraiser.FundraiserDisplayInfoModel r9 = new com.instagram.model.fundraiser.FundraiserDisplayInfoModel
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x0a63:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            int r19 = r0.readInt()
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            boolean r20 = X.C41848B3p.A1X(r0)
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.util.ArrayList r18 = r0.createStringArrayList()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            com.instagram.model.fundraiser.NewFundraiserInfo r9 = new com.instagram.model.fundraiser.NewFundraiserInfo
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r9
        L_0x0a95:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.hashtag.HashtagFollowStatus[] r1 = com.instagram.model.hashtag.HashtagFollowStatus.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x0aa4:
            com.instagram.model.hashtag.response.HashtagCollection r9 = new com.instagram.model.hashtag.response.HashtagCollection
            r9.<init>()
            byte r2 = r0.readByte()
            r1 = 1
            if (r2 != r1) goto L_0x0ad8
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0abc:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0ad0
            java.lang.Object r1 = r2.next()
            com.instagram.model.hashtag.Hashtag r1 = (com.instagram.model.hashtag.Hashtag) r1
            com.instagram.model.hashtag.HashtagImpl r1 = r1.FEY()
            r3.add(r1)
            goto L_0x0abc
        L_0x0ad0:
            r9.A00 = r3
            java.lang.Class<com.instagram.model.hashtag.Hashtag> r1 = com.instagram.model.hashtag.Hashtag.class
            A01(r0, r1, r3)
            return r9
        L_0x0ad8:
            r0 = 0
            r9.A00 = r0
            return r9
        L_0x0adc:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r10 = 0
            java.lang.String r12 = ""
            r18 = 0
            com.instagram.model.keyword.Keyword r9 = new com.instagram.model.keyword.Keyword
            r11 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r20 = r1
            r21 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21)
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.String r1 = r0.readString()
            if (r1 != 0) goto L_0x0b03
            r1 = r12
        L_0x0b03:
            r9.A04 = r1
            long r1 = r0.readLong()
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A05 = r1
            java.lang.String r1 = r0.readString()
            r9.A06 = r1
            double r0 = r0.readDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9.A01 = r0
            return r9
        L_0x0b22:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = ""
            if (r3 != 0) goto L_0x0b2b
            r3 = r2
        L_0x0b2b:
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0b32
            r2 = r1
        L_0x0b32:
            android.os.Parcelable$Creator r1 = com.instagram.model.keyword.Keyword.CREATOR
            java.util.ArrayList r0 = r0.createTypedArrayList(r1)
            if (r0 != 0) goto L_0x0b3c
            X.0sn r0 = X.0sn.A00
        L_0x0b3c:
            com.instagram.model.keyword.KeywordRecommendations r9 = new com.instagram.model.keyword.KeywordRecommendations
            r9.<init>()
            r9.A00 = r3
            r9.A01 = r2
            r9.A02 = r0
            return r9
        L_0x0b48:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.String r4 = ""
            java.lang.String r3 = "CATEGORY"
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = X.DbT.A12(r2, r3)
            com.instagram.model.mapquery.MapQuery r9 = new com.instagram.model.mapquery.MapQuery
            r9.<init>(r4, r4, r1)
            java.lang.String r1 = r0.readString()
            if (r1 != 0) goto L_0x0b62
            r1 = r4
        L_0x0b62:
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            if (r1 != 0) goto L_0x0b6b
            r1 = r4
        L_0x0b6b:
            r9.A01 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0b74
            r4 = r1
        L_0x0b74:
            r9.A03 = r4
            java.lang.String r0 = r0.readString()
            if (r0 != 0) goto L_0x0b80
            java.lang.String r0 = X.DbT.A12(r2, r3)
        L_0x0b80:
            r9.A02 = r0
            return r9
        L_0x0b83:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.Integer r0 = X.JTU.A0U(r0)
            com.instagram.model.payments.CurrencyAmountInfoImpl r9 = new com.instagram.model.payments.CurrencyAmountInfoImpl
            r9.<init>(r0, r3, r2, r1)
            return r9
        L_0x0b99:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            long r2 = r0.readLong()
            long r0 = r0.readLong()
            com.instagram.model.payments.DeliveryWindowInfoImpl r9 = new com.instagram.model.payments.DeliveryWindowInfoImpl
            r9.<init>(r2, r0)
            return r9
        L_0x0bab:
            com.instagram.model.payments.checkout.CheckoutLaunchParams r9 = new com.instagram.model.payments.checkout.CheckoutLaunchParams
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A06 = r1
            java.lang.String r1 = r0.readString()
            r9.A07 = r1
            java.lang.String r1 = r0.readString()
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r9.A09 = r2
            java.lang.Class<com.instagram.model.payments.common.ProductItem> r1 = com.instagram.model.payments.common.ProductItem.class
            A01(r0, r1, r2)
            java.lang.String r1 = r0.readString()
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A05 = r1
            int r1 = r0.readInt()
            r3 = 0
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r2)
            r9.A0B = r1
            int r1 = r0.readInt()
            if (r1 != r2) goto L_0x0bf2
            r3 = 1
        L_0x0bf2:
            r9.A0C = r3
            java.lang.String r1 = r0.readString()
            r9.A08 = r1
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.String r0 = r0.readString()
            r9.A01 = r0
            return r9
        L_0x0c07:
            com.instagram.model.payments.common.ProductItem r9 = new com.instagram.model.payments.common.ProductItem
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.Class<com.instagram.model.payments.CurrencyAmountInfo> r1 = com.instagram.model.payments.CurrencyAmountInfo.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.payments.CurrencyAmountInfoImpl r1 = (com.instagram.model.payments.CurrencyAmountInfoImpl) r1
            r9.A01 = r1
            int r1 = r0.readInt()
            r9.A00 = r1
            java.lang.String r0 = r0.readString()
            r9.A02 = r0
            return r9
        L_0x0c29:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            if (r0 == 0) goto L_0x0c34
            com.instagram.model.reels.ReelViewerContextButtonType r9 = com.instagram.model.reels.ReelViewerContextButtonType.valueOf(r0)
            return r9
        L_0x0c34:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0c39:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.reels.StoryWedgingType[] r1 = com.instagram.model.reels.StoryWedgingType.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x0c48:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle[] r1 = com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x0c57:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType[] r1 = com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x0c66:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType[] r1 = com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x0c75:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.reels.netego.ShoppingNetegoType[] r1 = com.instagram.model.reels.netego.ShoppingNetegoType.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x0c84:
            int r3 = X.C41848B3p.A00(r0)
            java.util.ArrayList r14 = X.DbS.A0v(r3)
            r2 = 0
        L_0x0c8d:
            if (r2 == r3) goto L_0x0c97
            java.lang.Class<com.instagram.model.rtc.RtcCallAudience> r1 = com.instagram.model.rtc.RtcCallAudience.class
            X.C41848B3p.A1J(r0, r1, r14)
            int r2 = r2 + 1
            goto L_0x0c8d
        L_0x0c97:
            boolean r16 = X.C41848B3p.A1X(r0)
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.Class<com.instagram.model.rtc.RtcCallAudience> r1 = com.instagram.model.rtc.RtcCallAudience.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            java.lang.String r13 = r0.readString()
            java.util.ArrayList r15 = r0.createStringArrayList()
            com.instagram.model.rtc.RtcCallAudience r9 = new com.instagram.model.rtc.RtcCallAudience
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L_0x0cb9:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.model.rtc.RtcCallKey r9 = new com.instagram.model.rtc.RtcCallKey
            r9.<init>(r0)
            return r9
        L_0x0cc3:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.7Rj r3 = X.C331537Rj.valueOf(r1)
            android.os.Parcelable$Creator r1 = com.instagram.model.rtc.RtcThreadKey.CREATOR
            java.lang.Object r2 = r1.createFromParcel(r0)
            com.instagram.model.rtc.RtcThreadKey r2 = (com.instagram.model.rtc.RtcThreadKey) r2
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0ce0
            r0 = 0
        L_0x0cda:
            com.instagram.model.rtc.RtcCallSource r9 = new com.instagram.model.rtc.RtcCallSource
            r9.<init>(r0, r3, r2)
            return r9
        L_0x0ce0:
            java.lang.String r0 = r0.readString()
            X.Nm9 r0 = X.C69465Nm9.valueOf(r0)
            goto L_0x0cda
        L_0x0ce9:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.Nid r11 = X.C69277Nid.valueOf(r1)
            android.os.Parcelable$Creator r1 = com.instagram.model.rtc.RtcCallAudience.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
            com.instagram.model.rtc.RtcCallAudience r12 = (com.instagram.model.rtc.RtcCallAudience) r12
            android.os.Parcelable$Creator r1 = com.instagram.model.rtc.RtcCallSource.CREATOR
            java.lang.Object r14 = r1.createFromParcel(r0)
            com.instagram.model.rtc.RtcCallSource r14 = (com.instagram.model.rtc.RtcCallSource) r14
            boolean r19 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.instagram.model.rtc.RtcCreateCallArgs> r3 = com.instagram.model.rtc.RtcCreateCallArgs.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r2 = (com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments) r2
            boolean r20 = X.C41848B3p.A1X(r0)
            boolean r21 = X.C41848B3p.A1X(r0)
            int r18 = r0.readInt()
            int r1 = r0.readInt()
            r10 = 0
            if (r1 != 0) goto L_0x0d43
            r15 = r10
        L_0x0d21:
            com.instagram.model.rtc.RtcIgNotification r15 = (com.instagram.model.rtc.RtcIgNotification) r15
            java.lang.String r17 = r0.readString()
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r3)
            com.instagram.model.rtc.RtcCallFunnelSessionId r13 = (com.instagram.model.rtc.RtcCallFunnelSessionId) r13
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0d3b
            java.lang.String r0 = r0.readString()
            X.Nm9 r10 = X.C69465Nm9.valueOf(r0)
        L_0x0d3b:
            com.instagram.model.rtc.RtcCreateCallArgs r9 = new com.instagram.model.rtc.RtcCreateCallArgs
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r9
        L_0x0d43:
            android.os.Parcelable$Creator r1 = com.instagram.model.rtc.RtcIgNotification.CREATOR
            java.lang.Object r15 = r1.createFromParcel(r0)
            goto L_0x0d21
        L_0x0d4a:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            com.instagram.model.rtc.RtcIgNotification r9 = new com.instagram.model.rtc.RtcIgNotification
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r9
        L_0x0d78:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.Nid r10 = X.C69277Nid.valueOf(r1)
            android.os.Parcelable$Creator r1 = com.instagram.model.rtc.RtcCallAudience.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
            com.instagram.model.rtc.RtcCallAudience r12 = (com.instagram.model.rtc.RtcCallAudience) r12
            android.os.Parcelable$Creator r1 = com.instagram.model.rtc.RtcCallSource.CREATOR
            java.lang.Object r15 = r1.createFromParcel(r0)
            com.instagram.model.rtc.RtcCallSource r15 = (com.instagram.model.rtc.RtcCallSource) r15
            boolean r20 = X.C41848B3p.A1X(r0)
            android.os.Parcelable$Creator r1 = com.instagram.model.rtc.RtcCallKey.CREATOR
            java.lang.Object r14 = r1.createFromParcel(r0)
            com.instagram.model.rtc.RtcCallKey r14 = (com.instagram.model.rtc.RtcCallKey) r14
            java.lang.String r17 = r0.readString()
            int r19 = r0.readInt()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0dc9
            r2 = 0
        L_0x0dab:
            com.instagram.model.rtc.RtcIgNotification r2 = (com.instagram.model.rtc.RtcIgNotification) r2
            java.lang.String r18 = r0.readString()
            java.lang.Class<com.instagram.model.rtc.RtcJoinCallArgs> r1 = com.instagram.model.rtc.RtcJoinCallArgs.class
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.rtc.RtcCallFunnelSessionId r13 = (com.instagram.model.rtc.RtcCallFunnelSessionId) r13
            java.lang.String r0 = r0.readString()
            X.Nie r11 = X.C69278Nie.valueOf(r0)
            com.instagram.model.rtc.RtcJoinCallArgs r9 = new com.instagram.model.rtc.RtcJoinCallArgs
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r9
        L_0x0dc9:
            android.os.Parcelable$Creator r1 = com.instagram.model.rtc.RtcIgNotification.CREATOR
            java.lang.Object r2 = r1.createFromParcel(r0)
            goto L_0x0dab
        L_0x0dd0:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.rtc.RtcThreadKey> r1 = com.instagram.model.rtc.RtcThreadKey.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.direct.DirectThreadKey r3 = (com.instagram.model.direct.DirectThreadKey) r3
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.model.rtc.RtcThreadKey r9 = new com.instagram.model.rtc.RtcThreadKey
            r9.<init>(r3, r2, r1, r0)
            return r9
        L_0x0dee:
            java.lang.String r14 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "INSTAGRAM"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0eec
            java.lang.Integer r10 = X.AnonymousClass05K.A00
        L_0x0e00:
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "PHOTO"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e98
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x0e0e:
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "DEEP_LINK"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e2a
            java.lang.Integer r12 = X.AnonymousClass05K.A00
        L_0x0e1c:
            java.lang.String r15 = r0.readString()
            java.lang.Integer r13 = X.JTU.A0U(r0)
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r9 = new com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x0e2a:
            java.lang.String r1 = "THREAD"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e35
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            goto L_0x0e1c
        L_0x0e35:
            java.lang.String r1 = "SHARE_SHEET"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e40
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            goto L_0x0e1c
        L_0x0e40:
            java.lang.String r1 = "IN_CALL"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e4b
            java.lang.Integer r12 = X.AnonymousClass05K.A0N
            goto L_0x0e1c
        L_0x0e4b:
            java.lang.String r1 = "IN_CALL_SHARESHEET"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e56
            java.lang.Integer r12 = X.AnonymousClass05K.A0Y
            goto L_0x0e1c
        L_0x0e56:
            java.lang.String r1 = "THREAD_SINGLE_FEED"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e61
            java.lang.Integer r12 = X.AnonymousClass05K.A0j
            goto L_0x0e1c
        L_0x0e61:
            java.lang.String r1 = "DIRECT_SHARE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e6c
            java.lang.Integer r12 = X.AnonymousClass05K.A0u
            goto L_0x0e1c
        L_0x0e6c:
            java.lang.String r1 = "DIRECT_SHARE_LOCAL"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e77
            java.lang.Integer r12 = X.AnonymousClass05K.A15
            goto L_0x0e1c
        L_0x0e77:
            java.lang.String r1 = "BLOKS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e82
            java.lang.Integer r12 = X.AnonymousClass05K.A1F
            goto L_0x0e1c
        L_0x0e82:
            java.lang.String r1 = "ROOMS_TAB_WATCH_TOGETHER"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e8d
            java.lang.Integer r12 = X.AnonymousClass05K.A1I
            goto L_0x0e1c
        L_0x0e8d:
            java.lang.String r1 = "REELS_TOGETHER"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0f04
            java.lang.Integer r12 = X.AnonymousClass05K.A02
            goto L_0x0e1c
        L_0x0e98:
            java.lang.String r1 = "VIDEO"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0ea4
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x0e0e
        L_0x0ea4:
            java.lang.String r1 = "CAROUSEL_PHOTO"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0eb0
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x0e0e
        L_0x0eb0:
            java.lang.String r1 = "CAROUSEL_VIDEO"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0ebc
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            goto L_0x0e0e
        L_0x0ebc:
            java.lang.String r1 = "CAROUSEL"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0ec8
            java.lang.Integer r11 = X.AnonymousClass05K.A0Y
            goto L_0x0e0e
        L_0x0ec8:
            java.lang.String r1 = "IGTV"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0ed4
            java.lang.Integer r11 = X.AnonymousClass05K.A0j
            goto L_0x0e0e
        L_0x0ed4:
            java.lang.String r1 = "REELS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0ee0
            java.lang.Integer r11 = X.AnonymousClass05K.A0u
            goto L_0x0e0e
        L_0x0ee0:
            java.lang.String r1 = "UNKNOWN"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0f09
            java.lang.Integer r11 = X.AnonymousClass05K.A15
            goto L_0x0e0e
        L_0x0eec:
            java.lang.String r1 = "FACEBOOK"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0ef8
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x0e00
        L_0x0ef8:
            java.lang.String r1 = "MESSAGING"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0f0e
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            goto L_0x0e00
        L_0x0f04:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x0f09:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x0f0e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x0f13:
            com.instagram.model.sharelater.ShareLaterMedia r9 = new com.instagram.model.sharelater.ShareLaterMedia
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r1.getClass()
            r9.A05 = r1
            java.lang.Integer r1 = X.C41847B3o.A12(r0)
            X.1iA r1 = X.1i9.A00(r1)
            r1.getClass()
            r9.A02 = r1
            java.lang.Class<com.instagram.model.venue.Venue> r1 = com.instagram.model.venue.Venue.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.venue.Venue r1 = (com.instagram.model.venue.Venue) r1
            r9.A03 = r1
            int r1 = r0.readInt()
            r3 = 0
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r2)
            r9.A08 = r1
            java.lang.Integer[] r1 = X.AnonymousClass05K.A00(r2)
            int r1 = r1.length
            boolean[] r1 = new boolean[r1]
            r0.readBooleanArray(r1)
            boolean r1 = r1[r3]
            r9.A07 = r1
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0f5f
            r3 = 1
        L_0x0f5f:
            r9.A09 = r3
            java.lang.Class<com.instagram.common.gallery.metadata.MediaUploadMetadata> r1 = com.instagram.common.gallery.metadata.MediaUploadMetadata.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            r0.getClass()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = (com.instagram.common.gallery.metadata.MediaUploadMetadata) r0
            r9.A00 = r0
            return r9
        L_0x0f6f:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.model.shopping.CompoundProductId r9 = new com.instagram.model.shopping.CompoundProductId
            r9.<init>(r1, r0)
            return r9
        L_0x0f7d:
            com.instagram.model.shopping.ProductAREffectContainer r9 = new com.instagram.model.shopping.ProductAREffectContainer
            r9.<init>()
            java.lang.Class<com.instagram.model.shopping.ProductItemWithAR> r1 = com.instagram.model.shopping.ProductItemWithAR.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            r1.getClass()
            com.instagram.model.shopping.ProductItemWithAR r1 = (com.instagram.model.shopping.ProductItemWithAR) r1
            r9.A00 = r1
            byte r0 = r0.readByte()
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r9.A01 = r0
            return r9
        L_0x0f9a:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.shopping.ProductArEffectMetadata> r1 = com.instagram.model.shopping.ProductArEffectMetadata.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.ContainerEffectEnum r10 = (com.instagram.api.schemas.ContainerEffectEnum) r10
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.DynamicEffectState r11 = (com.instagram.api.schemas.DynamicEffectState) r11
            java.lang.String r13 = r0.readString()
            int r1 = r0.readInt()
            r12 = 0
            if (r1 != 0) goto L_0x0fd0
            r15 = r12
        L_0x0fb8:
            java.lang.String r14 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0fc8
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.EffectThumbnailImageDict.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
        L_0x0fc8:
            com.instagram.model.shopping.EffectThumbnailImageDict r12 = (com.instagram.model.shopping.EffectThumbnailImageDict) r12
            com.instagram.model.shopping.ProductArEffectMetadata r9 = new com.instagram.model.shopping.ProductArEffectMetadata
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x0fd0:
            int r4 = r0.readInt()
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>(r4)
            r3 = 0
        L_0x0fda:
            if (r3 == r4) goto L_0x0fb8
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            r15.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0fda
        L_0x0fea:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x0fff
            r2 = 0
        L_0x0ff1:
            java.lang.Class<com.instagram.model.shopping.ProductAutoTagMetadata> r1 = com.instagram.model.shopping.ProductAutoTagMetadata.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            com.instagram.model.shopping.ProductAutoTagMetadata r9 = new com.instagram.model.shopping.ProductAutoTagMetadata
            r9.<init>(r0, r2)
            return r9
        L_0x0fff:
            float r1 = r0.readFloat()
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            goto L_0x0ff1
        L_0x1008:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.user.model.Product> r1 = com.instagram.user.model.Product.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.ProductDetailsProductItemDict r2 = (com.instagram.user.model.ProductDetailsProductItemDict) r2
            java.lang.Class<com.instagram.user.model.UnavailableProduct> r1 = com.instagram.user.model.UnavailableProduct.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.UnavailableProductImpl r0 = (com.instagram.user.model.UnavailableProductImpl) r0
            com.instagram.model.shopping.ProductContainer r9 = new com.instagram.model.shopping.ProductContainer
            r9.<init>()
            r9.A00 = r2
            r9.A01 = r0
            return r9
        L_0x1026:
            com.instagram.model.shopping.ProductGroup r9 = new com.instagram.model.shopping.ProductGroup
            r9.<init>()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r9.A01 = r1
            java.lang.Class<com.instagram.user.model.Product> r6 = com.instagram.user.model.Product.class
            A01(r0, r6, r1)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r9.A02 = r2
            java.lang.Class<com.instagram.model.shopping.ProductVariantDimension> r1 = com.instagram.model.shopping.ProductVariantDimension.class
            A01(r0, r1, r2)
            int r5 = r0.readInt()
            r1 = -1
            if (r5 != r1) goto L_0x104c
            r4 = 0
        L_0x1049:
            r9.A00 = r4
            return r9
        L_0x104c:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r5)
            r3 = 0
        L_0x1052:
            if (r3 >= r5) goto L_0x1049
            java.lang.Class<com.instagram.model.shopping.ProductGroup$VariantKey> r1 = com.instagram.model.shopping.ProductGroup.VariantKey.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            A01(r0, r6, r1)
            r4.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x1052
        L_0x1067:
            com.instagram.model.shopping.ProductGroup$VariantKey r9 = new com.instagram.model.shopping.ProductGroup$VariantKey
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r1.getClass()
            r9.A00 = r1
            java.lang.String r0 = r0.readString()
            r0.getClass()
            r9.A01 = r0
            return r9
        L_0x107f:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.ProductArEffectMetadata.CREATOR
            java.lang.Object r2 = r1.createFromParcel(r0)
            com.instagram.model.shopping.ProductArEffectMetadata r2 = (com.instagram.model.shopping.ProductArEffectMetadata) r2
            java.lang.Class<com.instagram.model.shopping.ProductItemWithAR> r1 = com.instagram.model.shopping.ProductItemWithAR.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            com.instagram.model.shopping.ProductItemWithAR r9 = new com.instagram.model.shopping.ProductItemWithAR
            r9.<init>(r2, r0)
            return r9
        L_0x1099:
            com.instagram.model.shopping.ProductSource r9 = new com.instagram.model.shopping.ProductSource
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A01 = r1
            java.lang.String r1 = r0.readString()
            X.Uyv r1 = X.C17019VEt.A00(r1)
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.String r0 = r0.readString()
            r9.A02 = r0
            return r9
        L_0x10c1:
            java.lang.Class<com.instagram.user.model.Product> r1 = com.instagram.user.model.Product.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            com.instagram.model.shopping.ProductTag r9 = new com.instagram.model.shopping.ProductTag
            r9.<init>(r0, r1)
            r1 = 0
            r9.A03 = r1
            r9.A01 = r1
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.Class<com.instagram.model.shopping.ProductAutoTagMetadata> r1 = com.instagram.model.shopping.ProductAutoTagMetadata.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.ProductAutoTagMetadata r0 = (com.instagram.model.shopping.ProductAutoTagMetadata) r0
            r9.A01 = r0
            return r9
        L_0x10e2:
            com.instagram.model.shopping.ProductVariantDimension r9 = new com.instagram.model.shopping.ProductVariantDimension
            r9.<init>(r0)
            return r9
        L_0x10e8:
            java.lang.String r12 = X.C41848B3p.A1D(r0)
            X.0qQ.A0A(r12)
            java.lang.Class<com.instagram.user.model.User> r1 = com.instagram.user.model.User.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            X.0qQ.A0A(r11)
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            java.lang.String r13 = r0.readString()
            X.0qQ.A0A(r13)
            java.io.Serializable r10 = r0.readSerializable()
            boolean r1 = r10 instanceof X.28D
            if (r1 == 0) goto L_0x110d
            X.28D r10 = (X.28D) r10
            if (r10 != 0) goto L_0x110f
        L_0x110d:
            X.28D r10 = X.28D.A5J
        L_0x110f:
            int r14 = r0.readInt()
            long r15 = r0.readLong()
            com.instagram.model.shopping.ShoppingCameraSurveyMetadata r9 = new com.instagram.model.shopping.ShoppingCameraSurveyMetadata
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x111d:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.util.Map r1 = X.C16594Uxo.A01
            java.lang.Object r7 = r1.get(r2)
            X.Uxo r7 = (X.C16594Uxo) r7
            if (r7 != 0) goto L_0x112d
            X.Uxo r7 = X.C16594Uxo.UNKNOWN
        L_0x112d:
            java.lang.String r6 = r0.readString()
            java.lang.String r5 = r0.readString()
            java.lang.String r4 = r0.readString()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r0.readStringList(r3)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            r0 = 0
            com.instagram.model.shopping.ShoppingHomeDestination r9 = new com.instagram.model.shopping.ShoppingHomeDestination
            r9.<init>()
            r9.A00 = r7
            r9.A02 = r6
            r9.A03 = r5
            r9.A04 = r4
            r9.A07 = r3
            r9.A01 = r2
            r9.A05 = r1
            r9.A06 = r0
            return r9
        L_0x115f:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.ThumbnailImage r9 = new com.instagram.model.shopping.ThumbnailImage
            r9.<init>()
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r1 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r9.A00 = r0
            return r9
        L_0x1173:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus[] r1 = com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x1182:
            int r1 = X.C41848B3p.A00(r0)
            r11 = 0
            if (r1 != 0) goto L_0x11ba
            r10 = r11
        L_0x118a:
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x11a0
            java.lang.Integer r11 = X.C41847B3o.A12(r0)
        L_0x11a0:
            java.util.ArrayList r19 = r0.createStringArrayList()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            com.instagram.model.shopping.clips.ClipsShoppingCTABar r9 = new com.instagram.model.shopping.clips.ClipsShoppingCTABar
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r9
        L_0x11ba:
            float r1 = r0.readFloat()
            java.lang.Float r10 = java.lang.Float.valueOf(r1)
            goto L_0x118a
        L_0x11c3:
            int r1 = X.C41848B3p.A00(r0)
            r2 = 0
            if (r1 != 0) goto L_0x11f2
            r7 = r2
        L_0x11cb:
            com.instagram.model.shopping.clips.ClipsShoppingCTABar r7 = (com.instagram.model.shopping.clips.ClipsShoppingCTABar) r7
            java.lang.Class<com.instagram.model.shopping.clips.IGTVShoppingInfo> r6 = com.instagram.model.shopping.clips.IGTVShoppingInfo.class
            android.os.Parcelable r5 = X.C41847B3o.A03(r0, r6)
            com.instagram.user.model.ProductCollection r5 = (com.instagram.user.model.ProductCollection) r5
            android.os.Parcelable r4 = X.C41847B3o.A03(r0, r6)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x11f9
            int r3 = r0.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r3)
            r1 = 0
        L_0x11ea:
            if (r1 == r3) goto L_0x11f9
            X.C41848B3p.A1J(r0, r6, r2)
            int r1 = r1 + 1
            goto L_0x11ea
        L_0x11f2:
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.clips.ClipsShoppingCTABar.CREATOR
            java.lang.Object r7 = r1.createFromParcel(r0)
            goto L_0x11cb
        L_0x11f9:
            com.instagram.model.shopping.clips.IGTVShoppingInfo r9 = new com.instagram.model.shopping.clips.IGTVShoppingInfo
            r9.<init>(r7, r5, r4, r2)
            return r9
        L_0x11ff:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x120c
            r0 = 0
        L_0x1206:
            com.instagram.model.shopping.drops.DropsLaunchAnimation r9 = new com.instagram.model.shopping.drops.DropsLaunchAnimation
            r9.<init>(r0)
            return r9
        L_0x120c:
            boolean r0 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x1206
        L_0x1215:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.model.shopping.featuredproduct.SurfaceVisibility[] r1 = com.instagram.model.shopping.featuredproduct.SurfaceVisibility.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x1224:
            int r1 = X.C41848B3p.A00(r0)
            r11 = 0
            if (r1 != 0) goto L_0x129e
            r12 = r11
        L_0x122c:
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType r12 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType) r12
            java.lang.Integer r14 = X.Dbc.A0C(r0)
            java.lang.Integer r15 = X.Dbc.A0C(r0)
            java.lang.String r16 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x128b
            r1 = r11
        L_0x1241:
            int r2 = r0.readInt()
            if (r2 != 0) goto L_0x1284
            r10 = r11
        L_0x1248:
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton r10 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton) r10
            boolean r22 = X.C41848B3p.A1X(r0)
            java.lang.String r17 = r0.readString()
            boolean r23 = X.C41848B3p.A1X(r0)
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            android.os.Parcelable$Creator r2 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle.CREATOR
            java.lang.Object r13 = r2.createFromParcel(r0)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle r13 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle) r13
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x1272
            android.os.Parcelable$Creator r2 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton.CREATOR
            java.lang.Object r11 = r2.createFromParcel(r0)
        L_0x1272:
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton r11 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton) r11
            boolean r24 = X.C41848B3p.A1X(r0)
            java.lang.String r20 = r0.readString()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r9 = new com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive
            r21 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r9
        L_0x1284:
            android.os.Parcelable$Creator r2 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton.CREATOR
            java.lang.Object r10 = r2.createFromParcel(r0)
            goto L_0x1248
        L_0x128b:
            int r4 = r0.readInt()
            java.util.ArrayList r1 = X.DbS.A0v(r4)
            r3 = 0
        L_0x1294:
            if (r3 == r4) goto L_0x1241
            java.lang.Class<com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive> r2 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive.class
            X.C41848B3p.A1J(r0, r2, r1)
            int r3 = r3 + 1
            goto L_0x1294
        L_0x129e:
            android.os.Parcelable$Creator r1 = com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType.CREATOR
            java.lang.Object r12 = r1.createFromParcel(r0)
            goto L_0x122c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71269Ogb.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new LeadGenFormData[i];
            case 1:
                return new LocationContextualFeedConfig[i];
            case 2:
                return new LocationSignalPackageImpl[i];
            case 3:
                return new LocationPageInfoPageOperationHour[i];
            case 4:
                return new LocationPageInfoPageOperationHourResponse[i];
            case 5:
                return new LocationPageInfo[i];
            case 6:
                return new AssistAccountRecoveryResponse$UhlAccount[i];
            case 7:
                return new TwoFactorInfoConfig[i];
            case 8:
                return new TotpSeed[i];
            case 9:
                return new TrustedDevice[i];
            case 10:
                return new ContextualOrganicInfo[i];
            case 11:
                return new MediaKitEntryPoint[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new VisibilitySheetOrigin[i];
            case 13:
                return new MediaKitConfig[i];
            case 14:
                return new MediaKitGalleryFoldersSheetConfig[i];
            case 15:
                return new MediaKitInfoSheetConfig[i];
            case 16:
                return new MediaKitSectionActionSheetConfig[i];
            case 17:
                return new MediaKitInsightType[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new MediaKitSectionType[i];
            case 19:
                return new MediaKitFolderSheetItemModel[i];
            case 20:
                return new MediaKitInfoSheetItemModel[i];
            case 21:
                return new MediaKitLink[i];
            case 22:
                return new ArAdsUIModel[i];
            case 23:
                return new Address[i];
            case 24:
                return new BusinessInfo[i];
            case 25:
                return new ProfileAddressData[i];
            case 26:
                return new PublicPhoneContact[i];
            case 27:
                return new ParcelableCommenterDetails[i];
            case 28:
                return new PromoteAdsCouponUseCase[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new PromoteCouponCurrencyAmount[i];
            case 30:
                return new PromoteCouponType[i];
            case 31:
                return new DirectIfyXma[i];
            case 32:
                return new DirectMessageSearchMessage[i];
            case 33:
                return new DirectMessageSearchThread[i];
            case 34:
                return new DirectPendingLayeredXma[i];
            case 35:
                return new DirectPendingMusicShare[i];
            case 36:
                return new DirectRoomsXma[i];
            case 37:
                return new DirectSearchMetaAIResponse[i];
            case 38:
                return new DirectSearchPrompt[i];
            case 39:
                return new DirectSearchResharedContent[i];
            case 40:
                return new DirectVisualMessageTarget[i];
            case Seq.NULL_REFNUM:
                return new HighlightRange[i];
            case Seq.RefTracker.REF_OFFSET:
                return new DirectStoreSticker[i];
            case 43:
                return new DirectStoreStickerResponseItem[i];
            case 44:
                return new StickerPack[i];
            case 45:
                return new StickerPackResponseItem[i];
            case 46:
                return new TypedImageUrl[i];
            case 47:
                return new MsysPendingRecipient[i];
            case 48:
                return new DirectMsysMixedThreadKey[i];
            case 49:
                return new ThreadIdParcelable[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new UnifiedThreadKeyParcelable[i];
            case 51:
                return new AttributedAREffect[i];
            case 52:
                return new FBUserTag.FBUserInfo[i];
            case 53:
                return new FundraiserDisplayInfoModel[i];
            case 54:
                return new NewFundraiserInfo[i];
            case 55:
                return new HashtagFollowStatus[i];
            case 56:
                return new HashtagCollection[i];
            case 57:
                return new Keyword[i];
            case 58:
                return new KeywordRecommendations[i];
            case 59:
                return new MapQuery[i];
            case 60:
                return new CurrencyAmountInfoImpl[i];
            case 61:
                return new DeliveryWindowInfoImpl[i];
            case 62:
                return new CheckoutLaunchParams[i];
            case 63:
                return new ProductItem[i];
            case 64:
                return new ReelViewerContextButtonType[i];
            case 65:
                return new StoryWedgingType[i];
            case 66:
                return new BloksStoryNetegoCTAStyle[i];
            case 67:
                return new ShoppingNetegoInStoryIconType[i];
            case 68:
                return new ShoppingNetegoInStorySuggestionType[i];
            case 69:
                return new ShoppingNetegoType[i];
            case 70:
                return new RtcCallAudience[i];
            case 71:
                return new RtcCallKey[i];
            case 72:
                return new RtcCallSource[i];
            case 73:
                return new RtcCreateCallArgs[i];
            case 74:
                return new RtcIgNotification[i];
            case 75:
                return new RtcJoinCallArgs[i];
            case 76:
                return new RtcThreadKey[i];
            case 77:
                return new RtcStartCoWatchPlaybackArguments[i];
            case 78:
                return new ShareLaterMedia[i];
            case 79:
                return new CompoundProductId[i];
            case 80:
                return new ProductAREffectContainer[i];
            case 81:
                return new ProductArEffectMetadata[i];
            case 82:
                return new ProductAutoTagMetadata[i];
            case 83:
                return new ProductContainer[i];
            case 84:
                return new ProductGroup[i];
            case 85:
                return new ProductGroup.VariantKey[i];
            case 86:
                return new ProductItemWithAR[i];
            case 87:
                return new ProductSource[i];
            case 88:
                return new ProductTag[i];
            case 89:
                return new ProductVariantDimension[i];
            case 90:
                return new ShoppingCameraSurveyMetadata[i];
            case 91:
                return new ShoppingHomeDestination[i];
            case 92:
                return new ThumbnailImage[i];
            case 93:
                return new ProductCollectionReviewStatus[i];
            case 94:
                return new ClipsShoppingCTABar[i];
            case 95:
                return new IGTVShoppingInfo[i];
            case 96:
                return new DropsLaunchAnimation[i];
            case 97:
                return new SurfaceVisibility[i];
            case 98:
                return new IgFundedIncentive[i];
            default:
                return new IgFundedIncentiveBannerButton[i];
        }
    }

    public static void A01(Parcel parcel, Class cls, List list) {
        parcel.readList(list, cls.getClassLoader());
    }
}
