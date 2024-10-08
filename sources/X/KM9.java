package X;

public final class KM9 extends AnonymousClass8RH {
    public final int A00;

    public KM9(int i) {
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KM9) && this.A00 == ((KM9) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("AudioOptionsState(selectedIndex=", ')', this.A00);
    }

    public KM9() {
        this(-1);
    }
}
