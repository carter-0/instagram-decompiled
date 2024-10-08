package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.O3l  reason: case insensitive filesystem */
public abstract class C70359O3l {
    public static final Map A00;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if (charAt <= 31) {
                    if (charAt == 9) {
                    }
                    charAt = '?';
                } else {
                    if (charAt < 127) {
                    }
                    charAt = '?';
                }
                sb.append(charAt);
            }
            property = sb.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new ON7(property)));
        }
        A00 = Collections.unmodifiableMap(hashMap);
    }
}
