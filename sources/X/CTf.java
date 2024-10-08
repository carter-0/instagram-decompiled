package X;

public final class CTf extends C44049CTs {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CTf) && 0qQ.A0K(this.A00, ((CTf) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failure(cause=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }

    public CTf(Throwable th) {
        this.A00 = th;
    }

    public CTf() {
        this((Throwable) null);
    }
}
