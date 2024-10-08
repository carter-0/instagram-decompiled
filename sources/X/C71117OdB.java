package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdB  reason: case insensitive filesystem */
public final class C71117OdB {
    public static final C71117OdB A00 = new Object();

    public static final void A01(FragmentActivity fragmentActivity, AnonymousClass0iw r15, UserSession userSession, C231002qi r17, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str5 = str3;
        0qQ.A0B(str5, 7);
        String str6 = str4;
        if (str4 != null) {
            UserSession userSession2 = userSession;
            FragmentActivity fragmentActivity2 = fragmentActivity;
            UserSession userSession3 = userSession2;
            String str7 = str6;
            String str8 = str5;
            AnonymousClass0iw r1 = r15;
            String str9 = str;
            int i2 = i;
            boolean z6 = z2;
            boolean z7 = z3;
            C71128OdR.A05(fragmentActivity, r1, userSession2, new C69237Nhr(fragmentActivity2, userSession3, r17, str7, str8, str2, z, z5), str6, str9, i2, z6, z7, z4);
            return;
        }
        throw AnonymousClass7TE.A0w("user id cannot be null");
    }

    public static final void A02(FragmentActivity fragmentActivity, AnonymousClass0iw r12, UserSession userSession, String str, String str2, boolean z) {
        AnonymousClass0iw r2 = r12;
        UserSession userSession2 = userSession;
        C71128OdR.A04(fragmentActivity, r2, userSession2, C14068TpH.DIRECT_MESSAGES, C16677UzD.USER, new C16390Uu8(fragmentActivity, 2), str, str, str2, z, false);
    }

    public static final boolean A03(UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 0);
        int i = n4p.A09;
        String A02 = N4P.A02(n4p);
        if (i != 29 || C66580MXl.A1X(userSession, A02)) {
            return false;
        }
        return true;
    }

    public final void A04(FragmentActivity fragmentActivity, AnonymousClass0iw r19, UserSession userSession, N4P n4p, C68303N9q n9q, C231002qi r23, boolean z) {
        UserSession userSession2 = userSession;
        C68303N9q n9q2 = n9q;
        AnonymousClass7TF.A1C(userSession2, 0, n9q2);
        N4P n4p2 = n4p;
        int i = n4p2.A09;
        boolean z2 = n4p2.A0n;
        boolean z3 = n4p2.A08() instanceof MsysThreadId;
        C254793t3 r0 = n4p2.A0L;
        String A06 = C300965yF.A06(r0);
        String str = n4p2.A0Q;
        String A07 = C300965yF.A07(r0);
        int i2 = n4p2.A06;
        List A15 = JTO.A15(n4p2.A0c);
        ArrayList A0r = AnonymousClass7TG.A0r(A15);
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            C68303N9q.A00(A0r, it);
        }
        A00(fragmentActivity, r19, userSession2, r23, n9q2.A00, A06, str, A07, N4P.A02(n4p2), A0r, i, i2, z2, z3, z);
    }

    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r18, UserSession userSession, C231002qi r20, User user, String str, String str2, String str3, String str4, List list, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str5;
        boolean z4;
        String id;
        boolean z5;
        boolean z6 = z;
        boolean z7 = z3;
        AnonymousClass0iw r5 = r18;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        boolean z8 = z2;
        UserSession userSession2 = userSession;
        C231002qi r7 = r20;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        int i3 = i;
        int i4 = i2;
        if (i3 == 29) {
            id = str4;
            if (!C66580MXl.A1X(userSession2, id)) {
                z4 = true;
                z5 = false;
                A01(fragmentActivity2, r5, userSession2, r7, str6, str7, str8, id, i4, z4, z6, z8, z7, z5);
                return;
            }
        }
        boolean A1S = AnonymousClass7TF.A1S(i3, 1014);
        User user2 = (User) 00k.A0J(list);
        if (user2 != null) {
            str5 = user2.A03.AaR();
        } else {
            str5 = null;
        }
        boolean A1W = C51966G9m.A1W(userSession2, str5);
        User user3 = user;
        if (!A1S || A1W) {
            0qQ.A0B(user3, 1);
            if (user3.BIW() == 1 || 182.A06(0Tu.A05, userSession2, 36311328557629946L)) {
                z4 = false;
                id = user3.getId();
                z5 = false;
                A01(fragmentActivity2, r5, userSession2, r7, str6, str7, str8, id, i4, z4, z6, z8, z7, z5);
                return;
            }
            A02(fragmentActivity2, r5, userSession2, user3.getId(), str6, z6);
            return;
        }
        String id2 = user3.getId();
        C71128OdR.A04(fragmentActivity2, r5, userSession2, C14068TpH.DIRECT_THREAD, C16677UzD.GEN_AI_UGC, new C16390Uu8(fragmentActivity2, 1), id2, id2, str6, z6, false);
    }
}
