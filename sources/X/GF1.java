package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class GF1 implements C59617JQl {
    public 0sP A00;
    public 0sL A01;
    public final UserSession A02;

    public final void DV5(GET get) {
        1Xj r1;
        0sP r0;
        0qQ.A0B(get, 0);
        if (C318996ps.A01() && C318996ps.A00().A04(this.A02) && (r1 = get.A00.A02) != null && (r0 = this.A00) != null) {
            r0.invoke(r1);
        }
    }

    public GF1(UserSession userSession) {
        this.A02 = userSession;
    }

    public final void DV7(View view, GET get) {
        if (C318996ps.A01()) {
            C318996ps.A00().A02().A00(this.A02, get.A01.getId(), G9t.A1A(get.A00));
        }
        if (view != null) {
            String username = get.A01.getUsername();
            0sL r0 = this.A01;
            if (r0 != null) {
                r0.invoke(view, username);
            }
        }
    }

    public final void EbS(0sP r1) {
        this.A00 = r1;
    }

    public final void El5(0sL r1) {
        this.A01 = r1;
    }
}
