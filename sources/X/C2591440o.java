package X;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.40o  reason: invalid class name and case insensitive filesystem */
public abstract class C2591440o {
    public static final C2591540p A00 = new Object();

    public static final int A00(String str, String str2, SerialDescriptor serialDescriptor, C250863mB r5) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        int A01 = A01(str, serialDescriptor, r5);
        if (A01 != -3) {
            return A01;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(serialDescriptor.BsV());
        sb.append(" does not contain element with name '");
        sb.append(str);
        sb.append('\'');
        sb.append(str2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final int A01(String str, SerialDescriptor serialDescriptor, C250863mB r5) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(str, 2);
        AnonymousClass40P r2 = r5.A00;
        if (!r2.A08 || !0qQ.A0K(serialDescriptor.BKK(), AnonymousClass48A.A00)) {
            0qQ.A0K(serialDescriptor.BKK(), C2590840i.A00);
            int B0T = serialDescriptor.B0T(str);
            if (B0T != -3 || !r2.A0E) {
                return B0T;
            }
        } else {
            str = str.toLowerCase(Locale.ROOT);
            0qQ.A07(str);
        }
        Number number = (Number) A02(serialDescriptor, r5).get(str);
        if (number != null) {
            return number.intValue();
        }
        return -3;
    }

    public static final Map A02(SerialDescriptor serialDescriptor, C250863mB r6) {
        Object obj;
        AnonymousClass40S r2 = r6.A01;
        C2591540p r4 = A00;
        C20414Wqy wqy = new C20414Wqy(serialDescriptor, r6);
        0qQ.A0B(r4, 1);
        Map map = r2.A00;
        Map map2 = (Map) map.get(serialDescriptor);
        if (map2 == null || (obj = map2.get(r4)) == null) {
            obj = wqy.invoke();
            0qQ.A0B(obj, 2);
            Object obj2 = map.get(serialDescriptor);
            if (obj2 == null) {
                obj2 = new ConcurrentHashMap(2);
                map.put(serialDescriptor, obj2);
            }
            ((Map) obj2).put(r4, obj);
        }
        return (Map) obj;
    }

    public static final void A03(String str, Map map, SerialDescriptor serialDescriptor, int i) {
        String str2;
        if (0qQ.A0K(serialDescriptor.BKK(), AnonymousClass48A.A00)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The suggested name '");
        sb.append(str);
        sb.append("' for ");
        sb.append(str2);
        sb.append(' ');
        sb.append(serialDescriptor.B0V(i));
        sb.append(" is already one of the names for ");
        sb.append(str2);
        sb.append(' ');
        sb.append(serialDescriptor.B0V(((Number) 0k2.A0I(str, map)).intValue()));
        sb.append(" in ");
        sb.append(serialDescriptor);
        String obj = sb.toString();
        0qQ.A0B(obj, 1);
        throw new IllegalArgumentException(obj);
    }
}
