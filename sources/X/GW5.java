package X;

public final class GW5 implements C288935cj {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public GW5(C304966Fx r1, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = r1;
        this.A01 = i;
        this.A03 = str;
    }

    public final void dispose() {
        String valueOf;
        String str;
        if (this.A00 != 0) {
            valueOf = String.valueOf(this.A01);
            str = this.A03;
        } else if (this.A02 != null) {
            valueOf = String.valueOf(this.A01);
            str = this.A03;
            0qQ.A0B(str, 1);
        } else {
            return;
        }
        1Jk.A08.A0I(valueOf, str);
    }
}
