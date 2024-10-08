package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

public abstract class RhK {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String str = (String) r8.A01();
        1WM.getInstance();
        T8B t8b = new T8B(C308206Td.A0B(r7));
        Bundle A0a = AnonymousClass7TE.A0a();
        Iterator A0u = AnonymousClass7TF.A0u((Map) r8.A02());
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            Object value = A1J.getValue();
            if (value instanceof Integer) {
                A0a.putInt(A13, AnonymousClass7TE.A0M(value));
            } else if (value instanceof Long) {
                A0a.putLong(A13, AnonymousClass7TE.A0R(value));
            } else if (value instanceof Short) {
                A0a.putShort(A13, ((Number) value).shortValue());
            } else if (value instanceof String) {
                A0a.putString(A13, (String) value);
            } else if (value instanceof Boolean) {
                A0a.putBoolean(A13, AnonymousClass7TE.A1a(value));
            } else if (value instanceof Double) {
                A0a.putDouble(A13, JTO.A00(value));
            }
        }
        T8B A00 = t8b.A00(A0a);
        A00.A01(str);
        A00.A02(C308206Td.A04(r7));
        return null;
    }
}
