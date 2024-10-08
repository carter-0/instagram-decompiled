package X;

/* renamed from: X.8Rg  reason: invalid class name and case insensitive filesystem */
public final class C355758Rg extends AnonymousClass8RZ {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C355758Rg) {
                C355758Rg r5 = (C355758Rg) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
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
        return 002.A0X("VoiceoverSelectedState(selectedIndex=", ", selectedRow=", ')', this.A00, this.A01);
    }

    public C355758Rg(int i, int i2) {
        super(i2);
        this.A00 = i;
        this.A01 = i2;
    }
}
