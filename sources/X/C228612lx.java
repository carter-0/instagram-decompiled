package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2lx  reason: invalid class name and case insensitive filesystem */
public final class C228612lx {
    public List A00;
    public final C61480nO A01;
    public final Object A02 = new Object();
    public final Map A03 = new LinkedHashMap();
    public final Map A04 = new LinkedHashMap();

    public static final ArrayList A00(1UV r6, C228612lx r7, AnonymousClass46L r8, List list, Set set, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        0qQ.A0B(r8, 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C263374Lk(r8));
        arrayList2.add(new C263384Ll(set));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(r7.A00);
        arrayList3.addAll(arrayList2);
        if (r6 != null) {
            arrayList3.add(r6);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xg r2 = (1Xg) it.next();
            List A0a = 00k.A0a(arrayList3);
            0qQ.A0B(r2, 0);
            Iterator it2 = A0a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((1UV) it2.next()).apply(r2)) {
                        break;
                    }
                } else if (!z || !AnonymousClass3VP.A02(r2)) {
                    arrayList.add(r2);
                    if (arrayList.size() == i) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean A02() {
        boolean z;
        synchronized (this.A02) {
            z = !this.A04.isEmpty();
        }
        return z;
    }

    public C228612lx(List list) {
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "FeedPool-worker";
        this.A01 = new AnonymousClass0vF(A002);
        this.A00 = list;
    }

    public final void A01(UserSession userSession, List list) {
        System.currentTimeMillis();
        synchronized (this.A02) {
            Map map = this.A04;
            map.clear();
            Map map2 = this.A03;
            map2.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1Xg r3 = (1Xg) it.next();
                1Xj A022 = 1Xi.A02(r3.A05);
                if (A022 != null) {
                    1UQ r1 = r3.A06;
                    if ((r1 == 1UQ.A0Y || (1Uh.A03(userSession) && (r1 == 1UQ.A0a || AnonymousClass3VP.A02(r3)))) && !A022.CcK()) {
                        map.put(r3.A09, r3);
                    }
                    if (r1 == 1UQ.A0H && !A022.CcK()) {
                        map2.put(r3.A09, r3);
                    }
                }
            }
            map.size();
            map2.size();
            System.currentTimeMillis();
        }
    }
}
