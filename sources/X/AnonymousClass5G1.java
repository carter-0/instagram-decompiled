package X;

/* renamed from: X.5G1  reason: invalid class name */
public final class AnonymousClass5G1 extends C282935Fi {
    public final C255323tw A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass5G1) obj).A00);
    }

    public final int hashCode() {
        return -1876823561 + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Success {mOutputData=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass5G1(C255323tw r1) {
        this.A00 = r1;
    }

    public AnonymousClass5G1() {
        this(C255323tw.A01);
    }
}
