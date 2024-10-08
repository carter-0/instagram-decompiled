package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.login.credentialmanager.CredentialManagerSaveHelper;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.ml.audiotranscription.CalDownloader;
import com.instagram.ml.remotepresence.RpModelDownloadManager;
import com.instagram.moments.data.StandaloneMomentsDataSource;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder;
import com.instagram.opal.impl.data.OpalEditRepository;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.opal.impl.data.OpalRepository;
import com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor;
import com.instagram.pendingmedia.service.impl.MediaUploader;
import com.instagram.pendingmedia.service.impl.PendingMediaWorker;
import com.instagram.pendingmedia.service.impl.ShareSpinnableClipHelper;
import com.instagram.pendingmedia.service.upload.UploadAudioStep;
import com.instagram.pendingmedia.service.upload.UploadImageStep;
import com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader;
import com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep;
import com.instagram.profile.productsonprofile.producttab.ui.ProductTabRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.repository.common.MemoryCache;
import com.instagram.security.attestation.playintegrity.worker.IgPlayIntegrityAttestationUtils;
import com.instagram.settings2.core.data.SettingsRepository;
import com.instagram.settings2.core.session.AbstractValueResolverImpl;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.share.facebook.upsell.data.CLNoticeRepository;
import com.instagram.stickersearch.api.AvatarStickerGraphQLApi;
import com.instagram.stickersearch.api.AvatarStickerSearchRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import go.Seq;
import java.util.Collection;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class ME9 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARNING: type inference failed for: r12v0, types: [X.ME9, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                A02(obj, this);
                return CredentialManagerSaveHelper.A00((CredentialManagerSaveHelper) this.A04, (C49371EuZ) null, (String) null, (String) null, this);
            case 1:
                A02(obj, this);
                return 1Vd.A00((1Vd) this.A04, (Collection) null, this);
            case 2:
                A02(obj, this);
                return ((MediaKitRepository) this.A04).A09((C61220JzD) null, this);
            case 3:
                A02(obj, this);
                return ((C66116MCa) this.A04).A00((MQ0) null, this);
            case 4:
                A02(obj, this);
                return ((MediaKitRepository) this.A04).A08((MediaKitVisibility) null, this);
            case 5:
                A02(obj, this);
                return ((CalDownloader) this.A04).A00((UserSession) null, (AnonymousClass930) null, this);
            case 6:
                A02(obj, this);
                return ((RpModelDownloadManager) this.A04).A02((List) null, this);
            case 7:
                A02(obj, this);
                return StandaloneMomentsDataSource.A01((StandaloneMomentsDataSource) this.A04, this);
            case 8:
                A02(obj, this);
                return ((OnboardingRepository) this.A04).A02((UserMonetizationProductType) null, this);
            case 9:
                A02(obj, this);
                return FollowRequestsRepository.A00((C47170Drl) null, (FollowRequestsRepository) this.A04, this);
            case 10:
                A02(obj, this);
                return ActivityFeedViewModel.A00((C283155Gi) null, (ActivityFeedViewModel) this.A04, this);
            case 11:
                A02(obj, this);
                return ((HandlerExecutorAndBuilder) this.A04).A01(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A02(obj, this);
                return ((OpalEditRepository) this.A04).A02((OpalProfileData) null, this);
            case 13:
                A02(obj, this);
                return ((OpalRepository) this.A04).A03((OpalProfileData) null, this);
            case 14:
                A02(obj, this);
                return ((AnonymousClass9NG) this.A04).A00(this);
            case 15:
                A02(obj, this);
                return MediaUploader.A00((LP8) null, (MediaUploader) this.A04, this);
            case 16:
                A02(obj, this);
                return PendingMediaWorker.A01((AnonymousClass3Q2) null, (ConcurrentUploadQueueProcessor) null, (PendingMediaWorker) this.A04, (String) null, this);
            case 17:
                A02(obj, this);
                return ((ShareSpinnableClipHelper) this.A04).A00((LP8) null, this, (C249523jv) null);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A02(obj, this);
                return UploadAudioStep.A02((LP8) null, (UploadAudioStep) this.A04, this);
            case 19:
                A02(obj, this);
                return ((UploadImageStep) this.A04).FIH((LP8) null, this);
            case 20:
                A02(obj, this);
                return ((ArmadilloExpressMediaUploader) this.A04).A00((LP8) null, this);
            case 21:
                A02(obj, this);
                return ((ArmadilloExpressUploadMediaStep) this.A04).FIH((LP8) null, this);
            case 22:
                A02(obj, this);
                return ((ProductTabRepository) this.A04).A00((C63741L4z) null, (String) null, this, 0);
            case 23:
                A02(obj, this);
                return ((QuickSnapRepository) this.A04).A01((String) null, this);
            case 24:
                A02(obj, this);
                return ((MemoryCache) this.A04).A02((Object) null, this, (0sP) null);
            case 25:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return IgPlayIntegrityAttestationUtils.A00((Context) null, (1Ln) null, (0lg) null, (String) null, this, (C262094Cc) null, 0, false);
            case 26:
                A02(obj, this);
                return ((SettingsRepository) this.A04).A05((C61079JwH) null, this);
            case 27:
                A02(obj, this);
                return ((SettingsRepository) this.A04).A07((C61079JwH) null, this);
            case 28:
                A02(obj, this);
                return C64185LSs.A00(this.A04, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A02(obj, this);
                return C64185LSs.A00(this.A04, this);
            case 30:
                A02(obj, this);
                return C64185LSs.A00(this.A04, this);
            case 31:
                A02(obj, this);
                return C64185LSs.A00(this.A04, this);
            case 32:
                A02(obj, this);
                return C64185LSs.A00(this.A04, this);
            case 33:
                A02(obj, this);
                return C64185LSs.A00(this.A04, this);
            case 34:
                A02(obj, this);
                return C64185LSs.A00(this.A04, this);
            case 35:
                A02(obj, this);
                return ((AbstractValueResolverImpl) this.A04).A01((C64185LSs) null, this);
            case 36:
                A02(obj, this);
                return ((AbstractValueResolverImpl) this.A04).A00((C61079JwH) null, this, (C62230ry) null);
            case 37:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ScreenModelExtensionsKt.A01((C61059Jvx) null, (SettingsSession) null, (SettingsScreenViewModel) null, (C21251XQw) null, (I4T) null, this, false);
            case 38:
                A02(obj, this);
                return SettingsScreenViewModel.A02((SettingsScreenViewModel) this.A04, (C66460MSo) null, this);
            case 39:
                A02(obj, this);
                return ((CLNoticeRepository) this.A04).A00(this);
            case 40:
                A02(obj, this);
                return LS6.A01((LS6) this.A04, (Collection) null, this, 0);
            case Seq.NULL_REFNUM:
                A02(obj, this);
                return LS6.A00((LS6) this.A04, (Collection) null, (Collection) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A02(obj, this);
                return ((AvatarStickerGraphQLApi) this.A04).A00((C61082JwK) null, (C317846nw) null, (C317866ny) null, (Integer) null, this, false);
            case 43:
                A02(obj, this);
                return ((MCk) this.A04).A02((C61076JwE) null, this);
            case 44:
                A02(obj, this);
                return ((AvatarStickerSearchRepository) this.A04).A00((C61076JwE) null, this);
            case 45:
                A02(obj, this);
                return ((AvatarStickerSearchRepository) this.A04).A01((C317846nw) null, (String) null, this);
            case 46:
                A02(obj, this);
                return ((IgLiveCommentsRepository) this.A04).A0B((M0V) null, (String) null, this);
            case 47:
                A02(obj, this);
                return IgLiveCommentsRepository.A05((IgLiveCommentsRepository) this.A04, this);
            case 48:
                A02(obj, this);
                return ((IgLiveCommentsRepository) this.A04).A0G((String) null, this);
            default:
                A02(obj, this);
                return IgLiveCommentsRepository.A06((IgLiveCommentsRepository) this.A04, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME9(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A04 = obj;
    }

    public static ME9 A00(Object obj, AnonymousClass4D7 r2, int i) {
        return new ME9(obj, r2, i);
    }

    public static void A01(Object obj, Object obj2, ME9 me9, int i) {
        me9.A01 = obj;
        me9.A02 = obj2;
        me9.A00 = i;
    }

    public static void A02(Object obj, ME9 me9) {
        me9.A03 = obj;
        me9.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof ME9) || ((ME9) obj).A05 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME9(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A05 = i;
    }
}
