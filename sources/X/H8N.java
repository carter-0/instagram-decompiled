package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class H8N extends 0ng {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ IPN A02;
    public final /* synthetic */ HBK A03;
    public final /* synthetic */ String A04;

    public final String toString() {
        return "Feed link click survey signal query";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8N(1Xj r4, IPN ipn, HBK hbk, String str, long j) {
        super(1181988343, 3, false, false);
        this.A02 = ipn;
        this.A04 = str;
        this.A01 = r4;
        this.A00 = j;
        this.A03 = hbk;
    }

    public final void run() {
        String str;
        String username;
        int i;
        String str2;
        C253533qw r9;
        IPN ipn = this.A02;
        String str3 = this.A04;
        HBK hbk = ipn.A02;
        if (!AnonymousClass7TE.A1b(IPN.A00(ipn, str3, hbk.A0A, (Set) null, 1, false))) {
            Set set = hbk.A09;
            boolean A1b = AnonymousClass7TE.A1b(IPN.A00(ipn, str3, set, (Set) null, 1, false));
            UserSession userSession = hbk.A06;
            0Tu r5 = 0Tu.A05;
            if (A1b) {
                if (182.A06(r5, userSession, 2342172698756923648L)) {
                    str = "1053606132793669";
                } else {
                    return;
                }
            } else if (182.A06(r5, userSession, 2342172698756858111L)) {
                str = "3842242159428254";
            } else {
                return;
            }
            1Xj r52 = this.A01;
            long j = this.A00;
            String A07 = C231122qu.A07(userSession, r52);
            if (A07 == null) {
                A07 = "";
            }
            0qQ.A0B(userSession, 0);
            User A2A = r52.A2A(userSession);
            if (A2A != null) {
                if (A2A.A2Q()) {
                    username = C231122qu.A0G(userSession, r52);
                } else if (!C231122qu.A0V(userSession, r52) || (username = C231122qu.A08(userSession, r52)) == null) {
                    username = A2A.getUsername();
                }
                IPN ipn2 = ipn;
                String str4 = str3;
                AnonymousClass9IV r2 = (AnonymousClass9IV) 00k.A0J(IPN.A00(ipn2, str4, (Set) null, (Set) null, 1, true));
                C253513qu r92 = null;
                if (r2 != null) {
                    r92 = (C253513qu) r2.A00;
                }
                if (!(r92 instanceof C253533qw) || (r9 = (C253533qw) r92) == null) {
                    i = -1;
                } else {
                    i = r9.A02;
                }
                List<AnonymousClass9IV> A002 = IPN.A00(ipn2, str4, (Set) null, set, Integer.MAX_VALUE, false);
                LinkedHashSet A0y = DbS.A0y();
                for (AnonymousClass9IV r93 : A002) {
                    A0y.add(((AnonymousClass9J4) r93.A01).A04);
                }
                String A0z = DbT.A0z(",", A0y, C59019J3e.A00);
                if (str.equals("1053606132793669")) {
                    str2 = "interaction";
                } else {
                    str2 = "dwell_time";
                }
                AnonymousClass7TF.A0D().post(new C57912IiT(hbk, str, 0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.A06), AnonymousClass7TE.A1L("ad_id", A07), AnonymousClass7TE.A1L("dwell_time", String.valueOf(j)), AnonymousClass7TE.A1L("brand_name", username), AnonymousClass7TE.A1L("interactions", A0z), AnonymousClass7TE.A1L("position", String.valueOf(i)), AnonymousClass7TE.A1L("trigger_type", str2), AnonymousClass7TE.A1L("feed_session_id", hbk.A07.A00)})));
                this.A03.A00++;
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
