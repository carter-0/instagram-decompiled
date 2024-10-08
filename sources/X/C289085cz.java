package X;

/* renamed from: X.5cz  reason: invalid class name and case insensitive filesystem */
public final class C289085cz {
    public float A00;
    public C291605ha A01;
    public boolean A02;

    public C289085cz(C291605ha r4, HP7 hp7, float f, boolean z) {
        this.A00 = 0.0f;
        this.A02 = true;
        this.A01 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C289085cz) {
                C289085cz r5 = (C289085cz) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && 0qQ.A0K(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RowColumnParentData(weight=");
        sb.append(this.A00);
        sb.append(", fill=");
        sb.append(this.A02);
        sb.append(", crossAxisAlignment=");
        sb.append(this.A01);
        sb.append(", flowLayoutData=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.A00) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (floatToIntBits + i) * 31;
        C291605ha r0 = this.A01;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        return (i2 + hashCode) * 31;
    }

    public C289085cz() {
        this((C291605ha) null, (HP7) null, 0.0f, true);
    }
}
