package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2wM  reason: invalid class name */
public abstract class AnonymousClass2wM extends C233742wN {
    public final boolean A00;

    public void A07(List list, List list2, int i) {
        if (this.A00) {
            C233462vl A0D = A0D(list.get(0));
            A0D.getClass();
            if (A0D.A0A && i < list.size() - 1 && !list.isEmpty()) {
                int size = list.size() - 1;
                while (size > i) {
                    C233462vl A0D2 = A0D(list.get(size));
                    A0D2.getClass();
                    size--;
                    C233462vl A0D3 = A0D(list.get(size));
                    A0D3.getClass();
                    A0D2.A0B(A0D3.A09());
                }
                return;
            }
        }
        while (i < list.size()) {
            C233462vl A0D4 = A0D(list.get(i));
            A0D4.getClass();
            A0D4.A0B(A0D4.A09() - 1);
            i++;
        }
    }

    public C233462vl A0D(Object obj) {
        AnonymousClass4EB r2 = (AnonymousClass4EB) obj;
        0qQ.A0B(r2, 0);
        return r2.A03;
    }

    public AnonymousClass2wM(UserSession userSession, C228812mN r2, C233402vf r3, AnonymousClass2vH r4, C249863kU r5, 1PJ r6, boolean z) {
        super(userSession, r2, r3, r4, r5, r6);
        this.A00 = z;
    }
}
