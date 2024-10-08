package X;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.work.CoroutineWorker;
import com.facebook.analytics.dsp.point.IgPointContextProvider;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.ar.core.effectcollection.EffectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2;
import com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository;
import com.instagram.avatars.status.AvatarStatusRepository;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.common.api.result.ResultFlowKt$mapError$$inlined$map$1$2;
import com.instagram.common.api.result.ResultFlowKt$mapSuccess$$inlined$map$1$2;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource;
import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.criticalpath.AppStartQueue;
import com.instagram.direct.inbox.birthdays.BirthdayPogsApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryListLoader;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryPatternsLoader;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource;
import com.instagram.feed.tifu.api.TifuApiHelper;
import com.instagram.friendmap.data.FriendMapGraphQLImpl;
import com.instagram.mainactivity.camerabutton.CameraButtonDestinationUtil$Companion;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import com.instagram.notifications.badging.impl.BadgingApiImpl;
import com.instagram.quickpromotion.sdk.IGSlotFetcher;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.comments.repository.StoryCommentsRepository;
import com.instagram.share.facebook.api.ReelsXARApiUtil;
import go.Seq;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9JX  reason: invalid class name */
public final class AnonymousClass9JX extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARNING: type inference failed for: r10v0, types: [X.9JX, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        this.A02 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        switch (i) {
            case 0:
                return DragGestureNode.A02((DragGestureNode) this.A04, this);
            case 1:
                return ((ScrollingLogic) this.A04).A04(this, 0);
            case 2:
                return SnapFlingBehavior.A00((AnonymousClass6H1) null, (SnapFlingBehavior) this.A04, this, (0sP) null, 0.0f);
            case 3:
                return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) this.A04).FNY(this, (0sL) null, 0);
            case 4:
                return SingleProcessDataStore.A03((SingleProcessDataStore) this.A04, this);
            case 5:
                return ((SharedPreferencesMigration) this.A04).Esb((Object) null, this);
            case 6:
                return ((IgPointContextProvider) this.A04).A01(this, 0.0f, 0.0f);
            case 7:
                return QPSdkOnDemandSurfaceController.A00((QPSdkOnDemandSurfaceController) this.A04, (AnonymousClass42S) null, (AnonymousClass42R) null, (AnonymousClass426) null, (Object) null, (Set) null, this);
            case 8:
                return ((EffectCollectionService) this.A04).A0E((List) null, this);
            case 9:
                return ((EffectCollectionService) this.A04).A08(this);
            case 10:
                return EffectCollectionService.A01((EffectCollectionService) this.A04, (C378919Rs) null, this);
            case 11:
                return ((EffectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2) this.A04).emit((Object) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((RoomEffectCollectionRepository) this.A04).A02((C359218cI) null, (List) null, this, 0);
            case 13:
                return ((AvatarStatusRepository) this.A04).A00(this);
            case 14:
                return ((EffectTrayService) this.A04).A05((C39753A7t) null, this);
            case 15:
                return ((2NP) this.A04).A0B((String) null, this);
            case 16:
                return ((2NP) this.A04).A0M(this);
            case 17:
                return ((2NP) this.A04).A0D((String) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return ((2NP) this.A04).A02((C2801950r) null, this);
            case 19:
                return ((2NP) this.A04).A03((C2801950r) null, this);
            case 20:
                return ((2NP) this.A04).A05((C2801950r) null, this);
            case 21:
                return ((2NP) this.A04).A06((A8B) null, this);
            case 22:
                return ((2NP) this.A04).A0H((String) null, this);
            case 23:
                return ((ClipsDraftLocalDataSource) this.A04).A09((String) null, this);
            case 24:
                return ((ResultFlowKt$mapError$$inlined$map$1$2) this.A04).emit((Object) null, this);
            case 25:
                return ((ResultFlowKt$mapSuccess$$inlined$map$1$2) this.A04).emit((Object) null, this);
            case 26:
                return ((InspirationHubNetworkDataSource) this.A04).A00((String) null, this);
            case 27:
                return ((StoryDraftsStore) this.A04).A04(this);
            case 28:
                return ((ClipsDraftRepository) this.A04).A0E((C2801950r) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return ((ClipsDraftRepository) this.A04).A0J((C293505kq) null, this);
            case 30:
                return ClipsDraftRepository.A06((ClipsDraftRepository) this.A04, this);
            case 31:
                return ((AppStartQueue.1.2) this.A04).A00((0ng) null, this);
            case 32:
                return ((BirthdayPogsApi) this.A04).A01(this);
            case 33:
                return ((NotesRepository) this.A04).A08((C53370Gmu) null, (String) null, (List) null, this);
            case 34:
                return ContentFilterDictionaryRegistrar.A00((ContentFilterDictionaryRegistrar) this.A04, (List) null, this);
            case 35:
                return ((ContentFilterDictionaryListLoader) this.A04).A00((UserSession) null, (List) null, (List) null, this);
            case 36:
                return ((ContentFilterDictionaryPatternsLoader) this.A04).A00((UserSession) null, (String) null, (String) null, this, 0);
            case 37:
                return ((ContentFilterDictionarySyncManager) this.A04).A01((UserSession) null, (String) null, (String) null, this);
            case 38:
                return ((FlashMediaLocalDataSource) this.A04).A01((AnonymousClass93C) null, (Collection) null, this, 0, false);
            case 39:
                return ((FlashMediaLocalDataSource) this.A04).A03((AnonymousClass93C) null, this, 0);
            case 40:
                return ((TifuApiHelper) this.A04).A03(this);
            case Seq.NULL_REFNUM:
                return ((FriendMapGraphQLImpl) this.A04).A09(this);
            case Seq.RefTracker.REF_OFFSET:
                return ((CameraButtonDestinationUtil$Companion) this.A04).A01((UserSession) null, this);
            case 43:
                return ((MonetizationRepository) this.A04).A00((UserMonetizationProductType) null, this);
            case 44:
                return ((ActivityFeedRepository) this.A04).A02((AnonymousClass0iw) null, (String) null, this, false);
            case 45:
                return ((BadgingApiImpl) this.A04).A00(this);
            case 46:
                return IGSlotFetcher.A00((IGSlotFetcher) this.A04, (AnonymousClass42R) null, this, false);
            case 47:
                return ((StoryCommentsRepository) this.A04).A00((1Xj) null, (String) null, this);
            case 48:
                return ((CoroutineWorker) this.A04).A03(this);
            default:
                return ((ReelsXARApiUtil) this.A04).A00((UserSession) null, this, (0sP) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JX(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A04 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9JX) || ((AnonymousClass9JX) obj).A03 != i) {
            return false;
        }
        return true;
    }
}
