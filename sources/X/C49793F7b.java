package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.F7b  reason: case insensitive filesystem */
public abstract class C49793F7b {
    public static final E59 A01(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        E59 e59 = new E59();
        e59.setArguments(bundle);
        return e59;
    }

    public static final E1D A00(UserSession userSession, String str) {
        AnonymousClass7TG.A1N(userSession, str);
        E1D e1d = new E1D();
        Bundle A09 = DbY.A09(userSession);
        A09.putString("AddAccountBottomSheetFragment.ARGUMENT_ENTRY_POINT", str);
        e1d.setArguments(A09);
        return e1d;
    }
}
