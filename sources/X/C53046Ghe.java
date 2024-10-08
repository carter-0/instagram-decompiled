package X;

import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.repository.AggregatedWallFeedRepository;

/* renamed from: X.Ghe  reason: case insensitive filesystem */
public final class C53046Ghe extends 2YL implements C66528MVg {
    public final AggregatedWallFeedRepository A00;
    public final C249513ju A01;
    public final AnonymousClass0r6 A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final UserSession A05;
    public final boolean A06;

    public final void Dzv(WallPostItem wallPostItem) {
        JMJ ibf;
        0qQ.A0B(wallPostItem, 0);
        if (this.A06) {
            ibf = new C57490Ibe(wallPostItem.BeB().A04.A00.getId());
        } else {
            ibf = new C57491Ibf(wallPostItem);
        }
        C51975G9x.A1E(ibf, this, C318116oQ.A00(this), 21);
    }

    public final void Dzw(WallPostItem wallPostItem) {
    }

    public final void Dzz(C61046Jvk jvk, WallPostItem wallPostItem) {
    }

    public final void E00(WallPostItem wallPostItem) {
    }

    public final void DwK(String str) {
        C51975G9x.A1E(new C57489Ibd(str), this, C318116oQ.A00(this), 21);
    }

    public final void Dzy(String str) {
        C51975G9x.A1E(new C57488Ibc(str), this, C318116oQ.A00(this), 21);
    }

    public C53046Ghe(UserSession userSession, AggregatedWallFeedRepository aggregatedWallFeedRepository) {
        this.A05 = userSession;
        this.A00 = aggregatedWallFeedRepository;
        boolean A062 = 182.A06(0Tu.A05, userSession, 2342165362953365603L);
        this.A06 = A062;
        02z A10 = DbS.A10(new C61071Jw9(A062));
        this.A03 = A10;
        this.A04 = A10;
        1HR A0w = G9w.A0w();
        this.A01 = A0w;
        this.A02 = 0u9.A04(A0w);
        C58106ImS.A03(this, C318116oQ.A00(this), 5);
        DbY.A19(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 8), AnonymousClass10H.A03(new C66192MHi((Object) this, (AnonymousClass4D7) null, 17), aggregatedWallFeedRepository.A07, aggregatedWallFeedRepository.A06));
    }
}
