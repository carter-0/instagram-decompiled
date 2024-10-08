package X;

import com.facebook.react.modules.intent.IntentModule;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public abstract class SL0 {
    public static final void A02(Object obj, String str, StringBuilder sb, int i) {
        String A00;
        if (obj instanceof List) {
            Iterator A1H = C51966G9m.A1H(obj);
            while (A1H.hasNext()) {
                A02(A1H.next(), str, sb, i);
            }
        } else if (obj instanceof Map) {
            Iterator A0u = AnonymousClass7TF.A0u((Map) obj);
            while (A0u.hasNext()) {
                A02(A0u.next(), str, sb, i);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                TAM tam = TAM.A01;
                A00 = C9754RgC.A00(new R5r(((String) obj).getBytes(SDA.A04)));
            } else if (obj instanceof TAM) {
                sb.append(": \"");
                A00 = C9754RgC.A00((TAM) obj);
            } else {
                String str2 = "}";
                if (obj instanceof R5n) {
                    sb.append(" {");
                    A01((T5R) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A02(entry.getKey(), "key", sb, i4);
                    A02(entry.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE, sb, i4);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    str2 = obj.toString();
                }
                sb.append(str2);
                return;
            }
            sb.append(A00);
            sb.append('\"');
        }
    }

    public static final String A00(String str) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        for (int i = 0; i < str.length(); i++) {
            A1A.append(Character.toLowerCase(Pxj.A02(str, A1A, i)));
        }
        return A1A.toString();
    }

    public static void A01(T5R t5r, StringBuilder sb, int i) {
        String str;
        int ordinal;
        Object obj;
        boolean equals;
        Method method;
        String A00;
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        TreeSet treeSet = new TreeSet();
        for (Method A0c : t5r.getClass().getDeclaredMethods()) {
            Pxk.A0c(A0c, treeSet, A1E2, A1E);
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (A18.startsWith("get")) {
                str = A18.substring(3);
            } else {
                str = A18;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String A0Z = Pxi.A0Z(1, str.length() - 4, str, Pxi.A0i(str));
                method = (Method) A1E.get(A18);
                if (method != null && method.getReturnType().equals(List.class)) {
                    A00 = A00(A0Z);
                    A02(R5n.A02(t5r, method, new Object[0]), A00, sb, i);
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String A0Z2 = Pxi.A0Z(1, str.length() - 3, str, Pxi.A0i(str));
                method = (Method) A1E.get(A18);
                if (method != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    A00 = A00(A0Z2);
                    A02(R5n.A02(t5r, method, new Object[0]), A00, sb, i);
                }
            }
            if (Pxi.A0W("set", str, A1E2) != null && (!str.endsWith("Bytes") || !A1E.containsKey(Pxi.A0Z(0, str.length() - 5, str, "get")))) {
                String A0R = 002.A0R(Pxi.A0i(str), str.substring(1));
                Method method2 = (Method) Pxi.A0W("get", str, A1E);
                Method method3 = (Method) Pxi.A0W("has", str, A1E);
                if (method2 != null) {
                    Object A02 = R5n.A02(t5r, method2, new Object[0]);
                    if (method3 == null) {
                        if (A02 instanceof Boolean) {
                            equals = !AnonymousClass7TE.A1a(A02);
                        } else {
                            if (A02 instanceof Integer) {
                                ordinal = AnonymousClass7TE.A0M(A02);
                            } else if (A02 instanceof Float) {
                                ordinal = Float.floatToRawIntBits(AnonymousClass7TE.A04(A02));
                            } else if (A02 instanceof Double) {
                                ordinal = (Pxg.A0G(A02) > 0 ? 1 : (Pxg.A0G(A02) == 0 ? 0 : -1));
                            } else {
                                if (A02 instanceof String) {
                                    obj = "";
                                } else if (A02 instanceof TAM) {
                                    obj = TAM.A01;
                                } else if (A02 instanceof T5R) {
                                    if (A02 == ((C13663TeU) A02).Avs()) {
                                    }
                                } else if (A02 instanceof Enum) {
                                    ordinal = ((Enum) A02).ordinal();
                                }
                                equals = A02.equals(obj);
                            }
                            if (ordinal == 0) {
                            }
                        }
                        if (equals) {
                        }
                    } else if (!AnonymousClass7TE.A1a(R5n.A02(t5r, method3, new Object[0]))) {
                    }
                    A02(A02, A00(A0R), sb, i);
                }
            }
        }
        SIT sit = ((R5n) t5r).unknownFields;
        if (sit != null) {
            for (int i2 = 0; i2 < sit.A00; i2++) {
                A02(sit.A02[i2], String.valueOf(sit.A01[i2] >>> 3), sb, i);
            }
        }
    }
}
