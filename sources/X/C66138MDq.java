package X;

import android.content.Context;
import androidx.paging.PagingSource;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;
import com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource;
import com.instagram.nido.impl.explore.NidoExploreViewModel;
import com.instagram.nme.contextualpromo.ContextualPromoApi;
import com.instagram.nux.ndx.util.NdxStepsFilterer;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.opal.impl.data.OpalEditRepository;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.opal.impl.data.OpalRepoUtil;
import com.instagram.opal.impl.data.OpalRepository;
import com.instagram.pendingmedia.service.igapi.ConfigureMediaStep;
import com.instagram.pendingmedia.service.impl.PendingMediaWorker;
import com.instagram.pendingmedia.service.impl.ShareAudioHelper;
import com.instagram.pendingmedia.service.impl.SharePhotoHelper;
import com.instagram.pendingmedia.service.impl.ShareTextPostHelper;
import com.instagram.pendingmedia.service.upload.ArmadilloUploadCoverImageStep;
import com.instagram.pendingmedia.service.upload.FbUploaderUtil;
import com.instagram.pendingmedia.service.upload.UploadAudioStep;
import com.instagram.profilecard.domain.ProfileCardViewModel;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.release.buildinfo.BuildInfoStore;
import com.instagram.release.lockout.DogfoodingEligibilityApi;
import com.instagram.repository.common.FeedPagedData;
import com.instagram.schools.management.data.SchoolSettingsDataSource;
import com.instagram.schools.management.data.SchoolSettingsRepository;
import com.instagram.schools.tab.data.SchoolTabDataSource;
import com.instagram.settings.language.ContentLanguageSettingsRepository;
import com.instagram.settings2.core.data.SettingsRepository;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDq  reason: case insensitive filesystem */
public final class C66138MDq extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66138MDq(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A04 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.LP8 r3, X.C66138MDq r4, int r5) {
        /*
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r0 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            com.instagram.pendingmedia.service.igapi.ConfigureMediaStep r1 = new com.instagram.pendingmedia.service.igapi.ConfigureMediaStep
            r1.<init>()
            r2 = r3
            r3 = r4
            r4.A01 = r2
            r4.A00 = r5
            r4 = 0
            java.lang.Object r0 = r0.A01(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66138MDq.A00(X.LP8, X.MDq, int):java.lang.Object");
    }

    public static void A01(Object obj, C66138MDq mDq) {
        mDq.A02 = obj;
        mDq.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C66138MDq) || ((C66138MDq) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.MDq, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        A01(obj, this);
        switch (i) {
            case 0:
                return ((MusicOnProfileProvider) this.A04).A02(this);
            case 1:
                return ((MusicOnProfileProvider) this.A04).A01((JVM) null, this);
            case 2:
                return ((MusicOnProfileRepository) this.A04).A00((JVM) null, this);
            case 3:
                return MusicSearchQueryViewModel.A00((MusicSearchQueryViewModel) this.A04, this);
            case 4:
                return MusicSearchQueryViewModel.A01((MusicSearchQueryViewModel) this.A04, this);
            case 5:
                return ((FollowRequestsRepository) this.A04).A03(this);
            case 6:
                return ((SpamFollowRequestsNetworkDataSource) this.A04).AUv(this, false);
            case 7:
                return NidoExploreViewModel.A00((NidoExploreViewModel) this.A04, this);
            case 8:
                return ((ContextualPromoApi) this.A04).A01((String) null, (String) null, (String) null, this);
            case 9:
                return ((ContextualPromoApi) this.A04).A00((C48125EWr) null, (String) null, (String) null, (String) null, this);
            case 10:
                return ((NdxStepsFilterer) this.A04).A01(this);
            case 11:
                return OpalAudienceSelectorRepository.A00((OpalAudienceSelectorRepository) this.A04, (String) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return OpalAudienceSelectorRepository.A02((OpalAudienceSelectorRepository) this.A04, this);
            case 13:
                return OpalAudienceSelectorRepository.A03((OpalAudienceSelectorRepository) this.A04, this);
            case 14:
                return OpalAudienceSelectorRepository.A04((OpalAudienceSelectorRepository) this.A04, this);
            case 15:
                return ((OpalEditRepository) this.A04).A04(this);
            case 16:
                return ((OpalEditRepository) this.A04).A03((OpalProfileData) null, this);
            case 17:
                return OpalRepoUtil.A00((Context) null, (UserSession) null, (OpalRepoUtil) this.A04, (String) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return ((OpalRepository) this.A04).A05((String) null, this, false);
            case 19:
                return ConfigureMediaStep.A02((LP8) null, (ConfigureMediaStep) this.A04, this);
            case 20:
                return PendingMediaWorker.A02((PendingMediaWorker) this.A04, this, false);
            case 21:
                return ((ShareAudioHelper) this.A04).A00((LP8) null, this);
            case 22:
                return ((SharePhotoHelper) this.A04).A00((LP8) null, this);
            case 23:
                return ((ShareTextPostHelper) this.A04).A00((LP8) null, this);
            case 24:
                return ((ArmadilloUploadCoverImageStep) this.A04).FIH((LP8) null, this);
            case 25:
                return ((FbUploaderUtil) this.A04).A05((C66498MUb) null, (C64386Lb3) null, (C63740L4y) null, (String) null, (String) null, (String) null, this, 0);
            case 26:
                return ((UploadAudioStep) this.A04).FIH((LP8) null, this);
            case 27:
                return ProfileCardViewModel.A00((ProfileCardViewModel) this.A04, this);
            case 28:
                return ((QuickSnapApi) this.A04).A05(this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return ((QuickSnapApi) this.A04).A02((String) null, this);
            case 30:
                return ((QuickSnapApi) this.A04).A06(this);
            case 31:
                return ((QuickSnapApi) this.A04).A04((List) null, this);
            case 32:
                return ((QuickSnapArchiveRepository) this.A04).A00(this);
            case 33:
                return ((QuickSnapRepository) this.A04).A04(this, false);
            case 34:
                return ((QuickSnapRepository) this.A04).A03((List) null, this);
            case 35:
                return QuickSnapMediaSaver.A00((ImageUrl) null, (QuickSnapMediaSaver) this.A04, this, 0);
            case 36:
                return ((QuickSnapRecapVideoGenerator) this.A04).A00((List) null, this);
            case 37:
            case 38:
                return ((PagingSource) this.A04).A04((LCU) null, this);
            case 39:
                return ((BuildInfoStore) this.A04).A00(this);
            case 40:
                return ((DogfoodingEligibilityApi) this.A04).A00(this);
            case Seq.NULL_REFNUM:
                return FeedPagedData.A00((FeedPagedData) this.A04, this);
            case Seq.RefTracker.REF_OFFSET:
                return SchoolSettingsDataSource.A00((SchoolSettingsDataSource) this.A04, this);
            case 43:
                return ((SchoolSettingsRepository) this.A04).A03(this);
            case 44:
                return SchoolTabDataSource.A00((SchoolTabDataSource) this.A04, (String) null, (String) null, this, 0);
            case 45:
                return ((ContentLanguageSettingsRepository) this.A04).A01(this);
            case 46:
                return ((SettingsRepository) this.A04).A0A(this);
            case 47:
                return C64185LSs.A00(this.A04, this);
            case 48:
                return C64185LSs.A00(this.A04, this);
            default:
                return C64185LSs.A00(this.A04, this);
        }
    }
}
