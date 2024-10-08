package X;

import java.util.Collection;

/* renamed from: X.5qS  reason: invalid class name and case insensitive filesystem */
public abstract class C296675qS {
    public static void A01(C13420Ta1 ta1, String str, StringBuilder sb, Object... objArr) {
        String obj;
        Object[] objArr2;
        boolean z = true;
        for (Collection collection : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            if (collection instanceof Collection) {
                objArr2 = collection.toArray();
            } else if (collection instanceof Object[]) {
                objArr2 = (Object[]) collection;
            } else {
                if (ta1 == null || collection != null) {
                    obj = collection.toString();
                } else {
                    obj = "n/a";
                }
                sb.append(obj);
            }
            A01(ta1, str, sb, objArr2);
        }
    }

    public static String A00(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        String[] split = str.split("\\s");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            if (split[i].length() != 0) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(Character.toUpperCase(split[i].charAt(0)));
                sb.append(split[i].substring(1));
            }
        }
        return sb.toString();
    }

    public static boolean A03(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean A04(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static boolean A02(CharSequence charSequence) {
        if (!A03(charSequence)) {
            for (int i = 0; i < charSequence.length(); i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
