package X;

import android.graphics.Paint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vgh  reason: case insensitive filesystem */
public final class C17828Vgh {
    public float A00;
    public final Paint A01;
    public final Map A02 = new HashMap();

    public final float A00(char c) {
        if (c == 0) {
            return 0.0f;
        }
        Map map = this.A02;
        Character valueOf = Character.valueOf(c);
        if (!map.containsKey(valueOf)) {
            return this.A01.measureText(String.valueOf(c));
        }
        Object obj = map.get(valueOf);
        if (obj != null) {
            return AnonymousClass7TE.A04(obj);
        }
        throw AnonymousClass7TE.A0y();
    }

    public C17828Vgh(Paint paint) {
        this.A01 = paint;
        this.A00 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        this.A02.clear();
    }
}
