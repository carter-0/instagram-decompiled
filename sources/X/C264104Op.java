package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.4Op  reason: invalid class name and case insensitive filesystem */
public final class C264104Op {
    public final Queue A00 = new ArrayDeque();

    public static final synchronized void A00(C264104Op r8, long j) {
        synchronized (r8) {
            while (true) {
                Queue queue = r8.A00;
                if (!queue.isEmpty() && ((Number) queue.peek()).longValue() <= j - 3600000) {
                    queue.poll();
                }
            }
        }
    }
}
