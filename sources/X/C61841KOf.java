package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.KOf  reason: case insensitive filesystem */
public final class C61841KOf extends LSR {
    public C253353qe A00;
    public DV3 A01;
    public NewFundraiserInfo A02;
    public AnonymousClass3QO A03;
    public ExistingStandaloneFundraiserForFeedModel A04;
    public String A05;
    public HashSet A06;
    public LinkedHashSet A07;
    public LinkedHashSet A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public final UserSession A0C;
    public final LRK A0D;
    public final String A0E = AnonymousClass7TG.A0j();
    public final C262224Cq A0F;
    public final 0V2 A0G;
    public final C61770pa A0H;

    public final void A0A() {
        this.A02 = null;
        this.A04 = null;
        C62915KoT.A00 = false;
        AnonymousClass1Nd.A00(this.A0C).A00(new C64665Lfr(false));
        MH9.A04(this, this.A0F, 35);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C61841KOf(UserSession userSession, LRK lrk) {
        super(lrk);
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U().A04);
        AnonymousClass7TG.A1P(userSession, A022);
        this.A0C = userSession;
        this.A0D = lrk;
        this.A0F = A022;
        05D A0p = JTQ.A0p();
        this.A0G = A0p;
        this.A0H = JTP.A10(A0p);
        this.A06 = AnonymousClass7TE.A1F();
        this.A07 = DbS.A0y();
        this.A08 = DbS.A0y();
        this.A09 = AnonymousClass7TE.A1C();
        this.A05 = "";
    }

    public final void A0B() {
        User A012 = AnonymousClass0t1.A01.A01(this.A0C);
        this.A02 = new NewFundraiserInfo(A012.getId(), (String) null, A012.B8Q(), (String) null, "FEED_COMPOSER", A012.A03.Amu(), FundraiserCampaignTypeEnum.IG_CHARITY_BUSINESS_PROFILE.toString(), (String) null, 0sn.A00, -1, false);
        MH9.A04(this, this.A0F, 36);
    }
}
