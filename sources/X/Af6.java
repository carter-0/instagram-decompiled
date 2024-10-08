package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class Af6 implements C336287eN {
    public final C363288jT A00;
    public final /* synthetic */ UserSession A01;

    public final Object E5m(String str) {
        Collection<User> collection;
        0qQ.A0B(str, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C363288jT r3 = this.A00;
        UserSession userSession = this.A01;
        synchronized (r3) {
            r3.A05();
            Map map = null;
            C293645l7 r0 = (C293645l7) r3.A01.A05.get("coefficient_besties_list_ranking");
            if (r0 == null) {
                0wb.A03("UsersBootstrapService", 002.A0R("Requested missing surface ", "coefficient_besties_list_ranking"));
            } else {
                map = r0.A03;
                if (map == null) {
                    map = Collections.emptyMap();
                }
            }
            if (!TextUtils.isEmpty(str)) {
                C363318jW r7 = r3.A04;
                if (str.length() > 0 && (collection = r7.A01[Character.toLowerCase(str.charAt(0)) % 30]) != null) {
                    for (User user : collection) {
                        if (C336437ec.A00(user, str) && !user.CPV()) {
                            if ((map == null || map.containsKey(user.getId())) && (!0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), user))) {
                                linkedHashSet.add(user);
                            }
                        }
                    }
                }
            } else {
                Iterator A0v = AnonymousClass7TF.A0v(r3.A02.A05);
                while (A0v.hasNext()) {
                    User user2 = (User) A0v.next();
                    if (!user2.CPV() && ((map == null || map.containsKey(user2.getId())) && (!0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), user2)))) {
                        linkedHashSet.add(user2);
                    }
                }
            }
        }
        ArrayList A0U = 00k.A0U(linkedHashSet);
        r3.A09("coefficient_besties_list_ranking", A0U);
        return new A5W(A0U, linkedHashSet);
    }

    public Af6(UserSession userSession) {
        this.A01 = userSession;
        C363288jT A002 = C363288jT.A00(userSession);
        0qQ.A07(A002);
        this.A00 = A002;
    }

    public final /* bridge */ /* synthetic */ Object AIL(Object obj, Object obj2) {
        0sn A1C;
        List list = (List) obj2;
        UserSession userSession = this.A01;
        if (list == null) {
            A1C = 0sn.A00;
        } else {
            A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (!0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), next)) {
                    A1C.add(next);
                }
            }
        }
        if (obj == null || !(obj instanceof A5W)) {
            return A1C;
        }
        01N A1H = 0jo.A1H();
        A5W a5w = (A5W) obj;
        A1H.addAll(a5w.A00);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : A1C) {
            if (!a5w.A01.contains(next2)) {
                A1C2.add(next2);
            }
        }
        A1H.addAll(A1C2);
        return 0jo.A1I(A1H);
    }

    public final /* bridge */ /* synthetic */ Object ARG() {
        return AnonymousClass7TE.A1D(0sn.A00);
    }
}
