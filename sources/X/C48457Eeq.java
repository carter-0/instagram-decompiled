package X;

import android.os.Bundle;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Eeq  reason: case insensitive filesystem */
public abstract class C48457Eeq {
    public static final Object A00(C307896Rx r4) {
        0lg A0B = C308206Td.A0B(r4);
        DbT.A15();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("RegFlowExtras.EXTRA_KEY", (RegFlowExtras) A0B.A01(RegFlowExtras.class, G1Q.A00));
        DbW.A0w(A0a, A0B);
        E3V e3v = new E3V();
        e3v.setArguments(A0a);
        return Dba.A0U(e3v, DbS.A0M(C308206Td.A04(r4), A0B));
    }
}
