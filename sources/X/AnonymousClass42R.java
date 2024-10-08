package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.42R  reason: invalid class name */
public final class AnonymousClass42R {
    public final 2cX A00;
    public final String A01;

    public AnonymousClass42R(2cX r6) {
        String obj;
        0qQ.A0B(r6, 1);
        this.A00 = r6;
        ImmutableMap immutableMap = r6.A00;
        if (immutableMap.isEmpty()) {
            obj = null;
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : 00k.A0Z(immutableMap.keySet())) {
                if (sb.length() > 0) {
                    sb.append("|");
                }
                sb.append(str);
                sb.append(":");
                sb.append((String) immutableMap.get(str));
            }
            obj = sb.toString();
        }
        this.A01 = obj;
    }
}
