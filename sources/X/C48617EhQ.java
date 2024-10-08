package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EhQ  reason: case insensitive filesystem */
public abstract class C48617EhQ {
    public static final Object A00(C307896Rx r5) {
        FragmentActivity A04 = C308206Td.A04(r5);
        0lg A0R = DbW.A0R(r5);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("IS_SIGN_UP_FLOW", false);
        C309516Yo A0Q = DbU.A0Q(A04, A0R);
        DbT.A15();
        C47447E2t e2t = new C47447E2t();
        e2t.setArguments(A0a);
        return Dba.A0U(e2t, A0Q);
    }
}
