package com.google.common.collect;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C264654Qt;
import java.io.Serializable;

public final class ReverseOrdering extends C264654Qt implements Serializable {
    public static final long serialVersionUID = 0;
    public final C264654Qt forwardOrder;

    public final C264654Qt A01() {
        return this.forwardOrder;
    }

    public final int compare(Object obj, Object obj2) {
        return this.forwardOrder.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public ReverseOrdering(C264654Qt r1) {
        this.forwardOrder = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.forwardOrder);
        return AnonymousClass7TF.A0l(".reverse()", A1A);
    }
}
