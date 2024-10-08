package X;

/* renamed from: X.Erm  reason: case insensitive filesystem */
public abstract class C49243Erm {
    public static void A00(19f r3, 1Fa r4, C60820jg r5, 0lg r6) {
        1YW r2 = 1YW.A00;
        if (r2 != null) {
            r4.A9m("jazoest", r2.A00(r5.A01(r6).A02(r3)));
            return;
        }
        throw new RuntimeException("SprinklePlugin instance needs to be set before get");
    }
}
