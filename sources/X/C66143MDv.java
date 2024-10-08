package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.memu.consentflow.api.MemuCreatorTemplatesConsentGraphQLApi;
import com.instagram.creation.genai.memu.util.MEmuUtil;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository;
import com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.creator.agent.settings.keyword.KeywordRepository;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;
import com.instagram.creator.agent.settings.summary.BioSummaryRepository;
import com.instagram.creator.ghostwriter.graphql.GhostWriterGraphQLDataSource;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;
import com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsStashDownloader;
import com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository;
import com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MDv  reason: case insensitive filesystem */
public final class C66143MDv extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66143MDv(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static void A00(Object obj, C66143MDv mDv) {
        mDv.A02 = obj;
        mDv.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A01(Object obj, C66143MDv mDv) {
        mDv.A01 = obj;
        mDv.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C66143MDv) || ((C66143MDv) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.MDv, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A01(obj, this);
                return ((MemuCreatorTemplatesConsentGraphQLApi) this.A02).A00((UserSession) null, this);
            case 1:
                A01(obj, this);
                return ((MEmuUtil) this.A02).A01((UserSession) null, this);
            case 2:
                A01(obj, this);
                return ((MEmuUtil) this.A02).A00((UserSession) null, (List) null, this);
            case 3:
                A01(obj, this);
                return ((MEmuUtil) this.A02).A02((UserSession) null, this);
            case 4:
                A01(obj, this);
                return ((MEmuUtil) this.A02).A03((UserSession) null, this, false);
            case 5:
            case 6:
                A00(obj, this);
                return ((C58038IkW) this.A01).emit((Object) null, this);
            case 7:
                A01(obj, this);
                return ((CreatorAIFanNuxRepository) this.A02).A01(this);
            case 8:
                A01(obj, this);
                return ((CreatorAIFanNuxRepository) this.A02).A02(this);
            case 9:
                A01(obj, this);
                return ((CreatorAIFanNuxRepository) this.A02).A03(this);
            case 10:
                A01(obj, this);
                return ((CreatorAIFanNuxRepository) this.A02).A04(this);
            case 11:
                A01(obj, this);
                return ((AudienceRepository) this.A02).A04(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return ((AudienceRepository) this.A02).A05(this);
            case 13:
                A01(obj, this);
                return ((AudienceRepository) this.A02).A06(this);
            case 14:
                A01(obj, this);
                return ((AudienceRepository) this.A02).A01((HNK) null, (String) null, this);
            case 15:
                A01(obj, this);
                return ((AudienceRepository) this.A02).A00((JZA) null, this);
            case 16:
                A01(obj, this);
                return ((AudienceRepository) this.A02).A02((String) null, (List) null, (List) null, this);
            case 17:
                A01(obj, this);
                return ((AvoidedTopicsRepository) this.A02).A00((C61037Jvb) null, (String) null, (String) null, (String) null, this);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A01(obj, this);
                return ((IGCreatorAIContentCategoriesRepository) this.A02).A00((HND) null, this, false);
            case 19:
                A01(obj, this);
                return ((FactsRepository) this.A02).A02((String) null, (String) null, (String) null, this);
            case 20:
                A00(obj, this);
                return ((C58034IkS) this.A01).emit((Object) null, this);
            case 21:
                A01(obj, this);
                return ((KeywordRepository) this.A02).A06((String) null, this);
            case 22:
                A01(obj, this);
                return ((KeywordRepository) this.A02).A07((String) null, this);
            case 23:
                A01(obj, this);
                return ((CreatorAiSettingsRepository) this.A02).A00((String) null, this, 0);
            case 24:
                A01(obj, this);
                return ((BioSummaryRepository) this.A02).A02(this);
            case 25:
                A01(obj, this);
                return ((GhostWriterGraphQLDataSource) this.A02).A00((String) null, (String) null, this);
            case 26:
                A01(obj, this);
                return ((GhostWriterGraphQLDataSource) this.A02).A01((String) null, (String) null, this);
            case 27:
                A01(obj, this);
                return ((CreatorToolsMonetizationApi) this.A02).A03(this);
            case 28:
                A01(obj, this);
                return ((CreatorToolsMonetizationApi) this.A02).A02((String) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A01(obj, this);
                return ((CreatorToolsMonetizationApi) this.A02).A00((String) null, (String) null, this);
            case 30:
                A01(obj, this);
                return ((CreatorToolsMonetizationApi) this.A02).A01((String) null, (String) null, this);
            case 31:
                A01(obj, this);
                return ((AvatarPowerupsAssetsStashDownloader) this.A02).AQ5((C61008Jv7) null, this);
            case 32:
                A00(obj, this);
                return MCn.A00(this.A01, this);
            case 33:
            case 35:
            case 36:
            case 38:
            case 39:
            case 40:
            case Seq.RefTracker.REF_OFFSET:
            case 43:
                A00(obj, this);
                return ((MCi) this.A01).emit((Object) null, this);
            case 34:
                A01(obj, this);
                return ((C51632FxQ) this.A02).A02((C48168EaA) null, this);
            case 37:
                A00(obj, this);
                return ((C73529PeL) this.A01).emit((Object) null, this);
            case Seq.NULL_REFNUM:
            case 44:
                A00(obj, this);
                return ((C73530PeM) this.A01).emit((Object) null, this);
            case 45:
            case 46:
                A00(obj, this);
                return ((C51630FxO) this.A01).emit((Object) null, this);
            case 47:
                A01(obj, this);
                return ((ChannelXpostingRepository) this.A02).A01((String) null, this);
            case 48:
                A01(obj, this);
                return ((DirectShareSheetRecipientRepository) this.A02).A00((C48091EVj) null, (String) null, (List) null, this);
            default:
                A01(obj, this);
                return ((DirectShareSheetRecipientRepository) this.A02).A02((List) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66143MDv(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
