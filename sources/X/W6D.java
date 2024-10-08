package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.insights.model.DataPoint;
import com.instagram.business.insights.model.DaysHourlyFollowersData;
import com.instagram.business.insights.model.FollowersGrowthData;
import com.instagram.business.insights.model.GrowthDataPoint;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.model.BoostGuidanceItemResponse;
import com.instagram.business.model.PagePhotoItem;
import com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode;
import com.instagram.business.promote.model.AdsManagerPaymentAnomalyType;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.BillingWizardName;
import com.instagram.business.promote.model.DistanceUnit;
import com.instagram.business.promote.model.ErrorHandlingResponseType;
import com.instagram.business.promote.model.HpiSessionStatus;
import com.instagram.business.promote.model.IGBoostPackage;
import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.InstagramPromoteSuggestionReason;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteAdsManagerActionType;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteAudiencePotentialReachStore;
import com.instagram.business.promote.model.PromoteButtonAction;
import com.instagram.business.promote.model.PromoteButtonActionType;
import com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel;
import com.instagram.business.promote.model.PromoteCreateAudienceResponse;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteDataSnapshot;
import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.business.promote.model.PromoteErrorHandlingResponse;
import com.instagram.business.promote.model.PromoteErrorLevel;
import com.instagram.business.promote.model.PromoteIntegrityCheckDataModel;
import com.instagram.business.promote.model.PromoteIntegrityCheckMessage;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteReachEstimationStore;
import com.instagram.business.promote.model.PromoteSaveAudienceEditResponse;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.model.PromoteWhatsAppAccountType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.business.promote.model.RejectionReason;
import com.instagram.business.promote.model.RejectionReasonRanges;
import com.instagram.business.promote.model.SbgChannelName;
import com.instagram.business.promote.model.SelectedInterestRowItem;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.business.promote.model.SuggestedInterestRowItem;
import com.instagram.business.promote.model.SuggestedPromotion;
import com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.camera.effect.models.AttributionUser;
import com.instagram.camera.effect.models.EffectActionSheet;
import com.instagram.camera.effect.models.ProfilePicture;
import com.instagram.camera.effect.models.ThumbnailImage;
import com.instagram.camera.effect.models.effectpreview.EffectPreview;
import com.instagram.camera.mpfacade.CameraEffectFacadeIntf$State;
import com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal;
import com.instagram.clips.model.ClipsSpotlightData;
import com.instagram.clips.model.ClipsSpotlightModel;
import com.instagram.clips.model.ClipsTogetherData;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.clips.model.metadata.AudioPartType;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.clips.model.metadata.InteractionUpsellCTAType;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.comments.model.ChannelCommentsData;
import com.instagram.comments.model.ChannelRepliesNotifData;
import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.clips.model.LayoutTransform;
import com.instagram.common.clips.model.VideoCropParams;
import com.instagram.common.gallery.FaceCenter;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.typedurl.GifUrlLoggingExtras;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.compose.ui.gradientspinner.BezierControlPoints;
import com.instagram.compose.ui.gradientspinner.Segment;
import com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.directstack.DirectMessageEmojiInfo;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class W6D implements Parcelable.Creator {
    public final int A00;

    public W6D(int i) {
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Parcel} */
    /* JADX WARNING: type inference failed for: r9v7, types: [com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v8, types: [android.view.View$BaseSavedState, com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v13, types: [java.lang.Object, com.instagram.common.gallery.FaceCenter] */
    /* JADX WARNING: type inference failed for: r9v29, types: [java.lang.Object, com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal] */
    /* JADX WARNING: type inference failed for: r9v31, types: [com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v33, types: [com.instagram.camera.effect.models.effectpreview.EffectPreview, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v34, types: [com.instagram.camera.effect.models.ThumbnailImage, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v36, types: [com.instagram.camera.effect.models.EffectActionSheet, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v37, types: [com.instagram.camera.effect.models.AttributionUser, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v39, types: [java.lang.Object, com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel] */
    /* JADX WARNING: type inference failed for: r9v40, types: [com.instagram.business.promote.model.SuggestedPromotion, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v41, types: [java.lang.Object, com.instagram.business.promote.model.SuggestedInterestRowItem] */
    /* JADX WARNING: type inference failed for: r9v43, types: [java.lang.Object, com.instagram.business.promote.model.SelectedInterestRowItem] */
    /* JADX WARNING: type inference failed for: r9v45, types: [com.instagram.business.promote.model.RejectionReasonRanges, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v46, types: [com.instagram.business.promote.model.RejectionReason, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v47, types: [java.lang.Object, com.instagram.business.promote.model.PromotionMetric] */
    /* JADX WARNING: type inference failed for: r9v55, types: [java.lang.Object, com.instagram.business.promote.model.PromoteIntegrityCheckMessage] */
    /* JADX WARNING: type inference failed for: r9v56, types: [com.instagram.business.promote.model.PromoteIntegrityCheckDataModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v58, types: [java.lang.Object, com.instagram.business.promote.model.PromoteErrorHandlingResponse] */
    /* JADX WARNING: type inference failed for: r9v62, types: [java.lang.Object, com.instagram.business.promote.model.PromoteData] */
    /* JADX WARNING: type inference failed for: r9v64, types: [com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v66, types: [com.instagram.business.promote.model.PromoteButtonAction, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v83, types: [java.lang.Object, com.instagram.business.promote.model.AudienceInterest] */
    /* JADX WARNING: type inference failed for: r9v84, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    /* JADX WARNING: type inference failed for: r9v95, types: [java.lang.Object, com.instagram.business.controller.datamodel.PageSelectionOverrideData] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r41) {
        /*
            r40 = this;
            r0 = r40
            int r1 = r0.A00
            r0 = r41
            switch(r1) {
                case 0: goto L_0x0c31;
                case 1: goto L_0x0071;
                case 2: goto L_0x00b3;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00c7;
                case 5: goto L_0x00de;
                case 6: goto L_0x0122;
                case 7: goto L_0x0130;
                case 8: goto L_0x014d;
                case 9: goto L_0x016e;
                case 10: goto L_0x017c;
                case 11: goto L_0x0192;
                case 12: goto L_0x01a4;
                case 13: goto L_0x01aa;
                case 14: goto L_0x01b3;
                case 15: goto L_0x01bc;
                case 16: goto L_0x01c5;
                case 17: goto L_0x0209;
                case 18: goto L_0x0231;
                case 19: goto L_0x023a;
                case 20: goto L_0x0243;
                case 21: goto L_0x024c;
                case 22: goto L_0x0255;
                case 23: goto L_0x025e;
                case 24: goto L_0x0267;
                case 25: goto L_0x0270;
                case 26: goto L_0x0279;
                case 27: goto L_0x0282;
                case 28: goto L_0x028b;
                case 29: goto L_0x02c7;
                case 30: goto L_0x02d0;
                case 31: goto L_0x033f;
                case 32: goto L_0x03b2;
                case 33: goto L_0x03d8;
                case 34: goto L_0x0411;
                case 35: goto L_0x044e;
                case 36: goto L_0x0457;
                case 37: goto L_0x046e;
                case 38: goto L_0x0484;
                case 39: goto L_0x0a21;
                case 40: goto L_0x0aa3;
                case 41: goto L_0x0b03;
                case 42: goto L_0x0b13;
                case 43: goto L_0x0b49;
                case 44: goto L_0x0b52;
                case 45: goto L_0x0b6c;
                case 46: goto L_0x0b96;
                case 47: goto L_0x0b9f;
                case 48: goto L_0x0ba8;
                case 49: goto L_0x0c3a;
                case 50: goto L_0x0c4a;
                case 51: goto L_0x0c8c;
                case 52: goto L_0x0c95;
                case 53: goto L_0x0cbc;
                case 54: goto L_0x0ce5;
                case 55: goto L_0x0d08;
                case 56: goto L_0x0d11;
                case 57: goto L_0x0d2f;
                case 58: goto L_0x0d3f;
                case 59: goto L_0x0d5d;
                case 60: goto L_0x0dc0;
                case 61: goto L_0x0e06;
                case 62: goto L_0x0e50;
                case 63: goto L_0x0e70;
                case 64: goto L_0x0eaa;
                case 65: goto L_0x0eb4;
                case 66: goto L_0x0ec8;
                case 67: goto L_0x0f33;
                case 68: goto L_0x0f49;
                case 69: goto L_0x0f70;
                case 70: goto L_0x0f92;
                case 71: goto L_0x0fae;
                case 72: goto L_0x0fd0;
                case 73: goto L_0x0fe6;
                case 74: goto L_0x0ff4;
                case 75: goto L_0x1080;
                case 76: goto L_0x108f;
                case 77: goto L_0x10a1;
                case 78: goto L_0x10b0;
                case 79: goto L_0x10f5;
                case 80: goto L_0x1127;
                case 81: goto L_0x1145;
                case 82: goto L_0x115b;
                case 83: goto L_0x11a4;
                case 84: goto L_0x1203;
                case 85: goto L_0x125e;
                case 86: goto L_0x1278;
                case 87: goto L_0x1294;
                case 88: goto L_0x1369;
                case 89: goto L_0x13d5;
                case 90: goto L_0x13ef;
                case 91: goto L_0x1401;
                case 92: goto L_0x140d;
                case 93: goto L_0x1427;
                case 94: goto L_0x143d;
                case 95: goto L_0x144b;
                case 96: goto L_0x146d;
                case 97: goto L_0x1487;
                case 98: goto L_0x14ca;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r15 = X.C41848B3p.A1D(r0)
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.Class<com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent> r1 = com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent.class
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r1)
            com.instagram.direct.inbox.notes.models.NoteAudience r13 = (com.instagram.direct.inbox.notes.models.NoteAudience) r13
            java.lang.String r20 = r0.readString()
            boolean r22 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r12 = (com.instagram.contentnotes.data.metadata.ContentNoteMetadata) r12
            boolean r23 = X.C41848B3p.A1X(r0)
            boolean r24 = X.C41848B3p.A1X(r0)
            java.lang.Long r14 = X.C13992Tns.A0D(r0)
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates r11 = (com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates) r11
            boolean r25 = X.C41848B3p.A1X(r0)
            boolean r26 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.NoteCustomTheme r10 = (com.instagram.api.schemas.NoteCustomTheme) r10
            boolean r27 = X.C41848B3p.A1X(r0)
            int r3 = r0.readInt()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r2 = 0
        L_0x0061:
            if (r2 == r3) goto L_0x0069
            X.C41848B3p.A1J(r0, r1, r4)
            int r2 = r2 + 1
            goto L_0x0061
        L_0x0069:
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r9 = new com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent
            r21 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r9
        L_0x0071:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
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
            java.lang.String r13 = r0.readString()
            com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config r9 = new com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r9
        L_0x00b3:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r9 = new com.instagram.business.controller.datamodel.BusinessConversionFlowStatus
            r9.<init>((android.os.Parcel) r0)
            return r9
        L_0x00bd:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.controller.datamodel.BusinessConversionStep r9 = new com.instagram.business.controller.datamodel.BusinessConversionStep
            r9.<init>(r0)
            return r9
        L_0x00c7:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            if (r1 == 0) goto L_0x00db
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00db
            com.instagram.business.controller.datamodel.ConversionStep r9 = com.instagram.business.controller.datamodel.ConversionStep.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x00d8 }
            return r9
        L_0x00d8:
            com.instagram.business.controller.datamodel.ConversionStep r9 = com.instagram.business.controller.datamodel.ConversionStep.UNKNOWN
            return r9
        L_0x00db:
            com.instagram.business.controller.datamodel.ConversionStep r9 = com.instagram.business.controller.datamodel.ConversionStep.UNKNOWN
            return r9
        L_0x00de:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r9 = new com.instagram.business.controller.datamodel.PageSelectionOverrideData
            r9.<init>()
            int r1 = r0.readInt()
            r9.A01 = r1
            int r1 = r0.readInt()
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.String r1 = r0.readString()
            r9.A06 = r1
            java.lang.String r1 = r0.readString()
            if (r1 != 0) goto L_0x010d
            java.lang.String r1 = ""
        L_0x010d:
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A08 = r1
            java.lang.String r1 = r0.readString()
            r9.A07 = r1
            java.lang.String r0 = r0.readString()
            r9.A05 = r0
            return r9
        L_0x0122:
            int r1 = X.C41848B3p.A00(r0)
            java.lang.String r0 = r0.readString()
            com.instagram.business.insights.model.DataPoint r9 = new com.instagram.business.insights.model.DataPoint
            r9.<init>(r1, r0)
            return r9
        L_0x0130:
            java.lang.String r5 = X.C41848B3p.A1D(r0)
            int r4 = r0.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x013e:
            if (r2 == r4) goto L_0x0147
            android.os.Parcelable$Creator r1 = com.instagram.business.insights.model.DataPoint.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x013e
        L_0x0147:
            com.instagram.business.insights.model.DaysHourlyFollowersData r9 = new com.instagram.business.insights.model.DaysHourlyFollowersData
            r9.<init>(r5, r3)
            return r9
        L_0x014d:
            java.lang.String r6 = X.C41848B3p.A1D(r0)
            int r5 = r0.readInt()
            int r4 = r0.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = 0
        L_0x015f:
            if (r2 == r4) goto L_0x0168
            android.os.Parcelable$Creator r1 = com.instagram.business.insights.model.GrowthDataPoint.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x015f
        L_0x0168:
            com.instagram.business.insights.model.FollowersGrowthData r9 = new com.instagram.business.insights.model.FollowersGrowthData
            r9.<init>(r3, r5, r6)
            return r9
        L_0x016e:
            int r1 = X.C41848B3p.A00(r0)
            int r0 = r0.readInt()
            com.instagram.business.insights.model.GrowthDataPoint r9 = new com.instagram.business.insights.model.GrowthDataPoint
            r9.<init>(r1, r0)
            return r9
        L_0x017c:
            r9 = 0
            java.lang.String r2 = ""
            java.lang.Long r1 = X.C51971G9r.A0m()     // Catch:{ JSONException -> 0x0189 }
            com.instagram.business.instantexperiences.IGInstantExperiencesParameters r0 = new com.instagram.business.instantexperiences.IGInstantExperiencesParameters     // Catch:{ JSONException -> 0x0189 }
            r0.<init>(r2, r1)     // Catch:{ JSONException -> 0x0189 }
            return r0
        L_0x0189:
            r2 = move-exception
            java.lang.String r1 = "IGInstantExperiencesParameters"
            java.lang.String r0 = "Failed to create class IGInstantExperiencesParameters"
            X.0KC.A0F(r1, r0, r2)
            return r9
        L_0x0192:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.business.model.BoostGuidanceItemResponse r9 = new com.instagram.business.model.BoostGuidanceItemResponse
            r9.<init>(r2, r1, r0)
            return r9
        L_0x01a4:
            com.instagram.business.model.PagePhotoItem r9 = new com.instagram.business.model.PagePhotoItem
            r9.<init>(r0)
            return r9
        L_0x01aa:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode r9 = com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode.valueOf(r0)
            return r9
        L_0x01b3:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r9 = com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.valueOf(r0)
            return r9
        L_0x01bc:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.AudienceGender r9 = com.instagram.business.promote.model.AudienceGender.valueOf(r0)
            return r9
        L_0x01c5:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.AudienceGeoLocation r9 = new com.instagram.business.promote.model.AudienceGeoLocation
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A06 = r1
            java.lang.String r1 = r0.readString()
            r9.A05 = r1
            java.lang.Class<com.instagram.api.schemas.AdGeoLocationType> r1 = com.instagram.api.schemas.AdGeoLocationType.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.AdGeoLocationType r1 = (com.instagram.api.schemas.AdGeoLocationType) r1
            r9.A03 = r1
            double r1 = r0.readDouble()
            r9.A00 = r1
            double r1 = r0.readDouble()
            r9.A01 = r1
            int r1 = r0.readInt()
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r9.A08 = r1
            java.lang.String r0 = r0.readString()
            r9.A07 = r0
            return r9
        L_0x0209:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.AudienceInterest r9 = new com.instagram.business.promote.model.AudienceInterest
            r9.<init>()
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x022b
            r9.A00 = r2
            java.lang.String r0 = r0.readString()
            if (r0 == 0) goto L_0x0225
            r9.A01 = r0
            return r9
        L_0x0225:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x022b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0231:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.AudiencePotentialReachRating r9 = com.instagram.business.promote.model.AudiencePotentialReachRating.valueOf(r0)
            return r9
        L_0x023a:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.BillingWizardName r9 = com.instagram.business.promote.model.BillingWizardName.valueOf(r0)
            return r9
        L_0x0243:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.DistanceUnit r9 = com.instagram.business.promote.model.DistanceUnit.valueOf(r0)
            return r9
        L_0x024c:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.ErrorHandlingResponseType r9 = com.instagram.business.promote.model.ErrorHandlingResponseType.valueOf(r0)
            return r9
        L_0x0255:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.HpiSessionStatus r9 = com.instagram.business.promote.model.HpiSessionStatus.valueOf(r0)
            return r9
        L_0x025e:
            X.Pxi.A11(r0)
            com.instagram.business.promote.model.IGBoostPackage r9 = new com.instagram.business.promote.model.IGBoostPackage
            r9.<init>()
            return r9
        L_0x0267:
            X.Pxi.A11(r0)
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r9 = new com.instagram.business.promote.model.IGBoostPackagesFlowInfo
            r9.<init>()
            return r9
        L_0x0270:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.InstagramMediaProductType r9 = com.instagram.business.promote.model.InstagramMediaProductType.valueOf(r0)
            return r9
        L_0x0279:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.InstagramPromoteSuggestionReason r9 = com.instagram.business.promote.model.InstagramPromoteSuggestionReason.valueOf(r0)
            return r9
        L_0x0282:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.LinkingAuthState r9 = com.instagram.business.promote.model.LinkingAuthState.valueOf(r0)
            return r9
        L_0x028b:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PendingLocation r9 = new com.instagram.business.promote.model.PendingLocation
            r9.<init>()
            java.util.List r1 = r9.A05
            java.lang.Class<com.instagram.business.promote.model.AudienceGeoLocation> r2 = com.instagram.business.promote.model.AudienceGeoLocation.class
            X.Pxe.A1O(r0, r2, r1)
            int r1 = r0.readInt()
            r9.A00 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.AudienceGeoLocation r1 = (com.instagram.business.promote.model.AudienceGeoLocation) r1
            r9.A01 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.AudienceGeoLocation r1 = (com.instagram.business.promote.model.AudienceGeoLocation) r1
            r9.A02 = r1
            java.util.List r1 = r9.A04
            X.Pxe.A1O(r0, r2, r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Object r1 = X.Pxi.A0U(r0, r1)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x02c5
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x02c2:
            r9.A03 = r1
            return r9
        L_0x02c5:
            r1 = 0
            goto L_0x02c2
        L_0x02c7:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.PromoteAdsManagerActionType r9 = com.instagram.business.promote.model.PromoteAdsManagerActionType.valueOf(r0)
            return r9
        L_0x02d0:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r3 = 1
            com.instagram.business.promote.model.PromoteAudience r9 = new com.instagram.business.promote.model.PromoteAudience
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A05 = r1
            java.lang.String r1 = r0.readString()
            r9.A07 = r1
            java.lang.String r1 = r0.readString()
            r9.A06 = r1
            java.lang.Class<com.instagram.api.schemas.BoostedPostAudienceOption> r1 = com.instagram.api.schemas.BoostedPostAudienceOption.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.BoostedPostAudienceOption r1 = (com.instagram.api.schemas.BoostedPostAudienceOption) r1
            r9.A03 = r1
            int r1 = r0.readInt()
            r9.A01 = r1
            int r1 = r0.readInt()
            r9.A00 = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.A08 = r2
            android.os.Parcelable$Creator r1 = com.instagram.api.schemas.AdsTargetingGender.CREATOR
            r0.readTypedList(r2, r1)
            java.util.ArrayList r1 = r0.createStringArrayList()
            r9.A09 = r1
            java.util.ArrayList r1 = r0.createStringArrayList()
            r9.A0A = r1
            java.lang.Class<com.instagram.api.schemas.TargetingRelaxationConstants> r1 = com.instagram.api.schemas.TargetingRelaxationConstants.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.TargetingRelaxationConstants r1 = (com.instagram.api.schemas.TargetingRelaxationConstants) r1
            r9.A04 = r1
            int r1 = r0.readInt()
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r3)
            r9.A0C = r1
            boolean r1 = X.Pxg.A1V(r0)
            r9.A0D = r1
            java.lang.Class<com.instagram.api.schemas.AdvantageAudienceData> r1 = com.instagram.api.schemas.AdvantageAudienceData.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.AdvantageAudienceData r0 = (com.instagram.api.schemas.AdvantageAudienceData) r0
            r9.A02 = r0
            return r9
        L_0x033f:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteAudienceInfo r9 = new com.instagram.business.promote.model.PromoteAudienceInfo
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r9.A05 = r1
            int r1 = r0.readInt()
            r9.A01 = r1
            int r1 = r0.readInt()
            r9.A00 = r1
            byte r1 = r0.readByte()
            r3 = 0
            if (r1 != 0) goto L_0x03a5
            r9.A06 = r3
        L_0x0369:
            byte r1 = r0.readByte()
            if (r1 != 0) goto L_0x0398
            r9.A07 = r3
        L_0x0371:
            byte r1 = r0.readByte()
            if (r1 == 0) goto L_0x0381
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Class<com.instagram.business.promote.model.AudienceInterest> r1 = com.instagram.business.promote.model.AudienceInterest.class
            X.Pxe.A1O(r0, r1, r3)
        L_0x0381:
            r9.A08 = r3
            java.lang.Class<com.instagram.api.schemas.TargetingRelaxationConstants> r1 = com.instagram.api.schemas.TargetingRelaxationConstants.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.TargetingRelaxationConstants r1 = (com.instagram.api.schemas.TargetingRelaxationConstants) r1
            r9.A03 = r1
            java.lang.Class<com.instagram.api.schemas.AdvantageAudienceData> r1 = com.instagram.api.schemas.AdvantageAudienceData.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.AdvantageAudienceData r0 = (com.instagram.api.schemas.AdvantageAudienceData) r0
            r9.A02 = r0
            return r9
        L_0x0398:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Class<com.instagram.business.promote.model.AudienceGeoLocation> r1 = com.instagram.business.promote.model.AudienceGeoLocation.class
            X.Pxe.A1O(r0, r1, r2)
            r9.A07 = r2
            goto L_0x0371
        L_0x03a5:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Class<com.instagram.business.promote.model.AudienceGender> r1 = com.instagram.business.promote.model.AudienceGender.class
            X.Pxe.A1O(r0, r1, r2)
            r9.A06 = r2
            goto L_0x0369
        L_0x03b2:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteAudiencePotentialReach r9 = new com.instagram.business.promote.model.PromoteAudiencePotentialReach
            r9.<init>()
            int r1 = r0.readInt()
            r9.A00 = r1
            java.lang.Class<com.instagram.business.promote.model.AudiencePotentialReachRating> r1 = com.instagram.business.promote.model.AudiencePotentialReachRating.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.business.promote.model.AudiencePotentialReachRating r1 = (com.instagram.business.promote.model.AudiencePotentialReachRating) r1
            r9.A03 = r1
            int r1 = r0.readInt()
            r9.A01 = r1
            int r0 = r0.readInt()
            r9.A02 = r0
            return r9
        L_0x03d8:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            com.instagram.business.promote.model.PromoteAudiencePotentialReachStore r9 = new com.instagram.business.promote.model.PromoteAudiencePotentialReachStore
            r9.<init>()
            int r6 = r0.readInt()
            r5 = 1
            if (r1 > r6) goto L_0x0c39
        L_0x03e9:
            java.lang.Class<com.instagram.business.promote.model.PromoteAudienceInfo> r1 = com.instagram.business.promote.model.PromoteAudienceInfo.class
            android.os.Parcelable r4 = X.C41847B3o.A03(r0, r1)
            java.lang.String r3 = "Required value was null."
            if (r4 == 0) goto L_0x040b
            java.lang.Class<com.instagram.business.promote.model.PromoteAudiencePotentialReach> r1 = com.instagram.business.promote.model.PromoteAudiencePotentialReach.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            if (r2 == 0) goto L_0x0405
            java.util.Map r1 = r9.A00
            r1.put(r4, r2)
            if (r5 == r6) goto L_0x0c39
            int r5 = r5 + 1
            goto L_0x03e9
        L_0x0405:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x040b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0411:
            r3 = 0
            X.0qQ.A0B(r0, r3)
            com.instagram.business.promote.model.PromoteButtonAction r9 = new com.instagram.business.promote.model.PromoteButtonAction
            r9.<init>()
            java.lang.String r1 = r0.readString()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0448
            r9.A01 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0442
            r9.A02 = r1
            java.lang.Class<com.instagram.business.promote.model.PromoteButtonActionType> r1 = com.instagram.business.promote.model.PromoteButtonActionType.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            if (r0 == 0) goto L_0x043c
            com.instagram.business.promote.model.PromoteButtonActionType r0 = (com.instagram.business.promote.model.PromoteButtonActionType) r0
            X.0qQ.A0B(r0, r3)
            r9.A00 = r0
            return r9
        L_0x043c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0442:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0448:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x044e:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.PromoteButtonActionType r9 = com.instagram.business.promote.model.PromoteButtonActionType.valueOf(r0)
            return r9
        L_0x0457:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel r9 = new com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel
            r9.<init>()
            java.lang.String r0 = r0.readString()
            if (r0 == 0) goto L_0x0469
            r9.A00 = r0
            return r9
        L_0x0469:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x046e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteCreateAudienceResponse r9 = new com.instagram.business.promote.model.PromoteCreateAudienceResponse
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A01 = r1
            boolean r0 = X.C13991Tnr.A1W(r0)
            r9.A02 = r0
            return r9
        L_0x0484:
            com.instagram.business.promote.model.PromoteData r9 = new com.instagram.business.promote.model.PromoteData
            r9.<init>()
            r1 = 0
            X.C13992Tns.A0v(r9)
            X.C13992Tns.A0w(r9)
            r5 = 0
            r9.A1C = r5
            r9.A1D = r5
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r9.A25 = r2
            r9.A2C = r1
            r9.A2y = r1
            r9.A34 = r1
            java.lang.String r2 = r0.readString()
            r9.A1S = r2
            java.util.ArrayList r3 = r0.createStringArrayList()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.A1v = r2
            if (r3 == 0) goto L_0x04b8
            r2.addAll(r3)
        L_0x04b8:
            java.lang.Class<com.instagram.business.promote.model.IGBoostPackagesFlowInfo> r2 = com.instagram.business.promote.model.IGBoostPackagesFlowInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r2 = (com.instagram.business.promote.model.IGBoostPackagesFlowInfo) r2
            r9.A0m = r2
            int r2 = r0.readInt()
            r9.A0H = r2
            java.lang.Class<com.instagram.model.mediatype.ProductType> r2 = com.instagram.model.mediatype.ProductType.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.mediatype.ProductType r2 = (com.instagram.model.mediatype.ProductType) r2
            r9.A17 = r2
            java.lang.Class<com.instagram.business.boost.model.BoostFlowType> r2 = com.instagram.business.boost.model.BoostFlowType.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.boost.model.BoostFlowType r2 = (com.instagram.business.boost.model.BoostFlowType) r2
            r9.A0l = r2
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r4 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r4)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            r9.A11 = r2
            java.util.ArrayList r3 = r0.createStringArrayList()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.A1w = r2
            if (r3 == 0) goto L_0x04f6
            r2.addAll(r3)
        L_0x04f6:
            java.lang.String r2 = r0.readString()
            r9.A1A = r2
            java.lang.String r2 = r0.readString()
            r9.A1B = r2
            java.lang.String r2 = r0.readString()
            r9.A1Q = r2
            java.lang.String r2 = r0.readString()
            r9.A1R = r2
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r4)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            r9.A10 = r2
            java.lang.String r2 = r0.readString()
            r9.A1K = r2
            java.lang.String r2 = r0.readString()
            r9.A1L = r2
            byte r2 = r0.readByte()
            r4 = 1
            boolean r2 = X.AnonymousClass7TF.A1P(r2)
            r9.A2t = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2K = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A28 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A31 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2z = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2S = r2
            java.lang.Class<com.instagram.api.schemas.XIGIGBoostDestination> r3 = com.instagram.api.schemas.XIGIGBoostDestination.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.XIGIGBoostDestination r2 = (com.instagram.api.schemas.XIGIGBoostDestination) r2
            r9.A0i = r2
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.XIGIGBoostDestination r2 = (com.instagram.api.schemas.XIGIGBoostDestination) r2
            r9.A0g = r2
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.XIGIGBoostDestination r2 = (com.instagram.api.schemas.XIGIGBoostDestination) r2
            r9.A0f = r2
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.XIGIGBoostDestination r2 = (com.instagram.api.schemas.XIGIGBoostDestination) r2
            r9.A0h = r2
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.XIGIGBoostDestination r2 = (com.instagram.api.schemas.XIGIGBoostDestination) r2
            r9.A0j = r2
            android.os.Parcelable$Creator r2 = com.instagram.api.schemas.XIGIGBoostDestination.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r2)
            r2.getClass()
            r9.A20 = r2
            java.lang.Class<com.instagram.api.schemas.DestinationRecommendationReason> r2 = com.instagram.api.schemas.DestinationRecommendationReason.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.DestinationRecommendationReason r2 = (com.instagram.api.schemas.DestinationRecommendationReason) r2
            r9.A0S = r2
            java.lang.String r2 = r0.readString()
            r9.A1I = r2
            java.lang.String r2 = r0.readString()
            r9.A1W = r2
            java.lang.Class<com.instagram.api.schemas.XIGIGBoostCallToAction> r3 = com.instagram.api.schemas.XIGIGBoostCallToAction.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.XIGIGBoostCallToAction r2 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r2
            r9.A0b = r2
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.XIGIGBoostCallToAction r2 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r2
            r9.A0c = r2
            android.os.Parcelable$Creator r2 = com.instagram.business.promote.model.PromoteAudience.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r2)
            r9.A1m = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2d = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2e = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2q = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2T = r2
            java.lang.String r2 = r0.readString()
            r9.A1Z = r2
            java.lang.String r2 = r0.readString()
            r9.A1V = r2
            java.lang.String r2 = r0.readString()
            r9.A1X = r2
            java.lang.String r2 = r0.readString()
            r9.A1b = r2
            java.lang.Class<com.instagram.music.common.model.AudioOverlayTrack> r2 = com.instagram.music.common.model.AudioOverlayTrack.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.music.common.model.AudioOverlayTrack r2 = (com.instagram.music.common.model.AudioOverlayTrack) r2
            r9.A18 = r2
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            int r7 = r0.readInt()
            r6 = 0
        L_0x05f4:
            if (r6 >= r7) goto L_0x0606
            java.lang.String r3 = r0.readString()
            java.lang.Class<com.instagram.business.promote.model.PromoteAudience> r2 = com.instagram.business.promote.model.PromoteAudience.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            r8.put(r3, r2)
            int r6 = r6 + 1
            goto L_0x05f4
        L_0x0606:
            r9.A22 = r8
            java.io.Serializable r2 = r0.readSerializable()
            java.util.Currency r2 = (java.util.Currency) r2
            r9.A1j = r2
            int r2 = r0.readInt()
            r9.A06 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2O = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2R = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2Q = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2P = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2G = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2H = r2
            int r2 = r0.readInt()
            r9.A01 = r2
            int r2 = r0.readInt()
            r9.A02 = r2
            int r2 = r0.readInt()
            r9.A00 = r2
            java.util.List r2 = r9.A1n
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            X.Pxe.A1O(r0, r3, r2)
            java.util.List r2 = r9.A1y
            X.Pxe.A1O(r0, r3, r2)
            java.util.List r2 = r9.A1o
            X.Pxe.A1O(r0, r3, r2)
            int r2 = r0.readInt()
            r9.A07 = r2
            int r2 = r0.readInt()
            r9.A0C = r2
            int r2 = r0.readInt()
            r9.A08 = r2
            int r2 = r0.readInt()
            r9.A0I = r2
            int r2 = r0.readInt()
            r9.A0A = r2
            int r2 = r0.readInt()
            r9.A09 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2v = r2
            java.lang.Class<com.instagram.business.promote.model.PromoteIntegrityCheckDataModel> r2 = com.instagram.business.promote.model.PromoteIntegrityCheckDataModel.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.PromoteIntegrityCheckDataModel r2 = (com.instagram.business.promote.model.PromoteIntegrityCheckDataModel) r2
            r9.A0u = r2
            java.lang.String r2 = r0.readString()
            r9.A1F = r2
            int r2 = r0.readInt()
            r9.A04 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2r = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2c = r2
            android.os.Parcelable$Creator r2 = com.instagram.api.schemas.AdsAPIInstagramPosition.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r2)
            r2.getClass()
            r9.A1r = r2
            android.os.Parcelable$Creator r2 = com.instagram.api.schemas.AdsMessageExtensionType.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r2)
            r2.getClass()
            r9.A1x = r2
            android.os.Parcelable$Creator r2 = com.instagram.api.schemas.XIGIGBoostDestination.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r2)
            r2.getClass()
            r9.A1p = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2n = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A33 = r2
            java.lang.String r2 = r0.readString()
            r9.A1U = r2
            byte r2 = r0.readByte()
            if (r2 != 0) goto L_0x08ad
            r3 = 0
        L_0x06e3:
            r9.A0M = r3
            java.lang.Class<com.instagram.api.schemas.PaymentInfo> r2 = com.instagram.api.schemas.PaymentInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.PaymentInfo r2 = (com.instagram.api.schemas.PaymentInfo) r2
            r9.A0X = r2
            java.lang.Class<com.instagram.api.schemas.NonDiscInfo> r2 = com.instagram.api.schemas.NonDiscInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.NonDiscInfo r2 = (com.instagram.api.schemas.NonDiscInfo) r2
            r9.A0W = r2
            java.lang.String r2 = r0.readString()
            r9.A1H = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2D = r2
            java.lang.Class<com.instagram.business.promote.model.PromoteEnrollCouponInfo> r2 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r2 = (com.instagram.business.promote.model.PromoteEnrollCouponInfo) r2
            r9.A0t = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A32 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2w = r2
            java.lang.Class<com.instagram.business.promote.model.PromoteReachEstimationStore> r2 = com.instagram.business.promote.model.PromoteReachEstimationStore.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.PromoteReachEstimationStore r2 = (com.instagram.business.promote.model.PromoteReachEstimationStore) r2
            r9.A0w = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2o = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2X = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2u = r2
            android.os.Parcelable$Creator r3 = com.instagram.api.schemas.InstagramProfileCallToActionDestinations.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r3)
            if (r2 != 0) goto L_0x0744
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0744:
            r9.A1q = r2
            java.util.ArrayList r3 = r0.createTypedArrayList(r3)
            java.util.HashSet r2 = new java.util.HashSet
            if (r3 == 0) goto L_0x08a8
            r2.<init>(r3)
        L_0x0751:
            r9.A24 = r2
            java.lang.Class<com.instagram.business.promote.model.PromoteWhatsAppAccountType> r2 = com.instagram.business.promote.model.PromoteWhatsAppAccountType.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.PromoteWhatsAppAccountType r2 = (com.instagram.business.promote.model.PromoteWhatsAppAccountType) r2
            r9.A0x = r2
            java.lang.Class<com.instagram.business.boost.model.AdCreativeAuthorizationCategory> r2 = com.instagram.business.boost.model.AdCreativeAuthorizationCategory.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r2 = (com.instagram.business.boost.model.AdCreativeAuthorizationCategory) r2
            r9.A0k = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2s = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2j = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2k = r2
            java.lang.Class<com.instagram.api.schemas.Estimate> r3 = com.instagram.api.schemas.Estimate.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.Estimate r2 = (com.instagram.api.schemas.Estimate) r2
            r9.A0U = r2
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.api.schemas.Estimate r2 = (com.instagram.api.schemas.Estimate) r2
            r9.A0T = r2
            java.lang.Class<com.instagram.business.promote.model.PromoteAudienceInfo> r3 = com.instagram.business.promote.model.PromoteAudienceInfo.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.business.promote.model.PromoteAudienceInfo r2 = (com.instagram.business.promote.model.PromoteAudienceInfo) r2
            r9.A0q = r2
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r3)
            com.instagram.business.promote.model.PromoteAudienceInfo r2 = (com.instagram.business.promote.model.PromoteAudienceInfo) r2
            r9.A0p = r2
            java.lang.String r2 = r0.readString()
            r9.A1J = r2
            byte r2 = r0.readByte()
            if (r2 == 0) goto L_0x07b1
            boolean r2 = X.AnonymousClass7TF.A1S(r2, r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
        L_0x07b1:
            r9.A19 = r5
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2Z = r2
            java.lang.Class<com.instagram.api.schemas.DEPProgramLevelContentResponse> r2 = com.instagram.api.schemas.DEPProgramLevelContentResponse.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.DEPProgramLevelContentResponse r2 = (com.instagram.api.schemas.DEPProgramLevelContentResponse) r2
            r9.A0R = r2
            java.util.ArrayList r2 = com.instagram.business.promote.model.PromoteData.A00(r0)
            r9.A1l = r2
            java.lang.String r2 = r0.readString()
            r9.A1c = r2
            java.lang.Class<com.instagram.business.promote.model.PromoteLaunchOrigin> r2 = com.instagram.business.promote.model.PromoteLaunchOrigin.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.PromoteLaunchOrigin r2 = (com.instagram.business.promote.model.PromoteLaunchOrigin) r2
            r9.A0v = r2
            byte r2 = r0.readByte()
            if (r2 != 0) goto L_0x083a
            r2 = 0
        L_0x07e0:
            r9.A0Y = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2x = r2
            java.lang.String r2 = r0.readString()
            r9.A1T = r2
            int r2 = r0.readInt()
            r9.A0F = r2
            int r2 = r0.readInt()
            r9.A0D = r2
            int r2 = r0.readInt()
            r9.A0G = r2
            int r2 = r0.readInt()
            r9.A0E = r2
            java.lang.Class<com.instagram.business.promote.model.PendingLocation> r2 = com.instagram.business.promote.model.PendingLocation.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.PendingLocation r2 = (com.instagram.business.promote.model.PendingLocation) r2
            r9.A0o = r2
            java.lang.Class<com.instagram.business.promote.model.PromoteAudiencePotentialReachStore> r2 = com.instagram.business.promote.model.PromoteAudiencePotentialReachStore.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.PromoteAudiencePotentialReachStore r2 = (com.instagram.business.promote.model.PromoteAudiencePotentialReachStore) r2
            r9.A0r = r2
            byte r2 = r0.readByte()
            if (r2 == 0) goto L_0x08b8
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r5 = r0.readInt()
            r4 = 0
        L_0x082a:
            if (r4 >= r5) goto L_0x08b9
            java.lang.Integer r3 = X.C41847B3o.A12(r0)
            int r2 = r0.readInt()
            X.C66581MXm.A1S(r3, r6, r2)
            int r4 = r4 + 1
            goto L_0x082a
        L_0x083a:
            byte r2 = r0.readByte()
            if (r2 != 0) goto L_0x0889
            r7 = 0
        L_0x0841:
            java.lang.String r5 = r0.readString()
            byte r2 = r0.readByte()
            if (r2 != 0) goto L_0x085f
            r10 = 0
        L_0x084c:
            java.lang.Class<com.instagram.api.schemas.ErrorIdentifier> r2 = com.instagram.api.schemas.ErrorIdentifier.class
            android.os.Parcelable r4 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.ErrorIdentifier r4 = (com.instagram.api.schemas.ErrorIdentifier) r4
            java.lang.String r6 = r0.readString()
            X.UKM r2 = new X.UKM
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x07e0
        L_0x085f:
            java.lang.String r13 = r0.readString()
            java.util.ArrayList r17 = com.instagram.business.promote.model.PromoteData.A00(r0)
            java.lang.String r14 = r0.readString()
            java.lang.Class<com.instagram.api.schemas.ErrorLevel> r2 = com.instagram.api.schemas.ErrorLevel.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.ErrorLevel r12 = (com.instagram.api.schemas.ErrorLevel) r12
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.Class<com.instagram.api.schemas.ErrorHandlingResponseType> r2 = com.instagram.api.schemas.ErrorHandlingResponseType.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.ErrorHandlingResponseType r11 = (com.instagram.api.schemas.ErrorHandlingResponseType) r11
            X.UKW r10 = new X.UKW
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x084c
        L_0x0889:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r6 = r0.readInt()
            r5 = 0
        L_0x0893:
            if (r5 >= r6) goto L_0x0841
            java.lang.String r4 = r0.readString()
            java.lang.String r3 = r0.readString()
            X.UMu r2 = new X.UMu
            r2.<init>(r4, r3)
            r7.add(r2)
            int r5 = r5 + 1
            goto L_0x0893
        L_0x08a8:
            r2.<init>()
            goto L_0x0751
        L_0x08ad:
            float r2 = r0.readFloat()
            X.Gmb r3 = new X.Gmb
            r3.<init>(r2, r1)
            goto L_0x06e3
        L_0x08b8:
            r6 = 0
        L_0x08b9:
            r9.A23 = r6
            int r2 = r0.readInt()
            r9.A05 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2W = r2
            java.lang.String r2 = r0.readString()
            r9.A1P = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2f = r2
            java.lang.Class<com.instagram.api.schemas.BillingWizardName> r2 = com.instagram.api.schemas.BillingWizardName.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.BillingWizardName r2 = (com.instagram.api.schemas.BillingWizardName) r2
            r9.A0Q = r2
            java.lang.String r2 = r0.readString()
            r9.A1E = r2
            java.lang.String r2 = r0.readString()
            r9.A1Y = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2g = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2Y = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2i = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2h = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2m = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2l = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2J = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A30 = r2
            byte r2 = r0.readByte()
            if (r2 == 0) goto L_0x092c
            java.lang.String r2 = r0.readString()
            r2.getClass()
            X.Uyr r2 = X.C16655Uyr.valueOf(r2)
            r9.A13 = r2
        L_0x092c:
            byte r2 = r0.readByte()
            if (r2 == 0) goto L_0x093f
            java.lang.String r2 = r0.readString()
            r2.getClass()
            X.Uz0 r2 = X.C16664Uz0.valueOf(r2)
            r9.A15 = r2
        L_0x093f:
            byte r2 = r0.readByte()
            if (r2 == 0) goto L_0x0952
            java.lang.String r2 = r0.readString()
            r2.getClass()
            X.Uz0 r2 = X.C16664Uz0.valueOf(r2)
            r9.A14 = r2
        L_0x0952:
            java.lang.Class<com.instagram.business.promote.model.LinkingAuthState> r2 = com.instagram.business.promote.model.LinkingAuthState.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.LinkingAuthState r2 = (com.instagram.business.promote.model.LinkingAuthState) r2
            r9.A0n = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2a = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2I = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2L = r2
            java.lang.Class<com.instagram.business.promote.model.PromoteDataSnapshot> r2 = com.instagram.business.promote.model.PromoteDataSnapshot.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.PromoteDataSnapshot r2 = (com.instagram.business.promote.model.PromoteDataSnapshot) r2
            r9.A0s = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2V = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2p = r2
            java.lang.String r2 = r0.readString()
            r9.A1C = r2
            java.lang.String r2 = r0.readString()
            r9.A1D = r2
            java.lang.Class<com.instagram.api.schemas.XFBCTXWelcomeMessageStatus> r2 = com.instagram.api.schemas.XFBCTXWelcomeMessageStatus.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r2 = (com.instagram.api.schemas.XFBCTXWelcomeMessageStatus) r2
            r9.A0a = r2
            java.util.List r3 = r9.A21
            java.lang.Class<com.instagram.business.promote.model.SpecialRequirementCategory> r2 = com.instagram.business.promote.model.SpecialRequirementCategory.class
            X.Pxe.A1O(r0, r2, r3)
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2U = r2
            android.os.Parcelable$Creator r2 = com.instagram.api.schemas.XIGIGBoostDestination.CREATOR
            java.util.ArrayList r3 = r0.createTypedArrayList(r2)
            r3.getClass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r3)
            r9.A26 = r2
            java.lang.String r2 = r0.readString()
            r9.A1a = r2
            java.lang.String r2 = r0.readString()
            r9.A1G = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A29 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2b = r2
            android.os.Parcelable$Creator r2 = com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory.CREATOR
            java.util.ArrayList r3 = r0.createTypedArrayList(r2)
            r3.getClass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r3)
            r9.A25 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2C = r2
            java.lang.String r2 = r0.readString()
            r9.A1d = r2
            java.lang.String r2 = r0.readString()
            r9.A1g = r2
            java.lang.String r2 = r0.readString()
            r9.A1e = r2
            java.lang.String r2 = r0.readString()
            r9.A1h = r2
            java.lang.String r2 = r0.readString()
            r9.A1f = r2
            java.lang.String r2 = r0.readString()
            r9.A1i = r2
            java.io.Serializable r2 = r0.readSerializable()
            X.UyC r2 = (X.C16616UyC) r2
            r9.A12 = r2
            boolean r2 = X.C13991Tnr.A1W(r0)
            r9.A2y = r2
            byte r0 = r0.readByte()
            if (r0 == 0) goto L_0x0a1e
            r1 = 1
        L_0x0a1e:
            r9.A34 = r1
            return r9
        L_0x0a21:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteDataSnapshot r9 = new com.instagram.business.promote.model.PromoteDataSnapshot
            r9.<init>()
            java.lang.Class<com.instagram.api.schemas.XIGIGBoostDestination> r1 = com.instagram.api.schemas.XIGIGBoostDestination.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.XIGIGBoostDestination r1 = (com.instagram.api.schemas.XIGIGBoostDestination) r1
            r9.A07 = r1
            java.lang.String r1 = r0.readString()
            r9.A0A = r1
            java.lang.Class<com.instagram.api.schemas.XFBCTXWelcomeMessageStatus> r1 = com.instagram.api.schemas.XFBCTXWelcomeMessageStatus.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r1 = (com.instagram.api.schemas.XFBCTXWelcomeMessageStatus) r1
            r9.A04 = r1
            java.lang.Class<com.instagram.api.schemas.XIGIGBoostCallToAction> r2 = com.instagram.api.schemas.XIGIGBoostCallToAction.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r1
            r9.A05 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r1
            r9.A06 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r9.A0C = r1
            java.lang.String r1 = r0.readString()
            r9.A0B = r1
            int r1 = r0.readInt()
            r9.A01 = r1
            int r1 = r0.readInt()
            r9.A00 = r1
            java.lang.Class<com.instagram.api.schemas.Estimate> r2 = com.instagram.api.schemas.Estimate.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.Estimate r1 = (com.instagram.api.schemas.Estimate) r1
            r9.A03 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.Estimate r1 = (com.instagram.api.schemas.Estimate) r1
            r9.A02 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.business.promote.model.PromoteReachEstimationStore r1 = (com.instagram.business.promote.model.PromoteReachEstimationStore) r1
            if (r1 == 0) goto L_0x0c39
            r9.A09 = r1
            java.util.List r2 = r9.A0D
            r2.clear()
            java.lang.Class<com.instagram.business.promote.model.SpecialRequirementCategory> r1 = com.instagram.business.promote.model.SpecialRequirementCategory.class
            X.Pxe.A1O(r0, r1, r2)
            java.lang.Class<com.instagram.business.boost.model.AdCreativeAuthorizationCategory> r1 = com.instagram.business.boost.model.AdCreativeAuthorizationCategory.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r0 = (com.instagram.business.boost.model.AdCreativeAuthorizationCategory) r0
            if (r0 != 0) goto L_0x0aa0
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r0 = com.instagram.business.boost.model.AdCreativeAuthorizationCategory.A04
        L_0x0aa0:
            r9.A08 = r0
            return r9
        L_0x0aa3:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r9 = new com.instagram.business.promote.model.PromoteEnrollCouponInfo
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A06 = r1
            java.lang.Class<com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus> r1 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            if (r1 == 0) goto L_0x0afe
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = (com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus) r1
            X.0qQ.A0B(r1, r2)
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A0A = r1
            java.lang.String r1 = r0.readString()
            r9.A09 = r1
            java.lang.String r1 = r0.readString()
            r9.A0B = r1
            java.lang.String r1 = r0.readString()
            r9.A08 = r1
            java.lang.Class<com.instagram.model.coupon.PromoteCouponCurrencyAmount> r2 = com.instagram.model.coupon.PromoteCouponCurrencyAmount.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r1 = (com.instagram.model.coupon.PromoteCouponCurrencyAmount) r1
            r9.A04 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r1 = (com.instagram.model.coupon.PromoteCouponCurrencyAmount) r1
            r9.A03 = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r1 = (com.instagram.model.coupon.PromoteCouponCurrencyAmount) r1
            r9.A02 = r1
            java.lang.Class<com.instagram.model.coupon.PromoteAdsCouponUseCase> r1 = com.instagram.model.coupon.PromoteAdsCouponUseCase.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.coupon.PromoteAdsCouponUseCase r0 = (com.instagram.model.coupon.PromoteAdsCouponUseCase) r0
            r9.A01 = r0
            return r9
        L_0x0afe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b03:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            if (r0 == 0) goto L_0x0b0e
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r9 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.valueOf(r0)
            return r9
        L_0x0b0e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b13:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteErrorHandlingResponse r9 = new com.instagram.business.promote.model.PromoteErrorHandlingResponse
            r9.<init>()
            java.lang.Class<com.instagram.business.promote.model.ErrorHandlingResponseType> r1 = com.instagram.business.promote.model.ErrorHandlingResponseType.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.business.promote.model.ErrorHandlingResponseType r1 = (com.instagram.business.promote.model.ErrorHandlingResponseType) r1
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.Class<com.instagram.business.promote.model.PromoteErrorLevel> r1 = com.instagram.business.promote.model.PromoteErrorLevel.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.business.promote.model.PromoteErrorLevel r1 = (com.instagram.business.promote.model.PromoteErrorLevel) r1
            r9.A01 = r1
            java.lang.String r1 = r0.readString()
            r9.A02 = r1
            java.lang.String r0 = r0.readString()
            r9.A05 = r0
            return r9
        L_0x0b49:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.PromoteErrorLevel r9 = com.instagram.business.promote.model.PromoteErrorLevel.valueOf(r0)
            return r9
        L_0x0b52:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteIntegrityCheckDataModel r9 = new com.instagram.business.promote.model.PromoteIntegrityCheckDataModel
            r9.<init>()
            java.lang.Class<com.instagram.business.promote.model.PromoteIntegrityCheckMessage> r1 = com.instagram.business.promote.model.PromoteIntegrityCheckMessage.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.business.promote.model.PromoteIntegrityCheckMessage r1 = (com.instagram.business.promote.model.PromoteIntegrityCheckMessage) r1
            r9.A00 = r1
            boolean r0 = X.C13991Tnr.A1W(r0)
            r9.A01 = r0
            return r9
        L_0x0b6c:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteIntegrityCheckMessage r9 = new com.instagram.business.promote.model.PromoteIntegrityCheckMessage
            r9.<init>()
            java.lang.Class<com.instagram.common.textwithentities.model.TextWithEntities> r1 = com.instagram.common.textwithentities.model.TextWithEntities.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.textwithentities.model.TextWithEntities r1 = (com.instagram.common.textwithentities.model.TextWithEntities) r1
            r9.A01 = r1
            java.lang.Class<com.instagram.business.promote.model.PromoteIntegrityCheckMessage$Type> r1 = com.instagram.business.promote.model.PromoteIntegrityCheckMessage.Type.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.business.promote.model.PromoteIntegrityCheckMessage$Type r1 = (com.instagram.business.promote.model.PromoteIntegrityCheckMessage.Type) r1
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A02 = r1
            java.lang.String r0 = r0.readString()
            r9.A03 = r0
            return r9
        L_0x0b96:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.PromoteIntegrityCheckMessage$Type r9 = com.instagram.business.promote.model.PromoteIntegrityCheckMessage.Type.valueOf(r0)
            return r9
        L_0x0b9f:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.PromoteLaunchOrigin r9 = com.instagram.business.promote.model.PromoteLaunchOrigin.valueOf(r0)
            return r9
        L_0x0ba8:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteReachEstimationStore r9 = new com.instagram.business.promote.model.PromoteReachEstimationStore
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A03 = r1
            java.lang.String r1 = r0.readString()
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A01 = r1
            byte r1 = r0.readByte()
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r9.A06 = r1
            byte r1 = r0.readByte()
            if (r1 != 0) goto L_0x0bdb
            r2 = 0
        L_0x0bdb:
            r9.A07 = r2
            java.util.Map r6 = r9.A05
            java.lang.String r7 = "null cannot be cast to non-null type java.util.HashMap<kotlin.Int, com.instagram.api.schemas.Estimate>"
            X.0qQ.A0C(r6, r7)
            java.util.AbstractMap r6 = (java.util.AbstractMap) r6
            int r5 = r0.readInt()
            r4 = 1
            if (r4 > r5) goto L_0x0c08
        L_0x0bed:
            int r2 = r0.readInt()
            java.lang.Class<com.instagram.api.schemas.Estimate> r1 = com.instagram.api.schemas.Estimate.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.api.schemas.Estimate"
            X.0qQ.A0C(r3, r1)
            r6.put(r2, r3)
            if (r4 == r5) goto L_0x0c08
            int r4 = r4 + 1
            goto L_0x0bed
        L_0x0c08:
            java.util.Map r6 = r9.A04
            X.0qQ.A0C(r6, r7)
            java.util.AbstractMap r6 = (java.util.AbstractMap) r6
            int r5 = r0.readInt()
            r4 = 1
            if (r4 > r5) goto L_0x0c39
        L_0x0c16:
            int r2 = r0.readInt()
            java.lang.Class<com.instagram.api.schemas.Estimate> r1 = com.instagram.api.schemas.Estimate.class
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.api.schemas.Estimate"
            X.0qQ.A0C(r3, r1)
            r6.put(r2, r3)
            if (r4 == r5) goto L_0x0c39
            int r4 = r4 + 1
            goto L_0x0c16
        L_0x0c31:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.boost.model.BoostFlowType r9 = com.instagram.business.boost.model.BoostFlowType.valueOf(r0)
        L_0x0c39:
            return r9
        L_0x0c3a:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteSaveAudienceEditResponse r9 = new com.instagram.business.promote.model.PromoteSaveAudienceEditResponse
            r9.<init>()
            boolean r0 = X.C13991Tnr.A1W(r0)
            r9.A00 = r0
            return r9
        L_0x0c4a:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.PromoteState r9 = new com.instagram.business.promote.model.PromoteState
            r9.<init>()
            byte r1 = r0.readByte()
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r9.A05 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r9.A02 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r9.A06 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r9.A03 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r9.A07 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r9.A00 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r9.A08 = r1
            byte r0 = r0.readByte()
            if (r0 != 0) goto L_0x0c89
            r2 = 0
        L_0x0c89:
            r9.A01 = r2
            return r9
        L_0x0c8c:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.PromoteWhatsAppAccountType r9 = com.instagram.business.promote.model.PromoteWhatsAppAccountType.valueOf(r0)
            return r9
        L_0x0c95:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            com.instagram.business.promote.model.PromotionMetric r9 = new com.instagram.business.promote.model.PromotionMetric
            r9.<init>()
            java.lang.String r1 = r0.readString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            X.0qQ.A0B(r1, r2)
            r9.A01 = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Object r1 = X.Pxi.A0U(r0, r1)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0cba
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x0cb7:
            r9.A00 = r1
            return r9
        L_0x0cba:
            r1 = 0
            goto L_0x0cb7
        L_0x0cbc:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.RejectionReason r9 = new com.instagram.business.promote.model.RejectionReason
            r9.<init>()
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0ce0
            r9.A00 = r1
            boolean r1 = X.C13991Tnr.A1W(r0)
            r9.A02 = r1
            X.W6D r1 = com.instagram.business.promote.model.RejectionReasonRanges.CREATOR
            java.util.ArrayList r0 = r0.createTypedArrayList(r1)
            if (r0 != 0) goto L_0x0cdd
            X.0sn r0 = X.0sn.A00
        L_0x0cdd:
            r9.A01 = r0
            return r9
        L_0x0ce0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0ce5:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.business.promote.model.RejectionReasonRanges r9 = new com.instagram.business.promote.model.RejectionReasonRanges
            r9.<init>()
            int r1 = r0.readInt()
            r9.A01 = r1
            int r1 = r0.readInt()
            r9.A00 = r1
            java.lang.String r0 = r0.readString()
            if (r0 == 0) goto L_0x0d03
            r9.A02 = r0
            return r9
        L_0x0d03:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0d08:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            com.instagram.business.promote.model.SbgChannelName r9 = com.instagram.business.promote.model.SbgChannelName.valueOf(r0)
            return r9
        L_0x0d11:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            com.instagram.business.promote.model.SelectedInterestRowItem r9 = new com.instagram.business.promote.model.SelectedInterestRowItem
            r9.<init>()
            java.lang.Class<com.instagram.business.promote.model.AudienceInterest> r1 = com.instagram.business.promote.model.AudienceInterest.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            if (r0 == 0) goto L_0x0d2a
            com.instagram.business.promote.model.AudienceInterest r0 = (com.instagram.business.promote.model.AudienceInterest) r0
            X.0qQ.A0B(r0, r2)
            r9.A00 = r0
            return r9
        L_0x0d2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0d2f:
            java.lang.String r0 = X.C41848B3p.A1D(r0)
            if (r0 == 0) goto L_0x0d3a
            com.instagram.business.promote.model.SpecialRequirementCategory r9 = X.VAY.A00(r0)
            return r9
        L_0x0d3a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0d3f:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            com.instagram.business.promote.model.SuggestedInterestRowItem r9 = new com.instagram.business.promote.model.SuggestedInterestRowItem
            r9.<init>()
            java.lang.Class<com.instagram.business.promote.model.AudienceInterest> r1 = com.instagram.business.promote.model.AudienceInterest.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            if (r0 == 0) goto L_0x0d58
            com.instagram.business.promote.model.AudienceInterest r0 = (com.instagram.business.promote.model.AudienceInterest) r0
            X.0qQ.A0B(r0, r2)
            r9.A00 = r0
            return r9
        L_0x0d58:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0d5d:
            r3 = 0
            X.0qQ.A0B(r0, r3)
            com.instagram.business.promote.model.SuggestedPromotion r9 = new com.instagram.business.promote.model.SuggestedPromotion
            r9.<init>()
            java.lang.String r1 = r0.readString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            X.0qQ.A0B(r1, r3)
            r9.A03 = r1
            java.lang.String r1 = r0.readString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            X.0qQ.A0B(r1, r3)
            r9.A05 = r1
            java.lang.String r1 = r0.readString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            X.0qQ.A0B(r1, r3)
            r9.A04 = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r1 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0dba
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            X.0qQ.A0B(r1, r3)
            r9.A01 = r1
            java.lang.Class<com.instagram.business.promote.model.InstagramPromoteSuggestionReason> r1 = com.instagram.business.promote.model.InstagramPromoteSuggestionReason.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            if (r1 == 0) goto L_0x0db4
            com.instagram.business.promote.model.InstagramPromoteSuggestionReason r1 = (com.instagram.business.promote.model.InstagramPromoteSuggestionReason) r1
            X.0qQ.A0B(r1, r3)
            r9.A00 = r1
            java.lang.String r0 = r0.readString()
            r9.A02 = r0
            return r9
        L_0x0db4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0dba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0dc0:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r9 = new com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel
            r9.<init>()
            java.lang.String r1 = r0.readString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r9.A07 = r1
            android.os.Parcelable$Creator r1 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r9.A03 = r1
            java.lang.String r1 = r0.readString()
            r9.A04 = r1
            java.lang.String r1 = r0.readString()
            r9.A05 = r1
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x0df8
            X.UzE r1 = X.C16678UzE.valueOf(r1)
            X.0qQ.A0B(r1, r2)
            r9.A02 = r1
        L_0x0df8:
            java.lang.String r0 = r0.readString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.0qQ.A0B(r0, r2)
            r9.A06 = r0
            return r9
        L_0x0e06:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r10 = X.C41848B3p.A1X(r0)
            boolean r11 = X.C41848B3p.A1X(r0)
            boolean r12 = X.C41848B3p.A1X(r0)
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
            boolean r25 = X.C41848B3p.A1X(r0)
            com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures r9 = new com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r9
        L_0x0e50:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.camera.effect.models.AttributionUser r9 = new com.instagram.camera.effect.models.AttributionUser
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r9.A01 = r1
            java.lang.String r1 = r0.readString()
            r9.A02 = r1
            java.lang.Class<com.instagram.camera.effect.models.ProfilePicture> r1 = com.instagram.camera.effect.models.ProfilePicture.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.camera.effect.models.ProfilePicture r0 = (com.instagram.camera.effect.models.ProfilePicture) r0
            r9.A00 = r0
            return r9
        L_0x0e70:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.camera.effect.models.EffectActionSheet r9 = new com.instagram.camera.effect.models.EffectActionSheet
            r9.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            X.0qQ.A07(r1)
            r9.A00 = r1
            java.util.List r1 = java.util.Collections.emptyList()
            X.0qQ.A07(r1)
            r9.A01 = r1
            java.util.ArrayList r2 = r0.createStringArrayList()
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x0ea4
            r9.A00 = r2
            java.util.ArrayList r0 = r0.createStringArrayList()
            if (r0 == 0) goto L_0x0e9e
            r9.A01 = r0
            return r9
        L_0x0e9e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0ea4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0eaa:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.camera.effect.models.ProfilePicture r9 = new com.instagram.camera.effect.models.ProfilePicture
            r9.<init>((android.os.Parcel) r0)
            return r9
        L_0x0eb4:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.camera.effect.models.ThumbnailImage r9 = new com.instagram.camera.effect.models.ThumbnailImage
            r9.<init>()
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r1 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r9.A00 = r0
            return r9
        L_0x0ec8:
            com.instagram.camera.effect.models.effectpreview.EffectPreview r9 = new com.instagram.camera.effect.models.effectpreview.EffectPreview
            r9.<init>()
            java.lang.String r1 = r0.readString()
            r1.getClass()
            r9.A07 = r1
            java.lang.String r1 = r0.readString()
            r1.getClass()
            r9.A08 = r1
            java.lang.Class<com.instagram.common.typedurl.ImageUrl> r2 = com.instagram.common.typedurl.ImageUrl.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            r1.getClass()
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r9.A02 = r1
            java.lang.String r1 = r0.readString()
            r9.A0A = r1
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r9.A03 = r1
            java.lang.Class<com.instagram.camera.effect.models.AttributionUser> r1 = com.instagram.camera.effect.models.AttributionUser.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.camera.effect.models.AttributionUser r1 = (com.instagram.camera.effect.models.AttributionUser) r1
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r1.getClass()
            r9.A0B = r1
            java.lang.Class<com.instagram.camera.effect.models.EffectActionSheet> r1 = com.instagram.camera.effect.models.EffectActionSheet.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            r1.getClass()
            com.instagram.camera.effect.models.EffectActionSheet r1 = (com.instagram.camera.effect.models.EffectActionSheet) r1
            r9.A01 = r1
            java.lang.Class<com.instagram.model.shopping.ProductAREffectContainer> r1 = com.instagram.model.shopping.ProductAREffectContainer.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.shopping.ProductAREffectContainer r1 = (com.instagram.model.shopping.ProductAREffectContainer) r1
            r9.A06 = r1
            java.lang.String r1 = r0.readString()
            r9.A09 = r1
            java.io.Serializable r0 = r0.readSerializable()
            X.Kit r0 = (X.C62622Kit) r0
            r9.A04 = r0
            return r9
        L_0x0f33:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.camera.mpfacade.CameraEffectFacadeIntf$State> r1 = com.instagram.camera.mpfacade.CameraEffectFacadeIntf$State.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.instagram.music.common.model.ARAudioEffectData r1 = (com.instagram.music.common.model.ARAudioEffectData) r1
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.camera.mpfacade.CameraEffectFacadeIntf$State r9 = new com.instagram.camera.mpfacade.CameraEffectFacadeIntf$State
            r9.<init>(r1, r0)
            return r9
        L_0x0f49:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider r9 = new com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider
            r9.<init>()
            java.lang.String r2 = r0.readString()
            if (r2 == 0) goto L_0x0f6b
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.putString(r0, r2)
            X.08y r0 = X.09i.A0A
            X.0wW r0 = r0.A04(r1)
            r9.A00 = r0
            return r9
        L_0x0f6b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0f70:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.clips.audio.model.AudioPageAssetModel> r1 = com.instagram.clips.audio.model.AudioPageAssetModel.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.music.common.model.AudioType r10 = (com.instagram.music.common.model.AudioType) r10
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            java.lang.String r14 = r0.readString()
            com.instagram.clips.audio.model.AudioPageAssetModel r9 = new com.instagram.clips.audio.model.AudioPageAssetModel
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x0f92:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal r9 = new com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal
            r9.<init>()
            long r1 = r0.readLong()
            r9.A00 = r1
            java.lang.String r1 = r0.readString()
            r9.A01 = r1
            java.lang.String r0 = r0.readString()
            r9.A02 = r0
            return r9
        L_0x0fae:
            int r5 = X.C41848B3p.A00(r0)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r5)
            r3 = 0
        L_0x0fb8:
            if (r3 == r5) goto L_0x0fca
            java.lang.String r2 = r0.readString()
            android.os.Parcelable$Creator r1 = com.instagram.clips.model.ClipsSpotlightModel.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            r4.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x0fb8
        L_0x0fca:
            com.instagram.clips.model.ClipsSpotlightData r9 = new com.instagram.clips.model.ClipsSpotlightData
            r9.<init>(r4)
            return r9
        L_0x0fd0:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.instagram.clips.model.ClipsSpotlightModel> r1 = com.instagram.clips.model.ClipsSpotlightModel.class
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            long r0 = r0.readLong()
            com.instagram.clips.model.ClipsSpotlightModel r9 = new com.instagram.clips.model.ClipsSpotlightModel
            r9.<init>(r2, r0)
            return r9
        L_0x0fe6:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            boolean r0 = X.C41848B3p.A1X(r0)
            com.instagram.clips.model.ClipsTogetherData r9 = new com.instagram.clips.model.ClipsTogetherData
            r9.<init>(r1, r0)
            return r9
        L_0x0ff4:
            java.lang.String r16 = X.C41848B3p.A1D(r0)
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            boolean r34 = X.C41848B3p.A1X(r0)
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            java.lang.Class<com.instagram.clips.model.metadata.AudioPageMetadata> r1 = com.instagram.clips.model.metadata.AudioPageMetadata.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r11 = (com.instagram.common.typedurl.ImageUrl) r11
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r12 = (com.instagram.common.typedurl.ImageUrl) r12
            java.lang.String r21 = r0.readString()
            java.lang.String r22 = r0.readString()
            java.lang.String r23 = r0.readString()
            java.lang.String r24 = r0.readString()
            java.lang.String r25 = r0.readString()
            java.lang.String r26 = r0.readString()
            android.os.Parcelable r14 = X.C41847B3o.A03(r0, r1)
            com.instagram.music.common.model.AudioType r14 = (com.instagram.music.common.model.AudioType) r14
            boolean r35 = X.C41848B3p.A1X(r0)
            java.lang.String r27 = r0.readString()
            android.os.Parcelable r15 = X.C41847B3o.A03(r0, r1)
            com.instagram.music.common.model.MusicDataSource r15 = (com.instagram.music.common.model.MusicDataSource) r15
            boolean r36 = X.C41848B3p.A1X(r0)
            boolean r37 = X.C41848B3p.A1X(r0)
            boolean r38 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r1)
            com.instagram.music.common.config.MusicAttributionConfig r13 = (com.instagram.music.common.config.MusicAttributionConfig) r13
            java.lang.String r28 = r0.readString()
            java.lang.String r29 = r0.readString()
            java.lang.String r30 = r0.readString()
            java.lang.String r31 = r0.readString()
            java.lang.String r32 = r0.readString()
            java.lang.String r33 = r0.readString()
            boolean r39 = X.C41848B3p.A1X(r0)
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.api.schemas.AudioFilterType r10 = (com.instagram.api.schemas.AudioFilterType) r10
            com.instagram.clips.model.metadata.AudioPageMetadata r9 = new com.instagram.clips.model.metadata.AudioPageMetadata
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r9
        L_0x1080:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.clips.model.metadata.AudioPartType[] r1 = com.instagram.clips.model.metadata.AudioPartType.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x108f:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            java.lang.String r0 = r0.readString()
            X.DeO r0 = X.C46401DeO.valueOf(r0)
            com.instagram.clips.model.metadata.ClipsFanClubMetadata r9 = new com.instagram.clips.model.metadata.ClipsFanClubMetadata
            r9.<init>(r0, r1)
            return r9
        L_0x10a1:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.clips.model.metadata.InteractionUpsellCTAType[] r1 = com.instagram.clips.model.metadata.InteractionUpsellCTAType.values()
            int r0 = r0.readInt()
            r9 = r1[r0]
            return r9
        L_0x10b0:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            java.lang.String r14 = r0.readString()
            java.lang.String r1 = r0.readString()
            X.16F r1 = X.16P.A00(r1)
            X.4ys r11 = X.C67211sN.parseFromJson(r1)
            X.0qQ.A07(r11)
            X.28D[] r8 = X.28D.values()
            int r7 = r8.length
            r6 = 0
        L_0x10cd:
            if (r6 >= r7) goto L_0x10f2
            r10 = r8[r6]
            long r4 = r0.readLong()
            long r1 = r10.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            if (r3 == 0) goto L_0x10ef
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x10ef
        L_0x10e1:
            java.lang.Class<com.instagram.clips.template.creation.model.ClipsTemplateModel> r1 = com.instagram.clips.template.creation.model.ClipsTemplateModel.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            com.instagram.clips.template.creation.model.ClipsTemplateModel r9 = new com.instagram.clips.template.creation.model.ClipsTemplateModel
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x10ef:
            int r6 = r6 + 1
            goto L_0x10cd
        L_0x10f2:
            X.28D r10 = X.28D.A5J
            goto L_0x10e1
        L_0x10f5:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            int r13 = r0.readInt()
            int r3 = r0.readInt()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r3)
            r2 = 0
        L_0x110b:
            if (r2 == r3) goto L_0x1115
            java.lang.Class<com.instagram.closefriends.audiencelists.model.AudienceListViewModel> r1 = com.instagram.closefriends.audiencelists.model.AudienceListViewModel.class
            X.C41848B3p.A1J(r0, r1, r12)
            int r2 = r2 + 1
            goto L_0x110b
        L_0x1115:
            boolean r14 = X.C41848B3p.A1X(r0)
            boolean r15 = X.C41848B3p.A1X(r0)
            boolean r16 = X.C41848B3p.A1X(r0)
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r9 = new com.instagram.closefriends.audiencelists.model.AudienceListViewModel
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L_0x1127:
            java.lang.String r11 = X.C41848B3p.A1D(r0)
            java.lang.Class<com.instagram.comments.model.ChannelCommentsData> r1 = com.instagram.comments.model.ChannelCommentsData.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.model.direct.messageid.MessageIdentifier r10 = (com.instagram.model.direct.messageid.MessageIdentifier) r10
            java.lang.String r12 = r0.readString()
            boolean r14 = X.C41848B3p.A1X(r0)
            java.lang.String r13 = r0.readString()
            com.instagram.comments.model.ChannelCommentsData r9 = new com.instagram.comments.model.ChannelCommentsData
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x1145:
            java.lang.String r3 = X.C41848B3p.A1D(r0)
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.comments.model.ChannelRepliesNotifData r9 = new com.instagram.comments.model.ChannelRepliesNotifData
            r9.<init>(r3, r2, r1, r0)
            return r9
        L_0x115b:
            java.lang.String r13 = X.C41848B3p.A1D(r0)
            int r16 = r0.readInt()
            int r17 = r0.readInt()
            int r18 = r0.readInt()
            int r19 = r0.readInt()
            int r1 = r0.readInt()
            r12 = 0
            if (r1 != 0) goto L_0x119d
            r10 = r12
        L_0x1177:
            com.instagram.common.clips.model.LayoutTransform r10 = (com.instagram.common.clips.model.LayoutTransform) r10
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.Integer r11 = X.Dbc.A0C(r0)
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x118f
            java.lang.Integer r12 = X.C41847B3o.A12(r0)
        L_0x118f:
            boolean r21 = X.C41848B3p.A1X(r0)
            int r20 = r0.readInt()
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r9 = new com.instagram.common.clips.model.ClipSegment$PhotoSegment
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r9
        L_0x119d:
            android.os.Parcelable$Creator r1 = com.instagram.common.clips.model.LayoutTransform.CREATOR
            java.lang.Object r10 = r1.createFromParcel(r0)
            goto L_0x1177
        L_0x11a4:
            java.lang.String r14 = X.C41848B3p.A1D(r0)
            int r19 = r0.readInt()
            int r20 = r0.readInt()
            int r21 = r0.readInt()
            int r1 = r0.readInt()
            r11 = 0
            if (r1 == 0) goto L_0x11c1
            android.os.Parcelable$Creator r1 = com.instagram.common.clips.model.LayoutTransform.CREATOR
            java.lang.Object r11 = r1.createFromParcel(r0)
        L_0x11c1:
            com.instagram.common.clips.model.LayoutTransform r11 = (com.instagram.common.clips.model.LayoutTransform) r11
            java.io.Serializable r10 = r0.readSerializable()
            com.google.common.collect.ImmutableList r10 = (com.google.common.collect.ImmutableList) r10
            long r26 = r0.readLong()
            int r22 = r0.readInt()
            int r23 = r0.readInt()
            int r24 = r0.readInt()
            float r17 = r0.readFloat()
            float r18 = r0.readFloat()
            boolean r28 = X.C41848B3p.A1X(r0)
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.Integer r12 = X.Dbc.A0C(r0)
            java.lang.Integer r13 = X.C13991Tnr.A0W(r0)
            boolean r29 = X.C41848B3p.A1X(r0)
            int r25 = r0.readInt()
            com.instagram.common.clips.model.ClipSegment$VideoSegment r9 = new com.instagram.common.clips.model.ClipSegment$VideoSegment
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29)
            return r9
        L_0x1203:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r17 = X.C41848B3p.A1X(r0)
            float r11 = r0.readFloat()
            float r12 = r0.readFloat()
            float r13 = r0.readFloat()
            float r14 = r0.readFloat()
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "NONE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x1237
            java.lang.Integer r10 = X.AnonymousClass05K.A00
        L_0x1229:
            int r15 = r0.readInt()
            int r16 = r0.readInt()
            com.instagram.common.clips.model.LayoutTransform r9 = new com.instagram.common.clips.model.LayoutTransform
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r9
        L_0x1237:
            java.lang.String r1 = "FILL_SCREEN"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x1242
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x1229
        L_0x1242:
            java.lang.String r1 = "SQUARE_CROP"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x124d
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            goto L_0x1229
        L_0x124d:
            java.lang.String r1 = "CLIP_TRANSFORM"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x1258
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            goto L_0x1229
        L_0x1258:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x125e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            double r10 = r0.readDouble()
            float r12 = r0.readFloat()
            float r13 = r0.readFloat()
            float r14 = r0.readFloat()
            com.instagram.common.clips.model.VideoCropParams r9 = new com.instagram.common.clips.model.VideoCropParams
            r9.<init>(r10, r12, r13, r14)
            return r9
        L_0x1278:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.common.gallery.FaceCenter r9 = new com.instagram.common.gallery.FaceCenter
            r9.<init>()
            float r1 = r0.readFloat()
            r9.A01 = r1
            float r1 = r0.readFloat()
            r9.A02 = r1
            float r0 = r0.readFloat()
            r9.A00 = r0
            return r9
        L_0x1294:
            java.lang.String r1 = X.C41848B3p.A1D(r0)
            if (r1 != 0) goto L_0x129e
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
        L_0x129e:
            java.lang.Class<com.instagram.common.gallery.Medium> r2 = com.instagram.common.gallery.Medium.class
            android.os.Parcelable r12 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.gallery.Medium r12 = (com.instagram.common.gallery.Medium) r12
            java.lang.Class<com.instagram.common.gallery.Draft> r2 = com.instagram.common.gallery.Draft.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.gallery.Draft r10 = (com.instagram.common.gallery.Draft) r10
            java.lang.Class<com.instagram.common.gallery.RemoteMedia> r2 = com.instagram.common.gallery.RemoteMedia.class
            android.os.Parcelable r13 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.gallery.RemoteMedia r13 = (com.instagram.common.gallery.RemoteMedia) r13
            java.lang.String r3 = r0.readString()
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x1363
            r0 = 2347(0x92b, float:3.289E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x12d8
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x12cc:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 != r0) goto L_0x134a
            if (r12 == 0) goto L_0x1344
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r9 = new com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium
            r9.<init>(r12, r1)
            return r9
        L_0x12d8:
            java.lang.String r0 = "DRAFT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x12e3
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x12cc
        L_0x12e3:
            r0 = 2419(0x973, float:3.39E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x12f2
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x12cc
        L_0x12f2:
            r0 = 2122(0x84a, float:2.974E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x1301
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x12cc
        L_0x1301:
            java.lang.String r0 = "SCHEDULED_CONTENT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x130c
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            goto L_0x12cc
        L_0x130c:
            r0 = 2119(0x847, float:2.97E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x131b
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            goto L_0x12cc
        L_0x131b:
            r0 = 2120(0x848, float:2.971E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x132a
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            goto L_0x12cc
        L_0x132a:
            java.lang.String r0 = "URL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x1335
            java.lang.Integer r3 = X.AnonymousClass05K.A15
            goto L_0x12cc
        L_0x1335:
            r0 = 2246(0x8c6, float:3.147E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x135d
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            goto L_0x12cc
        L_0x1344:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x134a:
            r11 = 0
            r20 = -1
            com.instagram.common.gallery.model.GalleryItem r9 = new com.instagram.common.gallery.model.GalleryItem
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r3
            r19 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r9
        L_0x135d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x1363:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1369:
            int r1 = X.C41848B3p.A00(r0)
            r4 = 0
            r11 = 0
            if (r1 != 0) goto L_0x13c1
            r13 = r11
        L_0x1372:
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x13ad
            r14 = r11
        L_0x1379:
            java.lang.Class<com.instagram.common.textwithentities.model.TextWithEntities> r2 = com.instagram.common.textwithentities.model.TextWithEntities.class
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r2)
            com.instagram.api.schemas.LinkAction r10 = (com.instagram.api.schemas.LinkAction) r10
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x139c
            r15 = r11
        L_0x1388:
            java.lang.String r12 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x1396
            java.lang.Long r11 = X.Pxi.A0T(r0)
        L_0x1396:
            com.instagram.common.textwithentities.model.TextWithEntities r9 = new com.instagram.common.textwithentities.model.TextWithEntities
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x139c:
            int r1 = r0.readInt()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r1)
        L_0x13a5:
            if (r4 == r1) goto L_0x1388
            X.C41848B3p.A1J(r0, r2, r15)
            int r4 = r4 + 1
            goto L_0x13a5
        L_0x13ad:
            int r3 = r0.readInt()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r3)
            r2 = 0
        L_0x13b7:
            if (r2 == r3) goto L_0x1379
            java.lang.Class<com.instagram.common.textwithentities.model.TextWithEntities> r1 = com.instagram.common.textwithentities.model.TextWithEntities.class
            X.C41848B3p.A1J(r0, r1, r14)
            int r2 = r2 + 1
            goto L_0x13b7
        L_0x13c1:
            int r3 = r0.readInt()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r3)
            r2 = 0
        L_0x13cb:
            if (r2 == r3) goto L_0x1372
            java.lang.Class<com.instagram.common.textwithentities.model.TextWithEntities> r1 = com.instagram.common.textwithentities.model.TextWithEntities.class
            X.C41848B3p.A1J(r0, r1, r13)
            int r2 = r2 + 1
            goto L_0x13cb
        L_0x13d5:
            int r1 = X.C41848B3p.A00(r0)
            if (r1 != 0) goto L_0x13ea
            r2 = 0
        L_0x13dc:
            java.lang.String r1 = r0.readString()
            java.lang.String r0 = r0.readString()
            com.instagram.common.typedurl.GifUrlLoggingExtras r9 = new com.instagram.common.typedurl.GifUrlLoggingExtras
            r9.<init>(r2, r1, r0)
            return r9
        L_0x13ea:
            java.lang.Long r2 = X.Pxi.A0T(r0)
            goto L_0x13dc
        L_0x13ef:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout$SavedState r9 = new com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout$SavedState
            r9.<init>(r0)
            java.lang.Class<com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout$SavedState> r1 = com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout.SavedState.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            r9.A00 = r0
            return r9
        L_0x1401:
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager$SavedState r9 = new com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager$SavedState
            r9.<init>()
            int r0 = r0.readInt()
            r9.A00 = r0
            return r9
        L_0x140d:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            float r3 = r0.readFloat()
            float r2 = r0.readFloat()
            float r1 = r0.readFloat()
            float r0 = r0.readFloat()
            com.instagram.compose.ui.gradientspinner.BezierControlPoints r9 = new com.instagram.compose.ui.gradientspinner.BezierControlPoints
            r9.<init>(r3, r2, r1, r0)
            return r9
        L_0x1427:
            int r3 = X.C41848B3p.A00(r0)
            float r2 = r0.readFloat()
            float r1 = r0.readFloat()
            int r0 = r0.readInt()
            com.instagram.compose.ui.gradientspinner.Segment r9 = new com.instagram.compose.ui.gradientspinner.Segment
            r9.<init>(r3, r2, r1, r0)
            return r9
        L_0x143d:
            int r1 = X.C41848B3p.A00(r0)
            int r0 = r0.readInt()
            com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates r9 = new com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates
            r9.<init>(r1, r0)
            return r9
        L_0x144b:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r2 = X.C41848B3p.A1X(r0)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x1466
            r1 = 0
        L_0x145a:
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams r1 = (com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams) r1
            java.lang.String r0 = r0.readString()
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState r9 = new com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState
            r9.<init>(r1, r0, r2)
            return r9
        L_0x1466:
            android.os.Parcelable$Creator r1 = com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            goto L_0x145a
        L_0x146d:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r2 = X.C41848B3p.A1X(r0)
            android.os.Parcelable$Creator r1 = com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates r1 = (com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates) r1
            int r0 = r0.readInt()
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams r9 = new com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams
            r9.<init>(r1, r0, r2)
            return r9
        L_0x1487:
            java.lang.String r14 = X.C41848B3p.A1D(r0)
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            int r1 = r0.readInt()
            r12 = 0
            if (r1 == 0) goto L_0x14aa
            java.lang.Integer r12 = X.C41847B3o.A12(r0)
        L_0x14aa:
            java.lang.String r20 = r0.readString()
            java.lang.Integer r13 = X.C13991Tnr.A0W(r0)
            java.lang.Class<com.instagram.contentnotes.data.metadata.ContentNoteMetadata> r1 = com.instagram.contentnotes.data.metadata.ContentNoteMetadata.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r1)
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            boolean r21 = X.C41848B3p.A1X(r0)
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r9 = new com.instagram.contentnotes.data.metadata.ContentNoteMetadata
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r9
        L_0x14ca:
            int r4 = X.C41848B3p.A00(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            r3 = 0
        L_0x14d4:
            if (r3 == r4) goto L_0x14de
            java.lang.Class<com.instagram.contentnotes.domain.directstack.DirectMessageEmojiInfo> r2 = com.instagram.contentnotes.domain.directstack.DirectMessageEmojiInfo.class
            X.C41848B3p.A1J(r0, r2, r1)
            int r3 = r3 + 1
            goto L_0x14d4
        L_0x14de:
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            java.lang.String r18 = r0.readString()
            java.lang.String r19 = r0.readString()
            java.lang.String r20 = r0.readString()
            int r2 = r0.readInt()
            r12 = 0
            if (r2 == 0) goto L_0x1505
            java.lang.Integer r12 = X.C41847B3o.A12(r0)
        L_0x1505:
            java.lang.Class<com.instagram.contentnotes.domain.directstack.DirectMessageEmojiInfo> r2 = com.instagram.contentnotes.domain.directstack.DirectMessageEmojiInfo.class
            android.os.Parcelable r11 = X.C41847B3o.A03(r0, r2)
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            java.lang.String r21 = r0.readString()
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r2)
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            java.lang.String r22 = r0.readString()
            java.lang.Integer r13 = X.C13991Tnr.A0W(r0)
            boolean r24 = X.C41848B3p.A1X(r0)
            com.instagram.contentnotes.domain.directstack.DirectMessageEmojiInfo r9 = new com.instagram.contentnotes.domain.directstack.DirectMessageEmojiInfo
            r23 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W6D.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new BoostFlowType[i];
            case 1:
                return new BoostWebViewAdPreviewFragment$Config[i];
            case 2:
                return new BusinessConversionFlowStatus[i];
            case 3:
                return new BusinessConversionStep[i];
            case 4:
                return new ConversionStep[i];
            case 5:
                return new PageSelectionOverrideData[i];
            case 6:
                return new DataPoint[i];
            case 7:
                return new DaysHourlyFollowersData[i];
            case 8:
                return new FollowersGrowthData[i];
            case 9:
                return new GrowthDataPoint[i];
            case 10:
                return new IGInstantExperiencesParameters[i];
            case 11:
                return new BoostGuidanceItemResponse[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new PagePhotoItem[i];
            case 13:
                return new AdsManagerBoostingStatusErrorCode[i];
            case 14:
                return new AdsManagerPaymentAnomalyType[i];
            case 15:
                return new AudienceGender[i];
            case 16:
                return new AudienceGeoLocation[i];
            case 17:
                return new AudienceInterest[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new AudiencePotentialReachRating[i];
            case 19:
                return new BillingWizardName[i];
            case 20:
                return new DistanceUnit[i];
            case 21:
                return new ErrorHandlingResponseType[i];
            case 22:
                return new HpiSessionStatus[i];
            case 23:
                return new IGBoostPackage[i];
            case 24:
                return new IGBoostPackagesFlowInfo[i];
            case 25:
                return new InstagramMediaProductType[i];
            case 26:
                return new InstagramPromoteSuggestionReason[i];
            case 27:
                return new LinkingAuthState[i];
            case 28:
                return new PendingLocation[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new PromoteAdsManagerActionType[i];
            case 30:
                return new PromoteAudience[i];
            case 31:
                return new PromoteAudienceInfo[i];
            case 32:
                return new PromoteAudiencePotentialReach[i];
            case 33:
                return new PromoteAudiencePotentialReachStore[i];
            case 34:
                return new PromoteButtonAction[i];
            case 35:
                return new PromoteButtonActionType[i];
            case 36:
                return new PromoteCampaignControlsHeaderViewModel[i];
            case 37:
                return new PromoteCreateAudienceResponse[i];
            case 38:
                return new PromoteData[i];
            case 39:
                return new PromoteDataSnapshot[i];
            case 40:
                return new PromoteEnrollCouponInfo[i];
            case Seq.NULL_REFNUM /*41*/:
                return new PromoteEnrollCouponInfo.PromoteEnrollCouponStatus[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new PromoteErrorHandlingResponse[i];
            case 43:
                return new PromoteErrorLevel[i];
            case 44:
                return new PromoteIntegrityCheckDataModel[i];
            case 45:
                return new PromoteIntegrityCheckMessage[i];
            case 46:
                return new PromoteIntegrityCheckMessage.Type[i];
            case 47:
                return new PromoteLaunchOrigin[i];
            case 48:
                return new PromoteReachEstimationStore[i];
            case 49:
                return new PromoteSaveAudienceEditResponse[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new PromoteState[i];
            case 51:
                return new PromoteWhatsAppAccountType[i];
            case 52:
                return new PromotionMetric[i];
            case 53:
                return new RejectionReason[i];
            case 54:
                return new RejectionReasonRanges[i];
            case 55:
                return new SbgChannelName[i];
            case 56:
                return new SelectedInterestRowItem[i];
            case 57:
                return new SpecialRequirementCategory[i];
            case 58:
                return new SuggestedInterestRowItem[i];
            case 59:
                return new SuggestedPromotion[i];
            case 60:
                return new PromoteBottomSheetSlideCardViewModel[i];
            case 61:
                return new NonSupportedContentSchedulingFeatures[i];
            case 62:
                return new AttributionUser[i];
            case 63:
                return new EffectActionSheet[i];
            case 64:
                return new ProfilePicture[i];
            case 65:
                return new ThumbnailImage[i];
            case 66:
                return new EffectPreview[i];
            case 67:
                return new CameraEffectFacadeIntf$State[i];
            case 68:
                return new IgFaceTrackerModelsProvider[i];
            case 69:
                return new AudioPageAssetModel[i];
            case 70:
                return new ClipsCreationToolsResponse$ContentFundingDeal[i];
            case 71:
                return new ClipsSpotlightData[i];
            case 72:
                return new ClipsSpotlightModel[i];
            case 73:
                return new ClipsTogetherData[i];
            case 74:
                return new AudioPageMetadata[i];
            case 75:
                return new AudioPartType[i];
            case 76:
                return new ClipsFanClubMetadata[i];
            case 77:
                return new InteractionUpsellCTAType[i];
            case 78:
                return new ClipsTemplateModel[i];
            case 79:
                return new AudienceListViewModel[i];
            case 80:
                return new ChannelCommentsData[i];
            case 81:
                return new ChannelRepliesNotifData[i];
            case 82:
                return new ClipSegment.PhotoSegment[i];
            case 83:
                return new ClipSegment.VideoSegment[i];
            case 84:
                return new LayoutTransform[i];
            case 85:
                return new VideoCropParams[i];
            case 86:
                return new FaceCenter[i];
            case 87:
                return new GalleryItem[i];
            case 88:
                return new TextWithEntities[i];
            case 89:
                return new GifUrlLoggingExtras[i];
            case 90:
                return new RefreshableRecyclerViewLayout.SavedState[i];
            case 91:
                return new FlowingGridLayoutManager.SavedState[i];
            case 92:
                return new BezierControlPoints[i];
            case 93:
                return new Segment[i];
            case 94:
                return new ContentNotesCoordinates[i];
            case 95:
                return new ContentNotesImmersiveCreationUiState[i];
            case 96:
                return new ContentNotesImmersiveMimicryParams[i];
            case 97:
                return new ContentNoteMetadata[i];
            case 98:
                return new DirectMessageEmojiInfo[i];
            default:
                return new ContentNotesImmersiveReplyContent[i];
        }
    }
}
