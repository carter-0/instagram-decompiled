package X;

import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.SGf  reason: case insensitive filesystem */
public final class C11227SGf {
    public final Deque A00 = new ArrayDeque(16);

    public static final long A00(C11227SGf sGf) {
        Deque deque = sGf.A00;
        if (deque.isEmpty()) {
            return 0;
        }
        return AnonymousClass7TE.A0R(deque.peek());
    }

    public final void A01() {
        Deque deque = this.A00;
        if (!deque.isEmpty()) {
            throw JTO.A0u(String.format("data item not completed, stackSize: %s scope: %s", new Object[]{Integer.valueOf(deque.size()), Long.valueOf(A00(this))}));
        }
    }
}
