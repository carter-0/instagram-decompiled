package X;

/* renamed from: X.6Bh  reason: invalid class name and case insensitive filesystem */
public final class C303916Bh {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C303916Bh) {
                C303916Bh r5 = (C303916Bh) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A02;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MutableRange(item=");
        sb.append(this.A02);
        sb.append(", start=");
        sb.append(this.A01);
        sb.append(", end=");
        sb.append(this.A00);
        sb.append(", tag=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final C3022062b A00(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        } else if (i == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first");
        }
        return new C3022062b(this.A02, this.A03, this.A01, i);
    }

    public C303916Bh(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }
}
