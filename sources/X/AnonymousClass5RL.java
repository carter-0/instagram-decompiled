package X;

/* renamed from: X.5RL  reason: invalid class name */
public final class AnonymousClass5RL extends C284985Pf<C267304bL<Object>, C286605Xb<Object>> implements AnonymousClass5RM {
    public static final AnonymousClass5RL A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.5RL, X.5Pf] */
    static {
        C285005Ph r2 = C285005Ph.A04;
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        A00 = new C284985Pf(r2, 0);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C267304bL)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C286605Xb)) {
            return false;
        }
        return AnonymousClass5RL.super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C267304bL)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof C267304bL)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }
}
