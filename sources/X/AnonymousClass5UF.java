package X;

import java.util.List;

/* renamed from: X.5UF  reason: invalid class name */
public final class AnonymousClass5UF extends 0Yg implements 0sP {
    public static final AnonymousClass5UF A00 = new AnonymousClass5UF();

    public AnonymousClass5UF() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        List list = (List) obj;
        return new C291745ho(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
