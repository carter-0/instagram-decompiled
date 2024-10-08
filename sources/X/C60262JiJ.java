package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.util.List;

/* renamed from: X.JiJ  reason: case insensitive filesystem */
public abstract class C60262JiJ extends 2YL {
    public int A00;
    public C262204Co A01;
    public final 2Fk A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass0t1 A05;
    public final L5M A06;
    public final IgLiveBroadcastInfoManager A07;
    public final C313816h4 A08;
    public final LES A09;
    public final C59720JVe A0A;
    public final C249513ju A0B;
    public final AnonymousClass0r6 A0C;
    public final 05G A0D;
    public final boolean A0E;
    public final L7I A0F;

    public C60262JiJ(AnonymousClass0iw r6, UserSession userSession, AnonymousClass0t1 r8, L7I l7i, L5M l5m, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r12, LES les, C59720JVe jVe, boolean z) {
        this.A04 = userSession;
        this.A03 = r6;
        this.A09 = les;
        this.A07 = igLiveBroadcastInfoManager;
        this.A08 = r12;
        this.A0A = jVe;
        this.A0E = z;
        this.A0F = l7i;
        this.A06 = l5m;
        this.A05 = r8;
        02z A10 = DbS.A10(new C61027JvR(true, false, false, 0));
        this.A0D = A10;
        1HR A0w = G9w.A0w();
        this.A0B = A0w;
        this.A0C = 0u9.A04(A0w);
        this.A02 = DbT.A0G(AnonymousClass10H.A00(new MHu(this, (AnonymousClass4D7) null), igLiveBroadcastInfoManager.A06, A10, les.A0i));
        JTS.A13(this, MHB.A01(this, (AnonymousClass4D7) null, 24), jVe.A00);
    }

    public final void A01(MVW mvw) {
        User user;
        String str;
        String str2;
        0qQ.A0B(mvw, 0);
        AnonymousClass0Ud r1 = this.A07.A06;
        C61013JvD A0r = JTO.A0r(r1);
        if (A0r != null && (user = A0r.A05) != null) {
            String id = user.getId();
            L5M l5m = this.A06;
            C61013JvD A0r2 = JTO.A0r(r1);
            if (A0r2 != null) {
                str = A0r2.A09;
            } else {
                str = null;
            }
            long A002 = this.A08.A00();
            0sn r3 = 0sn.A00;
            0qQ.A0B(r3, 4);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(l5m.A00, l5m.A01), "ig_live_client_comment_impression");
            Long A0n = 00y.A0n(10, id);
            long j = 0;
            JTQ.A0z(A0e, DbY.A04(A0n));
            User CCd = mvw.CCd();
            if (CCd != null) {
                j = JTR.A0M(CCd.getId());
            }
            A0e.A9F("ca_pk", Long.valueOf(j));
            C62584KiH BNP = mvw.BNP();
            if (BNP == null || (str2 = BNP.A01) == null) {
                str2 = C62584KiH.A0K.A01;
            }
            A0e.AAJ("comment_type", str2);
            if (str == null) {
                str = "";
            }
            C51965G9l.A1I(A0e, str);
            A0e.A9F("live_position", Long.valueOf(A002));
            A0e.AAe("friend_chat_ids", r3);
            A0e.A7p("is_from_pill", false);
            A0e.Cgf();
        }
    }

    public void A00(MVW mvw) {
        AnonymousClass4D7 A0t = C51975G9x.A0t(this.A01);
        this.A01 = C51966G9m.A1L(new C66160MFx(this, A0t, 47), C318116oQ.A00(this));
    }

    public void A02(List list, int i, boolean z, boolean z2, boolean z3) {
        05G r2 = this.A0D;
        r2.Epw(new C61027JvR(z, z2, ((C61027JvR) r2.getValue()).A01, i));
    }
}
