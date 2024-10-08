package com.google.common.collect;

import X.17k;
import X.1J2;
import X.1WJ;
import X.AnonymousClass3W5;
import X.AnonymousClass7TF;
import X.C8672QzD;
import X.QzE;
import X.SK2;
import X.SQD;
import X.TMR;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

public abstract class AbstractMapBasedMultiset<E> extends AnonymousClass3W5<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient long A00;
    public transient SK2 A01;

    public final int ECy(Object obj, int i) {
        int i2 = 0;
        int A05 = this.A01.A05(obj);
        if (A05 != -1) {
            SK2 sk2 = this.A01;
            17k.A01(A05, sk2.A02);
            i2 = sk2.A05[A05];
            if (i2 > i) {
                SK2 sk22 = this.A01;
                17k.A01(A05, sk22.A02);
                sk22.A05[A05] = i2 - i;
            } else {
                this.A01.A04(A05);
                i = i2;
            }
            this.A00 -= (long) i;
        }
        return i2;
    }

    public final int A03() {
        return this.A01.A02;
    }

    public final int A04(Object obj, int i) {
        long j;
        if (i == 0) {
            return AKq(obj);
        }
        boolean z = true;
        int i2 = 0;
        17k.A0C("occurrences cannot be negative: %s", i, AnonymousClass7TF.A1R(i));
        int A05 = this.A01.A05(obj);
        if (A05 == -1) {
            this.A01.A0A(obj, i);
            j = this.A00 + ((long) i);
        } else {
            SK2 sk2 = this.A01;
            17k.A01(A05, sk2.A02);
            i2 = sk2.A05[A05];
            long j2 = (long) i;
            long j3 = ((long) i2) + j2;
            if (j3 > 2147483647L) {
                z = false;
            }
            17k.A05(j3, "too many occurrences: %s", z);
            SK2 sk22 = this.A01;
            17k.A01(A05, sk22.A02);
            sk22.A05[A05] = (int) j3;
            j = this.A00 + j2;
        }
        this.A00 = j;
        return i2;
    }

    public final Iterator A05() {
        return new C8672QzD(this);
    }

    public final Iterator A06() {
        return new QzE(this);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.SK2] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.SK2] */
    public final SK2 A07() {
        if (this instanceof LinkedHashMultiset) {
            ? obj = new Object();
            obj.A09(3, 1.0f);
            return obj;
        }
        ? obj2 = new Object();
        obj2.A09(3, 1.0f);
        return obj2;
    }

    public final int AKq(Object obj) {
        SK2 sk2 = this.A01;
        int A05 = sk2.A05(obj);
        if (A05 == -1) {
            return 0;
        }
        return sk2.A05[A05];
    }

    public final void clear() {
        this.A01.A06();
        this.A00 = 0;
    }

    public final int size() {
        return 1WJ.A02(this.A00);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.A01 = A07();
        for (int i = 0; i < readInt; i++) {
            A04(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        SQD.A03(this, objectOutputStream);
    }

    public final boolean ESx(Object obj, int i, int i2) {
        1J2.A00(i, "oldCount");
        int A05 = this.A01.A05(obj);
        if (A05 != -1) {
            SK2 sk2 = this.A01;
            17k.A01(A05, sk2.A02);
            if (sk2.A05[A05] == i) {
                this.A01.A04(A05);
                this.A00 -= (long) i;
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return new TMR(this, entrySet().iterator());
    }
}
