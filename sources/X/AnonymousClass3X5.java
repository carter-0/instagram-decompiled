package X;

/* renamed from: X.3X5  reason: invalid class name */
public final class AnonymousClass3X5 {
    public final 2V7 A00;
    public final 2Sa A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3X5) {
                AnonymousClass3X5 r5 = (AnonymousClass3X5) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A02 != r5.A02 || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LithoConfiguration(componentsConfig=");
        sb.append(this.A01);
        sb.append(", areTransitionsEnabled=");
        sb.append(this.A02);
        sb.append(", renderUnitIdGenerator=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        2V7 r0 = this.A00;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        return i2 + hashCode;
    }

    public AnonymousClass3X5(2V7 r1, 2Sa r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }
}
