package X;

public final class HET extends C54705HPk {
    public final Throwable A00;

    public HET(Throwable th) {
        0qQ.A0B(th, 1);
        this.A00 = th;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HET) && 0qQ.A0K(this.A00, ((HET) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
