package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8dO  reason: invalid class name and case insensitive filesystem */
public abstract class C359728dO {
    public static String A00(Map map, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            if (map == null) {
                map = null;
            }
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(str)) {
                str = "appId";
            }
            sb.append(str);
            String A00 = C359738dP.A00();
            if (!TextUtils.isEmpty(A00)) {
                sb.append(":");
                sb.append(A00);
            }
            if (map != null) {
                if (map.containsKey("_PRELOAD_ID_KEY_")) {
                    sb.append(":");
                    sb.append((String) map.get("_PRELOAD_ID_KEY_"));
                } else {
                    ArrayList arrayList = new ArrayList(map.keySet());
                    Collections.sort(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str4 = (String) map.get(it.next());
                        sb.append(":");
                        if (str4 == null) {
                            str3 = null;
                        } else {
                            char[] charArray = str4.toCharArray();
                            Arrays.sort(charArray);
                            str3 = new String(charArray);
                        }
                        sb.append(str3);
                    }
                }
            }
            str2 = sb.toString();
        }
        return 002.A0R(str2, "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969");
    }
}
