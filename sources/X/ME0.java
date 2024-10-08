package X;

import android.content.Context;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.fragment.app.FragmentActivity;
import androidx.paging.PageFetcherSnapshot;
import androidx.work.CoroutineWorker;
import com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl;
import com.facebook.avatar.expresso.graphql.asset.ODRAssetRepository;
import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.avatar.expresso.odr.asset.ODRAssetManager;
import com.facebook.avatar.expresso.odr.assetdownloader.ig.IgODRAssetDownloader;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.logging.LoggingPolicy;
import com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureAnimatedMediaMessageMutationFactory;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.gallery.suggestions.database.SuggestionsDBHelper;
import com.instagram.leadads.repository.LeadFormQuestionsRepository;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.ml.hashtag.IgContextualHashtagsProcessor;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;
import java.io.File;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.webrtc.EglBase14Impl;

public final class ME0 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX WARNING: type inference failed for: r11v0, types: [X.ME0, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A07) {
            case 0:
                this.A06 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return DragGestureDetectorKt.A03((AnonymousClass6GK) null, this, (0sP) null, 0);
            case 1:
                this.A06 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return DragGestureDetectorKt.A04((AnonymousClass6GK) null, this, (0sP) null, 0);
            case 2:
                A01(obj, this);
                return PageFetcherSnapshot.A05((PageFetcherSnapshot) this.A06, this);
            case 3:
                A01(obj, this);
                return ODRController.A03((ODRController) this.A06, (LG2) null, (File) null, (String) null, (String) null, this);
            case 4:
                A01(obj, this);
                return ODRAssetManager.A00((AvatarStickerCacheImpl) null, (ODRAssetManager) this.A06, (String) null, this, (JSONObject) null, (JSONObject) null);
            case 5:
                A01(obj, this);
                return ((IgODRAssetDownloader) this.A06).A00((AvatarStickerCacheImpl) null, (ODRAssetRepository) null, (Map) null, this, (C262094Cc) null);
            case 6:
                A01(obj, this);
                return GoogleAuthController.A02((ActivityResult) null, (FragmentActivity) null, (GoogleAuthController) this.A06, this);
            case 7:
                A01(obj, this);
                return GoogleAuthController.A07((GoogleAuthController) this.A06, this);
            case 8:
                A01(obj, this);
                return GoogleAuthController.A03((FragmentActivity) null, (C10979S3n) null, (C13422Ta8) null, (GoogleAuthController) this.A06, this);
            case 9:
                A01(obj, this);
                return GoogleAuthController.A04((FragmentActivity) null, (C10979S3n) null, (C13422Ta8) null, (GoogleAuthController) this.A06, this);
            case 10:
                A01(obj, this);
                return ECPRepositoryImpl.A01((ECPRepositoryImpl) this.A06, (LoggingPolicy) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, this);
            case 11:
                A01(obj, this);
                return EffectsByIdMetadataService.A01((EffectsByIdMetadataService) this.A06, (C359238cK) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return ((StoriesTemplateParticipationViewModel) this.A06).A00((CreativeConfigIntf) null, (PromptStickerModel) null, (C310416b1) null, this);
            case 13:
                A01(obj, this);
                return ClipsDraftRepository.A04((ClipsDraftRepository) this.A06, (AudioOverlayTrack) null, (String) null, this);
            case 14:
                A01(obj, this);
                return ((FactsRepository) this.A06).A00((C61037Jvb) null, (String) null, (String) null, (String) null, (String) null, this);
            case 15:
                A01(obj, this);
                return ((C62944Kow) this.A06).A00((String) null, this);
            case 16:
                A01(obj, this);
                return DirectConfigureAnimatedMediaMessageMutationProcessor.A00((DirectConfigureAnimatedMediaMessageMutationProcessor) this.A06, (1fV) null, this);
            case 17:
                A01(obj, this);
                return ArmadilloExpressNoteReplySender.A01((N1Z) null, (ArmadilloExpressNoteReplySender) this.A06, (AnonymousClass1kB) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return ((DirectConfigureAnimatedMediaMessageMutationFactory) this.A06).A00((AnonymousClass797) null, (C254703su) null, (C65701gB) null, this);
            case 19:
                A01(obj, this);
                return DirectConfigureMediaMessageMutationFactory.A01((AnonymousClass797) null, (DirectConfigureMediaMessageMutationFactory) this.A06, (1Xj) null, (DirectThreadKey) null, this, false);
            case 20:
                A01(obj, this);
                return FlashMediaCacheImpl.A02((FlashMediaCacheImpl) this.A06, (AnonymousClass9FX) null, (AnonymousClass93C) null, this);
            case 21:
                A01(obj, this);
                return FlashMediaCacheImpl.A01((FlashMediaCacheImpl) this.A06, (AnonymousClass9FX) null, (AnonymousClass9FV) null, (AnonymousClass93C) null, this);
            case 22:
                A01(obj, this);
                return ((FriendMapRepository) this.A06).A05((AnonymousClass4A5) null, this);
            case 23:
                A01(obj, this);
                return ((SuggestionsDBHelper) this.A06).A01((UserSession) null, (List) null, (List) null, this);
            case 24:
                A01(obj, this);
                return LeadFormQuestionsRepository.A02((LeadFormQuestionsRepository) this.A06, (LeadGenFormBaseQuestion) null, (String) null, (String) null, (List) null, this);
            case 25:
                A01(obj, this);
                return ((IgContextualHashtagsProcessor) this.A06).A01((MSY) null, (String) null, this, 0);
            case 26:
                A01(obj, this);
                return OpalAudienceSelectorRepository.A01((OpalAudienceSelectorRepository) this.A06, this);
            case 27:
                A01(obj, this);
                return ((CoroutineWorker) this.A06).A03(this);
            case 28:
                A01(obj, this);
                return IGQuickPromotionFetcherHelper.A00((Context) null, (UserSession) null, (IGQuickPromotionFetcherHelper) this.A06, (QuickPromotionSlot) null, (Map) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return C64185LSs.A00(this.A06, this);
            case 30:
                A01(obj, this);
                return C64185LSs.A00(this.A06, this);
            case 31:
                A01(obj, this);
                return SUPMediaStreamControllerDownloader.A00((Context) null, (UserSession) null, (SUPMediaStreamControllerDownloader) this.A06, this);
            case 32:
                A01(obj, this);
                return UpcomingEventReminderRepository.A01((C45465Cwy) null, (X79) null, (L8U) null, (UpcomingEventReminderRepository) this.A06, this);
            case 33:
                A01(obj, this);
                return ((IgLiveViewerJoinFlowRepository) this.A06).A01((String) null, (String) null, (String) null, this);
            case 34:
                A01(obj, this);
                return ((WriteSuggestionsRepository) this.A06).A02((C56568I1x) null, (String) null, (String) null, this);
            case 35:
                A01(obj, this);
                return ((WriteSuggestionsRepository) this.A06).A04((C56568I1x) null, this);
            case 36:
                A01(obj, this);
                return ((WriteSuggestionsRepository) this.A06).A05(this);
            case 37:
                A01(obj, this);
                return W1J.A00((C20407Wqr) null, this, (W1J) this.A06);
            case 38:
                A01(obj, this);
                return C56662I6r.A00((C56555I1j) null, this, (AnonymousClass2Q9) null, (C56662I6r) this.A06, (C56067HsG) null);
            case 39:
                A01(obj, this);
                return C56662I6r.A01((C56555I1j) null, this, (AnonymousClass2Q9) null, (C56662I6r) this.A06, (C56067HsG) null);
            default:
                A01(obj, this);
                return C56662I6r.A03((C56555I1j) null, this, (C56662I6r) this.A06);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME0(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A07 = i;
        this.A06 = obj;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, ME0 me0) {
        me0.A01 = obj;
        me0.A02 = obj2;
        me0.A03 = obj3;
        me0.A04 = obj4;
    }

    public static void A01(Object obj, ME0 me0) {
        me0.A05 = obj;
        me0.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof ME0) || ((ME0) obj).A07 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME0(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A07 = i;
    }
}
