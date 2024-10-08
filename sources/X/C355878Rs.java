package X;

/* renamed from: X.8Rs  reason: invalid class name and case insensitive filesystem */
public final class C355878Rs extends AnonymousClass8RH {
    public final int A00;

    public C355878Rs(int i) {
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C355878Rs) && this.A00 == ((C355878Rs) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("StackedState(selectedIndex=", ')', this.A00);
    }

    public C355878Rs() {
        this(-1);
    }
}
