package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class V94 {
    public static final Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        C276544tV A0P = DbY.A0P(r16, 0);
        C307896Rx r14 = r15;
        FragmentActivity A04 = C308206Td.A04(r15);
        UserSession A0W = DbX.A0W(r15);
        String A0F = A0P.A0F();
        String str = "";
        if (A0F == null) {
            A0F = str;
        }
        String A0I = A0P.A0I();
        if (A0I != null) {
            str = A0I;
        }
        String A0G = A0P.A0G();
        AnonymousClass1Nd.A00(A0W).A01(new C64695LgQ(A0P.A0A(43), A0W, r14, str, 0), WQL.class);
        WGT.A02(A04, A0W, A0F, str, A0G, (String) null, "ig_boost", (String) null, false);
        return null;
    }
}
