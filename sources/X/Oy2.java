package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

public final class Oy2 implements AnonymousClass0lh {
    public final C66744Mbp A00;
    public final Set A01;
    public final boolean A02;

    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public Oy2(UserSession userSession, C66744Mbp mbp) {
        Set stringSet;
        this.A00 = mbp;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36312672882394324L);
        this.A02 = A06;
        HashSet A1F = AnonymousClass7TE.A1F();
        this.A01 = A1F;
        if (A06) {
            synchronized (mbp) {
                stringSet = mbp.A00.getStringSet("thread_restrict_warned_on", (Set) null);
            }
            if (stringSet != null) {
                A1F.addAll(stringSet);
            }
        }
    }
}
