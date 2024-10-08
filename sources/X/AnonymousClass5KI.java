package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5KI  reason: invalid class name */
public abstract class AnonymousClass5KI {
    public static final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static final C239283Fv A00(Context context, AnonymousClass5KJ r10, String str, 0sP r12) {
        String str2 = str;
        0qQ.A0B(str, 0);
        0sP r4 = r12;
        0qQ.A0B(r12, 2);
        ConcurrentHashMap concurrentHashMap = A00;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A04, new C377729My(r4, r10, context, str2, 4));
            obj = concurrentHashMap.putIfAbsent(str, A002);
            if (obj == null) {
                obj = A002;
            }
        }
        return (C239283Fv) ((AnonymousClass0eM) obj).getValue();
    }
}
