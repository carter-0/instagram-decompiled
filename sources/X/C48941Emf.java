package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Emf  reason: case insensitive filesystem */
public abstract class C48941Emf {
    public static final E7Y A00(UserSession userSession, C51906G7a g7a, String str, String str2, boolean z) {
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, userSession);
        A0a.putString("hall_pass_id", str);
        A0a.putBoolean("is_from_share_cut", z);
        A0a.putString(C273654mx.A00(53), str2);
        E7Y e7y = new E7Y();
        e7y.setArguments(A0a);
        e7y.A04 = g7a;
        e7y.A09 = AnonymousClass7TF.A1V(g7a);
        return e7y;
    }
}
