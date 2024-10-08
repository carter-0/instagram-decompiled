package X;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class LHV {
    public static final C60340gF A00(C307896Rx r12, AnonymousClass6Tm r13) {
        boolean z = false;
        Object A03 = r13.A03(0);
        DbS.A1Y(A03);
        String str = (String) A03;
        C277014uI r6 = ((C280064zw) r13.A03(1)).A00;
        C307896Rx r7 = r12;
        if (r12.A03 != null) {
            if (str.length() == 0) {
                C308276Tl r1 = new C308276Tl();
                r1.A03(1, 0);
                C299275ur.A00(r12, r1.A00(), r6);
            } else {
                UserSession A0A = C308206Td.A0A(C308206Td.A09(r12));
                FragmentActivity A04 = C308206Td.A04(r12);
                FragmentActivity A042 = C308206Td.A04(r12);
                if (Build.VERSION.SDK_INT >= 33) {
                    z = true;
                }
                boolean A07 = 1DL.A07(A04, "android.permission.WRITE_EXTERNAL_STORAGE");
                if (z || A07) {
                    A01(A042, r12, r6, A0A, str);
                    return null;
                }
                JTP.A11(A04, new C64729Lh6(2, new C58716IwP(r12, r6, 31), new C58220IoO(r6, r7, A0A, A042, str, 1)), "android.permission.WRITE_EXTERNAL_STORAGE");
                return C60340gF.A00;
            }
        }
        return null;
    }

    public static final void A01(Context context, C307896Rx r11, C277014uI r12, UserSession userSession, String str) {
        C290815g0 A04 = C59730JVo.A04(context, userSession, new C11211SFl(str, "image url", false, false, false), -1, true);
        A04.A00 = new C385899ji(1, context, r11, r12);
        1ES.A06(A04, 15, false);
    }
}
