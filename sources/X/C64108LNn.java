package X;

import java.util.Map;

/* renamed from: X.LNn  reason: case insensitive filesystem */
public final class C64108LNn {
    public static final C64108LNn A01 = new C64108LNn();
    public final Map A00 = AnonymousClass7TE.A1H();

    public final void A00(MTN mtn) {
        0qQ.A0B(mtn, 0);
        C66374MPg CAH = mtn.CAH();
        0qQ.A0B(CAH, 0);
        Map map = this.A00;
        Object obj = map.get(CAH);
        if (obj == null) {
            obj = C51967G9n.A0u();
            map.put(CAH, obj);
        }
        ((0V2) obj).FIA(mtn);
    }
}
