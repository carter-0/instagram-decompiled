package X;

import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class WZT implements AnonymousClass57U {
    public final /* synthetic */ C14030ToW A00;

    public WZT(C14030ToW toW) {
        this.A00 = toW;
    }

    public final int BXA() {
        C14030ToW toW = this.A00;
        User user = toW.A01;
        int i = 0;
        if (user != null) {
            String id = user.getId();
            List AZL = toW.A05.AZL();
            0qQ.A07(AZL);
            Iterator it = AZL.iterator();
            while (it.hasNext()) {
                if (C51966G9m.A0t(it).A6h(id)) {
                    i++;
                }
            }
        }
        return i;
    }
}
