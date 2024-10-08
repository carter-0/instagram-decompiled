package X;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3qS  reason: invalid class name and case insensitive filesystem */
public final class C253253qS implements C253263qT {
    public static final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final Set A00;

    public C253253qS(String str) {
        HashSet hashSet = new HashSet();
        if (str.length() > 0) {
            for (String str2 : new 11S(";").A03(str)) {
                if (str2.length() > 0) {
                    hashSet.add(str2);
                }
            }
        }
        this.A00 = hashSet;
    }
}
