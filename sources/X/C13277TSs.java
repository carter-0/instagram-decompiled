package X;

/* renamed from: X.TSs  reason: case insensitive filesystem */
public final class C13277TSs extends 0ss {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03 = 1;

    public C13277TSs(char c, char c2) {
        this.A02 = c2;
        boolean z = 0qQ.A00(c, c2) > 0 ? false : true;
        this.A01 = z;
        this.A00 = !z ? c2 : c;
    }

    public final char A00() {
        int i = this.A00;
        if (i != this.A02) {
            this.A00 = this.A03 + i;
        } else if (this.A01) {
            this.A01 = false;
        } else {
            throw Pxe.A1C();
        }
        return (char) i;
    }

    public final boolean hasNext() {
        return this.A01;
    }
}
