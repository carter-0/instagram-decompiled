package X;

import java.util.Map;

/* renamed from: X.Gh7  reason: case insensitive filesystem */
public final class C53016Gh7 extends 2YL {
    public final GK1 A00;

    public C53016Gh7(GK1 gk1) {
        0qQ.A0B(gk1, 1);
        this.A00 = gk1;
    }

    public final void A00(String str) {
        Object value;
        0Ym r1;
        0qQ.A0B(str, 0);
        05G r4 = this.A00.A00;
        do {
            value = r4.getValue();
            r1 = new 0Ym();
            r1.putAll((Map) value);
            r1.put(str, true);
        } while (!r4.AIY(value, 0se.A0N(r1)));
    }

    public final void A01(String str, String str2) {
        Object value;
        0Ym r1;
        0qQ.A0B(str, 0);
        GK1 gk1 = this.A00;
        05G r3 = gk1.A00;
        do {
            value = r3.getValue();
            r1 = new 0Ym();
            r1.putAll((Map) value);
            r1.put(str, false);
        } while (!r3.AIY(value, 0se.A0N(r1)));
        gk1.A01.Epw(str2);
    }
}
