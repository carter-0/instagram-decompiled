package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.viewmodels.EffectSliderViewModel$isEffectTrayState$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.viewmodels.EffectSliderViewModel$progress$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.CreationGalleryController$special$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryGridDraftController$init$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore$special$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsVideoStore$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsStickerOverlayViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsStickerOverlayViewModel$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.viewmodel.CameraPreviewViewModel$yOffsetAndScale$$inlined$filter$1$2;
import com.instagram.criticalpath.AppStartQueue$1$1$invokeSuspend$;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.friendmap.data.FriendMapGraphQLImpl;
import com.instagram.mainactivity.camerabutton.CameraButtonDestinationFetcher$Companion;
import com.instagram.notifications.badging.impl.InMemoryBadgingRepository$getBadges$$inlined$filter$1$2;
import com.instagram.notifications.badging.impl.InMemoryBadgingRepository$getBadges$$inlined$map$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$filterCombine$$inlined$map$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filter$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filter$2$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filterCombine$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filterCombine$2$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$2$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$3$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$4$2;
import com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper$getLong$$inlined$map$1$2;
import com.instagram.preferences.common.datastore.IgDataStore$get$$inlined$map$1$2;
import com.instagram.preferences.common.datastore.IgDataStore$getLong$$inlined$map$1$2;
import com.instagram.preferences.common.datastore.IgDatastoreEditor;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance;
import com.instagram.statemachine.ktx.StateMachineExtKt$asFlow$$inlined$map$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesEnteredFlow$$inlined$filter$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesEnteredFlow$$inlined$map$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesExitedFlow$$inlined$filter$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesExitedFlow$$inlined$map$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesExitedFlow$$inlined$map$2$2;
import com.instagram.unifiedfeedback.disclosure.UnifiedFeedbackDisclosureApi;
import com.instagram.uxlogging.navigation.NavigationObserver$start$1$invokeSuspend$$inlined$filter$1$2;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9JT  reason: invalid class name */
public final class AnonymousClass9JT extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.9JT, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((PostCaptureEffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2) this.A01).emit((Object) null, this);
            case 1:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectSliderViewModel$isEffectTrayState$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 2:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectSliderViewModel$progress$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 3:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((CreationGalleryController$special$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 4:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((GalleryGridDraftController$init$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 5:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((StoriesTemplateViewModel$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 6:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsAudioStore$special$$inlined$filterNot$1$2) this.A01).emit((Object) null, this);
            case 7:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsAudioStore$special$$inlined$map$2$2) this.A01).emit((Object) null, this);
            case 8:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsVideoStore$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 9:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsCreationViewModel$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 10:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsCreationViewModel$special$$inlined$map$2$2) this.A01).emit((Object) null, this);
            case 11:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsStickerOverlayViewModel$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsStickerOverlayViewModel$special$$inlined$map$2$2) this.A01).emit((Object) null, this);
            case 13:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((CameraPreviewViewModel$yOffsetAndScale$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 14:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((AppStartQueue$1$1$invokeSuspend$.inlined.filterNot.1.2) this.A01).emit((Object) null, this);
            case 15:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((AppStartQueue$1$1$invokeSuspend$.inlined.map.1.2) this.A01).emit((Object) null, this);
            case 16:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ContentFilterDictionaryRegistrar) this.A02).A03((ContentFilterDictionaryImpl) null, (AnonymousClass92L) null, this);
            case 17:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ContentFilterDictionarySyncManager.A00((UserSession) null, (ContentFilterDictionarySyncManager) this.A02, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((FanClubApi) this.A02).A0B((String) null, this);
            case 19:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((FanClubApi) this.A02).A0C((String) null, this);
            case 20:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((FanClubApi) this.A02).A02((C46401DeO) null, (String) null, this);
            case 21:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((FanClubApi) this.A02).A0Q(this);
            case 22:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((FanClubApi) this.A02).A0I((String) null, this, false, false, false);
            case 23:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((FriendMapGraphQLImpl) this.A02).A08(this);
            case 24:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((CameraButtonDestinationFetcher$Companion) this.A02).A00((UserSession) null, this);
            case 25:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((InMemoryBadgingRepository$getBadges$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 26:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((InMemoryBadgingRepository$getBadges$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 27:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((BaseBadgeViewModel$filterCombine$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 28:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((BaseBadgeViewModel$special$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((BaseBadgeViewModel$special$$inlined$filter$2$2) this.A01).emit((Object) null, this);
            case 30:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((BaseBadgeViewModel$special$$inlined$filterCombine$1$2) this.A01).emit((Object) null, this);
            case 31:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((BaseBadgeViewModel$special$$inlined$filterCombine$2$2) this.A01).emit((Object) null, this);
            case 32:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((BaseBadgeViewModel$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 33:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((BaseBadgeViewModel$special$$inlined$map$2$2) this.A01).emit((Object) null, this);
            case 34:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((BaseBadgeViewModel$special$$inlined$map$3$2) this.A01).emit((Object) null, this);
            case 35:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((BaseBadgeViewModel$special$$inlined$map$4$2) this.A01).emit((Object) null, this);
            case 36:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((AsyncKeyValueStoreWrapper$getLong$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 37:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((IgDataStore$get$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 38:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((IgDataStore$getLong$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 39:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((IgDatastoreEditor) this.A02).ABn(this);
            case 40:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return StoryHighlightsTrayManager$Instance.A00((StoryHighlightsTrayManager$Instance) this.A02, this);
            case Seq.NULL_REFNUM:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((StateMachineExtKt$asFlow$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case Seq.RefTracker.REF_OFFSET:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((StateMachineExtKt$asStatesEnteredFlow$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 43:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((StateMachineExtKt$asStatesEnteredFlow$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 44:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((StateMachineExtKt$asStatesExitedFlow$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 45:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((StateMachineExtKt$asStatesExitedFlow$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 46:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((StateMachineExtKt$asStatesExitedFlow$$inlined$map$2$2) this.A01).emit((Object) null, this);
            case 47:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((UnifiedFeedbackDisclosureApi) this.A02).A00(this);
            case 48:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((UnifiedFeedbackDisclosureApi) this.A02).A01(this);
            default:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((NavigationObserver$start$1$invokeSuspend$$inlined$filter$1$2) this.A01).emit((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JT(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9JT) || ((AnonymousClass9JT) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JT(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
