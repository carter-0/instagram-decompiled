package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Vzj  reason: case insensitive filesystem */
public final class C18748Vzj {
    public final UserSession A00;
    public final Set A01 = new HashSet();

    public C18748Vzj(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final synchronized void A00(C18748Vzj vzj, int i, boolean z) {
        String A002;
        synchronized (vzj) {
            Set set = vzj.A01;
            Integer valueOf = Integer.valueOf(i);
            if (set.contains(valueOf)) {
                02m r2 = 02m.A0p;
                if (z) {
                    A002 = AnonymousClass000.A00(3165);
                } else {
                    A002 = AnonymousClass000.A00(1377);
                }
                r2.markerAnnotate(i, "load_source", A002);
                02m.A0p.markerEnd(i, 2);
                set.remove(valueOf);
            }
        }
    }

    public static final synchronized void A01(C18748Vzj vzj, String str, String str2, int i) {
        synchronized (vzj) {
            Set set = vzj.A01;
            set.add(C13990Tnq.A0Z(set, i));
            02m.A0p.markerAnnotate(i, "prior_module", str);
            02m.A0p.markerAnnotate(i, "container_module", str2);
            02m.A0p.markerStart(i);
        }
    }

    public final synchronized void A02() {
        Set set = this.A01;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int A0F = AnonymousClass7TG.A0F(it);
            02m.A0p.markerPoint(A0F, "NETWORK_FAILED");
            02m.A0p.markerEnd(A0F, 3);
        }
        set.clear();
    }
}
