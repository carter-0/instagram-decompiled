package X;

/* renamed from: X.Vk9  reason: case insensitive filesystem */
public final class C18029Vk9 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18029Vk9) {
                C18029Vk9 vk9 = (C18029Vk9) obj;
                if (!(this.A00 == vk9.A00 && this.A01 == vk9.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        return 002.A0X("AiOutputPoint(x=", ", y=", ')', this.A00, this.A01);
    }

    public C18029Vk9(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
