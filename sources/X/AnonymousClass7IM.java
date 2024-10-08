package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7IM  reason: invalid class name */
public final class AnonymousClass7IM {
    public final Map A00 = new LinkedHashMap();
    public final AnonymousClass7IL A01;

    public final void A00(AnonymousClass7JU r10, AnonymousClass7JT r11, boolean z) {
        0qQ.A0B(r11, 0);
        if (z) {
            Map map = this.A00;
            if (!map.containsKey(r11)) {
                C329067Hl r1 = this.A01.A00;
                if (r11 == AnonymousClass7JT.META_AI_VOICE) {
                    C329067Hl.A0d(r1, 1);
                } else if (r11 == AnonymousClass7JT.META_AI_INVOCATION) {
                    r1.A0J.A0E(C3262475z.A00(r1.A1Z), C329067Hl.A0F(r1), false, true, r1.A1S());
                }
            }
            map.put(r11, r10);
            return;
        }
        Map map2 = this.A00;
        map2.containsKey(r11);
        map2.remove(r11);
    }

    public AnonymousClass7IM(AnonymousClass7IL r2) {
        this.A01 = r2;
    }
}
