package X;

import java.util.AbstractCollection;
import java.util.HashMap;

/* renamed from: X.HzC  reason: case insensitive filesystem */
public abstract class C56480HzC {
    public static final HashMap A00 = AnonymousClass7TE.A1E();
    public static final HashMap A01 = AnonymousClass7TE.A1E();

    public static final void A00(String str, String str2) {
        HashMap hashMap = A00;
        if (!hashMap.containsKey(str2)) {
            hashMap.put(str2, 0sc.A05(new String[]{str}));
            return;
        }
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str2);
        if (abstractCollection != null) {
            abstractCollection.add(str);
        }
    }
}
