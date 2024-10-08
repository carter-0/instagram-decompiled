package X;

public final class Qlv extends C268944eK {
    public C268894eF A00;

    public final C268894eF A06() {
        return this;
    }

    public final C268894eF A08(C268894eF r1) {
        return this;
    }

    public final C268894eF A0A(C268894eF r2, C268924eI r3, Class cls, C268894eF[] r5) {
        return null;
    }

    public final C268894eF A0C(Object obj) {
        return this;
    }

    public final C268894eF A0D(Object obj) {
        return this;
    }

    public final C268894eF A0E(Object obj) {
        return this;
    }

    public final C268894eF A0F(Object obj) {
        return this;
    }

    public final boolean A0N() {
        return false;
    }

    public final C268894eF A05() {
        C268894eF r0 = this.A00;
        if (r0 != null) {
            return r0.A05();
        }
        return this.A00;
    }

    public final C268924eI A0G() {
        C268894eF r0 = this.A00;
        if (r0 != null) {
            return r0.A0G();
        }
        return this.A01;
    }

    public final StringBuilder A0H(StringBuilder sb) {
        C268894eF r0 = this.A00;
        if (r0 != null) {
            return r0.A0H(sb);
        }
        return sb;
    }

    public final StringBuilder A0I(StringBuilder sb) {
        C268894eF r0 = this.A00;
        if (r0 != null) {
            return r0.A0H(sb);
        }
        sb.append("?");
        return sb;
    }

    public final String toString() {
        String name;
        StringBuilder A14 = Pxe.A14(40);
        A14.append("[recursive type; ");
        C268894eF r0 = this.A00;
        if (r0 == null) {
            name = "UNRESOLVED";
        } else {
            name = r0.A00.getName();
        }
        return AnonymousClass7TF.A0l(name, A14);
    }

    public final boolean equals(Object obj) {
        return AnonymousClass7TF.A1W(obj, this);
    }
}
