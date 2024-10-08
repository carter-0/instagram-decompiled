package X;

/* renamed from: X.56X  reason: invalid class name */
public final class AnonymousClass56X {
    public final 2VR A00;
    public final C246053du A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass56X r5 = (AnonymousClass56X) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PropertyHandle{ mTransitionId='");
        sb.append(this.A00);
        sb.append("', mProperty=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass56X(2VR r1, C246053du r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
