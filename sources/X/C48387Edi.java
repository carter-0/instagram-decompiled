package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.Edi  reason: case insensitive filesystem */
public abstract class C48387Edi {
    public static final Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        Context context = C308206Td.A09(r3).A00;
        List list = r4.A00;
        String A0t = DbU.A0t(list, 2);
        String A0t2 = DbU.A0t(list, 4);
        if (A0t != null) {
            0oI.A07(context, A0t, A0t2);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
