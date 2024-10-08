package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class DcR extends C392289uY implements G76 {
    public User A00;
    public C49337Ets A01;
    public final int A02;
    public final UserSession A03;
    public final C332647Vv A04;
    public final AnonymousClass4kA A05;
    public final FragmentActivity A06;

    public final View A06(Context context) {
        C242043Sk r1;
        0qQ.A0B(context, 0);
        User user = this.A00;
        if (user != null) {
            r1 = user.A03.BcS();
        } else {
            r1 = null;
        }
        C49337Ets ets = new C49337Ets(context, r1, this);
        this.A01 = ets;
        return ets.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        if (r7.isEmpty() != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C39761A8b r9, X.C74401PuH r10, X.AnonymousClass2Ep r11, boolean r12) {
        /*
            r8 = this;
            r5 = 1
            X.0qQ.A0B(r10, r5)
            if (r11 == 0) goto L_0x00ea
            java.util.List r0 = r11.BRZ()
            java.lang.Object r2 = X.00k.A0J(r0)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r7 = 0
            if (r2 == 0) goto L_0x0021
            com.instagram.common.session.UserSession r0 = r8.A03
            X.17i r1 = X.17h.A00(r0)
            java.lang.String r0 = r2.getId()
            com.instagram.user.model.User r7 = r1.A02(r0)
        L_0x0021:
            r8.A00 = r7
            boolean r0 = r11.CUG()
            r4 = 0
            if (r0 != 0) goto L_0x00ea
            if (r7 == 0) goto L_0x00ea
            com.instagram.common.session.UserSession r3 = r8.A03
            X.2f1 r0 = X.AnonymousClass2f1.A00(r3)
            boolean r0 = r0.A0Q(r7)
            if (r0 == 0) goto L_0x00ea
            X.4Cl r0 = r7.A03
            X.3Sk r0 = r0.BcS()
            if (r0 == 0) goto L_0x00ea
            java.util.List r0 = r0.BcT()
            if (r0 == 0) goto L_0x00ea
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r5) goto L_0x00ea
            X.4kA r6 = r8.A05
            X.0s0 r2 = r6.A07
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 18
            int r1 = X.DbY.A03(r6, r2, r1, r0)
            int r0 = r8.A02
            if (r1 >= r0) goto L_0x00ea
            X.4Cl r0 = r7.A03
            X.3Sk r0 = r0.BcS()
            if (r0 == 0) goto L_0x0097
            java.util.List r0 = r0.BcT()
            if (r0 == 0) goto L_0x0097
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x0072:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r2 = r6.next()
            r0 = r2
            X.47o r0 = (X.C2609247o) r0
            java.lang.Boolean r1 = r0.CX9()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0072
            r7.add(r2)
            goto L_0x0072
        L_0x0091:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00ea
        L_0x0097:
            X.7Vv r0 = r8.A04
            if (r0 == 0) goto L_0x00ea
            X.7Vu r2 = r0.A00
            X.0sa r0 = r2.A0J
            java.lang.Object r1 = r0.invoke()
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            X.9YB r0 = r2.A00
            if (r0 == 0) goto L_0x00ea
            if (r1 == 0) goto L_0x00ea
            X.0sa r0 = r2.A0F
            java.lang.Object r0 = r0.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7ZY r0 = r0.BSN()
            java.util.ArrayList r0 = r0.Bk1(r5)
            boolean r0 = X.DbT.A1b(r0)
            if (r0 != 0) goto L_0x00ea
            int r1 = r1.A1c()
            X.0sa r0 = r2.A0K
            java.lang.Object r0 = r0.invoke()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3kE r1 = r0.A0X(r1, r4)
            boolean r0 = r1 instanceof X.C68801NXl
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r1 instanceof X.AnonymousClass7PR
            if (r0 != 0) goto L_0x00ea
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318230570145803(0x81073d0001180b, double:3.0311334821119746E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ea
            r10.DoM(r8)
            return
        L_0x00ea:
            r10.onFailure()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DcR.A07(X.A8b, X.PuH, X.2Ep, boolean):void");
    }

    public final void A04(boolean z) {
        C321716ud A002 = C321706uc.A00(this.A03);
        User user = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(A002.A01, "instagram_ibc_profile_actions");
        if (A0e.isSampled() && user != null) {
            Dbc.A0Z(A0e, A002);
            DbS.A1L(A0e, "see_channel_button");
            DbS.A1J(A0e, "impression");
            Dbc.A0a(A0e, A002, user, "channel_upsell_banner_rendered");
            Dba.A18(A0e);
            String str = A002.A00;
            if (str == null) {
                0qQ.A0F("sessionId");
                throw AnonymousClass00P.createAndThrow();
            } else {
                A0e.AAJ(C66654MaN.A00(), str);
                A0e.Cgf();
            }
        }
        AnonymousClass4kA r3 = this.A05;
        r3.A04(DbY.A03(r3, r3.A07, AnonymousClass4kA.A0c, 18) + 1);
    }

    public final void onActionClicked() {
        String str;
        C242043Sk BcS;
        List BcT;
        UserSession userSession = this.A03;
        C321716ud A002 = C321706uc.A00(userSession);
        User user = this.A00;
        boolean z = false;
        if (!(user == null || (BcS = user.A03.BcS()) == null || (BcT = BcS.BcT()) == null || BcT.size() <= 1)) {
            z = true;
        }
        0Aj A0e = AnonymousClass7TE.A0e(A002.A01, "instagram_ibc_profile_actions");
        if (A0e.isSampled() && user != null) {
            Dbc.A0Z(A0e, A002);
            Dba.A1B(A0e, "source", "see_channel_button");
            if (z) {
                str = AnonymousClass000.A00(544);
            } else {
                str = "single_channel_rendered";
            }
            Dbc.A0a(A0e, A002, user, str);
            Dba.A18(A0e);
            String str2 = A002.A00;
            if (str2 == null) {
                0qQ.A0F("sessionId");
                throw AnonymousClass00P.createAndThrow();
            } else {
                A0e.AAJ(C66654MaN.A00(), str2);
                A0e.Cgf();
            }
        }
        this.A05.A04(this.A02);
        0qQ.A0B(userSession, 0);
        ((C65274LqT) userSession.A01(C65274LqT.class, new C41655Ay7(userSession, 10))).CpO(this.A06, this.A00, "creator_dm", false);
        C49337Ets ets = this.A01;
        if (ets != null) {
            ets.A00.setVisibility(8);
        }
    }

    public final void onBannerDismissed() {
        C321716ud A002 = C321706uc.A00(this.A03);
        User user = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(A002.A01, "instagram_ibc_profile_actions");
        if (A0e.isSampled() && user != null) {
            Dbc.A0Z(A0e, A002);
            Dba.A1B(A0e, "source", "see_channel_button");
            Dbc.A0a(A0e, A002, user, "dismiss_channel_upsell_banner");
            Dba.A18(A0e);
            String str = A002.A00;
            if (str == null) {
                0qQ.A0F("sessionId");
                throw AnonymousClass00P.createAndThrow();
            } else {
                A0e.AAJ(C66654MaN.A00(), str);
                A0e.Cgf();
            }
        }
        this.A05.A04(this.A02);
    }

    public DcR(FragmentActivity fragmentActivity, UserSession userSession, C332647Vv r6) {
        this.A06 = fragmentActivity;
        this.A03 = userSession;
        this.A04 = r6;
        this.A05 = AnonymousClass4k9.A00(userSession);
        this.A02 = DbS.A04(0Tu.A06, userSession, 36599705546919533L);
    }
}
