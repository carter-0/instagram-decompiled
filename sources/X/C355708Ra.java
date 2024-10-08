package X;

/* renamed from: X.8Ra  reason: invalid class name and case insensitive filesystem */
public final class C355708Ra extends AnonymousClass8RZ {
    public final int A00;

    public C355708Ra(int i) {
        super(0);
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C355708Ra) && this.A00 == ((C355708Ra) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("AudioDragState(selectedIndex=", ')', this.A00);
    }
}
