package X;

public final class WE2 implements C267124b0 {
    public int A00 = -1;
    public int A01 = -1;
    public final int A02;

    public final /* bridge */ /* synthetic */ Object Bny() {
        return this;
    }

    public final boolean CIg(C69862Ca r3, CharSequence charSequence, int i, int i2) {
        int i3 = this.A02;
        if (i <= i3 && i3 < i2) {
            this.A01 = i;
            this.A00 = i2;
        } else if (i2 <= i3) {
            return true;
        }
        return false;
    }

    public WE2(int i) {
        this.A02 = i;
    }
}
