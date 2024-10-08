package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallLaunchConfig;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.repository.WallFeedRepository;
import com.instagram.wonderwall.repository.WallPendingPostManager;
import com.instagram.wonderwall.repository.WallPostRepository;

/* renamed from: X.Ghf  reason: case insensitive filesystem */
public final class C53047Ghf extends 2YL implements C66528MVg, C59623JQr {
    public final UserSession A00;
    public final WallLaunchConfig A01;
    public final WallFeedRepository A02;
    public final WallPendingPostManager A03;
    public final WallPostRepository A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;
    public final 05G A08 = 106.A01(0sn.A00);
    public final AnonymousClass0Ud A09;

    public C53047Ghf(UserSession userSession, WallLaunchConfig wallLaunchConfig, WallFeedRepository wallFeedRepository, WallPendingPostManager wallPendingPostManager) {
        0qQ.A0B(wallPendingPostManager, 4);
        this.A00 = userSession;
        this.A01 = wallLaunchConfig;
        this.A02 = wallFeedRepository;
        this.A03 = wallPendingPostManager;
        02z A10 = DbS.A10(new C53379Gn9());
        this.A07 = A10;
        this.A09 = A10;
        1HR A0w = G9w.A0w();
        this.A05 = A0w;
        this.A06 = 0u9.A04(A0w);
        this.A04 = new WallPostRepository(new WallApiGraphQLImpl(userSession), C56353Hx4.A00(userSession), new C57480IbU(this));
        C318136oS A002 = C318116oQ.A00(this);
        C58106ImS imS = new C58106ImS((Object) this, (AnonymousClass4D7) null, 11);
        19B r3 = 19B.A00;
        1Eo.A05(r3, new C58106ImS((Object) this, (AnonymousClass4D7) null, 9), C51967G9n.A0M(this, r3, imS, A002));
        WallFeedRepository wallFeedRepository2 = this.A02;
        DbY.A19(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 12), AnonymousClass10H.A01(new C58124Imq(this, 2), wallFeedRepository2.A0B, wallFeedRepository2.A0C, wallFeedRepository2.A0A, this.A08));
    }

    public final void ADx(User user) {
        0qQ.A0B(user, 0);
        A00(new M18(user, C59098J6g.A01(this, 15)), this);
    }

    public final void Dzv(WallPostItem wallPostItem) {
        0qQ.A0B(wallPostItem, 0);
        if (wallPostItem.BeB().A01()) {
            Dzw(wallPostItem);
        } else {
            A00(new M1A(wallPostItem, false), this);
        }
    }

    public final void Dzw(WallPostItem wallPostItem) {
        WallMenuConfig A002;
        WallPostItem wallPostItem2 = wallPostItem;
        0qQ.A0B(wallPostItem, 0);
        WallInfo wallInfo = (WallInfo) ((C53379Gn9) this.A09.getValue()).A03;
        if (wallInfo != null && (A002 = C55207Hdx.A00(wallInfo, wallPostItem.BeB(), wallPostItem2, this.A04, this, C318116oQ.A00(this))) != null) {
            A00(new C57494Ibi(A002), this);
        }
    }

    public final void Dzz(C61046Jvk jvk, WallPostItem wallPostItem) {
        C318136oS A0R = C51975G9x.A0R(this, wallPostItem);
        AnonymousClass7TE.A1Z(new MHK((Object) wallPostItem, (Object) jvk, (Object) this, (AnonymousClass4D7) null, 31), A0R);
    }

    public final void E00(WallPostItem wallPostItem) {
        0qQ.A0B(wallPostItem, 0);
        A00(new M1A(wallPostItem, true), this);
    }

    public final void EGN(WallPostItem wallPostItem) {
        0qQ.A0B(wallPostItem, 0);
        A00(new C57496Ibk(wallPostItem, new J6T(31, (Object) wallPostItem, (Object) this)), this);
    }

    public static boolean A01(C53379Gn9 gn9, C55817Hnx hnx, Object obj, 05G r12) {
        AnonymousClass62P r3 = (AnonymousClass62P) gn9.A02;
        boolean z = gn9.A09;
        boolean z2 = gn9.A06;
        boolean z3 = gn9.A07;
        boolean z4 = gn9.A08;
        boolean z5 = gn9.A04;
        boolean z6 = gn9.A05;
        0qQ.A0B(r3, 0);
        return r12.AIY(obj, new C53379Gn9(hnx, (WallInfo) gn9.A03, r3, z, z2, z3, z4, z5, z6));
    }

    public final void CLN() {
        Object value;
        05G r3 = this.A07;
        do {
            value = r3.getValue();
        } while (!A01((C53379Gn9) value, (C55817Hnx) null, value, r3));
    }

    public final void DwK(String str) {
        A00(new C57493Ibh(str), this);
    }

    public final void Dzy(String str) {
        A00(new C57492Ibg(str), this);
    }

    public final void EuO(C55817Hnx hnx) {
        Object value;
        05G r2 = this.A07;
        do {
            value = r2.getValue();
        } while (!A01((C53379Gn9) value, hnx, value, r2));
    }

    public final void EvQ(WallText wallText) {
        A00(new C57495Ibj(wallText), this);
    }

    public static final void A00(JMK jmk, C53047Ghf ghf) {
        C51975G9x.A1E(jmk, ghf, C318116oQ.A00(ghf), 23);
    }
}
