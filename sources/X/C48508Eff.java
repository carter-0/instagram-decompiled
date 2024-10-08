package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Eff  reason: case insensitive filesystem */
public abstract class C48508Eff {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        HashMap hashMap;
        if (AnonymousClass7TF.A1V(1Wj.A00)) {
            UserSession A0W = DbX.A0W(r6);
            FragmentActivity A04 = C308206Td.A04(r6);
            String A0g = DbY.A0g(r7);
            Object A0p = DbT.A0p(r7, 1);
            if (A0p != null) {
                hashMap = C48297EcG.A00((HashMap) A0p);
            } else {
                hashMap = null;
            }
            DcL.A00().A02(A04, A0W, A0g, hashMap);
        }
        return null;
    }
}
