package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Qd  reason: invalid class name and case insensitive filesystem */
public abstract class C331247Qd {
    public static final void A00(UserSession userSession, AnonymousClass2Ep r11, 2Dm r12, Collection collection) {
        Collection collection2 = collection;
        0qQ.A0B(collection, 3);
        if (!collection.isEmpty()) {
            C58208IoC ioC = new C58208IoC(46, r11, userSession, r12, collection2);
            if (182.A06(0Tu.A05, userSession, 36328001620884321L)) {
                0nY.A00().ATE(new 0vX(657395099, new C45986DHp(ioC)));
            } else {
                AnonymousClass436.A00.A00(userSession).A01().post(new C45986DHp(ioC));
            }
        }
    }

    public static final void A02(UserSession userSession, String str, List list) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(list, 2);
        Set<C254703su> A0k = 00k.A0k(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C254703su r3 : A0k) {
            String A0g = r3.A0g();
            if (!r3.A1S()) {
                1at A00 = C327657Br.A00();
                2FW r0 = r3.A10;
                0qQ.A07(r0);
                if (!(!A00.A01(r0).AFJ(userSession, r3) || A0g == null || A0g.length() == 0)) {
                    String A0f = r3.A0f();
                    arrayList.add(A0g);
                    if (A0f == null) {
                        A0f = "";
                    }
                    arrayList2.add(A0f);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C3265077a.A01(userSession, new AnonymousClass77Y(), str, arrayList, arrayList2);
        }
    }

    public static final void A01(UserSession userSession, String str, Collection collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C254703su r2 = (C254703su) it.next();
            String A0g = r2.A0g();
            if (!(r2.A1S() || A0g == null || A0g.length() == 0)) {
                String A0f = r2.A0f();
                arrayList.add(A0g);
                if (A0f == null) {
                    A0f = "";
                }
                arrayList2.add(A0f);
            }
        }
        if (!arrayList.isEmpty()) {
            C3265077a.A01(userSession, new AnonymousClass77Y(), str, arrayList, arrayList2);
        }
    }
}
