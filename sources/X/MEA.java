package X;

import androidx.paging.PagingSource;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository;
import com.instagram.reels.groupmention.api.GroupMentionStickerNetworkHelper;
import com.instagram.reels.internal.data.InternalStickerViewerRepository;
import com.instagram.reels.party.data.StoryPartyRepository;
import com.instagram.reels.prompt.mvvm.data.PromptStickerViewerRepository;
import com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource;
import com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource;
import com.instagram.release.buildinfo.BuildInfoApi;
import com.instagram.release.lockout.DogfoodingEligibilityApi;
import com.instagram.remindme.common.data.MediaReminderApi;
import com.instagram.repository.common.IgBaseRepository;
import com.instagram.repository.user.UserNetworkDataSource;
import com.instagram.request.InviteContactApi;
import com.instagram.rtc.analytics.RtcCallSurveyLogger;
import com.instagram.schools.management.data.SchoolSettingsDataSource;
import com.instagram.schools.tab.data.SchoolTabDataSource;
import com.instagram.search.common.api.SerpApi;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class MEA extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.4D7, X.MEA] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A01(obj, this);
                return ((StoryCommentsDashboardRepository) this.A02).A01((String) null, (String) null, this);
            case 1:
                A01(obj, this);
                return ((GroupMentionStickerNetworkHelper) this.A02).A00((UserSession) null, this);
            case 2:
                A01(obj, this);
                return ((InternalStickerViewerRepository) this.A02).A00(this);
            case 3:
                A01(obj, this);
                return ((StoryPartyRepository) this.A02).A00((String) null, this);
            case 4:
                A01(obj, this);
                return ((PromptStickerViewerRepository) this.A02).A02((Boolean) null, (String) null, (String) null, (List) null, this);
            case 5:
                A01(obj, this);
                return ((PromptStickerViewerRepository) this.A02).A00((MediaPromptPrefType) null, (String) null, this);
            case 6:
                A01(obj, this);
                return ((PromptStickerViewerRepository) this.A02).A01((MediaPromptPrefType) null, (String) null, this);
            case 7:
                A01(obj, this);
                return StoryTemplateDiscoverySurfaceSectionMediaPagingSource.A00((C48117EWj) null, (StoryTemplateDiscoverySurfaceSectionMediaPagingSource) this.A02, (String) null, this, 0);
            case 8:
                A01(obj, this);
                return StoryTemplateDiscoverySurfaceSectionPagingSource.A00((StoryTemplateDiscoverySurfaceSectionPagingSource) this.A02, this);
            case 9:
                A01(obj, this);
                return ((BuildInfoApi) this.A02).A00(this);
            case 10:
                A01(obj, this);
                return ((DogfoodingEligibilityApi) this.A02).A01(this);
            case 11:
                A01(obj, this);
                return MediaReminderApi.A00((MediaReminderApi) this.A02, (String) null, (String) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return MediaReminderApi.A01((MediaReminderApi) this.A02, (String) null, (String) null, this);
            case 13:
                A01(obj, this);
                return ((IgBaseRepository) this.A02).A03((C324516zR) null, (C66457MSl) null, this);
            case 14:
                A02(obj, this);
                return IgBaseRepository.A02((IgBaseRepository) this.A01, this);
            case 15:
                A02(obj, this);
                return ((MCf) this.A01).emit((Object) null, this);
            case 16:
                A02(obj, this);
                return IgBaseRepository.A01((IgBaseRepository) this.A01, (Object) null, this);
            case 17:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 30:
            case 32:
            case 35:
            case 36:
            case 37:
            case Seq.NULL_REFNUM:
            case Seq.RefTracker.REF_OFFSET:
            case 43:
                A02(obj, this);
                return ((MCk) this.A01).emit((Object) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return ((UserNetworkDataSource) this.A02).A01((C323066wt) null, (G5K) null, (String) null, (String) null, this, 0, false);
            case 19:
            case 20:
                A02(obj, this);
                return ((C51630FxO) this.A01).emit((Object) null, this);
            case 21:
                A01(obj, this);
                return ((InviteContactApi) this.A02).A00(this, false);
            case 22:
                A01(obj, this);
                return RtcCallSurveyLogger.A00((RtcCallSurveyLogger) this.A02, (String) null, this);
            case 23:
            case 25:
                A02(obj, this);
                return ((C73530PeM) this.A01).emit((Object) null, this);
            case 26:
                A01(obj, this);
                return ((MCk) this.A02).emit((Object) null, this);
            case 27:
                A02(obj, this);
                return ((C73523PeD) this.A01).emit((Object) null, this);
            case 31:
            case 33:
            case 34:
                A02(obj, this);
                return ((MCl) this.A01).emit((Object) null, this);
            case 39:
                A02(obj, this);
                return ((C58032IkP) this.A01).emit((Object) null, this);
            case 44:
                A01(obj, this);
                return ((PagingSource) this.A02).A04((LCU) null, this);
            case 45:
                A01(obj, this);
                return ((SchoolSettingsDataSource) this.A02).A01(this);
            case 46:
                A01(obj, this);
                return SchoolTabDataSource.A01((SchoolTabDataSource) this.A02, (String) null, this, 0);
            case 47:
                A01(obj, this);
                return SchoolTabDataSource.A02((SchoolTabDataSource) this.A02, (String) null, this, 0);
            case 48:
                A01(obj, this);
                return ((SerpApi) this.A02).A00((C17733Vd2) null, this);
            default:
                A02(obj, this);
                return ((C73525PeH) this.A01).emit((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEA(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static MEA A00(Object obj, AnonymousClass4D7 r3, int i) {
        return new MEA(obj, r3, i, 42);
    }

    public static void A01(Object obj, MEA mea) {
        mea.A01 = obj;
        mea.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A02(Object obj, MEA mea) {
        mea.A02 = obj;
        mea.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof MEA) || ((MEA) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEA(IgBaseRepository igBaseRepository, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        if (13 - i != 0) {
            this.A01 = igBaseRepository;
        } else {
            this.A02 = igBaseRepository;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEA(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
