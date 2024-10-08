package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.5lr  reason: invalid class name and case insensitive filesystem */
public abstract class C294105lr {
    public static 0xF A00(Map map) {
        0xF r4 = new 0xF();
        for (Map.Entry entry : map.entrySet()) {
            String A0G = C308206Td.A0G(entry.getKey());
            Object A03 = A03(entry.getValue());
            if (A03 == null) {
                A03 = null;
            }
            0xF.A00(r4, A03, A0G);
        }
        return r4;
    }

    public static Object A03(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            0xE r3 = new 0xE();
            for (Object A03 : (List) obj) {
                Object A032 = A03(A03);
                if (A032 == null) {
                    str = null;
                } else if ((A032 instanceof 0xE) || (A032 instanceof 0xF)) {
                    r3.A00.add(A032);
                } else if (A032 instanceof Long) {
                    r3.A02(((Number) A032).longValue());
                } else if (A032 instanceof Boolean) {
                    r3.A05(((Boolean) A032).booleanValue());
                } else {
                    str = (String) A032;
                }
                r3.A04(str);
            }
            return r3;
        } else if (obj instanceof Map) {
            return A00((Map) obj);
        } else {
            if (obj instanceof Boolean) {
                return obj;
            }
            if (obj instanceof Number) {
                Number number = (Number) obj;
                long longValue = number.longValue();
                double doubleValue = number.doubleValue();
                if (doubleValue == ((double) ((long) doubleValue))) {
                    return Long.valueOf(longValue);
                }
            }
            return C308206Td.A0G(obj);
        }
    }

    public static Object A01(C307896Rx r5, AnonymousClass6Tm r6) {
        AnonymousClass0iw A08;
        if (!C294115ls.A00()) {
            String str = (String) r6.A03(0);
            String str2 = (String) r6.A00.get(1);
            Map map = (Map) r6.A03(2);
            if (str2 != null) {
                A08 = new C294135lu(str2);
            } else {
                A08 = C308206Td.A08(r5);
            }
            0xI A00 = 0xI.A00(A08, str);
            A00.A07.add(0j2.A03);
            A00.A04(A00(map));
            A00.A0C("nav_chain", AnonymousClass1QI.A00.A02.A00);
            C60510iO.A00(C308206Td.A0B(r5)).EFq(A00);
        }
        return null;
    }

    public static Object A02(C307896Rx r5, AnonymousClass6Tm r6) {
        AnonymousClass0iw A08;
        if (!C294115ls.A00()) {
            String str = (String) r6.A03(0);
            String str2 = (String) r6.A00.get(1);
            Map map = (Map) r6.A03(2);
            if (str2 != null) {
                A08 = new C22341Xzq(str2);
            } else {
                A08 = C308206Td.A08(r5);
            }
            0xI A00 = 0xI.A00(A08, str);
            A00.A07.add(0j2.A03);
            A00.A04(A00(map));
            C60510iO.A00(C308206Td.A0B(r5)).EHF(A00);
        }
        return null;
    }
}
