package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eeh  reason: case insensitive filesystem */
public abstract class C48448Eeh {
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        Object A03 = r14.A03(0);
        String A0p = DbS.A0p(A03);
        Object A02 = r14.A02();
        0qQ.A0C(A02, A0p);
        String A0p2 = DbX.A0p(r14, A0p);
        Object A032 = r14.A03(4);
        0qQ.A0C(A032, AnonymousClass000.A00(721));
        CallerContext callerContext = C46399DeM.A00;
        UserSession A0Y = DbT.A0Y(r13);
        FragmentActivity A04 = C308206Td.A04(r13);
        Fragment A0H = DbU.A0H(r13);
        AnonymousClass0iw A08 = C308206Td.A08(r13);
        C46399DeM.A05(A0H, A04, A08, A0Y, false, (Double) A032, (String) A03, "", (String) A02, A0p2, (String) DbT.A0q(r14, A0p, 5));
        return null;
    }
}
