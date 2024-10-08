package X;

import com.google.common.collect.HashBiMap;
import java.util.HashMap;

public abstract class SBL {
    public static final HashMap A00 = AnonymousClass7TE.A1E();

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.RVn] */
    public static final SOL A00(String str) {
        SOL sol;
        0qQ.A0B(str, 0);
        HashMap hashMap = A00;
        synchronized (hashMap) {
            sol = (SOL) hashMap.get(str);
            if (sol == null) {
                HashBiMap hashBiMap = SOL.A09;
                sol = new SOL(new Object(), str);
                hashMap.put(str, sol);
            }
        }
        return sol;
    }
}
