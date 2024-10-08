package X;

/* renamed from: X.3bf  reason: invalid class name and case insensitive filesystem */
public final class C244733bf {
    public final 2Uu A00;
    public final 2Th A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C244733bf(2Uu r2, 2Th r3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C244733bf) {
                C244733bf r5 = (C244733bf) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && 0qQ.A0K(this.A00, r5.A00) && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Model(renderUnit=");
        sb.append(this.A01);
        sb.append(", viewAttributes=");
        sb.append(this.A00);
        sb.append(", isRootHost=");
        sb.append(this.A04);
        sb.append(", cloneStateListAnimators=");
        sb.append(this.A02);
        sb.append(", isEventHandlerRedesignEnabled=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        return i4 + i5;
    }
}
