package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.L8g  reason: case insensitive filesystem */
public final class C63825L8g {
    public final 0lg A00;
    public final Map A01;
    public final C62435Kfl A02;
    public final C62434Kfk A03;

    public C63825L8g(0lg r5) {
        0qQ.A0B(r5, 1);
        this.A00 = r5;
        C62435Kfl kfl = new C62435Kfl(this);
        this.A02 = kfl;
        C62434Kfk kfk = new C62434Kfk();
        this.A03 = kfk;
        List A1P = 0sr.A1P(new C62946Koy[]{kfl, kfk});
        LinkedHashMap A0x = DbS.A0x(JTT.A08(A1P));
        for (Object next : A1P) {
            C51967G9n.A1O(next, A0x, ((C62946Koy) next).A00());
        }
        this.A01 = A0x;
    }
}
