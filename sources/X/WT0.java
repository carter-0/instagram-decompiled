package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class WT0 implements AnonymousClass0lh {
    public boolean A00;
    public final List A01 = new ArrayList();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final Set A04 = Collections.newSetFromMap(new WeakHashMap());

    public static WT0 A00(UserSession userSession) {
        return (WT0) userSession.A01(WT0.class, new C20404Wqo(1));
    }

    public final void A01(String str, Integer num) {
        for (X7f DFd : this.A04) {
            DFd.DFd(str, num);
        }
        this.A02.remove(str);
        this.A00 = false;
    }

    public final void A02(String str, Integer num) {
        for (X7f DYr : this.A04) {
            DYr.DYr(str, num);
        }
    }

    public final void onSessionWillEnd() {
        this.A03.clear();
    }
}
