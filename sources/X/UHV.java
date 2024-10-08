package X;

public final class UHV extends V29 {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof UHV) && 0qQ.A0K(this.A00, ((UHV) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00) * 31;
    }

    public UHV(Throwable th) {
        this.A00 = th;
    }

    public UHV() {
        this((Throwable) null);
    }
}
