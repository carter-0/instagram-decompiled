package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class P2T implements C74394PuA {
    public final O7A A00;
    public final Context A01;
    public final UserSession A02;
    public final N4P A03;

    public P2T(Context context, UserSession userSession, O7A o7a, N4P n4p) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = n4p;
        this.A00 = o7a;
    }

    public final List getItems() {
        Context context = this.A01;
        String A16 = AnonymousClass7TE.A16(context, 2131959328);
        return 0sr.A1P(new Object[]{new C46448DfA((CharSequence) context.getString(2131959326)), new OIM(new C71395Oju(this, 16), (View.OnClickListener) null, (View.OnClickListener) null, (C358618bC) null, C69349Njo.TYPE_CHEVRON, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A16, (String) null, (String) null, true, true), new FGF((CharSequence) context.getString(2131959327))});
    }

    public final boolean isEnabled() {
        C242243Te r0;
        List list;
        UserSession userSession = this.A02;
        N4P n4p = this.A03;
        boolean z = true;
        String str = userSession.A06;
        if (!n4p.A0S.contains(str) && ((r0 = n4p.A0E) == null || (list = r0.A0E) == null || !list.contains(str))) {
            z = false;
        }
        if (n4p.A09 != 29 || !z) {
            return false;
        }
        return true;
    }
}
