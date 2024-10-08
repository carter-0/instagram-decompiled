package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class A9B {
    public AtomicInteger A00;
    public AtomicInteger A01;
    public AtomicInteger A02;
    public AtomicLong A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final 0sP A05;
    public final 0sL A06;
    public final 0sP A07;

    public final void A00() {
        ConcurrentHashMap concurrentHashMap = this.A04;
        Collection<AbstractCollection> values = concurrentHashMap.values();
        0qQ.A07(values);
        for (AbstractCollection abstractCollection : values) {
            0qQ.A0A(abstractCollection);
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                this.A07.invoke(it.next());
            }
        }
        concurrentHashMap.clear();
    }

    public A9B(0sP r4, 0sP r5, 0sL r6) {
        this.A06 = r6;
        this.A05 = r4;
        this.A07 = r5;
        this.A00 = new AtomicInteger(0);
        this.A02 = new AtomicInteger(0);
        this.A01 = new AtomicInteger(0);
        this.A03 = new AtomicLong(0);
    }
}
