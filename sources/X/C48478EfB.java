package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EfB  reason: case insensitive filesystem */
public abstract class C48478EfB {
    public static final C60340gF A00(C307896Rx r6) {
        String token;
        FragmentActivity A04 = C308206Td.A04(r6);
        0lg A0B = C308206Td.A0B(r6);
        if (A0B instanceof UserSession) {
            09i.A0A.A03(new Fl4(0));
            token = "IgSessionManager.LOGGED_OUT_TOKEN";
        } else {
            token = A0B.getToken();
        }
        C309516Yo A0J = DbY.A0J(A04, A0B);
        Bundle A0C = DbX.A0C(token);
        A0C.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", "");
        A0C.putBoolean("com.instagram.android.login.fragment.ARGUMENT_USER_IS_VALID", true);
        DbW.A0x(A0C, new C47483E4i(), A0J);
        return C60340gF.A00;
    }
}
