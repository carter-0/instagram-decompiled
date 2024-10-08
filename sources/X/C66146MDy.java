package X;

import android.graphics.Picture;
import android.net.Uri;
import androidx.compose.foundation.HoverableNode;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.fragment.app.FragmentActivity;
import androidx.paging.FlattenedPageController;
import androidx.paging.PageFetcher;
import androidx.paging.PagingSource;
import com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl;
import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.avatar.expresso.odr.asset.ODRAssetManager;
import com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.facebookpay.addresstypeahead.controller.AddressTypeaheadController;
import com.instagram.aistudio.profile.AiStudioProfileBannerDataSource;
import com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer;
import com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel;
import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$getSearchResults$$inlined$map$1$2;
import com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository;
import com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository;
import com.instagram.avatars.suggestions.LexiconRecommendationProvider;
import com.instagram.barcelona.share.data.PermalinkRepository;
import com.instagram.barcelona.weblink.data.FetchLinkMetadataCache;
import com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.compose.igds.components.bottomsheet.IgComposeBottomSheetNavigator;
import com.instagram.compose.ui.capturable.CapturableModifierNode;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;
import com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import com.instagram.creation.genai.mai.adapter.MetaAIIntentsGeneratedImageResultAdapter;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.File;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDy  reason: case insensitive filesystem */
public final class C66146MDy extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66146MDy(AnonymousClass4D7 r2) {
        super(r2);
        this.A05 = 1;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.MDy, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                A01(obj, this);
                return HoverableNode.A00((HoverableNode) this.A04, this);
            case 1:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return SelectionGesturesKt.A00((C59629JQx) null, (AnonymousClass6GK) null, (C304926Ft) null, this);
            case 2:
                A01(obj, this);
                return ((MCn) this.A04).A03((0k0) null, this);
            case 3:
                A01(obj, this);
                return ((C66118MCh) this.A04).A03((0k0) null, this);
            case 4:
                A01(obj, this);
                return ((FlattenedPageController) this.A04).A01(this);
            case 5:
            case 6:
                A01(obj, this);
                return ((MCf) this.A04).emit((Object) null, this);
            case 7:
                A01(obj, this);
                return PageFetcher.A00((PageFetcher) this.A04, (PagingSource) null, this);
            case 8:
                A01(obj, this);
                return ((AvatarStickerCacheImpl) this.A04).A05(this);
            case 9:
                A01(obj, this);
                return ODRController.A07((ODRController) this.A04, (Map) null, this);
            case 10:
                A01(obj, this);
                return ((ODRAssetManager) this.A04).A01((AvatarStickerCacheImpl) null, (String) null, this);
            case 11:
                A01(obj, this);
                return ((OdrSnapshotHelper) this.A04).A03((File) null, this, (0sL) null, (AnonymousClass0r6) null, 0);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return OdrSnapshotHelper.A01((OdrSnapshotHelper) this.A04, (0k0) null, this, (0sL) null);
            case 13:
                A01(obj, this);
                return GoogleAuthController.A06((FragmentActivity) null, (C13422Ta8) null, (GoogleAuthController) this.A04, this);
            case 14:
                A01(obj, this);
                return InAppPurchaseControllerCoro.A01((InAppPurchaseControllerCoro) this.A04, (String) null, this);
            case 15:
                A01(obj, this);
                return AddressTypeaheadController.A00((AddressTypeaheadController) this.A04, (String) null, (String) null, this);
            case 16:
                A01(obj, this);
                return ((AiStudioProfileBannerDataSource) this.A04).AXI((C324506zQ) null, this);
            case 17:
                A01(obj, this);
                return MessageQueueTimelineInitializer.A01((MessageQueueTimelineInitializer) this.A04, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return AppreciationBuyAndSendViewModel.A00((AppreciationBuyAndSendViewModel) this.A04, (C62709Kl9) null, this);
            case 19:
                A01(obj, this);
                return ((AppreciationGiftFeedRepository) this.A04).A01((Long) null, (String) null, this, false);
            case 20:
                A01(obj, this);
                return ((AppreciationGiftFeedRepository) this.A04).A02((String) null, this);
            case 21:
                A01(obj, this);
                return ((C41502Av3) this.A04).emit((Object) null, this);
            case 22:
                A01(obj, this);
                return ((MiniGalleryService$getSearchResults$$inlined$map$1$2) this.A04).emit((Object) null, this);
            case 23:
                A01(obj, this);
                return ((C41500Av1) this.A04).emit((Object) null, this);
            case 24:
                A01(obj, this);
                return C311976dc.A01((C311976dc) this.A04, (C346117ud) null, this);
            case 25:
                A01(obj, this);
                return AvatarStickerSuggestionRepository.A00((AvatarStickerSuggestionRepository) this.A04, (String) null, this);
            case 26:
                A01(obj, this);
                return ((ContextualSuggestionsPerIntentRepository) this.A04).E3g(this);
            case 27:
                A01(obj, this);
                return ((LexiconRecommendationProvider) this.A04).CN0((String) null, this);
            case 28:
                A01(obj, this);
                return ((PermalinkRepository) this.A04).A00((AnonymousClass0iw) null, (1Xj) null, (Integer) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return ((FetchLinkMetadataCache) this.A04).A00((String) null, (String) null, this);
            case 30:
                A01(obj, this);
                return ((BugReportComposerFragment$onClickScreenshotThumbnail$1) this.A04).A00((Uri) null, this);
            case 31:
                A01(obj, this);
                return EffectTrayService.A02((C39753A7t) null, (EffectTrayService) this.A04, this);
            case 32:
                A01(obj, this);
                return EffectsByIdMetadataService.A00((C39753A7t) null, (EffectsByIdMetadataService) this.A04, this);
            case 33:
                A01(obj, this);
                return ((PagingSource) this.A04).A04((LCU) null, this);
            case 34:
                A01(obj, this);
                return ((ClipsDraftPreviewItemRepository) this.A04).A00((List) null, this);
            case 35:
                A01(obj, this);
                return ClipsNetworkImportDraftRepository.A00((ClipsNetworkImportDraftRepository) this.A04, (AnonymousClass55Q) null, (String) null, (String) null, (List) null, this, (C62320sa) null);
            case 36:
                A01(obj, this);
                return ((MediaCommentListRepository) this.A04).A0A((C247733gp) null, (String) null, this);
            case 37:
                A01(obj, this);
                return ((MediaCommentListRepository) this.A04).A0B((String) null, this);
            case 38:
                A01(obj, this);
                return MediaCommentListRepository.A05((MediaCommentListRepository) this.A04, (String) null, (String) null, this);
            case 39:
                A01(obj, this);
                return ((IgComposeBottomSheetNavigator) this.A04).A00((C55862Hoj) null, this);
            case 40:
                A01(obj, this);
                return CapturableModifierNode.A00((Picture) null, (CapturableModifierNode) this.A04, this);
            case Seq.NULL_REFNUM:
                A01(obj, this);
                return ((C66119MCj) this.A04).A02((C63608Kzw) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A01(obj, this);
                return ClipsCreationDraftViewModel.A06((ClipsCreationDraftViewModel) this.A04, (C2801950r) null, this);
            case 43:
                A01(obj, this);
                return ((ClipsSharingDraftViewModel) this.A04).A04(this);
            case 44:
                A01(obj, this);
                return ClipsDraftRepository.A05((ClipsDraftRepository) this.A04, (String) null, (String) null, this);
            case 45:
                A01(obj, this);
                return ClipsDraftRepository.A03((B24) null, (ClipsDraftRepository) this.A04, this, (0sP) null, false, false);
            case 46:
                A01(obj, this);
                return ClipsDraftRepository.A02((B1S) null, (ClipsDraftRepository) this.A04, this);
            case 47:
                A01(obj, this);
                return ((ContextualBackgroundViewModel) this.A04).A01((ContextualBackgroundSourceImage) null, this);
            case 48:
                A01(obj, this);
                return MagicModImageGenerationDataSource.A00((MagicModImageGenerationDataSource) this.A04, (KS2) null, (String) null, this);
            default:
                A01(obj, this);
                return ((MetaAIIntentsGeneratedImageResultAdapter) this.A04).A00((UserSession) null, (C62498Kgo) null, (C356888Vp) null, this);
        }
    }

    public static void A00(Object obj, Object obj2, C66146MDy mDy, int i) {
        mDy.A01 = obj;
        mDy.A02 = obj2;
        mDy.A00 = i;
    }

    public static void A01(Object obj, C66146MDy mDy) {
        mDy.A03 = obj;
        mDy.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C66146MDy) || ((C66146MDy) obj).A05 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66146MDy(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A04 = obj;
    }
}
