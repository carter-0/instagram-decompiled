package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/* renamed from: X.46R  reason: invalid class name */
public final class AnonymousClass46R implements Iterator, C62650uo {
    public int A00;
    public int A01;
    public C242643Vh A02;
    public LinkedList A03 = new LinkedList();
    public LinkedList A04 = new LinkedList();
    public final C376459Ib A05;
    public final C2813957l A06;
    public final AnonymousClass46P A07;
    public final AnonymousClass46S A08 = new AnonymousClass46S();
    public final AnonymousClass34Q A09;
    public final Set A0A = new LinkedHashSet();
    public final 0sP A0B;

    public AnonymousClass46R(C376459Ib r5, C2813957l r6, AnonymousClass46P r7, AnonymousClass34Q r8, Iterable iterable, 0sP r10) {
        0qQ.A0B(iterable, 1);
        this.A07 = r7;
        this.A09 = r8;
        this.A05 = r5;
        this.A06 = r6;
        this.A0B = r10;
        LinkedList linkedList = this.A03;
        ArrayList arrayList = new ArrayList(0Yv.A1E(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((0eP) it.next()).A00);
        }
        linkedList.addAll(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return A00(this, false);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final AnonymousClass9IV A00(AnonymousClass46R r5, boolean z) {
        Object AvB;
        C242643Vh r1 = r5.A02;
        if (r1 == null) {
            r1 = A01(r5);
        }
        AnonymousClass9IM r2 = null;
        r5.A02 = null;
        if (r1 == null || (AvB = r1.AvB()) == null) {
            throw new IllegalStateException("UiGraphIterator: next() called without a prior call to hasNext()");
        }
        if (z) {
            r2 = new AnonymousClass9IM((Object) r5.A07.A00(r1), r5.A01, 9);
        }
        return new AnonymousClass9IV(40, (Object) r2, AvB);
    }

    public static final C242643Vh A01(AnonymousClass46R r11) {
        C242643Vh r5;
        Object AvB;
        Number number;
        int intValue;
        0eP A002;
        while (true) {
            r5 = null;
            if (r11.A03.isEmpty()) {
                break;
            }
            C242643Vh r1 = (C242643Vh) r11.A03.remove();
            Set set = r11.A0A;
            if (!set.contains(r1)) {
                r5 = r1;
            }
            if (r5 != null) {
                set.add(r5);
                int i = r11.A00;
                r11.A01 = i;
                Iterable BVk = r5.BVk(r11.A05, r11.A09, i);
                ArrayList arrayList = new ArrayList();
                for (Object next : BVk) {
                    if (!set.contains(((0eP) next).A00)) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    0eP r6 = (0eP) it.next();
                    Number number2 = (Number) r6.A01;
                    if (number2.intValue() > 1) {
                        AnonymousClass46S r9 = r11.A08;
                        Object obj = r6.A00;
                        int intValue2 = number2.intValue();
                        int i3 = r11.A00;
                        0qQ.A0B(obj, 0);
                        int i4 = i3 + intValue2;
                        SparseArray sparseArray = r9.A00;
                        List list = (List) sparseArray.get(i4);
                        if (list == null) {
                            list = new ArrayList();
                            sparseArray.put(i4, list);
                            r9.A01.add(Integer.valueOf(i4));
                        }
                        list.add(obj);
                    } else if (number2.intValue() > 0) {
                        r11.A04.add(r6.A00);
                    } else if (number2.intValue() == 0) {
                        r11.A03.add(i2, r6.A00);
                        i2++;
                    } else {
                        number2.intValue();
                    }
                    AnonymousClass46P r12 = r11.A07;
                    Object obj2 = r6.A00;
                    0qQ.A0B(obj2, 1);
                    if (!(obj2 instanceof C242733Vs)) {
                        AnonymousClass0eM r2 = r12.A00;
                        if (!((Map) r2.getValue()).containsKey(obj2) && (A002 = r12.A00(r5)) != null) {
                            ((Map) r2.getValue()).put(obj2, A002);
                        }
                    }
                }
            }
            if (r11.A03.isEmpty()) {
                LinkedList linkedList = r11.A03;
                r11.A03 = r11.A04;
                r11.A04 = linkedList;
                int i5 = r11.A00 + 1;
                r11.A00 = i5;
                AnonymousClass46S r62 = r11.A08;
                PriorityQueue priorityQueue = r62.A01;
                Number number3 = (Number) priorityQueue.peek();
                if (number3 != null && i5 >= (intValue = number3.intValue())) {
                    if (i5 <= intValue) {
                        priorityQueue.remove();
                        SparseArray sparseArray2 = r62.A00;
                        Iterable iterable = (Iterable) sparseArray2.get(i5);
                        sparseArray2.delete(i5);
                        if (iterable != null) {
                            018.A16(iterable, r11.A03);
                        }
                    } else {
                        throw new IllegalStateException("Skipped depth of parked nodes");
                    }
                }
                if (r11.A03.isEmpty() && (number = (Number) priorityQueue.poll()) != null) {
                    int intValue3 = number.intValue();
                    SparseArray sparseArray3 = r62.A00;
                    Object obj3 = sparseArray3.get(intValue3);
                    sparseArray3.delete(intValue3);
                    r11.A00 = number.intValue();
                    Iterable iterable2 = (Iterable) obj3;
                    if (iterable2 != null) {
                        018.A16(iterable2, r11.A03);
                    }
                }
            }
            if (r5 != null && (AvB = r5.AvB()) != null && ((Boolean) r11.A0B.invoke(AvB)).booleanValue()) {
                break;
            }
        }
        return r5;
    }

    public final boolean hasNext() {
        if (this.A02 == null) {
            C242643Vh A012 = A01(this);
            this.A02 = A012;
            if (A012 != null) {
                return true;
            }
            return false;
        }
        return true;
    }
}
