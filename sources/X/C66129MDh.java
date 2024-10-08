package X;

import android.graphics.Bitmap;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.audience.AudienceUseCase;
import com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository;
import com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.creator.agent.settings.keyword.KeywordRepository;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;
import com.instagram.creator.agent.settings.summary.BioSummaryRepository;
import com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext;
import com.instagram.creator.agent.suggestedreplies.repository.CreatorAgentSuggestedRepliesRepository;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;
import com.instagram.creator.inspiration.repository.CreatorInspirationHubAccountsRepository;
import com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource;
import com.instagram.crossposting.story.StoryCrosspostingAudienceSettingManager;
import com.instagram.direct.avatar.powerups.api.AvatarPowerupsApi;
import com.instagram.direct.avatar.reactions.api.AvatarReactionsApi;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;
import com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository;
import com.instagram.direct.inbox.birthdays.BirthdayPogsApi;
import com.instagram.direct.securityalert.debug.SecurityAlertDevUtils;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.impl.HiddenWordsPostsDictionary;
import com.instagram.fanclub.consideration.FanClubConsiderationRepository;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.fanclub.consideration.FanClubCustomizedBenefitsRepository;
import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDh  reason: case insensitive filesystem */
public final class C66129MDh extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARNING: type inference failed for: r10v0, types: [X.MDh, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        A00(obj, this);
        switch (i) {
            case 0:
                return AudienceUseCase.A00((AudienceUseCase) this.A04, this);
            case 1:
                return AudienceUseCase.A01((AudienceUseCase) this.A04, this);
            case 2:
                return ((AvoidedTopicsRepository) this.A04).A02(this);
            case 3:
                return ((AvoidedTopicsRepository) this.A04).A01((String) null, (String) null, (List) null, this);
            case 4:
                return ((IGCreatorAIContentCategoriesRepository) this.A04).A01(this);
            case 5:
                return ((FactsRepository) this.A04).A03((String) null, (String) null, this);
            case 6:
                return ((KeywordRepository) this.A04).A05((String) null, this);
            case 7:
                return ((KeywordRepository) this.A04).A04((String) null, (String) null, this);
            case 8:
                return ((KeywordRepository) this.A04).A03((String) null, (String) null, (String) null, this);
            case 9:
                return ((KeywordRepository) this.A04).A01((Long) null, (String) null, (String) null, (String) null, (String) null, this);
            case 10:
                return ((KeywordRepository) this.A04).A02((Long) null, (String) null, (String) null, (String) null, this);
            case 11:
                return ((CreatorAiSettingsRepository) this.A04).A02(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((BioSummaryRepository) this.A04).A01(this);
            case 13:
                return ((BioSummaryRepository) this.A04).A00((String) null, this);
            case 14:
                return ((CreatorAgentSuggestedRepliesRepository) this.A04).A00((SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) null, (String) null, this, false);
            case 15:
                return CreatorAgentSuggestedRepliesSettingsRepository.A00((CreatorAgentSuggestedRepliesSettingsRepository) this.A04, this);
            case 16:
                return CreatorAgentSuggestedRepliesSettingsRepository.A01((CreatorAgentSuggestedRepliesSettingsRepository) this.A04, this, false);
            case 17:
                return ((CreatorInspirationHubAccountsRepository) this.A04).A00((String) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return CreatorInspirationHubReelsHScrollPagingSource.A00((CreatorInspirationHubReelsHScrollPagingSource) this.A04, (String) null, this);
            case 19:
                return ((StoryCrosspostingAudienceSettingManager) this.A04).A00(this);
            case 20:
                return ((AvatarPowerupsApi) this.A04).A00(this);
            case 21:
                return ((AvatarReactionsApi) this.A04).A00(this);
            case 22:
                return AvatarReactionsRepository.A00((AvatarReactionsRepository) this.A04, (List) null, this);
            case 23:
                return AvatarLocalStickerSearchRepository.A00((AvatarLocalStickerSearchRepository) this.A04, this);
            case 24:
                return DirectStickerSuggestionsController.A00((DirectStickerSuggestionsController) this.A04, this);
            case 25:
                return ((DirectCardGalleryRepository) this.A04).A08((String) null, (String) null, (String) null, this, false);
            case 26:
                return ((DirectCardGalleryRepository) this.A04).A09((String) null, (String) null, this);
            case 27:
                return BroadcastChannelActivityFeedV2ViewModel.A00((BroadcastChannelActivityFeedV2ViewModel) this.A04, this, 0);
            case 28:
                return ChannelsFeaturedEventListViewModel.A00((ChannelsFeaturedEventListViewModel) this.A04, (String) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return DirectShareSheetFragmentViewModel.A03((DirectShareSheetFragmentViewModel) this.A04, (String) null, this);
            case 30:
                return ((DirectPollMessageOptionVotersRepository) this.A04).A01((String) null, (String) null, this, false);
            case 31:
                return ((BirthdayPogsApi) this.A04).A00(this);
            case 32:
                return ((MCm) this.A04).A02((MQ0) null, this);
            case 33:
                return ((MCl) this.A04).A01(this, false);
            case 34:
                return ((C64830Liq) this.A04).A01(this, false);
            case 35:
                return SecurityAlertDevUtils.A02((UserSession) null, (SecurityAlertDevUtils) this.A04, this);
            case 36:
                return ArmadilloExpressNoteReplySender.A03((ArmadilloExpressNoteReplySender) this.A04, (String) null, this, 0, 0, false);
            case 37:
                return ArmadilloExpressNoteReplySender.A00((Bitmap) null, (ArmadilloExpressNoteReplySender) this.A04, this, 0, 0);
            case 38:
                return ((DirectConfigureMediaMessageMutationFactory) this.A04).A03((AnonymousClass797) null, (C254703su) null, (C65701gB) null, this);
            case 39:
                return AnonymousClass92T.A00((AnonymousClass92T) this.A04, this);
            case 40:
                return ((DictionaryRepository) this.A04).A01(this);
            case Seq.NULL_REFNUM:
                return ((HiddenWordsPostsDictionary) this.A04).Bat(this, false);
            case Seq.RefTracker.REF_OFFSET:
                return ((FanClubConsiderationRepository) this.A04).A01((String) null, this, false);
            case 43:
                return ((FanClubConsiderationRepository) this.A04).A02((String) null, this, false);
            case 44:
                return FanClubConsiderationViewModel.A06((FanClubConsiderationViewModel) this.A04, this);
            case 45:
                return ((FanClubCustomizedBenefitsRepository) this.A04).A00((List) null, this);
            case 46:
                return ((FanClubCustomizedBenefitsRepository) this.A04).A01((List) null, this);
            case 47:
                return SubscribedAndRecommendedCreatorListRepository.A00((SubscribedAndRecommendedCreatorListRepository) this.A04, (String) null, this);
            case 48:
                return SubscribedAndRecommendedCreatorListRepository.A01((SubscribedAndRecommendedCreatorListRepository) this.A04, (String) null, this);
            default:
                return ((SubscribedAndRecommendedCreatorListRepository) this.A04).A02(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66129MDh(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A04 = obj;
    }

    public static void A00(Object obj, C66129MDh mDh) {
        mDh.A02 = obj;
        mDh.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66129MDh) || ((C66129MDh) obj).A03 != i) {
            return false;
        }
        return true;
    }
}
