package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource;
import com.instagram.nido.impl.explore.api.NidoRequests;
import com.instagram.nme.contextualpromo.ContextualPromoHelper$Companion$getDefaultImageFetcher$1;
import com.instagram.nux.aymh.loginhandlers.CredentialsLoginHandler;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.ndx.api.NDXIGStepsAPI;
import com.instagram.nux.ndx.util.NdxStepsFetcher;
import com.instagram.payout.api.PayoutApi;
import com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper;
import com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper$getBoolean$$inlined$map$1$2;
import com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper$getInt$$inlined$map$1$2;
import com.instagram.preferences.common.async.NuxDisabledAsyncKeyValueStore$getBoolean$$inlined$map$1$2;
import com.instagram.preferences.common.async.NuxDisabledAsyncKeyValueStore$getLong$$inlined$map$1$2;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapCaptureViewModel$special$$inlined$filter$1$2;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository;
import go.Seq;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

public final class ME6 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME6(AnonymousClass4D7 r2) {
        super(r2);
        this.A03 = 41;
    }

    public static void A00(Object obj, ME6 me6) {
        me6.A01 = obj;
        me6.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A01(Object obj, ME6 me6) {
        me6.A02 = obj;
        me6.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof ME6) || ((ME6) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.ME6, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
            case 2:
            case 4:
                A01(obj, this);
                return ((C51632FxQ) this.A01).emit((Object) null, this);
            case 1:
            case 5:
            case 9:
            case 10:
            case 14:
            case 28:
                A01(obj, this);
                return ((C51630FxO) this.A01).emit((Object) null, this);
            case 3:
                A00(obj, this);
                return ((SpamFollowRequestsNetworkDataSource) this.A02).AOR(this);
            case 6:
                A00(obj, this);
                return ((NidoRequests) this.A02).A01((UserSession) null, this);
            case 7:
                A00(obj, this);
                return ((NidoRequests) this.A02).A00((UserSession) null, (String) null, this);
            case 8:
                A00(obj, this);
                return ((ContextualPromoHelper$Companion$getDefaultImageFetcher$1) this.A02).A00((String) null, this);
            case 11:
            case 19:
            case 23:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 34:
            case 36:
            case 38:
                A01(obj, this);
                return ((C51629FxN) this.A01).emit((Object) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 39:
                A01(obj, this);
                return ((MCm) this.A01).emit((Object) null, this);
            case 13:
                A00(obj, this);
                return ((CredentialsLoginHandler) this.A02).A00((C15050ULg) null, (0lg) null, (String) null, (String) null, this);
            case 15:
                A00(obj, this);
                return AymhViewModel.A00((AnonymousClass0aP) null, (AymhViewModel) this.A02, (C239803Ii) null, this);
            case 16:
                A00(obj, this);
                return ((NDXIGStepsAPI) this.A02).A00((UserSession) null, (String) null, this, 0);
            case 17:
                A00(obj, this);
                return ((NdxStepsFetcher) this.A02).A00(0, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return ((MCf) this.A01).emit((Object) null, this);
            case 20:
                A01(obj, this);
                return ((AnonymousClass9NG) this.A01).emit((Object) null, this);
            case 21:
                A00(obj, this);
                return ((PayoutApi) this.A02).A00((String) null, this);
            case 22:
                A00(obj, this);
                return ((ConfigureAsyncHelper) this.A02).A01((AnonymousClass0iw) null, (LP8) null, this);
            case 25:
                A01(obj, this);
                return ((AsyncKeyValueStoreWrapper$getBoolean$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 26:
                A01(obj, this);
                return ((AsyncKeyValueStoreWrapper$getInt$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 27:
            case 33:
                A01(obj, this);
                return ((MCS) this.A01).emit((Object) null, this);
            case 30:
                A01(obj, this);
                return ((NuxDisabledAsyncKeyValueStore$getBoolean$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 31:
                A01(obj, this);
                return ((C51626FxF) this.A01).emit((Object) null, this);
            case 32:
                A01(obj, this);
                return ((NuxDisabledAsyncKeyValueStore$getLong$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 35:
                A01(obj, this);
                return ((C66116MCa) this.A01).emit((Object) null, this);
            case 37:
                A01(obj, this);
                return ((C41501Av2) this.A01).emit((Object) null, this);
            case 40:
                A00(obj, this);
                return ((IGDevToolPersistentStateHandler) this.A02).CDH((String) null, (Map) null, this);
            case Seq.NULL_REFNUM:
                A01(obj, this);
                return QuickSnapArchiveViewModel.A00((QuickSnapArchiveViewModel) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A01(obj, this);
                return ((QuickSnapCaptureViewModel$special$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 43:
                A01(obj, this);
                return ((MCk) this.A01).emit((Object) null, this);
            case 44:
                A00(obj, this);
                return ((QuickSnapApi) this.A02).A01((String) null, this);
            case 45:
                A00(obj, this);
                return ((QuickSnapApi) this.A02).A03((String) null, this);
            case 46:
                A00(obj, this);
                return ((QuickSnapApi) this.A02).A00((String) null, (String) null, this);
            case 47:
                A00(obj, this);
                return ((QuickSnapRepository) this.A02).A02((List) null, this);
            case 48:
                A00(obj, this);
                return ((QuickSnapMediaSaver) this.A02).A01((List) null, this, 0);
            default:
                A00(obj, this);
                return ((StoryCommentsDashboardRepository) this.A02).A00((String) null, (String) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME6(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME6(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }
}
