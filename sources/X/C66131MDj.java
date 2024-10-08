package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.wellbeing.equity.diversity.DiversityInfoRepository;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.repository.WallPostComposerRepository;
import com.instagram.wonderwall.repository.WallPostRepository;
import com.instagram.xme.threed.repository.Xme3dMediaRepository;
import com.meta.analytics.gnv.vista.core.VistaViewPoint;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.vault.service.base.DefaultVaultService;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDj  reason: case insensitive filesystem */
public final class C66131MDj extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.MDj, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        A00(obj, this);
        switch (i) {
            case 0:
                return ((IgLiveCommentsRepository) this.A05).A0D((M0V) null, (String) null, this, 0);
            case 1:
                return ((IgLiveCommentsRepository) this.A05).A0E((M0V) null, (String) null, this, 0);
            case 2:
                return IgLiveCommentsRepository.A01((C61289K1a) null, (IgLiveCommentsRepository) this.A05, this);
            case 3:
                return ((IgLiveExploreRepository) this.A05).A02(this);
            case 4:
                return ((IgLiveJoinRequestsRepository) this.A05).A01((String) null, this);
            case 5:
                return ((IgLiveJoinRequestsRepository) this.A05).A02((String) null, this);
            case 6:
                return IgLiveLikesRepository.A00((L7G) null, (IgLiveLikesRepository) this.A05, this);
            case 7:
                return ((IgLiveLikesRepository) this.A05).A01((C62876Knq) null, this);
            case 8:
                return ((IgLiveModerationRepository) this.A05).A01((String) null, (String) null, this);
            case 9:
                return ((DiversityInfoRepository) this.A05).A04((String) null, this);
            case 10:
                return DiversityInfoRepository.A01((DiversityInfoRepository) this.A05, (String) null, this);
            case 11:
                return ((DiversityInfoRepository) this.A05).A05((List) null, (String) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((WallApiGraphQLImpl) this.A05).A04((String) null, this);
            case 13:
                return ((WallApiGraphQLImpl) this.A05).A05((String) null, this);
            case 14:
                return ((WallPostComposerRepository) this.A05).A00((AudioOverlayTrack) null, this);
            case 15:
                return ((WallPostRepository) this.A05).A02((WallPostItem) null, this);
            case 16:
                return Xme3dMediaRepository.A00((UserSession) null, (AnonymousClass6WO) null, (Xme3dMediaRepository) this.A05, (String) null, this);
            case 17:
                return VistaViewPoint.A00((VistaViewPoint) this.A05, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return ((C58034IkS) this.A05).A00((Map) null, this);
            case 19:
                return ImagineNetworkService.A01((HMY) null, (ImagineNetworkService) this.A05, (C56146HtY) null, this);
            case 20:
                return ImagineNetworkService.A03((HMY) null, (ImagineNetworkService) this.A05, (String) null, this, 0);
            case 21:
                return ((DefaultVaultService) this.A05).A00((FragmentActivity) null, this);
            case 22:
                return ((C58036IkU) this.A05).A02((C239803Ii) null, this);
            case 23:
                return ((C58035IkT) this.A05).emit((CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState) null, this);
            case 24:
                return I75.A01((I75) this.A05, (String) null, (List) null, this);
            case 25:
                return C57689Ies.A00((AnonymousClass371) null, (C267324bN) null, (C57689Ies) this.A05, (String) null, this);
            case 26:
                return I66.A00((UserSession) null, (I66) this.A05, (String) null, (String) null, this);
            case 27:
                return C53057Ghp.A00((C53057Ghp) this.A05, (String) null, this, (0sL) null);
            case 28:
                return ((C71079Oay) this.A05).A03((String) null, (String) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return C56662I6r.A02((C56555I1j) null, this, (C56662I6r) this.A05);
            default:
                return ((C56662I6r) this.A05).A06(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66131MDj(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A05 = obj;
    }

    public static void A00(Object obj, C66131MDj mDj) {
        mDj.A03 = obj;
        mDj.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66131MDj) || ((C66131MDj) obj).A04 != i) {
            return false;
        }
        return true;
    }
}
