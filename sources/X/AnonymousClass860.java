package X;

import java.util.HashMap;

/* renamed from: X.860  reason: invalid class name */
public final class AnonymousClass860 extends 2YL {
    public final HashMap A00 = new HashMap();
    public final HashMap A01 = new HashMap();

    public final AnonymousClass861 A00(String str) {
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new AnonymousClass861());
        }
        Object obj = hashMap.get(str);
        if (obj != null) {
            return (AnonymousClass861) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C3516889w A01(String str) {
        HashMap hashMap = this.A00;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new C3516889w());
        }
        Object obj = hashMap.get(str);
        if (obj != null) {
            return (C3516889w) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
