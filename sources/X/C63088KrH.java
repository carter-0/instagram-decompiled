package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.KrH  reason: case insensitive filesystem */
public abstract class C63088KrH {
    public static final Object A00(C307896Rx r5) {
        UserSession A0W = DbX.A0W(r5);
        FragmentActivity A04 = C308206Td.A04(r5);
        ArrayList A1D = AnonymousClass7TE.A1D(00k.A0X(1Au.A00(A0W).A0I("reel")));
        boolean A24 = 1Au.A00(A0W).A24("reel");
        C307786Rm r0 = r5.A03;
        if (r0 != null) {
            C64025LJm.A01(r0.A00, A04, A0W, A1D, A24);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
