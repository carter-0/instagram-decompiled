package X;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class SPv {
    public static boolean A03(List list, List list2, boolean z, boolean z2) {
        if (list == list2) {
            return true;
        }
        if (z2 ^ z) {
            return false;
        }
        if (!z) {
            return true;
        }
        if (list != null) {
            return list.equals(list2);
        }
        return false;
    }

    public static String A00(int i, Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        for (int i2 = 0; i2 < i; i2++) {
            A1A.append("  ");
        }
        String obj2 = A1A.toString();
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        try {
            if (obj instanceof Map) {
                A1A2.append("{");
                Iterator A0u = AnonymousClass7TF.A0u((Map) obj);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    Object key = A1J.getKey();
                    Object value = A1J.getValue();
                    int i3 = i + 2;
                    A1A2.append(002.A15("\n", obj2, A00(i3, key), " ", ":", " ", A00(i3, value)));
                }
                A1A2.append(002.A0g("\n", A02(obj2), "}"));
            } else if (obj instanceof Collection) {
                Pxh.A1P(A1A2);
                for (Object A00 : (Collection) obj) {
                    A1A2.append(002.A0g("\n", obj2, A00(i + 2, A00)));
                }
                A1A2.append(002.A0g("\n", A02(obj2), "]"));
            } else if (obj instanceof AnonymousClass46H) {
                A1A2.append(A01((AnonymousClass46H) obj, AnonymousClass7TE.A1A(), i));
            } else if (obj instanceof String) {
                StringBuilder A0n = AnonymousClass7TF.A0n("\"");
                A0n.append(obj);
                A0n.append("\"");
                Pxf.A1O(A1A2, A0n);
            } else {
                Pxf.A1O(A1A2, obj);
            }
        } catch (RuntimeException e) {
            StringBuilder A1A3 = AnonymousClass7TE.A1A();
            Pxg.A1R(A1A3, "Exception occured :", e);
            A1A3.append(e.getMessage());
            Pxf.A1O(A1A2, A1A3);
        }
        return A1A2.toString();
    }

    public static String A01(AnonymousClass46H r13, StringBuilder sb, int i) {
        StringBuilder sb2;
        String str;
        String A0l;
        if (r13 == null) {
            return "null";
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        for (int i2 = 0; i2 < i; i2++) {
            A1A.append("  ");
        }
        String obj = A1A.toString();
        Class<?> cls = r13.getClass();
        sb.append(cls.getSimpleName());
        sb.append(" ");
        sb.append("(");
        sb.append("\n");
        try {
            boolean z = true;
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType() == AnonymousClass46E.class) {
                    field.setAccessible(true);
                    AnonymousClass46E r11 = (AnonymousClass46E) field.get(r13);
                    String str2 = r11.A01;
                    Object obj2 = cls.getDeclaredField(str2).get(r13);
                    if (!z) {
                        C66580MXl.A1V(",", "\n", sb);
                    }
                    Pxg.A1P(obj, str2, " ", sb);
                    sb.append(":");
                    sb.append(" ");
                    if (r11.A02.containsKey("sensitive")) {
                        A0l = "<SENSITIVE FIELD>";
                    } else if (obj2 == null) {
                        A0l = "null";
                    } else {
                        if (obj2 instanceof Map) {
                            sb.append("{");
                            Iterator A0u = AnonymousClass7TF.A0u((Map) obj2);
                            while (A0u.hasNext()) {
                                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                                Object key = A1J.getKey();
                                Object value = A1J.getValue();
                                sb.append("\n");
                                sb.append(obj);
                                int i3 = i + 2;
                                Pxg.A1P(A00(i3, key), " ", ":", sb);
                                sb.append(" ");
                                sb.append(A00(i3, value));
                            }
                            sb2 = AnonymousClass7TF.A0n("\n");
                            sb2.append(A02(obj));
                            str = "}";
                        } else if (obj2 instanceof Collection) {
                            Pxh.A1P(sb);
                            for (Object A00 : (Collection) obj2) {
                                sb.append(002.A0g("\n", obj, A00(i + 2, A00)));
                            }
                            sb2 = AnonymousClass7TF.A0n("\n");
                            sb2.append(A02(obj));
                            str = "]";
                        } else if (obj2 instanceof AnonymousClass46H) {
                            A01((AnonymousClass46H) obj2, sb, i);
                            z = false;
                        } else if (obj2 instanceof String) {
                            sb2 = AnonymousClass7TE.A1A();
                            str = "\"";
                            sb2.append(str);
                            sb2.append(obj2);
                        } else {
                            A0l = obj2.toString();
                        }
                        A0l = AnonymousClass7TF.A0l(str, sb2);
                    }
                    sb.append(A0l);
                    z = false;
                }
            }
            C66580MXl.A1V("\n", A02(obj), sb);
            sb.append(")");
        } catch (Exception e) {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            Pxg.A1R(A1A2, "Exception occured :", e);
            A1A2.append(" ");
            A1A2.append(e.getMessage());
            Pxf.A1O(sb, A1A2);
        }
        return sb.toString();
    }

    public static String A02(String str) {
        int length = str.length();
        if (length > 1) {
            return str.substring(0, length - 2);
        }
        return "";
    }
}
