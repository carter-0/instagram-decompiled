package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Ego  reason: case insensitive filesystem */
public abstract class C48579Ego {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        boolean z;
        List list = r8.A00;
        if (list.size() > 1) {
            Object obj = list.get(1);
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
            z = AnonymousClass7TE.A1a(obj);
        } else {
            z = false;
        }
        C309516Yo A0Q = DbU.A0Q(C308206Td.A04(r7), C308206Td.A0B(r7));
        A0Q.A0B((Bundle) null, FC8.A00().A01(true, false, !z, false, z));
        A0Q.A04();
        return null;
    }
}
