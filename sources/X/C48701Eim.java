package X;

import android.content.Context;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Eim  reason: case insensitive filesystem */
public abstract class C48701Eim {
    public static Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        boolean A1W = DbW.A1W(r9, 0);
        boolean A01 = Q0A.A01(r9.A02());
        C277014uI A0S = DbX.A0S(r9, 2);
        FragmentActivity A04 = C308206Td.A04(r8);
        Context applicationContext = A04.getApplicationContext();
        if (applicationContext != null) {
            Window window = A04.getWindow();
            1ZF A00 = C48916EmG.A00();
            if (A1W) {
                A00.A00(applicationContext, window, A01, false);
            } else {
                A00.A01(window);
            }
            if (A0S != null) {
                DbS.A1Q(r8, A0S);
            }
        }
        return null;
    }
}
