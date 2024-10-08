package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9v1  reason: invalid class name and case insensitive filesystem */
public abstract class C392569v1 {
    public static C40201AVr A00(Context context, C312136ds r7, C343967r6 r8, boolean z) {
        C312136ds r5 = null;
        C343967r6 r4 = null;
        if (r7 != null) {
            r5 = r7;
        }
        if (r8 != null) {
            r4 = r8;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(AGo.A06, new SrT(context, C9955RkA.A00));
        A1E.put(AGo.A07, new C40193AVi(context, new AD3(r5, r4, z)));
        return new C40201AVr(new AGo((Map) A1E));
    }
}
