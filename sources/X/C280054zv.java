package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.ArrayList;

/* renamed from: X.4zv  reason: invalid class name and case insensitive filesystem */
public abstract class C280054zv {
    public static final C277014uI A00(C276544tV r4, Object obj, int i) {
        C276624td r2;
        0qQ.A0B(obj, 2);
        if (obj instanceof C277014uI) {
            return (C277014uI) obj;
        }
        if (obj instanceof BloksScript) {
            return ((BloksScript) obj).A00(r4.A01, r4.A09);
        } else if (obj instanceof C280064zw) {
            return ((C280064zw) obj).A00;
        } else {
            if (obj instanceof String) {
                String str = (String) obj;
                0qQ.A0B(str, 2);
                C276634te r3 = r4.A01;
                if (r3 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(i));
                    r2 = new C276624td(r3, arrayList);
                } else {
                    r2 = null;
                }
                return new BloksScript(r2, str, r4.A09, r4.A03);
            }
            1Kn.A02("BloksExpressionParser", 002.A07(i, "Unsupported value type: ", obj.getClass().getName(), " for key: "));
            return null;
        }
    }
}
