package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.32c  reason: invalid class name and case insensitive filesystem */
public final class C2360232c {
    public final Fragment A00;
    public final 0hq A01;
    public final UserSession A02;

    public final void A00(C2357230y r4, JOC joc, String str, Map map) {
        0qQ.A0B(r4, 2);
        if (!r4.A00) {
            r4.A00 = true;
            C360678ey A05 = C359988do.A05(this.A02, str, map);
            A05.A00(new E82(r4, joc, this));
            this.A00.schedule(A05);
        }
    }

    public C2360232c(Fragment fragment, 0hq r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = r2;
    }
}
