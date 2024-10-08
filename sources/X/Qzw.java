package X;

import java.util.Collection;
import java.util.Set;

public final class Qzw extends C8681Qzx<E> {
    public final /* synthetic */ Set A00;

    public Qzw(Set set) {
        this.A00 = set;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Collection A01() {
        return this.A00;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Set set = this.A00;
            set.getClass();
            try {
                if (!set.contains(obj)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (obj != null) {
            Set set = this.A00;
            set.getClass();
            try {
                if (!set.remove(obj)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return C281945Ae.A05(collection, this);
    }
}
