package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public abstract class FFN {
    public static final int A00(UserSession userSession, List list) {
        ArrayList A1D;
        List BxT;
        List BxT2;
        0qQ.A0B(userSession, 0);
        1OP r0 = 1OP.$redex_init_class;
        ReelStore A03 = ReelStore.A03(userSession);
        0qQ.A07(A03);
        ArrayList A0O = A03.A0O();
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        LinkedHashSet A0y = DbS.A0y();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0O.iterator();
        while (it.hasNext()) {
            List<C255773uh> A0g = 00k.A0g(((Reel) it.next()).A0I(userSession), new C51562Fw8(4));
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (C255773uh r02 : A0g) {
                User user = r02.A0i;
                if (user != null) {
                    A1C2.add(user);
                }
            }
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            Iterator it2 = A1C2.iterator();
            while (it2.hasNext()) {
                A03(A0Q, A1C3, it2);
            }
            Object A0O2 = 00k.A0O(A1C3, 0);
            if (A0O2 != null) {
                A0y.add(A0O2);
            }
            A1C.addAll(A1C3);
        }
        if (A0y.size() < 4) {
            A0y.addAll(A1C);
        }
        int size = A0y.size();
        if (size < 4) {
            Iterator it3 = A0O.iterator();
            while (it3.hasNext()) {
                List<C255773uh> A0O3 = ((Reel) it3.next()).A0O(userSession);
                ArrayList A15 = DbV.A15(A0O3);
                for (C255773uh r03 : A0O3) {
                    User user2 = r03.A0i;
                    if (user2 != null) {
                        A15.add(user2);
                    }
                }
                ArrayList A1C4 = AnonymousClass7TE.A1C();
                Iterator it4 = A15.iterator();
                while (it4.hasNext()) {
                    A03(A0Q, A1C4, it4);
                }
                A0y.addAll(A1C4);
            }
        }
        if (A0y.size() < 4) {
            Iterator it5 = A0O.iterator();
            while (it5.hasNext()) {
                HallpassDetailsDict hallpassDetailsDict = ((Reel) it5.next()).A08;
                if (!(hallpassDetailsDict == null || (BxT2 = hallpassDetailsDict.BxT()) == null)) {
                    ArrayList A1C5 = AnonymousClass7TE.A1C();
                    Iterator it6 = BxT2.iterator();
                    while (it6.hasNext()) {
                        A03(A0Q, A1C5, it6);
                    }
                    A0y.addAll(A1C5);
                }
            }
        }
        if (A0y.size() < 4) {
            ReelStore A032 = ReelStore.A03(userSession);
            0qQ.A07(A032);
            synchronized (A032) {
                A1D = AnonymousClass7TE.A1D(A032.A04);
            }
            Iterator it7 = A1D.iterator();
            while (it7.hasNext()) {
                HallpassDetailsDict hallpassDetailsDict2 = ((Reel) it7.next()).A08;
                if (!(hallpassDetailsDict2 == null || (BxT = hallpassDetailsDict2.BxT()) == null)) {
                    ArrayList A1C6 = AnonymousClass7TE.A1C();
                    Iterator it8 = BxT.iterator();
                    while (it8.hasNext()) {
                        A03(A0Q, A1C6, it8);
                    }
                    A0y.addAll(A1C6);
                }
            }
        }
        list.clear();
        list.addAll(A0y);
        return size;
    }

    public static final List A02(UserSession userSession) {
        ArrayList A0O = 1OP.A05(userSession).A0O();
        User A0j = DbT.A0j(userSession);
        LinkedHashSet A0y = DbS.A0y();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0O.iterator();
        while (it.hasNext()) {
            List<C255773uh> A0g = 00k.A0g(((Reel) it.next()).A0I(userSession), new C51562Fw8(3));
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (C255773uh r0 : A0g) {
                User user = r0.A0i;
                if (user != null) {
                    A1C2.add(user);
                }
            }
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            Iterator it2 = A1C2.iterator();
            while (it2.hasNext()) {
                A03(A0j, A1C3, it2);
            }
            Object A0O2 = 00k.A0O(A1C3, 0);
            if (A0O2 != null) {
                A0y.add(A0O2);
            }
            A1C.addAll(A1C3);
        }
        if (A0y.size() < 3) {
            A0y.addAll(A1C);
        }
        if (A0y.isEmpty()) {
            return 0sn.A00;
        }
        List A0a = 00k.A0a(A0y);
        int size = A0y.size();
        if (size > 3) {
            size = 3;
        }
        return A0a.subList(0, size);
    }

    public static final C244303ay A01(Context context, ImageUrl imageUrl, String str) {
        0qQ.A0B(str, 2);
        return new C244303ay(imageUrl, str, 64, 2, AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_cyan), 0, 0, 2, context.getColor(2Yu.A0C(context)), false);
    }

    public static void A03(User user, AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (!0qQ.A0K(((User) next).getId(), user.getId())) {
            abstractCollection.add(next);
        }
    }
}
