package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ugu  reason: case insensitive filesystem */
public final class C15689Ugu extends C252233om {
    public int A00;
    public long A01;
    public long A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final boolean A08;
    public final List A09 = new ArrayList();

    public C15689Ugu(UserSession userSession, AnonymousClass4DU r3, boolean z) {
        0qQ.A0B(userSession, 3);
        this.A04 = r3;
        this.A08 = z;
        this.A03 = userSession;
    }

    public final void A02(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A05;
        if (map.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            Map map2 = this.A06;
            int A072 = C51973G9u.A07(str, map2);
            Object obj = map.get(str);
            if (obj != null) {
                map.remove(str);
                C66580MXl.A1T(str, map2, A072 + ((int) Math.max(0, currentTimeMillis - ((C17200VMe) obj).A00)));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A00(C15689Ugu ugu) {
        long currentTimeMillis = System.currentTimeMillis();
        ugu.A01 += currentTimeMillis - ugu.A02;
        ugu.A02 = currentTimeMillis;
        ArrayList arrayList = new ArrayList(ugu.A05.keySet());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ugu.A02(AnonymousClass7TE.A18(it));
        }
        ugu.A09.addAll(arrayList);
    }

    public final void A01() {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = currentTimeMillis;
        List list = this.A09;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            this.A05.put(A18, new C17200VMe(A18, currentTimeMillis));
        }
        list.clear();
    }

    public final void onPause() {
        A00(this);
    }

    public final void onResume() {
        A01();
    }
}
