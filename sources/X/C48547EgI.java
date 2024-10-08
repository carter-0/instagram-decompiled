package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.EgI  reason: case insensitive filesystem */
public abstract class C48547EgI {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        String str = (String) DbW.A0g(r10, 0);
        UserSession A0Z = DbT.A0Z(r9);
        User A0j = DbV.A0j(A0Z, str);
        if (A0j == null) {
            return null;
        }
        ImageUrl Bh3 = A0j.Bh3();
        String B8Q = A0j.B8Q();
        if (31 < B8Q.length()) {
            B8Q = 002.A0C(00R.A03(B8Q, 30), 8230);
        }
        0qQ.A0B(A0Z, 0);
        AnonymousClass7TF.A1C(str, 1, B8Q);
        Bundle A0a = AnonymousClass7TE.A0a();
        C47428E1x e1x = new C47428E1x();
        DbU.A1D(A0a, A0Z);
        A0a.putString("USER_ID_ARGUMENT", str);
        A0a.putParcelable("PROFILE_PIC_URL_ARGUMENT", Bh3);
        A0a.putString("DISPLAY_NAME_ARGUMENT", B8Q);
        A0a.putString("ENTRY_POINT", "story");
        C331127Pr A0V = DbV.A0V(A0a, e1x, A0Z);
        A0V.A0U = new C19679Wdh(0);
        C331157Pu A00 = A0V.A00();
        FragmentActivity A04 = C308206Td.A04(r9);
        0qQ.A0C(A04, "null cannot be cast to non-null type android.app.Activity");
        A00.A02(A04, e1x);
        return null;
    }
}
