package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.google.common.collect.ImmutableList;
import com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment;
import com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository;
import com.instagram.avatars.graphql.AvatarMutationRepository;
import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository;
import com.instagram.banyan.BanyanCoordinator;
import com.instagram.barcelona.feed.post.data.PostViewStateRepository;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource;
import com.instagram.clips.drafts.model.validation.ClipsDraftValidator;
import com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil;
import com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository;
import com.instagram.comments.mvvm.data.CommentGiphyRepository;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse;
import com.instagram.common.session.UserSession;
import com.instagram.compose.ui.capturable.CapturableModifierNode;
import com.instagram.contentnotes.data.OptimisticNetworkOperation;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;
import com.instagram.creation.genai.magicmod.consentflow.MagicModConsentMigrator;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.File;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDg  reason: case insensitive filesystem */
public final class C66128MDg extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66128MDg(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A04 = obj;
    }

    public static void A00(Object obj, C66128MDg mDg) {
        mDg.A02 = obj;
        mDg.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66128MDg) || ((C66128MDg) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.MDg, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        A00(obj, this);
        switch (i) {
            case 0:
                return AvatarConvergenceUpsellBottomSheetFragment.A00((AvatarConvergenceUpsellBottomSheetFragment) this.A04, (String) null, this);
            case 1:
                return ((C51632FxQ) this.A04).A01((C48164Ea6) null, this);
            case 2:
                return ((AvatarCustomizationOptionsRepository) this.A04).A00((Boolean) null, this, false);
            case 3:
                return ((AvatarMutationRepository) this.A04).A00(this);
            case 4:
                return ((AvatarPrivacySettingsRepository) this.A04).A01(this);
            case 5:
                return ((AvatarPrivacySettingsRepository) this.A04).A00((String) null, (String) null, this);
            case 6:
                return ((ContextualSuggestionsStickersRepository) this.A04).E3g(this);
            case 7:
                return BanyanCoordinator.A02((BanyanCoordinator) this.A04, this);
            case 8:
                return PostViewStateRepository.A00((PostViewStateRepository) this.A04, (List) null, this);
            case 9:
                return ((BrandedContentDisclosureBaseViewModel) this.A04).A03(this);
            case 10:
                return ((BrandedContentDisclosureMenuViewModel) this.A04).A09(this);
            case 11:
                return ((BrandedContentDisclosureViewModel) this.A04).A09((String) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((BrandedContentProjectRepository) this.A04).A01((ImmutableList) null, this, 0);
            case 13:
                return ((BrandedContentSettingsRepository) this.A04).A02(this);
            case 14:
                return ((BrandedContentSettingsRepository) this.A04).A01((List) null, this);
            case 15:
                return EffectTrayService.A01((C39753A7t) null, (EffectTrayService) this.A04, this);
            case 16:
                return ((EffectsByIdMetadataService) this.A04).A02((C39753A7t) null, this);
            case 17:
                return IgSignalsCasper.A01((IgSignalsCasper) this.A04, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return ((2NP) this.A04).A01(0, this);
            case 19:
                return ((ClipsDraftLocalDataSource) this.A04).A08((String) null, this);
            case 20:
                return ((ClipsImportDraftDataSource) this.A04).A00((String) null, this);
            case 21:
                return ((ClipsImportDraftDataSource) this.A04).A01((String) null, this);
            case 22:
                return ((ClipsDraftValidator) this.A04).A01((String) null, this);
            case 23:
                return ((AudienceListsApiUtil) this.A04).A05((UserSession) null, (String) null, (String) null, (String) null, (List) null, (List) null, this);
            case 24:
                return ((AudienceListsApiUtil) this.A04).A09((UserSession) null, (String) null, this);
            case 25:
                return ((AudienceListsApiUtil) this.A04).A07((UserSession) null, (String) null, (String) null, this);
            case 26:
                return ((AudienceListsApiUtil) this.A04).A0A((UserSession) null, this);
            case 27:
                return ((AudienceListsApiUtil) this.A04).A08((UserSession) null, (String) null, (List) null, (List) null, this);
            case 28:
                return ((AudienceListsListRepository) this.A04).A00(this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return CommentGiphyRepository.A00((CommentGiphyRepository) this.A04, (String) null, this);
            case 30:
                return MediaCommentListRepository.A08((MediaCommentListRepository) this.A04, this);
            case 31:
                return ((CoroutineHttpService$ChannelHttpResponse) this.A04).A00(this);
            case 32:
                return ((CoroutineHttpService$ChannelHttpResponse) this.A04).A01(this);
            case 33:
            case 35:
                return MCn.A00(this.A04, this);
            case 34:
                return ((C51630FxO) this.A04).emit((Object) null, this);
            case 36:
                return CapturableModifierNode.A01((CapturableModifierNode) this.A04, this);
            case 37:
                return ((OptimisticNetworkOperation) this.A04).A00(this);
            case 38:
                return ClipsAssetHubViewModel.A00((ClipsAssetHubViewModel) this.A04, this);
            case 39:
                return GalleryMemoriesViewModel.A01((GalleryMemoriesViewModel) this.A04, this);
            case 40:
                return ((GalleryMemoriesViewModel$special$$inlined$map$1$2) this.A04).emit((Object) null, this);
            case Seq.NULL_REFNUM:
                return ClipsStackedTimelineFragment.A03((ClipsStackedTimelineFragment) this.A04, this);
            case Seq.RefTracker.REF_OFFSET:
                return ((SfxAudioRepository) this.A04).A01(this);
            case 43:
                return ((ClipsAudioStore) this.A04).A04((File) null, (String) null, (String) null, this);
            case 44:
                return ((ClipsDraftRepository) this.A04).A0K((C293505kq) null, this);
            case 45:
                return ContextualBackgroundViewModel.A00((ContextualBackgroundViewModel) this.A04, (String) null, this);
            case 46:
                return ((MagicModConsentMigrator) this.A04).A00(this);
            case 47:
                return ((C58037IkV) this.A04).A01((C239803Ii) null, this);
            case 48:
                return ((C58036IkU) this.A04).A00((C239803Ii) null, this);
            default:
                return ((CreatorAIFanNuxRepository) this.A04).A00(this);
        }
    }
}
