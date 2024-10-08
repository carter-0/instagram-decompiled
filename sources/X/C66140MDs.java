package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository;
import com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository;
import com.instagram.comments.mvvm.data.network.MediaHiddenCommentNetworkFetcherKt;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.wellbeing.upsells.fragment.directmessage.DirectMessageSettingsRepository;
import com.instagram.wellbeing.upsells.fragment.tagsettings.TagSettingsRepository;
import com.instagram.wonderwall.repository.AggregatedWallFeedRepository;
import com.instagram.wonderwall.repository.WallFeedRepository;
import java.util.List;

/* renamed from: X.MDs  reason: case insensitive filesystem */
public final class C66140MDs extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66140MDs(AnonymousClass4D7 r2) {
        super(r2);
        this.A06 = 4;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.MDs, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                A00(obj, this);
                return VideoStickerAnythingProcessor.A00((C11020S5r) null, (VideoStickerAnythingProcessor) this.A04, this, false);
            case 1:
                A00(obj, this);
                return VideoStickerAnythingProcessorV2.A00((C11020S5r) null, (VideoStickerAnythingProcessorV2) this.A04, this, false);
            case 2:
                A00(obj, this);
                return ContextualSuggestionsPerIntentRepository.A02((ContextualSuggestionsPerIntentRepository) this.A04, (List) null, this, false);
            case 3:
                A00(obj, this);
                return ContextualSuggestionsStickersRepository.A00((ContextualSuggestionsStickersRepository) this.A04, (String) null, this, false);
            case 4:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return MediaHiddenCommentNetworkFetcherKt.A00((C333847aF) null, (UserSession) null, (String) null, this, false);
            case 5:
                A00(obj, this);
                return ((ClipsSharingDraftViewModel) this.A04).A05(this, false);
            case 6:
                A00(obj, this);
                return DirectCardGalleryRepository.A01((DirectCardGalleryRepository) this.A04, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, this, false);
            case 7:
                A00(obj, this);
                return DirectShareSheetFragmentViewModel.A01((DirectShareSheetFragmentViewModel) this.A04, (String) null, (String) null, this, false, false);
            case 8:
                A00(obj, this);
                return ((DirectConfigureMediaCollectionMessageMutationFactory) this.A04).A02((C254703su) null, (C65701gB) null, this, false);
            case 9:
                A00(obj, this);
                return ((TifuViewModel) this.A04).A03((String) null, this, false);
            case 10:
                A00(obj, this);
                return ((ThreadsSearchHcmViewModel) this.A04).A01((String) null, this, false);
            case 11:
                A00(obj, this);
                return ((DirectMessageSettingsRepository) this.A04).EK9((C69364Nk4) null, (C69364Nk4) null, this, false);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A00(obj, this);
                return ((TagSettingsRepository) this.A04).EK9((C69360Nk0) null, (C69360Nk0) null, this, false);
            case 13:
                A00(obj, this);
                return AggregatedWallFeedRepository.A00((AggregatedWallFeedRepository) this.A04, (String) null, this, false, false);
            default:
                A00(obj, this);
                return WallFeedRepository.A00((WallFeedRepository) this.A04, (String) null, this, false, false);
        }
    }

    public static void A00(Object obj, C66140MDs mDs) {
        mDs.A03 = obj;
        mDs.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66140MDs) || ((C66140MDs) obj).A06 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66140MDs(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A04 = obj;
    }
}
