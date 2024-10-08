package X;

import android.content.Context;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class P2X implements C74394PuA {
    public final 0wc A00;
    public final UserSession A01;
    public final N4P A02;
    public final Context A03;

    public P2X(Context context, 0wc r3, UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A01 = userSession;
        this.A02 = n4p;
        this.A00 = r3;
    }

    public final List getItems() {
        String A0p;
        N4P n4p = this.A02;
        int i = n4p.A04;
        UserSession userSession = this.A01;
        boolean z = true;
        boolean z2 = false;
        if (i == 0) {
            Boolean bool = (Boolean) DcK.A00(userSession).A02.getValue();
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            z = !z2;
        } else if (i != 2) {
            z = false;
        }
        boolean z3 = n4p.A0r;
        Context context = this.A03;
        if (z3) {
            A0p = 002.A0g(AnonymousClass7TE.A16(context, 2131959019), "\n\n", AnonymousClass7TE.A16(context, 2131959020));
        } else {
            A0p = C51967G9n.A0p(context, 2131959019);
        }
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) C71468OlC.A00, (C358618bC) new C72739PHt(this, 13), 2131959018, z);
        pr9.A0A = A0p;
        return AnonymousClass7TE.A1I(pr9);
    }

    public final boolean isEnabled() {
        return C69954Nuu.A00(this.A01, this.A02);
    }
}
