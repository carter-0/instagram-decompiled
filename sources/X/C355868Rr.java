package X;

/* renamed from: X.8Rr  reason: invalid class name and case insensitive filesystem */
public final class C355868Rr extends AnonymousClass8RH {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C355868Rr) && this.A00 == ((C355868Rr) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("ClipSelectedState(selectedIndex=", ')', this.A00);
    }

    public C355868Rr(int i) {
        this.A00 = i;
    }

    public C355868Rr() {
        this(-1);
    }
}
