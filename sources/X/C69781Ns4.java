package X;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.Ns4  reason: case insensitive filesystem */
public abstract class C69781Ns4 {
    public static final Object A00(C307896Rx r18, AnonymousClass6Tm r19) {
        String A0n;
        AnonymousClass6Tm r2 = r19;
        Object A03 = r2.A03(0);
        DbS.A1Y(A03);
        String str = (String) A03;
        List list = r2.A00;
        String A0t = DbU.A0t(list, 1);
        String A0t2 = DbU.A0t(list, 2);
        String A0t3 = DbU.A0t(list, 3);
        String A0t4 = DbU.A0t(list, 4);
        C277014uI A0R = DbV.A0R(list, 5);
        C277014uI A0R2 = DbV.A0R(list, 6);
        C277014uI A0R3 = DbV.A0R(list, 7);
        C277014uI A0R4 = DbV.A0R(list, 8);
        Bundle A0a = AnonymousClass7TE.A0a();
        C307896Rx r13 = r18;
        C227642jf.A03(A0a, C308206Td.A0B(r13));
        0qQ.A0B(str, 0);
        C307786Rm r0 = r13.A03;
        if (r0 == null) {
            return null;
        }
        Context context = r0.A00;
        NC0 nc0 = new NC0(r13, A0R, A0R2, A0R3, A0R4);
        OUs oUs = OUs.A00;
        0Yt.A0E();
        OUs oUs2 = OUs.A00;
        synchronized (oUs2) {
            A0n = C51972G9s.A0n();
            OUs.A02.put(A0n, nc0);
        }
        synchronized (oUs2) {
            0Yt.A0E();
            new C73676Php(context, A0a, A0n, str, A0t, A0t2, A0t3, A0t4).invoke();
        }
        return null;
    }
}
