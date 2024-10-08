package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public abstract class RhE {
    public static Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        String str = (String) r4.A03(0);
        0lg A0B = C308206Td.A0B(r3);
        FragmentActivity A04 = C308206Td.A04(r3);
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1O(A0B, A04);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("igUserId", str);
        1WM.getInstance();
        T8B A01 = new T8B(A0B).A01("IgFundraiserLandingRoute");
        A01.A00(A0a);
        A01.A02(A04);
        return null;
    }
}
