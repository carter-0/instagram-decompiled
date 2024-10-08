package com.google.common.collect;

import X.AnonymousClass2hV;
import X.AnonymousClass7TE;
import X.C264654Qt;
import X.Pxf;
import X.Pxg;
import java.io.Serializable;

public final class ByFunctionOrdering extends C264654Qt implements Serializable {
    public static final long serialVersionUID = 0;
    public final AnonymousClass2hV function;
    public final C264654Qt ordering;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ByFunctionOrdering)) {
                return false;
            }
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (!this.function.equals(byFunctionOrdering.function) || !this.ordering.equals(byFunctionOrdering.ordering)) {
                return false;
            }
        }
        return true;
    }

    public final int compare(Object obj, Object obj2) {
        return this.ordering.compare(this.function.apply(obj), this.function.apply(obj2));
    }

    public final int hashCode() {
        return Pxf.A0A(this.function, this.ordering);
    }

    public ByFunctionOrdering(AnonymousClass2hV r1, C264654Qt r2) {
        this.function = r1;
        r2.getClass();
        this.ordering = r2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.ordering);
        A1A.append(".onResultOf(");
        return Pxg.A0q(this.function, A1A);
    }
}
