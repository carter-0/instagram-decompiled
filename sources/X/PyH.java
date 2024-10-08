package X;

import java.util.Iterator;
import java.util.Map;

public final class PyH implements AnonymousClass0lh {
    public final Map A00 = AnonymousClass7TE.A1E();

    public final synchronized void onSessionWillEnd() {
        Map map = this.A00;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            ((PyJ) A1J.getValue()).A00();
            ((PyJ) A1J.getValue()).A01(false);
        }
        map.clear();
    }
}
