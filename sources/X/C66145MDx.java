package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.creation.ml.VisualFeatureStore;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.crossposting.feed.graphql.FetchFBToIGDefaultAudienceApi;
import com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel;
import com.instagram.direct.fragment.channels.periodicpolling.threadview.BroadcastChannelPollRefresher;
import com.instagram.direct.fragment.channels.periodicpolling.threadview.CountBasedReactionRefresher;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;
import com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.genai.imageservice.service.SingleFlightWithCache;
import com.instagram.hallpass.repository.HallPassRepository;
import com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository;
import com.instagram.inappbrowser.expandablefooter.retailads.viewmodel.IGMetadataFooterRepository;
import com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;
import com.instagram.invite.repository.InviteContactRepository;
import com.instagram.login.credentialmanager.CredentialManagerFetchHelper;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDx  reason: case insensitive filesystem */
public final class C66145MDx extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66145MDx(AnonymousClass4D7 r2) {
        super(r2);
        this.A05 = 7;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.MDx, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                A01(obj, this);
                return ((VisualFeatureStore) this.A04).A03((Long) null, (String) null, this, false, false);
            case 1:
                A01(obj, this);
                return ((C58036IkU) this.A04).A01((C239803Ii) null, this);
            case 2:
                A01(obj, this);
                return ((CreatorAIAgentCreationRepository) this.A04).A00((String) null, this);
            case 3:
                A01(obj, this);
                return ((AudienceRepository) this.A04).A03((String) null, this);
            case 4:
                A01(obj, this);
                return ((FactsRepository.FactPagedData) this.A04).A02((BBV) null, this);
            case 5:
                A01(obj, this);
                return ((FactsRepository) this.A04).A01((C53266GlE) null, this);
            case 6:
                A01(obj, this);
                return ((H2Q) this.A04).A05((String) null, (String) null, this);
            case 7:
                this.A04 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return FetchFBToIGDefaultAudienceApi.A02((UserSession) null, (AnonymousClass619) null, (String) null, this);
            case 8:
                A01(obj, this);
                return ((AvatarPowerupsAssetsGifCacheDownloader) this.A04).AQ5((C61008Jv7) null, this);
            case 9:
                A01(obj, this);
                return AvatarReactionsRepository.A01((AvatarReactionsRepository) this.A04, this);
            case 10:
                A01(obj, this);
                return DirectStickerSuggestionsController.A01((DirectStickerSuggestionsController) this.A04, this);
            case 11:
                A01(obj, this);
                return ((DirectCardGalleryRepository) this.A04).A04((DirectThreadKey) null, (MessageIdentifier) null, this, (C62320sa) null);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return ((DirectCardGalleryRepository) this.A04).A05((DirectThreadKey) null, (String) null, (String) null, (String) null, this);
            case 13:
                A01(obj, this);
                return ChannelDiscoveryViewModel.A01((ChannelDiscoveryViewModel) this.A04, (C69374NkE) null, this);
            case 14:
                A01(obj, this);
                return ChannelDiscoveryViewModel.A02((ChannelDiscoveryViewModel) this.A04, (C69374NkE) null, this);
            case 15:
                A01(obj, this);
                return ChannelDirectoryInboxViewModel.A04((C69374NkE) null, (ChannelDirectoryInboxViewModel) this.A04, this);
            case 16:
                A01(obj, this);
                return ChannelDirectoryInboxViewModel.A05((C69374NkE) null, (ChannelDirectoryInboxViewModel) this.A04, this);
            case 17:
                A01(obj, this);
                return ((BroadcastChannelPollRefresher) this.A04).A00((UserSession) null, (DirectThreadKey) null, this, 0, false);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return ((CountBasedReactionRefresher) this.A04).A00((UserSession) null, (DirectThreadKey) null, this, 0);
            case 19:
                A01(obj, this);
                return DirectShareSheetFragmentViewModel.A02((DirectShareSheetFragmentViewModel) this.A04, (String) null, this);
            case 20:
                A01(obj, this);
                return ((NotesRepository) this.A04).A09((UserSession) null, (String) null, this);
            case 21:
                A01(obj, this);
                return ((OptimisticNetworkOperation) this.A04).A05(this);
            case 22:
                A01(obj, this);
                return ((DirectDailyPromptsResponseListRepository) this.A04).A00((DirectThreadKey) null, (String) null, (String) null, this);
            case 23:
                A01(obj, this);
                return ((SecurityAlertRepository) this.A04).A00(this);
            case 24:
                A01(obj, this);
                return ArmadilloExpressLinkMessageSender.A02((N2L) null, (ArmadilloExpressLinkMessageSender) this.A04, this);
            case 25:
                A01(obj, this);
                return ((ContentFilterDictionaryImpl) this.A04).A01(this);
            case 26:
                A01(obj, this);
                return C332407Ux.A02((C332407Ux) this.A04, this);
            case 27:
                A01(obj, this);
                return ((FanClubApi) this.A04).A0F((String) null, this);
            case 28:
                A01(obj, this);
                return FanClubConsiderationViewModel.A05((FanClubConsiderationViewModel) this.A04, (String) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return ((FanClubMemberListCategoryRepository) this.A04).A01((User) null, this);
            case 30:
                A01(obj, this);
                return ((FanClubContentPreviewInteractorImpl) this.A04).AJy((1Xj) null, this);
            case 31:
                A01(obj, this);
                return FlashMediaCacheImpl.A06((FlashMediaCacheImpl) this.A04, (AnonymousClass93C) null, this);
            case 32:
                A01(obj, this);
                return FlashMediaCacheImpl.A04((FlashMediaCacheImpl) this.A04, (AnonymousClass93C) null, this);
            case 33:
                A01(obj, this);
                return TifuViewModel.A00((TifuViewModel) this.A04, (String) null, this);
            case 34:
                A01(obj, this);
                return C63274KuJ.A00((C64086LMe) this.A04, (List) null, this);
            case 35:
                A01(obj, this);
                return ((SingleFlightWithCache) this.A04).A00((Object) null, this, (0sP) null);
            case 36:
                A01(obj, this);
                return ((HallPassRepository) this.A04).A01((String) null, this);
            case 37:
                A01(obj, this);
                return ((HallPassRepository) this.A04).A02((String) null, this);
            case 38:
                A01(obj, this);
                return ((IgSignalsDcpPredictor) this.A04).A02((C65380LsL) null, this);
            case 39:
                A01(obj, this);
                return IgSignalsTtncEstimator.A00((IgSignalsTtncEstimator) this.A04, this, (0sP) null);
            case 40:
                A01(obj, this);
                return ((IGTVDraftsRepository) this.A04).AOU((List) null, this);
            case Seq.NULL_REFNUM:
                A01(obj, this);
                return ((IGTVSeriesRepository) this.A04).A02((String) null, (String) null, (String) null, (String) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A01(obj, this);
                return ((IGTVSeriesRepository) this.A04).A03((String) null, (String) null, (String) null, (String) null, this);
            case 43:
                A01(obj, this);
                return IGTVUploadViewModel.A00((IGTVUploadViewModel) this.A04, (String) null, this);
            case 44:
                A01(obj, this);
                return ((ImmersiveCatchUpRepository) this.A04).A01((C55562Hji) null, this);
            case 45:
                A01(obj, this);
                return ((IGMetadataFooterRepository) this.A04).A01((C46212DQp) null, (String) null, this);
            case 46:
                A01(obj, this);
                return ((BrowserLinkshimUrlCache) this.A04).A00((String) null, (String) null, this);
            case 47:
                A01(obj, this);
                return TranslatedCaptionsStickerViewBinder$Holder.A03((C46297DUa) null, (UserSession) null, (TranslatedCaptionsStickerViewBinder$Holder) this.A04, (String) null, this);
            case 48:
                A01(obj, this);
                return ((InviteContactRepository) this.A04).A00((C48145EZn) null, this, false);
            default:
                A01(obj, this);
                return CredentialManagerFetchHelper.A00((CredentialManagerFetchHelper) this.A04, (L8K) null, this);
        }
    }

    public static void A00(Object obj, Object obj2, C66145MDx mDx, int i) {
        mDx.A01 = obj;
        mDx.A02 = obj2;
        mDx.A00 = i;
    }

    public static void A01(Object obj, C66145MDx mDx) {
        mDx.A03 = obj;
        mDx.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C66145MDx) || ((C66145MDx) obj).A05 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66145MDx(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A04 = obj;
    }
}
