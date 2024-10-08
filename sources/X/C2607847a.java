package X;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.47a  reason: invalid class name and case insensitive filesystem */
public abstract class C2607847a {
    public static long A00(Map map, boolean z) {
        String str;
        if (map == null) {
            return -1;
        }
        List A01 = A01("Content-Range", map, z);
        if (A01 == null || A01.isEmpty()) {
            List A012 = A01("Content-Length", map, z);
            if (A012 == null || A012.isEmpty()) {
                return -1;
            }
            str = (String) A012.get(0);
        } else {
            String str2 = (String) A01.get(0);
            str = str2.substring(str2.lastIndexOf(47) + 1).trim();
        }
        return Long.parseLong(str);
    }

    public static void A02(C257263x7 r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("video_uid=");
        sb.append(AnonymousClass0HM.A00());
        String obj = sb.toString();
        if (obj != null) {
            r3.A07.A0Q.put("x-fb-qpl-ec", obj);
        }
    }

    public static List A01(String str, Map map, boolean z) {
        if (!map.containsKey(str)) {
            if (!z) {
                return null;
            }
            Locale locale = Locale.US;
            if (!map.containsKey(str.toLowerCase(locale))) {
                return null;
            }
            str = str.toLowerCase(locale);
        }
        return (List) map.get(str);
    }
}
