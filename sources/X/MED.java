package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.fragment.app.FragmentActivity;
import androidx.paging.FlattenedPageController;
import androidx.paging.PageFetcherSnapshot;
import androidx.paging.PagingSource;
import androidx.paging.SingleRunner;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler;
import com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.commonavatarliveediting.PrefetchQueue;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk;
import com.facebook.videolite.instagram.VideoIngestionStep;
import com.instagram.api.schemas.ACRType;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository;
import com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder;
import com.instagram.creation.capture.assetpicker.cutout.services.CutoutStickerUploadService;
import com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource;
import com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService;
import com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository;
import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.direct.emojipong.data.EmojiPongRepository;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation;
import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor;
import com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor;
import com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository;
import com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender;
import com.instagram.fanclub.consideration.FanClubConsiderationRepository;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.genai.imageservice.service.GenAIImageService;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class MED extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MED(AnonymousClass4D7 r2) {
        super(r2);
        this.A06 = 6;
    }

    public static void A02(Object obj, MED med, int i) {
        med.A01 = obj;
        med.A02 = null;
        med.A03 = null;
        med.A00 = i;
    }

    public static void A03(MED med, int i) {
        med.A01 = null;
        med.A02 = null;
        med.A03 = null;
        med.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.MED, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                A01(obj, this);
                return ((LazyGridState) this.A05).EKT((C54609HKs) null, this, (0sL) null);
            case 1:
                A01(obj, this);
                return ((LazyStaggeredGridState) this.A05).EKT((C54609HKs) null, this, (0sL) null);
            case 2:
                A01(obj, this);
                return GZF.A01((C54609HKs) null, (GZF) this.A05, this, (0sL) null);
            case 3:
                A01(obj, this);
                return ((FlattenedPageController) this.A05).A00((0k0) null, this);
            case 4:
                A01(obj, this);
                return ((PageFetcherSnapshot) this.A05).A08(this);
            case 5:
                A01(obj, this);
                return ((SingleRunner.Holder) this.A05).A00(this, (C262204Co) null);
            case 6:
                this.A05 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return RememberLottieCompositionKt.A01((Context) null, (S5B) null, (String) null, (String) null, (String) null, (String) null, this);
            case 7:
                A01(obj, this);
                return ODRController.A05((ODRController) this.A05, (String) null, (String) null, (String) null, this, 0);
            case 8:
                A01(obj, this);
                return ODRAvatarHandler.A00((ODRAvatarHandler) this.A05, (C62977KpT) null, this);
            case 9:
                A01(obj, this);
                return ODRCDLHandler.A00((ODRCDLHandler) this.A05, (C62977KpT) null, this);
            case 10:
                A01(obj, this);
                return PrefetchQueue.A01((PrefetchQueue) this.A05, (List) null, this);
            case 11:
                A01(obj, this);
                return PrefetchQueue.A00((PrefetchQueue) this.A05, (C15055ULy) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return GoogleAuthController.A05((FragmentActivity) null, (C10979S3n) null, (GoogleAuthController) this.A05, this, false);
            case 13:
                A01(obj, this);
                return ((GoogleAuthController) this.A05).A08((FragmentActivity) null, this, false);
            case 14:
                A01(obj, this);
                return ((MetaAiRsysSdk) this.A05).A00((C60940Jty) null, this);
            case 15:
                A01(obj, this);
                return VideoIngestionStep.A00((VideoIngestionStep) this.A05, (LP8) null, this);
            case 16:
                A01(obj, this);
                return ((EffectCollectionService) this.A05).A0C((AnonymousClass84A) null, (AnonymousClass8Yi) null, this);
            case 17:
                A01(obj, this);
                return C311976dc.A03((C311976dc) this.A05, (Integer) null, (String) null, this, 0);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return C311976dc.A02((C311976dc) this.A05, (C346177uj) null, this, false);
            case 19:
                A01(obj, this);
                return C311976dc.A00((C346147ug) null, (C311976dc) this.A05, (C346117ud) null, this);
            case 20:
                A01(obj, this);
                return ((AvatarStickerSuggestionRepository) this.A05).A02((String) null, this);
            case 21:
                A01(obj, this);
                return BrandedContentFeedDisclosureController.A00((BrandedContentFeedDisclosureController) this.A05, (List) null, this);
            case 22:
                A01(obj, this);
                return ((IgSignalsCasper) this.A05).A02(this, (0sP) null);
            case 23:
                A01(obj, this);
                return ImmersiveReplyControlMenuViewBinder.A00((View) null, (ImmersiveReplyControlMenuViewBinder) this.A05, this);
            case 24:
                A01(obj, this);
                return ImmersiveReplyControlMenuViewBinder.A01((C586704n) null, (ImmersiveReplyControlMenuViewBinder) this.A05, (User) null, this);
            case 25:
                A01(obj, this);
                Object A002 = ((CutoutStickerUploadService) this.A05).A00((Bitmap) null, (1ua) null, (String) null, (String) null, this);
                if (A002 != 1Hj.A02) {
                    return new 0eR(A002);
                }
                return A002;
            case 26:
                A01(obj, this);
                return ClipsACRBrowserPagingSource.A00((ACRType) null, (C61092Jx3) null, (ClipsACRBrowserPagingSource) this.A05, this);
            case 27:
                A01(obj, this);
                return ((SavedMediaMetadataService) this.A05).A02((C349307zv) null, this);
            case 28:
                A01(obj, this);
                return ((ClipsRemixOriginalMediaRepository) this.A05).A00((String) null, (String) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return ((SfxAudioRepository) this.A05).A00((String) null, this);
            case 30:
                A01(obj, this);
                return ((H2Q) this.A05).A05((String) null, (String) null, this);
            case 31:
                A01(obj, this);
                return ((H2Q) this.A05).A05((String) null, (String) null, this);
            case 32:
                A01(obj, this);
                return ((PagingSource) this.A05).A04((LCU) null, this);
            case 33:
                A01(obj, this);
                return ((EmojiPongRepository) this.A05).A01((String) null, (String) null, this, (String[]) null);
            case 34:
                A01(obj, this);
                return ((DirectShareSheetFragmentViewModel) this.A05).A0C((C48091EVj) null, (String) null, this);
            case 35:
                A01(obj, this);
                return ((GraphqlOptimisticPostOperation) this.A05).A02((NotesApi) null, (List) null, this);
            case 36:
                A01(obj, this);
                return ((MagicMediaRemixContentCompositor) this.A05).A03((AnonymousClass4DH) null, (IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response) null, (C381559bx) null, (List) null, this);
            case 37:
                A01(obj, this);
                return ((MsysMessageEditor) this.A05).A00((AnonymousClass9HR) null, (String) null, (String) null, this);
            case 38:
                A01(obj, this);
                return ((DirectTabbedEmojiReactionRepository) this.A05).A01((String) null, (String) null, (String) null, (String) null, this);
            case 39:
                A01(obj, this);
                return ArmadilloExpressNoteReplySender.A02((N1Z) null, (ArmadilloExpressNoteReplySender) this.A05, (1kF) null, this);
            case 40:
                A01(obj, this);
                return ArmadilloExpressStorySender.A00((N1Z) null, (ArmadilloExpressStorySender) this.A05, (C65481cr) null, this);
            case Seq.NULL_REFNUM:
                A01(obj, this);
                return AnonymousClass92U.A02((AnonymousClass92U) this.A05, (AnonymousClass92T) null, (List) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A01(obj, this);
                return C332407Ux.A01((C332407Ux) this.A05, (String) null, this);
            case 43:
                A01(obj, this);
                return ((FanClubConsiderationRepository) this.A05).A00((Boolean) null, (Boolean) null, (String) null, this);
            case 44:
                A01(obj, this);
                return FlashMediaCacheImpl.A03((FlashMediaCacheImpl) this.A05, (AnonymousClass93C) null, (List) null, this);
            case 45:
                A01(obj, this);
                return FlashMediaCacheImpl.A05((FlashMediaCacheImpl) this.A05, this);
            case 46:
                A01(obj, this);
                return FlashMediaCacheImpl.A00((1Xj) null, (FlashMediaCacheImpl) this.A05, (AnonymousClass93C) null, this);
            case 47:
                A01(obj, this);
                return FxSsoViewModel.A00((Context) null, (Bundle) null, (0lg) null, (FxSsoViewModel) this.A05, this);
            case 48:
                A01(obj, this);
                return GenAIImageService.A05((GenAIImageService) this.A05, (LG0) null, (L1Y) null, this);
            default:
                A01(obj, this);
                return GenAIImageService.A04((GenAIImageService) this.A05, (LG0) null, (KS4) null, this);
        }
    }

    public static void A00(Object obj, Object obj2, Object obj3, MED med, int i) {
        med.A01 = obj;
        med.A02 = obj2;
        med.A03 = obj3;
        med.A00 = i;
    }

    public static void A01(Object obj, MED med) {
        med.A04 = obj;
        med.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A04(int i, Object obj) {
        if (!(obj instanceof MED) || ((MED) obj).A06 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MED(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A05 = obj;
    }
}
