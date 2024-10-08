package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P2j  reason: case insensitive filesystem */
public final class C72344P2j implements C74394PuA {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final N4P A04;
    public final Capabilities A05;

    public C72344P2j(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, Capabilities capabilities, N4P n4p) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = n4p;
        this.A05 = capabilities;
        this.A02 = r4;
    }

    public final List getItems() {
        String str;
        String str2;
        N4P n4p = this.A04;
        boolean z = n4p.A0j;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C46448DfA.A02(A1C, 2131963171);
        Context context = this.A00;
        String A16 = AnonymousClass7TE.A16(context, 2131963172);
        UserSession userSession = this.A03;
        if (!OXA.A02(userSession, n4p)) {
            int i = 2131963182;
            if (z) {
                i = 2131963183;
            }
            str = context.getString(i);
        } else {
            str = null;
        }
        if (!OXA.A02(userSession, n4p)) {
            str2 = null;
        } else if (z) {
            str2 = n4p.A0O;
        } else {
            str2 = context.getString(2131963182);
        }
        A1C.add(new OIM(new C71395Oju(this, 26), (View.OnClickListener) null, (View.OnClickListener) null, (C358618bC) null, C69349Njo.TYPE_UNKNOWN, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A16, str, str2, true, true));
        return A1C;
    }

    public final boolean isEnabled() {
        C70733OIq oIq = P2L.A00;
        UserSession userSession = this.A03;
        N4P n4p = this.A04;
        if (!oIq.A00(userSession, this.A05, n4p) || !OXA.A01(userSession, n4p)) {
            return false;
        }
        return true;
    }
}
