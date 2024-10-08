package X;

import android.text.Editable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class OQX {
    public static final List A01(List list) {
        String str;
        AnonymousClass77I r4;
        String str2;
        C3260975j r0;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C61072JwA jwA = (C61072JwA) it.next();
            C3260875i r42 = (C3260875i) jwA.A02;
            Integer A03 = r42.A03();
            Long l = null;
            if (A03 != null) {
                int intValue = A03.intValue();
                if (!(r42 instanceof C3260975j) || (r0 = (C3260975j) r42) == null || (str = r0.A07()) == null) {
                    str = r42.A05();
                }
                int i = jwA.A01;
                int length = str.length();
                if (!(!(r42 instanceof AnonymousClass77I) || (r4 = (AnonymousClass77I) r42) == null || (str2 = r4.A06) == null)) {
                    l = AnonymousClass7TE.A10(str2);
                }
                A1C.add(new AnonymousClass9IY(l, 0L, length, intValue, i, 0));
            }
        }
        return A1C;
    }

    public static final List A00(Editable editable) {
        OCB[] ocbArr;
        if (editable == null || (ocbArr = (OCB[]) editable.getSpans(0, editable.length(), OCB.class)) == null) {
            return 0sn.A00;
        }
        ArrayList A0v = DbS.A0v(r5);
        for (OCB ocb : ocbArr) {
            A0v.add(new C61072JwA(ocb.A00, Math.max(0, editable.getSpanStart(ocb))));
        }
        return A0v;
    }
}
