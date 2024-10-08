package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.trials.impl.TrialsPreferencesImpl;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;
import com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel;
import com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher;
import com.instagram.userpay.api.UserPayApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastInfoApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveExploreLiveApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveFollowStatusApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveHeartbeatApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveNotificationApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveWaveApi;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDu  reason: case insensitive filesystem */
public final class C66142MDu extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r13v0, types: [X.MDu, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A01(obj, this);
                return ((TrialsPreferencesImpl) this.A02).A01(this);
            case 1:
                A01(obj, this);
                return ((TrialsPreferencesImpl) this.A02).A03(this);
            case 2:
                A01(obj, this);
                return ((ClipsTrialBottomSheetRepositoryImpl) this.A02).A01((String) null, (String) null, this);
            case 3:
                A01(obj, this);
                return ((ClipsTrialBottomSheetRepositoryImpl) this.A02).A02((String) null, (String) null, this);
            case 4:
                A01(obj, this);
                return ((ClipsTrialBottomSheetRepositoryImpl) this.A02).A00((MediaTrialGraduationStrategy) null, (String) null, this);
            case 5:
                A01(obj, this);
                return ((ClipsTrialBottomSheetRepositoryImpl) this.A02).A03((String) null, this);
            case 6:
                A01(obj, this);
                return ClipsTrialBottomSheetViewModel.A00((ClipsTrialBottomSheetViewModel) this.A02, this);
            case 7:
                A01(obj, this);
                return MessagingAdInspirationDataFetcher.A00((UserSession) null, (MessagingAdInspirationDataFetcher) this.A02, this);
            case 9:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((C58034IkS) this.A01).emit((Object) null, this);
            case 10:
                A01(obj, this);
                return ((UserPayApi) this.A02).A00(this);
            case 11:
                A01(obj, this);
                return ((IgLiveBroadcastInfoApi) this.A02).A00((String) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A01((String) null, this);
            case 13:
                A01(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A02((String) null, this);
            case 14:
                A01(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A03((String) null, this);
            case 15:
                A01(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A00((IGLiveBadgeSettings) null, (String) null, this);
            case 16:
                A01(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A04((String) null, this);
            case 17:
                A01(obj, this);
                return ((IgLiveCommentsApi) this.A02).A00((M0V) null, (String) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return ((IgLiveCommentsApi) this.A02).A01((String) null, (String) null, (String) null, (List) null, this, 0, 0, 0, 0);
            case 19:
                A01(obj, this);
                return ((IgLiveCommentsApi) this.A02).A02((String) null, (String) null, this);
            case 20:
                A01(obj, this);
                return ((IgLiveCommentsApi) this.A02).A05((String) null, (String) null, this, 0);
            case 21:
                A01(obj, this);
                return ((IgLiveCommentsApi) this.A02).A03((String) null, (String) null, this);
            case 22:
                A01(obj, this);
                return ((IgLiveCommentsApi) this.A02).A06((String) null, (String) null, this, 0);
            case 23:
                A01(obj, this);
                return ((IgLiveCommentsApi) this.A02).A04((String) null, (String) null, this);
            case 24:
                A01(obj, this);
                return ((IgLiveExploreLiveApi) this.A02).A00(this, false);
            case 25:
                A01(obj, this);
                return ((IgLiveFollowStatusApi) this.A02).A00((String) null, this);
            case 26:
                A01(obj, this);
                return ((IgLiveHeartbeatApi) this.A02).A01((String) null, this, 0);
            case 27:
                A01(obj, this);
                return ((IgLiveJoinRequestsApi) this.A02).A00((String) null, this);
            case 28:
                A01(obj, this);
                return ((IgLiveJoinRequestsApi) this.A02).A01((String) null, this, 0, 0);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return ((IgLiveLikesApi) this.A02).A00((C62876Knq) null, (String) null, this);
            case 30:
                A01(obj, this);
                return ((IgLiveModerationApi) this.A02).A00((String) null, (String) null, this);
            case 31:
                A01(obj, this);
                return ((IgLiveModerationApi) this.A02).A01((String) null, (String) null, this);
            case 32:
                A01(obj, this);
                return ((IgLiveModerationApi) this.A02).A02((String) null, (String) null, this);
            case 33:
                A01(obj, this);
                return ((IgLiveModerationApi) this.A02).A03((String) null, (String) null, this);
            case 34:
                A01(obj, this);
                return ((IgLiveModerationApi) this.A02).A04((String) null, this);
            case 35:
                A01(obj, this);
                return ((IgLiveNotificationApi) this.A02).A00(this, false);
            case 36:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A02((String) null, this, 0);
            case 37:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A03((String) null, this, 0);
            case 38:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A01((String) null, this);
            case 39:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A04((String) null, this, 0);
            case 40:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A05((String) null, this, 0);
            case Seq.NULL_REFNUM:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A00((String) null, (String) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A07((String) null, this, false);
            case 43:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A06((String) null, this, 0);
            case 44:
                A01(obj, this);
                return ((IgLiveSchedulingApi) this.A02).A01((AnonymousClass3NV) null, (String) null, (String) null, this);
            case 45:
                A01(obj, this);
                return ((IgLiveSchedulingApi) this.A02).A02((String) null, this);
            case 46:
                A01(obj, this);
                return ((IgLiveSchedulingApi) this.A02).A00((AnonymousClass3NV) null, (String) null, (String) null, (String) null, this);
            case 47:
                A01(obj, this);
                return ((IgLiveSchedulingApi) this.A02).A03(this);
            case 48:
                A01(obj, this);
                return ((IgLiveWaveApi) this.A02).A00((String) null, (String) null, this);
            default:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((MCl) this.A01).emit((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66142MDu(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static C66142MDu A00(Object obj, AnonymousClass4D7 r3, int i) {
        return new C66142MDu(obj, r3, i, 42);
    }

    public static void A01(Object obj, C66142MDu mDu) {
        mDu.A01 = obj;
        mDu.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C66142MDu) || ((C66142MDu) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66142MDu(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
