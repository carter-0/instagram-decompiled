package X;

/* renamed from: X.EOe  reason: case insensitive filesystem */
public final class C47953EOe extends C48189EaV {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47953EOe) {
                C47953EOe eOe = (C47953EOe) obj;
                if (!(this.A00 == eOe.A00 && this.A01 == eOe.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, this.A00 * 31);
    }

    public C47953EOe(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
