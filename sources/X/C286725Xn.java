package X;

/* renamed from: X.5Xn  reason: invalid class name and case insensitive filesystem */
public final class C286725Xn implements C286605Xb {
    public final C284945Oz A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C286725Xn) && 0qQ.A0K(this.A00, ((C286725Xn) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DynamicValueHolder(state=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final Object E6r(AnonymousClass5RM r2) {
        return this.A00.getValue();
    }

    public C286725Xn(C284945Oz r1) {
        this.A00 = r1;
    }
}
