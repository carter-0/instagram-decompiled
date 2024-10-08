package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EeN  reason: case insensitive filesystem */
public abstract class C48428EeN {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        List list = r9.A00;
        String A0t = DbU.A0t(list, 0);
        String A0t2 = DbU.A0t(list, 1);
        String A0d = Dba.A0d(list);
        Object A03 = r9.A03(4);
        String A0p = DbS.A0p(A03);
        String str = (String) A03;
        String str2 = (String) DbT.A0q(r9, A0p, 5);
        C307786Rm r0 = r8.A03;
        if (r0 != null) {
            UserSession A0V = DbU.A0V(r8);
            DbS.A1Z(A0V);
            FGT.A00(r0.A00, (FragmentActivity) null, A0V, A0t, A0t2, A0d, str, str2);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
