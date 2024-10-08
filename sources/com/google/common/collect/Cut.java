package com.google.common.collect;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51970G9q;
import X.Dba;
import X.Pxe;
import java.io.Serializable;

public abstract class Cut implements Comparable, Serializable {
    public static final long serialVersionUID = 0;
    public final Comparable endpoint;

    public final class AboveAll extends Cut {
        public static final AboveAll A00 = new AboveAll();
        public static final long serialVersionUID = 0;

        public final int A00(Cut cut) {
            return cut == this ? 0 : 1;
        }

        public final String toString() {
            return "+∞";
        }

        public AboveAll() {
            super("");
        }

        private Object readResolve() {
            return A00;
        }

        public final int hashCode() {
            return System.identityHashCode(this);
        }
    }

    public final class AboveValue extends Cut {
        public static final long serialVersionUID = 0;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return Cut.super.A00((Cut) obj);
        }

        public final int hashCode() {
            return this.endpoint.hashCode() ^ -1;
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("/");
            A1A.append(this.endpoint);
            return AnonymousClass7TF.A0l("\\", A1A);
        }
    }

    public final class BelowAll extends Cut {
        public static final BelowAll A00 = new BelowAll();
        public static final long serialVersionUID = 0;

        public final int A00(Cut cut) {
            return cut == this ? 0 : -1;
        }

        public final String toString() {
            return "-∞";
        }

        public BelowAll() {
            super("");
        }

        private Object readResolve() {
            return A00;
        }

        public final int hashCode() {
            return System.identityHashCode(this);
        }
    }

    public final class BelowValue extends Cut {
        public static final long serialVersionUID = 0;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return Cut.super.A00((Cut) obj);
        }

        public final int hashCode() {
            return this.endpoint.hashCode();
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("\\");
            A1A.append(this.endpoint);
            return AnonymousClass7TF.A0l("/", A1A);
        }
    }

    public abstract int hashCode();

    public int A00(Cut cut) {
        if (cut == BelowAll.A00) {
            return 1;
        }
        if (cut == AboveAll.A00) {
            return -1;
        }
        Comparable comparable = this.endpoint;
        Comparable comparable2 = cut.endpoint;
        Range range = Range.A00;
        int compareTo = comparable.compareTo(comparable2);
        if (compareTo != 0) {
            return compareTo;
        }
        boolean z = this instanceof AboveValue;
        if (z == (cut instanceof AboveValue)) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    public final Comparable A01() {
        if (this instanceof BelowAll) {
            throw AnonymousClass7TE.A0z("range unbounded on this side");
        } else if (!(this instanceof AboveAll)) {
            return this.endpoint;
        } else {
            throw AnonymousClass7TE.A0z("range unbounded on this side");
        }
    }

    public final void A02(StringBuilder sb) {
        char c;
        if (this instanceof BelowValue) {
            c = '[';
        } else if (this instanceof BelowAll) {
            sb.append("(-∞");
            return;
        } else if (this instanceof AboveValue) {
            c = '(';
        } else {
            throw Pxe.A0d();
        }
        sb.append(c);
        sb.append(this.endpoint);
    }

    public final void A03(StringBuilder sb) {
        char c;
        if (this instanceof BelowValue) {
            sb.append(this.endpoint);
            c = ')';
        } else if (this instanceof BelowAll) {
            throw Pxe.A0d();
        } else if (this instanceof AboveValue) {
            sb.append(this.endpoint);
            c = ']';
        } else {
            sb.append("+∞)");
            return;
        }
        sb.append(c);
    }

    public final boolean A04(Comparable comparable) {
        if (this instanceof BelowValue) {
            Comparable comparable2 = this.endpoint;
            Range range = Range.A00;
            return Dba.A1U(comparable2.compareTo(comparable));
        } else if (this instanceof BelowAll) {
            return true;
        } else {
            if (!(this instanceof AboveValue)) {
                return false;
            }
            Comparable comparable3 = this.endpoint;
            Range range2 = Range.A00;
            return C51970G9q.A1T(comparable3.compareTo(comparable));
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        if (this instanceof BelowAll) {
            i = -1;
        } else {
            i = 1;
        }
        if (obj == this) {
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            if (A00((Cut) obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public Cut(Comparable comparable) {
        this.endpoint = comparable;
    }
}
