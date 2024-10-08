package X;

import android.graphics.Bitmap;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.gifting.FanClubGiftingApi;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import com.instagram.feed.tifu.api.TifuApiHelper;
import com.instagram.friendmap.data.FriendMapGraphQLImpl;
import com.instagram.genai.imageservice.service.GenAIImageService;
import com.instagram.genai.imageservice.service.GenAIImagineService;
import com.instagram.genai.imageservice.upload.GenAIImageUploadService;
import com.instagram.hallpass.util.HallPassApiUtil;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDo  reason: case insensitive filesystem */
public final class C66136MDo extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66136MDo(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static void A00(Object obj, C66136MDo mDo) {
        mDo.A01 = obj;
        mDo.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66136MDo) || ((C66136MDo) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.MDo, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A00(obj, this);
                return ((FanClubApi) this.A02).A07((String) null, (String) null, this, false);
            case 1:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0D((String) null, this);
            case 2:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0H((String) null, this, false);
            case 3:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0L((List) null, this);
            case 4:
                A00(obj, this);
                return ((FanClubApi) this.A02).A04((String) null, (String) null, this);
            case 5:
                A00(obj, this);
                return ((FanClubApi) this.A02).A05((String) null, (String) null, this);
            case 6:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0R(this);
            case 7:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0E((String) null, this);
            case 8:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0G((String) null, this);
            case 9:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0S(this);
            case 10:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0M((List) null, this);
            case 11:
                A00(obj, this);
                return ((FanClubApi) this.A02).A0N((List) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A00(obj, this);
                return ((FanClubApi) this.A02).A06((String) null, (String) null, this);
            case 13:
            case 14:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 20:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((C51632FxQ) this.A01).emit((Object) null, this);
            case 15:
                A00(obj, this);
                return ((FanClubGiftingApi) this.A02).A00((String) null, this);
            case 16:
                A00(obj, this);
                return ((FanClubMemberListRepository) this.A02).A00(this);
            case 21:
            case 25:
            case 33:
            case 34:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((MCm) this.A01).emit((Object) null, this);
            case 22:
                A00(obj, this);
                return FanClubPromoAndWelcomeVideoApi.A00((FanClubPromoAndWelcomeVideoApi) this.A02, this);
            case 23:
            case 24:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((C51630FxO) this.A01).emit((Object) null, this);
            case 26:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case Seq.NULL_REFNUM:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((MCl) this.A01).emit((Object) null, this);
            case 27:
                A00(obj, this);
                return ((FBPayIGGraphQLQueryExecutor) this.A02).A00((1Ef) null, this);
            case 30:
                A00(obj, this);
                return ((TifuApiHelper) this.A02).A00((String) null, this, 0, 0);
            case 31:
                A00(obj, this);
                return ((TifuApiHelper) this.A02).A01((String) null, this, 0, 0);
            case 32:
                A00(obj, this);
                return ((TifuApiHelper) this.A02).A02((String) null, this, false);
            case 35:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A00((C68150N2q) null, this);
            case 36:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A06((String) null, this);
            case 37:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A05((String) null, (String) null, this);
            case 38:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A07((List) null, this);
            case 39:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A03((AnonymousClass4A5) null, (Set) null, (Set) null, this);
            case 40:
                A00(obj, this);
                return ((FriendMapGraphQLImpl) this.A02).A01((C68150N2q) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A00(obj, this);
                return GenAIImageService.A03((GenAIImageService) this.A02, (LG0) null, (C60966JuO) null, this);
            case 43:
                A00(obj, this);
                return ((GenAIImagineService) this.A02).A02((L1Z) null, this);
            case 44:
                A00(obj, this);
                return ((GenAIImageUploadService) this.A02).A01((Bitmap) null, (String) null, this);
            case 45:
                A00(obj, this);
                return GenAIImageUploadService.A00((GenAIImageUploadService) this.A02, (String) null, this, 0);
            case 46:
                A00(obj, this);
                return ((HallPassApiUtil) this.A02).A02((UserSession) null, (String) null, (List) null, (List) null, this);
            case 47:
                A00(obj, this);
                return ((HallPassApiUtil) this.A02).A01((UserSession) null, (String) null, (String) null, (List) null, this);
            case 48:
                A00(obj, this);
                return ((HallPassApiUtil) this.A02).A03((UserSession) null, (String) null, this);
            default:
                A00(obj, this);
                return ((HallPassApiUtil) this.A02).A04((UserSession) null, (String) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66136MDo(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
