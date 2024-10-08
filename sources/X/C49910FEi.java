package X;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FEi  reason: case insensitive filesystem */
public final class C49910FEi {
    public static final C49910FEi A00 = new Object();

    public final void A01(Activity activity, RecyclerView recyclerView, UserSession userSession, AnonymousClass70R r19, Integer num, List list, boolean z, boolean z2) {
        C61082JwK jwK;
        UserSession userSession2 = userSession;
        RecyclerView recyclerView2 = recyclerView;
        AnonymousClass7TF.A1B(userSession2, 0, recyclerView2);
        AnonymousClass3AQ r0 = new AnonymousClass3AQ();
        r0.A00 = false;
        recyclerView2.setItemAnimator(r0);
        Activity activity2 = activity;
        DbV.A1A(activity2, recyclerView2);
        recyclerView2.A11(new AnonymousClass3V7(0, DbS.A02(activity2, 8)));
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(activity2);
        AnonymousClass70R r13 = r19;
        A002.A01(new EGJ(activity2, (C355568Qm) null, userSession2, (2el) null, r13, num));
        AnonymousClass2t9 A0U = DbU.A0U(A002, new EGD(activity2, userSession2, r13));
        ViewModelListUpdate A0R = DbS.A0R();
        ArrayList arrayList = null;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C51954G8x g8x = (C51954G8x) it.next();
                if (g8x != null) {
                    jwK = new C61082JwK(g8x, false);
                } else {
                    jwK = null;
                }
                arrayList.add(jwK);
            }
        }
        A0R.A01(A00(arrayList, z, z2));
        A0U.A05(A0R);
        recyclerView2.setAdapter(A0U);
    }

    public static final List A00(List list, boolean z, boolean z2) {
        Boolean bool;
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i = 0;
        if ((z || z2) && (list == null || list.isEmpty())) {
            A1C.clear();
            A1C.add(new C47252Dtd(true));
        } else {
            A1C.clear();
            if (z2) {
                A1C.add(new C47252Dtd(false));
            }
            if (list != null) {
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                int i2 = 0;
                for (Object next : list) {
                    i++;
                    if (i2 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C61082JwK jwK = (C61082JwK) next;
                    if (jwK != null) {
                        bool = Boolean.valueOf(A1C.add(new C47235DtM(jwK, AnonymousClass7TF.A1Q(i2))));
                    } else {
                        bool = null;
                    }
                    A0r.add(bool);
                    i2 = i;
                }
            }
        }
        return 00k.A0a(A1C);
    }
}
