package X;

/* renamed from: X.4Tc  reason: invalid class name and case insensitive filesystem */
public final class C265244Tc {
    public final C264854Ro A00;
    public final int[] A01;

    public C265244Tc(C264854Ro r4, int... iArr) {
        if (iArr.length == 0) {
            2AG.A05("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.A00 = r4;
        this.A01 = iArr;
    }
}
