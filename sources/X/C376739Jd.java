package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.datastore.core.SingleProcessDataStore;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService$withSelectedEffect$$inlined$map$1$2;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;
import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.nme.contextualpromo.ClipsUploadPromoHelper;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl;
import java.util.List;

/* renamed from: X.9Jd  reason: invalid class name and case insensitive filesystem */
public final class C376739Jd extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376739Jd(AnonymousClass4D7 r2) {
        super(r2);
        this.A06 = 0;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.9Jd, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                this.A05 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return SuspendAnimationKt.A01((C3025964g) null, (C287955b5) null, this, (0sP) null, 0);
            case 1:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return DragGestureNode.A00((GS1) null, (DragGestureNode) this.A05, this);
            case 2:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((LazyListState) this.A05).EKT((C54609HKs) null, this, (0sL) null);
            case 3:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((AndroidComposeViewAccessibilityDelegateCompat) this.A05).A0a(this);
            case 4:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return SingleProcessDataStore.A00((C268304d9) null, (SingleProcessDataStore) this.A05, this);
            case 5:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return SingleProcessDataStore.A04((SingleProcessDataStore) this.A05, this);
            case 6:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return SingleProcessDataStore.A06((SingleProcessDataStore) this.A05, this, (C262094Cc) null, (0sL) null);
            case 7:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return EffectCollectionService.A02((EffectCollectionService) this.A05, (C378919Rs) null, this);
            case 8:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return EffectCollectionService.A05((EffectCollectionService) this.A05, (C346197ul) null, (C346197ul) null, this);
            case 9:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((EffectTrayService$withSelectedEffect$$inlined$map$1$2) this.A05).emit((Object) null, this);
            case 10:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ClipsDraftLocalDataSource) this.A05).A02((C2801950r) null, this);
            case 11:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return MediaCommentListRepository.A09((MediaCommentListRepository) this.A05, this, (0sP) null);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return InspirationHubRepository.A00((InspirationHubRepository) this.A05, (String) null, (List) null, this);
            case 13:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return InspirationHubRepository.A01((InspirationHubRepository) this.A05, (List) null, this);
            case 14:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return CachingVideoSaver.A00((CachingVideoSaver) this.A05, (MV5) null, this, (C62320sa) null);
            case 15:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ClipsCreationDraftViewModel.A04((ClipsCreationDraftViewModel) this.A05, (C2801950r) null, (PendingRecipient) null, this);
            case 16:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ClipsUploadPromoHelper.A00((ClipsUploadPromoHelper) this.A05, (AnonymousClass3Q2) null, (String) null, this);
            default:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RepositoryImpl) this.A05).A00((UserSession) null, (1Xj) null, (String) null, (String) null, (List) null, this, false);
        }
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C376739Jd) || ((C376739Jd) obj).A06 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376739Jd(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A05 = obj;
    }
}
