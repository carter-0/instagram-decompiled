package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class F42 {
    public static final void A01(0lg r4, String str, String str2, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(r4), "ig_one_login_deferred_login_finished");
        A0e.AAJ("containermodule", "account_switch_fragment");
        A0e.A9F("account_id", AnonymousClass7TE.A10(str));
        A0e.A7p("succeeded", Boolean.valueOf(z));
        A0e.AAJ("reason", str2);
        A0e.Cgf();
    }

    public static final HashSet A00(List list) {
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1F.add(DbV.A0q(AnonymousClass7TE.A18(it)));
        }
        return A1F;
    }
}
