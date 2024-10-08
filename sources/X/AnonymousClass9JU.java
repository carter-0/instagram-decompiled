package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.lifecycle.CoroutineLiveData;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService;
import com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository;
import com.instagram.avatars.graphql.UserAvatarInfoGraphQLRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository$special$$inlined$map$1$2;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource$getAllSavedDraftPreviewItems$$inlined$map$1$2;
import com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource;
import com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob;
import com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$special$$inlined$map$1$2;
import com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.viewmodel.CameraToolMenuViewModel$visibility$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.config.PreCaptureEffectTrayConfig$enteredEffectTrayState$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filter$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$doWhenInCapture$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$effectSelectionChanges$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$effectSelectionChanges$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$maybePrefetchMiniGallery$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$map$3$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$getEffectTrayResponse$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$initialize$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$initialize$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$initialize$$inlined$map$3$2;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9JU  reason: invalid class name */
public final class AnonymousClass9JU extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r10v0, types: [X.9JU, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((SnapFlingBehavior) this.A02).E2X((AnonymousClass6H1) null, this, (0sP) null, 0.0f);
            case 1:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((NestedScrollDispatcher) this.A02).A02(this, 0, 0);
            case 2:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((NestedScrollDispatcher) this.A02).A01(this, 0);
            case 3:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((AndroidComposeView) this.A02).Ezg(this, (0sL) null);
            case 4:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((AndroidPlatformTextInputSession) this.A02).Ex6((JLO) null, this);
            case 5:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((CoroutineLiveData) this.A01).A0F(this);
            case 6:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return MiniGalleryCategoriesService.A00((MiniGalleryCategoriesService) this.A02, (AnonymousClass849) null, this);
            case 7:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RoomEffectCollectionRepository) this.A02).A03((C346197ul) null, this, false);
            case 8:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RoomEffectCollectionRepository) this.A02).A04((List) null, this);
            case 9:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RoomEffectCollectionRepository) this.A02).A01((C359218cI) null, (Integer) null, this, 0);
            case 10:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((UserAvatarInfoGraphQLRepository) this.A02).A00((String) null, this);
            case 11:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((AvatarStore) this.A02).A01(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return EffectTrayService.A00((C359218cI) null, (EffectTrayService) this.A02, (String) null, (String) null, (String) null, this);
            case 13:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return EffectTrayService.A03((EffectTrayService) this.A02, (C359248cL) null, (String) null, (List) null, this);
            case 14:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsDraftPreviewItemRepository$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 15:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((2NP) this.A02).A09((String) null, this);
            case 16:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((2NP) this.A02).A0N(this, 0);
            case 17:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((2NP) this.A02).A0C((String) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((2NP) this.A02).A0F((String) null, this);
            case 19:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((2NP) this.A02).A0G((String) null, this);
            case 20:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((2NP) this.A02).A08((String) null, (String) null, this);
            case 21:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((2NP) this.A02).A0I((String) null, this, 0);
            case 22:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsDraftLocalDataSource) this.A02).A0A(this);
            case 23:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsDraftLocalDataSource$getAllSavedDraftPreviewItems$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 24:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsDraftLocalDataSource) this.A02).A04((C2801950r) null, this);
            case 25:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsImportDraftDataSource) this.A02).A02(this);
            case 26:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return DraftDirectoryDiskCleanupJob.A00((DraftDirectoryDiskCleanupJob) this.A02, this);
            case 27:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsDraftListViewModel$special$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 28:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsDraftListViewModel$special$$inlined$map$2$2) this.A01).emit((Object) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((CameraToolMenuViewModel$visibility$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 30:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((PreCaptureEffectTrayConfig$enteredEffectTrayState$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 31:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$categorySelectionChanged$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 32:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$categorySelectionChanged$$inlined$filter$2$2) this.A01).emit((Object) null, this);
            case 33:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$1$2) this.A01).emit((Object) null, this);
            case 34:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$2$2) this.A01).emit((Object) null, this);
            case 35:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$doWhenInCapture$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 36:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$effectSelectionChanges$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 37:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$effectSelectionChanges$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 38:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$getTray$$inlined$filterNot$1$2) this.A01).emit((Object) null, this);
            case 39:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$maybePrefetchMiniGallery$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 40:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2) this.A01).emit((Object) null, this);
            case Seq.NULL_REFNUM:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case Seq.RefTracker.REF_OFFSET:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$filterNot$1$2) this.A01).emit((Object) null, this);
            case 43:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 44:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$map$2$2) this.A01).emit((Object) null, this);
            case 45:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$map$3$2) this.A01).emit((Object) null, this);
            case 46:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((PostCaptureEffectTrayViewModel$getEffectTrayResponse$$inlined$filter$1$2) this.A01).emit((Object) null, this);
            case 47:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((PostCaptureEffectTrayViewModel$initialize$$inlined$map$1$2) this.A01).emit((Object) null, this);
            case 48:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((PostCaptureEffectTrayViewModel$initialize$$inlined$map$2$2) this.A01).emit((Object) null, this);
            default:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((PostCaptureEffectTrayViewModel$initialize$$inlined$map$3$2) this.A01).emit((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JU(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9JU) || ((AnonymousClass9JU) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JU(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
