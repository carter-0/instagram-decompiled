package X;

import android.graphics.Bitmap;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveShareRepository;
import com.instagram.wellbeing.upsells.fragment.directmessage.DirectMessageSettingsRepository;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.api.WallUserApi;
import com.instagram.zero.main.IgZeroMain;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;
import com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository;
import com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import go.Seq;
import java.util.List;
import java.util.Set;
import org.webrtc.EglBase14Impl;

public final class ME5 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r11v0, types: [X.ME5, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A02(obj, this);
                return ((IgLiveBroadcastSettingsRepository) this.A02).A00((IGLiveBadgeSettings) null, (String) null, this);
            case 1:
                A02(obj, this);
                return ((IgLiveBroadcastSettingsRepository) this.A02).A01((String) null, this, false);
            case 2:
                A02(obj, this);
                return ((IgLiveBroadcastSettingsRepository) this.A02).A02((String) null, this, false);
            case 3:
                A02(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A05((Set) null, this);
            case 4:
                A02(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A00((User) null, this);
            case 5:
                A02(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A04((C62467KgH) null, (String) null, this);
            case 6:
                A02(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A01((User) null, this);
            case 7:
                A02(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A03((Set) null, this, false, false);
            case 8:
                A02(obj, this);
                return ((IgLiveCommentsRepository) this.A02).A0F((String) null, (String) null, this);
            case 9:
            case 22:
            case 26:
            case 27:
                return ((MCl) A00(obj, this)).emit((Object) null, this);
            case 10:
            case 23:
            case 24:
            case 25:
                return ((MCk) A00(obj, this)).emit((Object) null, this);
            case 11:
                A02(obj, this);
                return ((IgLiveModerationRepository) this.A02).A02((String) null, (String) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A02(obj, this);
                return ((IgLiveModerationRepository) this.A02).A03((String) null, this);
            case 13:
                A02(obj, this);
                return ((IgLiveQuestionsRepository) this.A02).A02((String) null, this, 0);
            case 14:
                A02(obj, this);
                return ((IgLiveQuestionsRepository) this.A02).A04((String) null, this, 0);
            case 15:
                A02(obj, this);
                return ((IgLiveQuestionsRepository) this.A02).A00((String) null, (String) null, this);
            case 16:
                A02(obj, this);
                return ((IgLiveQuestionsRepository) this.A02).A06((String) null, this, 0);
            case 17:
                A02(obj, this);
                return ((IgLiveSchedulingRepository) this.A02).A01((AnonymousClass3NV) null, (String) null, (String) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A02(obj, this);
                return ((IgLiveSchedulingRepository) this.A02).A02((String) null, this);
            case 19:
                A02(obj, this);
                return ((IgLiveSchedulingRepository) this.A02).A00((AnonymousClass3NV) null, (String) null, (String) null, (String) null, this);
            case 20:
                A02(obj, this);
                return ((IgLiveSchedulingRepository) this.A02).A03(this);
            case 21:
                A02(obj, this);
                return ((IgLiveShareRepository) this.A02).A00((String) null, (String) null, this);
            case 28:
                A02(obj, this);
                return DirectMessageSettingsRepository.A00((DirectMessageSettingsRepository) this.A02, this);
            case 32:
                A02(obj, this);
                return ((WallApiGraphQLImpl) this.A02).A03((String) null, this);
            case 33:
                A02(obj, this);
                return ((WallApiGraphQLImpl) this.A02).A01((C61046Jvk) null, (String) null, this);
            case 34:
                A02(obj, this);
                return ((WallUserApi) this.A02).A00((UserSession) null, (String) null, this);
            case 35:
            case 36:
                return ((C58038IkW) A00(obj, this)).emit((Object) null, this);
            case 37:
                A02(obj, this);
                return ((IgZeroMain) this.A02).A02((String) null, this);
            case 38:
                A02(obj, this);
                return ((IgZeroMain) this.A02).A03((String) null, this);
            case 39:
                A02(obj, this);
                return IgZeroMain.A00((IgZeroMain) this.A02, this);
            case 40:
                A02(obj, this);
                return ((C73525PeH) this.A02).A00(this, (C69283Nij) null);
            case Seq.NULL_REFNUM:
                return ((C58036IkU) A00(obj, this)).emit((Object) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A02(obj, this);
                return ((ImagineGenerationImageRepository) this.A02).A01((HMN) null, (String) null, (String) null, this);
            case 43:
                A02(obj, this);
                return ((MEmuDataRepository) this.A02).A01((String) null, (String) null, (List) null, this, false, false);
            case 44:
                A02(obj, this);
                return ((MEmuDataRepository) this.A02).A00((Bitmap) null, this);
            case 45:
                A02(obj, this);
                return ((MEmuNetworkService) this.A02).A03(this, (AnonymousClass62P) null);
            case 46:
                A02(obj, this);
                return ((MEmuNetworkService) this.A02).A01((Bitmap) null, this);
            case 47:
                A02(obj, this);
                return ((ImagineNetworkService) this.A02).A07((String) null, this);
            case 48:
                A02(obj, this);
                return ((ImagineNetworkService) this.A02).A08((String) null, this);
            default:
                return ((DIJ) A00(obj, this)).emit((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME5(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static Object A00(Object obj, ME5 me5) {
        me5.A02 = obj;
        me5.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return me5.A01;
    }

    public static ME5 A01(Object obj, AnonymousClass4D7 r3, int i) {
        return new ME5(obj, r3, i, 42);
    }

    public static void A02(Object obj, ME5 me5) {
        me5.A01 = obj;
        me5.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof ME5) || ((ME5) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME5(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
