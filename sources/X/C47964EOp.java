package X;

/* renamed from: X.EOp  reason: case insensitive filesystem */
public final class C47964EOp extends C48192EaY {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47964EOp) {
                C47964EOp eOp = (C47964EOp) obj;
                if (!(this.A01 == eOp.A01 && this.A00 == eOp.A00)) {
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

    public C47964EOp(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
