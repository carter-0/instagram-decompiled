package X;

public final class FBY {
    public static FBY A02;
    public boolean A00 = false;
    public final 1wn A01 = FXZ.A00(this, 50);

    public final synchronized void A01() {
        if (!this.A00) {
            this.A00 = true;
            1xC.A01.A02(this.A01, C50247FVe.class);
        }
    }

    public final synchronized void A02() {
        1xC.A01.A03(this.A01, C50247FVe.class);
        this.A00 = false;
    }

    public static FBY A00() {
        FBY fby = A02;
        if (fby != null) {
            return fby;
        }
        FBY fby2 = new FBY();
        A02 = fby2;
        return fby2;
    }
}
