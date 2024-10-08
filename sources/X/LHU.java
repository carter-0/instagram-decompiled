package X;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class LHU {
    public static final C60340gF A00(C307896Rx r9, AnonymousClass6Tm r10) {
        boolean z = false;
        Object A03 = r10.A03(0);
        DbS.A1Y(A03);
        String str = (String) A03;
        UserSession A0B = C308206Td.A0B(r9);
        FragmentActivity A04 = C308206Td.A04(r9);
        FragmentActivity A042 = C308206Td.A04(r9);
        if (Build.VERSION.SDK_INT >= 33) {
            z = true;
        }
        boolean A07 = 1DL.A07(A04, "android.permission.WRITE_EXTERNAL_STORAGE");
        if (z || A07) {
            A01(A0B, A042, str);
            return null;
        }
        JTP.A11(A04, new C64727Lh4(new C58719IwS(A042, A0B, str, 20), 0), "android.permission.WRITE_EXTERNAL_STORAGE");
        return C60340gF.A00;
    }

    public static final void A01(UserSession userSession, Context context, String str) {
        C290815g0 A04 = C59730JVo.A04(context, userSession, new C11211SFl(str, "image url", false, false, false), -1, true);
        KH1.A01(A04, context, 4);
        1ES.A06(A04, 103, false);
    }
}
