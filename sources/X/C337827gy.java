package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7gy  reason: invalid class name and case insensitive filesystem */
public final class C337827gy extends C232322tW {
    public static final C337837gz A08 = new Object();
    public final 2Sg A00;
    public final 2Sg A01;
    public final C337557gX A02;
    public final C337837gz A03;
    public final ThreadLocal A04;
    public final List A05;
    public final List A06;
    public final AtomicBoolean A07;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.7gz, java.lang.Object] */
    public static boolean A00(C337827gy r8, Object obj, Object obj2) {
        C337837gz r2;
        if (obj == obj2) {
            return true;
        }
        2Sg r7 = r8.A01;
        if (r7 == null) {
            return obj.equals(obj2);
        }
        C251233mm r1 = r7.A00.A01;
        AtomicBoolean atomicBoolean = r8.A07;
        boolean compareAndSet = atomicBoolean.compareAndSet(false, true);
        if (compareAndSet) {
            r2 = r8.A03;
        } else {
            r2 = (C337837gz) r8.A04.get();
        }
        if (!(!2Sa.reduceMemorySpikeDataDiffSection || r1 == null || r2 == null)) {
            Object obj3 = r2.A01;
            C337837gz r5 = A08;
            if (obj3 == r5.A01) {
                r2.A01 = obj;
                r2.A00 = obj2;
                try {
                    Object A002 = r7.A00(r2);
                    if (A002 == null) {
                        return false;
                    }
                    boolean booleanValue = ((Boolean) A002).booleanValue();
                    r2.A01 = r5.A01;
                    r2.A00 = r5.A00;
                    if (!compareAndSet) {
                        return booleanValue;
                    }
                    atomicBoolean.set(false);
                    return booleanValue;
                } finally {
                    r2.A01 = r5.A01;
                    r2.A00 = r5.A00;
                    if (compareAndSet) {
                        atomicBoolean.set(false);
                    }
                }
            }
        }
        ? obj4 = new Object();
        obj4.A01 = obj;
        obj4.A00 = obj2;
        return ((Boolean) r7.A00(obj4)).booleanValue();
    }

    public final int A02() {
        List list = this.A05;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int A03() {
        List list = this.A06;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.7d6] */
    public final boolean A04(int i, int i2) {
        List list;
        List list2 = this.A06;
        if (list2 == null || (list = this.A05) == null) {
            return false;
        }
        Object obj = list2.get(i);
        Object obj2 = list.get(i2);
        if (obj == obj2) {
            return true;
        }
        2Sg r1 = this.A00;
        if (r1 == null) {
            return obj.equals(obj2);
        }
        ? obj3 = new Object();
        obj3.A01 = obj;
        obj3.A00 = obj2;
        return ((Boolean) r1.A00(obj3)).booleanValue();
    }

    public final boolean A05(int i, int i2) {
        List list;
        List list2 = this.A06;
        if (list2 == null || (list = this.A05) == null) {
            return false;
        }
        return A00(this, list2.get(i), list.get(i2));
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.7gz, java.lang.Object] */
    public C337827gy(C337557gX r3, List list, List list2) {
        2Sg r0;
        2Sg r02;
        this.A02 = r3;
        if (r3.A0E() == null) {
            r0 = null;
        } else {
            r0 = ((C337767gs) r3.A0E()).A01;
        }
        this.A01 = r0;
        if (r3.A0E() == null) {
            r02 = null;
        } else {
            r02 = ((C337767gs) r3.A0E()).A00;
        }
        this.A00 = r02;
        this.A06 = list;
        this.A05 = list2;
        this.A04 = new C337847h0(this);
        this.A03 = new Object();
        this.A07 = new AtomicBoolean(false);
    }
}
