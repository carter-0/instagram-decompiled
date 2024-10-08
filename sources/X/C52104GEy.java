package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.GEy  reason: case insensitive filesystem */
public final class C52104GEy implements JRD, JQ0 {
    public 0sP A00;
    public 0sP A01;
    public 0sL A02;
    public 0sK A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final SearchContext A06;
    public final AnonymousClass93U A07;
    public final H3C A08;
    public final JQ0 A09;
    public final C55684Hlh A0A;

    public final void DDo(GEM gem) {
        0qQ.A0B(gem, 0);
        User user = gem.A04;
        1Xj r0 = gem.A01;
        UserSession userSession = this.A05;
        C319976rX.A07(this.A04, userSession, C319976rX.A00(userSession, user), "follow", user.getId(), r0.getId(), r0.C9L());
    }

    public final void DGT(GEM gem) {
        0qQ.A0B(gem, 0);
        UserSession userSession = this.A05;
        GLN A002 = GLB.A00(MusicPageTabType.CLIPS, userSession);
        1Xj r5 = gem.A01;
        A002.A01(C51966G9m.A0n(r5), userSession, "follow_creator", this.A04.getModuleName());
        CIR(gem.A00, C52318GNk.ITEM_INTERACTION, C52317GNj.A0G);
        AnonymousClass2f1 A003 = AnonymousClass2f1.A00(userSession);
        User user = gem.A04;
        boolean A1W = AnonymousClass7TF.A1W(A003.A0N(user), FollowStatus.A05);
        0sL r2 = this.A02;
        if (r2 != null) {
            r2.invoke(Boolean.valueOf(A1W), user.getUsername());
        }
        if (A1W) {
            JU5 A004 = C63289KuY.A00(userSession);
            C51971G9r.A1P(A004, A004.A0N, 1);
            H3C h3c = this.A08;
            if (h3c != null) {
                H3C.A02(h3c, AnonymousClass05K.A00, r5.getId());
            }
        }
    }

    public final void Duv(AnonymousClass3W1 r13, GEM gem) {
        0sK r1 = this.A03;
        if (r1 != null) {
            1Xj r5 = gem.A01;
            C51967G9n.A1N(r5, Boolean.valueOf(r5.A4b()), r1, true);
            AnonymousClass0iw r3 = this.A04;
            long position = (long) r13.getPosition();
            C67231sQ A0n = C51966G9m.A0n(r5);
            Long l = null;
            if (A0n != null) {
                l = C291335gz.A04(A0n);
            }
            UserSession userSession = this.A05;
            String str = this.A0A.A00;
            C56246HvD.A01(r3, userSession, r5, this.A06, this.A07, l, str, position);
            ArrayList A3I = r5.A3I();
            String A0q = C51972G9s.A0q(userSession, r5);
            if (A3I != null && !A3I.isEmpty() && LOQ.A00.A01(userSession, A0q, r5.A5G()) && !r5.A4b()) {
                C51974G9v.A1H(userSession, r5, C51973G9u.A0l(r5), A3I);
            }
        }
    }

    public final void ER2(0sK r2) {
        0qQ.A0B(r2, 0);
        this.A09.ER2(r2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.JQ0] */
    public /* synthetic */ C52104GEy(AnonymousClass0iw r2, UserSession userSession, SearchContext searchContext, AnonymousClass93U r5, H3C h3c, C55684Hlh hlh) {
        ? obj = new Object();
        this.A05 = userSession;
        this.A04 = r2;
        this.A0A = hlh;
        this.A07 = r5;
        this.A06 = searchContext;
        this.A08 = h3c;
        this.A09 = obj;
    }

    public final void DPf(AnonymousClass3W1 r3, GEM gem) {
        0sP r1 = this.A00;
        if (r1 != null) {
            r1.invoke(gem.A01);
        }
    }

    public final void DVc(AnonymousClass3W1 r3, GEM gem) {
        0sP r1 = this.A01;
        if (r1 != null) {
            r1.invoke(gem.A01);
        }
    }

    public final void CIR(C267324bN r2, C52318GNk gNk, C52317GNj gNj) {
        DbY.A1S(gNk, gNj);
        this.A09.CIR(r2, gNk, gNj);
    }

    public final void EbV(0sP r1) {
        this.A00 = r1;
    }

    public final void EbW(0sP r1) {
        this.A01 = r1;
    }

    public final void EbX(0sK r1) {
        this.A03 = r1;
    }

    public final void EeP(0sL r1) {
        this.A02 = r1;
    }
}
