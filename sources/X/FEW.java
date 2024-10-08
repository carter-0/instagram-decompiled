package X;

public final class FEW {
    public static final FEW A03 = new FEW(true, true, "Promotion has an invalid primary action");
    public static final FEW A04 = new FEW(true, true, "Promotion has an invalid secondary action");
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public static FEW A00(AnonymousClass5IN r3) {
        String str;
        if (r3.A07) {
            return DbZ.A0W();
        }
        if (r3.A05) {
            str = "In holdout";
        } else {
            str = r3.A04;
            if (str == null) {
                str = AnonymousClass000.A00(62);
            }
        }
        return new FEW(false, true, str);
    }

    public FEW(boolean z, boolean z2, String str) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = str;
    }
}
