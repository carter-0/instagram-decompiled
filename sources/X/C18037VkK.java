package X;

/* renamed from: X.VkK  reason: case insensitive filesystem */
public final class C18037VkK {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18037VkK) {
                C18037VkK vkK = (C18037VkK) obj;
                if (!(this.A01 == vkK.A01 && this.A00 == vkK.A00 && this.A02 == vkK.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BidiRun(start=");
        sb.append(this.A01);
        sb.append(", end=");
        sb.append(this.A00);
        sb.append(", isRtl=");
        return G9t.A1C(sb, this.A02);
    }

    public C18037VkK(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }
}
