package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.34X  reason: invalid class name */
public final class AnonymousClass34X extends WeakReference {
    public final int A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass34X) {
            Object obj2 = get();
            Object obj3 = ((Reference) obj).get();
            if (!(obj2 == null || obj3 == null)) {
                return obj2.equals(obj3);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public AnonymousClass34X(Object obj) {
        super(obj);
        this.A00 = obj.hashCode();
    }
}
