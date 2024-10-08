package X;

import android.content.Context;
import java.util.Map;

public final class F33 {
    public final 0xa A00;

    public final Integer A00(String str) {
        0qQ.A0B(str, 0);
        0xa r1 = this.A00;
        if (!r1.contains(str)) {
            return null;
        }
        return Integer.valueOf(r1.getInt(str, 0));
    }

    public final void A01(String str, int i) {
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1M(this.A00, str, i);
    }

    public F33(Context context) {
        String A002 = AnonymousClass000.A00(874);
        Map map = 1CV.A09;
        this.A00 = new 1CW(context, A002).A00();
    }
}
