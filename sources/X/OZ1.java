package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class OZ1 {
    public static final OZ1 A00 = new Object();

    public final void A01(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r22, UserSession userSession, Capabilities capabilities, N4P n4p, C68303N9q n9q) {
        UserSession userSession2 = userSession;
        C68303N9q n9q2 = n9q;
        AnonymousClass7TF.A1D(userSession2, 0, n9q2);
        N4P n4p2 = n4p;
        C254743sy A08 = n4p2.A08();
        boolean A05 = N4P.A05(n4p2);
        boolean A0C = n4p2.A0C();
        C254793t3 r1 = n4p2.A0L;
        0qQ.A0B(r1, 0);
        boolean z = n4p2.A0n;
        boolean A04 = N4P.A04(userSession2, n4p2);
        boolean A03 = C71117OdB.A03(userSession2, n4p2);
        int i = n4p2.A09;
        String A06 = C300965yF.A06(r1);
        String str = n4p2.A0Q;
        int i2 = n4p2.A06;
        User user = n9q2.A00;
        A00(fragment, fragmentActivity, r22, userSession2, capabilities, A08, user, A06, str, i, i2, A05, A0C, r1 instanceof MsysThreadId, z, A04, A03, true);
    }

    public static final void A00(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r31, UserSession userSession, Capabilities capabilities, C254743sy r34, User user, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C69445Nlp nlp;
        AnonymousClass0iw r19 = r31;
        String moduleName = r19.getModuleName();
        User user2 = user;
        int BIW = user2.BIW();
        FollowStatus B6o = user2.B6o();
        C254743sy r21 = r34;
        String A03 = C330397Mp.A03(r21);
        Boolean valueOf = Boolean.valueOf(z2);
        boolean z8 = z;
        Boolean valueOf2 = Boolean.valueOf(z8);
        boolean z9 = z3;
        C3263576k A002 = C3263476j.A00(z9, z8);
        boolean z10 = z4;
        if (!z4 || !z) {
            nlp = C69445Nlp.DEFAULT;
        } else {
            nlp = C69445Nlp.GXAC;
        }
        C49936FFp fFp = new C49936FFp(A002, nlp, valueOf, valueOf2, moduleName, "direct_thread", B6o.name(), A03, "DEFAULT", "DEFAULT", AnonymousClass7TF.A0b(), BIW);
        C49475EwG ewG = new C49475EwG(z5, i);
        UserSession userSession2 = userSession;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (z7 && !z2 && !user2.CXO()) {
            if (capabilities.A00(C376179Gx.REPORT_USER) && 182.A06(0Tu.A05, userSession2, 2342153302684205063L)) {
                UserSession userSession3 = userSession2;
                C48887Eln.A00(fragmentActivity2, fragment, fragmentActivity, userSession2, ewG, (C331157Pu) null, (C331127Pr) null, user, fFp, new PRZ(fragmentActivity2, r19, userSession3, r21, user2, str, str2, i2, z6, z10, z9), (G8B) null);
                return;
            }
        }
        C48887Eln.A00(fragmentActivity2, fragment, fragmentActivity, userSession2, ewG, (C331157Pu) null, (C331127Pr) null, user, fFp, (C51922G7q) null, (G8B) null);
    }
}
