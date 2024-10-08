package X;

/* renamed from: X.5EE  reason: invalid class name */
public final class AnonymousClass5EE {
    public C268894eF A00;
    public Class A01;
    public boolean A02;
    public int A03;

    public AnonymousClass5EE(C268894eF r3) {
        this.A00 = r3;
        this.A01 = null;
        this.A02 = false;
        this.A03 = r3.hashCode() - 1;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        AnonymousClass5EE r4 = (AnonymousClass5EE) obj;
        if (r4.A02 != this.A02) {
            return false;
        }
        Class cls = this.A01;
        if (cls != null) {
            return r4.A01 == cls;
        }
        return this.A00.equals(r4.A00);
    }

    public final int hashCode() {
        return this.A03;
    }

    public final String toString() {
        StringBuilder sb;
        Class cls = this.A01;
        if (cls != null) {
            sb.append("{class: ");
            sb.append(cls.getName());
        } else {
            sb = new StringBuilder();
            sb.append("{type: ");
            sb.append(this.A00);
        }
        sb.append(", typed? ");
        sb.append(this.A02);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass5EE(Class cls, boolean z) {
        this.A01 = cls;
        this.A00 = null;
        this.A02 = z;
        int hashCode = cls.getName().hashCode();
        this.A03 = z ? hashCode + 1 : hashCode;
    }

    public AnonymousClass5EE() {
    }
}
