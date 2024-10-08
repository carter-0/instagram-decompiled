package X;

import java.security.GeneralSecurityException;
import java.util.Map;

/* renamed from: X.9At  reason: invalid class name and case insensitive filesystem */
public abstract class C374779At {
    public static C374789Au A00(String str) {
        AnonymousClass983 r1;
        AnonymousClass98G r2 = AnonymousClass98G.A01;
        synchronized (r2) {
            Map map = r2.A00;
            if (map.containsKey(str)) {
                r1 = (AnonymousClass983) map.get(str);
            } else {
                throw new GeneralSecurityException(002.A0g("Name ", str, AnonymousClass000.A00(1983)));
            }
        }
        return new C374789Au(r1);
    }
}
