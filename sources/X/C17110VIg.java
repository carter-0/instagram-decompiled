package X;

/* renamed from: X.VIg  reason: case insensitive filesystem */
public abstract class C17110VIg {
    public static final void A00(GSY gsy, 17Z r3) {
        0qQ.A0B(gsy, 1);
        r3.A0c();
        Number number = (Number) gsy.A00;
        if (number != null) {
            r3.A0P("count", number.intValue());
        }
        String str = gsy.A02;
        if (str != null) {
            r3.A0R("hint_text", str);
        }
        Boolean bool = (Boolean) gsy.A01;
        if (bool != null) {
            r3.A0S("is_hint_row", bool.booleanValue());
        }
        C41846B3n.A0z(r3, gsy.A03);
        r3.A0Z();
    }
}
