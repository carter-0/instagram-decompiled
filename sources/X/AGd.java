package X;

import com.facebook.react.modules.intent.IntentModule;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class AGd {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void A00(AnonymousClass973 r18, StringBuilder sb, int i) {
        StringBuilder sb2;
        int i2;
        int ordinal;
        Object obj;
        boolean equals;
        Method method;
        int length;
        AnonymousClass973 r13 = r18;
        HashSet A1F = AnonymousClass7TE.A1F();
        HashMap A1E = AnonymousClass7TE.A1E();
        TreeMap treeMap = new TreeMap();
        for (Method method2 : r13.getClass().getDeclaredMethods()) {
            if (!Modifier.isStatic(method2.getModifiers()) && method2.getName().length() >= 3) {
                if (method2.getName().startsWith("set")) {
                    A1F.add(method2.getName());
                } else if (Modifier.isPublic(method2.getModifiers()) && method2.getParameterTypes().length == 0) {
                    if (method2.getName().startsWith("has")) {
                        A1E.put(method2.getName(), method2);
                    } else if (method2.getName().startsWith("get")) {
                        treeMap.put(method2.getName(), method2);
                    }
                }
            }
        }
        Iterator A0s = AnonymousClass7TF.A0s(treeMap);
        while (true) {
            sb2 = sb;
            i2 = i;
            if (!A0s.hasNext()) {
                break;
            }
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            String substring = ((String) A1J.getKey()).substring(3);
            if (substring.endsWith("List") && !substring.endsWith(Pxd.A00(545)) && !substring.equals("List") && (method = (Method) A1J.getValue()) != null && method.getReturnType().equals(List.class)) {
                length = substring.length() - 4;
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) A1J.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                length = substring.length() - 3;
            } else if (A1F.contains(002.A0R("set", substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey(002.A0R("get", substring.substring(0, substring.length() - 5))))) {
                Method method3 = (Method) A1J.getValue();
                Method method4 = (Method) A1E.get(002.A0R("has", substring));
                if (method3 != null) {
                    Object A04 = AnonymousClass972.A04(r13, method3, new Object[0]);
                    if (method4 == null) {
                        if (A04 instanceof Boolean) {
                            equals = !AnonymousClass7TE.A1a(A04);
                        } else {
                            if (A04 instanceof Integer) {
                                ordinal = AnonymousClass7TE.A0M(A04);
                            } else if (A04 instanceof Float) {
                                ordinal = Float.floatToRawIntBits(AnonymousClass7TE.A04(A04));
                            } else if (A04 instanceof Double) {
                                ordinal = (Double.doubleToRawLongBits(((Number) A04).doubleValue()) > 0 ? 1 : (Double.doubleToRawLongBits(((Number) A04).doubleValue()) == 0 ? 0 : -1));
                            } else {
                                if (A04 instanceof String) {
                                    obj = "";
                                } else if (A04 instanceof AnonymousClass97R) {
                                    obj = AnonymousClass97R.A01;
                                } else if (A04 instanceof AnonymousClass973) {
                                    if (A04 == ((AnonymousClass972) ((AnonymousClass972) ((AnonymousClass974) A04)).A0E(AnonymousClass05K.A0j, (Object) null, (Object) null))) {
                                    }
                                } else if (A04 instanceof Enum) {
                                    ordinal = ((Enum) A04).ordinal();
                                }
                                equals = A04.equals(obj);
                            }
                            if (ordinal == 0) {
                            }
                        }
                        if (equals) {
                        }
                    } else if (!AnonymousClass7TE.A1a(AnonymousClass972.A04(r13, method4, new Object[0]))) {
                    }
                    A01(A04, substring, sb2, i2);
                }
            }
            A01(AnonymousClass972.A04(r13, method, new Object[0]), substring.substring(0, length), sb2, i2);
        }
        AnonymousClass975 r3 = ((AnonymousClass972) r13).unknownFields;
        if (r3 != null) {
            for (int i3 = 0; i3 < r3.A00; i3++) {
                A01(r3.A04[i3], String.valueOf(r3.A03[i3] >>> 3), sb2, i2);
            }
        }
    }

    public static void A01(Object obj, String str, StringBuilder sb, int i) {
        String A002;
        if (obj instanceof List) {
            for (Object A01 : (List) obj) {
                A01(A01, str, sb, i);
            }
        } else if (obj instanceof Map) {
            Iterator A0u = AnonymousClass7TF.A0u((Map) obj);
            while (A0u.hasNext()) {
                A01(A0u.next(), str, sb, i);
            }
        } else {
            sb.append(10);
            int i2 = i;
            while (i2 > 0) {
                char[] cArr = A00;
                int i3 = 80;
                if (i2 <= 80) {
                    i3 = i2;
                }
                sb.append(cArr, 0, i3);
                i2 -= i3;
            }
            if (!str.isEmpty()) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(Character.toLowerCase(str.charAt(0)));
                for (int i4 = 1; i4 < str.length(); i4++) {
                    char charAt = str.charAt(i4);
                    if (Character.isUpperCase(charAt)) {
                        A1A.append("_");
                    }
                    A1A.append(Character.toLowerCase(charAt));
                }
                str = A1A.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                AnonymousClass97Z r0 = AnonymousClass97R.A02;
                A002 = C393279wB.A00(new AnonymousClass97V(((String) obj).getBytes(AnonymousClass97S.A04)));
            } else if (obj instanceof AnonymousClass97R) {
                sb.append(": \"");
                A002 = C393279wB.A00((AnonymousClass97R) obj);
            } else {
                if (obj instanceof AnonymousClass972) {
                    sb.append(" {");
                    A00((AnonymousClass973) obj, sb, i + 2);
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i5 = i + 2;
                    A01(entry.getKey(), "key", sb, i5);
                    A01(entry.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE, sb, i5);
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("\n");
                while (i > 0) {
                    char[] cArr2 = A00;
                    int i6 = 80;
                    if (i <= 80) {
                        i6 = i;
                    }
                    sb.append(cArr2, 0, i6);
                    i -= i6;
                }
                sb.append("}");
                return;
            }
            sb.append(A002);
            sb.append('\"');
        }
    }
}
