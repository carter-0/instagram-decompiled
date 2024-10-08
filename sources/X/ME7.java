package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi;
import com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageRepository;
import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository;
import com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository;
import com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.impl.HiddenWordsPostsDictionary;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class ME7 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r13v0, types: [X.ME7, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A01(obj, this);
                return ((DirectShareSheetApi) this.A02).A00((UserSession) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (List) null, this, 0, false);
            case 1:
            case 32:
            case 33:
            case 34:
                A00(obj, this);
                return ((MCf) this.A01).emit((Object) null, this);
            case 2:
            case 10:
            case 11:
                A00(obj, this);
                return ((C73529PeL) this.A01).emit((Object) null, this);
            case 3:
                A00(obj, this);
                return ((MCP) this.A01).emit((Object) null, this);
            case 4:
                A01(obj, this);
                return DirectPollMessageOptionVotersRepository.A00((DirectPollMessageOptionVotersRepository) this.A02, (String) null, (String) null, this);
            case 5:
            case 8:
                A00(obj, this);
                return ((C51632FxQ) this.A01).emit((Object) null, this);
            case 6:
                A01(obj, this);
                return ((ThreadDetailCustomGroupNameAndImageRepository) this.A02).A00((String) null, (String) null, this);
            case 7:
                A00(obj, this);
                return ((MCi) this.A01).emit((Object) null, this);
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 39:
            case 40:
                A00(obj, this);
                return ((C73530PeM) this.A01).emit((Object) null, this);
            case 13:
                A01(obj, this);
                return ((OptimisticNetworkOperation) this.A02).A03(this);
            case 14:
                A01(obj, this);
                return ((OptimisticNetworkOperation) this.A02).A04(this);
            case 15:
                A01(obj, this);
                return ((NotesApi) this.A02).A05((String) null, this);
            case 16:
                A00(obj, this);
                return MCn.A00(this.A01, this);
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 20:
                A00(obj, this);
                return ((MCl) this.A01).emit((Object) null, this);
            case 21:
                A01(obj, this);
                return MagicMediaRemixContentCompositor.A01((C389549po) null, (MagicMediaRemixContentCompositor) this.A02, this);
            case 22:
                A00(obj, this);
                return ((MCm) this.A01).emit((Object) null, this);
            case 23:
                A01(obj, this);
                return ((DirectDailyPromptsResponseListRepository) this.A02).A02((String) null, (String) null, this);
            case 24:
                A01(obj, this);
                return CollectionItemEmojiReactionsListRepository.A00((CollectionItemEmojiReactionsListRepository) this.A02, this, 0);
            case 25:
                A01(obj, this);
                return DirectEmojiReactionsListRepository.A00((DirectEmojiReactionsListRepository) this.A02, this);
            case 26:
                A01(obj, this);
                return DirectTabbedEmojiReactionRepository.A00((DirectTabbedEmojiReactionRepository) this.A02, (String) null, (String) null, (String) null, (String) null, this);
            case 27:
                A00(obj, this);
                return DirectThreadApi.A0J((UserSession) null, (String) null, this, (C62320sa) null);
            case 28:
                A01(obj, this);
                return ((SecurityAlertLocalDataSource) this.A02).A00(this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return ((ContentFilterDictionarySyncManager) this.A02).A02((UserSession) null, (String) null, (List) null, this);
            case 30:
                A01(obj, this);
                return ((DictionaryRepository) this.A02).A00(this);
            case 31:
                A01(obj, this);
                return ((HiddenWordsPostsDictionary) this.A02).FL5((List) null, (List) null, this);
            case 35:
                A00(obj, this);
                throw AnonymousClass7TE.A11("emit");
            case 36:
                A00(obj, this);
                throw AnonymousClass7TE.A11("emit");
            case 37:
                A00(obj, this);
                throw AnonymousClass7TE.A11("emit");
            case 38:
                A00(obj, this);
                return ((C41500Av1) this.A01).emit((Object) null, this);
            case Seq.NULL_REFNUM:
                A01(obj, this);
                return ((FanClubApi) this.A02).A03((String) null, (String) null, this);
            case Seq.RefTracker.REF_OFFSET:
                A01(obj, this);
                return ((FanClubApi) this.A02).A0O((List) null, this, false);
            case 43:
                A01(obj, this);
                return ((FanClubApi) this.A02).A0K((List) null, this);
            case 44:
                A01(obj, this);
                return ((FanClubApi) this.A02).A08((String) null, this);
            case 45:
                A01(obj, this);
                return ((FanClubApi) this.A02).A09((String) null, this);
            case 46:
                A01(obj, this);
                return ((FanClubApi) this.A02).A0P(this);
            case 47:
                A01(obj, this);
                return ((FanClubApi) this.A02).A0A((String) null, this);
            case 48:
                A01(obj, this);
                return ((FanClubApi) this.A02).A0T(this, false, false);
            default:
                A01(obj, this);
                return ((FanClubApi) this.A02).A01((FanClubCategoryType) null, this, false, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME7(AnonymousClass4D7 r2) {
        super(r2);
        this.A03 = 27;
    }

    public static void A00(Object obj, ME7 me7) {
        me7.A02 = obj;
        me7.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A01(Object obj, ME7 me7) {
        me7.A01 = obj;
        me7.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof ME7) || ((ME7) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME7(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME7(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }
}
