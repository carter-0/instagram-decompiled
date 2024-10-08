package X;

import com.google.common.collect.ConcurrentHashMultiset;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class Qzs extends AnonymousClass28y implements Iterator {
    public S79 A00;
    public final /* synthetic */ ConcurrentHashMultiset A01;
    public final /* synthetic */ Iterator A02;

    public Qzs(ConcurrentHashMultiset concurrentHashMultiset, Iterator it) {
        this.A01 = concurrentHashMultiset;
        this.A02 = it;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A02;
    }

    public final boolean hasNext() {
        return this.A02.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        S79 s79 = (S79) this.A02.next();
        this.A00 = s79;
        return s79;
    }

    public final void remove() {
        Object obj;
        Pxh.A1T(AnonymousClass7TF.A1V(this.A00));
        ConcurrentHashMultiset concurrentHashMultiset = this.A01;
        Object A012 = this.A00.A01();
        A012.getClass();
        ConcurrentMap concurrentMap = concurrentHashMultiset.A00;
        concurrentMap.getClass();
        try {
            obj = concurrentMap.get(A012);
        } catch (ClassCastException | NullPointerException unused) {
            obj = null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (atomicInteger != null) {
            while (true) {
                int i = atomicInteger.get();
                if (i != 0) {
                    if (atomicInteger.compareAndSet(i, 0)) {
                        concurrentMap.remove(A012, atomicInteger);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.A00 = null;
    }

    public Qzs() {
    }
}
