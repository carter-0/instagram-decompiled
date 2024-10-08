package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Ef4  reason: case insensitive filesystem */
public abstract class C48471Ef4 {
    public static final C331157Pu A00(C307896Rx r10, AnonymousClass6Tm r11) {
        FragmentActivity A04 = C308206Td.A04(r10);
        0lg A0R = DbW.A0R(r10);
        Object A03 = r11.A03(0);
        String A0p = DbS.A0p(A03);
        String str = (String) A03;
        String A0k = DbW.A0k(r11, A0p);
        String str2 = (String) DbT.A0q(r11, A0p, 2);
        C331127Pr A0W = DbS.A0W(A0R);
        A0W.A01();
        A0W.A02();
        C331157Pu A00 = A0W.A00();
        FC8.A02();
        AnonymousClass7TF.A1H(A0R, str);
        AnonymousClass7TF.A1C(A0k, 2, str2);
        C47408E1a e1a = new C47408E1a();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A03(A0a, A0R);
        A0a.putString("creator_user_id", str);
        A0a.putString("recipient_user_id", A0k);
        A0a.putString("origin", str2);
        e1a.setArguments(A0a);
        return A00.A02(A04, e1a);
    }
}
