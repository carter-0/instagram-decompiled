package X;

/* renamed from: X.VkD  reason: case insensitive filesystem */
public final class C18033VkD {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!0qQ.A0K(getClass(), JTR.A0v(obj))) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.fresco.urimod.Dimensions");
        C18033VkD vkD = (C18033VkD) obj;
        return this.A01 == vkD.A01 && this.A00 == vkD.A00;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return 002.A01('x', this.A01, this.A00);
    }

    public C18033VkD(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
