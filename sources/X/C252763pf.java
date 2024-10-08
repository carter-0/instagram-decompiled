package X;

import java.util.Map;

/* renamed from: X.3pf  reason: invalid class name and case insensitive filesystem */
public abstract class C252763pf {
    public static final AnonymousClass4CZ A00(C251983oI r4) {
        Map map = r4.backingFieldMap;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            obj = new AnonymousClass38Q(r4.getQueryExecutor());
            map.put("QueryDispatcher", obj);
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (AnonymousClass4CZ) obj;
    }

    public static final AnonymousClass4CZ A01(C251983oI r4) {
        Map map = r4.backingFieldMap;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            obj = new AnonymousClass38Q(r4.getTransactionExecutor());
            map.put("TransactionDispatcher", obj);
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (AnonymousClass4CZ) obj;
    }
}
