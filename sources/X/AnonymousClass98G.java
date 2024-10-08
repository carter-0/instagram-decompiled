package X;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.98G  reason: invalid class name */
public final class AnonymousClass98G {
    public static final AnonymousClass98G A01 = new AnonymousClass98G();
    public final Map A00 = new HashMap();

    public final synchronized void A00(Map map) {
        synchronized (this) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                AnonymousClass983 r3 = (AnonymousClass983) entry.getValue();
                Map map2 = this.A00;
                if (!map2.containsKey(str)) {
                    map2.put(str, r3);
                } else if (!((AnonymousClass983) map2.get(str)).equals(r3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameters object with name ");
                    sb.append(str);
                    sb.append(" already exists (");
                    sb.append(map2.get(str));
                    sb.append("), cannot insert ");
                    sb.append(r3);
                    throw new GeneralSecurityException(sb.toString());
                }
            }
        }
    }
}
