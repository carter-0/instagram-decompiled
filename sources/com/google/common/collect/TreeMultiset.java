package com.google.common.collect;

import X.17k;
import X.1J2;
import X.1WJ;
import X.C10907S0h;
import X.C10908S0i;
import X.C13959TmM;
import X.Pxe;
import X.QzO;
import X.R1L;
import X.SQD;
import X.SU9;
import X.TMR;
import X.TMY;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

public final class TreeMultiset<E> extends QzO<E> implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient GeneralRange A00;
    public final transient SU9 A01;
    public final transient C10908S0i A02;

    public enum Aggregate {
        ;

        /* access modifiers changed from: public */
        static {
            A01 = new Aggregate() {
            };
            A00 = new Aggregate() {
            };
        }

        public final long A00(SU9 su9) {
            if (this instanceof AnonymousClass2) {
                if (su9 != null) {
                    return (long) su9.A00;
                }
                return 0;
            } else if (su9 != null) {
                return su9.A03;
            } else {
                return 0;
            }
        }
    }

    public final Iterator A05() {
        return new R1L(new TMY(this, 1), 2);
    }

    public final Iterator A06() {
        return new TMY(this, 1);
    }

    public final int AKq(Object obj) {
        try {
            SU9 su9 = (SU9) this.A02.A00;
            if (this.A00.A01(obj) && su9 != null) {
                return su9.A08(obj, this.comparator);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public TreeMultiset(GeneralRange generalRange, SU9 su9, C10908S0i s0i) {
        super(generalRange.comparator);
        this.A02 = s0i;
        this.A00 = generalRange;
        this.A01 = su9;
    }

    private long A00(Aggregate aggregate, SU9 su9) {
        long j;
        long j2;
        int i;
        int i2;
        if (su9 == null) {
            return 0;
        }
        Comparator comparator = this.comparator;
        GeneralRange generalRange = this.A00;
        int compare = comparator.compare(generalRange.upperEndpoint, su9.A08);
        if (compare > 0) {
            return A00(aggregate, su9.A06);
        }
        if (compare == 0) {
            int ordinal = generalRange.upperBoundType.ordinal();
            if (ordinal == 0) {
                if (aggregate instanceof Aggregate.AnonymousClass2) {
                    i2 = 1;
                } else {
                    i2 = su9.A01;
                }
                j = (long) i2;
                j2 = aggregate.A00(su9.A06);
            } else if (ordinal == 1) {
                return aggregate.A00(su9.A06);
            } else {
                throw Pxe.A0d();
            }
        } else {
            long A002 = aggregate.A00(su9.A06);
            if (aggregate instanceof Aggregate.AnonymousClass2) {
                i = 1;
            } else {
                i = su9.A01;
            }
            j = A002 + ((long) i);
            j2 = A00(aggregate, su9.A04);
        }
        return j + j2;
    }

    private long A01(Aggregate aggregate, SU9 su9) {
        long j;
        long j2;
        int i;
        int i2;
        if (su9 == null) {
            return 0;
        }
        Comparator comparator = this.comparator;
        GeneralRange generalRange = this.A00;
        int compare = comparator.compare(generalRange.lowerEndpoint, su9.A08);
        if (compare < 0) {
            return A01(aggregate, su9.A04);
        }
        if (compare == 0) {
            int ordinal = generalRange.lowerBoundType.ordinal();
            if (ordinal == 0) {
                if (aggregate instanceof Aggregate.AnonymousClass2) {
                    i2 = 1;
                } else {
                    i2 = su9.A01;
                }
                j = (long) i2;
                j2 = aggregate.A00(su9.A04);
            } else if (ordinal == 1) {
                return aggregate.A00(su9.A04);
            } else {
                throw Pxe.A0d();
            }
        } else {
            long A002 = aggregate.A00(su9.A04);
            if (aggregate instanceof Aggregate.AnonymousClass2) {
                i = 1;
            } else {
                i = su9.A01;
            }
            j = A002 + ((long) i);
            j2 = A01(aggregate, su9.A06);
        }
        return j + j2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        Class<TreeMultiset> cls = TreeMultiset.class;
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        Comparator comparator = (Comparator) readObject;
        SQD.A00(QzO.class, "comparator").A00(this, comparator);
        C10907S0h A002 = SQD.A00(cls, "range");
        BoundType boundType = BoundType.OPEN;
        A002.A00(this, new GeneralRange(boundType, boundType, (Object) null, (Object) null, comparator, false, false));
        SQD.A00(cls, "rootReference").A00(this, new Object());
        SU9 su9 = new SU9();
        SQD.A00(cls, "header").A00(this, su9);
        su9.A07 = su9;
        su9.A05 = su9;
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            A04(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public final int A03() {
        Aggregate aggregate = Aggregate.A00;
        SU9 su9 = (SU9) this.A02.A00;
        long A002 = aggregate.A00(su9);
        GeneralRange generalRange = this.A00;
        if (generalRange.hasLowerBound) {
            A002 -= A01(aggregate, su9);
        }
        if (generalRange.hasUpperBound) {
            A002 -= A00(aggregate, su9);
        }
        return 1WJ.A02(A002);
    }

    public final C13959TmM CL8(BoundType boundType, Object obj) {
        return new TreeMultiset(this.A00.A00(new GeneralRange(BoundType.OPEN, boundType, (Object) null, obj, this.comparator, false, true)), this.A01, this.A02);
    }

    public final C13959TmM EzU(BoundType boundType, Object obj) {
        return new TreeMultiset(this.A00.A00(new GeneralRange(boundType, BoundType.OPEN, obj, (Object) null, this.comparator, true, false)), this.A01, this.A02);
    }

    public final void clear() {
        GeneralRange generalRange = this.A00;
        if (generalRange.hasLowerBound || generalRange.hasUpperBound) {
            TMY tmy = new TMY(this, 1);
            while (tmy.hasNext()) {
                tmy.next();
                tmy.remove();
            }
            return;
        }
        SU9 su9 = this.A01;
        SU9 su92 = su9.A07;
        su92.getClass();
        while (true) {
            SU9 su93 = su92;
            if (su92 != su9) {
                su92 = su92.A07;
                su92.getClass();
                su93.A01 = 0;
                su93.A04 = null;
                su93.A06 = null;
                su93.A05 = null;
                su93.A07 = null;
            } else {
                su9.A07 = su9;
                su9.A05 = su9;
                this.A02.A00 = null;
                return;
            }
        }
    }

    public final int size() {
        Aggregate aggregate = Aggregate.A01;
        SU9 su9 = (SU9) this.A02.A00;
        long A002 = aggregate.A00(su9);
        GeneralRange generalRange = this.A00;
        if (generalRange.hasLowerBound) {
            A002 -= A01(aggregate, su9);
        }
        if (generalRange.hasUpperBound) {
            A002 -= A00(aggregate, su9);
        }
        return 1WJ.A02(A002);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(ARD().comparator());
        SQD.A03(this, objectOutputStream);
    }

    public final int A04(Object obj, int i) {
        1J2.A00(i, "occurrences");
        if (i == 0) {
            return AKq(obj);
        }
        17k.A0E(this.A00.A01(obj));
        C10908S0i s0i = this.A02;
        SU9 su9 = (SU9) s0i.A00;
        if (su9 == null) {
            this.comparator.compare(obj, obj);
            SU9 su92 = new SU9(obj, i);
            SU9 su93 = this.A01;
            su93.A07 = su92;
            su92.A05 = su93;
            su92.A07 = su93;
            su93.A05 = su92;
            s0i.A00(su9, su92);
            return 0;
        }
        int[] iArr = new int[1];
        s0i.A00(su9, su9.A0A(obj, this.comparator, iArr, i));
        return iArr[0];
    }

    public final int ECy(Object obj, int i) {
        1J2.A00(i, "occurrences");
        C10908S0i s0i = this.A02;
        SU9 su9 = (SU9) s0i.A00;
        int[] iArr = new int[1];
        try {
            if (this.A00.A01(obj) && su9 != null) {
                s0i.A00(su9, su9.A0B(obj, this.comparator, iArr, i));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public final boolean ESx(Object obj, int i, int i2) {
        1J2.A00(i, "oldCount");
        17k.A0E(this.A00.A01(obj));
        C10908S0i s0i = this.A02;
        SU9 su9 = (SU9) s0i.A00;
        if (su9 == null) {
            return false;
        }
        int[] iArr = new int[1];
        s0i.A00(su9, su9.A0C(obj, this.comparator, iArr, i));
        if (iArr[0] == i) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new TMR(this, entrySet().iterator());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.S0i, java.lang.Object] */
    public TreeMultiset(Comparator comparator) {
        super(comparator);
        BoundType boundType = BoundType.OPEN;
        this.A00 = new GeneralRange(boundType, boundType, (Object) null, (Object) null, comparator, false, false);
        SU9 su9 = new SU9();
        this.A01 = su9;
        su9.A07 = su9;
        su9.A05 = su9;
        this.A02 = new Object();
    }
}
