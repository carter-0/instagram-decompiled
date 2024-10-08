package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4oj  reason: invalid class name and case insensitive filesystem */
public final class C274604oj extends ReentrantLock {
    public final String A00() {
        String name;
        Thread owner = getOwner();
        if (owner == null || (name = owner.getName()) == null) {
            return "<none>";
        }
        return name;
    }
}
