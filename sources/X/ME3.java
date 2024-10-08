package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.util.HallPassApiUtil;
import com.instagram.igtv.live.model.IGTVLiveChannelNetworkDataSource;
import com.instagram.igtv.live.model.IGTVLiveChannelRepository;
import com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.repository.user.UserNetworkDataSource;
import com.instagram.incentiveplatform.api.IncentivePlatformApi;
import com.instagram.leadads.repository.LeadFormRepository;
import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import com.instagram.mainfeed.network.flashfeed.FeedCacheRoom;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository$fetchProductEligibility$$inlined$map$1$2;
import com.instagram.music.profile.editprofile.viewmodel.EditMusicOnProfileViewModel$special$$inlined$map$1$2;
import com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class ME3 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME3(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static Object A00(Object obj, ME3 me3) {
        me3.A02 = obj;
        me3.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return me3.A01;
    }

    public static ME3 A01(Object obj, AnonymousClass4D7 r3, int i) {
        return new ME3(obj, r3, i, 42);
    }

    public static void A02(Object obj, ME3 me3) {
        me3.A01 = obj;
        me3.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof ME3) || ((ME3) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.ME3, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A02(obj, this);
                return ((HallPassApiUtil) this.A02).A07((UserSession) null, this);
            case 1:
                A02(obj, this);
                return ((HallPassApiUtil) this.A02).A05((UserSession) null, (String) null, this);
            case 2:
            case 3:
            case 4:
            case 27:
            case 28:
            case 31:
                return ((MCl) A00(obj, this)).emit((Object) null, this);
            case 5:
                A02(obj, this);
                return ((IGTVLiveChannelNetworkDataSource) this.A02).A00((C63640L1c) null, (String) null, (String) null, this);
            case 6:
                A02(obj, this);
                return ((IGTVLiveChannelRepository) this.A02).A00((C63640L1c) null, (String) null, (String) null, this);
            case 7:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A02((String) null, (String) null, (String) null, this);
            case 8:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A04((String) null, this);
            case 9:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A05((String) null, this);
            case 10:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A00((C63640L1c) null, (String) null, (String) null, (String) null, (String) null, this);
            case 11:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A01((C63640L1c) null, (String) null, (String) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A03((String) null, (String) null, (String) null, this);
            case 13:
                A02(obj, this);
                return ((IGTVSeriesRepository) this.A02).A00((C63640L1c) null, (String) null, (String) null, (String) null, (String) null, this);
            case 14:
                A02(obj, this);
                return ((IGTVSeriesRepository) this.A02).A01((C63640L1c) null, (String) null, (String) null, this);
            case 15:
                A02(obj, this);
                return UserNetworkDataSource.A00((UserNetworkDataSource) this.A02, (String) null, (String) null, (String) null, (String) null, this);
            case 16:
            case 17:
            case 22:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 30:
            case 36:
                return ((MCm) A00(obj, this)).emit((Object) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A02(obj, this);
                return ((IncentivePlatformApi) this.A02).A02((BonusPromoDialogType) null, this);
            case 19:
                A02(obj, this);
                return ((IncentivePlatformApi) this.A02).A03(this, false, false);
            case 20:
                A02(obj, this);
                return ((IncentivePlatformApi) this.A02).A00((BonusPromoDialogType) null, (String) null, this);
            case 21:
                A02(obj, this);
                return ((IncentivePlatformApi) this.A02).A01((BonusPromoDialogType) null, (String) null, this);
            case 23:
                return ((C58036IkU) A00(obj, this)).emit((Object) null, this);
            case 24:
                A02(obj, this);
                return ((C20429WrE) this.A02).A00((List) null, this);
            case 25:
                A02(obj, this);
                return ((LeadFormRepository) this.A02).A01((String) null, (String) null, (String) null, this);
            case 26:
                A02(obj, this);
                return ((LeadFormRepository) this.A02).A00((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, this);
            case 32:
                A02(obj, this);
                return ((SubspanMutableStateFlow) this.A02).collect((02o) null, this);
            case 33:
                A02(obj, this);
                return ((FeedCacheRoom) this.A02).A05((List) null, this);
            case 34:
            case 35:
                return ((C58038IkW) A00(obj, this)).emit((Object) null, this);
            case 37:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A02((UserMonetizationProductType) null, this);
            case 38:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A07(this);
            case 39:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A06((String) null, this);
            case 40:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A03((UserMonetizationProductType) null, this);
            case Seq.NULL_REFNUM:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A04((UserMonetizationProductType) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A05((UserMonetizationProductType) null, this);
            case 43:
                A02(obj, this);
                return ((OnboardingRepository) this.A02).A01((UserMonetizationProductType) null, this);
            case 44:
                A02(obj, this);
                return ((OnboardingRepository) this.A02).A03((UserMonetizationProductType) null, this);
            case 45:
                A02(obj, this);
                return ((OnboardingRepository) this.A02).A04((UserMonetizationProductType) null, this);
            case 46:
                A02(obj, this);
                return ((OnboardingRepository) this.A02).A05((UserMonetizationProductType) null, this);
            case 47:
                return ((MonetizationRepository$fetchProductEligibility$$inlined$map$1$2) A00(obj, this)).emit((Object) null, this);
            case 48:
                return ((EditMusicOnProfileViewModel$special$$inlined$map$1$2) A00(obj, this)).emit((Object) null, this);
            default:
                A02(obj, this);
                return ((MusicOnProfileRepository) this.A02).A01(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME3(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
