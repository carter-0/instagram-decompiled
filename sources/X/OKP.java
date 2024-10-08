package X;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class OKP {
    public int A00;
    public final List A01 = new LinkedList();

    public final List A00() {
        Iterable iterable;
        List list = this.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (next instanceof C232262tL) {
                iterable = AnonymousClass7TE.A1I(next);
            } else {
                0qQ.A0C(next, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.recyclerview.model.RecyclerViewModel<*, *>>");
                iterable = (Iterable) next;
            }
            018.A16(iterable, A1C);
        }
        return A1C;
    }
}
