package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6xb  reason: invalid class name and case insensitive filesystem */
public final class C323506xb implements AnonymousClass0lh {
    public final UserSession A00;
    public final Map A01 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();

    public C323506xb(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A03(AnonymousClass3ZL r4) {
        0qQ.A0B(r4, 0);
        A00(r4);
        C243373Ym A0L = C225892f5.A00(this.A00).A0L(r4.BpO(), r4);
        0qQ.A07(A0L);
        if (A0L == C243373Ym.SAVED) {
            return true;
        }
        return false;
    }

    private final void A00(AnonymousClass3ZL r10) {
        Map map = this.A01;
        List list = (List) map.get(r10.BpP());
        if (list == null) {
            list = new ArrayList();
            map.put(r10.BpP(), list);
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass3ZL r6 = (AnonymousClass3ZL) ((Reference) it.next()).get();
            if (r6 == null) {
                it.remove();
            } else if (r10 == r6) {
                z = true;
            } else if (A01(r10) > A01(r6)) {
                boolean z2 = false;
                if (r6.CbC() != r10.CbC()) {
                    z2 = true;
                }
                r6.EjB(r10.BpO());
                this.A02.put(r6.BHy(), Long.valueOf(A01(r10)));
                if (z2) {
                    r6.AE7(this.A00);
                }
            } else if (A01(r10) < A01(r6)) {
                boolean z3 = false;
                if (r10.CbC() != r6.CbC()) {
                    z3 = true;
                }
                r10.EjB(r6.BpO());
                this.A02.put(r10.BHy(), Long.valueOf(A01(r6)));
                if (z3) {
                    r10.AE7(this.A00);
                }
            }
        }
        if (!z) {
            list.add(new WeakReference(r10));
        }
    }

    public final long A01(AnonymousClass3ZL r3) {
        Number number = (Number) this.A02.get(r3.BHy());
        if (number != null) {
            return number.longValue();
        }
        return r3.BI0();
    }

    public final void A02(AnonymousClass3ZL r5) {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Reference) it2.next()).get() == null) {
                    it2.remove();
                }
            }
            if (list.isEmpty()) {
                it.remove();
            }
        }
        A00(r5);
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
    }
}
