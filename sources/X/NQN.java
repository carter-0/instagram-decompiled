package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class NQN extends 2Cn {
    public final /* synthetic */ String A00;

    public NQN(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C290645fe r4 = (C290645fe) obj;
        0qQ.A0B(r4, 0);
        List list = r4.A01("direct_ibc_inbox_invitations").A02;
        String str = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (0qQ.A0K(DbT.A0f(it).A08(), str)) {
                    r4.A07(str);
                    return;
                }
            }
        }
    }
}
