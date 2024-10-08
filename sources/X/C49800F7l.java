package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import com.instagram.shopping.model.share.ShopShareInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F7l  reason: case insensitive filesystem */
public abstract class C49800F7l {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r19, AnonymousClass6Tm r20, UserSession userSession) {
        Object obj;
        String str;
        int i;
        String A0K;
        Object obj2;
        Object obj3;
        Object obj4;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass0iw r9 = r19;
        AnonymousClass7TF.A1B(fragmentActivity2, 1, r9);
        List list = r20.A00;
        String A0t = DbU.A0t(list, 0);
        String A0t2 = DbU.A0t(list, 1);
        String A0d = Dba.A0d(list);
        String A0t3 = DbU.A0t(list, 4);
        String A0t4 = DbU.A0t(list, 5);
        if (12 < list.size()) {
            obj = list.get(12);
        } else {
            obj = null;
        }
        C276544tV r10 = (C276544tV) obj;
        if (r10 != null) {
            C276544tV A07 = r10.A07(35);
            if (A07 == null || (str = A07.A0H()) == null) {
                if (9 < list.size()) {
                    obj4 = list.get(9);
                } else {
                    obj4 = null;
                }
                str = (String) obj4;
                if (str == null) {
                    str = "";
                }
            }
            int i2 = -1;
            if (A07 != null) {
                i = A07.A03(40, -1);
                i2 = A07.A03(35, -1);
            } else {
                i = -1;
            }
            String A0F = r10.A0F();
            if (A0F == null) {
                if (10 < list.size()) {
                    obj3 = list.get(10);
                } else {
                    obj3 = null;
                }
                A0F = (String) obj3;
            }
            String A0I = r10.A0I();
            if (A0I == null) {
                if (11 < list.size()) {
                    obj2 = list.get(11);
                } else {
                    obj2 = null;
                }
                A0I = (String) obj2;
            }
            List<C276544tV> A0N = r10.A0N(38);
            ArrayList A15 = DbV.A15(A0N);
            for (C276544tV r0 : A0N) {
                if (!(r0 == null || (A0K = r0.A0K(38)) == null)) {
                    A15.add(A0K);
                }
            }
            String A11 = DbV.A11(r10, "", 44);
            AnonymousClass37D A0i = DbT.A0i(fragmentActivity2);
            if (A0i != null) {
                C49731F3w A072 = 1as.A04.A02.A07(r9, userSession2, 2FW.A1Z);
                SimpleImageUrl A00 = C253833rU.A00(DbT.A09(str), i, i2);
                SimpleImageUrl A002 = C253833rU.A00(DbT.A09(A11), -1, -1);
                ArrayList A0r = AnonymousClass7TG.A0r(A15);
                Iterator it = A15.iterator();
                while (it.hasNext()) {
                    A0r.add(C253833rU.A00(DbT.A09(AnonymousClass7TE.A18(it)), -1, -1));
                }
                A072.A07.putParcelable(C66579MXk.A00(93), new ProductCollectionShareInfo(A00, A002, A0t4, A0t, A0d, A0t3, A0t2, A0F, A0I, A0r));
                A0i.A0J(A072.A00());
            }
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, AnonymousClass0iw r15, AnonymousClass6Tm r16, UserSession userSession) {
        Object obj;
        String A0H;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass7TF.A1B(fragmentActivity, 1, r15);
        AnonymousClass6Tm r3 = r16;
        Object A03 = r3.A03(0);
        String A0p = DbS.A0p(A03);
        String str = (String) A03;
        String str2 = (String) DbT.A0q(r3, A0p, 1);
        String str3 = (String) DbT.A0q(r3, A0p, 3);
        List list = r3.A00;
        Object obj2 = null;
        if (7 < list.size()) {
            obj = list.get(7);
        } else {
            obj = null;
        }
        String str4 = (String) obj;
        if (8 < list.size()) {
            obj2 = list.get(8);
        }
        C276544tV r1 = (C276544tV) obj2;
        if (r1 != null) {
            boolean A0R = r1.A0R(40, false);
            String str5 = "";
            String str6 = str5;
            String A0H2 = r1.A0H();
            if (A0H2 != null) {
                str6 = A0H2;
            }
            String A0I = r1.A0I();
            if (A0I != null) {
                str5 = A0I;
            }
            List A0N = r1.A0N(35);
            0qQ.A07(A0N);
            List<C276544tV> A0N2 = r1.A0N(36);
            ArrayList A15 = DbV.A15(A0N2);
            for (C276544tV r0 : A0N2) {
                if (!(r0 == null || (A0H = r0.A0H()) == null)) {
                    A15.add(A0H);
                }
            }
            AnonymousClass37D A0i = DbT.A0i(fragmentActivity);
            if (A0i != null) {
                C49731F3w A07 = 1as.A04.A02.A07(r15, userSession2, 2FW.A1a);
                SimpleImageUrl A00 = C253833rU.A00(DbT.A09(str5), -1, -1);
                ArrayList A0r = AnonymousClass7TG.A0r(A15);
                Iterator it = A15.iterator();
                while (it.hasNext()) {
                    A0r.add(C253833rU.A00(DbT.A09(AnonymousClass7TE.A18(it)), -1, -1));
                }
                A07.A07.putParcelable(C66579MXk.A00(228), new ShopShareInfo(A00, str2, str, str6, str3, str4, A0N, A0r, A0R));
                A0i.A0J(A07.A00());
            }
        }
    }
}
