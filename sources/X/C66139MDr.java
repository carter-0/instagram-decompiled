package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler;
import com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository;
import com.instagram.sponsored.asyncads.requestpathsignals.persistence.QSRealtimeSignalRoom;
import com.instagram.spotlight.fetch.SpotlightFetchRepository;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import com.instagram.stickersearch.api.ODRAvatarStickerRepository;
import com.instagram.trials.impl.TrialsPreferencesImpl;
import com.instagram.user.userlist.data.LikesListRemoteDataSource;
import com.instagram.user.userlist.data.LikesListRepository;
import com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;
import com.instagram.wellbeing.equity.diversity.DiversityInfoRepository;
import com.instagram.zero.cma.CampaignAPITokenFetcher;
import com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository;
import com.instagram.zero.headers.IGZeroHeadersPing;
import com.instagram.zero.zbd.ZeroBalanceDetectionIg4aHttpRequest;
import com.meta.compose.material.bottomsheet.AnchoredDraggableState;
import com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;
import com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.promptsheet.creation.impl.data.PromptSheetAIRepository;
import com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel;
import go.Seq;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDr  reason: case insensitive filesystem */
public final class C66139MDr extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.MDr, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A04) {
            case 0:
                A00(obj, this);
                return C64185LSs.A00(this.A03, this);
            case 1:
                A00(obj, this);
                return C64185LSs.A00(this.A03, this);
            case 2:
                A00(obj, this);
                return SettingsScreenViewModel.A01((C64185LSs) null, (SettingsScreenViewModel) this.A03, this);
            case 3:
                A00(obj, this);
                return ((SaveStoryToGalleryCustomStorageHandler) this.A03).A00(this, false);
            case 4:
                A00(obj, this);
                return ((FeaturedProductsMediaFeedRepository) this.A03).A00(this);
            case 5:
                A00(obj, this);
                return ((QSRealtimeSignalRoom) this.A03).A00((Collection) null, this, 0);
            case 6:
                A00(obj, this);
                return SpotlightFetchRepository.A00((SpotlightFetchRepository) this.A03, this);
            case 7:
                A00(obj, this);
                return ((AvatarStickerPreRenderInteractor) this.A03).A05(this);
            case 8:
                A00(obj, this);
                return ((ODRAvatarStickerRepository) this.A03).A00((String) null, (String) null, this);
            case 9:
                A00(obj, this);
                return ((ODRAvatarStickerRepository) this.A03).A01((String) null, (String) null, this);
            case 10:
                A00(obj, this);
                return ((TrialsPreferencesImpl) this.A03).A02(this);
            case 11:
                A00(obj, this);
                return LikesListRemoteDataSource.A00((C74528PwN) null, (UserSession) null, (LikesListRemoteDataSource) this.A03, this, 0);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A00(obj, this);
                return ((LikesListRepository) this.A03).A04((C72764PJa) null, this);
            case 13:
                this.A03 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return IgLiveBroadcastInfoKt.A01((UserSession) null, (C270194gL) null, this);
            case 14:
                A00(obj, this);
                return ((IgLiveCobroadcastRepository) this.A03).A02((Integer) null, (String) null, (String) null, this, 0);
            case 15:
                A00(obj, this);
                return ((IgLiveCommentsRepository) this.A03).A0H(this);
            case 16:
                A00(obj, this);
                return ((IgLiveExploreRepository) this.A03).A03(this);
            case 17:
                A00(obj, this);
                return IgLiveJoinRequestsRepository.A00((IgLiveJoinRequestsRepository) this.A03, (String) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A00(obj, this);
                return ((IgLiveModerationRepository) this.A03).A00((String) null, (String) null, this);
            case 19:
                A00(obj, this);
                return ((IgLiveQuestionsRepository) this.A03).A03((String) null, this, 0);
            case 20:
                A00(obj, this);
                return ((IgLiveQuestionsRepository) this.A03).A01((String) null, this);
            case 21:
                A00(obj, this);
                return IgLiveViewerJoinFlowRepository.A00((IgLiveViewerJoinFlowRepository) this.A03, (String) null, this);
            case 22:
                A00(obj, this);
                return ((IgLiveViewerJoinFlowRepository) this.A03).A02((String) null, this);
            case 23:
                A00(obj, this);
                return ((IgLiveViewerJoinFlowRepository) this.A03).A03((String) null, this);
            case 24:
                A00(obj, this);
                return IgLiveViewerLikesViewModel.A00((IgLiveViewerLikesViewModel) this.A03, this);
            case 25:
                A00(obj, this);
                return DiversityInfoRepository.A02((DiversityInfoRepository) this.A03, this);
            case 26:
                A00(obj, this);
                return DiversityInfoRepository.A00((2IV) null, (DiversityInfoRepository) this.A03, this);
            case 27:
                A00(obj, this);
                return CampaignAPITokenFetcher.A01((CampaignAPITokenFetcher) this.A03, this);
            case 28:
                A00(obj, this);
                return IgZeroDogfoodingEasyRepository.A00((IgZeroDogfoodingEasyRepository) this.A03, (1RA) null, (1RA) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A00(obj, this);
                return ((IGZeroHeadersPing) this.A03).A00(this, (ONQ) null);
            case 30:
                A00(obj, this);
                return ZeroBalanceDetectionIg4aHttpRequest.A00((ZeroBalanceDetectionIg4aHttpRequest) this.A03, this, (C56066HsF) null);
            case 31:
                A00(obj, this);
                return ((AnchoredDraggableState) this.A03).A06((C54609HKs) null, this, (0sK) null);
            case 32:
                A00(obj, this);
                return ((AnchoredDraggableState) this.A03).A05((C54609HKs) null, (Object) null, this, (0sJ) null);
            case 33:
                A00(obj, this);
                return ((ImagineEditRepository) this.A03).A02((String) null, this);
            case 34:
                A00(obj, this);
                return ((ImagineGenerationImageRepository) this.A03).A02((String) null, this);
            case 35:
                A00(obj, this);
                return ImagineGenerationImageRepository.A00((ImagineGenerationImageRepository) this.A03, (Integer) null, (String) null, (String) null, (String) null, this, false);
            case 36:
                A00(obj, this);
                return ((MEmuNetworkService) this.A03).A02((String) null, (String) null, this, (AnonymousClass62P) null, false);
            case 37:
                A00(obj, this);
                return ImagineNetworkService.A04((ImagineNetworkService) this.A03, (C56146HtY) null, (String) null, this);
            case 38:
                A00(obj, this);
                return ImagineNetworkService.A00((HMY) null, (ImagineNetworkService) this.A03, (C56146HtY) null, (C56146HtY) null, this);
            case 39:
                A00(obj, this);
                return ((PromptSheetAIRepository) this.A03).A00((C56088Hsb) null, this);
            case 40:
                A00(obj, this);
                return PromptSheetAIViewModel.A01((PromptSheetAIViewModel) this.A03, (List) null, this, (C62320sa) null);
            case Seq.NULL_REFNUM:
                A00(obj, this);
                return PromptSheetAIViewModel.A00((PromptSheetAIViewModel) this.A03, (PromptSheetAIViewModel) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A00(obj, this);
                return C60297Jiv.A00((C60297Jiv) this.A03, (Map) null, this);
            case 43:
                A00(obj, this);
                return ((I7H) this.A03).A09((Context) null, (C53452Gok) null, (UserSession) null, this);
            case 44:
                A00(obj, this);
                return C53021GhC.A00((C53021GhC) this.A03, this);
            case 45:
                A00(obj, this);
                return C60317JjL.A01((C60317JjL) this.A03, this);
            default:
                A00(obj, this);
                return C60317JjL.A02((C60317JjL) this.A03, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66139MDr(AnonymousClass4D7 r2) {
        super(r2);
        this.A04 = 13;
    }

    public static void A00(Object obj, C66139MDr mDr) {
        mDr.A02 = obj;
        mDr.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66139MDr) || ((C66139MDr) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66139MDr(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A03 = obj;
    }
}
