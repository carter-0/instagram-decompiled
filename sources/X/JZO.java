package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class JZO implements C336287eN {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final Object E5m(String str) {
        0qQ.A0B(str, 0);
        boolean z = this.A02;
        if (!z && str.length() == 0) {
            return "";
        }
        C46502Dg5 dg5 = new C46502Dg5(this.A00, this.A01, "coefficient_direct_recipients_ranking_variant_2", new MBH(this, 10), z, this.A03, this.A04);
        dg5.A04(str);
        return dg5;
    }

    public final /* bridge */ /* synthetic */ Object AIL(Object obj, Object obj2) {
        0sn r5 = (List) obj2;
        Context context = this.A00;
        UserSession userSession = this.A01;
        if (r5 == null) {
            r5 = 0sn.A00;
        }
        ArrayList A012 = C46503Dg6.A01(context, userSession, r5);
        C46502Dg5 dg5 = (C46502Dg5) obj;
        if (dg5 == null) {
            return new C67335MmB(0sn.A00, A012);
        }
        dg5.A02(A012);
        return dg5.A02(A012);
    }

    public final /* bridge */ /* synthetic */ Object ARG() {
        0sn r1 = 0sn.A00;
        return new C67335MmB(r1, r1);
    }

    public JZO(Context context, UserSession userSession, boolean z, boolean z2, boolean z3) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
    }
}
