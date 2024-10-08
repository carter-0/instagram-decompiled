package com.google.common.collect;

import X.17k;
import X.1WJ;
import X.AnonymousClass3W6;
import X.S79;
import X.SK2;
import java.io.Serializable;
import java.util.Set;

public class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset A03 = new RegularImmutableMultiset(new SK2());
    public transient ImmutableSet A00;
    public final transient SK2 A01;
    public final transient int A02;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public final boolean A0B() {
            return true;
        }

        public ElementSet() {
        }

        public final boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        public final int size() {
            return RegularImmutableMultiset.this.A01.A02;
        }

        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final int[] counts;
        public final Object[] elements;

        /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.R04] */
        /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.SK2] */
        public Object readResolve() {
            int length = this.elements.length;
            ? obj = new Object();
            obj.A01 = false;
            ? obj2 = new Object();
            obj2.A09(length, 1.0f);
            obj.A00 = obj2;
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    return obj.build();
                }
                obj.A02(objArr[i], this.counts[i]);
                i++;
            }
        }

        public SerializedForm(AnonymousClass3W6 r6) {
            int size = r6.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (S79 s79 : r6.entrySet()) {
                this.elements[i] = s79.A01();
                this.counts[i] = s79.A00();
                i++;
            }
        }
    }

    public final boolean A0B() {
        return false;
    }

    public final int AKq(Object obj) {
        SK2 sk2 = this.A01;
        int A05 = sk2.A05(obj);
        if (A05 == -1) {
            return 0;
        }
        return sk2.A05[A05];
    }

    public final int size() {
        return this.A02;
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public RegularImmutableMultiset(SK2 sk2) {
        this.A01 = sk2;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = sk2.A02;
            if (i < i2) {
                17k.A01(i, i2);
                j += (long) sk2.A05[i];
                i++;
            } else {
                this.A02 = 1WJ.A02(j);
                return;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Set ARD() {
        return A0C();
    }
}
