package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.Rrv  reason: case insensitive filesystem */
public final class C10419Rrv {
    public final List A00;
    public final PriorityQueue A01;

    public C10419Rrv(Collection collection) {
        int size;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(collection);
        this.A00 = A1C;
        if (collection.isEmpty()) {
            size = 1;
        } else {
            size = collection.size();
        }
        this.A01 = new PriorityQueue(size, new C13114TLx((0sL) TYL.A00, 2));
    }
}
