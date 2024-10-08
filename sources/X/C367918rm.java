package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.8rm  reason: invalid class name and case insensitive filesystem */
public final class C367918rm<K, V> extends AbstractQueue<C367948rp<K, V>> {
    public final C367948rp A00 = new C367928rn();

    public final void clear() {
        C367948rp r3 = this.A00;
        C367948rp BWA = r3.BWA();
        while (BWA != r3) {
            C367948rp BWA2 = BWA.BWA();
            C368428sb r0 = C368428sb.A01;
            BWA.EeB(r0);
            BWA.Egg(r0);
            BWA = BWA2;
        }
        r3.EeB(r3);
        r3.Egg(r3);
    }

    public final boolean contains(Object obj) {
        if (((C367948rp) obj).BWA() != C368428sb.A01) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        C367948rp r2 = this.A00;
        if (r2.BWA() == r2) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        C367948rp r0 = this.A00;
        C367948rp BWA = r0.BWA();
        if (BWA == r0) {
            BWA = null;
        }
        return new C383989ga(this, BWA);
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        C367948rp r3 = (C367948rp) obj;
        C367948rp BfE = r3.BfE();
        C367948rp BWA = r3.BWA();
        BfE.EeB(BWA);
        BWA.Egg(BfE);
        C367948rp r1 = this.A00;
        C367948rp BfE2 = r1.BfE();
        BfE2.EeB(r3);
        r3.Egg(BfE2);
        r3.EeB(r1);
        r1.Egg(r3);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object peek() {
        C367948rp r1 = this.A00;
        C367948rp BWA = r1.BWA();
        if (BWA == r1) {
            return null;
        }
        return BWA;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        C367948rp r1 = this.A00;
        C367948rp BWA = r1.BWA();
        if (BWA == r1) {
            return null;
        }
        remove(BWA);
        return BWA;
    }

    public final boolean remove(Object obj) {
        C367948rp r4 = (C367948rp) obj;
        C367948rp BfE = r4.BfE();
        C367948rp BWA = r4.BWA();
        BfE.EeB(BWA);
        BWA.Egg(BfE);
        C368428sb r1 = C368428sb.A01;
        r4.EeB(r1);
        r4.Egg(r1);
        if (BWA != r1) {
            return true;
        }
        return false;
    }

    public final int size() {
        C367948rp r2 = this.A00;
        int i = 0;
        for (C367948rp BWA = r2.BWA(); BWA != r2; BWA = BWA.BWA()) {
            i++;
        }
        return i;
    }
}
