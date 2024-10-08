package X;

import android.content.Context;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource;
import com.instagram.direct.avatar.powerups.repository.AvatarPowerupsRepository;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository;
import com.instagram.nme.contextualpromo.ContextualPromoHelper;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.opal.impl.data.OpalRepoUtil;
import com.instagram.pendingmedia.service.impl.ShareAlbumHelper;
import com.instagram.profilecard.data.ProfileCardRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.domainmodel.IgLiveSponsorKt;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;
import java.util.List;
import java.util.Map;

public final class ME1 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME1(AnonymousClass4D7 r2) {
        super(r2);
        this.A08 = 15;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, ME1 me1) {
        me1.A01 = obj;
        me1.A02 = obj2;
        me1.A03 = obj3;
        me1.A04 = obj4;
    }

    public static void A01(Object obj, ME1 me1) {
        me1.A06 = obj;
        me1.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof ME1) || ((ME1) obj).A08 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4D7, X.ME1] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A08) {
            case 0:
                A01(obj, this);
                return ((C62942Kou) this.A07).A00(this, (0sL) null);
            case 1:
                A01(obj, this);
                return ((C62942Kou) this.A07).A01(this, (0sL) null);
            case 2:
                A01(obj, this);
                return ((InAppPurchaseControllerCoro) this.A07).A0F((C7610QOs) null, (Map) null, this);
            case 3:
                A01(obj, this);
                return ClipsNetworkImportDraftRepository.A01((ClipsNetworkImportDraftRepository) this.A07, (AnonymousClass55Q) null, (String) null, (List) null, this, (C62320sa) null);
            case 4:
                A01(obj, this);
                return ClipsACRBrowserPagingSource.A01((ClipsACRBrowserPagingSource) this.A07, (JVX) null, (String) null, (String) null, (List) null, this);
            case 5:
                A01(obj, this);
                return ((AvatarPowerupsRepository) this.A07).A00(this);
            case 6:
                A01(obj, this);
                return ArmadilloExpressLinkMessageSender.A01((DirectForwardingParams) null, (N2L) null, (ArmadilloExpressLinkMessageSender) this.A07, (1cX) null, this);
            case 7:
                A01(obj, this);
                return AnonymousClass92U.A01((AnonymousClass92U) this.A07, (AnonymousClass92T) null, (List) null, (List) null, this);
            case 8:
                A01(obj, this);
                return ((ActivityFeedRecommendedUserRepository) this.A07).A00((FollowStatus) null, (EWA) null, (User) null, this);
            case 9:
                A01(obj, this);
                return ((ContextualPromoHelper) this.A07).A01((C62628Kiz) null, (String) null, this);
            case 10:
                A01(obj, this);
                return ((ContextualPromoHelper) this.A07).A00((C62628Kiz) null, (String) null, (String) null, (String) null, this);
            case 11:
                A01(obj, this);
                return ((OpalRepoUtil) this.A07).A01((Context) null, (UserSession) null, (1vn) null, (OpalProfileData) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A01(obj, this);
                return ((ShareAlbumHelper) this.A07).A00((LP8) null, this);
            case 13:
                A01(obj, this);
                return ((ProfileCardRepository) this.A07).A00(this);
            case 14:
                A01(obj, this);
                return SettingsScreenViewModel.A00((C62551Khh) null, (SettingsScreenViewModel) this.A07, (C66460MSo) null, (Object) null, (String) null, (String) null, this);
            case 15:
                this.A07 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return IgLiveSponsorKt.A00((UserSession) null, (List) null, this);
            case 16:
                A01(obj, this);
                return WriteSuggestionsRepository.A01((WriteSuggestionsRepository) this.A07, (C56568I1x) null, this);
            default:
                A01(obj, this);
                return I7H.A01((Context) null, (C53452Gok) null, (ClipsDraftPreviewItemRepository) null, (UserSession) null, (I7H) this.A07, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME1(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A08 = i;
        this.A07 = obj;
    }
}
