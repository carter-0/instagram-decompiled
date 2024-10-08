package X;

/* renamed from: X.5Fh  reason: invalid class name and case insensitive filesystem */
public final class C282925Fh extends C282935Fi {
    public final C255323tw A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C282925Fh) obj).A00);
    }

    public final int hashCode() {
        return 846803280 + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failure {mOutputData=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public C282925Fh(C255323tw r1) {
        this.A00 = r1;
    }

    public C282925Fh() {
        this(C255323tw.A01);
    }
}
