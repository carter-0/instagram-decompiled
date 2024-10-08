package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Mf  reason: invalid class name and case insensitive filesystem */
public final class C330297Mf {
    public AnonymousClass7ZX A00;
    public final UserSession A01;
    public final Map A02 = new ConcurrentHashMap();
    public final AtomicInteger A03 = new AtomicInteger();
    public final C330317Mh A04 = new C330307Mg(this);
    public final Set A05;

    public C330297Mf(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        0qQ.A07(newSetFromMap);
        this.A05 = newSetFromMap;
    }

    public static final void A00(C330297Mf r5) {
        User user;
        AnonymousClass7ZX r4 = r5.A00;
        if (r4 != null) {
            Iterator it = AnonymousClass7ZX.A0C(r4, 20).iterator();
            while (it.hasNext()) {
                AnonymousClass7LQ r2 = (AnonymousClass7LQ) it.next();
                if (r2.A0K == null && (user = (User) r5.A02.get(r2.A0e.A1u)) != null) {
                    r2.A0K = user;
                    r4.A0V(r2);
                }
            }
        }
    }

    public final void A01(List list) {
        ArrayList<AnonymousClass7LQ> arrayList = new ArrayList<>();
        for (Object next : list) {
            AnonymousClass7LQ r2 = (AnonymousClass7LQ) next;
            if (r2.A0K == null && !this.A05.contains(r2.A0e.A1u)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (AnonymousClass7LQ r0 : arrayList) {
            arrayList2.add(r0.A0e.A1u);
        }
        Set A0k = 00k.A0k(arrayList2);
        if (!A0k.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Users missing from thread and cache: ");
            sb.append(A0k);
            0KC.A0C("DirectThreadUserFetcher", sb.toString());
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Object next2 : A0k) {
                0qQ.A0A(next2);
                UserSession userSession = this.A01;
                0Tu r22 = 0Tu.A05;
                if (182.A06(r22, userSession, 36323109652933474L) || 00l.A0R(182.A04(r22, userSession, 36886059606409908L), new String[]{","}, 0).contains(next2)) {
                    arrayList3.add(next2);
                }
            }
            if (!arrayList3.isEmpty()) {
                this.A05.addAll(arrayList3);
                AnonymousClass441 r4 = AnonymousClass441.A02;
                0qQ.A07(r4);
                for (String A022 : arrayList3) {
                    this.A03.incrementAndGet();
                    r4.A02(this.A01, this.A04, A022);
                }
            }
        }
    }
}
