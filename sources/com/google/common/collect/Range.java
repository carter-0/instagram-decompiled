package com.google.common.collect;

import X.17k;
import X.1UV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C264654Qt;
import X.C7279Q2e;
import X.C7280Q2f;
import X.Dba;
import X.Pxe;
import X.Pxi;
import com.google.common.collect.Cut;
import java.io.Serializable;

public final class Range extends RangeGwtSerializationDependencies implements 1UV, Serializable {
    public static final Range A00 = new Range(Cut.BelowAll.A00, Cut.AboveAll.A00);
    public static final long serialVersionUID = 0;
    public final Cut lowerBound;
    public final Cut upperBound;

    public class RangeLexOrdering extends C264654Qt implements Serializable {
        public static final C264654Qt A00 = new Object();
        public static final long serialVersionUID = 0;

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C7280Q2f q2f;
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            C7280Q2f q2f2 = C7280Q2f.A00;
            int compareTo = range.lowerBound.compareTo(range2.lowerBound);
            if (compareTo < 0) {
                q2f = C7280Q2f.A02;
            } else if (compareTo > 0) {
                q2f = C7280Q2f.A01;
            } else {
                q2f = C7280Q2f.A00;
            }
            Cut cut = range.upperBound;
            Cut cut2 = range2.upperBound;
            if (!(q2f instanceof C7279Q2e)) {
                int compareTo2 = cut.compareTo(cut2);
                if (compareTo2 < 0) {
                    q2f = C7280Q2f.A02;
                } else if (compareTo2 > 0) {
                    q2f = C7280Q2f.A01;
                } else {
                    q2f = C7280Q2f.A00;
                }
            }
            return q2f.A00();
        }
    }

    public final Range A01(Range range) {
        Cut cut;
        Cut cut2;
        int A002 = this.lowerBound.A00(range.lowerBound);
        int A003 = this.upperBound.A00(range.upperBound);
        if (A002 >= 0) {
            if (A003 <= 0) {
                return this;
            }
            if (A002 <= 0) {
                return range;
            }
            cut = this.lowerBound;
            cut2 = range.upperBound;
        } else if (A003 >= 0) {
            return range;
        } else {
            cut = range.lowerBound;
            cut2 = this.upperBound;
        }
        17k.A09(this, range, "intersection is undefined for disconnected ranges %s and %s", Dba.A1U(cut.A00(cut2)));
        return new Range(cut, cut2);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        if (!this.lowerBound.A04(comparable) || this.upperBound.A04(comparable)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (this.lowerBound.equals(range.lowerBound)) {
            return Pxi.A1W(this.upperBound, range.upperBound);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.upperBound, AnonymousClass7TE.A0K(this.lowerBound));
    }

    public Object readResolve() {
        Range range = A00;
        if (equals(range)) {
            return range;
        }
        return this;
    }

    public final String toString() {
        Cut cut = this.lowerBound;
        Cut cut2 = this.upperBound;
        StringBuilder A14 = Pxe.A14(16);
        cut.A02(A14);
        A14.append("..");
        cut2.A03(A14);
        return A14.toString();
    }

    public Range(Cut cut, Cut cut2) {
        cut.getClass();
        this.lowerBound = cut;
        cut2.getClass();
        this.upperBound = cut2;
        if (cut.A00(cut2) > 0 || cut == Cut.AboveAll.A00 || cut2 == Cut.BelowAll.A00) {
            StringBuilder A14 = Pxe.A14(16);
            cut.A02(A14);
            A14.append("..");
            cut2.A03(A14);
            throw AnonymousClass7TF.A0W("Invalid range: ", A14.toString());
        }
    }

    public static Range A00(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        Cut cut = new Cut(comparable);
        comparable2.getClass();
        return new Range(cut, new Cut(comparable2));
    }
}
