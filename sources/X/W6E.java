package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.direct.prompts.DirectEditAddYoursParams;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.direct.sharetostory.data.ChannelChallengeStickerData;
import com.instagram.direct.sharetostory.data.JoinChatStickerData;
import com.instagram.direct.sharetostory.data.MessageShareStickerData;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.education.NudityReceiverEducationSafetyTipsViewModel;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.discoverpeople.model.FindPeopleButtonOverride;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.categories.model.Category;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.discovery.mediamap.fragment.LocationListFragmentMode;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import com.instagram.discovery.refinement.model.QueryInformation;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.discovery.refinement.model.RefinementAttributes;
import com.instagram.discovery.related.model.RelatedItem;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.feed.feeditem.SuggestedChannels;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.feed.su.model.MiddleStateCardUser;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.filterkit.filter.FilterGroup;
import com.instagram.filterkit.filter.IdentityFilter;
import com.instagram.filterkit.filter.resize.LanczosFilter;
import com.instagram.filterkit.filter.resize.ResizeFilter;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData;
import com.instagram.friendmap.configs.AggregatedBannerConfig;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import com.instagram.friendmap.configs.PagerSheetLaunchConfig;
import com.instagram.friendmap.data.MapText;
import com.instagram.friendmap.view.fragment.FriendMapAudienceListFragment$CustomAudienceLaunchConfig;
import com.instagram.friendmap.view.fragment.FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig;
import com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig;
import com.instagram.friendmap.view.fragment.FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;
import com.instagram.guides.intf.GuideCreationLoggerState;
import com.instagram.guides.intf.GuideCreationType;
import com.instagram.guides.intf.GuideFragmentConfig;
import com.instagram.guides.intf.model.MinimalGuide;
import com.instagram.guides.intf.model.MinimalGuideItem;
import com.instagram.guides.model.GuideItemAttachment;
import com.instagram.hallpass.model.HallPassMemberViewModel;
import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igtv.model.IGTVCreationToolsResponse;
import com.instagram.igtv.model.IGTVViewerLoggingToken;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.igtv.uploadflow.common.IGTVUploadProgress;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.infocenter.model.InfoCenterFactShareInfo;
import com.instagram.infocenter.model.ShareInfo;
import com.instagram.leadads.model.LeadAdsDisclaimerResponse;
import com.instagram.leadads.model.LeadAdsInputFieldResponse;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.api.OrganicLeadGenCtaLabel;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;
import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenConsumerFormData;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class W6E implements Parcelable.Creator {
    public final int A00;

    public W6E(int i) {
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.instagram.guides.intf.model.MinimalGuideItem[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.instagram.guides.intf.model.MinimalGuideItem[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.instagram.guides.intf.model.MinimalGuideItem[]} */
    /* JADX WARNING: type inference failed for: r14v13, types: [com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v23, types: [com.instagram.discovery.categories.model.Category, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v35, types: [X.VN9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v33, types: [com.instagram.discovery.mediamap.model.LocationPageInformation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v34, types: [java.lang.Object, com.instagram.discovery.mediamap.model.MediaMapPin] */
    /* JADX WARNING: type inference failed for: r14v35, types: [java.lang.Object, com.instagram.discovery.mediamap.model.MediaMapPinPreview] */
    /* JADX WARNING: type inference failed for: r14v36, types: [java.lang.Object, com.instagram.discovery.refinement.model.QueryInformation] */
    /* JADX WARNING: type inference failed for: r14v37, types: [java.lang.Object, com.instagram.discovery.refinement.model.Refinement] */
    /* JADX WARNING: type inference failed for: r14v38, types: [com.instagram.discovery.refinement.model.RefinementAttributes, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v39, types: [com.instagram.discovery.related.model.RelatedItem, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v42, types: [com.instagram.fanclub.intf.UserPayFanclubUpsellParams, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v67, types: [java.lang.Object, com.instagram.guides.intf.model.MinimalGuide] */
    /* JADX WARNING: type inference failed for: r14v68, types: [com.instagram.guides.intf.model.MinimalGuideItem, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v69, types: [com.instagram.guides.model.GuideItemAttachment, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v73, types: [android.view.View$BaseSavedState, com.instagram.igds.components.form.IgFormField$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v75, types: [com.instagram.igtv.model.IGTVViewerLoggingToken, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v78, types: [com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v79, types: [com.instagram.infocenter.model.InfoCenterFactShareInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v80, types: [java.lang.Object, com.instagram.infocenter.model.ShareInfo] */
    /* JADX WARNING: type inference failed for: r14v81, types: [java.lang.Object, com.instagram.leadads.model.LeadAdsDisclaimerResponse] */
    /* JADX WARNING: type inference failed for: r14v82, types: [java.lang.Object, com.instagram.leadads.model.LeadAdsInputFieldResponse] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0b3b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r44) {
        /*
            r43 = this;
            r0 = r43
            int r1 = r0.A00
            r0 = r44
            switch(r1) {
                case 0: goto L_0x10ff;
                case 1: goto L_0x10f9;
                case 2: goto L_0x10f3;
                case 3: goto L_0x10e5;
                case 4: goto L_0x10d7;
                case 5: goto L_0x10bd;
                case 6: goto L_0x10b4;
                case 7: goto L_0x108e;
                case 8: goto L_0x1074;
                case 9: goto L_0x0ff4;
                case 10: goto L_0x0f78;
                case 11: goto L_0x0f42;
                case 12: goto L_0x0ecf;
                case 13: goto L_0x0ea2;
                case 14: goto L_0x0e71;
                case 15: goto L_0x0e43;
                case 16: goto L_0x0e23;
                case 17: goto L_0x0e0b;
                case 18: goto L_0x0dbd;
                case 19: goto L_0x0d9f;
                case 20: goto L_0x0d5e;
                case 21: goto L_0x0d4c;
                case 22: goto L_0x0d3a;
                case 23: goto L_0x0d16;
                case 24: goto L_0x0c57;
                case 25: goto L_0x0bd6;
                case 26: goto L_0x0b8f;
                case 27: goto L_0x0b89;
                case 28: goto L_0x0b83;
                case 29: goto L_0x0b74;
                case 30: goto L_0x0b65;
                case 31: goto L_0x0b5f;
                case 32: goto L_0x0add;
                case 33: goto L_0x0a28;
                case 34: goto L_0x0a12;
                case 35: goto L_0x09f8;
                case 36: goto L_0x09e2;
                case 37: goto L_0x09b3;
                case 38: goto L_0x098b;
                case 39: goto L_0x0961;
                case 40: goto L_0x0957;
                case 41: goto L_0x093c;
                case 42: goto L_0x092a;
                case 43: goto L_0x090c;
                case 44: goto L_0x08da;
                case 45: goto L_0x08d1;
                case 46: goto L_0x08cb;
                case 47: goto L_0x08c5;
                case 48: goto L_0x08bf;
                case 49: goto L_0x08b9;
                case 50: goto L_0x089d;
                case 51: goto L_0x0886;
                case 52: goto L_0x086c;
                case 53: goto L_0x0856;
                case 54: goto L_0x07c9;
                case 55: goto L_0x0782;
                case 56: goto L_0x0778;
                case 57: goto L_0x076a;
                case 58: goto L_0x0761;
                case 59: goto L_0x0758;
                case 60: goto L_0x074f;
                case 61: goto L_0x0746;
                case 62: goto L_0x0734;
                case 63: goto L_0x06fc;
                case 64: goto L_0x06ed;
                case 65: goto L_0x0655;
                case 66: goto L_0x05e6;
                case 67: goto L_0x05b0;
                case 68: goto L_0x0582;
                case 69: goto L_0x056c;
                case 70: goto L_0x0538;
                case 71: goto L_0x0532;
                case 72: goto L_0x0522;
                case 73: goto L_0x050b;
                case 74: goto L_0x04e1;
                case 75: goto L_0x04d8;
                case 76: goto L_0x04ce;
                case 77: goto L_0x04a5;
                case 78: goto L_0x041f;
                case 79: goto L_0x038a;
                case 80: goto L_0x0378;
                case 81: goto L_0x034e;
                case 82: goto L_0x030a;
                case 83: goto L_0x02f4;
                case 84: goto L_0x02e5;
                case 85: goto L_0x02d6;
                case 86: goto L_0x029d;
                case 87: goto L_0x0273;
                case 88: goto L_0x01fb;
                case 89: goto L_0x01d9;
                case 90: goto L_0x01c3;
                case 91: goto L_0x0123;
                case 92: goto L_0x00fe;
                case 93: goto L_0x00e1;
                case 94: goto L_0x00cf;
                case 95: goto L_0x00b1;
                case 96: goto L_0x009b;
                case 97: goto L_0x0081;
                case 98: goto L_0x006b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r19 = X.C41848B3p.A1D(r0)
            java.lang.String r20 = r0.readString()
            long r26 = r0.readLong()
            java.lang.String r21 = r0.readString()
            java.lang.Class<com.instagram.leadgen.organic.model.LeadGenConsumerFormData> r3 = com.instagram.leadgen.organic.model.LeadGenConsumerFormData.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r3)
            com.instagram.common.typedurl.ImageUrl r15 = (com.instagram.common.typedurl.ImageUrl) r15
            int r25 = r0.readInt()
            java.lang.String r22 = r0.readString()
            int r1 = r0.readInt()
            r4 = 0
            boolean r28 = X.AnonymousClass7TF.A1P(r1)
            boolean r29 = X.C41848B3p.A1X(r0)
            java.lang.String r23 = r0.readString()
            android.os.Parcelable r5 = X.C41847B3o.A03(r0, r3)
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            int r1 = r0.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x0049:
            if (r4 == r1) goto L_0x0051
            X.C41848B3p.A1J(r0, r3, r2)
            int r4 = r4 + 1
            goto L_0x0049
        L_0x0051:
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r3)
            com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy r1 = (com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy) r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r3)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            com.instagram.leadgen.organic.model.LeadGenConsumerFormData r14 = new com.instagram.leadgen.organic.model.LeadGenConsumerFormData
            r17 = r0
            r18 = r1
            r24 = r2
            r16 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29)
            return r14
        L_0x006b:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            X.Uwe r1 = X.C16534Uwe.valueOf(r1)
            java.util.ArrayList r0 = r0.createStringArrayList()
            com.instagram.leadgen.organic.model.LeadFormCustomQuestion r14 = new com.instagram.leadgen.organic.model.LeadFormCustomQuestion
            r14.<init>(r1, r2, r0)
            return r14
        L_0x0081:
            java.lang.String r15 = X.C41848B3p.A1D(r0)
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy r14 = new com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy
            r14.<init>(r15, r16, r17, r18, r19)
            return r14
        L_0x009b:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData r14 = new com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData
            r14.<init>(r3, r2, r1, r0)
            return r14
        L_0x00b1:
            java.lang.String r4 = X.C41848B3p.A1D(r0)
            java.lang.String r3 = r0.readString()
            int r1 = r0.readInt()
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            int r0 = r0.readInt()
            if (r0 != 0) goto L_0x00c9
            r2 = 0
        L_0x00c9:
            com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox r14 = new com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox
            r14.<init>(r4, r3, r1, r2)
            return r14
        L_0x00cf:
            int r2 = X.C41848B3p.A00(r0)
            int r1 = r0.readInt()
            java.lang.String r0 = r0.readString()
            com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges r14 = new com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges
            r14.<init>(r2, r1, r0)
            return r14
        L_0x00e1:
            java.lang.String r5 = X.C41848B3p.A1D(r0)
            int r4 = r0.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x00ef:
            if (r2 == r4) goto L_0x00f8
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x00ef
        L_0x00f8:
            com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody r14 = new com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody
            r14.<init>(r5, r3)
            return r14
        L_0x00fe:
            java.lang.String r6 = X.C41848B3p.A1D(r0)
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody.CREATOR
            java.lang.Object r5 = r1.createFromParcel(r0)
            com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody r5 = (com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody) r5
            int r4 = r0.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x0114:
            if (r2 == r4) goto L_0x011d
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x0114
        L_0x011d:
            com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer r14 = new com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer
            r14.<init>(r5, r6, r3)
            return r14
        L_0x0123:
            java.lang.String r21 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "INSTAGRAM"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0197
            java.lang.Integer r20 = X.AnonymousClass05K.A00
        L_0x0135:
            int r1 = r0.readInt()
            r6 = 0
            if (r1 != 0) goto L_0x0190
            r15 = r6
        L_0x013d:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r15 = (com.instagram.leadgen.core.model.LeadGenTrustSignal) r15
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0189
            r7 = r6
        L_0x0146:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r7 = (com.instagram.leadgen.core.model.LeadGenTrustSignal) r7
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0182
            r8 = r6
        L_0x014f:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r8 = (com.instagram.leadgen.core.model.LeadGenTrustSignal) r8
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x017b
            r5 = r6
        L_0x0158:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r5 = (com.instagram.leadgen.core.model.LeadGenTrustSignal) r5
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0166
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.LeadGenTrustSignal.CREATOR
            java.lang.Object r6 = r1.createFromParcel(r0)
        L_0x0166:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r6 = (com.instagram.leadgen.core.model.LeadGenTrustSignal) r6
            int r4 = r0.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x0172:
            if (r2 == r4) goto L_0x01ad
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.LeadGenTrustSignal.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x0172
        L_0x017b:
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.LeadGenTrustSignal.CREATOR
            java.lang.Object r5 = r1.createFromParcel(r0)
            goto L_0x0158
        L_0x0182:
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.LeadGenTrustSignal.CREATOR
            java.lang.Object r8 = r1.createFromParcel(r0)
            goto L_0x014f
        L_0x0189:
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.LeadGenTrustSignal.CREATOR
            java.lang.Object r7 = r1.createFromParcel(r0)
            goto L_0x0146
        L_0x0190:
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.LeadGenTrustSignal.CREATOR
            java.lang.Object r15 = r1.createFromParcel(r0)
            goto L_0x013d
        L_0x0197:
            java.lang.String r1 = "FACEBOOK"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01a2
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            goto L_0x0135
        L_0x01a2:
            java.lang.String r1 = "UNKNOWN"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01bd
            java.lang.Integer r20 = X.AnonymousClass05K.A0C
            goto L_0x0135
        L_0x01ad:
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r14 = new com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload
            r17 = r8
            r18 = r5
            r19 = r6
            r22 = r3
            r16 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            return r14
        L_0x01bd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x01c3:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            X.Uy7 r2 = X.C16611Uy7.valueOf(r1)
            int r1 = r0.readInt()
            java.lang.String r0 = r0.readString()
            com.instagram.leadgen.core.model.LeadGenTrustSignal r14 = new com.instagram.leadgen.core.model.LeadGenTrustSignal
            r14.<init>(r2, r0, r1)
            return r14
        L_0x01d9:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.Class<com.instagram.leadgen.core.model.LeadGenProfileContentInfo> r1 = com.instagram.leadgen.core.model.LeadGenProfileContentInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x01f4
            r0 = 0
        L_0x01ec:
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r0 = (com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload) r0
            com.instagram.leadgen.core.model.LeadGenProfileContentInfo r14 = new com.instagram.leadgen.core.model.LeadGenProfileContentInfo
            r14.<init>(r2, r0, r3)
            return r14
        L_0x01f4:
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            goto L_0x01ec
        L_0x01fb:
            java.lang.String r17 = X.C41848B3p.A1D(r0)
            java.lang.String r18 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.Uxp r15 = X.C16595Uxp.valueOf(r1)
            java.util.ArrayList r26 = r0.createStringArrayList()
            java.lang.Integer r16 = X.JTU.A0U(r0)
            java.util.ArrayList r27 = r0.createStringArrayList()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            boolean r32 = X.C41848B3p.A1X(r0)
            boolean r33 = X.C41848B3p.A1X(r0)
            int r3 = r0.readInt()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r3)
            r2 = 0
        L_0x0239:
            if (r2 == r3) goto L_0x024b
            java.lang.String r4 = r0.readString()
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            r5.put(r4, r1)
            int r2 = r2 + 1
            goto L_0x0239
        L_0x024b:
            boolean r34 = X.C41848B3p.A1X(r0)
            java.util.ArrayList r28 = r0.createStringArrayList()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            int r31 = r0.readInt()
            java.lang.String r25 = r0.readString()
            java.util.ArrayList r29 = r0.createStringArrayList()
            boolean r35 = X.C41848B3p.A1X(r0)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r14 = new com.instagram.leadgen.core.model.LeadGenFormBaseQuestion
            r30 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return r14
        L_0x0273:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.util.ArrayList r6 = r0.createStringArrayList()
            int r5 = r0.readInt()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r5)
            r3 = 0
        L_0x0285:
            if (r3 == r5) goto L_0x0297
            java.lang.String r2 = r0.readString()
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            r4.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0285
        L_0x0297:
            com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo r14 = new com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo
            r14.<init>(r6, r4)
            return r14
        L_0x029d:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.leadgen.core.model.LeadGenBaseFormList> r5 = com.instagram.leadgen.core.model.LeadGenBaseFormList.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r5)
            com.instagram.api.schemas.XIGIGBoostCallToAction r15 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r15
            android.os.Parcelable r4 = X.C41847B3o.A03(r0, r5)
            com.instagram.leadgen.core.api.LeadForm r4 = (com.instagram.leadgen.core.api.LeadForm) r4
            int r3 = r0.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
        L_0x02b8:
            if (r1 == r3) goto L_0x02c0
            X.C41848B3p.A1J(r0, r5, r2)
            int r1 = r1 + 1
            goto L_0x02b8
        L_0x02c0:
            java.lang.String r17 = r0.readString()
            boolean r20 = X.C41848B3p.A1X(r0)
            java.lang.String r18 = r0.readString()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r14 = new com.instagram.leadgen.core.model.LeadGenBaseFormList
            r19 = r2
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r14
        L_0x02d6:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.leadgen.core.api.OrganicLeadGenCtaLabel[] r1 = com.instagram.leadgen.core.api.OrganicLeadGenCtaLabel.values()
            int r0 = r0.readInt()
            r14 = r1[r0]
            return r14
        L_0x02e5:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.leadgen.core.api.LeadGenInfoFieldTypes[] r1 = com.instagram.leadgen.core.api.LeadGenInfoFieldTypes.values()
            int r0 = r0.readInt()
            r14 = r1[r0]
            return r14
        L_0x02f4:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r2 = X.C41848B3p.A1X(r0)
            java.lang.String r1 = r0.readString()
            java.util.ArrayList r0 = r0.createStringArrayList()
            com.instagram.leadgen.core.api.LeadGenInfoFieldData r14 = new com.instagram.leadgen.core.api.LeadGenInfoFieldData
            r14.<init>(r1, r0, r2)
            return r14
        L_0x030a:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.leadgen.core.api.LeadForm> r1 = com.instagram.leadgen.core.api.LeadForm.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r15 = (com.instagram.common.typedurl.ImageUrl) r15
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            int r4 = r0.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x0328:
            if (r2 == r4) goto L_0x0331
            android.os.Parcelable$Creator r1 = com.instagram.leadgen.core.api.LeadGenInfoFieldData.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x0328
        L_0x0331:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0345
            r16 = 0
        L_0x0339:
            java.lang.String r19 = r0.readString()
            com.instagram.leadgen.core.api.LeadForm r14 = new com.instagram.leadgen.core.api.LeadForm
            r20 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r14
        L_0x0345:
            boolean r1 = X.Pxi.A1P(r0)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r1)
            goto L_0x0339
        L_0x034e:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x036f
            r3 = 0
        L_0x0355:
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.leadads.model.LeadAdsInputFieldResponse r14 = new com.instagram.leadads.model.LeadAdsInputFieldResponse
            r14.<init>()
            r14.A00 = r3
            r14.A03 = r2
            r14.A02 = r1
            r14.A01 = r0
            return r14
        L_0x036f:
            java.lang.String r1 = r0.readString()
            X.UzC r3 = X.C16676UzC.valueOf(r1)
            goto L_0x0355
        L_0x0378:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.leadads.model.LeadAdsDisclaimerResponse r14 = new com.instagram.leadads.model.LeadAdsDisclaimerResponse
            r14.<init>()
            r14.A00 = r1
            r14.A01 = r0
            return r14
        L_0x038a:
            com.instagram.infocenter.model.ShareInfo r14 = new com.instagram.infocenter.model.ShareInfo
            r14.<init>()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r14.A05 = r1
            r14.A04 = r1
            java.lang.String r1 = r0.readString()
            java.lang.Integer r1 = X.VEC.A00(r1)
            r14.A05 = r1
            boolean r1 = X.Pxg.A1U(r0)
            r14.A0D = r1
            java.lang.String r1 = r0.readString()
            r14.A0A = r1
            java.lang.String r1 = r0.readString()
            r14.A08 = r1
            java.lang.String r1 = r0.readString()
            r14.A09 = r1
            java.lang.String r1 = r0.readString()
            r14.A06 = r1
            java.lang.String r1 = r0.readString()
            r14.A07 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r14.A0B = r1
            r0.readStringList(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r14.A0C = r1
            r0.readStringList(r1)
            java.lang.String r6 = r0.readString()
            r1 = 0
            X.0qQ.A0B(r6, r1)
            r1 = 4
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r1)
            int r4 = r5.length
            r3 = 0
        L_0x03e6:
            if (r3 >= r4) goto L_0x03f7
            r2 = r5[r3]
            java.lang.String r1 = X.VEB.A00(r2)
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 != 0) goto L_0x03f8
            int r3 = r3 + 1
            goto L_0x03e6
        L_0x03f7:
            r2 = 0
        L_0x03f8:
            r14.A04 = r2
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r1 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r14.A00 = r1
            java.lang.Class<com.instagram.model.mediasize.ExtendedImageUrl> r2 = com.instagram.model.mediasize.ExtendedImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = (com.instagram.model.mediasize.ExtendedImageUrl) r1
            r14.A01 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = (com.instagram.model.mediasize.ExtendedImageUrl) r1
            r14.A02 = r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = (com.instagram.model.mediasize.ExtendedImageUrl) r0
            r14.A03 = r0
            return r14
        L_0x041f:
            com.instagram.infocenter.model.InfoCenterFactShareInfo r14 = new com.instagram.infocenter.model.InfoCenterFactShareInfo
            r14.<init>()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r14.A00 = r1
            java.lang.String r1 = r0.readString()
            java.lang.Integer r1 = X.VEC.A00(r1)
            r14.A00 = r1
            java.lang.String r1 = r0.readString()
            r14.A0A = r1
            java.lang.String r1 = r0.readString()
            r14.A02 = r1
            java.lang.String r1 = r0.readString()
            r14.A0G = r1
            java.lang.String r1 = r0.readString()
            r14.A0F = r1
            java.lang.String r1 = r0.readString()
            r14.A0D = r1
            java.lang.String r1 = r0.readString()
            r14.A0E = r1
            java.lang.String r1 = r0.readString()
            r14.A0C = r1
            java.lang.String r1 = r0.readString()
            r14.A04 = r1
            java.lang.String r1 = r0.readString()
            r14.A05 = r1
            java.lang.String r1 = r0.readString()
            r14.A03 = r1
            java.lang.String r1 = r0.readString()
            r14.A0I = r1
            java.lang.String r1 = r0.readString()
            r14.A0J = r1
            java.lang.String r1 = r0.readString()
            r14.A0H = r1
            java.lang.String r1 = r0.readString()
            r14.A0B = r1
            java.lang.String r1 = r0.readString()
            r14.A07 = r1
            java.lang.String r1 = r0.readString()
            r14.A06 = r1
            java.lang.String r1 = r0.readString()
            r14.A09 = r1
            java.lang.String r1 = r0.readString()
            r14.A01 = r1
            java.lang.String r0 = r0.readString()
            r14.A08 = r0
            return r14
        L_0x04a5:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata r14 = new com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata
            r14.<init>()
            java.lang.String r1 = r0.readString()
            X.0qQ.A0A(r1)
            X.0qQ.A0B(r1, r2)
            r14.A02 = r1
            java.util.ArrayList r1 = r0.createStringArrayList()
            if (r1 != 0) goto L_0x04c5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x04c5:
            r14.A03 = r1
            java.lang.String r0 = r0.readString()
            r14.A01 = r0
            return r14
        L_0x04ce:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r14 = new com.instagram.igtv.uploadflow.common.IGTVUploadProgress
            r14.<init>(r0)
            return r14
        L_0x04d8:
            X.Pxi.A11(r0)
            com.instagram.igtv.persistence.draft.IGTVBrandedContentTags r14 = new com.instagram.igtv.persistence.draft.IGTVBrandedContentTags
            r14.<init>()
            return r14
        L_0x04e1:
            com.instagram.igtv.model.IGTVViewerLoggingToken r14 = new com.instagram.igtv.model.IGTVViewerLoggingToken
            r14.<init>()
            java.lang.String r1 = r0.readString()
            r14.A03 = r1
            java.lang.String r1 = r0.readString()
            r14.A05 = r1
            java.lang.String r1 = r0.readString()
            r14.A02 = r1
            java.lang.String r1 = r0.readString()
            r14.A04 = r1
            int r1 = r0.readInt()
            r14.A01 = r1
            int r0 = r0.readInt()
            r14.A00 = r0
            return r14
        L_0x050b:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.igtv.model.IGTVCreationToolsResponse r14 = new com.instagram.igtv.model.IGTVCreationToolsResponse
            r14.<init>()
            java.lang.Class<com.instagram.model.shopping.video.ShoppingCreationConfig> r1 = com.instagram.model.shopping.video.ShoppingCreationConfig.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            X.0qQ.A0A(r0)
            com.instagram.model.shopping.video.ShoppingCreationConfig r0 = (com.instagram.model.shopping.video.ShoppingCreationConfig) r0
            r14.A00 = r0
            return r14
        L_0x0522:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.igds.components.form.IgFormField$SavedState r14 = new com.instagram.igds.components.form.IgFormField$SavedState
            r14.<init>(r0)
            int r0 = r0.readInt()
            r14.A00 = r0
            return r14
        L_0x0532:
            com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig r14 = new com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig
            r14.<init>(r0)
            return r14
        L_0x0538:
            java.lang.String r15 = X.C41848B3p.A1D(r0)
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            int r19 = r0.readInt()
            int r20 = r0.readInt()
            int r4 = r0.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x0556:
            if (r2 == r4) goto L_0x0560
            java.lang.Class<com.instagram.hallpass.model.HallPassViewModel> r1 = com.instagram.hallpass.model.HallPassViewModel.class
            X.C41848B3p.A1J(r0, r1, r3)
            int r2 = r2 + 1
            goto L_0x0556
        L_0x0560:
            boolean r21 = X.C41848B3p.A1X(r0)
            com.instagram.hallpass.model.HallPassViewModel r14 = new com.instagram.hallpass.model.HallPassViewModel
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            return r14
        L_0x056c:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.hallpass.model.HallPassMemberViewModel> r1 = com.instagram.hallpass.model.HallPassMemberViewModel.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.hallpass.model.HallPassMemberViewModel r14 = new com.instagram.hallpass.model.HallPassMemberViewModel
            r14.<init>(r1, r0)
            return r14
        L_0x0582:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.model.simpleplace.SimplePlace> r1 = com.instagram.model.simpleplace.SimplePlace.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.simpleplace.SimplePlace r3 = (com.instagram.model.simpleplace.SimplePlace) r3
            java.lang.Class<com.instagram.model.shopping.ProductContainer> r1 = com.instagram.model.shopping.ProductContainer.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.ProductContainer r2 = (com.instagram.model.shopping.ProductContainer) r2
            java.io.Serializable r1 = r0.readSerializable()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.guides.model.GuideItemAttachment.Type"
            X.0qQ.A0C(r1, r0)
            X.UwC r1 = (X.C16511UwC) r1
            r0 = 0
            com.instagram.guides.model.GuideItemAttachment r14 = new com.instagram.guides.model.GuideItemAttachment
            r14.<init>()
            r14.A03 = r0
            r14.A02 = r3
            r14.A01 = r2
            r14.A00 = r1
            return r14
        L_0x05b0:
            com.instagram.guides.intf.model.MinimalGuideItem r14 = new com.instagram.guides.intf.model.MinimalGuideItem
            r14.<init>()
            java.lang.String r1 = r0.readString()
            r14.A03 = r1
            java.lang.String r1 = r0.readString()
            r14.A04 = r1
            java.lang.String r1 = r0.readString()
            r14.A02 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r14.A05 = r1
            r0.readStringList(r1)
            java.lang.Class<com.instagram.user.model.Product> r1 = com.instagram.user.model.Product.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            r14.A01 = r1
            java.lang.Class<com.instagram.model.simpleplace.SimplePlace> r1 = com.instagram.model.simpleplace.SimplePlace.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.simpleplace.SimplePlace r0 = (com.instagram.model.simpleplace.SimplePlace) r0
            r14.A00 = r0
            return r14
        L_0x05e6:
            com.instagram.guides.intf.model.MinimalGuide r14 = new com.instagram.guides.intf.model.MinimalGuide
            r14.<init>()
            java.lang.String r1 = r0.readString()
            r14.A05 = r1
            java.lang.String r1 = r0.readString()
            r14.A06 = r1
            java.lang.String r1 = r0.readString()
            r14.A07 = r1
            java.lang.String r1 = r0.readString()
            r14.A08 = r1
            java.lang.String r1 = r0.readString()
            r14.A09 = r1
            java.lang.String r1 = r0.readString()
            r14.A03 = r1
            java.lang.String r1 = r0.readString()
            r14.A02 = r1
            java.lang.String r1 = r0.readString()
            r14.A04 = r1
            java.lang.Integer r1 = X.C41847B3o.A12(r0)
            r14.A00 = r1
            int r1 = r0.readInt()
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r2)
            r14.A0C = r1
            int r1 = r0.readInt()
            if (r1 != r2) goto L_0x0638
            java.lang.Long r1 = X.Pxi.A0T(r0)
            r14.A01 = r1
        L_0x0638:
            java.lang.String r1 = r0.readString()
            r14.A0B = r1
            java.lang.String r1 = r0.readString()
            r14.A0A = r1
            int r1 = r0.readInt()
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r2)
            r14.A0D = r1
            boolean r0 = X.Pxg.A1V(r0)
            r14.A0E = r0
            return r14
        L_0x0655:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = "CREATION"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x06af
            java.lang.Integer r18 = X.AnonymousClass05K.A00
        L_0x0663:
            java.lang.String r1 = r0.readString()
            X.EZL r15 = X.EZL.valueOf(r1)
            java.lang.Class<com.instagram.guides.intf.GuideFragmentConfig> r7 = com.instagram.guides.intf.GuideFragmentConfig.class
            android.os.Parcelable r6 = X.C41847B3o.A03(r0, r7)
            com.instagram.guides.intf.model.MinimalGuide r6 = (com.instagram.guides.intf.model.MinimalGuide) r6
            int r1 = r0.readInt()
            r5 = 0
            if (r1 != 0) goto L_0x069d
            r4 = r5
        L_0x067b:
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x068f
            android.os.Parcelable$Creator r1 = com.instagram.guides.intf.GuideCreationLoggerState.CREATOR
            java.lang.Object r5 = r1.createFromParcel(r0)
        L_0x068f:
            com.instagram.guides.intf.GuideCreationLoggerState r5 = (com.instagram.guides.intf.GuideCreationLoggerState) r5
            com.instagram.guides.intf.GuideFragmentConfig r14 = new com.instagram.guides.intf.GuideFragmentConfig
            r17 = r6
            r21 = r4
            r16 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            return r14
        L_0x069d:
            int r3 = r0.readInt()
            com.instagram.guides.intf.model.MinimalGuideItem[] r4 = new com.instagram.guides.intf.model.MinimalGuideItem[r3]
            r2 = 0
        L_0x06a4:
            if (r2 == r3) goto L_0x067b
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r7)
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x06a4
        L_0x06af:
            java.lang.String r1 = "DRAFT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x06ba
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            goto L_0x0663
        L_0x06ba:
            java.lang.String r1 = "PREVIEW"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x06c5
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
            goto L_0x0663
        L_0x06c5:
            java.lang.String r1 = "EDIT_ONLY"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x06d0
            java.lang.Integer r18 = X.AnonymousClass05K.A0N
            goto L_0x0663
        L_0x06d0:
            java.lang.String r1 = "VIEW_EDIT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x06db
            java.lang.Integer r18 = X.AnonymousClass05K.A0Y
            goto L_0x0663
        L_0x06db:
            java.lang.String r1 = "SHARE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x06e7
            java.lang.Integer r18 = X.AnonymousClass05K.A0j
            goto L_0x0663
        L_0x06e7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x06ed:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.guides.intf.GuideCreationType[] r1 = com.instagram.guides.intf.GuideCreationType.values()
            int r0 = r0.readInt()
            r14 = r1[r0]
            return r14
        L_0x06fc:
            java.lang.String r17 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            X.EZL r15 = X.EZL.valueOf(r1)
            android.os.Parcelable$Creator r1 = com.instagram.guides.intf.GuideCreationType.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            com.instagram.guides.intf.GuideCreationType r1 = (com.instagram.guides.intf.GuideCreationType) r1
            long r20 = r0.readLong()
            int r18 = r0.readInt()
            int r19 = r0.readInt()
            boolean r22 = X.C41848B3p.A1X(r0)
            boolean r23 = X.C41848B3p.A1X(r0)
            boolean r24 = X.C41848B3p.A1X(r0)
            boolean r25 = X.C41848B3p.A1X(r0)
            com.instagram.guides.intf.GuideCreationLoggerState r14 = new com.instagram.guides.intf.GuideCreationLoggerState
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r22, r23, r24, r25)
            return r14
        L_0x0734:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams r14 = new com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams
            r14.<init>(r2, r1, r0)
            return r14
        L_0x0746:
            X.Pxi.A11(r0)
            com.instagram.friendmap.view.fragment.FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig r14 = new com.instagram.friendmap.view.fragment.FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig
            r14.<init>()
            return r14
        L_0x074f:
            X.Pxi.A11(r0)
            com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig r14 = new com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig
            r14.<init>()
            return r14
        L_0x0758:
            X.Pxi.A11(r0)
            com.instagram.friendmap.view.fragment.FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig r14 = new com.instagram.friendmap.view.fragment.FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig
            r14.<init>()
            return r14
        L_0x0761:
            X.Pxi.A11(r0)
            com.instagram.friendmap.view.fragment.FriendMapAudienceListFragment$CustomAudienceLaunchConfig r14 = new com.instagram.friendmap.view.fragment.FriendMapAudienceListFragment$CustomAudienceLaunchConfig
            r14.<init>()
            return r14
        L_0x076a:
            int r1 = X.C41848B3p.A00(r0)
            java.lang.String[] r0 = r0.createStringArray()
            com.instagram.friendmap.data.MapText$Res r14 = new com.instagram.friendmap.data.MapText$Res
            r14.<init>(r1, r0)
            return r14
        L_0x0778:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.friendmap.data.MapText$Raw r14 = new com.instagram.friendmap.data.MapText$Raw
            r14.<init>(r0)
            return r14
        L_0x0782:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = "NUX"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0796
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0790:
            com.instagram.friendmap.configs.PagerSheetLaunchConfig r14 = new com.instagram.friendmap.configs.PagerSheetLaunchConfig
            r14.<init>(r0)
            return r14
        L_0x0796:
            r0 = 2131(0x853, float:2.986E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07a5
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0790
        L_0x07a5:
            r0 = 4398(0x112e, float:6.163E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07b4
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0790
        L_0x07b4:
            r0 = 4369(0x1111, float:6.122E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07c3
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0790
        L_0x07c3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x07c9:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            r1 = 575(0x23f, float:8.06E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x080d
            java.lang.Integer r16 = X.AnonymousClass05K.A00
        L_0x07db:
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.util.ArrayList r20 = r0.createStringArrayList()
            boolean r21 = X.C41848B3p.A1X(r0)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0806
            r15 = 0
        L_0x07f6:
            com.instagram.friendmap.configs.AggregatedBannerConfig r15 = (com.instagram.friendmap.configs.AggregatedBannerConfig) r15
            boolean r22 = X.C41848B3p.A1X(r0)
            boolean r23 = X.C41848B3p.A1X(r0)
            com.instagram.friendmap.configs.FriendMapLaunchConfig r14 = new com.instagram.friendmap.configs.FriendMapLaunchConfig
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r14
        L_0x0806:
            android.os.Parcelable$Creator r1 = com.instagram.friendmap.configs.AggregatedBannerConfig.CREATOR
            java.lang.Object r15 = r1.createFromParcel(r0)
            goto L_0x07f6
        L_0x080d:
            r1 = 4388(0x1124, float:6.149E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x081c
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            goto L_0x07db
        L_0x081c:
            r1 = 4302(0x10ce, float:6.028E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x082b
            java.lang.Integer r16 = X.AnonymousClass05K.A0C
            goto L_0x07db
        L_0x082b:
            java.lang.String r1 = "DEEPLINK"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0836
            java.lang.Integer r16 = X.AnonymousClass05K.A0N
            goto L_0x07db
        L_0x0836:
            r1 = 582(0x246, float:8.16E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0845
            java.lang.Integer r16 = X.AnonymousClass05K.A0Y
            goto L_0x07db
        L_0x0845:
            java.lang.String r1 = "UNKNOWN"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0850
            java.lang.Integer r16 = X.AnonymousClass05K.A0j
            goto L_0x07db
        L_0x0850:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0856:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.util.ArrayList r2 = r0.createStringArrayList()
            int r1 = r0.readInt()
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.friendmap.configs.AggregatedBannerConfig r14 = new com.instagram.friendmap.configs.AggregatedBannerConfig
            r14.<init>(r1, r0, r2)
            return r14
        L_0x086c:
            java.lang.String r4 = X.C41848B3p.A1D(r0)
            java.lang.String r3 = r0.readString()
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData> r1 = com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData r14 = new com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData
            r14.<init>(r0, r4, r3, r2)
            return r14
        L_0x0886:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.08y r1 = X.09i.A0A
            android.os.Bundle r0 = r0.readBundle()
            X.0qQ.A0A(r0)
            X.0wW r0 = r1.A04(r0)
            com.instagram.foa.session.IgMetaSessionImpl r14 = new com.instagram.foa.session.IgMetaSessionImpl
            r14.<init>(r0)
            return r14
        L_0x089d:
            java.lang.String r3 = r0.readString()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r1, r3)
            com.instagram.common.session.UserSession r1 = X.DbS.A0U(r2)
            boolean r0 = X.Pxg.A1U(r0)
            com.instagram.filterkit.filter.resize.ResizeFilter r14 = new com.instagram.filterkit.filter.resize.ResizeFilter
            r14.<init>(r1, r0)
            return r14
        L_0x08b9:
            com.instagram.filterkit.filter.resize.LanczosFilter r14 = new com.instagram.filterkit.filter.resize.LanczosFilter
            r14.<init>(r0)
            return r14
        L_0x08bf:
            com.instagram.filterkit.filter.resize.IdentityFilter r14 = new com.instagram.filterkit.filter.resize.IdentityFilter
            r14.<init>(r0)
            return r14
        L_0x08c5:
            com.instagram.filterkit.filter.IdentityFilter r14 = new com.instagram.filterkit.filter.IdentityFilter
            r14.<init>(r0)
            return r14
        L_0x08cb:
            com.instagram.filterkit.filter.FilterGroup r14 = new com.instagram.filterkit.filter.FilterGroup
            r14.<init>(r0)
            return r14
        L_0x08d1:
            X.Pxi.A11(r0)
            com.instagram.feed.ui.state.IntentAwareAdPivotState r14 = new com.instagram.feed.ui.state.IntentAwareAdPivotState
            r14.<init>()
            return r14
        L_0x08da:
            java.lang.String r15 = X.C41848B3p.A1D(r0)
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            boolean r25 = X.C41848B3p.A1X(r0)
            com.instagram.feed.su.model.MiddleStateCardUser r14 = new com.instagram.feed.su.model.MiddleStateCardUser
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r14
        L_0x090c:
            java.lang.String r15 = X.C41848B3p.A1D(r0)
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            int r20 = r0.readInt()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            com.instagram.feed.intf.ContextualFeedNetworkConfig r14 = new com.instagram.feed.intf.ContextualFeedNetworkConfig
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r14
        L_0x092a:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.feed.feeditem.SuggestedChannels> r1 = com.instagram.feed.feeditem.SuggestedChannels.class
            java.lang.Object r0 = X.Pxi.A0U(r0, r1)
            X.N33 r0 = (X.N33) r0
            com.instagram.feed.feeditem.SuggestedChannels r14 = new com.instagram.feed.feeditem.SuggestedChannels
            r14.<init>(r0)
            return r14
        L_0x093c:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            boolean r0 = X.C41848B3p.A1X(r0)
            X.AnonymousClass7TG.A1O(r2, r1)
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r14 = new com.instagram.fanclub.intf.UserPayFanclubUpsellParams
            r14.<init>()
            r14.A00 = r2
            r14.A01 = r1
            r14.A02 = r0
            return r14
        L_0x0957:
            int r0 = X.C41848B3p.A00(r0)
            com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams r14 = new com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams
            r14.<init>(r0)
            return r14
        L_0x0961:
            int r1 = X.C41848B3p.A00(r0)
            boolean r20 = X.AnonymousClass7TF.A1P(r1)
            boolean r21 = X.Pxi.A1P(r0)
            int r18 = r0.readInt()
            int r19 = r0.readInt()
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.instagram.explore.intf.ExploreFragmentConfig> r1 = com.instagram.explore.intf.ExploreFragmentConfig.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r1)
            com.instagram.explore.topiccluster.ExploreTopicCluster r15 = (com.instagram.explore.topiccluster.ExploreTopicCluster) r15
            java.lang.String r17 = r0.readString()
            com.instagram.explore.intf.ExploreFragmentConfig r14 = new com.instagram.explore.intf.ExploreFragmentConfig
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            return r14
        L_0x098b:
            com.instagram.discovery.related.model.RelatedItem r14 = new com.instagram.discovery.related.model.RelatedItem
            r14.<init>()
            java.lang.String r1 = r0.readString()
            r14.A03 = r1
            java.lang.String r1 = r0.readString()
            r14.A05 = r1
            java.lang.String r1 = r0.readString()
            r14.A04 = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r1 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r14.A01 = r1
            int r0 = r0.readInt()
            r14.A00 = r0
            return r14
        L_0x09b3:
            com.instagram.discovery.refinement.model.RefinementAttributes r14 = new com.instagram.discovery.refinement.model.RefinementAttributes
            r14.<init>()
            java.lang.String r1 = r0.readString()
            r14.A04 = r1
            java.lang.String r1 = r0.readString()
            r14.A03 = r1
            boolean r1 = X.Pxg.A1U(r0)
            r14.A05 = r1
            java.lang.Class<com.instagram.model.keyword.Keyword> r1 = com.instagram.model.keyword.Keyword.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.keyword.Keyword r1 = (com.instagram.model.keyword.Keyword) r1
            r14.A02 = r1
            java.lang.Class<com.instagram.discovery.refinement.model.QueryInformation> r1 = com.instagram.discovery.refinement.model.QueryInformation.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.discovery.refinement.model.QueryInformation r0 = (com.instagram.discovery.refinement.model.QueryInformation) r0
            r14.A00 = r0
            r14.A00()
            return r14
        L_0x09e2:
            com.instagram.discovery.refinement.model.Refinement r14 = new com.instagram.discovery.refinement.model.Refinement
            r14.<init>()
            java.lang.String r1 = r0.readString()
            r14.A01 = r1
            java.lang.Class<com.instagram.discovery.refinement.model.RefinementAttributes> r1 = com.instagram.discovery.refinement.model.RefinementAttributes.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.discovery.refinement.model.RefinementAttributes r0 = (com.instagram.discovery.refinement.model.RefinementAttributes) r0
            r14.A00 = r0
            return r14
        L_0x09f8:
            com.instagram.discovery.refinement.model.QueryInformation r14 = new com.instagram.discovery.refinement.model.QueryInformation
            r14.<init>()
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = ""
            if (r2 != 0) goto L_0x0a06
            r2 = r1
        L_0x0a06:
            r14.A00 = r2
            java.lang.String r0 = r0.readString()
            if (r0 == 0) goto L_0x0a0f
            r1 = r0
        L_0x0a0f:
            r14.A01 = r1
            return r14
        L_0x0a12:
            com.instagram.discovery.mediamap.model.MediaMapPinPreview r14 = new com.instagram.discovery.mediamap.model.MediaMapPinPreview
            r14.<init>()
            java.lang.String r1 = r0.readString()
            r14.A01 = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r1 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r14.A00 = r0
            return r14
        L_0x0a28:
            com.instagram.discovery.mediamap.model.MediaMapPin r14 = new com.instagram.discovery.mediamap.model.MediaMapPin
            r14.<init>()
            java.lang.Class<com.instagram.model.venue.LocationDict> r1 = com.instagram.model.venue.LocationDict.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.venue.LocationDict r1 = (com.instagram.model.venue.LocationDict) r1
            r14.A09 = r1
            double r1 = r0.readDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r14.A0A = r1
            double r1 = r0.readDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r14.A0B = r1
            java.lang.String r1 = r0.readString()
            r14.A0D = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r3 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r3)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r14.A05 = r1
            java.lang.Class<com.instagram.discovery.mediamap.model.LocationPageInformation> r1 = com.instagram.discovery.mediamap.model.LocationPageInformation.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.discovery.mediamap.model.LocationPageInformation r1 = (com.instagram.discovery.mediamap.model.LocationPageInformation) r1
            r14.A06 = r1
            java.lang.Class<com.facebook.android.maps.model.LatLng> r1 = com.facebook.android.maps.model.LatLng.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.facebook.android.maps.model.LatLng r1 = (com.facebook.android.maps.model.LatLng) r1
            r14.A02 = r1
            long r1 = r0.readLong()
            r14.A01 = r1
            int r1 = r0.readInt()
            r14.A00 = r1
            java.util.ArrayList r2 = r14.A0E
            if (r2 != 0) goto L_0x0a86
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r14.A0E = r2
        L_0x0a86:
            java.lang.Class<com.instagram.discovery.mediamap.model.MediaMapPinPreview> r1 = com.instagram.discovery.mediamap.model.MediaMapPinPreview.class
            X.Pxe.A1O(r0, r1, r2)
            java.lang.String r1 = r0.readString()
            r14.A0C = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r3)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r14.A04 = r1
            java.lang.String r2 = r0.readString()
            if (r2 == 0) goto L_0x0aaa
            r1 = 0
            X.16F r2 = X.16P.A00(r2)     // Catch:{ IOException -> 0x0aa8 }
            X.3HX r1 = X.AnonymousClass3HR.parseFromJson(r2)     // Catch:{ IOException -> 0x0aa8 }
        L_0x0aa8:
            r14.A08 = r1
        L_0x0aaa:
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0ac4
            X.16F r1 = X.16P.A00(r1)     // Catch:{ IOException -> 0x0ab9 }
            X.4sL r1 = X.C275974sH.parseFromJson(r1)     // Catch:{ IOException -> 0x0ab9 }
            goto L_0x0ac2
        L_0x0ab9:
            r3 = move-exception
            java.lang.String r2 = "MediaMapPin"
            java.lang.String r1 = "failed to unparcel clips item from json"
            X.0KC.A0G(r2, r1, r3)
            r1 = 0
        L_0x0ac2:
            r14.A03 = r1
        L_0x0ac4:
            java.lang.String r2 = r0.readString()
            java.util.Map r1 = X.C16557Ux9.A01
            java.lang.Object r1 = r1.get(r2)
            X.Ux9 r1 = (X.C16557Ux9) r1
            if (r1 != 0) goto L_0x0ad4
            X.Ux9 r1 = X.C16557Ux9.UNKNOWN
        L_0x0ad4:
            r14.A07 = r1
            boolean r0 = X.Pxg.A1U(r0)
            r14.A0F = r0
            return r14
        L_0x0add:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            java.lang.String r12 = r0.readString()
            java.lang.String r11 = r0.readString()
            java.lang.String r10 = r0.readString()
            int r1 = r0.readInt()
            r14 = -1
            r9 = 0
            if (r1 != r14) goto L_0x0b1d
            r8 = r9
        L_0x0af6:
            java.lang.String r7 = r0.readString()
            java.lang.String r6 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != r14) goto L_0x0b18
            r5 = r9
        L_0x0b05:
            java.lang.String r4 = r0.readString()
            java.lang.Class<com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse> r1 = com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r1)
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r3 = (com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse) r3
            java.lang.String r2 = r0.readString()
            if (r2 == 0) goto L_0x0b29
            goto L_0x0b22
        L_0x0b18:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            goto L_0x0b05
        L_0x0b1d:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            goto L_0x0af6
        L_0x0b22:
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0b29 }
            com.instagram.user.model.User r1 = X.1aC.A04(r2)     // Catch:{ IOException -> 0x0b29 }
            goto L_0x0b2a
        L_0x0b29:
            r1 = r9
        L_0x0b2a:
            X.VN9 r2 = new X.VN9
            r2.<init>()
            r2.A00 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            int r0 = r0.readInt()
            if (r0 == r14) goto L_0x0b3f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x0b3f:
            com.instagram.discovery.mediamap.model.LocationPageInformation r14 = new com.instagram.discovery.mediamap.model.LocationPageInformation
            r14.<init>()
            r14.A08 = r13
            r14.A09 = r12
            r14.A0A = r11
            r14.A06 = r10
            r14.A03 = r8
            r14.A05 = r7
            r14.A07 = r6
            r14.A04 = r5
            r14.A0B = r4
            r14.A01 = r3
            r14.A00 = r2
            r14.A0C = r1
            r14.A02 = r9
            return r14
        L_0x0b5f:
            com.instagram.discovery.mediamap.intf.MediaMapQuery r14 = new com.instagram.discovery.mediamap.intf.MediaMapQuery
            r14.<init>(r0)
            return r14
        L_0x0b65:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.discovery.mediamap.intf.MapEntryPoint[] r1 = com.instagram.discovery.mediamap.intf.MapEntryPoint.values()
            int r0 = r0.readInt()
            r14 = r1[r0]
            return r14
        L_0x0b74:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.discovery.mediamap.fragment.LocationListFragmentMode[] r1 = com.instagram.discovery.mediamap.fragment.LocationListFragmentMode.values()
            int r0 = r0.readInt()
            r14 = r1[r0]
            return r14
        L_0x0b83:
            com.instagram.discovery.filters.intf.FilterConfig r14 = new com.instagram.discovery.filters.intf.FilterConfig
            r14.<init>((android.os.Parcel) r0)
            return r14
        L_0x0b89:
            com.instagram.discovery.filters.analytics.FiltersLoggingInfo r14 = new com.instagram.discovery.filters.analytics.FiltersLoggingInfo
            r14.<init>(r0)
            return r14
        L_0x0b8f:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig> r1 = com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r1)
            com.instagram.discovery.api.model.SectionPagination r15 = (com.instagram.discovery.api.model.SectionPagination) r15
            int r1 = r0.readInt()
            r17 = 0
            if (r1 != 0) goto L_0x0bcd
            r16 = r17
        L_0x0ba5:
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0bb3
            java.lang.String r1 = r0.readString()
            X.Uz8 r17 = X.C16672Uz8.valueOf(r1)
        L_0x0bb3:
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            int r20 = r0.readInt()
            int r21 = r0.readInt()
            boolean r22 = X.C41848B3p.A1X(r0)
            com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig r14 = new com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            return r14
        L_0x0bcd:
            java.lang.String r1 = r0.readString()
            X.Uz8 r16 = X.C16672Uz8.valueOf(r1)
            goto L_0x0ba5
        L_0x0bd6:
            java.lang.String r19 = X.C41848B3p.A1D(r0)
            java.lang.String r20 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.HMv r15 = X.C54664HMv.valueOf(r1)
            int r34 = r0.readInt()
            int r1 = r0.readInt()
            r3 = 1
            boolean r35 = X.AnonymousClass7TF.A1P(r1)
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            java.lang.String r25 = r0.readString()
            java.lang.Class<com.instagram.discovery.chaining.model.DiscoveryChainingItem> r1 = com.instagram.discovery.chaining.model.DiscoveryChainingItem.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.videofeed.intf.VideoFeedType r1 = (com.instagram.videofeed.intf.VideoFeedType) r1
            java.lang.String r26 = r0.readString()
            java.lang.String r27 = r0.readString()
            int r2 = r0.readInt()
            r17 = 0
            if (r2 != 0) goto L_0x0c52
            r18 = r17
        L_0x0c21:
            java.lang.String r28 = r0.readString()
            java.lang.String r29 = r0.readString()
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x0c3a
            int r2 = r0.readInt()
            if (r2 != 0) goto L_0x0c36
            r3 = 0
        L_0x0c36:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r3)
        L_0x0c3a:
            java.lang.String r30 = r0.readString()
            java.lang.String r31 = r0.readString()
            java.lang.String r32 = r0.readString()
            java.lang.String r33 = r0.readString()
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r14 = new com.instagram.discovery.chaining.model.DiscoveryChainingItem
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return r14
        L_0x0c52:
            java.lang.Integer r18 = X.C41847B3o.A12(r0)
            goto L_0x0c21
        L_0x0c57:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.discovery.chaining.intf.DiscoveryChainingConfig> r1 = com.instagram.discovery.chaining.intf.DiscoveryChainingConfig.class
            android.os.Parcelable r7 = X.C41847B3o.A03(r0, r1)
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r7 = (com.instagram.discovery.chaining.model.DiscoveryChainingItem) r7
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            boolean r32 = X.C41848B3p.A1X(r0)
            boolean r33 = X.C41848B3p.A1X(r0)
            boolean r34 = X.C41848B3p.A1X(r0)
            boolean r35 = X.C41848B3p.A1X(r0)
            boolean r36 = X.C41848B3p.A1X(r0)
            boolean r37 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r6 = X.C41847B3o.A03(r0, r1)
            com.instagram.explore.topiccluster.ExploreTopicCluster r6 = (com.instagram.explore.topiccluster.ExploreTopicCluster) r6
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Bundle r15 = r0.readBundle(r1)
            java.lang.String r24 = r0.readString()
            java.lang.String r25 = r0.readString()
            int r1 = r0.readInt()
            r3 = 0
            if (r1 != 0) goto L_0x0cce
            r18 = r3
        L_0x0caa:
            java.lang.String r26 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x0cd3
            int r2 = r0.readInt()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r2)
            r1 = 0
        L_0x0cbe:
            if (r1 == r2) goto L_0x0cd3
            java.lang.String r5 = r0.readString()
            java.lang.String r4 = r0.readString()
            r3.put(r5, r4)
            int r1 = r1 + 1
            goto L_0x0cbe
        L_0x0cce:
            java.lang.Integer r18 = X.C41847B3o.A12(r0)
            goto L_0x0caa
        L_0x0cd3:
            java.lang.String r27 = r0.readString()
            int r2 = r0.readInt()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>(r2)
            r1 = 0
        L_0x0ce1:
            if (r1 == r2) goto L_0x0ce8
            int r1 = X.C13990Tnq.A07(r0, r4, r1)
            goto L_0x0ce1
        L_0x0ce8:
            java.lang.String r28 = r0.readString()
            boolean r38 = X.C41848B3p.A1X(r0)
            boolean r39 = X.C41848B3p.A1X(r0)
            java.lang.String r29 = r0.readString()
            java.lang.Integer r19 = X.C13991Tnr.A0W(r0)
            boolean r40 = X.C41848B3p.A1X(r0)
            boolean r41 = X.C41848B3p.A1X(r0)
            boolean r42 = X.C41848B3p.A1X(r0)
            com.instagram.discovery.chaining.intf.DiscoveryChainingConfig r14 = new com.instagram.discovery.chaining.intf.DiscoveryChainingConfig
            r17 = r6
            r30 = r3
            r31 = r4
            r16 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r14
        L_0x0d16:
            com.instagram.discovery.categories.model.Category r14 = new com.instagram.discovery.categories.model.Category
            r14.<init>()
            java.lang.String r1 = r0.readString()
            r14.A01 = r1
            java.lang.String r1 = r0.readString()
            r14.A04 = r1
            java.lang.String r1 = r0.readString()
            r14.A03 = r1
            java.lang.String r1 = r0.readString()
            r14.A02 = r1
            java.lang.Integer r0 = X.C41847B3o.A12(r0)
            r14.A00 = r0
            return r14
        L_0x0d3a:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.util.ArrayList r1 = r0.createStringArrayList()
            java.lang.String r0 = r0.readString()
            com.instagram.discovery.api.model.SectionPagination r14 = new com.instagram.discovery.api.model.SectionPagination
            r14.<init>(r2, r0, r1)
            return r14
        L_0x0d4c:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.discoverpeople.model.FindPeopleButtonOverride r14 = new com.instagram.discoverpeople.model.FindPeopleButtonOverride
            r14.<init>(r2, r1, r0)
            return r14
        L_0x0d5e:
            java.lang.String r17 = X.C41848B3p.A1D(r0)
            java.lang.String r18 = r0.readString()
            java.lang.Integer r15 = X.JTU.A0U(r0)
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "OPEN_MEDIA"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0d8e
            java.lang.Integer r16 = X.AnonymousClass05K.A00
        L_0x0d80:
            boolean r22 = X.C41848B3p.A1X(r0)
            int r21 = r0.readInt()
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r14 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            return r14
        L_0x0d8e:
            java.lang.String r1 = "NO_OP"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0d99
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            goto L_0x0d80
        L_0x0d99:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0d9f:
            int r20 = X.C41848B3p.A00(r0)
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.education.NudityReceiverEducationSafetyTipsViewModel r14 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.education.NudityReceiverEducationSafetyTipsViewModel
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r14
        L_0x0dbd:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            r1 = 955(0x3bb, float:1.338E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e05
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0dfc
            r15 = 0
        L_0x0de6:
            int r23 = r0.readInt()
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            boolean r24 = X.C41848B3p.A1X(r0)
            com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData r14 = new com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r14
        L_0x0dfc:
            java.lang.String r1 = r0.readString()
            X.2EG r15 = X.2EG.valueOf(r1)
            goto L_0x0de6
        L_0x0e05:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0e0b:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$TamMedia> r2 = com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.TamMedia.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            android.net.Uri r1 = (android.net.Uri) r1
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r2)
            android.net.Uri r0 = (android.net.Uri) r0
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$TamMedia r14 = new com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$TamMedia
            r14.<init>(r1, r0)
            return r14
        L_0x0e23:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia> r1 = com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.RemixMedia.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r1)
            android.net.Uri r3 = (android.net.Uri) r3
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia r14 = new com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia
            r14.<init>(r3, r2, r1, r0)
            return r14
        L_0x0e43:
            java.lang.String r17 = X.C41848B3p.A1D(r0)
            java.lang.String r18 = r0.readString()
            long r21 = r0.readLong()
            boolean r23 = X.C41848B3p.A1X(r0)
            int r20 = r0.readInt()
            java.lang.Class<com.instagram.direct.visual.model.DirectVisualMessageItemModel> r1 = com.instagram.direct.visual.model.DirectVisualMessageItemModel.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r1)
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields r15 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields) r15
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r1 = (com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel) r1
            java.lang.String r19 = r0.readString()
            com.instagram.direct.visual.model.DirectVisualMessageItemModel r14 = new com.instagram.direct.visual.model.DirectVisualMessageItemModel
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r23)
            return r14
        L_0x0e71:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            r1 = 491(0x1eb, float:6.88E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e91
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x0e83:
            java.lang.Class<com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel> r1 = com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0
            com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel r14 = new com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel
            r14.<init>(r0, r2)
            return r14
        L_0x0e91:
            java.lang.String r1 = "LOAD_MORE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0e9c
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x0e83
        L_0x0e9c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0ea2:
            int r4 = X.C41848B3p.A00(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x0eac:
            if (r2 == r4) goto L_0x0eb5
            android.os.Parcelable$Creator r1 = com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x0eac
        L_0x0eb5:
            java.lang.String r2 = r0.readString()
            boolean r1 = X.C41848B3p.A1X(r0)
            boolean r0 = X.Pxi.A1P(r0)
            com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel r14 = new com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel
            r14.<init>()
            r14.A01 = r3
            r14.A00 = r2
            r14.A02 = r1
            r14.A03 = r0
            return r14
        L_0x0ecf:
            java.lang.String r19 = X.C41848B3p.A1D(r0)
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            int r29 = r0.readInt()
            java.lang.Class<com.instagram.direct.sharetostory.data.MessageShareStickerData> r1 = com.instagram.direct.sharetostory.data.MessageShareStickerData.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            int r30 = r0.readInt()
            boolean r31 = X.C41848B3p.A1X(r0)
            boolean r32 = X.C41848B3p.A1X(r0)
            boolean r33 = X.C41848B3p.A1X(r0)
            java.lang.String r22 = r0.readString()
            boolean r34 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.IGAIAgentType r15 = (com.instagram.api.schemas.IGAIAgentType) r15
            java.lang.String r23 = r0.readString()
            int r3 = r0.readInt()
            if (r3 != 0) goto L_0x0f39
            r18 = 0
        L_0x0f11:
            java.lang.String r24 = r0.readString()
            java.lang.String r25 = r0.readString()
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.direct.capabilities.Capabilities r1 = (com.instagram.direct.capabilities.Capabilities) r1
            java.lang.String r26 = r0.readString()
            boolean r35 = X.C41848B3p.A1X(r0)
            java.lang.String r27 = r0.readString()
            java.lang.String r28 = r0.readString()
            com.instagram.direct.sharetostory.data.MessageShareStickerData r14 = new com.instagram.direct.sharetostory.data.MessageShareStickerData
            r17 = r1
            r16 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return r14
        L_0x0f39:
            java.lang.String r3 = r0.readString()
            X.2FW r18 = X.2FW.valueOf(r3)
            goto L_0x0f11
        L_0x0f42:
            java.lang.String r16 = X.C41848B3p.A1D(r0)
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            int r20 = r0.readInt()
            java.lang.Class<com.instagram.direct.sharetostory.data.JoinChatStickerData> r1 = com.instagram.direct.sharetostory.data.JoinChatStickerData.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r15 = (com.instagram.common.typedurl.ImageUrl) r15
            int r21 = r0.readInt()
            boolean r23 = X.C41848B3p.A1X(r0)
            boolean r24 = X.C41848B3p.A1X(r0)
            boolean r25 = X.C41848B3p.A1X(r0)
            java.lang.String r19 = r0.readString()
            int r22 = r0.readInt()
            com.instagram.direct.sharetostory.data.JoinChatStickerData r14 = new com.instagram.direct.sharetostory.data.JoinChatStickerData
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r14
        L_0x0f78:
            java.lang.String r17 = X.C41848B3p.A1D(r0)
            java.lang.String r18 = r0.readString()
            int r29 = r0.readInt()
            int r30 = r0.readInt()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            java.lang.Class<com.instagram.direct.sharetostory.data.ChannelChallengeStickerData> r5 = com.instagram.direct.sharetostory.data.ChannelChallengeStickerData.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r5)
            com.instagram.common.typedurl.ImageUrl r15 = (com.instagram.common.typedurl.ImageUrl) r15
            int r2 = r0.readInt()
            r1 = 0
            if (r2 != 0) goto L_0x0fbc
            r2 = r1
        L_0x0fa4:
            int r3 = r0.readInt()
            if (r3 == 0) goto L_0x0fce
            int r4 = r0.readInt()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            r3 = 0
        L_0x0fb4:
            if (r3 == r4) goto L_0x0fce
            X.C41848B3p.A1J(r0, r5, r1)
            int r3 = r3 + 1
            goto L_0x0fb4
        L_0x0fbc:
            int r4 = r0.readInt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            r3 = 0
        L_0x0fc6:
            if (r3 == r4) goto L_0x0fa4
            X.C41848B3p.A1J(r0, r5, r2)
            int r3 = r3 + 1
            goto L_0x0fc6
        L_0x0fce:
            java.lang.Integer r16 = X.C13991Tnr.A0W(r0)
            boolean r31 = X.C41848B3p.A1X(r0)
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            java.lang.String r25 = r0.readString()
            java.lang.String r26 = r0.readString()
            com.instagram.direct.sharetostory.data.ChannelChallengeStickerData r14 = new com.instagram.direct.sharetostory.data.ChannelChallengeStickerData
            r27 = r2
            r28 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r14
        L_0x0ff4:
            java.lang.String r18 = X.C41848B3p.A1D(r0)
            boolean r27 = X.C41848B3p.A1X(r0)
            int r25 = r0.readInt()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.String r21 = r0.readString()
            boolean r28 = X.C41848B3p.A1X(r0)
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            boolean r29 = X.C41848B3p.A1X(r0)
            boolean r30 = X.C41848B3p.A1X(r0)
            int r2 = r0.readInt()
            r1 = 0
            if (r2 != 0) goto L_0x106f
            r17 = r1
        L_0x1029:
            boolean r31 = X.C41848B3p.A1X(r0)
            boolean r32 = X.C41848B3p.A1X(r0)
            boolean r33 = X.C41848B3p.A1X(r0)
            boolean r34 = X.C41848B3p.A1X(r0)
            java.lang.String r24 = r0.readString()
            boolean r35 = X.C41848B3p.A1X(r0)
            boolean r36 = X.C41848B3p.A1X(r0)
            int r2 = r0.readInt()
            if (r2 != 0) goto L_0x1068
            r15 = r1
        L_0x104c:
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r15 = (com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo) r15
            int r2 = r0.readInt()
            if (r2 == 0) goto L_0x105a
            android.os.Parcelable$Creator r1 = com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
        L_0x105a:
            com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo r1 = (com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo) r1
            int r26 = r0.readInt()
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r14 = new com.instagram.direct.request.response.GroupLinkPreviewResponse$Success
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r14
        L_0x1068:
            android.os.Parcelable$Creator r2 = com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo.CREATOR
            java.lang.Object r15 = r2.createFromParcel(r0)
            goto L_0x104c
        L_0x106f:
            java.lang.Long r17 = X.Pxi.A0T(r0)
            goto L_0x1029
        L_0x1074:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo> r1 = com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.MessagingOffPlatformShareType r2 = (com.instagram.api.schemas.MessagingOffPlatformShareType) r2
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo r14 = new com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo
            r14.<init>(r2, r1, r0)
            return r14
        L_0x108e:
            java.lang.String r16 = X.C41848B3p.A1D(r0)
            java.lang.String r17 = r0.readString()
            java.lang.Class<com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo> r1 = com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo.class
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r15 = (com.instagram.common.typedurl.ImageUrl) r15
            int r1 = r0.readInt()
            boolean r19 = X.AnonymousClass7TF.A1P(r1)
            boolean r20 = X.Pxi.A1P(r0)
            int r18 = r0.readInt()
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r14 = new com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r14
        L_0x10b4:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel$TabType r14 = com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel.TabType.valueOf(r0)
            return r14
        L_0x10bd:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel> r1 = com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r2 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r2
            android.os.Parcelable$Creator r1 = com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel.TabType.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel$TabType r0 = (com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel.TabType) r0
            com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel r14 = new com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel
            r14.<init>(r2, r0)
            return r14
        L_0x10d7:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.direct.prompts.DirectEditAddYoursParams r14 = new com.instagram.direct.prompts.DirectEditAddYoursParams
            r14.<init>(r1, r0)
            return r14
        L_0x10e5:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Integer r0 = X.JTU.A0U(r0)
            com.instagram.direct.msys.subtype.MsysThreadSubtype$Unknown r14 = new com.instagram.direct.msys.subtype.MsysThreadSubtype$Unknown
            r14.<init>(r0)
            return r14
        L_0x10f3:
            X.Pxi.A11(r0)
            com.instagram.direct.msys.subtype.MsysThreadSubtype$Standard r14 = com.instagram.direct.msys.subtype.MsysThreadSubtype.Standard.A00
            return r14
        L_0x10f9:
            X.Pxi.A11(r0)
            com.instagram.direct.msys.subtype.MsysThreadSubtype$DualSendShadow r14 = com.instagram.direct.msys.subtype.MsysThreadSubtype.DualSendShadow.A00
            return r14
        L_0x10ff:
            X.Pxi.A11(r0)
            com.instagram.direct.msys.subtype.MsysThreadSubtype$BtvCompanion r14 = com.instagram.direct.msys.subtype.MsysThreadSubtype.BtvCompanion.A00
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W6E.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new MsysThreadSubtype.BtvCompanion[i];
            case 1:
                return new MsysThreadSubtype.DualSendShadow[i];
            case 2:
                return new MsysThreadSubtype.Standard[i];
            case 3:
                return new MsysThreadSubtype.Unknown[i];
            case 4:
                return new DirectEditAddYoursParams[i];
            case 5:
                return new DirectCustomReactionTabModel[i];
            case 6:
                return new DirectCustomReactionTabModel.TabType[i];
            case 7:
                return new GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo[i];
            case 8:
                return new GroupLinkPreviewResponse$SharedThreadContentInfo[i];
            case 9:
                return new GroupLinkPreviewResponse$Success[i];
            case 10:
                return new ChannelChallengeStickerData[i];
            case 11:
                return new JoinChatStickerData[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new MessageShareStickerData[i];
            case 13:
                return new DirectThreadDetailsCollectionRowViewModel[i];
            case 14:
                return new DirectThreadDetailsCollectionViewModel[i];
            case 15:
                return new DirectVisualMessageItemModel[i];
            case 16:
                return new DirectVisualMessageItemModel.MediaFields.RemixMedia[i];
            case 17:
                return new DirectVisualMessageItemModel.MediaFields.TamMedia[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new DirectWellBeingUpsellBottomSheetData[i];
            case 19:
                return new NudityReceiverEducationSafetyTipsViewModel[i];
            case 20:
                return new PrivacyMediaOverlayViewModel[i];
            case 21:
                return new FindPeopleButtonOverride[i];
            case 22:
                return new SectionPagination[i];
            case 23:
                return new Category[i];
            case 24:
                return new DiscoveryChainingConfig[i];
            case 25:
                return new DiscoveryChainingItem[i];
            case 26:
                return new EntityContextualFeedConfig[i];
            case 27:
                return new FiltersLoggingInfo[i];
            case 28:
                return new FilterConfig[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new LocationListFragmentMode[i];
            case 30:
                return new MapEntryPoint[i];
            case 31:
                return new MediaMapQuery[i];
            case 32:
                return new LocationPageInformation[i];
            case 33:
                return new MediaMapPin[i];
            case 34:
                return new MediaMapPinPreview[i];
            case 35:
                return new QueryInformation[i];
            case 36:
                return new Refinement[i];
            case 37:
                return new RefinementAttributes[i];
            case 38:
                return new RelatedItem[i];
            case 39:
                return new ExploreFragmentConfig[i];
            case 40:
                return new FanClubGuidedActivationProfileBannerParams[i];
            case Seq.NULL_REFNUM /*41*/:
                return new UserPayFanclubUpsellParams[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new SuggestedChannels[i];
            case 43:
                return new ContextualFeedNetworkConfig[i];
            case 44:
                return new MiddleStateCardUser[i];
            case 45:
                return new IntentAwareAdPivotState[i];
            case 46:
                return new FilterGroup[i];
            case 47:
                return new IdentityFilter[i];
            case 48:
                return new com.instagram.filterkit.filter.resize.IdentityFilter[i];
            case 49:
                return new LanczosFilter[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new ResizeFilter[i];
            case 51:
                return new IgMetaSessionImpl[i];
            case 52:
                return new AutoFollowBackBottomSheetData[i];
            case 53:
                return new AggregatedBannerConfig[i];
            case 54:
                return new FriendMapLaunchConfig[i];
            case 55:
                return new PagerSheetLaunchConfig[i];
            case 56:
                return new MapText.Raw[i];
            case 57:
                return new MapText.Res[i];
            case 58:
                return new FriendMapAudienceListFragment$CustomAudienceLaunchConfig[i];
            case 59:
                return new FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig[i];
            case 60:
                return new FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig[i];
            case 61:
                return new FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig[i];
            case 62:
                return new IgxfbNetEgoCTABannerParams[i];
            case 63:
                return new GuideCreationLoggerState[i];
            case 64:
                return new GuideCreationType[i];
            case 65:
                return new GuideFragmentConfig[i];
            case 66:
                return new MinimalGuide[i];
            case 67:
                return new MinimalGuideItem[i];
            case 68:
                return new GuideItemAttachment[i];
            case 69:
                return new HallPassMemberViewModel[i];
            case 70:
                return new HallPassViewModel[i];
            case 71:
                return new HashtagContextualFeedConfig[i];
            case 72:
                return new IgFormField.SavedState[i];
            case 73:
                return new IGTVCreationToolsResponse[i];
            case 74:
                return new IGTVViewerLoggingToken[i];
            case 75:
                return new IGTVBrandedContentTags[i];
            case 76:
                return new IGTVUploadProgress[i];
            case 77:
                return new IGTVShoppingMetadata[i];
            case 78:
                return new InfoCenterFactShareInfo[i];
            case 79:
                return new ShareInfo[i];
            case 80:
                return new LeadAdsDisclaimerResponse[i];
            case 81:
                return new LeadAdsInputFieldResponse[i];
            case 82:
                return new LeadForm[i];
            case 83:
                return new LeadGenInfoFieldData[i];
            case 84:
                return new LeadGenInfoFieldTypes[i];
            case 85:
                return new OrganicLeadGenCtaLabel[i];
            case 86:
                return new LeadGenBaseFormList[i];
            case 87:
                return new LeadGenConditionalAnswerInfo[i];
            case 88:
                return new LeadGenFormBaseQuestion[i];
            case 89:
                return new LeadGenProfileContentInfo[i];
            case 90:
                return new LeadGenTrustSignal[i];
            case 91:
                return new LeadGenTrustSignalsPayload[i];
            case 92:
                return new LeadGenCustomDisclaimer[i];
            case 93:
                return new LeadGenCustomDisclaimerBody[i];
            case 94:
                return new LeadGenCustomDisclaimerBodyUrlRanges[i];
            case 95:
                return new LeadGenCustomDisclaimerCheckbox[i];
            case 96:
                return new LeadGenDisqualifyingScreenData[i];
            case 97:
                return new LeadGenPrivacyPolicy[i];
            case 98:
                return new LeadFormCustomQuestion[i];
            default:
                return new LeadGenConsumerFormData[i];
        }
    }
}
