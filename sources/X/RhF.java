package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public abstract class RhF {
    public static final Object A00(C307896Rx r6) {
        FragmentActivity A04 = C308206Td.A04(r6);
        0lg A0R = DbW.A0R(r6);
        C309516Yo A0M = DbS.A0M(A04, A0R);
        0qQ.A0B(A0R, 0);
        R8N r8n = new R8N();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("Tracking.ENABLED", true);
        AnonymousClass0Dg.A00(A0a, A0R);
        r8n.setArguments(A0a);
        A0M.A0B((Bundle) null, r8n);
        A0M.A04();
        return null;
    }
}
