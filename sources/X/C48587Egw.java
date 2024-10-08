package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.Egw  reason: case insensitive filesystem */
public abstract class C48587Egw {
    public static Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        String A0K;
        C276544tV r7 = (C276544tV) r13.A03(0);
        C307786Rm r9 = (C307786Rm) r13.A02();
        0lg A0B = C308206Td.A0B(r12);
        Context context = r9.A00;
        C46498Dg1 dg1 = new C46498Dg1(context, A0B);
        String A0K2 = r7.A0K(38);
        String A0E = r7.A0E();
        if (!TextUtils.isEmpty(A0K2)) {
            if (!TextUtils.isEmpty(A0E)) {
                dg1.A0D(A0K2, A0E);
            } else {
                dg1.A08(A0K2);
            }
        }
        C276544tV A07 = r7.A07(35);
        if (!(A07 == null || (A0K = A07.A0K(36)) == null)) {
            dg1.A07(DbS.A0V(A0K));
        }
        C277014uI A0A = r7.A0A(41);
        if (A0A != null) {
            dg1.A03 = new C50474FcM(r9, r12, A0A);
        }
        for (int i = 0; i < r7.A0N(36).size(); i++) {
            C276544tV r11 = (C276544tV) r7.A0N(36).get(i);
            String A0K3 = r11.A0K(36);
            C277014uI A0A2 = r11.A0A(38);
            if (!(A0A2 == null || r11.A0E() == null)) {
                FPH fph = new FPH(7, (Object) r9, (Object) A0A2, (Object) r12);
                if (A0K3 == null || !A0K3.equals("destructive")) {
                    dg1.A0C(r11.A0E(), fph);
                } else {
                    dg1.A0A(r11.A0E(), fph);
                }
            }
        }
        new C49945FFy(dg1).A05(context);
        return null;
    }
}
