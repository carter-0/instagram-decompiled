package X;

import android.content.Context;
import androidx.work.CoroutineWorker;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.mediakit.repository.upload.MediaKitUploadApi;
import com.instagram.ml.hashtag.IgContextualHashtagsProcessor;
import com.instagram.newsfeed.followrequests.data.FollowRequestsActionDataSource;
import com.instagram.opal.impl.data.OpalRepoUtil;
import com.instagram.pendingmedia.service.common.IngestionStepDebugLogger;
import com.instagram.pendingmedia.service.common.ParsingSyncHttpService;
import com.instagram.pendingmedia.service.igapi.ConfigureMediaStep;
import com.instagram.pendingmedia.service.upload.UploadFileStep;
import com.instagram.pendingmedia.service.upload.armadilloexpress.RenderVideoStep;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.security.attestation.keystore.worker.KeyAttestationUtils;
import com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationUtils;
import com.instagram.settings2.core.data.SettingsRepository;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.repository.WallPendingPostManager;
import com.instagram.zero.headers.IGZeroHeadersConfigFetch;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;
import java.util.List;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDz  reason: case insensitive filesystem */
public final class C66147MDz extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX WARNING: type inference failed for: r9v0, types: [X.MDz, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                A01(obj, this);
                return ((IgSignalsClipsOpenTabTracker) this.A05).A00(this, (0sP) null);
            case 1:
                A01(obj, this);
                return ((IGTVSeriesRepository) this.A05).A04((String) null, (String) null, this);
            case 2:
                A01(obj, this);
                return ((MediaKitUploadApi) this.A05).A01((1ua) null, (String) null, this);
            case 3:
                A01(obj, this);
                return MediaKitUploadApi.A00((N4Q) null, (MediaKitUploadApi) this.A05, (1ua) null, this);
            case 4:
                A01(obj, this);
                return ((IgContextualHashtagsProcessor) this.A05).A00((MSY) null, (String) null, this);
            case 5:
                A01(obj, this);
                return ((CoroutineWorker) this.A05).A03(this);
            case 6:
                A01(obj, this);
                return ((FollowRequestsActionDataSource) this.A05).A02((User) null, this, (C62320sa) null, false);
            case 7:
                A01(obj, this);
                return ((FollowRequestsActionDataSource) this.A05).A03((User) null, this, (C62320sa) null, false);
            case 8:
                A01(obj, this);
                return ((OpalRepoUtil) this.A05).A02((UserSession) null, (1vn) null, (String) null, this);
            case 9:
                A01(obj, this);
                return IngestionStepDebugLogger.A00((MU6) null, (IngestionStepDebugLogger) this.A05, (LP8) null, this);
            case 10:
                A01(obj, this);
                return ((ParsingSyncHttpService) this.A05).A02((AnonymousClass1QX) null, (UserSession) null, (1ut) null, this);
            case 11:
                A01(obj, this);
                return ConfigureMediaStep.A00((LP8) null, (ConfigureMediaStep) this.A05, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return UploadFileStep.A00((LP8) null, (UploadFileStep) this.A05, this);
            case 13:
                A01(obj, this);
                return ((RenderVideoStep) this.A05).FIH((LP8) null, this);
            case 14:
                this.A05 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return KeyAttestationUtils.A00((Context) null, (1Ln) null, (0lg) null, (C10320RqI) null, (String) null, (List) null, this, (C262094Cc) null, false);
            case 15:
                this.A05 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return PlayIntegrityAttestationUtils.A00((Context) null, (1Ln) null, (0lg) null, (C10915S0q) null, (String) null, (List) null, this, (C262094Cc) null, false);
            case 16:
                A01(obj, this);
                return ((SettingsRepository) this.A05).A08((MXZ) null, this);
            case 17:
                A01(obj, this);
                return ((SettingsRepository) this.A05).A09((C66570MXa) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                this.A05 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return UiStateKt.A05((C61240JzY) null, (SettingsSession) null, (I4T) null, this);
            case 19:
                A01(obj, this);
                return ((IgLiveCobroadcastRepository) this.A05).A06((Set) null, (Set) null, this);
            case 20:
                A01(obj, this);
                return IgLiveCommentsRepository.A03((IgLiveCommentsRepository) this.A05, (List) null, this, false);
            case 21:
                A01(obj, this);
                return ((WallApiGraphQLImpl) this.A05).A02((WallPostItem) null, (String) null, this);
            case 22:
                A01(obj, this);
                return WallPendingPostManager.A01((WallPostItem) null, (WallPendingPostManager) this.A05, (String) null, this);
            case 23:
                A01(obj, this);
                return ((IGZeroHeadersConfigFetch) this.A05).A00((String) null, (String) null, this);
            case 24:
                A01(obj, this);
                return ((MCf) this.A05).emit((Object) null, this);
            case 25:
                A01(obj, this);
                return ImagineNetworkService.A02((HMY) null, (ImagineNetworkService) this.A05, (Integer) null, (String) null, (String) null, (String) null, this, false);
            case 26:
                A01(obj, this);
                return WriteWithAICreationViewModel.A01((C54562HIx) null, (WriteWithAICreationViewModel) this.A05, (String) null, (String) null, this);
            case 27:
                A01(obj, this);
                return WriteWithAICreationViewModel.A02((WriteWithAICreationViewModel) this.A05, this);
            case 28:
                A01(obj, this);
                return I75.A00((I75) this.A05, (String) null, (List) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return I7H.A03((Context) null, (ClipsDraftPreviewItemRepository) null, (UserSession) null, (I7H) this.A05, (String) null, this);
            case 30:
                A01(obj, this);
                return GLR.A02((C52259GLa) null, (GLR) this.A05, (Boolean) null, this);
            default:
                A01(obj, this);
                return H1U.A00((H1U) this.A05, (String) null, (List) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66147MDz(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A05 = obj;
    }

    public static void A00(Object obj, Object obj2, Object obj3, C66147MDz mDz, int i) {
        mDz.A01 = obj;
        mDz.A02 = obj2;
        mDz.A03 = obj3;
        mDz.A00 = i;
    }

    public static void A01(Object obj, C66147MDz mDz) {
        mDz.A04 = obj;
        mDz.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C66147MDz) || ((C66147MDz) obj).A06 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66147MDz(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A06 = i;
    }
}
