package X;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.datastore.core.DataMigrationInitializer$Companion;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController;
import com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;
import com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.direct.store.impl.sqlite.DirectThreadsParser;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.feed.media.flashmedia.FlashMediaRepository;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.mainfeed.network.flashfeed.FeedCacheRoom;
import com.instagram.partneranalytics.simcarrier.SimCarrierInfoLogger;
import com.instagram.quickpromotion.sdk.IGSlotFetcher;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.screentime.IGScreenTimeApi;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.meta.analytics.gnv.vista.core.CoreVistaManager;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Ja  reason: invalid class name and case insensitive filesystem */
public final class C376709Ja extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARNING: type inference failed for: r13v0, types: [X.9Ja, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A03 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        switch (i) {
            case 0:
                return DragGestureNode.A01((GQQ) null, (DragGestureNode) this.A05, this);
            case 1:
                return ((AwaitFirstLayoutModifier) this.A05).A00(this);
            case 2:
                return ((PausableMonotonicFrameClock) this.A05).FNV(this, (0sP) null);
            case 3:
                return ((AndroidContentCaptureManager) this.A05).A07(this);
            case 4:
                return DataMigrationInitializer$Companion.A00((DataMigrationInitializer$Companion) this.A05, (C284245Lp) null, (List) null, this);
            case 5:
                return SingleProcessDataStore.A05((SingleProcessDataStore) this.A05, this);
            case 6:
                return ((QPSdkOnDemandSurfaceController) this.A05).A01((AnonymousClass42S) null, (AnonymousClass42R) null, (AnonymousClass426) null, (Object) null, (Set) null, this);
            case 7:
                return MessageQueueTimelineInitializer.A00((MessageQueueTimelineInitializer) this.A05, this);
            case 8:
                return MiniGalleryService.A01((C63871LAa) null, (MiniGalleryService) this.A05, (C346197ul) null, this);
            case 9:
                return EffectCollectionService.A00((EffectCollectionService) this.A05, (C346077uZ) null, (C359218cI) null, (C346197ul) null, (String) null, this, false);
            case 10:
                return ((ClipsDraftLocalDataSource) this.A05).A06((String) null, this);
            case 11:
                return ((ClipsDraftLocalDataSource) this.A05).A07((String) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((ClipsDraftLocalDataSource) this.A05).A03((C2801950r) null, this);
            case 13:
                return ((ClipsDraftLocalDataSource) this.A05).A05((String) null, (String) null, this);
            case 14:
                return ((DraftDirectoryDiskCleanupJob) this.A05).A01((UserSession) null, this);
            case 15:
                return ((InspirationHubRepository) this.A05).A03((String) null, this);
            case 16:
                return ((SavedMediaMetadataService) this.A05).A01((C352218Cl) null, this);
            case 17:
                return ((SavedMediaMetadataService) this.A05).A03((C349307zv) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return StoryDraftsCreationViewModel.A00((StoryDraftsCreationViewModel) this.A05, (B22) null, (C381589c0) null, this);
            case 19:
                return ((StoryDraftsStore) this.A05).A03((String) null, this);
            case 20:
                return ClipsDraftRepository.A00((C293505kq) null, (ClipsDraftRepository) this.A05, this);
            case 21:
                return ((ClipsDraftRepository) this.A05).A0C((C293505kq) null, this);
            case 22:
                return ClipsDraftRepository.A01((B1S) null, (ClipsDraftRepository) this.A05, this);
            case 23:
                return ((DirectThreadsParser) this.A05).A00((List) null, (List) null, this);
            case 24:
                return ((ContentFilterDictionaryImpl) this.A05).A02(this);
            case 25:
                return ((ContentFilterDictionaryImpl) this.A05).A03(this);
            case 26:
                return ((ContentFilterDictionaryRegistrar) this.A05).A04((AnonymousClass92L) null, this, false);
            case 27:
                return MutedWordsFilterManager.A01((MutedWordsFilterManager) this.A05, (Set) null, this);
            case 28:
                return FlashMediaRepository.A00((FlashMediaRepository) this.A05, (List) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return ((TifuViewModel) this.A05).A02((FragmentActivity) null, (String) null, this);
            case 30:
                return ((FeedCacheRoom) this.A05).A04((Collection) null, this);
            case 31:
                return SimCarrierInfoLogger.A00((SimCarrierInfoLogger) this.A05, this);
            case 32:
                return IGSlotFetcher.A01((IGSlotFetcher) this.A05, (AnonymousClass42R) null, this, false);
            case 33:
                return ((IGScreenTimeApi) this.A05).A00((String) null, this);
            case 34:
                return AnonymousClass5O6.A00((C279014xw) this.A05, (C283685Iu) null, this);
            case 35:
                return ((CXPNoticeStateApi) this.A05).A03((Map) null, this);
            case 36:
                return IgLiveHeartbeatManager.A00((IgLiveHeartbeatManager) this.A05, this);
            case 37:
                return ((CoreVistaManager) this.A05).A01((C262224Cq) null, this);
            case 38:
                return 2Nw.A00((2Nw) this.A05, this);
            default:
                return 2Nv.A00((2Nv) this.A05, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376709Ja(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A05 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C376709Ja) || ((C376709Ja) obj).A04 != i) {
            return false;
        }
        return true;
    }
}
