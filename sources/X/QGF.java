package X;

public final class QGF extends RLJ {
    public final String A00;

    public QGF(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof QGF) && 0qQ.A0K(this.A00, ((QGF) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 002.A0S("STRING(value=", this.A00, ')');
    }
}
