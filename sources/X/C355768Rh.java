package X;

/* renamed from: X.8Rh  reason: invalid class name and case insensitive filesystem */
public final class C355768Rh extends AnonymousClass8Rc {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C355768Rh) {
                C355768Rh r5 = (C355768Rh) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0X("StickerSelectedState(selectedRow=", ", selectedIndex=", ')', this.A01, this.A00);
    }

    public C355768Rh(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
