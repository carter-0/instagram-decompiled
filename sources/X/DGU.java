package X;

public final class DGU implements AnonymousClass2hV {
    public static final DGU A00 = new DGU();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr r8 = (C250663lr) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        if (r8 != null) {
            C250663lr optionalTreeField = r8.getOptionalTreeField(1, "fbpay_account_extended", C43351Bwp.class, 811404739);
            if (optionalTreeField != null) {
                z2 = optionalTreeField.getCoercedBooleanField(0, "should_show_connect_in_hub");
                z3 = optionalTreeField.getCoercedBooleanField(1, "should_show_orders_in_hub");
            }
            C250663lr optionalTreeField2 = r8.getOptionalTreeField(0, Pxd.A00(281), C43352Bwq.class, -264074919);
            if (optionalTreeField2 != null) {
                z = optionalTreeField2.getCoercedBooleanField(0, "show_all_payment_activities_button");
            }
        }
        return new S4Y(z, z2, z3);
    }
}
